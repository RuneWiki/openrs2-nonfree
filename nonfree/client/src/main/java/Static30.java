import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "Lclient!za;")
	public static Class106 aClass106_3;

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "Lclient!ik;")
	public static Class117 aClass117_1;

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_14 = new Class158("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "Lclient!pu;")
	public static final Class203 aClass203_4 = new Class203();

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "[I")
	public static final int[] anIntArray50 = new int[200];

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
	public static void method569() {
		if (!Static368.aBoolean423) {
			return;
		}
		while (true) {
			while (Static279.aClass103_Sub1Array3.length > Static332.anInt6411) {
				@Pc(25) Class103_Sub1 local25 = Static279.aClass103_Sub1Array3[Static332.anInt6411];
				if (local25 != null && local25.anInt3197 == -1) {
					if (Static437.aClass1_Sub15_2 == null) {
						Static437.aClass1_Sub15_2 = Static461.aClass184_4.method4167(local25.aString28);
					}
					@Pc(48) int local48 = Static437.aClass1_Sub15_2.anInt2380;
					if (local48 == -1) {
						return;
					}
					Static332.anInt6411++;
					local25.anInt3197 = local48;
					Static437.aClass1_Sub15_2 = null;
				} else {
					Static332.anInt6411++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)I")
	public static int method571(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static649 {

	@OriginalMember(owner = "client!vu", name = "G", descriptor = "I")
	public static int anInt10615;

	@OriginalMember(owner = "client!vu", name = "B", descriptor = "Lclient!jj;")
	public static final Class187 aClass187_6 = new Class187();

	@OriginalMember(owner = "client!vu", name = "E", descriptor = "I")
	public static int anInt10621 = -1;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(III)Z")
	public static boolean method8957(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IBIIII)V")
	public static void method8959(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static577.aClass5_Sub19_25.aClass17_Sub15_2.method5251() != 0 && arg2 != 0 && Static65.anInt1087 < 50 && arg4 != -1) {
			Static24.aClass248Array1[Static65.anInt1087++] = new Class248((byte) 1, arg4, arg2, arg3, arg0, 0, arg1, (Class4_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lclient!ns;I)I")
	public static int method8960(@OriginalArg(0) Class4_Sub1_Sub1_Sub2_Sub2 arg0) {
		@Pc(18) Class105 local18 = arg0.aClass105_1;
		if (local18.anIntArray134 != null) {
			local18 = local18.method2622(Static23.aClass247_1);
			if (local18 == null) {
				return -1;
			}
		}
		@Pc(34) int local34 = local18.anInt2828;
		@Pc(38) Class92 local38 = arg0.method5930();
		if (arg0.anInt6837 == -1 || arg0.aBoolean456) {
			local34 = local18.anInt2832;
		} else if (local38.anInt1905 == arg0.anInt6837 || local38.anInt1896 == arg0.anInt6837 || local38.anInt1923 == arg0.anInt6837 || arg0.anInt6837 == local38.anInt1915) {
			local34 = local18.anInt2813;
		} else if (local38.anInt1931 == arg0.anInt6837 || local38.anInt1897 == arg0.anInt6837 || local38.anInt1935 == arg0.anInt6837 || arg0.anInt6837 == local38.anInt1911) {
			local34 = local18.anInt2803;
		}
		return local34;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
	public static void method8963() {
		Static169.method3034();
		Static206.method3383(Static577.aClass5_Sub19_25.aClass17_Sub2_1.method357() == 1);
		Static604.aClass45_2 = Static160.method7595(Static681.aClass349_6, 0, 22050, Static357.aCanvas8);
		Static129.method1925(Static369.method5507((Class5_Sub4_Sub2) null));
		Static599.aClass45_1 = Static160.method7595(Static681.aClass349_6, 1, 2048, Static357.aCanvas8);
		Static599.aClass45_1.method7457(Static265.aClass5_Sub4_Sub1_2);
	}
}

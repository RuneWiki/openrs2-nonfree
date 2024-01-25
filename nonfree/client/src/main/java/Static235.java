import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "Lclient!wk;")
	public static Class263 aClass263_2;

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
	public static int anInt4304;

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "[I")
	public static final int[] anIntArray306 = new int[32];

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!ts;II)V")
	public static void method3636(@OriginalArg(0) int arg0, @OriginalArg(1) Class239 arg1, @OriginalArg(2) int arg2) {
		if (Static240.aClass239_8 != null || Static250.aBoolean294 || (arg1 == null || Static257.method3944(arg1) == null)) {
			return;
		}
		Static240.aClass239_8 = arg1;
		Static97.aClass239_3 = Static257.method3944(arg1);
		Static414.anInt7039 = 0;
		Static263.anInt4753 = arg0;
		Static145.aBoolean189 = false;
		Static428.anInt7618 = arg2;
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)Lclient!qs;")
	public static Class6_Sub32 method3637() {
		if (Static7.aClass244_7 == null || Static229.aClass256_1 == null) {
			return null;
		}
		for (@Pc(21) Class6_Sub32 local21 = (Class6_Sub32) Static229.aClass256_1.method6292(); local21 != null; local21 = (Class6_Sub32) Static229.aClass256_1.method6292()) {
			@Pc(29) Class260 local29 = Static7.aClass169_6.method3948(local21.anInt5707);
			if (local29 != null && local29.aBoolean485 && local29.method6336(Static7.anInterface6_2)) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIBI)V")
	public static void method3638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(39) String local39 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local39);
		Static431.method6283(true, local39);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIII)V")
	public static void method3639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static291.aClass28_Sub1_1.anInt1042 != 0 && arg1 != 0 && Static415.anInt7434 < 50 && arg3 != -1) {
			Static302.aClass241Array1[Static415.anInt7434++] = new Class241((byte) 1, arg3, arg1, arg2, arg0, 0);
		}
	}
}

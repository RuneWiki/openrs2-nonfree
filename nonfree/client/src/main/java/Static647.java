import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static647 {

	@OriginalMember(owner = "client!uda", name = "i", descriptor = "F")
	public static float aFloat172;

	@OriginalMember(owner = "client!uda", name = "k", descriptor = "[Lclient!wk;")
	public static Class405[] aClass405Array1;

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "Lclient!gw;")
	public static final Class147 aClass147_13 = new Class147();

	@OriginalMember(owner = "client!uda", name = "o", descriptor = "I")
	public static int anInt9986 = 0;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(II[BIII)V")
	public static void method8505(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(20) int local20 = arg2 - arg0 >> 2;
		arg3 += arg0;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg2 - arg0 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg1[arg3++] = 1;
				}
			}
			@Pc(29) int local29 = arg3 + 1;
			arg1[arg3] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg1[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg1[local34] = 1;
			arg3 = local39 + 1;
			arg1[local39] = 1;
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!bc;I)Z")
	public static boolean method8506(@OriginalArg(0) Class3_Sub8 arg0) {
		if (arg0 == null) {
			return true;
		}
		if (arg0 != Static497.aClass3_Sub8_2) {
			Static497.aClass3_Sub8_2 = arg0;
			Static211.anInt10645 = 0;
		}
		Static224.aClass182_61 = null;
		Static243.aClass3_Sub33_Sub3_1 = null;
		Static599.anInt9088 = 0;
		Static27.aClass3_Sub8_1 = null;
		Static46.aClass138_1 = null;
		if (Static211.anInt10645 == 0) {
			Static291.aClass138_2 = new Class138(Static202.aClass182_53, Static465.aClass182_92);
			Static708.aClass3_Sub33_Sub3_4.method7915();
			Static211.anInt10645 = 1;
		}
		if (Static211.anInt10645 == 1) {
			if (!Static708.aClass3_Sub33_Sub3_4.method7909(arg0, Static291.aClass138_2, Static38.aClass182_7)) {
				return false;
			}
			Static497.aClass3_Sub8_2 = null;
			Static211.anInt10645 = 0;
			Static291.aClass138_2 = null;
		}
		return true;
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)Z")
	public static boolean method8510() {
		return Static315.aBoolean335;
	}
}

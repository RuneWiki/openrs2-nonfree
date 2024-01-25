import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "I")
	public static int anInt9434;

	@OriginalMember(owner = "client!ww", name = "e", descriptor = "I")
	public static int anInt9433 = 64;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "([BB)Lclient!ba;")
	public static Class3_Sub3_Sub4 method7820(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class3_Sub3_Sub4 local9 = new Class3_Sub3_Sub4();
		@Pc(14) Class3_Sub11 local14 = new Class3_Sub11(arg0);
		local14.anInt3520 = local14.aByteArray36.length - 2;
		@Pc(25) int local25 = local14.method3109();
		@Pc(36) int local36 = local14.aByteArray36.length - local25 - 12 - 2;
		local14.anInt3520 = local36;
		@Pc(48) int local48 = local14.method3116();
		local9.anInt681 = local14.method3109();
		local9.anInt679 = local14.method3109();
		local9.anInt678 = local14.method3109();
		local9.anInt680 = local14.method3109();
		@Pc(72) int local72 = local14.method3118();
		@Pc(83) int local83;
		@Pc(89) int local89;
		if (local72 > 0) {
			local9.aClass310Array1 = new Class310[local72];
			for (local83 = 0; local83 < local72; local83++) {
				local89 = local14.method3109();
				@Pc(96) Class310 local96 = new Class310(Static114.method2375(local89));
				local9.aClass310Array1[local83] = local96;
				while (local89-- > 0) {
					@Pc(107) int local107 = local14.method3116();
					@Pc(111) int local111 = local14.method3116();
					local96.method6603(new Class3_Sub4(local111), (long) local107);
				}
			}
		}
		local14.anInt3520 = 0;
		local9.aString15 = local14.method3122();
		local9.anIntArray66 = new int[local48];
		local9.anIntArray67 = new int[local48];
		local9.aStringArray1 = new String[local48];
		local83 = 0;
		while (local14.anInt3520 < local36) {
			local89 = local14.method3109();
			if (local89 == 3) {
				local9.aStringArray1[local83] = local14.method3133().intern();
			} else if (local89 >= 100 || local89 == 21 || local89 == 38 || local89 == 39) {
				local9.anIntArray67[local83] = local14.method3118();
			} else {
				local9.anIntArray67[local83] = local14.method3116();
			}
			local9.anIntArray66[local83++] = local89;
		}
		return local9;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(III)Z")
	public static boolean method7821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static62.method4211(arg1, arg0) || Static237.method3978(arg1, arg0);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)Z")
	public static boolean method7822(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}
}

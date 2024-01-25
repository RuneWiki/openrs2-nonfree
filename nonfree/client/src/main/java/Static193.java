import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!go", name = "C", descriptor = "D")
	public static double aDouble6;

	@OriginalMember(owner = "client!go", name = "P", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_60 = new Class156(106, 6);

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IZLjava/lang/String;IZILjava/lang/String;)V")
	public static void method3263(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		Static554.aClass126_253.anInt3317 = 1;
		@Pc(11) String local11 = arg5.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg4 != -1) {
			@Pc(27) Class22 local27 = Static612.aClass380_2.method8839(arg4);
			if (local27 == null || arg3 != local27.method385()) {
				return;
			}
			if (local27.method385()) {
				local18 = local27.aString4;
			} else {
				local16 = local27.anInt336;
			}
		}
		@Pc(57) int local57 = 0;
		for (@Pc(59) int local59 = 0; local59 < Static82.aClass134_1.anInt3482; local59++) {
			@Pc(66) Class246 local66 = Static82.aClass134_1.method3191(local59);
			if ((!arg1 || local66.aBoolean426) && local66.anInt6490 == -1 && local66.anInt6512 == -1 && local66.anInt6513 == -1 && local66.anInt6478 == 0 && local66.aString77.toLowerCase().indexOf(local11) != -1) {
				if (arg4 != -1) {
					if (arg3) {
						if (!arg2.equals(local66.method5694(local18, arg4))) {
							continue;
						}
					} else if (local66.method5691(local16, arg4) != arg0) {
						continue;
					}
				}
				if (local57 >= 250) {
					Static602.aShortArray141 = null;
					Static380.anInt6378 = -1;
					return;
				}
				if (local14.length <= local57) {
					@Pc(183) short[] local183 = new short[local14.length * 2];
					for (@Pc(185) int local185 = 0; local185 < local57; local185++) {
						local183[local185] = local14[local185];
					}
					local14 = local183;
				}
				local14[local57++] = (short) local59;
			}
		}
		Static380.anInt6378 = local57;
		Static637.anInt7728 = 0;
		Static602.aShortArray141 = local14;
		@Pc(229) String[] local229 = new String[Static380.anInt6378];
		for (@Pc(231) int local231 = 0; local231 < Static380.anInt6378; local231++) {
			local229[local231] = Static82.aClass134_1.method3191(local14[local231]).aString77;
		}
		Static272.method4456(Static602.aShortArray141, local229);
		Static554.aClass126_253.method3090();
		Static554.aClass126_253.anInt3317 = 2;
	}
}

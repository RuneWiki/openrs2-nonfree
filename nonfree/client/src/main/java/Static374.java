import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!pca", name = "d", descriptor = "I")
	public static int anInt6925;

	@OriginalMember(owner = "client!pca", name = "f", descriptor = "[I")
	public static final int[] anIntArray512 = new int[5];

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(JJ)J")
	public static long method5617(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Z)V")
	public static void method5618() {
		Static215.method3475((long) Static481.anInt8318, Static110.aClass62_15);
		if (Static395.anInt7085 != -1) {
			Static327.method5196(Static395.anInt7085);
		}
		for (@Pc(23) int local23 = 0; local23 < Static423.anInt7490; local23++) {
			if (Static345.aBooleanArray24[local23]) {
				Static386.aBooleanArray15[local23] = true;
			}
			Static106.aBooleanArray13[local23] = Static345.aBooleanArray24[local23];
			Static345.aBooleanArray24[local23] = false;
		}
		Static276.anInt5395 = Static481.anInt8318;
		if (Static110.aClass62_15.method7062()) {
			Static256.aBoolean357 = true;
		}
		if (Static395.anInt7085 != -1) {
			Static423.anInt7490 = 0;
			Static101.method2095();
		}
		Static110.aClass62_15.n();
		Static213.method3466(Static110.aClass62_15);
		@Pc(79) int local79 = Static278.method4540();
		if (local79 == -1) {
			local79 = Static92.anInt2142;
		}
		if (local79 == -1) {
			local79 = Static221.anInt4156;
		}
		Static354.method5481(local79);
		Static168.anInt7198 = 0;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Ljava/lang/String;IZI)I")
	public static int method5620(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local33; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(69) int local69;
			if (local46 >= '0' && local46 <= '9') {
				local69 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local69 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local69 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local69 >= arg1) {
				throw new NumberFormatException();
			}
			if (local26) {
				local69 = -local69;
			}
			@Pc(121) int local121 = local30 * arg1 + local69;
			if (local30 != local121 / arg1) {
				throw new NumberFormatException();
			}
			local30 = local121;
			local28 = true;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IZ)Lclient!i;")
	public static Class137 method5621(@OriginalArg(0) int arg0) {
		@Pc(10) Class137 local10 = (Class137) Static337.aClass288_45.method6745((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static485.aClass117_211.method2962(arg0, 1);
		local10 = new Class137();
		local10.anInt3801 = arg0;
		if (local20 != null) {
			local10.method3286(new Class5_Sub3(local20));
		}
		local10.method3287();
		if (local10.anInt3800 == 2 && Static152.aClass42_10.method1109((long) arg0) == null) {
			Static152.aClass42_10.method1106((long) arg0, new Class5_Sub27(Static161.anInt3275));
			Static137.aClass137Array2[Static161.anInt3275++] = local10;
		}
		Static337.aClass288_45.method6746(local10, (long) arg0);
		return local10;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZLclient!vl;)V")
	public static void method6046(@OriginalArg(1) Class16_Sub1_Sub1_Sub3 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt8064 == Static389.anInt6694 || arg0.anInt8049 == -1 || arg0.lb != 0) {
			local5 = true;
		} else {
			@Pc(29) Class228 local29 = Static479.aClass308_2.method7075(arg0.anInt8049);
			if (local29.aBoolean451 || local29.anIntArray404[arg0.anInt8083] < arg0.anInt8087 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(57) int local57 = arg0.anInt8064 - arg0.anInt8117;
			@Pc(63) int local63 = Static389.anInt6694 - arg0.anInt8117;
			@Pc(74) int local74 = arg0.anInt8071 * 512 + arg0.method6999() * 256;
			@Pc(85) int local85 = arg0.anInt8050 * 512 + arg0.method6999() * 256;
			@Pc(97) int local97 = arg0.anInt8054 * 512 + arg0.method6999() * 256;
			@Pc(109) int local109 = arg0.anInt8118 * 512 + arg0.method6999() * 256;
			arg0.anInt8037 = (local97 * local63 + (local57 - local63) * local74) / local57;
			arg0.anInt8034 = (local109 * local63 + local85 * (local57 - local63)) / local57;
		}
		arg0.anInt8136 = 0;
		if (arg0.anInt8056 == 0) {
			arg0.method7000(false, 8192);
		}
		if (arg0.anInt8056 == 1) {
			arg0.method7000(false, 12288);
		}
		if (arg0.anInt8056 == 2) {
			arg0.method7000(false, 0);
		}
		if (arg0.anInt8056 == 3) {
			arg0.method7000(false, 4096);
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIII)Lclient!vl;")
	public static Class16_Sub1_Sub1_Sub3 method6047(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class84 local11 = Static348.aClass84ArrayArrayArray5[arg1][arg2][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class16_Sub1_Sub1_Sub3 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(27) Class333 local27 = local11.aClass333_1; local27 != null; local27 = local27.aClass333_3) {
			@Pc(31) Class16_Sub1_Sub1 local31 = local27.aClass16_Sub1_Sub1_1;
			if (local31 instanceof Class16_Sub1_Sub1_Sub3) {
				@Pc(37) Class16_Sub1_Sub1_Sub3 local37 = (Class16_Sub1_Sub1_Sub3) local31;
				@Pc(47) int local47 = local37.method6999() * 256 + 252 - 256;
				@Pc(55) int local55 = local37.anInt8037 - local47 >> 9;
				@Pc(62) int local62 = local37.anInt8034 - local47 >> 9;
				@Pc(69) int local69 = local47 + local37.anInt8037 >> 9;
				@Pc(76) int local76 = local47 + local37.anInt8034 >> 9;
				if (local55 <= arg2 && local62 <= arg0 && arg2 <= local69 && local76 >= arg0) {
					@Pc(110) int local110 = (local69 + 1 - arg2) * (-arg0 + local76 - -1);
					if (local19 < local110) {
						local17 = local37;
						local19 = local110;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(I)V")
	public static void method6048() {
		Static424.aClass69_43.method1905();
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIILclient!im;Lclient!im;)V")
	public static void method6049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class16_Sub1_Sub4 arg3, @OriginalArg(4) Class16_Sub1_Sub4 arg4) {
		@Pc(4) Class84 local4 = Static111.method2006(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass16_Sub1_Sub4_1 = arg3;
		local4.aClass16_Sub1_Sub4_2 = arg4;
		@Pc(19) int local19 = Static511.aClass91Array3 == Static332.aClass91Array2 ? 1 : 0;
		if (!arg3.method6990()) {
			arg3.aClass16_Sub1_23 = Static518.aClass16_Sub1Array4[local19];
			Static518.aClass16_Sub1Array4[local19] = arg3;
		} else if (arg3.method6974()) {
			arg3.aClass16_Sub1_23 = Static451.aClass16_Sub1Array3[local19];
			Static451.aClass16_Sub1Array3[local19] = arg3;
		} else {
			arg3.aClass16_Sub1_23 = Static524.aClass16_Sub1Array5[local19];
			Static524.aClass16_Sub1Array5[local19] = arg3;
			Static578.aBoolean673 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method6990()) {
			if (arg4.method6974()) {
				arg4.aClass16_Sub1_23 = Static451.aClass16_Sub1Array3[local19];
				Static451.aClass16_Sub1Array3[local19] = arg4;
				return;
			}
			arg4.aClass16_Sub1_23 = Static524.aClass16_Sub1Array5[local19];
			Static524.aClass16_Sub1Array5[local19] = arg4;
			Static578.aBoolean673 = true;
			return;
		}
		arg4.aClass16_Sub1_23 = Static518.aClass16_Sub1Array4[local19];
		Static518.aClass16_Sub1Array4[local19] = arg4;
	}
}

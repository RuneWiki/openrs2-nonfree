import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!eh", name = "W", descriptor = "Lclient!hda;")
	public static Class1_Sub24 aClass1_Sub24_4;

	@OriginalMember(owner = "client!eh", name = "H", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_177 = new Class296(58, 4);

	@OriginalMember(owner = "client!eh", name = "U", descriptor = "S")
	public static short aShort56 = 32767;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIII)V")
	public static void method3478(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static127.method3838(arg2);
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg2 - arg4;
		if (local18 < 0) {
			local18 = 0;
		}
		@Pc(27) int local27 = arg2;
		@Pc(30) int local30 = -arg2;
		@Pc(32) int local32 = local18;
		@Pc(35) int local35 = -local18;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		@Pc(57) int local57;
		@Pc(65) int local65;
		@Pc(74) int local74;
		@Pc(82) int local82;
		if (Static99.anInt1988 <= arg0 && Static205.anInt4042 >= arg0) {
			@Pc(49) int[] local49 = Static447.anIntArrayArray99[arg0];
			local57 = Static400.method6041(arg3 - arg2, Static216.anInt4203, Static358.anInt8908);
			local65 = Static400.method6041(arg2 + arg3, Static216.anInt4203, Static358.anInt8908);
			local74 = Static400.method6041(arg3 - local18, Static216.anInt4203, Static358.anInt8908);
			local82 = Static400.method6041(local18 + arg3, Static216.anInt4203, Static358.anInt8908);
			Static424.method6216(local74, arg1, local57, local49);
			Static424.method6216(local82, arg5, local74, local49);
			Static424.method6216(local65, arg1, local82, local49);
		}
		while (local14 < local27) {
			local39 += 2;
			local37 += 2;
			local35 += local39;
			local30 += local37;
			if (local35 >= 0 && local32 >= 1) {
				local32--;
				local35 -= local32 << 1;
				Static359.anIntArray644[local32] = local14;
			}
			local14++;
			@Pc(251) int local251;
			@Pc(259) int local259;
			@Pc(270) int[] local270;
			@Pc(148) int local148;
			if (local30 >= 0) {
				local27--;
				local30 -= local27 << 1;
				local148 = arg0 - local27;
				local57 = arg0 + local27;
				if (Static99.anInt1988 <= local57 && Static205.anInt4042 >= local148) {
					if (local18 <= local27) {
						local65 = Static400.method6041(arg3 + local14, Static216.anInt4203, Static358.anInt8908);
						local74 = Static400.method6041(arg3 - local14, Static216.anInt4203, Static358.anInt8908);
						if (local57 <= Static205.anInt4042) {
							Static424.method6216(local65, arg1, local74, Static447.anIntArrayArray99[local57]);
						}
						if (local148 >= Static99.anInt1988) {
							Static424.method6216(local65, arg1, local74, Static447.anIntArrayArray99[local148]);
						}
					} else {
						local65 = Static359.anIntArray644[local27];
						local74 = Static400.method6041(arg3 + local14, Static216.anInt4203, Static358.anInt8908);
						local82 = Static400.method6041(arg3 - local14, Static216.anInt4203, Static358.anInt8908);
						local251 = Static400.method6041(local65 + arg3, Static216.anInt4203, Static358.anInt8908);
						local259 = Static400.method6041(arg3 - local65, Static216.anInt4203, Static358.anInt8908);
						if (local57 <= Static205.anInt4042) {
							local270 = Static447.anIntArrayArray99[local57];
							Static424.method6216(local259, arg1, local82, local270);
							Static424.method6216(local251, arg5, local259, local270);
							Static424.method6216(local74, arg1, local251, local270);
						}
						if (Static99.anInt1988 <= local148) {
							local270 = Static447.anIntArrayArray99[local148];
							Static424.method6216(local259, arg1, local82, local270);
							Static424.method6216(local251, arg5, local259, local270);
							Static424.method6216(local74, arg1, local251, local270);
						}
					}
				}
			}
			local148 = arg0 - local14;
			local57 = arg0 + local14;
			if (local57 >= Static99.anInt1988 && Static205.anInt4042 >= local148) {
				local65 = arg3 + local27;
				local74 = arg3 - local27;
				if (Static358.anInt8908 <= local65 && local74 <= Static216.anInt4203) {
					local65 = Static400.method6041(local65, Static216.anInt4203, Static358.anInt8908);
					local74 = Static400.method6041(local74, Static216.anInt4203, Static358.anInt8908);
					if (local18 > local14) {
						local82 = local32 < local14 ? Static359.anIntArray644[local14] : local32;
						local251 = Static400.method6041(local82 + arg3, Static216.anInt4203, Static358.anInt8908);
						local259 = Static400.method6041(arg3 - local82, Static216.anInt4203, Static358.anInt8908);
						if (Static205.anInt4042 >= local57) {
							local270 = Static447.anIntArrayArray99[local57];
							Static424.method6216(local259, arg1, local74, local270);
							Static424.method6216(local251, arg5, local259, local270);
							Static424.method6216(local65, arg1, local251, local270);
						}
						if (local148 >= Static99.anInt1988) {
							local270 = Static447.anIntArrayArray99[local148];
							Static424.method6216(local259, arg1, local74, local270);
							Static424.method6216(local251, arg5, local259, local270);
							Static424.method6216(local65, arg1, local251, local270);
						}
					} else {
						if (local57 <= Static205.anInt4042) {
							Static424.method6216(local65, arg1, local74, Static447.anIntArrayArray99[local57]);
						}
						if (local148 >= Static99.anInt1988) {
							Static424.method6216(local65, arg1, local74, Static447.anIntArrayArray99[local148]);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "(I)[Lclient!vk;")
	public static Class302[] method3481() {
		return new Class302[] { Static289.aClass302_3, Static490.aClass302_4, Static31.aClass302_1 };
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(IZI)I")
	public static int method3482(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static232.anInt4617 == -1) {
			return 1;
		}
		if (Static374.anInt6861 != arg1) {
			Static390.method4905(arg1);
			if (Static374.anInt6861 != arg1) {
				return -1;
			}
		}
		try {
			@Pc(32) Dimension local32 = Static105.aCanvas3.getSize();
			Static489.method6714(Static247.aClass306_59.method7165(Static179.anInt3168), true, Static112.aClass67_3);
			@Pc(46) Class97 local46 = Static321.method4995(Static232.anInt4617, Static179.aClass171_69);
			@Pc(49) long local49 = Static60.method1119();
			Static513.aClass122_10.n();
			Static37.aClass118_3.oa(0, Static122.anInt2483, 0);
			Static513.aClass122_10.method7250(Static37.aClass118_3);
			Static513.aClass122_10.b(local32.width / 2, local32.height / 2, 512, 512);
			Static513.aClass122_10.M(1.0F);
			Static513.aClass122_10.m(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(90) Class145 local90 = Static513.aClass122_10.method7280(local46, 2048, 64, 64, 768);
			@Pc(92) int local92 = 0;
			label41: for (@Pc(94) int local94 = 0; local94 < 500; local94++) {
				Static513.aClass122_10.Z(0);
				Static513.aClass122_10.method7284();
				for (@Pc(103) int local103 = 15; local103 >= 0; local103--) {
					for (@Pc(107) int local107 = 0; local107 <= local103; local107++) {
						Static158.aClass118_6.oa((int) ((float) Static201.anInt3950 * ((float) local107 - (float) local103 / 2.0F)), 0, (local103 + 1) * Static201.anInt3950);
						local90.method6686(Static158.aClass118_6, null, 0);
						local92++;
						if (Static60.method1119() - local49 >= (long) arg0) {
							break label41;
						}
					}
				}
			}
			Static513.aClass122_10.method7247();
			@Pc(176) long local176 = (long) (local92 * 1000) / (Static60.method1119() - local49);
			Static513.aClass122_10.Z(0);
			Static513.aClass122_10.method7284();
			return (int) local176;
		} catch (@Pc(185) Throwable local185) {
			local185.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLclient!uq;)V")
	public static void method3483(@OriginalArg(1) Class122_Sub3 arg0) {
		@Pc(12) byte[] local12;
		if (Static158.anObject7 == null) {
			@Pc(5) Class6_Sub2_Sub1 local5 = new Class6_Sub2_Sub1();
			local12 = local5.method2463();
			Static158.anObject7 = Static489.method6710(local12);
		}
		if (Static529.anObject18 == null) {
			@Pc(27) Class6_Sub1_Sub1 local27 = new Class6_Sub1_Sub1();
			local12 = local27.method367();
			Static529.anObject18 = Static489.method6710(local12);
		}
		@Pc(50) Class315 local50 = arg0.aClass315_1;
		if (local50.method7499() && Static468.anObject16 == null) {
			@Pc(72) byte[] local72 = Static296.method3866(0.6F, new Class147_Sub1(419684), 4.0F, 0.5F, 16.0F, 4.0F);
			Static468.anObject16 = Static489.method6710(local72);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "Lclient!t;")
	public static Class81 aClass81_2;

	@OriginalMember(owner = "client!lf", name = "w", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_846 = Static158.method3034(" )2> ");

	@OriginalMember(owner = "client!lf", name = "x", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_847 = Static158.method3034("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "[I")
	public static final int[] anIntArray344 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([Lclient!ra;II)V")
	public static void method2367(@OriginalArg(0) Class72[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class72 local9 = arg0[local3];
			if (local9 != null && local9.anInt3937 == arg1 && (!local9.aBoolean151 || !Static20.method445(local9))) {
				if (local9.anInt3932 == 0) {
					if (!local9.aBoolean151 && Static20.method445(local9) && local9 != Static150.aClass72_8) {
						continue;
					}
					method2367(arg0, local9.anInt3935);
					if (local9.aClass72Array1 != null) {
						method2367(local9.aClass72Array1, local9.anInt3935);
					}
					@Pc(61) Class2_Sub20 local61 = (Class2_Sub20) Static156.aClass51_11.method2458((long) local9.anInt3935);
					if (local61 != null) {
						Static70.method1640(local61.anInt3986);
					}
				}
				if (local9.anInt3932 == 6) {
					@Pc(92) int local92;
					if (local9.anInt3923 != -1 || local9.anInt3929 != -1) {
						@Pc(87) boolean local87 = Static122.method2601(local9);
						if (local87) {
							local92 = local9.anInt3929;
						} else {
							local92 = local9.anInt3923;
						}
						if (local92 != -1) {
							@Pc(105) Class2_Sub1_Sub5 local105 = Static103.method2357(local92);
							if (local105 != null) {
								local9.anInt3902 += Static35.anInt3071;
								while (local105.anIntArray83[local9.anInt3941] < local9.anInt3902) {
									local9.anInt3902 -= local105.anIntArray83[local9.anInt3941];
									local9.anInt3941++;
									if (local9.anInt3941 >= local105.anIntArray84.length) {
										local9.anInt3941 -= local105.anInt795;
										if (local9.anInt3941 < 0 || local105.anIntArray84.length <= local9.anInt3941) {
											local9.anInt3941 = 0;
										}
									}
									Static39.method900(local9);
								}
							}
						}
					}
					if (local9.anInt3906 != 0 && !local9.aBoolean151) {
						@Pc(192) int local192 = local9.anInt3906 >> 16;
						local92 = local9.anInt3906 << 16 >> 16;
						local92 *= Static35.anInt3071;
						@Pc(207) int local207 = local192 * Static35.anInt3071;
						local9.anInt3881 = local92 + local9.anInt3881 & 0x7FF;
						local9.anInt3865 = local9.anInt3865 + local207 & 0x7FF;
						Static39.method900(local9);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)I")
	public static int method2368() {
		return Static66.anInt2048;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)Lclient!fa;")
	public static Class2_Sub1_Sub7_Sub2 method2371() {
		@Pc(3) Class2_Sub1_Sub7_Sub2 local3 = new Class2_Sub1_Sub7_Sub2();
		local3.aByteArray19 = Static197.aByteArrayArray10[0];
		local3.anInt1596 = Static178.anIntArray468[0];
		local3.anInt1595 = Static30.anIntArray96[0];
		local3.anInt1594 = Static103.anIntArray342[0];
		local3.anIntArray158 = Static16.anIntArray43;
		local3.anInt1592 = Static30.anIntArray95[0];
		local3.anInt1593 = Static175.anInt4257;
		local3.anInt1591 = Static93.anInt2723;
		Static81.method1910();
		return local3;
	}
}

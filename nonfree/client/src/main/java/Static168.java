import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "Lclient!cj;")
	public static Class27 aClass27_20;

	@OriginalMember(owner = "client!mf", name = "F", descriptor = "Lclient!jo;")
	public static Class90 aClass90_1;

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString236 = "Loaded interfaces";

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
	public static int anInt3772 = 0;

	@OriginalMember(owner = "client!mf", name = "M", descriptor = "[Lclient!ui;")
	public static Class1_Sub3_Sub21[] aClass1_Sub3_Sub21Array3 = new Class1_Sub3_Sub21[14];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public static void method2741() {
		Static290.aClass89_48.method2266();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method2742(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < Static223.anInt4775; local13++) {
			if (arg0.equalsIgnoreCase(Static280.aStringArray43[local13])) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Static56.aClass2_Sub4_Sub2_1.aString182)) {
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
	public static void method2747() {
		@Pc(10) int local10 = Static140.aClass1_Sub14_Sub1_2.method2251(8);
		@Pc(19) int local19;
		if (Static16.anInt461 > local10) {
			for (local19 = local10; local19 < Static16.anInt461; local19++) {
				Static20.anIntArray49[Static81.anInt1887++] = Static304.anIntArray533[local19];
			}
		}
		if (Static16.anInt461 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static16.anInt461 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(62) int local62 = Static304.anIntArray533[local19];
			@Pc(66) Class2_Sub4_Sub2 local66 = Static155.aClass2_Sub4_Sub2Array1[local62];
			@Pc(71) int local71 = Static140.aClass1_Sub14_Sub1_2.method2251(1);
			if (local71 == 0) {
				Static304.anIntArray533[Static16.anInt461++] = local62;
				local66.anInt2824 = Static133.anInt3061;
			} else {
				@Pc(94) int local94 = Static140.aClass1_Sub14_Sub1_2.method2251(2);
				if (local94 == 0) {
					Static304.anIntArray533[Static16.anInt461++] = local62;
					local66.anInt2824 = Static133.anInt3061;
					Static100.anIntArray223[Static242.anInt5012++] = local62;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local94 == 1) {
						Static304.anIntArray533[Static16.anInt461++] = local62;
						local66.anInt2824 = Static133.anInt3061;
						local139 = Static140.aClass1_Sub14_Sub1_2.method2251(3);
						local66.method2093(1, local139);
						local149 = Static140.aClass1_Sub14_Sub1_2.method2251(1);
						if (local149 == 1) {
							Static100.anIntArray223[Static242.anInt5012++] = local62;
						}
					} else if (local94 == 2) {
						Static304.anIntArray533[Static16.anInt461++] = local62;
						local66.anInt2824 = Static133.anInt3061;
						if (Static140.aClass1_Sub14_Sub1_2.method2251(1) == 1) {
							local139 = Static140.aClass1_Sub14_Sub1_2.method2251(3);
							local66.method2093(2, local139);
							local149 = Static140.aClass1_Sub14_Sub1_2.method2251(3);
							local66.method2093(2, local149);
						} else {
							local139 = Static140.aClass1_Sub14_Sub1_2.method2251(3);
							local66.method2093(0, local139);
						}
						local139 = Static140.aClass1_Sub14_Sub1_2.method2251(1);
						if (local139 == 1) {
							Static100.anIntArray223[Static242.anInt5012++] = local62;
						}
					} else if (local94 == 3) {
						Static20.anIntArray49[Static81.anInt1887++] = local62;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!ug;)V")
	public static void method2748(@OriginalArg(1) Class2_Sub4 arg0) {
		@Pc(9) int local9 = arg0.anInt2798 - Static133.anInt3061;
		@Pc(21) int local21 = arg0.anInt2834 * 128 + arg0.method2088() * 64;
		@Pc(32) int local32 = arg0.anInt2810 * 128 + arg0.method2088() * 64;
		arg0.anInt2842 = 0;
		if (arg0.anInt2839 == 0) {
			arg0.anInt2823 = 1024;
		}
		arg0.anInt2846 += (local21 - arg0.anInt2846) / local9;
		if (arg0.anInt2839 == 1) {
			arg0.anInt2823 = 1536;
		}
		arg0.anInt2794 += (local32 - arg0.anInt2794) / local9;
		if (arg0.anInt2839 == 2) {
			arg0.anInt2823 = 0;
		}
		if (arg0.anInt2839 == 3) {
			arg0.anInt2823 = 512;
		}
	}
}

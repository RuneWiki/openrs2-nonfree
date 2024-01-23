import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
	public static int anInt4124;

	@OriginalMember(owner = "client!nj", name = "E", descriptor = "Lclient!ml;")
	public static Class1_Sub3_Sub13 aClass1_Sub3_Sub13_12;

	@OriginalMember(owner = "client!nj", name = "t", descriptor = "[I")
	public static int[] anIntArray360 = new int[1000];

	@OriginalMember(owner = "client!nj", name = "G", descriptor = "Lclient!jl;")
	public static Class89 aClass89_27 = new Class89(64);

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIII)V")
	public static void method3024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class191 local8 = Static205.method3267(arg1, arg4);
		if (local8 != null && local8.anObjectArray7 != null) {
			@Pc(20) Class1_Sub27 local20 = new Class1_Sub27();
			local20.aClass191_14 = local8;
			local20.anObjectArray1 = local8.anObjectArray7;
			Static140.method2329(local20);
		}
		Static101.anInt155 = arg3;
		Static217.anInt4676 = arg4;
		Static8.anInt225 = arg1;
		Static263.anInt5294 = arg0;
		Static181.anInt3978 = arg5;
		Static230.aBoolean185 = true;
		Static56.anInt1257 = arg2;
		Static40.method817(local8);
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
	public static void method3025() {
		if (!Static294.aBoolean367 || Static236.aBoolean120) {
			return;
		}
		@Pc(14) Class1_Sub2[][][] local14 = Static7.aClass1_Sub2ArrayArrayArray1;
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(28) Class1_Sub2[][] local28 = local14[local16];
			for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
				for (@Pc(40) int local40 = 0; local40 < local28[local30].length; local40++) {
					@Pc(52) Class1_Sub2 local52 = local28[local30][local40];
					if (local52 != null) {
						@Pc(69) Class2_Sub1_Sub1 local69;
						if (local52.aClass119_1 != null && local52.aClass119_1.aClass2_7 instanceof Class2_Sub1_Sub1) {
							local69 = (Class2_Sub1_Sub1) local52.aClass119_1.aClass2_7;
							if ((Long.MIN_VALUE & local52.aClass119_1.aLong154) == 0L) {
								local69.method133(false, true, true, false, true, true);
							} else {
								local69.method133(true, true, true, true, true, true);
							}
						}
						if (local52.aClass106_1 != null) {
							if (local52.aClass106_1.aClass2_5 instanceof Class2_Sub1_Sub1) {
								local69 = (Class2_Sub1_Sub1) local52.aClass106_1.aClass2_5;
								if ((Long.MIN_VALUE & local52.aClass106_1.aLong131) == 0L) {
									local69.method133(false, true, true, false, true, true);
								} else {
									local69.method133(true, true, true, true, true, true);
								}
							}
							if (local52.aClass106_1.aClass2_6 instanceof Class2_Sub1_Sub1) {
								local69 = (Class2_Sub1_Sub1) local52.aClass106_1.aClass2_6;
								if ((local52.aClass106_1.aLong131 & Long.MIN_VALUE) == 0L) {
									local69.method133(false, true, true, false, true, true);
								} else {
									local69.method133(true, true, true, true, true, true);
								}
							}
						}
						if (local52.aClass136_1 != null) {
							if (local52.aClass136_1.aClass2_10 instanceof Class2_Sub1_Sub1) {
								local69 = (Class2_Sub1_Sub1) local52.aClass136_1.aClass2_10;
								if ((local52.aClass136_1.aLong182 & Long.MIN_VALUE) == 0L) {
									local69.method133(false, true, true, false, true, true);
								} else {
									local69.method133(true, true, true, true, true, true);
								}
							}
							if (local52.aClass136_1.aClass2_9 instanceof Class2_Sub1_Sub1) {
								local69 = (Class2_Sub1_Sub1) local52.aClass136_1.aClass2_9;
								if ((local52.aClass136_1.aLong182 & Long.MIN_VALUE) == 0L) {
									local69.method133(false, true, true, false, true, true);
								} else {
									local69.method133(true, true, true, true, true, true);
								}
							}
						}
						for (@Pc(266) int local266 = 0; local266 < local52.anInt45; local266++) {
							if (local52.aClass7Array1[local266].aClass2_1 instanceof Class2_Sub1_Sub1) {
								@Pc(284) Class2_Sub1_Sub1 local284 = (Class2_Sub1_Sub1) local52.aClass7Array1[local266].aClass2_1;
								if ((local52.aClass7Array1[local266].aLong7 & Long.MIN_VALUE) == 0L) {
									local284.method133(false, true, true, false, true, true);
								} else {
									local284.method133(true, true, true, true, true, true);
								}
							}
						}
					}
				}
			}
		}
		Static236.aBoolean120 = true;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method3026(@OriginalArg(1) String arg0) {
		return Static94.method1606(arg0);
	}
}

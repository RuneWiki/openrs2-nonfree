import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static658 {

	@OriginalMember(owner = "client!wea", name = "s", descriptor = "Lclient!jda;")
	public static final Class165 aClass165_85 = new Class165(8);

	@OriginalMember(owner = "client!wea", name = "D", descriptor = "I")
	public static int anInt10730 = -1;

	@OriginalMember(owner = "client!wea", name = "i", descriptor = "(I)V")
	public static void method9283(@OriginalArg(0) int arg0) {
		Static617.anInt9893 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static146.anInt2951; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static602.anInt9668; local6++) {
				if (Static15.aClass164ArrayArrayArray5[arg0][local3][local6] == null) {
					Static15.aClass164ArrayArrayArray5[arg0][local3][local6] = new Class164(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method9292(@OriginalArg(0) Class3_Sub11_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static121.aClass21Array2 != Static108.aClass21Array1) {
			@Pc(12) int local12 = Static582.aClass21Array3[arg1].method7980(arg3, arg2);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class21 local19 = Static582.aClass21Array3[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method7980(arg3, arg2);
					if (arg4 != null) {
						arg4[local14] = local19.method7981(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "(B)V")
	public static void method9293() {
		Static278.method3037();
		Static254.aClass180_101 = null;
		Static394.anInt6210 = 0;
		Static175.aClass180_68 = null;
		Static467.anInt7682 = 0;
		Static620.anInt9925 = 0;
		Static641.aClass180_205 = null;
		Static345.aClass180_125 = null;
		Static210.aClass3_Sub25_Sub1_3.anInt9765 = 0;
		Static313.method4795();
		Static549.method7860();
		for (@Pc(32) int local32 = 0; local32 < 2048; local32++) {
			Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local32] = null;
		}
		Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2 = null;
		for (@Pc(51) int local51 = 0; local51 < Static567.anInt5909; local51++) {
			@Pc(58) Class28_Sub1_Sub1_Sub1_Sub2 local58 = Static84.aClass3_Sub3Array1[local51].aClass28_Sub1_Sub1_Sub1_Sub2_1;
			if (local58 != null) {
				local58.anInt10743 = -1;
			}
		}
		Static503.method7150();
		Static428.anInt6834 = 1;
		Static153.anInt3036 = -1;
		Static410.anInt6542 = -1;
		Static553.method7892(10);
		for (@Pc(80) int local80 = 0; local80 < 100; local80++) {
			Static200.aBooleanArray21[local80] = true;
		}
		Static215.method3742();
		Static479.aClass3_Sub26_1 = null;
		Static494.aLong245 = 0L;
	}
}

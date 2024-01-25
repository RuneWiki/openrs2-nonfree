import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!ria", name = "n", descriptor = "Lclient!tf;")
	public static Class340 aClass340_67;

	@OriginalMember(owner = "client!ria", name = "j", descriptor = "Lclient!vs;")
	public static final Class385 aClass385_8 = new Class385();

	@OriginalMember(owner = "client!ria", name = "l", descriptor = "I")
	public static int anInt8630 = -1;

	@OriginalMember(owner = "client!ria", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString100 = "";

	@OriginalMember(owner = "client!ria", name = "k", descriptor = "[I")
	public static final int[] anIntArray577 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIII)V")
	public static void method7561(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class6_Sub35 local10 = (Class6_Sub35) Static549.aClass340_69.method8124(); local10 != null; local10 = (Class6_Sub35) Static549.aClass340_69.method8134()) {
			Static552.method7813(arg0, arg2, arg1, local10, arg3);
		}
		if (3 != 3) {
			method7562();
		}
		@Pc(159) int local159;
		@Pc(220) boolean local220;
		for (@Pc(44) Class6_Sub35 local44 = (Class6_Sub35) Static81.aClass340_3.method8124(); local44 != null; local44 = (Class6_Sub35) Static81.aClass340_3.method8134()) {
			@Pc(48) byte local48 = 1;
			@Pc(53) Class396 local53 = local44.aClass60_Sub1_Sub1_Sub3_Sub2_2.method4417(27750);
			@Pc(59) int local59 = local44.aClass60_Sub1_Sub1_Sub3_Sub2_2.aClass104_7.method9032();
			if (local59 == -1 || local44.aClass60_Sub1_Sub1_Sub3_Sub2_2.aBoolean369) {
				local48 = 0;
			} else if (local59 == local53.anInt10407 || local59 == local53.anInt10410 || local53.anInt10421 == local59 || local53.anInt10430 == local59) {
				local48 = 2;
			} else if (local53.anInt10423 == local59 || local59 == local53.anInt10422 || local59 == local53.anInt10388 || local53.anInt10399 == local59) {
				local48 = 3;
			}
			if (local48 != local44.anInt6181) {
				local159 = Static46.method559(local44.aClass60_Sub1_Sub1_Sub3_Sub2_2);
				@Pc(163) Class294 local163 = local44.aClass60_Sub1_Sub1_Sub3_Sub2_2.aClass294_1;
				if (local163.anIntArray511 != null) {
					local163 = local163.method7168(Static303.aClass55_2);
				}
				if (local163 == null || local159 == -1) {
					local44.anInt6181 = local48;
					local44.aBoolean456 = false;
					local44.anInt6179 = -1;
				} else if (local44.anInt6179 == local159 && local44.aBoolean456 == local163.aBoolean618) {
					local44.anInt6185 = local163.anInt8165;
					local44.anInt6181 = local48;
				} else {
					local220 = false;
					if (local44.aClass6_Sub17_Sub2_2 == null) {
						local220 = true;
					} else {
						local44.anInt6185 -= 512;
						if (local44.anInt6185 <= 0) {
							Static544.aClass6_Sub17_Sub3_2.method4663(local44.aClass6_Sub17_Sub2_2);
							local44.aClass6_Sub17_Sub2_2 = null;
							local220 = true;
						}
					}
					if (local220) {
						local44.anInt6185 = local163.anInt8165;
						local44.anInt6181 = local48;
						local44.aClass6_Sub54_Sub1_3 = null;
						local44.aClass6_Sub16_3 = null;
						local44.anInt6179 = local159;
						local44.aBoolean456 = local163.aBoolean618;
					}
				}
			}
			local44.anInt6189 = local44.aClass60_Sub1_Sub1_Sub3_Sub2_2.anInt9048;
			local44.anInt6188 = local44.aClass60_Sub1_Sub1_Sub3_Sub2_2.anInt9048 + (local44.aClass60_Sub1_Sub1_Sub3_Sub2_2.method4424((byte) -28) << 8);
			local44.anInt6190 = local44.aClass60_Sub1_Sub1_Sub3_Sub2_2.anInt9057;
			local44.anInt6178 = local44.aClass60_Sub1_Sub1_Sub3_Sub2_2.anInt9057 + (local44.aClass60_Sub1_Sub1_Sub3_Sub2_2.method4424((byte) -28) << 8);
			Static552.method7813(arg0, arg2, arg1, local44, arg3);
		}
		for (@Pc(336) Class6_Sub35 local336 = (Class6_Sub35) Static635.aClass74_71.method1404(); local336 != null; local336 = (Class6_Sub35) Static635.aClass74_71.method1405()) {
			@Pc(340) byte local340 = 1;
			@Pc(345) Class396 local345 = local336.aClass60_Sub1_Sub1_Sub3_Sub1_2.method4417(27750);
			local159 = local336.aClass60_Sub1_Sub1_Sub3_Sub1_2.aClass104_7.method9032();
			if (local159 == -1 || local336.aClass60_Sub1_Sub1_Sub3_Sub1_2.aBoolean369) {
				local340 = 0;
			} else if (local159 == local345.anInt10407 || local159 == local345.anInt10410 || local159 == local345.anInt10421 || local345.anInt10430 == local159) {
				local340 = 2;
			} else if (local159 == local345.anInt10423 || local345.anInt10422 == local159 || local345.anInt10388 == local159 || local159 == local345.anInt10399) {
				local340 = 3;
			}
			if (local340 != local336.anInt6181) {
				@Pc(450) int local450 = Static334.method5179(local336.aClass60_Sub1_Sub1_Sub3_Sub1_2);
				if (local336.anInt6179 == local450 && local336.aClass60_Sub1_Sub1_Sub3_Sub1_2.aBoolean231 == local336.aBoolean456) {
					local336.anInt6185 = local336.aClass60_Sub1_Sub1_Sub3_Sub1_2.anInt2844;
					local336.anInt6181 = local340;
				} else {
					local220 = false;
					if (local336.aClass6_Sub17_Sub2_2 == null) {
						local220 = true;
					} else {
						local336.anInt6185 -= 512;
						if (local336.anInt6185 <= 0) {
							Static544.aClass6_Sub17_Sub3_2.method4663(local336.aClass6_Sub17_Sub2_2);
							local220 = true;
							local336.aClass6_Sub17_Sub2_2 = null;
						}
					}
					if (local220) {
						local336.anInt6185 = local336.aClass60_Sub1_Sub1_Sub3_Sub1_2.anInt2844;
						local336.anInt6179 = local450;
						local336.aClass6_Sub54_Sub1_3 = null;
						local336.aBoolean456 = local336.aClass60_Sub1_Sub1_Sub3_Sub1_2.aBoolean231;
						local336.anInt6181 = local340;
						local336.aClass6_Sub16_3 = null;
					}
				}
			}
			local336.anInt6189 = local336.aClass60_Sub1_Sub1_Sub3_Sub1_2.anInt9048;
			local336.anInt6188 = local336.aClass60_Sub1_Sub1_Sub3_Sub1_2.anInt9048 + (local336.aClass60_Sub1_Sub1_Sub3_Sub1_2.method4424((byte) -28) << 8);
			local336.anInt6190 = local336.aClass60_Sub1_Sub1_Sub3_Sub1_2.anInt9057;
			local336.anInt6178 = local336.aClass60_Sub1_Sub1_Sub3_Sub1_2.anInt9057 + (local336.aClass60_Sub1_Sub1_Sub3_Sub1_2.method4424((byte) -28) << 8);
			Static552.method7813(arg0, arg2, arg1, local336, arg3);
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(ZLclient!lga;I)Lclient!tb;")
	public static Class49 method7563(@OriginalArg(1) Class223 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class49 local17 = (Class49) Static266.aClass359_37.method8517((long) arg1);
		if (local17 == null) {
			if (Static675.aBoolean412) {
				local17 = Static202.aClass75_5.method6714(Static691.method1246(arg0, arg1), true);
			} else {
				local17 = Static289.method4754(arg0.method5275(arg1));
			}
			Static266.aClass359_37.method8515((long) arg1, local17);
		}
		return local17;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method7564(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = Static438.method6628(arg0.charAt(local12)) + (local10 << 5) - local10;
		}
		return local10;
	}
}

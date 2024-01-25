import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!so", name = "o", descriptor = "Lclient!wi;")
	public static final Class376 aClass376_6 = new Class376();

	@OriginalMember(owner = "client!so", name = "r", descriptor = "Lclient!wi;")
	public static final Class376 aClass376_7 = new Class376();

	@OriginalMember(owner = "client!so", name = "t", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_273 = new Class194(34, -1);

	@OriginalMember(owner = "client!so", name = "w", descriptor = "[Lclient!up;")
	public static final Interface26[] anInterface26Array2 = new Interface26[75];

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(I)V")
	public static void method7634() {
		Static614.aClass136_71.method3142();
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Ljava/lang/String;Lclient!dc;B)I")
	public static int method7635(@OriginalArg(0) String arg0, @OriginalArg(1) Class3_Sub9 arg1) {
		@Pc(6) int local6 = arg1.anInt6453;
		@Pc(15) byte[] local15 = Static505.method7342(arg0);
		arg1.method5640(local15.length);
		arg1.anInt6453 += Static79.aClass236_1.method5895(local15.length, arg1.anInt6453, local15, arg1.aByteArray51, 0);
		return arg1.anInt6453 - local6;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(Z)V")
	public static void method7636() {
		if (Static254.aClass3_Sub7_Sub13_2 != null) {
			Static254.aClass3_Sub7_Sub13_2 = null;
			Static283.method4602(Static231.anInt4645, Static97.anInt1966, Static386.anInt8229, Static641.anInt10142);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method7637(@OriginalArg(1) String arg0) {
		Static329.method5394(arg0, "", "", "", 0, 0);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZIBLjava/lang/String;)V")
	public static void method7638(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		Static129.method2281();
		if (arg1 == 0) {
			Static266.aClass82_8 = Static205.method7240(Static32.aClass3_Sub41_3.aClass7_Sub26_2.method8128() * 2, Static617.aCanvas13, Static567.aClass343_251, Static621.anInterface5_12, 0);
			if (arg2 != null) {
				Static266.aClass82_8.GA(0);
				@Pc(33) Class93 local33 = Static210.method3285(Static162.anInt3230, Static394.aClass343_188);
				@Pc(42) Class63 local42 = Static266.aClass82_8.method6127(local33, Static656.method6338(Static419.aClass343_200, Static162.anInt3230));
				Static616.method8421();
				Static447.method6682(true, local42, arg2, local33, Static266.aClass82_8);
			}
		} else {
			@Pc(55) Class82 local55 = null;
			@Pc(83) Class63 local83;
			if (arg2 != null) {
				local55 = Static205.method7240(0, Static617.aCanvas13, Static567.aClass343_251, Static621.anInterface5_12, 0);
				local55.GA(0);
				@Pc(74) Class93 local74 = Static210.method3285(Static162.anInt3230, Static394.aClass343_188);
				local83 = local55.method6127(local74, Static656.method6338(Static419.aClass343_200, Static162.anInt3230));
				Static616.method8421();
				Static447.method6682(true, local83, arg2, local74, local55);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static266.aClass82_8 = Static205.method7240(Static32.aClass3_Sub41_3.aClass7_Sub26_2.method8128() * 2, Static617.aCanvas13, Static567.aClass343_251, Static621.anInterface5_12, arg1);
					if (arg2 != null) {
						local55.GA(0);
						@Pc(116) Class93 local116 = Static210.method3285(Static162.anInt3230, Static394.aClass343_188);
						@Pc(125) Class63 local125 = local55.method6127(local116, Static656.method6338(Static419.aClass343_200, Static162.anInt3230));
						Static616.method8421();
						Static447.method6682(true, local125, arg2, local116, local55);
					}
					if (Static266.aClass82_8.method6113()) {
						@Pc(139) boolean local139 = true;
						try {
							local139 = Static545.aClass3_Sub38_1.anInt7213 > 256;
						} catch (@Pc(151) Throwable local151) {
						}
						@Pc(157) Class3_Sub45 local157;
						if (local139) {
							local157 = Static266.aClass82_8.method6138(146800640);
						} else {
							local157 = Static266.aClass82_8.method6138(104857600);
						}
						Static266.aClass82_8.method6173(local157);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(168) Throwable local168) {
					@Pc(173) int local173 = Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181();
					if (local173 == 2) {
						Static112.aBoolean167 = true;
					}
					Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub9_2);
					method7638(arg0, local173, arg2);
					@Pc(190) Object local190 = null;
					var14 = false;
				} finally {
					if (var14) {
						local83 = null;
						if (local55 != null) {
							try {
								local55.method6133();
							} catch (@Pc(342) Throwable local342) {
							}
						}
					}
				}
				if (local55 != null) {
					try {
						local55.method6133();
					} catch (@Pc(322) Throwable local322) {
					}
				}
				return;
			}
			local83 = null;
			if (local55 != null) {
				try {
					local55.method6133();
				} catch (@Pc(332) Throwable local332) {
				}
			}
		}
		Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4184(!arg0);
		Static32.aClass3_Sub41_3.method6773(arg1, Static32.aClass3_Sub41_3.aClass7_Sub9_2);
		Static48.method8027();
		Static266.aClass82_8.method6135();
		Static266.aClass82_8.X(32);
		Static570.aClass31_14 = Static266.aClass82_8.method6170();
		Static292.aClass31_20 = Static266.aClass82_8.method6170();
		Static129.method2279();
		Static266.aClass82_8.method6128(Static32.aClass3_Sub41_3.aClass7_Sub21_1.method6507() == 1);
		if (Static266.aClass82_8.method6136()) {
			Static64.method1059(Static32.aClass3_Sub41_3.aClass7_Sub25_1.method7711() == 1);
		}
		Static543.method7819(Static399.anInt7121 >> 3, Static266.aClass82_8, Static24.anInt345 >> 3);
		Static183.method2986();
		Static264.aBoolean581 = true;
		Static576.aBoolean708 = false;
		Static426.aClass334Array1 = null;
		Static592.method8210();
	}
}

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "Lclient!ol;")
	public static final Class245 aClass245_3 = new Class245();

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "[I")
	public static final int[] anIntArray493 = new int[25];

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
	public static void method6622() {
		Static562.aClass211_63.method5538(5);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	public static void method6623() {
		Static472.anInt8855 = 0;
		@Pc(13) int local13 = (Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398 >> 9) + Static230.anInt4667;
		@Pc(20) int local20 = Static563.anInt10006 + (Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396 >> 9);
		if (local13 >= 3053 && local13 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static472.anInt8855 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static472.anInt8855 = 1;
		}
		if (Static472.anInt8855 == 1 && local13 >= 3139 && local13 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static472.anInt8855 = 0;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!oa;I)V")
	public static void method6624(@OriginalArg(0) Class15 arg0) {
		@Pc(5) int local5 = Static386.anInt7409;
		@Pc(12) int local12 = Static489.anInt9112;
		@Pc(14) int local14 = Static277.anInt5863;
		@Pc(18) int local18 = Static344.anInt6998 - 3;
		if (Static424.aClass37_34 == null || Static580.aClass37_45 == null) {
			if (Static579.aClass254_137.method6417(Static281.anInt5878) && Static579.aClass254_137.method6417(Static218.anInt4467)) {
				Static424.aClass37_34 = arg0.method5275(Static599.method814(Static579.aClass254_137, Static281.anInt5878, 0), true);
				@Pc(47) Class20 local47 = Static599.method814(Static579.aClass254_137, Static218.anInt4467, 0);
				Static580.aClass37_45 = arg0.method5275(local47, true);
				local47.method815();
				Static453.aClass37_37 = arg0.method5275(local47, true);
			} else {
				arg0.C(local5, local12, local14, 20, Static104.anInt2510 | 255 - Static35.anInt981 << 24, 1);
			}
		}
		@Pc(91) int local91;
		@Pc(89) int local89;
		if (Static424.aClass37_34 != null && Static580.aClass37_45 != null) {
			local89 = (local14 - Static580.aClass37_45.QA() * 2) / Static424.aClass37_34.QA();
			for (local91 = 0; local91 < local89; local91++) {
				Static424.aClass37_34.method7076(Static580.aClass37_45.QA() + local5 + Static424.aClass37_34.QA() * local91, local12);
			}
			Static580.aClass37_45.method7076(local5, local12);
			Static453.aClass37_37.method7076(local5 + local14 - Static453.aClass37_37.QA(), local12);
		}
		Static162.aClass111_6.method6675(Static139.aClass101_23.method2841(Static126.anInt2904), local5 + 3, local12 - -14, Static207.anInt4262 | 0xFF000000, -1);
		arg0.C(local5, local12 + 20, local14, local18 - 20, -Static35.anInt981 + 255 << 24 | Static104.anInt2510, 1);
		local89 = Static258.aClass116_1.method8249();
		local91 = Static258.aClass116_1.method8250();
		@Pc(176) int local176 = 0;
		@Pc(197) int local197;
		for (@Pc(181) Class3_Sub40 local181 = (Class3_Sub40) Static342.aClass183_44.method4795(); local181 != null; local181 = (Class3_Sub40) Static342.aClass183_44.method4793()) {
			local197 = (Static309.anInt6170 - local176 - 1) * 16 + local12 + 33;
			if (local5 < local89 && local14 + local5 > local89 && local91 > local197 - 13 && local197 + 4 > local91 && local181.aBoolean622) {
				arg0.C(local5, local197 - 12, local14, 16, 255 - Static168.anInt3533 << 24 | Static568.anInt10053, 1);
			}
			local176++;
		}
		if ((Static347.aClass37_31 == null || Static140.aClass37_39 == null || Static451.aClass37_36 == null) && Static579.aClass254_137.method6417(Static120.anInt2747) && Static579.aClass254_137.method6417(Static531.anInt9620) && Static579.aClass254_137.method6417(Static473.anInt8858)) {
			@Pc(276) Class20 local276 = Static599.method814(Static579.aClass254_137, Static531.anInt9620, 0);
			Static140.aClass37_39 = arg0.method5275(local276, true);
			local276.method815();
			Static303.aClass37_30 = arg0.method5275(local276, true);
			Static347.aClass37_31 = arg0.method5275(Static599.method814(Static579.aClass254_137, Static120.anInt2747, 0), true);
			@Pc(301) Class20 local301 = Static599.method814(Static579.aClass254_137, Static473.anInt8858, 0);
			Static451.aClass37_36 = arg0.method5275(local301, true);
			local301.method815();
			Static554.aClass37_42 = arg0.method5275(local301, true);
		}
		@Pc(367) int local367;
		@Pc(331) int local331;
		if (Static347.aClass37_31 != null && Static140.aClass37_39 != null && Static451.aClass37_36 != null) {
			local197 = (local14 - Static451.aClass37_36.QA() * 2) / Static347.aClass37_31.QA();
			for (local331 = 0; local331 < local197; local331++) {
				Static347.aClass37_31.method7076(local5 + Static451.aClass37_36.QA() + Static347.aClass37_31.QA() * local331, local12 + (local18 - Static347.aClass37_31.b()));
			}
			local367 = (local18 - Static451.aClass37_36.b() - 20) / Static140.aClass37_39.b();
			for (@Pc(369) int local369 = 0; local369 < local367; local369++) {
				Static140.aClass37_39.method7076(local5, local12 + Static140.aClass37_39.b() * local369 + 20);
				Static303.aClass37_30.method7076(local5 + local14 - Static303.aClass37_30.QA(), local12 + 20 + local369 * Static140.aClass37_39.b());
			}
			Static451.aClass37_36.method7076(local5, local12 + local18 - Static451.aClass37_36.b());
			Static554.aClass37_42.method7076(local14 + local5 - Static451.aClass37_36.QA(), local18 + local12 - Static451.aClass37_36.b());
		}
		local176 = 0;
		for (@Pc(436) Class3_Sub40 local436 = (Class3_Sub40) Static342.aClass183_44.method4795(); local436 != null; local436 = (Class3_Sub40) Static342.aClass183_44.method4793()) {
			local331 = local12 + (-local176 + -1 + Static309.anInt6170) * 16 + 20 + 13;
			local367 = Static207.anInt4262 | 0xFF000000;
			if (local5 < local89 && local89 < local14 + local5 && local331 - 13 < local91 && local91 < local331 + 4 && local436.aBoolean622) {
				local367 = Static6.anInt275 | 0xFF000000;
			}
			@Pc(488) int[] local488 = null;
			if (Static211.method3720(local436.anInt7324)) {
				local488 = Static517.aClass23_2.method901((int) local436.aLong191).anIntArray18;
			} else if (local436.anInt7316 != -1) {
				local488 = Static517.aClass23_2.method901(local436.anInt7316).anIntArray18;
			} else if (Static566.method8142(local436.anInt7324)) {
				@Pc(565) Class3_Sub46 local565 = (Class3_Sub46) Static331.aClass25_25.method946((long) local436.aLong191);
				if (local565 != null) {
					@Pc(570) Class2_Sub2_Sub1_Sub2 local570 = local565.aClass2_Sub2_Sub1_Sub2_2;
					@Pc(573) Class169 local573 = local570.aClass169_1;
					if (local573.anIntArray306 != null) {
						local573 = local573.method4177(Static588.aClass322_1);
					}
					if (local573 != null) {
						local488 = local573.anIntArray305;
					}
				}
			} else if (Static127.method2533(local436.anInt7324)) {
				@Pc(534) Class292 local534;
				if (local436.anInt7324 == 1004) {
					local534 = Static253.aClass146_2.method3356((int) local436.aLong191);
				} else {
					local534 = Static253.aClass146_2.method3356((int) (local436.aLong191 >>> 32 & 0x7FFFFFFFL));
				}
				if (local534.anIntArray571 != null) {
					local534 = local534.method7198(Static588.aClass322_1);
				}
				if (local534 != null) {
					local488 = local534.anIntArray574;
				}
			}
			@Pc(598) String local598 = Static526.method7770(local436);
			if (local488 != null) {
				local598 = local598 + Static260.method4598(local488);
			}
			Static162.aClass111_6.method6670(Static528.aClass37Array11, local367, local331, Static282.anIntArray362, local598, local5 + 3);
			if (local436.aBoolean621) {
				Static284.aClass37_32.method7076(local5 + Static9.aClass297_1.method7314(local598) + 5, local331 - 12);
			}
			local176++;
		}
		Static128.method6031(Static277.anInt5863, Static489.anInt9112, Static386.anInt7409, Static344.anInt6998);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIII)V")
	public static void method6625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static121.anInt3868 = arg3;
		Static276.anInt5860 = arg1;
		Static477.anInt8923 = arg0;
		Static556.anInt9967 = arg2;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/awt/Component;Lclient!ufa;III)Lclient!dc;")
	public static Class24 method6626(@OriginalArg(0) Component arg0, @OriginalArg(1) Class326 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static149.anInt2863 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class24 local33 = (Class24) Class.forName("Class24_Sub2").getDeclaredConstructor().newInstance();
			local33.anInt1069 = arg2;
			local33.anIntArray66 = new int[(Static124.aBoolean223 ? 2 : 1) * 256];
			local33.method1131(arg0);
			local33.anInt1067 = (arg2 & 0xFFFFFC00) + 1024;
			if (local33.anInt1067 > 16384) {
				local33.anInt1067 = 16384;
			}
			local33.method1127(local33.anInt1067);
			if (Static296.anInt6026 > 0 && Static547.aClass250_1 == null) {
				Static547.aClass250_1 = new Class250();
				Static547.aClass250_1.aClass326_1 = arg1;
				arg1.method7795(Static547.aClass250_1, Static296.anInt6026);
			}
			if (Static547.aClass250_1 != null) {
				if (Static547.aClass250_1.aClass24Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static547.aClass250_1.aClass24Array1[arg3] = local33;
			}
			return local33;
		} catch (@Pc(105) Throwable local105) {
			try {
				@Pc(111) Class24_Sub1 local111 = new Class24_Sub1(arg1, arg3);
				local111.anInt1069 = arg2;
				local111.anIntArray66 = new int[(Static124.aBoolean223 ? 2 : 1) * 256];
				local111.method1131(arg0);
				local111.anInt1067 = 16384;
				local111.method1127(local111.anInt1067);
				if (Static296.anInt6026 > 0 && Static547.aClass250_1 == null) {
					Static547.aClass250_1 = new Class250();
					Static547.aClass250_1.aClass326_1 = arg1;
					arg1.method7795(Static547.aClass250_1, Static296.anInt6026);
				}
				if (Static547.aClass250_1 != null) {
					if (Static547.aClass250_1.aClass24Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static547.aClass250_1.aClass24Array1[arg3] = local111;
				}
				return local111;
			} catch (@Pc(178) Throwable local178) {
				return new Class24();
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILjava/lang/String;)Lclient!ue;")
	public static Class106 method6627(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class106 local13;
		try {
			local13 = (Class106) Class.forName("Class106_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			local13 = new Class106_Sub1();
		}
		local13.aString95 = arg1;
		local13.anInt8264 = arg0;
		return local13;
	}
}

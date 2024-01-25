import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_97;

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "Z")
	public static boolean aBoolean509 = false;

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "Lclient!pw;")
	public static final Class261 aClass261_8 = new Class261("", 10);

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBII)V")
	public static void method6097(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(3) int local3 = arg1 << 3;
		@Pc(15) int local15 = arg0 << 3;
		if (Static346.anInt6215 == 2) {
			Static385.anInt6775 = 0;
			Static570.anInt9340 = local3;
			Static67.anInt1407 = local15;
		}
		Static428.aFloat160 = local3;
		Static331.aFloat140 = local15;
		Static468.method6541();
		Static261.aBoolean359 = true;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(JJ)J")
	public static long method6099(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method6100(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 == 0) {
			Static240.aClass14_7 = Static354.method6855(Static488.anInterface4_11, Static13.aClass251_100, 0, Static32.aCanvas3, Static140.aClass6_Sub48_Sub1_1.anInt9013 * 2);
			if (arg1 != null) {
				Static240.aClass14_7.D(0);
				@Pc(28) Class327 local28 = Static141.method2763(Static67.anInt1401, Static264.aClass251_66);
				@Pc(37) Class92 local37 = Static240.aClass14_7.method6854(local28, Static604.method3627(Static398.aClass251_94, Static67.anInt1401));
				Static535.method7308();
				Static30.method892(arg1, local28, local37, Static240.aClass14_7, true);
			}
		} else {
			@Pc(50) Class14 local50 = null;
			@Pc(78) Class92 local78;
			@Pc(69) Class327 local69;
			if (arg1 != null) {
				local50 = Static354.method6855(Static488.anInterface4_11, Static13.aClass251_100, 0, Static32.aCanvas3, 0);
				local50.D(0);
				local69 = Static141.method2763(Static67.anInt1401, Static264.aClass251_66);
				local78 = local50.method6854(local69, Static604.method3627(Static398.aClass251_94, Static67.anInt1401));
				Static535.method7308();
				Static30.method892(arg1, local69, local78, local50, true);
			}
			try {
				Static240.aClass14_7 = Static354.method6855(Static488.anInterface4_11, Static13.aClass251_100, arg0, Static32.aCanvas3, Static140.aClass6_Sub48_Sub1_1.anInt9013 * 2);
				if (arg1 != null) {
					local50.D(0);
					local69 = Static141.method2763(Static67.anInt1401, Static264.aClass251_66);
					local78 = local50.method6854(local69, Static604.method3627(Static398.aClass251_94, Static67.anInt1401));
					Static535.method7308();
					Static30.method892(arg1, local69, local78, local50, true);
				}
				if (Static240.aClass14_7.method6837()) {
					@Pc(132) boolean local132 = true;
					try {
						local132 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(144) Throwable local144) {
					}
					@Pc(150) Class6_Sub15 local150;
					if (local132) {
						local150 = Static240.aClass14_7.method6898(146800640);
					} else {
						local150 = Static240.aClass14_7.method6898(104857600);
					}
					Static240.aClass14_7.method6891(local150);
				}
			} catch (@Pc(161) Throwable local161) {
				Static240.aClass14_7 = Static354.method6855(Static488.anInterface4_11, Static13.aClass251_100, 0, Static32.aCanvas3, 0);
				arg0 = 0;
			}
			if (local50 != null) {
				try {
					local50.method6824();
				} catch (@Pc(178) Throwable local178) {
				}
			}
		}
		Static560.anInt9242 = arg0;
		Static234.method4075();
		if (!Static240.aClass14_7.method6836()) {
			Static495.anInt7806 = 1;
		}
		Static240.aClass14_7.method6905(Static495.anInt7806);
		Static240.aClass14_7.method6873(0);
		Static240.aClass14_7.JA(32);
		Static21.aClass54_1 = Static240.aClass14_7.method6882();
		Static528.aClass54_6 = Static240.aClass14_7.method6882();
		Static417.method5980();
		Static240.aClass14_7.method6861(!Static140.aClass6_Sub48_Sub1_1.aBoolean691);
		if (Static240.aClass14_7.method6826()) {
			Static526.method7213(Static140.aClass6_Sub48_Sub1_1.aBoolean682);
		}
		Static484.method6660(Static473.anInt8075 >> 3, Static240.aClass14_7, Static165.anInt6749 >> 3);
		Static425.method6109();
		Static489.aClass71Array1 = null;
		Static408.aBoolean501 = false;
		Static555.aBoolean712 = true;
	}
}

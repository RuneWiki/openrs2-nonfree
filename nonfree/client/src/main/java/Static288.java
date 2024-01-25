import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Lclient!ij;")
	public static Class93 aClass93_112;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Z")
	public static boolean aBoolean470 = false;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	public static int anInt5649 = -1;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	public static int anInt5652 = -1;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray56 = new String[100];

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method5005() {
		@Pc(5) String local5 = "www";
		if (Static351.anInt6735 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(12) String local12 = "";
		if (Static96.aString10 != null) {
			local12 = "/p=" + Static96.aString10;
		}
		return Static111.anInt2077 == 1 ? "http://" + local5 + ".stellardawn.com/l=" + Static41.anInt726 + "/a=" + Static16.anInt331 + local12 + "/" : "http://" + local5 + ".runescape.com/l=" + Static41.anInt726 + "/a=" + Static16.anInt331 + local12 + "/";
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Z")
	public static boolean method5007() {
		return Static342.anInt6605 == 0 ? Static258.aBoolean423 : true;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
	public static void method5008() {
		Static264.aClass103_128.method2751();
		for (@Pc(13) Class5_Sub20 local13 = (Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.method2756(); local13 != null; local13 = (Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.method2748()) {
			if (local13.anInt2094 < 1000) {
				local13.method6005();
				Static264.aClass103_128.method2745(local13);
			}
		}
		Static264.aClass103_128.method2744(Class4_Sub3_Sub2.aClass103_139);
		if (Static204.aClass201_8 != null || Static284.anInt5599 > 0) {
			return;
		}
		@Pc(52) int local52 = -1;
		if (Static150.aClass5_Sub26_1 != null) {
			local52 = Static150.aClass5_Sub26_1.method4481();
		}
		if (!Static93.aBoolean128) {
			if (Static170.anInt3417 >= 0) {
				local52 = Static170.anInt3417;
			}
			Static170.anInt3417 = -1;
			if (local52 == 0 && (Static267.anInt5259 == 1 && Static160.anInt3181 > 2 || Static245.method4388())) {
				local52 = 2;
			}
			if (local52 == 2 && Static160.anInt3181 > 0) {
				if (Static150.aClass5_Sub26_1 == null) {
					Static346.method5927(Static119.anInt3763, Static164.anInt3268);
				} else {
					Static346.method5927(Static150.aClass5_Sub26_1.method4483(), Static150.aClass5_Sub26_1.method4478());
				}
			}
			if (local52 == 0 && Static160.anInt3181 > 0) {
				Static309.method5420();
			}
			return;
		}
		@Pc(68) int local68;
		@Pc(72) int local72;
		if (local52 == -1) {
			local68 = Static316.aClass118_3.method4054();
			local72 = Static316.aClass118_3.method4050();
			if (local68 < Static187.anInt3710 - 10 || Static187.anInt3710 + Static334.anInt6466 + 10 < local68 || Static141.anInt2737 - 10 > local72 || local72 > Static127.anInt2450 + Static141.anInt2737 + 10) {
				Static93.aBoolean128 = false;
				Static184.method5033(Static187.anInt3710, Static127.anInt2450, Static334.anInt6466, Static141.anInt2737);
			}
		}
		if (local52 != 0) {
			return;
		}
		local68 = Static187.anInt3710;
		local72 = Static141.anInt2737;
		@Pc(120) int local120 = Static334.anInt6466;
		@Pc(124) int local124 = Static150.aClass5_Sub26_1.method4478();
		@Pc(128) int local128 = Static150.aClass5_Sub26_1.method4483();
		@Pc(130) int local130 = -1;
		@Pc(149) int local149;
		for (@Pc(132) int local132 = 0; local132 < Static160.anInt3181; local132++) {
			if (Static133.aBoolean203) {
				local149 = (Static160.anInt3181 - local132 - 1) * 16 + local72 + 33;
				if (local68 < local124 && local124 < local120 + local68 && local149 - 13 < local128 && local149 + 4 > local128) {
					local130 = local132;
				}
			} else {
				local149 = local72 + (Static160.anInt3181 + -1 + -local132) * 16 + 31;
				if (local124 > local68 && local124 < local120 + local68 && local149 - 13 < local128 && local128 < local149 + 3) {
					local130 = local132;
				}
			}
		}
		if (local130 != -1) {
			local149 = 0;
			@Pc(235) Class29 local235 = new Class29(Class4_Sub3_Sub2.aClass103_139);
			for (@Pc(240) Class5_Sub20 local240 = (Class5_Sub20) local235.method576(); local240 != null; local240 = (Class5_Sub20) local235.method577()) {
				if (local149 == local130) {
					Static2.method1432(local240);
				}
				local149++;
			}
		}
		Static93.aBoolean128 = false;
		Static184.method5033(Static187.anInt3710, Static127.anInt2450, Static334.anInt6466, Static141.anInt2737);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Lclient!tm;")
	public static Class5_Sub1_Sub19 method5009(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub1_Sub19 local10 = (Class5_Sub1_Sub19) Static198.aClass122_8.method3177((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29;
		if (arg0 >= 32768) {
			local29 = Static120.aClass93_48.method2410(arg0 & 0x7FFF, 0);
		} else {
			local29 = Static60.aClass93_39.method2410(arg0, 0);
		}
		local10 = new Class5_Sub1_Sub19();
		if (local29 != null) {
			local10.method5455(new Class5_Sub12(local29));
		}
		if (arg0 >= 32768) {
			local10.method5457();
		}
		Static198.aClass122_8.method3181((long) arg0, local10);
		return local10;
	}
}

import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!de", name = "E", descriptor = "Lclient!t;")
	public static Class10_Sub1 aClass10_Sub1_5;

	@OriginalMember(owner = "client!de", name = "N", descriptor = "[Lclient!qe;")
	public static Class4_Sub3_Sub6_Sub2[] aClass4_Sub3_Sub6_Sub2Array2;

	@OriginalMember(owner = "client!de", name = "O", descriptor = "Lclient!c;")
	public static Class10 aClass10_9;

	@OriginalMember(owner = "client!de", name = "R", descriptor = "Lclient!eb;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "Z")
	public static boolean aBoolean34 = false;

	@OriginalMember(owner = "client!de", name = "t", descriptor = "Lclient!od;")
	private static Class60 aClass60_262 = Static41.method597("wishes to duel with you)3");

	@OriginalMember(owner = "client!de", name = "v", descriptor = "Lclient!od;")
	public static Class60 aClass60_264 = aClass60_262;

	@OriginalMember(owner = "client!de", name = "z", descriptor = "Lclient!lb;")
	public static Class45 aClass45_4 = new Class45();

	@OriginalMember(owner = "client!de", name = "P", descriptor = "Lclient!od;")
	private static Class60 aClass60_273 = Static41.method597("wave:");

	@OriginalMember(owner = "client!de", name = "B", descriptor = "Lclient!od;")
	public static Class60 aClass60_265 = aClass60_273;

	@OriginalMember(owner = "client!de", name = "C", descriptor = "Lclient!od;")
	public static Class60 aClass60_266 = Static41.method597("headicons_prayer");

	@OriginalMember(owner = "client!de", name = "D", descriptor = "Lclient!od;")
	private static Class60 aClass60_267 = Static41.method597("World");

	@OriginalMember(owner = "client!de", name = "F", descriptor = "I")
	public static int anInt833 = 0;

	@OriginalMember(owner = "client!de", name = "G", descriptor = "Lclient!od;")
	public static Class60 aClass60_268 = Static41.method597("lila:");

	@OriginalMember(owner = "client!de", name = "H", descriptor = "Lclient!od;")
	public static Class60 aClass60_269 = Static41.method597("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!de", name = "I", descriptor = "[I")
	public static int[] anIntArray86 = new int[5];

	@OriginalMember(owner = "client!de", name = "J", descriptor = "Lclient!od;")
	public static Class60 aClass60_270 = aClass60_267;

	@OriginalMember(owner = "client!de", name = "K", descriptor = "Lclient!od;")
	public static Class60 aClass60_271 = aClass60_267;

	@OriginalMember(owner = "client!de", name = "L", descriptor = "I")
	public static int anInt834 = 0;

	@OriginalMember(owner = "client!de", name = "M", descriptor = "Lclient!od;")
	public static Class60 aClass60_272 = Static41.method597("");

	@OriginalMember(owner = "client!de", name = "Q", descriptor = "Z")
	public static boolean aBoolean35 = true;

	@OriginalMember(owner = "client!de", name = "S", descriptor = "Lclient!od;")
	public static Class60 aClass60_274 = aClass60_273;

	@OriginalMember(owner = "client!de", name = "T", descriptor = "Lclient!od;")
	public static Class60 aClass60_275 = Static41.method597("au");

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ia;II)V")
	public static void method440(@OriginalArg(0) Class4_Sub3_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		Static65.method1056(arg1, arg0.anInt1407, arg0.anInt1440);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!ia;I)V")
	public static void method441(@OriginalArg(1) Class4_Sub3_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (Static118.anInt2741 < arg0.anInt1425) {
			Static65.method1063(arg0);
		} else if (arg0.anInt1446 < Static118.anInt2741) {
			Static67.method1080(arg0);
		} else {
			Static133.method2000(arg0);
		}
		if (arg0.anInt1440 < 128 || arg0.anInt1407 < 128 || arg0.anInt1440 >= 13184 || arg0.anInt1407 >= 13184) {
			arg0.anInt1425 = 0;
			arg0.anInt1408 = -1;
			arg0.anInt1440 = arg0.anIntArray137[0] * 128 + arg0.anInt1434 * 64;
			arg0.anInt1407 = arg0.anIntArray135[0] * 128 + arg0.anInt1434 * 64;
			arg0.anInt1416 = -1;
			arg0.anInt1446 = 0;
			arg0.method855();
		}
		if (arg0 == Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1 && (arg0.anInt1440 < 1536 || arg0.anInt1407 < 1536 || arg0.anInt1440 >= 11776 || arg0.anInt1407 >= 11776)) {
			arg0.anInt1416 = -1;
			arg0.anInt1446 = 0;
			arg0.anInt1407 = arg0.anInt1434 * 64 + arg0.anIntArray135[0] * 128;
			arg0.anInt1425 = 0;
			arg0.anInt1408 = -1;
			arg0.anInt1440 = arg0.anIntArray137[0] * 128 + arg0.anInt1434 * 64;
			arg0.method855();
		}
		Static26.method454(arg0);
		Static4.method48(arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!qe;B)V")
	public static void method442(@OriginalArg(0) Class4_Sub3_Sub6_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static77.anIntArray212.length; local7++) {
			Static77.anIntArray212[local7] = 0;
		}
		@Pc(32) int local32;
		for (@Pc(22) int local22 = 0; local22 < 5000; local22++) {
			local32 = (int) (Math.random() * 128.0D * (double) 256);
			Static77.anIntArray212[local32] = (int) (Math.random() * 256.0D);
		}
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(68) int local68;
		for (local32 = 0; local32 < 20; local32++) {
			for (local56 = 1; local56 < 255; local56++) {
				for (local60 = 1; local60 < 127; local60++) {
					local68 = (local56 << 7) + local60;
					Static110.anIntArray331[local68] = (Static77.anIntArray212[local68 + 128] + Static77.anIntArray212[local68 - 1] + Static77.anIntArray212[local68 + 1] + Static77.anIntArray212[local68 - 128]) / 4;
				}
			}
			@Pc(111) int[] local111 = Static77.anIntArray212;
			Static77.anIntArray212 = Static110.anIntArray331;
			Static110.anIntArray331 = local111;
		}
		if (arg0 == null) {
			return;
		}
		local56 = 0;
		for (local60 = 0; local60 < arg0.anInt2256; local60++) {
			for (local68 = 0; local68 < arg0.anInt2255; local68++) {
				if (arg0.aByteArray35[local56++] != 0) {
					@Pc(144) int local144 = arg0.anInt2251 + local68 + 16;
					@Pc(152) int local152 = local60 + arg0.anInt2253 + 16;
					@Pc(159) int local159 = local144 + (local152 << 7);
					Static77.anIntArray212[local159] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
	public static void method443() {
		aClass60_270 = null;
		aClass60_267 = null;
		aClass10_Sub1_5 = null;
		aClass60_272 = null;
		aClass60_275 = null;
		aClass10_9 = null;
		aClass60_264 = null;
		aClass60_274 = null;
		aClass60_273 = null;
		aClass60_266 = null;
		anIntArray86 = null;
		aClass4_Sub3_Sub6_Sub2Array2 = null;
		aClass45_4 = null;
		aClass60_268 = null;
		aClass60_269 = null;
		aClass60_271 = null;
		aClass60_262 = null;
		aClass60_265 = null;
		aClass19_1 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method444(@OriginalArg(0) KeyEvent arg0) {
		@Pc(2) int local2 = arg0.getKeyChar();
		if (local2 == 8364) {
			return 128;
		} else {
			if (local2 <= 0 || local2 >= 256) {
				local2 = -1;
			}
			return local2;
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)V")
	public static void method445() {
		Static96.aClass4_Sub9_Sub1_2.method832();
		@Pc(9) int local9 = Static96.aClass4_Sub9_Sub1_2.method833(8);
		@Pc(22) int local22;
		if (Static36.anInt1010 > local9) {
			for (local22 = local9; local22 < Static36.anInt1010; local22++) {
				Static3.anIntArray5[Static21.anInt737++] = Static59.anIntArray173[local22];
			}
		}
		if (local9 > Static36.anInt1010) {
			throw new RuntimeException("gnpov1");
		}
		Static36.anInt1010 = 0;
		for (local22 = 0; local22 < local9; local22++) {
			@Pc(60) int local60 = Static59.anIntArray173[local22];
			@Pc(64) Class4_Sub3_Sub1_Sub2_Sub2 local64 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local60];
			@Pc(69) int local69 = Static96.aClass4_Sub9_Sub1_2.method833(1);
			if (local69 == 0) {
				Static59.anIntArray173[Static36.anInt1010++] = local60;
				local64.anInt1394 = Static118.anInt2741;
			} else {
				@Pc(92) int local92 = Static96.aClass4_Sub9_Sub1_2.method833(2);
				if (local92 == 0) {
					Static59.anIntArray173[Static36.anInt1010++] = local60;
					local64.anInt1394 = Static118.anInt2741;
					Static35.anIntArray97[Static9.anInt116++] = local60;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local92 == 1) {
						Static59.anIntArray173[Static36.anInt1010++] = local60;
						local64.anInt1394 = Static118.anInt2741;
						local139 = Static96.aClass4_Sub9_Sub1_2.method833(3);
						local64.method851(local139, false);
						local149 = Static96.aClass4_Sub9_Sub1_2.method833(1);
						if (local149 == 1) {
							Static35.anIntArray97[Static9.anInt116++] = local60;
						}
					} else if (local92 == 2) {
						Static59.anIntArray173[Static36.anInt1010++] = local60;
						local64.anInt1394 = Static118.anInt2741;
						local139 = Static96.aClass4_Sub9_Sub1_2.method833(3);
						local64.method851(local139, true);
						local149 = Static96.aClass4_Sub9_Sub1_2.method833(3);
						local64.method851(local149, true);
						@Pc(203) int local203 = Static96.aClass4_Sub9_Sub1_2.method833(1);
						if (local203 == 1) {
							Static35.anIntArray97[Static9.anInt116++] = local60;
						}
					} else if (local92 == 3) {
						Static3.anIntArray5[Static21.anInt737++] = local60;
					}
				}
			}
		}
	}
}

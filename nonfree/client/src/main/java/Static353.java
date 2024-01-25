import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!om", name = "r", descriptor = "[I")
	public static int[] anIntArray566;

	@OriginalMember(owner = "client!om", name = "l", descriptor = "I")
	public static int anInt6659 = 0;

	@OriginalMember(owner = "client!om", name = "s", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_105 = new Class67("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)I")
	public static int method5561(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg2 & 0xF;
		@Pc(21) int local21 = local12 < 8 ? arg3 : arg0;
		@Pc(40) int local40 = local12 < 4 ? arg0 : local12 == 12 || local12 == 14 ? arg3 : arg1;
		return ((local12 & 0x1) == 0 ? local21 : -local21) + ((local12 & 0x2) == 0 ? local40 : -local40);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Z")
	public static boolean method5562() {
		if (Static255.aBoolean353) {
			try {
				Static562.method7815("showVideoAd", Static370.anApplet1);
				return true;
			} catch (@Pc(17) Throwable local17) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
	public static void method5563() {
		if (Static226.anIntArray436 != null && Static247.anIntArray452 != null) {
			return;
		}
		Static247.anIntArray452 = new int[256];
		Static226.anIntArray436 = new int[256];
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(31) double local31 = (double) local22 / 255.0D * 6.283185307179586D;
			Static226.anIntArray436[local22] = (int) (Math.sin(local31) * 4096.0D);
			Static247.anIntArray452[local22] = (int) (Math.cos(local31) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I[[[Lclient!uaa;)V")
	public static void method5564(@OriginalArg(1) Class290[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(14) Class290[][] local14 = arg0[local3];
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
				for (@Pc(20) int local20 = 0; local20 < local14[local16].length; local20++) {
					@Pc(28) Class290 local28 = local14[local16][local20];
					if (local28 != null) {
						if (local28.aClass6_Sub3_2 instanceof Interface15) {
							((Interface15) local28.aClass6_Sub3_2).method7760();
						}
						if (local28.aClass6_Sub4_3 instanceof Interface15) {
							((Interface15) local28.aClass6_Sub4_3).method7760();
						}
						if (local28.aClass6_Sub4_2 instanceof Interface15) {
							((Interface15) local28.aClass6_Sub4_2).method7760();
						}
						if (local28.aClass6_Sub2_2 instanceof Interface15) {
							((Interface15) local28.aClass6_Sub2_2).method7760();
						}
						if (local28.aClass6_Sub2_3 instanceof Interface15) {
							((Interface15) local28.aClass6_Sub2_3).method7760();
						}
						for (@Pc(82) Class98 local82 = local28.aClass98_3; local82 != null; local82 = local82.aClass98_1) {
							@Pc(87) Class6_Sub1 local87 = local82.aClass6_Sub1_1;
							if (local87 instanceof Interface15) {
								((Interface15) local87).method7760();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(JLclient!oa;B)V")
	public static void method5566(@OriginalArg(0) long arg0, @OriginalArg(1) Class5 arg1) {
		Static244.anInt5026 = Static243.anInt5018;
		Static393.anInt7214 = 0;
		Static243.anInt5018 = 0;
		@Pc(14) long local14 = Static12.method647();
		for (@Pc(19) Class4_Sub4 local19 = (Class4_Sub4) Static73.aClass90_20.method2326(); local19 != null; local19 = (Class4_Sub4) Static73.aClass90_20.method2325()) {
			if (local19.method4592(arg1, arg0)) {
				Static393.anInt7214++;
			}
		}
		if (Static213.aBoolean336 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static73.aClass90_20.method2317() + ", running: " + Static393.anInt7214 + ". Particles: " + Static243.anInt5018 + ". Time taken: " + (Static12.method647() - local14) + "ms");
		}
	}
}

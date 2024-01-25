import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIBI)I")
	public static int method7810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 4095 - arg2;
		} else {
			return 4095 - arg1;
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "()V")
	public static void method7811() {
		for (@Pc(1) int local1 = Static289.anInt5399; local1 < Static590.anInt10277; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static349.anInt6237; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static414.anInt7451; local7++) {
					@Pc(16) Class333 local16 = Static189.aClass333ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class25_Sub2_Sub3 local21 = local16.aClass25_Sub2_Sub3_2;
						@Pc(24) Class25_Sub2_Sub3 local24 = local16.aClass25_Sub2_Sub3_1;
						if (local21 != null && local21.method6643()) {
							Static162.method2971(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method6643()) {
								Static162.method2971(local24, local1, local4, local7, 1, 1);
								local24.method6654(0, 0, Static68.aClass31_4, false, 0, local21);
								local24.method6644();
							}
							local21.method6644();
						}
						for (@Pc(68) Class147 local68 = local16.aClass147_3; local68 != null; local68 = local68.aClass147_2) {
							@Pc(72) Class25_Sub2_Sub2 local72 = local68.aClass25_Sub2_Sub2_1;
							if (local72 != null && local72.method6643()) {
								Static162.method2971(local72, local1, local4, local7, local72.aShort108 + 1 - local72.aShort106, local72.aShort109 - local72.aShort107 + 1);
								local72.method6644();
							}
						}
						@Pc(108) Class25_Sub2_Sub5 local108 = local16.aClass25_Sub2_Sub5_1;
						if (local108 != null && local108.method6643()) {
							Static102.method2108(local108, local1, local4, local7);
							local108.method6644();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "(III)Z")
	public static boolean method7812(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static313.method4671(arg0, arg1)) {
			return (arg0 & 0x9000) != 0 | Static317.method4702(arg0, arg1) | Static286.method4308(arg1, arg0) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | Static266.method4068(arg1, arg0) | Static271.method4110(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(B)V")
	public static void method7813() {
		@Pc(7) int local7 = Static31.anInt499;
		@Pc(13) int[] local13 = Static315.anIntArray279;
		for (@Pc(15) int local15 = 0; local15 < local7; local15++) {
			@Pc(23) Class25_Sub2_Sub2_Sub5_Sub1 local23 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local13[local15]];
			if (local23 != null && local23.anInt8569 > 0) {
				local23.anInt8569--;
				if (local23.anInt8569 == 0) {
					local23.aString229 = null;
				}
			}
		}
		for (@Pc(49) int local49 = 0; local49 < Static60.anInt1599; local49++) {
			@Pc(56) long local56 = (long) Static529.anIntArray535[local49];
			@Pc(62) Class3_Sub39 local62 = (Class3_Sub39) Static581.aClass297_39.method6531(local56);
			if (local62 != null) {
				@Pc(67) Class25_Sub2_Sub2_Sub5_Sub2 local67 = local62.aClass25_Sub2_Sub2_Sub5_Sub2_2;
				if (local67.anInt8569 > 0) {
					local67.anInt8569--;
					if (local67.anInt8569 == 0) {
						local67.aString229 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(B[B)Lclient!f;")
	public static Class73 method7814(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(18) Image local18 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(23) MediaTracker local23 = new MediaTracker(Static507.aClient1);
				local23.addImage(local18, 0);
				local23.waitForAll();
				@Pc(33) int local33 = local18.getWidth(Static507.aClient1);
				@Pc(37) int local37 = local18.getHeight(Static507.aClient1);
				if (!local23.isErrorAny() && local33 >= 0 && local37 >= 0) {
					@Pc(54) int[] local54 = new int[local33 * local37];
					@Pc(66) PixelGrabber local66 = new PixelGrabber(local18, 0, 0, local33, local37, local54, 0, local33);
					local66.grabPixels();
					return Static319.aClass31_11.method8033(local54, local33, local33, local37);
				}
				throw new RuntimeException("");
			} catch (@Pc(78) InterruptedException local78) {
			}
		}
	}
}

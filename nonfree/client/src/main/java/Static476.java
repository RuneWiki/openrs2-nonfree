import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "Lclient!uaa;")
	public static Class333 aClass333_12;

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
	public static int anInt8410;

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "[J")
	public static final long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "([BI)Lclient!ufa;")
	public static Class4 method7043(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static545.aClient1);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static545.aClient1);
				@Pc(38) int local38 = local19.getHeight(Static545.aClient1);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(58) int[] local58 = new int[local38 * local34];
					@Pc(70) PixelGrabber local70 = new PixelGrabber(local19, 0, 0, local34, local38, local58, 0, local34);
					local70.grabPixels();
					return Static467.aClass5_13.method6111(local34, local38, local58, local34);
				}
				throw new RuntimeException("");
			} catch (@Pc(85) InterruptedException local85) {
			}
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IILclient!ha;Lclient!kia;)V")
	public static void method7044(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) Class169 arg2) {
		@Pc(17) int local17;
		if (Static254.anIntArray224 != null && arg0 <= arg2.aByte69) {
			for (local17 = 0; local17 < Static254.anIntArray224.length; local17++) {
				if (Static254.anIntArray224[local17] != -1000000 && (Static254.anIntArray224[local17] >= arg2.anIntArray277[0] || Static254.anIntArray224[local17] >= arg2.anIntArray277[1] || arg2.anIntArray277[2] <= Static254.anIntArray224[local17] || Static254.anIntArray224[local17] >= arg2.anIntArray277[3]) && (Static184.anIntArray185[local17] >= arg2.anIntArray278[0] || Static184.anIntArray185[local17] >= arg2.anIntArray278[1] || Static184.anIntArray185[local17] >= arg2.anIntArray278[2] || Static184.anIntArray185[local17] >= arg2.anIntArray278[3]) && (Static503.anIntArray446[local17] <= arg2.anIntArray278[0] || Static503.anIntArray446[local17] <= arg2.anIntArray278[1] || Static503.anIntArray446[local17] <= arg2.anIntArray278[2] || arg2.anIntArray278[3] >= Static503.anIntArray446[local17]) && (Static143.anIntArray129[local17] >= arg2.anIntArray279[0] || arg2.anIntArray279[1] <= Static143.anIntArray129[local17] || arg2.anIntArray279[2] <= Static143.anIntArray129[local17] || arg2.anIntArray279[3] <= Static143.anIntArray129[local17]) && (arg2.anIntArray279[0] >= Static618.anIntArray556[local17] || arg2.anIntArray279[1] >= Static618.anIntArray556[local17] || Static618.anIntArray556[local17] <= arg2.anIntArray279[2] || Static618.anIntArray556[local17] <= arg2.anIntArray279[3])) {
					return;
				}
			}
		}
		@Pc(291) int local291;
		@Pc(313) int local313;
		@Pc(329) boolean local329;
		@Pc(360) float local360;
		if (arg2.aByte70 == 1) {
			local17 = arg2.aShort54 + Static456.anInt8195 - Static427.anInt7834;
			if (local17 >= 0 && local17 <= Static456.anInt8195 + Static456.anInt8195) {
				local291 = arg2.aShort55 + Static456.anInt8195 - Static594.anInt10050;
				if (local291 < 0) {
					local291 = 0;
				} else if (Static456.anInt8195 + Static456.anInt8195 < local291) {
					return;
				}
				local313 = arg2.aShort57 + Static456.anInt8195 - Static594.anInt10050;
				if (local313 > Static456.anInt8195 + Static456.anInt8195) {
					local313 = Static456.anInt8195 + Static456.anInt8195;
				} else if (local313 < 0) {
					return;
				}
				local329 = false;
				while (local291 <= local313) {
					if (Static137.aBooleanArrayArray1[local17][local291++]) {
						local329 = true;
						break;
					}
				}
				if (local329) {
					local360 = (float) (Static244.anInt5341 - arg2.anIntArray278[0]);
					if (local360 < 0.0F) {
						local360 *= -1.0F;
					}
					if (!(float) Static629.anInt10541 > local360 && (Static259.method5839(0, arg2) && (Static259.method5839(1, arg2) && (Static259.method5839(2, arg2) && Static259.method5839(3, arg2))))) {
						Static383.aClass169Array3[Static116.anInt2989++] = arg2;
					}
				}
			}
		} else if (arg2.aByte70 == 2) {
			local17 = arg2.aShort55 + Static456.anInt8195 - Static594.anInt10050;
			if (local17 >= 0 && Static456.anInt8195 + Static456.anInt8195 >= local17) {
				local291 = arg2.aShort54 + Static456.anInt8195 - Static427.anInt7834;
				if (local291 < 0) {
					local291 = 0;
				} else if (local291 > Static456.anInt8195 + Static456.anInt8195) {
					return;
				}
				local313 = Static456.anInt8195 + arg2.aShort56 - Static427.anInt7834;
				if (local313 > Static456.anInt8195 + Static456.anInt8195) {
					local313 = Static456.anInt8195 + Static456.anInt8195;
				} else if (local313 < 0) {
					return;
				}
				local329 = false;
				while (local313 >= local291) {
					if (Static137.aBooleanArrayArray1[local291++][local17]) {
						local329 = true;
						break;
					}
				}
				if (local329) {
					local360 = (float) (Static599.anInt10170 - arg2.anIntArray279[0]);
					if (local360 < 0.0F) {
						local360 *= -1.0F;
					}
					if (!((float) Static629.anInt10541 > local360) && (Static259.method5839(0, arg2) && (Static259.method5839(1, arg2) && (Static259.method5839(2, arg2) && Static259.method5839(3, arg2))))) {
						Static383.aClass169Array3[Static116.anInt2989++] = arg2;
					}
				}
			}
		} else if (arg2.aByte70 == 16 || arg2.aByte70 == 8) {
			local17 = Static456.anInt8195 + arg2.aShort54 - Static427.anInt7834;
			if (local17 >= 0 && Static456.anInt8195 + Static456.anInt8195 >= local17) {
				local291 = arg2.aShort55 + Static456.anInt8195 - Static594.anInt10050;
				if (local291 >= 0 && local291 <= Static456.anInt8195 + Static456.anInt8195 && Static137.aBooleanArrayArray1[local17][local291]) {
					@Pc(636) float local636 = (float) (Static244.anInt5341 - arg2.anIntArray278[0]);
					if (local636 < 0.0F) {
						local636 *= -1.0F;
					}
					@Pc(653) float local653 = (float) (Static599.anInt10170 - arg2.anIntArray279[0]);
					if (local653 < 0.0F) {
						local653 *= -1.0F;
					}
					if ((!((float) Static629.anInt10541 > local636) || !((float) Static629.anInt10541 > local653)) && (Static259.method5839(0, arg2) && (Static259.method5839(1, arg2) && (Static259.method5839(2, arg2) && Static259.method5839(3, arg2))))) {
						Static383.aClass169Array3[Static116.anInt2989++] = arg2;
					}
				}
			}
		} else if (arg2.aByte70 == 4) {
			@Pc(720) float local720 = (float) (arg2.anIntArray277[0] - Static231.anInt5129);
			if (!(local720 <= (float) Static50.anInt1727)) {
				local291 = Static456.anInt8195 + arg2.aShort55 - Static594.anInt10050;
				if (local291 < 0) {
					local291 = 0;
				} else if (Static456.anInt8195 + Static456.anInt8195 < local291) {
					return;
				}
				local313 = arg2.aShort57 + Static456.anInt8195 - Static594.anInt10050;
				if (local313 > Static456.anInt8195 + Static456.anInt8195) {
					local313 = Static456.anInt8195 + Static456.anInt8195;
				} else if (local313 < 0) {
					return;
				}
				@Pc(780) int local780 = Static456.anInt8195 + arg2.aShort54 - Static427.anInt7834;
				if (local780 < 0) {
					local780 = 0;
				} else if (local780 > Static456.anInt8195 + Static456.anInt8195) {
					return;
				}
				@Pc(805) int local805 = Static456.anInt8195 + arg2.aShort56 - Static427.anInt7834;
				if (local805 > Static456.anInt8195 + Static456.anInt8195) {
					local805 = Static456.anInt8195 + Static456.anInt8195;
				} else if (local805 < 0) {
					return;
				}
				@Pc(825) boolean local825 = false;
				label283: for (@Pc(827) int local827 = local780; local827 <= local805; local827++) {
					for (@Pc(831) int local831 = local291; local831 <= local313; local831++) {
						if (Static137.aBooleanArrayArray1[local827][local831]) {
							local825 = true;
							break label283;
						}
					}
				}
				if (local825 && (Static259.method5839(0, arg2) && (Static259.method5839(1, arg2) && (Static259.method5839(2, arg2) && Static259.method5839(3, arg2))))) {
					Static383.aClass169Array3[Static116.anInt2989++] = arg2;
				}
			}
		}
	}
}

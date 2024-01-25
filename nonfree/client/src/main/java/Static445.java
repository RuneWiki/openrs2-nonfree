import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!pv", name = "s", descriptor = "I")
	public static int anInt7874;

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
	public static int anInt7863 = 16777215;

	@OriginalMember(owner = "client!pv", name = "n", descriptor = "Lclient!jw;")
	public static final Class184 aClass184_10 = new Class184(7, 2);

	@OriginalMember(owner = "client!pv", name = "v", descriptor = "Z")
	public static boolean aBoolean594 = true;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!af;BLclient!ha;I)V")
	public static void method6594(@OriginalArg(0) Class10 arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15;
		if (Static35.anIntArray102 != null && arg2 <= arg0.aByte2) {
			for (local15 = 0; local15 < Static35.anIntArray102.length; local15++) {
				if (Static35.anIntArray102[local15] != -1000000 && (Static35.anIntArray102[local15] >= arg0.anIntArray26[0] || Static35.anIntArray102[local15] >= arg0.anIntArray26[1] || arg0.anIntArray26[2] <= Static35.anIntArray102[local15] || Static35.anIntArray102[local15] >= arg0.anIntArray26[3]) && (Static285.anIntArray365[local15] >= arg0.anIntArray25[0] || arg0.anIntArray25[1] <= Static285.anIntArray365[local15] || arg0.anIntArray25[2] <= Static285.anIntArray365[local15] || arg0.anIntArray25[3] <= Static285.anIntArray365[local15]) && (Static7.anIntArray5[local15] <= arg0.anIntArray25[0] || arg0.anIntArray25[1] >= Static7.anIntArray5[local15] || Static7.anIntArray5[local15] <= arg0.anIntArray25[2] || arg0.anIntArray25[3] >= Static7.anIntArray5[local15]) && (Static363.anIntArray430[local15] >= arg0.anIntArray24[0] || arg0.anIntArray24[1] <= Static363.anIntArray430[local15] || Static363.anIntArray430[local15] >= arg0.anIntArray24[2] || arg0.anIntArray24[3] <= Static363.anIntArray430[local15]) && (Static326.anIntArray402[local15] <= arg0.anIntArray24[0] || arg0.anIntArray24[1] >= Static326.anIntArray402[local15] || arg0.anIntArray24[2] >= Static326.anIntArray402[local15] || Static326.anIntArray402[local15] <= arg0.anIntArray24[3])) {
					return;
				}
			}
		}
		@Pc(268) int local268;
		@Pc(295) int local295;
		@Pc(318) boolean local318;
		@Pc(348) float local348;
		if (arg0.aByte1 == 1) {
			local15 = Static319.anInt5795 + arg0.aShort1 - Static623.anInt9563;
			if (local15 >= 0 && Static319.anInt5795 + Static319.anInt5795 >= local15) {
				local268 = arg0.aShort3 + Static319.anInt5795 - Static507.anInt8547;
				if (local268 < 0) {
					local268 = 0;
				} else if (local268 > Static319.anInt5795 + Static319.anInt5795) {
					return;
				}
				local295 = Static319.anInt5795 + arg0.aShort4 - Static507.anInt8547;
				if (local295 > Static319.anInt5795 + Static319.anInt5795) {
					local295 = Static319.anInt5795 + Static319.anInt5795;
				} else if (local295 < 0) {
					return;
				}
				local318 = false;
				while (local295 >= local268) {
					if (Static36.aBooleanArrayArray2[local15][local268++]) {
						local318 = true;
						break;
					}
				}
				if (local318) {
					local348 = Static60.anInt1260 - arg0.anIntArray25[0];
					if (local348 < 0.0F) {
						local348 *= -1.0F;
					}
					if (!(float) Static167.anInt3711 > local348 && (Static526.method7338(arg0, 0) && (Static526.method7338(arg0, 1) && (Static526.method7338(arg0, 2) && Static526.method7338(arg0, 3))))) {
						Static76.aClass10Array1[Static612.anInt9984++] = arg0;
					}
				}
			}
		} else if (arg0.aByte1 == 2) {
			local15 = Static319.anInt5795 + arg0.aShort3 - Static507.anInt8547;
			if (local15 >= 0 && local15 <= Static319.anInt5795 + Static319.anInt5795) {
				local268 = Static319.anInt5795 + arg0.aShort1 - Static623.anInt9563;
				if (local268 < 0) {
					local268 = 0;
				} else if (local268 > Static319.anInt5795 + Static319.anInt5795) {
					return;
				}
				local295 = arg0.aShort2 + Static319.anInt5795 - Static623.anInt9563;
				if (Static319.anInt5795 + Static319.anInt5795 < local295) {
					local295 = Static319.anInt5795 + Static319.anInt5795;
				} else if (local295 < 0) {
					return;
				}
				local318 = false;
				while (local268 <= local295) {
					if (Static36.aBooleanArrayArray2[local268++][local15]) {
						local318 = true;
						break;
					}
				}
				if (local318) {
					local348 = Static558.anInt9264 - arg0.anIntArray24[0];
					if (local348 < 0.0F) {
						local348 *= -1.0F;
					}
					if (!((float) Static167.anInt3711 > local348) && (Static526.method7338(arg0, 0) && (Static526.method7338(arg0, 1) && (Static526.method7338(arg0, 2) && Static526.method7338(arg0, 3))))) {
						Static76.aClass10Array1[Static612.anInt9984++] = arg0;
					}
				}
			}
		} else if (arg0.aByte1 == 16 || arg0.aByte1 == 8) {
			local15 = Static319.anInt5795 + arg0.aShort1 - Static623.anInt9563;
			if (local15 >= 0 && local15 <= Static319.anInt5795 + Static319.anInt5795) {
				local268 = arg0.aShort3 + Static319.anInt5795 - Static507.anInt8547;
				if (local268 >= 0 && Static319.anInt5795 + Static319.anInt5795 >= local268 && Static36.aBooleanArrayArray2[local15][local268]) {
					@Pc(601) float local601 = (float) (Static60.anInt1260 - arg0.anIntArray25[0]);
					if (local601 < 0.0F) {
						local601 *= -1.0F;
					}
					@Pc(618) float local618 = (float) (Static558.anInt9264 - arg0.anIntArray24[0]);
					if (local618 < 0.0F) {
						local618 *= -1.0F;
					}
					if ((!(local601 < (float) Static167.anInt3711) || !(local618 < (float) Static167.anInt3711)) && (Static526.method7338(arg0, 0) && (Static526.method7338(arg0, 1) && (Static526.method7338(arg0, 2) && Static526.method7338(arg0, 3))))) {
						Static76.aClass10Array1[Static612.anInt9984++] = arg0;
					}
				}
			}
		} else if (arg0.aByte1 == 4) {
			@Pc(685) float local685 = (float) (arg0.anIntArray26[0] - Static532.anInt8897);
			if (!(local685 <= (float) Static223.anInt4589)) {
				local268 = arg0.aShort3 + Static319.anInt5795 - Static507.anInt8547;
				if (local268 < 0) {
					local268 = 0;
				} else if (Static319.anInt5795 + Static319.anInt5795 < local268) {
					return;
				}
				local295 = arg0.aShort4 + Static319.anInt5795 - Static507.anInt8547;
				if (Static319.anInt5795 + Static319.anInt5795 < local295) {
					local295 = Static319.anInt5795 + Static319.anInt5795;
				} else if (local295 < 0) {
					return;
				}
				@Pc(744) int local744 = arg0.aShort1 + Static319.anInt5795 - Static623.anInt9563;
				if (local744 < 0) {
					local744 = 0;
				} else if (local744 > Static319.anInt5795 + Static319.anInt5795) {
					return;
				}
				@Pc(767) int local767 = arg0.aShort2 + Static319.anInt5795 - Static623.anInt9563;
				if (local767 > Static319.anInt5795 + Static319.anInt5795) {
					local767 = Static319.anInt5795 + Static319.anInt5795;
				} else if (local767 < 0) {
					return;
				}
				@Pc(785) boolean local785 = false;
				label283: for (@Pc(787) int local787 = local744; local787 <= local767; local787++) {
					for (@Pc(790) int local790 = local268; local790 <= local295; local790++) {
						if (Static36.aBooleanArrayArray2[local787][local790]) {
							local785 = true;
							break label283;
						}
					}
				}
				if (local785 && (Static526.method7338(arg0, 0) && (Static526.method7338(arg0, 1) && (Static526.method7338(arg0, 2) && Static526.method7338(arg0, 3))))) {
					Static76.aClass10Array1[Static612.anInt9984++] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I[FI)[F")
	public static float[] method6603(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static649.method4861(arg1, 0, local6, 0, arg0);
		return local6;
	}
}

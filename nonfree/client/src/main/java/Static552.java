import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_228 = new Class160(28, 0);

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_223 = new Class251(36, 2);

	@OriginalMember(owner = "client!se", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray22 = new boolean[5];

	@OriginalMember(owner = "client!se", name = "a", descriptor = "()V")
	public static void method7979() {
		if (Static164.anInt2535 == 0 || Static613.aClass68_11 == null) {
			return;
		}
		Static554.aClass144_12.K(Static569.anIntArray492);
		for (@Pc(14) int local14 = 0; local14 < Static634.anIntArray557.length; local14++) {
			Static554.aClass144_12.method6925(-256, Static569.anIntArray492[1], Static569.anIntArray492[3] - Static569.anIntArray492[1], Static634.anIntArray557[local14] + Static510.anIntArray460[local14]);
		}
		for (@Pc(43) int local43 = 0; local43 < Static475.anInt8190; local43++) {
			@Pc(48) Class393 local48 = Static682.aClass393Array4[local43];
			Static554.aClass144_12.H(local48.anIntArray593[0], local48.anIntArray592[0], local48.anIntArray591[0], Static151.anIntArray146);
			Static554.aClass144_12.H(local48.anIntArray593[1], local48.anIntArray592[1], local48.anIntArray591[1], Static58.anIntArray62);
			Static554.aClass144_12.H(local48.anIntArray593[2], local48.anIntArray592[2], local48.anIntArray591[2], Static315.anIntArray310);
			Static554.aClass144_12.H(local48.anIntArray593[3], local48.anIntArray592[3], local48.anIntArray591[3], Static504.anIntArray459);
			if (Static151.anIntArray146[2] != -1 && Static58.anIntArray62[2] != -1 && Static315.anIntArray310[2] != -1 && Static504.anIntArray459[2] != -1) {
				@Pc(136) int local136 = -65536;
				if (local48.aByte145 == 4) {
					local136 = -16776961;
				}
				Static554.aClass144_12.method6939(Static151.anIntArray146[1], Static151.anIntArray146[0], local136, Static58.anIntArray62[0], Static58.anIntArray62[1]);
				Static554.aClass144_12.method6939(Static58.anIntArray62[1], Static58.anIntArray62[0], local136, Static315.anIntArray310[0], Static315.anIntArray310[1]);
				Static554.aClass144_12.method6939(Static315.anIntArray310[1], Static315.anIntArray310[0], local136, Static504.anIntArray459[0], Static504.anIntArray459[1]);
				Static554.aClass144_12.method6939(Static504.anIntArray459[1], Static504.anIntArray459[0], local136, Static151.anIntArray146[0], Static151.anIntArray146[1]);
				Static554.aClass144_12.method6939(Static151.anIntArray146[1], Static151.anIntArray146[0], local136, Static315.anIntArray310[0], Static315.anIntArray310[1]);
			}
		}
		Static613.aClass68_11.method9422("Dynamic: " + Static380.anInt6702 + "/" + 5000, 75, -16777216, 10, -256);
		Static613.aClass68_11.method9422("Total Opaque Onscreen: " + Static383.anInt6725 + "/" + 10000, 90, -16777216, 10, -256);
		Static613.aClass68_11.method9422("Total Trans Onscreen: " + Static521.anInt8910 + "/" + 5000, 105, -16777216, 10, -256);
		Static613.aClass68_11.method9422("Occluders: " + (Static207.anInt3630 + Static264.anInt4916) + " Active: " + Static475.anInt8190, 120, -16777216, 10, -256);
		Static613.aClass68_11.method9422("Occluded: Ground:" + Static108.anInt1853 + " Walls: " + Static235.anInt4560 + " CPs: " + Static264.anInt4913 + " Pixels: " + Static241.anInt4621, 135, -16777216, 10, -256);
		Static613.aClass68_11.method9422("Occlude Calc Took: " + Static605.aLong194 / 1000L + "us", 150, -16777216, 10, -256);
		if (Static164.anInt2535 != 2 || Static572.anIntArray493 == null) {
			return;
		}
		for (@Pc(389) int local389 = 0; local389 < Static572.anIntArray493.length; local389++) {
			@Pc(395) float local395 = (float) Static572.anIntArray493[local389];
			local395 /= 4194304.0F;
			if (local395 > 1.0F) {
				local395 = 1.0F;
			}
			local395 *= 255.0F;
			local395 = 255.0F - local395;
			@Pc(416) int local416 = (int) local395;
			Static572.anIntArray493[local389] = local416 | local416 << 8 | local416 << 16 | 0xFF000000;
		}
		@Pc(444) Class45 local444 = Static554.aClass144_12.method6941(Static550.anInt9243, Static55.anInt955, Static572.anIntArray493, Static55.anInt955);
		local444.method7491(10, 170, 1, 0, 0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method7981(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg4 < 512 || arg1 < 512 || Static380.anInt6689 * 512 - 1024 < arg4 || Static542.anInt9214 * 512 - 1024 < arg1) {
			Static172.anIntArray151[0] = Static172.anIntArray151[1] = -1;
			return;
		}
		@Pc(54) int local54 = Static388.method5919(arg1, arg4, arg5) - arg2;
		if (Static656.aBoolean741) {
			Static222.method3816(true);
		} else {
			Static281.aClass263_4.method8442(arg3, 0, 0);
			Static103.aClass144_3.method6896(Static281.aClass263_4);
		}
		if (Static6.aBoolean9) {
			Static103.aClass144_3.HA(arg4, local54, arg1, Static481.anInt10749, Static172.anIntArray151);
		} else {
			Static103.aClass144_3.da(arg4, local54, arg1, Static172.anIntArray151);
		}
		if (Static656.aBoolean741) {
			Static561.method8082();
		} else {
			Static281.aClass263_4.method8442(-arg3, 0, 0);
			Static103.aClass144_3.method6896(Static281.aClass263_4);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)I")
	public static int method7983(@OriginalArg(1) boolean arg0) {
		@Pc(12) int local12 = Static18.anInt243;
		if (local12 == 0) {
			return arg0 ? 0 : Static35.anInt549;
		} else if (local12 == 1) {
			return Static35.anInt549;
		} else if (local12 == 2) {
			return 0;
		} else {
			return 0;
		}
	}
}

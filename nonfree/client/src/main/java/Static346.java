import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Lclient!dj;")
	public static final Class43 aClass43_37 = new Class43(8);

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray84 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_359 = new Class159("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
	public static int anInt6569 = 0;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z[[BI[[BI[[I[[BILclient!uh;ILclient!vq;Lclient!uh;[[B)V")
	public static void method5514(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class60 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class47 arg9, @OriginalArg(11) Class60 arg10, @OriginalArg(12) byte[][] arg11) {
		for (@Pc(3) int local3 = 0; local3 < arg8; local3++) {
			for (@Pc(12) int local12 = 0; local12 < arg6; local12++) {
				if (Static76.method1750() || Static210.method3895(arg2, local12, local3, Static263.anInt6816)) {
					@Pc(32) byte local32 = arg5[local3][local12];
					@Pc(38) byte local38 = arg11[local3][local12];
					@Pc(46) int local46 = arg1[local3][local12] & 0xFF;
					@Pc(54) int local54 = arg3[local3][local12] & 0xFF;
					@Pc(64) Class121 local64 = local46 == 0 ? null : Static293.method3948(local46 - 1);
					@Pc(77) Class156 local77 = local54 == 0 ? null : Static183.method3514(local54 - 1);
					@Pc(79) int local79 = 0;
					@Pc(81) int local81 = 0;
					if (local32 != 0) {
						local79 = local77 == null ? 0 : Static253.anIntArray422[local32];
						local81 = local64 == null ? 0 : Static189.anIntArray336[local32];
					} else if (local64 != null) {
						local81 = Static189.anIntArray336[local32];
					} else if (local77 != null) {
						local79 = Static189.anIntArray336[local32];
					}
					@Pc(122) int local122 = local79 + local81;
					@Pc(124) int local124 = 0;
					if (local122 != 0) {
						@Pc(129) int[] local129 = new int[local122];
						@Pc(132) int[] local132 = new int[local122];
						@Pc(135) int[] local135 = new int[local122];
						@Pc(138) int[] local138 = new int[local122];
						@Pc(140) boolean local140 = false;
						@Pc(157) int local157;
						@Pc(189) int local189;
						if (local64 == null || local64.anInt3843 == -1 && local64.anInt3840 == -1 && local64.anInt3837 == -1) {
							for (local157 = 0; local157 < local81; local157++) {
								local129[local124] = -1;
								local124++;
							}
						} else {
							local157 = arg9.method2712() ? local64.anInt3837 : local64.anInt3842;
							if (!Static51.aBoolean102) {
								local157 = -1;
							}
							for (local189 = 0; local189 < local81; local189++) {
								local135[local124] = local157;
								local138[local124] = local64.anInt3846;
								if (local64.anInt3843 == -1) {
									local129[local124] = -1;
								} else {
									local129[local124] = local64.anInt3843;
								}
								if (local64.anInt3840 == -1) {
									local132[local124] = -1;
								} else {
									local132[local124] = local64.anInt3840;
									local140 = true;
								}
								local124++;
							}
							if (!arg0 && arg2 == 0) {
								Static34.method710(local3, local12, local64.anInt3836, local64.anInt3838 * 8);
							}
						}
						if (!local140) {
							local132 = null;
						}
						if (local77 == null) {
							for (local157 = 0; local157 < local79; local157++) {
								local129[local124] = -1;
								local124++;
							}
						} else {
							local157 = local77.anInt4824;
							if (!Static51.aBoolean102) {
								local157 = -1;
							}
							for (local189 = 0; local189 < local79; local189++) {
								local135[local124] = local157;
								local138[local124] = local77.anInt4818;
								local129[local124] = arg4[local3][local12];
								if (local132 != null) {
									local132[local124] = -1;
								}
								local124++;
							}
						}
						local157 = Static38.anIntArray46.length;
						@Pc(328) int[] local328 = arg0 ? new int[local157] : null;
						@Pc(331) int[] local331 = new int[local157];
						@Pc(334) int[] local334 = new int[local157];
						@Pc(342) int local342;
						@Pc(346) int local346;
						@Pc(434) int local434;
						@Pc(442) int local442;
						for (@Pc(336) int local336 = 0; local336 < local157; local336++) {
							local342 = Static38.anIntArray46[local336];
							local346 = Static120.anIntArray247[local336];
							if (local38 == 0) {
								local331[local336] = local342;
								local334[local336] = local346;
							} else if (local38 == 1) {
								local331[local336] = local346;
								local334[local336] = 128 - local342;
							} else if (local38 == 2) {
								local331[local336] = 128 - local342;
								local334[local336] = 128 - local346;
							} else if (local38 == 3) {
								local331[local336] = 128 - local346;
								local334[local336] = local342;
							}
							if (arg0 && Static204.aBooleanArrayArray5[local32][local336]) {
								local434 = (local3 << 7) + local331[local336];
								local442 = (local12 << 7) + local334[local336];
								local328[local336] = arg7.method2270(local434, local442) - arg10.method2270(local434, local442);
							}
						}
						local342 = arg10.method2264(local3, local12);
						local346 = arg10.method2264(local3 + 1, local12);
						local434 = arg10.method2264(local3 + 1, local12 + 1);
						local442 = arg10.method2264(local3, local12 + 1);
						if (arg2 > 0) {
							@Pc(494) boolean local494 = true;
							if (local54 == 0 && local32 != 0) {
								local494 = false;
							}
							if (local46 > 0 && local64 != null && !local64.aBoolean301) {
								local494 = false;
							}
							if (local494 && local346 == local342 && local342 == local434 && local442 == local342) {
								Static72.aByteArrayArrayArray5[arg2][local3][local12] = (byte) (Static72.aByteArrayArrayArray5[arg2][local3][local12] | 0x4);
							}
						}
						@Pc(550) int local550 = 0;
						@Pc(552) int local552 = 0;
						if (arg0) {
							local550 = Static219.method3979(local3, local12);
							local552 = Static33.method563(local3, local12);
						}
						arg10.method2261(local3, local12, local331, local328, local334, Static220.anIntArrayArray181[local32], Static304.anIntArrayArray162[local32], Static224.anIntArrayArray125[local32], local129, local132, local135, local138, local550, local552);
						Static269.method4620(arg2, local3, local12);
					}
				}
			}
		}
	}
}

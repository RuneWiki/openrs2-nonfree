import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
	public static int anInt3956;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "Z")
	public static boolean aBoolean350 = false;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BLclient!si;I)I")
	public static int method3425(@OriginalArg(1) Class157 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray37 == null || arg1 >= arg0.anIntArrayArray37.length) {
			return -2;
		}
		try {
			@Pc(23) int local23 = 0;
			@Pc(28) int[] local28 = arg0.anIntArrayArray37[arg1];
			@Pc(30) int local30 = 0;
			@Pc(32) byte local32 = 0;
			while (true) {
				@Pc(34) int local34 = 0;
				@Pc(39) int local39 = local28[local30++];
				@Pc(41) byte local41 = 0;
				if (local39 == 0) {
					return local23;
				}
				if (local39 == 1) {
					local34 = Static117.anIntArray170[local28[local30++]];
				}
				if (local39 == 15) {
					local41 = 1;
				}
				if (local39 == 16) {
					local41 = 2;
				}
				if (local39 == 17) {
					local41 = 3;
				}
				if (local39 == 2) {
					local34 = Static141.anIntArray242[local28[local30++]];
				}
				if (local39 == 3) {
					local34 = Static301.anIntArray594[local28[local30++]];
				}
				@Pc(109) int local109;
				@Pc(120) Class157 local120;
				@Pc(125) int local125;
				@Pc(137) int local137;
				if (local39 == 4) {
					local109 = local28[local30++] << 16;
					@Pc(116) int local116 = local109 + local28[local30++];
					local120 = Static206.method3444(local116);
					local125 = local28[local30++];
					if (local125 != -1 && (!Static69.method1330(local125).aBoolean14 || Static217.aBoolean369)) {
						for (local137 = 0; local137 < local120.anIntArray538.length; local137++) {
							if (local120.anIntArray538[local137] == local125 + 1) {
								local34 += local120.anIntArray537[local137];
							}
						}
					}
				}
				if (local39 == 5) {
					local34 = Static99.anIntArray148[local28[local30++]];
				}
				if (local39 == 6) {
					local34 = Class1_Sub1_Sub27.anIntArray489[Static141.anIntArray242[local28[local30++]] - 1];
				}
				if (local39 == 7) {
					local34 = Static99.anIntArray148[local28[local30++]] * 100 / 46875;
				}
				if (local39 == 8) {
					local34 = Static138.aClass11_Sub4_Sub1_3.anInt3015;
				}
				if (local39 == 9) {
					for (local109 = 0; local109 < 25; local109++) {
						if (Static201.aBooleanArray17[local109]) {
							local34 += Static141.anIntArray242[local109];
						}
					}
				}
				if (local39 == 10) {
					local109 = local28[local30++] << 16;
					local109 += local28[local30++];
					local120 = Static206.method3444(local109);
					local125 = local28[local30++];
					if (local125 != -1 && (!Static69.method1330(local125).aBoolean14 || Static217.aBoolean369)) {
						for (local137 = 0; local137 < local120.anIntArray538.length; local137++) {
							if (local120.anIntArray538[local137] == local125 + 1) {
								local34 = 999999999;
								break;
							}
						}
					}
				}
				if (local39 == 11) {
					local34 = Static39.anInt742;
				}
				if (local39 == 12) {
					local34 = Static189.anInt3635;
				}
				if (local39 == 13) {
					local109 = Static99.anIntArray148[local28[local30++]];
					@Pc(333) int local333 = local28[local30++];
					local34 = (local109 & 0x1 << local333) == 0 ? 0 : 1;
				}
				if (local39 == 14) {
					local109 = local28[local30++];
					local34 = Static11.method173(local109);
				}
				if (local39 == 18) {
					local34 = (Static138.aClass11_Sub4_Sub1_3.anInt3865 >> 7) + Static38.anInt714;
				}
				if (local39 == 19) {
					local34 = (Static138.aClass11_Sub4_Sub1_3.anInt3856 >> 7) + Static135.anInt2659;
				}
				if (local39 == 20) {
					local34 = local28[local30++];
				}
				if (local41 == 0) {
					if (local32 == 0) {
						local23 += local34;
					}
					if (local32 == 1) {
						local23 -= local34;
					}
					if (local32 == 2 && local34 != 0) {
						local23 /= local34;
					}
					if (local32 == 3) {
						local23 *= local34;
					}
					local32 = 0;
				} else {
					local32 = local41;
				}
			}
		} catch (@Pc(439) Exception local439) {
			return -1;
		}
	}
}

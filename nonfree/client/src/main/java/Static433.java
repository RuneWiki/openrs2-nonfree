import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
	public static int anInt7201 = 0;

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "Z")
	public static boolean aBoolean484 = false;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
	public static void method5556() {
		for (@Pc(7) int local7 = 0; local7 < Static110.anInt2332; local7++) {
			@Pc(13) int local13 = Static239.anIntArray357[local7];
			@Pc(17) Class6_Sub2_Sub1_Sub2 local17 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local13];
			@Pc(21) int local21 = Static349.aClass4_Sub30_Sub1_2.method4864();
			if ((local21 & 0x4) != 0) {
				local21 += Static349.aClass4_Sub30_Sub1_2.method4864() << 8;
			}
			if ((local21 & 0x800) != 0) {
				local17.aByte87 = Static349.aClass4_Sub30_Sub1_2.method4879();
				local17.aByte89 = Static349.aClass4_Sub30_Sub1_2.method4866();
				local17.aByte90 = Static349.aClass4_Sub30_Sub1_2.method4879();
				local17.aByte88 = (byte) Static349.aClass4_Sub30_Sub1_2.method4864();
				local17.anInt6075 = Static175.anInt3261 + Static349.aClass4_Sub30_Sub1_2.method4877();
				local17.anInt6114 = Static175.anInt3261 + Static349.aClass4_Sub30_Sub1_2.method4856();
			}
			if ((local21 & 0x10) != 0) {
				if (local17.aClass243_1.method5341()) {
					Static240.method3311(local17);
				}
				local17.method4770(Static388.aClass211_1.method4931(Static349.aClass4_Sub30_Sub1_2.method4877()));
				local17.method4761(local17.aClass243_1.anInt6902);
				local17.anInt6071 = local17.aClass243_1.anInt6913 << 3;
				if (local17.aClass243_1.method5341()) {
					Static242.method4046(local17, local17.anIntArray536[0], local17.anIntArray537[0], null, 0, null, local17.aByte86);
				}
			}
			@Pc(149) int local149;
			@Pc(153) int local153;
			if ((local21 & 0x20) != 0) {
				local149 = Static349.aClass4_Sub30_Sub1_2.method4844();
				local153 = Static349.aClass4_Sub30_Sub1_2.method4882();
				local17.method4764(local149, local153, Static175.anInt3261);
				local17.anInt6119 = Static175.anInt3261 + 300;
				local17.anInt6090 = Static349.aClass4_Sub30_Sub1_2.method4864();
			}
			if ((local21 & 0x2000) != 0) {
				local17.anInt6150 = Static349.aClass4_Sub30_Sub1_2.method4852();
				local17.anInt6155 = Static349.aClass4_Sub30_Sub1_2.method4880();
			}
			if ((local21 & 0x1000) != 0) {
				local17.anInt6130 = Static349.aClass4_Sub30_Sub1_2.method4866();
				local17.anInt6143 = Static349.aClass4_Sub30_Sub1_2.method4876();
				local17.anInt6086 = Static349.aClass4_Sub30_Sub1_2.method4866();
				local17.anInt6092 = Static349.aClass4_Sub30_Sub1_2.method4865();
				local17.anInt6105 = Static349.aClass4_Sub30_Sub1_2.method4856() + Static175.anInt3261;
				local17.anInt6087 = Static349.aClass4_Sub30_Sub1_2.method4880() + Static175.anInt3261;
				local17.anInt6115 = Static349.aClass4_Sub30_Sub1_2.method4854();
				local17.anInt6145 = 0;
				local17.anInt6143 += local17.anIntArray537[0];
				local17.anInt6130 += local17.anIntArray536[0];
				local17.anInt6086 += local17.anIntArray536[0];
				local17.anInt6147 = 1;
				local17.anInt6092 += local17.anIntArray537[0];
			}
			if ((local21 & 0x40) != 0) {
				local17.aString56 = Static349.aClass4_Sub30_Sub1_2.method4867();
				local17.anInt6133 = 100;
			}
			@Pc(313) int local313;
			if ((local21 & 0x80) != 0) {
				local149 = Static349.aClass4_Sub30_Sub1_2.method4856();
				local153 = Static349.aClass4_Sub30_Sub1_2.method4886();
				if (local149 == 65535) {
					local149 = -1;
				}
				local313 = Static349.aClass4_Sub30_Sub1_2.method4854();
				local17.method4756(local153, local313, local149, false);
			}
			if ((local21 & 0x2) != 0) {
				local149 = Static349.aClass4_Sub30_Sub1_2.method4844();
				local153 = Static349.aClass4_Sub30_Sub1_2.method4864();
				local17.method4764(local149, local153, Static175.anInt3261);
			}
			if ((local21 & 0x1) != 0) {
				local149 = Static349.aClass4_Sub30_Sub1_2.method4856();
				if (local149 == 65535) {
					local149 = -1;
				}
				local153 = Static349.aClass4_Sub30_Sub1_2.method4829();
				Static277.method3729(local153, local17, local149);
			}
			if ((local21 & 0x200) != 0) {
				local149 = Static349.aClass4_Sub30_Sub1_2.method4880();
				if (local149 == 65535) {
					local149 = -1;
				}
				local153 = Static349.aClass4_Sub30_Sub1_2.method4837();
				local313 = Static349.aClass4_Sub30_Sub1_2.method4882();
				local17.method4756(local153, local313, local149, true);
			}
			if ((local21 & 0x400) != 0) {
				local149 = Static349.aClass4_Sub30_Sub1_2.method4880();
				local17.anInt6093 = Static349.aClass4_Sub30_Sub1_2.method4882();
				local17.anInt6138 = Static349.aClass4_Sub30_Sub1_2.method4882();
				local17.anInt6096 = local149 & 0x7FFF;
				local17.aBoolean420 = (local149 & 0x8000) != 0;
				local17.anInt6104 = local17.anInt6096 + Static175.anInt3261 + local17.anInt6093;
			}
			if ((local21 & 0x100) != 0) {
				local149 = Static349.aClass4_Sub30_Sub1_2.method4864();
				@Pc(458) int[] local458 = new int[local149];
				@Pc(461) int[] local461 = new int[local149];
				@Pc(464) int[] local464 = new int[local149];
				for (@Pc(466) int local466 = 0; local466 < local149; local466++) {
					@Pc(474) int local474 = Static349.aClass4_Sub30_Sub1_2.method4856();
					if (local474 == 65535) {
						local474 = -1;
					}
					local458[local466] = local474;
					local461[local466] = Static349.aClass4_Sub30_Sub1_2.method4829();
					local464[local466] = Static349.aClass4_Sub30_Sub1_2.method4856();
				}
				Static197.method5036(local461, local464, local17, local458);
			}
			if ((local21 & 0x8) != 0) {
				local17.anInt6081 = Static349.aClass4_Sub30_Sub1_2.method4856();
				if (local17.anInt6081 == 65535) {
					local17.anInt6081 = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
	public static void method5557() {
		if (Static159.anInt3000 != 3) {
			Static83.anInt1889 = -1;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IBI)Z")
	public static boolean method5558(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
	public static void method5559() {
		Static414.aClass196_39.method4471();
		Static233.aClass196_21.method4471();
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIIII)V")
	public static void method5560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(19) int local19 = Static360.method5003(Static387.anInt6727, Static388.anInt6740, arg4);
		@Pc(25) int local25 = Static360.method5003(Static387.anInt6727, Static388.anInt6740, arg2);
		@Pc(31) int local31 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg1);
		@Pc(37) int local37 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg3);
		for (@Pc(39) int local39 = local19; local39 <= local25; local39++) {
			Static335.method4533(local37, arg0, local31, Static162.anIntArrayArray58[local39]);
		}
	}
}

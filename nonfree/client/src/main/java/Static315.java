import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
	public static int anInt5183;

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "Lclient!bg;")
	public static final Class24 aClass24_9 = new Class24();

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_83 = new Class2(25, -1);

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "[I")
	public static int[] anIntArray465 = new int[2];

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIILclient!oa;Lclient!oa;)V")
	public static void method4095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class26_Sub1 arg3, @OriginalArg(4) Class26_Sub1 arg4) {
		@Pc(4) Class223 local4 = Static165.method2394(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass26_Sub1_2 = arg3;
			local4.aClass26_Sub1_1 = arg4;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V")
	public static void method4096() {
		for (@Pc(7) int local7 = 0; local7 < Static42.anInt690; local7++) {
			@Pc(13) int local13 = Static209.anIntArray328[local7];
			@Pc(17) Class26_Sub2_Sub4_Sub1 local17 = Static171.aClass26_Sub2_Sub4_Sub1Array1[local13];
			@Pc(21) int local21 = Static210.aClass7_Sub14_Sub1_4.method3981();
			if ((local21 & 0x2) != 0) {
				local21 += Static210.aClass7_Sub14_Sub1_4.method3981() << 8;
			}
			if ((local21 & 0x20) != 0) {
				local17.anInt7060 = Static210.aClass7_Sub14_Sub1_4.method3990();
				if (local17.anInt7060 == 65535) {
					local17.anInt7060 = -1;
				}
			}
			@Pc(63) int local63;
			if ((local21 & 0x100) != 0) {
				local63 = Static210.aClass7_Sub14_Sub1_4.method3946();
				local17.anInt7106 = Static210.aClass7_Sub14_Sub1_4.method3981();
				local17.anInt7092 = Static210.aClass7_Sub14_Sub1_4.method3981();
				local17.anInt7064 = local63 & 0x7FFF;
				local17.aBoolean478 = (local63 & 0x8000) != 0;
				local17.anInt7054 = local17.anInt7064 + Static274.anInt4617 + local17.anInt7106;
			}
			@Pc(111) int local111;
			if ((local21 & 0x8) != 0) {
				local63 = Static210.aClass7_Sub14_Sub1_4.method3940();
				local111 = Static210.aClass7_Sub14_Sub1_4.method3931();
				local17.method5511(Static274.anInt4617, local111, local63);
				local17.anInt7079 = Static274.anInt4617 + 300;
				local17.anInt7051 = Static210.aClass7_Sub14_Sub1_4.method3972();
			}
			@Pc(153) int local153;
			if ((local21 & 0x800) != 0) {
				local63 = Static210.aClass7_Sub14_Sub1_4.method3946();
				if (local63 == 65535) {
					local63 = -1;
				}
				local111 = Static210.aClass7_Sub14_Sub1_4.method3937();
				local153 = Static210.aClass7_Sub14_Sub1_4.method3981();
				local17.method5518(local63, local153, true, local111);
			}
			if ((local21 & 0x2000) != 0) {
				local17.anInt6079 = Static210.aClass7_Sub14_Sub1_4.method3935();
				local17.anInt6081 = Static210.aClass7_Sub14_Sub1_4.method3990();
			}
			if ((local21 & 0x1000) != 0) {
				local63 = Static210.aClass7_Sub14_Sub1_4.method3981();
				@Pc(191) int[] local191 = new int[local63];
				@Pc(194) int[] local194 = new int[local63];
				@Pc(197) int[] local197 = new int[local63];
				for (@Pc(199) int local199 = 0; local199 < local63; local199++) {
					@Pc(205) int local205 = Static210.aClass7_Sub14_Sub1_4.method3935();
					if (local205 == 65535) {
						local205 = -1;
					}
					local191[local199] = local205;
					local194[local199] = Static210.aClass7_Sub14_Sub1_4.method3968();
					local197[local199] = Static210.aClass7_Sub14_Sub1_4.method3935();
				}
				Static114.method1940(local197, local191, local17, local194);
			}
			if ((local21 & 0x400) != 0) {
				local17.anInt7105 = Static210.aClass7_Sub14_Sub1_4.method3945();
				local17.anInt7048 = Static210.aClass7_Sub14_Sub1_4.method3945();
				local17.anInt7059 = Static210.aClass7_Sub14_Sub1_4.method3930();
				local17.anInt7088 = Static210.aClass7_Sub14_Sub1_4.method3945();
				local17.anInt7112 = Static210.aClass7_Sub14_Sub1_4.method3943() + Static274.anInt4617;
				local17.anInt7110 = Static210.aClass7_Sub14_Sub1_4.method3990() + Static274.anInt4617;
				local17.anInt7093 = Static210.aClass7_Sub14_Sub1_4.method3972();
				local17.anInt7048 += local17.anIntArray604[0];
				local17.anInt7088 += local17.anIntArray604[0];
				local17.anInt7105 += local17.anIntArray603[0];
				local17.anInt7116 = 0;
				local17.anInt7059 += local17.anIntArray603[0];
				local17.anInt7117 = 1;
			}
			if ((local21 & 0x200) != 0) {
				local17.aByte93 = Static210.aClass7_Sub14_Sub1_4.method3949();
				local17.aByte96 = Static210.aClass7_Sub14_Sub1_4.method3930();
				local17.aByte95 = Static210.aClass7_Sub14_Sub1_4.method3930();
				local17.aByte94 = (byte) Static210.aClass7_Sub14_Sub1_4.method3968();
				local17.anInt7049 = Static274.anInt4617 + Static210.aClass7_Sub14_Sub1_4.method3990();
				local17.anInt7053 = Static274.anInt4617 + Static210.aClass7_Sub14_Sub1_4.method3990();
			}
			if ((local21 & 0x10) != 0) {
				local17.aString68 = Static210.aClass7_Sub14_Sub1_4.method3986();
				local17.anInt7075 = 100;
			}
			if ((local21 & 0x80) != 0) {
				local63 = Static210.aClass7_Sub14_Sub1_4.method3990();
				if (local63 == 65535) {
					local63 = -1;
				}
				local111 = Static210.aClass7_Sub14_Sub1_4.method3972();
				Static426.method5485(local111, local17, local63);
			}
			if ((local21 & 0x1) != 0) {
				local63 = Static210.aClass7_Sub14_Sub1_4.method3940();
				local111 = Static210.aClass7_Sub14_Sub1_4.method3981();
				local17.method5511(Static274.anInt4617, local111, local63);
			}
			if ((local21 & 0x4) != 0) {
				if (local17.aClass249_1.method5178()) {
					Static322.method4276(local17);
				}
				local17.method4827(Static442.aClass98_1.method2241(Static210.aClass7_Sub14_Sub1_4.method3946()));
				local17.method5519(local17.aClass249_1.anInt6507);
				local17.anInt7044 = local17.aClass249_1.anInt6543 << 3;
				if (local17.aClass249_1.method5178()) {
					Static130.method2096(0, null, local17, null, local17.aByte102, local17.anIntArray603[0], local17.anIntArray604[0]);
				}
			}
			if ((local21 & 0x40) != 0) {
				local63 = Static210.aClass7_Sub14_Sub1_4.method3935();
				local111 = Static210.aClass7_Sub14_Sub1_4.method3937();
				if (local63 == 65535) {
					local63 = -1;
				}
				local153 = Static210.aClass7_Sub14_Sub1_4.method3972();
				local17.method5518(local63, local153, false, local111);
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIBIIII)V")
	public static void method4098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static278.method3708(arg1, Static82.anInt1667, Static316.anInt5188);
		@Pc(17) int local17 = Static278.method3708(arg5, Static82.anInt1667, Static316.anInt5188);
		@Pc(23) int local23 = Static278.method3708(arg3, Static137.anInt2576, Static293.anInt4886);
		@Pc(29) int local29 = Static278.method3708(arg4, Static137.anInt2576, Static293.anInt4886);
		@Pc(37) int local37 = Static278.method3708(arg2 + arg1, Static82.anInt1667, Static316.anInt5188);
		@Pc(46) int local46 = Static278.method3708(arg5 - arg2, Static82.anInt1667, Static316.anInt5188);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static404.method5769(Static353.anIntArrayArray48[local48], local23, local29, arg0);
		}
		for (@Pc(64) int local64 = local17; local64 > local46; local64--) {
			Static404.method5769(Static353.anIntArrayArray48[local64], local23, local29, arg0);
		}
		@Pc(90) int local90 = Static278.method3708(arg2 + arg3, Static137.anInt2576, Static293.anInt4886);
		@Pc(98) int local98 = Static278.method3708(arg4 - arg2, Static137.anInt2576, Static293.anInt4886);
		for (@Pc(100) int local100 = local37; local100 <= local46; local100++) {
			@Pc(115) int[] local115 = Static353.anIntArrayArray48[local100];
			Static404.method5769(local115, local23, local90, arg0);
			Static404.method5769(local115, local90, local98, arg6);
			Static404.method5769(local115, local98, local29, arg0);
		}
	}
}

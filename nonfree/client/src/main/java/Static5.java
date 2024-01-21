import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "Lclient!v;")
	public static Class62 aClass62_80 = Static45.method753("blinken3:");

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "[I")
	public static int[] anIntArray19 = new int[50];

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "Lclient!v;")
	private static Class62 aClass62_84 = Static45.method753("Connection timed out)3");

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "Lclient!v;")
	public static Class62 aClass62_81 = aClass62_84;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "Lclient!qd;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "Lclient!v;")
	public static Class62 aClass62_82 = Static45.method753(":tradereq:");

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "Lclient!v;")
	public static Class62 aClass62_83 = Static45.method753("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
	public static int anInt200 = -1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!kd;II)Lclient!v;")
	public static Class62 method163(@OriginalArg(0) Class3_Sub8 arg0) {
		try {
			@Pc(12) Class62 local12 = new Class62();
			local12.anInt2649 = arg0.method1769();
			if (local12.anInt2649 > 32767) {
				local12.anInt2649 = 32767;
			}
			local12.aByteArray25 = new byte[local12.anInt2649];
			arg0.anInt2704 += Static15.aClass30_1.method672(arg0.aByteArray26, 0, arg0.anInt2704, local12.anInt2649, local12.aByteArray25);
			return local12;
		} catch (@Pc(49) Exception local49) {
			return Static68.aClass62_819;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
	public static void method164() {
		aClass62_84 = null;
		aClass62_81 = null;
		aClass62_82 = null;
		aClass62_80 = null;
		aClass62_83 = null;
		anIntArray19 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!jc;Lclient!kd;II)V")
	public static void method165(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class3_Sub8 arg1, @OriginalArg(3) int arg2) {
		if (Static68.aBoolean110) {
			return;
		}
		@Pc(12) Class3_Sub7 local12 = new Class3_Sub7();
		local12.anInt1435 = arg1.method1803();
		local12.anInt1437 = arg1.method1770();
		local12.aClass54Array1 = new Class54[local12.anInt1435];
		local12.anIntArray119 = new int[local12.anInt1435];
		local12.aByteArrayArrayArray9 = new byte[local12.anInt1435][][];
		local12.anIntArray117 = new int[local12.anInt1435];
		local12.aClass54Array2 = new Class54[local12.anInt1435];
		local12.anIntArray118 = new int[local12.anInt1435];
		for (@Pc(63) int local63 = 0; local63 < local12.anInt1435; local63++) {
			try {
				@Pc(69) int local69 = arg1.method1803();
				@Pc(99) String local99;
				@Pc(108) String local108;
				@Pc(112) int local112;
				if (local69 == 0 || local69 == 1 || local69 == 2) {
					local99 = new String(arg1.method1773().method1698());
					local108 = new String(arg1.method1773().method1698());
					local112 = 0;
					if (local69 == 1) {
						local112 = arg1.method1770();
					}
					local12.anIntArray119[local63] = local69;
					local12.anIntArray118[local63] = local112;
					local12.aClass54Array1[local63] = arg0.method776(Static104.method1819(local99), local108);
				} else if (local69 == 3 || local69 == 4) {
					local99 = new String(arg1.method1773().method1698());
					local108 = new String(arg1.method1773().method1698());
					local112 = arg1.method1803();
					@Pc(115) String[] local115 = new String[local112];
					for (@Pc(117) int local117 = 0; local117 < local112; local117++) {
						local115[local117] = new String(arg1.method1773().method1698());
					}
					@Pc(137) byte[][] local137 = new byte[local112][];
					@Pc(150) int local150;
					if (local69 == 3) {
						for (@Pc(144) int local144 = 0; local144 < local112; local144++) {
							local150 = arg1.method1770();
							local137[local144] = new byte[local150];
							arg1.method1767(local137[local144], local150);
						}
					}
					local12.anIntArray119[local63] = local69;
					@Pc(179) Class[] local179 = new Class[local112];
					for (local150 = 0; local150 < local112; local150++) {
						local179[local150] = Static104.method1819(local115[local150]);
					}
					local12.aClass54Array2[local63] = arg0.method777(Static104.method1819(local99), local108, local179);
					local12.aByteArrayArrayArray9[local63] = local137;
				}
			} catch (@Pc(264) ClassNotFoundException local264) {
				local12.anIntArray117[local63] = -1;
			} catch (@Pc(271) SecurityException local271) {
				local12.anIntArray117[local63] = -2;
			} catch (@Pc(278) NullPointerException local278) {
				local12.anIntArray117[local63] = -3;
			} catch (@Pc(285) Exception local285) {
				local12.anIntArray117[local63] = -4;
			} catch (@Pc(292) Throwable local292) {
				local12.anIntArray117[local63] = -5;
			}
		}
		Static98.aClass24_77.method535(local12);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILclient!mb;I)Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 method166(@OriginalArg(0) int arg0, @OriginalArg(2) Class42 arg1, @OriginalArg(3) int arg2) {
		return Static16.method442(arg1, arg0, arg2) ? Static7.method176() : null;
	}
}

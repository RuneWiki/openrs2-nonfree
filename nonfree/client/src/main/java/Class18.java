import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class18 {

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "[Lclient!t;")
	private final Class54[] aClass54Array2 = new Class54[5000];

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
	private int anInt1012 = 0;

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
	private int anInt1027 = 0;

	@OriginalMember(owner = "client!fc", name = "P", descriptor = "[I")
	private final int[] anIntArray138 = new int[10000];

	@OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
	private int anInt1035 = 0;

	@OriginalMember(owner = "client!fc", name = "X", descriptor = "[[I")
	private final int[][] anIntArrayArray8 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!fc", name = "ab", descriptor = "[[I")
	private final int[][] anIntArrayArray9 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!fc", name = "fb", descriptor = "[I")
	private final int[] anIntArray144 = new int[10000];

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	private final int anInt1017;

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
	private final int anInt1033;

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
	private final int anInt1025;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "[[[Lclient!ee;")
	private final Class2_Sub6[][][] aClass2_Sub6ArrayArrayArray1;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!fc", name = "M", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(III[[[I)V")
	public Class18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt1017 = arg0;
		this.anInt1033 = arg1;
		this.anInt1025 = arg2;
		this.aClass2_Sub6ArrayArrayArray1 = new Class2_Sub6[arg0][arg1][arg2];
		this.anIntArrayArrayArray1 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray2 = arg3;
		this.method604();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIILclient!dc;IIZ)Z")
	public boolean method576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return this.method618(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIII)Z")
	private boolean method577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray1[arg0][local17][local21] == -Static31.anInt1030) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray2[arg0][arg1][arg3] - arg5;
			if (!this.method611(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method611(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method611(local21, local167, local195)) {
				return false;
			} else if (this.method611(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method587(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method611(local17 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg3] - arg5, local21 + 1) && this.method611(local17 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method611(local17 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method611(local17 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!t;)V")
	private void method578(@OriginalArg(0) Class54 arg0) {
		for (@Pc(2) int local2 = arg0.anInt2697; local2 <= arg0.anInt2700; local2++) {
			for (@Pc(6) int local6 = arg0.anInt2708; local6 <= arg0.anInt2714; local6++) {
				@Pc(17) Class2_Sub6 local17 = this.aClass2_Sub6ArrayArrayArray1[arg0.anInt2707][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt782; local21++) {
						if (local17.aClass54Array1[local21] == arg0) {
							local17.anInt782--;
							for (local36 = local21; local36 < local17.anInt782; local36++) {
								local17.aClass54Array1[local36] = local17.aClass54Array1[local36 + 1];
								local17.anIntArray107[local36] = local17.anIntArray107[local36 + 1];
							}
							local17.aClass54Array1[local17.anInt782] = null;
							break;
						}
					}
					local17.anInt793 = 0;
					for (local36 = 0; local36 < local17.anInt782; local36++) {
						local17.anInt793 |= local17.anIntArray107[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ee;Z)V")
	private void method579(@OriginalArg(0) Class2_Sub6 arg0, @OriginalArg(1) boolean arg1) {
		Static31.aClass52_5.method1593(arg0);
		while (true) {
			@Pc(8) Class2_Sub6 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class2_Sub6[][] local31;
			@Pc(49) Class2_Sub6 local49;
			@Pc(251) int local251;
			@Pc(578) int local578;
			@Pc(583) int local583;
			@Pc(588) int local588;
			@Pc(591) int local591;
			@Pc(600) int local600;
			@Pc(942) Class39 local942;
			@Pc(1116) int local1116;
			@Pc(1001) int local1001;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class54 var12;
										@Pc(612) int var19;
										@Pc(335) int var23;
										@Pc(289) boolean var24;
										@Pc(823) Class2_Sub6 var35;
										while (true) {
											do {
												local8 = (Class2_Sub6) Static31.aClass52_5.method1594();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean54);
											local17 = local8.anInt787;
											local20 = local8.anInt791;
											local23 = local8.anInt786;
											local26 = local8.anInt779;
											local31 = this.aClass2_Sub6ArrayArrayArray1[local23];
											if (!local8.aBoolean52) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass2_Sub6ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean54) {
														continue;
													}
												}
												if (local17 <= Static31.anInt1031 && local17 > Static31.anInt1020) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean54 && (local49.aBoolean52 || (local8.anInt793 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static31.anInt1031 && local17 < Static31.anInt1029 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean54 && (local49.aBoolean52 || (local8.anInt793 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static31.anInt1014 && local20 > Static31.anInt1028) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean54 && (local49.aBoolean52 || (local8.anInt793 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static31.anInt1014 && local20 < Static31.anInt1009 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean54 && (local49.aBoolean52 || (local8.anInt793 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean52 = false;
											if (local8.aClass2_Sub6_1 != null) {
												local49 = local8.aClass2_Sub6_1;
												if (local49.aClass51_1 == null) {
													if (local49.aClass25_1 != null && !this.method587(0, local17, local20)) {
														this.method597(local49.aClass25_1, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local17, local20);
													}
												} else if (!this.method587(0, local17, local20)) {
													this.method613(local49.aClass51_1, 0, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local17, local20);
												}
												@Pc(225) Class39 local225 = local49.aClass39_1;
												if (local225 != null) {
													local225.aClass2_Sub1_Sub1_6.method1511(0, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local225.anInt1873 - Static31.anInt1022, local225.anInt1870 - Static31.anInt1011, local225.anInt1871 - Static31.anInt1026, local225.anInt1877);
												}
												for (local251 = 0; local251 < local49.anInt782; local251++) {
													var12 = local49.aClass54Array1[local251];
													if (var12 != null) {
														var12.aClass2_Sub1_Sub1_7.method1511(var12.anInt2706, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, var12.anInt2703 - Static31.anInt1022, var12.anInt2698 - Static31.anInt1011, var12.anInt2712 - Static31.anInt1026, var12.anInt2710);
													}
												}
											}
											var24 = false;
											if (local8.aClass51_1 == null) {
												if (local8.aClass25_1 != null && !this.method587(local26, local17, local20)) {
													var24 = true;
													this.method597(local8.aClass25_1, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local17, local20);
												}
											} else if (!this.method587(local26, local17, local20)) {
												var24 = true;
												this.method613(local8.aClass51_1, local26, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local17, local20);
											}
											var23 = 0;
											local251 = 0;
											@Pc(340) Class39 local340 = local8.aClass39_1;
											@Pc(343) Class32 local343 = local8.aClass32_1;
											if (local340 != null || local343 != null) {
												if (Static31.anInt1031 == local17) {
													var23++;
												} else if (Static31.anInt1031 < local17) {
													var23 += 2;
												}
												if (Static31.anInt1014 == local20) {
													var23 += 3;
												} else if (Static31.anInt1014 > local20) {
													var23 += 6;
												}
												local251 = Static31.anIntArray145[var23];
												local8.anInt784 = Static31.anIntArray139[var23];
											}
											if (local340 != null) {
												if ((local340.anInt1872 & Static31.anIntArray140[var23]) == 0) {
													local8.anInt781 = 0;
												} else if (local340.anInt1872 == 16) {
													local8.anInt781 = 3;
													local8.anInt792 = Static31.anIntArray146[var23];
													local8.anInt783 = 3 - local8.anInt792;
												} else if (local340.anInt1872 == 32) {
													local8.anInt781 = 6;
													local8.anInt792 = Static31.anIntArray142[var23];
													local8.anInt783 = 6 - local8.anInt792;
												} else if (local340.anInt1872 == 64) {
													local8.anInt781 = 12;
													local8.anInt792 = Static31.anIntArray141[var23];
													local8.anInt783 = 12 - local8.anInt792;
												} else {
													local8.anInt781 = 9;
													local8.anInt792 = Static31.anIntArray143[var23];
													local8.anInt783 = 9 - local8.anInt792;
												}
												if ((local340.anInt1872 & local251) != 0 && !this.method601(local26, local17, local20, local340.anInt1872)) {
													local340.aClass2_Sub1_Sub1_6.method1511(0, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local340.anInt1873 - Static31.anInt1022, local340.anInt1870 - Static31.anInt1011, local340.anInt1871 - Static31.anInt1026, local340.anInt1877);
												}
												if ((local340.anInt1875 & local251) != 0 && !this.method601(local26, local17, local20, local340.anInt1875)) {
													local340.aClass2_Sub1_Sub1_5.method1511(0, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local340.anInt1873 - Static31.anInt1022, local340.anInt1870 - Static31.anInt1011, local340.anInt1871 - Static31.anInt1026, local340.anInt1877);
												}
											}
											if (local343 != null && !this.method603(local26, local17, local20, local343.aClass2_Sub1_Sub1_1.anInt2496)) {
												if ((local343.anInt1469 & local251) != 0) {
													local343.aClass2_Sub1_Sub1_1.method1511(local343.anInt1471, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local343.anInt1475 - Static31.anInt1022, local343.anInt1478 - Static31.anInt1011, local343.anInt1470 - Static31.anInt1026, local343.anInt1472);
												} else if ((local343.anInt1469 & 0x300) != 0) {
													local578 = local343.anInt1475 - Static31.anInt1022;
													local583 = local343.anInt1478 - Static31.anInt1011;
													local588 = local343.anInt1470 - Static31.anInt1026;
													local591 = local343.anInt1471;
													if (local591 == 1 || local591 == 2) {
														local600 = -local578;
													} else {
														local600 = local578;
													}
													if (local591 == 2 || local591 == 3) {
														var19 = -local588;
													} else {
														var19 = local588;
													}
													@Pc(629) int local629;
													@Pc(635) int local635;
													if ((local343.anInt1469 & 0x100) != 0 && var19 < local600) {
														local629 = local578 + Static31.anIntArray135[local591];
														local635 = local588 + Static31.anIntArray133[local591];
														local343.aClass2_Sub1_Sub1_1.method1511(local591 * 512 + 256, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local629, local583, local635, local343.anInt1472);
													}
													if ((local343.anInt1469 & 0x200) != 0 && var19 > local600) {
														local629 = local578 + Static31.anIntArray136[local591];
														local635 = local588 + Static31.anIntArray134[local591];
														local343.aClass2_Sub1_Sub1_1.method1511(local591 * 512 + 1280 & 0x7FF, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local629, local583, local635, local343.anInt1472);
													}
												}
											}
											if (var24) {
												@Pc(696) Class63 local696 = local8.aClass63_1;
												if (local696 != null) {
													local696.aClass2_Sub1_Sub1_8.method1511(0, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local696.anInt2841 - Static31.anInt1022, local696.anInt2833 - Static31.anInt1011, local696.anInt2839 - Static31.anInt1026, local696.anInt2835);
												}
												@Pc(723) Class34 local723 = local8.aClass34_1;
												if (local723 != null && local723.anInt1635 == 0) {
													if (local723.aClass2_Sub1_Sub1_2 != null) {
														local723.aClass2_Sub1_Sub1_2.method1511(0, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local723.anInt1632 - Static31.anInt1022, local723.anInt1633 - Static31.anInt1011, local723.anInt1631 - Static31.anInt1026, local723.anInt1642);
													}
													if (local723.aClass2_Sub1_Sub1_3 != null) {
														local723.aClass2_Sub1_Sub1_3.method1511(0, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local723.anInt1632 - Static31.anInt1022, local723.anInt1633 - Static31.anInt1011, local723.anInt1631 - Static31.anInt1026, local723.anInt1642);
													}
													if (local723.aClass2_Sub1_Sub1_4 != null) {
														local723.aClass2_Sub1_Sub1_4.method1511(0, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local723.anInt1632 - Static31.anInt1022, local723.anInt1633 - Static31.anInt1011, local723.anInt1631 - Static31.anInt1026, local723.anInt1642);
													}
												}
											}
											local578 = local8.anInt793;
											if (local578 != 0) {
												if (local17 < Static31.anInt1031 && (local578 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean54) {
														Static31.aClass52_5.method1593(var35);
													}
												}
												if (local20 < Static31.anInt1014 && (local578 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean54) {
														Static31.aClass52_5.method1593(var35);
													}
												}
												if (local17 > Static31.anInt1031 && (local578 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean54) {
														Static31.aClass52_5.method1593(var35);
													}
												}
												if (local20 > Static31.anInt1014 && (local578 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean54) {
														Static31.aClass52_5.method1593(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt781 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt782; var23++) {
												if (local8.aClass54Array1[var23].anInt2713 != Static31.anInt1030 && (local8.anIntArray107[var23] & local8.anInt781) == local8.anInt792) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local942 = local8.aClass39_1;
												if (!this.method601(local26, local17, local20, local942.anInt1872)) {
													local942.aClass2_Sub1_Sub1_6.method1511(0, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local942.anInt1873 - Static31.anInt1022, local942.anInt1870 - Static31.anInt1011, local942.anInt1871 - Static31.anInt1026, local942.anInt1877);
												}
												local8.anInt781 = 0;
											}
										}
										if (!local8.aBoolean53) {
											break;
										}
										try {
											@Pc(981) int local981 = local8.anInt782;
											local8.aBoolean53 = false;
											var23 = 0;
											label559: for (local251 = 0; local251 < local981; local251++) {
												var12 = local8.aClass54Array1[local251];
												if (var12.anInt2713 != Static31.anInt1030) {
													for (local1001 = var12.anInt2697; local1001 <= var12.anInt2700; local1001++) {
														for (local578 = var12.anInt2708; local578 <= var12.anInt2714; local578++) {
															var35 = local31[local1001][local578];
															if (var35.aBoolean52) {
																local8.aBoolean53 = true;
																continue label559;
															}
															if (var35.anInt781 != 0) {
																local588 = 0;
																if (local1001 > var12.anInt2697) {
																	local588++;
																}
																if (local1001 < var12.anInt2700) {
																	local588 += 4;
																}
																if (local578 > var12.anInt2708) {
																	local588 += 8;
																}
																if (local578 < var12.anInt2714) {
																	local588 += 2;
																}
																if ((local588 & var35.anInt781) == local8.anInt783) {
																	local8.aBoolean53 = true;
																	continue label559;
																}
															}
														}
													}
													Static31.aClass54Array3[var23++] = var12;
													local578 = Static31.anInt1031 - var12.anInt2697;
													local583 = var12.anInt2700 - Static31.anInt1031;
													if (local583 > local578) {
														local578 = local583;
													}
													local588 = Static31.anInt1014 - var12.anInt2708;
													local591 = var12.anInt2714 - Static31.anInt1014;
													if (local591 > local588) {
														var12.anInt2702 = local578 + local591;
													} else {
														var12.anInt2702 = local578 + local588;
													}
												}
											}
											while (var23 > 0) {
												local1116 = -50;
												local1001 = -1;
												@Pc(1125) Class54 local1125;
												for (local578 = 0; local578 < var23; local578++) {
													local1125 = Static31.aClass54Array3[local578];
													if (local1125.anInt2713 != Static31.anInt1030) {
														if (local1125.anInt2702 > local1116) {
															local1116 = local1125.anInt2702;
															local1001 = local578;
														} else if (local1125.anInt2702 == local1116) {
															local588 = local1125.anInt2703 - Static31.anInt1022;
															local591 = local1125.anInt2712 - Static31.anInt1026;
															local600 = Static31.aClass54Array3[local1001].anInt2703 - Static31.anInt1022;
															var19 = Static31.aClass54Array3[local1001].anInt2712 - Static31.anInt1026;
															if (local588 * local588 + local591 * local591 > local600 * local600 + var19 * var19) {
																local1001 = local578;
															}
														}
													}
												}
												if (local1001 == -1) {
													break;
												}
												local1125 = Static31.aClass54Array3[local1001];
												local1125.anInt2713 = Static31.anInt1030;
												if (!this.method577(local26, local1125.anInt2697, local1125.anInt2700, local1125.anInt2708, local1125.anInt2714, local1125.aClass2_Sub1_Sub1_7.anInt2496)) {
													local1125.aClass2_Sub1_Sub1_7.method1511(local1125.anInt2706, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local1125.anInt2703 - Static31.anInt1022, local1125.anInt2698 - Static31.anInt1011, local1125.anInt2712 - Static31.anInt1026, local1125.anInt2710);
												}
												for (local588 = local1125.anInt2697; local588 <= local1125.anInt2700; local588++) {
													for (local591 = local1125.anInt2708; local591 <= local1125.anInt2714; local591++) {
														@Pc(1250) Class2_Sub6 local1250 = local31[local588][local591];
														if (local1250.anInt781 != 0) {
															Static31.aClass52_5.method1593(local1250);
														} else if ((local588 != local17 || local591 != local20) && local1250.aBoolean54) {
															Static31.aClass52_5.method1593(local1250);
														}
													}
												}
											}
											if (!local8.aBoolean53) {
												break;
											}
										} catch (@Pc(1288) Exception local1288) {
											local8.aBoolean53 = false;
											break;
										}
									}
								} while (!local8.aBoolean54);
							} while (local8.anInt781 != 0);
							if (local17 > Static31.anInt1031 || local17 <= Static31.anInt1020) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean54);
						if (local17 < Static31.anInt1031 || local17 >= Static31.anInt1029 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean54);
					if (local20 > Static31.anInt1014 || local20 <= Static31.anInt1028) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean54);
				if (local20 < Static31.anInt1014 || local20 >= Static31.anInt1009 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean54);
			local8.aBoolean54 = false;
			Static31.anInt1013--;
			@Pc(1392) Class34 local1392 = local8.aClass34_1;
			if (local1392 != null && local1392.anInt1635 != 0) {
				if (local1392.aClass2_Sub1_Sub1_2 != null) {
					local1392.aClass2_Sub1_Sub1_2.method1511(0, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local1392.anInt1632 - Static31.anInt1022, local1392.anInt1633 - Static31.anInt1011 - local1392.anInt1635, local1392.anInt1631 - Static31.anInt1026, local1392.anInt1642);
				}
				if (local1392.aClass2_Sub1_Sub1_3 != null) {
					local1392.aClass2_Sub1_Sub1_3.method1511(0, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local1392.anInt1632 - Static31.anInt1022, local1392.anInt1633 - Static31.anInt1011 - local1392.anInt1635, local1392.anInt1631 - Static31.anInt1026, local1392.anInt1642);
				}
				if (local1392.aClass2_Sub1_Sub1_4 != null) {
					local1392.aClass2_Sub1_Sub1_4.method1511(0, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local1392.anInt1632 - Static31.anInt1022, local1392.anInt1633 - Static31.anInt1011 - local1392.anInt1635, local1392.anInt1631 - Static31.anInt1026, local1392.anInt1642);
				}
			}
			if (local8.anInt784 != 0) {
				@Pc(1487) Class32 local1487 = local8.aClass32_1;
				if (local1487 != null && !this.method603(local26, local17, local20, local1487.aClass2_Sub1_Sub1_1.anInt2496)) {
					if ((local1487.anInt1469 & local8.anInt784) != 0) {
						local1487.aClass2_Sub1_Sub1_1.method1511(local1487.anInt1471, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local1487.anInt1475 - Static31.anInt1022, local1487.anInt1478 - Static31.anInt1011, local1487.anInt1470 - Static31.anInt1026, local1487.anInt1472);
					} else if ((local1487.anInt1469 & 0x300) != 0) {
						local251 = local1487.anInt1475 - Static31.anInt1022;
						local1116 = local1487.anInt1478 - Static31.anInt1011;
						local1001 = local1487.anInt1470 - Static31.anInt1026;
						local578 = local1487.anInt1471;
						if (local578 == 1 || local578 == 2) {
							local583 = -local251;
						} else {
							local583 = local251;
						}
						if (local578 == 2 || local578 == 3) {
							local588 = -local1001;
						} else {
							local588 = local1001;
						}
						if ((local1487.anInt1469 & 0x100) != 0 && local588 >= local583) {
							local591 = local251 + Static31.anIntArray135[local578];
							local600 = local1001 + Static31.anIntArray133[local578];
							local1487.aClass2_Sub1_Sub1_1.method1511(local578 * 512 + 256, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local591, local1116, local600, local1487.anInt1472);
						}
						if ((local1487.anInt1469 & 0x200) != 0 && local588 <= local583) {
							local591 = local251 + Static31.anIntArray136[local578];
							local600 = local1001 + Static31.anIntArray134[local578];
							local1487.aClass2_Sub1_Sub1_1.method1511(local578 * 512 + 1280 & 0x7FF, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local591, local1116, local600, local1487.anInt1472);
						}
					}
				}
				local942 = local8.aClass39_1;
				if (local942 != null) {
					if ((local942.anInt1875 & local8.anInt784) != 0 && !this.method601(local26, local17, local20, local942.anInt1875)) {
						local942.aClass2_Sub1_Sub1_5.method1511(0, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local942.anInt1873 - Static31.anInt1022, local942.anInt1870 - Static31.anInt1011, local942.anInt1871 - Static31.anInt1026, local942.anInt1877);
					}
					if ((local942.anInt1872 & local8.anInt784) != 0 && !this.method601(local26, local17, local20, local942.anInt1872)) {
						local942.aClass2_Sub1_Sub1_6.method1511(0, Static31.anInt1021, Static31.anInt1023, Static31.anInt1036, Static31.anInt1016, local942.anInt1873 - Static31.anInt1022, local942.anInt1870 - Static31.anInt1011, local942.anInt1871 - Static31.anInt1026, local942.anInt1877);
					}
				}
			}
			@Pc(1745) Class2_Sub6 local1745;
			if (local23 < this.anInt1017 - 1) {
				local1745 = this.aClass2_Sub6ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1745 != null && local1745.aBoolean54) {
					Static31.aClass52_5.method1593(local1745);
				}
			}
			if (local17 < Static31.anInt1031) {
				local1745 = local31[local17 + 1][local20];
				if (local1745 != null && local1745.aBoolean54) {
					Static31.aClass52_5.method1593(local1745);
				}
			}
			if (local20 < Static31.anInt1014) {
				local1745 = local31[local17][local20 + 1];
				if (local1745 != null && local1745.aBoolean54) {
					Static31.aClass52_5.method1593(local1745);
				}
			}
			if (local17 > Static31.anInt1031) {
				local1745 = local31[local17 - 1][local20];
				if (local1745 != null && local1745.aBoolean54) {
					Static31.aClass52_5.method1593(local1745);
				}
			}
			if (local20 > Static31.anInt1014) {
				local1745 = local31[local17][local20 - 1];
				if (local1745 != null && local1745.aBoolean54) {
					Static31.aClass52_5.method1593(local1745);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "()V")
	private void method580() {
		@Pc(3) int local3 = Static31.anIntArray137[Static31.anInt1019];
		@Pc(7) Class45[] local7 = Static31.aClass45ArrayArray1[Static31.anInt1019];
		Static31.anInt1015 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class45 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt2197 == 1) {
				local27 = local16.anInt2199 + 25 - Static31.anInt1031;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2200 + 25 - Static31.anInt1014;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2196 + 25 - Static31.anInt1014;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static31.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static31.anInt1022 - local16.anInt2191;
						if (local79 > 32) {
							local16.anInt2180 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2180 = 2;
							local79 = -local79;
						}
						local16.anInt2186 = (local16.anInt2185 - Static31.anInt1026 << 8) / local79;
						local16.anInt2195 = (local16.anInt2206 - Static31.anInt1026 << 8) / local79;
						local16.anInt2203 = (local16.anInt2179 - Static31.anInt1011 << 8) / local79;
						local16.anInt2181 = (local16.anInt2204 - Static31.anInt1011 << 8) / local79;
						Static31.aClass45Array1[Static31.anInt1015++] = local16;
					}
				}
			} else if (local16.anInt2197 == 2) {
				local27 = local16.anInt2200 + 25 - Static31.anInt1014;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2199 + 25 - Static31.anInt1031;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2201 + 25 - Static31.anInt1031;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static31.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static31.anInt1026 - local16.anInt2185;
						if (local79 > 32) {
							local16.anInt2180 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2180 = 4;
							local79 = -local79;
						}
						local16.anInt2193 = (local16.anInt2191 - Static31.anInt1022 << 8) / local79;
						local16.anInt2184 = (local16.anInt2187 - Static31.anInt1022 << 8) / local79;
						local16.anInt2203 = (local16.anInt2179 - Static31.anInt1011 << 8) / local79;
						local16.anInt2181 = (local16.anInt2204 - Static31.anInt1011 << 8) / local79;
						Static31.aClass45Array1[Static31.anInt1015++] = local16;
					}
				}
			} else if (local16.anInt2197 == 4) {
				local27 = local16.anInt2179 - Static31.anInt1011;
				if (local27 > 128) {
					local40 = local16.anInt2200 + 25 - Static31.anInt1014;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2196 + 25 - Static31.anInt1014;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt2199 + 25 - Static31.anInt1031;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt2201 + 25 - Static31.anInt1031;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static31.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt2180 = 5;
							local16.anInt2193 = (local16.anInt2191 - Static31.anInt1022 << 8) / local27;
							local16.anInt2184 = (local16.anInt2187 - Static31.anInt1022 << 8) / local27;
							local16.anInt2186 = (local16.anInt2185 - Static31.anInt1026 << 8) / local27;
							local16.anInt2195 = (local16.anInt2206 - Static31.anInt1026 << 8) / local27;
							Static31.aClass45Array1[Static31.anInt1015++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)I")
	public int method581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass39_1 == null ? 0 : local8.aClass39_1.anInt1877;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIILclient!dc;II)V")
	public void method582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class63 local6 = new Class63();
		local6.aClass2_Sub1_Sub1_8 = arg4;
		local6.anInt2841 = arg1 * 128 + 64;
		local6.anInt2839 = arg2 * 128 + 64;
		local6.anInt2833 = arg3;
		local6.anInt2835 = arg5;
		local6.anInt2846 = arg6;
		if (this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub6(arg0, arg1, arg2);
		}
		this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass63_1 = local6;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class51 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class51(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub6ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub6ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub6(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass51_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class51(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub6ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub6ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub6(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass51_1 = local12;
		} else {
			@Pc(140) Class25 local140 = new Class25(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub6ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub6ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub6(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass25_1 = local140;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIILclient!dc;ILclient!dc;Lclient!dc;)V")
	public void method585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub1 arg6, @OriginalArg(7) Class2_Sub1_Sub1 arg7) {
		@Pc(3) Class34 local3 = new Class34();
		local3.aClass2_Sub1_Sub1_4 = arg4;
		local3.anInt1632 = arg1 * 128 + 64;
		local3.anInt1631 = arg2 * 128 + 64;
		local3.anInt1633 = arg3;
		local3.anInt1642 = arg5;
		local3.aClass2_Sub1_Sub1_2 = arg6;
		local3.aClass2_Sub1_Sub1_3 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class2_Sub6 local43 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt782; local47++) {
				if ((local43.aClass54Array1[local47].anInt2704 & 0x100) == 256 && local43.aClass54Array1[local47].aClass2_Sub1_Sub1_7 instanceof Class2_Sub1_Sub1_Sub6) {
					@Pc(71) Class2_Sub1_Sub1_Sub6 local71 = (Class2_Sub1_Sub1_Sub6) local43.aClass54Array1[local47].aClass2_Sub1_Sub1_7;
					local71.method1516();
					if (local71.anInt2496 > local34) {
						local34 = local71.anInt2496;
					}
				}
			}
		}
		local3.anInt1635 = local34;
		if (this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub6(arg0, arg1, arg2);
		}
		this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass34_1 = local3;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII)V")
	public void method586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2].anInt778 = arg3;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(III)Z")
	private boolean method587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == -Static31.anInt1030) {
			return false;
		} else if (local8 == Static31.anInt1030) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method611(local23 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2], local27 + 1) && this.method611(local23 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2], local27 + 1) && this.method611(local23 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method611(local23 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray1[arg0][arg1][arg2] = Static31.anInt1030;
				return true;
			} else {
				this.anIntArrayArrayArray1[arg0][arg1][arg2] = -Static31.anInt1030;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	public void method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class2_Sub6 local31 = this.aClass2_Sub6ArrayArrayArray1[local10][arg0][arg1] = this.aClass2_Sub6ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt786--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt782; local41++) {
					@Pc(47) Class54 local47 = local31.aClass54Array1[local41];
					if ((local47.anInt2710 >> 29 & 0x3) == 2 && local47.anInt2697 == arg0 && local47.anInt2708 == arg1) {
						local47.anInt2707--;
					}
				}
			}
		}
		if (this.aClass2_Sub6ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass2_Sub6ArrayArrayArray1[0][arg0][arg1] = new Class2_Sub6(0, arg0, arg1);
		}
		this.aClass2_Sub6ArrayArrayArray1[0][arg0][arg1].aClass2_Sub6_1 = local8;
		this.aClass2_Sub6ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!r;IIIII)V")
	private void method589(@OriginalArg(0) Class2_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt1017) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt1033) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt1025 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class2_Sub6 local66 = this.aClass2_Sub6ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray2[local17][local24][local34] + this.anIntArrayArrayArray2[local17][local24 + 1][local34] + this.anIntArrayArrayArray2[local17][local24][local34 + 1] + this.anIntArrayArrayArray2[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray2[arg1][arg2][arg3] + this.anIntArrayArrayArray2[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray2[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray2[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class39 local163 = local66.aClass39_1;
									if (local163 != null) {
										@Pc(173) Class2_Sub1_Sub1_Sub6 local173;
										if (local163.aClass2_Sub1_Sub1_6 instanceof Class2_Sub1_Sub1_Sub6) {
											local173 = (Class2_Sub1_Sub1_Sub6) local163.aClass2_Sub1_Sub1_6;
											if (local173.aClass37Array1 != null) {
												this.method602(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
										if (local163.aClass2_Sub1_Sub1_5 instanceof Class2_Sub1_Sub1_Sub6) {
											local173 = (Class2_Sub1_Sub1_Sub6) local163.aClass2_Sub1_Sub1_5;
											if (local173.aClass37Array1 != null) {
												this.method602(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
									}
									for (@Pc(245) int local245 = 0; local245 < local66.anInt782; local245++) {
										@Pc(251) Class54 local251 = local66.aClass54Array1[local245];
										if (local251 != null && local251.aClass2_Sub1_Sub1_7 instanceof Class2_Sub1_Sub1_Sub6) {
											@Pc(261) Class2_Sub1_Sub1_Sub6 local261 = (Class2_Sub1_Sub1_Sub6) local251.aClass2_Sub1_Sub1_7;
											if (local261.aClass37Array1 != null) {
												@Pc(272) int local272 = local251.anInt2700 + 1 - local251.anInt2697;
												@Pc(280) int local280 = local251.anInt2714 + 1 - local251.anInt2708;
												this.method602(arg0, local261, (local251.anInt2697 - arg2) * 128 + (local272 - arg4) * 64, local160, (local251.anInt2708 - arg3) * 128 + (local280 - arg5) * 64, local1);
											}
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(III)V")
	public void method590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass32_1 = null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(III)I")
	public int method591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass32_1 == null ? 0 : local8.aClass32_1.anInt1472;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(III)I")
	public int method592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt782; local14++) {
			@Pc(20) Class54 local20 = local8.aClass54Array1[local14];
			if ((local20.anInt2710 >> 29 & 0x3) == 2 && local20.anInt2697 == arg1 && local20.anInt2708 == arg2) {
				return local20.anInt2710;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "()V")
	public void method593() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1027; local1++) {
			@Pc(7) Class54 local7 = this.aClass54Array2[local1];
			this.method578(local7);
			this.aClass54Array2[local1] = null;
		}
		this.anInt1027 = 0;
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(III)V")
	public void method595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass34_1 = null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!r;III)V")
	private void method596(@OriginalArg(0) Class2_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class2_Sub6 local14;
		@Pc(29) Class2_Sub1_Sub1_Sub6 local29;
		if (arg2 < this.anInt1033) {
			local14 = this.aClass2_Sub6ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass63_1 != null && local14.aClass63_1.aClass2_Sub1_Sub1_8 instanceof Class2_Sub1_Sub1_Sub6) {
				local29 = (Class2_Sub1_Sub1_Sub6) local14.aClass63_1.aClass2_Sub1_Sub1_8;
				if (local29.aClass37Array1 != null) {
					this.method602(arg0, local29, 128, 0, 0, true);
				}
			}
		}
		if (arg3 < this.anInt1033) {
			local14 = this.aClass2_Sub6ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass63_1 != null && local14.aClass63_1.aClass2_Sub1_Sub1_8 instanceof Class2_Sub1_Sub1_Sub6) {
				local29 = (Class2_Sub1_Sub1_Sub6) local14.aClass63_1.aClass2_Sub1_Sub1_8;
				if (local29.aClass37Array1 != null) {
					this.method602(arg0, local29, 0, 0, 128, true);
				}
			}
		}
		if (arg2 < this.anInt1033 && arg3 < this.anInt1025) {
			local14 = this.aClass2_Sub6ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass63_1 != null && local14.aClass63_1.aClass2_Sub1_Sub1_8 instanceof Class2_Sub1_Sub1_Sub6) {
				local29 = (Class2_Sub1_Sub1_Sub6) local14.aClass63_1.aClass2_Sub1_Sub1_8;
				if (local29.aClass37Array1 != null) {
					this.method602(arg0, local29, 128, 0, 128, true);
				}
			}
		}
		if (arg2 >= this.anInt1033 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass2_Sub6ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass63_1 != null && local14.aClass63_1.aClass2_Sub1_Sub1_8 instanceof Class2_Sub1_Sub1_Sub6) {
			local29 = (Class2_Sub1_Sub1_Sub6) local14.aClass63_1.aClass2_Sub1_Sub1_8;
			if (local29.aClass37Array1 != null) {
				this.method602(arg0, local29, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ib;IIIIII)V")
	private void method597(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray184.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray184[local5] - Static31.anInt1022;
			local20 = arg0.anIntArray179[local5] - Static31.anInt1011;
			local27 = arg0.anIntArray178[local5] - Static31.anInt1026;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray190 != null) {
				Static44.anIntArray191[local5] = local37;
				Static44.anIntArray182[local5] = local59;
				Static44.anIntArray188[local5] = local69;
			}
			Static44.anIntArray177[local5] = Static10.anInt407 + (local37 << 9) / local69;
			Static44.anIntArray186[local5] = Static10.anInt399 + (local59 << 9) / local69;
		}
		Static10.anInt405 = 0;
		local3 = arg0.anIntArray183.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray183[local13];
			local27 = arg0.anIntArray189[local13];
			local37 = arg0.anIntArray180[local13];
			@Pc(142) int local142 = Static44.anIntArray177[local20];
			@Pc(146) int local146 = Static44.anIntArray177[local27];
			@Pc(150) int local150 = Static44.anIntArray177[local37];
			@Pc(154) int local154 = Static44.anIntArray186[local20];
			@Pc(158) int local158 = Static44.anIntArray186[local27];
			@Pc(162) int local162 = Static44.anIntArray186[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static10.aBoolean30 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static10.anInt404 || local146 > Static10.anInt404 || local150 > Static10.anInt404) {
					Static10.aBoolean30 = true;
				}
				if (Static31.aBoolean66 && this.method609(Static31.anInt1034, Static31.anInt1024, local154, local158, local162, local142, local146, local150)) {
					Static31.anInt1010 = arg5;
					Static31.anInt1018 = arg6;
				}
				if (arg0.anIntArray190 == null || arg0.anIntArray190[local13] == -1) {
					if (arg0.anIntArray185[local13] != 12345678) {
						Static10.method245(local154, local158, local162, local142, local146, local150, arg0.anIntArray185[local13], arg0.anIntArray181[local13], arg0.anIntArray187[local13]);
					}
				} else if (Static31.aBoolean65) {
					@Pc(364) int local364 = Static10.anInterface1_1.method119(arg0.anIntArray190[local13]);
					Static10.method245(local154, local158, local162, local142, local146, local150, Static31.method594(local364, arg0.anIntArray185[local13]), Static31.method594(local364, arg0.anIntArray181[local13]), Static31.method594(local364, arg0.anIntArray187[local13]));
				} else if (arg0.aBoolean79) {
					Static10.method242(local154, local158, local162, local142, local146, local150, arg0.anIntArray185[local13], arg0.anIntArray181[local13], arg0.anIntArray187[local13], Static44.anIntArray191[0], Static44.anIntArray191[1], Static44.anIntArray191[3], Static44.anIntArray182[0], Static44.anIntArray182[1], Static44.anIntArray182[3], Static44.anIntArray188[0], Static44.anIntArray188[1], Static44.anIntArray188[3], arg0.anIntArray190[local13]);
				} else {
					Static10.method242(local154, local158, local162, local142, local146, local150, arg0.anIntArray185[local13], arg0.anIntArray181[local13], arg0.anIntArray187[local13], Static44.anIntArray191[local20], Static44.anIntArray191[local27], Static44.anIntArray191[local37], Static44.anIntArray182[local20], Static44.anIntArray182[local27], Static44.anIntArray182[local37], Static44.anIntArray188[local20], Static44.anIntArray188[local27], Static44.anIntArray188[local37], arg0.anIntArray190[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "(III)V")
	public void method599() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1017; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt1033; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt1025; local7++) {
					@Pc(17) Class2_Sub6 local17 = this.aClass2_Sub6ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class39 local22 = local17.aClass39_1;
						if (local22 != null && local22.aClass2_Sub1_Sub1_6 instanceof Class2_Sub1_Sub1_Sub6) {
							@Pc(32) Class2_Sub1_Sub1_Sub6 local32 = (Class2_Sub1_Sub1_Sub6) local22.aClass2_Sub1_Sub1_6;
							if (local32.aClass37Array1 != null) {
								this.method589(local32, local1, local4, local7, 1, 1);
								if (local22.aClass2_Sub1_Sub1_5 instanceof Class2_Sub1_Sub1_Sub6) {
									@Pc(51) Class2_Sub1_Sub1_Sub6 local51 = (Class2_Sub1_Sub1_Sub6) local22.aClass2_Sub1_Sub1_5;
									if (local51.aClass37Array1 != null) {
										this.method589(local51, local1, local4, local7, 1, 1);
										this.method602(local32, local51, 0, 0, 0, false);
										local51.method1534();
									}
								}
								local32.method1534();
							}
						}
						@Pc(98) Class2_Sub1_Sub1_Sub6 local98;
						for (@Pc(82) int local82 = 0; local82 < local17.anInt782; local82++) {
							@Pc(88) Class54 local88 = local17.aClass54Array1[local82];
							if (local88 != null && local88.aClass2_Sub1_Sub1_7 instanceof Class2_Sub1_Sub1_Sub6) {
								local98 = (Class2_Sub1_Sub1_Sub6) local88.aClass2_Sub1_Sub1_7;
								if (local98.aClass37Array1 != null) {
									this.method589(local98, local1, local4, local7, local88.anInt2700 + 1 - local88.anInt2697, local88.anInt2714 - local88.anInt2708 + 1);
									local98.method1534();
								}
							}
						}
						@Pc(134) Class63 local134 = local17.aClass63_1;
						if (local134 != null && local134.aClass2_Sub1_Sub1_8 instanceof Class2_Sub1_Sub1_Sub6) {
							local98 = (Class2_Sub1_Sub1_Sub6) local134.aClass2_Sub1_Sub1_8;
							if (local98.aClass37Array1 != null) {
								this.method596(local98, local1, local4, local7);
								local98.method1534();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIILclient!dc;Lclient!dc;IIII)V")
	public void method600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) Class2_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class39 local8 = new Class39();
		local8.anInt1877 = arg8;
		local8.anInt1876 = arg9;
		local8.anInt1873 = arg1 * 128 + 64;
		local8.anInt1871 = arg2 * 128 + 64;
		local8.anInt1870 = arg3;
		local8.aClass2_Sub1_Sub1_6 = arg4;
		local8.aClass2_Sub1_Sub1_5 = arg5;
		local8.anInt1872 = arg6;
		local8.anInt1875 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass2_Sub6ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass2_Sub6ArrayArrayArray1[local45][arg1][arg2] = new Class2_Sub6(local45, arg1, arg2);
			}
		}
		this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass39_1 = local8;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(IIII)Z")
	private boolean method601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method587(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray2[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static31.anInt1022) {
					if (!this.method611(local11, local26, local15)) {
						return false;
					}
					if (!this.method611(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method611(local11, local30, local15)) {
						return false;
					}
					if (!this.method611(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method611(local11, local34, local15)) {
					return false;
				}
				if (!this.method611(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static31.anInt1026) {
					if (!this.method611(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method611(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method611(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method611(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method611(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method611(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static31.anInt1022) {
					if (!this.method611(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method611(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method611(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method611(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method611(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method611(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static31.anInt1026) {
					if (!this.method611(local11, local26, local15)) {
						return false;
					}
					if (!this.method611(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method611(local11, local30, local15)) {
						return false;
					}
					if (!this.method611(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method611(local11, local34, local15)) {
					return false;
				}
				if (!this.method611(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method611(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method611(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method611(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method611(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method611(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!r;Lclient!r;IIIZ)V")
	private void method602(@OriginalArg(0) Class2_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg1.method1538();
		this.anInt1035++;
		@Pc(9) int local9 = 0;
		@Pc(12) int[] local12 = arg1.anIntArray344;
		@Pc(15) int local15 = arg1.anInt2507;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt2507; local17++) {
			@Pc(23) Class37 local23 = arg0.aClass37Array1[local17];
			@Pc(28) Class37 local28 = arg0.aClass37Array2[local17];
			if (local28.anInt1845 != 0) {
				@Pc(38) int local38 = arg0.anIntArray339[local17] - arg3;
				if (local38 <= arg1.anInt2501) {
					@Pc(49) int local49 = arg0.anIntArray344[local17] - arg2;
					if (local49 >= arg1.anInt2505 && local49 <= arg1.anInt2502) {
						@Pc(65) int local65 = arg0.anIntArray338[local17] - arg4;
						if (local65 >= arg1.anInt2511 && local65 <= arg1.anInt2506) {
							for (@Pc(76) int local76 = 0; local76 < local15; local76++) {
								@Pc(82) Class37 local82 = arg1.aClass37Array1[local76];
								@Pc(87) Class37 local87 = arg1.aClass37Array2[local76];
								if (local49 == local12[local76] && local65 == arg1.anIntArray338[local76] && local38 == arg1.anIntArray339[local76] && local87.anInt1845 != 0) {
									local23.anInt1841 += local87.anInt1841;
									local23.anInt1842 += local87.anInt1842;
									local23.anInt1846 += local87.anInt1846;
									local23.anInt1845 += local87.anInt1845;
									local82.anInt1841 += local28.anInt1841;
									local82.anInt1842 += local28.anInt1842;
									local82.anInt1846 += local28.anInt1846;
									local82.anInt1845 += local28.anInt1845;
									local9++;
									this.anIntArray138[local17] = this.anInt1035;
									this.anIntArray144[local76] = this.anInt1035;
								}
							}
						}
					}
				}
			}
		}
		if (local9 < 3 || !arg5) {
			return;
		}
		for (@Pc(193) int local193 = 0; local193 < arg0.anInt2503; local193++) {
			if (this.anIntArray138[arg0.anIntArray334[local193]] == this.anInt1035 && this.anIntArray138[arg0.anIntArray327[local193]] == this.anInt1035 && this.anIntArray138[arg0.anIntArray329[local193]] == this.anInt1035) {
				arg0.anIntArray342[local193] = -1;
			}
		}
		for (@Pc(236) int local236 = 0; local236 < arg1.anInt2503; local236++) {
			if (this.anIntArray144[arg1.anIntArray334[local236]] == this.anInt1035 && this.anIntArray144[arg1.anIntArray327[local236]] == this.anInt1035 && this.anIntArray144[arg1.anIntArray329[local236]] == this.anInt1035) {
				arg1.anIntArray342[local236] = -1;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(IIII)Z")
	private boolean method603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method587(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method611(local11 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2] - arg3, local15 + 1) && this.method611(local11 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method611(local11 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method611(local11 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "()V")
	public void method604() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt1017; local1++) {
			for (local4 = 0; local4 < this.anInt1033; local4++) {
				for (local7 = 0; local7 < this.anInt1025; local7++) {
					this.aClass2_Sub6ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static31.anInt1032; local4++) {
			for (local7 = 0; local7 < Static31.anIntArray137[local4]; local7++) {
				Static31.aClass45ArrayArray1[local4][local7] = null;
			}
			Static31.anIntArray137[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt1027; local7++) {
			this.aClass54Array2[local7] = null;
		}
		this.anInt1027 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static31.aClass54Array3.length; local76++) {
			Static31.aClass54Array3[local76] = null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIILclient!dc;IIIIII)V")
	public void method605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class32 local6 = new Class32();
		local6.anInt1472 = arg9;
		local6.anInt1468 = arg10;
		local6.anInt1475 = arg1 * 128 + arg7 + 64;
		local6.anInt1470 = arg2 * 128 + arg8 + 64;
		local6.anInt1478 = arg3;
		local6.aClass2_Sub1_Sub1_1 = arg4;
		local6.anInt1469 = arg5;
		local6.anInt1471 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass2_Sub6ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass2_Sub6ArrayArrayArray1[local44][arg1][arg2] = new Class2_Sub6(local44, arg1, arg2);
			}
		}
		this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass32_1 = local6;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIILclient!dc;IIIIII)Z")
	public boolean method606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub1_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method618(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(IIII)V")
	public void method607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class32 local14 = local8.aClass32_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt1475 = local23 + (local14.anInt1475 - local23) * arg3 / 16;
			local14.anInt1470 = local29 + (local14.anInt1470 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "(III)I")
	public int method608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass63_1 == null ? 0 : local8.aClass63_1.anInt2835;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "(III)Lclient!le;")
	public Class39 method610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass39_1;
	}

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "(III)Z")
	private boolean method611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static31.anInt1015; local1++) {
			@Pc(6) Class45 local6 = Static31.aClass45Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2180 == 1) {
				local15 = local6.anInt2191 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2185 + (local6.anInt2186 * local15 >> 8);
					local37 = local6.anInt2206 + (local6.anInt2195 * local15 >> 8);
					local47 = local6.anInt2179 + (local6.anInt2203 * local15 >> 8);
					local57 = local6.anInt2204 + (local6.anInt2181 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2180 == 2) {
				local15 = arg0 - local6.anInt2191;
				if (local15 > 0) {
					local27 = local6.anInt2185 + (local6.anInt2186 * local15 >> 8);
					local37 = local6.anInt2206 + (local6.anInt2195 * local15 >> 8);
					local47 = local6.anInt2179 + (local6.anInt2203 * local15 >> 8);
					local57 = local6.anInt2204 + (local6.anInt2181 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2180 == 3) {
				local15 = local6.anInt2185 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2191 + (local6.anInt2193 * local15 >> 8);
					local37 = local6.anInt2187 + (local6.anInt2184 * local15 >> 8);
					local47 = local6.anInt2179 + (local6.anInt2203 * local15 >> 8);
					local57 = local6.anInt2204 + (local6.anInt2181 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2180 == 4) {
				local15 = arg2 - local6.anInt2185;
				if (local15 > 0) {
					local27 = local6.anInt2191 + (local6.anInt2193 * local15 >> 8);
					local37 = local6.anInt2187 + (local6.anInt2184 * local15 >> 8);
					local47 = local6.anInt2179 + (local6.anInt2203 * local15 >> 8);
					local57 = local6.anInt2204 + (local6.anInt2181 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2180 == 5) {
				local15 = arg1 - local6.anInt2179;
				if (local15 > 0) {
					local27 = local6.anInt2191 + (local6.anInt2193 * local15 >> 8);
					local37 = local6.anInt2187 + (local6.anInt2184 * local15 >> 8);
					local47 = local6.anInt2185 + (local6.anInt2186 * local15 >> 8);
					local57 = local6.anInt2206 + (local6.anInt2195 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "(III)Lclient!jd;")
	public Class32 method612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass32_1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!rc;IIIIIII)V")
	private void method613(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static31.anInt1022;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static31.anInt1026;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray2[arg1][arg6][arg7] - Static31.anInt1011;
		@Pc(51) int local51 = this.anIntArrayArrayArray2[arg1][arg6 + 1][arg7] - Static31.anInt1011;
		@Pc(66) int local66 = this.anIntArrayArrayArray2[arg1][arg6 + 1][arg7 + 1] - Static31.anInt1011;
		@Pc(79) int local79 = this.anIntArrayArrayArray2[arg1][arg6][arg7 + 1] - Static31.anInt1011;
		@Pc(89) int local89 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(99) int local99 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(101) int local101 = local89;
		@Pc(111) int local111 = local38 * arg3 - local99 * arg2 >> 16;
		@Pc(121) int local121 = local38 * arg2 + local99 * arg3 >> 16;
		@Pc(123) int local123 = local111;
		if (local121 < 50) {
			return;
		}
		local89 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(147) int local147 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local89;
		local89 = local51 * arg3 - local147 * arg2 >> 16;
		@Pc(169) int local169 = local51 * arg2 + local147 * arg3 >> 16;
		local51 = local89;
		if (local169 < 50) {
			return;
		}
		local89 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(197) int local197 = local89;
		local89 = local66 * arg3 - local27 * arg2 >> 16;
		local27 = local66 * arg2 + local27 * arg3 >> 16;
		local66 = local89;
		if (local27 < 50) {
			return;
		}
		local89 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(243) int local243 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(245) int local245 = local89;
		local89 = local79 * arg3 - local243 * arg2 >> 16;
		@Pc(265) int local265 = local79 * arg2 + local243 * arg3 >> 16;
		if (local265 < 50) {
			return;
		}
		@Pc(279) int local279 = Static10.anInt407 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static10.anInt399 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static10.anInt407 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static10.anInt399 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static10.anInt407 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static10.anInt399 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static10.anInt407 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static10.anInt399 + (local89 << 9) / local265;
		Static10.anInt405 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static10.aBoolean30 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static10.anInt404 || local327 > Static10.anInt404 || local295 > Static10.anInt404) {
				Static10.aBoolean30 = true;
			}
			if (Static31.aBoolean66 && this.method609(Static31.anInt1034, Static31.anInt1024, local319, local335, local303, local311, local327, local295)) {
				Static31.anInt1010 = arg6;
				Static31.anInt1018 = arg7;
			}
			if (arg0.anInt2548 == -1) {
				if (arg0.anInt2557 != 12345678) {
					Static10.method245(local319, local335, local303, local311, local327, local295, arg0.anInt2557, arg0.anInt2555, arg0.anInt2556);
				}
			} else if (Static31.aBoolean65) {
				local472 = Static10.anInterface1_1.method119(arg0.anInt2548);
				Static10.method245(local319, local335, local303, local311, local327, local295, Static31.method594(local472, arg0.anInt2557), Static31.method594(local472, arg0.anInt2555), Static31.method594(local472, arg0.anInt2556));
			} else if (arg0.aBoolean130) {
				Static10.method242(local319, local335, local303, local311, local327, local295, arg0.anInt2557, arg0.anInt2555, arg0.anInt2556, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt2548);
			} else {
				Static10.method242(local319, local335, local303, local311, local327, local295, arg0.anInt2557, arg0.anInt2555, arg0.anInt2556, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt2548);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static10.aBoolean30 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static10.anInt404 || local295 > Static10.anInt404 || local327 > Static10.anInt404) {
			Static10.aBoolean30 = true;
		}
		if (Static31.aBoolean66 && this.method609(Static31.anInt1034, Static31.anInt1024, local287, local303, local335, local279, local295, local327)) {
			Static31.anInt1010 = arg6;
			Static31.anInt1018 = arg7;
		}
		if (arg0.anInt2548 != -1) {
			if (!Static31.aBoolean65) {
				Static10.method242(local287, local303, local335, local279, local295, local327, arg0.anInt2560, arg0.anInt2556, arg0.anInt2555, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt2548);
				return;
			}
			local472 = Static10.anInterface1_1.method119(arg0.anInt2548);
			Static10.method245(local287, local303, local335, local279, local295, local327, Static31.method594(local472, arg0.anInt2560), Static31.method594(local472, arg0.anInt2556), Static31.method594(local472, arg0.anInt2555));
		} else if (arg0.anInt2560 != 12345678) {
			Static10.method245(local287, local303, local335, local279, local295, local327, arg0.anInt2560, arg0.anInt2556, arg0.anInt2555);
			return;
		}
	}

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "(III)V")
	public void method614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt782; local13++) {
			@Pc(19) Class54 local19 = local8.aClass54Array1[local13];
			if ((local19.anInt2710 >> 29 & 0x3) == 2 && local19.anInt2697 == arg1 && local19.anInt2708 == arg2) {
				this.method578(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([IIIIII)V")
	public void method615(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class51 local14 = local8.aClass51_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt2552;
			if (local19 != 0) {
				for (local24 = 0; local24 < 4; local24++) {
					arg0[arg1] = local19;
					arg0[arg1 + 1] = local19;
					arg0[arg1 + 2] = local19;
					arg0[arg1 + 3] = local19;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(59) Class25 local59 = local8.aClass25_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt1358;
		@Pc(68) int local68 = local59.anInt1360;
		@Pc(71) int local71 = local59.anInt1359;
		@Pc(74) int local74 = local59.anInt1357;
		@Pc(79) int[] local79 = this.anIntArrayArray9[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray8[local68];
		@Pc(86) int local86 = 0;
		@Pc(90) int local90;
		if (local71 != 0) {
			for (local90 = 0; local90 < 4; local90++) {
				arg0[arg1] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 1] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 2] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 3] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg1 += 512;
			}
			return;
		}
		for (local90 = 0; local90 < 4; local90++) {
			if (local79[local84[local86++]] != 0) {
				arg0[arg1] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 1] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 2] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 3] = local74;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "(III)Lclient!t;")
	public Class54 method617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt782; local14++) {
			@Pc(20) Class54 local20 = local8.aClass54Array1[local14];
			if ((local20.anInt2710 >> 29 & 0x3) == 2 && local20.anInt2697 == arg1 && local20.anInt2708 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIILclient!dc;IZII)Z")
	private boolean method618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub1_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt1033 || local4 >= this.anInt1025) {
					return false;
				}
				@Pc(28) Class2_Sub6 local28 = this.aClass2_Sub6ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt782 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class54 local52 = new Class54();
		local52.anInt2710 = arg11;
		local52.anInt2704 = arg12;
		local52.anInt2707 = arg0;
		local52.anInt2703 = arg5;
		local52.anInt2712 = arg6;
		local52.anInt2698 = arg7;
		local52.aClass2_Sub1_Sub1_7 = arg8;
		local52.anInt2706 = arg9;
		local52.anInt2697 = arg1;
		local52.anInt2708 = arg2;
		local52.anInt2700 = arg1 + arg3 - 1;
		local52.anInt2714 = arg2 + arg4 - 1;
		for (@Pc(98) int local98 = arg1; local98 < arg1 + arg3; local98++) {
			for (@Pc(101) int local101 = arg2; local101 < arg2 + arg4; local101++) {
				@Pc(104) int local104 = 0;
				if (local98 > arg1) {
					local104++;
				}
				if (local98 < arg1 + arg3 - 1) {
					local104 += 4;
				}
				if (local101 > arg2) {
					local104 += 8;
				}
				if (local101 < arg2 + arg4 - 1) {
					local104 += 2;
				}
				for (@Pc(130) int local130 = arg0; local130 >= 0; local130--) {
					if (this.aClass2_Sub6ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass2_Sub6ArrayArrayArray1[local130][local98][local101] = new Class2_Sub6(local130, local98, local101);
					}
				}
				@Pc(166) Class2_Sub6 local166 = this.aClass2_Sub6ArrayArrayArray1[arg0][local98][local101];
				local166.aClass54Array1[local166.anInt782] = local52;
				local166.anIntArray107[local166.anInt782] = local104;
				local166.anInt793 |= local104;
				local166.anInt782++;
			}
		}
		if (arg10) {
			this.aClass54Array2[this.anInt1027++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(IIIIII)V")
	public void method619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt1033 * 128) {
			arg0 = this.anInt1033 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt1025 * 128) {
			arg2 = this.anInt1025 * 128 - 1;
		}
		Static31.anInt1030++;
		Static31.anInt1021 = Static86.anIntArray354[arg3];
		Static31.anInt1023 = Static86.anIntArray363[arg3];
		Static31.anInt1036 = Static86.anIntArray354[arg4];
		Static31.anInt1016 = Static86.anIntArray363[arg4];
		Static31.aBooleanArrayArray1 = Static31.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static31.anInt1022 = arg0;
		Static31.anInt1011 = arg1;
		Static31.anInt1026 = arg2;
		Static31.anInt1031 = arg0 / 128;
		Static31.anInt1014 = arg2 / 128;
		Static31.anInt1019 = arg5;
		Static31.anInt1020 = Static31.anInt1031 - 25;
		if (Static31.anInt1020 < 0) {
			Static31.anInt1020 = 0;
		}
		Static31.anInt1028 = Static31.anInt1014 - 25;
		if (Static31.anInt1028 < 0) {
			Static31.anInt1028 = 0;
		}
		Static31.anInt1029 = Static31.anInt1031 + 25;
		if (Static31.anInt1029 > this.anInt1033) {
			Static31.anInt1029 = this.anInt1033;
		}
		Static31.anInt1009 = Static31.anInt1014 + 25;
		if (Static31.anInt1009 > this.anInt1025) {
			Static31.anInt1009 = this.anInt1025;
		}
		this.method580();
		Static31.anInt1013 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt1012; local128 < this.anInt1017; local128++) {
			@Pc(134) Class2_Sub6[][] local134 = this.aClass2_Sub6ArrayArrayArray1[local128];
			for (local136 = Static31.anInt1020; local136 < Static31.anInt1029; local136++) {
				for (local139 = Static31.anInt1028; local139 < Static31.anInt1009; local139++) {
					@Pc(146) Class2_Sub6 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt778 <= arg5 && (Static31.aBooleanArrayArray1[local136 + 25 - Static31.anInt1031][local139 + 25 - Static31.anInt1014] || this.anIntArrayArrayArray2[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean52 = true;
							local146.aBoolean54 = true;
							if (local146.anInt782 > 0) {
								local146.aBoolean53 = true;
							} else {
								local146.aBoolean53 = false;
							}
							Static31.anInt1013++;
						} else {
							local146.aBoolean52 = false;
							local146.aBoolean54 = false;
							local146.anInt781 = 0;
						}
					}
				}
			}
		}
		@Pc(241) int local241;
		@Pc(249) int local249;
		@Pc(254) int local254;
		@Pc(258) int local258;
		@Pc(237) int local237;
		for (@Pc(224) int local224 = this.anInt1012; local224 < this.anInt1017; local224++) {
			@Pc(230) Class2_Sub6[][] local230 = this.aClass2_Sub6ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static31.anInt1031 + local139;
				local241 = Static31.anInt1031 - local139;
				if (local237 >= Static31.anInt1020 || local241 < Static31.anInt1029) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static31.anInt1014 + local249;
						local258 = Static31.anInt1014 - local249;
						@Pc(270) Class2_Sub6 local270;
						if (local237 >= Static31.anInt1020) {
							if (local254 >= Static31.anInt1028) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean52) {
									this.method579(local270, true);
								}
							}
							if (local258 < Static31.anInt1009) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean52) {
									this.method579(local270, true);
								}
							}
						}
						if (local241 < Static31.anInt1029) {
							if (local254 >= Static31.anInt1028) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean52) {
									this.method579(local270, true);
								}
							}
							if (local258 < Static31.anInt1009) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean52) {
									this.method579(local270, true);
								}
							}
						}
						if (Static31.anInt1013 == 0) {
							Static31.aBoolean66 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt1012; local136 < this.anInt1017; local136++) {
			@Pc(361) Class2_Sub6[][] local361 = this.aClass2_Sub6ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static31.anInt1031 + local237;
				local249 = Static31.anInt1031 - local237;
				if (local241 >= Static31.anInt1020 || local249 < Static31.anInt1029) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static31.anInt1014 + local254;
						@Pc(389) int local389 = Static31.anInt1014 - local254;
						@Pc(401) Class2_Sub6 local401;
						if (local241 >= Static31.anInt1020) {
							if (local258 >= Static31.anInt1028) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean52) {
									this.method579(local401, false);
								}
							}
							if (local389 < Static31.anInt1009) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean52) {
									this.method579(local401, false);
								}
							}
						}
						if (local249 < Static31.anInt1029) {
							if (local258 >= Static31.anInt1028) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean52) {
									this.method579(local401, false);
								}
							}
							if (local389 < Static31.anInt1009) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean52) {
									this.method579(local401, false);
								}
							}
						}
						if (Static31.anInt1013 == 0) {
							Static31.aBoolean66 = false;
							return;
						}
					}
				}
			}
		}
		Static31.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(IIII)I")
	public int method620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass39_1 != null && local8.aClass39_1.anInt1877 == arg3) {
			return local8.aClass39_1.anInt1876 & 0xFF;
		} else if (local8.aClass32_1 != null && local8.aClass32_1.anInt1472 == arg3) {
			return local8.aClass32_1.anInt1468 & 0xFF;
		} else if (local8.aClass63_1 != null && local8.aClass63_1.anInt2835 == arg3) {
			return local8.aClass63_1.anInt2846 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt782; local56++) {
				if (local8.aClass54Array1[local56].anInt2710 == arg3) {
					return local8.aClass54Array1[local56].anInt2704 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "(III)V")
	public void method621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass63_1 = null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "(III)V")
	public void method622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass39_1 = null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "(III)Lclient!w;")
	public Class63 method623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub6 local8 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass63_1 == null ? null : local8.aClass63_1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public void method624(@OriginalArg(0) int arg0) {
		this.anInt1012 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt1033; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1025; local7++) {
				if (this.aClass2_Sub6ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass2_Sub6ArrayArrayArray1[arg0][local4][local7] = new Class2_Sub6(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIILclient!dc;III)Z")
	public boolean method625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method618(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)V")
	public void method626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static31.aBoolean66 = true;
		Static31.anInt1034 = arg0;
		Static31.anInt1024 = arg1;
		Static31.anInt1010 = -1;
		Static31.anInt1018 = -1;
	}
}

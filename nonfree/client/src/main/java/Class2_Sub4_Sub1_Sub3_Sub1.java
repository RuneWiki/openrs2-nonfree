import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class2_Sub4_Sub1_Sub3_Sub1 extends Class2_Sub4_Sub1_Sub3 {

	@OriginalMember(owner = "client!ha", name = "bc", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!ha", name = "cc", descriptor = "[I")
	private int[] anIntArray152;

	@OriginalMember(owner = "client!ha", name = "dc", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!ha", name = "ec", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!ha", name = "fc", descriptor = "[I")
	private int[] anIntArray154;

	@OriginalMember(owner = "client!ha", name = "gc", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!ha", name = "hc", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!ha", name = "jc", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!ha", name = "kc", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!ha", name = "nc", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!ha", name = "pc", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!ha", name = "qc", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!ha", name = "rc", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "client!ha", name = "mc", descriptor = "B")
	private byte aByte2 = 0;

	@OriginalMember(owner = "client!ha", name = "sc", descriptor = "I")
	private int anInt1780 = 0;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub1_Sub3_Sub1() {
	}

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!ka;IIIII)V")
	public Class2_Sub4_Sub1_Sub3_Sub1(@OriginalArg(0) Class2_Sub4_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method1535();
		arg0.method1536();
		super.anInt1776 = arg0.anInt2179;
		super.anIntArray147 = arg0.anIntArray215;
		super.anIntArray151 = arg0.anIntArray213;
		super.anIntArray149 = arg0.anIntArray214;
		super.anInt1775 = arg0.anInt2182;
		this.anIntArray159 = arg0.anIntArray208;
		this.anIntArray153 = arg0.anIntArray207;
		this.anIntArray157 = arg0.anIntArray205;
		this.aByteArray18 = arg0.aByteArray25;
		this.aByteArray15 = arg0.aByteArray23;
		this.aByte2 = arg0.aByte4;
		super.anIntArrayArray9 = arg0.anIntArrayArray21;
		super.anIntArrayArray10 = arg0.anIntArrayArray20;
		@Pc(78) int local78 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(84) int local84 = arg2 * local78 >> 8;
		this.anIntArray160 = new int[super.anInt1775];
		this.anIntArray154 = new int[super.anInt1775];
		this.anIntArray155 = new int[super.anInt1775];
		@Pc(109) int local109;
		if (arg0.aShortArray21 == null) {
			this.aShortArray18 = null;
		} else {
			this.aShortArray18 = new short[super.anInt1775];
			for (local109 = 0; local109 < super.anInt1775; local109++) {
				@Pc(115) short local115 = arg0.aShortArray21[local109];
				if (local115 != -1 && Static25.anInterface2_1.method2661(local115)) {
					this.aShortArray18[local109] = local115;
				} else {
					this.aShortArray18[local109] = -1;
				}
			}
		}
		@Pc(286) int local286;
		if (arg0.anInt2180 > 0 && arg0.aByteArray31 != null) {
			@Pc(153) int[] local153 = new int[arg0.anInt2180];
			for (@Pc(155) int local155 = 0; local155 < super.anInt1775; local155++) {
				if (arg0.aByteArray31[local155] != -1) {
					local153[arg0.aByteArray31[local155] & 0xFF]++;
				}
			}
			this.anInt1780 = 0;
			for (@Pc(184) int local184 = 0; local184 < arg0.anInt2180; local184++) {
				if (local153[local184] > 0 && arg0.aByteArray29[local184] == 0) {
					this.anInt1780++;
				}
			}
			this.anIntArray158 = new int[this.anInt1780];
			this.anIntArray156 = new int[this.anInt1780];
			this.anIntArray152 = new int[this.anInt1780];
			@Pc(222) int local222 = 0;
			for (@Pc(224) int local224 = 0; local224 < arg0.anInt2180; local224++) {
				if (local153[local224] > 0 && arg0.aByteArray29[local224] == 0) {
					this.anIntArray158[local222] = arg0.aShortArray22[local224] & 0xFFFF;
					this.anIntArray156[local222] = arg0.aShortArray24[local224] & 0xFFFF;
					this.anIntArray152[local222] = arg0.aShortArray26[local224] & 0xFFFF;
					local153[local224] = local222++;
				} else {
					local153[local224] = -1;
				}
			}
			this.aByteArray17 = new byte[super.anInt1775];
			for (local286 = 0; local286 < super.anInt1775; local286++) {
				if (arg0.aByteArray31[local286] == -1) {
					this.aByteArray17[local286] = -1;
				} else {
					this.aByteArray17[local286] = (byte) local153[arg0.aByteArray31[local286] & 0xFF];
					if (this.aByteArray17[local286] == -1 && this.aShortArray18 != null) {
						this.aShortArray18[local286] = -1;
					}
				}
			}
		}
		for (local109 = 0; local109 < super.anInt1775; local109++) {
			@Pc(339) byte local339;
			if (arg0.aByteArray22 == null) {
				local339 = 0;
			} else {
				local339 = arg0.aByteArray22[local109];
			}
			@Pc(350) byte local350;
			if (arg0.aByteArray23 == null) {
				local350 = 0;
			} else {
				local350 = arg0.aByteArray23[local109];
			}
			@Pc(361) short local361;
			if (this.aShortArray18 == null) {
				local361 = -1;
			} else {
				local361 = this.aShortArray18[local109];
			}
			if (local350 == -2) {
				local339 = 3;
			}
			if (local350 == -1) {
				local339 = 2;
			}
			@Pc(408) Class20 local408;
			@Pc(569) Class30 local569;
			if (local361 == -1) {
				if (local339 == 0) {
					@Pc(389) int local389 = arg0.aShortArray20[local109] & 0xFFFF;
					if (arg0.aClass20Array1 == null || arg0.aClass20Array1[this.anIntArray159[local109]] == null) {
						local408 = arg0.aClass20Array2[this.anIntArray159[local109]];
					} else {
						local408 = arg0.aClass20Array1[this.anIntArray159[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt1157 + arg4 * local408.anInt1152 + arg5 * local408.anInt1153) / (local84 * local408.anInt1156);
					this.anIntArray160[local109] = Static65.method1205(local389, local286);
					if (arg0.aClass20Array1 == null || arg0.aClass20Array1[this.anIntArray153[local109]] == null) {
						local408 = arg0.aClass20Array2[this.anIntArray153[local109]];
					} else {
						local408 = arg0.aClass20Array1[this.anIntArray153[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt1157 + arg4 * local408.anInt1152 + arg5 * local408.anInt1153) / (local84 * local408.anInt1156);
					this.anIntArray154[local109] = Static65.method1205(local389, local286);
					if (arg0.aClass20Array1 == null || arg0.aClass20Array1[this.anIntArray157[local109]] == null) {
						local408 = arg0.aClass20Array2[this.anIntArray157[local109]];
					} else {
						local408 = arg0.aClass20Array1[this.anIntArray157[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt1157 + arg4 * local408.anInt1152 + arg5 * local408.anInt1153) / (local84 * local408.anInt1156);
					this.anIntArray155[local109] = Static65.method1205(local389, local286);
				} else if (local339 == 1) {
					local569 = arg0.aClass30Array1[local109];
					local286 = arg1 + (arg3 * local569.anInt1788 + arg4 * local569.anInt1791 + arg5 * local569.anInt1790) / (local84 + local84 / 2);
					this.anIntArray160[local109] = Static65.method1205(arg0.aShortArray20[local109] & 0xFFFF, local286);
					this.anIntArray155[local109] = -1;
				} else if (local339 == 3) {
					this.anIntArray160[local109] = 128;
					this.anIntArray155[local109] = -1;
				} else {
					this.anIntArray155[local109] = -2;
				}
			} else if (local339 == 0) {
				if (arg0.aClass20Array1 == null || arg0.aClass20Array1[this.anIntArray159[local109]] == null) {
					local408 = arg0.aClass20Array2[this.anIntArray159[local109]];
				} else {
					local408 = arg0.aClass20Array1[this.anIntArray159[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt1157 + arg4 * local408.anInt1152 + arg5 * local408.anInt1153) / (local84 * local408.anInt1156);
				this.anIntArray160[local109] = Static65.method1212(local286);
				if (arg0.aClass20Array1 == null || arg0.aClass20Array1[this.anIntArray153[local109]] == null) {
					local408 = arg0.aClass20Array2[this.anIntArray153[local109]];
				} else {
					local408 = arg0.aClass20Array1[this.anIntArray153[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt1157 + arg4 * local408.anInt1152 + arg5 * local408.anInt1153) / (local84 * local408.anInt1156);
				this.anIntArray154[local109] = Static65.method1212(local286);
				if (arg0.aClass20Array1 == null || arg0.aClass20Array1[this.anIntArray157[local109]] == null) {
					local408 = arg0.aClass20Array2[this.anIntArray157[local109]];
				} else {
					local408 = arg0.aClass20Array1[this.anIntArray157[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt1157 + arg4 * local408.anInt1152 + arg5 * local408.anInt1153) / (local84 * local408.anInt1156);
				this.anIntArray155[local109] = Static65.method1212(local286);
			} else if (local339 == 1) {
				local569 = arg0.aClass30Array1[local109];
				local286 = arg1 + (arg3 * local569.anInt1788 + arg4 * local569.anInt1791 + arg5 * local569.anInt1790) / (local84 + local84 / 2);
				this.anIntArray160[local109] = Static65.method1212(local286);
				this.anIntArray155[local109] = -1;
			} else {
				this.anIntArray155[local109] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "([Lclient!ha;I)V")
	private Class2_Sub4_Sub1_Sub3_Sub1(@OriginalArg(0) Class2_Sub4_Sub1_Sub3_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		super.anInt1776 = 0;
		super.anInt1775 = 0;
		this.anInt1780 = 0;
		this.aByte2 = -1;
		for (@Pc(29) int local29 = 0; local29 < arg1; local29++) {
			@Pc(34) Class2_Sub4_Sub1_Sub3_Sub1 local34 = arg0[local29];
			if (local34 != null) {
				super.anInt1776 += local34.anInt1776;
				super.anInt1775 += local34.anInt1775;
				this.anInt1780 += local34.anInt1780;
				if (local34.aByteArray18 == null) {
					if (this.aByte2 == -1) {
						this.aByte2 = local34.aByte2;
					}
					if (this.aByte2 != local34.aByte2) {
						local9 = true;
					}
				} else {
					local9 = true;
				}
				local11 |= local34.aByteArray15 != null;
				local13 |= local34.aShortArray18 != null;
				local15 |= local34.aByteArray17 != null;
			}
		}
		super.anIntArray147 = new int[super.anInt1776];
		super.anIntArray151 = new int[super.anInt1776];
		super.anIntArray149 = new int[super.anInt1776];
		this.anIntArray159 = new int[super.anInt1775];
		this.anIntArray153 = new int[super.anInt1775];
		this.anIntArray157 = new int[super.anInt1775];
		this.anIntArray160 = new int[super.anInt1775];
		this.anIntArray154 = new int[super.anInt1775];
		this.anIntArray155 = new int[super.anInt1775];
		if (local9) {
			this.aByteArray18 = new byte[super.anInt1775];
		}
		if (local11) {
			this.aByteArray15 = new byte[super.anInt1775];
		}
		if (local13) {
			this.aShortArray18 = new short[super.anInt1775];
		}
		if (local15) {
			this.aByteArray17 = new byte[super.anInt1775];
		}
		if (this.anInt1780 > 0) {
			this.anIntArray158 = new int[this.anInt1780];
			this.anIntArray156 = new int[this.anInt1780];
			this.anIntArray152 = new int[this.anInt1780];
		}
		super.anInt1776 = 0;
		super.anInt1775 = 0;
		this.anInt1780 = 0;
		for (@Pc(211) int local211 = 0; local211 < arg1; local211++) {
			@Pc(216) Class2_Sub4_Sub1_Sub3_Sub1 local216 = arg0[local211];
			if (local216 != null) {
				for (@Pc(220) int local220 = 0; local220 < local216.anInt1775; local220++) {
					this.anIntArray159[super.anInt1775] = local216.anIntArray159[local220] + super.anInt1776;
					this.anIntArray153[super.anInt1775] = local216.anIntArray153[local220] + super.anInt1776;
					this.anIntArray157[super.anInt1775] = local216.anIntArray157[local220] + super.anInt1776;
					this.anIntArray160[super.anInt1775] = local216.anIntArray160[local220];
					this.anIntArray154[super.anInt1775] = local216.anIntArray154[local220];
					this.anIntArray155[super.anInt1775] = local216.anIntArray155[local220];
					if (local9) {
						if (local216.aByteArray18 == null) {
							this.aByteArray18[super.anInt1775] = local216.aByte2;
						} else {
							this.aByteArray18[super.anInt1775] = local216.aByteArray18[local220];
						}
					}
					if (local11 && local216.aByteArray15 != null) {
						this.aByteArray15[super.anInt1775] = local216.aByteArray15[local220];
					}
					if (local13) {
						if (local216.aShortArray18 == null) {
							this.aShortArray18[super.anInt1775] = -1;
						} else {
							this.aShortArray18[super.anInt1775] = local216.aShortArray18[local220];
						}
					}
					if (local15) {
						if (local216.aByteArray17 == null || local216.aByteArray17[local220] == -1) {
							this.aByteArray17[super.anInt1775] = -1;
						} else {
							this.aByteArray17[super.anInt1775] = (byte) (local216.aByteArray17[local220] + this.anInt1780);
						}
					}
					super.anInt1775++;
				}
				for (@Pc(385) int local385 = 0; local385 < local216.anInt1780; local385++) {
					this.anIntArray158[this.anInt1780] = local216.anIntArray158[local385] + super.anInt1776;
					this.anIntArray156[this.anInt1780] = local216.anIntArray156[local385] + super.anInt1776;
					this.anIntArray152[this.anInt1780] = local216.anIntArray152[local385] + super.anInt1776;
					this.anInt1780++;
				}
				for (@Pc(435) int local435 = 0; local435 < local216.anInt1776; local435++) {
					super.anIntArray147[super.anInt1776] = local216.anIntArray147[local435];
					super.anIntArray151[super.anInt1776] = local216.anIntArray151[local435];
					super.anIntArray149[super.anInt1776] = local216.anIntArray149[local435];
					super.anInt1776++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!dc;ILclient!dc;I[I)V")
	@Override
	public void method1198(@OriginalArg(0) Class2_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub4_Sub5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1196(arg0, arg1);
			return;
		}
		@Pc(18) Class72 local18 = arg0.aClass72Array1[arg1];
		@Pc(23) Class72 local23 = arg2.aClass72Array1[arg3];
		@Pc(26) Class2_Sub24 local26 = local18.aClass2_Sub24_1;
		Static65.anInt1782 = 0;
		Static65.anInt1781 = 0;
		Static65.anInt1783 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt3249; local41++) {
			local47 = local18.anIntArray286[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray322[local47] == 0) {
				this.method1209(local26.anIntArray322[local47], local26.anIntArrayArray35[local47], local18.anIntArray289[local41], local18.anIntArray293[local41], local18.anIntArray288[local41]);
			}
		}
		Static65.anInt1782 = 0;
		Static65.anInt1781 = 0;
		Static65.anInt1783 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt3249; local47++) {
			@Pc(112) int local112 = local23.anIntArray286[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray322[local112] == 0) {
				this.method1209(local26.anIntArray322[local112], local26.anIntArrayArray35[local112], local23.anIntArray289[local47], local23.anIntArray293[local47], local23.anIntArray288[local47]);
			}
		}
		super.aBoolean88 = false;
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
	private void method1206(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static25.anInt795;
		@Pc(3) int local3 = Static25.anInt799;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray159[arg0];
		@Pc(15) int local15 = this.anIntArray153[arg0];
		@Pc(20) int local20 = this.anIntArray157[arg0];
		@Pc(24) int local24 = Static65.anIntArray178[local10];
		@Pc(28) int local28 = Static65.anIntArray178[local15];
		@Pc(32) int local32 = Static65.anIntArray178[local20];
		if (this.aByteArray15 == null) {
			Static25.anInt792 = 0;
		} else {
			Static25.anInt792 = this.aByteArray15[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static65.anIntArray172[0] = Static65.anIntArray162[local10];
			Static65.anIntArray166[0] = Static65.anIntArray173[local10];
			local5++;
			Static65.anIntArray168[0] = this.anIntArray160[arg0];
		} else {
			local73 = Static65.anIntArray169[local10];
			local77 = Static65.anIntArray170[local10];
			local82 = this.anIntArray160[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static65.anIntArray163[local32 - local24];
				Static65.anIntArray172[0] = local1 + (local73 + ((Static65.anIntArray169[local20] - local73) * local95 >> 16) << 9) / 50;
				Static65.anIntArray166[0] = local3 + (local77 + ((Static65.anIntArray170[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static65.anIntArray168[0] = local82 + ((this.anIntArray155[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static65.anIntArray163[local28 - local24];
				Static65.anIntArray172[local5] = local1 + (local73 + ((Static65.anIntArray169[local15] - local73) * local95 >> 16) << 9) / 50;
				Static65.anIntArray166[local5] = local3 + (local77 + ((Static65.anIntArray170[local15] - local77) * local95 >> 16) << 9) / 50;
				Static65.anIntArray168[local5++] = local82 + ((this.anIntArray154[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static65.anIntArray172[local5] = Static65.anIntArray162[local15];
			Static65.anIntArray166[local5] = Static65.anIntArray173[local15];
			Static65.anIntArray168[local5++] = this.anIntArray154[arg0];
		} else {
			local73 = Static65.anIntArray169[local15];
			local77 = Static65.anIntArray170[local15];
			local82 = this.anIntArray154[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static65.anIntArray163[local24 - local28];
				Static65.anIntArray172[local5] = local1 + (local73 + ((Static65.anIntArray169[local10] - local73) * local95 >> 16) << 9) / 50;
				Static65.anIntArray166[local5] = local3 + (local77 + ((Static65.anIntArray170[local10] - local77) * local95 >> 16) << 9) / 50;
				Static65.anIntArray168[local5++] = local82 + ((this.anIntArray160[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static65.anIntArray163[local32 - local28];
				Static65.anIntArray172[local5] = local1 + (local73 + ((Static65.anIntArray169[local20] - local73) * local95 >> 16) << 9) / 50;
				Static65.anIntArray166[local5] = local3 + (local77 + ((Static65.anIntArray170[local20] - local77) * local95 >> 16) << 9) / 50;
				Static65.anIntArray168[local5++] = local82 + ((this.anIntArray155[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static65.anIntArray172[local5] = Static65.anIntArray162[local20];
			Static65.anIntArray166[local5] = Static65.anIntArray173[local20];
			Static65.anIntArray168[local5++] = this.anIntArray155[arg0];
		} else {
			local73 = Static65.anIntArray169[local20];
			local77 = Static65.anIntArray170[local20];
			local82 = this.anIntArray155[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static65.anIntArray163[local28 - local32];
				Static65.anIntArray172[local5] = local1 + (local73 + ((Static65.anIntArray169[local15] - local73) * local95 >> 16) << 9) / 50;
				Static65.anIntArray166[local5] = local3 + (local77 + ((Static65.anIntArray170[local15] - local77) * local95 >> 16) << 9) / 50;
				Static65.anIntArray168[local5++] = local82 + ((this.anIntArray154[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static65.anIntArray163[local24 - local32];
				Static65.anIntArray172[local5] = local1 + (local73 + ((Static65.anIntArray169[local10] - local73) * local95 >> 16) << 9) / 50;
				Static65.anIntArray166[local5] = local3 + (local77 + ((Static65.anIntArray170[local10] - local77) * local95 >> 16) << 9) / 50;
				Static65.anIntArray168[local5++] = local82 + ((this.anIntArray160[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static65.anIntArray172[0];
		local77 = Static65.anIntArray172[1];
		local82 = Static65.anIntArray172[2];
		local95 = Static65.anIntArray166[0];
		@Pc(590) int local590 = Static65.anIntArray166[1];
		@Pc(594) int local594 = Static65.anIntArray166[2];
		Static25.aBoolean26 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static25.anInt800 || local77 > Static25.anInt800 || local82 > Static25.anInt800) {
				Static25.aBoolean26 = true;
			}
			if (this.aShortArray18 != null && this.aShortArray18[arg0] != -1) {
				if (this.aByteArray17 == null || this.aByteArray17[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray17[arg0] & 0xFF;
					local683 = this.anIntArray158[local678];
					local688 = this.anIntArray156[local678];
					local693 = this.anIntArray152[local678];
				}
				if (this.anIntArray155[arg0] == -1) {
					Static25.method540(local95, local590, local594, local73, local77, local82, this.anIntArray160[arg0], this.anIntArray160[arg0], this.anIntArray160[arg0], Static65.anIntArray169[local683], Static65.anIntArray169[local688], Static65.anIntArray169[local693], Static65.anIntArray170[local683], Static65.anIntArray170[local688], Static65.anIntArray170[local693], Static65.anIntArray178[local683], Static65.anIntArray178[local688], Static65.anIntArray178[local693], this.aShortArray18[arg0]);
				} else {
					Static25.method540(local95, local590, local594, local73, local77, local82, Static65.anIntArray168[0], Static65.anIntArray168[1], Static65.anIntArray168[2], Static65.anIntArray169[local683], Static65.anIntArray169[local688], Static65.anIntArray169[local693], Static65.anIntArray170[local683], Static65.anIntArray170[local688], Static65.anIntArray170[local693], Static65.anIntArray178[local683], Static65.anIntArray178[local688], Static65.anIntArray178[local693], this.aShortArray18[arg0]);
				}
			} else if (this.anIntArray155[arg0] == -1) {
				Static25.method553(local95, local590, local594, local73, local77, local82, Static65.anIntArray164[this.anIntArray160[arg0]]);
			} else {
				Static25.method546(local95, local590, local594, local73, local77, local82, Static65.anIntArray168[0], Static65.anIntArray168[1], Static65.anIntArray168[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static25.anInt800 || local77 > Static25.anInt800 || local82 > Static25.anInt800 || Static65.anIntArray172[3] < 0 || Static65.anIntArray172[3] > Static25.anInt800) {
			Static25.aBoolean26 = true;
		}
		if (this.aShortArray18 == null || this.aShortArray18[arg0] == -1) {
			if (this.anIntArray155[arg0] == -1) {
				local683 = Static65.anIntArray164[this.anIntArray160[arg0]];
				Static25.method553(local95, local590, local594, local73, local77, local82, local683);
				Static25.method553(local95, local594, Static65.anIntArray166[3], local73, local82, Static65.anIntArray172[3], local683);
				return;
			}
			Static25.method546(local95, local590, local594, local73, local77, local82, Static65.anIntArray168[0], Static65.anIntArray168[1], Static65.anIntArray168[2]);
			Static25.method546(local95, local594, Static65.anIntArray166[3], local73, local82, Static65.anIntArray172[3], Static65.anIntArray168[0], Static65.anIntArray168[2], Static65.anIntArray168[3]);
			return;
		}
		if (this.aByteArray17 == null || this.aByteArray17[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray17[arg0] & 0xFF;
			local683 = this.anIntArray158[local678];
			local688 = this.anIntArray156[local678];
			local693 = this.anIntArray152[local678];
		}
		@Pc(956) short local956 = this.aShortArray18[arg0];
		if (this.anIntArray155[arg0] == -1) {
			Static25.method540(local95, local590, local594, local73, local77, local82, this.anIntArray160[arg0], this.anIntArray160[arg0], this.anIntArray160[arg0], Static65.anIntArray169[local683], Static65.anIntArray169[local688], Static65.anIntArray169[local693], Static65.anIntArray170[local683], Static65.anIntArray170[local688], Static65.anIntArray170[local693], Static65.anIntArray178[local683], Static65.anIntArray178[local688], Static65.anIntArray178[local693], local956);
			Static25.method540(local95, local594, Static65.anIntArray166[3], local73, local82, Static65.anIntArray172[3], this.anIntArray160[arg0], this.anIntArray160[arg0], this.anIntArray160[arg0], Static65.anIntArray169[local683], Static65.anIntArray169[local688], Static65.anIntArray169[local693], Static65.anIntArray170[local683], Static65.anIntArray170[local688], Static65.anIntArray170[local693], Static65.anIntArray178[local683], Static65.anIntArray178[local688], Static65.anIntArray178[local693], local956);
			return;
		}
		Static25.method540(local95, local590, local594, local73, local77, local82, Static65.anIntArray168[0], Static65.anIntArray168[1], Static65.anIntArray168[2], Static65.anIntArray169[local683], Static65.anIntArray169[local688], Static65.anIntArray169[local693], Static65.anIntArray170[local683], Static65.anIntArray170[local688], Static65.anIntArray170[local693], Static65.anIntArray178[local683], Static65.anIntArray178[local688], Static65.anIntArray178[local693], local956);
		Static25.method540(local95, local594, Static65.anIntArray166[3], local73, local82, Static65.anIntArray172[3], Static65.anIntArray168[0], Static65.anIntArray168[2], Static65.anIntArray168[3], Static65.anIntArray169[local683], Static65.anIntArray169[local688], Static65.anIntArray169[local693], Static65.anIntArray170[local683], Static65.anIntArray170[local688], Static65.anIntArray170[local693], Static65.anIntArray178[local683], Static65.anIntArray178[local688], Static65.anIntArray178[local693], local956);
	}

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
	private void method1207(@OriginalArg(0) int arg0) {
		if (Static65.aBooleanArray13[arg0]) {
			this.method1206(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray159[arg0];
		@Pc(17) int local17 = this.anIntArray153[arg0];
		@Pc(22) int local22 = this.anIntArray157[arg0];
		Static25.aBoolean26 = Static65.aBooleanArray14[arg0];
		if (this.aByteArray15 == null) {
			Static25.anInt792 = 0;
		} else {
			Static25.anInt792 = this.aByteArray15[arg0] & 0xFF;
		}
		if (this.aShortArray18 != null && this.aShortArray18[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray17 == null || this.aByteArray17[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray17[arg0] & 0xFF;
				local133 = this.anIntArray158[local128];
				local138 = this.anIntArray156[local128];
				local143 = this.anIntArray152[local128];
			}
			if (this.anIntArray155[arg0] == -1) {
				Static25.method540(Static65.anIntArray173[local12], Static65.anIntArray173[local17], Static65.anIntArray173[local22], Static65.anIntArray162[local12], Static65.anIntArray162[local17], Static65.anIntArray162[local22], this.anIntArray160[arg0], this.anIntArray160[arg0], this.anIntArray160[arg0], Static65.anIntArray169[local133], Static65.anIntArray169[local138], Static65.anIntArray169[local143], Static65.anIntArray170[local133], Static65.anIntArray170[local138], Static65.anIntArray170[local143], Static65.anIntArray178[local133], Static65.anIntArray178[local138], Static65.anIntArray178[local143], this.aShortArray18[arg0]);
			} else {
				Static25.method540(Static65.anIntArray173[local12], Static65.anIntArray173[local17], Static65.anIntArray173[local22], Static65.anIntArray162[local12], Static65.anIntArray162[local17], Static65.anIntArray162[local22], this.anIntArray160[arg0], this.anIntArray154[arg0], this.anIntArray155[arg0], Static65.anIntArray169[local133], Static65.anIntArray169[local138], Static65.anIntArray169[local143], Static65.anIntArray170[local133], Static65.anIntArray170[local138], Static65.anIntArray170[local143], Static65.anIntArray178[local133], Static65.anIntArray178[local138], Static65.anIntArray178[local143], this.aShortArray18[arg0]);
			}
		} else if (this.anIntArray155[arg0] == -1) {
			Static25.method553(Static65.anIntArray173[local12], Static65.anIntArray173[local17], Static65.anIntArray173[local22], Static65.anIntArray162[local12], Static65.anIntArray162[local17], Static65.anIntArray162[local22], Static65.anIntArray164[this.anIntArray160[arg0]]);
		} else {
			Static25.method546(Static65.anIntArray173[local12], Static65.anIntArray173[local17], Static65.anIntArray173[local22], Static65.anIntArray162[local12], Static65.anIntArray162[local17], Static65.anIntArray162[local22], this.anIntArray160[arg0], this.anIntArray154[arg0], this.anIntArray155[arg0]);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!super.aBoolean88) {
			this.method1193();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (super.aShort22 * arg2 + super.aShort20 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-super.aShort22 * arg2 + super.aShort36 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + super.aShort22 << 9;
		if (local78 / local38 <= Static25.anInt797) {
			return;
		}
		@Pc(91) int local91 = local71 - super.aShort22 << 9;
		if (local91 / local38 >= Static25.anInt798) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (super.aShort22 * arg1 + super.aShort20 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static25.anInt796) {
			return;
		}
		@Pc(146) int local146 = local107 + (-super.aShort22 * arg1 + super.aShort36 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static25.anInt794) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt1780 > 0;
		@Pc(172) int local172 = Static25.anInt795;
		@Pc(174) int local174 = Static25.anInt799;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Static65.anIntArray165[arg0];
			local178 = Static65.anIntArray177[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		@Pc(240) int local240;
		if (arg8 > 0L && Static37.aBoolean89 && local57 > 0) {
			if (local71 > 0) {
				local204 = local91 / local38;
				local208 = local78 / local57;
			} else {
				local204 = local91 / local57;
				local208 = local78 / local38;
			}
			if (local107 > 0) {
				local223 = local146 / local38;
				local227 = local123 / local57;
			} else {
				local223 = local146 / local57;
				local227 = local123 / local38;
			}
			local240 = Static37.anInt1779 - Static25.anInt795;
			@Pc(244) int local244 = Static37.anInt1778 - Static25.anInt799;
			if (local240 >= local204 && local240 <= local208 && local244 >= local223 && local244 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(307) int[] local307 = new int[] { super.aShort21, super.aShort23, super.aShort21, super.aShort23, super.aShort21, super.aShort23, super.aShort21, super.aShort23 };
				@Pc(350) int[] local350 = new int[] { super.aShort26, super.aShort26, super.aShort25, super.aShort25, super.aShort26, super.aShort26, super.aShort25, super.aShort25 };
				@Pc(393) int[] local393 = new int[] { super.aShort36, super.aShort36, super.aShort36, super.aShort36, super.aShort20, super.aShort20, super.aShort20, super.aShort20 };
				for (@Pc(395) int local395 = 0; local395 < 8; local395++) {
					@Pc(400) int local400 = local307[local395];
					@Pc(404) int local404 = local393[local395];
					@Pc(408) int local408 = local350[local395];
					@Pc(420) int local420;
					if (arg0 != 0) {
						local420 = local408 * local176 + local400 * local178 >> 16;
						local408 = local408 * local178 - local400 * local176 >> 16;
						local400 = local420;
					}
					local400 += arg5;
					local404 += arg6;
					local408 += arg7;
					local420 = local408 * arg3 + local400 * arg4 >> 16;
					local408 = local408 * arg4 - local400 * arg3 >> 16;
					local400 = local420;
					local420 = local404 * arg2 - local408 * arg1 >> 16;
					local408 = local404 * arg1 + local408 * arg2 >> 16;
					if (local408 > 0) {
						@Pc(496) int local496 = (local400 << 9) / local408;
						@Pc(502) int local502 = (local420 << 9) / local408;
						if (local496 < local204) {
							local204 = local496;
						}
						if (local496 > local208) {
							local208 = local496;
						}
						if (local502 < local223) {
							local223 = local502;
						}
						if (local502 > local227) {
							local227 = local502;
						}
					}
				}
				if (local240 >= local204 && local240 <= local208 && local244 >= local223 && local244 <= local227) {
					if (super.aBoolean90) {
						Static37.aLongArray5[Static37.anInt1777++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < super.anInt1776; local204++) {
			local223 = super.anIntArray147[local204];
			local208 = super.anIntArray151[local204];
			local227 = super.anIntArray149[local204];
			if (arg0 != 0) {
				local240 = local227 * local176 + local223 * local178 >> 16;
				local227 = local227 * local178 - local223 * local176 >> 16;
				local223 = local240;
			}
			local223 += arg5;
			local208 += arg6;
			local227 += arg7;
			local240 = local227 * arg3 + local223 * arg4 >> 16;
			local227 = local227 * arg4 - local223 * arg3 >> 16;
			local223 = local240;
			local240 = local208 * arg2 - local227 * arg1 >> 16;
			local227 = local208 * arg1 + local227 * arg2 >> 16;
			Static65.anIntArray171[local204] = local227 - local24;
			if (local227 >= 50) {
				Static65.anIntArray162[local204] = local172 + (local223 << 9) / local227;
				Static65.anIntArray173[local204] = local174 + (local240 << 9) / local227;
			} else {
				Static65.anIntArray162[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static65.anIntArray169[local204] = local223;
				Static65.anIntArray170[local204] = local240;
				Static65.anIntArray178[local204] = local227;
			}
		}
		try {
			this.method1213(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(720) Exception local720) {
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[IIII)V")
	private void method1209(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static65.anInt1782 = 0;
			Static65.anInt1781 = 0;
			Static65.anInt1783 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < super.anIntArrayArray9.length) {
					@Pc(29) int[] local29 = super.anIntArrayArray9[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static65.anInt1782 += super.anIntArray147[local36];
						Static65.anInt1781 += super.anIntArray151[local36];
						Static65.anInt1783 += super.anIntArray149[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static65.anInt1782 = Static65.anInt1782 / local6 + arg2;
				Static65.anInt1781 = Static65.anInt1781 / local6 + arg3;
				Static65.anInt1783 = Static65.anInt1783 / local6 + arg4;
			} else {
				Static65.anInt1782 = arg2;
				Static65.anInt1781 = arg3;
				Static65.anInt1783 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray9.length) {
					local115 = super.anIntArrayArray9[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray147[local31] += arg2;
						super.anIntArray151[local31] += arg3;
						super.anIntArray149[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray9.length) {
					local115 = super.anIntArrayArray9[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray147[local31] -= Static65.anInt1782;
						super.anIntArray151[local31] -= Static65.anInt1781;
						super.anIntArray149[local31] -= Static65.anInt1783;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(253) int local253;
						if (local225 != 0) {
							local231 = Static65.anIntArray165[local225];
							local235 = Static65.anIntArray177[local225];
							local253 = super.anIntArray151[local31] * local231 + super.anIntArray147[local31] * local235 + 32767 >> 16;
							super.anIntArray151[local31] = super.anIntArray151[local31] * local235 + 32767 - super.anIntArray147[local31] * local231 >> 16;
							super.anIntArray147[local31] = local253;
						}
						if (local36 != 0) {
							local231 = Static65.anIntArray165[local36];
							local235 = Static65.anIntArray177[local36];
							local253 = super.anIntArray151[local31] * local235 + 32767 - super.anIntArray149[local31] * local231 >> 16;
							super.anIntArray149[local31] = super.anIntArray151[local31] * local231 + super.anIntArray149[local31] * local235 + 32767 >> 16;
							super.anIntArray151[local31] = local253;
						}
						if (local219 != 0) {
							local231 = Static65.anIntArray165[local219];
							local235 = Static65.anIntArray177[local219];
							local253 = super.anIntArray149[local31] * local231 + super.anIntArray147[local31] * local235 + 32767 >> 16;
							super.anIntArray149[local31] = super.anIntArray149[local31] * local235 + 32767 - super.anIntArray147[local31] * local231 >> 16;
							super.anIntArray147[local31] = local253;
						}
						super.anIntArray147[local31] += Static65.anInt1782;
						super.anIntArray151[local31] += Static65.anInt1781;
						super.anIntArray149[local31] += Static65.anInt1783;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray9.length) {
					local115 = super.anIntArrayArray9[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray147[local31] -= Static65.anInt1782;
						super.anIntArray151[local31] -= Static65.anInt1781;
						super.anIntArray149[local31] -= Static65.anInt1783;
						super.anIntArray147[local31] = super.anIntArray147[local31] * arg2 / 128;
						super.anIntArray151[local31] = super.anIntArray151[local31] * arg3 / 128;
						super.anIntArray149[local31] = super.anIntArray149[local31] * arg4 / 128;
						super.anIntArray147[local31] += Static65.anInt1782;
						super.anIntArray151[local31] += Static65.anInt1781;
						super.anIntArray149[local31] += Static65.anInt1783;
					}
				}
			}
		} else if (arg0 == 5 && (super.anIntArrayArray10 != null && this.aByteArray15 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray10.length) {
					local115 = super.anIntArrayArray10[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray15[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray15[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([[IIIIZI)Lclient!df;")
	@Override
	public Class2_Sub4_Sub1_Sub3 method1192(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1193();
		@Pc(6) int local6 = arg1 + super.aShort21;
		@Pc(11) int local11 = arg1 + super.aShort23;
		@Pc(16) int local16 = arg3 + super.aShort26;
		@Pc(21) int local21 = arg3 + super.aShort25;
		if (local6 < 0 || local11 + 128 >> 7 >= arg0.length || local16 < 0 || local21 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		local6 >>= 0x7;
		local11 = local11 + 127 >> 7;
		local16 >>= 0x7;
		local21 = local21 + 127 >> 7;
		if (arg0[local6][local16] == arg2 && arg0[local11][local16] == arg2 && arg0[local6][local21] == arg2 && arg0[local11][local21] == arg2) {
			return this;
		}
		@Pc(101) Class2_Sub4_Sub1_Sub3_Sub1 local101;
		if (arg4) {
			local101 = new Class2_Sub4_Sub1_Sub3_Sub1();
			local101.anInt1776 = super.anInt1776;
			local101.anInt1775 = super.anInt1775;
			local101.anInt1780 = this.anInt1780;
			local101.anIntArray147 = super.anIntArray147;
			local101.anIntArray149 = super.anIntArray149;
			local101.anIntArray159 = this.anIntArray159;
			local101.anIntArray153 = this.anIntArray153;
			local101.anIntArray157 = this.anIntArray157;
			local101.anIntArray160 = this.anIntArray160;
			local101.anIntArray154 = this.anIntArray154;
			local101.anIntArray155 = this.anIntArray155;
			local101.aByteArray18 = this.aByteArray18;
			local101.aByteArray15 = this.aByteArray15;
			local101.aByteArray17 = this.aByteArray17;
			local101.aShortArray18 = this.aShortArray18;
			local101.aByte2 = this.aByte2;
			local101.anIntArray158 = this.anIntArray158;
			local101.anIntArray156 = this.anIntArray156;
			local101.anIntArray152 = this.anIntArray152;
			local101.anIntArrayArray9 = super.anIntArrayArray9;
			local101.anIntArrayArray10 = super.anIntArrayArray10;
			local101.aBoolean90 = super.aBoolean90;
			local101.anIntArray151 = new int[local101.anInt1776];
		} else {
			local101 = this;
		}
		@Pc(201) int local201;
		@Pc(209) int local209;
		@Pc(216) int local216;
		@Pc(220) int local220;
		@Pc(224) int local224;
		@Pc(228) int local228;
		@Pc(232) int local232;
		@Pc(254) int local254;
		@Pc(280) int local280;
		@Pc(292) int local292;
		if (arg5 == 0) {
			for (local201 = 0; local201 < local101.anInt1776; local201++) {
				local209 = super.anIntArray147[local201] + arg1;
				local216 = super.anIntArray149[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray151[local201] = super.anIntArray151[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt1776; local201++) {
				local209 = (super.anIntArray151[local201] << 16) / super.aShort36;
				if (local209 < arg5) {
					local216 = super.anIntArray147[local201] + arg1;
					local220 = super.anIntArray149[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(416) int local416 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray151[local201] = super.anIntArray151[local201] + (local416 - arg2) * (arg5 - local209) / arg5;
				} else {
					local101.anIntArray151[local201] = super.anIntArray151[local201];
				}
			}
		}
		super.aBoolean88 = false;
		return local101;
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(Z)Lclient!df;")
	@Override
	public Class2_Sub4_Sub1_Sub3 method1201(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static65.aByteArray16.length < super.anInt1775) {
			Static65.aByteArray16 = new byte[super.anInt1775 + 100];
		}
		return this.method1214(arg0, Static65.aClass2_Sub4_Sub1_Sub3_Sub1_1, Static65.aByteArray16);
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(Z)Lclient!df;")
	@Override
	public Class2_Sub4_Sub1_Sub3 method1194(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static65.aByteArray19.length < super.anInt1775) {
			Static65.aByteArray19 = new byte[super.anInt1775 + 100];
		}
		return this.method1214(arg0, Static65.aClass2_Sub4_Sub1_Sub3_Sub1_2, Static65.aByteArray19);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!dc;I)V")
	@Override
	public void method1196(@OriginalArg(0) Class2_Sub4_Sub5 arg0, @OriginalArg(1) int arg1) {
		if (super.anIntArrayArray9 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class72 local12 = arg0.aClass72Array1[arg1];
		@Pc(15) Class2_Sub24 local15 = local12.aClass2_Sub24_1;
		Static65.anInt1782 = 0;
		Static65.anInt1781 = 0;
		Static65.anInt1783 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt3249; local23++) {
			@Pc(29) int local29 = local12.anIntArray286[local23];
			this.method1209(local15.anIntArray322[local29], local15.anIntArrayArray35[local29], local12.anIntArray289[local23], local12.anIntArray293[local23], local12.anIntArray288[local23]);
		}
		super.aBoolean88 = false;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!df;)Lclient!df;")
	public Class2_Sub4_Sub1_Sub3 method1210(@OriginalArg(0) Class2_Sub4_Sub1_Sub3 arg0) {
		return new Class2_Sub4_Sub1_Sub3_Sub1(new Class2_Sub4_Sub1_Sub3_Sub1[] { this, (Class2_Sub4_Sub1_Sub3_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method1188(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			this.method1193();
			@Pc(3) int local3 = Static25.anInt795;
			@Pc(5) int local5 = Static25.anInt799;
			@Pc(9) int local9 = Static65.anIntArray165[0];
			@Pc(13) int local13 = Static65.anIntArray177[0];
			@Pc(17) int local17 = Static65.anIntArray165[arg0];
			@Pc(21) int local21 = Static65.anIntArray177[arg0];
			@Pc(25) int local25 = Static65.anIntArray165[arg1];
			@Pc(29) int local29 = Static65.anIntArray177[arg1];
			@Pc(33) int local33 = Static65.anIntArray165[arg2];
			@Pc(37) int local37 = Static65.anIntArray177[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt1776; local49++) {
				@Pc(55) int local55 = super.anIntArray147[local49];
				@Pc(60) int local60 = super.anIntArray151[local49];
				@Pc(65) int local65 = super.anIntArray149[local49];
				@Pc(77) int local77;
				if (arg1 != 0) {
					local77 = local60 * local25 + local55 * local29 >> 16;
					local60 = local60 * local29 - local55 * local25 >> 16;
					local55 = local77;
				}
				if (arg0 != 0) {
					local77 = local65 * local17 + local55 * local21 >> 16;
					local65 = local65 * local21 - local55 * local17 >> 16;
					local55 = local77;
				}
				local55 += arg3;
				local60 += arg4;
				local65 += arg5;
				local77 = local60 * local37 - local65 * local33 >> 16;
				local65 = local60 * local33 + local65 * local37 >> 16;
				Static65.anIntArray171[local49] = local65 - local47;
				Static65.anIntArray162[local49] = local3 + (local55 << 9) / local65;
				Static65.anIntArray173[local49] = local5 + (local77 << 9) / local65;
				if (this.anInt1780 > 0) {
					Static65.anIntArray169[local49] = local55;
					Static65.anIntArray170[local49] = local77;
					Static65.anIntArray178[local49] = local65;
				}
			}
			this.method1213(false, false, 0L, super.aShort24, super.aShort24 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	public void method1204(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.method1193();
			@Pc(3) int local3 = Static25.anInt795;
			@Pc(5) int local5 = Static25.anInt799;
			@Pc(9) int local9 = Static65.anIntArray165[0];
			@Pc(13) int local13 = Static65.anIntArray177[0];
			@Pc(17) int local17 = Static65.anIntArray165[arg0];
			@Pc(21) int local21 = Static65.anIntArray177[arg0];
			@Pc(25) int local25 = Static65.anIntArray165[arg1];
			@Pc(29) int local29 = Static65.anIntArray177[arg1];
			@Pc(33) int local33 = Static65.anIntArray165[arg2];
			@Pc(37) int local37 = Static65.anIntArray177[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt1776; local49++) {
				@Pc(55) int local55 = super.anIntArray147[local49];
				@Pc(60) int local60 = super.anIntArray151[local49];
				@Pc(65) int local65 = super.anIntArray149[local49];
				@Pc(77) int local77;
				if (arg1 != 0) {
					local77 = local60 * local25 + local55 * local29 >> 16;
					local60 = local60 * local29 - local55 * local25 >> 16;
					local55 = local77;
				}
				if (arg0 != 0) {
					local77 = local65 * local17 + local55 * local21 >> 16;
					local65 = local65 * local21 - local55 * local17 >> 16;
					local55 = local77;
				}
				local55 += arg3;
				local60 += arg4;
				local65 += arg5;
				local77 = local60 * local37 - local65 * local33 >> 16;
				local65 = local60 * local33 + local65 * local37 >> 16;
				Static65.anIntArray171[local49] = local65 - local47;
				Static65.anIntArray162[local49] = local3 + (local55 << 9) / arg6;
				Static65.anIntArray173[local49] = local5 + (local77 << 9) / arg6;
				if (this.anInt1780 > 0) {
					Static65.anIntArray169[local49] = local55;
					Static65.anIntArray170[local49] = local77;
					Static65.anIntArray178[local49] = local65;
				}
			}
			this.method1213(false, false, 0L, super.aShort24, super.aShort24 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZZJII)V")
	private void method1213(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static65.anIntArray161[local5] = 0;
		}
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(93) int local93;
		for (@Pc(16) int local16 = 0; local16 < super.anInt1775; local16++) {
			if (this.anIntArray155[local16] != -2) {
				local28 = this.anIntArray159[local16];
				local33 = this.anIntArray153[local16];
				local38 = this.anIntArray157[local16];
				local42 = Static65.anIntArray162[local28];
				local46 = Static65.anIntArray162[local33];
				local50 = Static65.anIntArray162[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static65.anIntArray169[local28];
					local69 = Static65.anIntArray169[local33];
					@Pc(73) int local73 = Static65.anIntArray169[local38];
					@Pc(77) int local77 = Static65.anIntArray170[local28];
					local81 = Static65.anIntArray170[local33];
					local85 = Static65.anIntArray170[local38];
					@Pc(89) int local89 = Static65.anIntArray178[local28];
					local93 = Static65.anIntArray178[local33];
					@Pc(97) int local97 = Static65.anIntArray178[local38];
					local65 -= local69;
					@Pc(105) int local105 = local73 - local69;
					@Pc(109) int local109 = local77 - local81;
					@Pc(113) int local113 = local85 - local81;
					@Pc(117) int local117 = local89 - local93;
					@Pc(121) int local121 = local97 - local93;
					@Pc(129) int local129 = local109 * local121 - local117 * local113;
					@Pc(137) int local137 = local117 * local105 - local65 * local121;
					@Pc(145) int local145 = local65 * local113 - local109 * local105;
					if (local69 * local129 + local81 * local137 + local93 * local145 > 0) {
						Static65.aBooleanArray13[local16] = true;
						@Pc(177) int local177 = (Static65.anIntArray171[local28] + Static65.anIntArray171[local33] + Static65.anIntArray171[local38]) / 3 + arg3;
						Static65.anIntArrayArray12[local177][Static65.anIntArray161[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method1208(Static37.anInt1779, Static37.anInt1778, Static65.anIntArray173[local28], Static65.anIntArray173[local33], Static65.anIntArray173[local38], local42, local46, local50)) {
						Static37.aLongArray5[Static37.anInt1777++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static65.anIntArray173[local38] - Static65.anIntArray173[local33]) - (Static65.anIntArray173[local28] - Static65.anIntArray173[local33]) * (local50 - local46) > 0) {
						Static65.aBooleanArray13[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static25.anInt800 && local46 <= Static25.anInt800 && local50 <= Static25.anInt800) {
							Static65.aBooleanArray14[local16] = false;
						} else {
							Static65.aBooleanArray14[local16] = true;
						}
						local65 = (Static65.anIntArray171[local28] + Static65.anIntArray171[local33] + Static65.anIntArray171[local38]) / 3 + arg3;
						Static65.anIntArrayArray12[local65][Static65.anIntArray161[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray18 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static65.anIntArray161[local28];
				if (local33 > 0) {
					@Pc(324) int[] local324 = Static65.anIntArrayArray12[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method1207(local324[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static65.anIntArray176[local28] = 0;
			Static65.anIntArray174[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static65.anIntArray161[local33];
			if (local38 > 0) {
				@Pc(370) int[] local370 = Static65.anIntArrayArray12[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local370[local46];
					@Pc(382) byte local382 = this.aByteArray18[local50];
					local69 = Static65.anIntArray176[local382]++;
					Static65.anIntArrayArray11[local382][local69] = local50;
					if (local382 < 10) {
						Static65.anIntArray174[local382] += local33;
					} else if (local382 == 10) {
						Static65.anIntArray167[local69] = local33;
					} else {
						Static65.anIntArray175[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static65.anIntArray176[1] > 0 || Static65.anIntArray176[2] > 0) {
			local38 = (Static65.anIntArray174[1] + Static65.anIntArray174[2]) / (Static65.anIntArray176[1] + Static65.anIntArray176[2]);
		}
		local42 = 0;
		if (Static65.anIntArray176[3] > 0 || Static65.anIntArray176[4] > 0) {
			local42 = (Static65.anIntArray174[3] + Static65.anIntArray174[4]) / (Static65.anIntArray176[3] + Static65.anIntArray176[4]);
		}
		local46 = 0;
		if (Static65.anIntArray176[6] > 0 || Static65.anIntArray176[8] > 0) {
			local46 = (Static65.anIntArray174[6] + Static65.anIntArray174[8]) / (Static65.anIntArray176[6] + Static65.anIntArray176[8]);
		}
		local65 = 0;
		local69 = Static65.anIntArray176[10];
		@Pc(515) int[] local515 = Static65.anIntArrayArray11[10];
		@Pc(517) int[] local517 = Static65.anIntArray167;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static65.anIntArray176[11];
			local515 = Static65.anIntArrayArray11[11];
			local517 = Static65.anIntArray175;
		}
		if (local69 > 0) {
			local50 = local517[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method1207(local515[local65++]);
				if (local65 == local69 && local515 != Static65.anIntArrayArray11[11]) {
					local65 = 0;
					local69 = Static65.anIntArray176[11];
					local515 = Static65.anIntArrayArray11[11];
					local517 = Static65.anIntArray175;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method1207(local515[local65++]);
				if (local65 == local69 && local515 != Static65.anIntArrayArray11[11]) {
					local65 = 0;
					local69 = Static65.anIntArray176[11];
					local515 = Static65.anIntArrayArray11[11];
					local517 = Static65.anIntArray175;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method1207(local515[local65++]);
				if (local65 == local69 && local515 != Static65.anIntArrayArray11[11]) {
					local65 = 0;
					local69 = Static65.anIntArray176[11];
					local515 = Static65.anIntArrayArray11[11];
					local517 = Static65.anIntArray175;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static65.anIntArray176[local81];
			@Pc(680) int[] local680 = Static65.anIntArrayArray11[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method1207(local680[local93]);
			}
		}
		while (local50 != -1000) {
			this.method1207(local515[local65++]);
			if (local65 == local69 && local515 != Static65.anIntArrayArray11[11]) {
				local65 = 0;
				local515 = Static65.anIntArrayArray11[11];
				local69 = Static65.anIntArray176[11];
				local517 = Static65.anIntArray175;
			}
			if (local65 < local69) {
				local50 = local517[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLclient!ha;[B)Lclient!ha;")
	private Class2_Sub4_Sub1_Sub3_Sub1 method1214(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub4_Sub1_Sub3_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt1776 = super.anInt1776;
		arg1.anInt1775 = super.anInt1775;
		arg1.anInt1780 = this.anInt1780;
		if (arg1.anIntArray147 == null || arg1.anIntArray147.length < super.anInt1776) {
			arg1.anIntArray147 = new int[super.anInt1776 + 100];
			arg1.anIntArray151 = new int[super.anInt1776 + 100];
			arg1.anIntArray149 = new int[super.anInt1776 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < super.anInt1776; local43++) {
			arg1.anIntArray147[local43] = super.anIntArray147[local43];
			arg1.anIntArray151[local43] = super.anIntArray151[local43];
			arg1.anIntArray149[local43] = super.anIntArray149[local43];
		}
		if (arg0) {
			arg1.aByteArray15 = this.aByteArray15;
		} else {
			arg1.aByteArray15 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray15 == null) {
				for (local88 = 0; local88 < super.anInt1775; local88++) {
					arg1.aByteArray15[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < super.anInt1775; local88++) {
					arg1.aByteArray15[local88] = this.aByteArray15[local88];
				}
			}
		}
		arg1.anIntArray159 = this.anIntArray159;
		arg1.anIntArray153 = this.anIntArray153;
		arg1.anIntArray157 = this.anIntArray157;
		arg1.anIntArray160 = this.anIntArray160;
		arg1.anIntArray154 = this.anIntArray154;
		arg1.anIntArray155 = this.anIntArray155;
		arg1.aByteArray18 = this.aByteArray18;
		arg1.aByteArray17 = this.aByteArray17;
		arg1.aShortArray18 = this.aShortArray18;
		arg1.aByte2 = this.aByte2;
		arg1.anIntArray158 = this.anIntArray158;
		arg1.anIntArray156 = this.anIntArray156;
		arg1.anIntArray152 = this.anIntArray152;
		arg1.anIntArrayArray9 = super.anIntArrayArray9;
		arg1.anIntArrayArray10 = super.anIntArrayArray10;
		arg1.aBoolean90 = super.aBoolean90;
		arg1.aBoolean88 = false;
		return arg1;
	}
}

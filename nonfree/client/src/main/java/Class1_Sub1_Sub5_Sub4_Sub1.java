import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class1_Sub1_Sub5_Sub4_Sub1 extends Class1_Sub1_Sub5_Sub4 {

	@OriginalMember(owner = "client!fc", name = "pb", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!fc", name = "qb", descriptor = "[I")
	private int[] anIntArray104;

	@OriginalMember(owner = "client!fc", name = "rb", descriptor = "[I")
	private int[] anIntArray105;

	@OriginalMember(owner = "client!fc", name = "sb", descriptor = "[I")
	private int[] anIntArray106;

	@OriginalMember(owner = "client!fc", name = "tb", descriptor = "[I")
	private int[] anIntArray107;

	@OriginalMember(owner = "client!fc", name = "ub", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!fc", name = "vb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!fc", name = "xb", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!fc", name = "yb", descriptor = "[I")
	private int[] anIntArray108;

	@OriginalMember(owner = "client!fc", name = "zb", descriptor = "[I")
	private int[] anIntArray109;

	@OriginalMember(owner = "client!fc", name = "Ab", descriptor = "[I")
	private int[] anIntArray110;

	@OriginalMember(owner = "client!fc", name = "Bb", descriptor = "[I")
	private int[] anIntArray111;

	@OriginalMember(owner = "client!fc", name = "Eb", descriptor = "[I")
	private int[] anIntArray112;

	@OriginalMember(owner = "client!fc", name = "wb", descriptor = "B")
	private byte aByte2 = 0;

	@OriginalMember(owner = "client!fc", name = "Cb", descriptor = "I")
	private int anInt1533 = 0;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub5_Sub4_Sub1() {
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!ja;IIIII)V")
	public Class1_Sub1_Sub5_Sub4_Sub1(@OriginalArg(0) Class1_Sub1_Sub5_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method1492();
		arg0.method1491();
		super.anInt1529 = arg0.anInt2125;
		super.anIntArray99 = arg0.anIntArray179;
		super.anIntArray103 = arg0.anIntArray180;
		super.anIntArray100 = arg0.anIntArray178;
		super.anInt1526 = arg0.anInt2117;
		this.anIntArray104 = arg0.anIntArray177;
		this.anIntArray112 = arg0.anIntArray182;
		this.anIntArray106 = arg0.anIntArray187;
		this.aByteArray8 = arg0.aByteArray22;
		this.aByteArray10 = arg0.aByteArray23;
		this.aByte2 = arg0.aByte3;
		super.anIntArrayArray41 = arg0.anIntArrayArray61;
		super.anIntArrayArray40 = arg0.anIntArrayArray60;
		@Pc(78) int local78 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(84) int local84 = arg2 * local78 >> 8;
		this.anIntArray111 = new int[super.anInt1526];
		this.anIntArray105 = new int[super.anInt1526];
		this.anIntArray108 = new int[super.anInt1526];
		@Pc(109) int local109;
		if (arg0.aShortArray15 == null) {
			this.aShortArray11 = null;
		} else {
			this.aShortArray11 = new short[super.anInt1526];
			for (local109 = 0; local109 < super.anInt1526; local109++) {
				@Pc(115) short local115 = arg0.aShortArray15[local109];
				if (local115 != -1 && Static79.anInterface3_1.method3055(local115)) {
					this.aShortArray11[local109] = local115;
				} else {
					this.aShortArray11[local109] = -1;
				}
			}
		}
		@Pc(286) int local286;
		if (arg0.anInt2123 > 0 && arg0.aByteArray21 != null) {
			@Pc(153) int[] local153 = new int[arg0.anInt2123];
			for (@Pc(155) int local155 = 0; local155 < super.anInt1526; local155++) {
				if (arg0.aByteArray21[local155] != -1) {
					local153[arg0.aByteArray21[local155] & 0xFF]++;
				}
			}
			this.anInt1533 = 0;
			for (@Pc(184) int local184 = 0; local184 < arg0.anInt2123; local184++) {
				if (local153[local184] > 0 && arg0.aByteArray25[local184] == 0) {
					this.anInt1533++;
				}
			}
			this.anIntArray109 = new int[this.anInt1533];
			this.anIntArray110 = new int[this.anInt1533];
			this.anIntArray107 = new int[this.anInt1533];
			@Pc(222) int local222 = 0;
			for (@Pc(224) int local224 = 0; local224 < arg0.anInt2123; local224++) {
				if (local153[local224] > 0 && arg0.aByteArray25[local224] == 0) {
					this.anIntArray109[local222] = arg0.aShortArray20[local224] & 0xFFFF;
					this.anIntArray110[local222] = arg0.aShortArray16[local224] & 0xFFFF;
					this.anIntArray107[local222] = arg0.aShortArray13[local224] & 0xFFFF;
					local153[local224] = local222++;
				} else {
					local153[local224] = -1;
				}
			}
			this.aByteArray9 = new byte[super.anInt1526];
			for (local286 = 0; local286 < super.anInt1526; local286++) {
				if (arg0.aByteArray21[local286] == -1) {
					this.aByteArray9[local286] = -1;
				} else {
					this.aByteArray9[local286] = (byte) local153[arg0.aByteArray21[local286] & 0xFF];
					if (this.aByteArray9[local286] == -1 && this.aShortArray11 != null) {
						this.aShortArray11[local286] = -1;
					}
				}
			}
		}
		for (local109 = 0; local109 < super.anInt1526; local109++) {
			@Pc(339) byte local339;
			if (arg0.aByteArray24 == null) {
				local339 = 0;
			} else {
				local339 = arg0.aByteArray24[local109];
			}
			@Pc(350) byte local350;
			if (arg0.aByteArray23 == null) {
				local350 = 0;
			} else {
				local350 = arg0.aByteArray23[local109];
			}
			@Pc(361) short local361;
			if (this.aShortArray11 == null) {
				local361 = -1;
			} else {
				local361 = this.aShortArray11[local109];
			}
			if (local350 == -2) {
				local339 = 3;
			}
			if (local350 == -1) {
				local339 = 2;
			}
			@Pc(408) Class89 local408;
			@Pc(569) Class28 local569;
			if (local361 == -1) {
				if (local339 == 0) {
					@Pc(389) int local389 = arg0.aShortArray18[local109] & 0xFFFF;
					if (arg0.aClass89Array1 == null || arg0.aClass89Array1[this.anIntArray104[local109]] == null) {
						local408 = arg0.aClass89Array2[this.anIntArray104[local109]];
					} else {
						local408 = arg0.aClass89Array1[this.anIntArray104[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt4742 + arg4 * local408.anInt4741 + arg5 * local408.anInt4740) / (local84 * local408.anInt4744);
					this.anIntArray111[local109] = Static44.method1015(local389, local286);
					if (arg0.aClass89Array1 == null || arg0.aClass89Array1[this.anIntArray112[local109]] == null) {
						local408 = arg0.aClass89Array2[this.anIntArray112[local109]];
					} else {
						local408 = arg0.aClass89Array1[this.anIntArray112[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt4742 + arg4 * local408.anInt4741 + arg5 * local408.anInt4740) / (local84 * local408.anInt4744);
					this.anIntArray105[local109] = Static44.method1015(local389, local286);
					if (arg0.aClass89Array1 == null || arg0.aClass89Array1[this.anIntArray106[local109]] == null) {
						local408 = arg0.aClass89Array2[this.anIntArray106[local109]];
					} else {
						local408 = arg0.aClass89Array1[this.anIntArray106[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt4742 + arg4 * local408.anInt4741 + arg5 * local408.anInt4740) / (local84 * local408.anInt4744);
					this.anIntArray108[local109] = Static44.method1015(local389, local286);
				} else if (local339 == 1) {
					local569 = arg0.aClass28Array1[local109];
					local286 = arg1 + (arg3 * local569.anInt1811 + arg4 * local569.anInt1812 + arg5 * local569.anInt1807) / (local84 + local84 / 2);
					this.anIntArray111[local109] = Static44.method1015(arg0.aShortArray18[local109] & 0xFFFF, local286);
					this.anIntArray108[local109] = -1;
				} else if (local339 == 3) {
					this.anIntArray111[local109] = 128;
					this.anIntArray108[local109] = -1;
				} else {
					this.anIntArray108[local109] = -2;
				}
			} else if (local339 == 0) {
				if (arg0.aClass89Array1 == null || arg0.aClass89Array1[this.anIntArray104[local109]] == null) {
					local408 = arg0.aClass89Array2[this.anIntArray104[local109]];
				} else {
					local408 = arg0.aClass89Array1[this.anIntArray104[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt4742 + arg4 * local408.anInt4741 + arg5 * local408.anInt4740) / (local84 * local408.anInt4744);
				this.anIntArray111[local109] = Static44.method1018(local286);
				if (arg0.aClass89Array1 == null || arg0.aClass89Array1[this.anIntArray112[local109]] == null) {
					local408 = arg0.aClass89Array2[this.anIntArray112[local109]];
				} else {
					local408 = arg0.aClass89Array1[this.anIntArray112[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt4742 + arg4 * local408.anInt4741 + arg5 * local408.anInt4740) / (local84 * local408.anInt4744);
				this.anIntArray105[local109] = Static44.method1018(local286);
				if (arg0.aClass89Array1 == null || arg0.aClass89Array1[this.anIntArray106[local109]] == null) {
					local408 = arg0.aClass89Array2[this.anIntArray106[local109]];
				} else {
					local408 = arg0.aClass89Array1[this.anIntArray106[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt4742 + arg4 * local408.anInt4741 + arg5 * local408.anInt4740) / (local84 * local408.anInt4744);
				this.anIntArray108[local109] = Static44.method1018(local286);
			} else if (local339 == 1) {
				local569 = arg0.aClass28Array1[local109];
				local286 = arg1 + (arg3 * local569.anInt1811 + arg4 * local569.anInt1812 + arg5 * local569.anInt1807) / (local84 + local84 / 2);
				this.anIntArray111[local109] = Static44.method1018(local286);
				this.anIntArray108[local109] = -1;
			} else {
				this.anIntArray108[local109] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "([Lclient!fc;I)V")
	private Class1_Sub1_Sub5_Sub4_Sub1(@OriginalArg(0) Class1_Sub1_Sub5_Sub4_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		super.anInt1529 = 0;
		super.anInt1526 = 0;
		this.anInt1533 = 0;
		this.aByte2 = -1;
		for (@Pc(29) int local29 = 0; local29 < arg1; local29++) {
			@Pc(34) Class1_Sub1_Sub5_Sub4_Sub1 local34 = arg0[local29];
			if (local34 != null) {
				super.anInt1529 += local34.anInt1529;
				super.anInt1526 += local34.anInt1526;
				this.anInt1533 += local34.anInt1533;
				if (local34.aByteArray8 == null) {
					if (this.aByte2 == -1) {
						this.aByte2 = local34.aByte2;
					}
					if (this.aByte2 != local34.aByte2) {
						local9 = true;
					}
				} else {
					local9 = true;
				}
				local11 |= local34.aByteArray10 != null;
				local13 |= local34.aShortArray11 != null;
				local15 |= local34.aByteArray9 != null;
			}
		}
		super.anIntArray99 = new int[super.anInt1529];
		super.anIntArray103 = new int[super.anInt1529];
		super.anIntArray100 = new int[super.anInt1529];
		this.anIntArray104 = new int[super.anInt1526];
		this.anIntArray112 = new int[super.anInt1526];
		this.anIntArray106 = new int[super.anInt1526];
		this.anIntArray111 = new int[super.anInt1526];
		this.anIntArray105 = new int[super.anInt1526];
		this.anIntArray108 = new int[super.anInt1526];
		if (local9) {
			this.aByteArray8 = new byte[super.anInt1526];
		}
		if (local11) {
			this.aByteArray10 = new byte[super.anInt1526];
		}
		if (local13) {
			this.aShortArray11 = new short[super.anInt1526];
		}
		if (local15) {
			this.aByteArray9 = new byte[super.anInt1526];
		}
		if (this.anInt1533 > 0) {
			this.anIntArray109 = new int[this.anInt1533];
			this.anIntArray110 = new int[this.anInt1533];
			this.anIntArray107 = new int[this.anInt1533];
		}
		super.anInt1529 = 0;
		super.anInt1526 = 0;
		this.anInt1533 = 0;
		for (@Pc(211) int local211 = 0; local211 < arg1; local211++) {
			@Pc(216) Class1_Sub1_Sub5_Sub4_Sub1 local216 = arg0[local211];
			if (local216 != null) {
				for (@Pc(220) int local220 = 0; local220 < local216.anInt1526; local220++) {
					this.anIntArray104[super.anInt1526] = local216.anIntArray104[local220] + super.anInt1529;
					this.anIntArray112[super.anInt1526] = local216.anIntArray112[local220] + super.anInt1529;
					this.anIntArray106[super.anInt1526] = local216.anIntArray106[local220] + super.anInt1529;
					this.anIntArray111[super.anInt1526] = local216.anIntArray111[local220];
					this.anIntArray105[super.anInt1526] = local216.anIntArray105[local220];
					this.anIntArray108[super.anInt1526] = local216.anIntArray108[local220];
					if (local9) {
						if (local216.aByteArray8 == null) {
							this.aByteArray8[super.anInt1526] = local216.aByte2;
						} else {
							this.aByteArray8[super.anInt1526] = local216.aByteArray8[local220];
						}
					}
					if (local11 && local216.aByteArray10 != null) {
						this.aByteArray10[super.anInt1526] = local216.aByteArray10[local220];
					}
					if (local13) {
						if (local216.aShortArray11 == null) {
							this.aShortArray11[super.anInt1526] = -1;
						} else {
							this.aShortArray11[super.anInt1526] = local216.aShortArray11[local220];
						}
					}
					if (local15) {
						if (local216.aByteArray9 == null || local216.aByteArray9[local220] == -1) {
							this.aByteArray9[super.anInt1526] = -1;
						} else {
							this.aByteArray9[super.anInt1526] = (byte) (local216.aByteArray9[local220] + this.anInt1533);
						}
					}
					super.anInt1526++;
				}
				for (@Pc(385) int local385 = 0; local385 < local216.anInt1533; local385++) {
					this.anIntArray109[this.anInt1533] = local216.anIntArray109[local385] + super.anInt1529;
					this.anIntArray110[this.anInt1533] = local216.anIntArray110[local385] + super.anInt1529;
					this.anIntArray107[this.anInt1533] = local216.anIntArray107[local385] + super.anInt1529;
					this.anInt1533++;
				}
				for (@Pc(435) int local435 = 0; local435 < local216.anInt1529; local435++) {
					super.anIntArray99[super.anInt1529] = local216.anIntArray99[local435];
					super.anIntArray103[super.anInt1529] = local216.anIntArray103[local435];
					super.anIntArray100[super.anInt1529] = local216.anIntArray100[local435];
					super.anInt1529++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static44.anIntArray119[0] = -1;
		if (super.anInt1528 != 1) {
			this.method1008();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = super.anInt1532 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - super.anInt1532 << 9;
		if (local64 / local40 >= Static79.anInt2434) {
			return;
		}
		@Pc(77) int local77 = local57 + super.anInt1532 << 9;
		if (local77 / local40 <= Static79.anInt2438) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = super.anInt1532 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static79.anInt2441) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt4233 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static79.anInt2436) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt4233 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt1533 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static44.aBoolean57) {
			local172 = local29 - local36;
			if (local172 <= 50) {
				local172 = 50;
			}
			if (local57 > 0) {
				local64 /= local40;
				local77 /= local172;
			} else {
				local77 /= local40;
				local64 /= local172;
			}
			if (local93 > 0) {
				local127 /= local40;
				local106 /= local172;
			} else {
				local106 /= local40;
				local127 /= local172;
			}
			local219 = Static44.anInt1538 - Static79.anInt2433;
			local223 = Static44.anInt1536 - Static79.anInt2439;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (super.aBoolean56) {
					Static44.anIntArray125[Static44.anInt1535++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static79.anInt2433;
		local219 = Static79.anInt2439;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static44.anIntArray124[arg0];
			local257 = Static44.anIntArray130[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < super.anInt1529; local269++) {
			@Pc(275) int local275 = super.anIntArray99[local269];
			@Pc(280) int local280 = super.anIntArray103[local269];
			@Pc(285) int local285 = super.anIntArray100[local269];
			@Pc(297) int local297;
			if (arg0 != 0) {
				local297 = local285 * local223 + local275 * local257 >> 16;
				local285 = local285 * local257 - local275 * local223 >> 16;
				local275 = local297;
			}
			local275 += arg5;
			local280 += arg6;
			local285 += arg7;
			local297 = local285 * arg3 + local275 * arg4 >> 16;
			local285 = local285 * arg4 - local275 * arg3 >> 16;
			local275 = local297;
			local297 = local280 * arg2 - local285 * arg1 >> 16;
			local285 = local280 * arg1 + local285 * arg2 >> 16;
			Static44.anIntArray122[local269] = local285 - local29;
			if (local285 >= 50) {
				Static44.anIntArray129[local269] = local172 + (local275 << 9) / local285;
				Static44.anIntArray115[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static44.anIntArray129[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static44.anIntArray113[local269] = local275;
				Static44.anIntArray126[local269] = local297;
				Static44.anIntArray120[local269] = local285;
			}
		}
		try {
			this.method1020(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!t;ILclient!t;I[I)V")
	@Override
	public void method1004(@OriginalArg(0) Class1_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1000(arg0, arg1);
			return;
		}
		@Pc(18) Class62 local18 = arg0.aClass62Array1[arg1];
		@Pc(23) Class62 local23 = arg2.aClass62Array1[arg3];
		@Pc(26) Class1_Sub25 local26 = local18.aClass1_Sub25_1;
		Static44.anInt1534 = 0;
		Static44.anInt1537 = 0;
		Static44.anInt1539 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt3644; local41++) {
			local47 = local18.anIntArray327[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray431[local47] == 0) {
				this.method1016(local26.anIntArray431[local47], local26.anIntArrayArray139[local47], local18.anIntArray325[local41], local18.anIntArray321[local41], local18.anIntArray326[local41]);
			}
		}
		Static44.anInt1534 = 0;
		Static44.anInt1537 = 0;
		Static44.anInt1539 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt3644; local47++) {
			@Pc(112) int local112 = local23.anIntArray327[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray431[local112] == 0) {
				this.method1016(local26.anIntArray431[local112], local26.anIntArrayArray139[local112], local23.anIntArray325[local47], local23.anIntArray321[local47], local23.anIntArray326[local47]);
			}
		}
		super.anInt1528 = 0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	public void method1010(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static44.anIntArray119[0] = -1;
		if (super.anInt1528 != 2 && super.anInt1528 != 1) {
			this.method1003();
		}
		@Pc(15) int local15 = Static79.anInt2433;
		@Pc(17) int local17 = Static79.anInt2439;
		@Pc(21) int local21 = Static44.anIntArray124[0];
		@Pc(25) int local25 = Static44.anIntArray130[0];
		@Pc(29) int local29 = Static44.anIntArray124[arg0];
		@Pc(33) int local33 = Static44.anIntArray130[arg0];
		@Pc(37) int local37 = Static44.anIntArray124[arg1];
		@Pc(41) int local41 = Static44.anIntArray130[arg1];
		@Pc(45) int local45 = Static44.anIntArray124[arg2];
		@Pc(49) int local49 = Static44.anIntArray130[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < super.anInt1529; local61++) {
			@Pc(67) int local67 = super.anIntArray99[local61];
			@Pc(72) int local72 = super.anIntArray103[local61];
			@Pc(77) int local77 = super.anIntArray100[local61];
			@Pc(89) int local89;
			if (arg1 != 0) {
				local89 = local72 * local37 + local67 * local41 >> 16;
				local72 = local72 * local41 - local67 * local37 >> 16;
				local67 = local89;
			}
			if (arg0 != 0) {
				local89 = local77 * local29 + local67 * local33 >> 16;
				local77 = local77 * local33 - local67 * local29 >> 16;
				local67 = local89;
			}
			local67 += arg3;
			local72 += arg4;
			local77 += arg5;
			local89 = local72 * local49 - local77 * local45 >> 16;
			local77 = local72 * local45 + local77 * local49 >> 16;
			Static44.anIntArray122[local61] = local77 - local59;
			Static44.anIntArray129[local61] = local15 + (local67 << 9) / arg6;
			Static44.anIntArray115[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt1533 > 0) {
				Static44.anIntArray113[local61] = local67;
				Static44.anIntArray126[local61] = local89;
				Static44.anIntArray120[local61] = local77;
			}
		}
		try {
			this.method1020(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(Z)Lclient!rg;")
	@Override
	public Class1_Sub1_Sub5_Sub4 method995(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static44.aByteArray12.length < super.anInt1526) {
			Static44.aByteArray12 = new byte[super.anInt1526 + 100];
		}
		return this.method1014(arg0, Static44.aClass1_Sub1_Sub5_Sub4_Sub1_2, Static44.aByteArray12);
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(Z)Lclient!rg;")
	@Override
	public Class1_Sub1_Sub5_Sub4 method1012(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static44.aByteArray11.length < super.anInt1526) {
			Static44.aByteArray11 = new byte[super.anInt1526 + 100];
		}
		return this.method1014(arg0, Static44.aClass1_Sub1_Sub5_Sub4_Sub1_1, Static44.aByteArray11);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLclient!fc;[B)Lclient!fc;")
	private Class1_Sub1_Sub5_Sub4_Sub1 method1014(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub5_Sub4_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt1529 = super.anInt1529;
		arg1.anInt1526 = super.anInt1526;
		arg1.anInt1533 = this.anInt1533;
		if (arg1.anIntArray99 == null || arg1.anIntArray99.length < super.anInt1529) {
			arg1.anIntArray99 = new int[super.anInt1529 + 100];
			arg1.anIntArray103 = new int[super.anInt1529 + 100];
			arg1.anIntArray100 = new int[super.anInt1529 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < super.anInt1529; local43++) {
			arg1.anIntArray99[local43] = super.anIntArray99[local43];
			arg1.anIntArray103[local43] = super.anIntArray103[local43];
			arg1.anIntArray100[local43] = super.anIntArray100[local43];
		}
		if (arg0) {
			arg1.aByteArray10 = this.aByteArray10;
		} else {
			arg1.aByteArray10 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray10 == null) {
				for (local88 = 0; local88 < super.anInt1526; local88++) {
					arg1.aByteArray10[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < super.anInt1526; local88++) {
					arg1.aByteArray10[local88] = this.aByteArray10[local88];
				}
			}
		}
		arg1.anIntArray104 = this.anIntArray104;
		arg1.anIntArray112 = this.anIntArray112;
		arg1.anIntArray106 = this.anIntArray106;
		arg1.anIntArray111 = this.anIntArray111;
		arg1.anIntArray105 = this.anIntArray105;
		arg1.anIntArray108 = this.anIntArray108;
		arg1.aByteArray8 = this.aByteArray8;
		arg1.aByteArray9 = this.aByteArray9;
		arg1.aShortArray11 = this.aShortArray11;
		arg1.aByte2 = this.aByte2;
		arg1.anIntArray109 = this.anIntArray109;
		arg1.anIntArray110 = this.anIntArray110;
		arg1.anIntArray107 = this.anIntArray107;
		arg1.anIntArrayArray41 = super.anIntArrayArray41;
		arg1.anIntArrayArray40 = super.anIntArrayArray40;
		arg1.aBoolean56 = super.aBoolean56;
		arg1.anInt1528 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!rg;)Lclient!rg;")
	@Override
	public Class1_Sub1_Sub5_Sub4 method1002(@OriginalArg(0) Class1_Sub1_Sub5_Sub4 arg0) {
		return new Class1_Sub1_Sub5_Sub4_Sub1(new Class1_Sub1_Sub5_Sub4_Sub1[] { this, (Class1_Sub1_Sub5_Sub4_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[IIII)V")
	private void method1016(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static44.anInt1534 = 0;
			Static44.anInt1537 = 0;
			Static44.anInt1539 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < super.anIntArrayArray41.length) {
					@Pc(29) int[] local29 = super.anIntArrayArray41[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static44.anInt1534 += super.anIntArray99[local36];
						Static44.anInt1537 += super.anIntArray103[local36];
						Static44.anInt1539 += super.anIntArray100[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static44.anInt1534 = Static44.anInt1534 / local6 + arg2;
				Static44.anInt1537 = Static44.anInt1537 / local6 + arg3;
				Static44.anInt1539 = Static44.anInt1539 / local6 + arg4;
			} else {
				Static44.anInt1534 = arg2;
				Static44.anInt1537 = arg3;
				Static44.anInt1539 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray41.length) {
					local115 = super.anIntArrayArray41[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray99[local31] += arg2;
						super.anIntArray103[local31] += arg3;
						super.anIntArray100[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray41.length) {
					local115 = super.anIntArrayArray41[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray99[local31] -= Static44.anInt1534;
						super.anIntArray103[local31] -= Static44.anInt1537;
						super.anIntArray100[local31] -= Static44.anInt1539;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static44.anIntArray124[local225];
							local235 = Static44.anIntArray130[local225];
							local251 = super.anIntArray103[local31] * local231 + super.anIntArray99[local31] * local235 >> 16;
							super.anIntArray103[local31] = super.anIntArray103[local31] * local235 - super.anIntArray99[local31] * local231 >> 16;
							super.anIntArray99[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static44.anIntArray124[local36];
							local235 = Static44.anIntArray130[local36];
							local251 = super.anIntArray103[local31] * local235 - super.anIntArray100[local31] * local231 >> 16;
							super.anIntArray100[local31] = super.anIntArray103[local31] * local231 + super.anIntArray100[local31] * local235 >> 16;
							super.anIntArray103[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static44.anIntArray124[local219];
							local235 = Static44.anIntArray130[local219];
							local251 = super.anIntArray100[local31] * local231 + super.anIntArray99[local31] * local235 >> 16;
							super.anIntArray100[local31] = super.anIntArray100[local31] * local235 - super.anIntArray99[local31] * local231 >> 16;
							super.anIntArray99[local31] = local251;
						}
						super.anIntArray99[local31] += Static44.anInt1534;
						super.anIntArray103[local31] += Static44.anInt1537;
						super.anIntArray100[local31] += Static44.anInt1539;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray41.length) {
					local115 = super.anIntArrayArray41[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray99[local31] -= Static44.anInt1534;
						super.anIntArray103[local31] -= Static44.anInt1537;
						super.anIntArray100[local31] -= Static44.anInt1539;
						super.anIntArray99[local31] = super.anIntArray99[local31] * arg2 / 128;
						super.anIntArray103[local31] = super.anIntArray103[local31] * arg3 / 128;
						super.anIntArray100[local31] = super.anIntArray100[local31] * arg4 / 128;
						super.anIntArray99[local31] += Static44.anInt1534;
						super.anIntArray103[local31] += Static44.anInt1537;
						super.anIntArray100[local31] += Static44.anInt1539;
					}
				}
			}
		} else if (arg0 == 5 && (super.anIntArrayArray40 != null && this.aByteArray10 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray40.length) {
					local115 = super.anIntArrayArray40[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray10[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray10[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "(I)V")
	private void method1017(@OriginalArg(0) int arg0) {
		if (Static44.aBooleanArray4[arg0]) {
			this.method1021(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray104[arg0];
		@Pc(17) int local17 = this.anIntArray112[arg0];
		@Pc(22) int local22 = this.anIntArray106[arg0];
		Static79.aBoolean99 = Static44.aBooleanArray5[arg0];
		if (this.aByteArray10 == null) {
			Static79.anInt2440 = 0;
		} else {
			Static79.anInt2440 = this.aByteArray10[arg0] & 0xFF;
		}
		if (this.aShortArray11 != null && this.aShortArray11[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray9 == null || this.aByteArray9[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray9[arg0] & 0xFF;
				local133 = this.anIntArray109[local128];
				local138 = this.anIntArray110[local128];
				local143 = this.anIntArray107[local128];
			}
			if (this.anIntArray108[arg0] == -1) {
				Static79.method1765(Static44.anIntArray115[local12], Static44.anIntArray115[local17], Static44.anIntArray115[local22], Static44.anIntArray129[local12], Static44.anIntArray129[local17], Static44.anIntArray129[local22], this.anIntArray111[arg0], this.anIntArray111[arg0], this.anIntArray111[arg0], Static44.anIntArray113[local133], Static44.anIntArray113[local138], Static44.anIntArray113[local143], Static44.anIntArray126[local133], Static44.anIntArray126[local138], Static44.anIntArray126[local143], Static44.anIntArray120[local133], Static44.anIntArray120[local138], Static44.anIntArray120[local143], this.aShortArray11[arg0]);
			} else {
				Static79.method1765(Static44.anIntArray115[local12], Static44.anIntArray115[local17], Static44.anIntArray115[local22], Static44.anIntArray129[local12], Static44.anIntArray129[local17], Static44.anIntArray129[local22], this.anIntArray111[arg0], this.anIntArray105[arg0], this.anIntArray108[arg0], Static44.anIntArray113[local133], Static44.anIntArray113[local138], Static44.anIntArray113[local143], Static44.anIntArray126[local133], Static44.anIntArray126[local138], Static44.anIntArray126[local143], Static44.anIntArray120[local133], Static44.anIntArray120[local138], Static44.anIntArray120[local143], this.aShortArray11[arg0]);
			}
		} else if (this.anIntArray108[arg0] == -1) {
			Static79.method1763(Static44.anIntArray115[local12], Static44.anIntArray115[local17], Static44.anIntArray115[local22], Static44.anIntArray129[local12], Static44.anIntArray129[local17], Static44.anIntArray129[local22], Static44.anIntArray117[this.anIntArray111[arg0]]);
		} else {
			Static79.method1749(Static44.anIntArray115[local12], Static44.anIntArray115[local17], Static44.anIntArray115[local22], Static44.anIntArray129[local12], Static44.anIntArray129[local17], Static44.anIntArray129[local22], this.anIntArray111[arg0], this.anIntArray105[arg0], this.anIntArray108[arg0]);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method997(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static44.anIntArray119[0] = -1;
		if (super.anInt1528 != 2 && super.anInt1528 != 1) {
			this.method1003();
		}
		@Pc(15) int local15 = Static79.anInt2433;
		@Pc(17) int local17 = Static79.anInt2439;
		@Pc(21) int local21 = Static44.anIntArray124[0];
		@Pc(25) int local25 = Static44.anIntArray130[0];
		@Pc(29) int local29 = Static44.anIntArray124[arg0];
		@Pc(33) int local33 = Static44.anIntArray130[arg0];
		@Pc(37) int local37 = Static44.anIntArray124[arg1];
		@Pc(41) int local41 = Static44.anIntArray130[arg1];
		@Pc(45) int local45 = Static44.anIntArray124[arg2];
		@Pc(49) int local49 = Static44.anIntArray130[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < super.anInt1529; local61++) {
			@Pc(67) int local67 = super.anIntArray99[local61];
			@Pc(72) int local72 = super.anIntArray103[local61];
			@Pc(77) int local77 = super.anIntArray100[local61];
			@Pc(89) int local89;
			if (arg1 != 0) {
				local89 = local72 * local37 + local67 * local41 >> 16;
				local72 = local72 * local41 - local67 * local37 >> 16;
				local67 = local89;
			}
			if (arg0 != 0) {
				local89 = local77 * local29 + local67 * local33 >> 16;
				local77 = local77 * local33 - local67 * local29 >> 16;
				local67 = local89;
			}
			local67 += arg3;
			local72 += arg4;
			local77 += arg5;
			local89 = local72 * local49 - local77 * local45 >> 16;
			local77 = local72 * local45 + local77 * local49 >> 16;
			Static44.anIntArray122[local61] = local77 - local59;
			Static44.anIntArray129[local61] = local15 + (local67 << 9) / local77;
			Static44.anIntArray115[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt1533 > 0) {
				Static44.anIntArray113[local61] = local67;
				Static44.anIntArray126[local61] = local89;
				Static44.anIntArray120[local61] = local77;
			}
		}
		try {
			this.method1020(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZZI)V")
	private void method1020(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (super.anInt1527 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < super.anInt1527; local6++) {
			Static44.anIntArray119[local6] = 0;
		}
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(95) int local95;
		for (@Pc(18) int local18 = 0; local18 < super.anInt1526; local18++) {
			if (this.anIntArray108[local18] != -2) {
				local30 = this.anIntArray104[local18];
				local35 = this.anIntArray112[local18];
				local40 = this.anIntArray106[local18];
				local44 = Static44.anIntArray129[local30];
				local48 = Static44.anIntArray129[local35];
				local52 = Static44.anIntArray129[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static44.anIntArray113[local30];
					local71 = Static44.anIntArray113[local35];
					@Pc(75) int local75 = Static44.anIntArray113[local40];
					@Pc(79) int local79 = Static44.anIntArray126[local30];
					local83 = Static44.anIntArray126[local35];
					local87 = Static44.anIntArray126[local40];
					@Pc(91) int local91 = Static44.anIntArray120[local30];
					local95 = Static44.anIntArray120[local35];
					@Pc(99) int local99 = Static44.anIntArray120[local40];
					local67 -= local71;
					@Pc(107) int local107 = local75 - local71;
					@Pc(111) int local111 = local79 - local83;
					@Pc(115) int local115 = local87 - local83;
					@Pc(119) int local119 = local91 - local95;
					@Pc(123) int local123 = local99 - local95;
					@Pc(131) int local131 = local111 * local123 - local119 * local115;
					@Pc(139) int local139 = local119 * local107 - local67 * local123;
					@Pc(147) int local147 = local67 * local115 - local111 * local107;
					if (local71 * local131 + local83 * local139 + local95 * local147 > 0) {
						Static44.aBooleanArray4[local18] = true;
						@Pc(180) int local180 = (Static44.anIntArray122[local30] + Static44.anIntArray122[local35] + Static44.anIntArray122[local40]) / 3 + super.anInt1530;
						Static44.anIntArrayArray42[local180][Static44.anIntArray119[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method1019(Static44.anInt1538, Static44.anInt1536, Static44.anIntArray115[local30], Static44.anIntArray115[local35], Static44.anIntArray115[local40], local44, local48, local52)) {
						Static44.anIntArray125[Static44.anInt1535++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static44.anIntArray115[local40] - Static44.anIntArray115[local35]) - (Static44.anIntArray115[local30] - Static44.anIntArray115[local35]) * (local52 - local48) > 0) {
						Static44.aBooleanArray4[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static79.anInt2435 && local48 <= Static79.anInt2435 && local52 <= Static79.anInt2435) {
							Static44.aBooleanArray5[local18] = false;
						} else {
							Static44.aBooleanArray5[local18] = true;
						}
						local67 = (Static44.anIntArray122[local30] + Static44.anIntArray122[local35] + Static44.anIntArray122[local40]) / 3 + super.anInt1530;
						Static44.anIntArrayArray42[local67][Static44.anIntArray119[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray8 == null) {
			for (local30 = super.anInt1527 - 1; local30 >= 0; local30--) {
				local35 = Static44.anIntArray119[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static44.anIntArrayArray42[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method1017(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static44.anIntArray114[local30] = 0;
			Static44.anIntArray116[local30] = 0;
		}
		for (local35 = super.anInt1527 - 1; local35 >= 0; local35--) {
			local40 = Static44.anIntArray119[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static44.anIntArrayArray42[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray8[local52];
					local71 = Static44.anIntArray114[local388]++;
					Static44.anIntArrayArray43[local388][local71] = local52;
					if (local388 < 10) {
						Static44.anIntArray116[local388] += local35;
					} else if (local388 == 10) {
						Static44.anIntArray121[local71] = local35;
					} else {
						Static44.anIntArray123[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static44.anIntArray114[1] > 0 || Static44.anIntArray114[2] > 0) {
			local40 = (Static44.anIntArray116[1] + Static44.anIntArray116[2]) / (Static44.anIntArray114[1] + Static44.anIntArray114[2]);
		}
		local44 = 0;
		if (Static44.anIntArray114[3] > 0 || Static44.anIntArray114[4] > 0) {
			local44 = (Static44.anIntArray116[3] + Static44.anIntArray116[4]) / (Static44.anIntArray114[3] + Static44.anIntArray114[4]);
		}
		local48 = 0;
		if (Static44.anIntArray114[6] > 0 || Static44.anIntArray114[8] > 0) {
			local48 = (Static44.anIntArray116[6] + Static44.anIntArray116[8]) / (Static44.anIntArray114[6] + Static44.anIntArray114[8]);
		}
		local67 = 0;
		local71 = Static44.anIntArray114[10];
		@Pc(521) int[] local521 = Static44.anIntArrayArray43[10];
		@Pc(523) int[] local523 = Static44.anIntArray121;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static44.anIntArray114[11];
			local521 = Static44.anIntArrayArray43[11];
			local523 = Static44.anIntArray123;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method1017(local521[local67++]);
				if (local67 == local71 && local521 != Static44.anIntArrayArray43[11]) {
					local67 = 0;
					local71 = Static44.anIntArray114[11];
					local521 = Static44.anIntArrayArray43[11];
					local523 = Static44.anIntArray123;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method1017(local521[local67++]);
				if (local67 == local71 && local521 != Static44.anIntArrayArray43[11]) {
					local67 = 0;
					local71 = Static44.anIntArray114[11];
					local521 = Static44.anIntArrayArray43[11];
					local523 = Static44.anIntArray123;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method1017(local521[local67++]);
				if (local67 == local71 && local521 != Static44.anIntArrayArray43[11]) {
					local67 = 0;
					local71 = Static44.anIntArray114[11];
					local521 = Static44.anIntArrayArray43[11];
					local523 = Static44.anIntArray123;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static44.anIntArray114[local83];
			@Pc(686) int[] local686 = Static44.anIntArrayArray43[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method1017(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method1017(local521[local67++]);
			if (local67 == local71 && local521 != Static44.anIntArrayArray43[11]) {
				local67 = 0;
				local521 = Static44.anIntArrayArray43[11];
				local71 = Static44.anIntArray114[11];
				local523 = Static44.anIntArray123;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([[IIIIZI)Lclient!rg;")
	@Override
	public Class1_Sub1_Sub5_Sub4 method1001(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1008();
		@Pc(6) int local6 = arg1 - super.anInt1532;
		@Pc(11) int local11 = arg1 + super.anInt1532;
		@Pc(16) int local16 = arg3 - super.anInt1532;
		@Pc(21) int local21 = arg3 + super.anInt1532;
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
		@Pc(101) Class1_Sub1_Sub5_Sub4_Sub1 local101;
		if (arg4) {
			local101 = new Class1_Sub1_Sub5_Sub4_Sub1();
			local101.anInt1529 = super.anInt1529;
			local101.anInt1526 = super.anInt1526;
			local101.anInt1533 = this.anInt1533;
			local101.anIntArray99 = super.anIntArray99;
			local101.anIntArray100 = super.anIntArray100;
			local101.anIntArray104 = this.anIntArray104;
			local101.anIntArray112 = this.anIntArray112;
			local101.anIntArray106 = this.anIntArray106;
			local101.anIntArray111 = this.anIntArray111;
			local101.anIntArray105 = this.anIntArray105;
			local101.anIntArray108 = this.anIntArray108;
			local101.aByteArray8 = this.aByteArray8;
			local101.aByteArray10 = this.aByteArray10;
			local101.aByteArray9 = this.aByteArray9;
			local101.aShortArray11 = this.aShortArray11;
			local101.aByte2 = this.aByte2;
			local101.anIntArray109 = this.anIntArray109;
			local101.anIntArray110 = this.anIntArray110;
			local101.anIntArray107 = this.anIntArray107;
			local101.anIntArrayArray41 = super.anIntArrayArray41;
			local101.anIntArrayArray40 = super.anIntArrayArray40;
			local101.aBoolean56 = super.aBoolean56;
			local101.anIntArray103 = new int[local101.anInt1529];
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
			for (local201 = 0; local201 < local101.anInt1529; local201++) {
				local209 = super.anIntArray99[local201] + arg1;
				local216 = super.anIntArray100[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray103[local201] = super.anIntArray103[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt1529; local201++) {
				local209 = (-super.anIntArray103[local201] << 16) / super.anInt4233;
				if (local209 < arg5) {
					local216 = super.anIntArray99[local201] + arg1;
					local220 = super.anIntArray100[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(417) int local417 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray103[local201] = super.anIntArray103[local201] + (local417 - arg2) * (arg5 - local209) / arg5;
				}
			}
		}
		local101.anInt1528 = 0;
		return local101;
	}

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "(I)V")
	private void method1021(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static79.anInt2433;
		@Pc(3) int local3 = Static79.anInt2439;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray104[arg0];
		@Pc(15) int local15 = this.anIntArray112[arg0];
		@Pc(20) int local20 = this.anIntArray106[arg0];
		@Pc(24) int local24 = Static44.anIntArray120[local10];
		@Pc(28) int local28 = Static44.anIntArray120[local15];
		@Pc(32) int local32 = Static44.anIntArray120[local20];
		if (this.aByteArray10 == null) {
			Static79.anInt2440 = 0;
		} else {
			Static79.anInt2440 = this.aByteArray10[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static44.anIntArray128[0] = Static44.anIntArray129[local10];
			Static44.anIntArray127[0] = Static44.anIntArray115[local10];
			local5++;
			Static44.anIntArray118[0] = this.anIntArray111[arg0];
		} else {
			local73 = Static44.anIntArray113[local10];
			local77 = Static44.anIntArray126[local10];
			local82 = this.anIntArray111[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static44.anIntArray131[local32 - local24];
				Static44.anIntArray128[0] = local1 + (local73 + ((Static44.anIntArray113[local20] - local73) * local95 >> 16) << 9) / 50;
				Static44.anIntArray127[0] = local3 + (local77 + ((Static44.anIntArray126[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static44.anIntArray118[0] = local82 + ((this.anIntArray108[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static44.anIntArray131[local28 - local24];
				Static44.anIntArray128[local5] = local1 + (local73 + ((Static44.anIntArray113[local15] - local73) * local95 >> 16) << 9) / 50;
				Static44.anIntArray127[local5] = local3 + (local77 + ((Static44.anIntArray126[local15] - local77) * local95 >> 16) << 9) / 50;
				Static44.anIntArray118[local5++] = local82 + ((this.anIntArray105[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static44.anIntArray128[local5] = Static44.anIntArray129[local15];
			Static44.anIntArray127[local5] = Static44.anIntArray115[local15];
			Static44.anIntArray118[local5++] = this.anIntArray105[arg0];
		} else {
			local73 = Static44.anIntArray113[local15];
			local77 = Static44.anIntArray126[local15];
			local82 = this.anIntArray105[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static44.anIntArray131[local24 - local28];
				Static44.anIntArray128[local5] = local1 + (local73 + ((Static44.anIntArray113[local10] - local73) * local95 >> 16) << 9) / 50;
				Static44.anIntArray127[local5] = local3 + (local77 + ((Static44.anIntArray126[local10] - local77) * local95 >> 16) << 9) / 50;
				Static44.anIntArray118[local5++] = local82 + ((this.anIntArray111[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static44.anIntArray131[local32 - local28];
				Static44.anIntArray128[local5] = local1 + (local73 + ((Static44.anIntArray113[local20] - local73) * local95 >> 16) << 9) / 50;
				Static44.anIntArray127[local5] = local3 + (local77 + ((Static44.anIntArray126[local20] - local77) * local95 >> 16) << 9) / 50;
				Static44.anIntArray118[local5++] = local82 + ((this.anIntArray108[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static44.anIntArray128[local5] = Static44.anIntArray129[local20];
			Static44.anIntArray127[local5] = Static44.anIntArray115[local20];
			Static44.anIntArray118[local5++] = this.anIntArray108[arg0];
		} else {
			local73 = Static44.anIntArray113[local20];
			local77 = Static44.anIntArray126[local20];
			local82 = this.anIntArray108[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static44.anIntArray131[local28 - local32];
				Static44.anIntArray128[local5] = local1 + (local73 + ((Static44.anIntArray113[local15] - local73) * local95 >> 16) << 9) / 50;
				Static44.anIntArray127[local5] = local3 + (local77 + ((Static44.anIntArray126[local15] - local77) * local95 >> 16) << 9) / 50;
				Static44.anIntArray118[local5++] = local82 + ((this.anIntArray105[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static44.anIntArray131[local24 - local32];
				Static44.anIntArray128[local5] = local1 + (local73 + ((Static44.anIntArray113[local10] - local73) * local95 >> 16) << 9) / 50;
				Static44.anIntArray127[local5] = local3 + (local77 + ((Static44.anIntArray126[local10] - local77) * local95 >> 16) << 9) / 50;
				Static44.anIntArray118[local5++] = local82 + ((this.anIntArray111[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static44.anIntArray128[0];
		local77 = Static44.anIntArray128[1];
		local82 = Static44.anIntArray128[2];
		local95 = Static44.anIntArray127[0];
		@Pc(590) int local590 = Static44.anIntArray127[1];
		@Pc(594) int local594 = Static44.anIntArray127[2];
		Static79.aBoolean99 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static79.anInt2435 || local77 > Static79.anInt2435 || local82 > Static79.anInt2435) {
				Static79.aBoolean99 = true;
			}
			if (this.aShortArray11 != null && this.aShortArray11[arg0] != -1) {
				if (this.aByteArray9 == null || this.aByteArray9[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray9[arg0] & 0xFF;
					local683 = this.anIntArray109[local678];
					local688 = this.anIntArray110[local678];
					local693 = this.anIntArray107[local678];
				}
				if (this.anIntArray108[arg0] == -1) {
					Static79.method1765(local95, local590, local594, local73, local77, local82, this.anIntArray111[arg0], this.anIntArray111[arg0], this.anIntArray111[arg0], Static44.anIntArray113[local683], Static44.anIntArray113[local688], Static44.anIntArray113[local693], Static44.anIntArray126[local683], Static44.anIntArray126[local688], Static44.anIntArray126[local693], Static44.anIntArray120[local683], Static44.anIntArray120[local688], Static44.anIntArray120[local693], this.aShortArray11[arg0]);
				} else {
					Static79.method1765(local95, local590, local594, local73, local77, local82, Static44.anIntArray118[0], Static44.anIntArray118[1], Static44.anIntArray118[2], Static44.anIntArray113[local683], Static44.anIntArray113[local688], Static44.anIntArray113[local693], Static44.anIntArray126[local683], Static44.anIntArray126[local688], Static44.anIntArray126[local693], Static44.anIntArray120[local683], Static44.anIntArray120[local688], Static44.anIntArray120[local693], this.aShortArray11[arg0]);
				}
			} else if (this.anIntArray108[arg0] == -1) {
				Static79.method1763(local95, local590, local594, local73, local77, local82, Static44.anIntArray117[this.anIntArray111[arg0]]);
			} else {
				Static79.method1749(local95, local590, local594, local73, local77, local82, Static44.anIntArray118[0], Static44.anIntArray118[1], Static44.anIntArray118[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static79.anInt2435 || local77 > Static79.anInt2435 || local82 > Static79.anInt2435 || Static44.anIntArray128[3] < 0 || Static44.anIntArray128[3] > Static79.anInt2435) {
			Static79.aBoolean99 = true;
		}
		if (this.aShortArray11 == null || this.aShortArray11[arg0] == -1) {
			if (this.anIntArray108[arg0] == -1) {
				local683 = Static44.anIntArray117[this.anIntArray111[arg0]];
				Static79.method1763(local95, local590, local594, local73, local77, local82, local683);
				Static79.method1763(local95, local594, Static44.anIntArray127[3], local73, local82, Static44.anIntArray128[3], local683);
				return;
			}
			Static79.method1749(local95, local590, local594, local73, local77, local82, Static44.anIntArray118[0], Static44.anIntArray118[1], Static44.anIntArray118[2]);
			Static79.method1749(local95, local594, Static44.anIntArray127[3], local73, local82, Static44.anIntArray128[3], Static44.anIntArray118[0], Static44.anIntArray118[2], Static44.anIntArray118[3]);
			return;
		}
		if (this.aByteArray9 == null || this.aByteArray9[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray9[arg0] & 0xFF;
			local683 = this.anIntArray109[local678];
			local688 = this.anIntArray110[local678];
			local693 = this.anIntArray107[local678];
		}
		@Pc(956) short local956 = this.aShortArray11[arg0];
		if (this.anIntArray108[arg0] == -1) {
			Static79.method1765(local95, local590, local594, local73, local77, local82, this.anIntArray111[arg0], this.anIntArray111[arg0], this.anIntArray111[arg0], Static44.anIntArray113[local683], Static44.anIntArray113[local688], Static44.anIntArray113[local693], Static44.anIntArray126[local683], Static44.anIntArray126[local688], Static44.anIntArray126[local693], Static44.anIntArray120[local683], Static44.anIntArray120[local688], Static44.anIntArray120[local693], local956);
			Static79.method1765(local95, local594, Static44.anIntArray127[3], local73, local82, Static44.anIntArray128[3], this.anIntArray111[arg0], this.anIntArray111[arg0], this.anIntArray111[arg0], Static44.anIntArray113[local683], Static44.anIntArray113[local688], Static44.anIntArray113[local693], Static44.anIntArray126[local683], Static44.anIntArray126[local688], Static44.anIntArray126[local693], Static44.anIntArray120[local683], Static44.anIntArray120[local688], Static44.anIntArray120[local693], local956);
			return;
		}
		Static79.method1765(local95, local590, local594, local73, local77, local82, Static44.anIntArray118[0], Static44.anIntArray118[1], Static44.anIntArray118[2], Static44.anIntArray113[local683], Static44.anIntArray113[local688], Static44.anIntArray113[local693], Static44.anIntArray126[local683], Static44.anIntArray126[local688], Static44.anIntArray126[local693], Static44.anIntArray120[local683], Static44.anIntArray120[local688], Static44.anIntArray120[local693], local956);
		Static79.method1765(local95, local594, Static44.anIntArray127[3], local73, local82, Static44.anIntArray128[3], Static44.anIntArray118[0], Static44.anIntArray118[2], Static44.anIntArray118[3], Static44.anIntArray113[local683], Static44.anIntArray113[local688], Static44.anIntArray113[local693], Static44.anIntArray126[local683], Static44.anIntArray126[local688], Static44.anIntArray126[local693], Static44.anIntArray120[local683], Static44.anIntArray120[local688], Static44.anIntArray120[local693], local956);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!t;I)V")
	@Override
	public void method1000(@OriginalArg(0) Class1_Sub1_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (super.anIntArrayArray41 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class62 local12 = arg0.aClass62Array1[arg1];
		@Pc(15) Class1_Sub25 local15 = local12.aClass1_Sub25_1;
		Static44.anInt1534 = 0;
		Static44.anInt1537 = 0;
		Static44.anInt1539 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt3644; local23++) {
			@Pc(29) int local29 = local12.anIntArray327[local23];
			this.method1016(local15.anIntArray431[local29], local15.anIntArrayArray139[local29], local12.anIntArray325[local23], local12.anIntArray321[local23], local12.anIntArray326[local23]);
		}
		super.anInt1528 = 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class1_Sub2_Sub3_Sub7 extends Class1_Sub2_Sub3 {

	@OriginalMember(owner = "client!ub", name = "vb", descriptor = "[I")
	public static int[] anIntArray463 = new int[128];

	@OriginalMember(owner = "client!ub", name = "bb", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!ub", name = "cb", descriptor = "I")
	public int anInt2696;

	@OriginalMember(owner = "client!ub", name = "eb", descriptor = "[I")
	public int[] anIntArray456;

	@OriginalMember(owner = "client!ub", name = "fb", descriptor = "[I")
	public int[] anIntArray457;

	@OriginalMember(owner = "client!ub", name = "gb", descriptor = "[I")
	public int[] anIntArray458;

	@OriginalMember(owner = "client!ub", name = "hb", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!ub", name = "ib", descriptor = "I")
	public int anInt2697;

	@OriginalMember(owner = "client!ub", name = "lb", descriptor = "[I")
	public int[] anIntArray459;

	@OriginalMember(owner = "client!ub", name = "mb", descriptor = "[Lclient!qf;")
	private Class68[] aClass68Array1;

	@OriginalMember(owner = "client!ub", name = "nb", descriptor = "[Lclient!i;")
	public Class33[] aClass33Array1;

	@OriginalMember(owner = "client!ub", name = "ob", descriptor = "[I")
	private int[] anIntArray460;

	@OriginalMember(owner = "client!ub", name = "pb", descriptor = "[I")
	public int[] anIntArray461;

	@OriginalMember(owner = "client!ub", name = "qb", descriptor = "[I")
	private int[] anIntArray462;

	@OriginalMember(owner = "client!ub", name = "tb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!ub", name = "ub", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!ub", name = "wb", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!ub", name = "yb", descriptor = "[I")
	private int[] anIntArray465;

	@OriginalMember(owner = "client!ub", name = "zb", descriptor = "I")
	public int anInt2701;

	@OriginalMember(owner = "client!ub", name = "Ab", descriptor = "[B")
	private byte[] aByteArray36;

	@OriginalMember(owner = "client!ub", name = "Bb", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!ub", name = "Cb", descriptor = "I")
	public int anInt2702;

	@OriginalMember(owner = "client!ub", name = "Db", descriptor = "[I")
	private int[] anIntArray466;

	@OriginalMember(owner = "client!ub", name = "Fb", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!ub", name = "Gb", descriptor = "[Lclient!i;")
	public Class33[] aClass33Array2;

	@OriginalMember(owner = "client!ub", name = "Ib", descriptor = "[I")
	private int[] anIntArray467;

	@OriginalMember(owner = "client!ub", name = "Jb", descriptor = "I")
	public int anInt2704;

	@OriginalMember(owner = "client!ub", name = "Kb", descriptor = "[I")
	public int[] anIntArray468;

	@OriginalMember(owner = "client!ub", name = "Lb", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!ub", name = "sb", descriptor = "Z")
	private boolean aBoolean120 = false;

	@OriginalMember(owner = "client!ub", name = "kb", descriptor = "I")
	public int anInt2699 = 0;

	@OriginalMember(owner = "client!ub", name = "rb", descriptor = "I")
	public int anInt2700 = 0;

	@OriginalMember(owner = "client!ub", name = "jb", descriptor = "I")
	private int anInt2698 = 0;

	@OriginalMember(owner = "client!ub", name = "Hb", descriptor = "B")
	private byte aByte6 = 0;

	static {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 248;
		while (local12 < 9) {
			anIntArray463[local12++] = 255;
		}
		while (local12 < 16) {
			anIntArray463[local12++] = local14;
			local14 -= 8;
		}
		while (local12 < 32) {
			anIntArray463[local12++] = local14;
			local14 -= 4;
		}
		while (local12 < 64) {
			anIntArray463[local12++] = local14;
			local14 -= 2;
		}
		while (local12 < 128) {
			anIntArray463[local12++] = local14--;
		}
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	private Class1_Sub2_Sub3_Sub7() {
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub3_Sub7(@OriginalArg(0) byte[] arg0) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(25) Class1_Sub5 local25 = new Class1_Sub5(arg0);
		@Pc(30) Class1_Sub5 local30 = new Class1_Sub5(arg0);
		@Pc(35) Class1_Sub5 local35 = new Class1_Sub5(arg0);
		@Pc(40) Class1_Sub5 local40 = new Class1_Sub5(arg0);
		@Pc(45) Class1_Sub5 local45 = new Class1_Sub5(arg0);
		local25.anInt792 = arg0.length - 18;
		@Pc(55) int local55 = local25.method651();
		@Pc(59) int local59 = local25.method651();
		@Pc(63) int local63 = local25.method672();
		@Pc(67) int local67 = local25.method672();
		@Pc(71) int local71 = local25.method672();
		@Pc(75) int local75 = local25.method672();
		@Pc(79) int local79 = local25.method672();
		@Pc(83) int local83 = local25.method672();
		@Pc(87) int local87 = local25.method651();
		@Pc(91) int local91 = local25.method651();
		@Pc(95) int local95 = local25.method651();
		@Pc(99) int local99 = local25.method651();
		@Pc(101) byte local101 = 0;
		@Pc(107) int local107 = local101 + local55;
		@Pc(109) int local109 = local107;
		local107 += local59;
		@Pc(115) int local115 = local107;
		if (local71 == 255) {
			local107 += local59;
		}
		@Pc(124) int local124 = local107;
		if (local79 == 1) {
			local107 += local59;
		}
		@Pc(133) int local133 = local107;
		if (local67 == 1) {
			local107 += local59;
		}
		@Pc(142) int local142 = local107;
		if (local83 == 1) {
			local107 += local55;
		}
		@Pc(151) int local151 = local107;
		if (local75 == 1) {
			local107 += local59;
		}
		@Pc(160) int local160 = local107;
		local107 += local99;
		@Pc(166) int local166 = local107;
		local107 += local59 * 2;
		@Pc(174) int local174 = local107;
		local107 += local63 * 6;
		@Pc(182) int local182 = local107;
		local107 += local87;
		@Pc(188) int local188 = local107;
		local107 += local91;
		this.anInt2699 = local55;
		this.anInt2700 = local59;
		this.anInt2698 = local63;
		this.anIntArray456 = new int[local55];
		this.anIntArray468 = new int[local55];
		this.anIntArray459 = new int[local55];
		this.anIntArray457 = new int[local59];
		this.anIntArray458 = new int[local59];
		this.anIntArray461 = new int[local59];
		if (local63 > 0) {
			this.anIntArray460 = new int[local63];
			this.anIntArray467 = new int[local63];
			this.anIntArray462 = new int[local63];
		}
		if (local83 == 1) {
			this.anIntArray465 = new int[local55];
		}
		if (local67 == 1) {
			this.aByteArray37 = new byte[local59];
			this.aByteArray35 = new byte[local59];
		}
		if (local71 == 255) {
			this.aByteArray34 = new byte[local59];
		} else {
			this.aByte6 = (byte) local71;
		}
		if (local75 == 1) {
			this.aByteArray36 = new byte[local59];
		}
		if (local79 == 1) {
			this.anIntArray466 = new int[local59];
		}
		this.aShortArray14 = new short[local59];
		local25.anInt792 = local101;
		local30.anInt792 = local182;
		local35.anInt792 = local188;
		local40.anInt792 = local107;
		local45.anInt792 = local142;
		@Pc(310) int local310 = 0;
		@Pc(312) int local312 = 0;
		@Pc(314) int local314 = 0;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(333) int local333;
		@Pc(343) int local343;
		for (@Pc(316) int local316 = 0; local316 < local55; local316++) {
			local321 = local25.method672();
			local323 = 0;
			if ((local321 & 0x1) != 0) {
				local323 = local30.method636();
			}
			local333 = 0;
			if ((local321 & 0x2) != 0) {
				local333 = local35.method636();
			}
			local343 = 0;
			if ((local321 & 0x4) != 0) {
				local343 = local40.method636();
			}
			this.anIntArray456[local316] = local310 + local323;
			this.anIntArray468[local316] = local312 + local333;
			this.anIntArray459[local316] = local314 + local343;
			local310 = this.anIntArray456[local316];
			local312 = this.anIntArray468[local316];
			local314 = this.anIntArray459[local316];
			if (local83 == 1) {
				this.anIntArray465[local316] = local45.method672();
			}
		}
		local25.anInt792 = local166;
		local30.anInt792 = local133;
		local35.anInt792 = local115;
		local40.anInt792 = local151;
		local45.anInt792 = local124;
		for (local321 = 0; local321 < local59; local321++) {
			this.aShortArray14[local321] = (short) local25.method651();
			if (local67 == 1) {
				local323 = local30.method672();
				if ((local323 & 0x1) == 1) {
					this.aByteArray37[local321] = 1;
					local20 = true;
				} else {
					this.aByteArray37[local321] = 0;
				}
				if ((local323 & 0x2) == 2) {
					this.aByteArray35[local321] = (byte) (local323 >> 2);
					local18 = true;
				} else {
					this.aByteArray35[local321] = -1;
				}
			}
			if (local71 == 255) {
				this.aByteArray34[local321] = local35.method643();
			}
			if (local75 == 1) {
				this.aByteArray36[local321] = local40.method643();
			}
			if (local79 == 1) {
				this.anIntArray466[local321] = local45.method672();
			}
		}
		local25.anInt792 = local160;
		local30.anInt792 = local109;
		local323 = 0;
		local333 = 0;
		local343 = 0;
		@Pc(521) int local521 = 0;
		@Pc(528) int local528;
		for (@Pc(523) int local523 = 0; local523 < local59; local523++) {
			local528 = local30.method672();
			if (local528 == 1) {
				local323 = local25.method636() + local521;
				local333 = local25.method636() + local323;
				local343 = local25.method636() + local333;
				local521 = local343;
				this.anIntArray457[local523] = local323;
				this.anIntArray458[local523] = local333;
				this.anIntArray461[local523] = local343;
			}
			if (local528 == 2) {
				local333 = local343;
				local343 = local25.method636() + local521;
				local521 = local343;
				this.anIntArray457[local523] = local323;
				this.anIntArray458[local523] = local333;
				this.anIntArray461[local523] = local343;
			}
			if (local528 == 3) {
				local323 = local343;
				local343 = local25.method636() + local521;
				local521 = local343;
				this.anIntArray457[local523] = local323;
				this.anIntArray458[local523] = local333;
				this.anIntArray461[local523] = local343;
			}
			if (local528 == 4) {
				@Pc(631) int local631 = local323;
				local323 = local333;
				local333 = local631;
				local343 = local25.method636() + local521;
				local521 = local343;
				this.anIntArray457[local523] = local323;
				this.anIntArray458[local523] = local631;
				this.anIntArray461[local523] = local343;
			}
		}
		local25.anInt792 = local174;
		for (local528 = 0; local528 < local63; local528++) {
			this.anIntArray460[local528] = local25.method651();
			this.anIntArray467[local528] = local25.method651();
			this.anIntArray462[local528] = local25.method651();
		}
		if (!local18) {
			this.aByteArray35 = null;
		}
		if (!local20) {
			this.aByteArray37 = null;
		}
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([Lclient!ub;I)V")
	public Class1_Sub2_Sub3_Sub7(@OriginalArg(0) Class1_Sub2_Sub3_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		this.anInt2699 = 0;
		this.anInt2700 = 0;
		this.anInt2698 = 0;
		this.aByte6 = -1;
		for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
			@Pc(45) Class1_Sub2_Sub3_Sub7 local45 = arg0[local40];
			if (local45 != null) {
				this.anInt2699 += local45.anInt2699;
				this.anInt2700 += local45.anInt2700;
				this.anInt2698 += local45.anInt2698;
				if (local45.aByteArray34 == null) {
					if (this.aByte6 == -1) {
						this.aByte6 = local45.aByte6;
					}
					if (this.aByte6 != local45.aByte6) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local45.aByteArray37 != null;
				local22 |= local45.aByteArray36 != null;
				local24 |= local45.anIntArray466 != null;
				local26 |= local45.aByteArray35 != null;
			}
		}
		this.anIntArray456 = new int[this.anInt2699];
		this.anIntArray468 = new int[this.anInt2699];
		this.anIntArray459 = new int[this.anInt2699];
		this.anIntArray465 = new int[this.anInt2699];
		this.anIntArray457 = new int[this.anInt2700];
		this.anIntArray458 = new int[this.anInt2700];
		this.anIntArray461 = new int[this.anInt2700];
		if (this.anInt2698 > 0) {
			this.anIntArray460 = new int[this.anInt2698];
			this.anIntArray467 = new int[this.anInt2698];
			this.anIntArray462 = new int[this.anInt2698];
		}
		if (local18) {
			this.aByteArray37 = new byte[this.anInt2700];
		}
		if (local20) {
			this.aByteArray34 = new byte[this.anInt2700];
		}
		if (local22) {
			this.aByteArray36 = new byte[this.anInt2700];
		}
		if (local26) {
			this.aByteArray35 = new byte[this.anInt2700];
		}
		if (local24) {
			this.anIntArray466 = new int[this.anInt2700];
		}
		this.aShortArray14 = new short[this.anInt2700];
		this.anInt2699 = 0;
		this.anInt2700 = 0;
		this.anInt2698 = 0;
		@Pc(233) int local233 = 0;
		for (@Pc(235) int local235 = 0; local235 < arg1; local235++) {
			@Pc(240) Class1_Sub2_Sub3_Sub7 local240 = arg0[local235];
			if (local240 != null) {
				for (@Pc(244) int local244 = 0; local244 < local240.anInt2700; local244++) {
					if (local18 && local240.aByteArray37 != null) {
						this.aByteArray37[this.anInt2700] = local240.aByteArray37[local244];
					}
					if (local20) {
						if (local240.aByteArray34 == null) {
							this.aByteArray34[this.anInt2700] = local240.aByte6;
						} else {
							this.aByteArray34[this.anInt2700] = local240.aByteArray34[local244];
						}
					}
					if (local22 && local240.aByteArray36 != null) {
						this.aByteArray36[this.anInt2700] = local240.aByteArray36[local244];
					}
					if (local26) {
						if (local240.aByteArray35 == null || local240.aByteArray35[local244] == -1) {
							this.aByteArray35[this.anInt2700] = -1;
						} else {
							this.aByteArray35[this.anInt2700] = (byte) (local240.aByteArray35[local244] + local233);
						}
					}
					if (local24 && local240.anIntArray466 != null) {
						this.anIntArray466[this.anInt2700] = local240.anIntArray466[local244];
					}
					this.aShortArray14[this.anInt2700] = local240.aShortArray14[local244];
					this.anIntArray457[this.anInt2700] = this.method1884(local240, local240.anIntArray457[local244]);
					this.anIntArray458[this.anInt2700] = this.method1884(local240, local240.anIntArray458[local244]);
					this.anIntArray461[this.anInt2700] = this.method1884(local240, local240.anIntArray461[local244]);
					this.anInt2700++;
				}
				for (@Pc(397) int local397 = 0; local397 < local240.anInt2698; local397++) {
					this.anIntArray460[this.anInt2698] = this.method1884(local240, local240.anIntArray460[local397]);
					this.anIntArray467[this.anInt2698] = this.method1884(local240, local240.anIntArray467[local397]);
					this.anIntArray462[this.anInt2698] = this.method1884(local240, local240.anIntArray462[local397]);
					this.anInt2698++;
				}
				local233 += local240.anInt2698;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!ub;ZZZ)V")
	public Class1_Sub2_Sub3_Sub7(@OriginalArg(0) Class1_Sub2_Sub3_Sub7 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt2699 = arg0.anInt2699;
		this.anInt2700 = arg0.anInt2700;
		this.anInt2698 = arg0.anInt2698;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray456 = arg0.anIntArray456;
			this.anIntArray468 = arg0.anIntArray468;
			this.anIntArray459 = arg0.anIntArray459;
		} else {
			this.anIntArray456 = new int[this.anInt2699];
			this.anIntArray468 = new int[this.anInt2699];
			this.anIntArray459 = new int[this.anInt2699];
			for (local60 = 0; local60 < this.anInt2699; local60++) {
				this.anIntArray456[local60] = arg0.anIntArray456[local60];
				this.anIntArray468[local60] = arg0.anIntArray468[local60];
				this.anIntArray459[local60] = arg0.anIntArray459[local60];
			}
		}
		if (arg2) {
			this.aShortArray14 = arg0.aShortArray14;
		} else {
			this.aShortArray14 = new short[this.anInt2700];
			for (local60 = 0; local60 < this.anInt2700; local60++) {
				this.aShortArray14[local60] = arg0.aShortArray14[local60];
			}
		}
		this.aByteArray36 = arg0.aByteArray36;
		this.anIntArray457 = arg0.anIntArray457;
		this.anIntArray458 = arg0.anIntArray458;
		this.anIntArray461 = arg0.anIntArray461;
		this.aByteArray37 = arg0.aByteArray37;
		this.aByteArray34 = arg0.aByteArray34;
		this.aByteArray35 = arg0.aByteArray35;
		this.aByte6 = arg0.aByte6;
		this.anIntArray460 = arg0.anIntArray460;
		this.anIntArray467 = arg0.anIntArray467;
		this.anIntArray462 = arg0.anIntArray462;
		this.anIntArray465 = arg0.anIntArray465;
		this.anIntArray466 = arg0.anIntArray466;
		this.anIntArrayArray27 = arg0.anIntArrayArray27;
		this.anIntArrayArray28 = arg0.anIntArrayArray28;
		this.aClass33Array1 = arg0.aClass33Array1;
		this.aClass68Array1 = arg0.aClass68Array1;
		this.aClass33Array2 = arg0.aClass33Array2;
		this.aShort1 = arg0.aShort1;
		this.aShort2 = arg0.aShort2;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIZ)Lclient!ub;")
	public Class1_Sub2_Sub3_Sub7 method1881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class1_Sub2_Sub3_Sub7 local16 = new Class1_Sub2_Sub3_Sub7();
		local16.anInt2699 = this.anInt2699;
		local16.anInt2700 = this.anInt2700;
		local16.anInt2698 = this.anInt2698;
		local16.anIntArray456 = this.anIntArray456;
		local16.anIntArray459 = this.anIntArray459;
		local16.anIntArray457 = this.anIntArray457;
		local16.anIntArray458 = this.anIntArray458;
		local16.anIntArray461 = this.anIntArray461;
		local16.aByteArray37 = this.aByteArray37;
		local16.aByteArray34 = this.aByteArray34;
		local16.aByteArray36 = this.aByteArray36;
		local16.aByteArray35 = this.aByteArray35;
		local16.aShortArray14 = this.aShortArray14;
		local16.aByte6 = this.aByte6;
		local16.anIntArray460 = this.anIntArray460;
		local16.anIntArray467 = this.anIntArray467;
		local16.anIntArray462 = this.anIntArray462;
		local16.anIntArray465 = this.anIntArray465;
		local16.anIntArray466 = this.anIntArray466;
		local16.anIntArrayArray27 = this.anIntArrayArray27;
		local16.anIntArrayArray28 = this.anIntArrayArray28;
		local16.aShort1 = this.aShort1;
		local16.aShort2 = this.aShort2;
		local16.anIntArray468 = new int[local16.anInt2699];
		@Pc(126) int local126 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(128) int local128 = 0; local128 < local16.anInt2699; local128++) {
			@Pc(134) int local134 = this.anIntArray456[local128];
			@Pc(139) int local139 = this.anIntArray468[local128];
			@Pc(144) int local144 = this.anIntArray459[local128];
			@Pc(156) int local156 = arg0 + (arg1 - arg0) * (local134 + 64) / 128;
			@Pc(168) int local168 = arg3 + (arg2 - arg3) * (local134 + 64) / 128;
			@Pc(180) int local180 = local156 + (local168 - local156) * (local144 + 64) / 128;
			local16.anIntArray468[local128] = local139 + local180 - local126;
		}
		local16.method1899();
		return local16;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
	public void method1882() {
		if (this.aBoolean120) {
			return;
		}
		super.anInt2778 = 0;
		this.anInt2704 = 0;
		this.anInt2696 = 999999;
		this.anInt2701 = -999999;
		this.anInt2697 = -99999;
		this.anInt2702 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2699; local23++) {
			@Pc(29) int local29 = this.anIntArray456[local23];
			@Pc(34) int local34 = this.anIntArray468[local23];
			@Pc(39) int local39 = this.anIntArray459[local23];
			if (local29 < this.anInt2696) {
				this.anInt2696 = local29;
			}
			if (local29 > this.anInt2701) {
				this.anInt2701 = local29;
			}
			if (local39 < this.anInt2702) {
				this.anInt2702 = local39;
			}
			if (local39 > this.anInt2697) {
				this.anInt2697 = local39;
			}
			if (-local34 > super.anInt2778) {
				super.anInt2778 = -local34;
			}
			if (local34 > this.anInt2704) {
				this.anInt2704 = local34;
			}
		}
		this.aBoolean120 = true;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "()V")
	private void method1883() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray465 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2699; local9++) {
				local15 = this.anIntArray465[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray27 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray27[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2699) {
				local65 = this.anIntArray465[local59];
				this.anIntArrayArray27[local65][local5[local65]++] = local59++;
			}
			this.anIntArray465 = null;
		}
		if (this.anIntArray466 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2700; local9++) {
			local15 = this.anIntArray466[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray28 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray28[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2700) {
			local65 = this.anIntArray466[local59];
			this.anIntArrayArray28[local65][local5[local65]++] = local59++;
		}
		this.anIntArray466 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!ub;I)I")
	private int method1884(@OriginalArg(0) Class1_Sub2_Sub3_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray456[arg1];
		@Pc(11) int local11 = arg0.anIntArray468[arg1];
		@Pc(16) int local16 = arg0.anIntArray459[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2699; local18++) {
			if (local6 == this.anIntArray456[local18] && local11 == this.anIntArray468[local18] && local16 == this.anIntArray459[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray456[this.anInt2699] = local6;
			this.anIntArray468[this.anInt2699] = local11;
			this.anIntArray459[this.anInt2699] = local16;
			if (arg0.anIntArray465 != null) {
				this.anIntArray465[this.anInt2699] = arg0.anIntArray465[arg1];
			}
			local1 = this.anInt2699++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "()V")
	public void method1885() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2699; local1++) {
			@Pc(7) int local7 = this.anIntArray459[local1];
			this.anIntArray459[local1] = this.anIntArray456[local1];
			this.anIntArray456[local1] = -local7;
		}
		this.method1899();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(SS)V")
	public void method1888(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2700; local1++) {
			if (this.aShortArray14[local1] == arg0) {
				this.aShortArray14[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "()Lclient!ub;")
	public Class1_Sub2_Sub3_Sub7 method1889() {
		@Pc(3) Class1_Sub2_Sub3_Sub7 local3 = new Class1_Sub2_Sub3_Sub7();
		if (this.aByteArray37 != null) {
			local3.aByteArray37 = new byte[this.anInt2700];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2700; local13++) {
				local3.aByteArray37[local13] = this.aByteArray37[local13];
			}
		}
		local3.anInt2699 = this.anInt2699;
		local3.anInt2700 = this.anInt2700;
		local3.anInt2698 = this.anInt2698;
		local3.anIntArray456 = this.anIntArray456;
		local3.anIntArray468 = this.anIntArray468;
		local3.anIntArray459 = this.anIntArray459;
		local3.anIntArray457 = this.anIntArray457;
		local3.anIntArray458 = this.anIntArray458;
		local3.anIntArray461 = this.anIntArray461;
		local3.aByteArray34 = this.aByteArray34;
		local3.aByteArray36 = this.aByteArray36;
		local3.aByteArray35 = this.aByteArray35;
		local3.aShortArray14 = this.aShortArray14;
		local3.aByte6 = this.aByte6;
		local3.anIntArray460 = this.anIntArray460;
		local3.anIntArray467 = this.anIntArray467;
		local3.anIntArray462 = this.anIntArray462;
		local3.anIntArray465 = this.anIntArray465;
		local3.anIntArray466 = this.anIntArray466;
		local3.anIntArrayArray27 = this.anIntArrayArray27;
		local3.anIntArrayArray28 = this.anIntArrayArray28;
		local3.aClass33Array1 = this.aClass33Array1;
		local3.aClass68Array1 = this.aClass68Array1;
		local3.aShort1 = this.aShort1;
		local3.aShort2 = this.aShort2;
		return local3;
	}

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "()V")
	public void method1892() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2699; local1++) {
			this.anIntArray456[local1] = -this.anIntArray456[local1];
			this.anIntArray459[local1] = -this.anIntArray459[local1];
		}
		this.method1899();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII)Lclient!da;")
	public Class1_Sub2_Sub3_Sub2 method1893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1898();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class1_Sub2_Sub3_Sub2 local26 = new Class1_Sub2_Sub3_Sub2();
		local26.anIntArray110 = new int[this.anInt2700];
		local26.anIntArray105 = new int[this.anInt2700];
		local26.anIntArray103 = new int[this.anInt2700];
		for (@Pc(43) int local43 = 0; local43 < this.anInt2700; local43++) {
			@Pc(49) byte local49;
			if (this.aByteArray37 == null) {
				local49 = 0;
			} else {
				local49 = this.aByteArray37[local43];
			}
			@Pc(92) Class33 local92;
			@Pc(123) int local123;
			@Pc(253) Class68 local253;
			if (this.aByteArray35 == null || this.aByteArray35[local43] == -1) {
				if (local49 == 0) {
					@Pc(73) int local73 = this.aShortArray14[local43] & 0xFFFF;
					if (this.aClass33Array2 == null || this.aClass33Array2[this.anIntArray457[local43]] == null) {
						local92 = this.aClass33Array1[this.anIntArray457[local43]];
					} else {
						local92 = this.aClass33Array2[this.anIntArray457[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt1219 + arg3 * local92.anInt1223 + arg4 * local92.anInt1222) / (local22 * local92.anInt1218);
					local26.anIntArray110[local43] = Static117.method1887(local73, local123);
					if (this.aClass33Array2 == null || this.aClass33Array2[this.anIntArray458[local43]] == null) {
						local92 = this.aClass33Array1[this.anIntArray458[local43]];
					} else {
						local92 = this.aClass33Array2[this.anIntArray458[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt1219 + arg3 * local92.anInt1223 + arg4 * local92.anInt1222) / (local22 * local92.anInt1218);
					local26.anIntArray105[local43] = Static117.method1887(local73, local123);
					if (this.aClass33Array2 == null || this.aClass33Array2[this.anIntArray461[local43]] == null) {
						local92 = this.aClass33Array1[this.anIntArray461[local43]];
					} else {
						local92 = this.aClass33Array2[this.anIntArray461[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt1219 + arg3 * local92.anInt1223 + arg4 * local92.anInt1222) / (local22 * local92.anInt1218);
					local26.anIntArray103[local43] = Static117.method1887(local73, local123);
				} else if (local49 == 1) {
					local253 = this.aClass68Array1[local43];
					local123 = arg0 + (arg2 * local253.anInt2363 + arg3 * local253.anInt2368 + arg4 * local253.anInt2364) / (local22 + local22 / 2);
					local26.anIntArray110[local43] = Static117.method1887(this.aShortArray14[local43] & 0xFFFF, local123);
					local26.anIntArray103[local43] = -1;
				} else {
					local26.anIntArray103[local43] = -2;
				}
			} else if (local49 == 0) {
				if (this.aClass33Array2 == null || this.aClass33Array2[this.anIntArray457[local43]] == null) {
					local92 = this.aClass33Array1[this.anIntArray457[local43]];
				} else {
					local92 = this.aClass33Array2[this.anIntArray457[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt1219 + arg3 * local92.anInt1223 + arg4 * local92.anInt1222) / (local22 * local92.anInt1218);
				local26.anIntArray110[local43] = Static117.method1895(local123);
				if (this.aClass33Array2 == null || this.aClass33Array2[this.anIntArray458[local43]] == null) {
					local92 = this.aClass33Array1[this.anIntArray458[local43]];
				} else {
					local92 = this.aClass33Array2[this.anIntArray458[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt1219 + arg3 * local92.anInt1223 + arg4 * local92.anInt1222) / (local22 * local92.anInt1218);
				local26.anIntArray105[local43] = Static117.method1895(local123);
				if (this.aClass33Array2 == null || this.aClass33Array2[this.anIntArray461[local43]] == null) {
					local92 = this.aClass33Array1[this.anIntArray461[local43]];
				} else {
					local92 = this.aClass33Array2[this.anIntArray461[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt1219 + arg3 * local92.anInt1223 + arg4 * local92.anInt1222) / (local22 * local92.anInt1218);
				local26.anIntArray103[local43] = Static117.method1895(local123);
			} else if (local49 == 1) {
				local253 = this.aClass68Array1[local43];
				local123 = arg0 + (arg2 * local253.anInt2363 + arg3 * local253.anInt2368 + arg4 * local253.anInt2364) / (local22 + local22 / 2);
				local26.anIntArray110[local43] = Static117.method1895(local123);
				local26.anIntArray103[local43] = -1;
			} else {
				local26.anIntArray103[local43] = -2;
			}
		}
		this.method1883();
		local26.anInt567 = this.anInt2699;
		local26.anIntArray111 = this.anIntArray456;
		local26.anIntArray108 = this.anIntArray468;
		local26.anIntArray113 = this.anIntArray459;
		local26.anInt571 = this.anInt2700;
		local26.anIntArray129 = this.anIntArray457;
		local26.anIntArray106 = this.anIntArray458;
		local26.anIntArray112 = this.anIntArray461;
		local26.aByteArray5 = this.aByteArray34;
		local26.aByteArray8 = this.aByteArray36;
		local26.aByteArray6 = this.aByteArray35;
		if (local26.aByteArray6 == null) {
			local26.aShortArray1 = null;
		} else {
			local26.aShortArray1 = this.aShortArray14;
		}
		local26.aByte1 = this.aByte6;
		local26.anInt568 = this.anInt2698;
		local26.anIntArray109 = this.anIntArray460;
		local26.anIntArray107 = this.anIntArray467;
		local26.anIntArray104 = this.anIntArray462;
		local26.anIntArrayArray6 = this.anIntArrayArray27;
		local26.anIntArrayArray5 = this.anIntArrayArray28;
		return local26;
	}

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "()V")
	public void method1894() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2699; local1++) {
			@Pc(7) int local7 = this.anIntArray456[local1];
			this.anIntArray456[local1] = this.anIntArray459[local1];
			this.anIntArray459[local1] = -local7;
		}
		this.method1899();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
	public void method1896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2699; local1++) {
			this.anIntArray456[local1] += arg0;
			this.anIntArray468[local1] += arg1;
			this.anIntArray459[local1] += arg2;
		}
		this.method1899();
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)V")
	public void method1897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2699; local1++) {
			this.anIntArray456[local1] = this.anIntArray456[local1] * arg0 / 128;
			this.anIntArray468[local1] = this.anIntArray468[local1] * arg1 / 128;
			this.anIntArray459[local1] = this.anIntArray459[local1] * arg2 / 128;
		}
		this.method1899();
	}

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "()V")
	public void method1898() {
		if (this.aClass33Array1 != null) {
			return;
		}
		this.aClass33Array1 = new Class33[this.anInt2699];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2699; local10++) {
			this.aClass33Array1[local10] = new Class33();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2700; local25++) {
			@Pc(31) int local31 = this.anIntArray457[local25];
			@Pc(36) int local36 = this.anIntArray458[local25];
			@Pc(41) int local41 = this.anIntArray461[local25];
			@Pc(51) int local51 = this.anIntArray456[local36] - this.anIntArray456[local31];
			@Pc(61) int local61 = this.anIntArray468[local36] - this.anIntArray468[local31];
			@Pc(71) int local71 = this.anIntArray459[local36] - this.anIntArray459[local31];
			@Pc(81) int local81 = this.anIntArray456[local41] - this.anIntArray456[local31];
			@Pc(91) int local91 = this.anIntArray468[local41] - this.anIntArray468[local31];
			@Pc(101) int local101 = this.anIntArray459[local41] - this.anIntArray459[local31];
			@Pc(109) int local109 = local61 * local101 - local91 * local71;
			@Pc(117) int local117 = local71 * local81 - local101 * local51;
			@Pc(125) int local125;
			for (local125 = local51 * local91 - local81 * local61; local109 > 8192 || local117 > 8192 || local125 > 8192 || local109 < -8192 || local117 < -8192 || local125 < -8192; local125 >>= 0x1) {
				local109 >>= 0x1;
				local117 >>= 0x1;
			}
			@Pc(171) int local171 = (int) Math.sqrt((double) (local109 * local109 + local117 * local117 + local125 * local125));
			if (local171 <= 0) {
				local171 = 1;
			}
			local109 = local109 * 256 / local171;
			local117 = local117 * 256 / local171;
			local125 = local125 * 256 / local171;
			@Pc(198) byte local198;
			if (this.aByteArray37 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray37[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class33 local211 = this.aClass33Array1[local31];
				local211.anInt1219 += local109;
				local211.anInt1223 += local117;
				local211.anInt1222 += local125;
				local211.anInt1218++;
				@Pc(240) Class33 local240 = this.aClass33Array1[local36];
				local240.anInt1219 += local109;
				local240.anInt1223 += local117;
				local240.anInt1222 += local125;
				local240.anInt1218++;
				@Pc(269) Class33 local269 = this.aClass33Array1[local41];
				local269.anInt1219 += local109;
				local269.anInt1223 += local117;
				local269.anInt1222 += local125;
				local269.anInt1218++;
			} else if (local198 == 1) {
				if (this.aClass68Array1 == null) {
					this.aClass68Array1 = new Class68[this.anInt2700];
				}
				@Pc(314) Class68 local314 = this.aClass68Array1[local25] = new Class68();
				local314.anInt2363 = local109;
				local314.anInt2368 = local117;
				local314.anInt2364 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "()V")
	private void method1899() {
		this.aClass33Array1 = null;
		this.aClass33Array2 = null;
		this.aClass68Array1 = null;
		this.aBoolean120 = false;
	}

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "()V")
	public void method1900() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2699; local1++) {
			this.anIntArray459[local1] = -this.anIntArray459[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt2700; local18++) {
			@Pc(24) int local24 = this.anIntArray457[local18];
			this.anIntArray457[local18] = this.anIntArray461[local18];
			this.anIntArray461[local18] = local24;
		}
		this.method1899();
	}
}

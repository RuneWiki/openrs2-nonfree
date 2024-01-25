import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class122 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "[S")
	public short[] aShortArray116;

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "[I")
	public int[] anIntArray242;

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "[S")
	public short[] aShortArray117;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "[S")
	public short[] aShortArray118;

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "[S")
	public short[] aShortArray119;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "[I")
	public int[] anIntArray243;

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "[S")
	public short[] aShortArray120;

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "[S")
	public short[] aShortArray121;

	@OriginalMember(owner = "client!jq", name = "r", descriptor = "[I")
	public int[] anIntArray244;

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "[Lclient!pf;")
	public Class179[] aClass179Array3;

	@OriginalMember(owner = "client!jq", name = "v", descriptor = "[I")
	public int[] anIntArray245;

	@OriginalMember(owner = "client!jq", name = "w", descriptor = "[Lclient!me;")
	public Class147[] aClass147Array1;

	@OriginalMember(owner = "client!jq", name = "z", descriptor = "[S")
	public short[] aShortArray122;

	@OriginalMember(owner = "client!jq", name = "B", descriptor = "[S")
	public short[] aShortArray123;

	@OriginalMember(owner = "client!jq", name = "K", descriptor = "[I")
	public int[] anIntArray246;

	@OriginalMember(owner = "client!jq", name = "L", descriptor = "[S")
	public short[] aShortArray124;

	@OriginalMember(owner = "client!jq", name = "N", descriptor = "[Lclient!bu;")
	public Class29[] aClass29Array3;

	@OriginalMember(owner = "client!jq", name = "Q", descriptor = "[I")
	public int[] anIntArray247;

	@OriginalMember(owner = "client!jq", name = "R", descriptor = "[I")
	public int[] anIntArray248;

	@OriginalMember(owner = "client!jq", name = "U", descriptor = "[I")
	public int[] anIntArray249;

	@OriginalMember(owner = "client!jq", name = "V", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!jq", name = "X", descriptor = "[I")
	public int[] anIntArray250;

	@OriginalMember(owner = "client!jq", name = "Z", descriptor = "[I")
	public int[] anIntArray251;

	@OriginalMember(owner = "client!jq", name = "ab", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!jq", name = "bb", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!jq", name = "cb", descriptor = "[S")
	public short[] aShortArray125;

	@OriginalMember(owner = "client!jq", name = "eb", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!jq", name = "fb", descriptor = "[I")
	public int[] anIntArray252;

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
	public int anInt3668 = 0;

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "B")
	public byte aByte27 = 0;

	@OriginalMember(owner = "client!jq", name = "C", descriptor = "I")
	public int anInt3677 = 0;

	@OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
	public int anInt3681 = 12;

	@OriginalMember(owner = "client!jq", name = "S", descriptor = "I")
	public int anInt3686 = 0;

	@OriginalMember(owner = "client!jq", name = "db", descriptor = "I")
	public int anInt3689 = 0;

	static {
		new Class83("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "([B)V")
	public Class122(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3051(arg0);
		} else {
			this.method3054(arg0);
		}
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(III)V")
	public Class122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray46 = new byte[arg1];
		this.aShortArray119 = new short[arg1];
		this.aShortArray123 = new short[arg1];
		this.aShortArray120 = new short[arg1];
		this.anIntArray251 = new int[arg0];
		this.anIntArray246 = new int[arg0];
		this.aByteArray43 = new byte[arg1];
		this.aByteArray44 = new byte[arg1];
		this.aShortArray125 = new short[arg1];
		if (arg2 > 0) {
			this.anIntArray247 = new int[arg2];
			this.aShortArray124 = new short[arg2];
			this.anIntArray250 = new int[arg2];
			this.anIntArray243 = new int[arg2];
			this.aByteArray41 = new byte[arg2];
			this.anIntArray252 = new int[arg2];
			this.aByteArray47 = new byte[arg2];
			this.anIntArray248 = new int[arg2];
			this.aByteArray45 = new byte[arg2];
			this.aShortArray118 = new short[arg2];
			this.anIntArray249 = new int[arg2];
			this.aShortArray116 = new short[arg2];
		}
		this.aByteArray42 = new byte[arg1];
		this.anIntArray245 = new int[arg1];
		this.aShortArray117 = new short[arg1];
		this.anIntArray242 = new int[arg0];
		this.anIntArray244 = new int[arg0];
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "([Lclient!jq;I)V")
	public Class122(@OriginalArg(0) Class122[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3668 = 0;
		this.anInt3689 = 0;
		this.anInt3686 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte27 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class122 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt3689 += local59.anInt3689;
				this.anInt3668 += local59.anInt3668;
				this.anInt3686 += local59.anInt3686;
				if (local59.aClass147Array1 != null) {
					local36 += local59.aClass147Array1.length;
				}
				local38 |= local59.aByteArray43 != null;
				if (local59.aClass179Array3 != null) {
					local34 += local59.aClass179Array3.length;
				}
				if (local59.aClass29Array3 != null) {
					local32 += local59.aClass29Array3.length;
				}
				local46 |= local59.aShortArray125 != null;
				local51 |= local59.anIntArray245 != null;
				local44 |= local59.aByteArray46 != null;
				local42 |= local59.aByteArray44 != null;
				if (local59.aByteArray42 == null) {
					if (this.aByte27 == -1) {
						this.aByte27 = local59.aByte27;
					}
					if (this.aByte27 != local59.aByte27) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
			}
		}
		if (local51) {
			this.anIntArray245 = new int[this.anInt3686];
		}
		if (local46) {
			this.aShortArray125 = new short[this.anInt3686];
		}
		this.anIntArray246 = new int[this.anInt3668];
		this.aShortArray121 = new short[this.anInt3686];
		if (local32 > 0) {
			this.aClass29Array3 = new Class29[local32];
		}
		this.anIntArray251 = new int[this.anInt3668];
		if (local42) {
			this.aByteArray44 = new byte[this.anInt3686];
		}
		if (local36 > 0) {
			this.aClass147Array1 = new Class147[local36];
		}
		this.aShortArray117 = new short[this.anInt3686];
		this.anIntArray242 = new int[this.anInt3668];
		this.aShortArray119 = new short[this.anInt3686];
		if (local40) {
			this.aByteArray42 = new byte[this.anInt3686];
		}
		if (local44) {
			this.aByteArray46 = new byte[this.anInt3686];
		}
		if (this.anInt3689 > 0) {
			this.aByteArray45 = new byte[this.anInt3689];
			this.aShortArray124 = new short[this.anInt3689];
			this.anIntArray249 = new int[this.anInt3689];
			this.anIntArray247 = new int[this.anInt3689];
			this.aByteArray41 = new byte[this.anInt3689];
			this.anIntArray248 = new int[this.anInt3689];
			this.anIntArray250 = new int[this.anInt3689];
			this.aShortArray116 = new short[this.anInt3689];
			this.aShortArray118 = new short[this.anInt3689];
			this.anIntArray252 = new int[this.anInt3689];
			this.aByteArray47 = new byte[this.anInt3689];
			this.anIntArray243 = new int[this.anInt3689];
		}
		this.aShortArray122 = new short[this.anInt3668];
		if (local34 > 0) {
			this.aClass179Array3 = new Class179[local34];
		}
		if (local38) {
			this.aByteArray43 = new byte[this.anInt3686];
		}
		this.aShortArray120 = new short[this.anInt3686];
		this.anIntArray244 = new int[this.anInt3668];
		this.aShortArray123 = new short[this.anInt3686];
		local34 = 0;
		this.anInt3668 = 0;
		this.anInt3689 = 0;
		local32 = 0;
		this.anInt3686 = 0;
		local36 = 0;
		@Pc(616) int local616;
		@Pc(627) int local627;
		for (@Pc(384) int local384 = 0; local384 < arg1; local384++) {
			@Pc(391) short local391 = (short) (0x1 << local384);
			@Pc(395) Class122 local395 = arg0[local384];
			if (local395 != null) {
				@Pc(402) int local402;
				if (local395.aClass147Array1 != null) {
					for (local402 = 0; local402 < local395.aClass147Array1.length; local402++) {
						@Pc(409) Class147 local409 = local395.aClass147Array1[local402];
						this.aClass147Array1[local36++] = local409.method3554(this.anInt3686 + local409.anInt4521);
					}
				}
				for (local402 = 0; local402 < local395.anInt3686; local402++) {
					if (local38 && local395.aByteArray43 != null) {
						this.aByteArray43[this.anInt3686] = local395.aByteArray43[local402];
					}
					if (local40) {
						if (local395.aByteArray42 == null) {
							this.aByteArray42[this.anInt3686] = local395.aByte27;
						} else {
							this.aByteArray42[this.anInt3686] = local395.aByteArray42[local402];
						}
					}
					if (local42 && local395.aByteArray44 != null) {
						this.aByteArray44[this.anInt3686] = local395.aByteArray44[local402];
					}
					if (local46) {
						if (local395.aShortArray125 == null) {
							this.aShortArray125[this.anInt3686] = -1;
						} else {
							this.aShortArray125[this.anInt3686] = local395.aShortArray125[local402];
						}
					}
					if (local51) {
						if (local395.anIntArray245 == null) {
							this.anIntArray245[this.anInt3686] = -1;
						} else {
							this.anIntArray245[this.anInt3686] = local395.anIntArray245[local402];
						}
					}
					this.aShortArray120[this.anInt3686] = (short) this.method3043(local395, local395.aShortArray120[local402], local391);
					this.aShortArray119[this.anInt3686] = (short) this.method3043(local395, local395.aShortArray119[local402], local391);
					this.aShortArray117[this.anInt3686] = (short) this.method3043(local395, local395.aShortArray117[local402], local391);
					this.aShortArray121[this.anInt3686] = local391;
					this.aShortArray123[this.anInt3686] = local395.aShortArray123[local402];
					this.anInt3686++;
				}
				@Pc(603) int local603;
				if (local395.aClass29Array3 != null) {
					for (local603 = 0; local603 < local395.aClass29Array3.length; local603++) {
						local616 = this.method3043(local395, local395.aClass29Array3[local603].anInt706, local391);
						local627 = this.method3043(local395, local395.aClass29Array3[local603].anInt713, local391);
						@Pc(638) int local638 = this.method3043(local395, local395.aClass29Array3[local603].anInt698, local391);
						this.aClass29Array3[local32] = local395.aClass29Array3[local603].method694(local616, local627, local638);
						local32++;
					}
				}
				if (local395.aClass179Array3 != null) {
					for (local603 = 0; local603 < local395.aClass179Array3.length; local603++) {
						local616 = this.method3043(local395, local395.aClass179Array3[local603].anInt5338, local391);
						this.aClass179Array3[local34] = local395.aClass179Array3[local603].method4104(local616);
						local34++;
					}
				}
			}
		}
		this.anInt3677 = this.anInt3668;
		@Pc(704) int local704 = 0;
		for (@Pc(706) int local706 = 0; local706 < arg1; local706++) {
			@Pc(713) short local713 = (short) (0x1 << local706);
			@Pc(717) Class122 local717 = arg0[local706];
			if (local717 != null) {
				for (local616 = 0; local616 < local717.anInt3686; local616++) {
					if (local44) {
						this.aByteArray46[local704++] = (byte) (local717.aByteArray46 == null || local717.aByteArray46[local616] == -1 ? -1 : local717.aByteArray46[local616] + this.anInt3689);
					}
				}
				for (local627 = 0; local627 < local717.anInt3689; local627++) {
					@Pc(773) byte local773 = this.aByteArray47[this.anInt3689] = local717.aByteArray47[local627];
					if (local773 == 0) {
						this.aShortArray118[this.anInt3689] = (short) this.method3043(local717, local717.aShortArray118[local627], local713);
						this.aShortArray116[this.anInt3689] = (short) this.method3043(local717, local717.aShortArray116[local627], local713);
						this.aShortArray124[this.anInt3689] = (short) this.method3043(local717, local717.aShortArray124[local627], local713);
					}
					if (local773 >= 1 && local773 <= 3) {
						this.aShortArray118[this.anInt3689] = local717.aShortArray118[local627];
						this.aShortArray116[this.anInt3689] = local717.aShortArray116[local627];
						this.aShortArray124[this.anInt3689] = local717.aShortArray124[local627];
						this.anIntArray249[this.anInt3689] = local717.anIntArray249[local627];
						this.anIntArray248[this.anInt3689] = local717.anIntArray248[local627];
						this.anIntArray250[this.anInt3689] = local717.anIntArray250[local627];
						this.aByteArray41[this.anInt3689] = local717.aByteArray41[local627];
						this.aByteArray45[this.anInt3689] = local717.aByteArray45[local627];
						this.anIntArray252[this.anInt3689] = local717.anIntArray252[local627];
					}
					if (local773 == 2) {
						this.anIntArray243[this.anInt3689] = local717.anIntArray243[local627];
						this.anIntArray247[this.anInt3689] = local717.anIntArray247[local627];
					}
					this.anInt3689++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)[[I")
	public int[][] method3037() {
		@Pc(16) int[] local16 = new int[256];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.aClass147Array1.length; local20++) {
			@Pc(28) int local28 = this.aClass147Array1[local20].anInt4527;
			if (local28 >= 0) {
				if (local18 < local28) {
					local18 = local28;
				}
				@Pc(39) int local39 = local16[local28]++;
			}
		}
		@Pc(57) int[][] local57 = new int[local18 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local18; local59++) {
			local57[local59] = new int[local16[local59]];
			local16[local59] = 0;
		}
		for (@Pc(82) int local82 = 0; local82 < this.aClass147Array1.length; local82++) {
			@Pc(90) int local90 = this.aClass147Array1[local82].anInt4527;
			if (local90 >= 0) {
				local57[local90][local16[local90]++] = local82;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(SIS)V")
	public void method3038(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray125 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt3686; local11++) {
			if (this.aShortArray125[local11] == arg1) {
				this.aShortArray125[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)V")
	public void method3039() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3668; local7++) {
			this.anIntArray244[local7] <<= 0x0;
			this.anIntArray242[local7] <<= 0x0;
			this.anIntArray251[local7] <<= 0x0;
		}
		if (this.anInt3689 <= 0 || this.anIntArray249 == null) {
			return;
		}
		for (@Pc(57) int local57 = 0; local57 < this.anIntArray249.length; local57++) {
			this.anIntArray249[local57] <<= 0x0;
			this.anIntArray248[local57] <<= 0x0;
			if (this.aByteArray47[local57] != 1) {
				this.anIntArray250[local57] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIII)I")
	public int method3040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3668; local7++) {
			if (arg2 == this.anIntArray244[local7] && arg1 == this.anIntArray242[local7] && arg0 == this.anIntArray251[local7]) {
				return local7;
			}
		}
		this.anIntArray244[this.anInt3668] = arg2;
		this.anIntArray242[this.anInt3668] = arg1;
		this.anIntArray251[this.anInt3668] = arg0;
		this.anInt3677 = this.anInt3668 + 1;
		return this.anInt3668++;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(IIII)V")
	public void method3041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(14) int local14 = 0; local14 < this.anInt3668; local14++) {
			this.anIntArray244[local14] += arg1;
			this.anIntArray242[local14] += arg0;
			this.anIntArray251[local14] += arg2;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BSBSISSBSS)B")
	public byte method3042() {
		if (this.anInt3689 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray47[this.anInt3689] = 3;
		this.aShortArray118[this.anInt3689] = 0;
		this.aShortArray116[this.anInt3689] = 32767;
		this.aShortArray124[this.anInt3689] = 0;
		this.anIntArray249[this.anInt3689] = 1024;
		this.anIntArray248[this.anInt3689] = 1024;
		this.anIntArray250[this.anInt3689] = 1024;
		this.aByteArray41[this.anInt3689] = 0;
		this.aByteArray45[this.anInt3689] = 0;
		this.anIntArray252[this.anInt3689] = 0;
		return (byte) this.anInt3689++;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!jq;IIS)I")
	private int method3043(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg0.anIntArray244[arg1];
		@Pc(23) int local23 = arg0.anIntArray242[arg1];
		@Pc(28) int local28 = arg0.anIntArray251[arg1];
		for (@Pc(30) int local30 = 0; local30 < this.anInt3668; local30++) {
			if (local10 == this.anIntArray244[local30] && local23 == this.anIntArray242[local30] && this.anIntArray251[local30] == local28) {
				this.aShortArray122[local30] |= arg2;
				return local30;
			}
		}
		this.anIntArray244[this.anInt3668] = local10;
		this.anIntArray242[this.anInt3668] = local23;
		this.anIntArray251[this.anInt3668] = local28;
		this.aShortArray122[this.anInt3668] = arg2;
		this.anIntArray246[this.anInt3668] = arg0.anIntArray246 == null ? -1 : arg0.anIntArray246[arg1];
		return this.anInt3668++;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)[[I")
	public int[][] method3045() {
		@Pc(13) int[] local13 = new int[256];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt3686; local17++) {
			@Pc(24) int local24 = this.anIntArray245[local17];
			if (local24 >= 0) {
				if (local24 > local15) {
					local15 = local24;
				}
				@Pc(42) int local42 = local13[local24]++;
			}
		}
		@Pc(59) int[][] local59 = new int[local15 + 1][];
		for (@Pc(61) int local61 = 0; local61 <= local15; local61++) {
			local59[local61] = new int[local13[local61]];
			local13[local61] = 0;
		}
		for (@Pc(84) int local84 = 0; local84 < this.anInt3686; local84++) {
			@Pc(91) int local91 = this.anIntArray245[local84];
			if (local91 >= 0) {
				local59[local91][local13[local91]++] = local84;
			}
		}
		return local59;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ISBIIISBB)I")
	public int method3047(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) short arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray120[this.anInt3686] = (short) arg3;
		this.aShortArray119[this.anInt3686] = (short) arg4;
		this.aShortArray117[this.anInt3686] = (short) arg0;
		this.aByteArray43[this.anInt3686] = arg6;
		this.aByteArray46[this.anInt3686] = arg2;
		this.aShortArray123[this.anInt3686] = arg5;
		this.aByteArray44[this.anInt3686] = arg7;
		this.aShortArray125[this.anInt3686] = arg1;
		return this.anInt3686++;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)[[I")
	public int[][] method3050() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt3677; local12++) {
			@Pc(27) int local27 = this.anIntArray246[local12];
			if (local27 >= 0) {
				if (local27 > local10) {
					local10 = local27;
				}
				@Pc(41) int local41 = local8[local27]++;
			}
		}
		@Pc(58) int[][] local58 = new int[local10 + 1][];
		for (@Pc(60) int local60 = 0; local60 <= local10; local60++) {
			local58[local60] = new int[local8[local60]];
			local8[local60] = 0;
		}
		for (@Pc(83) int local83 = 0; local83 < this.anInt3677; local83++) {
			@Pc(90) int local90 = this.anIntArray246[local83];
			if (local90 >= 0) {
				local58[local90][local8[local90]++] = local83;
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I[B)V")
	private void method3051(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class4_Sub12 local10 = new Class4_Sub12(arg0);
		@Pc(15) Class4_Sub12 local15 = new Class4_Sub12(arg0);
		@Pc(20) Class4_Sub12 local20 = new Class4_Sub12(arg0);
		@Pc(25) Class4_Sub12 local25 = new Class4_Sub12(arg0);
		@Pc(30) Class4_Sub12 local30 = new Class4_Sub12(arg0);
		@Pc(35) Class4_Sub12 local35 = new Class4_Sub12(arg0);
		@Pc(40) Class4_Sub12 local40 = new Class4_Sub12(arg0);
		local10.anInt2997 = arg0.length - 23;
		this.anInt3668 = local10.method2536();
		this.anInt3686 = local10.method2536();
		this.anInt3689 = local10.method2490();
		@Pc(65) int local65 = local10.method2490();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(94) boolean local94 = (local65 & 0x4) == 4;
		@Pc(103) boolean local103 = (local65 & 0x8) == 8;
		if (local103) {
			local10.anInt2997 -= 7;
			this.anInt3681 = local10.method2490();
			local10.anInt2997 += 6;
		}
		@Pc(126) int local126 = local10.method2490();
		@Pc(130) int local130 = local10.method2490();
		@Pc(134) int local134 = local10.method2490();
		@Pc(138) int local138 = local10.method2490();
		@Pc(142) int local142 = local10.method2490();
		@Pc(146) int local146 = local10.method2536();
		@Pc(150) int local150 = local10.method2536();
		@Pc(154) int local154 = local10.method2536();
		@Pc(158) int local158 = local10.method2536();
		@Pc(162) int local162 = local10.method2536();
		@Pc(164) int local164 = 0;
		@Pc(166) int local166 = 0;
		@Pc(168) int local168 = 0;
		@Pc(181) int local181;
		if (this.anInt3689 > 0) {
			local10.anInt2997 = 0;
			this.aByteArray47 = new byte[this.anInt3689];
			for (local181 = 0; local181 < this.anInt3689; local181++) {
				@Pc(192) byte local192 = this.aByteArray47[local181] = local10.method2542();
				if (local192 == 2) {
					local168++;
				}
				if (local192 >= 1 && local192 <= 3) {
					local166++;
				}
				if (local192 == 0) {
					local164++;
				}
			}
		}
		local181 = this.anInt3689;
		@Pc(222) int local222 = local181;
		local181 += this.anInt3668;
		@Pc(229) int local229 = local181;
		if (local76) {
			local181 += this.anInt3686;
		}
		@Pc(238) int local238 = local181;
		local181 += this.anInt3686;
		@Pc(245) int local245 = local181;
		if (local126 == 255) {
			local181 += this.anInt3686;
		}
		@Pc(255) int local255 = local181;
		if (local134 == 1) {
			local181 += this.anInt3686;
		}
		@Pc(265) int local265 = local181;
		if (local142 == 1) {
			local181 += this.anInt3668;
		}
		@Pc(277) int local277 = local181;
		if (local130 == 1) {
			local181 += this.anInt3686;
		}
		@Pc(289) int local289 = local181;
		local181 += local158;
		@Pc(295) int local295 = local181;
		if (local138 == 1) {
			local181 += this.anInt3686 * 2;
		}
		@Pc(309) int local309 = local181;
		local181 += local162;
		@Pc(315) int local315 = local181;
		local181 += this.anInt3686 * 2;
		@Pc(324) int local324 = local181;
		local181 += local146;
		@Pc(330) int local330 = local181;
		local181 += local150;
		@Pc(336) int local336 = local181;
		local181 += local154;
		@Pc(342) int local342 = local181;
		local181 += local164 * 6;
		@Pc(350) int local350 = local181;
		local181 += local166 * 6;
		@Pc(368) int local368 = this.anInt3681 < 14 ? 6 : 7;
		@Pc(370) int local370 = local181;
		local181 += local166 * local368;
		@Pc(378) int local378 = local181;
		local181 += local166;
		@Pc(384) int local384 = local181;
		local181 += local166;
		@Pc(390) int local390 = local181;
		local181 += local166 + local168 * 2;
		this.aShortArray120 = new short[this.anInt3686];
		this.aShortArray119 = new short[this.anInt3686];
		if (local126 == 255) {
			this.aByteArray42 = new byte[this.anInt3686];
		} else {
			this.aByte27 = (byte) local126;
		}
		if (local134 == 1) {
			this.anIntArray245 = new int[this.anInt3686];
		}
		this.anIntArray242 = new int[this.anInt3668];
		this.aShortArray123 = new short[this.anInt3686];
		if (local138 == 1) {
			this.aShortArray125 = new short[this.anInt3686];
		}
		if (local76) {
			this.aByteArray43 = new byte[this.anInt3686];
		}
		if (local142 == 1) {
			this.anIntArray246 = new int[this.anInt3668];
		}
		this.anIntArray244 = new int[this.anInt3668];
		if (local130 == 1) {
			this.aByteArray44 = new byte[this.anInt3686];
		}
		this.aShortArray117 = new short[this.anInt3686];
		if (this.anInt3689 > 0) {
			this.aShortArray116 = new short[this.anInt3689];
			if (local166 > 0) {
				this.anIntArray249 = new int[local166];
				this.aByteArray45 = new byte[local166];
				this.aByteArray41 = new byte[local166];
				this.anIntArray250 = new int[local166];
				this.anIntArray248 = new int[local166];
				this.anIntArray252 = new int[local166];
			}
			if (local168 > 0) {
				this.anIntArray243 = new int[local168];
				this.anIntArray247 = new int[local168];
			}
			this.aShortArray118 = new short[this.anInt3689];
			this.aShortArray124 = new short[this.anInt3689];
		}
		if (local138 == 1 && this.anInt3689 > 0) {
			this.aByteArray46 = new byte[this.anInt3686];
		}
		local10.anInt2997 = local222;
		this.anIntArray251 = new int[this.anInt3668];
		local15.anInt2997 = local324;
		local20.anInt2997 = local330;
		local25.anInt2997 = local336;
		local30.anInt2997 = local265;
		@Pc(577) int local577 = 0;
		@Pc(579) int local579 = 0;
		@Pc(581) int local581 = 0;
		@Pc(589) int local589;
		for (@Pc(583) int local583 = 0; local583 < this.anInt3668; local583++) {
			local589 = local10.method2490();
			@Pc(591) int local591 = 0;
			if ((local589 & 0x1) != 0) {
				local591 = local15.method2502();
			}
			@Pc(604) int local604 = 0;
			if ((local589 & 0x2) != 0) {
				local604 = local20.method2502();
			}
			@Pc(614) int local614 = 0;
			if ((local589 & 0x4) != 0) {
				local614 = local25.method2502();
			}
			this.anIntArray244[local583] = local591 + local577;
			this.anIntArray242[local583] = local604 + local579;
			this.anIntArray251[local583] = local581 + local614;
			local577 = this.anIntArray244[local583];
			local579 = this.anIntArray242[local583];
			local581 = this.anIntArray251[local583];
			if (local142 == 1) {
				this.anIntArray246[local583] = local30.method2490();
			}
		}
		local10.anInt2997 = local315;
		local15.anInt2997 = local229;
		local20.anInt2997 = local245;
		local25.anInt2997 = local277;
		local30.anInt2997 = local255;
		local35.anInt2997 = local295;
		local40.anInt2997 = local309;
		for (local589 = 0; local589 < this.anInt3686; local589++) {
			this.aShortArray123[local589] = (short) local10.method2536();
			if (local76) {
				this.aByteArray43[local589] = local15.method2542();
			}
			if (local126 == 255) {
				this.aByteArray42[local589] = local20.method2542();
			}
			if (local130 == 1) {
				this.aByteArray44[local589] = local25.method2542();
			}
			if (local134 == 1) {
				this.anIntArray245[local589] = local30.method2490();
			}
			if (local138 == 1) {
				this.aShortArray125[local589] = (short) (local35.method2536() - 1);
			}
			if (this.aByteArray46 != null) {
				if (this.aShortArray125[local589] == -1) {
					this.aByteArray46[local589] = -1;
				} else {
					this.aByteArray46[local589] = (byte) (local40.method2490() - 1);
				}
			}
		}
		this.anInt3677 = -1;
		local10.anInt2997 = local289;
		local15.anInt2997 = local238;
		@Pc(812) short local812 = 0;
		@Pc(814) short local814 = 0;
		@Pc(816) short local816 = 0;
		@Pc(818) short local818 = 0;
		@Pc(826) int local826;
		for (@Pc(820) int local820 = 0; local820 < this.anInt3686; local820++) {
			local826 = local15.method2490();
			if (local826 == 1) {
				local812 = (short) (local818 + local10.method2502());
				local814 = (short) (local10.method2502() + local812);
				local816 = (short) (local10.method2502() + local814);
				this.aShortArray120[local820] = local812;
				local818 = local816;
				this.aShortArray119[local820] = local814;
				this.aShortArray117[local820] = local816;
				if (this.anInt3677 < local812) {
					this.anInt3677 = local812;
				}
				if (this.anInt3677 < local814) {
					this.anInt3677 = local814;
				}
				if (local816 > this.anInt3677) {
					this.anInt3677 = local816;
				}
			}
			if (local826 == 2) {
				local814 = local816;
				local816 = (short) (local818 + local10.method2502());
				this.aShortArray120[local820] = local812;
				local818 = local816;
				this.aShortArray119[local820] = local814;
				this.aShortArray117[local820] = local816;
				if (this.anInt3677 < local816) {
					this.anInt3677 = local816;
				}
			}
			if (local826 == 3) {
				local812 = local816;
				local816 = (short) (local10.method2502() + local818);
				local818 = local816;
				this.aShortArray120[local820] = local812;
				this.aShortArray119[local820] = local814;
				this.aShortArray117[local820] = local816;
				if (this.anInt3677 < local816) {
					this.anInt3677 = local816;
				}
			}
			if (local826 == 4) {
				@Pc(981) short local981 = local812;
				local812 = local814;
				local814 = local981;
				local816 = (short) (local818 + local10.method2502());
				local818 = local816;
				this.aShortArray120[local820] = local812;
				this.aShortArray119[local820] = local981;
				this.aShortArray117[local820] = local816;
				if (local816 > this.anInt3677) {
					this.anInt3677 = local816;
				}
			}
		}
		local10.anInt2997 = local342;
		this.anInt3677++;
		local15.anInt2997 = local350;
		local20.anInt2997 = local370;
		local25.anInt2997 = local378;
		local30.anInt2997 = local384;
		local35.anInt2997 = local390;
		@Pc(1056) int local1056;
		for (local826 = 0; local826 < this.anInt3689; local826++) {
			local1056 = this.aByteArray47[local826] & 0xFF;
			if (local1056 == 0) {
				this.aShortArray118[local826] = (short) local10.method2536();
				this.aShortArray116[local826] = (short) local10.method2536();
				this.aShortArray124[local826] = (short) local10.method2536();
			}
			if (local1056 == 1) {
				this.aShortArray118[local826] = (short) local15.method2536();
				this.aShortArray116[local826] = (short) local15.method2536();
				this.aShortArray124[local826] = (short) local15.method2536();
				this.anIntArray249[local826] = local20.method2536();
				if (this.anInt3681 < 14) {
					this.anIntArray248[local826] = local20.method2536();
				} else {
					this.anIntArray248[local826] = local20.method2493();
				}
				this.anIntArray250[local826] = local20.method2536();
				this.aByteArray41[local826] = local25.method2542();
				this.aByteArray45[local826] = local30.method2542();
				this.anIntArray252[local826] = local35.method2542();
			}
			if (local1056 == 2) {
				this.aShortArray118[local826] = (short) local15.method2536();
				this.aShortArray116[local826] = (short) local15.method2536();
				this.aShortArray124[local826] = (short) local15.method2536();
				this.anIntArray249[local826] = local20.method2536();
				if (this.anInt3681 < 14) {
					this.anIntArray248[local826] = local20.method2536();
				} else {
					this.anIntArray248[local826] = local20.method2493();
				}
				this.anIntArray250[local826] = local20.method2536();
				this.aByteArray41[local826] = local25.method2542();
				this.aByteArray45[local826] = local30.method2542();
				this.anIntArray252[local826] = local35.method2542();
				this.anIntArray243[local826] = local35.method2542();
				this.anIntArray247[local826] = local35.method2542();
			}
			if (local1056 == 3) {
				this.aShortArray118[local826] = (short) local15.method2536();
				this.aShortArray116[local826] = (short) local15.method2536();
				this.aShortArray124[local826] = (short) local15.method2536();
				this.anIntArray249[local826] = local20.method2536();
				if (this.anInt3681 < 14) {
					this.anIntArray248[local826] = local20.method2536();
				} else {
					this.anIntArray248[local826] = local20.method2493();
				}
				this.anIntArray250[local826] = local20.method2536();
				this.aByteArray41[local826] = local25.method2542();
				this.aByteArray45[local826] = local30.method2542();
				this.anIntArray252[local826] = local35.method2542();
			}
		}
		local10.anInt2997 = local181;
		@Pc(1371) int local1371;
		@Pc(1377) int local1377;
		@Pc(1381) int local1381;
		@Pc(1443) int local1443;
		if (local85) {
			local1056 = local10.method2490();
			if (local1056 > 0) {
				this.aClass29Array3 = new Class29[local1056];
				for (local1371 = 0; local1371 < local1056; local1371++) {
					local1377 = local10.method2536();
					local1381 = local10.method2536();
					@Pc(1389) byte local1389;
					if (local126 == 255) {
						local1389 = this.aByteArray42[local1381];
					} else {
						local1389 = (byte) local126;
					}
					this.aClass29Array3[local1371] = new Class29(local1377, this.aShortArray120[local1381], this.aShortArray119[local1381], this.aShortArray117[local1381], local1389);
				}
			}
			local1371 = local10.method2490();
			if (local1371 > 0) {
				this.aClass179Array3 = new Class179[local1371];
				for (local1377 = 0; local1377 < local1371; local1377++) {
					local1381 = local10.method2536();
					local1443 = local10.method2536();
					this.aClass179Array3[local1377] = new Class179(local1381, local1443);
				}
			}
		}
		if (!local94) {
			return;
		}
		local1056 = local10.method2490();
		if (local1056 <= 0) {
			return;
		}
		this.aClass147Array1 = new Class147[local1056];
		for (local1371 = 0; local1371 < local1056; local1371++) {
			local1377 = local10.method2536();
			local1381 = local10.method2536();
			local1443 = local10.method2490();
			@Pc(1491) byte local1491 = local10.method2542();
			this.aClass147Array1[local1371] = new Class147(local1377, local1381, local1443, local1491);
		}
		return;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIB)V")
	public void method3053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(17) int local17;
		@Pc(35) int local35;
		if (arg2 != 0) {
			local11 = Class50_Sub1.anIntArray225[arg2];
			local15 = Class50_Sub1.anIntArray224[arg2];
			for (local17 = 0; local17 < this.anInt3668; local17++) {
				local35 = local15 * this.anIntArray244[local17] + this.anIntArray242[local17] * local11 >> 15;
				this.anIntArray242[local17] = this.anIntArray242[local17] * local15 - local11 * this.anIntArray244[local17] >> 15;
				this.anIntArray244[local17] = local35;
			}
		}
		if (arg0 != 0) {
			local11 = Class50_Sub1.anIntArray225[arg0];
			local15 = Class50_Sub1.anIntArray224[arg0];
			for (local17 = 0; local17 < this.anInt3668; local17++) {
				local35 = this.anIntArray242[local17] * local15 - local11 * this.anIntArray251[local17] >> 15;
				this.anIntArray251[local17] = this.anIntArray242[local17] * local11 + this.anIntArray251[local17] * local15 >> 15;
				this.anIntArray242[local17] = local35;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local11 = Class50_Sub1.anIntArray225[arg1];
		local15 = Class50_Sub1.anIntArray224[arg1];
		for (local17 = 0; local17 < this.anInt3668; local17++) {
			local35 = this.anIntArray244[local17] * local15 + this.anIntArray251[local17] * local11 >> 15;
			this.anIntArray251[local17] = local15 * this.anIntArray251[local17] - this.anIntArray244[local17] * local11 >> 15;
			this.anIntArray244[local17] = local35;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(B[B)V")
	private void method3054(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class4_Sub12 local14 = new Class4_Sub12(arg0);
		@Pc(19) Class4_Sub12 local19 = new Class4_Sub12(arg0);
		@Pc(24) Class4_Sub12 local24 = new Class4_Sub12(arg0);
		@Pc(29) Class4_Sub12 local29 = new Class4_Sub12(arg0);
		@Pc(34) Class4_Sub12 local34 = new Class4_Sub12(arg0);
		local14.anInt2997 = arg0.length - 18;
		this.anInt3668 = local14.method2536();
		this.anInt3686 = local14.method2536();
		this.anInt3689 = local14.method2490();
		@Pc(59) int local59 = local14.method2490();
		@Pc(63) int local63 = local14.method2490();
		@Pc(67) int local67 = local14.method2490();
		@Pc(71) int local71 = local14.method2490();
		@Pc(77) int local77 = local14.method2490();
		@Pc(81) int local81 = local14.method2536();
		@Pc(85) int local85 = local14.method2536();
		@Pc(89) int local89 = local14.method2536();
		@Pc(93) int local93 = local14.method2536();
		@Pc(102) int local102 = this.anInt3668;
		@Pc(104) int local104 = local102;
		local102 += this.anInt3686;
		@Pc(111) int local111 = local102;
		if (local63 == 255) {
			local102 += this.anInt3686;
		}
		@Pc(121) int local121 = local102;
		if (local71 == 1) {
			local102 += this.anInt3686;
		}
		@Pc(133) int local133 = local102;
		if (local59 == 1) {
			local102 += this.anInt3686;
		}
		@Pc(149) int local149 = local102;
		if (local77 == 1) {
			local102 += this.anInt3668;
		}
		@Pc(159) int local159 = local102;
		if (local67 == 1) {
			local102 += this.anInt3686;
		}
		@Pc(169) int local169 = local102;
		local102 += local93;
		@Pc(175) int local175 = local102;
		local102 += this.anInt3686 * 2;
		@Pc(184) int local184 = local102;
		local102 += this.anInt3689 * 6;
		@Pc(193) int local193 = local102;
		local102 += local81;
		@Pc(199) int local199 = local102;
		local102 += local85;
		this.aShortArray117 = new short[this.anInt3686];
		if (local77 == 1) {
			this.anIntArray246 = new int[this.anInt3668];
		}
		if (local67 == 1) {
			this.aByteArray44 = new byte[this.anInt3686];
		}
		if (this.anInt3689 > 0) {
			this.aShortArray124 = new short[this.anInt3689];
			this.aShortArray116 = new short[this.anInt3689];
			this.aByteArray47 = new byte[this.anInt3689];
			this.aShortArray118 = new short[this.anInt3689];
		}
		this.aShortArray120 = new short[this.anInt3686];
		this.anIntArray251 = new int[this.anInt3668];
		this.aShortArray123 = new short[this.anInt3686];
		this.aShortArray119 = new short[this.anInt3686];
		this.anIntArray242 = new int[this.anInt3668];
		local14.anInt2997 = 0;
		this.anIntArray244 = new int[this.anInt3668];
		if (local71 == 1) {
			this.anIntArray245 = new int[this.anInt3686];
		}
		if (local59 == 1) {
			this.aByteArray46 = new byte[this.anInt3686];
			this.aByteArray43 = new byte[this.anInt3686];
			this.aShortArray125 = new short[this.anInt3686];
		}
		if (local63 == 255) {
			this.aByteArray42 = new byte[this.anInt3686];
		} else {
			this.aByte27 = (byte) local63;
		}
		local19.anInt2997 = local193;
		local24.anInt2997 = local199;
		local29.anInt2997 = local102;
		local34.anInt2997 = local149;
		@Pc(351) int local351 = 0;
		@Pc(353) int local353 = 0;
		@Pc(355) int local355 = 0;
		@Pc(365) int local365;
		@Pc(367) int local367;
		for (@Pc(357) int local357 = 0; local357 < this.anInt3668; local357++) {
			local365 = local14.method2490();
			local367 = 0;
			if ((local365 & 0x1) != 0) {
				local367 = local19.method2502();
			}
			@Pc(377) int local377 = 0;
			if ((local365 & 0x2) != 0) {
				local377 = local24.method2502();
			}
			@Pc(390) int local390 = 0;
			if ((local365 & 0x4) != 0) {
				local390 = local29.method2502();
			}
			this.anIntArray244[local357] = local351 + local367;
			this.anIntArray242[local357] = local353 + local377;
			this.anIntArray251[local357] = local390 + local355;
			local351 = this.anIntArray244[local357];
			local353 = this.anIntArray242[local357];
			local355 = this.anIntArray251[local357];
			if (local77 == 1) {
				this.anIntArray246[local357] = local34.method2490();
			}
		}
		local14.anInt2997 = local175;
		local19.anInt2997 = local133;
		local24.anInt2997 = local111;
		local29.anInt2997 = local159;
		local34.anInt2997 = local121;
		for (local365 = 0; local365 < this.anInt3686; local365++) {
			this.aShortArray123[local365] = (short) local14.method2536();
			if (local59 == 1) {
				local367 = local19.method2490();
				if ((local367 & 0x1) == 1) {
					local7 = true;
					this.aByteArray43[local365] = 1;
				} else {
					this.aByteArray43[local365] = 0;
				}
				if ((local367 & 0x2) == 2) {
					this.aByteArray46[local365] = (byte) (local367 >> 2);
					this.aShortArray125[local365] = this.aShortArray123[local365];
					this.aShortArray123[local365] = 127;
					if (this.aShortArray125[local365] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray46[local365] = -1;
					this.aShortArray125[local365] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray42[local365] = local24.method2542();
			}
			if (local67 == 1) {
				this.aByteArray44[local365] = local29.method2542();
			}
			if (local71 == 1) {
				this.anIntArray245[local365] = local34.method2490();
			}
		}
		local14.anInt2997 = local169;
		this.anInt3677 = -1;
		local19.anInt2997 = local104;
		@Pc(610) short local610 = 0;
		@Pc(612) short local612 = 0;
		@Pc(614) short local614 = 0;
		@Pc(616) short local616 = 0;
		@Pc(624) int local624;
		for (@Pc(618) int local618 = 0; local618 < this.anInt3686; local618++) {
			local624 = local19.method2490();
			if (local624 == 1) {
				local610 = (short) (local14.method2502() + local616);
				local612 = (short) (local14.method2502() + local610);
				local614 = (short) (local14.method2502() + local612);
				this.aShortArray120[local618] = local610;
				local616 = local614;
				this.aShortArray119[local618] = local612;
				this.aShortArray117[local618] = local614;
				if (local610 > this.anInt3677) {
					this.anInt3677 = local610;
				}
				if (local612 > this.anInt3677) {
					this.anInt3677 = local612;
				}
				if (this.anInt3677 < local614) {
					this.anInt3677 = local614;
				}
			}
			if (local624 == 2) {
				local612 = local614;
				local614 = (short) (local14.method2502() + local616);
				local616 = local614;
				this.aShortArray120[local618] = local610;
				this.aShortArray119[local618] = local612;
				this.aShortArray117[local618] = local614;
				if (this.anInt3677 < local614) {
					this.anInt3677 = local614;
				}
			}
			if (local624 == 3) {
				local610 = local614;
				local614 = (short) (local616 + local14.method2502());
				local616 = local614;
				this.aShortArray120[local618] = local610;
				this.aShortArray119[local618] = local612;
				this.aShortArray117[local618] = local614;
				if (this.anInt3677 < local614) {
					this.anInt3677 = local614;
				}
			}
			if (local624 == 4) {
				@Pc(783) short local783 = local610;
				local610 = local612;
				local612 = local783;
				local614 = (short) (local14.method2502() + local616);
				local616 = local614;
				this.aShortArray120[local618] = local610;
				this.aShortArray119[local618] = local783;
				this.aShortArray117[local618] = local614;
				if (this.anInt3677 < local614) {
					this.anInt3677 = local614;
				}
			}
		}
		local14.anInt2997 = local184;
		this.anInt3677++;
		for (local624 = 0; local624 < this.anInt3689; local624++) {
			this.aByteArray47[local624] = 0;
			this.aShortArray118[local624] = (short) local14.method2536();
			this.aShortArray116[local624] = (short) local14.method2536();
			this.aShortArray124[local624] = (short) local14.method2536();
		}
		if (this.aByteArray46 != null) {
			@Pc(881) boolean local881 = false;
			for (@Pc(883) int local883 = 0; local883 < this.anInt3686; local883++) {
				@Pc(892) int local892 = this.aByteArray46[local883] & 0xFF;
				if (local892 != 255) {
					if ((this.aShortArray118[local892] & 0xFFFF) == this.aShortArray120[local883] && (this.aShortArray116[local892] & 0xFFFF) == this.aShortArray119[local883] && this.aShortArray117[local883] == (this.aShortArray124[local892] & 0xFFFF)) {
						this.aByteArray46[local883] = -1;
					} else {
						local881 = true;
					}
				}
			}
			if (!local881) {
				this.aByteArray46 = null;
			}
		}
		if (!local9) {
			this.aShortArray125 = null;
		}
		if (!local7) {
			this.aByteArray43 = null;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(SSZ)V")
	public void method3055(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt3686; local11++) {
			if (this.aShortArray123[local11] == arg0) {
				this.aShortArray123[local11] = arg1;
			}
		}
	}
}

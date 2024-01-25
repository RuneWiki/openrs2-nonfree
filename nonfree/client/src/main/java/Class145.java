import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class145 {

	@OriginalMember(owner = "client!gt", name = "t", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!gt", name = "r", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "[I")
	public int[] anIntArray251;

	@OriginalMember(owner = "client!gt", name = "P", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!gt", name = "T", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!gt", name = "m", descriptor = "[I")
	public int[] anIntArray252;

	@OriginalMember(owner = "client!gt", name = "O", descriptor = "[S")
	public short[] aShortArray31;

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "[I")
	public int[] anIntArray253;

	@OriginalMember(owner = "client!gt", name = "G", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!gt", name = "B", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!gt", name = "k", descriptor = "[S")
	public short[] aShortArray33;

	@OriginalMember(owner = "client!gt", name = "S", descriptor = "[Lclient!lk;")
	public Class232[] aClass232Array1;

	@OriginalMember(owner = "client!gt", name = "p", descriptor = "[I")
	public int[] anIntArray254;

	@OriginalMember(owner = "client!gt", name = "L", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "[I")
	public int[] anIntArray255;

	@OriginalMember(owner = "client!gt", name = "W", descriptor = "[I")
	public int[] anIntArray256;

	@OriginalMember(owner = "client!gt", name = "n", descriptor = "[S")
	public short[] aShortArray34;

	@OriginalMember(owner = "client!gt", name = "A", descriptor = "[Lclient!cm;")
	public Class60[] aClass60Array1;

	@OriginalMember(owner = "client!gt", name = "D", descriptor = "[I")
	public int[] anIntArray257;

	@OriginalMember(owner = "client!gt", name = "q", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!gt", name = "h", descriptor = "[S")
	public short[] aShortArray35;

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "[S")
	public short[] aShortArray36;

	@OriginalMember(owner = "client!gt", name = "w", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "[I")
	public int[] anIntArray258;

	@OriginalMember(owner = "client!gt", name = "Q", descriptor = "[I")
	public int[] anIntArray259;

	@OriginalMember(owner = "client!gt", name = "R", descriptor = "[Lclient!ip;")
	public Class184[] aClass184Array1;

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "[S")
	public short[] aShortArray37;

	@OriginalMember(owner = "client!gt", name = "H", descriptor = "[S")
	public short[] aShortArray38;

	@OriginalMember(owner = "client!gt", name = "Y", descriptor = "[I")
	public int[] anIntArray260;

	@OriginalMember(owner = "client!gt", name = "z", descriptor = "[I")
	public int[] anIntArray261;

	@OriginalMember(owner = "client!gt", name = "s", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
	public int anInt3633 = 12;

	@OriginalMember(owner = "client!gt", name = "X", descriptor = "I")
	public int anInt3635 = 0;

	@OriginalMember(owner = "client!gt", name = "J", descriptor = "I")
	public int anInt3629 = 0;

	@OriginalMember(owner = "client!gt", name = "x", descriptor = "I")
	public int anInt3636 = 0;

	@OriginalMember(owner = "client!gt", name = "K", descriptor = "B")
	public byte aByte62 = 0;

	@OriginalMember(owner = "client!gt", name = "M", descriptor = "I")
	public int anInt3646 = 0;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V")
	private Class145() {
	}

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "([B)V")
	public Class145(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3298(arg0);
		} else {
			this.method3291((byte) 0, arg0);
		}
	}

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(III)V")
	public Class145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray30 = new byte[arg1];
		this.aByteArray29 = new byte[arg1];
		this.aShortArray36 = new short[arg1];
		this.aShortArray33 = new short[arg1];
		this.anIntArray259 = new int[arg0];
		this.anIntArray258 = new int[arg1];
		this.anIntArray251 = new int[arg0];
		this.aShortArray35 = new short[arg1];
		this.aByteArray28 = new byte[arg1];
		this.anIntArray253 = new int[arg0];
		this.aShortArray38 = new short[arg1];
		this.aShortArray30 = new short[arg1];
		this.aByteArray27 = new byte[arg1];
		this.anIntArray257 = new int[arg0];
		if (arg2 > 0) {
			this.anIntArray256 = new int[arg2];
			this.aByteArray32 = new byte[arg2];
			this.aByteArray31 = new byte[arg2];
			this.aShortArray31 = new short[arg2];
			this.aByteArray33 = new byte[arg2];
			this.aShortArray37 = new short[arg2];
			this.anIntArray252 = new int[arg2];
			this.anIntArray254 = new int[arg2];
			this.anIntArray261 = new int[arg2];
			this.aShortArray34 = new short[arg2];
			this.anIntArray260 = new int[arg2];
			this.anIntArray255 = new int[arg2];
		}
	}

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "([Lclient!gt;I)V")
	public Class145(@OriginalArg(0) Class145[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3646 = 0;
		this.anInt3635 = 0;
		this.anInt3629 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte62 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class145 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt3629 += local59.anInt3629;
				this.anInt3635 += local59.anInt3635;
				this.anInt3646 += local59.anInt3646;
				local38 |= local59.aByteArray29 != null;
				if (local59.aClass60Array1 != null) {
					local36 += local59.aClass60Array1.length;
				}
				if (local59.aClass232Array1 != null) {
					local34 += local59.aClass232Array1.length;
				}
				if (local59.aClass184Array1 != null) {
					local32 += local59.aClass184Array1.length;
				}
				if (local59.aByteArray28 == null) {
					if (this.aByte62 == -1) {
						this.aByte62 = local59.aByte62;
					}
					if (this.aByte62 != local59.aByte62) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local44 |= local59.aByteArray30 != null;
				local42 |= local59.aByteArray27 != null;
				local46 |= local59.aShortArray38 != null;
				local51 |= local59.anIntArray258 != null;
			}
		}
		if (local46) {
			this.aShortArray38 = new short[this.anInt3646];
		}
		if (local36 > 0) {
			this.aClass60Array1 = new Class60[local36];
		}
		if (this.anInt3629 > 0) {
			this.anIntArray260 = new int[this.anInt3629];
			this.aByteArray31 = new byte[this.anInt3629];
			this.aShortArray34 = new short[this.anInt3629];
			this.anIntArray256 = new int[this.anInt3629];
			this.anIntArray254 = new int[this.anInt3629];
			this.aShortArray31 = new short[this.anInt3629];
			this.aByteArray32 = new byte[this.anInt3629];
			this.aShortArray37 = new short[this.anInt3629];
			this.anIntArray261 = new int[this.anInt3629];
			this.anIntArray255 = new int[this.anInt3629];
			this.anIntArray252 = new int[this.anInt3629];
			this.aByteArray33 = new byte[this.anInt3629];
		}
		if (local40) {
			this.aByteArray28 = new byte[this.anInt3646];
		}
		this.aShortArray29 = new short[this.anInt3646];
		this.aShortArray35 = new short[this.anInt3646];
		this.anIntArray253 = new int[this.anInt3635];
		if (local42) {
			this.aByteArray27 = new byte[this.anInt3646];
		}
		this.anIntArray251 = new int[this.anInt3635];
		this.aShortArray33 = new short[this.anInt3646];
		this.aShortArray36 = new short[this.anInt3646];
		this.anIntArray257 = new int[this.anInt3635];
		this.anIntArray259 = new int[this.anInt3635];
		this.aShortArray30 = new short[this.anInt3646];
		if (local34 > 0) {
			this.aClass232Array1 = new Class232[local34];
		}
		if (local51) {
			this.anIntArray258 = new int[this.anInt3646];
		}
		this.aShortArray32 = new short[this.anInt3635];
		if (local38) {
			this.aByteArray29 = new byte[this.anInt3646];
		}
		if (local44) {
			this.aByteArray30 = new byte[this.anInt3646];
		}
		if (local32 > 0) {
			this.aClass184Array1 = new Class184[local32];
		}
		this.anInt3646 = 0;
		local32 = 0;
		local34 = 0;
		this.anInt3629 = 0;
		this.anInt3635 = 0;
		local36 = 0;
		@Pc(684) int local684;
		@Pc(695) int local695;
		for (@Pc(414) int local414 = 0; local414 < arg1; local414++) {
			@Pc(421) short local421 = (short) (0x1 << local414);
			@Pc(425) Class145 local425 = arg0[local414];
			if (local425 != null) {
				@Pc(434) int local434;
				if (local425.aClass60Array1 != null) {
					for (local434 = 0; local434 < local425.aClass60Array1.length; local434++) {
						@Pc(441) Class60 local441 = local425.aClass60Array1[local434];
						this.aClass60Array1[local36++] = local441.method1880(local441.anInt2027 + this.anInt3646);
					}
				}
				for (local434 = 0; local434 < local425.anInt3646; local434++) {
					if (local38 && local425.aByteArray29 != null) {
						this.aByteArray29[this.anInt3646] = local425.aByteArray29[local434];
					}
					if (local40) {
						if (local425.aByteArray28 == null) {
							this.aByteArray28[this.anInt3646] = local425.aByte62;
						} else {
							this.aByteArray28[this.anInt3646] = local425.aByteArray28[local434];
						}
					}
					if (local42 && local425.aByteArray27 != null) {
						this.aByteArray27[this.anInt3646] = local425.aByteArray27[local434];
					}
					if (local46) {
						if (local425.aShortArray38 == null) {
							this.aShortArray38[this.anInt3646] = -1;
						} else {
							this.aShortArray38[this.anInt3646] = local425.aShortArray38[local434];
						}
					}
					if (local51) {
						if (local425.anIntArray258 == null) {
							this.anIntArray258[this.anInt3646] = -1;
						} else {
							this.anIntArray258[this.anInt3646] = local425.anIntArray258[local434];
						}
					}
					this.aShortArray30[this.anInt3646] = (short) this.method3295(local425.aShortArray30[local434], local421, local425);
					this.aShortArray33[this.anInt3646] = (short) this.method3295(local425.aShortArray33[local434], local421, local425);
					this.aShortArray36[this.anInt3646] = (short) this.method3295(local425.aShortArray36[local434], local421, local425);
					this.aShortArray29[this.anInt3646] = local421;
					this.aShortArray35[this.anInt3646] = local425.aShortArray35[local434];
					this.anInt3646++;
				}
				@Pc(671) int local671;
				if (local425.aClass184Array1 != null) {
					for (local671 = 0; local671 < local425.aClass184Array1.length; local671++) {
						local684 = this.method3295(local425.aClass184Array1[local671].anInt4428, local421, local425);
						local695 = this.method3295(local425.aClass184Array1[local671].anInt4426, local421, local425);
						@Pc(706) int local706 = this.method3295(local425.aClass184Array1[local671].anInt4439, local421, local425);
						this.aClass184Array1[local32] = local425.aClass184Array1[local671].method4040(local684, local706, local695);
						local32++;
					}
				}
				if (local425.aClass232Array1 != null) {
					for (local671 = 0; local671 < local425.aClass232Array1.length; local671++) {
						local684 = this.method3295(local425.aClass232Array1[local671].anInt5881, local421, local425);
						this.aClass232Array1[local34] = local425.aClass232Array1[local671].method5126(local684);
						local34++;
					}
				}
			}
		}
		@Pc(780) int local780 = 0;
		this.anInt3636 = this.anInt3635;
		for (@Pc(786) int local786 = 0; local786 < arg1; local786++) {
			@Pc(795) short local795 = (short) (0x1 << local786);
			@Pc(799) Class145 local799 = arg0[local786];
			if (local799 != null) {
				for (local684 = 0; local684 < local799.anInt3646; local684++) {
					if (local44) {
						this.aByteArray30[local780++] = (byte) (local799.aByteArray30 == null || local799.aByteArray30[local684] == -1 ? -1 : this.anInt3629 + local799.aByteArray30[local684]);
					}
				}
				for (local695 = 0; local695 < local799.anInt3629; local695++) {
					@Pc(865) byte local865 = this.aByteArray31[this.anInt3629] = local799.aByteArray31[local695];
					if (local865 == 0) {
						this.aShortArray37[this.anInt3629] = (short) this.method3295(local799.aShortArray37[local695], local795, local799);
						this.aShortArray31[this.anInt3629] = (short) this.method3295(local799.aShortArray31[local695], local795, local799);
						this.aShortArray34[this.anInt3629] = (short) this.method3295(local799.aShortArray34[local695], local795, local799);
					}
					if (local865 >= 1 && local865 <= 3) {
						this.aShortArray37[this.anInt3629] = local799.aShortArray37[local695];
						this.aShortArray31[this.anInt3629] = local799.aShortArray31[local695];
						this.aShortArray34[this.anInt3629] = local799.aShortArray34[local695];
						this.anIntArray252[this.anInt3629] = local799.anIntArray252[local695];
						this.anIntArray254[this.anInt3629] = local799.anIntArray254[local695];
						this.anIntArray255[this.anInt3629] = local799.anIntArray255[local695];
						this.aByteArray32[this.anInt3629] = local799.aByteArray32[local695];
						this.aByteArray33[this.anInt3629] = local799.aByteArray33[local695];
						this.anIntArray261[this.anInt3629] = local799.anIntArray261[local695];
					}
					if (local865 == 2) {
						this.anIntArray260[this.anInt3629] = local799.anIntArray260[local695];
						this.anIntArray256[this.anInt3629] = local799.anIntArray256[local695];
					}
					this.anInt3629++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)[[I")
	public int[][] method3287() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt3646; local12++) {
			@Pc(21) int local21 = this.anIntArray258[local12];
			if (local21 >= 0) {
				if (local10 < local21) {
					local10 = local21;
				}
				@Pc(38) int local38 = local8[local21]++;
			}
		}
		@Pc(55) int[][] local55 = new int[local10 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local10; local59++) {
			local55[local59] = new int[local8[local59]];
			local8[local59] = 0;
		}
		for (@Pc(80) int local80 = 0; local80 < this.anInt3646; local80++) {
			@Pc(91) int local91 = this.anIntArray258[local80];
			if (local91 >= 0) {
				local55[local91][local8[local91]++] = local80;
			}
		}
		if (-89 <= -127) {
			this.aByteArray33 = null;
		}
		return local55;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IBISSIIBB)I")
	public int method3288(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short arg2, @OriginalArg(4) short arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray30[this.anInt3646] = (short) arg1;
		this.aShortArray33[this.anInt3646] = (short) arg5;
		this.aShortArray36[this.anInt3646] = (short) arg4;
		this.aByteArray29[this.anInt3646] = arg7;
		this.aByteArray30[this.anInt3646] = arg0;
		this.aShortArray35[this.anInt3646] = arg2;
		this.aByteArray27[this.anInt3646] = arg6;
		this.aShortArray38[this.anInt3646] = arg3;
		return this.anInt3646++;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(IZII)I")
	public int method3289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3635; local7++) {
			if (arg2 == this.anIntArray253[local7] && this.anIntArray257[local7] == arg0 && arg1 == this.anIntArray251[local7]) {
				return local7;
			}
		}
		this.anIntArray253[this.anInt3635] = arg2;
		if (false) {
			this.anIntArray260 = null;
		}
		this.anIntArray257[this.anInt3635] = arg0;
		this.anIntArray251[this.anInt3635] = arg1;
		this.anInt3636 = this.anInt3635 + 1;
		return this.anInt3635++;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BIII)V")
	public void method3290(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt3635; local11++) {
			this.anIntArray253[local11] += arg1;
			this.anIntArray257[local11] += arg2;
			this.anIntArray251[local11] += arg0;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(B[B)V")
	private void method3291(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class3_Sub2 local14 = new Class3_Sub2(arg1);
		@Pc(19) Class3_Sub2 local19 = new Class3_Sub2(arg1);
		@Pc(24) Class3_Sub2 local24 = new Class3_Sub2(arg1);
		@Pc(29) Class3_Sub2 local29 = new Class3_Sub2(arg1);
		@Pc(34) Class3_Sub2 local34 = new Class3_Sub2(arg1);
		local14.anInt2178 = arg1.length - 18;
		this.anInt3635 = local14.method2028(-14795);
		this.anInt3646 = local14.method2028(-14795);
		if (arg0 != 0) {
			return;
		}
		this.anInt3629 = local14.method2048(255);
		@Pc(63) int local63 = local14.method2048(255);
		@Pc(67) int local67 = local14.method2048(255);
		@Pc(71) int local71 = local14.method2048(255);
		@Pc(75) int local75 = local14.method2048(255);
		@Pc(81) int local81 = local14.method2048(arg0 + 255);
		@Pc(85) int local85 = local14.method2028(-14795);
		@Pc(91) int local91 = local14.method2028(arg0 - 14795);
		@Pc(95) int local95 = local14.method2028(-14795);
		@Pc(99) int local99 = local14.method2028(-14795);
		@Pc(108) int local108 = this.anInt3635;
		@Pc(110) int local110 = local108;
		local108 += this.anInt3646;
		@Pc(117) int local117 = local108;
		if (local67 == 255) {
			local108 += this.anInt3646;
		}
		@Pc(127) int local127 = local108;
		if (local75 == 1) {
			local108 += this.anInt3646;
		}
		@Pc(139) int local139 = local108;
		if (local63 == 1) {
			local108 += this.anInt3646;
		}
		@Pc(149) int local149 = local108;
		if (local81 == 1) {
			local108 += this.anInt3635;
		}
		@Pc(161) int local161 = local108;
		if (local71 == 1) {
			local108 += this.anInt3646;
		}
		@Pc(173) int local173 = local108;
		local108 += local99;
		@Pc(179) int local179 = local108;
		local108 += this.anInt3646 * 2;
		@Pc(188) int local188 = local108;
		local108 += this.anInt3629 * 6;
		@Pc(197) int local197 = local108;
		local108 += local85;
		@Pc(203) int local203 = local108;
		local108 += local91;
		if (local63 == 1) {
			this.aByteArray30 = new byte[this.anInt3646];
			this.aShortArray38 = new short[this.anInt3646];
			this.aByteArray29 = new byte[this.anInt3646];
		}
		if (this.anInt3629 > 0) {
			this.aShortArray37 = new short[this.anInt3629];
			this.aByteArray31 = new byte[this.anInt3629];
			this.aShortArray34 = new short[this.anInt3629];
			this.aShortArray31 = new short[this.anInt3629];
		}
		local14.anInt2178 = 0;
		this.aShortArray30 = new short[this.anInt3646];
		if (local75 == 1) {
			this.anIntArray258 = new int[this.anInt3646];
		}
		if (local71 == 1) {
			this.aByteArray27 = new byte[this.anInt3646];
		}
		if (local81 == 1) {
			this.anIntArray259 = new int[this.anInt3635];
		}
		if (local67 == 255) {
			this.aByteArray28 = new byte[this.anInt3646];
		} else {
			this.aByte62 = (byte) local67;
		}
		this.aShortArray35 = new short[this.anInt3646];
		this.anIntArray253 = new int[this.anInt3635];
		this.anIntArray251 = new int[this.anInt3635];
		this.anIntArray257 = new int[this.anInt3635];
		this.aShortArray36 = new short[this.anInt3646];
		this.aShortArray33 = new short[this.anInt3646];
		local19.anInt2178 = local197;
		local24.anInt2178 = local203;
		local29.anInt2178 = local108;
		local34.anInt2178 = local149;
		@Pc(360) int local360 = 0;
		@Pc(362) int local362 = 0;
		@Pc(364) int local364 = 0;
		@Pc(374) int local374;
		@Pc(376) int local376;
		for (@Pc(366) int local366 = 0; local366 < this.anInt3635; local366++) {
			local374 = local14.method2048(arg0 + 255);
			local376 = 0;
			if ((local374 & 0x1) != 0) {
				local376 = local19.method2009(arg0 + 128);
			}
			@Pc(391) int local391 = 0;
			if ((local374 & 0x2) != 0) {
				local391 = local24.method2009(128);
			}
			@Pc(401) int local401 = 0;
			if ((local374 & 0x4) != 0) {
				local401 = local29.method2009(arg0 ^ 0x80);
			}
			this.anIntArray253[local366] = local376 + local360;
			this.anIntArray257[local366] = local391 + local362;
			this.anIntArray251[local366] = local364 + local401;
			local362 = this.anIntArray257[local366];
			local364 = this.anIntArray251[local366];
			local360 = this.anIntArray253[local366];
			if (local81 == 1) {
				this.anIntArray259[local366] = local34.method2048(255);
			}
		}
		local14.anInt2178 = local179;
		local19.anInt2178 = local139;
		local24.anInt2178 = local117;
		local29.anInt2178 = local161;
		local34.anInt2178 = local127;
		for (local374 = 0; local374 < this.anInt3646; local374++) {
			this.aShortArray35[local374] = (short) local14.method2028(-14795);
			if (local63 == 1) {
				local376 = local19.method2048(255);
				if ((local376 & 0x1) == 1) {
					local7 = true;
					this.aByteArray29[local374] = 1;
				} else {
					this.aByteArray29[local374] = 0;
				}
				if ((local376 & 0x2) == 2) {
					this.aByteArray30[local374] = (byte) (local376 >> 2);
					this.aShortArray38[local374] = this.aShortArray35[local374];
					this.aShortArray35[local374] = 127;
					if (this.aShortArray38[local374] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray30[local374] = -1;
					this.aShortArray38[local374] = -1;
				}
			}
			if (local67 == 255) {
				this.aByteArray28[local374] = local24.method2022();
			}
			if (local71 == 1) {
				this.aByteArray27[local374] = local29.method2022();
			}
			if (local75 == 1) {
				this.anIntArray258[local374] = local34.method2048(arg0 + 255);
			}
		}
		local14.anInt2178 = local173;
		this.anInt3636 = -1;
		local19.anInt2178 = local110;
		@Pc(642) short local642 = 0;
		@Pc(644) short local644 = 0;
		@Pc(646) short local646 = 0;
		@Pc(648) short local648 = 0;
		@Pc(658) int local658;
		for (@Pc(650) int local650 = 0; local650 < this.anInt3646; local650++) {
			local658 = local19.method2048(255);
			if (local658 == 1) {
				local642 = (short) (local648 + local14.method2009(arg0 ^ 0x80));
				local644 = (short) (local14.method2009(128) + local642);
				local646 = (short) (local14.method2009(128) + local644);
				this.aShortArray30[local650] = local642;
				local648 = local646;
				this.aShortArray33[local650] = local644;
				this.aShortArray36[local650] = local646;
				if (this.anInt3636 < local642) {
					this.anInt3636 = local642;
				}
				if (this.anInt3636 < local644) {
					this.anInt3636 = local644;
				}
				if (this.anInt3636 < local646) {
					this.anInt3636 = local646;
				}
			}
			if (local658 == 2) {
				local644 = local646;
				local646 = (short) (local14.method2009(128) + local648);
				local648 = local646;
				this.aShortArray30[local650] = local642;
				this.aShortArray33[local650] = local644;
				this.aShortArray36[local650] = local646;
				if (local646 > this.anInt3636) {
					this.anInt3636 = local646;
				}
			}
			if (local658 == 3) {
				local642 = local646;
				local646 = (short) (local648 + local14.method2009(128));
				local648 = local646;
				this.aShortArray30[local650] = local642;
				this.aShortArray33[local650] = local644;
				this.aShortArray36[local650] = local646;
				if (local646 > this.anInt3636) {
					this.anInt3636 = local646;
				}
			}
			if (local658 == 4) {
				@Pc(829) short local829 = local642;
				local642 = local644;
				local646 = (short) (local14.method2009(128) + local648);
				local644 = local829;
				this.aShortArray30[local650] = local642;
				local648 = local646;
				this.aShortArray33[local650] = local829;
				this.aShortArray36[local650] = local646;
				if (local646 > this.anInt3636) {
					this.anInt3636 = local646;
				}
			}
		}
		this.anInt3636++;
		local14.anInt2178 = local188;
		for (local658 = 0; local658 < this.anInt3629; local658++) {
			this.aByteArray31[local658] = 0;
			this.aShortArray37[local658] = (short) local14.method2028(-14795);
			this.aShortArray31[local658] = (short) local14.method2028(-14795);
			this.aShortArray34[local658] = (short) local14.method2028(-14795);
		}
		if (this.aByteArray30 != null) {
			@Pc(943) boolean local943 = false;
			for (@Pc(945) int local945 = 0; local945 < this.anInt3646; local945++) {
				@Pc(956) int local956 = this.aByteArray30[local945] & 0xFF;
				if (local956 != 255) {
					if (this.aShortArray30[local945] == (this.aShortArray37[local956] & 0xFFFF) && this.aShortArray33[local945] == (this.aShortArray31[local956] & 0xFFFF) && (this.aShortArray34[local956] & 0xFFFF) == this.aShortArray36[local945]) {
						this.aByteArray30[local945] = -1;
					} else {
						local943 = true;
					}
				}
			}
			if (!local943) {
				this.aByteArray30 = null;
			}
		}
		if (!local7) {
			this.aByteArray29 = null;
		}
		if (!local9) {
			this.aShortArray38 = null;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BZ)[[I")
	public int[][] method3293(@OriginalArg(1) boolean arg0) {
		@Pc(14) int[] local14 = new int[256];
		@Pc(16) int local16 = 0;
		@Pc(25) int local25 = arg0 ? this.anInt3635 : this.anInt3636;
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(36) int local36 = this.anIntArray259[local27];
			if (local36 >= 0) {
				if (local36 > local16) {
					local16 = local36;
				}
				@Pc(53) int local53 = local14[local36]++;
			}
		}
		@Pc(69) int[][] local69 = new int[local16 + 1][];
		for (@Pc(73) int local73 = 0; local73 <= local16; local73++) {
			local69[local73] = new int[local14[local73]];
			local14[local73] = 0;
		}
		for (@Pc(94) int local94 = 0; local94 < local25; local94++) {
			@Pc(103) int local103 = this.anIntArray259[local94];
			if (local103 >= 0) {
				local69[local103][local14[local103]++] = local94;
			}
		}
		return local69;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)[[I")
	public int[][] method3294() {
		@Pc(16) int[] local16 = new int[256];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.aClass60Array1.length; local20++) {
			@Pc(30) int local30 = this.aClass60Array1[local20].anInt2028;
			if (local30 >= 0) {
				if (local18 < local30) {
					local18 = local30;
				}
				@Pc(47) int local47 = local16[local30]++;
			}
		}
		@Pc(61) int[][] local61 = new int[local18 + 1][];
		for (@Pc(65) int local65 = 0; local65 <= local18; local65++) {
			local61[local65] = new int[local16[local65]];
			local16[local65] = 0;
		}
		for (@Pc(86) int local86 = 0; local86 < this.aClass60Array1.length; local86++) {
			@Pc(96) int local96 = this.aClass60Array1[local86].anInt2028;
			if (local96 >= 0) {
				local61[local96][local16[local96]++] = local86;
			}
		}
		return local61;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IISLclient!gt;)I")
	private int method3295(@OriginalArg(0) int arg0, @OriginalArg(2) short arg1, @OriginalArg(3) Class145 arg2) {
		@Pc(10) int local10 = arg2.anIntArray253[arg0];
		@Pc(15) int local15 = arg2.anIntArray257[arg0];
		@Pc(20) int local20 = arg2.anIntArray251[arg0];
		for (@Pc(22) int local22 = 0; local22 < this.anInt3635; local22++) {
			if (this.anIntArray253[local22] == local10 && this.anIntArray257[local22] == local15 && local20 == this.anIntArray251[local22]) {
				this.aShortArray32[local22] |= arg1;
				return local22;
			}
		}
		this.anIntArray253[this.anInt3635] = local10;
		this.anIntArray257[this.anInt3635] = local15;
		this.anIntArray251[this.anInt3635] = local20;
		this.aShortArray32[this.anInt3635] = arg1;
		this.anIntArray259[this.anInt3635] = arg2.anIntArray259 == null ? -1 : arg2.anIntArray259[arg0];
		return this.anInt3635++;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZII)V")
	public void method3296(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(17) int local17;
		@Pc(35) int local35;
		if (arg1 != 0) {
			local11 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg1];
			local15 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg1];
			for (local17 = 0; local17 < this.anInt3635; local17++) {
				local35 = this.anIntArray253[local17] * local15 + local11 * this.anIntArray257[local17] >> 14;
				this.anIntArray257[local17] = this.anIntArray257[local17] * local15 - this.anIntArray253[local17] * local11 >> 14;
				this.anIntArray253[local17] = local35;
			}
		}
		if (arg0 != 0) {
			local11 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg0];
			local15 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg0];
			for (local17 = 0; local17 < this.anInt3635; local17++) {
				local35 = this.anIntArray257[local17] * local15 - local11 * this.anIntArray251[local17] >> 14;
				this.anIntArray251[local17] = local15 * this.anIntArray251[local17] + local11 * this.anIntArray257[local17] >> 14;
				this.anIntArray257[local17] = local35;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local11 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg2];
		local15 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg2];
		for (local17 = 0; local17 < this.anInt3635; local17++) {
			local35 = local15 * this.anIntArray253[local17] + this.anIntArray251[local17] * local11 >> 14;
			this.anIntArray251[local17] = this.anIntArray251[local17] * local15 - this.anIntArray253[local17] * local11 >> 14;
			this.anIntArray253[local17] = local35;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZ)V")
	public void method3297(@OriginalArg(0) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3635; local7++) {
			this.anIntArray253[local7] <<= arg0;
			this.anIntArray257[local7] <<= arg0;
			this.anIntArray251[local7] <<= arg0;
		}
		if (false) {
			this.anIntArray258 = null;
		}
		if (this.anInt3629 <= 0 || this.anIntArray252 == null) {
			return;
		}
		for (@Pc(66) int local66 = 0; local66 < this.anIntArray252.length; local66++) {
			this.anIntArray252[local66] <<= arg0;
			this.anIntArray254[local66] <<= arg0;
			if (this.aByteArray31[local66] != 1) {
				this.anIntArray255[local66] <<= arg0;
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "([BI)V")
	private void method3298(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class3_Sub2 local10 = new Class3_Sub2(arg0);
		@Pc(15) Class3_Sub2 local15 = new Class3_Sub2(arg0);
		@Pc(20) Class3_Sub2 local20 = new Class3_Sub2(arg0);
		@Pc(25) Class3_Sub2 local25 = new Class3_Sub2(arg0);
		@Pc(30) Class3_Sub2 local30 = new Class3_Sub2(arg0);
		@Pc(35) Class3_Sub2 local35 = new Class3_Sub2(arg0);
		@Pc(40) Class3_Sub2 local40 = new Class3_Sub2(arg0);
		local10.anInt2178 = arg0.length - 23;
		this.anInt3635 = local10.method2028(-14795);
		this.anInt3646 = local10.method2028(-14795);
		this.anInt3629 = local10.method2048(255);
		@Pc(69) int local69 = local10.method2048(255);
		@Pc(79) boolean local79 = (local69 & 0x1) == 1;
		@Pc(89) boolean local89 = (local69 & 0x2) == 2;
		@Pc(99) boolean local99 = (local69 & 0x4) == 4;
		@Pc(109) boolean local109 = (local69 & 0x8) == 8;
		if (local109) {
			local10.anInt2178 -= 7;
			this.anInt3633 = local10.method2048(255);
			local10.anInt2178 += 6;
		}
		@Pc(136) int local136 = local10.method2048(255);
		@Pc(140) int local140 = local10.method2048(255);
		@Pc(146) int local146 = local10.method2048(255);
		@Pc(150) int local150 = local10.method2048(255);
		@Pc(154) int local154 = local10.method2048(255);
		@Pc(158) int local158 = local10.method2028(-14795);
		@Pc(162) int local162 = local10.method2028(-14795);
		@Pc(168) int local168 = local10.method2028(-14795);
		@Pc(174) int local174 = local10.method2028(-14795);
		@Pc(178) int local178 = local10.method2028(-14795);
		@Pc(180) int local180 = 0;
		@Pc(182) int local182 = 0;
		@Pc(184) int local184 = 0;
		@Pc(197) int local197;
		if (this.anInt3629 > 0) {
			local10.anInt2178 = 0;
			this.aByteArray31 = new byte[this.anInt3629];
			for (local197 = 0; local197 < this.anInt3629; local197++) {
				@Pc(208) byte local208 = this.aByteArray31[local197] = local10.method2022();
				if (local208 == 0) {
					local180++;
				}
				if (local208 >= 1 && local208 <= 3) {
					local182++;
				}
				if (local208 == 2) {
					local184++;
				}
			}
		}
		local197 = this.anInt3629;
		@Pc(251) int local251 = local197;
		local197 += this.anInt3635;
		@Pc(258) int local258 = local197;
		if (local79) {
			local197 += this.anInt3646;
		}
		@Pc(271) int local271 = local197;
		local197 += this.anInt3646;
		@Pc(278) int local278 = local197;
		if (local136 == 255) {
			local197 += this.anInt3646;
		}
		@Pc(288) int local288 = local197;
		if (local146 == 1) {
			local197 += this.anInt3646;
		}
		@Pc(300) int local300 = local197;
		if (local154 == 1) {
			local197 += this.anInt3635;
		}
		@Pc(310) int local310 = local197;
		if (local140 == 1) {
			local197 += this.anInt3646;
		}
		@Pc(320) int local320 = local197;
		local197 += local174;
		@Pc(326) int local326 = local197;
		if (local150 == 1) {
			local197 += this.anInt3646 * 2;
		}
		@Pc(338) int local338 = local197;
		local197 += local178;
		@Pc(344) int local344 = local197;
		local197 += this.anInt3646 * 2;
		@Pc(353) int local353 = local197;
		local197 += local158;
		@Pc(359) int local359 = local197;
		local197 += local162;
		@Pc(365) int local365 = local197;
		local197 += local168;
		@Pc(371) int local371 = local197;
		local197 += local180 * 6;
		@Pc(379) int local379 = local197;
		local197 += local182 * 6;
		@Pc(387) byte local387 = 6;
		if (this.anInt3633 == 14) {
			local387 = 7;
		} else if (this.anInt3633 >= 15) {
			local387 = 9;
		}
		@Pc(405) int local405 = local197;
		local197 += local182 * local387;
		@Pc(413) int local413 = local197;
		local197 += local182;
		@Pc(419) int local419 = local197;
		local197 += local182;
		@Pc(425) int local425 = local197;
		local197 += local184 * 2 + local182;
		if (local136 == 255) {
			this.aByteArray28 = new byte[this.anInt3646];
		} else {
			this.aByte62 = (byte) local136;
		}
		this.aShortArray30 = new short[this.anInt3646];
		if (local154 == 1) {
			this.anIntArray259 = new int[this.anInt3635];
		}
		local10.anInt2178 = local251;
		this.aShortArray33 = new short[this.anInt3646];
		if (local140 == 1) {
			this.aByteArray27 = new byte[this.anInt3646];
		}
		if (local79) {
			this.aByteArray29 = new byte[this.anInt3646];
		}
		this.anIntArray257 = new int[this.anInt3635];
		this.aShortArray36 = new short[this.anInt3646];
		this.anIntArray251 = new int[this.anInt3635];
		this.aShortArray35 = new short[this.anInt3646];
		if (local146 == 1) {
			this.anIntArray258 = new int[this.anInt3646];
		}
		if (local150 == 1 && this.anInt3629 > 0) {
			this.aByteArray30 = new byte[this.anInt3646];
		}
		if (local150 == 1) {
			this.aShortArray38 = new short[this.anInt3646];
		}
		this.anIntArray253 = new int[this.anInt3635];
		if (this.anInt3629 > 0) {
			if (local182 > 0) {
				this.aByteArray32 = new byte[local182];
				this.anIntArray255 = new int[local182];
				this.aByteArray33 = new byte[local182];
				this.anIntArray252 = new int[local182];
				this.anIntArray254 = new int[local182];
				this.anIntArray261 = new int[local182];
			}
			this.aShortArray37 = new short[this.anInt3629];
			this.aShortArray31 = new short[this.anInt3629];
			this.aShortArray34 = new short[this.anInt3629];
			if (local184 > 0) {
				this.anIntArray256 = new int[local184];
				this.anIntArray260 = new int[local184];
			}
		}
		local15.anInt2178 = local353;
		local20.anInt2178 = local359;
		local25.anInt2178 = local365;
		local30.anInt2178 = local300;
		@Pc(643) int local643 = 0;
		@Pc(645) int local645 = 0;
		@Pc(647) int local647 = 0;
		@Pc(655) int local655;
		for (@Pc(649) int local649 = 0; local649 < this.anInt3635; local649++) {
			local655 = local10.method2048(255);
			@Pc(657) int local657 = 0;
			if ((local655 & 0x1) != 0) {
				local657 = local15.method2009(128);
			}
			@Pc(672) int local672 = 0;
			if ((local655 & 0x2) != 0) {
				local672 = local20.method2009(128);
			}
			@Pc(687) int local687 = 0;
			if ((local655 & 0x4) != 0) {
				local687 = local25.method2009(128);
			}
			this.anIntArray253[local649] = local657 + local643;
			this.anIntArray257[local649] = local672 + local645;
			this.anIntArray251[local649] = local687 + local647;
			local643 = this.anIntArray253[local649];
			local647 = this.anIntArray251[local649];
			local645 = this.anIntArray257[local649];
			if (local154 == 1) {
				this.anIntArray259[local649] = local30.method2048(255);
			}
		}
		local10.anInt2178 = local344;
		local15.anInt2178 = local258;
		local20.anInt2178 = local278;
		local25.anInt2178 = local310;
		local30.anInt2178 = local288;
		local35.anInt2178 = local326;
		local40.anInt2178 = local338;
		for (local655 = 0; local655 < this.anInt3646; local655++) {
			this.aShortArray35[local655] = (short) local10.method2028(-14795);
			if (local79) {
				this.aByteArray29[local655] = local15.method2022();
			}
			if (local136 == 255) {
				this.aByteArray28[local655] = local20.method2022();
			}
			if (local140 == 1) {
				this.aByteArray27[local655] = local25.method2022();
			}
			if (local146 == 1) {
				this.anIntArray258[local655] = local30.method2048(255);
			}
			if (local150 == 1) {
				this.aShortArray38[local655] = (short) (local35.method2028(-14795) - 1);
			}
			if (this.aByteArray30 != null) {
				if (this.aShortArray38[local655] == -1) {
					this.aByteArray30[local655] = -1;
				} else {
					this.aByteArray30[local655] = (byte) (local40.method2048(255) - 1);
				}
			}
		}
		this.anInt3636 = -1;
		local10.anInt2178 = local320;
		local15.anInt2178 = local271;
		@Pc(908) short local908 = 0;
		@Pc(910) short local910 = 0;
		@Pc(912) short local912 = 0;
		@Pc(914) short local914 = 0;
		@Pc(926) int local926;
		for (@Pc(916) int local916 = 0; local916 < this.anInt3646; local916++) {
			local926 = local15.method2048(255);
			if (local926 == 1) {
				local908 = (short) (local914 + local10.method2009(128));
				local910 = (short) (local908 + local10.method2009(128));
				local912 = (short) (local10.method2009(128) + local910);
				this.aShortArray30[local916] = local908;
				local914 = local912;
				this.aShortArray33[local916] = local910;
				this.aShortArray36[local916] = local912;
				if (this.anInt3636 < local908) {
					this.anInt3636 = local908;
				}
				if (this.anInt3636 < local910) {
					this.anInt3636 = local910;
				}
				if (local912 > this.anInt3636) {
					this.anInt3636 = local912;
				}
			}
			if (local926 == 2) {
				local910 = local912;
				local912 = (short) (local10.method2009(128) + local914);
				local914 = local912;
				this.aShortArray30[local916] = local908;
				this.aShortArray33[local916] = local910;
				this.aShortArray36[local916] = local912;
				if (this.anInt3636 < local912) {
					this.anInt3636 = local912;
				}
			}
			if (local926 == 3) {
				local908 = local912;
				local912 = (short) (local10.method2009(128) + local914);
				this.aShortArray30[local916] = local908;
				local914 = local912;
				this.aShortArray33[local916] = local910;
				this.aShortArray36[local916] = local912;
				if (this.anInt3636 < local912) {
					this.anInt3636 = local912;
				}
			}
			if (local926 == 4) {
				@Pc(1091) short local1091 = local908;
				local908 = local910;
				local912 = (short) (local914 + local10.method2009(128));
				local910 = local1091;
				local914 = local912;
				this.aShortArray30[local916] = local908;
				this.aShortArray33[local916] = local1091;
				this.aShortArray36[local916] = local912;
				if (this.anInt3636 < local912) {
					this.anInt3636 = local912;
				}
			}
		}
		local10.anInt2178 = local371;
		this.anInt3636++;
		local15.anInt2178 = local379;
		local20.anInt2178 = local405;
		local25.anInt2178 = local413;
		local30.anInt2178 = local419;
		local35.anInt2178 = local425;
		@Pc(1182) int local1182;
		for (local926 = 0; local926 < this.anInt3629; local926++) {
			local1182 = this.aByteArray31[local926] & 0xFF;
			if (local1182 == 0) {
				this.aShortArray37[local926] = (short) local10.method2028(-14795);
				this.aShortArray31[local926] = (short) local10.method2028(-14795);
				this.aShortArray34[local926] = (short) local10.method2028(-14795);
			}
			if (local1182 == 1) {
				this.aShortArray37[local926] = (short) local15.method2028(-14795);
				this.aShortArray31[local926] = (short) local15.method2028(-14795);
				this.aShortArray34[local926] = (short) local15.method2028(-14795);
				if (this.anInt3633 < 15) {
					this.anIntArray252[local926] = local20.method2028(-14795);
					if (this.anInt3633 < 14) {
						this.anIntArray254[local926] = local20.method2028(-14795);
					} else {
						this.anIntArray254[local926] = local20.method2061();
					}
					this.anIntArray255[local926] = local20.method2028(-14795);
				} else {
					this.anIntArray252[local926] = local20.method2061();
					this.anIntArray254[local926] = local20.method2061();
					this.anIntArray255[local926] = local20.method2061();
				}
				this.aByteArray32[local926] = local25.method2022();
				this.aByteArray33[local926] = local30.method2022();
				this.anIntArray261[local926] = local35.method2022();
			}
			if (local1182 == 2) {
				this.aShortArray37[local926] = (short) local15.method2028(-14795);
				this.aShortArray31[local926] = (short) local15.method2028(-14795);
				this.aShortArray34[local926] = (short) local15.method2028(-14795);
				if (this.anInt3633 < 15) {
					this.anIntArray252[local926] = local20.method2028(-14795);
					if (this.anInt3633 >= 14) {
						this.anIntArray254[local926] = local20.method2061();
					} else {
						this.anIntArray254[local926] = local20.method2028(-14795);
					}
					this.anIntArray255[local926] = local20.method2028(-14795);
				} else {
					this.anIntArray252[local926] = local20.method2061();
					this.anIntArray254[local926] = local20.method2061();
					this.anIntArray255[local926] = local20.method2061();
				}
				this.aByteArray32[local926] = local25.method2022();
				this.aByteArray33[local926] = local30.method2022();
				this.anIntArray261[local926] = local35.method2022();
				this.anIntArray260[local926] = local35.method2022();
				this.anIntArray256[local926] = local35.method2022();
			}
			if (local1182 == 3) {
				this.aShortArray37[local926] = (short) local15.method2028(-14795);
				this.aShortArray31[local926] = (short) local15.method2028(-14795);
				this.aShortArray34[local926] = (short) local15.method2028(-14795);
				if (this.anInt3633 >= 15) {
					this.anIntArray252[local926] = local20.method2061();
					this.anIntArray254[local926] = local20.method2061();
					this.anIntArray255[local926] = local20.method2061();
				} else {
					this.anIntArray252[local926] = local20.method2028(-14795);
					if (this.anInt3633 >= 14) {
						this.anIntArray254[local926] = local20.method2061();
					} else {
						this.anIntArray254[local926] = local20.method2028(-14795);
					}
					this.anIntArray255[local926] = local20.method2028(-14795);
				}
				this.aByteArray32[local926] = local25.method2022();
				this.aByteArray33[local926] = local30.method2022();
				this.anIntArray261[local926] = local35.method2022();
			}
		}
		local10.anInt2178 = local197;
		if (-2760 != -2760) {
			this.anIntArray260 = null;
		}
		@Pc(1661) int local1661;
		@Pc(1669) int local1669;
		@Pc(1673) int local1673;
		@Pc(1743) int local1743;
		if (local89) {
			local1182 = local10.method2048(255);
			if (local1182 > 0) {
				this.aClass184Array1 = new Class184[local1182];
				for (local1661 = 0; local1661 < local1182; local1661++) {
					local1669 = local10.method2028(-14795);
					local1673 = local10.method2028(-14795);
					@Pc(1679) byte local1679;
					if (local136 == 255) {
						local1679 = this.aByteArray28[local1673];
					} else {
						local1679 = (byte) local136;
					}
					this.aClass184Array1[local1661] = new Class184(local1669, this.aShortArray30[local1673], this.aShortArray33[local1673], this.aShortArray36[local1673], local1679);
				}
			}
			local1661 = local10.method2048(255);
			if (local1661 > 0) {
				this.aClass232Array1 = new Class232[local1661];
				for (local1669 = 0; local1669 < local1661; local1669++) {
					local1673 = local10.method2028(-14795);
					local1743 = local10.method2028(-14795);
					this.aClass232Array1[local1669] = new Class232(local1673, local1743);
				}
			}
		}
		if (!local99) {
			return;
		}
		local1182 = local10.method2048(255);
		if (local1182 <= 0) {
			return;
		}
		this.aClass60Array1 = new Class60[local1182];
		for (local1661 = 0; local1661 < local1182; local1661++) {
			local1669 = local10.method2028(-14795);
			local1673 = local10.method2028(-14795);
			local1743 = local10.method2048(255);
			@Pc(1796) byte local1796 = local10.method2022();
			this.aClass60Array1[local1661] = new Class60(local1669, local1673, local1743, local1796);
		}
		return;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZSS)V")
	public void method3299(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3646; local7++) {
			if (arg0 == this.aShortArray35[local7]) {
				this.aShortArray35[local7] = arg1;
			}
		}
		if (false) {
			this.method3291((byte) -121, (byte[]) null);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(SBS)V")
	public void method3300(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) short arg2) {
		if (this.aShortArray38 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt3646; local12++) {
			if (this.aShortArray38[local12] == arg0) {
				this.aShortArray38[local12] = arg2;
			}
		}
		if (arg1 > -87) {
			this.method3297(110);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(SSSBSSSBBB)B")
	public byte method3301() {
		if (this.anInt3629 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray31[this.anInt3629] = 3;
		this.aShortArray37[this.anInt3629] = 0;
		this.aShortArray31[this.anInt3629] = 32767;
		this.aShortArray34[this.anInt3629] = 0;
		this.anIntArray252[this.anInt3629] = 1024;
		this.anIntArray254[this.anInt3629] = 1024;
		this.anIntArray255[this.anInt3629] = 1024;
		this.aByteArray32[this.anInt3629] = 0;
		this.aByteArray33[this.anInt3629] = 0;
		this.anIntArray261[this.anInt3629] = 0;
		return (byte) this.anInt3629++;
	}
}

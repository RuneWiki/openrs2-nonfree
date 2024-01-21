import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WGRALUSQ")
public final class Class6_Sub1_Sub1_Sub3 extends Class6_Sub1_Sub1 {

	@OriginalMember(owner = "client!WGRALUSQ", name = "y", descriptor = "I")
	private int anInt775 = 3;

	@OriginalMember(owner = "client!WGRALUSQ", name = "z", descriptor = "I")
	private int anInt776 = 2276;

	@OriginalMember(owner = "client!WGRALUSQ", name = "A", descriptor = "I")
	private int anInt777 = 4;

	@OriginalMember(owner = "client!WGRALUSQ", name = "B", descriptor = "Z")
	private boolean aBoolean206 = false;

	@OriginalMember(owner = "client!WGRALUSQ", name = "C", descriptor = "B")
	private byte aByte22 = 7;

	@OriginalMember(owner = "client!WGRALUSQ", name = "D", descriptor = "I")
	private int anInt778 = 3;

	@OriginalMember(owner = "client!WGRALUSQ", name = "E", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!WGRALUSQ", name = "F", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!WGRALUSQ", name = "G", descriptor = "Z")
	private boolean aBoolean209 = true;

	@OriginalMember(owner = "client!WGRALUSQ", name = "N", descriptor = "I")
	public int anInt783;

	@OriginalMember(owner = "client!WGRALUSQ", name = "O", descriptor = "I")
	private int anInt784;

	@OriginalMember(owner = "client!WGRALUSQ", name = "I", descriptor = "[I")
	public int[] anIntArray200;

	@OriginalMember(owner = "client!WGRALUSQ", name = "L", descriptor = "I")
	public int anInt781;

	@OriginalMember(owner = "client!WGRALUSQ", name = "M", descriptor = "I")
	public int anInt782;

	@OriginalMember(owner = "client!WGRALUSQ", name = "J", descriptor = "I")
	public int anInt779;

	@OriginalMember(owner = "client!WGRALUSQ", name = "K", descriptor = "I")
	public int anInt780;

	@OriginalMember(owner = "client!WGRALUSQ", name = "H", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!WGRALUSQ", name = "<init>", descriptor = "(Lclient!ESUFCMYV;Ljava/lang/String;I)V")
	public Class6_Sub1_Sub1_Sub3(@OriginalArg(0) Class11 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(46) Class6_Sub1_Sub4 local46 = new Class6_Sub1_Sub4(arg0.method89(arg1 + ".dat", null), (byte) -17);
		@Pc(55) Class6_Sub1_Sub4 local55 = new Class6_Sub1_Sub4(arg0.method89("index.dat", null), (byte) -17);
		local55.anInt704 = local46.method413();
		this.anInt783 = local55.method413();
		this.anInt784 = local55.method413();
		@Pc(70) int local70 = local55.method411();
		this.anIntArray200 = new int[local70];
		for (@Pc(76) int local76 = 0; local76 < local70 - 1; local76++) {
			this.anIntArray200[local76 + 1] = local55.method415();
		}
		for (@Pc(100) int local100 = 0; local100 < arg2; local100++) {
			local55.anInt704 += 2;
			local46.anInt704 += local55.method413() * local55.method413();
			local55.anInt704++;
		}
		this.anInt781 = local55.method411();
		this.anInt782 = local55.method411();
		this.anInt779 = local55.method413();
		this.anInt780 = local55.method413();
		@Pc(147) int local147 = local55.method411();
		@Pc(153) int local153 = this.anInt779 * this.anInt780;
		this.aByteArray19 = new byte[local153];
		@Pc(161) int local161;
		if (local147 == 0) {
			for (local161 = 0; local161 < local153; local161++) {
				this.aByteArray19[local161] = local46.method412();
			}
		} else if (local147 == 1) {
			for (local161 = 0; local161 < this.anInt779; local161++) {
				for (@Pc(183) int local183 = 0; local183 < this.anInt780; local183++) {
					this.aByteArray19[local161 + local183 * this.anInt779] = local46.method412();
				}
			}
		}
	}

	@OriginalMember(owner = "client!WGRALUSQ", name = "b", descriptor = "(B)V")
	public void method530(@OriginalArg(0) byte arg0) {
		try {
			this.anInt783 /= 2;
			this.anInt784 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt783 * this.anInt784];
			@Pc(22) int local22 = 0;
			if (this.aByte22 == 7) {
				@Pc(28) boolean local28 = false;
			} else {
				this.anInt775 = 130;
			}
			for (@Pc(35) int local35 = 0; local35 < this.anInt780; local35++) {
				for (@Pc(39) int local39 = 0; local39 < this.anInt779; local39++) {
					local20[(local39 + this.anInt781 >> 1) + (local35 + this.anInt782 >> 1) * this.anInt783] = this.aByteArray19[local22++];
				}
			}
			this.aByteArray19 = local20;
			this.anInt779 = this.anInt783;
			this.anInt780 = this.anInt784;
			this.anInt781 = 0;
			this.anInt782 = 0;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("12793, " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WGRALUSQ", name = "a", descriptor = "(I)V")
	public void method531() {
		try {
			if (this.anInt779 != this.anInt783 || this.anInt780 != this.anInt784) {
				@Pc(30) byte[] local30 = new byte[this.anInt783 * this.anInt784];
				@Pc(32) int local32 = 0;
				for (@Pc(34) int local34 = 0; local34 < this.anInt780; local34++) {
					for (@Pc(38) int local38 = 0; local38 < this.anInt779; local38++) {
						local30[local38 + this.anInt781 + (local34 + this.anInt782) * this.anInt783] = this.aByteArray19[local32++];
					}
				}
				this.aByteArray19 = local30;
				this.anInt779 = this.anInt783;
				this.anInt780 = this.anInt784;
				this.anInt781 = 0;
				this.anInt782 = 0;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("41289, " + -12580 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WGRALUSQ", name = "b", descriptor = "(I)V")
	public void method532(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt779 * this.anInt780];
			@Pc(12) int local12;
			if (arg0 <= 0) {
				for (local12 = 1; local12 > 0; local12++) {
				}
			}
			local12 = 0;
			for (@Pc(21) int local21 = 0; local21 < this.anInt780; local21++) {
				for (@Pc(28) int local28 = this.anInt779 - 1; local28 >= 0; local28--) {
					local8[local12++] = this.aByteArray19[local28 + local21 * this.anInt779];
				}
			}
			this.aByteArray19 = local8;
			this.anInt781 = this.anInt783 - this.anInt779 - this.anInt781;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("41993, " + arg0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WGRALUSQ", name = "c", descriptor = "(I)V")
	public void method533() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt779 * this.anInt780];
			@Pc(10) int local10 = 0;
			for (@Pc(20) int local20 = this.anInt780 - 1; local20 >= 0; local20--) {
				for (@Pc(24) int local24 = 0; local24 < this.anInt779; local24++) {
					local8[local10++] = this.aByteArray19[local24 + local20 * this.anInt779];
				}
			}
			this.aByteArray19 = local8;
			this.anInt782 = this.anInt784 - this.anInt780 - this.anInt782;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("52436, " + 0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WGRALUSQ", name = "a", descriptor = "(IIII)V")
	public void method534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray200.length; local3++) {
				@Pc(14) int local14 = this.anIntArray200[local3] >> 16 & 0xFF;
				local14 += arg3;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray200[local3] >> 8 & 0xFF;
				local38 += arg0;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray200[local3] & 0xFF;
				local60 += arg1;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray200[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
			if (arg2 <= 0) {
				this.anInt776 = 149;
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("64999, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WGRALUSQ", name = "a", descriptor = "(III)V")
	public void method535(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt781;
			arg1 += this.anInt782;
			@Pc(15) int local15 = arg0 + arg1 * Class6_Sub1_Sub1.anInt821;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt780;
			@Pc(23) int local23 = this.anInt779;
			@Pc(27) int local27 = Class6_Sub1_Sub1.anInt821 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class6_Sub1_Sub1.anInt823) {
				local36 = Class6_Sub1_Sub1.anInt823 - arg1;
				local20 -= local36;
				arg1 = Class6_Sub1_Sub1.anInt823;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class6_Sub1_Sub1.anInt821;
			}
			if (arg1 + local20 > Class6_Sub1_Sub1.anInt824) {
				local20 -= arg1 + local20 - Class6_Sub1_Sub1.anInt824;
			}
			if (arg0 < Class6_Sub1_Sub1.anInt825) {
				local36 = Class6_Sub1_Sub1.anInt825 - arg0;
				local23 -= local36;
				arg0 = Class6_Sub1_Sub1.anInt825;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class6_Sub1_Sub1.anInt826) {
				local36 = arg0 + local23 - Class6_Sub1_Sub1.anInt826;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method536(local23, local17, Class6_Sub1_Sub1.anIntArray208, this.anIntArray200, local27, this.aByteArray19, local15, local29, local20);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("69045, " + arg0 + ", " + 22912 + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WGRALUSQ", name = "a", descriptor = "(II[I[II[BIIZI)V")
	private void method536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg0 >> 2);
			@Pc(11) int local11 = -(arg0 & 0x3);
			for (@Pc(14) int local14 = -arg8; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					@Pc(25) byte local25 = arg5[arg1++];
					if (local25 == 0) {
						arg6++;
					} else {
						arg2[arg6++] = arg3[local25 & 0xFF];
					}
					local25 = arg5[arg1++];
					if (local25 == 0) {
						arg6++;
					} else {
						arg2[arg6++] = arg3[local25 & 0xFF];
					}
					local25 = arg5[arg1++];
					if (local25 == 0) {
						arg6++;
					} else {
						arg2[arg6++] = arg3[local25 & 0xFF];
					}
					local25 = arg5[arg1++];
					if (local25 == 0) {
						arg6++;
					} else {
						arg2[arg6++] = arg3[local25 & 0xFF];
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					@Pc(108) byte local108 = arg5[arg1++];
					if (local108 == 0) {
						arg6++;
					} else {
						arg2[arg6++] = arg3[local108 & 0xFF];
					}
				}
				arg6 += arg4;
				arg1 += arg7;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("3690, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + false + ", " + arg8 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}
}

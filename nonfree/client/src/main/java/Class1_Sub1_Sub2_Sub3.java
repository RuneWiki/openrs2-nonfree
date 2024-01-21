import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jb")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
	private int anInt668 = 986;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
	private int anInt669 = 5;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "Z")
	private boolean aBoolean178 = true;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
	public int anInt674;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	private int anInt675;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "[I")
	public int[] anIntArray209;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
	public int anInt672;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
	public int anInt673;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
	public int anInt670;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
	public int anInt671;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method660(arg1 + ".dat", null), 185);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method660("index.dat", null), 185);
		local37.anInt738 = local28.method476();
		this.anInt674 = local37.method476();
		this.anInt675 = local37.method476();
		@Pc(52) int local52 = local37.method474();
		this.anIntArray209 = new int[local52];
		for (@Pc(58) int local58 = 0; local58 < local52 - 1; local58++) {
			this.anIntArray209[local58 + 1] = local37.method478();
		}
		for (@Pc(76) int local76 = 0; local76 < arg2; local76++) {
			local37.anInt738 += 2;
			local28.anInt738 += local37.method476() * local37.method476();
			local37.anInt738++;
		}
		this.anInt672 = local37.method474();
		this.anInt673 = local37.method474();
		this.anInt670 = local37.method476();
		this.anInt671 = local37.method476();
		@Pc(123) int local123 = local37.method474();
		@Pc(129) int local129 = this.anInt670 * this.anInt671;
		this.aByteArray7 = new byte[local129];
		@Pc(137) int local137;
		if (local123 == 0) {
			for (local137 = 0; local137 < local129; local137++) {
				this.aByteArray7[local137] = local28.method475();
			}
		} else if (local123 == 1) {
			for (local137 = 0; local137 < this.anInt670; local137++) {
				for (@Pc(159) int local159 = 0; local159 < this.anInt671; local159++) {
					this.aByteArray7[local137 + local159 * this.anInt670] = local28.method475();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public void method410(@OriginalArg(0) int arg0) {
		try {
			this.anInt674 /= 2;
			this.anInt675 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt674 * this.anInt675];
			@Pc(24) boolean local24 = false;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < this.anInt671; local28++) {
				for (@Pc(32) int local32 = 0; local32 < this.anInt670; local32++) {
					local20[(local32 + this.anInt672 >> 1) + (local28 + this.anInt673 >> 1) * this.anInt674] = this.aByteArray7[local26++];
				}
			}
			this.aByteArray7 = local20;
			this.anInt670 = this.anInt674;
			this.anInt671 = this.anInt675;
			this.anInt672 = 0;
			this.anInt673 = 0;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("35727, " + arg0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public void method411() {
		try {
			if (this.anInt670 != this.anInt674 || this.anInt671 != this.anInt675) {
				@Pc(25) byte[] local25 = new byte[this.anInt674 * this.anInt675];
				@Pc(27) int local27 = 0;
				for (@Pc(29) int local29 = 0; local29 < this.anInt671; local29++) {
					for (@Pc(33) int local33 = 0; local33 < this.anInt670; local33++) {
						local25[local33 + this.anInt672 + (local29 + this.anInt673) * this.anInt674] = this.aByteArray7[local27++];
					}
				}
				this.aByteArray7 = local25;
				this.anInt670 = this.anInt674;
				this.anInt671 = this.anInt675;
				this.anInt672 = 0;
				this.anInt673 = 0;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("81191, " + 4 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public void method412(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt670 * this.anInt671];
			if (arg0 > 0) {
				@Pc(13) int local13 = 0;
				for (@Pc(15) int local15 = 0; local15 < this.anInt671; local15++) {
					for (@Pc(22) int local22 = this.anInt670 - 1; local22 >= 0; local22--) {
						local8[local13++] = this.aByteArray7[local22 + local15 * this.anInt670];
					}
				}
				this.aByteArray7 = local8;
				this.anInt672 = this.anInt674 - this.anInt670 - this.anInt672;
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("1965, " + arg0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public void method413() {
		try {
			@Pc(13) byte[] local13 = new byte[this.anInt670 * this.anInt671];
			@Pc(15) int local15 = 0;
			for (@Pc(20) int local20 = this.anInt671 - 1; local20 >= 0; local20--) {
				for (@Pc(24) int local24 = 0; local24 < this.anInt670; local24++) {
					local13[local15++] = this.aByteArray7[local24 + local20 * this.anInt670];
				}
			}
			this.aByteArray7 = local13;
			this.anInt673 = this.anInt675 - this.anInt671 - this.anInt673;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("41220, " + 0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZI)V")
	public void method414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(8) int local8 = 0; local8 < this.anIntArray209.length; local8++) {
				@Pc(19) int local19 = this.anIntArray209[local8] >> 16 & 0xFF;
				local19 += arg2;
				if (local19 < 0) {
					local19 = 0;
				} else if (local19 > 255) {
					local19 = 255;
				}
				@Pc(43) int local43 = this.anIntArray209[local8] >> 8 & 0xFF;
				local43 += arg0;
				if (local43 < 0) {
					local43 = 0;
				} else if (local43 > 255) {
					local43 = 255;
				}
				@Pc(65) int local65 = this.anIntArray209[local8] & 0xFF;
				local65 += arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 255) {
					local65 = 255;
				}
				this.anIntArray209[local8] = (local19 << 16) + (local43 << 8) + local65;
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("81513, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBI)V")
	public void method415(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			arg0 += this.anInt672;
			@Pc(11) boolean local11 = false;
			arg2 += this.anInt673;
			@Pc(31) int local31 = arg0 + arg2 * Class1_Sub1_Sub2.anInt691;
			@Pc(33) int local33 = 0;
			@Pc(36) int local36 = this.anInt671;
			@Pc(39) int local39 = this.anInt670;
			@Pc(43) int local43 = Class1_Sub1_Sub2.anInt691 - local39;
			@Pc(45) int local45 = 0;
			@Pc(52) int local52;
			if (arg2 < Class1_Sub1_Sub2.anInt693) {
				local52 = Class1_Sub1_Sub2.anInt693 - arg2;
				local36 -= local52;
				arg2 = Class1_Sub1_Sub2.anInt693;
				local33 = local52 * local39 + 0;
				local31 += local52 * Class1_Sub1_Sub2.anInt691;
			}
			if (arg2 + local36 > Class1_Sub1_Sub2.anInt694) {
				local36 -= arg2 + local36 - Class1_Sub1_Sub2.anInt694;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt695) {
				local52 = Class1_Sub1_Sub2.anInt695 - arg0;
				local39 -= local52;
				arg0 = Class1_Sub1_Sub2.anInt695;
				local33 += local52;
				local31 += local52;
				local45 = local52 + 0;
				local43 += local52;
			}
			if (arg0 + local39 > Class1_Sub1_Sub2.anInt696) {
				local52 = arg0 + local39 - Class1_Sub1_Sub2.anInt696;
				local39 -= local52;
				local45 += local52;
				local43 += local52;
			}
			if (local39 > 0 && local36 > 0) {
				this.method416(Class1_Sub1_Sub2.anIntArray210, local31, local36, local43, local45, this.anIntArray209, local39, this.aByteArray7, local33);
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("92571, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([IIIII[III[BI)V")
	private void method416(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg6 >> 2);
			@Pc(24) int local24 = -(arg6 & 0x3);
			for (@Pc(27) int local27 = -arg2; local27 < 0; local27++) {
				for (@Pc(31) int local31 = local6; local31 < 0; local31++) {
					@Pc(38) byte local38 = arg7[arg8++];
					if (local38 == 0) {
						arg1++;
					} else {
						arg0[arg1++] = arg5[local38 & 0xFF];
					}
					local38 = arg7[arg8++];
					if (local38 == 0) {
						arg1++;
					} else {
						arg0[arg1++] = arg5[local38 & 0xFF];
					}
					local38 = arg7[arg8++];
					if (local38 == 0) {
						arg1++;
					} else {
						arg0[arg1++] = arg5[local38 & 0xFF];
					}
					local38 = arg7[arg8++];
					if (local38 == 0) {
						arg1++;
					} else {
						arg0[arg1++] = arg5[local38 & 0xFF];
					}
				}
				for (@Pc(114) int local114 = local24; local114 < 0; local114++) {
					@Pc(121) byte local121 = arg7[arg8++];
					if (local121 == 0) {
						arg1++;
					} else {
						arg0[arg1++] = arg5[local121 & 0xFF];
					}
				}
				arg1 += arg3;
				arg8 += arg4;
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("22339, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 6 + ", " + arg7 + ", " + arg8 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}
}

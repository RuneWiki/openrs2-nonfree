import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XHDQQNIR")
public final class Class6_Sub2_Sub2_Sub4 extends Class6_Sub2_Sub2 {

	@OriginalMember(owner = "client!XHDQQNIR", name = "z", descriptor = "I")
	private int anInt767 = 178;

	@OriginalMember(owner = "client!XHDQQNIR", name = "A", descriptor = "I")
	private int anInt768 = -752;

	@OriginalMember(owner = "client!XHDQQNIR", name = "B", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!XHDQQNIR", name = "C", descriptor = "B")
	private byte aByte29 = 5;

	@OriginalMember(owner = "client!XHDQQNIR", name = "D", descriptor = "I")
	private int anInt769 = 18;

	@OriginalMember(owner = "client!XHDQQNIR", name = "K", descriptor = "I")
	public int anInt774;

	@OriginalMember(owner = "client!XHDQQNIR", name = "L", descriptor = "I")
	private int anInt775;

	@OriginalMember(owner = "client!XHDQQNIR", name = "F", descriptor = "[I")
	public int[] anIntArray207;

	@OriginalMember(owner = "client!XHDQQNIR", name = "I", descriptor = "I")
	public int anInt772;

	@OriginalMember(owner = "client!XHDQQNIR", name = "J", descriptor = "I")
	public int anInt773;

	@OriginalMember(owner = "client!XHDQQNIR", name = "G", descriptor = "I")
	public int anInt770;

	@OriginalMember(owner = "client!XHDQQNIR", name = "H", descriptor = "I")
	public int anInt771;

	@OriginalMember(owner = "client!XHDQQNIR", name = "E", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!XHDQQNIR", name = "<init>", descriptor = "(Lclient!RVLWVPJQ;Ljava/lang/String;I)V")
	public Class6_Sub2_Sub2_Sub4(@OriginalArg(0) Class36 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class6_Sub2_Sub3 local34 = new Class6_Sub2_Sub3(741, arg0.method381(arg1 + ".dat", null));
		@Pc(43) Class6_Sub2_Sub3 local43 = new Class6_Sub2_Sub3(741, arg0.method381("index.dat", null));
		local43.anInt609 = local34.method404();
		this.anInt774 = local43.method404();
		this.anInt775 = local43.method404();
		@Pc(58) int local58 = local43.method402();
		this.anIntArray207 = new int[local58];
		for (@Pc(64) int local64 = 0; local64 < local58 - 1; local64++) {
			this.anIntArray207[local64 + 1] = local43.method406();
		}
		for (@Pc(82) int local82 = 0; local82 < arg2; local82++) {
			local43.anInt609 += 2;
			local34.anInt609 += local43.method404() * local43.method404();
			local43.anInt609++;
		}
		this.anInt772 = local43.method402();
		this.anInt773 = local43.method402();
		this.anInt770 = local43.method404();
		this.anInt771 = local43.method404();
		@Pc(129) int local129 = local43.method402();
		@Pc(135) int local135 = this.anInt770 * this.anInt771;
		this.aByteArray20 = new byte[local135];
		@Pc(143) int local143;
		if (local129 == 0) {
			for (local143 = 0; local143 < local135; local143++) {
				this.aByteArray20[local143] = local34.method403();
			}
		} else if (local129 == 1) {
			for (local143 = 0; local143 < this.anInt770; local143++) {
				for (@Pc(165) int local165 = 0; local165 < this.anInt771; local165++) {
					this.aByteArray20[local143 + local165 * this.anInt770] = local34.method403();
				}
			}
		}
	}

	@OriginalMember(owner = "client!XHDQQNIR", name = "c", descriptor = "(I)V")
	public void method526() {
		try {
			this.anInt774 /= 2;
			this.anInt775 /= 2;
			@Pc(30) byte[] local30 = new byte[this.anInt774 * this.anInt775];
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = 0; local34 < this.anInt771; local34++) {
				for (@Pc(38) int local38 = 0; local38 < this.anInt770; local38++) {
					local30[(local38 + this.anInt772 >> 1) + (local34 + this.anInt773 >> 1) * this.anInt774] = this.aByteArray20[local32++];
				}
			}
			this.aByteArray20 = local30;
			this.anInt770 = this.anInt774;
			this.anInt771 = this.anInt775;
			this.anInt772 = 0;
			this.anInt773 = 0;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("35003, " + 23483 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XHDQQNIR", name = "d", descriptor = "(I)V")
	public void method527(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt770 != this.anInt774 || this.anInt771 != this.anInt775) {
				@Pc(19) byte[] local19 = new byte[this.anInt774 * this.anInt775];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt771; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt770; local27++) {
						local19[local27 + this.anInt772 + (local23 + this.anInt773) * this.anInt774] = this.aByteArray20[local21++];
					}
				}
				this.aByteArray20 = local19;
				this.anInt770 = this.anInt774;
				this.anInt771 = this.anInt775;
				this.anInt772 = 0;
				@Pc(76) boolean local76 = false;
				this.anInt773 = 0;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("89185, " + arg0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XHDQQNIR", name = "e", descriptor = "(I)V")
	public void method528() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt770 * this.anInt771];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt771; local12++) {
				for (@Pc(19) int local19 = this.anInt770 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray20[local19 + local12 * this.anInt770];
				}
			}
			this.aByteArray20 = local8;
			this.anInt772 = this.anInt774 - this.anInt770 - this.anInt772;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("21473, " + 178 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XHDQQNIR", name = "a", descriptor = "(B)V")
	public void method529() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt770 * this.anInt771];
			@Pc(10) int local10 = 0;
			for (@Pc(25) int local25 = this.anInt771 - 1; local25 >= 0; local25--) {
				for (@Pc(29) int local29 = 0; local29 < this.anInt770; local29++) {
					local8[local10++] = this.aByteArray20[local29 + local25 * this.anInt770];
				}
			}
			this.aByteArray20 = local8;
			this.anInt773 = this.anInt775 - this.anInt771 - this.anInt773;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("84591, " + -104 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XHDQQNIR", name = "a", descriptor = "(IBII)V")
	public void method530(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(14) int local14;
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray207.length; local3++) {
				local14 = this.anIntArray207[local3] >> 16 & 0xFF;
				local14 += arg3;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray207[local3] >> 8 & 0xFF;
				local38 += arg0;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray207[local3] & 0xFF;
				local60 += arg2;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray207[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
			if (arg1 != 85) {
				for (local14 = 1; local14 > 0; local14++) {
				}
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("33478, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XHDQQNIR", name = "a", descriptor = "(III)V")
	public void method531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg0 += this.anInt772;
			arg1 += this.anInt773;
			@Pc(17) int local17 = arg0 + arg1 * Class6_Sub2_Sub2.anInt758;
			@Pc(19) int local19 = 0;
			@Pc(22) int local22 = this.anInt771;
			@Pc(25) int local25 = this.anInt770;
			@Pc(29) int local29 = Class6_Sub2_Sub2.anInt758 - local25;
			@Pc(31) int local31 = 0;
			@Pc(35) int local35;
			while (arg2 >= 0) {
				for (local35 = 1; local35 > 0; local35++) {
				}
			}
			if (arg1 < Class6_Sub2_Sub2.anInt760) {
				local35 = Class6_Sub2_Sub2.anInt760 - arg1;
				local22 -= local35;
				arg1 = Class6_Sub2_Sub2.anInt760;
				local19 = local35 * local25 + 0;
				local17 += local35 * Class6_Sub2_Sub2.anInt758;
			}
			if (arg1 + local22 > Class6_Sub2_Sub2.anInt761) {
				local22 -= arg1 + local22 - Class6_Sub2_Sub2.anInt761;
			}
			if (arg0 < Class6_Sub2_Sub2.anInt762) {
				local35 = Class6_Sub2_Sub2.anInt762 - arg0;
				local25 -= local35;
				arg0 = Class6_Sub2_Sub2.anInt762;
				local19 += local35;
				local17 += local35;
				local31 = local35 + 0;
				local29 += local35;
			}
			if (arg0 + local25 > Class6_Sub2_Sub2.anInt763) {
				local35 = arg0 + local25 - Class6_Sub2_Sub2.anInt763;
				local25 -= local35;
				local31 += local35;
				local29 += local35;
			}
			if (local25 > 0 && local22 > 0) {
				this.method532((byte) 7, local19, Class6_Sub2_Sub2.anIntArray206, local29, local31, this.aByteArray20, local22, local25, local17, this.anIntArray207);
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("43947, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XHDQQNIR", name = "a", descriptor = "(BI[III[BIII[I)V")
	private void method532(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[] arg9) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(16) int local16 = -(arg7 >> 2);
			@Pc(21) int local21 = -(arg7 & 0x3);
			for (@Pc(24) int local24 = -arg6; local24 < 0; local24++) {
				for (@Pc(28) int local28 = local16; local28 < 0; local28++) {
					@Pc(35) byte local35 = arg5[arg1++];
					if (local35 == 0) {
						arg8++;
					} else {
						arg2[arg8++] = arg9[local35 & 0xFF];
					}
					local35 = arg5[arg1++];
					if (local35 == 0) {
						arg8++;
					} else {
						arg2[arg8++] = arg9[local35 & 0xFF];
					}
					local35 = arg5[arg1++];
					if (local35 == 0) {
						arg8++;
					} else {
						arg2[arg8++] = arg9[local35 & 0xFF];
					}
					local35 = arg5[arg1++];
					if (local35 == 0) {
						arg8++;
					} else {
						arg2[arg8++] = arg9[local35 & 0xFF];
					}
				}
				for (@Pc(111) int local111 = local21; local111 < 0; local111++) {
					@Pc(118) byte local118 = arg5[arg1++];
					if (local118 == 0) {
						arg8++;
					} else {
						arg2[arg8++] = arg9[local118 & 0xFF];
					}
				}
				arg8 += arg3;
				arg1 += arg4;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("63560, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}

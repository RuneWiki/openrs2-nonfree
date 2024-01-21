import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SSCICQYX")
public final class Class3_Sub1_Sub2_Sub3 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!SSCICQYX", name = "z", descriptor = "Z")
	private boolean aBoolean127 = false;

	@OriginalMember(owner = "client!SSCICQYX", name = "A", descriptor = "Z")
	private boolean aBoolean128 = false;

	@OriginalMember(owner = "client!SSCICQYX", name = "B", descriptor = "I")
	private int anInt545 = -103;

	@OriginalMember(owner = "client!SSCICQYX", name = "C", descriptor = "I")
	private int anInt546 = -103;

	@OriginalMember(owner = "client!SSCICQYX", name = "J", descriptor = "I")
	public int anInt551;

	@OriginalMember(owner = "client!SSCICQYX", name = "K", descriptor = "I")
	private int anInt552;

	@OriginalMember(owner = "client!SSCICQYX", name = "E", descriptor = "[I")
	public int[] anIntArray121;

	@OriginalMember(owner = "client!SSCICQYX", name = "H", descriptor = "I")
	public int anInt549;

	@OriginalMember(owner = "client!SSCICQYX", name = "I", descriptor = "I")
	public int anInt550;

	@OriginalMember(owner = "client!SSCICQYX", name = "F", descriptor = "I")
	public int anInt547;

	@OriginalMember(owner = "client!SSCICQYX", name = "G", descriptor = "I")
	public int anInt548;

	@OriginalMember(owner = "client!SSCICQYX", name = "D", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!SSCICQYX", name = "<init>", descriptor = "(Lclient!RPFMUSNN;Ljava/lang/String;I)V")
	public Class3_Sub1_Sub2_Sub3(@OriginalArg(0) Class35 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(31) Class3_Sub1_Sub4 local31 = new Class3_Sub1_Sub4((byte) -58, arg0.method341(arg1 + ".dat", null));
		@Pc(40) Class3_Sub1_Sub4 local40 = new Class3_Sub1_Sub4((byte) -58, arg0.method341("index.dat", null));
		local40.anInt666 = local31.method460();
		this.anInt551 = local40.method460();
		this.anInt552 = local40.method460();
		@Pc(55) int local55 = local40.method458();
		this.anIntArray121 = new int[local55];
		for (@Pc(61) int local61 = 0; local61 < local55 - 1; local61++) {
			this.anIntArray121[local61 + 1] = local40.method462();
		}
		for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
			local40.anInt666 += 2;
			local31.anInt666 += local40.method460() * local40.method460();
			local40.anInt666++;
		}
		this.anInt549 = local40.method458();
		this.anInt550 = local40.method458();
		this.anInt547 = local40.method460();
		this.anInt548 = local40.method460();
		@Pc(126) int local126 = local40.method458();
		@Pc(132) int local132 = this.anInt547 * this.anInt548;
		this.aByteArray16 = new byte[local132];
		@Pc(140) int local140;
		if (local126 == 0) {
			for (local140 = 0; local140 < local132; local140++) {
				this.aByteArray16[local140] = local31.method459();
			}
		} else if (local126 == 1) {
			for (local140 = 0; local140 < this.anInt547; local140++) {
				for (@Pc(162) int local162 = 0; local162 < this.anInt548; local162++) {
					this.aByteArray16[local140 + local162 * this.anInt547] = local31.method459();
				}
			}
		}
	}

	@OriginalMember(owner = "client!SSCICQYX", name = "c", descriptor = "(I)V")
	public void method364() {
		try {
			this.anInt551 /= 2;
			this.anInt552 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt551 * this.anInt552];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt548; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt547; local28++) {
					local20[(local28 + this.anInt549 >> 1) + (local24 + this.anInt550 >> 1) * this.anInt551] = this.aByteArray16[local22++];
				}
			}
			this.aByteArray16 = local20;
			this.anInt547 = this.anInt551;
			this.anInt548 = this.anInt552;
			this.anInt549 = 0;
			this.anInt550 = 0;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("41105, " + -25157 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSCICQYX", name = "a", descriptor = "(Z)V")
	public void method365() {
		try {
			if (this.anInt547 != this.anInt551 || this.anInt548 != this.anInt552) {
				@Pc(19) byte[] local19 = new byte[this.anInt551 * this.anInt552];
				@Pc(31) int local31 = 0;
				for (@Pc(33) int local33 = 0; local33 < this.anInt548; local33++) {
					for (@Pc(37) int local37 = 0; local37 < this.anInt547; local37++) {
						local19[local37 + this.anInt549 + (local33 + this.anInt550) * this.anInt551] = this.aByteArray16[local31++];
					}
				}
				this.aByteArray16 = local19;
				this.anInt547 = this.anInt551;
				this.anInt548 = this.anInt552;
				this.anInt549 = 0;
				this.anInt550 = 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("7673, " + false + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSCICQYX", name = "a", descriptor = "(B)V")
	public void method366(@OriginalArg(0) byte arg0) {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt547 * this.anInt548];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt548; local12++) {
				for (@Pc(19) int local19 = this.anInt547 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray16[local19 + local12 * this.anInt547];
				}
			}
			this.aByteArray16 = local8;
			this.anInt549 = this.anInt551 - this.anInt547 - this.anInt549;
			if (arg0 != 1) {
				this.aBoolean127 = !this.aBoolean127;
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("52844, " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSCICQYX", name = "b", descriptor = "(Z)V")
	public void method367() {
		try {
			@Pc(11) byte[] local11 = new byte[this.anInt547 * this.anInt548];
			@Pc(13) int local13 = 0;
			for (@Pc(18) int local18 = this.anInt548 - 1; local18 >= 0; local18--) {
				for (@Pc(22) int local22 = 0; local22 < this.anInt547; local22++) {
					local11[local13++] = this.aByteArray16[local22 + local18 * this.anInt547];
				}
			}
			this.aByteArray16 = local11;
			this.anInt550 = this.anInt552 - this.anInt548 - this.anInt550;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("99904, " + false + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSCICQYX", name = "a", descriptor = "(IIII)V")
	public void method368(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray121.length; local3++) {
				@Pc(14) int local14 = this.anIntArray121[local3] >> 16 & 0xFF;
				local14 += arg2;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray121[local3] >> 8 & 0xFF;
				local38 += arg1;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray121[local3] & 0xFF;
				local60 += arg0;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray121[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("40273, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSCICQYX", name = "a", descriptor = "(ZII)V")
	public void method369(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt549;
			arg1 += this.anInt550;
			@Pc(15) int local15 = arg0 + arg1 * Class3_Sub1_Sub2.anInt758;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt548;
			@Pc(23) int local23 = this.anInt547;
			@Pc(27) int local27 = Class3_Sub1_Sub2.anInt758 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class3_Sub1_Sub2.anInt760) {
				local36 = Class3_Sub1_Sub2.anInt760 - arg1;
				local20 -= local36;
				arg1 = Class3_Sub1_Sub2.anInt760;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class3_Sub1_Sub2.anInt758;
			}
			if (arg1 + local20 > Class3_Sub1_Sub2.anInt761) {
				local20 -= arg1 + local20 - Class3_Sub1_Sub2.anInt761;
			}
			if (arg0 < Class3_Sub1_Sub2.anInt762) {
				local36 = Class3_Sub1_Sub2.anInt762 - arg0;
				local23 -= local36;
				arg0 = Class3_Sub1_Sub2.anInt762;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class3_Sub1_Sub2.anInt763) {
				local36 = arg0 + local23 - Class3_Sub1_Sub2.anInt763;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method370(local15, local23, this.aByteArray16, local29, this.anIntArray121, local27, local17, Class3_Sub1_Sub2.anIntArray181, local20);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("20125, " + false + ", " + arg0 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSCICQYX", name = "a", descriptor = "(II[BI[III[IIB)V")
	private void method370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8) {
		try {
			@Pc(6) int local6 = -(arg1 >> 2);
			@Pc(11) int local11 = -(arg1 & 0x3);
			for (@Pc(24) int local24 = -arg8; local24 < 0; local24++) {
				for (@Pc(28) int local28 = local6; local28 < 0; local28++) {
					@Pc(35) byte local35 = arg2[arg6++];
					if (local35 == 0) {
						arg0++;
					} else {
						arg7[arg0++] = arg4[local35 & 0xFF];
					}
					local35 = arg2[arg6++];
					if (local35 == 0) {
						arg0++;
					} else {
						arg7[arg0++] = arg4[local35 & 0xFF];
					}
					local35 = arg2[arg6++];
					if (local35 == 0) {
						arg0++;
					} else {
						arg7[arg0++] = arg4[local35 & 0xFF];
					}
					local35 = arg2[arg6++];
					if (local35 == 0) {
						arg0++;
					} else {
						arg7[arg0++] = arg4[local35 & 0xFF];
					}
				}
				for (@Pc(111) int local111 = local11; local111 < 0; local111++) {
					@Pc(118) byte local118 = arg2[arg6++];
					if (local118 == 0) {
						arg0++;
					} else {
						arg7[arg0++] = arg4[local118 & 0xFF];
					}
				}
				arg0 += arg5;
				arg6 += arg3;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("51041, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + -118 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VCTXURSE")
public final class Class8_Sub1_Sub2_Sub3 extends Class8_Sub1_Sub2 {

	@OriginalMember(owner = "client!VCTXURSE", name = "x", descriptor = "Z")
	private boolean aBoolean161 = false;

	@OriginalMember(owner = "client!VCTXURSE", name = "y", descriptor = "I")
	private int anInt663 = -255;

	@OriginalMember(owner = "client!VCTXURSE", name = "z", descriptor = "I")
	private int anInt664 = -822;

	@OriginalMember(owner = "client!VCTXURSE", name = "A", descriptor = "B")
	private byte aByte18 = 7;

	@OriginalMember(owner = "client!VCTXURSE", name = "B", descriptor = "I")
	private int anInt665 = 179;

	@OriginalMember(owner = "client!VCTXURSE", name = "C", descriptor = "Z")
	private boolean aBoolean162 = false;

	@OriginalMember(owner = "client!VCTXURSE", name = "J", descriptor = "I")
	public int anInt670;

	@OriginalMember(owner = "client!VCTXURSE", name = "K", descriptor = "I")
	private int anInt671;

	@OriginalMember(owner = "client!VCTXURSE", name = "E", descriptor = "[I")
	public int[] anIntArray178;

	@OriginalMember(owner = "client!VCTXURSE", name = "H", descriptor = "I")
	public int anInt668;

	@OriginalMember(owner = "client!VCTXURSE", name = "I", descriptor = "I")
	public int anInt669;

	@OriginalMember(owner = "client!VCTXURSE", name = "F", descriptor = "I")
	public int anInt666;

	@OriginalMember(owner = "client!VCTXURSE", name = "G", descriptor = "I")
	public int anInt667;

	@OriginalMember(owner = "client!VCTXURSE", name = "D", descriptor = "[B")
	public byte[] aByteArray15;

	@OriginalMember(owner = "client!VCTXURSE", name = "<init>", descriptor = "(Lclient!SXKKBWPU;Ljava/lang/String;I)V")
	public Class8_Sub1_Sub2_Sub3(@OriginalArg(0) Class35 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(37) Class8_Sub1_Sub3 local37 = new Class8_Sub1_Sub3(arg0.method364(arg1 + ".dat", null), -631);
		@Pc(46) Class8_Sub1_Sub3 local46 = new Class8_Sub1_Sub3(arg0.method364("index.dat", null), -631);
		local46.anInt620 = local37.method408();
		this.anInt670 = local46.method408();
		this.anInt671 = local46.method408();
		@Pc(61) int local61 = local46.method406();
		this.anIntArray178 = new int[local61];
		for (@Pc(67) int local67 = 0; local67 < local61 - 1; local67++) {
			this.anIntArray178[local67 + 1] = local46.method410();
		}
		for (@Pc(85) int local85 = 0; local85 < arg2; local85++) {
			local46.anInt620 += 2;
			local37.anInt620 += local46.method408() * local46.method408();
			local46.anInt620++;
		}
		this.anInt668 = local46.method406();
		this.anInt669 = local46.method406();
		this.anInt666 = local46.method408();
		this.anInt667 = local46.method408();
		@Pc(132) int local132 = local46.method406();
		@Pc(138) int local138 = this.anInt666 * this.anInt667;
		this.aByteArray15 = new byte[local138];
		@Pc(146) int local146;
		if (local132 == 0) {
			for (local146 = 0; local146 < local138; local146++) {
				this.aByteArray15[local146] = local37.method407();
			}
		} else if (local132 == 1) {
			for (local146 = 0; local146 < this.anInt666; local146++) {
				for (@Pc(168) int local168 = 0; local168 < this.anInt667; local168++) {
					this.aByteArray15[local146 + local168 * this.anInt666] = local37.method407();
				}
			}
		}
	}

	@OriginalMember(owner = "client!VCTXURSE", name = "a", descriptor = "(Z)V")
	public void method489() {
		try {
			this.anInt670 /= 2;
			this.anInt671 /= 2;
			@Pc(30) byte[] local30 = new byte[this.anInt670 * this.anInt671];
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = 0; local34 < this.anInt667; local34++) {
				for (@Pc(38) int local38 = 0; local38 < this.anInt666; local38++) {
					local30[(local38 + this.anInt668 >> 1) + (local34 + this.anInt669 >> 1) * this.anInt670] = this.aByteArray15[local32++];
				}
			}
			this.aByteArray15 = local30;
			this.anInt666 = this.anInt670;
			this.anInt667 = this.anInt671;
			this.anInt668 = 0;
			this.anInt669 = 0;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("27311, " + false + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCTXURSE", name = "c", descriptor = "(I)V")
	public void method490(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt666 != this.anInt670 || this.anInt667 != this.anInt671) {
				@Pc(19) byte[] local19 = new byte[this.anInt670 * this.anInt671];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt667; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt666; local27++) {
						local19[local27 + this.anInt668 + (local23 + this.anInt669) * this.anInt670] = this.aByteArray15[local21++];
					}
				}
				this.aByteArray15 = local19;
				this.anInt666 = this.anInt670;
				@Pc(69) boolean local69 = false;
				this.anInt667 = this.anInt671;
				this.anInt668 = 0;
				this.anInt669 = 0;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("94992, " + arg0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCTXURSE", name = "d", descriptor = "(I)V")
	public void method491(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				this.anInt664 = 448;
			}
			@Pc(13) byte[] local13 = new byte[this.anInt666 * this.anInt667];
			@Pc(15) int local15 = 0;
			for (@Pc(17) int local17 = 0; local17 < this.anInt667; local17++) {
				for (@Pc(24) int local24 = this.anInt666 - 1; local24 >= 0; local24--) {
					local13[local15++] = this.aByteArray15[local24 + local17 * this.anInt666];
				}
			}
			this.aByteArray15 = local13;
			this.anInt668 = this.anInt670 - this.anInt666 - this.anInt668;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("61823, " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCTXURSE", name = "e", descriptor = "(I)V")
	public void method492() {
		try {
			@Pc(12) byte[] local12 = new byte[this.anInt666 * this.anInt667];
			@Pc(14) int local14 = 0;
			for (@Pc(19) int local19 = this.anInt667 - 1; local19 >= 0; local19--) {
				for (@Pc(23) int local23 = 0; local23 < this.anInt666; local23++) {
					local12[local14++] = this.aByteArray15[local23 + local19 * this.anInt666];
				}
			}
			this.aByteArray15 = local12;
			this.anInt669 = this.anInt671 - this.anInt667 - this.anInt669;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("88389, " + 42862 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCTXURSE", name = "a", descriptor = "(IIII)V")
	public void method493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray178.length; local3++) {
				@Pc(14) int local14 = this.anIntArray178[local3] >> 16 & 0xFF;
				local14 += arg2;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray178[local3] >> 8 & 0xFF;
				local38 += arg0;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray178[local3] & 0xFF;
				local60 += arg1;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray178[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("70609, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 3 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCTXURSE", name = "a", descriptor = "(III)V")
	public void method494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt668;
			arg1 += this.anInt669;
			@Pc(15) int local15 = arg0 + arg1 * Class8_Sub1_Sub2.anInt786;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt667;
			@Pc(23) int local23 = this.anInt666;
			@Pc(27) int local27 = Class8_Sub1_Sub2.anInt786 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class8_Sub1_Sub2.anInt788) {
				local36 = Class8_Sub1_Sub2.anInt788 - arg1;
				local20 -= local36;
				arg1 = Class8_Sub1_Sub2.anInt788;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class8_Sub1_Sub2.anInt786;
			}
			if (arg1 + local20 > Class8_Sub1_Sub2.anInt789) {
				local20 -= arg1 + local20 - Class8_Sub1_Sub2.anInt789;
			}
			if (arg0 < Class8_Sub1_Sub2.anInt790) {
				local36 = Class8_Sub1_Sub2.anInt790 - arg0;
				local23 -= local36;
				arg0 = Class8_Sub1_Sub2.anInt790;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class8_Sub1_Sub2.anInt791) {
				local36 = arg0 + local23 - Class8_Sub1_Sub2.anInt791;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method495(local15, this.anInt665, local23, Class8_Sub1_Sub2.anIntArray204, this.anIntArray178, this.aByteArray15, local29, local27, local20, local17);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("74836, " + arg0 + ", " + arg1 + ", " + 714 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCTXURSE", name = "a", descriptor = "(III[I[I[BIIII)V")
	private void method495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(6) int local6 = -(arg2 >> 2);
			@Pc(11) int local11 = -(arg2 & 0x3);
			@Pc(15) int local15 = 33 / arg1;
			for (@Pc(18) int local18 = -arg8; local18 < 0; local18++) {
				for (@Pc(22) int local22 = local6; local22 < 0; local22++) {
					@Pc(29) byte local29 = arg5[arg9++];
					if (local29 == 0) {
						arg0++;
					} else {
						arg3[arg0++] = arg4[local29 & 0xFF];
					}
					local29 = arg5[arg9++];
					if (local29 == 0) {
						arg0++;
					} else {
						arg3[arg0++] = arg4[local29 & 0xFF];
					}
					local29 = arg5[arg9++];
					if (local29 == 0) {
						arg0++;
					} else {
						arg3[arg0++] = arg4[local29 & 0xFF];
					}
					local29 = arg5[arg9++];
					if (local29 == 0) {
						arg0++;
					} else {
						arg3[arg0++] = arg4[local29 & 0xFF];
					}
				}
				for (@Pc(105) int local105 = local11; local105 < 0; local105++) {
					@Pc(112) byte local112 = arg5[arg9++];
					if (local112 == 0) {
						arg0++;
					} else {
						arg3[arg0++] = arg4[local112 & 0xFF];
					}
				}
				arg0 += arg7;
				arg9 += arg6;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("92259, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
	private int anInt717;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	private int anInt715 = 1;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
	private int anInt716 = 8;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "Z")
	private boolean aBoolean191 = true;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "Z")
	private boolean aBoolean192 = false;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
	public int anInt722;

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
	private int anInt723;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
	public int anInt720;

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
	public int anInt721;

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
	public int anInt718;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
	public int anInt719;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!yb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class48 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class1_Sub1_Sub3 local34 = new Class1_Sub1_Sub3(16, arg0.method678(arg1 + ".dat", null));
		@Pc(43) Class1_Sub1_Sub3 local43 = new Class1_Sub1_Sub3(16, arg0.method678("index.dat", null));
		local43.anInt776 = local34.method500();
		this.anInt722 = local43.method500();
		this.anInt723 = local43.method500();
		@Pc(58) int local58 = local43.method498();
		this.anIntArray212 = new int[local58];
		for (@Pc(64) int local64 = 0; local64 < local58 - 1; local64++) {
			this.anIntArray212[local64 + 1] = local43.method502();
		}
		for (@Pc(82) int local82 = 0; local82 < arg2; local82++) {
			local43.anInt776 += 2;
			local34.anInt776 += local43.method500() * local43.method500();
			local43.anInt776++;
		}
		this.anInt720 = local43.method498();
		this.anInt721 = local43.method498();
		this.anInt718 = local43.method500();
		this.anInt719 = local43.method500();
		@Pc(129) int local129 = local43.method498();
		@Pc(135) int local135 = this.anInt718 * this.anInt719;
		this.aByteArray7 = new byte[local135];
		@Pc(143) int local143;
		if (local129 == 0) {
			for (local143 = 0; local143 < local135; local143++) {
				this.aByteArray7[local143] = local34.method499();
			}
		} else if (local129 == 1) {
			for (local143 = 0; local143 < this.anInt718; local143++) {
				for (@Pc(165) int local165 = 0; local165 < this.anInt719; local165++) {
					this.aByteArray7[local143 + local165 * this.anInt718] = local34.method499();
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public void method440() {
		try {
			this.anInt722 /= 2;
			this.anInt723 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt722 * this.anInt723];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt719; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt718; local28++) {
					local20[(local28 + this.anInt720 >> 1) + (local24 + this.anInt721 >> 1) * this.anInt722] = this.aByteArray7[local22++];
				}
			}
			this.aByteArray7 = local20;
			this.anInt718 = this.anInt722;
			this.anInt719 = this.anInt723;
			this.anInt720 = 0;
			this.anInt721 = 0;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("88882, " + 0 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public void method441() {
		try {
			if (this.anInt718 != this.anInt722 || this.anInt719 != this.anInt723) {
				@Pc(19) byte[] local19 = new byte[this.anInt722 * this.anInt723];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt719; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt718; local27++) {
						local19[local27 + this.anInt720 + (local23 + this.anInt721) * this.anInt722] = this.aByteArray7[local21++];
					}
				}
				this.aByteArray7 = local19;
				this.anInt718 = this.anInt722;
				this.anInt719 = this.anInt723;
				this.anInt720 = 0;
				this.anInt721 = 0;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("88744, " + 33684 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public void method442() {
		try {
			@Pc(17) byte[] local17 = new byte[this.anInt718 * this.anInt719];
			@Pc(19) int local19 = 0;
			for (@Pc(21) int local21 = 0; local21 < this.anInt719; local21++) {
				for (@Pc(28) int local28 = this.anInt718 - 1; local28 >= 0; local28--) {
					local17[local19++] = this.aByteArray7[local28 + local21 * this.anInt718];
				}
			}
			this.aByteArray7 = local17;
			this.anInt720 = this.anInt722 - this.anInt718 - this.anInt720;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("27616, " + 0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public void method443(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt718 * this.anInt719];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt719 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt718; local19++) {
					local8[local10++] = this.aByteArray7[local19 + local15 * this.anInt718];
				}
			}
			this.aByteArray7 = local8;
			this.anInt721 = this.anInt723 - this.anInt719 - this.anInt721;
			@Pc(59) boolean local59 = false;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("71368, " + arg0 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V")
	public void method444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray212.length; local6++) {
				@Pc(17) int local17 = this.anIntArray212[local6] >> 16 & 0xFF;
				local17 += arg0;
				if (local17 < 0) {
					local17 = 0;
				} else if (local17 > 255) {
					local17 = 255;
				}
				@Pc(41) int local41 = this.anIntArray212[local6] >> 8 & 0xFF;
				local41 += arg1;
				if (local41 < 0) {
					local41 = 0;
				} else if (local41 > 255) {
					local41 = 255;
				}
				@Pc(63) int local63 = this.anIntArray212[local6] & 0xFF;
				local63 += arg2;
				if (local63 < 0) {
					local63 = 0;
				} else if (local63 > 255) {
					local63 = 255;
				}
				this.anIntArray212[local6] = (local17 << 16) + (local41 << 8) + local63;
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("8548, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 320 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
	public void method445(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt720;
			arg1 += this.anInt721;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt740;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt719;
			@Pc(23) int local23 = this.anInt718;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt740 - local23;
			@Pc(29) int local29 = 0;
			@Pc(40) int local40;
			if (arg1 < Class1_Sub1_Sub2.anInt742) {
				local40 = Class1_Sub1_Sub2.anInt742 - arg1;
				local20 -= local40;
				arg1 = Class1_Sub1_Sub2.anInt742;
				local17 = local40 * local23 + 0;
				local15 += local40 * Class1_Sub1_Sub2.anInt740;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt743) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt743;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt744) {
				local40 = Class1_Sub1_Sub2.anInt744 - arg0;
				local23 -= local40;
				arg0 = Class1_Sub1_Sub2.anInt744;
				local17 += local40;
				local15 += local40;
				local29 = local40 + 0;
				local27 += local40;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt745) {
				local40 = arg0 + local23 - Class1_Sub1_Sub2.anInt745;
				local23 -= local40;
				local29 += local40;
				local27 += local40;
			}
			if (local23 > 0 && local20 > 0) {
				this.method446(local15, local23, local27, this.anIntArray212, this.aByteArray7, Class1_Sub1_Sub2.anIntArray213, local17, local29, local20);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("40937, " + arg0 + ", " + -48420 + ", " + arg1 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[I[B[IIIII)V")
	private void method446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg1 >> 2);
			@Pc(11) int local11 = -(arg1 & 0x3);
			for (@Pc(21) int local21 = -arg8; local21 < 0; local21++) {
				for (@Pc(25) int local25 = local6; local25 < 0; local25++) {
					@Pc(32) byte local32 = arg4[arg6++];
					if (local32 == 0) {
						arg0++;
					} else {
						arg5[arg0++] = arg3[local32 & 0xFF];
					}
					local32 = arg4[arg6++];
					if (local32 == 0) {
						arg0++;
					} else {
						arg5[arg0++] = arg3[local32 & 0xFF];
					}
					local32 = arg4[arg6++];
					if (local32 == 0) {
						arg0++;
					} else {
						arg5[arg0++] = arg3[local32 & 0xFF];
					}
					local32 = arg4[arg6++];
					if (local32 == 0) {
						arg0++;
					} else {
						arg5[arg0++] = arg3[local32 & 0xFF];
					}
				}
				for (@Pc(108) int local108 = local11; local108 < 0; local108++) {
					@Pc(115) byte local115 = arg4[arg6++];
					if (local115 == 0) {
						arg0++;
					} else {
						arg5[arg0++] = arg3[local115 & 0xFF];
					}
				}
				arg0 += arg2;
				arg6 += arg7;
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("49170, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + -126 + ", " + arg7 + ", " + arg8 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}
}

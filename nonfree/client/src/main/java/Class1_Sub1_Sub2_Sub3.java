import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	private int anInt718;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
	private int anInt719;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "Z")
	private boolean aBoolean148 = true;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
	private int anInt720 = 945;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
	private int anInt721 = -66;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
	private int anInt722 = 1;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
	private int anInt723 = -902;

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
	public int anInt728;

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
	private int anInt729;

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "[I")
	public int[] anIntArray200;

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
	public int anInt726;

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
	public int anInt727;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
	public int anInt724;

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
	public int anInt725;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!yb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class45 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class1_Sub1_Sub3 local34 = new Class1_Sub1_Sub3(arg0.method644(arg1 + ".dat", null), true);
		@Pc(43) Class1_Sub1_Sub3 local43 = new Class1_Sub1_Sub3(arg0.method644("index.dat", null), true);
		local43.anInt777 = local34.method470();
		this.anInt728 = local43.method470();
		this.anInt729 = local43.method470();
		@Pc(58) int local58 = local43.method468();
		this.anIntArray200 = new int[local58];
		for (@Pc(64) int local64 = 0; local64 < local58 - 1; local64++) {
			this.anIntArray200[local64 + 1] = local43.method472();
		}
		for (@Pc(88) int local88 = 0; local88 < arg2; local88++) {
			local43.anInt777 += 2;
			local34.anInt777 += local43.method470() * local43.method470();
			local43.anInt777++;
		}
		this.anInt726 = local43.method468();
		this.anInt727 = local43.method468();
		this.anInt724 = local43.method470();
		this.anInt725 = local43.method470();
		@Pc(135) int local135 = local43.method468();
		@Pc(141) int local141 = this.anInt724 * this.anInt725;
		this.aByteArray7 = new byte[local141];
		@Pc(149) int local149;
		if (local135 == 0) {
			for (local149 = 0; local149 < local141; local149++) {
				this.aByteArray7[local149] = local34.method469();
			}
		} else if (local135 == 1) {
			for (local149 = 0; local149 < this.anInt724; local149++) {
				for (@Pc(171) int local171 = 0; local171 < this.anInt725; local171++) {
					this.aByteArray7[local149 + local171 * this.anInt724] = local34.method469();
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public void method418() {
		try {
			this.anInt728 /= 2;
			this.anInt729 /= 2;
			@Pc(29) byte[] local29 = new byte[this.anInt728 * this.anInt729];
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < this.anInt725; local33++) {
				for (@Pc(37) int local37 = 0; local37 < this.anInt724; local37++) {
					local29[(local37 + this.anInt726 >> 1) + (local33 + this.anInt727 >> 1) * this.anInt728] = this.aByteArray7[local31++];
				}
			}
			this.aByteArray7 = local29;
			this.anInt724 = this.anInt728;
			this.anInt725 = this.anInt729;
			this.anInt726 = 0;
			this.anInt727 = 0;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("30699, " + -382 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
	public void method419() {
		try {
			if (this.anInt724 != this.anInt728 || this.anInt725 != this.anInt729) {
				@Pc(19) byte[] local19 = new byte[this.anInt728 * this.anInt729];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt725; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt724; local27++) {
						local19[local27 + this.anInt726 + (local23 + this.anInt727) * this.anInt728] = this.aByteArray7[local21++];
					}
				}
				this.aByteArray7 = local19;
				this.anInt724 = this.anInt728;
				this.anInt725 = this.anInt729;
				this.anInt726 = 0;
				this.anInt727 = 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("50979, " + true + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
	public void method420() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt724 * this.anInt725];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt725; local12++) {
				for (@Pc(19) int local19 = this.anInt724 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray7[local19 + local12 * this.anInt724];
				}
			}
			this.aByteArray7 = local8;
			this.anInt726 = this.anInt728 - this.anInt724 - this.anInt726;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("51219, " + -960 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V")
	public void method421() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt724 * this.anInt725];
			@Pc(16) int local16 = 0;
			for (@Pc(21) int local21 = this.anInt725 - 1; local21 >= 0; local21--) {
				for (@Pc(25) int local25 = 0; local25 < this.anInt724; local25++) {
					local8[local16++] = this.aByteArray7[local25 + local21 * this.anInt724];
				}
			}
			this.aByteArray7 = local8;
			this.anInt727 = this.anInt729 - this.anInt725 - this.anInt727;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("82198, " + -21472 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBII)V")
	public void method422(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray200.length; local13++) {
				@Pc(24) int local24 = this.anIntArray200[local13] >> 16 & 0xFF;
				local24 += arg0;
				if (local24 < 0) {
					local24 = 0;
				} else if (local24 > 255) {
					local24 = 255;
				}
				@Pc(48) int local48 = this.anIntArray200[local13] >> 8 & 0xFF;
				local48 += arg2;
				if (local48 < 0) {
					local48 = 0;
				} else if (local48 > 255) {
					local48 = 255;
				}
				@Pc(70) int local70 = this.anIntArray200[local13] & 0xFF;
				local70 += arg3;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 > 255) {
					local70 = 255;
				}
				this.anIntArray200[local13] = (local24 << 16) + (local48 << 8) + local70;
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("49629, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
	public void method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg2 += this.anInt726;
			@Pc(8) boolean local8 = false;
			arg0 += this.anInt727;
			@Pc(19) int local19 = arg2 + arg0 * Class1_Sub1_Sub2.anInt742;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt725;
			@Pc(27) int local27 = this.anInt724;
			@Pc(31) int local31 = Class1_Sub1_Sub2.anInt742 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg0 < Class1_Sub1_Sub2.anInt744) {
				local40 = Class1_Sub1_Sub2.anInt744 - arg0;
				local24 -= local40;
				arg0 = Class1_Sub1_Sub2.anInt744;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class1_Sub1_Sub2.anInt742;
			}
			if (arg0 + local24 > Class1_Sub1_Sub2.anInt745) {
				local24 -= arg0 + local24 - Class1_Sub1_Sub2.anInt745;
			}
			if (arg2 < Class1_Sub1_Sub2.anInt746) {
				local40 = Class1_Sub1_Sub2.anInt746 - arg2;
				local27 -= local40;
				arg2 = Class1_Sub1_Sub2.anInt746;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg2 + local27 > Class1_Sub1_Sub2.anInt747) {
				local40 = arg2 + local27 - Class1_Sub1_Sub2.anInt747;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method424(local27, this.aByteArray7, local31, local33, Class1_Sub1_Sub2.anIntArray205, local19, local24, this.anIntArray200, local21);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("79344, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BIII[III[II)V")
	private void method424(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg0 >> 2);
			@Pc(11) int local11 = -(arg0 & 0x3);
			for (@Pc(14) int local14 = -arg6; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					@Pc(25) byte local25 = arg1[arg8++];
					if (local25 == 0) {
						arg5++;
					} else {
						arg4[arg5++] = arg7[local25 & 0xFF];
					}
					local25 = arg1[arg8++];
					if (local25 == 0) {
						arg5++;
					} else {
						arg4[arg5++] = arg7[local25 & 0xFF];
					}
					local25 = arg1[arg8++];
					if (local25 == 0) {
						arg5++;
					} else {
						arg4[arg5++] = arg7[local25 & 0xFF];
					}
					local25 = arg1[arg8++];
					if (local25 == 0) {
						arg5++;
					} else {
						arg4[arg5++] = arg7[local25 & 0xFF];
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					@Pc(108) byte local108 = arg1[arg8++];
					if (local108 == 0) {
						arg5++;
					} else {
						arg4[arg5++] = arg7[local108 & 0xFF];
					}
				}
				arg5 += arg2;
				arg8 += arg3;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("66427, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}

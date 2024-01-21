import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jb")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
	private static int anInt686 = 1000;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "Z")
	private boolean aBoolean179 = true;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
	private int anInt687 = -567;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	public int anInt692;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
	private int anInt693;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	public int anInt690;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public int anInt691;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
	public int anInt688;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
	public int anInt689;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(25) Class1_Sub1_Sub3 local25 = new Class1_Sub1_Sub3(anInt686, arg0.method666(arg1 + ".dat", null));
		@Pc(34) Class1_Sub1_Sub3 local34 = new Class1_Sub1_Sub3(anInt686, arg0.method666("index.dat", null));
		local34.anInt751 = local25.method482();
		this.anInt692 = local34.method482();
		this.anInt693 = local34.method482();
		@Pc(49) int local49 = local34.method480();
		this.anIntArray212 = new int[local49];
		for (@Pc(55) int local55 = 0; local55 < local49 - 1; local55++) {
			this.anIntArray212[local55 + 1] = local34.method484();
		}
		for (@Pc(73) int local73 = 0; local73 < arg2; local73++) {
			local34.anInt751 += 2;
			local25.anInt751 += local34.method482() * local34.method482();
			local34.anInt751++;
		}
		this.anInt690 = local34.method480();
		this.anInt691 = local34.method480();
		this.anInt688 = local34.method482();
		this.anInt689 = local34.method482();
		@Pc(120) int local120 = local34.method480();
		@Pc(126) int local126 = this.anInt688 * this.anInt689;
		this.aByteArray7 = new byte[local126];
		@Pc(134) int local134;
		if (local120 == 0) {
			for (local134 = 0; local134 < local126; local134++) {
				this.aByteArray7[local134] = local25.method481();
			}
		} else if (local120 == 1) {
			for (local134 = 0; local134 < this.anInt688; local134++) {
				for (@Pc(156) int local156 = 0; local156 < this.anInt689; local156++) {
					this.aByteArray7[local134 + local156 * this.anInt688] = local25.method481();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public void method413() {
		try {
			this.anInt692 /= 2;
			this.anInt693 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt692 * this.anInt693];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt689; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt688; local28++) {
					local20[(local28 + this.anInt690 >> 1) + (local24 + this.anInt691 >> 1) * this.anInt692] = this.aByteArray7[local22++];
				}
			}
			this.aByteArray7 = local20;
			this.anInt688 = this.anInt692;
			this.anInt689 = this.anInt693;
			this.anInt690 = 0;
			this.anInt691 = 0;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("63586, " + 0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
	public void method414() {
		try {
			if (this.anInt688 != this.anInt692 || this.anInt689 != this.anInt693) {
				@Pc(19) byte[] local19 = new byte[this.anInt692 * this.anInt693];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt689; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt688; local27++) {
						local19[local27 + this.anInt690 + (local23 + this.anInt691) * this.anInt692] = this.aByteArray7[local21++];
					}
				}
				this.aByteArray7 = local19;
				this.anInt688 = this.anInt692;
				this.anInt689 = this.anInt693;
				this.anInt690 = 0;
				this.anInt691 = 0;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("83078, " + -49794 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
	public void method415(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt688 * this.anInt689];
			@Pc(10) int local10 = 0;
			@Pc(14) boolean local14 = false;
			for (@Pc(16) int local16 = 0; local16 < this.anInt689; local16++) {
				for (@Pc(23) int local23 = this.anInt688 - 1; local23 >= 0; local23--) {
					local8[local10++] = this.aByteArray7[local23 + local16 * this.anInt688];
				}
			}
			this.aByteArray7 = local8;
			this.anInt690 = this.anInt692 - this.anInt688 - this.anInt690;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("75920, " + arg0 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
	public void method416() {
		try {
			@Pc(17) byte[] local17 = new byte[this.anInt688 * this.anInt689];
			@Pc(19) int local19 = 0;
			for (@Pc(24) int local24 = this.anInt689 - 1; local24 >= 0; local24--) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt688; local28++) {
					local17[local19++] = this.aByteArray7[local28 + local24 * this.anInt688];
				}
			}
			this.aByteArray7 = local17;
			this.anInt691 = this.anInt693 - this.anInt689 - this.anInt691;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("82892, " + true + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	public void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray212.length; local3++) {
				@Pc(14) int local14 = this.anIntArray212[local3] >> 16 & 0xFF;
				local14 += arg1;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray212[local3] >> 8 & 0xFF;
				local38 += arg0;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray212[local3] & 0xFF;
				local60 += arg2;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray212[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("34952, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZ)V")
	public void method418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt690;
			arg1 += this.anInt691;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt707;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt689;
			@Pc(23) int local23 = this.anInt688;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt707 - local23;
			@Pc(29) int local29 = 0;
			@Pc(39) int local39;
			if (arg1 < Class1_Sub1_Sub2.anInt709) {
				local39 = Class1_Sub1_Sub2.anInt709 - arg1;
				local20 -= local39;
				arg1 = Class1_Sub1_Sub2.anInt709;
				local17 = local39 * local23 + 0;
				local15 += local39 * Class1_Sub1_Sub2.anInt707;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt710) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt710;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt711) {
				local39 = Class1_Sub1_Sub2.anInt711 - arg0;
				local23 -= local39;
				arg0 = Class1_Sub1_Sub2.anInt711;
				local17 += local39;
				local15 += local39;
				local29 = local39 + 0;
				local27 += local39;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt712) {
				local39 = arg0 + local23 - Class1_Sub1_Sub2.anInt712;
				local23 -= local39;
				local29 += local39;
				local27 += local39;
			}
			if (local23 > 0 && local20 > 0) {
				this.method419(local23, Class1_Sub1_Sub2.anIntArray213, local15, local27, this.aByteArray7, local20, local29, local17, this.anIntArray212);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("54769, " + arg0 + ", " + arg1 + ", " + false + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[III[BIIII[I)V")
	private void method419(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		try {
			@Pc(6) int local6 = -(arg0 >> 2);
			@Pc(11) int local11 = -(arg0 & 0x3);
			for (@Pc(25) int local25 = -arg5; local25 < 0; local25++) {
				for (@Pc(29) int local29 = local6; local29 < 0; local29++) {
					@Pc(36) byte local36 = arg4[arg7++];
					if (local36 == 0) {
						arg2++;
					} else {
						arg1[arg2++] = arg8[local36 & 0xFF];
					}
					local36 = arg4[arg7++];
					if (local36 == 0) {
						arg2++;
					} else {
						arg1[arg2++] = arg8[local36 & 0xFF];
					}
					local36 = arg4[arg7++];
					if (local36 == 0) {
						arg2++;
					} else {
						arg1[arg2++] = arg8[local36 & 0xFF];
					}
					local36 = arg4[arg7++];
					if (local36 == 0) {
						arg2++;
					} else {
						arg1[arg2++] = arg8[local36 & 0xFF];
					}
				}
				for (@Pc(112) int local112 = local11; local112 < 0; local112++) {
					@Pc(119) byte local119 = arg4[arg7++];
					if (local119 == 0) {
						arg2++;
					} else {
						arg1[arg2++] = arg8[local119 & 0xFF];
					}
				}
				arg2 += arg3;
				arg7 += arg6;
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("64183, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 10230 + ", " + arg7 + ", " + arg8 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}
}

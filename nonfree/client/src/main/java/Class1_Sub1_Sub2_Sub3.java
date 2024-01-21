import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "Z")
	private boolean aBoolean172 = true;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
	private int anInt708 = 5;

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
	public int anInt713;

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
	private int anInt714;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
	public int anInt711;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
	public int anInt712;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
	public int anInt709;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
	public int anInt710;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!yb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class48 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(25) Class1_Sub1_Sub3 local25 = new Class1_Sub1_Sub3(arg0.method678(arg1 + ".dat", null), 337);
		@Pc(34) Class1_Sub1_Sub3 local34 = new Class1_Sub1_Sub3(arg0.method678("index.dat", null), 337);
		local34.anInt768 = local25.method500();
		this.anInt713 = local34.method500();
		this.anInt714 = local34.method500();
		@Pc(49) int local49 = local34.method498();
		this.anIntArray212 = new int[local49];
		for (@Pc(55) int local55 = 0; local55 < local49 - 1; local55++) {
			this.anIntArray212[local55 + 1] = local34.method502();
		}
		for (@Pc(73) int local73 = 0; local73 < arg2; local73++) {
			local34.anInt768 += 2;
			local25.anInt768 += local34.method500() * local34.method500();
			local34.anInt768++;
		}
		this.anInt711 = local34.method498();
		this.anInt712 = local34.method498();
		this.anInt709 = local34.method500();
		this.anInt710 = local34.method500();
		@Pc(120) int local120 = local34.method498();
		@Pc(126) int local126 = this.anInt709 * this.anInt710;
		this.aByteArray7 = new byte[local126];
		@Pc(134) int local134;
		if (local120 == 0) {
			for (local134 = 0; local134 < local126; local134++) {
				this.aByteArray7[local134] = local25.method499();
			}
		} else if (local120 == 1) {
			for (local134 = 0; local134 < this.anInt709; local134++) {
				for (@Pc(156) int local156 = 0; local156 < this.anInt710; local156++) {
					this.aByteArray7[local134 + local156 * this.anInt709] = local25.method499();
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public void method440() {
		try {
			this.anInt713 /= 2;
			this.anInt714 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt713 * this.anInt714];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt710; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt709; local28++) {
					local20[(local28 + this.anInt711 >> 1) + (local24 + this.anInt712 >> 1) * this.anInt713] = this.aByteArray7[local22++];
				}
			}
			this.aByteArray7 = local20;
			this.anInt709 = this.anInt713;
			this.anInt710 = this.anInt714;
			this.anInt711 = 0;
			this.anInt712 = 0;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("78645, " + 9 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public void method441() {
		try {
			if (this.anInt709 != this.anInt713 || this.anInt710 != this.anInt714) {
				@Pc(19) byte[] local19 = new byte[this.anInt713 * this.anInt714];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt710; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt709; local27++) {
						local19[local27 + this.anInt711 + (local23 + this.anInt712) * this.anInt713] = this.aByteArray7[local21++];
					}
				}
				this.aByteArray7 = local19;
				this.anInt709 = this.anInt713;
				this.anInt710 = this.anInt714;
				this.anInt711 = 0;
				this.anInt712 = 0;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("43374, " + -38199 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
	public void method442() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt709 * this.anInt710];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt710; local12++) {
				for (@Pc(19) int local19 = this.anInt709 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray7[local19 + local12 * this.anInt709];
				}
			}
			this.aByteArray7 = local8;
			this.anInt711 = this.anInt713 - this.anInt709 - this.anInt711;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("9962, " + 3 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V")
	public void method443() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt709 * this.anInt710];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt710 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt709; local19++) {
					local8[local10++] = this.aByteArray7[local19 + local15 * this.anInt709];
				}
			}
			this.aByteArray7 = local8;
			this.anInt712 = this.anInt714 - this.anInt710 - this.anInt712;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("36661, " + 0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V")
	public void method444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray212.length; local3++) {
				@Pc(14) int local14 = this.anIntArray212[local3] >> 16 & 0xFF;
				local14 += arg2;
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
				local60 += arg1;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray212[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("94137, " + 7 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
	public void method445(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt711;
			arg0 += this.anInt712;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub1_Sub2.anInt734;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt710;
			@Pc(23) int local23 = this.anInt709;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt734 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg0 < Class1_Sub1_Sub2.anInt736) {
				local36 = Class1_Sub1_Sub2.anInt736 - arg0;
				local20 -= local36;
				arg0 = Class1_Sub1_Sub2.anInt736;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt734;
			}
			if (arg0 + local20 > Class1_Sub1_Sub2.anInt737) {
				local20 -= arg0 + local20 - Class1_Sub1_Sub2.anInt737;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt738) {
				local36 = Class1_Sub1_Sub2.anInt738 - arg1;
				local23 -= local36;
				arg1 = Class1_Sub1_Sub2.anInt738;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt739) {
				local36 = arg1 + local23 - Class1_Sub1_Sub2.anInt739;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method446(local23, local29, this.anIntArray212, this.aByteArray7, local17, local20, local15, local27, Class1_Sub1_Sub2.anIntArray213);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("69669, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBI[I[BIIII[I)V")
	private void method446(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		try {
			@Pc(6) int local6 = -(arg0 >> 2);
			@Pc(11) int local11 = -(arg0 & 0x3);
			for (@Pc(24) int local24 = -arg5; local24 < 0; local24++) {
				for (@Pc(28) int local28 = local6; local28 < 0; local28++) {
					@Pc(35) byte local35 = arg3[arg4++];
					if (local35 == 0) {
						arg6++;
					} else {
						arg8[arg6++] = arg2[local35 & 0xFF];
					}
					local35 = arg3[arg4++];
					if (local35 == 0) {
						arg6++;
					} else {
						arg8[arg6++] = arg2[local35 & 0xFF];
					}
					local35 = arg3[arg4++];
					if (local35 == 0) {
						arg6++;
					} else {
						arg8[arg6++] = arg2[local35 & 0xFF];
					}
					local35 = arg3[arg4++];
					if (local35 == 0) {
						arg6++;
					} else {
						arg8[arg6++] = arg2[local35 & 0xFF];
					}
				}
				for (@Pc(111) int local111 = local11; local111 < 0; local111++) {
					@Pc(118) byte local118 = arg3[arg4++];
					if (local118 == 0) {
						arg6++;
					} else {
						arg8[arg6++] = arg2[local118 & 0xFF];
					}
				}
				arg6 += arg7;
				arg4 += arg1;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("27550, " + arg0 + ", " + -98 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}

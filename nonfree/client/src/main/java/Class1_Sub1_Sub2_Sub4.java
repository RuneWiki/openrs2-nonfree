import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LKEIRLLI")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!LKEIRLLI", name = "A", descriptor = "I")
	private static int anInt462;

	@OriginalMember(owner = "client!LKEIRLLI", name = "B", descriptor = "Z")
	private boolean aBoolean126 = true;

	@OriginalMember(owner = "client!LKEIRLLI", name = "C", descriptor = "Z")
	private boolean aBoolean127 = true;

	@OriginalMember(owner = "client!LKEIRLLI", name = "D", descriptor = "I")
	private int anInt463 = -22136;

	@OriginalMember(owner = "client!LKEIRLLI", name = "E", descriptor = "I")
	private int anInt464 = 6;

	@OriginalMember(owner = "client!LKEIRLLI", name = "L", descriptor = "I")
	public int anInt469;

	@OriginalMember(owner = "client!LKEIRLLI", name = "M", descriptor = "I")
	private int anInt470;

	@OriginalMember(owner = "client!LKEIRLLI", name = "G", descriptor = "[I")
	public int[] anIntArray123;

	@OriginalMember(owner = "client!LKEIRLLI", name = "J", descriptor = "I")
	public int anInt467;

	@OriginalMember(owner = "client!LKEIRLLI", name = "K", descriptor = "I")
	public int anInt468;

	@OriginalMember(owner = "client!LKEIRLLI", name = "H", descriptor = "I")
	public int anInt465;

	@OriginalMember(owner = "client!LKEIRLLI", name = "I", descriptor = "I")
	public int anInt466;

	@OriginalMember(owner = "client!LKEIRLLI", name = "F", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!LKEIRLLI", name = "<init>", descriptor = "(Lclient!SPZBTZXL;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) Class35 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(31) Class1_Sub1_Sub3 local31 = new Class1_Sub1_Sub3(arg0.method491(arg1 + ".dat", null), anInt462);
		@Pc(40) Class1_Sub1_Sub3 local40 = new Class1_Sub1_Sub3(arg0.method491("index.dat", null), anInt462);
		local40.anInt443 = local31.method361();
		this.anInt469 = local40.method361();
		this.anInt470 = local40.method361();
		@Pc(55) int local55 = local40.method359();
		this.anIntArray123 = new int[local55];
		for (@Pc(61) int local61 = 0; local61 < local55 - 1; local61++) {
			this.anIntArray123[local61 + 1] = local40.method363();
		}
		for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
			local40.anInt443 += 2;
			local31.anInt443 += local40.method361() * local40.method361();
			local40.anInt443++;
		}
		this.anInt467 = local40.method359();
		this.anInt468 = local40.method359();
		this.anInt465 = local40.method361();
		this.anInt466 = local40.method361();
		@Pc(126) int local126 = local40.method359();
		@Pc(132) int local132 = this.anInt465 * this.anInt466;
		this.aByteArray7 = new byte[local132];
		@Pc(140) int local140;
		if (local126 == 0) {
			for (local140 = 0; local140 < local132; local140++) {
				this.aByteArray7[local140] = local31.method360();
			}
		} else if (local126 == 1) {
			for (local140 = 0; local140 < this.anInt465; local140++) {
				for (@Pc(162) int local162 = 0; local162 < this.anInt466; local162++) {
					this.aByteArray7[local140 + local162 * this.anInt465] = local31.method360();
				}
			}
		}
	}

	@OriginalMember(owner = "client!LKEIRLLI", name = "b", descriptor = "(I)V")
	public void method412(@OriginalArg(0) int arg0) {
		try {
			this.anInt469 /= 2;
			this.anInt470 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt469 * this.anInt470];
			@Pc(22) int local22 = 0;
			while (arg0 >= 0) {
				this.anInt464 = 274;
			}
			for (@Pc(31) int local31 = 0; local31 < this.anInt466; local31++) {
				for (@Pc(35) int local35 = 0; local35 < this.anInt465; local35++) {
					local20[(local35 + this.anInt467 >> 1) + (local31 + this.anInt468 >> 1) * this.anInt469] = this.aByteArray7[local22++];
				}
			}
			this.aByteArray7 = local20;
			this.anInt465 = this.anInt469;
			this.anInt466 = this.anInt470;
			this.anInt467 = 0;
			this.anInt468 = 0;
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("39396, " + arg0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LKEIRLLI", name = "b", descriptor = "(Z)V")
	public void method413() {
		try {
			if (this.anInt465 != this.anInt469 || this.anInt466 != this.anInt470) {
				@Pc(19) byte[] local19 = new byte[this.anInt469 * this.anInt470];
				@Pc(25) int local25 = 0;
				for (@Pc(27) int local27 = 0; local27 < this.anInt466; local27++) {
					for (@Pc(31) int local31 = 0; local31 < this.anInt465; local31++) {
						local19[local31 + this.anInt467 + (local27 + this.anInt468) * this.anInt469] = this.aByteArray7[local25++];
					}
				}
				this.aByteArray7 = local19;
				this.anInt465 = this.anInt469;
				this.anInt466 = this.anInt470;
				this.anInt467 = 0;
				this.anInt468 = 0;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("54039, " + false + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LKEIRLLI", name = "c", descriptor = "(I)V")
	public void method414() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt465 * this.anInt466];
			@Pc(10) int local10 = 0;
			for (@Pc(23) int local23 = 0; local23 < this.anInt466; local23++) {
				for (@Pc(30) int local30 = this.anInt465 - 1; local30 >= 0; local30--) {
					local8[local10++] = this.aByteArray7[local30 + local23 * this.anInt465];
				}
			}
			this.aByteArray7 = local8;
			this.anInt467 = this.anInt469 - this.anInt465 - this.anInt467;
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("35372, " + 5487 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LKEIRLLI", name = "c", descriptor = "(Z)V")
	public void method415() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt465 * this.anInt466];
			@Pc(13) int local13 = 0;
			for (@Pc(18) int local18 = this.anInt466 - 1; local18 >= 0; local18--) {
				for (@Pc(22) int local22 = 0; local22 < this.anInt465; local22++) {
					local8[local13++] = this.aByteArray7[local22 + local18 * this.anInt465];
				}
			}
			this.aByteArray7 = local8;
			this.anInt468 = this.anInt470 - this.anInt466 - this.anInt468;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("50111, " + true + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LKEIRLLI", name = "a", descriptor = "(IIII)V")
	public void method416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray123.length; local7++) {
				@Pc(18) int local18 = this.anIntArray123[local7] >> 16 & 0xFF;
				local18 += arg1;
				if (local18 < 0) {
					local18 = 0;
				} else if (local18 > 255) {
					local18 = 255;
				}
				@Pc(42) int local42 = this.anIntArray123[local7] >> 8 & 0xFF;
				local42 += arg0;
				if (local42 < 0) {
					local42 = 0;
				} else if (local42 > 255) {
					local42 = 255;
				}
				@Pc(64) int local64 = this.anIntArray123[local7] & 0xFF;
				local64 += arg2;
				if (local64 < 0) {
					local64 = 0;
				} else if (local64 > 255) {
					local64 = 255;
				}
				this.anIntArray123[local7] = (local18 << 16) + (local42 << 8) + local64;
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("1047, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 7547 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LKEIRLLI", name = "a", descriptor = "(III)V")
	public void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg2 += this.anInt467;
			arg1 += this.anInt468;
			@Pc(15) int local15 = arg2 + arg1 * Class1_Sub1_Sub2.anInt453;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt466;
			@Pc(23) int local23 = this.anInt465;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt453 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class1_Sub1_Sub2.anInt455) {
				local36 = Class1_Sub1_Sub2.anInt455 - arg1;
				local20 -= local36;
				arg1 = Class1_Sub1_Sub2.anInt455;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt453;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt456) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt456;
			}
			if (arg2 < Class1_Sub1_Sub2.anInt457) {
				local36 = Class1_Sub1_Sub2.anInt457 - arg2;
				local23 -= local36;
				arg2 = Class1_Sub1_Sub2.anInt457;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg2 + local23 > Class1_Sub1_Sub2.anInt458) {
				local36 = arg2 + local23 - Class1_Sub1_Sub2.anInt458;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method418(local17, this.anIntArray123, Class1_Sub1_Sub2.anIntArray122, this.aByteArray7, local29, local15, local27, local23, local20);
				@Pc(142) boolean local142 = false;
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("1837, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LKEIRLLI", name = "a", descriptor = "(I[I[II[BIIIII)V")
	private void method418(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg7 >> 2);
			@Pc(11) int local11 = -(arg7 & 0x3);
			for (@Pc(14) int local14 = -arg8; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					@Pc(25) byte local25 = arg3[arg0++];
					if (local25 == 0) {
						arg5++;
					} else {
						arg2[arg5++] = arg1[local25 & 0xFF];
					}
					local25 = arg3[arg0++];
					if (local25 == 0) {
						arg5++;
					} else {
						arg2[arg5++] = arg1[local25 & 0xFF];
					}
					local25 = arg3[arg0++];
					if (local25 == 0) {
						arg5++;
					} else {
						arg2[arg5++] = arg1[local25 & 0xFF];
					}
					local25 = arg3[arg0++];
					if (local25 == 0) {
						arg5++;
					} else {
						arg2[arg5++] = arg1[local25 & 0xFF];
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					@Pc(108) byte local108 = arg3[arg0++];
					if (local108 == 0) {
						arg5++;
					} else {
						arg2[arg5++] = arg1[local108 & 0xFF];
					}
				}
				arg5 += arg6;
				arg0 += arg4;
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("12169, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 356 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}
}

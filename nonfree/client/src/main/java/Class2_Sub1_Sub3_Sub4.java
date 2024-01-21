import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RAOZRSKX")
public final class Class2_Sub1_Sub3_Sub4 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!RAOZRSKX", name = "w", descriptor = "B")
	private byte aByte27 = -111;

	@OriginalMember(owner = "client!RAOZRSKX", name = "x", descriptor = "I")
	private int anInt564 = 3119;

	@OriginalMember(owner = "client!RAOZRSKX", name = "y", descriptor = "I")
	private int anInt565 = -347;

	@OriginalMember(owner = "client!RAOZRSKX", name = "z", descriptor = "Z")
	private boolean aBoolean139 = false;

	@OriginalMember(owner = "client!RAOZRSKX", name = "G", descriptor = "I")
	public int anInt570;

	@OriginalMember(owner = "client!RAOZRSKX", name = "H", descriptor = "I")
	private int anInt571;

	@OriginalMember(owner = "client!RAOZRSKX", name = "B", descriptor = "[I")
	public int[] anIntArray94;

	@OriginalMember(owner = "client!RAOZRSKX", name = "E", descriptor = "I")
	public int anInt568;

	@OriginalMember(owner = "client!RAOZRSKX", name = "F", descriptor = "I")
	public int anInt569;

	@OriginalMember(owner = "client!RAOZRSKX", name = "C", descriptor = "I")
	public int anInt566;

	@OriginalMember(owner = "client!RAOZRSKX", name = "D", descriptor = "I")
	public int anInt567;

	@OriginalMember(owner = "client!RAOZRSKX", name = "A", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!RAOZRSKX", name = "<init>", descriptor = "(Lclient!VSQMPWOM;Ljava/lang/String;I)V")
	public Class2_Sub1_Sub3_Sub4(@OriginalArg(0) Class39 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(31) Class2_Sub1_Sub2 local31 = new Class2_Sub1_Sub2(arg0.method489(arg1 + ".dat", null), -990);
		@Pc(40) Class2_Sub1_Sub2 local40 = new Class2_Sub1_Sub2(arg0.method489("index.dat", null), -990);
		local40.anInt123 = local31.method81();
		this.anInt570 = local40.method81();
		this.anInt571 = local40.method81();
		@Pc(55) int local55 = local40.method79();
		this.anIntArray94 = new int[local55];
		for (@Pc(61) int local61 = 0; local61 < local55 - 1; local61++) {
			this.anIntArray94[local61 + 1] = local40.method83();
		}
		for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
			local40.anInt123 += 2;
			local31.anInt123 += local40.method81() * local40.method81();
			local40.anInt123++;
		}
		this.anInt568 = local40.method79();
		this.anInt569 = local40.method79();
		this.anInt566 = local40.method81();
		this.anInt567 = local40.method81();
		@Pc(126) int local126 = local40.method79();
		@Pc(132) int local132 = this.anInt566 * this.anInt567;
		this.aByteArray14 = new byte[local132];
		@Pc(140) int local140;
		if (local126 == 0) {
			for (local140 = 0; local140 < local132; local140++) {
				this.aByteArray14[local140] = local31.method80();
			}
		} else if (local126 == 1) {
			for (local140 = 0; local140 < this.anInt566; local140++) {
				for (@Pc(162) int local162 = 0; local162 < this.anInt567; local162++) {
					this.aByteArray14[local140 + local162 * this.anInt566] = local31.method80();
				}
			}
		}
	}

	@OriginalMember(owner = "client!RAOZRSKX", name = "b", descriptor = "(I)V")
	public void method395() {
		try {
			this.anInt570 /= 2;
			this.anInt571 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt570 * this.anInt571];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt567; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt566; local28++) {
					local20[(local28 + this.anInt568 >> 1) + (local24 + this.anInt569 >> 1) * this.anInt570] = this.aByteArray14[local22++];
				}
			}
			this.aByteArray14 = local20;
			this.anInt566 = this.anInt570;
			this.anInt567 = this.anInt571;
			this.anInt568 = 0;
			this.anInt569 = 0;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("93324, " + 0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RAOZRSKX", name = "a", descriptor = "(B)V")
	public void method396() {
		try {
			if (this.anInt566 != this.anInt570 || this.anInt567 != this.anInt571) {
				@Pc(19) byte[] local19 = new byte[this.anInt570 * this.anInt571];
				if (this.aByte27 != -111) {
					this.aBoolean139 = !this.aBoolean139;
				}
				@Pc(33) int local33 = 0;
				for (@Pc(35) int local35 = 0; local35 < this.anInt567; local35++) {
					for (@Pc(39) int local39 = 0; local39 < this.anInt566; local39++) {
						local19[local39 + this.anInt568 + (local35 + this.anInt569) * this.anInt570] = this.aByteArray14[local33++];
					}
				}
				this.aByteArray14 = local19;
				this.anInt566 = this.anInt570;
				this.anInt567 = this.anInt571;
				this.anInt568 = 0;
				this.anInt569 = 0;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("13044, " + -111 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RAOZRSKX", name = "c", descriptor = "(I)V")
	public void method397(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt566 * this.anInt567];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt567; local12++) {
				for (@Pc(19) int local19 = this.anInt566 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray14[local19 + local12 * this.anInt566];
				}
			}
			@Pc(46) boolean local46 = false;
			this.aByteArray14 = local8;
			this.anInt568 = this.anInt570 - this.anInt566 - this.anInt568;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("77047, " + arg0 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RAOZRSKX", name = "b", descriptor = "(B)V")
	public void method398() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt566 * this.anInt567];
			@Pc(21) int local21 = 0;
			for (@Pc(26) int local26 = this.anInt567 - 1; local26 >= 0; local26--) {
				for (@Pc(30) int local30 = 0; local30 < this.anInt566; local30++) {
					local8[local21++] = this.aByteArray14[local30 + local26 * this.anInt566];
				}
			}
			this.aByteArray14 = local8;
			this.anInt569 = this.anInt571 - this.anInt567 - this.anInt569;
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("18949, " + -90 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RAOZRSKX", name = "a", descriptor = "(IIII)V")
	public void method399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray94.length; local3++) {
				@Pc(14) int local14 = this.anIntArray94[local3] >> 16 & 0xFF;
				local14 += arg0;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray94[local3] >> 8 & 0xFF;
				local38 += arg1;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray94[local3] & 0xFF;
				local60 += arg3;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray94[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
			@Pc(98) boolean local98 = false;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("8248, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RAOZRSKX", name = "a", descriptor = "(IBI)V")
	public void method400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt568;
			arg0 += this.anInt569;
			@Pc(19) int local19 = arg1 + arg0 * Class2_Sub1_Sub3.anInt555;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt567;
			@Pc(27) int local27 = this.anInt566;
			@Pc(31) int local31 = Class2_Sub1_Sub3.anInt555 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg0 < Class2_Sub1_Sub3.anInt557) {
				local40 = Class2_Sub1_Sub3.anInt557 - arg0;
				local24 -= local40;
				arg0 = Class2_Sub1_Sub3.anInt557;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class2_Sub1_Sub3.anInt555;
			}
			if (arg0 + local24 > Class2_Sub1_Sub3.anInt558) {
				local24 -= arg0 + local24 - Class2_Sub1_Sub3.anInt558;
			}
			if (arg1 < Class2_Sub1_Sub3.anInt559) {
				local40 = Class2_Sub1_Sub3.anInt559 - arg1;
				local27 -= local40;
				arg1 = Class2_Sub1_Sub3.anInt559;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg1 + local27 > Class2_Sub1_Sub3.anInt560) {
				local40 = arg1 + local27 - Class2_Sub1_Sub3.anInt560;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method401(local24, Class2_Sub1_Sub3.anIntArray93, local27, this.aByteArray14, this.anIntArray94, local33, local31, local19, local21);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("73960, " + arg0 + ", " + 3 + ", " + arg1 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RAOZRSKX", name = "a", descriptor = "(I[II[B[IIIIII)V")
	private void method401(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg2 >> 2);
			@Pc(11) int local11 = -(arg2 & 0x3);
			for (@Pc(14) int local14 = -arg0; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					@Pc(25) byte local25 = arg3[arg8++];
					if (local25 == 0) {
						arg7++;
					} else {
						arg1[arg7++] = arg4[local25 & 0xFF];
					}
					local25 = arg3[arg8++];
					if (local25 == 0) {
						arg7++;
					} else {
						arg1[arg7++] = arg4[local25 & 0xFF];
					}
					local25 = arg3[arg8++];
					if (local25 == 0) {
						arg7++;
					} else {
						arg1[arg7++] = arg4[local25 & 0xFF];
					}
					local25 = arg3[arg8++];
					if (local25 == 0) {
						arg7++;
					} else {
						arg1[arg7++] = arg4[local25 & 0xFF];
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					@Pc(108) byte local108 = arg3[arg8++];
					if (local108 == 0) {
						arg7++;
					} else {
						arg1[arg7++] = arg4[local108 & 0xFF];
					}
				}
				arg7 += arg6;
				arg8 += arg5;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("29182, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + -494 + ", " + arg8 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}

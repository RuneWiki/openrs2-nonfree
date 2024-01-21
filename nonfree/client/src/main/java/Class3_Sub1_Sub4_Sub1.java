import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NUXLZYAZ")
public final class Class3_Sub1_Sub4_Sub1 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!NUXLZYAZ", name = "y", descriptor = "I")
	private int anInt466 = 7;

	@OriginalMember(owner = "client!NUXLZYAZ", name = "z", descriptor = "Z")
	private boolean aBoolean129 = true;

	@OriginalMember(owner = "client!NUXLZYAZ", name = "A", descriptor = "I")
	private int anInt467 = -770;

	@OriginalMember(owner = "client!NUXLZYAZ", name = "H", descriptor = "I")
	public int anInt472;

	@OriginalMember(owner = "client!NUXLZYAZ", name = "I", descriptor = "I")
	private int anInt473;

	@OriginalMember(owner = "client!NUXLZYAZ", name = "C", descriptor = "[I")
	public int[] anIntArray136;

	@OriginalMember(owner = "client!NUXLZYAZ", name = "F", descriptor = "I")
	public int anInt470;

	@OriginalMember(owner = "client!NUXLZYAZ", name = "G", descriptor = "I")
	public int anInt471;

	@OriginalMember(owner = "client!NUXLZYAZ", name = "D", descriptor = "I")
	public int anInt468;

	@OriginalMember(owner = "client!NUXLZYAZ", name = "E", descriptor = "I")
	public int anInt469;

	@OriginalMember(owner = "client!NUXLZYAZ", name = "B", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!NUXLZYAZ", name = "<init>", descriptor = "(Lclient!GWOEELWB;Ljava/lang/String;I)V")
	public Class3_Sub1_Sub4_Sub1(@OriginalArg(0) Class13 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(28) Class3_Sub1_Sub2 local28 = new Class3_Sub1_Sub2(true, arg0.method140(arg1 + ".dat", null));
		@Pc(37) Class3_Sub1_Sub2 local37 = new Class3_Sub1_Sub2(true, arg0.method140("index.dat", null));
		local37.anInt429 = local28.method202();
		this.anInt472 = local37.method202();
		this.anInt473 = local37.method202();
		@Pc(52) int local52 = local37.method200();
		this.anIntArray136 = new int[local52];
		for (@Pc(58) int local58 = 0; local58 < local52 - 1; local58++) {
			this.anIntArray136[local58 + 1] = local37.method204();
		}
		for (@Pc(76) int local76 = 0; local76 < arg2; local76++) {
			local37.anInt429 += 2;
			local28.anInt429 += local37.method202() * local37.method202();
			local37.anInt429++;
		}
		this.anInt470 = local37.method200();
		this.anInt471 = local37.method200();
		this.anInt468 = local37.method202();
		this.anInt469 = local37.method202();
		@Pc(123) int local123 = local37.method200();
		@Pc(129) int local129 = this.anInt468 * this.anInt469;
		this.aByteArray16 = new byte[local129];
		@Pc(137) int local137;
		if (local123 == 0) {
			for (local137 = 0; local137 < local129; local137++) {
				this.aByteArray16[local137] = local28.method201();
			}
		} else if (local123 == 1) {
			for (local137 = 0; local137 < this.anInt468; local137++) {
				for (@Pc(159) int local159 = 0; local159 < this.anInt469; local159++) {
					this.aByteArray16[local137 + local159 * this.anInt468] = local28.method201();
				}
			}
		}
	}

	@OriginalMember(owner = "client!NUXLZYAZ", name = "a", descriptor = "(Z)V")
	public void method276() {
		try {
			this.anInt472 /= 2;
			this.anInt473 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt472 * this.anInt473];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt469; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt468; local28++) {
					local20[(local28 + this.anInt470 >> 1) + (local24 + this.anInt471 >> 1) * this.anInt472] = this.aByteArray16[local22++];
				}
			}
			this.aByteArray16 = local20;
			this.anInt468 = this.anInt472;
			this.anInt469 = this.anInt473;
			this.anInt470 = 0;
			this.anInt471 = 0;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("57563, " + true + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUXLZYAZ", name = "b", descriptor = "(I)V")
	public void method277(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt468 != this.anInt472 || this.anInt469 != this.anInt473) {
				@Pc(19) byte[] local19 = new byte[this.anInt472 * this.anInt473];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt469; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt468; local27++) {
						local19[local27 + this.anInt470 + (local23 + this.anInt471) * this.anInt472] = this.aByteArray16[local21++];
					}
				}
				this.aByteArray16 = local19;
				@Pc(65) boolean local65 = false;
				this.anInt468 = this.anInt472;
				this.anInt469 = this.anInt473;
				this.anInt470 = 0;
				this.anInt471 = 0;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("74496, " + arg0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUXLZYAZ", name = "c", descriptor = "(I)V")
	public void method278() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt468 * this.anInt469];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt469; local12++) {
				for (@Pc(19) int local19 = this.anInt468 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray16[local19 + local12 * this.anInt468];
				}
			}
			this.aByteArray16 = local8;
			this.anInt470 = this.anInt472 - this.anInt468 - this.anInt470;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("70002, " + 2 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUXLZYAZ", name = "d", descriptor = "(I)V")
	public void method279() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt468 * this.anInt469];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt469 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt468; local19++) {
					local8[local10++] = this.aByteArray16[local19 + local15 * this.anInt468];
				}
			}
			this.aByteArray16 = local8;
			this.anInt471 = this.anInt473 - this.anInt469 - this.anInt471;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("65338, " + -179 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUXLZYAZ", name = "a", descriptor = "(IIII)V")
	public void method280(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray136.length; local3++) {
				@Pc(14) int local14 = this.anIntArray136[local3] >> 16 & 0xFF;
				local14 += arg2;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray136[local3] >> 8 & 0xFF;
				local38 += arg1;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray136[local3] & 0xFF;
				local60 += arg0;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray136[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("83300, " + arg0 + ", " + 106 + ", " + arg1 + ", " + arg2 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUXLZYAZ", name = "a", descriptor = "(IIB)V")
	public void method281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt470;
			arg1 += this.anInt471;
			@Pc(15) int local15 = arg0 + arg1 * Class3_Sub1_Sub4.anInt631;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt469;
			@Pc(23) int local23 = this.anInt468;
			@Pc(27) int local27 = Class3_Sub1_Sub4.anInt631 - local23;
			@Pc(29) int local29 = 0;
			@Pc(40) int local40;
			if (arg1 < Class3_Sub1_Sub4.anInt633) {
				local40 = Class3_Sub1_Sub4.anInt633 - arg1;
				local20 -= local40;
				arg1 = Class3_Sub1_Sub4.anInt633;
				local17 = local40 * local23 + 0;
				local15 += local40 * Class3_Sub1_Sub4.anInt631;
			}
			if (arg1 + local20 > Class3_Sub1_Sub4.anInt634) {
				local20 -= arg1 + local20 - Class3_Sub1_Sub4.anInt634;
			}
			if (arg0 < Class3_Sub1_Sub4.anInt635) {
				local40 = Class3_Sub1_Sub4.anInt635 - arg0;
				local23 -= local40;
				arg0 = Class3_Sub1_Sub4.anInt635;
				local17 += local40;
				local15 += local40;
				local29 = local40 + 0;
				local27 += local40;
			}
			if (arg0 + local23 > Class3_Sub1_Sub4.anInt636) {
				local40 = arg0 + local23 - Class3_Sub1_Sub4.anInt636;
				local23 -= local40;
				local29 += local40;
				local27 += local40;
			}
			if (local23 > 0 && local20 > 0) {
				this.method282(local29, local20, this.anIntArray136, local17, local15, local23, Class3_Sub1_Sub4.anIntArray174, local27, this.aByteArray16);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("2958, " + arg0 + ", " + arg1 + ", " + 2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUXLZYAZ", name = "a", descriptor = "(II[IZIII[II[B)V")
	private void method282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8) {
		try {
			@Pc(6) int local6 = -(arg5 >> 2);
			@Pc(11) int local11 = -(arg5 & 0x3);
			for (@Pc(19) int local19 = -arg1; local19 < 0; local19++) {
				for (@Pc(23) int local23 = local6; local23 < 0; local23++) {
					@Pc(30) byte local30 = arg8[arg3++];
					if (local30 == 0) {
						arg4++;
					} else {
						arg6[arg4++] = arg2[local30 & 0xFF];
					}
					local30 = arg8[arg3++];
					if (local30 == 0) {
						arg4++;
					} else {
						arg6[arg4++] = arg2[local30 & 0xFF];
					}
					local30 = arg8[arg3++];
					if (local30 == 0) {
						arg4++;
					} else {
						arg6[arg4++] = arg2[local30 & 0xFF];
					}
					local30 = arg8[arg3++];
					if (local30 == 0) {
						arg4++;
					} else {
						arg6[arg4++] = arg2[local30 & 0xFF];
					}
				}
				for (@Pc(106) int local106 = local11; local106 < 0; local106++) {
					@Pc(113) byte local113 = arg8[arg3++];
					if (local113 == 0) {
						arg4++;
					} else {
						arg6[arg4++] = arg2[local113 & 0xFF];
					}
				}
				arg4 += arg7;
				arg3 += arg0;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("70313, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}

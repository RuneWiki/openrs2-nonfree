import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NPZZPPRD")
public final class Class2_Sub1_Sub3_Sub4 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!NPZZPPRD", name = "z", descriptor = "Z")
	private boolean aBoolean121 = false;

	@OriginalMember(owner = "client!NPZZPPRD", name = "A", descriptor = "Z")
	private boolean aBoolean122 = false;

	@OriginalMember(owner = "client!NPZZPPRD", name = "B", descriptor = "I")
	private int anInt472 = 6;

	@OriginalMember(owner = "client!NPZZPPRD", name = "C", descriptor = "I")
	private int anInt473 = -20671;

	@OriginalMember(owner = "client!NPZZPPRD", name = "J", descriptor = "I")
	public int anInt478;

	@OriginalMember(owner = "client!NPZZPPRD", name = "K", descriptor = "I")
	private int anInt479;

	@OriginalMember(owner = "client!NPZZPPRD", name = "E", descriptor = "[I")
	public int[] anIntArray105;

	@OriginalMember(owner = "client!NPZZPPRD", name = "H", descriptor = "I")
	public int anInt476;

	@OriginalMember(owner = "client!NPZZPPRD", name = "I", descriptor = "I")
	public int anInt477;

	@OriginalMember(owner = "client!NPZZPPRD", name = "F", descriptor = "I")
	public int anInt474;

	@OriginalMember(owner = "client!NPZZPPRD", name = "G", descriptor = "I")
	public int anInt475;

	@OriginalMember(owner = "client!NPZZPPRD", name = "D", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!NPZZPPRD", name = "<init>", descriptor = "(Lclient!JUPFHAZZ;Ljava/lang/String;I)V")
	public Class2_Sub1_Sub3_Sub4(@OriginalArg(0) Class21 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(31) Class2_Sub1_Sub4 local31 = new Class2_Sub1_Sub4(859, arg0.method275(arg1 + ".dat", null));
		@Pc(40) Class2_Sub1_Sub4 local40 = new Class2_Sub1_Sub4(859, arg0.method275("index.dat", null));
		local40.anInt672 = local31.method494();
		this.anInt478 = local40.method494();
		this.anInt479 = local40.method494();
		@Pc(55) int local55 = local40.method492();
		this.anIntArray105 = new int[local55];
		for (@Pc(61) int local61 = 0; local61 < local55 - 1; local61++) {
			this.anIntArray105[local61 + 1] = local40.method496();
		}
		for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
			local40.anInt672 += 2;
			local31.anInt672 += local40.method494() * local40.method494();
			local40.anInt672++;
		}
		this.anInt476 = local40.method492();
		this.anInt477 = local40.method492();
		this.anInt474 = local40.method494();
		this.anInt475 = local40.method494();
		@Pc(126) int local126 = local40.method492();
		@Pc(132) int local132 = this.anInt474 * this.anInt475;
		this.aByteArray12 = new byte[local132];
		@Pc(140) int local140;
		if (local126 == 0) {
			for (local140 = 0; local140 < local132; local140++) {
				this.aByteArray12[local140] = local31.method493();
			}
		} else if (local126 == 1) {
			for (local140 = 0; local140 < this.anInt474; local140++) {
				for (@Pc(162) int local162 = 0; local162 < this.anInt475; local162++) {
					this.aByteArray12[local140 + local162 * this.anInt474] = local31.method493();
				}
			}
		}
	}

	@OriginalMember(owner = "client!NPZZPPRD", name = "a", descriptor = "(B)V")
	public void method364(@OriginalArg(0) byte arg0) {
		try {
			this.anInt478 /= 2;
			this.anInt479 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt478 * this.anInt479];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt475; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt474; local28++) {
					local20[(local28 + this.anInt476 >> 1) + (local24 + this.anInt477 >> 1) * this.anInt478] = this.aByteArray12[local22++];
				}
			}
			this.aByteArray12 = local20;
			this.anInt474 = this.anInt478;
			this.anInt475 = this.anInt479;
			this.anInt476 = 0;
			@Pc(82) boolean local82 = false;
			this.anInt477 = 0;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("93053, " + arg0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NPZZPPRD", name = "c", descriptor = "(I)V")
	public void method365() {
		try {
			if (this.anInt474 != this.anInt478 || this.anInt475 != this.anInt479) {
				@Pc(19) byte[] local19 = new byte[this.anInt478 * this.anInt479];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt475; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt474; local27++) {
						local19[local27 + this.anInt476 + (local23 + this.anInt477) * this.anInt478] = this.aByteArray12[local21++];
					}
				}
				this.aByteArray12 = local19;
				this.anInt474 = this.anInt478;
				this.anInt475 = this.anInt479;
				this.anInt476 = 0;
				this.anInt477 = 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("35548, " + -13293 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NPZZPPRD", name = "d", descriptor = "(I)V")
	public void method366() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt474 * this.anInt475];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt475; local12++) {
				for (@Pc(19) int local19 = this.anInt474 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray12[local19 + local12 * this.anInt474];
				}
			}
			this.aByteArray12 = local8;
			this.anInt476 = this.anInt478 - this.anInt474 - this.anInt476;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("8363, " + 315 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NPZZPPRD", name = "e", descriptor = "(I)V")
	public void method367() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt474 * this.anInt475];
			@Pc(19) int local19 = 0;
			for (@Pc(24) int local24 = this.anInt475 - 1; local24 >= 0; local24--) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt474; local28++) {
					local8[local19++] = this.aByteArray12[local28 + local24 * this.anInt474];
				}
			}
			this.aByteArray12 = local8;
			this.anInt477 = this.anInt479 - this.anInt475 - this.anInt477;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("85715, " + 68 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NPZZPPRD", name = "a", descriptor = "(IIII)V")
	public void method368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray105.length; local3++) {
				@Pc(14) int local14 = this.anIntArray105[local3] >> 16 & 0xFF;
				local14 += arg2;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray105[local3] >> 8 & 0xFF;
				local38 += arg1;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray105[local3] & 0xFF;
				local60 += arg0;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray105[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("40913, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NPZZPPRD", name = "a", descriptor = "(III)V")
	public void method369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg2 += this.anInt476;
			arg0 += this.anInt477;
			@Pc(15) int local15 = arg2 + arg0 * Class2_Sub1_Sub3.anInt463;
			@Pc(17) int local17 = 0;
			if (arg1 != this.anInt473) {
				this.aBoolean122 = !this.aBoolean122;
			}
			@Pc(32) int local32 = this.anInt475;
			@Pc(35) int local35 = this.anInt474;
			@Pc(39) int local39 = Class2_Sub1_Sub3.anInt463 - local35;
			@Pc(41) int local41 = 0;
			@Pc(48) int local48;
			if (arg0 < Class2_Sub1_Sub3.anInt465) {
				local48 = Class2_Sub1_Sub3.anInt465 - arg0;
				local32 -= local48;
				arg0 = Class2_Sub1_Sub3.anInt465;
				local17 = local48 * local35 + 0;
				local15 += local48 * Class2_Sub1_Sub3.anInt463;
			}
			if (arg0 + local32 > Class2_Sub1_Sub3.anInt466) {
				local32 -= arg0 + local32 - Class2_Sub1_Sub3.anInt466;
			}
			if (arg2 < Class2_Sub1_Sub3.anInt467) {
				local48 = Class2_Sub1_Sub3.anInt467 - arg2;
				local35 -= local48;
				arg2 = Class2_Sub1_Sub3.anInt467;
				local17 += local48;
				local15 += local48;
				local41 = local48 + 0;
				local39 += local48;
			}
			if (arg2 + local35 > Class2_Sub1_Sub3.anInt468) {
				local48 = arg2 + local35 - Class2_Sub1_Sub3.anInt468;
				local35 -= local48;
				local41 += local48;
				local39 += local48;
			}
			if (local35 > 0 && local32 > 0) {
				this.method370(local35, local41, this.aByteArray12, Class2_Sub1_Sub3.anIntArray104, local17, local32, local39, local15, this.anIntArray105);
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("68581, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NPZZPPRD", name = "a", descriptor = "(II[B[IIIIII[I)V")
	private void method370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		try {
			@Pc(6) int local6 = -(arg0 >> 2);
			@Pc(11) int local11 = -(arg0 & 0x3);
			for (@Pc(18) int local18 = -arg5; local18 < 0; local18++) {
				for (@Pc(22) int local22 = local6; local22 < 0; local22++) {
					@Pc(29) byte local29 = arg2[arg4++];
					if (local29 == 0) {
						arg7++;
					} else {
						arg3[arg7++] = arg8[local29 & 0xFF];
					}
					local29 = arg2[arg4++];
					if (local29 == 0) {
						arg7++;
					} else {
						arg3[arg7++] = arg8[local29 & 0xFF];
					}
					local29 = arg2[arg4++];
					if (local29 == 0) {
						arg7++;
					} else {
						arg3[arg7++] = arg8[local29 & 0xFF];
					}
					local29 = arg2[arg4++];
					if (local29 == 0) {
						arg7++;
					} else {
						arg3[arg7++] = arg8[local29 & 0xFF];
					}
				}
				for (@Pc(105) int local105 = local11; local105 < 0; local105++) {
					@Pc(112) byte local112 = arg2[arg4++];
					if (local112 == 0) {
						arg7++;
					} else {
						arg3[arg7++] = arg8[local112 & 0xFF];
					}
				}
				arg7 += arg6;
				arg4 += arg1;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("78143, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -43221 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}
}

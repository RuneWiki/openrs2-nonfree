import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WRRBQEHV")
public final class Class10_Sub1_Sub1_Sub3 extends Class10_Sub1_Sub1 {

	@OriginalMember(owner = "client!WRRBQEHV", name = "y", descriptor = "I")
	private int anInt649;

	@OriginalMember(owner = "client!WRRBQEHV", name = "w", descriptor = "I")
	private int anInt648 = 3;

	@OriginalMember(owner = "client!WRRBQEHV", name = "x", descriptor = "Z")
	private boolean aBoolean161 = true;

	@OriginalMember(owner = "client!WRRBQEHV", name = "z", descriptor = "I")
	private int anInt650 = -235;

	@OriginalMember(owner = "client!WRRBQEHV", name = "A", descriptor = "B")
	private byte aByte36 = 5;

	@OriginalMember(owner = "client!WRRBQEHV", name = "B", descriptor = "I")
	private int anInt651 = -3539;

	@OriginalMember(owner = "client!WRRBQEHV", name = "C", descriptor = "Z")
	private boolean aBoolean162 = true;

	@OriginalMember(owner = "client!WRRBQEHV", name = "J", descriptor = "I")
	public int anInt656;

	@OriginalMember(owner = "client!WRRBQEHV", name = "K", descriptor = "I")
	private int anInt657;

	@OriginalMember(owner = "client!WRRBQEHV", name = "E", descriptor = "[I")
	public int[] anIntArray175;

	@OriginalMember(owner = "client!WRRBQEHV", name = "H", descriptor = "I")
	public int anInt654;

	@OriginalMember(owner = "client!WRRBQEHV", name = "I", descriptor = "I")
	public int anInt655;

	@OriginalMember(owner = "client!WRRBQEHV", name = "F", descriptor = "I")
	public int anInt652;

	@OriginalMember(owner = "client!WRRBQEHV", name = "G", descriptor = "I")
	public int anInt653;

	@OriginalMember(owner = "client!WRRBQEHV", name = "D", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!WRRBQEHV", name = "<init>", descriptor = "(Lclient!ATJMVOZR;Ljava/lang/String;I)V")
	public Class10_Sub1_Sub1_Sub3(@OriginalArg(0) Class2 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(37) Class10_Sub1_Sub3 local37 = new Class10_Sub1_Sub3(true, arg0.method2(arg1 + ".dat", null));
		@Pc(46) Class10_Sub1_Sub3 local46 = new Class10_Sub1_Sub3(true, arg0.method2("index.dat", null));
		local46.anInt428 = local37.method313();
		this.anInt656 = local46.method313();
		this.anInt657 = local46.method313();
		@Pc(61) int local61 = local46.method311();
		this.anIntArray175 = new int[local61];
		for (@Pc(67) int local67 = 0; local67 < local61 - 1; local67++) {
			this.anIntArray175[local67 + 1] = local46.method315();
		}
		for (@Pc(85) int local85 = 0; local85 < arg2; local85++) {
			local46.anInt428 += 2;
			local37.anInt428 += local46.method313() * local46.method313();
			local46.anInt428++;
		}
		this.anInt654 = local46.method311();
		this.anInt655 = local46.method311();
		this.anInt652 = local46.method313();
		this.anInt653 = local46.method313();
		@Pc(132) int local132 = local46.method311();
		@Pc(138) int local138 = this.anInt652 * this.anInt653;
		this.aByteArray16 = new byte[local138];
		@Pc(146) int local146;
		if (local132 == 0) {
			for (local146 = 0; local146 < local138; local146++) {
				this.aByteArray16[local146] = local37.method312();
			}
		} else if (local132 == 1) {
			for (local146 = 0; local146 < this.anInt652; local146++) {
				for (@Pc(168) int local168 = 0; local168 < this.anInt653; local168++) {
					this.aByteArray16[local146 + local168 * this.anInt652] = local37.method312();
				}
			}
		}
	}

	@OriginalMember(owner = "client!WRRBQEHV", name = "b", descriptor = "(I)V")
	public void method435() {
		try {
			this.anInt656 /= 2;
			this.anInt657 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt656 * this.anInt657];
			@Pc(22) int local22 = 0;
			for (@Pc(27) int local27 = 0; local27 < this.anInt653; local27++) {
				for (@Pc(31) int local31 = 0; local31 < this.anInt652; local31++) {
					local20[(local31 + this.anInt654 >> 1) + (local27 + this.anInt655 >> 1) * this.anInt656] = this.aByteArray16[local22++];
				}
			}
			this.aByteArray16 = local20;
			this.anInt652 = this.anInt656;
			this.anInt653 = this.anInt657;
			this.anInt654 = 0;
			this.anInt655 = 0;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("66140, " + 0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WRRBQEHV", name = "a", descriptor = "(Z)V")
	public void method436() {
		try {
			if (this.anInt652 != this.anInt656 || this.anInt653 != this.anInt657) {
				@Pc(19) byte[] local19 = new byte[this.anInt656 * this.anInt657];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt653; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt652; local27++) {
						local19[local27 + this.anInt654 + (local23 + this.anInt655) * this.anInt656] = this.aByteArray16[local21++];
					}
				}
				this.aByteArray16 = local19;
				this.anInt652 = this.anInt656;
				this.anInt653 = this.anInt657;
				this.anInt654 = 0;
				this.anInt655 = 0;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("31312, " + true + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WRRBQEHV", name = "c", descriptor = "(I)V")
	public void method437() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt652 * this.anInt653];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt653; local12++) {
				for (@Pc(19) int local19 = this.anInt652 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray16[local19 + local12 * this.anInt652];
				}
			}
			this.aByteArray16 = local8;
			this.anInt654 = this.anInt656 - this.anInt652 - this.anInt654;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("85851, " + 0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WRRBQEHV", name = "b", descriptor = "(B)V")
	public void method438() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt652 * this.anInt653];
			@Pc(10) int local10 = 0;
			for (@Pc(26) int local26 = this.anInt653 - 1; local26 >= 0; local26--) {
				for (@Pc(30) int local30 = 0; local30 < this.anInt652; local30++) {
					local8[local10++] = this.aByteArray16[local30 + local26 * this.anInt652];
				}
			}
			this.aByteArray16 = local8;
			this.anInt655 = this.anInt657 - this.anInt653 - this.anInt655;
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("45635, " + 7 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WRRBQEHV", name = "a", descriptor = "(IIII)V")
	public void method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray175.length; local3++) {
				@Pc(14) int local14 = this.anIntArray175[local3] >> 16 & 0xFF;
				local14 += arg2;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray175[local3] >> 8 & 0xFF;
				local38 += arg1;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray175[local3] & 0xFF;
				local60 += arg0;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray175[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
			if (this.anInt650 == -235) {
				;
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("7661, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -235 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WRRBQEHV", name = "a", descriptor = "(III)V")
	public void method440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt654;
			arg0 += this.anInt655;
			@Pc(28) int local28 = arg1 + arg0 * Class10_Sub1_Sub1.anInt674;
			@Pc(30) int local30 = 0;
			@Pc(33) int local33 = this.anInt653;
			@Pc(36) int local36 = this.anInt652;
			@Pc(40) int local40 = Class10_Sub1_Sub1.anInt674 - local36;
			@Pc(42) int local42 = 0;
			@Pc(49) int local49;
			if (arg0 < Class10_Sub1_Sub1.anInt676) {
				local49 = Class10_Sub1_Sub1.anInt676 - arg0;
				local33 -= local49;
				arg0 = Class10_Sub1_Sub1.anInt676;
				local30 = local49 * local36 + 0;
				local28 += local49 * Class10_Sub1_Sub1.anInt674;
			}
			if (arg0 + local33 > Class10_Sub1_Sub1.anInt677) {
				local33 -= arg0 + local33 - Class10_Sub1_Sub1.anInt677;
			}
			if (arg1 < Class10_Sub1_Sub1.anInt678) {
				local49 = Class10_Sub1_Sub1.anInt678 - arg1;
				local36 -= local49;
				arg1 = Class10_Sub1_Sub1.anInt678;
				local30 += local49;
				local28 += local49;
				local42 = local49 + 0;
				local40 += local49;
			}
			if (arg1 + local36 > Class10_Sub1_Sub1.anInt679) {
				local49 = arg1 + local36 - Class10_Sub1_Sub1.anInt679;
				local36 -= local49;
				local42 += local49;
				local40 += local49;
			}
			if (local36 > 0 && local33 > 0) {
				this.method441(local30, Class10_Sub1_Sub1.anIntArray178, this.aByteArray16, local42, this.anIntArray175, local33, local36, local28, local40);
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("17371, " + arg0 + ", " + arg1 + ", " + -488 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WRRBQEHV", name = "a", descriptor = "(I[I[BI[IIIIZI)V")
	private void method441(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg6 >> 2);
			@Pc(11) int local11 = -(arg6 & 0x3);
			for (@Pc(19) int local19 = -arg5; local19 < 0; local19++) {
				for (@Pc(23) int local23 = local6; local23 < 0; local23++) {
					@Pc(30) byte local30 = arg2[arg0++];
					if (local30 == 0) {
						arg7++;
					} else {
						arg1[arg7++] = arg4[local30 & 0xFF];
					}
					local30 = arg2[arg0++];
					if (local30 == 0) {
						arg7++;
					} else {
						arg1[arg7++] = arg4[local30 & 0xFF];
					}
					local30 = arg2[arg0++];
					if (local30 == 0) {
						arg7++;
					} else {
						arg1[arg7++] = arg4[local30 & 0xFF];
					}
					local30 = arg2[arg0++];
					if (local30 == 0) {
						arg7++;
					} else {
						arg1[arg7++] = arg4[local30 & 0xFF];
					}
				}
				for (@Pc(106) int local106 = local11; local106 < 0; local106++) {
					@Pc(113) byte local113 = arg2[arg0++];
					if (local113 == 0) {
						arg7++;
					} else {
						arg1[arg7++] = arg4[local113 & 0xFF];
					}
				}
				arg7 += arg8;
				arg0 += arg3;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("67567, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + false + ", " + arg8 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jb")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	private int anInt647 = 584;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
	private int anInt648 = 4697;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "Z")
	private boolean aBoolean187 = true;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	public int anInt653;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
	private int anInt654;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "[I")
	public int[] anIntArray209;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	public int anInt651;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public int anInt652;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
	public int anInt649;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
	public int anInt650;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(31) Class1_Sub1_Sub3 local31 = new Class1_Sub1_Sub3((byte) 3, arg0.method658(arg1 + ".dat", null));
		@Pc(40) Class1_Sub1_Sub3 local40 = new Class1_Sub1_Sub3((byte) 3, arg0.method658("index.dat", null));
		local40.anInt715 = local31.method474();
		this.anInt653 = local40.method474();
		this.anInt654 = local40.method474();
		@Pc(55) int local55 = local40.method472();
		this.anIntArray209 = new int[local55];
		for (@Pc(61) int local61 = 0; local61 < local55 - 1; local61++) {
			this.anIntArray209[local61 + 1] = local40.method476();
		}
		for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
			local40.anInt715 += 2;
			local31.anInt715 += local40.method474() * local40.method474();
			local40.anInt715++;
		}
		this.anInt651 = local40.method472();
		this.anInt652 = local40.method472();
		this.anInt649 = local40.method474();
		this.anInt650 = local40.method474();
		@Pc(126) int local126 = local40.method472();
		@Pc(132) int local132 = this.anInt649 * this.anInt650;
		this.aByteArray7 = new byte[local132];
		@Pc(140) int local140;
		if (local126 == 0) {
			for (local140 = 0; local140 < local132; local140++) {
				this.aByteArray7[local140] = local31.method473();
			}
		} else if (local126 == 1) {
			for (local140 = 0; local140 < this.anInt649; local140++) {
				for (@Pc(162) int local162 = 0; local162 < this.anInt650; local162++) {
					this.aByteArray7[local140 + local162 * this.anInt649] = local31.method473();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V")
	public void method409() {
		try {
			this.anInt653 /= 2;
			this.anInt654 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt653 * this.anInt654];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt650; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt649; local28++) {
					local20[(local28 + this.anInt651 >> 1) + (local24 + this.anInt652 >> 1) * this.anInt653] = this.aByteArray7[local22++];
				}
			}
			this.aByteArray7 = local20;
			this.anInt649 = this.anInt653;
			this.anInt650 = this.anInt654;
			this.anInt651 = 0;
			this.anInt652 = 0;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("71542, " + true + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public void method410() {
		try {
			if (this.anInt649 != this.anInt653 || this.anInt650 != this.anInt654) {
				@Pc(19) byte[] local19 = new byte[this.anInt653 * this.anInt654];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt650; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt649; local27++) {
						local19[local27 + this.anInt651 + (local23 + this.anInt652) * this.anInt653] = this.aByteArray7[local21++];
					}
				}
				this.aByteArray7 = local19;
				this.anInt649 = this.anInt653;
				this.anInt650 = this.anInt654;
				this.anInt651 = 0;
				this.anInt652 = 0;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("52180, " + 103 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public void method411() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt649 * this.anInt650];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt650; local12++) {
				for (@Pc(19) int local19 = this.anInt649 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray7[local19 + local12 * this.anInt649];
				}
			}
			this.aByteArray7 = local8;
			this.anInt651 = this.anInt653 - this.anInt649 - this.anInt651;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("78050, " + 5 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public void method412() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt649 * this.anInt650];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt650 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt649; local19++) {
					local8[local10++] = this.aByteArray7[local19 + local15 * this.anInt649];
				}
			}
			this.aByteArray7 = local8;
			this.anInt652 = this.anInt654 - this.anInt650 - this.anInt652;
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("5374, " + -43068 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZI)V")
	public void method413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray209.length; local13++) {
				@Pc(24) int local24 = this.anIntArray209[local13] >> 16 & 0xFF;
				local24 += arg0;
				if (local24 < 0) {
					local24 = 0;
				} else if (local24 > 255) {
					local24 = 255;
				}
				@Pc(48) int local48 = this.anIntArray209[local13] >> 8 & 0xFF;
				local48 += arg1;
				if (local48 < 0) {
					local48 = 0;
				} else if (local48 > 255) {
					local48 = 255;
				}
				@Pc(70) int local70 = this.anIntArray209[local13] & 0xFF;
				local70 += arg2;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 > 255) {
					local70 = 255;
				}
				this.anIntArray209[local13] = (local24 << 16) + (local48 << 8) + local70;
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("32644, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public void method414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt651;
			arg0 += this.anInt652;
			@Pc(24) int local24 = arg1 + arg0 * Class1_Sub1_Sub2.anInt670;
			@Pc(26) int local26 = 0;
			@Pc(29) int local29 = this.anInt650;
			@Pc(32) int local32 = this.anInt649;
			@Pc(36) int local36 = Class1_Sub1_Sub2.anInt670 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg0 < Class1_Sub1_Sub2.anInt672) {
				local45 = Class1_Sub1_Sub2.anInt672 - arg0;
				local29 -= local45;
				arg0 = Class1_Sub1_Sub2.anInt672;
				local26 = local45 * local32 + 0;
				local24 += local45 * Class1_Sub1_Sub2.anInt670;
			}
			if (arg0 + local29 > Class1_Sub1_Sub2.anInt673) {
				local29 -= arg0 + local29 - Class1_Sub1_Sub2.anInt673;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt674) {
				local45 = Class1_Sub1_Sub2.anInt674 - arg1;
				local32 -= local45;
				arg1 = Class1_Sub1_Sub2.anInt674;
				local26 += local45;
				local24 += local45;
				local38 = local45 + 0;
				local36 += local45;
			}
			if (arg1 + local32 > Class1_Sub1_Sub2.anInt675) {
				local45 = arg1 + local32 - Class1_Sub1_Sub2.anInt675;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method415(this.aByteArray7, Class1_Sub1_Sub2.anIntArray210, local32, this.anIntArray209, local36, local26, local24, local29, local38);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("42241, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BB[II[IIIIII)V")
	private void method415(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(16) int local16 = -(arg2 >> 2);
			@Pc(21) int local21 = -(arg2 & 0x3);
			for (@Pc(24) int local24 = -arg7; local24 < 0; local24++) {
				for (@Pc(28) int local28 = local16; local28 < 0; local28++) {
					@Pc(35) byte local35 = arg0[arg5++];
					if (local35 == 0) {
						arg6++;
					} else {
						arg1[arg6++] = arg3[local35 & 0xFF];
					}
					local35 = arg0[arg5++];
					if (local35 == 0) {
						arg6++;
					} else {
						arg1[arg6++] = arg3[local35 & 0xFF];
					}
					local35 = arg0[arg5++];
					if (local35 == 0) {
						arg6++;
					} else {
						arg1[arg6++] = arg3[local35 & 0xFF];
					}
					local35 = arg0[arg5++];
					if (local35 == 0) {
						arg6++;
					} else {
						arg1[arg6++] = arg3[local35 & 0xFF];
					}
				}
				for (@Pc(111) int local111 = local21; local111 < 0; local111++) {
					@Pc(118) byte local118 = arg0[arg5++];
					if (local118 == 0) {
						arg6++;
					} else {
						arg1[arg6++] = arg3[local118 & 0xFF];
					}
				}
				arg6 += arg4;
				arg5 += arg8;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("98799, " + arg0 + ", " + -84 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}

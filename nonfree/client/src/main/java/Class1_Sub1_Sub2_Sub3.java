import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "Z")
	private boolean aBoolean165 = false;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "Z")
	private boolean aBoolean166 = true;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
	private int anInt732 = -43533;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "Z")
	private boolean aBoolean167 = false;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
	private int anInt733 = -16521;

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
	public int anInt738;

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
	private int anInt739;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
	public int anInt736;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
	public int anInt737;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
	public int anInt734;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
	public int anInt735;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!yb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class48 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class1_Sub1_Sub3 local34 = new Class1_Sub1_Sub3(45427, arg0.method678(arg1 + ".dat", null));
		@Pc(43) Class1_Sub1_Sub3 local43 = new Class1_Sub1_Sub3(45427, arg0.method678("index.dat", null));
		local43.anInt796 = local34.method500();
		this.anInt738 = local43.method500();
		this.anInt739 = local43.method500();
		@Pc(58) int local58 = local43.method498();
		this.anIntArray212 = new int[local58];
		for (@Pc(64) int local64 = 0; local64 < local58 - 1; local64++) {
			this.anIntArray212[local64 + 1] = local43.method502();
		}
		for (@Pc(82) int local82 = 0; local82 < arg2; local82++) {
			local43.anInt796 += 2;
			local34.anInt796 += local43.method500() * local43.method500();
			local43.anInt796++;
		}
		this.anInt736 = local43.method498();
		this.anInt737 = local43.method498();
		this.anInt734 = local43.method500();
		this.anInt735 = local43.method500();
		@Pc(129) int local129 = local43.method498();
		@Pc(135) int local135 = this.anInt734 * this.anInt735;
		this.aByteArray7 = new byte[local135];
		@Pc(143) int local143;
		if (local129 == 0) {
			for (local143 = 0; local143 < local135; local143++) {
				this.aByteArray7[local143] = local34.method499();
			}
		} else if (local129 == 1) {
			for (local143 = 0; local143 < this.anInt734; local143++) {
				for (@Pc(165) int local165 = 0; local165 < this.anInt735; local165++) {
					this.aByteArray7[local143 + local165 * this.anInt734] = local34.method499();
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public void method440() {
		try {
			this.anInt738 /= 2;
			this.anInt739 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt738 * this.anInt739];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt735; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt734; local28++) {
					local20[(local28 + this.anInt736 >> 1) + (local24 + this.anInt737 >> 1) * this.anInt738] = this.aByteArray7[local22++];
				}
			}
			this.aByteArray7 = local20;
			this.anInt734 = this.anInt738;
			this.anInt735 = this.anInt739;
			this.anInt736 = 0;
			this.anInt737 = 0;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("57664, " + 8 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public void method441() {
		try {
			if (this.anInt734 != this.anInt738 || this.anInt735 != this.anInt739) {
				@Pc(19) byte[] local19 = new byte[this.anInt738 * this.anInt739];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt735; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt734; local27++) {
						local19[local27 + this.anInt736 + (local23 + this.anInt737) * this.anInt738] = this.aByteArray7[local21++];
					}
				}
				this.aByteArray7 = local19;
				this.anInt734 = this.anInt738;
				this.anInt735 = this.anInt739;
				this.anInt736 = 0;
				this.anInt737 = 0;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("49068, " + 31507 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
	public void method442(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt734 * this.anInt735];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt735; local12++) {
				for (@Pc(19) int local19 = this.anInt734 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray7[local19 + local12 * this.anInt734];
				}
			}
			this.aByteArray7 = local8;
			this.anInt736 = this.anInt738 - this.anInt734 - this.anInt736;
			@Pc(59) boolean local59 = false;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("95963, " + arg0 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
	public void method443() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt734 * this.anInt735];
			@Pc(20) int local20 = 0;
			for (@Pc(25) int local25 = this.anInt735 - 1; local25 >= 0; local25--) {
				for (@Pc(29) int local29 = 0; local29 < this.anInt734; local29++) {
					local8[local20++] = this.aByteArray7[local29 + local25 * this.anInt734];
				}
			}
			this.aByteArray7 = local8;
			this.anInt737 = this.anInt739 - this.anInt735 - this.anInt737;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("65147, " + 6 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V")
	public void method444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray212.length; local6++) {
				@Pc(17) int local17 = this.anIntArray212[local6] >> 16 & 0xFF;
				local17 += arg2;
				if (local17 < 0) {
					local17 = 0;
				} else if (local17 > 255) {
					local17 = 255;
				}
				@Pc(41) int local41 = this.anIntArray212[local6] >> 8 & 0xFF;
				local41 += arg0;
				if (local41 < 0) {
					local41 = 0;
				} else if (local41 > 255) {
					local41 = 255;
				}
				@Pc(63) int local63 = this.anIntArray212[local6] & 0xFF;
				local63 += arg1;
				if (local63 < 0) {
					local63 = 0;
				} else if (local63 > 255) {
					local63 = 255;
				}
				this.anIntArray212[local6] = (local17 << 16) + (local41 << 8) + local63;
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("57137, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
	public void method445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg2 += this.anInt736;
			arg0 += this.anInt737;
			@Pc(15) int local15 = arg2 + arg0 * Class1_Sub1_Sub2.anInt756;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt735;
			@Pc(23) int local23 = this.anInt734;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt756 - local23;
			@Pc(29) int local29 = 0;
			if (arg1 != this.anInt732) {
				this.aBoolean166 = !this.aBoolean166;
			}
			@Pc(48) int local48;
			if (arg0 < Class1_Sub1_Sub2.anInt758) {
				local48 = Class1_Sub1_Sub2.anInt758 - arg0;
				local20 -= local48;
				arg0 = Class1_Sub1_Sub2.anInt758;
				local17 = local48 * local23 + 0;
				local15 += local48 * Class1_Sub1_Sub2.anInt756;
			}
			if (arg0 + local20 > Class1_Sub1_Sub2.anInt759) {
				local20 -= arg0 + local20 - Class1_Sub1_Sub2.anInt759;
			}
			if (arg2 < Class1_Sub1_Sub2.anInt760) {
				local48 = Class1_Sub1_Sub2.anInt760 - arg2;
				local23 -= local48;
				arg2 = Class1_Sub1_Sub2.anInt760;
				local17 += local48;
				local15 += local48;
				local29 = local48 + 0;
				local27 += local48;
			}
			if (arg2 + local23 > Class1_Sub1_Sub2.anInt761) {
				local48 = arg2 + local23 - Class1_Sub1_Sub2.anInt761;
				local23 -= local48;
				local29 += local48;
				local27 += local48;
			}
			if (local23 > 0 && local20 > 0) {
				this.method446(Class1_Sub1_Sub2.anIntArray213, local23, local17, local20, this.aByteArray7, local27, local29, this.anIntArray212, local15);
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("31759, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([IIII[BZII[II)V")
	private void method446(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(16) int local16 = -(arg1 >> 2);
			@Pc(21) int local21 = -(arg1 & 0x3);
			for (@Pc(24) int local24 = -arg3; local24 < 0; local24++) {
				for (@Pc(28) int local28 = local16; local28 < 0; local28++) {
					@Pc(35) byte local35 = arg4[arg2++];
					if (local35 == 0) {
						arg8++;
					} else {
						arg0[arg8++] = arg7[local35 & 0xFF];
					}
					local35 = arg4[arg2++];
					if (local35 == 0) {
						arg8++;
					} else {
						arg0[arg8++] = arg7[local35 & 0xFF];
					}
					local35 = arg4[arg2++];
					if (local35 == 0) {
						arg8++;
					} else {
						arg0[arg8++] = arg7[local35 & 0xFF];
					}
					local35 = arg4[arg2++];
					if (local35 == 0) {
						arg8++;
					} else {
						arg0[arg8++] = arg7[local35 & 0xFF];
					}
				}
				for (@Pc(111) int local111 = local21; local111 < 0; local111++) {
					@Pc(118) byte local118 = arg4[arg2++];
					if (local118 == 0) {
						arg8++;
					} else {
						arg0[arg8++] = arg7[local118 & 0xFF];
					}
				}
				arg8 += arg5;
				arg2 += arg6;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("92640, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}

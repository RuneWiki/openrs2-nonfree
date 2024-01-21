import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jb")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
	private int anInt651;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "Z")
	private boolean aBoolean180 = true;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "B")
	private byte aByte28 = 5;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "Z")
	private boolean aBoolean181 = true;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
	private int anInt652 = 465;

	@OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
	public int anInt657;

	@OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
	private int anInt658;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
	public int anInt655;

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
	public int anInt656;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public int anInt653;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	public int anInt654;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(31) Class1_Sub1_Sub3 local31 = new Class1_Sub1_Sub3(arg0.method666(arg1 + ".dat", null), (byte) -93);
		@Pc(40) Class1_Sub1_Sub3 local40 = new Class1_Sub1_Sub3(arg0.method666("index.dat", null), (byte) -93);
		local40.anInt720 = local31.method482();
		this.anInt657 = local40.method482();
		this.anInt658 = local40.method482();
		@Pc(55) int local55 = local40.method480();
		this.anIntArray212 = new int[local55];
		for (@Pc(61) int local61 = 0; local61 < local55 - 1; local61++) {
			this.anIntArray212[local61 + 1] = local40.method484();
		}
		for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
			local40.anInt720 += 2;
			local31.anInt720 += local40.method482() * local40.method482();
			local40.anInt720++;
		}
		this.anInt655 = local40.method480();
		this.anInt656 = local40.method480();
		this.anInt653 = local40.method482();
		this.anInt654 = local40.method482();
		@Pc(126) int local126 = local40.method480();
		@Pc(132) int local132 = this.anInt653 * this.anInt654;
		this.aByteArray7 = new byte[local132];
		@Pc(140) int local140;
		if (local126 == 0) {
			for (local140 = 0; local140 < local132; local140++) {
				this.aByteArray7[local140] = local31.method481();
			}
		} else if (local126 == 1) {
			for (local140 = 0; local140 < this.anInt653; local140++) {
				for (@Pc(162) int local162 = 0; local162 < this.anInt654; local162++) {
					this.aByteArray7[local140 + local162 * this.anInt653] = local31.method481();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V")
	public void method413() {
		try {
			this.anInt657 /= 2;
			this.anInt658 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt657 * this.anInt658];
			@Pc(22) int local22 = 0;
			for (@Pc(27) int local27 = 0; local27 < this.anInt654; local27++) {
				for (@Pc(31) int local31 = 0; local31 < this.anInt653; local31++) {
					local20[(local31 + this.anInt655 >> 1) + (local27 + this.anInt656 >> 1) * this.anInt657] = this.aByteArray7[local22++];
				}
			}
			this.aByteArray7 = local20;
			this.anInt653 = this.anInt657;
			this.anInt654 = this.anInt658;
			this.anInt655 = 0;
			this.anInt656 = 0;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("70801, " + true + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public void method414() {
		try {
			if (this.anInt653 != this.anInt657 || this.anInt654 != this.anInt658) {
				@Pc(19) byte[] local19 = new byte[this.anInt657 * this.anInt658];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt654; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt653; local27++) {
						local19[local27 + this.anInt655 + (local23 + this.anInt656) * this.anInt657] = this.aByteArray7[local21++];
					}
				}
				this.aByteArray7 = local19;
				this.anInt653 = this.anInt657;
				this.anInt654 = this.anInt658;
				this.anInt655 = 0;
				this.anInt656 = 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("92627, " + 7 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public void method415() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt653 * this.anInt654];
			@Pc(10) int local10 = 0;
			for (@Pc(21) int local21 = 0; local21 < this.anInt654; local21++) {
				for (@Pc(28) int local28 = this.anInt653 - 1; local28 >= 0; local28--) {
					local8[local10++] = this.aByteArray7[local28 + local21 * this.anInt653];
				}
			}
			this.aByteArray7 = local8;
			this.anInt655 = this.anInt657 - this.anInt653 - this.anInt655;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("94549, " + 1 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public void method416() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt653 * this.anInt654];
			@Pc(13) int local13 = 0;
			for (@Pc(18) int local18 = this.anInt654 - 1; local18 >= 0; local18--) {
				for (@Pc(22) int local22 = 0; local22 < this.anInt653; local22++) {
					local8[local13++] = this.aByteArray7[local22 + local18 * this.anInt653];
				}
			}
			this.aByteArray7 = local8;
			this.anInt656 = this.anInt658 - this.anInt654 - this.anInt656;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("361, " + 363 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	public void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray212.length; local17++) {
				@Pc(28) int local28 = this.anIntArray212[local17] >> 16 & 0xFF;
				local28 += arg2;
				if (local28 < 0) {
					local28 = 0;
				} else if (local28 > 255) {
					local28 = 255;
				}
				@Pc(52) int local52 = this.anIntArray212[local17] >> 8 & 0xFF;
				local52 += arg0;
				if (local52 < 0) {
					local52 = 0;
				} else if (local52 > 255) {
					local52 = 255;
				}
				@Pc(74) int local74 = this.anIntArray212[local17] & 0xFF;
				local74 += arg1;
				if (local74 < 0) {
					local74 = 0;
				} else if (local74 > 255) {
					local74 = 255;
				}
				this.anIntArray212[local17] = (local28 << 16) + (local52 << 8) + local74;
			}
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("46728, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public void method418(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt655;
			arg1 += this.anInt656;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt675;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt654;
			@Pc(23) int local23 = this.anInt653;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt675 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class1_Sub1_Sub2.anInt677) {
				local36 = Class1_Sub1_Sub2.anInt677 - arg1;
				local20 -= local36;
				arg1 = Class1_Sub1_Sub2.anInt677;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt675;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt678) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt678;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt679) {
				local36 = Class1_Sub1_Sub2.anInt679 - arg0;
				local23 -= local36;
				arg0 = Class1_Sub1_Sub2.anInt679;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt680) {
				local36 = arg0 + local23 - Class1_Sub1_Sub2.anInt680;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method419(this.aByteArray7, local20, local15, this.anIntArray212, local17, Class1_Sub1_Sub2.anIntArray213, local29, local27, local23);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("17270, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BIZI[II[IIII)V")
	private void method419(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg8 >> 2);
			@Pc(11) int local11 = -(arg8 & 0x3);
			for (@Pc(19) int local19 = -arg1; local19 < 0; local19++) {
				for (@Pc(23) int local23 = local6; local23 < 0; local23++) {
					@Pc(30) byte local30 = arg0[arg4++];
					if (local30 == 0) {
						arg2++;
					} else {
						arg5[arg2++] = arg3[local30 & 0xFF];
					}
					local30 = arg0[arg4++];
					if (local30 == 0) {
						arg2++;
					} else {
						arg5[arg2++] = arg3[local30 & 0xFF];
					}
					local30 = arg0[arg4++];
					if (local30 == 0) {
						arg2++;
					} else {
						arg5[arg2++] = arg3[local30 & 0xFF];
					}
					local30 = arg0[arg4++];
					if (local30 == 0) {
						arg2++;
					} else {
						arg5[arg2++] = arg3[local30 & 0xFF];
					}
				}
				for (@Pc(106) int local106 = local11; local106 < 0; local106++) {
					@Pc(113) byte local113 = arg0[arg4++];
					if (local113 == 0) {
						arg2++;
					} else {
						arg5[arg2++] = arg3[local113 & 0xFF];
					}
				}
				arg2 += arg7;
				arg4 += arg6;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("54969, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}

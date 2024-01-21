import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YAPSNHGU")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!YAPSNHGU", name = "x", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!YAPSNHGU", name = "y", descriptor = "I")
	private int anInt808 = -673;

	@OriginalMember(owner = "client!YAPSNHGU", name = "z", descriptor = "I")
	private int anInt809 = 9;

	@OriginalMember(owner = "client!YAPSNHGU", name = "A", descriptor = "Z")
	private boolean aBoolean190 = true;

	@OriginalMember(owner = "client!YAPSNHGU", name = "H", descriptor = "I")
	public int anInt814;

	@OriginalMember(owner = "client!YAPSNHGU", name = "I", descriptor = "I")
	private int anInt815;

	@OriginalMember(owner = "client!YAPSNHGU", name = "C", descriptor = "[I")
	public int[] anIntArray207;

	@OriginalMember(owner = "client!YAPSNHGU", name = "F", descriptor = "I")
	public int anInt812;

	@OriginalMember(owner = "client!YAPSNHGU", name = "G", descriptor = "I")
	public int anInt813;

	@OriginalMember(owner = "client!YAPSNHGU", name = "D", descriptor = "I")
	public int anInt810;

	@OriginalMember(owner = "client!YAPSNHGU", name = "E", descriptor = "I")
	public int anInt811;

	@OriginalMember(owner = "client!YAPSNHGU", name = "B", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!YAPSNHGU", name = "<init>", descriptor = "(Lclient!HRXSNEYZ;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) Class15 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(31) Class1_Sub1_Sub3 local31 = new Class1_Sub1_Sub3(arg0.method220(arg1 + ".dat", null), 8);
		@Pc(40) Class1_Sub1_Sub3 local40 = new Class1_Sub1_Sub3(arg0.method220("index.dat", null), 8);
		local40.anInt352 = local31.method240();
		this.anInt814 = local40.method240();
		this.anInt815 = local40.method240();
		@Pc(55) int local55 = local40.method238();
		this.anIntArray207 = new int[local55];
		for (@Pc(61) int local61 = 0; local61 < local55 - 1; local61++) {
			this.anIntArray207[local61 + 1] = local40.method242();
		}
		for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
			local40.anInt352 += 2;
			local31.anInt352 += local40.method240() * local40.method240();
			local40.anInt352++;
		}
		this.anInt812 = local40.method238();
		this.anInt813 = local40.method238();
		this.anInt810 = local40.method240();
		this.anInt811 = local40.method240();
		@Pc(126) int local126 = local40.method238();
		@Pc(132) int local132 = this.anInt810 * this.anInt811;
		this.aByteArray20 = new byte[local132];
		@Pc(140) int local140;
		if (local126 == 0) {
			for (local140 = 0; local140 < local132; local140++) {
				this.aByteArray20[local140] = local31.method239();
			}
		} else if (local126 == 1) {
			for (local140 = 0; local140 < this.anInt810; local140++) {
				for (@Pc(162) int local162 = 0; local162 < this.anInt811; local162++) {
					this.aByteArray20[local140 + local162 * this.anInt810] = local31.method239();
				}
			}
		}
	}

	@OriginalMember(owner = "client!YAPSNHGU", name = "c", descriptor = "(Z)V")
	public void method558() {
		try {
			this.anInt814 /= 2;
			this.anInt815 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt814 * this.anInt815];
			@Pc(22) int local22 = 0;
			for (@Pc(34) int local34 = 0; local34 < this.anInt811; local34++) {
				for (@Pc(38) int local38 = 0; local38 < this.anInt810; local38++) {
					local20[(local38 + this.anInt812 >> 1) + (local34 + this.anInt813 >> 1) * this.anInt814] = this.aByteArray20[local22++];
				}
			}
			this.aByteArray20 = local20;
			this.anInt810 = this.anInt814;
			this.anInt811 = this.anInt815;
			this.anInt812 = 0;
			this.anInt813 = 0;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("33484, " + true + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YAPSNHGU", name = "a", descriptor = "(I)V")
	public void method559() {
		try {
			if (this.anInt810 != this.anInt814 || this.anInt811 != this.anInt815) {
				@Pc(19) byte[] local19 = new byte[this.anInt814 * this.anInt815];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt811; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt810; local27++) {
						local19[local27 + this.anInt812 + (local23 + this.anInt813) * this.anInt814] = this.aByteArray20[local21++];
					}
				}
				this.aByteArray20 = local19;
				this.anInt810 = this.anInt814;
				this.anInt811 = this.anInt815;
				this.anInt812 = 0;
				this.anInt813 = 0;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("56417, " + -574 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YAPSNHGU", name = "d", descriptor = "(Z)V")
	public void method560() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt810 * this.anInt811];
			@Pc(15) int local15 = 0;
			for (@Pc(17) int local17 = 0; local17 < this.anInt811; local17++) {
				for (@Pc(24) int local24 = this.anInt810 - 1; local24 >= 0; local24--) {
					local8[local15++] = this.aByteArray20[local24 + local17 * this.anInt810];
				}
			}
			this.aByteArray20 = local8;
			this.anInt812 = this.anInt814 - this.anInt810 - this.anInt812;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("37325, " + false + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YAPSNHGU", name = "b", descriptor = "(I)V")
	public void method561() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt810 * this.anInt811];
			@Pc(10) int local10 = 0;
			for (@Pc(25) int local25 = this.anInt811 - 1; local25 >= 0; local25--) {
				for (@Pc(29) int local29 = 0; local29 < this.anInt810; local29++) {
					local8[local10++] = this.aByteArray20[local29 + local25 * this.anInt810];
				}
			}
			this.aByteArray20 = local8;
			this.anInt813 = this.anInt815 - this.anInt811 - this.anInt813;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("48388, " + -25299 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YAPSNHGU", name = "a", descriptor = "(IIII)V")
	public void method562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray207.length; local12++) {
				@Pc(23) int local23 = this.anIntArray207[local12] >> 16 & 0xFF;
				local23 += arg1;
				if (local23 < 0) {
					local23 = 0;
				} else if (local23 > 255) {
					local23 = 255;
				}
				@Pc(47) int local47 = this.anIntArray207[local12] >> 8 & 0xFF;
				local47 += arg0;
				if (local47 < 0) {
					local47 = 0;
				} else if (local47 > 255) {
					local47 = 255;
				}
				@Pc(69) int local69 = this.anIntArray207[local12] & 0xFF;
				local69 += arg2;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 > 255) {
					local69 = 255;
				}
				this.anIntArray207[local12] = (local23 << 16) + (local47 << 8) + local69;
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("47037, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YAPSNHGU", name = "a", descriptor = "(IIB)V")
	public void method563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt812;
			arg0 += this.anInt813;
			@Pc(19) int local19 = arg1 + arg0 * Class1_Sub1_Sub1.anInt799;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt811;
			@Pc(27) int local27 = this.anInt810;
			@Pc(31) int local31 = Class1_Sub1_Sub1.anInt799 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg0 < Class1_Sub1_Sub1.anInt801) {
				local40 = Class1_Sub1_Sub1.anInt801 - arg0;
				local24 -= local40;
				arg0 = Class1_Sub1_Sub1.anInt801;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class1_Sub1_Sub1.anInt799;
			}
			if (arg0 + local24 > Class1_Sub1_Sub1.anInt802) {
				local24 -= arg0 + local24 - Class1_Sub1_Sub1.anInt802;
			}
			if (arg1 < Class1_Sub1_Sub1.anInt803) {
				local40 = Class1_Sub1_Sub1.anInt803 - arg1;
				local27 -= local40;
				arg1 = Class1_Sub1_Sub1.anInt803;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg1 + local27 > Class1_Sub1_Sub1.anInt804) {
				local40 = arg1 + local27 - Class1_Sub1_Sub1.anInt804;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method564(this.aByteArray20, local33, local21, this.anIntArray207, local19, Class1_Sub1_Sub1.anIntArray206, local31, local24, local27);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("57426, " + arg0 + ", " + arg1 + ", " + 122 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YAPSNHGU", name = "a", descriptor = "([BIIZ[II[IIII)V")
	private void method564(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg8 >> 2);
			@Pc(11) int local11 = -(arg8 & 0x3);
			for (@Pc(17) int local17 = -arg7; local17 < 0; local17++) {
				for (@Pc(21) int local21 = local6; local21 < 0; local21++) {
					@Pc(28) byte local28 = arg0[arg2++];
					if (local28 == 0) {
						arg4++;
					} else {
						arg5[arg4++] = arg3[local28 & 0xFF];
					}
					local28 = arg0[arg2++];
					if (local28 == 0) {
						arg4++;
					} else {
						arg5[arg4++] = arg3[local28 & 0xFF];
					}
					local28 = arg0[arg2++];
					if (local28 == 0) {
						arg4++;
					} else {
						arg5[arg4++] = arg3[local28 & 0xFF];
					}
					local28 = arg0[arg2++];
					if (local28 == 0) {
						arg4++;
					} else {
						arg5[arg4++] = arg3[local28 & 0xFF];
					}
				}
				for (@Pc(104) int local104 = local11; local104 < 0; local104++) {
					@Pc(111) byte local111 = arg0[arg2++];
					if (local111 == 0) {
						arg4++;
					} else {
						arg5[arg4++] = arg3[local111 & 0xFF];
					}
				}
				arg4 += arg6;
				arg2 += arg1;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("13974, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}

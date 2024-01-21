import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ITVAFKCK")
public final class Class4_Sub1_Sub1_Sub2 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!ITVAFKCK", name = "z", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!ITVAFKCK", name = "G", descriptor = "I")
	public int anInt159;

	@OriginalMember(owner = "client!ITVAFKCK", name = "H", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!ITVAFKCK", name = "B", descriptor = "[I")
	public int[] anIntArray25;

	@OriginalMember(owner = "client!ITVAFKCK", name = "E", descriptor = "I")
	public int anInt157;

	@OriginalMember(owner = "client!ITVAFKCK", name = "F", descriptor = "I")
	public int anInt158;

	@OriginalMember(owner = "client!ITVAFKCK", name = "C", descriptor = "I")
	public int anInt155;

	@OriginalMember(owner = "client!ITVAFKCK", name = "D", descriptor = "I")
	public int anInt156;

	@OriginalMember(owner = "client!ITVAFKCK", name = "A", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ITVAFKCK", name = "<init>", descriptor = "(Lclient!AKPFVPPG;Ljava/lang/String;I)V")
	public Class4_Sub1_Sub1_Sub2(@OriginalArg(0) Class2 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(22) Class4_Sub1_Sub3 local22 = new Class4_Sub1_Sub3(arg0.method7(arg1 + ".dat", null), (byte) 3);
		@Pc(31) Class4_Sub1_Sub3 local31 = new Class4_Sub1_Sub3(arg0.method7("index.dat", null), (byte) 3);
		local31.anInt101 = local22.method104();
		this.anInt159 = local31.method104();
		this.anInt160 = local31.method104();
		@Pc(46) int local46 = local31.method102();
		this.anIntArray25 = new int[local46];
		for (@Pc(52) int local52 = 0; local52 < local46 - 1; local52++) {
			this.anIntArray25[local52 + 1] = local31.method106();
		}
		for (@Pc(70) int local70 = 0; local70 < arg2; local70++) {
			local31.anInt101 += 2;
			local22.anInt101 += local31.method104() * local31.method104();
			local31.anInt101++;
		}
		this.anInt157 = local31.method102();
		this.anInt158 = local31.method102();
		this.anInt155 = local31.method104();
		this.anInt156 = local31.method104();
		@Pc(117) int local117 = local31.method102();
		@Pc(123) int local123 = this.anInt155 * this.anInt156;
		this.aByteArray4 = new byte[local123];
		@Pc(131) int local131;
		if (local117 == 0) {
			for (local131 = 0; local131 < local123; local131++) {
				this.aByteArray4[local131] = local22.method103();
			}
		} else if (local117 == 1) {
			for (local131 = 0; local131 < this.anInt155; local131++) {
				for (@Pc(153) int local153 = 0; local153 < this.anInt156; local153++) {
					this.aByteArray4[local131 + local153 * this.anInt155] = local22.method103();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ITVAFKCK", name = "b", descriptor = "(B)V")
	public void method206() {
		try {
			this.anInt159 /= 2;
			this.anInt160 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt159 * this.anInt160];
			@Pc(22) int local22 = 0;
			for (@Pc(35) int local35 = 0; local35 < this.anInt156; local35++) {
				for (@Pc(39) int local39 = 0; local39 < this.anInt155; local39++) {
					local20[(local39 + this.anInt157 >> 1) + (local35 + this.anInt158 >> 1) * this.anInt159] = this.aByteArray4[local22++];
				}
			}
			this.aByteArray4 = local20;
			this.anInt155 = this.anInt159;
			this.anInt156 = this.anInt160;
			this.anInt157 = 0;
			this.anInt158 = 0;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("57978, " + 63 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ITVAFKCK", name = "a", descriptor = "(I)V")
	public void method207() {
		try {
			if (this.anInt155 != this.anInt159 || this.anInt156 != this.anInt160) {
				@Pc(28) byte[] local28 = new byte[this.anInt159 * this.anInt160];
				@Pc(30) int local30 = 0;
				for (@Pc(32) int local32 = 0; local32 < this.anInt156; local32++) {
					for (@Pc(36) int local36 = 0; local36 < this.anInt155; local36++) {
						local28[local36 + this.anInt157 + (local32 + this.anInt158) * this.anInt159] = this.aByteArray4[local30++];
					}
				}
				this.aByteArray4 = local28;
				this.anInt155 = this.anInt159;
				this.anInt156 = this.anInt160;
				this.anInt157 = 0;
				this.anInt158 = 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("47594, " + 0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ITVAFKCK", name = "b", descriptor = "(I)V")
	public void method208() {
		try {
			@Pc(18) byte[] local18 = new byte[this.anInt155 * this.anInt156];
			@Pc(20) int local20 = 0;
			for (@Pc(22) int local22 = 0; local22 < this.anInt156; local22++) {
				for (@Pc(29) int local29 = this.anInt155 - 1; local29 >= 0; local29--) {
					local18[local20++] = this.aByteArray4[local29 + local22 * this.anInt155];
				}
			}
			this.aByteArray4 = local18;
			this.anInt157 = this.anInt159 - this.anInt155 - this.anInt157;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("5483, " + 33787 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ITVAFKCK", name = "c", descriptor = "(I)V")
	public void method209() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt155 * this.anInt156];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt156 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt155; local19++) {
					local8[local10++] = this.aByteArray4[local19 + local15 * this.anInt155];
				}
			}
			this.aByteArray4 = local8;
			this.anInt158 = this.anInt160 - this.anInt156 - this.anInt158;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("79377, " + -837 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ITVAFKCK", name = "a", descriptor = "(ZIII)V")
	public void method210(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(5) int local5;
			if (!arg0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			for (local5 = 0; local5 < this.anIntArray25.length; local5++) {
				@Pc(23) int local23 = this.anIntArray25[local5] >> 16 & 0xFF;
				local23 += arg3;
				if (local23 < 0) {
					local23 = 0;
				} else if (local23 > 255) {
					local23 = 255;
				}
				@Pc(47) int local47 = this.anIntArray25[local5] >> 8 & 0xFF;
				local47 += arg1;
				if (local47 < 0) {
					local47 = 0;
				} else if (local47 > 255) {
					local47 = 255;
				}
				@Pc(69) int local69 = this.anIntArray25[local5] & 0xFF;
				local69 += arg2;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 > 255) {
					local69 = 255;
				}
				this.anIntArray25[local5] = (local23 << 16) + (local47 << 8) + local69;
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("98366, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ITVAFKCK", name = "a", descriptor = "(III)V")
	public void method211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			arg1 += this.anInt157;
			arg2 += this.anInt158;
			@Pc(19) int local19 = arg1 + arg2 * Class4_Sub1_Sub1.anInt782;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt156;
			@Pc(27) int local27 = this.anInt155;
			@Pc(31) int local31 = Class4_Sub1_Sub1.anInt782 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg2 < Class4_Sub1_Sub1.anInt784) {
				local40 = Class4_Sub1_Sub1.anInt784 - arg2;
				local24 -= local40;
				arg2 = Class4_Sub1_Sub1.anInt784;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class4_Sub1_Sub1.anInt782;
			}
			if (arg2 + local24 > Class4_Sub1_Sub1.anInt785) {
				local24 -= arg2 + local24 - Class4_Sub1_Sub1.anInt785;
			}
			if (arg1 < Class4_Sub1_Sub1.anInt786) {
				local40 = Class4_Sub1_Sub1.anInt786 - arg1;
				local27 -= local40;
				arg1 = Class4_Sub1_Sub1.anInt786;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg1 + local27 > Class4_Sub1_Sub1.anInt787) {
				local40 = arg1 + local27 - Class4_Sub1_Sub1.anInt787;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method212(local33, local27, local21, local31, local24, local19, this.aByteArray4, Class4_Sub1_Sub1.anIntArray201, this.anIntArray25);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("25412, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ITVAFKCK", name = "a", descriptor = "(IIIIIII[B[I[I)V")
	private void method212(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int[] arg8) {
		try {
			@Pc(6) int local6 = -(arg1 >> 2);
			@Pc(20) int local20 = -(arg1 & 0x3);
			for (@Pc(23) int local23 = -arg4; local23 < 0; local23++) {
				for (@Pc(27) int local27 = local6; local27 < 0; local27++) {
					@Pc(34) byte local34 = arg6[arg2++];
					if (local34 == 0) {
						arg5++;
					} else {
						arg7[arg5++] = arg8[local34 & 0xFF];
					}
					local34 = arg6[arg2++];
					if (local34 == 0) {
						arg5++;
					} else {
						arg7[arg5++] = arg8[local34 & 0xFF];
					}
					local34 = arg6[arg2++];
					if (local34 == 0) {
						arg5++;
					} else {
						arg7[arg5++] = arg8[local34 & 0xFF];
					}
					local34 = arg6[arg2++];
					if (local34 == 0) {
						arg5++;
					} else {
						arg7[arg5++] = arg8[local34 & 0xFF];
					}
				}
				for (@Pc(110) int local110 = local20; local110 < 0; local110++) {
					@Pc(117) byte local117 = arg6[arg2++];
					if (local117 == 0) {
						arg5++;
					} else {
						arg7[arg5++] = arg8[local117 & 0xFF];
					}
				}
				arg5 += arg3;
				arg2 += arg0;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("13579, " + 554 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}
}

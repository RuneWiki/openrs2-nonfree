import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SFVBUBEZ")
public final class Class8_Sub1_Sub2_Sub2 extends Class8_Sub1_Sub2 {

	@OriginalMember(owner = "client!SFVBUBEZ", name = "w", descriptor = "Z")
	private boolean aBoolean139 = true;

	@OriginalMember(owner = "client!SFVBUBEZ", name = "x", descriptor = "Z")
	private boolean aBoolean140 = false;

	@OriginalMember(owner = "client!SFVBUBEZ", name = "y", descriptor = "I")
	private int anInt599 = -324;

	@OriginalMember(owner = "client!SFVBUBEZ", name = "z", descriptor = "I")
	private int anInt600 = -81;

	@OriginalMember(owner = "client!SFVBUBEZ", name = "A", descriptor = "Z")
	private boolean aBoolean141 = false;

	@OriginalMember(owner = "client!SFVBUBEZ", name = "B", descriptor = "Z")
	private boolean aBoolean142 = false;

	@OriginalMember(owner = "client!SFVBUBEZ", name = "I", descriptor = "I")
	public int anInt605;

	@OriginalMember(owner = "client!SFVBUBEZ", name = "J", descriptor = "I")
	private int anInt606;

	@OriginalMember(owner = "client!SFVBUBEZ", name = "D", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!SFVBUBEZ", name = "G", descriptor = "I")
	public int anInt603;

	@OriginalMember(owner = "client!SFVBUBEZ", name = "H", descriptor = "I")
	public int anInt604;

	@OriginalMember(owner = "client!SFVBUBEZ", name = "E", descriptor = "I")
	public int anInt601;

	@OriginalMember(owner = "client!SFVBUBEZ", name = "F", descriptor = "I")
	public int anInt602;

	@OriginalMember(owner = "client!SFVBUBEZ", name = "C", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!SFVBUBEZ", name = "<init>", descriptor = "(Lclient!AWEEREDT;Ljava/lang/String;I)V")
	public Class8_Sub1_Sub2_Sub2(@OriginalArg(0) Class2 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(37) Class8_Sub1_Sub3 local37 = new Class8_Sub1_Sub3(arg0.method14(arg1 + ".dat", null), 713);
		@Pc(46) Class8_Sub1_Sub3 local46 = new Class8_Sub1_Sub3(arg0.method14("index.dat", null), 713);
		local46.anInt239 = local37.method154();
		this.anInt605 = local46.method154();
		this.anInt606 = local46.method154();
		@Pc(61) int local61 = local46.method152();
		this.anIntArray164 = new int[local61];
		for (@Pc(67) int local67 = 0; local67 < local61 - 1; local67++) {
			this.anIntArray164[local67 + 1] = local46.method156();
		}
		for (@Pc(91) int local91 = 0; local91 < arg2; local91++) {
			local46.anInt239 += 2;
			local37.anInt239 += local46.method154() * local46.method154();
			local46.anInt239++;
		}
		this.anInt603 = local46.method152();
		this.anInt604 = local46.method152();
		this.anInt601 = local46.method154();
		this.anInt602 = local46.method154();
		@Pc(138) int local138 = local46.method152();
		@Pc(144) int local144 = this.anInt601 * this.anInt602;
		this.aByteArray19 = new byte[local144];
		@Pc(152) int local152;
		if (local138 == 0) {
			for (local152 = 0; local152 < local144; local152++) {
				this.aByteArray19[local152] = local37.method153();
			}
		} else if (local138 == 1) {
			for (local152 = 0; local152 < this.anInt601; local152++) {
				for (@Pc(174) int local174 = 0; local174 < this.anInt602; local174++) {
					this.aByteArray19[local152 + local174 * this.anInt601] = local37.method153();
				}
			}
		}
	}

	@OriginalMember(owner = "client!SFVBUBEZ", name = "a", descriptor = "(Z)V")
	public void method401() {
		try {
			this.anInt605 /= 2;
			this.anInt606 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt605 * this.anInt606];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt602; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt601; local28++) {
					local20[(local28 + this.anInt603 >> 1) + (local24 + this.anInt604 >> 1) * this.anInt605] = this.aByteArray19[local22++];
				}
			}
			this.aByteArray19 = local20;
			this.anInt601 = this.anInt605;
			this.anInt602 = this.anInt606;
			this.anInt603 = 0;
			this.anInt604 = 0;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("81898, " + true + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SFVBUBEZ", name = "a", descriptor = "(B)V")
	public void method402(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt601 != this.anInt605 || this.anInt602 != this.anInt606) {
				@Pc(19) byte[] local19 = new byte[this.anInt605 * this.anInt606];
				@Pc(21) int local21 = 0;
				@Pc(26) boolean local26 = false;
				for (@Pc(38) int local38 = 0; local38 < this.anInt602; local38++) {
					for (@Pc(42) int local42 = 0; local42 < this.anInt601; local42++) {
						local19[local42 + this.anInt603 + (local38 + this.anInt604) * this.anInt605] = this.aByteArray19[local21++];
					}
				}
				this.aByteArray19 = local19;
				this.anInt601 = this.anInt605;
				this.anInt602 = this.anInt606;
				this.anInt603 = 0;
				this.anInt604 = 0;
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("79052, " + arg0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SFVBUBEZ", name = "b", descriptor = "(Z)V")
	public void method403() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt601 * this.anInt602];
			@Pc(13) int local13 = 0;
			for (@Pc(15) int local15 = 0; local15 < this.anInt602; local15++) {
				for (@Pc(22) int local22 = this.anInt601 - 1; local22 >= 0; local22--) {
					local8[local13++] = this.aByteArray19[local22 + local15 * this.anInt601];
				}
			}
			this.aByteArray19 = local8;
			this.anInt603 = this.anInt605 - this.anInt601 - this.anInt603;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("21491, " + true + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SFVBUBEZ", name = "c", descriptor = "(Z)V")
	public void method404() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt601 * this.anInt602];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt602 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt601; local19++) {
					local8[local10++] = this.aByteArray19[local19 + local15 * this.anInt601];
				}
			}
			this.aByteArray19 = local8;
			this.anInt604 = this.anInt606 - this.anInt602 - this.anInt604;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("38153, " + false + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SFVBUBEZ", name = "a", descriptor = "(IIII)V")
	public void method405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 < 0) {
				for (@Pc(8) int local8 = 0; local8 < this.anIntArray164.length; local8++) {
					@Pc(19) int local19 = this.anIntArray164[local8] >> 16 & 0xFF;
					local19 += arg0;
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 255) {
						local19 = 255;
					}
					@Pc(43) int local43 = this.anIntArray164[local8] >> 8 & 0xFF;
					local43 += arg1;
					if (local43 < 0) {
						local43 = 0;
					} else if (local43 > 255) {
						local43 = 255;
					}
					@Pc(65) int local65 = this.anIntArray164[local8] & 0xFF;
					local65 += arg2;
					if (local65 < 0) {
						local65 = 0;
					} else if (local65 > 255) {
						local65 = 255;
					}
					this.anIntArray164[local8] = (local19 << 16) + (local43 << 8) + local65;
				}
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("70114, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SFVBUBEZ", name = "a", descriptor = "(III)V")
	public void method406(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt603;
			arg0 += this.anInt604;
			@Pc(25) int local25 = arg1 + arg0 * Class8_Sub1_Sub2.anInt806;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt602;
			@Pc(33) int local33 = this.anInt601;
			@Pc(37) int local37 = Class8_Sub1_Sub2.anInt806 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg0 < Class8_Sub1_Sub2.anInt808) {
				local46 = Class8_Sub1_Sub2.anInt808 - arg0;
				local30 -= local46;
				arg0 = Class8_Sub1_Sub2.anInt808;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class8_Sub1_Sub2.anInt806;
			}
			if (arg0 + local30 > Class8_Sub1_Sub2.anInt809) {
				local30 -= arg0 + local30 - Class8_Sub1_Sub2.anInt809;
			}
			if (arg1 < Class8_Sub1_Sub2.anInt810) {
				local46 = Class8_Sub1_Sub2.anInt810 - arg1;
				local33 -= local46;
				arg1 = Class8_Sub1_Sub2.anInt810;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg1 + local33 > Class8_Sub1_Sub2.anInt811) {
				local46 = arg1 + local33 - Class8_Sub1_Sub2.anInt811;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method407(this.aByteArray19, local37, local30, local25, this.anIntArray164, local39, Class8_Sub1_Sub2.anIntArray201, local33, local27);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("12183, " + -40219 + ", " + arg0 + ", " + arg1 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SFVBUBEZ", name = "a", descriptor = "([BIII[II[IIII)V")
	private void method407(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			@Pc(9) int local9 = -(arg7 >> 2);
			@Pc(14) int local14 = -(arg7 & 0x3);
			for (@Pc(17) int local17 = -arg2; local17 < 0; local17++) {
				for (@Pc(21) int local21 = local9; local21 < 0; local21++) {
					@Pc(28) byte local28 = arg0[arg8++];
					if (local28 == 0) {
						arg3++;
					} else {
						arg6[arg3++] = arg4[local28 & 0xFF];
					}
					local28 = arg0[arg8++];
					if (local28 == 0) {
						arg3++;
					} else {
						arg6[arg3++] = arg4[local28 & 0xFF];
					}
					local28 = arg0[arg8++];
					if (local28 == 0) {
						arg3++;
					} else {
						arg6[arg3++] = arg4[local28 & 0xFF];
					}
					local28 = arg0[arg8++];
					if (local28 == 0) {
						arg3++;
					} else {
						arg6[arg3++] = arg4[local28 & 0xFF];
					}
				}
				for (@Pc(104) int local104 = local14; local104 < 0; local104++) {
					@Pc(111) byte local111 = arg0[arg8++];
					if (local111 == 0) {
						arg3++;
					} else {
						arg6[arg3++] = arg4[local111 & 0xFF];
					}
				}
				arg3 += arg1;
				arg8 += arg5;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("74107, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 0 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}

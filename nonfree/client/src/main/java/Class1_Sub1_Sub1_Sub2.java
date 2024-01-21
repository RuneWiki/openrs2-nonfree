import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DSMJIEPN")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!DSMJIEPN", name = "x", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!DSMJIEPN", name = "y", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!DSMJIEPN", name = "z", descriptor = "I")
	private int anInt304 = 360;

	@OriginalMember(owner = "client!DSMJIEPN", name = "A", descriptor = "B")
	private byte aByte5 = 3;

	@OriginalMember(owner = "client!DSMJIEPN", name = "H", descriptor = "I")
	public int anInt309;

	@OriginalMember(owner = "client!DSMJIEPN", name = "I", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!DSMJIEPN", name = "C", descriptor = "[I")
	public int[] anIntArray53;

	@OriginalMember(owner = "client!DSMJIEPN", name = "F", descriptor = "I")
	public int anInt307;

	@OriginalMember(owner = "client!DSMJIEPN", name = "G", descriptor = "I")
	public int anInt308;

	@OriginalMember(owner = "client!DSMJIEPN", name = "D", descriptor = "I")
	public int anInt305;

	@OriginalMember(owner = "client!DSMJIEPN", name = "E", descriptor = "I")
	public int anInt306;

	@OriginalMember(owner = "client!DSMJIEPN", name = "B", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!DSMJIEPN", name = "<init>", descriptor = "(Lclient!XTGLDHGX;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) Class44 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method484(arg1 + ".dat", null), 891);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method484("index.dat", null), 891);
		local37.anInt468 = local28.method270();
		this.anInt309 = local37.method270();
		this.anInt310 = local37.method270();
		@Pc(52) int local52 = local37.method268();
		this.anIntArray53 = new int[local52];
		for (@Pc(58) int local58 = 0; local58 < local52 - 1; local58++) {
			this.anIntArray53[local58 + 1] = local37.method272();
		}
		for (@Pc(76) int local76 = 0; local76 < arg2; local76++) {
			local37.anInt468 += 2;
			local28.anInt468 += local37.method270() * local37.method270();
			local37.anInt468++;
		}
		this.anInt307 = local37.method268();
		this.anInt308 = local37.method268();
		this.anInt305 = local37.method270();
		this.anInt306 = local37.method270();
		@Pc(123) int local123 = local37.method268();
		@Pc(129) int local129 = this.anInt305 * this.anInt306;
		this.aByteArray3 = new byte[local129];
		@Pc(137) int local137;
		if (local123 == 0) {
			for (local137 = 0; local137 < local129; local137++) {
				this.aByteArray3[local137] = local28.method269();
			}
		} else if (local123 == 1) {
			for (local137 = 0; local137 < this.anInt305; local137++) {
				for (@Pc(159) int local159 = 0; local159 < this.anInt306; local159++) {
					this.aByteArray3[local137 + local159 * this.anInt305] = local28.method269();
				}
			}
		}
	}

	@OriginalMember(owner = "client!DSMJIEPN", name = "b", descriptor = "(Z)V")
	public void method150() {
		try {
			this.anInt309 /= 2;
			this.anInt310 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt309 * this.anInt310];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt306; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt305; local28++) {
					local20[(local28 + this.anInt307 >> 1) + (local24 + this.anInt308 >> 1) * this.anInt309] = this.aByteArray3[local22++];
				}
			}
			this.aByteArray3 = local20;
			this.anInt305 = this.anInt309;
			this.anInt306 = this.anInt310;
			this.anInt307 = 0;
			this.anInt308 = 0;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("3441, " + false + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DSMJIEPN", name = "c", descriptor = "(Z)V")
	public void method151() {
		try {
			if (this.anInt305 != this.anInt309 || this.anInt306 != this.anInt310) {
				@Pc(19) byte[] local19 = new byte[this.anInt309 * this.anInt310];
				@Pc(24) int local24 = 0;
				for (@Pc(26) int local26 = 0; local26 < this.anInt306; local26++) {
					for (@Pc(30) int local30 = 0; local30 < this.anInt305; local30++) {
						local19[local30 + this.anInt307 + (local26 + this.anInt308) * this.anInt309] = this.aByteArray3[local24++];
					}
				}
				this.aByteArray3 = local19;
				this.anInt305 = this.anInt309;
				this.anInt306 = this.anInt310;
				this.anInt307 = 0;
				this.anInt308 = 0;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("98615, " + false + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DSMJIEPN", name = "b", descriptor = "(I)V")
	public void method152() {
		try {
			@Pc(11) byte[] local11 = new byte[this.anInt305 * this.anInt306];
			@Pc(13) int local13 = 0;
			for (@Pc(15) int local15 = 0; local15 < this.anInt306; local15++) {
				for (@Pc(22) int local22 = this.anInt305 - 1; local22 >= 0; local22--) {
					local11[local13++] = this.aByteArray3[local22 + local15 * this.anInt305];
				}
			}
			this.aByteArray3 = local11;
			this.anInt307 = this.anInt309 - this.anInt305 - this.anInt307;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("29743, " + 0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DSMJIEPN", name = "d", descriptor = "(Z)V")
	public void method153() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt305 * this.anInt306];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt306 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt305; local19++) {
					local8[local10++] = this.aByteArray3[local19 + local15 * this.anInt305];
				}
			}
			this.aByteArray3 = local8;
			this.anInt308 = this.anInt310 - this.anInt306 - this.anInt308;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("69044, " + true + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DSMJIEPN", name = "a", descriptor = "(IIII)V")
	public void method154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray53.length; local3++) {
				@Pc(14) int local14 = this.anIntArray53[local3] >> 16 & 0xFF;
				local14 += arg0;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray53[local3] >> 8 & 0xFF;
				local38 += arg1;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray53[local3] & 0xFF;
				local60 += arg2;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray53[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("3108, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DSMJIEPN", name = "a", descriptor = "(III)V")
	public void method155(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt307;
			arg1 += this.anInt308;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub1.anInt729;
			@Pc(17) int local17 = 0;
			@Pc(24) int local24 = this.anInt306;
			@Pc(27) int local27 = this.anInt305;
			@Pc(31) int local31 = Class1_Sub1_Sub1.anInt729 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class1_Sub1_Sub1.anInt731) {
				local40 = Class1_Sub1_Sub1.anInt731 - arg1;
				local24 -= local40;
				arg1 = Class1_Sub1_Sub1.anInt731;
				local17 = local40 * local27 + 0;
				local15 += local40 * Class1_Sub1_Sub1.anInt729;
			}
			if (arg1 + local24 > Class1_Sub1_Sub1.anInt732) {
				local24 -= arg1 + local24 - Class1_Sub1_Sub1.anInt732;
			}
			if (arg0 < Class1_Sub1_Sub1.anInt733) {
				local40 = Class1_Sub1_Sub1.anInt733 - arg0;
				local27 -= local40;
				arg0 = Class1_Sub1_Sub1.anInt733;
				local17 += local40;
				local15 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class1_Sub1_Sub1.anInt734) {
				local40 = arg0 + local27 - Class1_Sub1_Sub1.anInt734;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method156(local24, Class1_Sub1_Sub1.anIntArray155, this.aByteArray3, local31, local15, local27, local17, this.anIntArray53, local33);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("58630, " + arg0 + ", " + 16083 + ", " + arg1 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DSMJIEPN", name = "a", descriptor = "(IB[I[BIIII[II)V")
	private void method156(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(17) int local17 = -(arg5 >> 2);
			@Pc(22) int local22 = -(arg5 & 0x3);
			for (@Pc(25) int local25 = -arg0; local25 < 0; local25++) {
				for (@Pc(29) int local29 = local17; local29 < 0; local29++) {
					@Pc(36) byte local36 = arg2[arg6++];
					if (local36 == 0) {
						arg4++;
					} else {
						arg1[arg4++] = arg7[local36 & 0xFF];
					}
					local36 = arg2[arg6++];
					if (local36 == 0) {
						arg4++;
					} else {
						arg1[arg4++] = arg7[local36 & 0xFF];
					}
					local36 = arg2[arg6++];
					if (local36 == 0) {
						arg4++;
					} else {
						arg1[arg4++] = arg7[local36 & 0xFF];
					}
					local36 = arg2[arg6++];
					if (local36 == 0) {
						arg4++;
					} else {
						arg1[arg4++] = arg7[local36 & 0xFF];
					}
				}
				for (@Pc(112) int local112 = local22; local112 < 0; local112++) {
					@Pc(119) byte local119 = arg2[arg6++];
					if (local119 == 0) {
						arg4++;
					} else {
						arg1[arg4++] = arg7[local119 & 0xFF];
					}
				}
				arg4 += arg3;
				arg6 += arg8;
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("41026, " + arg0 + ", " + 9 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}
}

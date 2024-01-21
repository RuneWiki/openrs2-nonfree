import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BVXAXAEI")
public final class Class1_Sub2_Sub1_Sub1 extends Class1_Sub2_Sub1 {

	@OriginalMember(owner = "client!BVXAXAEI", name = "x", descriptor = "Z")
	private boolean aBoolean17 = false;

	@OriginalMember(owner = "client!BVXAXAEI", name = "y", descriptor = "I")
	private int anInt59 = 10685;

	@OriginalMember(owner = "client!BVXAXAEI", name = "z", descriptor = "I")
	private int anInt60 = -44900;

	@OriginalMember(owner = "client!BVXAXAEI", name = "A", descriptor = "B")
	private byte aByte3 = 92;

	@OriginalMember(owner = "client!BVXAXAEI", name = "B", descriptor = "B")
	private byte aByte4 = 92;

	@OriginalMember(owner = "client!BVXAXAEI", name = "C", descriptor = "I")
	private int anInt61 = 186;

	@OriginalMember(owner = "client!BVXAXAEI", name = "J", descriptor = "I")
	public int anInt66;

	@OriginalMember(owner = "client!BVXAXAEI", name = "K", descriptor = "I")
	private int anInt67;

	@OriginalMember(owner = "client!BVXAXAEI", name = "E", descriptor = "[I")
	public int[] anIntArray5;

	@OriginalMember(owner = "client!BVXAXAEI", name = "H", descriptor = "I")
	public int anInt64;

	@OriginalMember(owner = "client!BVXAXAEI", name = "I", descriptor = "I")
	public int anInt65;

	@OriginalMember(owner = "client!BVXAXAEI", name = "F", descriptor = "I")
	public int anInt62;

	@OriginalMember(owner = "client!BVXAXAEI", name = "G", descriptor = "I")
	public int anInt63;

	@OriginalMember(owner = "client!BVXAXAEI", name = "D", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!BVXAXAEI", name = "<init>", descriptor = "(Lclient!NXFIIFAD;Ljava/lang/String;I)V")
	public Class1_Sub2_Sub1_Sub1(@OriginalArg(0) Class31 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(37) Class1_Sub2_Sub3 local37 = new Class1_Sub2_Sub3(arg0.method352(arg1 + ".dat", null), -670);
		@Pc(46) Class1_Sub2_Sub3 local46 = new Class1_Sub2_Sub3(arg0.method352("index.dat", null), -670);
		local46.anInt474 = local37.method309();
		this.anInt66 = local46.method309();
		this.anInt67 = local46.method309();
		@Pc(61) int local61 = local46.method307();
		this.anIntArray5 = new int[local61];
		for (@Pc(67) int local67 = 0; local67 < local61 - 1; local67++) {
			this.anIntArray5[local67 + 1] = local46.method311();
		}
		for (@Pc(85) int local85 = 0; local85 < arg2; local85++) {
			local46.anInt474 += 2;
			local37.anInt474 += local46.method309() * local46.method309();
			local46.anInt474++;
		}
		this.anInt64 = local46.method307();
		this.anInt65 = local46.method307();
		this.anInt62 = local46.method309();
		this.anInt63 = local46.method309();
		@Pc(132) int local132 = local46.method307();
		@Pc(138) int local138 = this.anInt62 * this.anInt63;
		this.aByteArray1 = new byte[local138];
		@Pc(146) int local146;
		if (local132 == 0) {
			for (local146 = 0; local146 < local138; local146++) {
				this.aByteArray1[local146] = local37.method308();
			}
		} else if (local132 == 1) {
			for (local146 = 0; local146 < this.anInt62; local146++) {
				for (@Pc(168) int local168 = 0; local168 < this.anInt63; local168++) {
					this.aByteArray1[local146 + local168 * this.anInt62] = local37.method308();
				}
			}
		}
	}

	@OriginalMember(owner = "client!BVXAXAEI", name = "b", descriptor = "(I)V")
	public void method46() {
		try {
			this.anInt66 /= 2;
			this.anInt67 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt66 * this.anInt67];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt63; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt62; local28++) {
					local20[(local28 + this.anInt64 >> 1) + (local24 + this.anInt65 >> 1) * this.anInt66] = this.aByteArray1[local22++];
				}
			}
			this.aByteArray1 = local20;
			this.anInt62 = this.anInt66;
			this.anInt63 = this.anInt67;
			this.anInt64 = 0;
			this.anInt65 = 0;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("58272, " + 0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVXAXAEI", name = "a", descriptor = "(Z)V")
	public void method47() {
		try {
			if (this.anInt62 != this.anInt66 || this.anInt63 != this.anInt67) {
				@Pc(22) byte[] local22 = new byte[this.anInt66 * this.anInt67];
				@Pc(24) int local24 = 0;
				for (@Pc(26) int local26 = 0; local26 < this.anInt63; local26++) {
					for (@Pc(30) int local30 = 0; local30 < this.anInt62; local30++) {
						local22[local30 + this.anInt64 + (local26 + this.anInt65) * this.anInt66] = this.aByteArray1[local24++];
					}
				}
				this.aByteArray1 = local22;
				this.anInt62 = this.anInt66;
				this.anInt63 = this.anInt67;
				this.anInt64 = 0;
				this.anInt65 = 0;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("79980, " + false + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVXAXAEI", name = "b", descriptor = "(B)V")
	public void method48() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt62 * this.anInt63];
			@Pc(10) int local10 = 0;
			for (@Pc(22) int local22 = 0; local22 < this.anInt63; local22++) {
				for (@Pc(29) int local29 = this.anInt62 - 1; local29 >= 0; local29--) {
					local8[local10++] = this.aByteArray1[local29 + local22 * this.anInt62];
				}
			}
			this.aByteArray1 = local8;
			this.anInt64 = this.anInt66 - this.anInt62 - this.anInt64;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("33757, " + 6 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVXAXAEI", name = "b", descriptor = "(Z)V")
	public void method49() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt62 * this.anInt63];
			@Pc(10) int local10 = 0;
			for (@Pc(18) int local18 = this.anInt63 - 1; local18 >= 0; local18--) {
				for (@Pc(22) int local22 = 0; local22 < this.anInt62; local22++) {
					local8[local10++] = this.aByteArray1[local22 + local18 * this.anInt62];
				}
			}
			this.aByteArray1 = local8;
			this.anInt65 = this.anInt67 - this.anInt63 - this.anInt65;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("37572, " + false + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVXAXAEI", name = "a", descriptor = "(IIIZ)V")
	public void method50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray5.length; local3++) {
				@Pc(14) int local14 = this.anIntArray5[local3] >> 16 & 0xFF;
				local14 += arg1;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray5[local3] >> 8 & 0xFF;
				local38 += arg0;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray5[local3] & 0xFF;
				local60 += arg2;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray5[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("37346, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVXAXAEI", name = "a", descriptor = "(III)V")
	public void method51(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt64;
			arg0 += this.anInt65;
			@Pc(26) int local26 = arg1 + arg0 * Class1_Sub2_Sub1.anInt710;
			@Pc(28) int local28 = 0;
			@Pc(31) int local31 = this.anInt63;
			@Pc(34) int local34 = this.anInt62;
			@Pc(38) int local38 = Class1_Sub2_Sub1.anInt710 - local34;
			@Pc(40) int local40 = 0;
			@Pc(47) int local47;
			if (arg0 < Class1_Sub2_Sub1.anInt712) {
				local47 = Class1_Sub2_Sub1.anInt712 - arg0;
				local31 -= local47;
				arg0 = Class1_Sub2_Sub1.anInt712;
				local28 = local47 * local34 + 0;
				local26 += local47 * Class1_Sub2_Sub1.anInt710;
			}
			if (arg0 + local31 > Class1_Sub2_Sub1.anInt713) {
				local31 -= arg0 + local31 - Class1_Sub2_Sub1.anInt713;
			}
			if (arg1 < Class1_Sub2_Sub1.anInt714) {
				local47 = Class1_Sub2_Sub1.anInt714 - arg1;
				local34 -= local47;
				arg1 = Class1_Sub2_Sub1.anInt714;
				local28 += local47;
				local26 += local47;
				local40 = local47 + 0;
				local38 += local47;
			}
			if (arg1 + local34 > Class1_Sub2_Sub1.anInt715) {
				local47 = arg1 + local34 - Class1_Sub2_Sub1.anInt715;
				local34 -= local47;
				local40 += local47;
				local38 += local47;
			}
			if (local34 > 0 && local31 > 0) {
				this.method52(local26, local38, this.anIntArray5, local40, Class1_Sub2_Sub1.anIntArray198, local34, local28, local31, this.aByteArray1);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("85957, " + 48946 + ", " + arg0 + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVXAXAEI", name = "a", descriptor = "(II[II[IIIII[B)V")
	private void method52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8) {
		try {
			@Pc(6) int local6 = -(arg5 >> 2);
			@Pc(11) int local11 = -(arg5 & 0x3);
			for (@Pc(14) int local14 = -arg7; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					@Pc(25) byte local25 = arg8[arg6++];
					if (local25 == 0) {
						arg0++;
					} else {
						arg4[arg0++] = arg2[local25 & 0xFF];
					}
					local25 = arg8[arg6++];
					if (local25 == 0) {
						arg0++;
					} else {
						arg4[arg0++] = arg2[local25 & 0xFF];
					}
					local25 = arg8[arg6++];
					if (local25 == 0) {
						arg0++;
					} else {
						arg4[arg0++] = arg2[local25 & 0xFF];
					}
					local25 = arg8[arg6++];
					if (local25 == 0) {
						arg0++;
					} else {
						arg4[arg0++] = arg2[local25 & 0xFF];
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					@Pc(108) byte local108 = arg8[arg6++];
					if (local108 == 0) {
						arg0++;
					} else {
						arg4[arg0++] = arg2[local108 & 0xFF];
					}
				}
				arg0 += arg1;
				arg6 += arg3;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("21445, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}

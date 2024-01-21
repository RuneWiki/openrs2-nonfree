import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KWBPZBYX")
public final class Class4_Sub1_Sub2_Sub2 extends Class4_Sub1_Sub2 {

	@OriginalMember(owner = "client!KWBPZBYX", name = "y", descriptor = "I")
	private int anInt392 = 11603;

	@OriginalMember(owner = "client!KWBPZBYX", name = "z", descriptor = "I")
	private int anInt393 = 262;

	@OriginalMember(owner = "client!KWBPZBYX", name = "A", descriptor = "B")
	private byte aByte11 = 3;

	@OriginalMember(owner = "client!KWBPZBYX", name = "B", descriptor = "I")
	private int anInt394 = -8226;

	@OriginalMember(owner = "client!KWBPZBYX", name = "C", descriptor = "B")
	private byte aByte12 = 2;

	@OriginalMember(owner = "client!KWBPZBYX", name = "D", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!KWBPZBYX", name = "K", descriptor = "I")
	public int anInt399;

	@OriginalMember(owner = "client!KWBPZBYX", name = "L", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!KWBPZBYX", name = "F", descriptor = "[I")
	public int[] anIntArray74;

	@OriginalMember(owner = "client!KWBPZBYX", name = "I", descriptor = "I")
	public int anInt397;

	@OriginalMember(owner = "client!KWBPZBYX", name = "J", descriptor = "I")
	public int anInt398;

	@OriginalMember(owner = "client!KWBPZBYX", name = "G", descriptor = "I")
	public int anInt395;

	@OriginalMember(owner = "client!KWBPZBYX", name = "H", descriptor = "I")
	public int anInt396;

	@OriginalMember(owner = "client!KWBPZBYX", name = "E", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!KWBPZBYX", name = "<init>", descriptor = "(Lclient!QDHHNYHL;Ljava/lang/String;I)V")
	public Class4_Sub1_Sub2_Sub2(@OriginalArg(0) Class32 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(37) Class4_Sub1_Sub4 local37 = new Class4_Sub1_Sub4(5, arg0.method426(arg1 + ".dat", null));
		@Pc(46) Class4_Sub1_Sub4 local46 = new Class4_Sub1_Sub4(5, arg0.method426("index.dat", null));
		local46.anInt506 = local37.method357();
		this.anInt399 = local46.method357();
		this.anInt400 = local46.method357();
		@Pc(61) int local61 = local46.method355();
		this.anIntArray74 = new int[local61];
		for (@Pc(67) int local67 = 0; local67 < local61 - 1; local67++) {
			this.anIntArray74[local67 + 1] = local46.method359();
		}
		for (@Pc(91) int local91 = 0; local91 < arg2; local91++) {
			local46.anInt506 += 2;
			local37.anInt506 += local46.method357() * local46.method357();
			local46.anInt506++;
		}
		this.anInt397 = local46.method355();
		this.anInt398 = local46.method355();
		this.anInt395 = local46.method357();
		this.anInt396 = local46.method357();
		@Pc(138) int local138 = local46.method355();
		@Pc(144) int local144 = this.anInt395 * this.anInt396;
		this.aByteArray9 = new byte[local144];
		@Pc(152) int local152;
		if (local138 == 0) {
			for (local152 = 0; local152 < local144; local152++) {
				this.aByteArray9[local152] = local37.method356();
			}
		} else if (local138 == 1) {
			for (local152 = 0; local152 < this.anInt395; local152++) {
				for (@Pc(174) int local174 = 0; local174 < this.anInt396; local174++) {
					this.aByteArray9[local152 + local174 * this.anInt395] = local37.method356();
				}
			}
		}
	}

	@OriginalMember(owner = "client!KWBPZBYX", name = "a", descriptor = "(B)V")
	public void method291() {
		try {
			this.anInt399 /= 2;
			this.anInt400 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt399 * this.anInt400];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt396; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt395; local28++) {
					local20[(local28 + this.anInt397 >> 1) + (local24 + this.anInt398 >> 1) * this.anInt399] = this.aByteArray9[local22++];
				}
			}
			this.aByteArray9 = local20;
			this.anInt395 = this.anInt399;
			this.anInt396 = this.anInt400;
			this.anInt397 = 0;
			this.anInt398 = 0;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("9879, " + 126 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KWBPZBYX", name = "b", descriptor = "(I)V")
	public void method292(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = true;
			if (this.anInt395 != this.anInt399 || this.anInt396 != this.anInt400) {
				@Pc(23) byte[] local23 = new byte[this.anInt399 * this.anInt400];
				@Pc(25) int local25 = 0;
				for (@Pc(27) int local27 = 0; local27 < this.anInt396; local27++) {
					for (@Pc(31) int local31 = 0; local31 < this.anInt395; local31++) {
						local23[local31 + this.anInt397 + (local27 + this.anInt398) * this.anInt399] = this.aByteArray9[local25++];
					}
				}
				this.aByteArray9 = local23;
				this.anInt395 = this.anInt399;
				this.anInt396 = this.anInt400;
				this.anInt397 = 0;
				this.anInt398 = 0;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("76412, " + arg0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KWBPZBYX", name = "c", descriptor = "(I)V")
	public void method293() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt395 * this.anInt396];
			if (this.anInt394 != -8226) {
				this.anInt394 = -461;
			}
			@Pc(17) int local17 = 0;
			for (@Pc(19) int local19 = 0; local19 < this.anInt396; local19++) {
				for (@Pc(26) int local26 = this.anInt395 - 1; local26 >= 0; local26--) {
					local8[local17++] = this.aByteArray9[local26 + local19 * this.anInt395];
				}
			}
			this.aByteArray9 = local8;
			this.anInt397 = this.anInt399 - this.anInt395 - this.anInt397;
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("76532, " + -8226 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KWBPZBYX", name = "d", descriptor = "(I)V")
	public void method294() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt395 * this.anInt396];
			@Pc(13) int local13 = 0;
			for (@Pc(18) int local18 = this.anInt396 - 1; local18 >= 0; local18--) {
				for (@Pc(22) int local22 = 0; local22 < this.anInt395; local22++) {
					local8[local13++] = this.aByteArray9[local22 + local18 * this.anInt395];
				}
			}
			this.aByteArray9 = local8;
			this.anInt398 = this.anInt400 - this.anInt396 - this.anInt398;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("15690, " + 775 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KWBPZBYX", name = "a", descriptor = "(IIIB)V")
	public void method295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray74.length; local17++) {
				@Pc(28) int local28 = this.anIntArray74[local17] >> 16 & 0xFF;
				local28 += arg0;
				if (local28 < 0) {
					local28 = 0;
				} else if (local28 > 255) {
					local28 = 255;
				}
				@Pc(52) int local52 = this.anIntArray74[local17] >> 8 & 0xFF;
				local52 += arg2;
				if (local52 < 0) {
					local52 = 0;
				} else if (local52 > 255) {
					local52 = 255;
				}
				@Pc(74) int local74 = this.anIntArray74[local17] & 0xFF;
				local74 += arg1;
				if (local74 < 0) {
					local74 = 0;
				} else if (local74 > 255) {
					local74 = 255;
				}
				this.anIntArray74[local17] = (local28 << 16) + (local52 << 8) + local74;
			}
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("42480, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KWBPZBYX", name = "a", descriptor = "(IIZ)V")
	public void method296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt397;
			arg1 += this.anInt398;
			@Pc(25) int local25 = arg0 + arg1 * Class4_Sub1_Sub2.anInt688;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt396;
			@Pc(33) int local33 = this.anInt395;
			@Pc(37) int local37 = Class4_Sub1_Sub2.anInt688 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg1 < Class4_Sub1_Sub2.anInt690) {
				local46 = Class4_Sub1_Sub2.anInt690 - arg1;
				local30 -= local46;
				arg1 = Class4_Sub1_Sub2.anInt690;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class4_Sub1_Sub2.anInt688;
			}
			if (arg1 + local30 > Class4_Sub1_Sub2.anInt691) {
				local30 -= arg1 + local30 - Class4_Sub1_Sub2.anInt691;
			}
			if (arg0 < Class4_Sub1_Sub2.anInt692) {
				local46 = Class4_Sub1_Sub2.anInt692 - arg0;
				local33 -= local46;
				arg0 = Class4_Sub1_Sub2.anInt692;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg0 + local33 > Class4_Sub1_Sub2.anInt693) {
				local46 = arg0 + local33 - Class4_Sub1_Sub2.anInt693;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method297(local39, local27, this.aByteArray9, local33, local30, local37, this.aByte12, Class4_Sub1_Sub2.anIntArray164, this.anIntArray74, local25);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("87397, " + arg0 + ", " + arg1 + ", " + false + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KWBPZBYX", name = "a", descriptor = "(II[BIIIB[I[II)V")
	private void method297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(6) int local6 = -(arg3 >> 2);
			@Pc(11) int local11 = -(arg3 & 0x3);
			if (arg6 == 2) {
				@Pc(16) boolean local16 = false;
			} else {
				this.anInt392 = -497;
			}
			for (@Pc(24) int local24 = -arg4; local24 < 0; local24++) {
				for (@Pc(28) int local28 = local6; local28 < 0; local28++) {
					@Pc(35) byte local35 = arg2[arg1++];
					if (local35 == 0) {
						arg9++;
					} else {
						arg7[arg9++] = arg8[local35 & 0xFF];
					}
					local35 = arg2[arg1++];
					if (local35 == 0) {
						arg9++;
					} else {
						arg7[arg9++] = arg8[local35 & 0xFF];
					}
					local35 = arg2[arg1++];
					if (local35 == 0) {
						arg9++;
					} else {
						arg7[arg9++] = arg8[local35 & 0xFF];
					}
					local35 = arg2[arg1++];
					if (local35 == 0) {
						arg9++;
					} else {
						arg7[arg9++] = arg8[local35 & 0xFF];
					}
				}
				for (@Pc(111) int local111 = local11; local111 < 0; local111++) {
					@Pc(118) byte local118 = arg2[arg1++];
					if (local118 == 0) {
						arg9++;
					} else {
						arg7[arg9++] = arg8[local118 & 0xFF];
					}
				}
				arg9 += arg5;
				arg1 += arg0;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("12633, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}

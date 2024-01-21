import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jb")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "Z")
	private boolean aBoolean176 = false;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
	private int anInt665 = 9;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	public int anInt670;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
	private int anInt671;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "[I")
	public int[] anIntArray211;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	public int anInt668;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public int anInt669;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
	public int anInt666;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
	public int anInt667;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method662(arg1 + ".dat", null), 15787);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method662("index.dat", null), 15787);
		local37.anInt734 = local28.method478();
		this.anInt670 = local37.method478();
		this.anInt671 = local37.method478();
		@Pc(52) int local52 = local37.method476();
		this.anIntArray211 = new int[local52];
		for (@Pc(58) int local58 = 0; local58 < local52 - 1; local58++) {
			this.anIntArray211[local58 + 1] = local37.method480();
		}
		for (@Pc(76) int local76 = 0; local76 < arg2; local76++) {
			local37.anInt734 += 2;
			local28.anInt734 += local37.method478() * local37.method478();
			local37.anInt734++;
		}
		this.anInt668 = local37.method476();
		this.anInt669 = local37.method476();
		this.anInt666 = local37.method478();
		this.anInt667 = local37.method478();
		@Pc(123) int local123 = local37.method476();
		@Pc(129) int local129 = this.anInt666 * this.anInt667;
		this.aByteArray7 = new byte[local129];
		@Pc(137) int local137;
		if (local123 == 0) {
			for (local137 = 0; local137 < local129; local137++) {
				this.aByteArray7[local137] = local28.method477();
			}
		} else if (local123 == 1) {
			for (local137 = 0; local137 < this.anInt666; local137++) {
				for (@Pc(159) int local159 = 0; local159 < this.anInt667; local159++) {
					this.aByteArray7[local137 + local159 * this.anInt666] = local28.method477();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public void method410() {
		try {
			this.anInt670 /= 2;
			this.anInt671 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt670 * this.anInt671];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt667; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt666; local28++) {
					local20[(local28 + this.anInt668 >> 1) + (local24 + this.anInt669 >> 1) * this.anInt670] = this.aByteArray7[local22++];
				}
			}
			this.aByteArray7 = local20;
			this.anInt666 = this.anInt670;
			this.anInt667 = this.anInt671;
			this.anInt668 = 0;
			this.anInt669 = 0;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("96890, " + 0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public void method411() {
		try {
			if (this.anInt666 != this.anInt670 || this.anInt667 != this.anInt671) {
				@Pc(19) byte[] local19 = new byte[this.anInt670 * this.anInt671];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt667; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt666; local27++) {
						local19[local27 + this.anInt668 + (local23 + this.anInt669) * this.anInt670] = this.aByteArray7[local21++];
					}
				}
				this.aByteArray7 = local19;
				this.anInt666 = this.anInt670;
				this.anInt667 = this.anInt671;
				this.anInt668 = 0;
				this.anInt669 = 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("81667, " + 9 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public void method412() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt666 * this.anInt667];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt667; local12++) {
				for (@Pc(19) int local19 = this.anInt666 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray7[local19 + local12 * this.anInt666];
				}
			}
			this.aByteArray7 = local8;
			this.anInt668 = this.anInt670 - this.anInt666 - this.anInt668;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("28636, " + 6 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
	public void method413() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt666 * this.anInt667];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt667 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt666; local19++) {
					local8[local10++] = this.aByteArray7[local19 + local15 * this.anInt666];
				}
			}
			this.aByteArray7 = local8;
			this.anInt669 = this.anInt671 - this.anInt667 - this.anInt669;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("83103, " + 35509 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBII)V")
	public void method414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray211.length; local13++) {
				@Pc(24) int local24 = this.anIntArray211[local13] >> 16 & 0xFF;
				local24 += arg0;
				if (local24 < 0) {
					local24 = 0;
				} else if (local24 > 255) {
					local24 = 255;
				}
				@Pc(48) int local48 = this.anIntArray211[local13] >> 8 & 0xFF;
				local48 += arg1;
				if (local48 < 0) {
					local48 = 0;
				} else if (local48 > 255) {
					local48 = 255;
				}
				@Pc(70) int local70 = this.anIntArray211[local13] & 0xFF;
				local70 += arg2;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 > 255) {
					local70 = 255;
				}
				this.anIntArray211[local13] = (local24 << 16) + (local48 << 8) + local70;
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("28455, " + arg0 + ", " + 3 + ", " + arg1 + ", " + arg2 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBI)V")
	public void method415(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			arg2 += this.anInt668;
			arg0 += this.anInt669;
			if (arg1 == 1) {
				@Pc(19) int local19 = arg2 + arg0 * Class1_Sub1_Sub2.anInt688;
				@Pc(21) int local21 = 0;
				@Pc(24) int local24 = this.anInt667;
				@Pc(27) int local27 = this.anInt666;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt688 - local27;
				@Pc(33) int local33 = 0;
				@Pc(40) int local40;
				if (arg0 < Class1_Sub1_Sub2.anInt690) {
					local40 = Class1_Sub1_Sub2.anInt690 - arg0;
					local24 -= local40;
					arg0 = Class1_Sub1_Sub2.anInt690;
					local21 = local40 * local27 + 0;
					local19 += local40 * Class1_Sub1_Sub2.anInt688;
				}
				if (arg0 + local24 > Class1_Sub1_Sub2.anInt691) {
					local24 -= arg0 + local24 - Class1_Sub1_Sub2.anInt691;
				}
				if (arg2 < Class1_Sub1_Sub2.anInt692) {
					local40 = Class1_Sub1_Sub2.anInt692 - arg2;
					local27 -= local40;
					arg2 = Class1_Sub1_Sub2.anInt692;
					local21 += local40;
					local19 += local40;
					local33 = local40 + 0;
					local31 += local40;
				}
				if (arg2 + local27 > Class1_Sub1_Sub2.anInt693) {
					local40 = arg2 + local27 - Class1_Sub1_Sub2.anInt693;
					local27 -= local40;
					local33 += local40;
					local31 += local40;
				}
				if (local27 > 0 && local24 > 0) {
					this.method416(local24, this.anIntArray211, local19, Class1_Sub1_Sub2.anIntArray212, local33, local31, this.aByteArray7, local27, local21);
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("29131, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[II[IIIB[BII)V")
	private void method416(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg7 >> 2);
			@Pc(11) int local11 = -(arg7 & 0x3);
			for (@Pc(14) int local14 = -arg0; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					@Pc(25) byte local25 = arg6[arg8++];
					if (local25 == 0) {
						arg2++;
					} else {
						arg3[arg2++] = arg1[local25 & 0xFF];
					}
					local25 = arg6[arg8++];
					if (local25 == 0) {
						arg2++;
					} else {
						arg3[arg2++] = arg1[local25 & 0xFF];
					}
					local25 = arg6[arg8++];
					if (local25 == 0) {
						arg2++;
					} else {
						arg3[arg2++] = arg1[local25 & 0xFF];
					}
					local25 = arg6[arg8++];
					if (local25 == 0) {
						arg2++;
					} else {
						arg3[arg2++] = arg1[local25 & 0xFF];
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					@Pc(108) byte local108 = arg6[arg8++];
					if (local108 == 0) {
						arg2++;
					} else {
						arg3[arg2++] = arg1[local108 & 0xFF];
					}
				}
				arg2 += arg5;
				arg8 += arg4;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("42705, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 34 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}

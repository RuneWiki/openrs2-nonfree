import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
	private static int anInt779;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
	private static int anInt780;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
	private static int anInt781;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "B")
	private static byte aByte42 = 73;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "[I")
	private static int[] anIntArray225 = new int[256];

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "[I")
	private static final int[] anIntArray226;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "Lclient!pb;")
	private static Class31 aClass31_4;

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "Lclient!pb;")
	private static Class31 aClass31_5;

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "Lclient!pb;")
	private static Class31 aClass31_6;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
	private int anInt770;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	public int anInt777;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
	public int anInt778;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "Lclient!xb;")
	public Class47 aClass47_2;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	private int anInt771 = -742;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	private int anInt772 = -13;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "B")
	private byte aByte43 = 78;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
	private int anInt773 = -106;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
	private int anInt774 = 430;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
	private int anInt775 = 2;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "Z")
	private boolean aBoolean194 = false;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
	private int anInt776 = 977;

	@OriginalMember(owner = "client!mb", name = "G", descriptor = "[C")
	private char[] aCharArray3 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(9) int local9 = local6;
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if ((local9 & 0x1) == 1) {
					local9 = local9 >>> 1 ^ 0xEDB88320;
				} else {
					local9 >>>= 0x1;
				}
			}
			anIntArray225[local6] = local9;
		}
		anIntArray226 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass31_4 = new Class31(false);
		aClass31_5 = new Class31(false);
		aClass31_6 = new Class31(false);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)Lclient!mb;")
	public static Class1_Sub1_Sub3 method485() {
		try {
			@Pc(3) Class31 local3 = aClass31_5;
			synchronized (aClass31_5) {
				@Pc(7) Class1_Sub1_Sub3 local7 = null;
				if (anInt780 > 0) {
					anInt780--;
					local7 = (Class1_Sub1_Sub3) aClass31_5.method522();
				}
				if (local7 != null) {
					local7.anInt777 = 0;
					return local7;
				}
			}
			@Pc(69) Class1_Sub1_Sub3 local69 = new Class1_Sub1_Sub3(0);
			local69.anInt777 = 0;
			if (aByte42 != 73) {
				for (@Pc(77) int local77 = 1; local77 > 0; local77++) {
				}
			}
			local69.aByteArray9 = new byte[5000];
			return local69;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("8720, " + 1 + ", " + 73 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([BB)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(298) boolean local298 = false;
			this.aByteArray9 = arg0;
			this.anInt777 = 0;
		} catch (@Pc(318) RuntimeException local318) {
			signlink.reporterror("68607, " + arg0 + ", " + arg1 + ", " + local318.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public void method486() {
		try {
			@Pc(1) Class31 local1 = aClass31_5;
			synchronized (aClass31_5) {
				this.anInt777 = 0;
				if (this.aByteArray9.length == 100 && anInt779 < 1000) {
					aClass31_4.method520(this);
					anInt779++;
				} else if (this.aByteArray9.length == 5000 && anInt780 < 250) {
					aClass31_5.method520(this);
					anInt780++;
				} else if (this.aByteArray9.length == 30000 && anInt781 < 50) {
					aClass31_6.method520(this);
					anInt781++;
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("62987, " + -359 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	public void method487(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt777++] = (byte) (arg0 + this.aClass47_2.method674());
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("23734, " + 4 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public void method488(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt777++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public void method489(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt777++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V")
	public void method490(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt777++] = (byte) arg0;
			this.aByteArray9[this.anInt777++] = 0;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("11383, " + arg0 + ", " + 1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	public void method491(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt777++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
	public void method492(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt777++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IB)V")
	public void method493(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt777++] = (byte) arg0;
			this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 24);
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("17813, " + arg0 + ", " + 116 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IJ)V")
	public void method494(@OriginalArg(1) long arg0) {
		try {
			this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 56);
			this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 48);
			this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 40);
			this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 32);
			this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 24);
			this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt777++] = (byte) arg0;
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("82080, " + 854 + ", " + arg0 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method495(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt777);
		this.anInt777 += arg0.length();
		this.aByteArray9[this.anInt777++] = 10;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[BIZ)V")
	public void method496(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg1 + 0; local12++) {
				this.aByteArray9[this.anInt777++] = arg0[local12];
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("22473, " + 0 + ", " + arg0 + ", " + arg1 + ", " + false + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)V")
	public void method497(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt777 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("4960, " + arg0 + ", " + true + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "()I")
	public int method498() {
		return this.aByteArray9[this.anInt777++] & 0xFF;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "()B")
	public byte method499() {
		return this.aByteArray9[this.anInt777++];
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "()I")
	public int method500() {
		this.anInt777 += 2;
		return ((this.aByteArray9[this.anInt777 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt777 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "()I")
	public int method501() {
		this.anInt777 += 2;
		@Pc(27) int local27 = ((this.aByteArray9[this.anInt777 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt777 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "()I")
	public int method502() {
		this.anInt777 += 3;
		return ((this.aByteArray9[this.anInt777 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt777 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt777 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "()I")
	public int method503() {
		this.anInt777 += 4;
		return ((this.aByteArray9[this.anInt777 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt777 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt777 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt777 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)J")
	public long method504() {
		try {
			@Pc(5) long local5 = (long) this.method503() & 0xFFFFFFFFL;
			@Pc(21) long local21 = (long) this.method503() & 0xFFFFFFFFL;
			return (local5 << 32) + local21;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("19328, " + 0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method505() {
		@Pc(2) int local2 = this.anInt777;
		while (this.aByteArray9[this.anInt777++] != 10) {
		}
		return new String(this.aByteArray9, local2, this.anInt777 - local2 - 1);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)[B")
	public byte[] method506() {
		try {
			@Pc(2) int local2 = this.anInt777;
			while (this.aByteArray9[this.anInt777++] != 10) {
			}
			@Pc(29) byte[] local29 = new byte[this.anInt777 - local2 - 1];
			for (@Pc(31) int local31 = local2; local31 < this.anInt777 - 1; local31++) {
				local29[local31 - local2] = this.aByteArray9[local31];
			}
			return local29;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("44153, " + 3 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II[BI)V")
	public void method507(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 < 0) {
				for (@Pc(8) int local8 = 0; local8 < arg2 + 0; local8++) {
					arg1[local8] = this.aByteArray9[this.anInt777++];
				}
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("44096, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
	public void method508() {
		try {
			this.anInt778 = this.anInt777 * 8;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("40903, " + 0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)I")
	public int method509(@OriginalArg(1) int arg0) {
		try {
			@Pc(11) int local11 = this.anInt778 >> 3;
			@Pc(18) int local18 = 8 - (this.anInt778 & 0x7);
			@Pc(20) int local20 = 0;
			this.anInt778 += arg0;
			while (arg0 > local18) {
				local20 += (this.aByteArray9[local11++] & anIntArray226[local18]) << arg0 - local18;
				arg0 -= local18;
				local18 = 8;
			}
			if (arg0 == local18) {
				local20 += this.aByteArray9[local11] & anIntArray226[local18];
			} else {
				local20 += this.aByteArray9[local11] >> local18 - arg0 & anIntArray226[arg0];
			}
			return local20;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("3324, " + -416 + ", " + arg0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)V")
	public void method510() {
		try {
			this.anInt777 = (this.anInt778 + 7) / 8;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("5222, " + 6 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "()I")
	public int method511() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt777] & 0xFF;
		return local7 < 128 ? this.method498() - 64 : this.method500() - 49152;
	}

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "()I")
	public int method512() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt777] & 0xFF;
		return local7 < 128 ? this.method498() : this.method500() - 32768;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method513(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt777;
			this.anInt777 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method507(this.anInt772, local8, local2);
			@Pc(25) BigInteger local25 = new BigInteger(local8);
			@Pc(30) BigInteger local30 = local25.modPow(arg0, arg1);
			@Pc(33) byte[] local33 = local30.toByteArray();
			this.anInt777 = 0;
			this.method488(local33.length);
			this.method496(local33, local33.length);
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("39902, " + -106 + ", " + arg0 + ", " + arg1 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}
}

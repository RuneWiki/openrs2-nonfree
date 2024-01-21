import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
	private static int anInt778;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
	private static int anInt779;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
	private static int anInt780;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
	private static int anInt774 = -24461;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "[I")
	private static int[] anIntArray225 = new int[256];

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "[I")
	private static final int[] anIntArray226;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "Lclient!pb;")
	private static Class31 aClass31_4;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "Lclient!pb;")
	private static Class31 aClass31_5;

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "Lclient!pb;")
	private static Class31 aClass31_6;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
	public int anInt776;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	public int anInt777;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "Lclient!xb;")
	public Class47 aClass47_2;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "B")
	private byte aByte30 = 103;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "Z")
	private boolean aBoolean209 = false;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "Z")
	private boolean aBoolean210 = true;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "B")
	private byte aByte31 = 2;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
	private int anInt771 = 980;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
	private int anInt772 = 3520;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "B")
	private byte aByte32 = -116;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
	private int anInt773 = 530;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
	private int anInt775 = -171;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "[C")
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
		aClass31_4 = new Class31((byte) -118);
		aClass31_5 = new Class31((byte) -118);
		aClass31_6 = new Class31((byte) -118);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)Lclient!mb;")
	public static Class1_Sub1_Sub3 method485() {
		try {
			@Pc(7) Class31 local7 = aClass31_5;
			synchronized (aClass31_5) {
				@Pc(11) Class1_Sub1_Sub3 local11 = null;
				if (anInt779 > 0) {
					anInt779--;
					local11 = (Class1_Sub1_Sub3) aClass31_5.method522();
				}
				if (local11 != null) {
					local11.anInt776 = 0;
					return local11;
				}
			}
			@Pc(73) Class1_Sub1_Sub3 local73 = new Class1_Sub1_Sub3((byte) 103);
			local73.anInt776 = 0;
			local73.aByteArray9 = new byte[5000];
			return local73;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("91557, " + 1 + ", " + false + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(B)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != this.aByte30) {
				throw new NullPointerException();
			}
		} catch (@Pc(300) RuntimeException local300) {
			signlink.reporterror("53324, " + arg0 + ", " + local300.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray9 = arg1;
			@Pc(300) int local300 = 49 / arg0;
			this.anInt776 = 0;
		} catch (@Pc(313) RuntimeException local313) {
			signlink.reporterror("53541, " + arg0 + ", " + arg1 + ", " + local313.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public void method486() {
		try {
			@Pc(11) Class31 local11 = aClass31_5;
			synchronized (aClass31_5) {
				this.anInt776 = 0;
				if (this.aByteArray9.length == 100 && anInt778 < 1000) {
					aClass31_4.method520(this);
					anInt778++;
				} else if (this.aByteArray9.length == 5000 && anInt779 < 250) {
					aClass31_5.method520(this);
					anInt779++;
				} else if (this.aByteArray9.length == 30000 && anInt780 < 50) {
					aClass31_6.method520(this);
					anInt780++;
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("8155, " + 0 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	public void method487(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt776++] = (byte) (arg0 + this.aClass47_2.method674());
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("48280, " + arg0 + ", " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public void method488(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt776++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public void method489(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt776++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt776++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V")
	public void method490(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt776++] = (byte) arg0;
			this.aByteArray9[this.anInt776++] = 0;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("66297, " + false + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	public void method491(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt776++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt776++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt776++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
	public void method492(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt776++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt776++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt776++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt776++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V")
	public void method493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray9[this.anInt776++] = (byte) arg1;
			this.aByteArray9[this.anInt776++] = (byte) (arg1 >> 8);
			this.aByteArray9[this.anInt776++] = (byte) (arg1 >> 16);
			@Pc(43) boolean local43 = false;
			this.aByteArray9[this.anInt776++] = (byte) (arg1 >> 24);
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("47857, " + arg0 + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BJ)V")
	public void method494(@OriginalArg(1) long arg0) {
		try {
			this.aByteArray9[this.anInt776++] = (byte) (arg0 >> 56);
			this.aByteArray9[this.anInt776++] = (byte) (arg0 >> 48);
			this.aByteArray9[this.anInt776++] = (byte) (arg0 >> 40);
			this.aByteArray9[this.anInt776++] = (byte) (arg0 >> 32);
			this.aByteArray9[this.anInt776++] = (byte) (arg0 >> 24);
			this.aByteArray9[this.anInt776++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt776++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt776++] = (byte) arg0;
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("87008, " + -58 + ", " + arg0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method495(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt776);
		this.anInt776 += arg0.length();
		this.aByteArray9[this.anInt776++] = 10;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIZ[B)V")
	public void method496(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg0 + 0; local12++) {
				this.aByteArray9[this.anInt776++] = arg1[local12];
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("72406, " + 0 + ", " + arg0 + ", " + false + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)V")
	public void method497(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			this.aByteArray9[this.anInt776 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("61975, " + arg0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "()I")
	public int method498() {
		return this.aByteArray9[this.anInt776++] & 0xFF;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "()B")
	public byte method499() {
		return this.aByteArray9[this.anInt776++];
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "()I")
	public int method500() {
		this.anInt776 += 2;
		return ((this.aByteArray9[this.anInt776 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt776 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "()I")
	public int method501() {
		this.anInt776 += 2;
		@Pc(27) int local27 = ((this.aByteArray9[this.anInt776 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt776 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "()I")
	public int method502() {
		this.anInt776 += 3;
		return ((this.aByteArray9[this.anInt776 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt776 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt776 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "()I")
	public int method503() {
		this.anInt776 += 4;
		return ((this.aByteArray9[this.anInt776 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt776 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt776 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt776 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)J")
	public long method504() {
		try {
			@Pc(5) long local5 = (long) this.method503() & 0xFFFFFFFFL;
			@Pc(24) long local24 = (long) this.method503() & 0xFFFFFFFFL;
			return (local5 << 32) + local24;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("54212, " + 6 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method505() {
		@Pc(2) int local2 = this.anInt776;
		while (this.aByteArray9[this.anInt776++] != 10) {
		}
		return new String(this.aByteArray9, local2, this.anInt776 - local2 - 1);
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)[B")
	public byte[] method506() {
		try {
			@Pc(14) int local14 = this.anInt776;
			while (this.aByteArray9[this.anInt776++] != 10) {
			}
			@Pc(35) byte[] local35 = new byte[this.anInt776 - local14 - 1];
			for (@Pc(37) int local37 = local14; local37 < this.anInt776 - 1; local37++) {
				local35[local37 - local14] = this.aByteArray9[local37];
			}
			return local35;
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("55432, " + -34736 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[BII)V")
	public void method507(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < arg0 + 0; local5++) {
				arg1[local5] = this.aByteArray9[this.anInt776++];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("10138, " + arg0 + ", " + arg1 + ", " + 0 + ", " + -22245 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public void method508() {
		try {
			if (this.aByte31 == 2) {
				this.anInt777 = this.anInt776 * 8;
			}
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("39872, " + 2 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IB)I")
	public int method509(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt777 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt777 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt777 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray9[local6++] & anIntArray226[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray9[local6] & anIntArray226[local13];
			} else {
				local15 += this.aByteArray9[local6] >> local13 - arg0 & anIntArray226[arg0];
			}
			return local15;
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("41463, " + arg0 + ", " + -20 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)V")
	public void method510() {
		try {
			this.anInt776 = (this.anInt777 + 7) / 8;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("90419, " + 980 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "()I")
	public int method511() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt776] & 0xFF;
		return local7 < 128 ? this.method498() - 64 : this.method500() - 49152;
	}

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "()I")
	public int method512() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt776] & 0xFF;
		return local7 < 128 ? this.method498() : this.method500() - 32768;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method513(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(2) int local2 = this.anInt776;
			this.anInt776 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			@Pc(12) boolean local12 = false;
			this.method507(local2, local8);
			@Pc(23) BigInteger local23 = new BigInteger(local8);
			@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
			@Pc(31) byte[] local31 = local28.toByteArray();
			this.anInt776 = 0;
			this.method488(local31.length);
			this.method496(local31.length, local31);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("51298, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}

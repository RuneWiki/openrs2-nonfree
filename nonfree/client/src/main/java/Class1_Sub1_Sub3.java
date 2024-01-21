import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
	private static int anInt745;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
	private static int anInt746;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
	private static int anInt747;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "[I")
	private static int[] anIntArray216 = new int[256];

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "[I")
	private static final int[] anIntArray217;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "Lclient!ob;")
	private static Class29 aClass29_4;

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "Lclient!ob;")
	private static Class29 aClass29_5;

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "Lclient!ob;")
	private static Class29 aClass29_6;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
	public int anInt743;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
	public int anInt744;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "Lclient!wb;")
	public Class46 aClass46_2;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "Z")
	private boolean aBoolean180 = true;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	private int anInt738 = 9;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	private int anInt739 = -442;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	private int anInt740 = -41441;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Z")
	private boolean aBoolean181 = true;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
	private int anInt741 = 368;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "Z")
	private boolean aBoolean182 = true;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Z")
	private boolean aBoolean183 = true;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "Z")
	private boolean aBoolean184 = false;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Z")
	private boolean aBoolean185 = false;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
	private int anInt742 = -186;

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "[C")
	private char[] aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray216[local4] = local7;
		}
		anIntArray217 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass29_4 = new Class29(-822);
		aClass29_5 = new Class29(-822);
		aClass29_6 = new Class29(-822);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Lclient!lb;")
	public static Class1_Sub1_Sub3 method461() {
		try {
			@Pc(3) Class29 local3 = aClass29_5;
			synchronized (aClass29_5) {
				@Pc(7) Class1_Sub1_Sub3 local7 = null;
				if (anInt746 > 0) {
					anInt746--;
					local7 = (Class1_Sub1_Sub3) aClass29_5.method503();
				}
				if (local7 != null) {
					local7.anInt743 = 0;
					return local7;
				}
			}
			@Pc(69) Class1_Sub1_Sub3 local69 = new Class1_Sub1_Sub3((byte) 3);
			local69.anInt743 = 0;
			local69.aByteArray9 = new byte[5000];
			return local69;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("8897, " + -7939 + ", " + 1 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(B)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([BB)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aByteArray9 = arg0;
			this.anInt743 = 0;
		} catch (@Pc(310) RuntimeException local310) {
			signlink.reporterror("92577, " + arg0 + ", " + arg1 + ", " + local310.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)V")
	public void method462(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt743++] = (byte) (arg0 + this.aClass46_2.method655());
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("31745, " + 117 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public void method463(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt743++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public void method464(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt743++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt743++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V")
	public void method465(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt743++] = (byte) arg0;
			this.aByteArray9[this.anInt743++] = 0;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("41216, " + false + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	public void method466(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt743++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt743++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt743++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	public void method467(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt743++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt743++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt743++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt743++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(ZI)V")
	public void method468(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt743++] = (byte) arg0;
			this.aByteArray9[this.anInt743++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt743++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt743++] = (byte) (arg0 >> 24);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("92442, " + true + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(JI)V")
	public void method469(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray9[this.anInt743++] = (byte) (arg0 >> 56);
			this.aByteArray9[this.anInt743++] = (byte) (arg0 >> 48);
			this.aByteArray9[this.anInt743++] = (byte) (arg0 >> 40);
			this.aByteArray9[this.anInt743++] = (byte) (arg0 >> 32);
			this.aByteArray9[this.anInt743++] = (byte) (arg0 >> 24);
			this.aByteArray9[this.anInt743++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt743++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt743++] = (byte) arg0;
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("66663, " + arg0 + ", " + 0 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method470(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt743);
		this.anInt743 += arg0.length();
		this.aByteArray9[this.anInt743++] = 10;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BZII)V")
	public void method471(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(11) int local11 = 0; local11 < arg1 + 0; local11++) {
				this.aByteArray9[this.anInt743++] = arg0[local11];
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("66770, " + arg0 + ", " + false + ", " + 0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
	public void method472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 == 0) {
				this.aByteArray9[this.anInt743 - arg0 - 1] = (byte) arg0;
			}
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("30733, " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "()I")
	public int method473() {
		return this.aByteArray9[this.anInt743++] & 0xFF;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "()B")
	public byte method474() {
		return this.aByteArray9[this.anInt743++];
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "()I")
	public int method475() {
		this.anInt743 += 2;
		return ((this.aByteArray9[this.anInt743 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt743 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "()I")
	public int method476() {
		this.anInt743 += 2;
		@Pc(27) int local27 = ((this.aByteArray9[this.anInt743 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt743 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "()I")
	public int method477() {
		this.anInt743 += 3;
		return ((this.aByteArray9[this.anInt743 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt743 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt743 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "()I")
	public int method478() {
		this.anInt743 += 4;
		return ((this.aByteArray9[this.anInt743 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt743 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt743 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt743 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)J")
	public long method479() {
		try {
			@Pc(5) long local5 = (long) this.method478() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method478() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("1915, " + 0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method480() {
		@Pc(2) int local2 = this.anInt743;
		while (this.aByteArray9[this.anInt743++] != 10) {
		}
		return new String(this.aByteArray9, local2, this.anInt743 - local2 - 1);
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)[B")
	public byte[] method481(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) int local2 = this.anInt743;
			while (this.aByteArray9[this.anInt743++] != 10) {
			}
			@Pc(23) byte[] local23 = new byte[this.anInt743 - local2 - 1];
			if (arg0 != -32952) {
				this.anInt738 = 127;
			}
			for (@Pc(31) int local31 = local2; local31 < this.anInt743 - 1; local31++) {
				local23[local31 - local2] = this.aByteArray9[local31];
			}
			return local23;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("65931, " + arg0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[BII)V")
	public void method482(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg0 + 0; local12++) {
				arg1[local12] = this.aByteArray9[this.anInt743++];
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("41339, " + arg0 + ", " + arg1 + ", " + 0 + ", " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public void method483() {
		try {
			this.anInt744 = this.anInt743 * 8;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("274, " + 4 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)I")
	public int method484(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt744 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt744 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt744 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray9[local6++] & anIntArray217[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray9[local6] & anIntArray217[local13];
			} else {
				local15 += this.aByteArray9[local6] >> local13 - arg0 & anIntArray217[arg0];
			}
			return local15;
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("71601, " + arg0 + ", " + -96 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)V")
	public void method485(@OriginalArg(0) int arg0) {
		try {
			this.anInt743 = (this.anInt744 + 7) / 8;
			@Pc(11) boolean local11 = false;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("95025, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "()I")
	public int method486() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt743] & 0xFF;
		return local7 < 128 ? this.method473() - 64 : this.method475() - 49152;
	}

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "()I")
	public int method487() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt743] & 0xFF;
		return local7 < 128 ? this.method473() : this.method475() - 32768;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method488(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt743;
			this.anInt743 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method482(local2, local8);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg1, arg0);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt743 = 0;
			this.method463(local27.length);
			this.method471(local27, local27.length);
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("51191, " + arg0 + ", " + arg1 + ", " + 4 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}
}

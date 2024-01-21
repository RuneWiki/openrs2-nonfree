import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
	private static int anInt717;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
	private static int anInt718;

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
	private static int anInt719;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "[I")
	private static int[] anIntArray216 = new int[256];

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "[I")
	private static final int[] anIntArray217;

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "Lclient!ob;")
	private static Class29 aClass29_4;

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "Lclient!ob;")
	private static Class29 aClass29_5;

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "Lclient!ob;")
	private static Class29 aClass29_6;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
	private int anInt708;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
	private int anInt714;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
	public int anInt715;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
	public int anInt716;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "Lclient!wb;")
	public Class46 aClass46_2;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	private int anInt709 = 4;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "Z")
	private boolean aBoolean201 = true;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	private int anInt710 = 4;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "B")
	private byte aByte29 = -27;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
	private int anInt711 = -883;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Z")
	private boolean aBoolean203 = true;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "B")
	private byte aByte30 = 5;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
	private int anInt712 = -36;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
	private int anInt713 = 4;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "Z")
	private boolean aBoolean204 = true;

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "[C")
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
		aClass29_4 = new Class29((byte) 5);
		aClass29_5 = new Class29((byte) 5);
		aClass29_6 = new Class29((byte) 5);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)Lclient!lb;")
	public static Class1_Sub1_Sub3 method460() {
		try {
			@Pc(3) Class29 local3 = aClass29_5;
			synchronized (aClass29_5) {
				@Pc(7) Class1_Sub1_Sub3 local7 = null;
				if (anInt718 > 0) {
					anInt718--;
					local7 = (Class1_Sub1_Sub3) aClass29_5.method502();
				}
				if (local7 != null) {
					local7.anInt715 = 0;
					return local7;
				}
			}
			@Pc(69) Class1_Sub1_Sub3 local69 = new Class1_Sub1_Sub3(-12346);
			local69.anInt715 = 0;
			local69.aByteArray9 = new byte[5000];
			return local69;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("36602, " + 1 + ", " + 5 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(B[B)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray9 = arg1;
			@Pc(304) boolean local304 = false;
			this.anInt715 = 0;
		} catch (@Pc(320) RuntimeException local320) {
			signlink.reporterror("29766, " + arg0 + ", " + arg1 + ", " + local320.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(IB)V")
	public void method461(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt715++] = (byte) (arg0 + this.aClass46_2.method654());
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("33566, " + arg0 + ", " + 48 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public void method462(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt715++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public void method463(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt715++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt715++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
	public void method464(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt715++] = (byte) arg0;
			this.aByteArray9[this.anInt715++] = 0;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("602, " + 39096 + ", " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	public void method465(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt715++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt715++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt715++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	public void method466(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt715++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt715++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt715++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt715++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(IB)V")
	public void method467(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aByteArray9[this.anInt715++] = (byte) arg0;
			this.aByteArray9[this.anInt715++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt715++] = (byte) (arg0 >> 16);
			if (arg1 != 117) {
				for (@Pc(44) int local44 = 1; local44 > 0; local44++) {
				}
			}
			this.aByteArray9[this.anInt715++] = (byte) (arg0 >> 24);
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("79448, " + arg0 + ", " + arg1 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(JZ)V")
	public void method468(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray9[this.anInt715++] = (byte) (arg0 >> 56);
			this.aByteArray9[this.anInt715++] = (byte) (arg0 >> 48);
			this.aByteArray9[this.anInt715++] = (byte) (arg0 >> 40);
			this.aByteArray9[this.anInt715++] = (byte) (arg0 >> 32);
			this.aByteArray9[this.anInt715++] = (byte) (arg0 >> 24);
			this.aByteArray9[this.anInt715++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt715++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt715++] = (byte) arg0;
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("34163, " + arg0 + ", " + true + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method469(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt715);
		this.anInt715 += arg0.length();
		this.aByteArray9[this.anInt715++] = 10;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[BII)V")
	public void method470(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg1 + 0; local12++) {
				this.aByteArray9[this.anInt715++] = arg0[local12];
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("19363, " + 8 + ", " + arg0 + ", " + 0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
	public void method471(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt715 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("71274, " + arg0 + ", " + 0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "()I")
	public int method472() {
		return this.aByteArray9[this.anInt715++] & 0xFF;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "()B")
	public byte method473() {
		return this.aByteArray9[this.anInt715++];
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "()I")
	public int method474() {
		this.anInt715 += 2;
		return ((this.aByteArray9[this.anInt715 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt715 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "()I")
	public int method475() {
		this.anInt715 += 2;
		@Pc(27) int local27 = ((this.aByteArray9[this.anInt715 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt715 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "()I")
	public int method476() {
		this.anInt715 += 3;
		return ((this.aByteArray9[this.anInt715 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt715 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt715 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "()I")
	public int method477() {
		this.anInt715 += 4;
		return ((this.aByteArray9[this.anInt715 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt715 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt715 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt715 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)J")
	public long method478() {
		try {
			@Pc(5) long local5 = (long) this.method477() & 0xFFFFFFFFL;
			@Pc(16) long local16 = (long) this.method477() & 0xFFFFFFFFL;
			return (local5 << 32) + local16;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("61963, " + 203 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method479() {
		@Pc(2) int local2 = this.anInt715;
		while (this.aByteArray9[this.anInt715++] != 10) {
		}
		return new String(this.aByteArray9, local2, this.anInt715 - local2 - 1);
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)[B")
	public byte[] method480() {
		try {
			@Pc(8) int local8 = this.anInt715;
			while (this.aByteArray9[this.anInt715++] != 10) {
			}
			@Pc(29) byte[] local29 = new byte[this.anInt715 - local8 - 1];
			for (@Pc(31) int local31 = local8; local31 < this.anInt715 - 1; local31++) {
				local29[local31 - local8] = this.aByteArray9[local31];
			}
			return local29;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("60407, " + -399 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III[B)V")
	public void method481(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			if (this.anInt709 != 4) {
				this.anInt713 = 23;
			}
			for (@Pc(8) int local8 = 0; local8 < arg0 + 0; local8++) {
				arg1[local8] = this.aByteArray9[this.anInt715++];
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("86162, " + 4 + ", " + arg0 + ", " + 0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)V")
	public void method482(@OriginalArg(0) int arg0) {
		try {
			this.anInt716 = this.anInt715 * 8;
			if (arg0 <= 0) {
				this.anInt714 = -81;
			}
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("19283, " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)I")
	public int method483(@OriginalArg(1) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt716 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt716 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt716 += arg0;
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
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("47404, " + 0 + ", " + arg0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "(I)V")
	public void method484() {
		try {
			this.anInt715 = (this.anInt716 + 7) / 8;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("77282, " + -413 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "()I")
	public int method485() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt715] & 0xFF;
		return local7 < 128 ? this.method472() - 64 : this.method474() - 49152;
	}

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "()I")
	public int method486() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt715] & 0xFF;
		return local7 < 128 ? this.method472() : this.method474() - 32768;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method487(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt715;
			this.anInt715 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method481(local2, local8);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg1, arg0);
			@Pc(27) byte[] local27 = local24.toByteArray();
			if (this.anInt710 == 4) {
				this.anInt715 = 0;
				this.method462(local27.length);
				this.method470(local27, local27.length);
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("65942, " + 4 + ", " + arg0 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}
}

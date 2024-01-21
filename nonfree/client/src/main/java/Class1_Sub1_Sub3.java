import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
	private static int anInt727;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
	private static int anInt735;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
	private static int anInt736;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
	private static int anInt737;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Z")
	private static boolean aBoolean200 = true;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "[I")
	private static int[] anIntArray219 = new int[256];

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "[I")
	private static final int[] anIntArray220;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "Lclient!ob;")
	private static Class29 aClass29_4;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "Lclient!ob;")
	private static Class29 aClass29_5;

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "Lclient!ob;")
	private static Class29 aClass29_6;

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	private int anInt732;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
	public int anInt733;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
	public int anInt734;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "Lclient!wb;")
	public Class46 aClass46_2;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "Z")
	private boolean aBoolean199 = false;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	private int anInt728 = 5;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	private int anInt729 = 8;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
	private int anInt730 = 4;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
	private int anInt731 = -7404;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "Z")
	private boolean aBoolean201 = true;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Z")
	private boolean aBoolean202 = false;

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
			anIntArray219[local6] = local9;
		}
		anIntArray220 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass29_4 = new Class29(-794);
		aClass29_5 = new Class29(-794);
		aClass29_6 = new Class29(-794);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Lclient!lb;")
	public static Class1_Sub1_Sub3 method468() {
		try {
			@Pc(11) Class29 local11 = aClass29_5;
			synchronized (aClass29_5) {
				@Pc(15) Class1_Sub1_Sub3 local15 = null;
				if (anInt736 > 0) {
					anInt736--;
					local15 = (Class1_Sub1_Sub3) aClass29_5.method510();
				}
				if (local15 != null) {
					local15.anInt733 = 0;
					return local15;
				}
			}
			@Pc(77) Class1_Sub1_Sub3 local77 = new Class1_Sub1_Sub3(0);
			local77.anInt733 = 0;
			local77.aByteArray9 = new byte[5000];
			return local77;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("90038, " + 1 + ", " + 0 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([BZ)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aByteArray9 = arg0;
			if (arg1) {
				anInt727 = -499;
			}
			this.anInt733 = 0;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("94134, " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
	public void method469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			this.aByteArray9[this.anInt733++] = (byte) (arg0 + this.aClass46_2.method662());
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("34044, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public void method470(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt733++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public void method471(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt733++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt733++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)V")
	public void method472(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt733++] = (byte) arg0;
			this.aByteArray9[this.anInt733++] = 0;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("39825, " + arg0 + ", " + 0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	public void method473(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt733++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt733++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt733++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	public void method474(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt733++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt733++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt733++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt733++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)V")
	public void method475(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt733++] = (byte) arg0;
			this.aByteArray9[this.anInt733++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt733++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt733++] = (byte) (arg0 >> 24);
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("2094, " + arg0 + ", " + false + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BJ)V")
	public void method476(@OriginalArg(0) byte arg0, @OriginalArg(1) long arg1) {
		try {
			this.aByteArray9[this.anInt733++] = (byte) (arg1 >> 56);
			this.aByteArray9[this.anInt733++] = (byte) (arg1 >> 48);
			this.aByteArray9[this.anInt733++] = (byte) (arg1 >> 40);
			if (arg0 == 69) {
				this.aByteArray9[this.anInt733++] = (byte) (arg1 >> 32);
				this.aByteArray9[this.anInt733++] = (byte) (arg1 >> 24);
				this.aByteArray9[this.anInt733++] = (byte) (arg1 >> 16);
				this.aByteArray9[this.anInt733++] = (byte) (arg1 >> 8);
				this.aByteArray9[this.anInt733++] = (byte) arg1;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("70247, " + arg0 + ", " + arg1 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method477(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt733);
		this.anInt733 += arg0.length();
		this.aByteArray9[this.anInt733++] = 10;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[BZ)V")
	public void method478(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg0 + 0; local12++) {
				this.aByteArray9[this.anInt733++] = arg1[local12];
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("24880, " + arg0 + ", " + 0 + ", " + arg1 + ", " + true + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(II)V")
	public void method479(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt733 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("71965, " + 1 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "()I")
	public int method480() {
		return this.aByteArray9[this.anInt733++] & 0xFF;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "()B")
	public byte method481() {
		return this.aByteArray9[this.anInt733++];
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "()I")
	public int method482() {
		this.anInt733 += 2;
		return ((this.aByteArray9[this.anInt733 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt733 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "()I")
	public int method483() {
		this.anInt733 += 2;
		@Pc(27) int local27 = ((this.aByteArray9[this.anInt733 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt733 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "()I")
	public int method484() {
		this.anInt733 += 3;
		return ((this.aByteArray9[this.anInt733 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt733 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt733 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "()I")
	public int method485() {
		this.anInt733 += 4;
		return ((this.aByteArray9[this.anInt733 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt733 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt733 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt733 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)J")
	public long method486() {
		try {
			@Pc(15) long local15 = (long) this.method485() & 0xFFFFFFFFL;
			@Pc(21) long local21 = (long) this.method485() & 0xFFFFFFFFL;
			return (local15 << 32) + local21;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("8510, " + -39 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method487() {
		@Pc(2) int local2 = this.anInt733;
		while (this.aByteArray9[this.anInt733++] != 10) {
		}
		return new String(this.aByteArray9, local2, this.anInt733 - local2 - 1);
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)[B")
	public byte[] method488() {
		try {
			@Pc(2) int local2 = this.anInt733;
			while (this.aByteArray9[this.anInt733++] != 10) {
			}
			@Pc(34) byte[] local34 = new byte[this.anInt733 - local2 - 1];
			for (@Pc(36) int local36 = local2; local36 < this.anInt733 - 1; local36++) {
				local34[local36 - local2] = this.aByteArray9[local36];
			}
			return local34;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("82771, " + 940 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIII)V")
	public void method489(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(16) int local16 = 0; local16 < arg1 + 0; local16++) {
				arg0[local16] = this.aByteArray9[this.anInt733++];
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("49940, " + arg0 + ", " + 3 + ", " + arg1 + ", " + 0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)V")
	public void method490() {
		try {
			this.anInt734 = this.anInt733 * 8;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("17159, " + 0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(II)I")
	public int method491(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt734 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt734 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt734 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray9[local6++] & anIntArray220[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray9[local6] & anIntArray220[local13];
			} else {
				local15 += this.aByteArray9[local6] >> local13 - arg0 & anIntArray220[arg0];
			}
			return local15;
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("90249, " + arg0 + ", " + 45621 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
	public void method492() {
		try {
			this.anInt733 = (this.anInt734 + 7) / 8;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("55970, " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "()I")
	public int method493() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt733] & 0xFF;
		return local7 < 128 ? this.method480() - 64 : this.method482() - 49152;
	}

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "()I")
	public int method494() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt733] & 0xFF;
		return local7 < 128 ? this.method480() : this.method482() - 32768;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
	public void method495(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt733;
			this.anInt733 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method489(local8, local2);
			@Pc(22) BigInteger local22 = new BigInteger(local8);
			@Pc(27) BigInteger local27 = local22.modPow(arg1, arg0);
			@Pc(30) byte[] local30 = local27.toByteArray();
			this.anInt733 = 0;
			this.method470(local30.length);
			this.method478(local30.length, local30);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("36701, " + arg0 + ", " + true + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}
}

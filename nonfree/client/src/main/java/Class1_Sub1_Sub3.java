import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
	private static int anInt736;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
	private static int anInt737;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
	private static int anInt738;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
	private static int anInt733 = 8;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "[I")
	private static int[] anIntArray218 = new int[256];

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "[I")
	private static final int[] anIntArray219;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "Lclient!ob;")
	private static Class29 aClass29_4;

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "Lclient!ob;")
	private static Class29 aClass29_5;

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "Lclient!ob;")
	private static Class29 aClass29_6;

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
	private int anInt727;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
	public int anInt734;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
	public int anInt735;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "Lclient!wb;")
	public Class46 aClass46_2;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "B")
	private byte aByte44 = 95;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	private int anInt728 = -731;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	private int anInt729 = 1623;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
	private int anInt730 = 772;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Z")
	private boolean aBoolean196 = false;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
	private int anInt731 = -139;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	private int anInt732 = 1;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "Z")
	private boolean aBoolean197 = false;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Z")
	private boolean aBoolean198 = false;

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
			anIntArray218[local6] = local9;
		}
		anIntArray219 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass29_4 = new Class29(-199);
		aClass29_5 = new Class29(-199);
		aClass29_6 = new Class29(-199);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Lclient!lb;")
	public static Class1_Sub1_Sub3 method464() {
		try {
			@Pc(3) Class29 local3 = aClass29_5;
			synchronized (aClass29_5) {
				@Pc(7) Class1_Sub1_Sub3 local7 = null;
				if (anInt737 > 0) {
					anInt737--;
					local7 = (Class1_Sub1_Sub3) aClass29_5.method506();
				}
				if (local7 != null) {
					local7.anInt734 = 0;
					return local7;
				}
			}
			@Pc(73) Class1_Sub1_Sub3 local73 = new Class1_Sub1_Sub3((byte) 8);
			local73.anInt734 = 0;
			local73.aByteArray9 = new byte[5000];
			return local73;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("924, " + -929 + ", " + 1 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(B)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) byte arg0) {
		try {
			@Pc(33) boolean local33 = false;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("23990, " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([BI)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray9 = arg0;
			this.anInt734 = 0;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("15004, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
	public void method465(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt734++] = (byte) (arg0 + this.aClass46_2.method658());
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("86638, " + -34003 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public void method466(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt734++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public void method467(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt734++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt734++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)V")
	public void method468(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt734++] = (byte) arg0;
			this.aByteArray9[this.anInt734++] = 0;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("86335, " + arg0 + ", " + false + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	public void method469(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt734++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt734++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt734++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	public void method470(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt734++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt734++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt734++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt734++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)V")
	public void method471(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt734++] = (byte) arg0;
			this.aByteArray9[this.anInt734++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt734++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt734++] = (byte) (arg0 >> 24);
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("41231, " + 26965 + ", " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(JZ)V")
	public void method472(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray9[this.anInt734++] = (byte) (arg0 >> 56);
			this.aByteArray9[this.anInt734++] = (byte) (arg0 >> 48);
			this.aByteArray9[this.anInt734++] = (byte) (arg0 >> 40);
			this.aByteArray9[this.anInt734++] = (byte) (arg0 >> 32);
			this.aByteArray9[this.anInt734++] = (byte) (arg0 >> 24);
			this.aByteArray9[this.anInt734++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt734++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt734++] = (byte) arg0;
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("85019, " + arg0 + ", " + true + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method473(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt734);
		this.anInt734 += arg0.length();
		this.aByteArray9[this.anInt734++] = 10;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIIZ)V")
	public void method474(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(6) int local6 = 0; local6 < arg1 + 0; local6++) {
				this.aByteArray9[this.anInt734++] = arg0[local6];
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("73937, " + arg0 + ", " + arg1 + ", " + 0 + ", " + true + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(II)V")
	public void method475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			this.aByteArray9[this.anInt734 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("97780, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "()I")
	public int method476() {
		return this.aByteArray9[this.anInt734++] & 0xFF;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "()B")
	public byte method477() {
		return this.aByteArray9[this.anInt734++];
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "()I")
	public int method478() {
		this.anInt734 += 2;
		return ((this.aByteArray9[this.anInt734 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt734 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "()I")
	public int method479() {
		this.anInt734 += 2;
		@Pc(27) int local27 = ((this.aByteArray9[this.anInt734 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt734 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "()I")
	public int method480() {
		this.anInt734 += 3;
		return ((this.aByteArray9[this.anInt734 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt734 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt734 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "()I")
	public int method481() {
		this.anInt734 += 4;
		return ((this.aByteArray9[this.anInt734 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt734 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt734 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt734 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)J")
	public long method482() {
		try {
			@Pc(10) long local10 = (long) this.method481() & 0xFFFFFFFFL;
			@Pc(16) long local16 = (long) this.method481() & 0xFFFFFFFFL;
			return (local10 << 32) + local16;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("82572, " + true + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method483() {
		@Pc(2) int local2 = this.anInt734;
		while (this.aByteArray9[this.anInt734++] != 10) {
		}
		return new String(this.aByteArray9, local2, this.anInt734 - local2 - 1);
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)[B")
	public byte[] method484(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 44692) {
				anInt733 = 448;
			}
			@Pc(7) int local7 = this.anInt734;
			while (this.aByteArray9[this.anInt734++] != 10) {
			}
			@Pc(28) byte[] local28 = new byte[this.anInt734 - local7 - 1];
			for (@Pc(30) int local30 = local7; local30 < this.anInt734 - 1; local30++) {
				local28[local30 - local7] = this.aByteArray9[local30];
			}
			return local28;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("67289, " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B[BII)V")
	public void method485(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			if (this.aByte44 != 95) {
				this.anInt732 = -447;
			}
			for (@Pc(8) int local8 = 0; local8 < arg1 + 0; local8++) {
				arg0[local8] = this.aByteArray9[this.anInt734++];
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("99457, " + 95 + ", " + arg0 + ", " + 0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public void method486() {
		try {
			this.anInt735 = this.anInt734 * 8;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("96920, " + -51 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(IZ)I")
	public int method487(@OriginalArg(0) int arg0) {
		try {
			@Pc(16) int local16 = this.anInt735 >> 3;
			@Pc(23) int local23 = 8 - (this.anInt735 & 0x7);
			@Pc(25) int local25 = 0;
			this.anInt735 += arg0;
			while (arg0 > local23) {
				local25 += (this.aByteArray9[local16++] & anIntArray219[local23]) << arg0 - local23;
				arg0 -= local23;
				local23 = 8;
			}
			if (arg0 == local23) {
				local25 += this.aByteArray9[local16] & anIntArray219[local23];
			} else {
				local25 += this.aByteArray9[local16] >> local23 - arg0 & anIntArray219[arg0];
			}
			return local25;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("75102, " + arg0 + ", " + false + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
	public void method488() {
		try {
			this.anInt734 = (this.anInt735 + 7) / 8;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("49000, " + 4 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "()I")
	public int method489() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt734] & 0xFF;
		return local7 < 128 ? this.method476() - 64 : this.method478() - 49152;
	}

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "()I")
	public int method490() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt734] & 0xFF;
		return local7 < 128 ? this.method476() : this.method478() - 32768;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method491(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt734;
			this.anInt734 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method485(local8, local2);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg1, arg0);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt734 = 0;
			this.method466(local27.length);
			this.method474(local27, local27.length);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("81066, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}

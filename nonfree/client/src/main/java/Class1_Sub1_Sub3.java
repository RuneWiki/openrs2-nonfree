import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
	private static int anInt753;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
	private static int anInt754;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
	private static int anInt755;

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

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
	public int anInt751;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
	public int anInt752;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "Lclient!wb;")
	public Class46 aClass46_2;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	private int anInt747 = 1000;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	private int anInt748 = -327;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "B")
	private byte aByte27 = -49;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "B")
	private byte aByte28 = -91;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "B")
	private byte aByte29 = -91;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
	private int anInt749 = 2;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Z")
	private boolean aBoolean195 = true;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
	private int anInt750 = 18931;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Z")
	private boolean aBoolean196 = false;

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
			anIntArray219[local4] = local7;
		}
		anIntArray220 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass29_4 = new Class29(18783);
		aClass29_5 = new Class29(18783);
		aClass29_6 = new Class29(18783);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)Lclient!lb;")
	public static Class1_Sub1_Sub3 method468() {
		try {
			@Pc(3) Class29 local3 = aClass29_5;
			synchronized (aClass29_5) {
				@Pc(7) Class1_Sub1_Sub3 local7 = null;
				if (anInt754 > 0) {
					anInt754--;
					local7 = (Class1_Sub1_Sub3) aClass29_5.method510();
				}
				if (local7 != null) {
					local7.anInt751 = 0;
					return local7;
				}
			}
			@Pc(69) Class1_Sub1_Sub3 local69 = new Class1_Sub1_Sub3((byte) 1);
			local69.anInt751 = 0;
			local69.aByteArray9 = new byte[5000];
			return local69;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("19967, " + false + ", " + 1 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(B)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) byte arg0) {
		try {
			@Pc(33) boolean local33 = false;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("26248, " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray9 = arg1;
			if (arg0 <= 0) {
				this.aBoolean196 = !this.aBoolean196;
			}
			this.anInt751 = 0;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("10004, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)V")
	public void method469(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt751++] = (byte) (arg0 + this.aClass46_2.method662());
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("76605, " + 1 + ", " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public void method470(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt751++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public void method471(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt751++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt751++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
	public void method472(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt751++] = (byte) arg0;
			this.aByteArray9[this.anInt751++] = 0;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("73427, " + arg0 + ", " + -327 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	public void method473(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt751++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt751++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt751++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	public void method474(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt751++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt751++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt751++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt751++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
	public void method475(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt751++] = (byte) arg0;
			this.aByteArray9[this.anInt751++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt751++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt751++] = (byte) (arg0 >> 24);
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("76179, " + arg0 + ", " + 9 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(JZ)V")
	public void method476(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg1) {
				this.aByteArray9[this.anInt751++] = (byte) (arg0 >> 56);
				this.aByteArray9[this.anInt751++] = (byte) (arg0 >> 48);
				this.aByteArray9[this.anInt751++] = (byte) (arg0 >> 40);
				this.aByteArray9[this.anInt751++] = (byte) (arg0 >> 32);
				this.aByteArray9[this.anInt751++] = (byte) (arg0 >> 24);
				this.aByteArray9[this.anInt751++] = (byte) (arg0 >> 16);
				this.aByteArray9[this.anInt751++] = (byte) (arg0 >> 8);
				this.aByteArray9[this.anInt751++] = (byte) arg0;
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("36656, " + arg0 + ", " + arg1 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method477(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt751);
		this.anInt751 += arg0.length();
		this.aByteArray9[this.anInt751++] = 10;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIBI)V")
	public void method478(@OriginalArg(0) byte[] arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 == -49) {
				for (@Pc(5) int local5 = 0; local5 < arg2 + 0; local5++) {
					this.aByteArray9[this.anInt751++] = arg0[local5];
				}
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("5860, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)V")
	public void method479(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt751 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("28880, " + 9 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "()I")
	public int method480() {
		return this.aByteArray9[this.anInt751++] & 0xFF;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "()B")
	public byte method481() {
		return this.aByteArray9[this.anInt751++];
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "()I")
	public int method482() {
		this.anInt751 += 2;
		return ((this.aByteArray9[this.anInt751 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt751 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "()I")
	public int method483() {
		this.anInt751 += 2;
		@Pc(27) int local27 = ((this.aByteArray9[this.anInt751 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt751 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "()I")
	public int method484() {
		this.anInt751 += 3;
		return ((this.aByteArray9[this.anInt751 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt751 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt751 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "()I")
	public int method485() {
		this.anInt751 += 4;
		return ((this.aByteArray9[this.anInt751 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt751 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt751 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt751 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)J")
	public long method486() {
		try {
			@Pc(11) long local11 = (long) this.method485() & 0xFFFFFFFFL;
			@Pc(17) long local17 = (long) this.method485() & 0xFFFFFFFFL;
			return (local11 << 32) + local17;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("43572, " + true + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method487() {
		@Pc(2) int local2 = this.anInt751;
		while (this.aByteArray9[this.anInt751++] != 10) {
		}
		return new String(this.aByteArray9, local2, this.anInt751 - local2 - 1);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)[B")
	public byte[] method488() {
		try {
			@Pc(14) int local14 = this.anInt751;
			while (this.aByteArray9[this.anInt751++] != 10) {
			}
			@Pc(35) byte[] local35 = new byte[this.anInt751 - local14 - 1];
			for (@Pc(37) int local37 = local14; local37 < this.anInt751 - 1; local37++) {
				local35[local37 - local14] = this.aByteArray9[local37];
			}
			return local35;
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("88014, " + 31 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ[BI)V")
	public void method489(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg1 + 0; local4++) {
				arg0[local4] = this.aByteArray9[this.anInt751++];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("41801, " + 0 + ", " + false + ", " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V")
	public void method490() {
		try {
			this.anInt752 = this.anInt751 * 8;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("93866, " + 496 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(II)I")
	public int method491(@OriginalArg(1) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt752 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt752 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt752 += arg0;
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
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("31994, " + -703 + ", " + arg0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)V")
	public void method492() {
		try {
			this.anInt751 = (this.anInt752 + 7) / 8;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("797, " + -29885 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "()I")
	public int method493() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt751] & 0xFF;
		return local7 < 128 ? this.method480() - 64 : this.method482() - 49152;
	}

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "()I")
	public int method494() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt751] & 0xFF;
		return local7 < 128 ? this.method480() : this.method482() - 32768;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
	public void method495(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt751;
			this.anInt751 = 0;
			@Pc(13) byte[] local13 = new byte[local2];
			this.method489(local13, local2);
			@Pc(24) BigInteger local24 = new BigInteger(local13);
			@Pc(29) BigInteger local29 = local24.modPow(arg0, arg1);
			@Pc(32) byte[] local32 = local29.toByteArray();
			this.anInt751 = 0;
			this.method470(local32.length);
			this.method478(local32, this.aByte27, local32.length);
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("46833, " + arg0 + ", " + arg1 + ", " + false + ", " + local49.toString());
			throw new RuntimeException();
		}
	}
}

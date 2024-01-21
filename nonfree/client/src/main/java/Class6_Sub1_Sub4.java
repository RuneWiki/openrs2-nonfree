import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PQBRPYKE")
public final class Class6_Sub1_Sub4 extends Class6_Sub1 {

	@OriginalMember(owner = "client!PQBRPYKE", name = "H", descriptor = "I")
	private static int anInt392;

	@OriginalMember(owner = "client!PQBRPYKE", name = "I", descriptor = "I")
	private static int anInt393;

	@OriginalMember(owner = "client!PQBRPYKE", name = "J", descriptor = "I")
	private static int anInt394;

	@OriginalMember(owner = "client!PQBRPYKE", name = "E", descriptor = "[I")
	private static int[] anIntArray130 = new int[256];

	@OriginalMember(owner = "client!PQBRPYKE", name = "F", descriptor = "[I")
	private static final int[] anIntArray131;

	@OriginalMember(owner = "client!PQBRPYKE", name = "K", descriptor = "Lclient!VGFLNLXH;")
	private static Class40 aClass40_1;

	@OriginalMember(owner = "client!PQBRPYKE", name = "L", descriptor = "Lclient!VGFLNLXH;")
	private static Class40 aClass40_2;

	@OriginalMember(owner = "client!PQBRPYKE", name = "M", descriptor = "Lclient!VGFLNLXH;")
	private static Class40 aClass40_3;

	@OriginalMember(owner = "client!PQBRPYKE", name = "N", descriptor = "[C")
	private static char[] aCharArray3;

	@OriginalMember(owner = "client!PQBRPYKE", name = "o", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!PQBRPYKE", name = "A", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!PQBRPYKE", name = "B", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!PQBRPYKE", name = "C", descriptor = "I")
	public int anInt390;

	@OriginalMember(owner = "client!PQBRPYKE", name = "D", descriptor = "I")
	public int anInt391;

	@OriginalMember(owner = "client!PQBRPYKE", name = "G", descriptor = "Lclient!WUYFIEBK;")
	public Class42 aClass42_1;

	@OriginalMember(owner = "client!PQBRPYKE", name = "h", descriptor = "Z")
	private boolean aBoolean105 = false;

	@OriginalMember(owner = "client!PQBRPYKE", name = "i", descriptor = "B")
	private byte aByte26 = 87;

	@OriginalMember(owner = "client!PQBRPYKE", name = "j", descriptor = "I")
	private int anInt380 = 587;

	@OriginalMember(owner = "client!PQBRPYKE", name = "k", descriptor = "Z")
	private boolean aBoolean106 = false;

	@OriginalMember(owner = "client!PQBRPYKE", name = "l", descriptor = "I")
	private int anInt381 = 5;

	@OriginalMember(owner = "client!PQBRPYKE", name = "m", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!PQBRPYKE", name = "n", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!PQBRPYKE", name = "p", descriptor = "I")
	private int anInt383 = 813;

	@OriginalMember(owner = "client!PQBRPYKE", name = "q", descriptor = "B")
	private byte aByte27 = 2;

	@OriginalMember(owner = "client!PQBRPYKE", name = "r", descriptor = "I")
	private int anInt384 = 642;

	@OriginalMember(owner = "client!PQBRPYKE", name = "s", descriptor = "I")
	private int anInt385 = 759;

	@OriginalMember(owner = "client!PQBRPYKE", name = "t", descriptor = "I")
	private int anInt386 = 34;

	@OriginalMember(owner = "client!PQBRPYKE", name = "u", descriptor = "I")
	private int anInt387 = 180;

	@OriginalMember(owner = "client!PQBRPYKE", name = "v", descriptor = "I")
	private int anInt388 = 5;

	@OriginalMember(owner = "client!PQBRPYKE", name = "w", descriptor = "Z")
	private boolean aBoolean109 = true;

	@OriginalMember(owner = "client!PQBRPYKE", name = "x", descriptor = "Z")
	private boolean aBoolean110 = true;

	@OriginalMember(owner = "client!PQBRPYKE", name = "y", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!PQBRPYKE", name = "z", descriptor = "Z")
	private boolean aBoolean112 = true;

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
			anIntArray130[local4] = local7;
		}
		anIntArray131 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass40_1 = new Class40(826);
		aClass40_2 = new Class40(826);
		aClass40_3 = new Class40(826);
		aCharArray3 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(II)Lclient!PQBRPYKE;")
	public static Class6_Sub1_Sub4 method227() {
		try {
			@Pc(16) Class40 local16 = aClass40_2;
			synchronized (aClass40_2) {
				@Pc(20) Class6_Sub1_Sub4 local20 = null;
				if (anInt393 > 0) {
					anInt393--;
					local20 = (Class6_Sub1_Sub4) aClass40_2.method471();
				}
				if (local20 != null) {
					local20.anInt390 = 0;
					return local20;
				}
			}
			@Pc(82) Class6_Sub1_Sub4 local82 = new Class6_Sub1_Sub4(5);
			local82.anInt390 = 0;
			local82.aByteArray12 = new byte[5000];
			return local82;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("71832, " + 6 + ", " + 1 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "<init>", descriptor = "(I)V")
	private Class6_Sub1_Sub4(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "<init>", descriptor = "(I[B)V")
	public Class6_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(59) int local59 = 49 / arg0;
			this.aByteArray12 = arg1;
			this.anInt390 = 0;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("49511, " + arg0 + ", " + arg1 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(IZ)V")
	public void method228(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray12[this.anInt390++] = (byte) (arg0 + this.aClass42_1.method514());
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("85048, " + arg0 + ", " + false + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(I)V")
	public void method229(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt390++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "b", descriptor = "(I)V")
	public void method230(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt390++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt390++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "b", descriptor = "(II)V")
	public void method231(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray12[this.anInt390++] = (byte) arg0;
			this.aByteArray12[this.anInt390++] = 0;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("21696, " + -46595 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "c", descriptor = "(I)V")
	public void method232(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt390++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt390++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt390++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "d", descriptor = "(I)V")
	public void method233(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt390++] = (byte) (arg0 >> 24);
		this.aByteArray12[this.anInt390++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt390++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt390++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(IB)V")
	public void method234(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray12[this.anInt390++] = (byte) arg0;
			this.aByteArray12[this.anInt390++] = (byte) (arg0 >> 8);
			this.aByteArray12[this.anInt390++] = (byte) (arg0 >> 16);
			this.aByteArray12[this.anInt390++] = (byte) (arg0 >> 24);
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("35484, " + arg0 + ", " + 1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(JI)V")
	public void method235(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray12[this.anInt390++] = (byte) (int) (arg0 >> 56);
			this.aByteArray12[this.anInt390++] = (byte) (int) (arg0 >> 48);
			this.aByteArray12[this.anInt390++] = (byte) (int) (arg0 >> 40);
			this.aByteArray12[this.anInt390++] = (byte) (int) (arg0 >> 32);
			this.aByteArray12[this.anInt390++] = (byte) (int) (arg0 >> 24);
			this.aByteArray12[this.anInt390++] = (byte) (int) (arg0 >> 16);
			this.aByteArray12[this.anInt390++] = (byte) (int) (arg0 >> 8);
			this.aByteArray12[this.anInt390++] = (byte) (int) arg0;
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("25312, " + arg0 + ", " + 0 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method236(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray12, this.anInt390);
		this.anInt390 += arg0.length();
		this.aByteArray12[this.anInt390++] = 10;
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(III[B)V")
	public void method237(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < 0 + arg0; local4++) {
				this.aByteArray12[this.anInt390++] = arg1[local4];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("73776, " + 0 + ", " + 0 + ", " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "b", descriptor = "(IB)V")
	public void method238(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray12[this.anInt390 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("9685, " + arg0 + ", " + 4 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "c", descriptor = "()I")
	public int method239() {
		return this.aByteArray12[this.anInt390++] & 0xFF;
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "d", descriptor = "()B")
	public byte method240() {
		return this.aByteArray12[this.anInt390++];
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "e", descriptor = "()I")
	public int method241() {
		this.anInt390 += 2;
		return ((this.aByteArray12[this.anInt390 - 2] & 0xFF) << 8) + (this.aByteArray12[this.anInt390 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "f", descriptor = "()I")
	public int method242() {
		this.anInt390 += 2;
		@Pc(27) int local27 = ((this.aByteArray12[this.anInt390 - 2] & 0xFF) << 8) + (this.aByteArray12[this.anInt390 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "g", descriptor = "()I")
	public int method243() {
		this.anInt390 += 3;
		return ((this.aByteArray12[this.anInt390 - 3] & 0xFF) << 16) + ((this.aByteArray12[this.anInt390 - 2] & 0xFF) << 8) + (this.aByteArray12[this.anInt390 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "h", descriptor = "()I")
	public int method244() {
		this.anInt390 += 4;
		return ((this.aByteArray12[this.anInt390 - 4] & 0xFF) << 24) + ((this.aByteArray12[this.anInt390 - 3] & 0xFF) << 16) + ((this.aByteArray12[this.anInt390 - 2] & 0xFF) << 8) + (this.aByteArray12[this.anInt390 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(Z)J")
	public long method245() {
		try {
			@Pc(10) long local10 = (long) this.method244() & 0xFFFFFFFFL;
			@Pc(16) long local16 = (long) this.method244() & 0xFFFFFFFFL;
			return (local10 << 32) + local16;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("2215, " + false + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "i", descriptor = "()Ljava/lang/String;")
	public String method246() {
		@Pc(2) int local2 = this.anInt390;
		while (this.aByteArray12[this.anInt390++] != 10) {
		}
		return new String(this.aByteArray12, local2, this.anInt390 - local2 - 1);
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "e", descriptor = "(I)[B")
	public byte[] method247() {
		try {
			@Pc(2) int local2 = this.anInt390;
			while (this.aByteArray12[this.anInt390++] != 10) {
			}
			@Pc(29) byte[] local29 = new byte[this.anInt390 - local2 - 1];
			for (@Pc(31) int local31 = local2; local31 < this.anInt390 - 1; local31++) {
				local29[local31 - local2] = this.aByteArray12[local31];
			}
			return local29;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("45743, " + -18086 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "b", descriptor = "(III[B)V")
	private void method248(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < 0 + arg0; local5++) {
				arg1[local5] = this.aByteArray12[this.anInt390++];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("55419, " + 7 + ", " + arg0 + ", " + 0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "f", descriptor = "(I)V")
	public void method249() {
		try {
			this.anInt391 = this.anInt390 * 8;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("12526, " + -19202 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "c", descriptor = "(II)I")
	public int method250(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt391 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt391 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt391 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray12[local6++] & anIntArray131[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray12[local6] & anIntArray131[local13];
			} else {
				local15 += this.aByteArray12[local6] >> local13 - arg0 & anIntArray131[arg0];
			}
			return local15;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("63378, " + arg0 + ", " + 0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "b", descriptor = "(Z)V")
	public void method251() {
		try {
			this.anInt390 = (this.anInt391 + 7) / 8;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("19131, " + true + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "j", descriptor = "()I")
	public int method252() {
		@Pc(7) int local7 = this.aByteArray12[this.anInt390] & 0xFF;
		return local7 < 128 ? this.method239() - 64 : this.method241() - 49152;
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "k", descriptor = "()I")
	public int method253() {
		@Pc(7) int local7 = this.aByteArray12[this.anInt390] & 0xFF;
		return local7 < 128 ? this.method239() : this.method241() - 32768;
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
	public void method254(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt390;
			this.anInt390 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method248(local2, local8);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(34) BigInteger local34 = local19.modPow(arg0, arg1);
			@Pc(37) byte[] local37 = local34.toByteArray();
			this.anInt390 = 0;
			this.method229(local37.length);
			this.method237(local37.length, local37);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("99525, " + arg0 + ", " + arg1 + ", " + false + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "c", descriptor = "(IB)V")
	public void method255(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 == 0) {
				@Pc(3) boolean local3 = false;
				this.aByteArray12[this.anInt390++] = (byte) (arg0 + 128);
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("56534, " + arg0 + ", " + arg1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "d", descriptor = "(II)V")
	public void method256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 == -42352) {
				this.aByteArray12[this.anInt390++] = (byte) -arg0;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("34821, " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(BI)V")
	public void method257(@OriginalArg(1) int arg0) {
		try {
			if (2 == this.aByte27) {
				this.aByteArray12[this.anInt390++] = (byte) (128 - arg0);
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("83476, " + 2 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "g", descriptor = "(I)I")
	public int method258() {
		try {
			return this.aByteArray12[this.anInt390++] - 128 & 0xFF;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("44079, " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "h", descriptor = "(I)I")
	public int method259() {
		try {
			return -this.aByteArray12[this.anInt390++] & 0xFF;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("43673, " + 6 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "i", descriptor = "(I)I")
	public int method260(@OriginalArg(0) int arg0) {
		try {
			return arg0 == 0 ? 128 - this.aByteArray12[this.anInt390++] & 0xFF : this.anInt380;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("68194, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "j", descriptor = "(I)B")
	public byte method261() {
		try {
			return (byte) (this.aByteArray12[this.anInt390++] - 128);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("14174, " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "c", descriptor = "(Z)B")
	public byte method262() {
		try {
			return (byte) -this.aByteArray12[this.anInt390++];
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("12767, " + true + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "k", descriptor = "(I)B")
	public byte method263(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			return (byte) (128 - this.aByteArray12[this.anInt390++]);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("85799, " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "d", descriptor = "(IB)V")
	public void method264(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray12[this.anInt390++] = (byte) arg0;
			this.aByteArray12[this.anInt390++] = (byte) (arg0 >> 8);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("9518, " + arg0 + ", " + 77 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(ZI)V")
	public void method265(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray12[this.anInt390++] = (byte) (arg1 >> 8);
			if (arg0) {
				this.aBoolean112 = !this.aBoolean112;
			}
			this.aByteArray12[this.anInt390++] = (byte) (arg1 + 128);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("77030, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "e", descriptor = "(II)V")
	public void method266(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray12[this.anInt390++] = (byte) (arg0 + 128);
			this.aByteArray12[this.anInt390++] = (byte) (arg0 >> 8);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("83471, " + 0 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "d", descriptor = "(Z)I")
	public int method267() {
		try {
			this.anInt390 += 2;
			return ((this.aByteArray12[this.anInt390 - 1] & 0xFF) << 8) + (this.aByteArray12[this.anInt390 - 2] & 0xFF);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("70488, " + false + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "l", descriptor = "(I)I")
	public int method268() {
		try {
			this.anInt390 += 2;
			return ((this.aByteArray12[this.anInt390 - 2] & 0xFF) << 8) + (this.aByteArray12[this.anInt390 - 1] - 128 & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("72500, " + 759 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(B)I")
	public int method269(@OriginalArg(0) byte arg0) {
		try {
			this.anInt390 += 2;
			@Pc(12) boolean local12 = false;
			return ((this.aByteArray12[this.anInt390 - 1] & 0xFF) << 8) + (this.aByteArray12[this.anInt390 - 2] - 128 & 0xFF);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("50836, " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "e", descriptor = "(Z)I")
	public int method270() {
		try {
			this.anInt390 += 2;
			@Pc(32) int local32 = ((this.aByteArray12[this.anInt390 - 1] & 0xFF) << 8) + (this.aByteArray12[this.anInt390 - 2] & 0xFF);
			if (local32 > 32767) {
				local32 -= 65536;
			}
			return local32;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("35770, " + false + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "b", descriptor = "(B)I")
	public int method271() {
		try {
			this.anInt390 += 2;
			@Pc(29) int local29 = ((this.aByteArray12[this.anInt390 - 2] & 0xFF) << 8) + (this.aByteArray12[this.anInt390 - 1] - 128 & 0xFF);
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("5466, " + -26 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "m", descriptor = "(I)I")
	public int method272(@OriginalArg(0) int arg0) {
		try {
			this.anInt390 += 3;
			@Pc(9) boolean local9 = false;
			return ((this.aByteArray12[this.anInt390 - 3] & 0xFF) << 16) + ((this.aByteArray12[this.anInt390 - 1] & 0xFF) << 8) + (this.aByteArray12[this.anInt390 - 2] & 0xFF);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("11163, " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "n", descriptor = "(I)I")
	public int method273() {
		try {
			this.anInt390 += 4;
			return ((this.aByteArray12[this.anInt390 - 2] & 0xFF) << 24) + ((this.aByteArray12[this.anInt390 - 1] & 0xFF) << 16) + ((this.aByteArray12[this.anInt390 - 4] & 0xFF) << 8) + (this.aByteArray12[this.anInt390 - 3] & 0xFF);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("73205, " + 180 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "c", descriptor = "(B)I")
	public int method274(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			this.anInt390 += 4;
			return ((this.aByteArray12[this.anInt390 - 3] & 0xFF) << 24) + ((this.aByteArray12[this.anInt390 - 4] & 0xFF) << 16) + ((this.aByteArray12[this.anInt390 - 1] & 0xFF) << 8) + (this.aByteArray12[this.anInt390 - 2] & 0xFF);
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("76024, " + arg0 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(BI[BI)V")
	public void method275(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < 0 + arg1; local5++) {
				arg0[local5] = (byte) (this.aByteArray12[this.anInt390++] - 128);
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("13492, " + 7 + ", " + 0 + ", " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}
}

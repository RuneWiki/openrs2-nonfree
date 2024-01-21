import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MVHXDWGI")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!MVHXDWGI", name = "F", descriptor = "I")
	private static int anInt531;

	@OriginalMember(owner = "client!MVHXDWGI", name = "G", descriptor = "I")
	private static int anInt532;

	@OriginalMember(owner = "client!MVHXDWGI", name = "H", descriptor = "I")
	private static int anInt533;

	@OriginalMember(owner = "client!MVHXDWGI", name = "C", descriptor = "[I")
	private static int[] anIntArray105 = new int[256];

	@OriginalMember(owner = "client!MVHXDWGI", name = "D", descriptor = "[I")
	private static final int[] anIntArray106;

	@OriginalMember(owner = "client!MVHXDWGI", name = "I", descriptor = "Lclient!IHMCQRZY;")
	private static Class16 aClass16_2;

	@OriginalMember(owner = "client!MVHXDWGI", name = "J", descriptor = "Lclient!IHMCQRZY;")
	private static Class16 aClass16_3;

	@OriginalMember(owner = "client!MVHXDWGI", name = "K", descriptor = "Lclient!IHMCQRZY;")
	private static Class16 aClass16_4;

	@OriginalMember(owner = "client!MVHXDWGI", name = "L", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!MVHXDWGI", name = "x", descriptor = "I")
	private int anInt528;

	@OriginalMember(owner = "client!MVHXDWGI", name = "z", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!MVHXDWGI", name = "A", descriptor = "I")
	public int anInt529;

	@OriginalMember(owner = "client!MVHXDWGI", name = "B", descriptor = "I")
	public int anInt530;

	@OriginalMember(owner = "client!MVHXDWGI", name = "E", descriptor = "Lclient!QIAMMSTQ;")
	public Class32 aClass32_1;

	@OriginalMember(owner = "client!MVHXDWGI", name = "h", descriptor = "I")
	private int anInt520 = -641;

	@OriginalMember(owner = "client!MVHXDWGI", name = "i", descriptor = "Z")
	private boolean aBoolean100 = true;

	@OriginalMember(owner = "client!MVHXDWGI", name = "j", descriptor = "I")
	private int anInt521 = 8868;

	@OriginalMember(owner = "client!MVHXDWGI", name = "k", descriptor = "Z")
	private boolean aBoolean101 = false;

	@OriginalMember(owner = "client!MVHXDWGI", name = "l", descriptor = "I")
	private int anInt522 = -173;

	@OriginalMember(owner = "client!MVHXDWGI", name = "m", descriptor = "Z")
	private boolean aBoolean102 = true;

	@OriginalMember(owner = "client!MVHXDWGI", name = "n", descriptor = "B")
	private byte aByte14 = 87;

	@OriginalMember(owner = "client!MVHXDWGI", name = "o", descriptor = "B")
	private byte aByte15 = 2;

	@OriginalMember(owner = "client!MVHXDWGI", name = "p", descriptor = "Z")
	private boolean aBoolean103 = false;

	@OriginalMember(owner = "client!MVHXDWGI", name = "q", descriptor = "I")
	private int anInt523 = 65;

	@OriginalMember(owner = "client!MVHXDWGI", name = "r", descriptor = "I")
	private int anInt524 = 964;

	@OriginalMember(owner = "client!MVHXDWGI", name = "s", descriptor = "B")
	private byte aByte16 = -114;

	@OriginalMember(owner = "client!MVHXDWGI", name = "t", descriptor = "Z")
	private boolean aBoolean104 = true;

	@OriginalMember(owner = "client!MVHXDWGI", name = "u", descriptor = "I")
	private int anInt525 = 2;

	@OriginalMember(owner = "client!MVHXDWGI", name = "v", descriptor = "I")
	private int anInt526 = 34;

	@OriginalMember(owner = "client!MVHXDWGI", name = "w", descriptor = "I")
	private int anInt527 = 270;

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
			anIntArray105[local4] = local7;
		}
		anIntArray106 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass16_2 = new Class16(aBoolean105);
		aClass16_3 = new Class16(aBoolean105);
		aClass16_4 = new Class16(aBoolean105);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(BI)Lclient!MVHXDWGI;")
	public static Class1_Sub1_Sub4 method282(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(14) Class16 local14 = aClass16_3;
			synchronized (aClass16_3) {
				@Pc(18) Class1_Sub1_Sub4 local18 = null;
				if (anInt532 > 0) {
					anInt532--;
					local18 = (Class1_Sub1_Sub4) aClass16_3.method184();
				}
				if (local18 != null) {
					local18.anInt529 = 0;
					return local18;
				}
			}
			@Pc(80) Class1_Sub1_Sub4 local80 = new Class1_Sub1_Sub4(774);
			local80.anInt529 = 0;
			local80.aByteArray14 = new byte[5000];
			return local80;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("53887, " + arg0 + ", " + 1 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub4(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray14 = arg1;
			this.anInt529 = 0;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("2489, " + arg0 + ", " + arg1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(IZ)V")
	public void method283(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray14[this.anInt529++] = (byte) (arg0 + this.aClass32_1.method431());
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("35310, " + arg0 + ", " + true + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(I)V")
	public void method284(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt529++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "b", descriptor = "(I)V")
	public void method285(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt529++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "b", descriptor = "(BI)V")
	public void method286(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray14[this.anInt529++] = (byte) arg1;
			this.aByteArray14[this.anInt529++] = 0;
			@Pc(30) boolean local30 = false;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("64194, " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "c", descriptor = "(I)V")
	public void method287(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 16);
		this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt529++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "d", descriptor = "(I)V")
	public void method288(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 24);
		this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 16);
		this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt529++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(IB)V")
	public void method289(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) boolean local4 = false;
			this.aByteArray14[this.anInt529++] = (byte) arg0;
			this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 8);
			this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 16);
			this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 24);
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("97057, " + arg0 + ", " + arg1 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(JI)V")
	public void method290(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 56);
			this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 48);
			this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 40);
			this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 32);
			this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 24);
			this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 16);
			this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 8);
			this.aByteArray14[this.anInt529++] = (byte) arg0;
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("69457, " + arg0 + ", " + 2 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method291(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray14, this.anInt529);
		this.anInt529 += arg0.length();
		this.aByteArray14[this.anInt529++] = 10;
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(I[BII)V")
	public void method292(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(14) int local14 = 0; local14 < arg1 + 0; local14++) {
				this.aByteArray14[this.anInt529++] = arg0[local14];
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("71542, " + -641 + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(ZI)V")
	public void method293(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray14[this.anInt529 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("38579, " + true + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "c", descriptor = "()I")
	public int method294() {
		return this.aByteArray14[this.anInt529++] & 0xFF;
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "d", descriptor = "()B")
	public byte method295() {
		return this.aByteArray14[this.anInt529++];
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "e", descriptor = "()I")
	public int method296() {
		this.anInt529 += 2;
		return ((this.aByteArray14[this.anInt529 - 2] & 0xFF) << 8) + (this.aByteArray14[this.anInt529 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "f", descriptor = "()I")
	public int method297() {
		this.anInt529 += 2;
		@Pc(27) int local27 = ((this.aByteArray14[this.anInt529 - 2] & 0xFF) << 8) + (this.aByteArray14[this.anInt529 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "g", descriptor = "()I")
	public int method298() {
		this.anInt529 += 3;
		return ((this.aByteArray14[this.anInt529 - 3] & 0xFF) << 16) + ((this.aByteArray14[this.anInt529 - 2] & 0xFF) << 8) + (this.aByteArray14[this.anInt529 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "h", descriptor = "()I")
	public int method299() {
		this.anInt529 += 4;
		return ((this.aByteArray14[this.anInt529 - 4] & 0xFF) << 24) + ((this.aByteArray14[this.anInt529 - 3] & 0xFF) << 16) + ((this.aByteArray14[this.anInt529 - 2] & 0xFF) << 8) + (this.aByteArray14[this.anInt529 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "e", descriptor = "(I)J")
	public long method300() {
		try {
			@Pc(5) long local5 = (long) this.method299() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method299() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("86540, " + 0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "i", descriptor = "()Ljava/lang/String;")
	public String method301() {
		@Pc(2) int local2 = this.anInt529;
		while (this.aByteArray14[this.anInt529++] != 10) {
		}
		return new String(this.aByteArray14, local2, this.anInt529 - local2 - 1);
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(Z)[B")
	public byte[] method302() {
		try {
			@Pc(2) int local2 = this.anInt529;
			while (this.aByteArray14[this.anInt529++] != 10) {
			}
			@Pc(28) byte[] local28 = new byte[this.anInt529 - local2 - 1];
			for (@Pc(30) int local30 = local2; local30 < this.anInt529 - 1; local30++) {
				local28[local30 - local2] = this.aByteArray14[local30];
			}
			return local28;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("52917, " + true + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "b", descriptor = "(I[BII)V")
	private void method303(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (this.anInt521 != 8868) {
				this.anInt528 = 427;
			}
			for (@Pc(8) int local8 = 0; local8 < arg0 + 0; local8++) {
				arg1[local8] = this.aByteArray14[this.anInt529++];
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("96051, " + arg0 + ", " + arg1 + ", " + 8868 + ", " + 0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "f", descriptor = "(I)V")
	public void method304() {
		try {
			this.anInt530 = this.anInt529 * 8;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("18514, " + 0 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(II)I")
	public int method305(@OriginalArg(1) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt530 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt530 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt530 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray14[local6++] & anIntArray106[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray14[local6] & anIntArray106[local13];
			} else {
				local15 += this.aByteArray14[local6] >> local13 - arg0 & anIntArray106[arg0];
			}
			return local15;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("16421, " + 1 + ", " + arg0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "g", descriptor = "(I)V")
	public void method306() {
		try {
			this.anInt529 = (this.anInt530 + 7) / 8;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("15383, " + 49924 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "j", descriptor = "()I")
	public int method307() {
		@Pc(7) int local7 = this.aByteArray14[this.anInt529] & 0xFF;
		return local7 < 128 ? this.method294() - 64 : this.method296() - 49152;
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "k", descriptor = "()I")
	public int method308() {
		@Pc(7) int local7 = this.aByteArray14[this.anInt529] & 0xFF;
		return local7 < 128 ? this.method294() : this.method296() - 32768;
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method309(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt529;
			this.anInt529 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method303(local2, local8);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg1, arg0);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt529 = 0;
			this.method284(local27.length);
			this.method292(local27, local27.length);
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("4044, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "c", descriptor = "(BI)V")
	public void method310(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) boolean local4 = false;
			this.aByteArray14[this.anInt529++] = (byte) -arg1;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("12317, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "b", descriptor = "(II)V")
	public void method311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			this.aByteArray14[this.anInt529++] = (byte) (128 - arg1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("20919, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "h", descriptor = "(I)I")
	public int method312(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return this.aByteArray14[this.anInt529++] - 128 & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("25305, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "b", descriptor = "(Z)I")
	public int method313() {
		try {
			return -this.aByteArray14[this.anInt529++] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("64155, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(B)I")
	public int method314() {
		try {
			if (this.aByte16 != -114) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			return 128 - this.aByteArray14[this.anInt529++] & 0xFF;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("10355, " + -114 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "c", descriptor = "(Z)B")
	public byte method315() {
		try {
			return (byte) -this.aByteArray14[this.anInt529++];
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("78224, " + true + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "b", descriptor = "(B)B")
	public byte method316() {
		try {
			return (byte) (128 - this.aByteArray14[this.anInt529++]);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("49950, " + 5 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "d", descriptor = "(BI)V")
	public void method317(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray14[this.anInt529++] = (byte) arg1;
			if (arg0 != 1) {
				for (@Pc(16) int local16 = 1; local16 > 0; local16++) {
				}
			}
			this.aByteArray14[this.anInt529++] = (byte) (arg1 >> 8);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("47319, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "b", descriptor = "(ZI)V")
	public void method318(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 8);
			this.aByteArray14[this.anInt529++] = (byte) (arg0 + 128);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("22063, " + false + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "c", descriptor = "(II)V")
	public void method319(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray14[this.anInt529++] = (byte) (arg0 + 128);
			this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 8);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("668, " + -379 + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "d", descriptor = "(Z)I")
	public int method320() {
		try {
			this.anInt529 += 2;
			return ((this.aByteArray14[this.anInt529 - 1] & 0xFF) << 8) + (this.aByteArray14[this.anInt529 - 2] & 0xFF);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("84996, " + false + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "i", descriptor = "(I)I")
	public int method321() {
		try {
			this.anInt529 += 2;
			return ((this.aByteArray14[this.anInt529 - 2] & 0xFF) << 8) + (this.aByteArray14[this.anInt529 - 1] - 128 & 0xFF);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("25302, " + 3 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "j", descriptor = "(I)I")
	public int method322() {
		try {
			this.anInt529 += 2;
			return ((this.aByteArray14[this.anInt529 - 1] & 0xFF) << 8) + (this.aByteArray14[this.anInt529 - 2] - 128 & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("89164, " + -20383 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "c", descriptor = "(B)I")
	public int method323() {
		try {
			this.anInt529 += 2;
			@Pc(33) int local33 = ((this.aByteArray14[this.anInt529 - 1] & 0xFF) << 8) + (this.aByteArray14[this.anInt529 - 2] & 0xFF);
			if (local33 > 32767) {
				local33 -= 65536;
			}
			return local33;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("48975, " + 47 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "k", descriptor = "(I)I")
	public int method324(@OriginalArg(0) int arg0) {
		try {
			this.anInt529 += 2;
			@Pc(29) int local29 = ((this.aByteArray14[this.anInt529 - 2] & 0xFF) << 8) + (this.aByteArray14[this.anInt529 - 1] - 128 & 0xFF);
			if (arg0 != 16892) {
				this.aBoolean103 = !this.aBoolean103;
			}
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("96844, " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "d", descriptor = "(II)V")
	public void method325(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 16);
			this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 24);
			this.aByteArray14[this.anInt529++] = (byte) arg0;
			this.aByteArray14[this.anInt529++] = (byte) (arg0 >> 8);
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("43927, " + -576 + ", " + arg0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "l", descriptor = "(I)I")
	public int method326(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = true;
			this.anInt529 += 4;
			return ((this.aByteArray14[this.anInt529 - 1] & 0xFF) << 24) + ((this.aByteArray14[this.anInt529 - 2] & 0xFF) << 16) + ((this.aByteArray14[this.anInt529 - 3] & 0xFF) << 8) + (this.aByteArray14[this.anInt529 - 4] & 0xFF);
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("59782, " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "m", descriptor = "(I)I")
	public int method327() {
		try {
			this.anInt529 += 4;
			return ((this.aByteArray14[this.anInt529 - 2] & 0xFF) << 24) + ((this.aByteArray14[this.anInt529 - 1] & 0xFF) << 16) + ((this.aByteArray14[this.anInt529 - 4] & 0xFF) << 8) + (this.aByteArray14[this.anInt529 - 3] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("8411, " + 9 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "e", descriptor = "(Z)I")
	public int method328() {
		try {
			this.anInt529 += 4;
			return ((this.aByteArray14[this.anInt529 - 3] & 0xFF) << 24) + ((this.aByteArray14[this.anInt529 - 4] & 0xFF) << 16) + ((this.aByteArray14[this.anInt529 - 1] & 0xFF) << 8) + (this.aByteArray14[this.anInt529 - 2] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("21890, " + false + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(ZII[B)V")
	public void method329(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(16) int local16 = arg0 + 0 - 1; local16 >= 0; local16--) {
				arg1[local16] = this.aByteArray14[this.anInt529++];
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("20765, " + true + ", " + 0 + ", " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVHXDWGI", name = "c", descriptor = "(I[BII)V")
	public void method330(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			for (@Pc(5) int local5 = 0; local5 < arg1 + 0; local5++) {
				arg0[local5] = (byte) (this.aByteArray14[this.anInt529++] - 128);
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("66810, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}
}

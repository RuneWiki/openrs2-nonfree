import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IMUIZRAF")
public final class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!IMUIZRAF", name = "H", descriptor = "I")
	private static int anInt245;

	@OriginalMember(owner = "client!IMUIZRAF", name = "I", descriptor = "I")
	private static int anInt246;

	@OriginalMember(owner = "client!IMUIZRAF", name = "J", descriptor = "I")
	private static int anInt247;

	@OriginalMember(owner = "client!IMUIZRAF", name = "E", descriptor = "[I")
	private static int[] anIntArray51 = new int[256];

	@OriginalMember(owner = "client!IMUIZRAF", name = "F", descriptor = "[I")
	private static final int[] anIntArray52;

	@OriginalMember(owner = "client!IMUIZRAF", name = "K", descriptor = "Lclient!PILILDKN;")
	private static Class27 aClass27_1;

	@OriginalMember(owner = "client!IMUIZRAF", name = "L", descriptor = "Lclient!PILILDKN;")
	private static Class27 aClass27_2;

	@OriginalMember(owner = "client!IMUIZRAF", name = "M", descriptor = "Lclient!PILILDKN;")
	private static Class27 aClass27_3;

	@OriginalMember(owner = "client!IMUIZRAF", name = "N", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!IMUIZRAF", name = "i", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!IMUIZRAF", name = "B", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!IMUIZRAF", name = "C", descriptor = "I")
	public int anInt243;

	@OriginalMember(owner = "client!IMUIZRAF", name = "D", descriptor = "I")
	public int anInt244;

	@OriginalMember(owner = "client!IMUIZRAF", name = "G", descriptor = "Lclient!XXDUCPOC;")
	public Class46 aClass46_1;

	@OriginalMember(owner = "client!IMUIZRAF", name = "j", descriptor = "I")
	private int anInt236 = 591;

	@OriginalMember(owner = "client!IMUIZRAF", name = "k", descriptor = "B")
	private byte aByte4 = 0;

	@OriginalMember(owner = "client!IMUIZRAF", name = "l", descriptor = "B")
	private byte aByte5 = 53;

	@OriginalMember(owner = "client!IMUIZRAF", name = "m", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!IMUIZRAF", name = "n", descriptor = "I")
	private int anInt237 = -24385;

	@OriginalMember(owner = "client!IMUIZRAF", name = "o", descriptor = "Z")
	private boolean aBoolean81 = true;

	@OriginalMember(owner = "client!IMUIZRAF", name = "p", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!IMUIZRAF", name = "q", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!IMUIZRAF", name = "r", descriptor = "I")
	private int anInt238 = 322;

	@OriginalMember(owner = "client!IMUIZRAF", name = "s", descriptor = "I")
	private int anInt239 = 4;

	@OriginalMember(owner = "client!IMUIZRAF", name = "t", descriptor = "B")
	private byte aByte6 = -105;

	@OriginalMember(owner = "client!IMUIZRAF", name = "u", descriptor = "Z")
	private boolean aBoolean84 = true;

	@OriginalMember(owner = "client!IMUIZRAF", name = "v", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!IMUIZRAF", name = "w", descriptor = "I")
	private int anInt240 = 31514;

	@OriginalMember(owner = "client!IMUIZRAF", name = "x", descriptor = "I")
	private int anInt241 = 7;

	@OriginalMember(owner = "client!IMUIZRAF", name = "y", descriptor = "Z")
	private boolean aBoolean86 = true;

	@OriginalMember(owner = "client!IMUIZRAF", name = "z", descriptor = "Z")
	private boolean aBoolean87 = true;

	@OriginalMember(owner = "client!IMUIZRAF", name = "A", descriptor = "I")
	private int anInt242 = -948;

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
			anIntArray51[local4] = local7;
		}
		anIntArray52 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass27_1 = new Class27(false);
		aClass27_2 = new Class27(false);
		aClass27_3 = new Class27(false);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "a", descriptor = "(II)Lclient!IMUIZRAF;")
	public static Class3_Sub1_Sub3 method134() {
		try {
			@Pc(3) Class27 local3 = aClass27_2;
			synchronized (aClass27_2) {
				@Pc(7) Class3_Sub1_Sub3 local7 = null;
				if (anInt246 > 0) {
					anInt246--;
					local7 = (Class3_Sub1_Sub3) aClass27_2.method304();
				}
				if (local7 != null) {
					local7.anInt243 = 0;
					return local7;
				}
			}
			@Pc(69) Class3_Sub1_Sub3 local69 = new Class3_Sub1_Sub3(8);
			local69.anInt243 = 0;
			local69.aByteArray5 = new byte[5000];
			return local69;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("80967, " + 1 + ", " + 0 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "<init>", descriptor = "(I)V")
	private Class3_Sub1_Sub3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray5 = arg1;
			this.anInt243 = 0;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("54232, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "b", descriptor = "(II)V")
	public void method135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = 9 / arg1;
			this.aByteArray5[this.anInt243++] = (byte) (arg0 + this.aClass46_1.method499());
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("39850, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "a", descriptor = "(I)V")
	public void method136(@OriginalArg(0) int arg0) {
		this.aByteArray5[this.anInt243++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "b", descriptor = "(I)V")
	public void method137(@OriginalArg(0) int arg0) {
		this.aByteArray5[this.anInt243++] = (byte) (arg0 >> 8);
		this.aByteArray5[this.anInt243++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "c", descriptor = "(II)V")
	public void method138(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray5[this.anInt243++] = (byte) arg0;
			this.aByteArray5[this.anInt243++] = 0;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("31956, " + arg0 + ", " + 793 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "c", descriptor = "(I)V")
	public void method139(@OriginalArg(0) int arg0) {
		this.aByteArray5[this.anInt243++] = (byte) (arg0 >> 16);
		this.aByteArray5[this.anInt243++] = (byte) (arg0 >> 8);
		this.aByteArray5[this.anInt243++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "d", descriptor = "(I)V")
	public void method140(@OriginalArg(0) int arg0) {
		this.aByteArray5[this.anInt243++] = (byte) (arg0 >> 24);
		this.aByteArray5[this.anInt243++] = (byte) (arg0 >> 16);
		this.aByteArray5[this.anInt243++] = (byte) (arg0 >> 8);
		this.aByteArray5[this.anInt243++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "d", descriptor = "(II)V")
	public void method141(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray5[this.anInt243++] = (byte) arg0;
			this.aByteArray5[this.anInt243++] = (byte) (arg0 >> 8);
			this.aByteArray5[this.anInt243++] = (byte) (arg0 >> 16);
			this.aByteArray5[this.anInt243++] = (byte) (arg0 >> 24);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("49805, " + arg0 + ", " + 0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "a", descriptor = "(IJ)V")
	public void method142(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			this.aByteArray5[this.anInt243++] = (byte) (arg1 >> 56);
			this.aByteArray5[this.anInt243++] = (byte) (arg1 >> 48);
			@Pc(35) boolean local35 = false;
			this.aByteArray5[this.anInt243++] = (byte) (arg1 >> 40);
			this.aByteArray5[this.anInt243++] = (byte) (arg1 >> 32);
			this.aByteArray5[this.anInt243++] = (byte) (arg1 >> 24);
			this.aByteArray5[this.anInt243++] = (byte) (arg1 >> 16);
			this.aByteArray5[this.anInt243++] = (byte) (arg1 >> 8);
			this.aByteArray5[this.anInt243++] = (byte) arg1;
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("97274, " + arg0 + ", " + arg1 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method143(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray5, this.anInt243);
		this.anInt243 += arg0.length();
		this.aByteArray5[this.anInt243++] = 10;
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "a", descriptor = "(BI[BI)V")
	public void method144(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < arg1 + 0; local5++) {
				this.aByteArray5[this.anInt243++] = arg0[local5];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("68250, " + 2 + ", " + 0 + ", " + arg0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "e", descriptor = "(II)V")
	public void method145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray5[this.anInt243 - arg1 - 1] = (byte) arg1;
			@Pc(14) int local14 = 95 / arg0;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("30309, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "c", descriptor = "()I")
	public int method146() {
		return this.aByteArray5[this.anInt243++] & 0xFF;
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "d", descriptor = "()B")
	public byte method147() {
		return this.aByteArray5[this.anInt243++];
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "e", descriptor = "()I")
	public int method148() {
		this.anInt243 += 2;
		return ((this.aByteArray5[this.anInt243 - 2] & 0xFF) << 8) + (this.aByteArray5[this.anInt243 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "f", descriptor = "()I")
	public int method149() {
		this.anInt243 += 2;
		@Pc(27) int local27 = ((this.aByteArray5[this.anInt243 - 2] & 0xFF) << 8) + (this.aByteArray5[this.anInt243 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "g", descriptor = "()I")
	public int method150() {
		this.anInt243 += 3;
		return ((this.aByteArray5[this.anInt243 - 3] & 0xFF) << 16) + ((this.aByteArray5[this.anInt243 - 2] & 0xFF) << 8) + (this.aByteArray5[this.anInt243 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "h", descriptor = "()I")
	public int method151() {
		this.anInt243 += 4;
		return ((this.aByteArray5[this.anInt243 - 4] & 0xFF) << 24) + ((this.aByteArray5[this.anInt243 - 3] & 0xFF) << 16) + ((this.aByteArray5[this.anInt243 - 2] & 0xFF) << 8) + (this.aByteArray5[this.anInt243 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "a", descriptor = "(B)J")
	public long method152() {
		try {
			if (this.aByte4 != 0) {
				this.aBoolean87 = !this.aBoolean87;
			}
			@Pc(17) long local17 = (long) this.method151() & 0xFFFFFFFFL;
			@Pc(23) long local23 = (long) this.method151() & 0xFFFFFFFFL;
			return (local17 << 32) + local23;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("46568, " + 0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "i", descriptor = "()Ljava/lang/String;")
	public String method153() {
		@Pc(2) int local2 = this.anInt243;
		while (this.aByteArray5[this.anInt243++] != 10) {
		}
		return new String(this.aByteArray5, local2, this.anInt243 - local2 - 1);
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "e", descriptor = "(I)[B")
	public byte[] method154() {
		try {
			@Pc(2) int local2 = this.anInt243;
			while (this.aByteArray5[this.anInt243++] != 10) {
			}
			@Pc(23) byte[] local23 = new byte[this.anInt243 - local2 - 1];
			for (@Pc(31) int local31 = local2; local31 < this.anInt243 - 1; local31++) {
				local23[local31 - local2] = this.aByteArray5[local31];
			}
			return local23;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("42338, " + 7 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "a", descriptor = "(I[BII)V")
	private void method155(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			for (@Pc(5) int local5 = 0; local5 < arg0 + 0; local5++) {
				arg1[local5] = this.aByteArray5[this.anInt243++];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("15916, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "b", descriptor = "(B)V")
	public void method156(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			this.anInt244 = this.anInt243 * 8;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("83771, " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "a", descriptor = "(IB)I")
	public int method157(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt244 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt244 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt244 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray5[local6++] & anIntArray52[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray5[local6] & anIntArray52[local13];
			} else {
				local15 += this.aByteArray5[local6] >> local13 - arg0 & anIntArray52[arg0];
			}
			return local15;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("14849, " + arg0 + ", " + -80 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "f", descriptor = "(I)V")
	public void method158() {
		try {
			this.anInt243 = (this.anInt244 + 7) / 8;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("34954, " + -845 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "j", descriptor = "()I")
	public int method159() {
		@Pc(7) int local7 = this.aByteArray5[this.anInt243] & 0xFF;
		return local7 < 128 ? this.method146() - 64 : this.method148() - 49152;
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "k", descriptor = "()I")
	public int method160() {
		@Pc(7) int local7 = this.aByteArray5[this.anInt243] & 0xFF;
		return local7 < 128 ? this.method146() : this.method148() - 32768;
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method161(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt243;
			this.anInt243 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method155(local2, local8, 67);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(33) BigInteger local33 = local19.modPow(arg1, arg0);
			@Pc(36) byte[] local36 = local33.toByteArray();
			this.anInt243 = 0;
			this.method136(local36.length);
			this.method144(local36, local36.length);
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("64870, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "f", descriptor = "(II)V")
	public void method162(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray5[this.anInt243++] = (byte) (arg0 + 128);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("87172, " + 0 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "g", descriptor = "(II)V")
	public void method163(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray5[this.anInt243++] = (byte) -arg0;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("44898, " + 0 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "h", descriptor = "(II)V")
	public void method164(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray5[this.anInt243++] = (byte) (128 - arg0);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("57597, " + arg0 + ", " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "a", descriptor = "(Z)I")
	public int method165() {
		try {
			return this.aByteArray5[this.anInt243++] - 128 & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("55757, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "g", descriptor = "(I)I")
	public int method166() {
		try {
			return -this.aByteArray5[this.anInt243++] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("18615, " + 178 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "b", descriptor = "(Z)I")
	public int method167() {
		try {
			return 128 - this.aByteArray5[this.anInt243++] & 0xFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("11192, " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "h", descriptor = "(I)B")
	public byte method168(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return (byte) -this.aByteArray5[this.anInt243++];
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("84794, " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "i", descriptor = "(I)B")
	public byte method169() {
		try {
			return (byte) (128 - this.aByteArray5[this.anInt243++]);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("65055, " + 322 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "i", descriptor = "(II)V")
	public void method170(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray5[this.anInt243++] = (byte) arg0;
			this.aByteArray5[this.anInt243++] = (byte) (arg0 >> 8);
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("37372, " + arg0 + ", " + 0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "j", descriptor = "(II)V")
	public void method171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray5[this.anInt243++] = (byte) (arg1 >> 8);
			if (arg0 != 1) {
				this.aBoolean86 = !this.aBoolean86;
			}
			this.aByteArray5[this.anInt243++] = (byte) (arg1 + 128);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("15063, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "k", descriptor = "(II)V")
	public void method172(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray5[this.anInt243++] = (byte) (arg0 + 128);
			this.aByteArray5[this.anInt243++] = (byte) (arg0 >> 8);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("85184, " + arg0 + ", " + 4 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "j", descriptor = "(I)I")
	public int method173() {
		try {
			this.anInt243 += 2;
			return ((this.aByteArray5[this.anInt243 - 1] & 0xFF) << 8) + (this.aByteArray5[this.anInt243 - 2] & 0xFF);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("15286, " + 0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "k", descriptor = "(I)I")
	public int method174() {
		try {
			this.anInt243 += 2;
			return ((this.aByteArray5[this.anInt243 - 2] & 0xFF) << 8) + (this.aByteArray5[this.anInt243 - 1] - 128 & 0xFF);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("81279, " + 2 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "l", descriptor = "(I)I")
	public int method175() {
		try {
			this.anInt243 += 2;
			return ((this.aByteArray5[this.anInt243 - 1] & 0xFF) << 8) + (this.aByteArray5[this.anInt243 - 2] - 128 & 0xFF);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("74866, " + 628 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "c", descriptor = "(B)I")
	public int method176(@OriginalArg(0) byte arg0) {
		try {
			this.anInt243 += 2;
			@Pc(27) int local27 = ((this.aByteArray5[this.anInt243 - 1] & 0xFF) << 8) + (this.aByteArray5[this.anInt243 - 2] & 0xFF);
			@Pc(32) boolean local32 = false;
			if (local27 > 32767) {
				local27 -= 65536;
			}
			return local27;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("8148, " + arg0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "m", descriptor = "(I)I")
	public int method177() {
		try {
			this.anInt243 += 2;
			@Pc(29) int local29 = ((this.aByteArray5[this.anInt243 - 2] & 0xFF) << 8) + (this.aByteArray5[this.anInt243 - 1] - 128 & 0xFF);
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("38287, " + 0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "c", descriptor = "(Z)I")
	public int method178() {
		try {
			this.anInt243 += 4;
			return ((this.aByteArray5[this.anInt243 - 1] & 0xFF) << 24) + ((this.aByteArray5[this.anInt243 - 2] & 0xFF) << 16) + ((this.aByteArray5[this.anInt243 - 3] & 0xFF) << 8) + (this.aByteArray5[this.anInt243 - 4] & 0xFF);
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("76827, " + false + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "n", descriptor = "(I)I")
	public int method179() {
		try {
			this.anInt243 += 4;
			return ((this.aByteArray5[this.anInt243 - 2] & 0xFF) << 24) + ((this.aByteArray5[this.anInt243 - 1] & 0xFF) << 16) + ((this.aByteArray5[this.anInt243 - 4] & 0xFF) << 8) + (this.aByteArray5[this.anInt243 - 3] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("84609, " + 4 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "d", descriptor = "(B)I")
	public int method180(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != -105) {
				this.aBoolean80 = !this.aBoolean80;
			}
			this.anInt243 += 4;
			return ((this.aByteArray5[this.anInt243 - 3] & 0xFF) << 24) + ((this.aByteArray5[this.anInt243 - 4] & 0xFF) << 16) + ((this.aByteArray5[this.anInt243 - 1] & 0xFF) << 8) + (this.aByteArray5[this.anInt243 - 2] & 0xFF);
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("43557, " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "a", descriptor = "(Z[BII)V")
	public void method181(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg1 + 0; local4++) {
				this.aByteArray5[this.anInt243++] = (byte) (arg0[local4] + 128);
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("50089, " + true + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "a", descriptor = "(II[BI)V")
	public void method182(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(11) int local11 = 0; local11 < arg0 + 0; local11++) {
				arg1[local11] = (byte) (this.aByteArray5[this.anInt243++] - 128);
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("46055, " + 0 + ", " + arg0 + ", " + arg1 + ", " + -470 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IMUIZRAF", name = "a", descriptor = "([BIII)V")
	public void method183(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(19) int local19 = arg1 + 0 - 1; local19 >= 0; local19--) {
				arg0[local19] = (byte) (this.aByteArray5[this.anInt243++] - 128);
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("1784, " + arg0 + ", " + 5 + ", " + 0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}
}

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GHHPHSRU")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!GHHPHSRU", name = "i", descriptor = "I")
	private static int anInt248;

	@OriginalMember(owner = "client!GHHPHSRU", name = "G", descriptor = "I")
	private static int anInt259;

	@OriginalMember(owner = "client!GHHPHSRU", name = "H", descriptor = "I")
	private static int anInt260;

	@OriginalMember(owner = "client!GHHPHSRU", name = "I", descriptor = "I")
	private static int anInt261;

	@OriginalMember(owner = "client!GHHPHSRU", name = "D", descriptor = "[I")
	private static int[] anIntArray40 = new int[256];

	@OriginalMember(owner = "client!GHHPHSRU", name = "E", descriptor = "[I")
	private static final int[] anIntArray41;

	@OriginalMember(owner = "client!GHHPHSRU", name = "J", descriptor = "Lclient!VYBZTNTY;")
	private static Class38 aClass38_1;

	@OriginalMember(owner = "client!GHHPHSRU", name = "K", descriptor = "Lclient!VYBZTNTY;")
	private static Class38 aClass38_2;

	@OriginalMember(owner = "client!GHHPHSRU", name = "L", descriptor = "Lclient!VYBZTNTY;")
	private static Class38 aClass38_3;

	@OriginalMember(owner = "client!GHHPHSRU", name = "M", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!GHHPHSRU", name = "l", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!GHHPHSRU", name = "A", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!GHHPHSRU", name = "B", descriptor = "I")
	public int anInt257;

	@OriginalMember(owner = "client!GHHPHSRU", name = "C", descriptor = "I")
	public int anInt258;

	@OriginalMember(owner = "client!GHHPHSRU", name = "F", descriptor = "Lclient!WBHAMUQI;")
	public Class41 aClass41_1;

	@OriginalMember(owner = "client!GHHPHSRU", name = "j", descriptor = "I")
	private int anInt249 = -527;

	@OriginalMember(owner = "client!GHHPHSRU", name = "k", descriptor = "I")
	private int anInt250 = -887;

	@OriginalMember(owner = "client!GHHPHSRU", name = "m", descriptor = "Z")
	private boolean aBoolean44 = true;

	@OriginalMember(owner = "client!GHHPHSRU", name = "n", descriptor = "I")
	private int anInt252 = -8518;

	@OriginalMember(owner = "client!GHHPHSRU", name = "o", descriptor = "I")
	private int anInt253 = 6;

	@OriginalMember(owner = "client!GHHPHSRU", name = "p", descriptor = "I")
	private int anInt254 = 263;

	@OriginalMember(owner = "client!GHHPHSRU", name = "q", descriptor = "I")
	private int anInt255 = 43578;

	@OriginalMember(owner = "client!GHHPHSRU", name = "r", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!GHHPHSRU", name = "s", descriptor = "I")
	private int anInt256 = -184;

	@OriginalMember(owner = "client!GHHPHSRU", name = "t", descriptor = "B")
	private byte aByte7 = 4;

	@OriginalMember(owner = "client!GHHPHSRU", name = "u", descriptor = "B")
	private byte aByte8 = 4;

	@OriginalMember(owner = "client!GHHPHSRU", name = "v", descriptor = "B")
	private byte aByte9 = -77;

	@OriginalMember(owner = "client!GHHPHSRU", name = "w", descriptor = "B")
	private byte aByte10 = 49;

	@OriginalMember(owner = "client!GHHPHSRU", name = "x", descriptor = "Z")
	private boolean aBoolean46 = true;

	@OriginalMember(owner = "client!GHHPHSRU", name = "y", descriptor = "Z")
	private boolean aBoolean47 = true;

	@OriginalMember(owner = "client!GHHPHSRU", name = "z", descriptor = "Z")
	private boolean aBoolean48 = false;

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
			anIntArray40[local4] = local7;
		}
		anIntArray41 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass38_1 = new Class38((byte) 55);
		aClass38_2 = new Class38((byte) 55);
		aClass38_3 = new Class38((byte) 55);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "a", descriptor = "(II)Lclient!GHHPHSRU;")
	public static Class3_Sub1_Sub2 method77() {
		try {
			@Pc(3) Class38 local3 = aClass38_2;
			synchronized (aClass38_2) {
				@Pc(7) Class3_Sub1_Sub2 local7 = null;
				if (anInt260 > 0) {
					anInt260--;
					local7 = (Class3_Sub1_Sub2) aClass38_2.method485();
				}
				if (local7 != null) {
					local7.anInt257 = 0;
					return local7;
				}
			}
			@Pc(69) Class3_Sub1_Sub2 local69 = new Class3_Sub1_Sub2(anInt248);
			local69.anInt257 = 0;
			local69.aByteArray3 = new byte[5000];
			return local69;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("56689, " + 987 + ", " + 1 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "<init>", descriptor = "(I)V")
	private Class3_Sub1_Sub2(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				throw new NullPointerException();
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("65349, " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray3 = arg1;
			this.anInt257 = 0;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("96315, " + arg0 + ", " + arg1 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "a", descriptor = "(ZI)V")
	public void method78(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0) {
				this.aByteArray3[this.anInt257++] = (byte) (arg1 + this.aClass41_1.method500());
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("61177, " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "a", descriptor = "(I)V")
	public void method79(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt257++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "b", descriptor = "(I)V")
	public void method80(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt257++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "b", descriptor = "(II)V")
	public void method81(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray3[this.anInt257++] = (byte) arg0;
			this.aByteArray3[this.anInt257++] = 0;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("6445, " + arg0 + ", " + 4 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "c", descriptor = "(I)V")
	public void method82(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 16);
		this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt257++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "d", descriptor = "(I)V")
	public void method83(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 24);
		this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 16);
		this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt257++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "a", descriptor = "(BI)V")
	public void method84(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray3[this.anInt257++] = (byte) arg0;
			this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 8);
			this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 16);
			this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 24);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("75242, " + 10 + ", " + arg0 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "a", descriptor = "(JI)V")
	public void method85(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 56);
			this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 48);
			this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 40);
			this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 32);
			this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 24);
			this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 16);
			this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 8);
			this.aByteArray3[this.anInt257++] = (byte) arg0;
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("48809, " + arg0 + ", " + 0 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method86(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray3, this.anInt257);
		this.anInt257 += arg0.length();
		this.aByteArray3[this.anInt257++] = 10;
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "a", descriptor = "([BIII)V")
	public void method87(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg1 + 0; local4++) {
				this.aByteArray3[this.anInt257++] = arg0[local4];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("80977, " + arg0 + ", " + 0 + ", " + arg1 + ", " + 717 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "c", descriptor = "(II)V")
	public void method88(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray3[this.anInt257 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("65182, " + arg0 + ", " + -48308 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "c", descriptor = "()I")
	public int method89() {
		return this.aByteArray3[this.anInt257++] & 0xFF;
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "d", descriptor = "()B")
	public byte method90() {
		return this.aByteArray3[this.anInt257++];
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "e", descriptor = "()I")
	public int method91() {
		this.anInt257 += 2;
		return ((this.aByteArray3[this.anInt257 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt257 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "f", descriptor = "()I")
	public int method92() {
		this.anInt257 += 2;
		@Pc(27) int local27 = ((this.aByteArray3[this.anInt257 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt257 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "g", descriptor = "()I")
	public int method93() {
		this.anInt257 += 3;
		return ((this.aByteArray3[this.anInt257 - 3] & 0xFF) << 16) + ((this.aByteArray3[this.anInt257 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt257 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "h", descriptor = "()I")
	public int method94() {
		this.anInt257 += 4;
		return ((this.aByteArray3[this.anInt257 - 4] & 0xFF) << 24) + ((this.aByteArray3[this.anInt257 - 3] & 0xFF) << 16) + ((this.aByteArray3[this.anInt257 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt257 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "a", descriptor = "(B)J")
	public long method95(@OriginalArg(0) byte arg0) {
		try {
			@Pc(5) long local5 = (long) this.method94() & 0xFFFFFFFFL;
			if (arg0 != 3) {
				for (@Pc(10) int local10 = 1; local10 > 0; local10++) {
				}
			}
			@Pc(21) long local21 = (long) this.method94() & 0xFFFFFFFFL;
			return (local5 << 32) + local21;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("74017, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "i", descriptor = "()Ljava/lang/String;")
	public String method96() {
		@Pc(2) int local2 = this.anInt257;
		while (this.aByteArray3[this.anInt257++] != 10) {
		}
		return new String(this.aByteArray3, local2, this.anInt257 - local2 - 1);
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "e", descriptor = "(I)[B")
	public byte[] method97() {
		try {
			@Pc(9) int local9 = this.anInt257;
			while (this.aByteArray3[this.anInt257++] != 10) {
			}
			@Pc(30) byte[] local30 = new byte[this.anInt257 - local9 - 1];
			for (@Pc(32) int local32 = local9; local32 < this.anInt257 - 1; local32++) {
				local30[local32 - local9] = this.aByteArray3[local32];
			}
			return local30;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("6114, " + 5 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "a", descriptor = "(II[BI)V")
	private void method98(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(13) int local13 = 0; local13 < arg0 + 0; local13++) {
				arg1[local13] = this.aByteArray3[this.anInt257++];
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("50684, " + arg0 + ", " + 0 + ", " + arg1 + ", " + -2486 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "a", descriptor = "(Z)V")
	public void method99() {
		try {
			this.anInt258 = this.anInt257 * 8;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("89719, " + false + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "d", descriptor = "(II)I")
	public int method100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			while (arg1 >= 0) {
				this.anInt250 = 386;
			}
			@Pc(13) int local13 = this.anInt258 >> 3;
			@Pc(20) int local20 = 8 - (this.anInt258 & 0x7);
			@Pc(22) int local22 = 0;
			this.anInt258 += arg0;
			while (arg0 > local20) {
				local22 += (this.aByteArray3[local13++] & anIntArray41[local20]) << arg0 - local20;
				arg0 -= local20;
				local20 = 8;
			}
			if (arg0 == local20) {
				local22 += this.aByteArray3[local13] & anIntArray41[local20];
			} else {
				local22 += this.aByteArray3[local13] >> local20 - arg0 & anIntArray41[arg0];
			}
			return local22;
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("55810, " + arg0 + ", " + arg1 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "f", descriptor = "(I)V")
	public void method101() {
		try {
			this.anInt257 = (this.anInt258 + 7) / 8;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("43808, " + 0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "j", descriptor = "()I")
	public int method102() {
		@Pc(7) int local7 = this.aByteArray3[this.anInt257] & 0xFF;
		return local7 < 128 ? this.method89() - 64 : this.method91() - 49152;
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "k", descriptor = "()I")
	public int method103() {
		@Pc(7) int local7 = this.aByteArray3[this.anInt257] & 0xFF;
		return local7 < 128 ? this.method89() : this.method91() - 32768;
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method104(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) int arg1, @OriginalArg(2) BigInteger arg2) {
		try {
			@Pc(2) int local2 = this.anInt257;
			this.anInt257 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method98(local2, local8);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg0, arg2);
			if (arg1 != 8) {
				for (@Pc(29) int local29 = 1; local29 > 0; local29++) {
				}
			}
			@Pc(37) byte[] local37 = local24.toByteArray();
			this.anInt257 = 0;
			this.method79(local37.length);
			this.method87(local37, local37.length);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("60640, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "e", descriptor = "(II)V")
	public void method105(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray3[this.anInt257++] = (byte) (arg0 + 128);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("32684, " + -472 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "f", descriptor = "(II)V")
	public void method106(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray3[this.anInt257++] = (byte) -arg0;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("9892, " + arg0 + ", " + -407 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "a", descriptor = "(IZ)V")
	public void method107(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray3[this.anInt257++] = (byte) (128 - arg0);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("36876, " + arg0 + ", " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "b", descriptor = "(B)I")
	public int method108() {
		try {
			return this.aByteArray3[this.anInt257++] - 128 & 0xFF;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("31529, " + 49 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "g", descriptor = "(I)I")
	public int method109() {
		try {
			return -this.aByteArray3[this.anInt257++] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("79291, " + -6 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "c", descriptor = "(B)I")
	public int method110() {
		try {
			return 128 - this.aByteArray3[this.anInt257++] & 0xFF;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("77737, " + -82 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "h", descriptor = "(I)B")
	public byte method111(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			return (byte) -this.aByteArray3[this.anInt257++];
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("54026, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "d", descriptor = "(B)B")
	public byte method112() {
		try {
			return (byte) (128 - this.aByteArray3[this.anInt257++]);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("5278, " + -91 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "g", descriptor = "(II)V")
	public void method113(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray3[this.anInt257++] = (byte) arg0;
			this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 8);
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("8177, " + 9 + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "h", descriptor = "(II)V")
	public void method114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray3[this.anInt257++] = (byte) (arg1 >> 8);
			@Pc(17) boolean local17 = false;
			this.aByteArray3[this.anInt257++] = (byte) (arg1 + 128);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("41220, " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "i", descriptor = "(II)V")
	public void method115(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray3[this.anInt257++] = (byte) (arg0 + 128);
			this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 8);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("39321, " + arg0 + ", " + 725 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "e", descriptor = "(B)I")
	public int method116() {
		try {
			this.anInt257 += 2;
			return ((this.aByteArray3[this.anInt257 - 1] & 0xFF) << 8) + (this.aByteArray3[this.anInt257 - 2] & 0xFF);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("78712, " + 4 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "i", descriptor = "(I)I")
	public int method117() {
		try {
			this.anInt257 += 2;
			return ((this.aByteArray3[this.anInt257 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt257 - 1] - 128 & 0xFF);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("66780, " + 0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "j", descriptor = "(I)I")
	public int method118() {
		try {
			this.anInt257 += 2;
			return ((this.aByteArray3[this.anInt257 - 1] & 0xFF) << 8) + (this.aByteArray3[this.anInt257 - 2] - 128 & 0xFF);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("54620, " + 440 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "k", descriptor = "(I)I")
	public int method119() {
		try {
			this.anInt257 += 2;
			@Pc(27) int local27 = ((this.aByteArray3[this.anInt257 - 1] & 0xFF) << 8) + (this.aByteArray3[this.anInt257 - 2] & 0xFF);
			if (local27 > 32767) {
				local27 -= 65536;
			}
			return local27;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("33391, " + 4 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "b", descriptor = "(Z)I")
	public int method120() {
		try {
			this.anInt257 += 2;
			@Pc(38) int local38 = ((this.aByteArray3[this.anInt257 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt257 - 1] - 128 & 0xFF);
			if (local38 > 32767) {
				local38 -= 65536;
			}
			return local38;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("60396, " + true + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "f", descriptor = "(B)I")
	public int method121() {
		try {
			this.anInt257 += 3;
			return ((this.aByteArray3[this.anInt257 - 1] & 0xFF) << 16) + ((this.aByteArray3[this.anInt257 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt257 - 3] & 0xFF);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("33160, " + 61 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "b", descriptor = "(IZ)V")
	public void method122(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 8);
			this.aByteArray3[this.anInt257++] = (byte) arg0;
			this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 24);
			this.aByteArray3[this.anInt257++] = (byte) (arg0 >> 16);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("8334, " + arg0 + ", " + false + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "g", descriptor = "(B)I")
	public int method123(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == this.aByte8) {
				@Pc(5) boolean local5 = false;
				this.anInt257 += 4;
				return ((this.aByteArray3[this.anInt257 - 1] & 0xFF) << 24) + ((this.aByteArray3[this.anInt257 - 2] & 0xFF) << 16) + ((this.aByteArray3[this.anInt257 - 3] & 0xFF) << 8) + (this.aByteArray3[this.anInt257 - 4] & 0xFF);
			} else {
				return 4;
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("88391, " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "h", descriptor = "(B)I")
	public int method124() {
		try {
			this.anInt257 += 4;
			return ((this.aByteArray3[this.anInt257 - 3] & 0xFF) << 24) + ((this.aByteArray3[this.anInt257 - 4] & 0xFF) << 16) + ((this.aByteArray3[this.anInt257 - 1] & 0xFF) << 8) + (this.aByteArray3[this.anInt257 - 2] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("67520, " + 102 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "a", descriptor = "([BIIB)V")
	public void method125(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(13) int local13 = 0; local13 < arg1 + 0; local13++) {
				this.aByteArray3[this.anInt257++] = (byte) (arg0[local13] + 128);
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("95819, " + arg0 + ", " + 0 + ", " + arg1 + ", " + 7 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "b", descriptor = "(II[BI)V")
	public void method126(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(17) int local17 = arg0 + 0 - 1; local17 >= 0; local17--) {
				arg1[local17] = this.aByteArray3[this.anInt257++];
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("43649, " + arg0 + ", " + 4 + ", " + arg1 + ", " + 0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHHPHSRU", name = "a", descriptor = "(IIZ[B)V")
	public void method127(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(10) int local10 = arg0 + 0 - 1; local10 >= 0; local10--) {
				arg1[local10] = (byte) (this.aByteArray3[this.anInt257++] - 128);
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("39710, " + arg0 + ", " + 0 + ", " + true + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}
}

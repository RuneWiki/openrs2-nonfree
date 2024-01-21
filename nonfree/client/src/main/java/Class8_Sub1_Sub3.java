import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IUVBENCV")
public final class Class8_Sub1_Sub3 extends Class8_Sub1 {

	@OriginalMember(owner = "client!IUVBENCV", name = "G", descriptor = "I")
	private static int anInt241;

	@OriginalMember(owner = "client!IUVBENCV", name = "H", descriptor = "I")
	private static int anInt242;

	@OriginalMember(owner = "client!IUVBENCV", name = "I", descriptor = "I")
	private static int anInt243;

	@OriginalMember(owner = "client!IUVBENCV", name = "y", descriptor = "I")
	private static int anInt237 = -521;

	@OriginalMember(owner = "client!IUVBENCV", name = "D", descriptor = "[I")
	private static int[] anIntArray44 = new int[256];

	@OriginalMember(owner = "client!IUVBENCV", name = "E", descriptor = "[I")
	private static final int[] anIntArray45;

	@OriginalMember(owner = "client!IUVBENCV", name = "J", descriptor = "Lclient!ZEEWTYXI;")
	private static Class49 aClass49_6;

	@OriginalMember(owner = "client!IUVBENCV", name = "K", descriptor = "Lclient!ZEEWTYXI;")
	private static Class49 aClass49_7;

	@OriginalMember(owner = "client!IUVBENCV", name = "L", descriptor = "Lclient!ZEEWTYXI;")
	private static Class49 aClass49_8;

	@OriginalMember(owner = "client!IUVBENCV", name = "M", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!IUVBENCV", name = "j", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!IUVBENCV", name = "m", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!IUVBENCV", name = "x", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!IUVBENCV", name = "A", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!IUVBENCV", name = "B", descriptor = "I")
	public int anInt239;

	@OriginalMember(owner = "client!IUVBENCV", name = "C", descriptor = "I")
	public int anInt240;

	@OriginalMember(owner = "client!IUVBENCV", name = "F", descriptor = "Lclient!ICHYZYSQ;")
	public Class18 aClass18_1;

	@OriginalMember(owner = "client!IUVBENCV", name = "k", descriptor = "I")
	private int anInt230 = 18462;

	@OriginalMember(owner = "client!IUVBENCV", name = "l", descriptor = "B")
	private byte aByte4 = -33;

	@OriginalMember(owner = "client!IUVBENCV", name = "n", descriptor = "I")
	private int anInt232 = 7;

	@OriginalMember(owner = "client!IUVBENCV", name = "o", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!IUVBENCV", name = "p", descriptor = "I")
	private int anInt233 = 9;

	@OriginalMember(owner = "client!IUVBENCV", name = "q", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!IUVBENCV", name = "r", descriptor = "I")
	private int anInt234 = 7;

	@OriginalMember(owner = "client!IUVBENCV", name = "s", descriptor = "Z")
	private boolean aBoolean54 = true;

	@OriginalMember(owner = "client!IUVBENCV", name = "t", descriptor = "Z")
	private boolean aBoolean55 = true;

	@OriginalMember(owner = "client!IUVBENCV", name = "u", descriptor = "I")
	private int anInt235 = -39421;

	@OriginalMember(owner = "client!IUVBENCV", name = "v", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!IUVBENCV", name = "w", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!IUVBENCV", name = "z", descriptor = "I")
	private int anInt238 = -66;

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
			anIntArray44[local6] = local9;
		}
		anIntArray45 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass49_6 = new Class49(223);
		aClass49_7 = new Class49(223);
		aClass49_8 = new Class49(223);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(ZI)Lclient!IUVBENCV;")
	public static Class8_Sub1_Sub3 method140(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(3) Class49 local3 = aClass49_7;
			synchronized (aClass49_7) {
				@Pc(7) Class8_Sub1_Sub3 local7 = null;
				if (anInt242 > 0) {
					anInt242--;
					local7 = (Class8_Sub1_Sub3) aClass49_7.method537();
				}
				if (local7 != null) {
					local7.anInt239 = 0;
					return local7;
				}
			}
			@Pc(69) Class8_Sub1_Sub3 local69 = new Class8_Sub1_Sub3(-22219);
			if (arg0) {
				anInt237 = -371;
			}
			local69.anInt239 = 0;
			local69.aByteArray7 = new byte[5000];
			return local69;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("63578, " + arg0 + ", " + 1 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "<init>", descriptor = "(I)V")
	private Class8_Sub1_Sub3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "<init>", descriptor = "([BI)V")
	public Class8_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray7 = arg0;
			this.anInt239 = 0;
			@Pc(50) int local50 = 35 / arg1;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("63799, " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(II)V")
	public void method141(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt239++] = (byte) (arg0 + this.aClass18_1.method135());
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("34258, " + -281 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(I)V")
	public void method142(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt239++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "b", descriptor = "(I)V")
	public void method143(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt239++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt239++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "b", descriptor = "(II)V")
	public void method144(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt239++] = (byte) arg0;
			this.aByteArray7[this.anInt239++] = 0;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("62738, " + 1 + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "c", descriptor = "(I)V")
	public void method145(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt239++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt239++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt239++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "d", descriptor = "(I)V")
	public void method146(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt239++] = (byte) (arg0 >> 24);
		this.aByteArray7[this.anInt239++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt239++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt239++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "c", descriptor = "(II)V")
	public void method147(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt239++] = (byte) arg0;
			this.aByteArray7[this.anInt239++] = (byte) (arg0 >> 8);
			this.aByteArray7[this.anInt239++] = (byte) (arg0 >> 16);
			this.aByteArray7[this.anInt239++] = (byte) (arg0 >> 24);
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("66603, " + 246 + ", " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(JI)V")
	public void method148(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray7[this.anInt239++] = (byte) (arg0 >> 56);
			this.aByteArray7[this.anInt239++] = (byte) (arg0 >> 48);
			this.aByteArray7[this.anInt239++] = (byte) (arg0 >> 40);
			this.aByteArray7[this.anInt239++] = (byte) (arg0 >> 32);
			this.aByteArray7[this.anInt239++] = (byte) (arg0 >> 24);
			this.aByteArray7[this.anInt239++] = (byte) (arg0 >> 16);
			this.aByteArray7[this.anInt239++] = (byte) (arg0 >> 8);
			this.aByteArray7[this.anInt239++] = (byte) arg0;
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("2799, " + arg0 + ", " + -45352 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method149(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray7, this.anInt239);
		this.anInt239 += arg0.length();
		this.aByteArray7[this.anInt239++] = 10;
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(I[BII)V")
	public void method150(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg1 + 0; local4++) {
				this.aByteArray7[this.anInt239++] = arg0[local4];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("60165, " + 0 + ", " + arg0 + ", " + 0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "d", descriptor = "(II)V")
	public void method151(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt239 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("92749, " + 0 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "c", descriptor = "()I")
	public int method152() {
		return this.aByteArray7[this.anInt239++] & 0xFF;
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "d", descriptor = "()B")
	public byte method153() {
		return this.aByteArray7[this.anInt239++];
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "e", descriptor = "()I")
	public int method154() {
		this.anInt239 += 2;
		return ((this.aByteArray7[this.anInt239 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt239 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "f", descriptor = "()I")
	public int method155() {
		this.anInt239 += 2;
		@Pc(27) int local27 = ((this.aByteArray7[this.anInt239 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt239 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "g", descriptor = "()I")
	public int method156() {
		this.anInt239 += 3;
		return ((this.aByteArray7[this.anInt239 - 3] & 0xFF) << 16) + ((this.aByteArray7[this.anInt239 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt239 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "h", descriptor = "()I")
	public int method157() {
		this.anInt239 += 4;
		return ((this.aByteArray7[this.anInt239 - 4] & 0xFF) << 24) + ((this.aByteArray7[this.anInt239 - 3] & 0xFF) << 16) + ((this.aByteArray7[this.anInt239 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt239 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "e", descriptor = "(I)J")
	public long method158() {
		try {
			@Pc(5) long local5 = (long) this.method157() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method157() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("95786, " + -225 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "i", descriptor = "()Ljava/lang/String;")
	public String method159() {
		@Pc(2) int local2 = this.anInt239;
		while (this.aByteArray7[this.anInt239++] != 10) {
		}
		return new String(this.aByteArray7, local2, this.anInt239 - local2 - 1);
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(B)[B")
	public byte[] method160() {
		try {
			@Pc(8) int local8 = this.anInt239;
			while (this.aByteArray7[this.anInt239++] != 10) {
			}
			@Pc(29) byte[] local29 = new byte[this.anInt239 - local8 - 1];
			for (@Pc(31) int local31 = local8; local31 < this.anInt239 - 1; local31++) {
				local29[local31 - local8] = this.aByteArray7[local31];
			}
			return local29;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("70617, " + 85 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(IZI[B)V")
	public void method161(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < arg0 + 0; local5++) {
				arg1[local5] = this.aByteArray7[this.anInt239++];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("49755, " + arg0 + ", " + false + ", " + 0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "b", descriptor = "(B)V")
	public void method162() {
		try {
			this.anInt240 = this.anInt239 * 8;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("27578, " + 81 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "e", descriptor = "(II)I")
	public int method163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) int local6 = this.anInt240 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt240 & 0x7);
			@Pc(15) int local15 = 0;
			@Pc(19) boolean local19 = false;
			this.anInt240 += arg1;
			while (arg1 > local13) {
				local15 += (this.aByteArray7[local6++] & anIntArray45[local13]) << arg1 - local13;
				arg1 -= local13;
				local13 = 8;
			}
			if (arg1 == local13) {
				local15 += this.aByteArray7[local6] & anIntArray45[local13];
			} else {
				local15 += this.aByteArray7[local6] >> local13 - arg1 & anIntArray45[arg1];
			}
			return local15;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("95387, " + arg0 + ", " + arg1 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "f", descriptor = "(I)V")
	public void method164() {
		try {
			this.anInt239 = (this.anInt240 + 7) / 8;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("18405, " + 547 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "j", descriptor = "()I")
	public int method165() {
		@Pc(7) int local7 = this.aByteArray7[this.anInt239] & 0xFF;
		return local7 < 128 ? this.method152() - 64 : this.method154() - 49152;
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "k", descriptor = "()I")
	public int method166() {
		@Pc(7) int local7 = this.aByteArray7[this.anInt239] & 0xFF;
		return local7 < 128 ? this.method152() : this.method154() - 32768;
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
	public void method167(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt239;
			this.anInt239 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method161(local2, local8);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg1, arg0);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt239 = 0;
			this.method142(local27.length);
			this.method150(local27, local27.length);
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("90170, " + arg0 + ", " + true + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "b", descriptor = "(ZI)V")
	public void method168(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt239++] = (byte) (128 - arg0);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("47990, " + false + ", " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "g", descriptor = "(I)I")
	public int method169() {
		try {
			return this.aByteArray7[this.anInt239++] - 128 & 0xFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("69737, " + 317 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(Z)I")
	public int method170(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				this.anInt235 = 93;
			}
			return -this.aByteArray7[this.anInt239++] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("91933, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "h", descriptor = "(I)I")
	public int method171(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != this.anInt233) {
				this.aBoolean57 = !this.aBoolean57;
			}
			return 128 - this.aByteArray7[this.anInt239++] & 0xFF;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("76816, " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "c", descriptor = "(B)B")
	public byte method172() {
		try {
			return (byte) (this.aByteArray7[this.anInt239++] - 128);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("79908, " + 117 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "d", descriptor = "(B)B")
	public byte method173(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			return (byte) -this.aByteArray7[this.anInt239++];
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("12870, " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "e", descriptor = "(B)B")
	public byte method174(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 8) {
				throw new NullPointerException();
			}
			return (byte) (128 - this.aByteArray7[this.anInt239++]);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("49852, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "c", descriptor = "(ZI)V")
	public void method175(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt239++] = (byte) arg0;
			this.aByteArray7[this.anInt239++] = (byte) (arg0 >> 8);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("83833, " + false + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "f", descriptor = "(II)V")
	public void method176(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt239++] = (byte) (arg0 >> 8);
			this.aByteArray7[this.anInt239++] = (byte) (arg0 + 128);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("63852, " + -65 + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "g", descriptor = "(II)V")
	public void method177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray7[this.anInt239++] = (byte) (arg0 + 128);
			this.aByteArray7[this.anInt239++] = (byte) (arg0 >> 8);
			while (arg1 >= 0) {
				this.anInt235 = 358;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("79949, " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "i", descriptor = "(I)I")
	public int method178() {
		try {
			this.anInt239 += 2;
			return ((this.aByteArray7[this.anInt239 - 1] & 0xFF) << 8) + (this.aByteArray7[this.anInt239 - 2] & 0xFF);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("70891, " + -725 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "j", descriptor = "(I)I")
	public int method179() {
		try {
			this.anInt239 += 2;
			if (this.anInt234 != 7) {
				for (@Pc(11) int local11 = 1; local11 > 0; local11++) {
				}
			}
			return ((this.aByteArray7[this.anInt239 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt239 - 1] - 128 & 0xFF);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("32537, " + 7 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "k", descriptor = "(I)I")
	public int method180(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != -41562) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			this.anInt239 += 2;
			return ((this.aByteArray7[this.anInt239 - 1] & 0xFF) << 8) + (this.aByteArray7[this.anInt239 - 2] - 128 & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("63264, " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "b", descriptor = "(Z)I")
	public int method181() {
		try {
			this.anInt239 += 2;
			@Pc(27) int local27 = ((this.aByteArray7[this.anInt239 - 1] & 0xFF) << 8) + (this.aByteArray7[this.anInt239 - 2] & 0xFF);
			if (local27 > 32767) {
				local27 -= 65536;
			}
			return local27;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("4116, " + false + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "l", descriptor = "(I)I")
	public int method182() {
		try {
			this.anInt239 += 2;
			@Pc(36) int local36 = ((this.aByteArray7[this.anInt239 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt239 - 1] - 128 & 0xFF);
			if (local36 > 32767) {
				local36 -= 65536;
			}
			return local36;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("81005, " + -69 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "m", descriptor = "(I)I")
	public int method183() {
		try {
			this.anInt239 += 3;
			return ((this.aByteArray7[this.anInt239 - 2] & 0xFF) << 16) + ((this.aByteArray7[this.anInt239 - 3] & 0xFF) << 8) + (this.aByteArray7[this.anInt239 - 1] & 0xFF);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("81539, " + 0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "c", descriptor = "(Z)I")
	public int method184() {
		try {
			this.anInt239 += 4;
			return ((this.aByteArray7[this.anInt239 - 1] & 0xFF) << 24) + ((this.aByteArray7[this.anInt239 - 2] & 0xFF) << 16) + ((this.aByteArray7[this.anInt239 - 3] & 0xFF) << 8) + (this.aByteArray7[this.anInt239 - 4] & 0xFF);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("6658, " + true + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "n", descriptor = "(I)I")
	public int method185() {
		try {
			this.anInt239 += 4;
			return ((this.aByteArray7[this.anInt239 - 2] & 0xFF) << 24) + ((this.aByteArray7[this.anInt239 - 1] & 0xFF) << 16) + ((this.aByteArray7[this.anInt239 - 4] & 0xFF) << 8) + (this.aByteArray7[this.anInt239 - 3] & 0xFF);
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("4961, " + 0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "o", descriptor = "(I)I")
	public int method186(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0 && arg0 <= 0) {
				this.anInt239 += 4;
				return ((this.aByteArray7[this.anInt239 - 3] & 0xFF) << 24) + ((this.aByteArray7[this.anInt239 - 4] & 0xFF) << 16) + ((this.aByteArray7[this.anInt239 - 1] & 0xFF) << 8) + (this.aByteArray7[this.anInt239 - 2] & 0xFF);
			} else {
				return this.anInt238;
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("37937, " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(III[B)V")
	public void method187(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			@Pc(6) int local6;
			if (arg0 != -7662) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			for (local6 = 0; local6 < arg1 + 0; local6++) {
				this.aByteArray7[this.anInt239++] = (byte) (arg2[local6] + 128);
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("8790, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(I[BIB)V")
	public void method188(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			for (@Pc(17) int local17 = arg0 + 0 - 1; local17 >= 0; local17--) {
				arg1[local17] = this.aByteArray7[this.anInt239++];
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("58727, " + arg0 + ", " + arg1 + ", " + 0 + ", " + -41 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}
}

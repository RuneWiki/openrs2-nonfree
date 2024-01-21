import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GLMIQHJI")
public final class Class8_Sub1_Sub3 extends Class8_Sub1 {

	@OriginalMember(owner = "client!GLMIQHJI", name = "H", descriptor = "I")
	private static int anInt255;

	@OriginalMember(owner = "client!GLMIQHJI", name = "I", descriptor = "I")
	private static int anInt256;

	@OriginalMember(owner = "client!GLMIQHJI", name = "J", descriptor = "I")
	private static int anInt257;

	@OriginalMember(owner = "client!GLMIQHJI", name = "E", descriptor = "[I")
	private static int[] anIntArray43 = new int[256];

	@OriginalMember(owner = "client!GLMIQHJI", name = "F", descriptor = "[I")
	private static final int[] anIntArray44;

	@OriginalMember(owner = "client!GLMIQHJI", name = "K", descriptor = "Lclient!VLLJSJTJ;")
	private static Class37 aClass37_1;

	@OriginalMember(owner = "client!GLMIQHJI", name = "L", descriptor = "Lclient!VLLJSJTJ;")
	private static Class37 aClass37_2;

	@OriginalMember(owner = "client!GLMIQHJI", name = "M", descriptor = "Lclient!VLLJSJTJ;")
	private static Class37 aClass37_3;

	@OriginalMember(owner = "client!GLMIQHJI", name = "N", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!GLMIQHJI", name = "l", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!GLMIQHJI", name = "p", descriptor = "I")
	private int anInt248;

	@OriginalMember(owner = "client!GLMIQHJI", name = "B", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!GLMIQHJI", name = "C", descriptor = "I")
	public int anInt253;

	@OriginalMember(owner = "client!GLMIQHJI", name = "D", descriptor = "I")
	public int anInt254;

	@OriginalMember(owner = "client!GLMIQHJI", name = "G", descriptor = "Lclient!BPJMPIUS;")
	public Class5 aClass5_1;

	@OriginalMember(owner = "client!GLMIQHJI", name = "i", descriptor = "I")
	private int anInt245 = -918;

	@OriginalMember(owner = "client!GLMIQHJI", name = "j", descriptor = "B")
	private byte aByte12 = 1;

	@OriginalMember(owner = "client!GLMIQHJI", name = "k", descriptor = "I")
	private int anInt246 = 5;

	@OriginalMember(owner = "client!GLMIQHJI", name = "m", descriptor = "B")
	private byte aByte13 = 77;

	@OriginalMember(owner = "client!GLMIQHJI", name = "n", descriptor = "B")
	private byte aByte14 = 5;

	@OriginalMember(owner = "client!GLMIQHJI", name = "o", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!GLMIQHJI", name = "q", descriptor = "I")
	private int anInt249 = 4;

	@OriginalMember(owner = "client!GLMIQHJI", name = "r", descriptor = "B")
	private byte aByte15 = -81;

	@OriginalMember(owner = "client!GLMIQHJI", name = "s", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!GLMIQHJI", name = "t", descriptor = "B")
	private byte aByte16 = -20;

	@OriginalMember(owner = "client!GLMIQHJI", name = "u", descriptor = "I")
	private int anInt250 = -825;

	@OriginalMember(owner = "client!GLMIQHJI", name = "v", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!GLMIQHJI", name = "w", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!GLMIQHJI", name = "x", descriptor = "Z")
	private boolean aBoolean67 = true;

	@OriginalMember(owner = "client!GLMIQHJI", name = "y", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!GLMIQHJI", name = "z", descriptor = "I")
	private int anInt251 = 348;

	@OriginalMember(owner = "client!GLMIQHJI", name = "A", descriptor = "I")
	private int anInt252 = 9;

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
			anIntArray43[local4] = local7;
		}
		anIntArray44 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass37_1 = new Class37((byte) 3);
		aClass37_2 = new Class37((byte) 3);
		aClass37_3 = new Class37((byte) 3);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "a", descriptor = "(BI)Lclient!GLMIQHJI;")
	public static Class8_Sub1_Sub3 method153() {
		try {
			@Pc(3) Class37 local3 = aClass37_2;
			synchronized (aClass37_2) {
				@Pc(7) Class8_Sub1_Sub3 local7 = null;
				if (anInt256 > 0) {
					anInt256--;
					local7 = (Class8_Sub1_Sub3) aClass37_2.method490();
				}
				if (local7 != null) {
					local7.anInt253 = 0;
					return local7;
				}
			}
			@Pc(69) Class8_Sub1_Sub3 local69 = new Class8_Sub1_Sub3(-251);
			local69.anInt253 = 0;
			local69.aByteArray9 = new byte[5000];
			return local69;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("5621, " + 0 + ", " + 1 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "<init>", descriptor = "(I)V")
	private Class8_Sub1_Sub3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "<init>", descriptor = "([BI)V")
	public Class8_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray9 = arg0;
			this.anInt253 = 0;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("68054, " + arg0 + ", " + arg1 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "a", descriptor = "(II)V")
	public void method154(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt253++] = (byte) (arg0 + this.aClass5_1.method29());
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("52396, " + arg0 + ", " + 0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "a", descriptor = "(I)V")
	public void method155(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt253++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "b", descriptor = "(I)V")
	public void method156(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt253++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "b", descriptor = "(BI)V")
	public void method157(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 == -79) {
				this.aByteArray9[this.anInt253++] = (byte) arg1;
				this.aByteArray9[this.anInt253++] = 0;
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("25571, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "c", descriptor = "(I)V")
	public void method158(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt253++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "d", descriptor = "(I)V")
	public void method159(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt253++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "a", descriptor = "(IZ)V")
	public void method160(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt253++] = (byte) arg0;
			this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 24);
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("72905, " + arg0 + ", " + false + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "a", descriptor = "(JI)V")
	public void method161(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 56);
			this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 48);
			this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 40);
			this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 32);
			this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 24);
			this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt253++] = (byte) arg0;
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("54759, " + arg0 + ", " + 7 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method162(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt253);
		this.anInt253 += arg0.length();
		this.aByteArray9[this.anInt253++] = 10;
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "a", descriptor = "(III[B)V")
	public void method163(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg0 + 0; local12++) {
				this.aByteArray9[this.anInt253++] = arg1[local12];
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("27572, " + 0 + ", " + arg0 + ", " + 0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "b", descriptor = "(II)V")
	public void method164(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt253 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("16935, " + 550 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "c", descriptor = "()I")
	public int method165() {
		return this.aByteArray9[this.anInt253++] & 0xFF;
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "d", descriptor = "()B")
	public byte method166() {
		return this.aByteArray9[this.anInt253++];
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "e", descriptor = "()I")
	public int method167() {
		this.anInt253 += 2;
		return ((this.aByteArray9[this.anInt253 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt253 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "f", descriptor = "()I")
	public int method168() {
		this.anInt253 += 2;
		@Pc(27) int local27 = ((this.aByteArray9[this.anInt253 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt253 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "g", descriptor = "()I")
	public int method169() {
		this.anInt253 += 3;
		return ((this.aByteArray9[this.anInt253 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt253 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt253 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "h", descriptor = "()I")
	public int method170() {
		this.anInt253 += 4;
		return ((this.aByteArray9[this.anInt253 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt253 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt253 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt253 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "a", descriptor = "(Z)J")
	public long method171() {
		try {
			@Pc(11) long local11 = (long) this.method170() & 0xFFFFFFFFL;
			@Pc(17) long local17 = (long) this.method170() & 0xFFFFFFFFL;
			return (local11 << 32) + local17;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("20313, " + true + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "i", descriptor = "()Ljava/lang/String;")
	public String method172() {
		@Pc(2) int local2 = this.anInt253;
		while (this.aByteArray9[this.anInt253++] != 10) {
		}
		return new String(this.aByteArray9, local2, this.anInt253 - local2 - 1);
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "b", descriptor = "(Z)[B")
	public byte[] method173() {
		try {
			@Pc(2) int local2 = this.anInt253;
			while (this.aByteArray9[this.anInt253++] != 10) {
			}
			@Pc(33) byte[] local33 = new byte[this.anInt253 - local2 - 1];
			for (@Pc(35) int local35 = local2; local35 < this.anInt253 - 1; local35++) {
				local33[local35 - local2] = this.aByteArray9[local35];
			}
			return local33;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("1805, " + false + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "a", descriptor = "([BZII)V")
	public void method174(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(11) int local11 = 0; local11 < arg1 + 0; local11++) {
				arg0[local11] = this.aByteArray9[this.anInt253++];
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("92966, " + arg0 + ", " + true + ", " + 0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "a", descriptor = "(B)V")
	public void method175(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 6) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			this.anInt254 = this.anInt253 * 8;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("4051, " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "b", descriptor = "(IZ)I")
	public int method176(@OriginalArg(0) int arg0) {
		try {
			@Pc(15) int local15 = this.anInt254 >> 3;
			@Pc(22) int local22 = 8 - (this.anInt254 & 0x7);
			@Pc(24) int local24 = 0;
			this.anInt254 += arg0;
			while (arg0 > local22) {
				local24 += (this.aByteArray9[local15++] & anIntArray44[local22]) << arg0 - local22;
				arg0 -= local22;
				local22 = 8;
			}
			if (arg0 == local22) {
				local24 += this.aByteArray9[local15] & anIntArray44[local22];
			} else {
				local24 += this.aByteArray9[local15] >> local22 - arg0 & anIntArray44[arg0];
			}
			return local24;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("27411, " + arg0 + ", " + true + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "e", descriptor = "(I)V")
	public void method177() {
		try {
			this.anInt253 = (this.anInt254 + 7) / 8;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("77458, " + -88 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "j", descriptor = "()I")
	public int method178() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt253] & 0xFF;
		return local7 < 128 ? this.method165() - 64 : this.method167() - 49152;
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "k", descriptor = "()I")
	public int method179() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt253] & 0xFF;
		return local7 < 128 ? this.method165() : this.method167() - 32768;
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method180(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt253;
			this.anInt253 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method174(local8, local2);
			@Pc(25) BigInteger local25 = new BigInteger(local8);
			@Pc(30) BigInteger local30 = local25.modPow(arg1, arg0);
			@Pc(33) byte[] local33 = local30.toByteArray();
			this.anInt253 = 0;
			this.method155(local33.length);
			this.method163(local33.length, local33);
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("95048, " + -121 + ", " + arg0 + ", " + arg1 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "c", descriptor = "(II)V")
	public void method181(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt253++] = (byte) (arg0 + 128);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("30262, " + -42019 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "a", descriptor = "(ZI)V")
	public void method182(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt253++] = (byte) -arg0;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("76364, " + true + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "d", descriptor = "(II)V")
	public void method183(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt253++] = (byte) (128 - arg0);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("61352, " + 0 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "f", descriptor = "(I)I")
	public int method184() {
		try {
			return this.aByteArray9[this.anInt253++] - 128 & 0xFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("64999, " + 0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "g", descriptor = "(I)I")
	public int method185() {
		try {
			return -this.aByteArray9[this.anInt253++] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("62593, " + 3 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "h", descriptor = "(I)I")
	public int method186(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return 128 - this.aByteArray9[this.anInt253++] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("15357, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "i", descriptor = "(I)B")
	public byte method187() {
		try {
			if (this.anInt249 != 4) {
				this.aBoolean65 = !this.aBoolean65;
			}
			return (byte) (this.aByteArray9[this.anInt253++] - 128);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("25204, " + 4 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "j", descriptor = "(I)B")
	public byte method188() {
		try {
			return (byte) -this.aByteArray9[this.anInt253++];
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("87673, " + 1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "k", descriptor = "(I)B")
	public byte method189() {
		try {
			return (byte) (128 - this.aByteArray9[this.anInt253++]);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("1308, " + 35432 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "e", descriptor = "(II)V")
	public void method190(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt253++] = (byte) arg0;
			this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 8);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("99675, " + 8 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "a", descriptor = "(IB)V")
	public void method191(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 8);
			@Pc(18) boolean local18 = false;
			this.aByteArray9[this.anInt253++] = (byte) (arg0 + 128);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("48924, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "f", descriptor = "(II)V")
	public void method192(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt253++] = (byte) (arg0 + 128);
			this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 8);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("65502, " + -14666 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "b", descriptor = "(B)I")
	public int method193() {
		try {
			this.anInt253 += 2;
			return ((this.aByteArray9[this.anInt253 - 1] & 0xFF) << 8) + (this.aByteArray9[this.anInt253 - 2] & 0xFF);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("79142, " + -116 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "l", descriptor = "(I)I")
	public int method194(@OriginalArg(0) int arg0) {
		try {
			if (arg0 == 0) {
				this.anInt253 += 2;
				return ((this.aByteArray9[this.anInt253 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt253 - 1] - 128 & 0xFF);
			} else {
				return 4;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("54929, " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "c", descriptor = "(B)I")
	public int method195() {
		try {
			this.anInt253 += 2;
			if (this.aByte15 != -81) {
				this.anInt248 = -92;
			}
			return ((this.aByteArray9[this.anInt253 - 1] & 0xFF) << 8) + (this.aByteArray9[this.anInt253 - 2] - 128 & 0xFF);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("16228, " + -81 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "c", descriptor = "(Z)I")
	public int method196() {
		try {
			this.anInt253 += 2;
			@Pc(27) int local27 = ((this.aByteArray9[this.anInt253 - 1] & 0xFF) << 8) + (this.aByteArray9[this.anInt253 - 2] & 0xFF);
			if (local27 > 32767) {
				local27 -= 65536;
			}
			return local27;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("44263, " + true + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "m", descriptor = "(I)I")
	public int method197() {
		try {
			this.anInt253 += 2;
			@Pc(34) int local34 = ((this.aByteArray9[this.anInt253 - 1] & 0xFF) << 8) + (this.aByteArray9[this.anInt253 - 2] - 128 & 0xFF);
			if (local34 > 32767) {
				local34 -= 65536;
			}
			return local34;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("32539, " + 0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "b", descriptor = "(ZI)V")
	public void method198(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 24);
			this.aByteArray9[this.anInt253++] = (byte) arg0;
			this.aByteArray9[this.anInt253++] = (byte) (arg0 >> 8);
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("11385, " + true + ", " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "n", descriptor = "(I)I")
	public int method199() {
		try {
			this.anInt253 += 4;
			return ((this.aByteArray9[this.anInt253 - 3] & 0xFF) << 24) + ((this.aByteArray9[this.anInt253 - 4] & 0xFF) << 16) + ((this.aByteArray9[this.anInt253 - 1] & 0xFF) << 8) + (this.aByteArray9[this.anInt253 - 2] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("98024, " + 0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "a", descriptor = "([BIII)V")
	public void method200(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0) {
				for (@Pc(4) int local4 = 0; local4 < arg1 + 0; local4++) {
					this.aByteArray9[this.anInt253++] = (byte) (arg0[local4] + 128);
				}
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("69912, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLMIQHJI", name = "a", descriptor = "(B[BII)V")
	public void method201(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(17) int local17 = arg1 + 0 - 1; local17 >= 0; local17--) {
				arg0[local17] = this.aByteArray9[this.anInt253++];
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("76319, " + 5 + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}
}

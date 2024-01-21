import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EYMNCFMK")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!EYMNCFMK", name = "J", descriptor = "I")
	private static int anInt303;

	@OriginalMember(owner = "client!EYMNCFMK", name = "K", descriptor = "I")
	private static int anInt304;

	@OriginalMember(owner = "client!EYMNCFMK", name = "L", descriptor = "I")
	private static int anInt305;

	@OriginalMember(owner = "client!EYMNCFMK", name = "A", descriptor = "I")
	private static int anInt300 = -28345;

	@OriginalMember(owner = "client!EYMNCFMK", name = "G", descriptor = "[I")
	private static int[] anIntArray34 = new int[256];

	@OriginalMember(owner = "client!EYMNCFMK", name = "H", descriptor = "[I")
	private static final int[] anIntArray35;

	@OriginalMember(owner = "client!EYMNCFMK", name = "M", descriptor = "Lclient!DMMTBJKZ;")
	private static Class6 aClass6_1;

	@OriginalMember(owner = "client!EYMNCFMK", name = "N", descriptor = "Lclient!DMMTBJKZ;")
	private static Class6 aClass6_2;

	@OriginalMember(owner = "client!EYMNCFMK", name = "O", descriptor = "Lclient!DMMTBJKZ;")
	private static Class6 aClass6_3;

	@OriginalMember(owner = "client!EYMNCFMK", name = "P", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!EYMNCFMK", name = "s", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!EYMNCFMK", name = "D", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!EYMNCFMK", name = "E", descriptor = "I")
	public int anInt301;

	@OriginalMember(owner = "client!EYMNCFMK", name = "F", descriptor = "I")
	public int anInt302;

	@OriginalMember(owner = "client!EYMNCFMK", name = "I", descriptor = "Lclient!TXNIKMNQ;")
	public Class39 aClass39_1;

	@OriginalMember(owner = "client!EYMNCFMK", name = "i", descriptor = "I")
	private int anInt292 = 4;

	@OriginalMember(owner = "client!EYMNCFMK", name = "j", descriptor = "Z")
	private boolean aBoolean51 = true;

	@OriginalMember(owner = "client!EYMNCFMK", name = "k", descriptor = "I")
	private int anInt293 = -17359;

	@OriginalMember(owner = "client!EYMNCFMK", name = "l", descriptor = "I")
	private int anInt294 = 875;

	@OriginalMember(owner = "client!EYMNCFMK", name = "m", descriptor = "B")
	private byte aByte4 = 4;

	@OriginalMember(owner = "client!EYMNCFMK", name = "n", descriptor = "I")
	private int anInt295 = -2948;

	@OriginalMember(owner = "client!EYMNCFMK", name = "o", descriptor = "I")
	private int anInt296 = -2948;

	@OriginalMember(owner = "client!EYMNCFMK", name = "p", descriptor = "B")
	private byte aByte5 = 4;

	@OriginalMember(owner = "client!EYMNCFMK", name = "q", descriptor = "B")
	private byte aByte6 = 5;

	@OriginalMember(owner = "client!EYMNCFMK", name = "r", descriptor = "I")
	private int anInt297 = -16715;

	@OriginalMember(owner = "client!EYMNCFMK", name = "t", descriptor = "B")
	private byte aByte7 = 1;

	@OriginalMember(owner = "client!EYMNCFMK", name = "u", descriptor = "B")
	private byte aByte8 = 3;

	@OriginalMember(owner = "client!EYMNCFMK", name = "v", descriptor = "I")
	private int anInt299 = 899;

	@OriginalMember(owner = "client!EYMNCFMK", name = "w", descriptor = "B")
	private byte aByte9 = -115;

	@OriginalMember(owner = "client!EYMNCFMK", name = "x", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!EYMNCFMK", name = "y", descriptor = "Z")
	private boolean aBoolean53 = true;

	@OriginalMember(owner = "client!EYMNCFMK", name = "z", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!EYMNCFMK", name = "B", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!EYMNCFMK", name = "C", descriptor = "Z")
	private boolean aBoolean56 = true;

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
			anIntArray34[local6] = local9;
		}
		anIntArray35 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass6_1 = new Class6((byte) 5);
		aClass6_2 = new Class6((byte) 5);
		aClass6_3 = new Class6((byte) 5);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(II)Lclient!EYMNCFMK;")
	public static Class1_Sub1_Sub3 method143() {
		try {
			@Pc(11) Class6 local11 = aClass6_2;
			synchronized (aClass6_2) {
				@Pc(15) Class1_Sub1_Sub3 local15 = null;
				if (anInt304 > 0) {
					anInt304--;
					local15 = (Class1_Sub1_Sub3) aClass6_2.method96();
				}
				if (local15 != null) {
					local15.anInt301 = 0;
					return local15;
				}
			}
			@Pc(77) Class1_Sub1_Sub3 local77 = new Class1_Sub1_Sub3(4);
			local77.anInt301 = 0;
			local77.aByteArray2 = new byte[5000];
			return local77;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("22793, " + 5 + ", " + 1 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < this.anInt292 || arg0 > this.anInt292) {
				throw new NullPointerException();
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("30886, " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "<init>", descriptor = "([BI)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray2 = arg0;
			this.anInt301 = 0;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("40538, " + arg0 + ", " + arg1 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(IZ)V")
	public void method144(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray2[this.anInt301++] = (byte) (arg0 + this.aClass39_1.method491());
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("90036, " + arg0 + ", " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(I)V")
	public void method145(@OriginalArg(0) int arg0) {
		this.aByteArray2[this.anInt301++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "b", descriptor = "(I)V")
	public void method146(@OriginalArg(0) int arg0) {
		this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 8);
		this.aByteArray2[this.anInt301++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "b", descriptor = "(II)V")
	public void method147(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray2[this.anInt301++] = (byte) arg0;
			this.aByteArray2[this.anInt301++] = 0;
			if (this.anInt293 != -17359) {
				this.aBoolean53 = !this.aBoolean53;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("15189, " + -17359 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "c", descriptor = "(I)V")
	public void method148(@OriginalArg(0) int arg0) {
		this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 16);
		this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 8);
		this.aByteArray2[this.anInt301++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "d", descriptor = "(I)V")
	public void method149(@OriginalArg(0) int arg0) {
		this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 24);
		this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 16);
		this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 8);
		this.aByteArray2[this.anInt301++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "c", descriptor = "(II)V")
	public void method150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray2[this.anInt301++] = (byte) arg0;
			this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 8);
			if (arg1 < 0) {
				this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 16);
				this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 24);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("10917, " + arg0 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(JI)V")
	public void method151(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 56);
			this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 48);
			this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 40);
			this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 32);
			this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 24);
			this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 16);
			this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 8);
			this.aByteArray2[this.anInt301++] = (byte) arg0;
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("58316, " + arg0 + ", " + 5 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method152(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray2, this.anInt301);
		this.anInt301 += arg0.length();
		this.aByteArray2[this.anInt301++] = 10;
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "([BIBI)V")
	public void method153(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < arg1 + 0; local5++) {
				this.aByteArray2[this.anInt301++] = arg0[local5];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("76651, " + arg0 + ", " + arg1 + ", " + -116 + ", " + 0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "d", descriptor = "(II)V")
	public void method154(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray2[this.anInt301 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("28443, " + -844 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "c", descriptor = "()I")
	public int method155() {
		return this.aByteArray2[this.anInt301++] & 0xFF;
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "d", descriptor = "()B")
	public byte method156() {
		return this.aByteArray2[this.anInt301++];
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "e", descriptor = "()I")
	public int method157() {
		this.anInt301 += 2;
		return ((this.aByteArray2[this.anInt301 - 2] & 0xFF) << 8) + (this.aByteArray2[this.anInt301 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "f", descriptor = "()I")
	public int method158() {
		this.anInt301 += 2;
		@Pc(27) int local27 = ((this.aByteArray2[this.anInt301 - 2] & 0xFF) << 8) + (this.aByteArray2[this.anInt301 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "g", descriptor = "()I")
	public int method159() {
		this.anInt301 += 3;
		return ((this.aByteArray2[this.anInt301 - 3] & 0xFF) << 16) + ((this.aByteArray2[this.anInt301 - 2] & 0xFF) << 8) + (this.aByteArray2[this.anInt301 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "h", descriptor = "()I")
	public int method160() {
		this.anInt301 += 4;
		return ((this.aByteArray2[this.anInt301 - 4] & 0xFF) << 24) + ((this.aByteArray2[this.anInt301 - 3] & 0xFF) << 16) + ((this.aByteArray2[this.anInt301 - 2] & 0xFF) << 8) + (this.aByteArray2[this.anInt301 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "e", descriptor = "(I)J")
	public long method161(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) long local5 = (long) this.method160() & 0xFFFFFFFFL;
			@Pc(9) int local9 = 62 / arg0;
			@Pc(15) long local15 = (long) this.method160() & 0xFFFFFFFFL;
			return (local5 << 32) + local15;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("25063, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "i", descriptor = "()Ljava/lang/String;")
	public String method162() {
		@Pc(2) int local2 = this.anInt301;
		while (this.aByteArray2[this.anInt301++] != 10) {
		}
		return new String(this.aByteArray2, local2, this.anInt301 - local2 - 1);
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(B)[B")
	public byte[] method163(@OriginalArg(0) byte arg0) {
		try {
			if (this.aByte4 == 4) {
				@Pc(7) boolean local7 = false;
			} else {
				this.aBoolean51 = !this.aBoolean51;
			}
			@Pc(20) int local20 = this.anInt301;
			while (this.aByteArray2[this.anInt301++] != 10) {
			}
			@Pc(41) byte[] local41 = new byte[this.anInt301 - local20 - 1];
			for (@Pc(43) int local43 = local20; local43 < this.anInt301 - 1; local43++) {
				local41[local43 - local20] = this.aByteArray2[local43];
			}
			return local41;
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("55888, " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(I[BII)V")
	public void method164(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == this.anInt296) {
				for (@Pc(6) int local6 = 0; local6 < arg2 + 0; local6++) {
					arg1[local6] = this.aByteArray2[this.anInt301++];
				}
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("38775, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "b", descriptor = "(B)V")
	public void method165(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			this.anInt302 = this.anInt301 * 8;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("94687, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(BI)I")
	public int method166(@OriginalArg(1) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt302 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt302 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt302 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray2[local6++] & anIntArray35[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray2[local6] & anIntArray35[local13];
			} else {
				local15 += this.aByteArray2[local6] >> local13 - arg0 & anIntArray35[arg0];
			}
			return local15;
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("81857, " + 79 + ", " + arg0 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "c", descriptor = "(B)V")
	public void method167(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != this.aByte5) {
				this.aBoolean56 = !this.aBoolean56;
			}
			this.anInt301 = (this.anInt302 + 7) / 8;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("8410, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "j", descriptor = "()I")
	public int method168() {
		@Pc(7) int local7 = this.aByteArray2[this.anInt301] & 0xFF;
		return local7 < 128 ? this.method155() - 64 : this.method157() - 49152;
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "k", descriptor = "()I")
	public int method169() {
		@Pc(7) int local7 = this.aByteArray2[this.anInt301] & 0xFF;
		return local7 < 128 ? this.method155() : this.method157() - 32768;
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method170(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt301;
			this.anInt301 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method164(this.anInt295, local8, local2);
			@Pc(20) BigInteger local20 = new BigInteger(local8);
			@Pc(25) BigInteger local25 = local20.modPow(arg1, arg0);
			@Pc(37) byte[] local37 = local25.toByteArray();
			this.anInt301 = 0;
			this.method145(local37.length);
			this.method153(local37, local37.length);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("47118, " + arg0 + ", " + arg1 + ", " + 981 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(ZI)V")
	public void method171(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray2[this.anInt301++] = (byte) (arg0 + 128);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("3253, " + false + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "b", descriptor = "(IZ)V")
	public void method172(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aByteArray2[this.anInt301++] = (byte) -arg0;
			if (!arg1) {
				;
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("51000, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "e", descriptor = "(II)V")
	public void method173(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray2[this.anInt301++] = (byte) (128 - arg0);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("21740, " + arg0 + ", " + 0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "f", descriptor = "(I)I")
	public int method174() {
		try {
			return this.aByteArray2[this.anInt301++] - 128 & 0xFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("12485, " + 997 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "d", descriptor = "(B)I")
	public int method175() {
		try {
			return -this.aByteArray2[this.anInt301++] & 0xFF;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("86948, " + 0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "g", descriptor = "(I)I")
	public int method176() {
		try {
			return 128 - this.aByteArray2[this.anInt301++] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("29332, " + -377 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "h", descriptor = "(I)B")
	public byte method177() {
		try {
			return (byte) (this.aByteArray2[this.anInt301++] - 128);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("22596, " + 340 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "e", descriptor = "(B)B")
	public byte method178() {
		try {
			if (this.aByte7 != 1) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			return (byte) -this.aByteArray2[this.anInt301++];
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("25338, " + 1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "i", descriptor = "(I)B")
	public byte method179() {
		try {
			return (byte) (128 - this.aByteArray2[this.anInt301++]);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("48825, " + 0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "b", descriptor = "(BI)V")
	public void method180(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray2[this.anInt301++] = (byte) arg0;
			this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 8);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("57070, " + 1 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "f", descriptor = "(II)V")
	public void method181(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 8);
			this.aByteArray2[this.anInt301++] = (byte) (arg0 + 128);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("36262, " + 0 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "b", descriptor = "(ZI)V")
	public void method182(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray2[this.anInt301++] = (byte) (arg0 + 128);
			this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 8);
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("45537, " + true + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "f", descriptor = "(B)I")
	public int method183() {
		try {
			this.anInt301 += 2;
			return ((this.aByteArray2[this.anInt301 - 1] & 0xFF) << 8) + (this.aByteArray2[this.anInt301 - 2] & 0xFF);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("45534, " + -97 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "g", descriptor = "(B)I")
	public int method184() {
		try {
			this.anInt301 += 2;
			return ((this.aByteArray2[this.anInt301 - 2] & 0xFF) << 8) + (this.aByteArray2[this.anInt301 - 1] - 128 & 0xFF);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("60566, " + 6 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(Z)I")
	public int method185() {
		try {
			this.anInt301 += 2;
			return ((this.aByteArray2[this.anInt301 - 1] & 0xFF) << 8) + (this.aByteArray2[this.anInt301 - 2] - 128 & 0xFF);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("69671, " + true + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "b", descriptor = "(Z)I")
	public int method186() {
		try {
			this.anInt301 += 2;
			@Pc(37) int local37 = ((this.aByteArray2[this.anInt301 - 1] & 0xFF) << 8) + (this.aByteArray2[this.anInt301 - 2] & 0xFF);
			if (local37 > 32767) {
				local37 -= 65536;
			}
			return local37;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("46576, " + false + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "j", descriptor = "(I)I")
	public int method187() {
		try {
			this.anInt301 += 2;
			@Pc(38) int local38 = ((this.aByteArray2[this.anInt301 - 2] & 0xFF) << 8) + (this.aByteArray2[this.anInt301 - 1] - 128 & 0xFF);
			if (local38 > 32767) {
				local38 -= 65536;
			}
			return local38;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("28873, " + 4 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "c", descriptor = "(Z)I")
	public int method188() {
		try {
			this.anInt301 += 2;
			@Pc(29) int local29 = ((this.aByteArray2[this.anInt301 - 1] & 0xFF) << 8) + (this.aByteArray2[this.anInt301 - 2] - 128 & 0xFF);
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("29751, " + false + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "c", descriptor = "(BI)V")
	public void method189(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray2[this.anInt301++] = (byte) arg0;
			this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 8);
			this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 16);
			this.aByteArray2[this.anInt301++] = (byte) (arg0 >> 24);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("50853, " + -62 + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "k", descriptor = "(I)I")
	public int method190() {
		try {
			this.anInt301 += 4;
			return ((this.aByteArray2[this.anInt301 - 2] & 0xFF) << 24) + ((this.aByteArray2[this.anInt301 - 1] & 0xFF) << 16) + ((this.aByteArray2[this.anInt301 - 4] & 0xFF) << 8) + (this.aByteArray2[this.anInt301 - 3] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("16653, " + 0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "l", descriptor = "(I)I")
	public int method191(@OriginalArg(0) int arg0) {
		try {
			this.anInt301 += 4;
			@Pc(9) boolean local9 = false;
			return ((this.aByteArray2[this.anInt301 - 3] & 0xFF) << 24) + ((this.aByteArray2[this.anInt301 - 4] & 0xFF) << 16) + ((this.aByteArray2[this.anInt301 - 1] & 0xFF) << 8) + (this.aByteArray2[this.anInt301 - 2] & 0xFF);
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("81122, " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(II[BB)V")
	public void method192(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(9) int local9 = arg0 + 0 - 1; local9 >= 0; local9--) {
				this.aByteArray2[this.anInt301++] = arg1[local9];
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("60806, " + 0 + ", " + arg0 + ", " + arg1 + ", " + 4 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "([BIII)V")
	public void method193(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(14) int local14 = arg1 + 0 - 1; local14 >= 0; local14--) {
				arg0[local14] = (byte) (this.aByteArray2[this.anInt301++] - 128);
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("5703, " + arg0 + ", " + 0 + ", " + -37 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}
}

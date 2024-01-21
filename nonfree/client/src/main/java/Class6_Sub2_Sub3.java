import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NQUAUMDT")
public final class Class6_Sub2_Sub3 extends Class6_Sub2 {

	@OriginalMember(owner = "client!NQUAUMDT", name = "M", descriptor = "I")
	private static int anInt406;

	@OriginalMember(owner = "client!NQUAUMDT", name = "N", descriptor = "I")
	private static int anInt407;

	@OriginalMember(owner = "client!NQUAUMDT", name = "O", descriptor = "I")
	private static int anInt408;

	@OriginalMember(owner = "client!NQUAUMDT", name = "k", descriptor = "B")
	private static byte aByte13 = -6;

	@OriginalMember(owner = "client!NQUAUMDT", name = "J", descriptor = "[I")
	private static int[] anIntArray122 = new int[256];

	@OriginalMember(owner = "client!NQUAUMDT", name = "K", descriptor = "[I")
	private static final int[] anIntArray123;

	@OriginalMember(owner = "client!NQUAUMDT", name = "P", descriptor = "Lclient!FYVRCFGT;")
	private static Class13 aClass13_6;

	@OriginalMember(owner = "client!NQUAUMDT", name = "Q", descriptor = "Lclient!FYVRCFGT;")
	private static Class13 aClass13_7;

	@OriginalMember(owner = "client!NQUAUMDT", name = "R", descriptor = "Lclient!FYVRCFGT;")
	private static Class13 aClass13_8;

	@OriginalMember(owner = "client!NQUAUMDT", name = "S", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!NQUAUMDT", name = "x", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!NQUAUMDT", name = "D", descriptor = "I")
	private int anInt402;

	@OriginalMember(owner = "client!NQUAUMDT", name = "F", descriptor = "I")
	private int anInt403;

	@OriginalMember(owner = "client!NQUAUMDT", name = "G", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!NQUAUMDT", name = "H", descriptor = "I")
	public int anInt404;

	@OriginalMember(owner = "client!NQUAUMDT", name = "I", descriptor = "I")
	public int anInt405;

	@OriginalMember(owner = "client!NQUAUMDT", name = "L", descriptor = "Lclient!KAZZDHJI;")
	public Class18 aClass18_1;

	@OriginalMember(owner = "client!NQUAUMDT", name = "j", descriptor = "Z")
	private boolean aBoolean121 = true;

	@OriginalMember(owner = "client!NQUAUMDT", name = "l", descriptor = "I")
	private int anInt393 = -818;

	@OriginalMember(owner = "client!NQUAUMDT", name = "m", descriptor = "I")
	private int anInt394 = -10495;

	@OriginalMember(owner = "client!NQUAUMDT", name = "n", descriptor = "B")
	private byte aByte14 = 65;

	@OriginalMember(owner = "client!NQUAUMDT", name = "o", descriptor = "Z")
	private boolean aBoolean122 = false;

	@OriginalMember(owner = "client!NQUAUMDT", name = "p", descriptor = "I")
	private int anInt395 = 6;

	@OriginalMember(owner = "client!NQUAUMDT", name = "q", descriptor = "Z")
	private boolean aBoolean123 = false;

	@OriginalMember(owner = "client!NQUAUMDT", name = "r", descriptor = "I")
	private int anInt396 = 32446;

	@OriginalMember(owner = "client!NQUAUMDT", name = "s", descriptor = "B")
	private byte aByte15 = 3;

	@OriginalMember(owner = "client!NQUAUMDT", name = "t", descriptor = "I")
	private int anInt397 = 22251;

	@OriginalMember(owner = "client!NQUAUMDT", name = "u", descriptor = "B")
	private byte aByte16 = -60;

	@OriginalMember(owner = "client!NQUAUMDT", name = "v", descriptor = "Z")
	private boolean aBoolean124 = false;

	@OriginalMember(owner = "client!NQUAUMDT", name = "w", descriptor = "B")
	private byte aByte17 = -94;

	@OriginalMember(owner = "client!NQUAUMDT", name = "y", descriptor = "I")
	private int anInt399 = -962;

	@OriginalMember(owner = "client!NQUAUMDT", name = "z", descriptor = "B")
	private byte aByte18 = -92;

	@OriginalMember(owner = "client!NQUAUMDT", name = "A", descriptor = "B")
	private byte aByte19 = 6;

	@OriginalMember(owner = "client!NQUAUMDT", name = "B", descriptor = "I")
	private int anInt400 = 174;

	@OriginalMember(owner = "client!NQUAUMDT", name = "C", descriptor = "I")
	private int anInt401 = -529;

	@OriginalMember(owner = "client!NQUAUMDT", name = "E", descriptor = "Z")
	private boolean aBoolean125 = false;

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
			anIntArray122[local6] = local9;
		}
		anIntArray123 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass13_6 = new Class13(true);
		aClass13_7 = new Class13(true);
		aClass13_8 = new Class13(true);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(II)Lclient!NQUAUMDT;")
	public static Class6_Sub2_Sub3 method250() {
		try {
			@Pc(12) Class13 local12 = aClass13_7;
			synchronized (aClass13_7) {
				@Pc(16) Class6_Sub2_Sub3 local16 = null;
				if (anInt407 > 0) {
					anInt407--;
					local16 = (Class6_Sub2_Sub3) aClass13_7.method112();
				}
				if (local16 != null) {
					local16.anInt404 = 0;
					return local16;
				}
			}
			@Pc(78) Class6_Sub2_Sub3 local78 = new Class6_Sub2_Sub3(aByte13);
			local78.anInt404 = 0;
			local78.aByteArray9 = new byte[5000];
			return local78;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("53480, " + 1 + ", " + 0 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "<init>", descriptor = "(B)V")
	private Class6_Sub2_Sub3(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != -6) {
				this.aBoolean125 = !this.aBoolean125;
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("9543, " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "<init>", descriptor = "(I[B)V")
	public Class6_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray9 = arg1;
			this.anInt404 = 0;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("6817, " + arg0 + ", " + arg1 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "b", descriptor = "(II)V")
	public void method251(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt404++] = (byte) (arg0 + this.aClass18_1.method161());
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("84644, " + -818 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(I)V")
	public void method252(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt404++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "b", descriptor = "(I)V")
	public void method253(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt404++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(IZ)V")
	public void method254(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt404++] = (byte) arg0;
			this.aByteArray9[this.anInt404++] = 0;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("77823, " + arg0 + ", " + false + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "c", descriptor = "(I)V")
	public void method255(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt404++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "d", descriptor = "(I)V")
	public void method256(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt404++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(IB)V")
	public void method257(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt404++] = (byte) arg0;
			this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 24);
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("42770, " + arg0 + ", " + 11 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(JZ)V")
	public void method258(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 56);
			this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 48);
			this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 40);
			this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 32);
			this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 24);
			this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt404++] = (byte) arg0;
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("31967, " + arg0 + ", " + true + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method259(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt404);
		this.anInt404 += arg0.length();
		this.aByteArray9[this.anInt404++] = 10;
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "([BIII)V")
	public void method260(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anInt394 != -10495) {
				this.aBoolean121 = !this.aBoolean121;
			}
			for (@Pc(13) int local13 = 0; local13 < arg1 + 0; local13++) {
				this.aByteArray9[this.anInt404++] = arg0[local13];
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("81817, " + arg0 + ", " + arg1 + ", " + 0 + ", " + -10495 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "c", descriptor = "(II)V")
	public void method261(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt404 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("92770, " + -13105 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "c", descriptor = "()I")
	public int method262() {
		return this.aByteArray9[this.anInt404++] & 0xFF;
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "d", descriptor = "()B")
	public byte method263() {
		return this.aByteArray9[this.anInt404++];
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "e", descriptor = "()I")
	public int method264() {
		this.anInt404 += 2;
		return ((this.aByteArray9[this.anInt404 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt404 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "f", descriptor = "()I")
	public int method265() {
		this.anInt404 += 2;
		@Pc(27) int local27 = ((this.aByteArray9[this.anInt404 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt404 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "g", descriptor = "()I")
	public int method266() {
		this.anInt404 += 3;
		return ((this.aByteArray9[this.anInt404 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt404 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt404 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "h", descriptor = "()I")
	public int method267() {
		this.anInt404 += 4;
		return ((this.aByteArray9[this.anInt404 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt404 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt404 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt404 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(Z)J")
	public long method268() {
		try {
			@Pc(5) long local5 = (long) this.method267() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method267() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("72016, " + false + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "i", descriptor = "()Ljava/lang/String;")
	public String method269() {
		@Pc(2) int local2 = this.anInt404;
		while (this.aByteArray9[this.anInt404++] != 10) {
		}
		return new String(this.aByteArray9, local2, this.anInt404 - local2 - 1);
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "e", descriptor = "(I)[B")
	public byte[] method270() {
		try {
			@Pc(2) int local2 = this.anInt404;
			while (this.aByteArray9[this.anInt404++] != 10) {
			}
			@Pc(33) byte[] local33 = new byte[this.anInt404 - local2 - 1];
			for (@Pc(35) int local35 = local2; local35 < this.anInt404 - 1; local35++) {
				local33[local35 - local2] = this.aByteArray9[local35];
			}
			return local33;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("25038, " + 0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(I[BII)V")
	public void method271(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			for (@Pc(5) int local5 = 0; local5 < arg1 + 0; local5++) {
				arg0[local5] = this.aByteArray9[this.anInt404++];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("30653, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "f", descriptor = "(I)V")
	public void method272() {
		try {
			this.anInt405 = this.anInt404 * 8;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("78925, " + -31487 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "d", descriptor = "(II)I")
	public int method273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) int local6 = this.anInt405 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt405 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt405 += arg1;
			@Pc(25) boolean local25 = false;
			while (arg1 > local13) {
				local15 += (this.aByteArray9[local6++] & anIntArray123[local13]) << arg1 - local13;
				arg1 -= local13;
				local13 = 8;
			}
			if (arg1 == local13) {
				local15 += this.aByteArray9[local6] & anIntArray123[local13];
			} else {
				local15 += this.aByteArray9[local6] >> local13 - arg1 & anIntArray123[arg1];
			}
			return local15;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("67386, " + arg0 + ", " + arg1 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "g", descriptor = "(I)V")
	public void method274(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 37 / arg0;
			this.anInt404 = (this.anInt405 + 7) / 8;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("3949, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "j", descriptor = "()I")
	public int method275() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt404] & 0xFF;
		return local7 < 128 ? this.method262() - 64 : this.method264() - 49152;
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "k", descriptor = "()I")
	public int method276() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt404] & 0xFF;
		return local7 < 128 ? this.method262() : this.method264() - 32768;
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method277(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt404;
			this.anInt404 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method271(local8, local2, 520);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg1, arg0);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt404 = 0;
			this.method252(local27.length);
			this.method260(local27, local27.length);
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("86333, " + arg0 + ", " + -656 + ", " + arg1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(BI)V")
	public void method278(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt404++] = (byte) (arg0 + 128);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("10468, " + 5 + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "e", descriptor = "(II)V")
	public void method279(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt404++] = (byte) (128 - arg0);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("94397, " + arg0 + ", " + 38949 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(B)I")
	public int method280() {
		try {
			return this.aByteArray9[this.anInt404++] - 128 & 0xFF;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("83472, " + 99 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "h", descriptor = "(I)I")
	public int method281() {
		try {
			return -this.aByteArray9[this.anInt404++] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("27391, " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "i", descriptor = "(I)I")
	public int method282(@OriginalArg(0) int arg0) {
		try {
			return arg0 <= 0 ? this.anInt394 : 128 - this.aByteArray9[this.anInt404++] & 0xFF;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("54844, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "j", descriptor = "(I)B")
	public byte method283() {
		try {
			return (byte) (this.aByteArray9[this.anInt404++] - 128);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("16378, " + -990 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "b", descriptor = "(B)B")
	public byte method284() {
		try {
			if (this.aByte17 != -94) {
				this.aBoolean124 = !this.aBoolean124;
			}
			return (byte) -this.aByteArray9[this.anInt404++];
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("42669, " + -94 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "b", descriptor = "(Z)B")
	public byte method285() {
		try {
			return (byte) (128 - this.aByteArray9[this.anInt404++]);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("4018, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "b", descriptor = "(IZ)V")
	public void method286(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt404++] = (byte) arg0;
			this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 8);
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("46956, " + arg0 + ", " + true + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "c", descriptor = "(IZ)V")
	public void method287(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt404++] = (byte) (arg0 + 128);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("3272, " + arg0 + ", " + true + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "f", descriptor = "(II)V")
	public void method288(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt404++] = (byte) (arg0 + 128);
			this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 8);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("44648, " + arg0 + ", " + 0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "c", descriptor = "(B)I")
	public int method289(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			this.anInt404 += 2;
			return ((this.aByteArray9[this.anInt404 - 1] & 0xFF) << 8) + (this.aByteArray9[this.anInt404 - 2] & 0xFF);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("13984, " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "k", descriptor = "(I)I")
	public int method290() {
		try {
			this.anInt404 += 2;
			return ((this.aByteArray9[this.anInt404 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt404 - 1] - 128 & 0xFF);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("82441, " + -40 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "d", descriptor = "(B)I")
	public int method291(@OriginalArg(0) byte arg0) {
		try {
			this.anInt404 += 2;
			if (arg0 != -123) {
				this.anInt396 = -94;
			}
			return ((this.aByteArray9[this.anInt404 - 1] & 0xFF) << 8) + (this.aByteArray9[this.anInt404 - 2] - 128 & 0xFF);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("94668, " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "e", descriptor = "(B)I")
	public int method292() {
		try {
			this.anInt404 += 2;
			@Pc(33) int local33 = ((this.aByteArray9[this.anInt404 - 1] & 0xFF) << 8) + (this.aByteArray9[this.anInt404 - 2] & 0xFF);
			if (local33 > 32767) {
				local33 -= 65536;
			}
			return local33;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("4084, " + 115 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "l", descriptor = "(I)I")
	public int method293() {
		try {
			this.anInt404 += 2;
			@Pc(39) int local39 = ((this.aByteArray9[this.anInt404 - 1] & 0xFF) << 8) + (this.aByteArray9[this.anInt404 - 2] - 128 & 0xFF);
			if (local39 > 32767) {
				local39 -= 65536;
			}
			return local39;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("15365, " + 43327 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "c", descriptor = "(Z)I")
	public int method294() {
		try {
			this.anInt404 += 3;
			return ((this.aByteArray9[this.anInt404 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt404 - 1] & 0xFF) << 8) + (this.aByteArray9[this.anInt404 - 2] & 0xFF);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("13415, " + true + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "g", descriptor = "(II)V")
	public void method295(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt404++] = (byte) arg0;
			this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt404++] = (byte) (arg0 >> 24);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("89591, " + arg0 + ", " + 49978 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "f", descriptor = "(B)I")
	public int method296(@OriginalArg(0) byte arg0) {
		try {
			this.anInt404 += 4;
			@Pc(10) boolean local10 = false;
			return ((this.aByteArray9[this.anInt404 - 1] & 0xFF) << 24) + ((this.aByteArray9[this.anInt404 - 2] & 0xFF) << 16) + ((this.aByteArray9[this.anInt404 - 3] & 0xFF) << 8) + (this.aByteArray9[this.anInt404 - 4] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("9314, " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "m", descriptor = "(I)I")
	public int method297() {
		try {
			this.anInt404 += 4;
			return ((this.aByteArray9[this.anInt404 - 2] & 0xFF) << 24) + ((this.aByteArray9[this.anInt404 - 1] & 0xFF) << 16) + ((this.aByteArray9[this.anInt404 - 4] & 0xFF) << 8) + (this.aByteArray9[this.anInt404 - 3] & 0xFF);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("38379, " + 15285 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "n", descriptor = "(I)I")
	public int method298() {
		try {
			this.anInt404 += 4;
			return ((this.aByteArray9[this.anInt404 - 3] & 0xFF) << 24) + ((this.aByteArray9[this.anInt404 - 4] & 0xFF) << 16) + ((this.aByteArray9[this.anInt404 - 1] & 0xFF) << 8) + (this.aByteArray9[this.anInt404 - 2] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("40238, " + 4 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(BI[BI)V")
	public void method299(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		try {
			if (arg0 == 5) {
				@Pc(6) boolean local6 = false;
			} else {
				this.aBoolean124 = !this.aBoolean124;
			}
			for (@Pc(18) int local18 = 0; local18 < arg1 + 0; local18++) {
				this.aByteArray9[this.anInt404++] = (byte) (arg2[local18] + 128);
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("87740, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQUAUMDT", name = "b", descriptor = "([BIII)V")
	public void method300(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 != 0) {
				this.anInt402 = 262;
			}
			for (@Pc(10) int local10 = arg1 + 0 - 1; local10 >= 0; local10--) {
				arg0[local10] = this.aByteArray9[this.anInt404++];
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("57931, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}
}

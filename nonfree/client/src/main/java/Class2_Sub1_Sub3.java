import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LBBVYYXO")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!LBBVYYXO", name = "E", descriptor = "I")
	private static int anInt285;

	@OriginalMember(owner = "client!LBBVYYXO", name = "F", descriptor = "I")
	private static int anInt286;

	@OriginalMember(owner = "client!LBBVYYXO", name = "G", descriptor = "I")
	private static int anInt287;

	@OriginalMember(owner = "client!LBBVYYXO", name = "B", descriptor = "[I")
	private static int[] anIntArray92 = new int[256];

	@OriginalMember(owner = "client!LBBVYYXO", name = "C", descriptor = "[I")
	private static final int[] anIntArray93;

	@OriginalMember(owner = "client!LBBVYYXO", name = "H", descriptor = "Lclient!PACANLMY;")
	private static Class29 aClass29_6;

	@OriginalMember(owner = "client!LBBVYYXO", name = "I", descriptor = "Lclient!PACANLMY;")
	private static Class29 aClass29_7;

	@OriginalMember(owner = "client!LBBVYYXO", name = "J", descriptor = "Lclient!PACANLMY;")
	private static Class29 aClass29_8;

	@OriginalMember(owner = "client!LBBVYYXO", name = "K", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!LBBVYYXO", name = "y", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!LBBVYYXO", name = "z", descriptor = "I")
	public int anInt283;

	@OriginalMember(owner = "client!LBBVYYXO", name = "A", descriptor = "I")
	public int anInt284;

	@OriginalMember(owner = "client!LBBVYYXO", name = "D", descriptor = "Lclient!NIUUCTKL;")
	public Class26 aClass26_1;

	@OriginalMember(owner = "client!LBBVYYXO", name = "h", descriptor = "Z")
	private boolean aBoolean79 = true;

	@OriginalMember(owner = "client!LBBVYYXO", name = "i", descriptor = "B")
	private byte aByte8 = 8;

	@OriginalMember(owner = "client!LBBVYYXO", name = "j", descriptor = "I")
	private int anInt274 = -565;

	@OriginalMember(owner = "client!LBBVYYXO", name = "k", descriptor = "I")
	private int anInt275 = -778;

	@OriginalMember(owner = "client!LBBVYYXO", name = "l", descriptor = "I")
	private int anInt276 = 558;

	@OriginalMember(owner = "client!LBBVYYXO", name = "m", descriptor = "B")
	private byte aByte9 = 0;

	@OriginalMember(owner = "client!LBBVYYXO", name = "n", descriptor = "B")
	private byte aByte10 = 1;

	@OriginalMember(owner = "client!LBBVYYXO", name = "o", descriptor = "B")
	private byte aByte11 = 2;

	@OriginalMember(owner = "client!LBBVYYXO", name = "p", descriptor = "I")
	private int anInt277 = 1;

	@OriginalMember(owner = "client!LBBVYYXO", name = "q", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!LBBVYYXO", name = "r", descriptor = "I")
	private int anInt278 = -324;

	@OriginalMember(owner = "client!LBBVYYXO", name = "s", descriptor = "I")
	private int anInt279 = 5;

	@OriginalMember(owner = "client!LBBVYYXO", name = "t", descriptor = "I")
	private int anInt280 = -308;

	@OriginalMember(owner = "client!LBBVYYXO", name = "u", descriptor = "Z")
	private boolean aBoolean81 = true;

	@OriginalMember(owner = "client!LBBVYYXO", name = "v", descriptor = "I")
	private int anInt281 = 3169;

	@OriginalMember(owner = "client!LBBVYYXO", name = "w", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!LBBVYYXO", name = "x", descriptor = "I")
	private int anInt282 = 7;

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
			anIntArray92[local4] = local7;
		}
		anIntArray93 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass29_6 = new Class29(0);
		aClass29_7 = new Class29(0);
		aClass29_8 = new Class29(0);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(II)Lclient!LBBVYYXO;")
	public static Class2_Sub1_Sub3 method255() {
		try {
			@Pc(3) Class29 local3 = aClass29_7;
			synchronized (aClass29_7) {
				@Pc(7) Class2_Sub1_Sub3 local7 = null;
				if (anInt286 > 0) {
					anInt286--;
					local7 = (Class2_Sub1_Sub3) aClass29_7.method354();
				}
				if (local7 != null) {
					local7.anInt283 = 0;
					return local7;
				}
			}
			@Pc(69) Class2_Sub1_Sub3 local69 = new Class2_Sub1_Sub3(false);
			local69.anInt283 = 0;
			local69.aByteArray7 = new byte[5000];
			return local69;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("95621, " + -512 + ", " + 1 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "<init>", descriptor = "(Z)V")
	private Class2_Sub1_Sub3(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "<init>", descriptor = "(B[B)V")
	public Class2_Sub1_Sub3(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray7 = arg1;
			this.anInt283 = 0;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("57699, " + arg0 + ", " + arg1 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "b", descriptor = "(II)V")
	public void method256(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt283++] = (byte) (arg0 + this.aClass26_1.method322());
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("15940, " + 7793 + ", " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(I)V")
	public void method257(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt283++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "b", descriptor = "(I)V")
	public void method258(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt283++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(ZI)V")
	public void method259(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt283++] = (byte) arg0;
			this.aByteArray7[this.anInt283++] = 0;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("85065, " + true + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "c", descriptor = "(I)V")
	public void method260(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt283++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "d", descriptor = "(I)V")
	public void method261(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 24);
		this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt283++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "c", descriptor = "(II)V")
	public void method262(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray7[this.anInt283++] = (byte) arg0;
			this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 8);
			this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 16);
			this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 24);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("69216, " + arg0 + ", " + 6 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(JB)V")
	public void method263(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 56);
			this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 48);
			this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 40);
			this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 32);
			this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 24);
			this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 16);
			this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 8);
			this.aByteArray7[this.anInt283++] = (byte) arg0;
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("92670, " + arg0 + ", " + 56 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method264(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray7, this.anInt283);
		this.anInt283 += arg0.length();
		this.aByteArray7[this.anInt283++] = 10;
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(I[BII)V")
	public void method265(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg1 + 0; local7++) {
				this.aByteArray7[this.anInt283++] = arg0[local7];
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("50224, " + 0 + ", " + arg0 + ", " + -21870 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "d", descriptor = "(II)V")
	public void method266(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray7[this.anInt283 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("66467, " + arg0 + ", " + 8 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "c", descriptor = "()I")
	public int method267() {
		return this.aByteArray7[this.anInt283++] & 0xFF;
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "d", descriptor = "()B")
	public byte method268() {
		return this.aByteArray7[this.anInt283++];
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "e", descriptor = "()I")
	public int method269() {
		this.anInt283 += 2;
		return ((this.aByteArray7[this.anInt283 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt283 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "f", descriptor = "()I")
	public int method270() {
		this.anInt283 += 2;
		@Pc(27) int local27 = ((this.aByteArray7[this.anInt283 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt283 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "g", descriptor = "()I")
	public int method271() {
		this.anInt283 += 3;
		return ((this.aByteArray7[this.anInt283 - 3] & 0xFF) << 16) + ((this.aByteArray7[this.anInt283 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt283 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "h", descriptor = "()I")
	public int method272() {
		this.anInt283 += 4;
		return ((this.aByteArray7[this.anInt283 - 4] & 0xFF) << 24) + ((this.aByteArray7[this.anInt283 - 3] & 0xFF) << 16) + ((this.aByteArray7[this.anInt283 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt283 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(Z)J")
	public long method273() {
		try {
			@Pc(15) long local15 = (long) this.method272() & 0xFFFFFFFFL;
			@Pc(21) long local21 = (long) this.method272() & 0xFFFFFFFFL;
			return (local15 << 32) + local21;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("72176, " + true + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "i", descriptor = "()Ljava/lang/String;")
	public String method274() {
		@Pc(2) int local2 = this.anInt283;
		while (this.aByteArray7[this.anInt283++] != 10) {
		}
		return new String(this.aByteArray7, local2, this.anInt283 - local2 - 1);
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(B)[B")
	public byte[] method275() {
		try {
			@Pc(4) int local4 = this.anInt283;
			while (this.aByteArray7[this.anInt283++] != 10) {
			}
			@Pc(25) byte[] local25 = new byte[this.anInt283 - local4 - 1];
			for (@Pc(37) int local37 = local4; local37 < this.anInt283 - 1; local37++) {
				local25[local37 - local4] = this.aByteArray7[local37];
			}
			return local25;
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("87318, " + 0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "([BIII)V")
	private void method276(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(8) int local8 = 0; local8 < arg1 + 0; local8++) {
				arg0[local8] = this.aByteArray7[this.anInt283++];
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("63589, " + arg0 + ", " + 1 + ", " + 0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "e", descriptor = "(I)V")
	public void method277() {
		try {
			this.anInt284 = this.anInt283 * 8;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("84079, " + -604 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(IB)I")
	public int method278(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt284 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt284 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt284 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray7[local6++] & anIntArray93[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray7[local6] & anIntArray93[local13];
			} else {
				local15 += this.aByteArray7[local6] >> local13 - arg0 & anIntArray93[arg0];
			}
			return local15;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("52158, " + arg0 + ", " + -50 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "b", descriptor = "(Z)V")
	public void method279() {
		try {
			this.anInt283 = (this.anInt284 + 7) / 8;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("91670, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "j", descriptor = "()I")
	public int method280() {
		@Pc(7) int local7 = this.aByteArray7[this.anInt283] & 0xFF;
		return local7 < 128 ? this.method267() - 64 : this.method269() - 49152;
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "k", descriptor = "()I")
	public int method281() {
		@Pc(7) int local7 = this.aByteArray7[this.anInt283] & 0xFF;
		return local7 < 128 ? this.method267() : this.method269() - 32768;
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
	public void method282(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt283;
			this.anInt283 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method276(local8, local2);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg0, arg1);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt283 = 0;
			this.method257(local27.length);
			this.method265(local27, local27.length);
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("75438, " + arg0 + ", " + arg1 + ", " + false + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "e", descriptor = "(II)V")
	public void method283(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt283++] = (byte) -arg0;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("14793, " + 0 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "f", descriptor = "(II)V")
	public void method284(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray7[this.anInt283++] = (byte) (128 - arg0);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("78029, " + arg0 + ", " + 4 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "b", descriptor = "(B)I")
	public int method285() {
		try {
			return this.aByteArray7[this.anInt283++] - 128 & 0xFF;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("41792, " + 104 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "c", descriptor = "(Z)I")
	public int method286() {
		try {
			return -this.aByteArray7[this.anInt283++] & 0xFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("69717, " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "f", descriptor = "(I)I")
	public int method287() {
		try {
			return 128 - this.aByteArray7[this.anInt283++] & 0xFF;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("49355, " + -13491 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "d", descriptor = "(Z)B")
	public byte method288() {
		try {
			return (byte) (this.aByteArray7[this.anInt283++] - 128);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("44697, " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "c", descriptor = "(B)B")
	public byte method289() {
		try {
			return (byte) -this.aByteArray7[this.anInt283++];
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("26530, " + 87 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(IZ)V")
	public void method290(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray7[this.anInt283++] = (byte) arg0;
			this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 8);
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("69768, " + arg0 + ", " + false + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "b", descriptor = "(IB)V")
	public void method291(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 8);
			this.aByteArray7[this.anInt283++] = (byte) (arg0 + 128);
			if (this.aByte10 != 1) {
				for (@Pc(33) int local33 = 1; local33 > 0; local33++) {
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("12918, " + arg0 + ", " + 1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "g", descriptor = "(II)V")
	public void method292(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt283++] = (byte) (arg0 + 128);
			this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 8);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("98841, " + 6 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "d", descriptor = "(B)I")
	public int method293() {
		try {
			this.anInt283 += 2;
			return ((this.aByteArray7[this.anInt283 - 1] & 0xFF) << 8) + (this.aByteArray7[this.anInt283 - 2] & 0xFF);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("87178, " + 56 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "g", descriptor = "(I)I")
	public int method294() {
		try {
			this.anInt283 += 2;
			return ((this.aByteArray7[this.anInt283 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt283 - 1] - 128 & 0xFF);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("65667, " + -30785 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "e", descriptor = "(Z)I")
	public int method295(@OriginalArg(0) boolean arg0) {
		try {
			this.anInt283 += 2;
			return arg0 ? ((this.aByteArray7[this.anInt283 - 1] & 0xFF) << 8) + (this.aByteArray7[this.anInt283 - 2] - 128 & 0xFF) : 4;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("28324, " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "h", descriptor = "(I)I")
	public int method296() {
		try {
			this.anInt283 += 2;
			@Pc(37) int local37 = ((this.aByteArray7[this.anInt283 - 1] & 0xFF) << 8) + (this.aByteArray7[this.anInt283 - 2] & 0xFF);
			if (local37 > 32767) {
				local37 -= 65536;
			}
			return local37;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("8033, " + 0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "e", descriptor = "(B)I")
	public int method297() {
		try {
			this.anInt283 += 2;
			@Pc(29) int local29 = ((this.aByteArray7[this.anInt283 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt283 - 1] - 128 & 0xFF);
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("3344, " + 1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "i", descriptor = "(I)I")
	public int method298(@OriginalArg(0) int arg0) {
		try {
			this.anInt283 += 2;
			if (arg0 != 0) {
				return this.anInt275;
			}
			@Pc(34) int local34 = ((this.aByteArray7[this.anInt283 - 1] & 0xFF) << 8) + (this.aByteArray7[this.anInt283 - 2] - 128 & 0xFF);
			if (local34 > 32767) {
				local34 -= 65536;
			}
			return local34;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("5898, " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "c", descriptor = "(IB)V")
	public void method299(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			if (this.aByte11 == 2) {
				@Pc(7) boolean local7 = false;
			} else {
				this.aBoolean82 = !this.aBoolean82;
			}
			this.aByteArray7[this.anInt283++] = (byte) arg0;
			this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 8);
			this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 16);
			this.aByteArray7[this.anInt283++] = (byte) (arg0 >> 24);
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("656, " + arg0 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "f", descriptor = "(Z)I")
	public int method300() {
		try {
			this.anInt283 += 4;
			return ((this.aByteArray7[this.anInt283 - 1] & 0xFF) << 24) + ((this.aByteArray7[this.anInt283 - 2] & 0xFF) << 16) + ((this.aByteArray7[this.anInt283 - 3] & 0xFF) << 8) + (this.aByteArray7[this.anInt283 - 4] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("52122, " + true + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "j", descriptor = "(I)I")
	public int method301() {
		try {
			this.anInt283 += 4;
			if (this.anInt277 != 1) {
				this.aBoolean82 = !this.aBoolean82;
			}
			return ((this.aByteArray7[this.anInt283 - 2] & 0xFF) << 24) + ((this.aByteArray7[this.anInt283 - 1] & 0xFF) << 16) + ((this.aByteArray7[this.anInt283 - 4] & 0xFF) << 8) + (this.aByteArray7[this.anInt283 - 3] & 0xFF);
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("19544, " + 1 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "k", descriptor = "(I)I")
	public int method302() {
		try {
			this.anInt283 += 4;
			return ((this.aByteArray7[this.anInt283 - 3] & 0xFF) << 24) + ((this.aByteArray7[this.anInt283 - 4] & 0xFF) << 16) + ((this.aByteArray7[this.anInt283 - 1] & 0xFF) << 8) + (this.aByteArray7[this.anInt283 - 2] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("72358, " + 273 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(ZI[BI)V")
	public void method303(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(8) int local8 = arg1 + 0 - 1; local8 >= 0; local8--) {
				this.aByteArray7[this.anInt283++] = (byte) (arg0[local8] + 128);
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("42906, " + false + ", " + 0 + ", " + arg0 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(II[BZ)V")
	public void method304(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(8) int local8 = arg0 + 0 - 1; local8 >= 0; local8--) {
				arg1[local8] = this.aByteArray7[this.anInt283++];
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("45691, " + arg0 + ", " + 0 + ", " + arg1 + ", " + false + ", " + local29.toString());
			throw new RuntimeException();
		}
	}
}

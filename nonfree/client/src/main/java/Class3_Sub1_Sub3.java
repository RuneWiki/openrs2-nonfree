import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NHEPCMLW")
public final class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!NHEPCMLW", name = "D", descriptor = "I")
	private static int anInt443;

	@OriginalMember(owner = "client!NHEPCMLW", name = "E", descriptor = "I")
	private static int anInt444;

	@OriginalMember(owner = "client!NHEPCMLW", name = "F", descriptor = "I")
	private static int anInt445;

	@OriginalMember(owner = "client!NHEPCMLW", name = "h", descriptor = "I")
	private static int anInt435 = 389;

	@OriginalMember(owner = "client!NHEPCMLW", name = "A", descriptor = "[I")
	private static int[] anIntArray116 = new int[256];

	@OriginalMember(owner = "client!NHEPCMLW", name = "B", descriptor = "[I")
	private static final int[] anIntArray117;

	@OriginalMember(owner = "client!NHEPCMLW", name = "G", descriptor = "Lclient!OCPYCLUF;")
	private static Class27 aClass27_1;

	@OriginalMember(owner = "client!NHEPCMLW", name = "H", descriptor = "Lclient!OCPYCLUF;")
	private static Class27 aClass27_2;

	@OriginalMember(owner = "client!NHEPCMLW", name = "I", descriptor = "Lclient!OCPYCLUF;")
	private static Class27 aClass27_3;

	@OriginalMember(owner = "client!NHEPCMLW", name = "J", descriptor = "[C")
	private static char[] aCharArray3;

	@OriginalMember(owner = "client!NHEPCMLW", name = "x", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!NHEPCMLW", name = "y", descriptor = "I")
	public int anInt441;

	@OriginalMember(owner = "client!NHEPCMLW", name = "z", descriptor = "I")
	public int anInt442;

	@OriginalMember(owner = "client!NHEPCMLW", name = "C", descriptor = "Lclient!IPEHOOFG;")
	public Class15 aClass15_1;

	@OriginalMember(owner = "client!NHEPCMLW", name = "i", descriptor = "I")
	private int anInt436 = 10041;

	@OriginalMember(owner = "client!NHEPCMLW", name = "j", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!NHEPCMLW", name = "k", descriptor = "I")
	private int anInt437 = -584;

	@OriginalMember(owner = "client!NHEPCMLW", name = "l", descriptor = "B")
	private byte aByte13 = 49;

	@OriginalMember(owner = "client!NHEPCMLW", name = "m", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!NHEPCMLW", name = "n", descriptor = "B")
	private byte aByte14 = -105;

	@OriginalMember(owner = "client!NHEPCMLW", name = "o", descriptor = "B")
	private byte aByte15 = 81;

	@OriginalMember(owner = "client!NHEPCMLW", name = "p", descriptor = "Z")
	private boolean aBoolean110 = true;

	@OriginalMember(owner = "client!NHEPCMLW", name = "q", descriptor = "I")
	private int anInt438 = -520;

	@OriginalMember(owner = "client!NHEPCMLW", name = "r", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!NHEPCMLW", name = "s", descriptor = "B")
	private byte aByte16 = 6;

	@OriginalMember(owner = "client!NHEPCMLW", name = "t", descriptor = "I")
	private int anInt439 = 3;

	@OriginalMember(owner = "client!NHEPCMLW", name = "u", descriptor = "Z")
	private boolean aBoolean112 = true;

	@OriginalMember(owner = "client!NHEPCMLW", name = "v", descriptor = "I")
	private int anInt440 = -4;

	@OriginalMember(owner = "client!NHEPCMLW", name = "w", descriptor = "Z")
	private boolean aBoolean113 = true;

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
			anIntArray116[local6] = local9;
		}
		anIntArray117 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass27_1 = new Class27((byte) 118);
		aClass27_2 = new Class27((byte) 118);
		aClass27_3 = new Class27((byte) 118);
		aCharArray3 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "a", descriptor = "(II)Lclient!NHEPCMLW;")
	public static Class3_Sub1_Sub3 method262(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class27 local3 = aClass27_2;
			synchronized (aClass27_2) {
				@Pc(7) Class3_Sub1_Sub3 local7 = null;
				if (anInt444 > 0) {
					anInt444--;
					local7 = (Class3_Sub1_Sub3) aClass27_2.method326();
				}
				if (local7 != null) {
					local7.anInt441 = 0;
					return local7;
				}
			}
			@Pc(69) Class3_Sub1_Sub3 local69 = new Class3_Sub1_Sub3((byte) 9);
			@Pc(73) int local73 = 70 / arg0;
			local69.anInt441 = 0;
			local69.aByteArray5 = new byte[5000];
			return local69;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("88113, " + arg0 + ", " + 1 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "<init>", descriptor = "(B)V")
	private Class3_Sub1_Sub3(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "<init>", descriptor = "(B[B)V")
	public Class3_Sub1_Sub3(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray5 = arg1;
			this.anInt441 = 0;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("37002, " + arg0 + ", " + arg1 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "b", descriptor = "(II)V")
	public void method263(@OriginalArg(0) int arg0) {
		try {
			if (10041 != this.anInt436) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			this.aByteArray5[this.anInt441++] = (byte) (arg0 + this.aClass15_1.method203());
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("44667, " + arg0 + ", " + 10041 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "a", descriptor = "(I)V")
	public void method264(@OriginalArg(0) int arg0) {
		this.aByteArray5[this.anInt441++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "b", descriptor = "(I)V")
	public void method265(@OriginalArg(0) int arg0) {
		this.aByteArray5[this.anInt441++] = (byte) (arg0 >> 8);
		this.aByteArray5[this.anInt441++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "c", descriptor = "(II)V")
	public void method266(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray5[this.anInt441++] = (byte) arg0;
			this.aByteArray5[this.anInt441++] = 0;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("47099, " + arg0 + ", " + 37278 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "c", descriptor = "(I)V")
	public void method267(@OriginalArg(0) int arg0) {
		this.aByteArray5[this.anInt441++] = (byte) (arg0 >> 16);
		this.aByteArray5[this.anInt441++] = (byte) (arg0 >> 8);
		this.aByteArray5[this.anInt441++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "d", descriptor = "(I)V")
	public void method268(@OriginalArg(0) int arg0) {
		this.aByteArray5[this.anInt441++] = (byte) (arg0 >> 24);
		this.aByteArray5[this.anInt441++] = (byte) (arg0 >> 16);
		this.aByteArray5[this.anInt441++] = (byte) (arg0 >> 8);
		this.aByteArray5[this.anInt441++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "d", descriptor = "(II)V")
	public void method269(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray5[this.anInt441++] = (byte) arg0;
			this.aByteArray5[this.anInt441++] = (byte) (arg0 >> 8);
			this.aByteArray5[this.anInt441++] = (byte) (arg0 >> 16);
			this.aByteArray5[this.anInt441++] = (byte) (arg0 >> 24);
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("27349, " + -698 + ", " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "a", descriptor = "(JB)V")
	public void method270(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray5[this.anInt441++] = (byte) (int) (arg0 >> 56);
			this.aByteArray5[this.anInt441++] = (byte) (int) (arg0 >> 48);
			this.aByteArray5[this.anInt441++] = (byte) (int) (arg0 >> 40);
			this.aByteArray5[this.anInt441++] = (byte) (int) (arg0 >> 32);
			this.aByteArray5[this.anInt441++] = (byte) (int) (arg0 >> 24);
			this.aByteArray5[this.anInt441++] = (byte) (int) (arg0 >> 16);
			this.aByteArray5[this.anInt441++] = (byte) (int) (arg0 >> 8);
			this.aByteArray5[this.anInt441++] = (byte) (int) arg0;
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("33906, " + arg0 + ", " + 7 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method271(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray5, this.anInt441);
		this.anInt441 += arg0.length();
		this.aByteArray5[this.anInt441++] = 10;
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "a", descriptor = "(I[BII)V")
	public void method272(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			for (@Pc(6) int local6 = 0; local6 < arg0 + 0; local6++) {
				this.aByteArray5[this.anInt441++] = arg1[local6];
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("91489, " + arg0 + ", " + arg1 + ", " + 0 + ", " + 0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "e", descriptor = "(II)V")
	public void method273(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray5[this.anInt441 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("85123, " + 6 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "c", descriptor = "()I")
	public int method274() {
		return this.aByteArray5[this.anInt441++] & 0xFF;
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "d", descriptor = "()B")
	public byte method275() {
		return this.aByteArray5[this.anInt441++];
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "e", descriptor = "()I")
	public int method276() {
		this.anInt441 += 2;
		return ((this.aByteArray5[this.anInt441 - 2] & 0xFF) << 8) + (this.aByteArray5[this.anInt441 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "f", descriptor = "()I")
	public int method277() {
		this.anInt441 += 2;
		@Pc(27) int local27 = ((this.aByteArray5[this.anInt441 - 2] & 0xFF) << 8) + (this.aByteArray5[this.anInt441 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "g", descriptor = "()I")
	public int method278() {
		this.anInt441 += 3;
		return ((this.aByteArray5[this.anInt441 - 3] & 0xFF) << 16) + ((this.aByteArray5[this.anInt441 - 2] & 0xFF) << 8) + (this.aByteArray5[this.anInt441 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "h", descriptor = "()I")
	public int method279() {
		this.anInt441 += 4;
		return ((this.aByteArray5[this.anInt441 - 4] & 0xFF) << 24) + ((this.aByteArray5[this.anInt441 - 3] & 0xFF) << 16) + ((this.aByteArray5[this.anInt441 - 2] & 0xFF) << 8) + (this.aByteArray5[this.anInt441 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "e", descriptor = "(I)J")
	public long method280() {
		try {
			@Pc(5) long local5 = (long) this.method279() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method279() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("70407, " + -584 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "i", descriptor = "()Ljava/lang/String;")
	public String method281() {
		@Pc(2) int local2 = this.anInt441;
		while (this.aByteArray5[this.anInt441++] != 10) {
		}
		return new String(this.aByteArray5, local2, this.anInt441 - local2 - 1);
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "f", descriptor = "(I)[B")
	public byte[] method282() {
		try {
			@Pc(2) int local2 = this.anInt441;
			while (this.aByteArray5[this.anInt441++] != 10) {
			}
			@Pc(23) byte[] local23 = new byte[this.anInt441 - local2 - 1];
			for (@Pc(31) int local31 = local2; local31 < this.anInt441 - 1; local31++) {
				local23[local31 - local2] = this.aByteArray5[local31];
			}
			return local23;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("33070, " + 5841 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "a", descriptor = "(III[B)V")
	private void method283(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(8) int local8 = 0; local8 < arg0 + 0; local8++) {
				arg1[local8] = this.aByteArray5[this.anInt441++];
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("60073, " + 6 + ", " + arg0 + ", " + 0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "a", descriptor = "(Z)V")
	public void method284() {
		try {
			this.anInt442 = this.anInt441 * 8;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("18152, " + false + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "f", descriptor = "(II)I")
	public int method285(@OriginalArg(1) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt442 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt442 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt442 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray5[local6++] & anIntArray117[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray5[local6] & anIntArray117[local13];
			} else {
				local15 += this.aByteArray5[local6] >> local13 - arg0 & anIntArray117[arg0];
			}
			return local15;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("86106, " + 168 + ", " + arg0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "g", descriptor = "(I)V")
	public void method286(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				this.anInt441 = (this.anInt442 + 7) / 8;
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("44875, " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "j", descriptor = "()I")
	public int method287() {
		@Pc(7) int local7 = this.aByteArray5[this.anInt441] & 0xFF;
		return local7 < 128 ? this.method274() - 64 : this.method276() - 49152;
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "k", descriptor = "()I")
	public int method288() {
		@Pc(7) int local7 = this.aByteArray5[this.anInt441] & 0xFF;
		return local7 < 128 ? this.method274() : this.method276() - 32768;
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "a", descriptor = "(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method289(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(7) int local7 = this.anInt441;
			this.anInt441 = 0;
			@Pc(13) byte[] local13 = new byte[local7];
			this.method283(local7, local13);
			@Pc(24) BigInteger local24 = new BigInteger(local13);
			@Pc(29) BigInteger local29 = local24.modPow(arg0, arg1);
			@Pc(32) byte[] local32 = local29.toByteArray();
			this.anInt441 = 0;
			this.method264(local32.length);
			this.method272(local32.length, local32);
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("75403, " + false + ", " + arg0 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "a", descriptor = "(IB)V")
	public void method290(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 == -100) {
				this.aByteArray5[this.anInt441++] = (byte) -arg0;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("17111, " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "g", descriptor = "(II)V")
	public void method291(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray5[this.anInt441++] = (byte) (128 - arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("2706, " + 2 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "h", descriptor = "(I)I")
	public int method292() {
		try {
			return this.aByteArray5[this.anInt441++] - 128 & 0xFF;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("52066, " + 34652 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "i", descriptor = "(I)I")
	public int method293() {
		try {
			return -this.aByteArray5[this.anInt441++] & 0xFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("91098, " + 0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "j", descriptor = "(I)I")
	public int method294(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			return 128 - this.aByteArray5[this.anInt441++] & 0xFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("16504, " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "k", descriptor = "(I)B")
	public byte method295(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return (byte) (this.aByteArray5[this.anInt441++] - 128);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("20826, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "l", descriptor = "(I)B")
	public byte method296() {
		try {
			return (byte) -this.aByteArray5[this.anInt441++];
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("58837, " + 24248 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "a", descriptor = "(IZ)V")
	public void method297(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aByteArray5[this.anInt441++] = (byte) arg0;
			this.aByteArray5[this.anInt441++] = (byte) (arg0 >> 8);
			if (!arg1) {
				this.aBoolean113 = !this.aBoolean113;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("489, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "h", descriptor = "(II)V")
	public void method298(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray5[this.anInt441++] = (byte) (arg0 >> 8);
			this.aByteArray5[this.anInt441++] = (byte) (arg0 + 128);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("24532, " + 8 + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "b", descriptor = "(IZ)V")
	public void method299(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aByteArray5[this.anInt441++] = (byte) (arg0 + 128);
			this.aByteArray5[this.anInt441++] = (byte) (arg0 >> 8);
			if (arg1) {
				for (@Pc(31) int local31 = 1; local31 > 0; local31++) {
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("78233, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "m", descriptor = "(I)I")
	public int method300() {
		try {
			this.anInt441 += 2;
			return ((this.aByteArray5[this.anInt441 - 1] & 0xFF) << 8) + (this.aByteArray5[this.anInt441 - 2] & 0xFF);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("37131, " + -889 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "n", descriptor = "(I)I")
	public int method301() {
		try {
			this.anInt441 += 2;
			return ((this.aByteArray5[this.anInt441 - 2] & 0xFF) << 8) + (this.aByteArray5[this.anInt441 - 1] - 128 & 0xFF);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("69572, " + 5 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "b", descriptor = "(Z)I")
	public int method302() {
		try {
			this.anInt441 += 2;
			return ((this.aByteArray5[this.anInt441 - 1] & 0xFF) << 8) + (this.aByteArray5[this.anInt441 - 2] - 128 & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("89536, " + true + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "a", descriptor = "(B)I")
	public int method303() {
		try {
			this.anInt441 += 2;
			@Pc(38) int local38 = ((this.aByteArray5[this.anInt441 - 1] & 0xFF) << 8) + (this.aByteArray5[this.anInt441 - 2] & 0xFF);
			if (local38 > 32767) {
				local38 -= 65536;
			}
			return local38;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("14704, " + -12 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "o", descriptor = "(I)I")
	public int method304() {
		try {
			this.anInt441 += 2;
			@Pc(31) int local31 = ((this.aByteArray5[this.anInt441 - 2] & 0xFF) << 8) + (this.aByteArray5[this.anInt441 - 1] - 128 & 0xFF);
			if (local31 > 32767) {
				local31 -= 65536;
			}
			return local31;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("7919, " + -296 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "b", descriptor = "(B)I")
	public int method305() {
		try {
			@Pc(5) int local5;
			if (81 != this.aByte15) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			this.anInt441 += 2;
			local5 = ((this.aByteArray5[this.anInt441 - 1] & 0xFF) << 8) + (this.aByteArray5[this.anInt441 - 2] - 128 & 0xFF);
			if (local5 > 32767) {
				local5 -= 65536;
			}
			return local5;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("63150, " + 81 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "i", descriptor = "(II)V")
	public void method306(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray5[this.anInt441++] = (byte) (arg0 >> 16);
			this.aByteArray5[this.anInt441++] = (byte) (arg0 >> 24);
			this.aByteArray5[this.anInt441++] = (byte) arg0;
			this.aByteArray5[this.anInt441++] = (byte) (arg0 >> 8);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("6151, " + arg0 + ", " + 451 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "c", descriptor = "(Z)I")
	public int method307() {
		try {
			this.anInt441 += 4;
			return ((this.aByteArray5[this.anInt441 - 1] & 0xFF) << 24) + ((this.aByteArray5[this.anInt441 - 2] & 0xFF) << 16) + ((this.aByteArray5[this.anInt441 - 3] & 0xFF) << 8) + (this.aByteArray5[this.anInt441 - 4] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("82904, " + true + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "p", descriptor = "(I)I")
	public int method308() {
		try {
			this.anInt441 += 4;
			return ((this.aByteArray5[this.anInt441 - 2] & 0xFF) << 24) + ((this.aByteArray5[this.anInt441 - 1] & 0xFF) << 16) + ((this.aByteArray5[this.anInt441 - 4] & 0xFF) << 8) + (this.aByteArray5[this.anInt441 - 3] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("90431, " + 107 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "d", descriptor = "(Z)I")
	public int method309() {
		try {
			this.anInt441 += 4;
			return ((this.aByteArray5[this.anInt441 - 3] & 0xFF) << 24) + ((this.aByteArray5[this.anInt441 - 4] & 0xFF) << 16) + ((this.aByteArray5[this.anInt441 - 1] & 0xFF) << 8) + (this.aByteArray5[this.anInt441 - 2] & 0xFF);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("74686, " + false + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "b", descriptor = "(III[B)V")
	public void method310(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(15) int local15 = arg0 + 0 - 1; local15 >= 0; local15--) {
				this.aByteArray5[this.anInt441++] = (byte) (arg1[local15] + 128);
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("9378, " + arg0 + ", " + -113 + ", " + 0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "a", descriptor = "(II[BI)V")
	public void method311(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) int local6;
			if (arg0 != 44885) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			for (local6 = arg2 + 0 - 1; local6 >= 0; local6--) {
				arg1[local6] = this.aByteArray5[this.anInt441++];
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("13036, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHEPCMLW", name = "a", descriptor = "(IB[BI)V")
	public void method312(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (6 != this.aByte16) {
				this.aBoolean108 = !this.aBoolean108;
			}
			for (@Pc(13) int local13 = 0; local13 < arg0 + 0; local13++) {
				arg1[local13] = (byte) (this.aByteArray5[this.anInt441++] - 128);
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("83733, " + arg0 + ", " + 6 + ", " + arg1 + ", " + 0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}
}

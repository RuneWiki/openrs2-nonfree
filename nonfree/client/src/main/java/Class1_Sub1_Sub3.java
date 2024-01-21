import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JHKSAGUC")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!JHKSAGUC", name = "E", descriptor = "I")
	private static int anInt354;

	@OriginalMember(owner = "client!JHKSAGUC", name = "F", descriptor = "I")
	private static int anInt355;

	@OriginalMember(owner = "client!JHKSAGUC", name = "G", descriptor = "I")
	private static int anInt356;

	@OriginalMember(owner = "client!JHKSAGUC", name = "B", descriptor = "[I")
	private static int[] anIntArray72 = new int[256];

	@OriginalMember(owner = "client!JHKSAGUC", name = "C", descriptor = "[I")
	private static final int[] anIntArray73;

	@OriginalMember(owner = "client!JHKSAGUC", name = "H", descriptor = "Lclient!OUZUCGGU;")
	private static Class32 aClass32_1;

	@OriginalMember(owner = "client!JHKSAGUC", name = "I", descriptor = "Lclient!OUZUCGGU;")
	private static Class32 aClass32_2;

	@OriginalMember(owner = "client!JHKSAGUC", name = "J", descriptor = "Lclient!OUZUCGGU;")
	private static Class32 aClass32_3;

	@OriginalMember(owner = "client!JHKSAGUC", name = "K", descriptor = "[C")
	private static char[] aCharArray3;

	@OriginalMember(owner = "client!JHKSAGUC", name = "n", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!JHKSAGUC", name = "u", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!JHKSAGUC", name = "y", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!JHKSAGUC", name = "z", descriptor = "I")
	public int anInt352;

	@OriginalMember(owner = "client!JHKSAGUC", name = "A", descriptor = "I")
	public int anInt353;

	@OriginalMember(owner = "client!JHKSAGUC", name = "D", descriptor = "Lclient!ZPIYFABJ;")
	public Class50 aClass50_1;

	@OriginalMember(owner = "client!JHKSAGUC", name = "i", descriptor = "B")
	private byte aByte22 = 5;

	@OriginalMember(owner = "client!JHKSAGUC", name = "j", descriptor = "I")
	private int anInt345 = 4;

	@OriginalMember(owner = "client!JHKSAGUC", name = "k", descriptor = "I")
	private int anInt346 = -874;

	@OriginalMember(owner = "client!JHKSAGUC", name = "l", descriptor = "I")
	private int anInt347 = -615;

	@OriginalMember(owner = "client!JHKSAGUC", name = "m", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!JHKSAGUC", name = "o", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!JHKSAGUC", name = "p", descriptor = "Z")
	private boolean aBoolean82 = true;

	@OriginalMember(owner = "client!JHKSAGUC", name = "q", descriptor = "B")
	private byte aByte23 = 81;

	@OriginalMember(owner = "client!JHKSAGUC", name = "r", descriptor = "I")
	private int anInt349 = 48759;

	@OriginalMember(owner = "client!JHKSAGUC", name = "s", descriptor = "Z")
	private boolean aBoolean83 = true;

	@OriginalMember(owner = "client!JHKSAGUC", name = "t", descriptor = "Z")
	private boolean aBoolean84 = true;

	@OriginalMember(owner = "client!JHKSAGUC", name = "v", descriptor = "I")
	private int anInt351 = 6;

	@OriginalMember(owner = "client!JHKSAGUC", name = "w", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!JHKSAGUC", name = "x", descriptor = "Z")
	private boolean aBoolean86 = true;

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
			anIntArray72[local4] = local7;
		}
		anIntArray73 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass32_1 = new Class32(-392);
		aClass32_2 = new Class32(-392);
		aClass32_3 = new Class32(-392);
		aCharArray3 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "a", descriptor = "(II)Lclient!JHKSAGUC;")
	public static Class1_Sub1_Sub3 method226() {
		try {
			@Pc(3) Class32 local3 = aClass32_2;
			synchronized (aClass32_2) {
				@Pc(7) Class1_Sub1_Sub3 local7 = null;
				if (anInt355 > 0) {
					anInt355--;
					local7 = (Class1_Sub1_Sub3) aClass32_2.method335();
				}
				if (local7 != null) {
					local7.anInt352 = 0;
					return local7;
				}
			}
			@Pc(76) Class1_Sub1_Sub3 local76 = new Class1_Sub1_Sub3(38839);
			local76.anInt352 = 0;
			local76.aByteArray3 = new byte[5000];
			return local76;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("40980, " + -37580 + ", " + 1 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "<init>", descriptor = "([BI)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray3 = arg0;
			this.anInt352 = 0;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("18653, " + arg0 + ", " + arg1 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "b", descriptor = "(II)V")
	public void method227(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray3[this.anInt352++] = (byte) (arg0 + this.aClass50_1.method565());
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("40348, " + arg0 + ", " + 1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "a", descriptor = "(I)V")
	public void method228(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt352++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "b", descriptor = "(I)V")
	public void method229(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt352++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt352++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "c", descriptor = "(II)V")
	public void method230(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt345 > 4 || this.anInt345 < 4) {
				this.aBoolean84 = !this.aBoolean84;
			}
			this.aByteArray3[this.anInt352++] = (byte) arg0;
			this.aByteArray3[this.anInt352++] = 0;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("92217, " + arg0 + ", " + 4 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "c", descriptor = "(I)V")
	public void method231(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt352++] = (byte) (arg0 >> 16);
		this.aByteArray3[this.anInt352++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt352++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "d", descriptor = "(I)V")
	public void method232(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt352++] = (byte) (arg0 >> 24);
		this.aByteArray3[this.anInt352++] = (byte) (arg0 >> 16);
		this.aByteArray3[this.anInt352++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt352++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "a", descriptor = "(IZ)V")
	public void method233(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray3[this.anInt352++] = (byte) arg0;
			this.aByteArray3[this.anInt352++] = (byte) (arg0 >> 8);
			this.aByteArray3[this.anInt352++] = (byte) (arg0 >> 16);
			this.aByteArray3[this.anInt352++] = (byte) (arg0 >> 24);
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("69104, " + arg0 + ", " + true + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "a", descriptor = "(JB)V")
	public void method234(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray3[this.anInt352++] = (byte) (arg0 >> 56);
			this.aByteArray3[this.anInt352++] = (byte) (arg0 >> 48);
			this.aByteArray3[this.anInt352++] = (byte) (arg0 >> 40);
			this.aByteArray3[this.anInt352++] = (byte) (arg0 >> 32);
			this.aByteArray3[this.anInt352++] = (byte) (arg0 >> 24);
			this.aByteArray3[this.anInt352++] = (byte) (arg0 >> 16);
			this.aByteArray3[this.anInt352++] = (byte) (arg0 >> 8);
			this.aByteArray3[this.anInt352++] = (byte) arg0;
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("33173, " + arg0 + ", " + -65 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method235(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray3, this.anInt352);
		this.anInt352 += arg0.length();
		this.aByteArray3[this.anInt352++] = 10;
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "a", descriptor = "(II[BZ)V")
	public void method236(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg0 + 0; local4++) {
				this.aByteArray3[this.anInt352++] = arg1[local4];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("17059, " + 0 + ", " + arg0 + ", " + arg1 + ", " + true + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "a", descriptor = "(BI)V")
	public void method237(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray3[this.anInt352 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("50017, " + 103 + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "c", descriptor = "()I")
	public int method238() {
		return this.aByteArray3[this.anInt352++] & 0xFF;
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "d", descriptor = "()B")
	public byte method239() {
		return this.aByteArray3[this.anInt352++];
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "e", descriptor = "()I")
	public int method240() {
		this.anInt352 += 2;
		return ((this.aByteArray3[this.anInt352 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt352 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "f", descriptor = "()I")
	public int method241() {
		this.anInt352 += 2;
		@Pc(27) int local27 = ((this.aByteArray3[this.anInt352 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt352 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "g", descriptor = "()I")
	public int method242() {
		this.anInt352 += 3;
		return ((this.aByteArray3[this.anInt352 - 3] & 0xFF) << 16) + ((this.aByteArray3[this.anInt352 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt352 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "h", descriptor = "()I")
	public int method243() {
		this.anInt352 += 4;
		return ((this.aByteArray3[this.anInt352 - 4] & 0xFF) << 24) + ((this.aByteArray3[this.anInt352 - 3] & 0xFF) << 16) + ((this.aByteArray3[this.anInt352 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt352 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "e", descriptor = "(I)J")
	public long method244() {
		try {
			@Pc(5) long local5 = (long) this.method243() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method243() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("55560, " + 217 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "i", descriptor = "()Ljava/lang/String;")
	public String method245() {
		@Pc(2) int local2 = this.anInt352;
		while (this.aByteArray3[this.anInt352++] != 10) {
		}
		return new String(this.aByteArray3, local2, this.anInt352 - local2 - 1);
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "f", descriptor = "(I)[B")
	public byte[] method246() {
		try {
			@Pc(2) int local2 = this.anInt352;
			while (this.aByteArray3[this.anInt352++] != 10) {
			}
			@Pc(28) byte[] local28 = new byte[this.anInt352 - local2 - 1];
			for (@Pc(30) int local30 = local2; local30 < this.anInt352 - 1; local30++) {
				local28[local30 - local2] = this.aByteArray3[local30];
			}
			return local28;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("1807, " + -571 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "a", descriptor = "(III[B)V")
	private void method247(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(11) int local11 = 0; local11 < arg0 + 0; local11++) {
				arg1[local11] = this.aByteArray3[this.anInt352++];
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("79893, " + 0 + ", " + 0 + ", " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "g", descriptor = "(I)V")
	public void method248() {
		try {
			this.anInt353 = this.anInt352 * 8;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("61827, " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "b", descriptor = "(BI)I")
	public int method249(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(15) int local15 = this.anInt353 >> 3;
			@Pc(22) int local22 = 8 - (this.anInt353 & 0x7);
			@Pc(24) int local24 = 0;
			this.anInt353 += arg1;
			while (arg1 > local22) {
				local24 += (this.aByteArray3[local15++] & anIntArray73[local22]) << arg1 - local22;
				arg1 -= local22;
				local22 = 8;
			}
			if (arg1 == local22) {
				local24 += this.aByteArray3[local15] & anIntArray73[local22];
			} else {
				local24 += this.aByteArray3[local15] >> local22 - arg1 & anIntArray73[arg1];
			}
			return local24;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("41543, " + arg0 + ", " + arg1 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "a", descriptor = "(B)V")
	public void method250() {
		try {
			this.anInt352 = (this.anInt353 + 7) / 8;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("36688, " + -66 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "j", descriptor = "()I")
	public int method251() {
		@Pc(7) int local7 = this.aByteArray3[this.anInt352] & 0xFF;
		return local7 < 128 ? this.method238() - 64 : this.method240() - 49152;
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "k", descriptor = "()I")
	public int method252() {
		@Pc(7) int local7 = this.aByteArray3[this.anInt352] & 0xFF;
		return local7 < 128 ? this.method238() : this.method240() - 32768;
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method253(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt352;
			this.anInt352 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method247(local2, local8);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg0, arg1);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt352 = 0;
			this.method228(local27.length);
			this.method236(local27.length, local27);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("31146, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "c", descriptor = "(BI)V")
	public void method254(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray3[this.anInt352++] = (byte) (arg0 + 128);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("15632, " + 99 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "b", descriptor = "(IZ)V")
	public void method255(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1) {
				this.aBoolean86 = !this.aBoolean86;
			}
			this.aByteArray3[this.anInt352++] = (byte) -arg0;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("17619, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "d", descriptor = "(II)V")
	public void method256(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray3[this.anInt352++] = (byte) (128 - arg0);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("80171, " + arg0 + ", " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "h", descriptor = "(I)I")
	public int method257() {
		try {
			return this.aByteArray3[this.anInt352++] - 128 & 0xFF;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("57250, " + -35277 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "b", descriptor = "(B)I")
	public int method258() {
		try {
			return -this.aByteArray3[this.anInt352++] & 0xFF;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("74015, " + -15 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "i", descriptor = "(I)I")
	public int method259() {
		try {
			return 128 - this.aByteArray3[this.anInt352++] & 0xFF;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("79841, " + 8 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "j", descriptor = "(I)B")
	public byte method260() {
		try {
			return (byte) (this.aByteArray3[this.anInt352++] - 128);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("42140, " + 3 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "c", descriptor = "(B)B")
	public byte method261() {
		try {
			return (byte) -this.aByteArray3[this.anInt352++];
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("41056, " + 57 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "a", descriptor = "(Z)B")
	public byte method262() {
		try {
			return (byte) (128 - this.aByteArray3[this.anInt352++]);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("18470, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "a", descriptor = "(IB)V")
	public void method263(@OriginalArg(0) int arg0) {
		try {
			if (this.aByte23 != 81) {
				this.anInt346 = -238;
			}
			this.aByteArray3[this.anInt352++] = (byte) arg0;
			this.aByteArray3[this.anInt352++] = (byte) (arg0 >> 8);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("79661, " + arg0 + ", " + 81 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "e", descriptor = "(II)V")
	public void method264(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray3[this.anInt352++] = (byte) (arg0 >> 8);
			this.aByteArray3[this.anInt352++] = (byte) (arg0 + 128);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("70539, " + arg0 + ", " + -79 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "f", descriptor = "(II)V")
	public void method265(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray3[this.anInt352++] = (byte) (arg0 + 128);
			this.aByteArray3[this.anInt352++] = (byte) (arg0 >> 8);
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("94301, " + arg0 + ", " + 508 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "d", descriptor = "(B)I")
	public int method266() {
		try {
			this.anInt352 += 2;
			return ((this.aByteArray3[this.anInt352 - 1] & 0xFF) << 8) + (this.aByteArray3[this.anInt352 - 2] & 0xFF);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("32557, " + -45 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "b", descriptor = "(Z)I")
	public int method267() {
		try {
			this.anInt352 += 2;
			return ((this.aByteArray3[this.anInt352 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt352 - 1] - 128 & 0xFF);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("72237, " + true + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "e", descriptor = "(B)I")
	public int method268() {
		try {
			this.anInt352 += 2;
			return ((this.aByteArray3[this.anInt352 - 1] & 0xFF) << 8) + (this.aByteArray3[this.anInt352 - 2] - 128 & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("92354, " + 87 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "k", descriptor = "(I)I")
	public int method269() {
		try {
			this.anInt352 += 2;
			@Pc(27) int local27 = ((this.aByteArray3[this.anInt352 - 1] & 0xFF) << 8) + (this.aByteArray3[this.anInt352 - 2] & 0xFF);
			if (local27 > 32767) {
				local27 -= 65536;
			}
			return local27;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("66542, " + 0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "l", descriptor = "(I)I")
	public int method270(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 70 / arg0;
			this.anInt352 += 2;
			@Pc(33) int local33 = ((this.aByteArray3[this.anInt352 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt352 - 1] - 128 & 0xFF);
			if (local33 > 32767) {
				local33 -= 65536;
			}
			return local33;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("49344, " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "m", descriptor = "(I)I")
	public int method271() {
		try {
			if (this.anInt349 == 48759) {
				this.anInt352 += 3;
				return ((this.aByteArray3[this.anInt352 - 1] & 0xFF) << 16) + ((this.aByteArray3[this.anInt352 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt352 - 3] & 0xFF);
			} else {
				return this.anInt348;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("12904, " + 48759 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "c", descriptor = "(Z)I")
	public int method272() {
		try {
			this.anInt352 += 4;
			return ((this.aByteArray3[this.anInt352 - 1] & 0xFF) << 24) + ((this.aByteArray3[this.anInt352 - 2] & 0xFF) << 16) + ((this.aByteArray3[this.anInt352 - 3] & 0xFF) << 8) + (this.aByteArray3[this.anInt352 - 4] & 0xFF);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("5866, " + false + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "d", descriptor = "(Z)I")
	public int method273() {
		try {
			this.anInt352 += 4;
			return ((this.aByteArray3[this.anInt352 - 2] & 0xFF) << 24) + ((this.aByteArray3[this.anInt352 - 1] & 0xFF) << 16) + ((this.aByteArray3[this.anInt352 - 4] & 0xFF) << 8) + (this.aByteArray3[this.anInt352 - 3] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("63613, " + true + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "e", descriptor = "(Z)I")
	public int method274() {
		try {
			this.anInt352 += 4;
			return ((this.aByteArray3[this.anInt352 - 3] & 0xFF) << 24) + ((this.aByteArray3[this.anInt352 - 4] & 0xFF) << 16) + ((this.aByteArray3[this.anInt352 - 1] & 0xFF) << 8) + (this.aByteArray3[this.anInt352 - 2] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("92487, " + false + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHKSAGUC", name = "a", descriptor = "(BI[BI)V")
	public void method275(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(17) int local17 = arg0 + 0 - 1; local17 >= 0; local17--) {
				arg1[local17] = this.aByteArray3[this.anInt352++];
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("65597, " + 80 + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}
}

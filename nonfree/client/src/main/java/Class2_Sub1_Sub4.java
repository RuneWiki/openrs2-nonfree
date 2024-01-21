import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DNRIFKTO")
public final class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!DNRIFKTO", name = "D", descriptor = "I")
	private static int anInt168;

	@OriginalMember(owner = "client!DNRIFKTO", name = "E", descriptor = "I")
	private static int anInt169;

	@OriginalMember(owner = "client!DNRIFKTO", name = "F", descriptor = "I")
	private static int anInt170;

	@OriginalMember(owner = "client!DNRIFKTO", name = "w", descriptor = "I")
	private static int anInt165 = 44965;

	@OriginalMember(owner = "client!DNRIFKTO", name = "A", descriptor = "[I")
	private static int[] anIntArray27 = new int[256];

	@OriginalMember(owner = "client!DNRIFKTO", name = "B", descriptor = "[I")
	private static final int[] anIntArray28;

	@OriginalMember(owner = "client!DNRIFKTO", name = "G", descriptor = "Lclient!ZCVCEQHJ;")
	private static Class48 aClass48_1;

	@OriginalMember(owner = "client!DNRIFKTO", name = "H", descriptor = "Lclient!ZCVCEQHJ;")
	private static Class48 aClass48_2;

	@OriginalMember(owner = "client!DNRIFKTO", name = "I", descriptor = "Lclient!ZCVCEQHJ;")
	private static Class48 aClass48_3;

	@OriginalMember(owner = "client!DNRIFKTO", name = "J", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!DNRIFKTO", name = "i", descriptor = "I")
	private int anInt158;

	@OriginalMember(owner = "client!DNRIFKTO", name = "q", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!DNRIFKTO", name = "x", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!DNRIFKTO", name = "y", descriptor = "I")
	public int anInt166;

	@OriginalMember(owner = "client!DNRIFKTO", name = "z", descriptor = "I")
	public int anInt167;

	@OriginalMember(owner = "client!DNRIFKTO", name = "C", descriptor = "Lclient!GOLMSHHL;")
	public Class11 aClass11_1;

	@OriginalMember(owner = "client!DNRIFKTO", name = "j", descriptor = "Z")
	private boolean aBoolean33 = true;

	@OriginalMember(owner = "client!DNRIFKTO", name = "k", descriptor = "Z")
	private boolean aBoolean34 = true;

	@OriginalMember(owner = "client!DNRIFKTO", name = "l", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!DNRIFKTO", name = "m", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!DNRIFKTO", name = "n", descriptor = "I")
	private int anInt159 = 14846;

	@OriginalMember(owner = "client!DNRIFKTO", name = "o", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!DNRIFKTO", name = "p", descriptor = "I")
	private int anInt160 = -18450;

	@OriginalMember(owner = "client!DNRIFKTO", name = "r", descriptor = "I")
	private int anInt162 = -507;

	@OriginalMember(owner = "client!DNRIFKTO", name = "s", descriptor = "I")
	private int anInt163 = -23971;

	@OriginalMember(owner = "client!DNRIFKTO", name = "t", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!DNRIFKTO", name = "u", descriptor = "Z")
	private boolean aBoolean39 = false;

	@OriginalMember(owner = "client!DNRIFKTO", name = "v", descriptor = "I")
	private int anInt164 = -30892;

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
			anIntArray27[local6] = local9;
		}
		anIntArray28 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass48_1 = new Class48(-489);
		aClass48_2 = new Class48(-489);
		aClass48_3 = new Class48(-489);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "a", descriptor = "(II)Lclient!DNRIFKTO;")
	public static Class2_Sub1_Sub4 method82() {
		try {
			@Pc(3) Class48 local3 = aClass48_2;
			synchronized (aClass48_2) {
				@Pc(7) Class2_Sub1_Sub4 local7 = null;
				if (anInt169 > 0) {
					anInt169--;
					local7 = (Class2_Sub1_Sub4) aClass48_2.method564();
				}
				if (local7 != null) {
					local7.anInt166 = 0;
					return local7;
				}
			}
			@Pc(73) Class2_Sub1_Sub4 local73 = new Class2_Sub1_Sub4(0);
			local73.anInt166 = 0;
			local73.aByteArray2 = new byte[5000];
			return local73;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("32233, " + 1 + ", " + 342 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "<init>", descriptor = "(I)V")
	private Class2_Sub1_Sub4(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "<init>", descriptor = "([BZ)V")
	public Class2_Sub1_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1) {
				this.aBoolean34 = !this.aBoolean34;
			}
			this.aByteArray2 = arg0;
			this.anInt166 = 0;
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("15791, " + arg0 + ", " + arg1 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "a", descriptor = "(ZI)V")
	public void method83(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray2[this.anInt166++] = (byte) (arg0 + this.aClass11_1.method175());
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("58752, " + false + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "a", descriptor = "(I)V")
	public void method84(@OriginalArg(0) int arg0) {
		this.aByteArray2[this.anInt166++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "b", descriptor = "(I)V")
	public void method85(@OriginalArg(0) int arg0) {
		this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 8);
		this.aByteArray2[this.anInt166++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "b", descriptor = "(II)V")
	public void method86(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			this.aByteArray2[this.anInt166++] = (byte) arg1;
			this.aByteArray2[this.anInt166++] = 0;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("47999, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "c", descriptor = "(I)V")
	public void method87(@OriginalArg(0) int arg0) {
		this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 16);
		this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 8);
		this.aByteArray2[this.anInt166++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "d", descriptor = "(I)V")
	public void method88(@OriginalArg(0) int arg0) {
		this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 24);
		this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 16);
		this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 8);
		this.aByteArray2[this.anInt166++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "c", descriptor = "(II)V")
	public void method89(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray2[this.anInt166++] = (byte) arg0;
			this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 8);
			this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 16);
			this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 24);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("86000, " + 7 + ", " + arg0 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "a", descriptor = "(BJ)V")
	public void method90(@OriginalArg(1) long arg0) {
		try {
			this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 56);
			this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 48);
			this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 40);
			this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 32);
			this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 24);
			this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 16);
			this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 8);
			this.aByteArray2[this.anInt166++] = (byte) arg0;
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("87608, " + 35 + ", " + arg0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method91(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray2, this.anInt166);
		this.anInt166 += arg0.length();
		this.aByteArray2[this.anInt166++] = 10;
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "a", descriptor = "(I[BII)V")
	public void method92(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg0 + 0; local12++) {
				this.aByteArray2[this.anInt166++] = arg1[local12];
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("24330, " + arg0 + ", " + arg1 + ", " + 0 + ", " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "d", descriptor = "(II)V")
	public void method93(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray2[this.anInt166 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("89861, " + arg0 + ", " + -122 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "c", descriptor = "()I")
	public int method94() {
		return this.aByteArray2[this.anInt166++] & 0xFF;
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "d", descriptor = "()B")
	public byte method95() {
		return this.aByteArray2[this.anInt166++];
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "e", descriptor = "()I")
	public int method96() {
		this.anInt166 += 2;
		return ((this.aByteArray2[this.anInt166 - 2] & 0xFF) << 8) + (this.aByteArray2[this.anInt166 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "f", descriptor = "()I")
	public int method97() {
		this.anInt166 += 2;
		@Pc(27) int local27 = ((this.aByteArray2[this.anInt166 - 2] & 0xFF) << 8) + (this.aByteArray2[this.anInt166 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "g", descriptor = "()I")
	public int method98() {
		this.anInt166 += 3;
		return ((this.aByteArray2[this.anInt166 - 3] & 0xFF) << 16) + ((this.aByteArray2[this.anInt166 - 2] & 0xFF) << 8) + (this.aByteArray2[this.anInt166 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "h", descriptor = "()I")
	public int method99() {
		this.anInt166 += 4;
		return ((this.aByteArray2[this.anInt166 - 4] & 0xFF) << 24) + ((this.aByteArray2[this.anInt166 - 3] & 0xFF) << 16) + ((this.aByteArray2[this.anInt166 - 2] & 0xFF) << 8) + (this.aByteArray2[this.anInt166 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "e", descriptor = "(I)J")
	public long method100() {
		try {
			@Pc(5) long local5 = (long) this.method99() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method99() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("71820, " + 0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "i", descriptor = "()Ljava/lang/String;")
	public String method101() {
		@Pc(2) int local2 = this.anInt166;
		while (this.aByteArray2[this.anInt166++] != 10) {
		}
		return new String(this.aByteArray2, local2, this.anInt166 - local2 - 1);
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "f", descriptor = "(I)[B")
	public byte[] method102() {
		try {
			@Pc(4) int local4 = this.anInt166;
			while (this.aByteArray2[this.anInt166++] != 10) {
			}
			@Pc(25) byte[] local25 = new byte[this.anInt166 - local4 - 1];
			for (@Pc(36) int local36 = local4; local36 < this.anInt166 - 1; local36++) {
				local25[local36 - local4] = this.aByteArray2[local36];
			}
			return local25;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("56591, " + 0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "a", descriptor = "(III[B)V")
	private void method103(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg0 + 0; local12++) {
				arg1[local12] = this.aByteArray2[this.anInt166++];
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("642, " + arg0 + ", " + 0 + ", " + 0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "a", descriptor = "(B)V")
	public void method104() {
		try {
			this.anInt167 = this.anInt166 * 8;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("74829, " + 113 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "e", descriptor = "(II)I")
	public int method105(@OriginalArg(1) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt167 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt167 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt167 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray2[local6++] & anIntArray28[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray2[local6] & anIntArray28[local13];
			} else {
				local15 += this.aByteArray2[local6] >> local13 - arg0 & anIntArray28[arg0];
			}
			return local15;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("2576, " + 5 + ", " + arg0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "g", descriptor = "(I)V")
	public void method106() {
		try {
			this.anInt166 = (this.anInt167 + 7) / 8;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("84613, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "j", descriptor = "()I")
	public int method107() {
		@Pc(7) int local7 = this.aByteArray2[this.anInt166] & 0xFF;
		return local7 < 128 ? this.method94() - 64 : this.method96() - 49152;
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "k", descriptor = "()I")
	public int method108() {
		@Pc(7) int local7 = this.aByteArray2[this.anInt166] & 0xFF;
		return local7 < 128 ? this.method94() : this.method96() - 32768;
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method109(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt166;
			this.anInt166 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method103(local2, local8);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg0, arg1);
			@Pc(32) byte[] local32 = local24.toByteArray();
			this.anInt166 = 0;
			this.method84(local32.length);
			this.method92(local32.length, local32);
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("70794, " + arg0 + ", " + -854 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "f", descriptor = "(II)V")
	public void method110(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray2[this.anInt166++] = (byte) (arg0 + 128);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("35535, " + arg0 + ", " + 6 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "b", descriptor = "(B)I")
	public int method111() {
		try {
			return this.aByteArray2[this.anInt166++] - 128 & 0xFF;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("29973, " + -35 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "c", descriptor = "(B)I")
	public int method112() {
		try {
			return -this.aByteArray2[this.anInt166++] & 0xFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("90261, " + 7 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "d", descriptor = "(B)I")
	public int method113() {
		try {
			return 128 - this.aByteArray2[this.anInt166++] & 0xFF;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("11611, " + 97 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "e", descriptor = "(B)B")
	public byte method114() {
		try {
			return (byte) -this.aByteArray2[this.anInt166++];
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("97401, " + 51 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "h", descriptor = "(I)B")
	public byte method115() {
		try {
			return (byte) (128 - this.aByteArray2[this.anInt166++]);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("23807, " + 9 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "g", descriptor = "(II)V")
	public void method116(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray2[this.anInt166++] = (byte) arg0;
			this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 8);
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("34549, " + 35516 + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "a", descriptor = "(BI)V")
	public void method117(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray2[this.anInt166++] = (byte) (arg1 >> 8);
			@Pc(18) boolean local18 = false;
			this.aByteArray2[this.anInt166++] = (byte) (arg1 + 128);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("83447, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "a", descriptor = "(IZ)V")
	public void method118(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray2[this.anInt166++] = (byte) (arg0 + 128);
			this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 8);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("7835, " + arg0 + ", " + false + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "f", descriptor = "(B)I")
	public int method119(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == 5) {
				this.anInt166 += 2;
				return ((this.aByteArray2[this.anInt166 - 1] & 0xFF) << 8) + (this.aByteArray2[this.anInt166 - 2] & 0xFF);
			} else {
				return this.anInt161;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("82544, " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "i", descriptor = "(I)I")
	public int method120() {
		try {
			this.anInt166 += 2;
			return ((this.aByteArray2[this.anInt166 - 2] & 0xFF) << 8) + (this.aByteArray2[this.anInt166 - 1] - 128 & 0xFF);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("82769, " + -998 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "j", descriptor = "(I)I")
	public int method121() {
		try {
			this.anInt166 += 2;
			return ((this.aByteArray2[this.anInt166 - 1] & 0xFF) << 8) + (this.aByteArray2[this.anInt166 - 2] - 128 & 0xFF);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("96130, " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "k", descriptor = "(I)I")
	public int method122() {
		try {
			this.anInt166 += 2;
			@Pc(27) int local27 = ((this.aByteArray2[this.anInt166 - 1] & 0xFF) << 8) + (this.aByteArray2[this.anInt166 - 2] & 0xFF);
			if (local27 > 32767) {
				local27 -= 65536;
			}
			return local27;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("29039, " + 5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "l", descriptor = "(I)I")
	public int method123() {
		try {
			this.anInt166 += 2;
			@Pc(29) int local29 = ((this.aByteArray2[this.anInt166 - 2] & 0xFF) << 8) + (this.aByteArray2[this.anInt166 - 1] - 128 & 0xFF);
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("60700, " + 15662 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "m", descriptor = "(I)I")
	public int method124() {
		try {
			this.anInt166 += 2;
			@Pc(29) int local29 = ((this.aByteArray2[this.anInt166 - 1] & 0xFF) << 8) + (this.aByteArray2[this.anInt166 - 2] - 128 & 0xFF);
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("28351, " + -823 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "n", descriptor = "(I)I")
	public int method125() {
		try {
			this.anInt166 += 3;
			return ((this.aByteArray2[this.anInt166 - 3] & 0xFF) << 16) + ((this.aByteArray2[this.anInt166 - 1] & 0xFF) << 8) + (this.aByteArray2[this.anInt166 - 2] & 0xFF);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("2158, " + 8 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "h", descriptor = "(II)V")
	public void method126(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 16);
			this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 24);
			this.aByteArray2[this.anInt166++] = (byte) arg0;
			this.aByteArray2[this.anInt166++] = (byte) (arg0 >> 8);
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("79878, " + arg0 + ", " + 0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "g", descriptor = "(B)I")
	public int method127() {
		try {
			this.anInt166 += 4;
			return ((this.aByteArray2[this.anInt166 - 1] & 0xFF) << 24) + ((this.aByteArray2[this.anInt166 - 2] & 0xFF) << 16) + ((this.aByteArray2[this.anInt166 - 3] & 0xFF) << 8) + (this.aByteArray2[this.anInt166 - 4] & 0xFF);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("58469, " + 0 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "o", descriptor = "(I)I")
	public int method128() {
		try {
			this.anInt166 += 4;
			return ((this.aByteArray2[this.anInt166 - 2] & 0xFF) << 24) + ((this.aByteArray2[this.anInt166 - 1] & 0xFF) << 16) + ((this.aByteArray2[this.anInt166 - 4] & 0xFF) << 8) + (this.aByteArray2[this.anInt166 - 3] & 0xFF);
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("27909, " + 566 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "p", descriptor = "(I)I")
	public int method129() {
		try {
			this.anInt166 += 4;
			return ((this.aByteArray2[this.anInt166 - 3] & 0xFF) << 24) + ((this.aByteArray2[this.anInt166 - 4] & 0xFF) << 16) + ((this.aByteArray2[this.anInt166 - 1] & 0xFF) << 8) + (this.aByteArray2[this.anInt166 - 2] & 0xFF);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("50718, " + 360 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "b", descriptor = "(I[BII)V")
	public void method130(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			for (@Pc(9) int local9 = arg0 + 0 - 1; local9 >= 0; local9--) {
				this.aByteArray2[this.anInt166++] = arg1[local9];
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("86191, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNRIFKTO", name = "a", descriptor = "(II[BI)V")
	public void method131(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg0 + 0; local4++) {
				arg1[local4] = (byte) (this.aByteArray2[this.anInt166++] - 128);
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("99086, " + arg0 + ", " + 0 + ", " + arg1 + ", " + 41 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}
}

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	private static int anInt770;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
	private static int anInt771;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
	private static int anInt772;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "[I")
	private static int[] anIntArray225 = new int[256];

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "[I")
	private static final int[] anIntArray226;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "Lclient!pb;")
	private static Class31 aClass31_4;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "Lclient!pb;")
	private static Class31 aClass31_5;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "Lclient!pb;")
	private static Class31 aClass31_6;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
	public int anInt768;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
	public int anInt769;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "Lclient!xb;")
	public Class47 aClass47_2;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "B")
	private byte aByte37 = -126;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "Z")
	private boolean aBoolean183 = true;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "Z")
	private boolean aBoolean184 = false;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "Z")
	private boolean aBoolean185 = true;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	private int anInt765 = 15991;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
	private int anInt766 = 37435;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
	private int anInt767 = 1;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "[C")
	private char[] aCharArray3 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

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
			anIntArray225[local4] = local7;
		}
		anIntArray226 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass31_4 = new Class31(-767);
		aClass31_5 = new Class31(-767);
		aClass31_6 = new Class31(-767);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)Lclient!mb;")
	public static Class1_Sub1_Sub3 method485() {
		try {
			@Pc(3) Class31 local3 = aClass31_5;
			synchronized (aClass31_5) {
				@Pc(7) Class1_Sub1_Sub3 local7 = null;
				if (anInt771 > 0) {
					anInt771--;
					local7 = (Class1_Sub1_Sub3) aClass31_5.method522();
				}
				if (local7 != null) {
					local7.anInt768 = 0;
					return local7;
				}
			}
			@Pc(75) Class1_Sub1_Sub3 local75 = new Class1_Sub1_Sub3(true);
			local75.anInt768 = 0;
			local75.aByteArray9 = new byte[5000];
			return local75;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("3075, " + 1 + ", " + false + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Z)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([BI)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray9 = arg0;
			@Pc(294) int local294 = 17 / arg1;
			this.anInt768 = 0;
		} catch (@Pc(307) RuntimeException local307) {
			signlink.reporterror("89211, " + arg0 + ", " + arg1 + ", " + local307.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public void method486() {
		try {
			@Pc(1) Class31 local1 = aClass31_5;
			synchronized (aClass31_5) {
				this.anInt768 = 0;
				if (this.aByteArray9.length == 100 && anInt770 < 1000) {
					aClass31_4.method520(this);
					anInt770++;
				} else if (this.aByteArray9.length == 5000 && anInt771 < 250) {
					aClass31_5.method520(this);
					anInt771++;
				} else if (this.aByteArray9.length == 30000 && anInt772 < 50) {
					aClass31_6.method520(this);
					anInt772++;
				}
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("12371, " + -12 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V")
	public void method487(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt768++] = (byte) (arg0 + this.aClass47_2.method674());
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("97632, " + 0 + ", " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public void method488(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt768++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public void method489(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt768++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt768++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(BI)V")
	public void method490(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray9[this.anInt768++] = (byte) arg1;
			this.aByteArray9[this.anInt768++] = 0;
			@Pc(30) boolean local30 = false;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("80499, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public void method491(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt768++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt768++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt768++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	public void method492(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt768++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt768++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt768++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt768++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	public void method493(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt768++] = (byte) arg0;
			this.aByteArray9[this.anInt768++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt768++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt768++] = (byte) (arg0 >> 24);
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("69446, " + arg0 + ", " + -703 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(JI)V")
	public void method494(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray9[this.anInt768++] = (byte) (arg0 >> 56);
			this.aByteArray9[this.anInt768++] = (byte) (arg0 >> 48);
			this.aByteArray9[this.anInt768++] = (byte) (arg0 >> 40);
			this.aByteArray9[this.anInt768++] = (byte) (arg0 >> 32);
			this.aByteArray9[this.anInt768++] = (byte) (arg0 >> 24);
			if (arg1 == 0) {
				this.aByteArray9[this.anInt768++] = (byte) (arg0 >> 16);
				this.aByteArray9[this.anInt768++] = (byte) (arg0 >> 8);
				this.aByteArray9[this.anInt768++] = (byte) arg0;
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("87753, " + arg0 + ", " + arg1 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method495(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt768);
		this.anInt768 += arg0.length();
		this.aByteArray9[this.anInt768++] = 10;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI[BI)V")
	public void method496(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg0 + 0; local4++) {
				this.aByteArray9[this.anInt768++] = arg1[local4];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("80615, " + true + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V")
	public void method497(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt768 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("82840, " + arg0 + ", " + -18284 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "()I")
	public int method498() {
		return this.aByteArray9[this.anInt768++] & 0xFF;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "()B")
	public byte method499() {
		return this.aByteArray9[this.anInt768++];
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "()I")
	public int method500() {
		this.anInt768 += 2;
		return ((this.aByteArray9[this.anInt768 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt768 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "()I")
	public int method501() {
		this.anInt768 += 2;
		@Pc(27) int local27 = ((this.aByteArray9[this.anInt768 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt768 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "()I")
	public int method502() {
		this.anInt768 += 3;
		return ((this.aByteArray9[this.anInt768 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt768 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt768 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "()I")
	public int method503() {
		this.anInt768 += 4;
		return ((this.aByteArray9[this.anInt768 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt768 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt768 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt768 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)J")
	public long method504() {
		try {
			@Pc(16) long local16 = (long) this.method503() & 0xFFFFFFFFL;
			@Pc(22) long local22 = (long) this.method503() & 0xFFFFFFFFL;
			return (local16 << 32) + local22;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("15635, " + -25 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method505() {
		@Pc(2) int local2 = this.anInt768;
		while (this.aByteArray9[this.anInt768++] != 10) {
		}
		return new String(this.aByteArray9, local2, this.anInt768 - local2 - 1);
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)[B")
	public byte[] method506() {
		try {
			@Pc(2) int local2 = this.anInt768;
			while (this.aByteArray9[this.anInt768++] != 10) {
			}
			@Pc(23) byte[] local23 = new byte[this.anInt768 - local2 - 1];
			for (@Pc(32) int local32 = local2; local32 < this.anInt768 - 1; local32++) {
				local23[local32 - local2] = this.aByteArray9[local32];
			}
			return local23;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("74483, " + 3 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III[B)V")
	public void method507(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg0 + 0; local4++) {
				arg1[local4] = this.aByteArray9[this.anInt768++];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("26428, " + 0 + ", " + arg0 + ", " + 0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
	public void method508() {
		try {
			this.anInt769 = this.anInt768 * 8;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("56828, " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)I")
	public int method509(@OriginalArg(0) int arg0) {
		try {
			@Pc(11) int local11 = this.anInt769 >> 3;
			@Pc(18) int local18 = 8 - (this.anInt769 & 0x7);
			@Pc(20) int local20 = 0;
			this.anInt769 += arg0;
			while (arg0 > local18) {
				local20 += (this.aByteArray9[local11++] & anIntArray226[local18]) << arg0 - local18;
				arg0 -= local18;
				local18 = 8;
			}
			if (arg0 == local18) {
				local20 += this.aByteArray9[local11] & anIntArray226[local18];
			} else {
				local20 += this.aByteArray9[local11] >> local18 - arg0 & anIntArray226[arg0];
			}
			return local20;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("92386, " + arg0 + ", " + 0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
	public void method510() {
		try {
			this.anInt768 = (this.anInt769 + 7) / 8;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("31121, " + 30037 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "()I")
	public int method511() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt768] & 0xFF;
		return local7 < 128 ? this.method498() - 64 : this.method500() - 49152;
	}

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "()I")
	public int method512() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt768] & 0xFF;
		return local7 < 128 ? this.method498() : this.method500() - 32768;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method513(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt768;
			this.anInt768 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method507(local2, local8);
			@Pc(23) BigInteger local23 = new BigInteger(local8);
			@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
			@Pc(31) byte[] local31 = local28.toByteArray();
			this.anInt768 = 0;
			this.method488(local31.length);
			this.method496(local31.length, local31);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("44986, " + arg0 + ", " + -40736 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}

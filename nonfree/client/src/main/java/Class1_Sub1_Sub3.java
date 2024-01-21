import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
	private static int anInt773;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
	private static int anInt774;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
	private static int anInt775;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	private static int anInt766 = 7;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "[I")
	private static int[] anIntArray213 = new int[256];

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "[I")
	private static final int[] anIntArray214;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "Lclient!pb;")
	private static Class31 aClass31_4;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "Lclient!pb;")
	private static Class31 aClass31_5;

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "Lclient!pb;")
	private static Class31 aClass31_6;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
	private int anInt770;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
	public int anInt771;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	public int anInt772;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "Lclient!xb;")
	public Class44 aClass44_2;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	private int anInt767 = -203;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "B")
	private byte aByte21 = 9;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	private int anInt768 = -139;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "Z")
	private boolean aBoolean157 = false;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "Z")
	private boolean aBoolean158 = false;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
	private int anInt769 = 8;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "Z")
	private boolean aBoolean160 = false;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Z")
	private boolean aBoolean161 = true;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "Z")
	private boolean aBoolean162 = false;

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
			anIntArray213[local6] = local9;
		}
		anIntArray214 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass31_4 = new Class31(-740);
		aClass31_5 = new Class31(-740);
		aClass31_6 = new Class31(-740);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)Lclient!mb;")
	public static Class1_Sub1_Sub3 method454() {
		try {
			@Pc(3) Class31 local3 = aClass31_5;
			synchronized (aClass31_5) {
				@Pc(7) Class1_Sub1_Sub3 local7 = null;
				if (anInt774 > 0) {
					anInt774--;
					local7 = (Class1_Sub1_Sub3) aClass31_5.method496();
				}
				if (local7 != null) {
					local7.anInt771 = 0;
					return local7;
				}
			}
			@Pc(69) Class1_Sub1_Sub3 local69 = new Class1_Sub1_Sub3(anInt766);
			local69.anInt771 = 0;
			local69.aByteArray9 = new byte[5000];
			return local69;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("95271, " + false + ", " + 1 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 7 || arg0 > 7) {
				throw new NullPointerException();
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("26681, " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray9 = arg1;
			this.anInt771 = 0;
			@Pc(41) int local41 = 87 / arg0;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("1135, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public void method455() {
		try {
			@Pc(1) Class31 local1 = aClass31_5;
			synchronized (aClass31_5) {
				this.anInt771 = 0;
				if (this.aByteArray9.length == 100 && anInt773 < 1000) {
					aClass31_4.method494(this);
					anInt773++;
				} else if (this.aByteArray9.length == 5000 && anInt774 < 250) {
					aClass31_5.method494(this);
					anInt774++;
				} else if (this.aByteArray9.length == 30000 && anInt775 < 50) {
					aClass31_6.method494(this);
					anInt775++;
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("37994, " + 0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	public void method456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			while (arg0 >= 0) {
				this.anInt767 = 474;
			}
			this.aByteArray9[this.anInt771++] = (byte) (arg1 + this.aClass44_2.method635());
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("62769, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public void method457(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt771++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public void method458(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt771++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt771++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V")
	public void method459(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) boolean local4 = false;
			this.aByteArray9[this.anInt771++] = (byte) arg1;
			this.aByteArray9[this.anInt771++] = 0;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("40208, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	public void method460(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt771++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt771++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt771++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
	public void method461(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt771++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt771++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt771++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt771++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V")
	public void method462(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt771++] = (byte) arg0;
			this.aByteArray9[this.anInt771++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt771++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt771++] = (byte) (arg0 >> 24);
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("86882, " + arg0 + ", " + 6 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(JZ)V")
	public void method463(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray9[this.anInt771++] = (byte) (arg0 >> 56);
			this.aByteArray9[this.anInt771++] = (byte) (arg0 >> 48);
			this.aByteArray9[this.anInt771++] = (byte) (arg0 >> 40);
			this.aByteArray9[this.anInt771++] = (byte) (arg0 >> 32);
			this.aByteArray9[this.anInt771++] = (byte) (arg0 >> 24);
			this.aByteArray9[this.anInt771++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt771++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt771++] = (byte) arg0;
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("66999, " + arg0 + ", " + true + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method464(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt771);
		this.anInt771 += arg0.length();
		this.aByteArray9[this.anInt771++] = 10;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([BIIZ)V")
	public void method465(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg1 + 0; local4++) {
				this.aByteArray9[this.anInt771++] = arg0[local4];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("3276, " + arg0 + ", " + arg1 + ", " + 0 + ", " + false + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)V")
	public void method466(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt771 - arg0 - 1] = (byte) arg0;
			if (this.aByte21 == 9) {
				;
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("82223, " + arg0 + ", " + 9 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "()I")
	public int method467() {
		return this.aByteArray9[this.anInt771++] & 0xFF;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "()B")
	public byte method468() {
		return this.aByteArray9[this.anInt771++];
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "()I")
	public int method469() {
		this.anInt771 += 2;
		return ((this.aByteArray9[this.anInt771 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt771 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "()I")
	public int method470() {
		this.anInt771 += 2;
		@Pc(27) int local27 = ((this.aByteArray9[this.anInt771 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt771 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "()I")
	public int method471() {
		this.anInt771 += 3;
		return ((this.aByteArray9[this.anInt771 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt771 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt771 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "()I")
	public int method472() {
		this.anInt771 += 4;
		return ((this.aByteArray9[this.anInt771 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt771 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt771 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt771 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)J")
	public long method473() {
		try {
			@Pc(5) long local5 = (long) this.method472() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method472() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("33557, " + -960 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method474() {
		@Pc(2) int local2 = this.anInt771;
		while (this.aByteArray9[this.anInt771++] != 10) {
		}
		return new String(this.aByteArray9, local2, this.anInt771 - local2 - 1);
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)[B")
	public byte[] method475() {
		try {
			@Pc(4) int local4 = this.anInt771;
			while (this.aByteArray9[this.anInt771++] != 10) {
			}
			@Pc(34) byte[] local34 = new byte[this.anInt771 - local4 - 1];
			for (@Pc(36) int local36 = local4; local36 < this.anInt771 - 1; local36++) {
				local34[local36 - local4] = this.aByteArray9[local36];
			}
			return local34;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("59210, " + -139 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II[BI)V")
	public void method476(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(10) int local10 = 0; local10 < arg0 + 0; local10++) {
				arg1[local10] = this.aByteArray9[this.anInt771++];
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("21070, " + arg0 + ", " + 0 + ", " + arg1 + ", " + -162 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)V")
	public void method477() {
		try {
			this.anInt772 = this.anInt771 * 8;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("54387, " + -156 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)I")
	public int method478(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt772 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt772 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt772 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray9[local6++] & anIntArray214[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray9[local6] & anIntArray214[local13];
			} else {
				local15 += this.aByteArray9[local6] >> local13 - arg0 & anIntArray214[arg0];
			}
			return local15;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("41961, " + arg0 + ", " + false + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)V")
	public void method479(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 82 / arg0;
			this.anInt771 = (this.anInt772 + 7) / 8;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("41143, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "()I")
	public int method480() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt771] & 0xFF;
		return local7 < 128 ? this.method467() - 64 : this.method469() - 49152;
	}

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "()I")
	public int method481() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt771] & 0xFF;
		return local7 < 128 ? this.method467() : this.method469() - 32768;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
	public void method482(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt771;
			this.anInt771 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method476(local2, local8);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg0, arg1);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt771 = 0;
			this.method457(local27.length);
			this.method465(local27, local27.length);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("84498, " + arg0 + ", " + arg1 + ", " + false + ", " + local53.toString());
			throw new RuntimeException();
		}
	}
}

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "Z")
	private static boolean aBoolean162;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
	private static int anInt779;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
	private static int anInt780;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
	private static int anInt781;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "[I")
	private static int[] anIntArray213 = new int[256];

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "[I")
	private static final int[] anIntArray214;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "Lclient!pb;")
	private static Class31 aClass31_4;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "Lclient!pb;")
	private static Class31 aClass31_5;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "Lclient!pb;")
	private static Class31 aClass31_6;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	private int anInt776;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
	public int anInt777;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
	public int anInt778;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Lclient!xb;")
	public Class44 aClass44_2;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "Z")
	private boolean aBoolean163 = true;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
	private int anInt775 = -179;

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
			anIntArray213[local4] = local7;
		}
		anIntArray214 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass31_4 = new Class31((byte) 115);
		aClass31_5 = new Class31((byte) 115);
		aClass31_6 = new Class31((byte) 115);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Lclient!mb;")
	public static Class1_Sub1_Sub3 method455() {
		try {
			@Pc(3) Class31 local3 = aClass31_5;
			synchronized (aClass31_5) {
				@Pc(7) Class1_Sub1_Sub3 local7 = null;
				if (anInt780 > 0) {
					anInt780--;
					local7 = (Class1_Sub1_Sub3) aClass31_5.method497();
				}
				if (local7 != null) {
					local7.anInt777 = 0;
					return local7;
				}
			}
			@Pc(78) Class1_Sub1_Sub3 local78 = new Class1_Sub1_Sub3(false);
			local78.anInt777 = 0;
			local78.aByteArray9 = new byte[5000];
			return local78;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("39223, " + 527 + ", " + 1 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Z)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([BZ)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aByteArray9 = arg0;
			this.anInt777 = 0;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("38784, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public void method456() {
		try {
			@Pc(7) Class31 local7 = aClass31_5;
			synchronized (aClass31_5) {
				this.anInt777 = 0;
				if (this.aByteArray9.length == 100 && anInt779 < 1000) {
					aClass31_4.method495(this);
					anInt779++;
				} else if (this.aByteArray9.length == 5000 && anInt780 < 250) {
					aClass31_5.method495(this);
					anInt780++;
				} else if (this.aByteArray9.length == 30000 && anInt781 < 50) {
					aClass31_6.method495(this);
					anInt781++;
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("11534, " + -42845 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V")
	public void method457(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt777++] = (byte) (arg0 + this.aClass44_2.method640());
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("34208, " + 78 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public void method458(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt777++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public void method459(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt777++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V")
	public void method460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray9[this.anInt777++] = (byte) arg0;
			if (arg1 != 20776) {
				this.anInt776 = 422;
			}
			this.aByteArray9[this.anInt777++] = 0;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("90731, " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	public void method461(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt777++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
	public void method462(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt777++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V")
	public void method463(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt777++] = (byte) arg0;
			this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 24);
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("32783, " + false + ", " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(JZ)V")
	public void method464(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 56);
			this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 48);
			this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 40);
			this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 32);
			this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 24);
			this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt777++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt777++] = (byte) arg0;
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("3164, " + arg0 + ", " + false + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method465(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt777);
		this.anInt777 += arg0.length();
		this.aByteArray9[this.anInt777++] = 10;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[BBI)V")
	public void method466(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < arg1 + 0; local5++) {
				this.aByteArray9[this.anInt777++] = arg0[local5];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("76036, " + 0 + ", " + arg0 + ", " + -66 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)V")
	public void method467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray9[this.anInt777 - arg0 - 1] = (byte) arg0;
			@Pc(14) boolean local14 = false;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("88382, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "()I")
	public int method468() {
		return this.aByteArray9[this.anInt777++] & 0xFF;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "()B")
	public byte method469() {
		return this.aByteArray9[this.anInt777++];
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "()I")
	public int method470() {
		this.anInt777 += 2;
		return ((this.aByteArray9[this.anInt777 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt777 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "()I")
	public int method471() {
		this.anInt777 += 2;
		@Pc(27) int local27 = ((this.aByteArray9[this.anInt777 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt777 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "()I")
	public int method472() {
		this.anInt777 += 3;
		return ((this.aByteArray9[this.anInt777 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt777 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt777 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "()I")
	public int method473() {
		this.anInt777 += 4;
		return ((this.aByteArray9[this.anInt777 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt777 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt777 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt777 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)J")
	public long method474(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) long local5 = (long) this.method473() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method473() & 0xFFFFFFFFL;
			@Pc(15) boolean local15 = false;
			return (local5 << 32) + local11;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("10856, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method475() {
		@Pc(2) int local2 = this.anInt777;
		while (this.aByteArray9[this.anInt777++] != 10) {
		}
		return new String(this.aByteArray9, local2, this.anInt777 - local2 - 1);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)[B")
	public byte[] method476() {
		try {
			@Pc(2) int local2 = this.anInt777;
			while (this.aByteArray9[this.anInt777++] != 10) {
			}
			@Pc(33) byte[] local33 = new byte[this.anInt777 - local2 - 1];
			for (@Pc(35) int local35 = local2; local35 < this.anInt777 - 1; local35++) {
				local33[local35 - local2] = this.aByteArray9[local35];
			}
			return local33;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("1692, " + true + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[BIZ)V")
	public void method477(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(9) int local9 = 0; local9 < arg1 + 0; local9++) {
				arg0[local9] = this.aByteArray9[this.anInt777++];
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("54683, " + 0 + ", " + arg0 + ", " + arg1 + ", " + true + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
	public void method478() {
		try {
			this.anInt778 = this.anInt777 * 8;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("14677, " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)I")
	public int method479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) int local6 = this.anInt778 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt778 & 0x7);
			@Pc(15) int local15 = 0;
			if (arg0 < 6 || arg0 > 6) {
				this.anInt775 = 52;
			}
			this.anInt778 += arg1;
			while (arg1 > local13) {
				local15 += (this.aByteArray9[local6++] & anIntArray214[local13]) << arg1 - local13;
				arg1 -= local13;
				local13 = 8;
			}
			if (arg1 == local13) {
				local15 += this.aByteArray9[local6] & anIntArray214[local13];
			} else {
				local15 += this.aByteArray9[local6] >> local13 - arg1 & anIntArray214[arg1];
			}
			return local15;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("11252, " + arg0 + ", " + arg1 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public void method480() {
		try {
			this.anInt777 = (this.anInt778 + 7) / 8;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("33306, " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "()I")
	public int method481() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt777] & 0xFF;
		return local7 < 128 ? this.method468() - 64 : this.method470() - 49152;
	}

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "()I")
	public int method482() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt777] & 0xFF;
		return local7 < 128 ? this.method468() : this.method470() - 32768;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method483(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt777;
			this.anInt777 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method477(local8, local2);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(27) BigInteger local27 = local19.modPow(arg1, arg0);
			@Pc(30) byte[] local30 = local27.toByteArray();
			this.anInt777 = 0;
			this.method458(local30.length);
			this.method466(local30, local30.length);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("52637, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}
}

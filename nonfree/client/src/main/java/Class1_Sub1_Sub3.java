import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
	private static int anInt759;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
	private static int anInt760;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
	private static int anInt761;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	private static int anInt756 = 888;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "[I")
	private static int[] anIntArray219 = new int[256];

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "[I")
	private static final int[] anIntArray220;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "Lclient!ob;")
	private static Class29 aClass29_4;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "Lclient!ob;")
	private static Class29 aClass29_5;

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "Lclient!ob;")
	private static Class29 aClass29_6;

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
	public int anInt757;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
	public int anInt758;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "Lclient!wb;")
	public Class46 aClass46_2;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "B")
	private byte aByte47 = 25;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "Z")
	private boolean aBoolean181 = true;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	private int anInt752 = -325;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	private int anInt753 = -31740;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
	private int anInt754 = 362;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
	private int anInt755 = 49266;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "Z")
	private boolean aBoolean183 = false;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Z")
	private boolean aBoolean184 = false;

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
			anIntArray219[local6] = local9;
		}
		anIntArray220 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass29_4 = new Class29(anInt756);
		aClass29_5 = new Class29(anInt756);
		aClass29_6 = new Class29(anInt756);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Lclient!lb;")
	public static Class1_Sub1_Sub3 method468() {
		try {
			@Pc(3) Class29 local3 = aClass29_5;
			synchronized (aClass29_5) {
				@Pc(7) Class1_Sub1_Sub3 local7 = null;
				if (anInt760 > 0) {
					anInt760--;
					local7 = (Class1_Sub1_Sub3) aClass29_5.method510();
				}
				if (local7 != null) {
					local7.anInt757 = 0;
					return local7;
				}
			}
			@Pc(75) Class1_Sub1_Sub3 local75 = new Class1_Sub1_Sub3(-440);
			local75.anInt757 = 0;
			local75.aByteArray9 = new byte[5000];
			return local75;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("10184, " + 0 + ", " + 1 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Z[B)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray9 = arg1;
			this.anInt757 = 0;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("69844, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)V")
	public void method469(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt757++] = (byte) (arg0 + this.aClass46_2.method662());
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("72952, " + arg0 + ", " + 19 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public void method470(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt757++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public void method471(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt757++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt757++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)V")
	public void method472(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt757++] = (byte) arg0;
			this.aByteArray9[this.anInt757++] = 0;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("48771, " + arg0 + ", " + true + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	public void method473(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt757++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt757++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt757++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	public void method474(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt757++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt757++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt757++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt757++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
	public void method475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray9[this.anInt757++] = (byte) arg1;
			this.aByteArray9[this.anInt757++] = (byte) (arg1 >> 8);
			this.aByteArray9[this.anInt757++] = (byte) (arg1 >> 16);
			if (arg0 < 0) {
				this.aByteArray9[this.anInt757++] = (byte) (arg1 >> 24);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("46041, " + arg0 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(JI)V")
	public void method476(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray9[this.anInt757++] = (byte) (arg0 >> 56);
			this.aByteArray9[this.anInt757++] = (byte) (arg0 >> 48);
			this.aByteArray9[this.anInt757++] = (byte) (arg0 >> 40);
			this.aByteArray9[this.anInt757++] = (byte) (arg0 >> 32);
			this.aByteArray9[this.anInt757++] = (byte) (arg0 >> 24);
			this.aByteArray9[this.anInt757++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt757++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt757++] = (byte) arg0;
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("44522, " + arg0 + ", " + -40349 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method477(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt757);
		this.anInt757 += arg0.length();
		this.aByteArray9[this.anInt757++] = 10;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[BBI)V")
	public void method478(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(16) int local16 = 0; local16 < arg1 + 0; local16++) {
				this.aByteArray9[this.anInt757++] = arg0[local16];
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("77982, " + 0 + ", " + arg0 + ", " + 0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(IB)V")
	public void method479(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt757 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("13917, " + arg0 + ", " + 22 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "()I")
	public int method480() {
		return this.aByteArray9[this.anInt757++] & 0xFF;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "()B")
	public byte method481() {
		return this.aByteArray9[this.anInt757++];
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "()I")
	public int method482() {
		this.anInt757 += 2;
		return ((this.aByteArray9[this.anInt757 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt757 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "()I")
	public int method483() {
		this.anInt757 += 2;
		@Pc(27) int local27 = ((this.aByteArray9[this.anInt757 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt757 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "()I")
	public int method484() {
		this.anInt757 += 3;
		return ((this.aByteArray9[this.anInt757 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt757 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt757 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "()I")
	public int method485() {
		this.anInt757 += 4;
		return ((this.aByteArray9[this.anInt757 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt757 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt757 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt757 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)J")
	public long method486(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(16) long local16 = (long) this.method485() & 0xFFFFFFFFL;
			@Pc(22) long local22 = (long) this.method485() & 0xFFFFFFFFL;
			return (local16 << 32) + local22;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("77827, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method487() {
		@Pc(2) int local2 = this.anInt757;
		while (this.aByteArray9[this.anInt757++] != 10) {
		}
		return new String(this.aByteArray9, local2, this.anInt757 - local2 - 1);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)[B")
	public byte[] method488() {
		try {
			@Pc(2) int local2 = this.anInt757;
			while (this.aByteArray9[this.anInt757++] != 10) {
			}
			@Pc(23) byte[] local23 = new byte[this.anInt757 - local2 - 1];
			for (@Pc(31) int local31 = local2; local31 < this.anInt757 - 1; local31++) {
				local23[local31 - local2] = this.aByteArray9[local31];
			}
			return local23;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("32626, " + false + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III[B)V")
	public void method489(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg0 + 0; local4++) {
				arg1[local4] = this.aByteArray9[this.anInt757++];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("8872, " + arg0 + ", " + 0 + ", " + 0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V")
	public void method490() {
		try {
			this.anInt758 = this.anInt757 * 8;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("14430, " + -35838 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)I")
	public int method491(@OriginalArg(0) int arg0) {
		try {
			@Pc(10) int local10 = this.anInt758 >> 3;
			@Pc(17) int local17 = 8 - (this.anInt758 & 0x7);
			@Pc(19) int local19 = 0;
			this.anInt758 += arg0;
			while (arg0 > local17) {
				local19 += (this.aByteArray9[local10++] & anIntArray220[local17]) << arg0 - local17;
				arg0 -= local17;
				local17 = 8;
			}
			if (arg0 == local17) {
				local19 += this.aByteArray9[local10] & anIntArray220[local17];
			} else {
				local19 += this.aByteArray9[local10] >> local17 - arg0 & anIntArray220[arg0];
			}
			return local19;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("92107, " + arg0 + ", " + 0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)V")
	public void method492() {
		try {
			this.anInt757 = (this.anInt758 + 7) / 8;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("16669, " + 708 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "()I")
	public int method493() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt757] & 0xFF;
		return local7 < 128 ? this.method480() - 64 : this.method482() - 49152;
	}

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "()I")
	public int method494() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt757] & 0xFF;
		return local7 < 128 ? this.method480() : this.method482() - 32768;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method495(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt757;
			this.anInt757 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method489(local2, local8);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(34) BigInteger local34 = local19.modPow(arg0, arg1);
			@Pc(37) byte[] local37 = local34.toByteArray();
			this.anInt757 = 0;
			this.method470(local37.length);
			this.method478(local37, local37.length);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("13771, " + 8 + ", " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}
}

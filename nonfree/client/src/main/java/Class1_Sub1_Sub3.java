import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
	private static int anInt765;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
	private static int anInt766;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
	private static int anInt767;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	private static int anInt760 = -31767;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "[I")
	private static int[] anIntArray219 = new int[256];

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "[I")
	private static final int[] anIntArray220;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "Lclient!ob;")
	private static Class29 aClass29_4;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "Lclient!ob;")
	private static Class29 aClass29_5;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "Lclient!ob;")
	private static Class29 aClass29_6;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	private int anInt761;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
	public int anInt763;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
	public int anInt764;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "Lclient!wb;")
	public Class46 aClass46_2;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "B")
	private byte aByte33 = 9;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Z")
	private boolean aBoolean194 = true;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Z")
	private boolean aBoolean195 = true;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "Z")
	private boolean aBoolean196 = true;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	private int anInt762 = 6;

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
		aClass29_4 = new Class29(464);
		aClass29_5 = new Class29(464);
		aClass29_6 = new Class29(464);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)Lclient!lb;")
	public static Class1_Sub1_Sub3 method468() {
		try {
			@Pc(3) Class29 local3 = aClass29_5;
			synchronized (aClass29_5) {
				@Pc(7) Class1_Sub1_Sub3 local7 = null;
				if (anInt766 > 0) {
					anInt766--;
					local7 = (Class1_Sub1_Sub3) aClass29_5.method510();
				}
				if (local7 != null) {
					local7.anInt763 = 0;
					return local7;
				}
			}
			@Pc(69) Class1_Sub1_Sub3 local69 = new Class1_Sub1_Sub3(anInt760);
			local69.anInt763 = 0;
			local69.aByteArray9 = new byte[5000];
			return local69;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("70857, " + 1 + ", " + 38 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != -31767) {
				this.anInt762 = 425;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("98546, " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray9 = arg1;
			this.anInt763 = 0;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("45514, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
	public void method469(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt763++] = (byte) (arg0 + this.aClass46_2.method662());
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("78711, " + arg0 + ", " + 0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public void method470(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt763++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public void method471(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt763++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt763++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)V")
	public void method472(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt763++] = (byte) arg0;
			this.aByteArray9[this.anInt763++] = 0;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("15105, " + 37 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	public void method473(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt763++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt763++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt763++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	public void method474(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt763++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt763++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt763++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt763++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
	public void method475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray9[this.anInt763++] = (byte) arg0;
			this.aByteArray9[this.anInt763++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt763++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt763++] = (byte) (arg0 >> 24);
			if (arg1 < 2 || arg1 > 2) {
				;
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("13344, " + arg0 + ", " + arg1 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(JI)V")
	public void method476(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray9[this.anInt763++] = (byte) (arg0 >> 56);
			this.aByteArray9[this.anInt763++] = (byte) (arg0 >> 48);
			this.aByteArray9[this.anInt763++] = (byte) (arg0 >> 40);
			this.aByteArray9[this.anInt763++] = (byte) (arg0 >> 32);
			@Pc(65) boolean local65 = false;
			this.aByteArray9[this.anInt763++] = (byte) (arg0 >> 24);
			this.aByteArray9[this.anInt763++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt763++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt763++] = (byte) arg0;
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("51485, " + arg0 + ", " + arg1 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method477(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt763);
		this.anInt763 += arg0.length();
		this.aByteArray9[this.anInt763++] = 10;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[BI)V")
	public void method478(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < arg1 + 0; local5++) {
				this.aByteArray9[this.anInt763++] = arg0[local5];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("40208, " + 0 + ", " + 1 + ", " + arg0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)V")
	public void method479(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt763 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("23995, " + arg0 + ", " + -486 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "()I")
	public int method480() {
		return this.aByteArray9[this.anInt763++] & 0xFF;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "()B")
	public byte method481() {
		return this.aByteArray9[this.anInt763++];
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "()I")
	public int method482() {
		this.anInt763 += 2;
		return ((this.aByteArray9[this.anInt763 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt763 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "()I")
	public int method483() {
		this.anInt763 += 2;
		@Pc(27) int local27 = ((this.aByteArray9[this.anInt763 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt763 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "()I")
	public int method484() {
		this.anInt763 += 3;
		return ((this.aByteArray9[this.anInt763 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt763 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt763 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "()I")
	public int method485() {
		this.anInt763 += 4;
		return ((this.aByteArray9[this.anInt763 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt763 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt763 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt763 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)J")
	public long method486() {
		try {
			@Pc(11) long local11 = (long) this.method485() & 0xFFFFFFFFL;
			@Pc(17) long local17 = (long) this.method485() & 0xFFFFFFFFL;
			return (local11 << 32) + local17;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("93761, " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method487() {
		@Pc(2) int local2 = this.anInt763;
		while (this.aByteArray9[this.anInt763++] != 10) {
		}
		return new String(this.aByteArray9, local2, this.anInt763 - local2 - 1);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)[B")
	public byte[] method488() {
		try {
			@Pc(2) int local2 = this.anInt763;
			while (this.aByteArray9[this.anInt763++] != 10) {
			}
			@Pc(23) byte[] local23 = new byte[this.anInt763 - local2 - 1];
			for (@Pc(35) int local35 = local2; local35 < this.anInt763 - 1; local35++) {
				local23[local35 - local2] = this.aByteArray9[local35];
			}
			return local23;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("3033, " + true + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[BII)V")
	public void method489(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg0 + 0; local5++) {
				arg1[local5] = this.aByteArray9[this.anInt763++];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("84289, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public void method490() {
		try {
			this.anInt764 = this.anInt763 * 8;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("78406, " + 7 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(IB)I")
	public int method491(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) int local6 = this.anInt764 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt764 & 0x7);
			@Pc(15) int local15 = 0;
			if (arg1 != this.aByte33) {
				this.aBoolean194 = !this.aBoolean194;
			}
			this.anInt764 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray9[local6++] & anIntArray220[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray9[local6] & anIntArray220[local13];
			} else {
				local15 += this.aByteArray9[local6] >> local13 - arg0 & anIntArray220[arg0];
			}
			return local15;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("42658, " + arg0 + ", " + arg1 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V")
	public void method492() {
		try {
			this.anInt763 = (this.anInt764 + 7) / 8;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("50518, " + -22602 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "()I")
	public int method493() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt763] & 0xFF;
		return local7 < 128 ? this.method480() - 64 : this.method482() - 49152;
	}

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "()I")
	public int method494() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt763] & 0xFF;
		return local7 < 128 ? this.method480() : this.method482() - 32768;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public void method495(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt763;
			this.anInt763 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method489(local2, local8, 36);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg1, arg0);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt763 = 0;
			this.method470(local27.length);
			this.method478(local27, local27.length);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("31009, " + arg0 + ", " + 7 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}

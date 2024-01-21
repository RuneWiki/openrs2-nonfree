import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
	private static int anInt744;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
	private static int anInt745;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
	private static int anInt746;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "[I")
	private static int[] anIntArray219 = new int[256];

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "[I")
	private static final int[] anIntArray220;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "Lclient!ob;")
	private static Class29 aClass29_4;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "Lclient!ob;")
	private static Class29 aClass29_5;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "Lclient!ob;")
	private static Class29 aClass29_6;

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
	public int anInt742;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
	public int anInt743;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "Lclient!wb;")
	public Class46 aClass46_2;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
	private int anInt736 = 26;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	private int anInt737 = 257;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	private int anInt738 = -5783;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	private int anInt739 = -398;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
	private int anInt740 = -473;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
	private int anInt741 = -720;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "Z")
	private boolean aBoolean185 = true;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Z")
	private boolean aBoolean186 = true;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "Z")
	private boolean aBoolean187 = false;

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
			anIntArray219[local4] = local7;
		}
		anIntArray220 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass29_4 = new Class29(0);
		aClass29_5 = new Class29(0);
		aClass29_6 = new Class29(0);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Lclient!lb;")
	public static Class1_Sub1_Sub3 method468() {
		try {
			@Pc(3) Class29 local3 = aClass29_5;
			synchronized (aClass29_5) {
				@Pc(7) Class1_Sub1_Sub3 local7 = null;
				if (anInt745 > 0) {
					anInt745--;
					local7 = (Class1_Sub1_Sub3) aClass29_5.method510();
				}
				if (local7 != null) {
					local7.anInt742 = 0;
					return local7;
				}
			}
			@Pc(76) Class1_Sub1_Sub3 local76 = new Class1_Sub1_Sub3(626);
			local76.anInt742 = 0;
			local76.aByteArray9 = new byte[5000];
			return local76;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("17968, " + 1 + ", " + -14406 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([BI)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray9 = arg0;
			this.anInt742 = 0;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("91695, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
	public void method469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray9[this.anInt742++] = (byte) (arg1 + this.aClass46_2.method662());
			if (arg0 >= 0) {
				;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("99301, " + arg0 + ", " + arg1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public void method470(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt742++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public void method471(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt742++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)V")
	public void method472(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt742++] = (byte) arg0;
			this.aByteArray9[this.anInt742++] = 0;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("76698, " + 2 + ", " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	public void method473(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt742++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	public void method474(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt742++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(II)V")
	public void method475(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt742++] = (byte) arg0;
			this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 24);
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("63284, " + arg0 + ", " + -2704 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(JI)V")
	public void method476(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 56);
			this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 48);
			this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 40);
			this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 32);
			this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 24);
			this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 8);
			if (arg1 > 0) {
				this.aByteArray9[this.anInt742++] = (byte) arg0;
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("47082, " + arg0 + ", " + arg1 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method477(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt742);
		this.anInt742 += arg0.length();
		this.aByteArray9[this.anInt742++] = 10;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[BZ)V")
	public void method478(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(6) int local6 = 0; local6 < arg0 + 0; local6++) {
				this.aByteArray9[this.anInt742++] = arg1[local6];
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("50055, " + arg0 + ", " + 0 + ", " + arg1 + ", " + true + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(II)V")
	public void method479(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt742 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("89199, " + -164 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "()I")
	public int method480() {
		return this.aByteArray9[this.anInt742++] & 0xFF;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "()B")
	public byte method481() {
		return this.aByteArray9[this.anInt742++];
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "()I")
	public int method482() {
		this.anInt742 += 2;
		return ((this.aByteArray9[this.anInt742 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt742 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "()I")
	public int method483() {
		this.anInt742 += 2;
		@Pc(27) int local27 = ((this.aByteArray9[this.anInt742 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt742 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "()I")
	public int method484() {
		this.anInt742 += 3;
		return ((this.aByteArray9[this.anInt742 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt742 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt742 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "()I")
	public int method485() {
		this.anInt742 += 4;
		return ((this.aByteArray9[this.anInt742 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt742 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt742 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt742 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)J")
	public long method486(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 4 || arg0 > 4) {
				throw new NullPointerException();
			}
			@Pc(15) long local15 = (long) this.method485() & 0xFFFFFFFFL;
			@Pc(21) long local21 = (long) this.method485() & 0xFFFFFFFFL;
			return (local15 << 32) + local21;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("70899, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method487() {
		@Pc(2) int local2 = this.anInt742;
		while (this.aByteArray9[this.anInt742++] != 10) {
		}
		return new String(this.aByteArray9, local2, this.anInt742 - local2 - 1);
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)[B")
	public byte[] method488() {
		try {
			@Pc(2) int local2 = this.anInt742;
			while (this.aByteArray9[this.anInt742++] != 10) {
			}
			@Pc(28) byte[] local28 = new byte[this.anInt742 - local2 - 1];
			for (@Pc(30) int local30 = local2; local30 < this.anInt742 - 1; local30++) {
				local28[local30 - local2] = this.aByteArray9[local30];
			}
			return local28;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("48329, " + 0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II[BZ)V")
	public void method489(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg0 + 0; local4++) {
				arg1[local4] = this.aByteArray9[this.anInt742++];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("8006, " + 0 + ", " + arg0 + ", " + arg1 + ", " + false + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	public void method490() {
		try {
			this.anInt743 = this.anInt742 * 8;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("25302, " + false + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "(II)I")
	public int method491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			while (arg0 >= 0) {
				this.aBoolean187 = !this.aBoolean187;
			}
			@Pc(18) int local18 = this.anInt743 >> 3;
			@Pc(25) int local25 = 8 - (this.anInt743 & 0x7);
			@Pc(27) int local27 = 0;
			this.anInt743 += arg1;
			while (arg1 > local25) {
				local27 += (this.aByteArray9[local18++] & anIntArray220[local25]) << arg1 - local25;
				arg1 -= local25;
				local25 = 8;
			}
			if (arg1 == local25) {
				local27 += this.aByteArray9[local18] & anIntArray220[local25];
			} else {
				local27 += this.aByteArray9[local18] >> local25 - arg1 & anIntArray220[arg1];
			}
			return local27;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("84440, " + arg0 + ", " + arg1 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)V")
	public void method492(@OriginalArg(0) int arg0) {
		try {
			this.anInt742 = (this.anInt743 + 7) / 8;
			if (arg0 < 7 || arg0 > 7) {
				this.anInt739 = 495;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("45748, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "()I")
	public int method493() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt742] & 0xFF;
		return local7 < 128 ? this.method480() - 64 : this.method482() - 49152;
	}

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "()I")
	public int method494() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt742] & 0xFF;
		return local7 < 128 ? this.method480() : this.method482() - 32768;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method495(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt742;
			this.anInt742 = 0;
			@Pc(20) byte[] local20 = new byte[local2];
			this.method489(local2, local20);
			@Pc(31) BigInteger local31 = new BigInteger(local20);
			@Pc(36) BigInteger local36 = local31.modPow(arg0, arg1);
			@Pc(39) byte[] local39 = local36.toByteArray();
			this.anInt742 = 0;
			this.method470(local39.length);
			this.method478(local39.length, local39);
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("30990, " + arg0 + ", " + -473 + ", " + arg1 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}
}

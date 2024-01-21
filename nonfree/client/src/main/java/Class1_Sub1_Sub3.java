import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
	private static int anInt740;

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
	private static int anInt741;

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
	private static int anInt742;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "[I")
	private static int[] anIntArray216 = new int[256];

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "[I")
	private static final int[] anIntArray217;

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "Lclient!ob;")
	private static Class29 aClass29_4;

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "Lclient!ob;")
	private static Class29 aClass29_5;

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "Lclient!ob;")
	private static Class29 aClass29_6;

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	private int anInt732;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
	public int anInt738;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
	public int anInt739;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "Lclient!wb;")
	public Class46 aClass46_2;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	private int anInt733 = 6;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	private int anInt734 = 986;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
	private int anInt735 = 2;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "B")
	private byte aByte20 = 17;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Z")
	private boolean aBoolean192 = true;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "B")
	private byte aByte21 = -57;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
	private int anInt736 = -241;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "Z")
	private boolean aBoolean193 = true;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
	private int anInt737 = -790;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "Z")
	private boolean aBoolean194 = false;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "Z")
	private boolean aBoolean195 = false;

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
			anIntArray216[local4] = local7;
		}
		anIntArray217 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass29_4 = new Class29(false);
		aClass29_5 = new Class29(false);
		aClass29_6 = new Class29(false);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Lclient!lb;")
	public static Class1_Sub1_Sub3 method462() {
		try {
			@Pc(3) Class29 local3 = aClass29_5;
			synchronized (aClass29_5) {
				@Pc(7) Class1_Sub1_Sub3 local7 = null;
				if (anInt741 > 0) {
					anInt741--;
					local7 = (Class1_Sub1_Sub3) aClass29_5.method504();
				}
				if (local7 != null) {
					local7.anInt738 = 0;
					return local7;
				}
			}
			@Pc(82) Class1_Sub1_Sub3 local82 = new Class1_Sub1_Sub3(-149);
			local82.anInt738 = 0;
			local82.aByteArray9 = new byte[5000];
			return local82;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("37329, " + 1 + ", " + 1 + ", " + local109.toString());
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
			this.anInt738 = 0;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("72285, " + arg0 + ", " + arg1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
	public void method463(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt738++] = (byte) (arg0 + this.aClass46_2.method656());
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("7023, " + arg0 + ", " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public void method464(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt738++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public void method465(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt738++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt738++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)V")
	public void method466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray9[this.anInt738++] = (byte) arg0;
			if (arg1 != 0) {
				this.aBoolean194 = !this.aBoolean194;
			}
			this.aByteArray9[this.anInt738++] = 0;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("64926, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	public void method467(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt738++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt738++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt738++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	public void method468(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt738++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt738++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt738++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt738++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(II)V")
	public void method469(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt738++] = (byte) arg0;
			this.aByteArray9[this.anInt738++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt738++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt738++] = (byte) (arg0 >> 24);
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("35907, " + 4 + ", " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IJ)V")
	public void method470(@OriginalArg(1) long arg0) {
		try {
			this.aByteArray9[this.anInt738++] = (byte) (arg0 >> 56);
			this.aByteArray9[this.anInt738++] = (byte) (arg0 >> 48);
			this.aByteArray9[this.anInt738++] = (byte) (arg0 >> 40);
			this.aByteArray9[this.anInt738++] = (byte) (arg0 >> 32);
			this.aByteArray9[this.anInt738++] = (byte) (arg0 >> 24);
			this.aByteArray9[this.anInt738++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt738++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt738++] = (byte) arg0;
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("59315, " + 9 + ", " + arg0 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method471(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt738);
		this.anInt738 += arg0.length();
		this.aByteArray9[this.anInt738++] = 10;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIII)V")
	public void method472(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(6) int local6 = 0; local6 < arg1 + 0; local6++) {
				this.aByteArray9[this.anInt738++] = arg0[local6];
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("43206, " + arg0 + ", " + 699 + ", " + 0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)V")
	public void method473(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt738 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("19886, " + arg0 + ", " + false + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "()I")
	public int method474() {
		return this.aByteArray9[this.anInt738++] & 0xFF;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "()B")
	public byte method475() {
		return this.aByteArray9[this.anInt738++];
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "()I")
	public int method476() {
		this.anInt738 += 2;
		return ((this.aByteArray9[this.anInt738 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt738 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "()I")
	public int method477() {
		this.anInt738 += 2;
		@Pc(27) int local27 = ((this.aByteArray9[this.anInt738 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt738 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "()I")
	public int method478() {
		this.anInt738 += 3;
		return ((this.aByteArray9[this.anInt738 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt738 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt738 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "()I")
	public int method479() {
		this.anInt738 += 4;
		return ((this.aByteArray9[this.anInt738 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt738 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt738 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt738 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)J")
	public long method480() {
		try {
			@Pc(5) long local5 = (long) this.method479() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method479() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("2958, " + false + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method481() {
		@Pc(2) int local2 = this.anInt738;
		while (this.aByteArray9[this.anInt738++] != 10) {
		}
		return new String(this.aByteArray9, local2, this.anInt738 - local2 - 1);
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)[B")
	public byte[] method482() {
		try {
			@Pc(2) int local2 = this.anInt738;
			while (this.aByteArray9[this.anInt738++] != 10) {
			}
			@Pc(28) byte[] local28 = new byte[this.anInt738 - local2 - 1];
			for (@Pc(30) int local30 = local2; local30 < this.anInt738 - 1; local30++) {
				local28[local30 - local2] = this.aByteArray9[local30];
			}
			return local28;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("70640, " + 986 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III[B)V")
	public void method483(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(11) int local11 = 0; local11 < arg0 + 0; local11++) {
				arg1[local11] = this.aByteArray9[this.anInt738++];
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("64930, " + 0 + ", " + 0 + ", " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
	public void method484() {
		try {
			this.anInt739 = this.anInt738 * 8;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("62886, " + false + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(II)I")
	public int method485(@OriginalArg(1) int arg0) {
		try {
			@Pc(11) int local11 = this.anInt739 >> 3;
			@Pc(18) int local18 = 8 - (this.anInt739 & 0x7);
			@Pc(20) int local20 = 0;
			this.anInt739 += arg0;
			while (arg0 > local18) {
				local20 += (this.aByteArray9[local11++] & anIntArray217[local18]) << arg0 - local18;
				arg0 -= local18;
				local18 = 8;
			}
			if (arg0 == local18) {
				local20 += this.aByteArray9[local11] & anIntArray217[local18];
			} else {
				local20 += this.aByteArray9[local11] >> local18 - arg0 & anIntArray217[arg0];
			}
			return local20;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("46101, " + 0 + ", " + arg0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)V")
	public void method486() {
		try {
			this.anInt738 = (this.anInt739 + 7) / 8;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("40829, " + -317 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "()I")
	public int method487() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt738] & 0xFF;
		return local7 < 128 ? this.method474() - 64 : this.method476() - 49152;
	}

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "()I")
	public int method488() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt738] & 0xFF;
		return local7 < 128 ? this.method474() : this.method476() - 32768;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method489(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt738;
			this.anInt738 = 0;
			@Pc(18) byte[] local18 = new byte[local2];
			this.method483(local2, local18);
			@Pc(29) BigInteger local29 = new BigInteger(local18);
			@Pc(34) BigInteger local34 = local29.modPow(arg0, arg1);
			@Pc(37) byte[] local37 = local34.toByteArray();
			this.anInt738 = 0;
			this.method464(local37.length);
			this.method472(local37, local37.length);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("71449, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}
}

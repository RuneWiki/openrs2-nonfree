import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
	private static int anInt722;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
	private static int anInt723;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
	private static int anInt724;

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

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
	private int anInt717;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
	public int anInt720;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
	public int anInt721;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "Lclient!wb;")
	public Class46 aClass46_2;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "B")
	private byte aByte30 = 3;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	private int anInt714 = 227;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	private int anInt715 = 9;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "Z")
	private boolean aBoolean198 = true;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
	private int anInt716 = 981;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
	private int anInt718 = -15367;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	private int anInt719 = 1;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "Z")
	private boolean aBoolean199 = false;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Z")
	private boolean aBoolean200 = false;

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
		aClass29_4 = new Class29(-16188);
		aClass29_5 = new Class29(-16188);
		aClass29_6 = new Class29(-16188);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Lclient!lb;")
	public static Class1_Sub1_Sub3 method468() {
		try {
			@Pc(9) Class29 local9 = aClass29_5;
			synchronized (aClass29_5) {
				@Pc(13) Class1_Sub1_Sub3 local13 = null;
				if (anInt723 > 0) {
					anInt723--;
					local13 = (Class1_Sub1_Sub3) aClass29_5.method510();
				}
				if (local13 != null) {
					local13.anInt720 = 0;
					return local13;
				}
			}
			@Pc(75) Class1_Sub1_Sub3 local75 = new Class1_Sub1_Sub3(1);
			local75.anInt720 = 0;
			local75.aByteArray9 = new byte[5000];
			return local75;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("52550, " + 1 + ", " + 144 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([BB)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aByteArray9 = arg0;
			this.anInt720 = 0;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("77249, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
	public void method469(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt720++] = (byte) (arg0 + this.aClass46_2.method662());
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("7069, " + -744 + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public void method470(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt720++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public void method471(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt720++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt720++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)V")
	public void method472(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt720++] = (byte) arg0;
			this.aByteArray9[this.anInt720++] = 0;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("43537, " + arg0 + ", " + 9 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	public void method473(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt720++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt720++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt720++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	public void method474(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt720++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt720++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt720++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt720++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(II)V")
	public void method475(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt720++] = (byte) arg0;
			this.aByteArray9[this.anInt720++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt720++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt720++] = (byte) (arg0 >> 24);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("46208, " + 0 + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(JB)V")
	public void method476(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aByteArray9[this.anInt720++] = (byte) (arg0 >> 56);
			if (this.aByte30 == 3) {
				@Pc(20) boolean local20 = false;
				this.aByteArray9[this.anInt720++] = (byte) (arg0 >> 48);
				this.aByteArray9[this.anInt720++] = (byte) (arg0 >> 40);
				this.aByteArray9[this.anInt720++] = (byte) (arg0 >> 32);
				this.aByteArray9[this.anInt720++] = (byte) (arg0 >> 24);
				this.aByteArray9[this.anInt720++] = (byte) (arg0 >> 16);
				this.aByteArray9[this.anInt720++] = (byte) (arg0 >> 8);
				this.aByteArray9[this.anInt720++] = (byte) arg0;
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("24484, " + arg0 + ", " + arg1 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method477(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt720);
		this.anInt720 += arg0.length();
		this.aByteArray9[this.anInt720++] = 10;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI[BI)V")
	public void method478(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(11) int local11 = 0; local11 < arg1 + 0; local11++) {
				this.aByteArray9[this.anInt720++] = arg0[local11];
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("4670, " + false + ", " + 0 + ", " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)V")
	public void method479(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt720 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("13086, " + arg0 + ", " + true + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "()I")
	public int method480() {
		return this.aByteArray9[this.anInt720++] & 0xFF;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "()B")
	public byte method481() {
		return this.aByteArray9[this.anInt720++];
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "()I")
	public int method482() {
		this.anInt720 += 2;
		return ((this.aByteArray9[this.anInt720 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt720 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "()I")
	public int method483() {
		this.anInt720 += 2;
		@Pc(27) int local27 = ((this.aByteArray9[this.anInt720 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt720 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "()I")
	public int method484() {
		this.anInt720 += 3;
		return ((this.aByteArray9[this.anInt720 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt720 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt720 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "()I")
	public int method485() {
		this.anInt720 += 4;
		return ((this.aByteArray9[this.anInt720 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt720 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt720 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt720 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)J")
	public long method486() {
		try {
			@Pc(5) long local5 = (long) this.method485() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method485() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("98347, " + 5 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method487() {
		@Pc(2) int local2 = this.anInt720;
		while (this.aByteArray9[this.anInt720++] != 10) {
		}
		return new String(this.aByteArray9, local2, this.anInt720 - local2 - 1);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)[B")
	public byte[] method488() {
		try {
			@Pc(9) int local9 = this.anInt720;
			while (this.aByteArray9[this.anInt720++] != 10) {
			}
			@Pc(30) byte[] local30 = new byte[this.anInt720 - local9 - 1];
			for (@Pc(32) int local32 = local9; local32 < this.anInt720 - 1; local32++) {
				local30[local32 - local9] = this.aByteArray9[local32];
			}
			return local30;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("89150, " + -14 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[BII)V")
	public void method489(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(11) int local11 = 0; local11 < arg1 + 0; local11++) {
				arg0[local11] = this.aByteArray9[this.anInt720++];
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("17605, " + 0 + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	public void method490() {
		try {
			this.anInt721 = this.anInt720 * 8;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("24460, " + true + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(II)I")
	public int method491(@OriginalArg(1) int arg0) {
		try {
			@Pc(10) int local10 = this.anInt721 >> 3;
			@Pc(17) int local17 = 8 - (this.anInt721 & 0x7);
			@Pc(19) int local19 = 0;
			this.anInt721 += arg0;
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
			signlink.reporterror("52991, " + 0 + ", " + arg0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V")
	public void method492() {
		try {
			this.anInt720 = (this.anInt721 + 7) / 8;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("62040, " + 168 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "()I")
	public int method493() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt720] & 0xFF;
		return local7 < 128 ? this.method480() - 64 : this.method482() - 49152;
	}

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "()I")
	public int method494() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt720] & 0xFF;
		return local7 < 128 ? this.method480() : this.method482() - 32768;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method495(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt720;
			this.anInt720 = 0;
			@Pc(11) byte[] local11 = new byte[local2];
			this.method489(local11, local2);
			@Pc(22) BigInteger local22 = new BigInteger(local11);
			@Pc(27) BigInteger local27 = local22.modPow(arg0, arg1);
			@Pc(30) byte[] local30 = local27.toByteArray();
			this.anInt720 = 0;
			this.method470(local30.length);
			this.method478(local30, local30.length);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("72283, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}
}

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UAWAYCTK")
public final class Class6_Sub2_Sub3 extends Class6_Sub2 {

	@OriginalMember(owner = "client!UAWAYCTK", name = "F", descriptor = "I")
	private static int anInt611;

	@OriginalMember(owner = "client!UAWAYCTK", name = "G", descriptor = "I")
	private static int anInt612;

	@OriginalMember(owner = "client!UAWAYCTK", name = "H", descriptor = "I")
	private static int anInt613;

	@OriginalMember(owner = "client!UAWAYCTK", name = "j", descriptor = "I")
	private static int anInt600 = -400;

	@OriginalMember(owner = "client!UAWAYCTK", name = "C", descriptor = "[I")
	private static int[] anIntArray141 = new int[256];

	@OriginalMember(owner = "client!UAWAYCTK", name = "D", descriptor = "[I")
	private static final int[] anIntArray142;

	@OriginalMember(owner = "client!UAWAYCTK", name = "I", descriptor = "Lclient!URASIGRB;")
	private static Class39 aClass39_7;

	@OriginalMember(owner = "client!UAWAYCTK", name = "J", descriptor = "Lclient!URASIGRB;")
	private static Class39 aClass39_8;

	@OriginalMember(owner = "client!UAWAYCTK", name = "K", descriptor = "Lclient!URASIGRB;")
	private static Class39 aClass39_9;

	@OriginalMember(owner = "client!UAWAYCTK", name = "L", descriptor = "[C")
	private static char[] aCharArray3;

	@OriginalMember(owner = "client!UAWAYCTK", name = "z", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!UAWAYCTK", name = "A", descriptor = "I")
	public int anInt609;

	@OriginalMember(owner = "client!UAWAYCTK", name = "B", descriptor = "I")
	public int anInt610;

	@OriginalMember(owner = "client!UAWAYCTK", name = "E", descriptor = "Lclient!VZIKSEDY;")
	public Class45 aClass45_1;

	@OriginalMember(owner = "client!UAWAYCTK", name = "i", descriptor = "Z")
	private boolean aBoolean163 = true;

	@OriginalMember(owner = "client!UAWAYCTK", name = "k", descriptor = "Z")
	private boolean aBoolean164 = false;

	@OriginalMember(owner = "client!UAWAYCTK", name = "l", descriptor = "Z")
	private boolean aBoolean165 = true;

	@OriginalMember(owner = "client!UAWAYCTK", name = "m", descriptor = "I")
	private int anInt601 = 41598;

	@OriginalMember(owner = "client!UAWAYCTK", name = "n", descriptor = "B")
	private byte aByte24 = 9;

	@OriginalMember(owner = "client!UAWAYCTK", name = "o", descriptor = "I")
	private int anInt602 = -49448;

	@OriginalMember(owner = "client!UAWAYCTK", name = "p", descriptor = "I")
	private int anInt603 = -27691;

	@OriginalMember(owner = "client!UAWAYCTK", name = "q", descriptor = "I")
	private int anInt604 = -27691;

	@OriginalMember(owner = "client!UAWAYCTK", name = "r", descriptor = "B")
	private byte aByte25 = -50;

	@OriginalMember(owner = "client!UAWAYCTK", name = "s", descriptor = "I")
	private int anInt605 = 8;

	@OriginalMember(owner = "client!UAWAYCTK", name = "t", descriptor = "I")
	private int anInt606 = -49955;

	@OriginalMember(owner = "client!UAWAYCTK", name = "u", descriptor = "Z")
	private boolean aBoolean166 = false;

	@OriginalMember(owner = "client!UAWAYCTK", name = "v", descriptor = "B")
	private byte aByte26 = 1;

	@OriginalMember(owner = "client!UAWAYCTK", name = "w", descriptor = "I")
	private int anInt607 = -296;

	@OriginalMember(owner = "client!UAWAYCTK", name = "x", descriptor = "Z")
	private boolean aBoolean167 = true;

	@OriginalMember(owner = "client!UAWAYCTK", name = "y", descriptor = "I")
	private int anInt608 = -799;

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
			anIntArray141[local6] = local9;
		}
		anIntArray142 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass39_7 = new Class39(41824);
		aClass39_8 = new Class39(41824);
		aClass39_9 = new Class39(41824);
		aCharArray3 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "a", descriptor = "(II)Lclient!UAWAYCTK;")
	public static Class6_Sub2_Sub3 method390() {
		try {
			@Pc(3) Class39 local3 = aClass39_8;
			synchronized (aClass39_8) {
				@Pc(7) Class6_Sub2_Sub3 local7 = null;
				if (anInt612 > 0) {
					anInt612--;
					local7 = (Class6_Sub2_Sub3) aClass39_8.method458();
				}
				if (local7 != null) {
					local7.anInt609 = 0;
					return local7;
				}
			}
			@Pc(69) Class6_Sub2_Sub3 local69 = new Class6_Sub2_Sub3(true);
			local69.anInt609 = 0;
			local69.aByteArray17 = new byte[5000];
			return local69;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("54361, " + -400 + ", " + 1 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "<init>", descriptor = "(Z)V")
	private Class6_Sub2_Sub3(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "<init>", descriptor = "(I[B)V")
	public Class6_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray17 = arg1;
			this.anInt609 = 0;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("90676, " + arg0 + ", " + arg1 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "a", descriptor = "(ZI)V")
	public void method391(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray17[this.anInt609++] = (byte) (arg0 + this.aClass45_1.method476());
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("35408, " + false + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "a", descriptor = "(I)V")
	public void method392(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt609++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "b", descriptor = "(I)V")
	public void method393(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt609++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt609++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "b", descriptor = "(II)V")
	public void method394(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray17[this.anInt609++] = (byte) arg0;
			this.aByteArray17[this.anInt609++] = 0;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("31131, " + arg0 + ", " + -19346 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "c", descriptor = "(I)V")
	public void method395(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt609++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt609++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt609++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "d", descriptor = "(I)V")
	public void method396(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt609++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt609++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt609++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt609++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "c", descriptor = "(II)V")
	public void method397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray17[this.anInt609++] = (byte) arg1;
			if (arg0 < 0) {
				this.aByteArray17[this.anInt609++] = (byte) (arg1 >> 8);
				this.aByteArray17[this.anInt609++] = (byte) (arg1 >> 16);
				this.aByteArray17[this.anInt609++] = (byte) (arg1 >> 24);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("67994, " + arg0 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "a", descriptor = "(JZ)V")
	public void method398(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray17[this.anInt609++] = (byte) (arg0 >> 56);
			this.aByteArray17[this.anInt609++] = (byte) (arg0 >> 48);
			this.aByteArray17[this.anInt609++] = (byte) (arg0 >> 40);
			this.aByteArray17[this.anInt609++] = (byte) (arg0 >> 32);
			this.aByteArray17[this.anInt609++] = (byte) (arg0 >> 24);
			this.aByteArray17[this.anInt609++] = (byte) (arg0 >> 16);
			this.aByteArray17[this.anInt609++] = (byte) (arg0 >> 8);
			this.aByteArray17[this.anInt609++] = (byte) arg0;
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("34700, " + arg0 + ", " + true + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method399(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray17, this.anInt609);
		this.anInt609 += arg0.length();
		this.aByteArray17[this.anInt609++] = 10;
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "a", descriptor = "([BZII)V")
	public void method400(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < arg1 + 0; local5++) {
				this.aByteArray17[this.anInt609++] = arg0[local5];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("51172, " + arg0 + ", " + false + ", " + 0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "d", descriptor = "(II)V")
	public void method401(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray17[this.anInt609 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("20484, " + arg0 + ", " + 36772 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "c", descriptor = "()I")
	public int method402() {
		return this.aByteArray17[this.anInt609++] & 0xFF;
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "d", descriptor = "()B")
	public byte method403() {
		return this.aByteArray17[this.anInt609++];
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "e", descriptor = "()I")
	public int method404() {
		this.anInt609 += 2;
		return ((this.aByteArray17[this.anInt609 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt609 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "f", descriptor = "()I")
	public int method405() {
		this.anInt609 += 2;
		@Pc(27) int local27 = ((this.aByteArray17[this.anInt609 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt609 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "g", descriptor = "()I")
	public int method406() {
		this.anInt609 += 3;
		return ((this.aByteArray17[this.anInt609 - 3] & 0xFF) << 16) + ((this.aByteArray17[this.anInt609 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt609 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "h", descriptor = "()I")
	public int method407() {
		this.anInt609 += 4;
		return ((this.aByteArray17[this.anInt609 - 4] & 0xFF) << 24) + ((this.aByteArray17[this.anInt609 - 3] & 0xFF) << 16) + ((this.aByteArray17[this.anInt609 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt609 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "a", descriptor = "(B)J")
	public long method408() {
		try {
			@Pc(5) long local5 = (long) this.method407() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method407() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("14289, " + -26 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "i", descriptor = "()Ljava/lang/String;")
	public String method409() {
		@Pc(2) int local2 = this.anInt609;
		while (this.aByteArray17[this.anInt609++] != 10) {
		}
		return new String(this.aByteArray17, local2, this.anInt609 - local2 - 1);
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "e", descriptor = "(I)[B")
	public byte[] method410() {
		try {
			@Pc(2) int local2 = this.anInt609;
			while (this.aByteArray17[this.anInt609++] != 10) {
			}
			@Pc(28) byte[] local28 = new byte[this.anInt609 - local2 - 1];
			for (@Pc(30) int local30 = local2; local30 < this.anInt609 - 1; local30++) {
				local28[local30 - local2] = this.aByteArray17[local30];
			}
			return local28;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("16169, " + 0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "a", descriptor = "(I[BIZ)V")
	private void method411(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg0 + 0; local4++) {
				arg1[local4] = this.aByteArray17[this.anInt609++];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("42972, " + arg0 + ", " + arg1 + ", " + 0 + ", " + false + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "a", descriptor = "(Z)V")
	public void method412() {
		try {
			this.anInt610 = this.anInt609 * 8;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("65243, " + true + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "e", descriptor = "(II)I")
	public int method413(@OriginalArg(1) int arg0) {
		try {
			@Pc(15) int local15 = this.anInt610 >> 3;
			@Pc(22) int local22 = 8 - (this.anInt610 & 0x7);
			@Pc(24) int local24 = 0;
			this.anInt610 += arg0;
			while (arg0 > local22) {
				local24 += (this.aByteArray17[local15++] & anIntArray142[local22]) << arg0 - local22;
				arg0 -= local22;
				local22 = 8;
			}
			if (arg0 == local22) {
				local24 += this.aByteArray17[local15] & anIntArray142[local22];
			} else {
				local24 += this.aByteArray17[local15] >> local22 - arg0 & anIntArray142[arg0];
			}
			return local24;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("38133, " + 5 + ", " + arg0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "b", descriptor = "(Z)V")
	public void method414() {
		try {
			this.anInt609 = (this.anInt610 + 7) / 8;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("45406, " + false + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "j", descriptor = "()I")
	public int method415() {
		@Pc(7) int local7 = this.aByteArray17[this.anInt609] & 0xFF;
		return local7 < 128 ? this.method402() - 64 : this.method404() - 49152;
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "k", descriptor = "()I")
	public int method416() {
		@Pc(7) int local7 = this.aByteArray17[this.anInt609] & 0xFF;
		return local7 < 128 ? this.method402() : this.method404() - 32768;
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method417(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt609;
			this.anInt609 = 0;
			@Pc(17) byte[] local17 = new byte[local2];
			this.method411(local2, local17);
			@Pc(28) BigInteger local28 = new BigInteger(local17);
			@Pc(33) BigInteger local33 = local28.modPow(arg0, arg1);
			@Pc(36) byte[] local36 = local33.toByteArray();
			this.anInt609 = 0;
			this.method392(local36.length);
			this.method400(local36, local36.length);
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("24313, " + arg0 + ", " + 8 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "f", descriptor = "(II)V")
	public void method418(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray17[this.anInt609++] = (byte) (arg0 + 128);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("70242, " + 4 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "a", descriptor = "(IB)V")
	public void method419(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 == 4) {
				@Pc(6) boolean local6 = false;
			} else {
				for (@Pc(10) int local10 = 1; local10 > 0; local10++) {
				}
			}
			this.aByteArray17[this.anInt609++] = (byte) -arg0;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("27943, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "g", descriptor = "(II)V")
	public void method420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 == 30130) {
				this.aByteArray17[this.anInt609++] = (byte) (128 - arg0);
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("53041, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "b", descriptor = "(B)I")
	public int method421() {
		try {
			return this.aByteArray17[this.anInt609++] - 128 & 0xFF;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("97486, " + 1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "c", descriptor = "(B)I")
	public int method422() {
		try {
			return -this.aByteArray17[this.anInt609++] & 0xFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("38253, " + 16 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "d", descriptor = "(B)I")
	public int method423() {
		try {
			return this.aByte25 == -50 ? 128 - this.aByteArray17[this.anInt609++] & 0xFF : 3;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("68124, " + -50 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "f", descriptor = "(I)B")
	public byte method424(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 1 || arg0 > 1) {
				throw new NullPointerException();
			}
			return (byte) (this.aByteArray17[this.anInt609++] - 128);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("88416, " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "e", descriptor = "(B)B")
	public byte method425() {
		try {
			return (byte) (128 - this.aByteArray17[this.anInt609++]);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("20540, " + 8 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "h", descriptor = "(II)V")
	public void method426(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray17[this.anInt609++] = (byte) arg0;
			if (this.anInt605 == 8) {
				this.aByteArray17[this.anInt609++] = (byte) (arg0 >> 8);
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("58501, " + arg0 + ", " + 8 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "i", descriptor = "(II)V")
	public void method427(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray17[this.anInt609++] = (byte) (arg0 >> 8);
			this.aByteArray17[this.anInt609++] = (byte) (arg0 + 128);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("39852, " + -24437 + ", " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "j", descriptor = "(II)V")
	public void method428(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray17[this.anInt609++] = (byte) (arg0 + 128);
			this.aByteArray17[this.anInt609++] = (byte) (arg0 >> 8);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("5005, " + 975 + ", " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "g", descriptor = "(I)I")
	public int method429() {
		try {
			this.anInt609 += 2;
			return ((this.aByteArray17[this.anInt609 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt609 - 2] & 0xFF);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("46427, " + 0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "h", descriptor = "(I)I")
	public int method430() {
		try {
			this.anInt609 += 2;
			return ((this.aByteArray17[this.anInt609 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt609 - 1] - 128 & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("84726, " + 17702 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "c", descriptor = "(Z)I")
	public int method431() {
		try {
			this.anInt609 += 2;
			return ((this.aByteArray17[this.anInt609 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt609 - 2] - 128 & 0xFF);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("81871, " + false + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "f", descriptor = "(B)I")
	public int method432() {
		try {
			this.anInt609 += 2;
			@Pc(39) int local39 = ((this.aByteArray17[this.anInt609 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt609 - 1] - 128 & 0xFF);
			if (local39 > 32767) {
				local39 -= 65536;
			}
			return local39;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("69481, " + 7 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "i", descriptor = "(I)I")
	public int method433() {
		try {
			this.anInt609 += 2;
			@Pc(29) int local29 = ((this.aByteArray17[this.anInt609 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt609 - 2] - 128 & 0xFF);
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("15647, " + -164 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "g", descriptor = "(B)I")
	public int method434() {
		try {
			this.anInt609 += 3;
			return ((this.aByteArray17[this.anInt609 - 3] & 0xFF) << 16) + ((this.aByteArray17[this.anInt609 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt609 - 2] & 0xFF);
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("68445, " + -33 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "k", descriptor = "(II)V")
	public void method435(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray17[this.anInt609++] = (byte) (arg0 >> 16);
			this.aByteArray17[this.anInt609++] = (byte) (arg0 >> 24);
			this.aByteArray17[this.anInt609++] = (byte) arg0;
			this.aByteArray17[this.anInt609++] = (byte) (arg0 >> 8);
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("70504, " + 3 + ", " + arg0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "d", descriptor = "(Z)I")
	public int method436() {
		try {
			this.anInt609 += 4;
			return ((this.aByteArray17[this.anInt609 - 1] & 0xFF) << 24) + ((this.aByteArray17[this.anInt609 - 2] & 0xFF) << 16) + ((this.aByteArray17[this.anInt609 - 3] & 0xFF) << 8) + (this.aByteArray17[this.anInt609 - 4] & 0xFF);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("1170, " + false + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "j", descriptor = "(I)I")
	public int method437(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			this.anInt609 += 4;
			return ((this.aByteArray17[this.anInt609 - 2] & 0xFF) << 24) + ((this.aByteArray17[this.anInt609 - 1] & 0xFF) << 16) + ((this.aByteArray17[this.anInt609 - 4] & 0xFF) << 8) + (this.aByteArray17[this.anInt609 - 3] & 0xFF);
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("53730, " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "h", descriptor = "(B)I")
	public int method438() {
		try {
			if (this.aByte26 == 1) {
				this.anInt609 += 4;
				return ((this.aByteArray17[this.anInt609 - 3] & 0xFF) << 24) + ((this.aByteArray17[this.anInt609 - 4] & 0xFF) << 16) + ((this.aByteArray17[this.anInt609 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt609 - 2] & 0xFF);
			} else {
				return 4;
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("87690, " + 1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "b", descriptor = "([BZII)V")
	public void method439(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg1 + 0; local4++) {
				this.aByteArray17[this.anInt609++] = (byte) (arg0[local4] + 128);
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("83885, " + arg0 + ", " + true + ", " + 0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "a", descriptor = "(II[BI)V")
	public void method440(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(15) int local15 = arg0 + 0 - 1; local15 >= 0; local15--) {
				arg1[local15] = this.aByteArray17[this.anInt609++];
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("94202, " + arg0 + ", " + 0 + ", " + arg1 + ", " + 0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAWAYCTK", name = "a", descriptor = "(I[BII)V")
	public void method441(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			for (@Pc(8) int local8 = 0; local8 < arg0 + 0; local8++) {
				arg1[local8] = (byte) (this.aByteArray17[this.anInt609++] - 128);
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("1864, " + arg0 + ", " + arg1 + ", " + 0 + ", " + -746 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}
}

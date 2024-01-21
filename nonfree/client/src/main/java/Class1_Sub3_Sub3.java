import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
	private static int anInt396;

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
	private static int anInt397;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
	private static int anInt398;

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
	private static int anInt393 = -836;

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "[I")
	private static int[] anIntArray163 = new int[256];

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "[I")
	private static final int[] anIntArray164;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "Lclient!nb;")
	private static Class23 aClass23_6;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "Lclient!nb;")
	private static Class23 aClass23_7;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "Lclient!nb;")
	private static Class23 aClass23_8;

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
	public int anInt394;

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
	public int anInt395;

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "Lclient!sb;")
	public Class33 aClass33_2;

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "Z")
	private boolean aBoolean95 = false;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
	private int anInt392 = -95;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Z")
	private boolean aBoolean96 = false;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "B")
	private byte aByte21 = 61;

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "B")
	private byte aByte22 = 61;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "Z")
	private boolean aBoolean97 = true;

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
			anIntArray163[local6] = local9;
		}
		anIntArray164 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass23_6 = new Class23(845);
		aClass23_7 = new Class23(845);
		aClass23_8 = new Class23(845);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Lclient!jb;")
	public static Class1_Sub3_Sub3 method322() {
		@Pc(9) Class23 local9 = aClass23_7;
		synchronized (aClass23_7) {
			@Pc(13) Class1_Sub3_Sub3 local13 = null;
			if (anInt397 > 0) {
				anInt397--;
				local13 = (Class1_Sub3_Sub3) aClass23_7.method351();
			}
			if (local13 != null) {
				local13.anInt394 = 0;
				return local13;
			}
		}
		@Pc(75) Class1_Sub3_Sub3 local75 = new Class1_Sub3_Sub3(false);
		local75.anInt394 = 0;
		local75.aByteArray4 = new byte[5000];
		return local75;
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Z)V")
	private Class1_Sub3_Sub3(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([BB)V")
	public Class1_Sub3_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray4 = arg0;
		this.anInt394 = 0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)V")
	public void method323(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt394++] = (byte) (arg0 + this.aClass33_2.method424());
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public void method324(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt394++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public void method325(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt394++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt394++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public void method326(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt394++] = (byte) (arg0 >> 24);
		this.aByteArray4[this.anInt394++] = (byte) (arg0 >> 16);
		this.aByteArray4[this.anInt394++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt394++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(JI)V")
	public void method327(@OriginalArg(0) long arg0) {
		this.aByteArray4[this.anInt394++] = (byte) (arg0 >> 56);
		this.aByteArray4[this.anInt394++] = (byte) (arg0 >> 48);
		this.aByteArray4[this.anInt394++] = (byte) (arg0 >> 40);
		this.aByteArray4[this.anInt394++] = (byte) (arg0 >> 32);
		this.aByteArray4[this.anInt394++] = (byte) (arg0 >> 24);
		this.aByteArray4[this.anInt394++] = (byte) (arg0 >> 16);
		this.aByteArray4[this.anInt394++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt394++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method328(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray4, this.anInt394);
		this.anInt394 += arg0.length();
		this.aByteArray4[this.anInt394++] = 10;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZI[B)V")
	public void method329(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0; local5++) {
			this.aByteArray4[this.anInt394++] = arg1[local5];
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)V")
	public void method330(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt394 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "()I")
	public int method331() {
		return this.aByteArray4[this.anInt394++] & 0xFF;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "()B")
	public byte method332() {
		return this.aByteArray4[this.anInt394++];
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "()I")
	public int method333() {
		this.anInt394 += 2;
		return ((this.aByteArray4[this.anInt394 - 2] & 0xFF) << 8) + (this.aByteArray4[this.anInt394 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "()I")
	public int method334() {
		this.anInt394 += 2;
		@Pc(27) int local27 = ((this.aByteArray4[this.anInt394 - 2] & 0xFF) << 8) + (this.aByteArray4[this.anInt394 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "()I")
	public int method335() {
		this.anInt394 += 3;
		return ((this.aByteArray4[this.anInt394 - 3] & 0xFF) << 16) + ((this.aByteArray4[this.anInt394 - 2] & 0xFF) << 8) + (this.aByteArray4[this.anInt394 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "()I")
	public int method336() {
		this.anInt394 += 4;
		return ((this.aByteArray4[this.anInt394 - 4] & 0xFF) << 24) + ((this.aByteArray4[this.anInt394 - 3] & 0xFF) << 16) + ((this.aByteArray4[this.anInt394 - 2] & 0xFF) << 8) + (this.aByteArray4[this.anInt394 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)J")
	public long method337() {
		@Pc(12) long local12 = (long) this.method336() & 0xFFFFFFFFL;
		@Pc(18) long local18 = (long) this.method336() & 0xFFFFFFFFL;
		return (local12 << 32) + local18;
	}

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method338() {
		@Pc(2) int local2 = this.anInt394;
		while (this.aByteArray4[this.anInt394++] != 10) {
		}
		return new String(this.aByteArray4, local2, this.anInt394 - local2 - 1);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)[B")
	public byte[] method339() {
		@Pc(19) int local19 = this.anInt394;
		while (this.aByteArray4[this.anInt394++] != 10) {
		}
		@Pc(40) byte[] local40 = new byte[this.anInt394 - local19 - 1];
		for (@Pc(42) int local42 = local19; local42 < this.anInt394 - 1; local42++) {
			local40[local42 - local19] = this.aByteArray4[local42];
		}
		return local40;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[BZ)V")
	public void method340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		for (@Pc(6) int local6 = arg0; local6 < arg0 + arg1; local6++) {
			arg2[local6] = this.aByteArray4[this.anInt394++];
		}
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
	public void method341() {
		this.anInt395 = this.anInt394 * 8;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(II)I")
	public int method342(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = this.anInt395 >> 3;
		@Pc(13) int local13 = 8 - (this.anInt395 & 0x7);
		@Pc(15) int local15 = 0;
		this.anInt395 += arg0;
		while (arg0 > local13) {
			local15 += (this.aByteArray4[local6++] & anIntArray164[local13]) << arg0 - local13;
			arg0 -= local13;
			local13 = 8;
		}
		if (arg0 == local13) {
			local15 += this.aByteArray4[local6] & anIntArray164[local13];
		} else {
			local15 += this.aByteArray4[local6] >> local13 - arg0 & anIntArray164[arg0];
		}
		return local15;
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)V")
	public void method343() {
		this.anInt394 = (this.anInt395 + 7) / 8;
	}

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "()I")
	public int method344() {
		@Pc(7) int local7 = this.aByteArray4[this.anInt394] & 0xFF;
		return local7 < 128 ? this.method331() - 64 : this.method333() - 49152;
	}

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "()I")
	public int method345() {
		@Pc(7) int local7 = this.aByteArray4[this.anInt394] & 0xFF;
		return local7 < 128 ? this.method331() : this.method333() - 32768;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
	public void method346(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt394;
		this.anInt394 = 0;
		@Pc(8) byte[] local8 = new byte[local2];
		this.method340(0, local2, local8);
		@Pc(19) BigInteger local19 = new BigInteger(local8);
		@Pc(24) BigInteger local24 = local19.modPow(arg1, arg0);
		@Pc(27) byte[] local27 = local24.toByteArray();
		this.anInt394 = 0;
		this.method324(local27.length);
		this.method329(local27.length, local27);
	}
}

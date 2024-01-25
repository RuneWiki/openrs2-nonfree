import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public class Class1_Sub20 extends Class1 {

	@OriginalMember(owner = "client!io", name = "o", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!io", name = "I", descriptor = "I")
	public int anInt5238;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(I)V")
	public Class1_Sub20(@OriginalArg(0) int arg0) {
		this.aByteArray52 = Static109.method1957(arg0);
		this.anInt5238 = 0;
	}

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "([B)V")
	public Class1_Sub20(@OriginalArg(0) byte[] arg0) {
		this.anInt5238 = 0;
		this.aByteArray52 = arg0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B)Ljava/lang/String;")
	public final String method4370() {
		@Pc(20) byte local20 = this.aByteArray52[this.anInt5238++];
		if (local20 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(34) int local34 = this.method4390();
		if (local34 + this.anInt5238 > this.aByteArray52.length) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(59) String local59 = Static537.method7482(this.anInt5238, this.aByteArray52, local34);
		this.anInt5238 += local34;
		return local59;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)I")
	public final int method4371() {
		this.anInt5238 += 4;
		return ((this.aByteArray52[this.anInt5238 - 2] & 0xFF) << 8) + ((this.aByteArray52[this.anInt5238 - 4] << 24 & 0xFF000000) + (this.aByteArray52[this.anInt5238 - 3] << 16 & 0xFF0000) + (this.aByteArray52[this.anInt5238 + -1] & 0xFF));
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)I")
	public final int method4372() {
		return -this.aByteArray52[this.anInt5238++] & 0xFF;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(I)I")
	public final int method4373() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		for (local11 = this.method4427(); local11 == 32767; local11 = this.method4427()) {
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(I)B")
	public final byte method4374() {
		return (byte) -this.aByteArray52[this.anInt5238++];
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V")
	public final void method4375(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt5238 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray52[this.anInt5238 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt5238 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt5238 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IZ)V")
	public final void method4376(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt5238++] = (byte) arg0;
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(II)V")
	public final void method4377(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt5238++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(II)V")
	public final void method4378(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt5238++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "(II)V")
	public final void method4379(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt5238++] = (byte) arg0;
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IJ)V")
	public final void method4380(@OriginalArg(1) long arg0) {
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 56);
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 48);
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 40);
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 32);
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 24);
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt5238++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!io", name = "e", descriptor = "(II)V")
	public final void method4381(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt5238++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "(I)I")
	public final int method4382() {
		return this.aByteArray52[this.anInt5238++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(B)I")
	public final int method4383() {
		this.anInt5238 += 3;
		return ((this.aByteArray52[this.anInt5238 - 3] & 0xFF) << 8) + ((this.aByteArray52[this.anInt5238 - 2] & 0xFF) << 16) + (this.aByteArray52[this.anInt5238 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!io", name = "f", descriptor = "(II)V")
	public final void method4384(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt5238++] = (byte) arg0;
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)V")
	public final void method4385(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt5238++] = (byte) arg0;
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!io", name = "g", descriptor = "(II)V")
	public final void method4386(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4378(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4381(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!io", name = "e", descriptor = "(I)B")
	public final byte method4387() {
		return (byte) (128 - this.aByteArray52[this.anInt5238++]);
	}

	@OriginalMember(owner = "client!io", name = "f", descriptor = "(I)Ljava/lang/String;")
	public final String method4388() {
		@Pc(6) int local6 = this.anInt5238;
		while (this.aByteArray52[this.anInt5238++] != 0) {
		}
		@Pc(32) int local32 = this.anInt5238 - local6 - 1;
		return local32 == 0 ? "" : Static440.method6212(this.aByteArray52, local32, local6);
	}

	@OriginalMember(owner = "client!io", name = "g", descriptor = "(I)I")
	public final int method4389() {
		this.anInt5238 += 4;
		return ((this.aByteArray52[this.anInt5238 - 3] & 0xFF) << 24) + ((this.aByteArray52[this.anInt5238 - 4] & 0xFF) << 16) + ((this.aByteArray52[this.anInt5238 + -1] & 0xFF) << 8) + (this.aByteArray52[this.anInt5238 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(B)I")
	public final int method4390() {
		@Pc(21) byte local21 = this.aByteArray52[this.anInt5238++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local23 | local21 & 0x7F) << 7;
			local21 = this.aByteArray52[this.anInt5238++];
		}
		return local21 | local23;
	}

	@OriginalMember(owner = "client!io", name = "h", descriptor = "(I)I")
	public final int method4391() {
		this.anInt5238 += 2;
		@Pc(32) int local32 = ((this.aByteArray52[this.anInt5238 - 2] & 0xFF) << 8) + (this.aByteArray52[this.anInt5238 - 1] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!io", name = "i", descriptor = "(I)V")
	public final void method4392() {
		if (this.aByteArray52 != null) {
			Static109.method1956(this.aByteArray52);
		}
		this.aByteArray52 = null;
	}

	@OriginalMember(owner = "client!io", name = "j", descriptor = "(I)I")
	public final int method4393() {
		return this.aByteArray52[this.anInt5238++] & 0xFF;
	}

	@OriginalMember(owner = "client!io", name = "k", descriptor = "(I)I")
	public final int method4394() {
		this.anInt5238 += 2;
		return ((this.aByteArray52[this.anInt5238 - 1] & 0xFF) << 8) + (this.aByteArray52[this.anInt5238 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!io", name = "l", descriptor = "(I)Ljava/lang/String;")
	public final String method4395() {
		@Pc(14) byte local14 = this.aByteArray52[this.anInt5238++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(25) int local25 = this.anInt5238;
		while (this.aByteArray52[this.anInt5238++] != 0) {
		}
		@Pc(45) int local45 = this.anInt5238 - local25 - 1;
		return local45 == 0 ? "" : Static440.method6212(this.aByteArray52, local45, local25);
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "(B)I")
	public final int method4396() {
		this.anInt5238 += 3;
		return (this.aByteArray52[this.anInt5238 - 1] & 0xFF) + ((this.aByteArray52[this.anInt5238 - 2] & 0xFF) << 8) + ((this.aByteArray52[this.anInt5238 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!io", name = "m", descriptor = "(I)I")
	public final int method4398() {
		this.anInt5238 += 4;
		return (this.aByteArray52[this.anInt5238 - 3] & 0xFF) + ((this.aByteArray52[this.anInt5238 - 2] & 0xFF) << 24) + ((this.aByteArray52[this.anInt5238 + -1] & 0xFF) << 16) + ((this.aByteArray52[this.anInt5238 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method4399(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = arg0.indexOf(0);
		if (local15 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local15 + " - cannot pjstr");
		}
		this.anInt5238 += Static375.method5451(this.anInt5238, this.aByteArray52, arg0, arg0.length());
		this.aByteArray52[this.anInt5238++] = 0;
	}

	@OriginalMember(owner = "client!io", name = "h", descriptor = "(II)V")
	public final void method4400(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 24);
		this.aByteArray52[this.anInt5238++] = (byte) arg0;
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public final void method4401(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = Static474.method986(arg0);
		this.aByteArray52[this.anInt5238++] = 0;
		this.method4436(local7);
		this.anInt5238 += Static106.method1893(arg0, this.aByteArray52, this.anInt5238);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IB)V")
	public final void method4402(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 + 128);
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!io", name = "f", descriptor = "(B)Ljava/lang/String;")
	public final String method4403() {
		if (this.aByteArray52[this.anInt5238] == 0) {
			this.anInt5238++;
			return null;
		} else {
			return this.method4388();
		}
	}

	@OriginalMember(owner = "client!io", name = "n", descriptor = "(I)Z")
	public final boolean method4404() {
		this.anInt5238 -= 4;
		@Pc(17) int local17 = Static60.method1382(this.aByteArray52, this.anInt5238, 0);
		@Pc(21) int local21 = this.method4371();
		return local17 == local21;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)I")
	public final int method4405() {
		@Pc(16) int local16 = Static60.method1382(this.aByteArray52, this.anInt5238, 0);
		this.method4421(local16);
		return local16;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method4407(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt5238;
		this.anInt5238 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4425(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt5238 = 0;
		this.method4381(local31.length);
		this.method4412(local31, local31.length);
	}

	@OriginalMember(owner = "client!io", name = "g", descriptor = "(B)I")
	public final int method4408() {
		return 128 - this.aByteArray52[this.anInt5238++] & 0xFF;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(BI)V")
	public final void method4409(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!io", name = "o", descriptor = "(I)I")
	public final int method4410() {
		this.anInt5238 += 3;
		@Pc(51) int local51 = ((this.aByteArray52[this.anInt5238 - 2] & 0xFF) << 8) + (((this.aByteArray52[this.anInt5238 - 3] & 0xFF) << 16) + (this.aByteArray52[this.anInt5238 - 1] & 0xFF));
		if (local51 > 8388607) {
			local51 -= 16777216;
		}
		return local51;
	}

	@OriginalMember(owner = "client!io", name = "i", descriptor = "(II)V")
	public final void method4411(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt5238 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "([BIIB)V")
	public final void method4412(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			this.aByteArray52[this.anInt5238++] = arg0[local11];
		}
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(BI)V")
	public final void method4413(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt5238++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!io", name = "j", descriptor = "(II)V")
	public final void method4414(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt5238++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!io", name = "k", descriptor = "(II)J")
	public final long method4415(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 - 1;
		if (local13 < 0 || local13 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(26) int local26 = local13 * 8;
		@Pc(28) long local28 = 0L;
		while (local26 >= 0) {
			local28 |= ((long) this.aByteArray52[this.anInt5238++] & 0xFFL) << local26;
			local26 -= 8;
		}
		return local28;
	}

	@OriginalMember(owner = "client!io", name = "e", descriptor = "(Z)J")
	public final long method4416() {
		@Pc(14) long local14 = (long) this.method4371() & 0xFFFFFFFFL;
		@Pc(28) long local28 = (long) this.method4371() & 0xFFFFFFFFL;
		return (local14 << 32) + local28;
	}

	@OriginalMember(owner = "client!io", name = "p", descriptor = "(I)I")
	public final int method4417() {
		this.anInt5238 += 2;
		return ((this.aByteArray52[this.anInt5238 - 1] & 0xFF) << 8) + (this.aByteArray52[this.anInt5238 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "(BI)I")
	public final int method4418(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = Static60.method1382(this.aByteArray52, this.anInt5238, arg0);
		this.method4421(local18);
		return local18;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIZ[B)V")
	public final void method4419(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = arg0 - 1; local7 >= 0; local7--) {
			arg1[local7] = (byte) (this.aByteArray52[this.anInt5238++] - 128);
		}
	}

	@OriginalMember(owner = "client!io", name = "l", descriptor = "(II)V")
	public final void method4420(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt5238++] = (byte) arg0;
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 24);
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!io", name = "m", descriptor = "(II)V")
	public final void method4421(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 24);
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt5238++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!io", name = "e", descriptor = "(BI)V")
	public final void method4422(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt5238++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!io", name = "n", descriptor = "(II)V")
	public final void method4423(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt5238 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt5238 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!io", name = "q", descriptor = "(I)I")
	public final int method4424() {
		this.anInt5238 += 2;
		return (this.aByteArray52[this.anInt5238 - 1] - 128 & 0xFF) + ((this.aByteArray52[this.anInt5238 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "([BIII)V")
	public final void method4425(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = this.aByteArray52[this.anInt5238++];
		}
	}

	@OriginalMember(owner = "client!io", name = "r", descriptor = "(I)I")
	public final int method4426() {
		this.anInt5238 += 2;
		return (this.aByteArray52[this.anInt5238 - 1] & 0xFF) + ((this.aByteArray52[this.anInt5238 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!io", name = "s", descriptor = "(I)I")
	public final int method4427() {
		@Pc(16) int local16 = this.aByteArray52[this.anInt5238] & 0xFF;
		return local16 < 128 ? this.method4393() : this.method4426() - 32768;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIJ)V")
	public final void method4428(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(10) int local10 = arg0 - 1;
		if (local10 < 0 || local10 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(25) int local25 = local10 * 8; local25 >= 0; local25 -= 8) {
			this.aByteArray52[this.anInt5238++] = (byte) (arg1 >> local25);
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "([IIII)V")
	public final void method4429(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt5238;
		this.anInt5238 = 5;
		@Pc(25) int local25 = (arg1 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = this.method4371();
			@Pc(37) int local37 = this.method4371();
			@Pc(39) int local39 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= local39 + arg0[local39 >>> 11 & 0x57C00003] ^ local33 + (local33 >>> 5 ^ local33 << 4);
				local39 -= -1640531527;
				local33 -= (local37 >>> 5 ^ local37 << 4) + local37 ^ arg0[local39 & 0x3] + local39;
			}
			this.anInt5238 -= 8;
			this.method4421(local33);
			this.method4421(local37);
		}
		this.anInt5238 = local8;
	}

	@OriginalMember(owner = "client!io", name = "t", descriptor = "(I)I")
	public final int method4430() {
		this.anInt5238 += 2;
		@Pc(40) int local40 = ((this.aByteArray52[this.anInt5238 - 2] & 0xFF) << 8) + (this.aByteArray52[this.anInt5238 - 1] - 128 & 0xFF);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!io", name = "u", descriptor = "(I)I")
	public final int method4431() {
		this.anInt5238 += 4;
		return ((this.aByteArray52[this.anInt5238 - 1] & 0xFF) << 24) + ((this.aByteArray52[this.anInt5238 - 2] & 0xFF) << 16) + ((this.aByteArray52[this.anInt5238 - 3] & 0xFF) << 8) + (this.aByteArray52[this.anInt5238 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!io", name = "v", descriptor = "(I)B")
	public final byte method4432() {
		return this.aByteArray52[this.anInt5238++];
	}

	@OriginalMember(owner = "client!io", name = "w", descriptor = "(I)B")
	public final byte method4433() {
		return (byte) (this.aByteArray52[this.anInt5238++] - 128);
	}

	@OriginalMember(owner = "client!io", name = "x", descriptor = "(I)I")
	public final int method4434() {
		@Pc(11) int local11 = this.aByteArray52[this.anInt5238] & 0xFF;
		return local11 >= 128 ? this.method4426() - 49152 : this.method4393() + -64;
	}

	@OriginalMember(owner = "client!io", name = "y", descriptor = "(I)I")
	public final int method4435() {
		this.anInt5238 += 4;
		return ((this.aByteArray52[this.anInt5238 - 1] & 0xFF) << 24) - (-(this.aByteArray52[this.anInt5238 - 2] << 16 & 0xFF0000) - (this.aByteArray52[this.anInt5238 - 3] << 8 & 0xFF00) - (this.aByteArray52[this.anInt5238 + -4] & 0xFF));
	}

	@OriginalMember(owner = "client!io", name = "o", descriptor = "(II)V")
	public final void method4436(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4378(arg0 >>> 28 | 0x80);
					}
					this.method4378(arg0 >>> 21 | 0x80);
				}
				this.method4378(arg0 >>> 14 | 0x80);
			}
			this.method4378(arg0 >>> 7 | 0x80);
		}
		this.method4378(arg0 & 0x7F);
	}
}

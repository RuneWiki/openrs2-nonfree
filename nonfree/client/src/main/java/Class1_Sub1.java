import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "[B")
	public byte[] aByteArray66;

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
	public int anInt5056;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(I)V")
	public Class1_Sub1(@OriginalArg(0) int arg0) {
		this.aByteArray66 = Static356.method4897(arg0);
		this.anInt5056 = 0;
	}

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1(@OriginalArg(0) byte[] arg0) {
		this.aByteArray66 = arg0;
		this.anInt5056 = 0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)I")
	public final int method4086() {
		return 128 - this.aByteArray66[this.anInt5056++] & 0xFF;
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)I")
	public final int method4087() {
		this.anInt5056 += 4;
		return (this.aByteArray66[this.anInt5056 - 1] & 0xFF) + ((this.aByteArray66[this.anInt5056 - 4] & 0xFF) << 24) + ((this.aByteArray66[this.anInt5056 + -3] & 0xFF) << 16) + ((this.aByteArray66[this.anInt5056 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)I")
	public final int method4088() {
		this.anInt5056 += 2;
		return ((this.aByteArray66[this.anInt5056 - 1] & 0xFF) << 8) + (this.aByteArray66[this.anInt5056 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)I")
	public final int method4089() {
		this.anInt5056 += 2;
		@Pc(41) int local41 = (this.aByteArray66[this.anInt5056 - 1] - 128 & 0xFF) + ((this.aByteArray66[this.anInt5056 - 2] & 0xFF) << 8);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)B")
	public final byte method4090() {
		return (byte) (this.aByteArray66[this.anInt5056++] - 128);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)V")
	public final void method4091(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt5056 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt5056 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(IB)V")
	public final void method4092(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(B)I")
	public final int method4093() {
		this.anInt5056 += 2;
		return ((this.aByteArray66[this.anInt5056 - 2] & 0xFF) << 8) + (this.aByteArray66[this.anInt5056 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)J")
	public final long method4094() {
		@Pc(17) long local17 = (long) this.method4087() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method4087() & 0xFFFFFFFFL;
		return local24 + (local17 << 32);
	}

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)I")
	public final int method4095() {
		this.anInt5056 += 2;
		return (this.aByteArray66[this.anInt5056 - 1] - 128 & 0xFF) + ((this.aByteArray66[this.anInt5056 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)I")
	public final int method4096() {
		@Pc(18) int local18 = this.aByteArray66[this.anInt5056] & 0xFF;
		return local18 < 128 ? this.method4130() : this.method4093() - 32768;
	}

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)Ljava/lang/String;")
	public final String method4097() {
		if (this.aByteArray66[this.anInt5056] == 0) {
			this.anInt5056++;
			return null;
		} else {
			return this.method4137();
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
	public final void method4098(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt5056++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "(B)I")
	public final int method4099() {
		this.anInt5056 += 3;
		return ((this.aByteArray66[this.anInt5056 - 3] & 0xFF) << 16) - (-((this.aByteArray66[this.anInt5056 - 1] & 0xFF) << 8) - (this.aByteArray66[this.anInt5056 - 2] & 0xFF));
	}

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "(I)I")
	public final int method4100() {
		this.anInt5056 += 2;
		@Pc(31) int local31 = (this.aByteArray66[this.anInt5056 - 1] & 0xFF) + ((this.aByteArray66[this.anInt5056 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)V")
	public final void method4101(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt5056++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "([BIII)V")
	public final void method4102(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = this.aByteArray66[this.anInt5056++];
		}
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(II)V")
	public final void method4103(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 + 128);
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method4104(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt5056 += Static30.method499(this.aByteArray66, arg0, arg0.length(), this.anInt5056);
		this.aByteArray66[this.anInt5056++] = 0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)V")
	public final void method4105(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 24);
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt5056++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)V")
	public final void method4106(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt5056++] = (byte) arg0;
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(JB)V")
	public final void method4107(@OriginalArg(0) long arg0) {
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 56);
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 48);
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 40);
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 32);
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 24);
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt5056++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "(I)I")
	public final int method4108() {
		@Pc(14) byte local14 = this.aByteArray66[this.anInt5056++];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local14 & 0x7F | local16) << 7;
			local14 = this.aByteArray66[this.anInt5056++];
		}
		return local16 | local14;
	}

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "(B)Ljava/lang/String;")
	public final String method4109() {
		@Pc(14) byte local14 = this.aByteArray66[this.anInt5056++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(24) int local24 = this.anInt5056;
		while (this.aByteArray66[this.anInt5056++] != 0) {
		}
		@Pc(48) int local48 = this.anInt5056 - local24 - 1;
		return local48 == 0 ? "" : Static365.method5027(this.aByteArray66, local24, local48);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[BII)V")
	public final void method4110(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0; local8++) {
			this.aByteArray66[this.anInt5056++] = arg1[local8];
		}
	}

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "(B)I")
	public final int method4111() {
		this.anInt5056 += 2;
		@Pc(31) int local31 = ((this.aByteArray66[this.anInt5056 - 1] & 0xFF) << 8) + (this.aByteArray66[this.anInt5056 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "(B)B")
	public final byte method4112() {
		return this.aByteArray66[this.anInt5056++];
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)V")
	public final void method4113(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4115(arg0 >>> 28 | 0x80);
					}
					this.method4115(arg0 >>> 21 | 0x80);
				}
				this.method4115(arg0 >>> 14 | 0x80);
			}
			this.method4115(arg0 >>> 7 | 0x80);
		}
		this.method4115(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "(B)Z")
	public final boolean method4114() {
		this.anInt5056 -= 4;
		@Pc(26) int local26 = Static341.method4805(0, this.anInt5056, this.aByteArray66);
		@Pc(30) int local30 = this.method4087();
		return local26 == local30;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(IZ)V")
	public final void method4115(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt5056++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(II)V")
	public final void method4116(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt5056++] = (byte) arg0;
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 24);
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(IB)V")
	public final void method4117(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "(I)I")
	public final int method4118() {
		return -this.aByteArray66[this.anInt5056++] & 0xFF;
	}

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(II)V")
	public final void method4119(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt5056++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "(B)I")
	public final int method4120() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method4096();
		while (local11 == 32767) {
			local11 = this.method4096();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "(B)B")
	public final byte method4121() {
		return (byte) -this.aByteArray66[this.anInt5056++];
	}

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "(II)J")
	public final long method4122(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(27) int local27 = local2 * 8;
		@Pc(29) long local29 = 0L;
		while (local27 >= 0) {
			local29 |= ((long) this.aByteArray66[this.anInt5056++] & 0xFFL) << local27;
			local27 -= 8;
		}
		return local29;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II[II)V")
	public final void method4123(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) int local8 = this.anInt5056;
		this.anInt5056 = 5;
		@Pc(22) int local22 = (arg0 - 5) / 8;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(30) int local30 = this.method4087();
			@Pc(34) int local34 = this.method4087();
			@Pc(36) int local36 = -957401312;
			@Pc(40) int local40 = 32;
			while (local40-- > 0) {
				local34 -= local36 + arg1[local36 >>> 11 & 0x3E00003] ^ (local30 << 4 ^ local30 >>> 5) - -local30;
				local36 -= -1640531527;
				local30 -= local36 + arg1[local36 & 0x3] ^ local34 + (local34 << 4 ^ local34 >>> 5);
			}
			this.anInt5056 -= 8;
			this.method4105(local30);
			this.method4105(local34);
		}
		this.anInt5056 = local8;
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(Z)I")
	public final int method4124() {
		this.anInt5056 += 2;
		return ((this.aByteArray66[this.anInt5056 - 1] & 0xFF) << 8) + (this.aByteArray66[this.anInt5056 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(BI)V")
	public final void method4125(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt5056++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "(I)I")
	public final int method4126() {
		this.anInt5056 += 4;
		return ((this.aByteArray66[this.anInt5056 - 1] & 0xFF) << 8) + ((this.aByteArray66[this.anInt5056 - 3] & 0xFF) << 24) + ((this.aByteArray66[this.anInt5056 - 4] & 0xFF) << 16) + (this.aByteArray66[this.anInt5056 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "(II)V")
	public final void method4127(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 24);
		this.aByteArray66[this.anInt5056++] = (byte) arg0;
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "(B)B")
	public final byte method4128() {
		return (byte) (128 - this.aByteArray66[this.anInt5056++]);
	}

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "(I)I")
	public final int method4129() {
		return this.aByteArray66[this.anInt5056++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "(I)I")
	public final int method4130() {
		return this.aByteArray66[this.anInt5056++] & 0xFF;
	}

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "(I)I")
	public final int method4131() {
		@Pc(16) int local16 = this.aByteArray66[this.anInt5056] & 0xFF;
		return local16 < 128 ? this.method4130() - 64 : this.method4093() - 49152;
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(BI)V")
	public final void method4132(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt5056++] = (byte) arg0;
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "(I)I")
	public final int method4133() {
		this.anInt5056 += 4;
		return ((this.aByteArray66[this.anInt5056 - 4] & 0xFF) << 8) + ((this.aByteArray66[this.anInt5056 - 2] << 24 & 0xFF000000) + ((this.aByteArray66[this.anInt5056 - 1] & 0xFF) << 16)) + (this.aByteArray66[this.anInt5056 - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "(I)I")
	public final int method4134() {
		this.anInt5056 += 4;
		return ((this.aByteArray66[this.anInt5056 - 3] & 0xFF) << 8) + ((this.aByteArray66[this.anInt5056 - 2] & 0xFF) << 16) + ((this.aByteArray66[this.anInt5056 + -1] & 0xFF) << 24) + (this.aByteArray66[this.anInt5056 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(IB)I")
	public final int method4135(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static341.method4805(arg0, this.anInt5056, this.aByteArray66);
		this.method4105(local16);
		return local16;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(JIB)V")
	public final void method4136(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(21) int local21 = local2 * 8; local21 >= 0; local21 -= 8) {
			this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> local21);
		}
	}

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "(I)Ljava/lang/String;")
	public final String method4137() {
		@Pc(6) int local6 = this.anInt5056;
		while (this.aByteArray66[this.anInt5056++] != 0) {
		}
		@Pc(29) int local29 = this.anInt5056 - local6 - 1;
		return local29 == 0 ? "" : Static365.method5027(this.aByteArray66, local6, local29);
	}

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "(II)V")
	public final void method4138(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt5056 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(BI)V")
	public final void method4140(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt5056 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray66[this.anInt5056 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt5056 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt5056 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method4141(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt5056;
		this.anInt5056 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4102(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt5056 = 0;
		this.method4115(local31.length);
		this.method4110(local31.length, local31);
	}

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "(I)I")
	public final int method4142() {
		this.anInt5056 += 3;
		return ((this.aByteArray66[this.anInt5056 - 3] & 0xFF) << 16) + ((this.aByteArray66[this.anInt5056 - 2] & 0xFF) << 8) + (this.aByteArray66[this.anInt5056 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z[I)V")
	public final void method4143(@OriginalArg(1) int[] arg0) {
		@Pc(17) int local17 = this.anInt5056 / 8;
		this.anInt5056 = 0;
		for (@Pc(22) int local22 = 0; local22 < local17; local22++) {
			@Pc(28) int local28 = this.method4087();
			@Pc(32) int local32 = this.method4087();
			@Pc(34) int local34 = 0;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local28 += arg0[local34 & 0x3] + local34 ^ local32 + (local32 >>> 5 ^ local32 << 4);
				local34 += -1640531527;
				local32 += local34 + arg0[local34 >>> 11 & 0x47A00003] ^ (local28 >>> 5 ^ local28 << 4) + local28;
			}
			this.anInt5056 -= 8;
			this.method4105(local28);
			this.method4105(local32);
		}
	}

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "(II)V")
	public final void method4144(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt5056++] = (byte) arg0;
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "(II)V")
	public final void method4145(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4115(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4101(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(BI)V")
	public final void method4146(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt5056++] = (byte) arg0;
		this.aByteArray66[this.anInt5056++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I[BII)V")
	public final void method4147(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
			arg1[local15] = (byte) (this.aByteArray66[this.anInt5056++] - 128);
		}
	}
}

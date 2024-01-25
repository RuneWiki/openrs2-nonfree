import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
	public int anInt4807;

	@OriginalMember(owner = "client!dg", name = "Eb", descriptor = "[B")
	public byte[] aByteArray57;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(I)V")
	public Class2_Sub10(@OriginalArg(0) int arg0) {
		this.anInt4807 = 0;
		this.aByteArray57 = Static182.method3301(arg0);
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "([B)V")
	public Class2_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray57 = arg0;
		this.anInt4807 = 0;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)I")
	public final int method4403() {
		return 128 - this.aByteArray57[this.anInt4807++] & 0xFF;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
	public final void method4404(@OriginalArg(1) int arg0) {
		this.aByteArray57[this.anInt4807++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method4405(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt4807;
		this.anInt4807 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4417(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(35) BigInteger local35 = local23.modPow(arg0, arg1);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt4807 = 0;
		this.method4430(local38.length);
		this.method4418(local38, local38.length);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[I)V")
	public final void method4406(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.anInt4807 / 8;
		this.anInt4807 = 0;
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			@Pc(23) int local23 = this.method4444();
			@Pc(27) int local27 = this.method4444();
			@Pc(29) int local29 = 0;
			@Pc(33) int local33 = 32;
			while (local33-- > 0) {
				local23 += (local27 >>> 5 ^ local27 << 4) + local27 ^ local29 - -arg0[local29 & 0x3];
				local29 += -1640531527;
				local27 += local23 + (local23 >>> 5 ^ local23 << 4) ^ local29 - -arg0[local29 >>> 11 & 0x3];
			}
			this.anInt4807 -= 8;
			this.method4450(local23);
			this.method4450(local27);
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)V")
	public final void method4407(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4430(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4452(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(B)Ljava/lang/String;")
	public final String method4408() {
		@Pc(14) byte local14 = this.aByteArray57[this.anInt4807++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(24) int local24 = this.anInt4807;
		while (this.aByteArray57[this.anInt4807++] != 0) {
		}
		@Pc(49) int local49 = this.anInt4807 - local24 - 1;
		return local49 == 0 ? "" : Static161.method3040(local49, local24, this.aByteArray57);
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public final String method4409() {
		@Pc(6) int local6 = this.anInt4807;
		while (this.aByteArray57[this.anInt4807++] != 0) {
		}
		@Pc(26) int local26 = this.anInt4807 - local6 - 1;
		return local26 == 0 ? "" : Static161.method3040(local26, local6, this.aByteArray57);
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(II)V")
	public final void method4410(@OriginalArg(1) int arg0) {
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 8);
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(II)V")
	public final void method4411(@OriginalArg(0) int arg0) {
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 16);
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 24);
		this.aByteArray57[this.anInt4807++] = (byte) arg0;
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)V")
	public final void method4412(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4430(arg0 >>> 28 | 0x80);
					}
					this.method4430(arg0 >>> 21 | 0x80);
				}
				this.method4430(arg0 >>> 14 | 0x80);
			}
			this.method4430(arg0 >>> 7 | 0x80);
		}
		this.method4430(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)I")
	public final int method4413() {
		this.anInt4807 += 2;
		return ((this.aByteArray57[this.anInt4807 - 1] & 0xFF) << 8) + (this.aByteArray57[this.anInt4807 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)I")
	public final int method4414() {
		return this.aByteArray57[this.anInt4807++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(B)Ljava/lang/String;")
	public final String method4415() {
		if (this.aByteArray57[this.anInt4807] == 0) {
			this.anInt4807++;
			return null;
		} else {
			return this.method4409();
		}
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)I")
	public final int method4416() {
		this.anInt4807 += 4;
		return (this.aByteArray57[this.anInt4807 - 2] & 0xFF) + ((this.aByteArray57[this.anInt4807 - 3] & 0xFF) << 24) + ((this.aByteArray57[this.anInt4807 + -4] & 0xFF) << 16) + ((this.aByteArray57[this.anInt4807 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "([BIII)V")
	public final void method4417(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = this.aByteArray57[this.anInt4807++];
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "([BIII)V")
	public final void method4418(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			this.aByteArray57[this.anInt4807++] = arg0[local7];
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(BI)J")
	public final long method4419(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = arg0 - 1;
		if (local11 < 0 || local11 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(27) int local27 = local11 * 8;
		@Pc(29) long local29 = 0L;
		while (local27 >= 0) {
			local29 |= ((long) this.aByteArray57[this.anInt4807++] & 0xFFL) << local27;
			local27 -= 8;
		}
		return local29;
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)B")
	public final byte method4420() {
		return (byte) -this.aByteArray57[this.anInt4807++];
	}

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)I")
	public final int method4421() {
		return this.aByteArray57[this.anInt4807++] & 0xFF;
	}

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "(B)I")
	public final int method4422() {
		return -this.aByteArray57[this.anInt4807++] & 0xFF;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III[I)V")
	public final void method4423(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(12) int local12 = this.anInt4807;
		this.anInt4807 = 5;
		@Pc(22) int local22 = (arg0 - 5) / 8;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(30) int local30 = this.method4444();
			@Pc(34) int local34 = this.method4444();
			@Pc(36) int local36 = -957401312;
			@Pc(40) int local40 = 32;
			while (local40-- > 0) {
				local34 -= local30 + (local30 >>> 5 ^ local30 << 4) ^ arg1[local36 >>> 11 & 0x3] + local36;
				local36 -= -1640531527;
				local30 -= arg1[local36 & 0x3] + local36 ^ local34 + (local34 >>> 5 ^ local34 << 4);
			}
			this.anInt4807 -= 8;
			this.method4450(local30);
			this.method4450(local34);
		}
		this.anInt4807 = local12;
	}

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)I")
	public final int method4424() {
		@Pc(18) int local18 = this.aByteArray57[this.anInt4807] & 0xFF;
		return local18 < 128 ? this.method4421() - 64 : this.method4464() + -49152;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(Z)I")
	public final int method4425() {
		this.anInt4807 += 2;
		@Pc(38) int local38 = ((this.aByteArray57[this.anInt4807 - 2] & 0xFF) << 8) + (this.aByteArray57[this.anInt4807 - 1] - 128 & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BII[B)V")
	public final void method4426(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = arg0 - 1; local7 >= 0; local7--) {
			arg1[local7] = this.aByteArray57[this.anInt4807++];
		}
	}

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "(B)I")
	public final int method4427() {
		this.anInt4807 += 4;
		return (this.aByteArray57[this.anInt4807 - 4] & 0xFF) + ((this.aByteArray57[this.anInt4807 - 2] & 0xFF) << 16) + ((this.aByteArray57[this.anInt4807 - 1] & 0xFF) << 24) + ((this.aByteArray57[this.anInt4807 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "(I)I")
	public final int method4429() {
		@Pc(16) byte local16 = this.aByteArray57[this.anInt4807++];
		@Pc(23) int local23 = 0;
		while (local16 < 0) {
			local23 = (local16 & 0x7F | local23) << 7;
			local16 = this.aByteArray57[this.anInt4807++];
		}
		return local23 | local16;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V")
	public final void method4430(@OriginalArg(0) int arg0) {
		this.aByteArray57[this.anInt4807++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(II)V")
	public final void method4431(@OriginalArg(1) int arg0) {
		this.aByteArray57[this.anInt4807 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "(I)I")
	public final int method4432() {
		this.anInt4807 += 2;
		return ((this.aByteArray57[this.anInt4807 - 1] & 0xFF) << 8) + (this.aByteArray57[this.anInt4807 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "(B)I")
	public final int method4433() {
		this.anInt4807 += 2;
		@Pc(38) int local38 = ((this.aByteArray57[this.anInt4807 - 1] & 0xFF) << 8) + (this.aByteArray57[this.anInt4807 - 2] - 128 & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)V")
	public final void method4434(@OriginalArg(0) int arg0) {
		this.aByteArray57[this.anInt4807++] = (byte) arg0;
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 8);
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 16);
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "(II)V")
	public final void method4435(@OriginalArg(1) int arg0) {
		this.aByteArray57[this.anInt4807++] = (byte) arg0;
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(Z)B")
	public final byte method4436() {
		return this.aByteArray57[this.anInt4807++];
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(Z)I")
	public final int method4437() {
		this.anInt4807 += 2;
		return (this.aByteArray57[this.anInt4807 - 1] - 128 & 0xFF) + ((this.aByteArray57[this.anInt4807 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "(Z)Z")
	public final boolean method4439() {
		this.anInt4807 -= 4;
		@Pc(22) int local22 = Static285.method5105(this.anInt4807, 0, this.aByteArray57);
		@Pc(26) int local26 = this.method4444();
		return local22 == local26;
	}

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "(I)I")
	public final int method4441() {
		@Pc(18) int local18 = this.aByteArray57[this.anInt4807] & 0xFF;
		return local18 >= 128 ? this.method4464() - 32768 : this.method4421();
	}

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "(II)I")
	public final int method4442(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static285.method5105(this.anInt4807, arg0, this.aByteArray57);
		this.method4450(local11);
		return local11;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public final void method4443(@OriginalArg(0) String arg0) {
		@Pc(14) int local14 = arg0.indexOf(0);
		if (local14 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local14 + " - cannot pjstr");
		}
		this.anInt4807 += Static97.method5916(arg0, this.anInt4807, this.aByteArray57, arg0.length());
		this.aByteArray57[this.anInt4807++] = 0;
	}

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "(I)I")
	public final int method4444() {
		this.anInt4807 += 4;
		return ((this.aByteArray57[this.anInt4807 - 2] & 0xFF) << 8) + (((this.aByteArray57[this.anInt4807 - 3] & 0xFF) << 16) + ((this.aByteArray57[this.anInt4807 - 4] & 0xFF) << 24) + (this.aByteArray57[this.anInt4807 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(IB)V")
	public final void method4445(@OriginalArg(0) int arg0) {
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 16);
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 8);
		this.aByteArray57[this.anInt4807++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(IZ)V")
	public final void method4446(@OriginalArg(0) int arg0) {
		this.aByteArray57[this.anInt4807++] = (byte) arg0;
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 8);
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 16);
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "(I)J")
	public final long method4447() {
		@Pc(10) long local10 = (long) this.method4444() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method4444() & 0xFFFFFFFFL;
		return (local10 << 32) + local17;
	}

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "(Z)I")
	public final int method4448() {
		@Pc(13) int local13 = 0;
		@Pc(17) int local17;
		for (local17 = this.method4441(); local17 == 32767; local17 = this.method4441()) {
			local13 += 32767;
		}
		return local13 + local17;
	}

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "(Z)I")
	public final int method4449() {
		this.anInt4807 += 4;
		return ((this.aByteArray57[this.anInt4807 - 2] & 0xFF) << 24) + ((this.aByteArray57[this.anInt4807 - 1] & 0xFF) << 16) + ((this.aByteArray57[this.anInt4807 + -4] & 0xFF) << 8) + (this.aByteArray57[this.anInt4807 - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "(II)V")
	public final void method4450(@OriginalArg(0) int arg0) {
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 24);
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 16);
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 8);
		this.aByteArray57[this.anInt4807++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(BI)V")
	public final void method4451(@OriginalArg(1) int arg0) {
		this.aByteArray57[this.anInt4807 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray57[this.anInt4807 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray57[this.anInt4807 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray57[this.anInt4807 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(IZ)V")
	public final void method4452(@OriginalArg(0) int arg0) {
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 8);
		this.aByteArray57[this.anInt4807++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(IB)V")
	public final void method4453(@OriginalArg(0) int arg0) {
		this.aByteArray57[this.anInt4807++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIJ)V")
	public final void method4455(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(27) int local27 = local6 * 8; local27 >= 0; local27 -= 8) {
			this.aByteArray57[this.anInt4807++] = (byte) (arg1 >> local27);
		}
	}

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "(II)V")
	public final void method4456(@OriginalArg(0) int arg0) {
		this.aByteArray57[this.anInt4807++] = (byte) arg0;
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "(II)V")
	public final void method4457(@OriginalArg(0) int arg0) {
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 8);
		this.aByteArray57[this.anInt4807++] = (byte) arg0;
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 24);
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "(II)V")
	public final void method4458(@OriginalArg(1) int arg0) {
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "(II)V")
	public final void method4459(@OriginalArg(0) int arg0) {
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 + 128);
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "(I)I")
	public final int method4460() {
		this.anInt4807 += 2;
		@Pc(36) int local36 = (this.aByteArray57[this.anInt4807 - 1] & 0xFF) + ((this.aByteArray57[this.anInt4807 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(JI)V")
	public final void method4462(@OriginalArg(0) long arg0) {
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 56);
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 48);
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 40);
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 32);
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 24);
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 16);
		this.aByteArray57[this.anInt4807++] = (byte) (arg0 >> 8);
		this.aByteArray57[this.anInt4807++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "(Z)I")
	public final int method4463() {
		this.anInt4807 += 3;
		return ((this.aByteArray57[this.anInt4807 - 3] & 0xFF) << 16) - (-(this.aByteArray57[this.anInt4807 - 2] << 8 & 0xFF00) - (this.aByteArray57[this.anInt4807 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "(B)I")
	public final int method4464() {
		this.anInt4807 += 2;
		return (this.aByteArray57[this.anInt4807 - 1] & 0xFF) + ((this.aByteArray57[this.anInt4807 - 2] & 0xFF) << 8);
	}
}

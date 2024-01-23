import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!k", name = "R", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!k", name = "Fb", descriptor = "I")
	public int anInt4860;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I)V")
	public Class1_Sub16(@OriginalArg(0) int arg0) {
		this.aByteArray62 = Static48.method834(arg0);
		this.anInt4860 = 0;
	}

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "([B)V")
	public Class1_Sub16(@OriginalArg(0) byte[] arg0) {
		this.aByteArray62 = arg0;
		this.anInt4860 = 0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)V")
	public final void method3760(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 + 128);
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(BI)V")
	public final void method3761(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 16);
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt4860++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!k", name = "e", descriptor = "(I)I")
	public final int method3762() {
		this.anInt4860 += 3;
		return (this.aByteArray62[this.anInt4860 - 2] & 0xFF) + ((this.aByteArray62[this.anInt4860 - 1] & 0xFF) << 8) + ((this.aByteArray62[this.anInt4860 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(B)I")
	public final int method3763() {
		return -this.aByteArray62[this.anInt4860++] & 0xFF;
	}

	@OriginalMember(owner = "client!k", name = "f", descriptor = "(I)I")
	public final int method3764() {
		this.anInt4860 += 4;
		return (this.aByteArray62[this.anInt4860 - 2] & 0xFF) + ((this.aByteArray62[this.anInt4860 - 1] & 0xFF) << 8) + ((this.aByteArray62[this.anInt4860 + -4] & 0xFF) << 16) + ((this.aByteArray62[this.anInt4860 - 3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(II)V")
	public final void method3765(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt4860++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!k", name = "g", descriptor = "(I)I")
	public final int method3766() {
		this.anInt4860 += 2;
		@Pc(38) int local38 = (this.aByteArray62[this.anInt4860 - 2] - 128 & 0xFF) + ((this.aByteArray62[this.anInt4860 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(JII)V")
	public final void method3767(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(22) int local22 = local6 * 8; local22 >= 0; local22 -= 8) {
			this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> local22);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BI[II)V")
	public final void method3768(@OriginalArg(2) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(4) int local4 = this.anInt4860;
		this.anInt4860 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(25) int local25 = 0; local25 < local18; local25++) {
			@Pc(31) int local31 = this.method3784();
			@Pc(37) int local37 = this.method3784();
			@Pc(41) int local41 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= local31 + (local31 << 4 ^ local31 >>> 5) ^ arg0[local41 >>> 11 & 0xD4C00003] + local41;
				local41 -= -1640531527;
				local31 -= arg0[local41 & 0x3] + local41 ^ local37 + (local37 >>> 5 ^ local37 << 4);
			}
			this.anInt4860 -= 8;
			this.method3808(local31);
			this.method3808(local37);
		}
		this.anInt4860 = local4;
	}

	@OriginalMember(owner = "client!k", name = "h", descriptor = "(I)I")
	public final int method3769() {
		this.anInt4860 += 4;
		return ((this.aByteArray62[this.anInt4860 - 4] & 0xFF) << 8) + ((this.aByteArray62[this.anInt4860 - 1] & 0xFF) << 16) + ((this.aByteArray62[this.anInt4860 - 2] & 0xFF) << 24) + (this.aByteArray62[this.anInt4860 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!k", name = "j", descriptor = "(I)I")
	public final int method3771() {
		return 128 - this.aByteArray62[this.anInt4860++] & 0xFF;
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(II)V")
	public final void method3772(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 16);
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 24);
		this.aByteArray62[this.anInt4860++] = (byte) arg0;
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!k", name = "k", descriptor = "(I)I")
	public final int method3773() {
		@Pc(16) byte local16 = this.aByteArray62[this.anInt4860++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local16 & 0x7F | local18) << 7;
			local16 = this.aByteArray62[this.anInt4860++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II[BI)V")
	public final void method3774(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray62[this.anInt4860++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!k", name = "e", descriptor = "(II)V")
	public final void method3775(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method3765(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method3807(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!k", name = "l", descriptor = "(I)B")
	public final byte method3777() {
		return (byte) -this.aByteArray62[this.anInt4860++];
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(BI)V")
	public final void method3778(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt4860++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "([BIBI)V")
	public final void method3779(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (this.aByteArray62[this.anInt4860++] - 128);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method3780(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt4860;
		this.anInt4860 = 0;
		@Pc(17) byte[] local17 = new byte[local2];
		this.method3792(local17, local2);
		@Pc(28) BigInteger local28 = new BigInteger(local17);
		@Pc(33) BigInteger local33 = local28.modPow(arg1, arg0);
		@Pc(36) byte[] local36 = local33.toByteArray();
		this.anInt4860 = 0;
		this.method3765(local36.length);
		this.method3774(local36.length, local36);
	}

	@OriginalMember(owner = "client!k", name = "m", descriptor = "(I)Lclient!ia;")
	public final Class51 method3781() {
		@Pc(6) int local6 = this.anInt4860;
		while (this.aByteArray62[this.anInt4860++] != 0) {
		}
		return Static191.method3197(this.anInt4860 - local6 - 1, local6, this.aByteArray62);
	}

	@OriginalMember(owner = "client!k", name = "f", descriptor = "(II)I")
	public final int method3782(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static2.method61(this.anInt4860, this.aByteArray62, arg0);
		this.method3808(local11);
		return local11;
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(B)I")
	public final int method3783() {
		this.anInt4860 += 2;
		return (this.aByteArray62[this.anInt4860 - 2] & 0xFF) + ((this.aByteArray62[this.anInt4860 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!k", name = "n", descriptor = "(I)I")
	public final int method3784() {
		this.anInt4860 += 4;
		return ((this.aByteArray62[this.anInt4860 - 2] & 0xFF) << 8) + ((this.aByteArray62[this.anInt4860 - 3] & 0xFF) << 16) + ((this.aByteArray62[this.anInt4860 - 4] & 0xFF) << 24) + (this.aByteArray62[this.anInt4860 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!k", name = "o", descriptor = "(I)B")
	public final byte method3785() {
		return (byte) (128 - this.aByteArray62[this.anInt4860++]);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZJ)V")
	public final void method3786(@OriginalArg(1) long arg0) {
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 56);
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 48);
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 40);
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 32);
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 24);
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 16);
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt4860++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(B)I")
	public final int method3787() {
		return this.aByteArray62[this.anInt4860++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!k", name = "p", descriptor = "(I)I")
	public final int method3788() {
		@Pc(7) int local7 = this.aByteArray62[this.anInt4860] & 0xFF;
		return local7 >= 128 ? this.method3805() - 49152 : this.method3793() + -64;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IZ)V")
	public final void method3789(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt4860++] = (byte) arg0;
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(BI)V")
	public final void method3790(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!k", name = "q", descriptor = "(I)J")
	public final long method3791() {
		@Pc(15) long local15 = (long) this.method3784() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method3784() & 0xFFFFFFFFL;
		return local22 + (local15 << 32);
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "([BIBI)V")
	public final void method3792(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			arg0[local14] = this.aByteArray62[this.anInt4860++];
		}
	}

	@OriginalMember(owner = "client!k", name = "e", descriptor = "(B)I")
	public final int method3793() {
		return this.aByteArray62[this.anInt4860++] & 0xFF;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)I")
	public final int method3794() {
		this.anInt4860 += 2;
		return ((this.aByteArray62[this.anInt4860 - 2] & 0xFF) << 8) + (this.aByteArray62[this.anInt4860 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!k", name = "r", descriptor = "(I)I")
	public final int method3795() {
		@Pc(3) int local3 = 0;
		@Pc(12) int local12 = this.method3797();
		while (local12 == 32767) {
			local12 = this.method3797();
			local3 += 32767;
		}
		return local3 + local12;
	}

	@OriginalMember(owner = "client!k", name = "g", descriptor = "(II)V")
	public final void method3796(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!k", name = "s", descriptor = "(I)I")
	public final int method3797() {
		@Pc(7) int local7 = this.aByteArray62[this.anInt4860] & 0xFF;
		return local7 >= 128 ? this.method3805() - 32768 : this.method3793();
	}

	@OriginalMember(owner = "client!k", name = "f", descriptor = "(B)Lclient!ia;")
	public final Class51 method3799() {
		if (this.aByteArray62[this.anInt4860] == 0) {
			this.anInt4860++;
			return null;
		} else {
			return this.method3781();
		}
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(Z)B")
	public final byte method3800() {
		return (byte) (this.aByteArray62[this.anInt4860++] - 128);
	}

	@OriginalMember(owner = "client!k", name = "g", descriptor = "(B)B")
	public final byte method3802() {
		return this.aByteArray62[this.anInt4860++];
	}

	@OriginalMember(owner = "client!k", name = "t", descriptor = "(I)I")
	public final int method3804() {
		this.anInt4860 += 4;
		return ((this.aByteArray62[this.anInt4860 - 2] & 0xFF) << 16) + ((this.aByteArray62[this.anInt4860 - 1] << 24 & 0xFF000000) + ((this.aByteArray62[this.anInt4860 - 3] & 0xFF) << 8) + (this.aByteArray62[this.anInt4860 + -4] & 0xFF));
	}

	@OriginalMember(owner = "client!k", name = "u", descriptor = "(I)I")
	public final int method3805() {
		this.anInt4860 += 2;
		return (this.aByteArray62[this.anInt4860 - 1] & 0xFF) + ((this.aByteArray62[this.anInt4860 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!k", name = "h", descriptor = "(B)I")
	public final int method3806() {
		this.anInt4860 += 3;
		return (this.aByteArray62[this.anInt4860 - 1] & 0xFF) + (((this.aByteArray62[this.anInt4860 - 3] & 0xFF) << 16) + ((this.aByteArray62[this.anInt4860 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!k", name = "h", descriptor = "(II)V")
	public final void method3807(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt4860++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!k", name = "i", descriptor = "(II)V")
	public final void method3808(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 24);
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 16);
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt4860++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!k", name = "v", descriptor = "(I)I")
	public final int method3809() {
		this.anInt4860 += 2;
		return ((this.aByteArray62[this.anInt4860 - 1] & 0xFF) << 8) + (this.aByteArray62[this.anInt4860 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!ia;I)V")
	public final void method3810(@OriginalArg(0) Class51 arg0) {
		this.anInt4860 += arg0.method1407(this.aByteArray62, this.anInt4860, arg0.method1399());
		this.aByteArray62[this.anInt4860++] = 0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI)V")
	public final void method3811(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method3765(arg0 >>> 28 | 0x80);
					}
					this.method3765(arg0 >>> 21 | 0x80);
				}
				this.method3765(arg0 >>> 14 | 0x80);
			}
			this.method3765(arg0 >>> 7 | 0x80);
		}
		this.method3765(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)V")
	public final void method3812(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt4860 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray62[this.anInt4860 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray62[this.anInt4860 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt4860 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(IB)V")
	public final void method3813(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt4860++] = (byte) arg0;
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 16);
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method3814(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(7) int local7 = this.method3793();
		@Pc(10) byte[] local10 = new byte[local7];
		this.method3792(local10, local7);
		@Pc(21) BigInteger local21 = new BigInteger(local10);
		@Pc(26) BigInteger local26 = local21.modPow(arg0, arg1);
		@Pc(29) byte[] local29 = local26.toByteArray();
		this.anInt4860 = 0;
		this.method3774(local29.length, local29);
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(IB)V")
	public final void method3815(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt4860++] = (byte) arg0;
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 24);
		this.aByteArray62[this.anInt4860++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!k", name = "j", descriptor = "(II)V")
	public final void method3816(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt4860 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!k", name = "w", descriptor = "(I)I")
	public final int method3817() {
		this.anInt4860 += 2;
		@Pc(38) int local38 = (this.aByteArray62[this.anInt4860 - 1] & 0xFF) + ((this.aByteArray62[this.anInt4860 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(II[BI)V")
	public final void method3819(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(15) int local15 = arg0 - 1; local15 >= 0; local15--) {
			arg1[local15] = this.aByteArray62[this.anInt4860++];
		}
	}

	@OriginalMember(owner = "client!k", name = "k", descriptor = "(II)J")
	public final long method3820(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(29) int local29 = local6 * 8;
		@Pc(31) long local31 = 0L;
		while (local29 >= 0) {
			local31 |= ((long) this.aByteArray62[this.anInt4860++] & 0xFFL) << local29;
			local29 -= 8;
		}
		return local31;
	}
}

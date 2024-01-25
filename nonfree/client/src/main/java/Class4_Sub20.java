import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public class Class4_Sub20 extends Class4 {

	@OriginalMember(owner = "client!wn", name = "nb", descriptor = "I")
	public int anInt5526;

	@OriginalMember(owner = "client!wn", name = "ab", descriptor = "[B")
	public byte[] aByteArray77;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(I)V")
	public Class4_Sub20(@OriginalArg(0) int arg0) {
		this.anInt5526 = 0;
		this.aByteArray77 = Static232.method3936(arg0);
	}

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "([B)V")
	public Class4_Sub20(@OriginalArg(0) byte[] arg0) {
		this.aByteArray77 = arg0;
		this.anInt5526 = 0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(JI)V")
	public final void method4556(@OriginalArg(0) long arg0) {
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 56);
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 48);
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 40);
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 32);
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt5526++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)I")
	public final int method4557() {
		@Pc(16) byte local16 = this.aByteArray77[this.anInt5526++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local16 & 0x7F | local18) << 7;
			local16 = this.aByteArray77[this.anInt5526++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V")
	public final void method4558(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt5526++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)Ljava/lang/String;")
	public final String method4559() {
		if (this.aByteArray77[this.anInt5526] == 0) {
			this.anInt5526++;
			return null;
		} else {
			return this.method4624();
		}
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)I")
	public final int method4560() {
		this.anInt5526 += 2;
		return ((this.aByteArray77[this.anInt5526 - 2] & 0xFF) << 8) + (this.aByteArray77[this.anInt5526 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(II)V")
	public final void method4561(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt5526++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(II)V")
	public final void method4562(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt5526++] = (byte) arg0;
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "(II)V")
	public final void method4563(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt5526 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt5526 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt5526 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt5526 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)I")
	public final int method4564() {
		this.anInt5526 += 4;
		return ((this.aByteArray77[this.anInt5526 - 3] & 0xFF) << 8) + (this.aByteArray77[this.anInt5526 - 1] << 24 & 0xFF000000) + ((this.aByteArray77[this.anInt5526 + -2] & 0xFF) << 16) + (this.aByteArray77[this.anInt5526 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BI)V")
	public final void method4565(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt5526++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I[BIB)V")
	public final void method4566(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = this.aByteArray77[this.anInt5526++];
		}
	}

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "(II)V")
	public final void method4567(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt5526 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "(I)B")
	public final byte method4568() {
		return (byte) -this.aByteArray77[this.anInt5526++];
	}

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "(I)Ljava/lang/String;")
	public final String method4569() {
		@Pc(14) byte local14 = this.aByteArray77[this.anInt5526++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(26) int local26 = this.method4557();
		if (this.aByteArray77.length < this.anInt5526 + local26) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(51) String local51 = Static95.method1837(this.aByteArray77, this.anInt5526, local26);
		this.anInt5526 += local26;
		return local51;
	}

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "(I)I")
	public final int method4570() {
		this.anInt5526 += 4;
		return (this.aByteArray77[this.anInt5526 - 2] & 0xFF) + ((this.aByteArray77[this.anInt5526 - 1] & 0xFF) << 8) + ((this.aByteArray77[this.anInt5526 + -4] & 0xFF) << 16) + ((this.aByteArray77[this.anInt5526 + -3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "(II)V")
	public final void method4571(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt5526++] = (byte) arg0;
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "([BIII)V")
	public final void method4572(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(15) int local15 = arg1 - 1; local15 >= 0; local15--) {
			arg0[local15] = this.aByteArray77[this.anInt5526++];
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III[I)V")
	public final void method4573(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt5526;
		this.anInt5526 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method4595();
			@Pc(30) int local30 = this.method4595();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= arg1[local32 >>> 11 & 0x59200003] + local32 ^ local26 + (local26 << 4 ^ local26 >>> 5);
				local32 -= -1640531527;
				local26 -= (local30 >>> 5 ^ local30 << 4) + local30 ^ local32 + arg1[local32 & 0x3];
			}
			this.anInt5526 -= 8;
			this.method4561(local26);
			this.method4561(local30);
		}
		this.anInt5526 = local8;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IB)I")
	public final int method4574(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static289.method4466(arg0, this.aByteArray77, this.anInt5526);
		this.method4561(local16);
		return local16;
	}

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "(I)I")
	public final int method4575() {
		@Pc(16) int local16 = this.aByteArray77[this.anInt5526] & 0xFF;
		return local16 < 128 ? this.method4614() : this.method4560() - 32768;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)B")
	public final byte method4576() {
		return this.aByteArray77[this.anInt5526++];
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZJI)V")
	public final void method4577(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(24) int local24 = local2 * 8; local24 >= 0; local24 -= 8) {
			this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> local24);
		}
	}

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "(B)B")
	public final byte method4578() {
		return (byte) (128 - this.aByteArray77[this.anInt5526++]);
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(IB)V")
	public final void method4579(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "(B)I")
	public final int method4580() {
		this.anInt5526 += 4;
		return ((this.aByteArray77[this.anInt5526 - 2] & 0xFF) << 24) + ((this.aByteArray77[this.anInt5526 - 1] & 0xFF) << 16) + ((this.aByteArray77[this.anInt5526 + -4] & 0xFF) << 8) + (this.aByteArray77[this.anInt5526 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "(II)V")
	public final void method4581(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt5526++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "(B)I")
	public final int method4582() {
		this.anInt5526 += 3;
		return (this.aByteArray77[this.anInt5526 - 1] & 0xFF) + ((this.aByteArray77[this.anInt5526 - 3] & 0xFF) << 16) + ((this.aByteArray77[this.anInt5526 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method4583(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt5526;
		this.anInt5526 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4566(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt5526 = 0;
		this.method4558(local31.length);
		this.method4600(local31, local31.length);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZI)J")
	public final long method4584(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 - 1;
		if (local7 < 0 || local7 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(26) int local26 = local7 * 8;
		@Pc(28) long local28 = 0L;
		while (local26 >= 0) {
			local28 |= ((long) this.aByteArray77[this.anInt5526++] & 0xFFL) << local26;
			local26 -= 8;
		}
		return local28;
	}

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "(II)V")
	public final void method4585(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt5526 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt5526 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "(B)I")
	public final int method4586() {
		this.anInt5526 += 2;
		@Pc(36) int local36 = ((this.aByteArray77[this.anInt5526 - 2] & 0xFF) << 8) + (this.aByteArray77[this.anInt5526 - 1] & 0xFF);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "(II)V")
	public final void method4587(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "(B)I")
	public final int method4589() {
		this.anInt5526 += 3;
		@Pc(50) int local50 = (this.aByteArray77[this.anInt5526 - 1] & 0xFF) + ((this.aByteArray77[this.anInt5526 - 2] & 0xFF) << 8) + ((this.aByteArray77[this.anInt5526 + -3] & 0xFF) << 16);
		if (local50 > 8388607) {
			local50 -= 16777216;
		}
		return local50;
	}

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "(II)V")
	public final void method4590(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt5526++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "(I)I")
	public final int method4591() {
		this.anInt5526 += 3;
		return (this.aByteArray77[this.anInt5526 - 2] & 0xFF) + ((this.aByteArray77[this.anInt5526 - 3] & 0xFF) << 16) + ((this.aByteArray77[this.anInt5526 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "(II)V")
	public final void method4593(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4590(arg0 >>> 28 | 0x80);
					}
					this.method4590(arg0 >>> 21 | 0x80);
				}
				this.method4590(arg0 >>> 14 | 0x80);
			}
			this.method4590(arg0 >>> 7 | 0x80);
		}
		this.method4590(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "(I)I")
	public final int method4594() {
		this.anInt5526 += 2;
		@Pc(41) int local41 = (this.aByteArray77[this.anInt5526 - 1] - 128 & 0xFF) + ((this.aByteArray77[this.anInt5526 - 2] & 0xFF) << 8);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "(I)I")
	public final int method4595() {
		this.anInt5526 += 4;
		return ((this.aByteArray77[this.anInt5526 - 2] & 0xFF) << 8) + (this.aByteArray77[this.anInt5526 - 4] << 24 & 0xFF000000) + ((this.aByteArray77[this.anInt5526 - 3] & 0xFF) << 16) + (this.aByteArray77[this.anInt5526 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!wn", name = "o", descriptor = "(I)I")
	public final int method4596() {
		this.anInt5526 += 2;
		@Pc(34) int local34 = ((this.aByteArray77[this.anInt5526 - 1] & 0xFF) << 8) + (this.aByteArray77[this.anInt5526 - 2] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "(I)Z")
	public final boolean method4597() {
		this.anInt5526 -= 4;
		@Pc(22) int local22 = Static289.method4466(0, this.aByteArray77, this.anInt5526);
		@Pc(26) int local26 = this.method4595();
		return local26 == local22;
	}

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "(II)V")
	public final void method4598(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt5526++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method4599(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt5526 += Static93.method1824(this.anInt5526, this.aByteArray77, arg0, arg0.length());
		this.aByteArray77[this.anInt5526++] = 0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "([BBII)V")
	public final void method4600(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			this.aByteArray77[this.anInt5526++] = arg0[local11];
		}
	}

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "(II)V")
	public final void method4601(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt5526++] = (byte) arg0;
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!wn", name = "q", descriptor = "(I)I")
	public final int method4602() {
		return this.aByteArray77[this.anInt5526++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!wn", name = "r", descriptor = "(I)J")
	public final long method4603() {
		@Pc(21) long local21 = (long) this.method4595() & 0xFFFFFFFFL;
		@Pc(28) long local28 = (long) this.method4595() & 0xFFFFFFFFL;
		return local28 + (local21 << 32);
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(IB)V")
	public final void method4604(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt5526++] = (byte) arg0;
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "(B)B")
	public final byte method4605() {
		return (byte) (this.aByteArray77[this.anInt5526++] - 128);
	}

	@OriginalMember(owner = "client!wn", name = "s", descriptor = "(I)I")
	public final int method4606() {
		this.anInt5526 += 2;
		return (this.aByteArray77[this.anInt5526 - 1] - 128 & 0xFF) + ((this.aByteArray77[this.anInt5526 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "(B)I")
	public final int method4607() {
		this.anInt5526 += 2;
		return (this.aByteArray77[this.anInt5526 - 2] - 128 & 0xFF) + ((this.aByteArray77[this.anInt5526 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "(II)V")
	public final void method4608(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt5526++] = (byte) arg0;
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!wn", name = "o", descriptor = "(II)V")
	public final void method4609(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4590(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4558(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(BI)V")
	public final void method4610(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 + 128);
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II[BI)V")
	public final void method4611(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (this.aByteArray77[this.anInt5526++] - 128);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public final String method4612() {
		@Pc(14) byte local14 = this.aByteArray77[this.anInt5526++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt5526;
		while (this.aByteArray77[this.anInt5526++] != 0) {
		}
		@Pc(51) int local51 = this.anInt5526 - local27 - 1;
		return local51 == 0 ? "" : Static268.method4311(local51, this.aByteArray77, local27);
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(BLjava/lang/String;)V")
	public final void method4613(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = Static236.method3986(arg0);
		this.aByteArray77[this.anInt5526++] = 0;
		this.method4593(local7);
		this.anInt5526 += Static439.method6008(this.aByteArray77, arg0, this.anInt5526);
	}

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "(B)I")
	public final int method4614() {
		return this.aByteArray77[this.anInt5526++] & 0xFF;
	}

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "(II)V")
	public final void method4615(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt5526++] = (byte) arg0;
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt5526++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!wn", name = "t", descriptor = "(I)I")
	public final int method4617() {
		return 128 - this.aByteArray77[this.anInt5526++] & 0xFF;
	}

	@OriginalMember(owner = "client!wn", name = "u", descriptor = "(I)I")
	public final int method4618() {
		return -this.aByteArray77[this.anInt5526++] & 0xFF;
	}

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "(B)I")
	public final int method4619() {
		@Pc(11) int local11 = this.aByteArray77[this.anInt5526] & 0xFF;
		return local11 >= 128 ? this.method4560() - 49152 : this.method4614() + -64;
	}

	@OriginalMember(owner = "client!wn", name = "v", descriptor = "(I)I")
	public final int method4620() {
		@Pc(14) int local14 = 0;
		@Pc(18) int local18;
		for (local18 = this.method4575(); local18 == 32767; local18 = this.method4575()) {
			local14 += 32767;
		}
		return local14 + local18;
	}

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "(B)I")
	public final int method4621() {
		@Pc(18) int local18 = Static289.method4466(0, this.aByteArray77, this.anInt5526);
		this.method4561(local18);
		return local18;
	}

	@OriginalMember(owner = "client!wn", name = "w", descriptor = "(I)I")
	public final int method4622() {
		this.anInt5526 += 2;
		@Pc(31) int local31 = (this.aByteArray77[this.anInt5526 - 2] & 0xFF) + ((this.aByteArray77[this.anInt5526 - 1] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!wn", name = "x", descriptor = "(I)I")
	public final int method4623() {
		this.anInt5526 += 2;
		return (this.aByteArray77[this.anInt5526 - 2] & 0xFF) + ((this.aByteArray77[this.anInt5526 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "(B)Ljava/lang/String;")
	public final String method4624() {
		@Pc(11) int local11 = this.anInt5526;
		while (this.aByteArray77[this.anInt5526++] != 0) {
		}
		@Pc(33) int local33 = this.anInt5526 - local11 - 1;
		return local33 == 0 ? "" : Static268.method4311(local33, this.aByteArray77, local11);
	}
}

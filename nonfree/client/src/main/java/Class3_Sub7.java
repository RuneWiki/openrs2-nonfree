import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
	public int anInt7869 = 0;

	@OriginalMember(owner = "client!fd", name = "ab", descriptor = "[B")
	public byte[] aByteArray86;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(I)V")
	public Class3_Sub7(@OriginalArg(0) int arg0) {
		this.aByteArray86 = Static393.method6279(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "([B)V")
	public Class3_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray86 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)I")
	public final int method6490() {
		this.anInt7869 += 4;
		return (this.aByteArray86[this.anInt7869 - 4] & 0xFF) + ((this.aByteArray86[this.anInt7869 - 1] & 0xFF) << 24) + ((this.aByteArray86[this.anInt7869 - 2] & 0xFF) << 16) + ((this.aByteArray86[this.anInt7869 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Ljava/lang/String;")
	public final String method6492() {
		@Pc(19) byte local19 = this.aByteArray86[this.anInt7869++];
		if (local19 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(30) int local30 = this.method6524();
		if (this.anInt7869 + local30 > this.aByteArray86.length) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(51) String local51 = Static229.method3922(this.aByteArray86, local30, this.anInt7869);
		this.anInt7869 += local30;
		return local51;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)V")
	public final void method6493(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt7869++] = (byte) arg0;
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)V")
	public final void method6494(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt7869++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)V")
	public final void method6495(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 24);
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt7869++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method6496(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = Static467.method7180(arg0);
		this.aByteArray86[this.anInt7869++] = 0;
		this.method6515(local7);
		this.anInt7869 += Static560.method8099(this.anInt7869, arg0, this.aByteArray86);
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)I")
	public final int method6497() {
		this.anInt7869 += 4;
		return (this.aByteArray86[this.anInt7869 - 1] & 0xFF) + ((this.aByteArray86[this.anInt7869 - 3] & 0xFF) << 16) + ((this.aByteArray86[this.anInt7869 + -4] & 0xFF) << 24) + ((this.aByteArray86[this.anInt7869 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)V")
	public final void method6498(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt7869++] = (byte) arg0;
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)V")
	public final void method6499(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt7869 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III[B)V")
	public final void method6500(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aByteArray86[this.anInt7869++] = arg1[local1];
		}
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "(I)I")
	public final int method6501() {
		this.anInt7869 += 2;
		@Pc(34) int local34 = ((this.aByteArray86[this.anInt7869 - 1] & 0xFF) << 8) + (this.aByteArray86[this.anInt7869 - 2] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)V")
	public final void method6502(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt7869++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IZ)V")
	public final void method6503(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "(I)I")
	public final int method6505() {
		return 128 - this.aByteArray86[this.anInt7869++] & 0xFF;
	}

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "(I)I")
	public final int method6506() {
		this.anInt7869 += 3;
		return ((this.aByteArray86[this.anInt7869 - 2] & 0xFF) << 8) + ((this.aByteArray86[this.anInt7869 - 3] & 0xFF) << 16) + (this.aByteArray86[this.anInt7869 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "(I)I")
	public final int method6507() {
		this.anInt7869 += 3;
		@Pc(48) int local48 = ((this.aByteArray86[this.anInt7869 - 3] & 0xFF) << 16) + (this.aByteArray86[this.anInt7869 - 2] << 8 & 0xFF00) + (this.aByteArray86[this.anInt7869 - 1] & 0xFF);
		if (local48 > 8388607) {
			local48 -= 16777216;
		}
		return local48;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[II)V")
	public final void method6508(@OriginalArg(2) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(10) int local10 = this.anInt7869;
		this.anInt7869 = 5;
		@Pc(19) int local19 = (arg1 - 5) / 8;
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(26) int local26 = this.method6497();
			@Pc(30) int local30 = this.method6497();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= arg0[local32 >>> 11 & 0x6E400003] + local32 ^ (local26 >>> 5 ^ local26 << 4) + local26;
				local32 -= -1640531527;
				local26 -= local32 + arg0[local32 & 0x3] ^ local30 + (local30 >>> 5 ^ local30 << 4);
			}
			this.anInt7869 -= 8;
			this.method6495(local26);
			this.method6495(local30);
		}
		this.anInt7869 = local10;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(BI)V")
	public final void method6509(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt7869++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IB)I")
	public final int method6510(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = Static567.method8160(this.anInt7869, arg0, this.aByteArray86);
		this.method6495(local17);
		return local17;
	}

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "(I)I")
	public final int method6511() {
		@Pc(11) int local11 = this.aByteArray86[this.anInt7869] & 0xFF;
		return local11 < 128 ? this.method6538() - 64 : this.method6535() + -49152;
	}

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "(I)Ljava/lang/String;")
	public final String method6512() {
		if (this.aByteArray86[this.anInt7869] == 0) {
			this.anInt7869++;
			return null;
		} else {
			return this.method6536();
		}
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(II)J")
	public final long method6513(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		if (local4 < 0 || local4 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(17) int local17 = local4 * 8;
		@Pc(19) long local19 = 0L;
		while (local17 >= 0) {
			local19 |= ((long) this.aByteArray86[this.anInt7869++] & 0xFFL) << local17;
			local17 -= 8;
		}
		return local19;
	}

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "(I)Ljava/lang/String;")
	public final String method6514() {
		@Pc(14) byte local14 = this.aByteArray86[this.anInt7869++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(24) int local24 = this.anInt7869;
		while (this.aByteArray86[this.anInt7869++] != 0) {
		}
		@Pc(47) int local47 = this.anInt7869 - local24 - 1;
		return local47 == 0 ? "" : Static456.method7058(this.aByteArray86, local47, local24);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(ZI)V")
	public final void method6515(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method6494(arg0 >>> 28 | 0x80);
					}
					this.method6494(arg0 >>> 21 | 0x80);
				}
				this.method6494(arg0 >>> 14 | 0x80);
			}
			this.method6494(arg0 >>> 7 | 0x80);
		}
		this.method6494(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method6516(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.indexOf(0);
		if (local13 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local13 + " - cannot pjstr");
		}
		this.anInt7869 += Static245.method4434(arg0.length(), this.aByteArray86, arg0, this.anInt7869);
		this.aByteArray86[this.anInt7869++] = 0;
	}

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "(I)B")
	public final byte method6517() {
		return (byte) (this.aByteArray86[this.anInt7869++] - 128);
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(BI)V")
	public final void method6518(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt7869++] = (byte) arg0;
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "(I)J")
	public final long method6519() {
		@Pc(15) long local15 = (long) this.method6497() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method6497() & 0xFFFFFFFFL;
		return (local15 << 32) + local24;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)Z")
	public final boolean method6520() {
		this.anInt7869 -= 4;
		@Pc(17) int local17 = Static567.method8160(this.anInt7869, 0, this.aByteArray86);
		@Pc(29) int local29 = this.method6497();
		return local29 == local17;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)I")
	public final int method6521() {
		this.anInt7869 += 2;
		return ((this.aByteArray86[this.anInt7869 - 1] & 0xFF) << 8) + (this.aByteArray86[this.anInt7869 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "(I)I")
	public final int method6522() {
		this.anInt7869 += 2;
		@Pc(32) int local32 = ((this.aByteArray86[this.anInt7869 - 1] & 0xFF) << 8) + (this.aByteArray86[this.anInt7869 - 2] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "(I)B")
	public final byte method6523() {
		return (byte) -this.aByteArray86[this.anInt7869++];
	}

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "(I)I")
	public final int method6524() {
		@Pc(21) byte local21 = this.aByteArray86[this.anInt7869++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local21 & 0x7F | local23) << 7;
			local21 = this.aByteArray86[this.anInt7869++];
		}
		return local21 | local23;
	}

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "(I)I")
	public final int method6525() {
		this.anInt7869 += 2;
		@Pc(32) int local32 = ((this.aByteArray86[this.anInt7869 - 2] & 0xFF) << 8) + (this.aByteArray86[this.anInt7869 - 1] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "(I)B")
	public final byte method6526() {
		return (byte) (128 - this.aByteArray86[this.anInt7869++]);
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(II)V")
	public final void method6527(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(II)V")
	public final void method6528(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt7869++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(B)B")
	public final byte method6529() {
		return this.aByteArray86[this.anInt7869++];
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(II)V")
	public final void method6530(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt7869 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray86[this.anInt7869 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt7869 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt7869 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(IB)V")
	public final void method6531(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt7869++] = (byte) arg0;
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 24);
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(B)I")
	public final int method6532() {
		this.anInt7869 += 2;
		return ((this.aByteArray86[this.anInt7869 - 2] & 0xFF) << 8) + (this.aByteArray86[this.anInt7869 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BJ)V")
	public final void method6533(@OriginalArg(1) long arg0) {
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 56);
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 48);
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 40);
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 32);
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 24);
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt7869++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "(I)I")
	public final int method6535() {
		this.anInt7869 += 2;
		return (this.aByteArray86[this.anInt7869 - 1] & 0xFF) + ((this.aByteArray86[this.anInt7869 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "(I)Ljava/lang/String;")
	public final String method6536() {
		@Pc(6) int local6 = this.anInt7869;
		while (this.aByteArray86[this.anInt7869++] != 0) {
		}
		@Pc(29) int local29 = this.anInt7869 - local6 - 1;
		return local29 == 0 ? "" : Static456.method7058(this.aByteArray86, local29, local6);
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(IB)V")
	public final void method6537(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt7869++] = (byte) arg0;
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "(I)I")
	public final int method6538() {
		return this.aByteArray86[this.anInt7869++] & 0xFF;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(ZI)V")
	public final void method6539(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method6494(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method6528(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([BIII)V")
	public final void method6540(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = this.aByteArray86[this.anInt7869++];
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)I")
	public final int method6541() {
		this.anInt7869 += 2;
		return ((this.aByteArray86[this.anInt7869 - 1] & 0xFF) << 8) + (this.aByteArray86[this.anInt7869 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(B)I")
	public final int method6542() {
		@Pc(16) int local16 = this.aByteArray86[this.anInt7869] & 0xFF;
		return local16 < 128 ? this.method6538() : this.method6535() - 32768;
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(B)V")
	public final void method6543() {
		if (this.aByteArray86 != null) {
			Static393.method6283(this.aByteArray86);
		}
		this.aByteArray86 = null;
	}

	@OriginalMember(owner = "client!fd", name = "z", descriptor = "(I)I")
	public final int method6544() {
		this.anInt7869 += 4;
		return ((this.aByteArray86[this.anInt7869 - 1] & 0xFF) << 16) + ((this.aByteArray86[this.anInt7869 - 2] & 0xFF) << 24) + ((this.aByteArray86[this.anInt7869 + -4] & 0xFF) << 8) + (this.aByteArray86[this.anInt7869 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method6545(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt7869;
		this.anInt7869 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method6540(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(35) BigInteger local35 = local23.modPow(arg1, arg0);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt7869 = 0;
		this.method6528(local38.length);
		this.method6500(local38.length, local38);
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "(II)V")
	public final void method6546(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt7869++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "(B)I")
	public final int method6547() {
		return this.aByteArray86[this.anInt7869++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "(B)I")
	public final int method6548() {
		this.anInt7869 += 4;
		return ((this.aByteArray86[this.anInt7869 - 3] & 0xFF) << 8) + (this.aByteArray86[this.anInt7869 - 1] << 24 & 0xFF000000) + ((this.aByteArray86[this.anInt7869 + -2] & 0xFF) << 16) + (this.aByteArray86[this.anInt7869 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(BI)V")
	public final void method6549(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt7869 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt7869 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fd", name = "B", descriptor = "(I)I")
	public final int method6551() {
		@Pc(11) int local11 = Static567.method8160(this.anInt7869, 0, this.aByteArray86);
		this.method6495(local11);
		return local11;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(JII)V")
	public final void method6552(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(24) int local24 = local0 * 8; local24 >= 0; local24 -= 8) {
			this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> local24);
		}
	}

	@OriginalMember(owner = "client!fd", name = "C", descriptor = "(I)I")
	public final int method6554() {
		this.anInt7869 += 4;
		return ((this.aByteArray86[this.anInt7869 - 3] & 0xFF) << 24) - (-((this.aByteArray86[this.anInt7869 - 4] & 0xFF) << 16) - ((this.aByteArray86[this.anInt7869 - 1] & 0xFF) << 8) - (this.aByteArray86[this.anInt7869 - 2] & 0xFF));
	}

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "(B)I")
	public final int method6555() {
		return -this.aByteArray86[this.anInt7869++] & 0xFF;
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(ZI)V")
	public final void method6556(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 + 128);
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "(B)I")
	public final int method6557() {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9;
		for (local9 = this.method6542(); local9 == 32767; local9 = this.method6542()) {
			local5 += 32767;
		}
		return local5 + local9;
	}

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "(II)V")
	public final void method6558(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 24);
		this.aByteArray86[this.anInt7869++] = (byte) arg0;
		this.aByteArray86[this.anInt7869++] = (byte) (arg0 >> 8);
	}
}

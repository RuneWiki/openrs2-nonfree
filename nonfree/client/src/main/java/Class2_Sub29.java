import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public class Class2_Sub29 extends Class2 {

	@OriginalMember(owner = "client!ps", name = "i", descriptor = "[B")
	public byte[] aByteArray96;

	@OriginalMember(owner = "client!ps", name = "pb", descriptor = "I")
	public int anInt6132;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(I)V")
	public Class2_Sub29(@OriginalArg(0) int arg0) {
		this.aByteArray96 = Static306.method4784(arg0);
		this.anInt6132 = 0;
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "([B)V")
	public Class2_Sub29(@OriginalArg(0) byte[] arg0) {
		this.aByteArray96 = arg0;
		this.anInt6132 = 0;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II[BI)V")
	public final void method5169(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			arg1[local1] = (byte) (this.aByteArray96[this.anInt6132++] - 128);
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)I")
	public final int method5170() {
		return this.aByteArray96[this.anInt6132++] & 0xFF;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)Z")
	public final boolean method5171() {
		this.anInt6132 -= 4;
		@Pc(17) int local17 = Static372.method5902(this.anInt6132, this.aByteArray96, 0);
		@Pc(25) int local25 = this.method5198();
		return local17 == local25;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)V")
	public final void method5172(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt6132++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)I")
	public final int method5173() {
		this.anInt6132 += 4;
		return (this.aByteArray96[this.anInt6132 - 3] & 0xFF) + ((this.aByteArray96[this.anInt6132 - 4] & 0xFF) << 8) + ((this.aByteArray96[this.anInt6132 + -1] & 0xFF) << 16) + ((this.aByteArray96[this.anInt6132 + -2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IZ)I")
	public final int method5174(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static372.method5902(this.anInt6132, this.aByteArray96, arg0);
		this.method5185(local16);
		return local16;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(II)V")
	public final void method5175(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt6132++] = (byte) arg0;
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 24);
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public final String method5176() {
		@Pc(14) byte local14 = this.aByteArray96[this.anInt6132++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(24) int local24 = this.anInt6132;
		while (this.aByteArray96[this.anInt6132++] != 0) {
		}
		@Pc(54) int local54 = this.anInt6132 - local24 - 1;
		return local54 == 0 ? "" : Static226.method3566(local54, local24, this.aByteArray96);
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(Z)I")
	public final int method5177() {
		@Pc(16) byte local16 = this.aByteArray96[this.anInt6132++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local18 | local16 & 0x7F) << 7;
			local16 = this.aByteArray96[this.anInt6132++];
		}
		return local16 | local18;
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(II)V")
	public final void method5178(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 16);
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt6132++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(B)B")
	public final byte method5179() {
		return this.aByteArray96[this.anInt6132++];
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(Z)I")
	public final int method5180() {
		this.anInt6132 += 4;
		return ((this.aByteArray96[this.anInt6132 - 3] & 0xFF) << 24) + (this.aByteArray96[this.anInt6132 + -2] & 0xFF) - (-((this.aByteArray96[this.anInt6132 - 4] & 0xFF) << 16) - ((this.aByteArray96[this.anInt6132 - 1] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(II)V")
	public final void method5181(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt6132 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)I")
	public final int method5182() {
		@Pc(17) int local17 = this.aByteArray96[this.anInt6132] & 0xFF;
		return local17 >= 128 ? this.method5229() - 32768 : this.method5170();
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(B)I")
	public final int method5183() {
		return 128 - this.aByteArray96[this.anInt6132++] & 0xFF;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(II[BI)V")
	public final void method5184(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
			arg1[local9] = this.aByteArray96[this.anInt6132++];
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZI)V")
	public final void method5185(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 24);
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 16);
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt6132++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "(II)V")
	public final void method5186(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 + 128);
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I[BII)V")
	public final void method5187(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = arg1 - 1; local11 >= 0; local11--) {
			arg0[local11] = (byte) (this.aByteArray96[this.anInt6132++] - 128);
		}
	}

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "(II)V")
	public final void method5188(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt6132++] = (byte) arg0;
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method5189(@OriginalArg(0) String arg0) {
		@Pc(14) int local14 = arg0.indexOf(0);
		if (local14 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local14 + " - cannot pjstr");
		}
		this.anInt6132 += Static435.method6666(this.aByteArray96, this.anInt6132, arg0.length(), arg0);
		this.aByteArray96[this.anInt6132++] = 0;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(ZI)V")
	public final void method5190(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5172(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5217(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "(II)V")
	public final void method5191(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt6132++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZJ)V")
	public final void method5192(@OriginalArg(1) long arg0) {
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 56);
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 48);
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 40);
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 32);
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 24);
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 16);
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt6132++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)Ljava/lang/String;")
	public final String method5193() {
		@Pc(14) byte local14 = this.aByteArray96[this.anInt6132++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(33) int local33 = this.method5177();
		if (this.aByteArray96.length < local33 + this.anInt6132) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(55) String local55 = Static33.method676(this.aByteArray96, local33, this.anInt6132);
		this.anInt6132 += local33;
		return local55;
	}

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "(I)Ljava/lang/String;")
	public final String method5194() {
		@Pc(6) int local6 = this.anInt6132;
		while (this.aByteArray96[this.anInt6132++] != 0) {
		}
		@Pc(33) int local33 = this.anInt6132 - local6 - 1;
		return local33 == 0 ? "" : Static226.method3566(local33, local6, this.aByteArray96);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method5195(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt6132;
		this.anInt6132 = 0;
		@Pc(19) byte[] local19 = new byte[local6];
		this.method5184(local6, local19);
		@Pc(30) BigInteger local30 = new BigInteger(local19);
		@Pc(35) BigInteger local35 = local30.modPow(arg0, arg1);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt6132 = 0;
		this.method5217(local38.length);
		this.method5221(local38.length, local38);
	}

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "(I)I")
	public final int method5196() {
		this.anInt6132 += 2;
		return ((this.aByteArray96[this.anInt6132 - 2] & 0xFF) << 8) + (this.aByteArray96[this.anInt6132 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ps", name = "i", descriptor = "(I)I")
	public final int method5197() {
		this.anInt6132 += 4;
		return ((this.aByteArray96[this.anInt6132 - 3] & 0xFF) << 8) + ((this.aByteArray96[this.anInt6132 - 2] & 0xFF) << 16) + ((this.aByteArray96[this.anInt6132 - 1] & 0xFF) << 24) + (this.aByteArray96[this.anInt6132 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!ps", name = "j", descriptor = "(I)I")
	public final int method5198() {
		this.anInt6132 += 4;
		return ((this.aByteArray96[this.anInt6132 - 3] & 0xFF) << 16) + ((this.aByteArray96[this.anInt6132 - 4] & 0xFF) << 24) + ((this.aByteArray96[this.anInt6132 + -2] & 0xFF) << 8) + (this.aByteArray96[this.anInt6132 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)V")
	public final void method5199(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt6132++] = (byte) arg0;
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "(I)I")
	public final int method5200() {
		@Pc(16) int local16 = Static372.method5902(this.anInt6132, this.aByteArray96, 0);
		this.method5185(local16);
		return local16;
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(Z)I")
	public final int method5202() {
		this.anInt6132 += 2;
		@Pc(33) int local33 = ((this.aByteArray96[this.anInt6132 - 2] & 0xFF) << 8) + (this.aByteArray96[this.anInt6132 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "(B)I")
	public final int method5203() {
		@Pc(16) int local16 = this.aByteArray96[this.anInt6132] & 0xFF;
		return local16 < 128 ? this.method5170() - 64 : this.method5229() + -49152;
	}

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "(II)V")
	public final void method5204(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt6132++] = (byte) arg0;
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 16);
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ps", name = "l", descriptor = "(I)Ljava/lang/String;")
	public final String method5205() {
		if (this.aByteArray96[this.anInt6132] == 0) {
			this.anInt6132++;
			return null;
		} else {
			return this.method5194();
		}
	}

	@OriginalMember(owner = "client!ps", name = "i", descriptor = "(II)V")
	public final void method5206(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt6132++] = (byte) arg0;
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 16);
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "(Z)B")
	public final byte method5207() {
		return (byte) -this.aByteArray96[this.anInt6132++];
	}

	@OriginalMember(owner = "client!ps", name = "j", descriptor = "(II)V")
	public final void method5208(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt6132 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt6132 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ps", name = "m", descriptor = "(I)I")
	public final int method5209() {
		return this.aByteArray96[this.anInt6132++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ps", name = "n", descriptor = "(I)I")
	public final int method5210() {
		this.anInt6132 += 3;
		return (this.aByteArray96[this.anInt6132 - 1] & 0xFF) + ((this.aByteArray96[this.anInt6132 - 2] & 0xFF) << 8) + ((this.aByteArray96[this.anInt6132 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "(I)I")
	public final int method5211() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method5182();
		while (local11 == 32767) {
			local11 = this.method5182();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "(II)V")
	public final void method5212(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ps", name = "p", descriptor = "(I)B")
	public final byte method5213() {
		return (byte) (128 - this.aByteArray96[this.anInt6132++]);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BI)V")
	public final void method5214(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt6132 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray96[this.anInt6132 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray96[this.anInt6132 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt6132 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "([IBII)V")
	public final void method5215(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt6132;
		this.anInt6132 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method5198();
			@Pc(30) int local30 = this.method5198();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= local32 + arg0[local32 >>> 11 & 0x3] ^ local26 + (local26 << 4 ^ local26 >>> 5);
				local32 -= -1640531527;
				local26 -= arg0[local32 & 0x3] + local32 ^ (local30 >>> 5 ^ local30 << 4) + local30;
			}
			this.anInt6132 -= 8;
			this.method5185(local26);
			this.method5185(local30);
		}
		this.anInt6132 = local8;
	}

	@OriginalMember(owner = "client!ps", name = "q", descriptor = "(I)I")
	public final int method5216() {
		this.anInt6132 += 3;
		@Pc(49) int local49 = ((this.aByteArray96[this.anInt6132 - 2] & 0xFF) << 8) + ((this.aByteArray96[this.anInt6132 - 3] & 0xFF) << 16) + (this.aByteArray96[this.anInt6132 + -1] & 0xFF);
		if (local49 > 8388607) {
			local49 -= 16777216;
		}
		return local49;
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(IB)V")
	public final void method5217(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt6132++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "(B)J")
	public final long method5218() {
		@Pc(16) long local16 = (long) this.method5198() & 0xFFFFFFFFL;
		@Pc(23) long local23 = (long) this.method5198() & 0xFFFFFFFFL;
		return local23 + (local16 << 32);
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(IB)V")
	public final void method5219(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5172(arg0 >>> 28 | 0x80);
					}
					this.method5172(arg0 >>> 21 | 0x80);
				}
				this.method5172(arg0 >>> 14 | 0x80);
			}
			this.method5172(arg0 >>> 7 | 0x80);
		}
		this.method5172(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ps", name = "l", descriptor = "(II)V")
	public final void method5220(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt6132++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(II[BI)V")
	public final void method5221(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			this.aByteArray96[this.anInt6132++] = arg1[local13];
		}
	}

	@OriginalMember(owner = "client!ps", name = "m", descriptor = "(II)J")
	public final long method5223(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(25) int local25 = local2 * 8;
		@Pc(27) long local27 = 0L;
		while (local25 >= 0) {
			local27 |= ((long) this.aByteArray96[this.anInt6132++] & 0xFFL) << local25;
			local25 -= 8;
		}
		return local27;
	}

	@OriginalMember(owner = "client!ps", name = "r", descriptor = "(I)I")
	public final int method5224() {
		return -this.aByteArray96[this.anInt6132++] & 0xFF;
	}

	@OriginalMember(owner = "client!ps", name = "s", descriptor = "(I)I")
	public final int method5225() {
		this.anInt6132 += 2;
		return ((this.aByteArray96[this.anInt6132 - 1] & 0xFF) << 8) + (this.aByteArray96[this.anInt6132 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "(B)I")
	public final int method5226() {
		this.anInt6132 += 2;
		@Pc(42) int local42 = ((this.aByteArray96[this.anInt6132 - 1] & 0xFF) << 8) + (this.aByteArray96[this.anInt6132 - 2] - 128 & 0xFF);
		if (local42 > 32767) {
			local42 -= 65536;
		}
		return local42;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IBJ)V")
	public final void method5227(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(23) int local23 = local6 * 8; local23 >= 0; local23 -= 8) {
			this.aByteArray96[this.anInt6132++] = (byte) (arg1 >> local23);
		}
	}

	@OriginalMember(owner = "client!ps", name = "n", descriptor = "(II)V")
	public final void method5228(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ps", name = "t", descriptor = "(I)I")
	public final int method5229() {
		this.anInt6132 += 2;
		return (this.aByteArray96[this.anInt6132 - 1] & 0xFF) + ((this.aByteArray96[this.anInt6132 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ps", name = "u", descriptor = "(I)I")
	public final int method5230() {
		this.anInt6132 += 2;
		return (this.aByteArray96[this.anInt6132 - 2] - 128 & 0xFF) + ((this.aByteArray96[this.anInt6132 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "(B)I")
	public final int method5231() {
		this.anInt6132 += 2;
		@Pc(37) int local37 = (this.aByteArray96[this.anInt6132 - 1] & 0xFF) + ((this.aByteArray96[this.anInt6132 - 2] & 0xFF) << 8);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "(II)V")
	public final void method5232(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 16);
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 24);
		this.aByteArray96[this.anInt6132++] = (byte) arg0;
		this.aByteArray96[this.anInt6132++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public final void method5234(@OriginalArg(0) String arg0) {
		@Pc(14) int local14 = Static370.method5895(arg0);
		this.aByteArray96[this.anInt6132++] = 0;
		this.method5219(local14);
		this.anInt6132 += Static144.method2512(this.aByteArray96, arg0, this.anInt6132);
	}

	@OriginalMember(owner = "client!ps", name = "v", descriptor = "(I)B")
	public final byte method5235() {
		return (byte) (this.aByteArray96[this.anInt6132++] - 128);
	}
}

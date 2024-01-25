import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public class Class3_Sub9 extends Class3 {

	@OriginalMember(owner = "client!dc", name = "S", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
	public int anInt6453;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V")
	public Class3_Sub9(@OriginalArg(0) int arg0) {
		this.aByteArray51 = Static292.method4817(arg0);
		this.anInt6453 = 0;
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "([B)V")
	public Class3_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray51 = arg0;
		this.anInt6453 = 0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
	public final void method5572(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt6453++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IJI)V")
	public final void method5573(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(21) int local21 = local6 * 8; local21 >= 0; local21 -= 8) {
			this.aByteArray51[this.anInt6453++] = (byte) (int) (arg1 >> local21);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public final void method5575() {
		if (this.aByteArray51 != null) {
			Static292.method4815(this.aByteArray51);
		}
		this.aByteArray51 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[III)V")
	public final void method5576(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anInt6453;
		this.anInt6453 = arg2;
		@Pc(17) int local17 = (arg0 - arg2) / 8;
		for (@Pc(26) int local26 = 0; local26 < local17; local26++) {
			@Pc(34) int local34 = this.method5585();
			@Pc(38) int local38 = this.method5585();
			@Pc(40) int local40 = 0;
			@Pc(44) int local44 = 32;
			while (local44-- > 0) {
				local34 += local40 + arg1[local40 & 0x3] ^ local38 + (local38 << 4 ^ local38 >>> 5);
				local40 += -1640531527;
				local38 += local40 + arg1[local40 >>> 11 & 0x9E200003] ^ local34 + (local34 << 4 ^ local34 >>> 5);
			}
			this.anInt6453 -= 8;
			this.method5601(local34);
			this.method5601(local38);
		}
		this.anInt6453 = local8;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II[BB)V")
	public final void method5577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		for (@Pc(14) int local14 = arg0; local14 < arg0 + arg1; local14++) {
			arg2[local14] = this.aByteArray51[this.anInt6453++];
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(JB)V")
	public final void method5579(@OriginalArg(0) long arg0) {
		this.aByteArray51[this.anInt6453++] = (byte) (int) (arg0 >> 56);
		this.aByteArray51[this.anInt6453++] = (byte) (int) (arg0 >> 48);
		this.aByteArray51[this.anInt6453++] = (byte) (int) (arg0 >> 40);
		this.aByteArray51[this.anInt6453++] = (byte) (int) (arg0 >> 32);
		this.aByteArray51[this.anInt6453++] = (byte) (int) (arg0 >> 24);
		this.aByteArray51[this.anInt6453++] = (byte) (int) (arg0 >> 16);
		this.aByteArray51[this.anInt6453++] = (byte) (int) (arg0 >> 8);
		this.aByteArray51[this.anInt6453++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)B")
	public final byte method5580() {
		return (byte) -this.aByteArray51[this.anInt6453++];
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)V")
	public final void method5581(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt6453++] = (byte) arg0;
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method5582(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt6453;
		this.anInt6453 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method5577(0, local6, local12);
		@Pc(31) BigInteger local31 = new BigInteger(local12);
		@Pc(36) BigInteger local36 = local31.modPow(arg1, arg0);
		@Pc(39) byte[] local39 = local36.toByteArray();
		this.anInt6453 = 0;
		this.method5620(local39.length);
		this.method5625(local39, local39.length, 0);
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)I")
	public final int method5583() {
		this.anInt6453 += 2;
		return ((this.aByteArray51[this.anInt6453 - 1] & 0xFF) << 8) + (this.aByteArray51[this.anInt6453 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)Ljava/lang/String;")
	public final String method5584() {
		if (this.aByteArray51[this.anInt6453] == 0) {
			this.anInt6453++;
			return null;
		} else {
			return this.method5607();
		}
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)I")
	public final int method5585() {
		this.anInt6453 += 4;
		return (this.aByteArray51[this.anInt6453 - 1] & 0xFF) + ((this.aByteArray51[this.anInt6453 - 3] & 0xFF) << 16) + ((this.aByteArray51[this.anInt6453 - 4] & 0xFF) << 24) + ((this.aByteArray51[this.anInt6453 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)I")
	public final int method5586() {
		this.anInt6453 += 4;
		return ((this.aByteArray51[this.anInt6453 - 1] & 0xFF) << 8) + ((this.aByteArray51[this.anInt6453 - 4] & 0xFF) << 16) + ((this.aByteArray51[this.anInt6453 + -3] & 0xFF) << 24) + (this.aByteArray51[this.anInt6453 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "(I)I")
	public final int method5587() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		for (local11 = this.method5606(); local11 == 32767; local11 = this.method5606()) {
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(IB)J")
	public final long method5588(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(26) int local26 = local2 * 8;
		@Pc(28) long local28 = 0L;
		while (local26 >= 0) {
			local28 |= ((long) this.aByteArray51[this.anInt6453++] & 0xFFL) << local26;
			local26 -= 8;
		}
		return local28;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([IIII)V")
	public final void method5589(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt6453;
		this.anInt6453 = 5;
		@Pc(24) int local24 = (arg1 - 5) / 8;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) int local32 = this.method5585();
			@Pc(36) int local36 = this.method5585();
			@Pc(38) int local38 = -957401312;
			@Pc(42) int local42 = 32;
			while (local42-- > 0) {
				local36 -= local32 + (local32 >>> 5 ^ local32 << 4) ^ arg0[local38 >>> 11 & 0x3] + local38;
				local38 -= -1640531527;
				local32 -= local38 + arg0[local38 & 0x3] ^ local36 + (local36 << 4 ^ local36 >>> 5);
			}
			this.anInt6453 -= 8;
			this.method5601(local32);
			this.method5601(local36);
		}
		this.anInt6453 = local14;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)V")
	public final void method5590(@OriginalArg(1) int arg0) {
		this.aByteArray51[this.anInt6453++] = (byte) arg0;
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 16);
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)V")
	public final void method5591(@OriginalArg(1) int arg0) {
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt6453++] = (byte) arg0;
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 24);
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)V")
	public final void method5592(@OriginalArg(1) int arg0) {
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 16);
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt6453++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(IB)V")
	public final void method5593(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt6453++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "(I)I")
	public final int method5594() {
		return this.aByteArray51[this.anInt6453++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(II)V")
	public final void method5595(@OriginalArg(1) int arg0) {
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 + 128);
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "(I)I")
	public final int method5596() {
		this.anInt6453 += 3;
		@Pc(43) int local43 = (this.aByteArray51[this.anInt6453 - 1] & 0xFF) + ((this.aByteArray51[this.anInt6453 - 2] & 0xFF) << 8) + ((this.aByteArray51[this.anInt6453 + -3] & 0xFF) << 16);
		if (local43 > 8388607) {
			local43 -= 16777216;
		}
		return local43;
	}

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "(I)I")
	public final int method5597() {
		this.anInt6453 += 4;
		return (this.aByteArray51[this.anInt6453 - 4] & 0xFF) + ((this.aByteArray51[this.anInt6453 - 3] & 0xFF) << 8) + ((this.aByteArray51[this.anInt6453 + -2] & 0xFF) << 16) + ((this.aByteArray51[this.anInt6453 + -1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(IB)V")
	public final void method5598(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt6453++] = (byte) arg0;
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 16);
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)I")
	public final int method5599() {
		this.anInt6453 += 2;
		@Pc(33) int local33 = (this.aByteArray51[this.anInt6453 - 1] - 128 & 0xFF) + ((this.aByteArray51[this.anInt6453 - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "(I)I")
	public final int method5600() {
		this.anInt6453 += 4;
		return (this.aByteArray51[this.anInt6453 - 4] & 0xFF) + ((this.aByteArray51[this.anInt6453 - 1] & 0xFF) << 24) + ((this.aByteArray51[this.anInt6453 - 2] & 0xFF) << 16) + ((this.aByteArray51[this.anInt6453 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(II)V")
	public final void method5601(@OriginalArg(1) int arg0) {
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 24);
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 16);
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt6453++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "(I)I")
	public final int method5602() {
		return -this.aByteArray51[this.anInt6453++] & 0xFF;
	}

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "(I)J")
	public final long method5603() {
		@Pc(10) long local10 = (long) this.method5585() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method5585() & 0xFFFFFFFFL;
		return (local10 << 32) + local22;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)I")
	public final int method5604() {
		this.anInt6453 += 3;
		return (this.aByteArray51[this.anInt6453 - 1] & 0xFF) + ((this.aByteArray51[this.anInt6453 - 3] & 0xFF) << 16) + ((this.aByteArray51[this.anInt6453 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(Z)Ljava/lang/String;")
	public final String method5605() {
		@Pc(14) byte local14 = this.aByteArray51[this.anInt6453++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt6453;
		while (this.aByteArray51[this.anInt6453++] != 0) {
		}
		@Pc(53) int local53 = this.anInt6453 - local27 - 1;
		return local53 == 0 ? "" : Static284.method4606(local53, this.aByteArray51, local27);
	}

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "(I)I")
	public final int method5606() {
		@Pc(16) int local16 = this.aByteArray51[this.anInt6453] & 0xFF;
		return local16 >= 128 ? this.method5610() - 32768 : this.method5633();
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)Ljava/lang/String;")
	public final String method5607() {
		@Pc(6) int local6 = this.anInt6453;
		while (this.aByteArray51[this.anInt6453++] != 0) {
		}
		@Pc(34) int local34 = this.anInt6453 - local6 - 1;
		return local34 == 0 ? "" : Static284.method4606(local34, this.aByteArray51, local6);
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)I")
	public final int method5608() {
		@Pc(11) int local11 = this.aByteArray51[this.anInt6453] & 0xFF;
		return local11 < 128 ? this.method5633() - 64 : this.method5610() - 49152;
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(B)J")
	public final long method5609() {
		@Pc(15) long local15 = (long) this.method5600() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method5600() & 0xFFFFFFFFL;
		return (local22 << 32) + local15;
	}

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "(I)I")
	public final int method5610() {
		this.anInt6453 += 2;
		return ((this.aByteArray51[this.anInt6453 - 2] & 0xFF) << 8) + (this.aByteArray51[this.anInt6453 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "(I)I")
	public final int method5611() {
		this.anInt6453 += 4;
		return (this.aByteArray51[this.anInt6453 - 3] & 0xFF) + ((this.aByteArray51[this.anInt6453 - 1] & 0xFF) << 16) + ((this.aByteArray51[this.anInt6453 - 2] & 0xFF) << 24) + ((this.aByteArray51[this.anInt6453 - 4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(II)V")
	public final void method5612(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "(I)I")
	public final int method5613() {
		this.anInt6453 += 3;
		return (this.aByteArray51[this.anInt6453 - 3] & 0xFF) + ((this.aByteArray51[this.anInt6453 - 2] & 0xFF) << 8) + ((this.aByteArray51[this.anInt6453 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method5614(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray51[this.anInt6453++] = 0;
		this.anInt6453 += Static310.method5198(arg0.length(), this.aByteArray51, arg0, this.anInt6453);
		this.aByteArray51[this.anInt6453++] = 0;
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(IB)V")
	public final void method5615(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt6453 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(II)V")
	public final void method5616(@OriginalArg(1) int arg0) {
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(B)Z")
	public final boolean method5618() {
		this.anInt6453 -= 4;
		@Pc(17) int local17 = Static574.method8063(this.anInt6453, 0, this.aByteArray51);
		@Pc(21) int local21 = this.method5585();
		return local21 == local17;
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(Z)B")
	public final byte method5619() {
		return this.aByteArray51[this.anInt6453++];
	}

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "(II)V")
	public final void method5620(@OriginalArg(1) int arg0) {
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt6453++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "(II)V")
	public final void method5621(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt6453 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray51[this.anInt6453 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray51[this.anInt6453 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt6453 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(B)I")
	public final int method5622() {
		this.anInt6453 += 2;
		@Pc(31) int local31 = (this.aByteArray51[this.anInt6453 - 2] & 0xFF) + ((this.aByteArray51[this.anInt6453 - 1] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(Z)I")
	public final int method5623() {
		@Pc(16) byte local16 = this.aByteArray51[this.anInt6453++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local16 & 0x7F | local18) << 7;
			local16 = this.aByteArray51[this.anInt6453++];
		}
		return local16 | local18;
	}

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "(I)I")
	public final int method5624() {
		this.anInt6453 += 2;
		@Pc(36) int local36 = (this.aByteArray51[this.anInt6453 - 1] & 0xFF) + ((this.aByteArray51[this.anInt6453 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([BIII)V")
	public final void method5625(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(13) int local13 = arg2; local13 < arg1 + arg2; local13++) {
			this.aByteArray51[this.anInt6453++] = arg0[local13];
		}
	}

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "(I)I")
	public final int method5626() {
		return 128 - this.aByteArray51[this.anInt6453++] & 0xFF;
	}

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "(II)V")
	public final void method5627(@OriginalArg(1) int arg0) {
		this.aByteArray51[this.anInt6453++] = (byte) arg0;
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "(B)I")
	public final int method5628() {
		this.anInt6453 += 2;
		return ((this.aByteArray51[this.anInt6453 - 1] & 0xFF) << 8) + (this.aByteArray51[this.anInt6453 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(ZI)V")
	public final void method5629(@OriginalArg(1) int arg0) {
		this.aByteArray51[this.anInt6453 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt6453 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III[B)V")
	public final void method5630(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = (byte) (this.aByteArray51[this.anInt6453++] - 128);
		}
	}

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(Z)B")
	public final byte method5631() {
		return (byte) (this.aByteArray51[this.anInt6453++] - 128);
	}

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "(B)B")
	public final byte method5632() {
		return (byte) (128 - this.aByteArray51[this.anInt6453++]);
	}

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "(B)I")
	public final int method5633() {
		return this.aByteArray51[this.anInt6453++] & 0xFF;
	}

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "(I)I")
	public final int method5634() {
		this.anInt6453 += 2;
		return (this.aByteArray51[this.anInt6453 - 1] - 128 & 0xFF) + ((this.aByteArray51[this.anInt6453 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "(II)V")
	public final void method5635(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt6453++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "(II)V")
	public final void method5636(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5572(arg0 >>> 28 | 0x80);
					}
					this.method5572(arg0 >>> 21 | 0x80);
				}
				this.method5572(arg0 >>> 14 | 0x80);
			}
			this.method5572(arg0 >>> 7 | 0x80);
		}
		this.method5572(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "(II)V")
	public final void method5637(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 16);
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 24);
		this.aByteArray51[this.anInt6453++] = (byte) arg0;
		this.aByteArray51[this.anInt6453++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method5638(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt6453 += Static310.method5198(arg0.length(), this.aByteArray51, arg0, this.anInt6453);
		this.aByteArray51[this.anInt6453++] = 0;
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(IB)I")
	public final int method5639(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static574.method8063(this.anInt6453, arg0, this.aByteArray51);
		this.method5601(local11);
		return local11;
	}

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "(II)V")
	public final void method5640(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5572(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5620(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}
}

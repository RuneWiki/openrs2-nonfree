import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
	public int anInt1357;

	@OriginalMember(owner = "client!jg", name = "mb", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V")
	public Class1_Sub8(@OriginalArg(0) int arg0) {
		this.anInt1357 = 0;
		this.aByteArray12 = Static58.method1102(arg0);
	}

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "([B)V")
	public Class1_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray12 = arg0;
		this.anInt1357 = 0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
	public final void method853(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method862(arg0 >>> 28 | 0x80);
					}
					this.method862(arg0 >>> 21 | 0x80);
				}
				this.method862(arg0 >>> 14 | 0x80);
			}
			this.method862(arg0 >>> 7 | 0x80);
		}
		this.method862(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)B")
	public final byte method854() {
		return (byte) -this.aByteArray12[this.anInt1357++];
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)I")
	public final int method855() {
		this.anInt1357 += 4;
		return (this.aByteArray12[this.anInt1357 - 2] & 0xFF) + (((this.aByteArray12[this.anInt1357 - 4] & 0xFF) << 16) + ((this.aByteArray12[this.anInt1357 - 3] & 0xFF) << 24) + ((this.aByteArray12[this.anInt1357 - 1] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)I")
	public final int method856() {
		@Pc(11) int local11 = this.aByteArray12[this.anInt1357] & 0xFF;
		return local11 < 128 ? this.method861() : this.method878() - 32768;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(III[B)V")
	public final void method857(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = this.aByteArray12[this.anInt1357++];
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!ed;B)V")
	public final void method858(@OriginalArg(0) Class23 arg0) {
		this.anInt1357 += arg0.method649(this.aByteArray12, this.anInt1357, arg0.method642());
		this.aByteArray12[this.anInt1357++] = 0;
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)I")
	public final int method859() {
		@Pc(12) byte local12 = this.aByteArray12[this.anInt1357++];
		@Pc(23) int local23 = 0;
		while (local12 < 0) {
			local23 = (local23 | local12 & 0x7F) << 7;
			local12 = this.aByteArray12[this.anInt1357++];
		}
		return local12 | local23;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)V")
	public final void method860(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(B)I")
	public final int method861() {
		return this.aByteArray12[this.anInt1357++] & 0xFF;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)V")
	public final void method862(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1357++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(B)I")
	public final int method863() {
		this.anInt1357 += 4;
		return (this.aByteArray12[this.anInt1357 - 3] & 0xFF) + ((this.aByteArray12[this.anInt1357 - 4] & 0xFF) << 8) + ((this.aByteArray12[this.anInt1357 + -1] & 0xFF) << 16) + ((this.aByteArray12[this.anInt1357 + -2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)Lclient!ed;")
	public final Class23 method864() {
		@Pc(13) int local13 = this.anInt1357;
		while (this.aByteArray12[this.anInt1357++] != 0) {
		}
		return Static85.method1492(local13, this.anInt1357 - local13 - 1, this.aByteArray12);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[BII)V")
	public final void method865(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1; local8++) {
			this.aByteArray12[this.anInt1357++] = arg0[local8];
		}
	}

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)I")
	public final int method866() {
		return 128 - this.aByteArray12[this.anInt1357++] & 0xFF;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(Z)I")
	public final int method867() {
		this.anInt1357 += 2;
		return ((this.aByteArray12[this.anInt1357 - 1] & 0xFF) << 8) + (this.aByteArray12[this.anInt1357 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "(I)I")
	public final int method868() {
		this.anInt1357 += 4;
		return ((this.aByteArray12[this.anInt1357 - 3] & 0xFF) << 16) + ((this.aByteArray12[this.anInt1357 - 4] & 0xFF) << 24) + ((this.aByteArray12[this.anInt1357 + -2] & 0xFF) << 8) + (this.aByteArray12[this.anInt1357 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)V")
	public final void method869(@OriginalArg(1) int arg0) {
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1357++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "(I)I")
	public final int method870() {
		this.anInt1357 += 4;
		return (this.aByteArray12[this.anInt1357 - 4] & 0xFF) + ((this.aByteArray12[this.anInt1357 - 3] & 0xFF) << 8) + ((this.aByteArray12[this.anInt1357 + -1] & 0xFF) << 24) + ((this.aByteArray12[this.anInt1357 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(IB)I")
	public final int method871(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static64.method1133(this.anInt1357, this.aByteArray12, arg0);
		this.method904(local16);
		return local16;
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(IB)V")
	public final void method872(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1357++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IJ)V")
	public final void method873(@OriginalArg(1) long arg0) {
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 56);
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 48);
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 40);
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 32);
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 24);
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1357++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(II)V")
	public final void method874(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1357++] = (byte) arg0;
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "(B)I")
	public final int method875() {
		this.anInt1357 += 2;
		@Pc(36) int local36 = (this.aByteArray12[this.anInt1357 - 1] & 0xFF) + ((this.aByteArray12[this.anInt1357 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method876(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(13) int local13 = this.anInt1357;
		@Pc(16) byte[] local16 = new byte[local13];
		this.anInt1357 = 0;
		this.method857(local13, local16);
		@Pc(30) BigInteger local30 = new BigInteger(local16);
		@Pc(35) BigInteger local35 = local30.modPow(arg1, arg0);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt1357 = 0;
		this.method862(local38.length);
		this.method865(local38, local38.length);
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(IB)V")
	public final void method877(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1357 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "(I)I")
	public final int method878() {
		this.anInt1357 += 2;
		return ((this.aByteArray12[this.anInt1357 - 2] & 0xFF) << 8) + (this.aByteArray12[this.anInt1357 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(II)V")
	public final void method879(@OriginalArg(1) int arg0) {
		this.aByteArray12[this.anInt1357++] = (byte) arg0;
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "(I)I")
	public final int method880() {
		this.anInt1357 += 2;
		@Pc(41) int local41 = (this.aByteArray12[this.anInt1357 - 1] - 128 & 0xFF) + ((this.aByteArray12[this.anInt1357 - 2] & 0xFF) << 8);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(IJ)V")
	public final void method882(@OriginalArg(1) long arg0) {
		this.method894((int) (arg0 >> 32));
		this.method894((int) arg0);
	}

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "(B)I")
	public final int method883() {
		return this.aByteArray12[this.anInt1357++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "(B)J")
	public final long method884() {
		@Pc(18) long local18 = (long) this.method868() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method868() & 0xFFFFFFFFL;
		return (local18 << 32) + local25;
	}

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "(I)Lclient!ed;")
	public final Class23 method885() {
		if (this.aByteArray12[this.anInt1357] == 0) {
			this.anInt1357++;
			return null;
		} else {
			return this.method864();
		}
	}

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "(I)I")
	public final int method886() {
		this.anInt1357 += 2;
		return ((this.aByteArray12[this.anInt1357 - 2] & 0xFF) << 8) + (this.aByteArray12[this.anInt1357 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "(II)V")
	public final void method887(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method862(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method869(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "(I)I")
	public final int method888() {
		this.anInt1357 += 3;
		return (this.aByteArray12[this.anInt1357 - 1] & 0xFF) + ((this.aByteArray12[this.anInt1357 - 2] & 0xFF) << 8) + ((this.aByteArray12[this.anInt1357 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "(I)I")
	public final int method889() {
		@Pc(16) int local16 = this.aByteArray12[this.anInt1357] & 0xFF;
		return local16 < 128 ? this.method861() - 64 : this.method878() + -49152;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II[BI)V")
	public final void method891(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(15) int local15 = arg0 - 1; local15 >= 0; local15--) {
			arg1[local15] = this.aByteArray12[this.anInt1357++];
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)V")
	public final void method894(@OriginalArg(1) int arg0) {
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1357++] = (byte) arg0;
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 24);
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(BI)V")
	public final void method895(@OriginalArg(1) int arg0) {
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 + 128);
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(IB)V")
	public final void method896(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 24);
		this.aByteArray12[this.anInt1357++] = (byte) arg0;
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(Z)I")
	public final int method897() {
		this.anInt1357 += 3;
		return (this.aByteArray12[this.anInt1357 - 3] & 0xFF) + (((this.aByteArray12[this.anInt1357 - 1] & 0xFF) << 16) + ((this.aByteArray12[this.anInt1357 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(ZI)V")
	public final void method898(@OriginalArg(1) int arg0) {
		this.aByteArray12[this.anInt1357 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray12[this.anInt1357 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt1357 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1357 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "(II)V")
	public final void method899(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1357++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "(B)B")
	public final byte method900() {
		return this.aByteArray12[this.anInt1357++];
	}

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "(I)I")
	public final int method901() {
		return -this.aByteArray12[this.anInt1357++] & 0xFF;
	}

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "(I)I")
	public final int method902() {
		this.anInt1357 += 2;
		return ((this.aByteArray12[this.anInt1357 - 1] & 0xFF) << 8) + (this.aByteArray12[this.anInt1357 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "(II)V")
	public final void method903(@OriginalArg(1) int arg0) {
		this.aByteArray12[this.anInt1357++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "(II)V")
	public final void method904(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 24);
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt1357++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1357++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[IZI)V")
	public final void method905(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt1357;
		@Pc(14) int local14 = (arg1 - 5) / 8;
		this.anInt1357 = 5;
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			@Pc(25) int local25 = this.method868();
			@Pc(29) int local29 = this.method868();
			@Pc(33) int local33 = -957401312;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local29 -= (local25 << 4 ^ local25 >>> 5) + local25 ^ arg0[local33 >>> 11 & 0x3] + local33;
				local33 -= -1640531527;
				local25 -= arg0[local33 & 0x3] + local33 ^ (local29 << 4 ^ local29 >>> 5) - -local29;
			}
			this.anInt1357 -= 8;
			this.method904(local25);
			this.method904(local29);
		}
		this.anInt1357 = local8;
	}
}

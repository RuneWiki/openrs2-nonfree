import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!ba", name = "Ob", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!ba", name = "xb", descriptor = "I")
	public int anInt1168;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V")
	public Class2_Sub3(@OriginalArg(0) int arg0) {
		this.aByteArray7 = Static22.method606(arg0);
		this.anInt1168 = 0;
	}

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "([B)V")
	public Class2_Sub3(@OriginalArg(0) byte[] arg0) {
		this.anInt1168 = 0;
		this.aByteArray7 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)I")
	public final int method783() {
		this.anInt1168 += 2;
		@Pc(29) int local29 = (this.aByteArray7[this.anInt1168 - 1] - 128 & 0xFF) + ((this.aByteArray7[this.anInt1168 - 2] & 0xFF) << 8);
		if (local29 > 32767) {
			local29 -= 65536;
		}
		return local29;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)I")
	public final int method784() {
		this.anInt1168 += 2;
		return ((this.aByteArray7[this.anInt1168 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt1168 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI[BI)V")
	public final void method785(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (this.aByteArray7[this.anInt1168++] - 128);
		}
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)I")
	public final int method786() {
		this.anInt1168 += 2;
		@Pc(38) int local38 = ((this.aByteArray7[this.anInt1168 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt1168 - 1] & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)Lclient!a;")
	public final Class1 method787() {
		@Pc(6) int local6 = this.anInt1168;
		while (this.aByteArray7[this.anInt1168++] != 0) {
		}
		return Static32.method845(this.aByteArray7, local6, this.anInt1168 - local6 - 1);
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(IB)V")
	public final void method788(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt1168++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method789(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt1168;
		this.anInt1168 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method820(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt1168 = 0;
		this.method788(local31.length);
		this.method798(local31.length, local31);
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)B")
	public final byte method790() {
		return (byte) -this.aByteArray7[this.anInt1168++];
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)I")
	public final int method791() {
		return this.aByteArray7[this.anInt1168++] & 0xFF;
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)I")
	public final int method792() {
		this.anInt1168 += 2;
		return ((this.aByteArray7[this.anInt1168 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt1168 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)I")
	public final int method793() {
		this.anInt1168 += 4;
		return ((this.aByteArray7[this.anInt1168 - 1] & 0xFF) << 8) + (this.aByteArray7[this.anInt1168 - 4] << 16 & 0xFF0000) + ((this.aByteArray7[this.anInt1168 + -3] & 0xFF) << 24) + (this.aByteArray7[this.anInt1168 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(B)I")
	public final int method794() {
		return -this.aByteArray7[this.anInt1168++] & 0xFF;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)I")
	public final int method796(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static112.method1811(arg0, this.anInt1168, this.aByteArray7);
		this.method829(local11);
		return local11;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)V")
	public final void method797(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt1168++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[BII)V")
	public final void method798(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray7[this.anInt1168++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)I")
	public final int method799() {
		return this.aByteArray7[this.anInt1168++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)V")
	public final void method800(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt1168++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(II)V")
	public final void method801(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 + 128);
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(IB)V")
	public final void method802(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt1168 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "(B)I")
	public final int method803() {
		return 128 - this.aByteArray7[this.anInt1168++] & 0xFF;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(JZ)V")
	public final void method804(@OriginalArg(0) long arg0) {
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 56);
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 48);
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 40);
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 32);
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 24);
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt1168++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "(B)I")
	public final int method805() {
		@Pc(7) int local7 = this.aByteArray7[this.anInt1168] & 0xFF;
		return local7 >= 128 ? this.method792() - 49152 : this.method791() + -64;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([IZII)V")
	public final void method806(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg1 - 5) / 8;
		@Pc(15) int local15 = this.anInt1168;
		this.anInt1168 = 5;
		for (@Pc(20) int local20 = 0; local20 < local12; local20++) {
			@Pc(33) int local33 = this.method814();
			@Pc(37) int local37 = this.method814();
			@Pc(39) int local39 = 32;
			@Pc(41) int local41 = -957401312;
			while (local39-- > 0) {
				local37 -= (local33 >>> 5 ^ local33 << 4) + local33 ^ local41 + arg0[local41 >>> 11 & 0x8E200003];
				local41 -= -1640531527;
				local33 -= (local37 >>> 5 ^ local37 << 4) + local37 ^ arg0[local41 & 0x3] + local41;
			}
			this.anInt1168 -= 8;
			this.method829(local33);
			this.method829(local37);
		}
		this.anInt1168 = local15;
	}

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "(B)I")
	public final int method807() {
		this.anInt1168 += 2;
		@Pc(38) int local38 = (this.aByteArray7[this.anInt1168 - 2] - 128 & 0xFF) + ((this.aByteArray7[this.anInt1168 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "(B)I")
	public final int method808() {
		this.anInt1168 += 4;
		return ((this.aByteArray7[this.anInt1168 - 3] & 0xFF) << 8) + (((this.aByteArray7[this.anInt1168 - 1] & 0xFF) << 24) + (this.aByteArray7[this.anInt1168 - 2] << 16 & 0xFF0000)) + (this.aByteArray7[this.anInt1168 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(II)V")
	public final void method809(@OriginalArg(1) int arg0) {
		this.aByteArray7[this.anInt1168++] = (byte) arg0;
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(IB)V")
	public final void method810(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 24);
		this.aByteArray7[this.anInt1168++] = (byte) arg0;
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(Z)I")
	public final int method811() {
		this.anInt1168 += 3;
		return ((this.aByteArray7[this.anInt1168 - 3] & 0xFF) << 16) + ((this.aByteArray7[this.anInt1168 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt1168 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "(II)V")
	public final void method812(@OriginalArg(1) int arg0) {
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "(B)I")
	public final int method813() {
		this.anInt1168 += 2;
		return ((this.aByteArray7[this.anInt1168 - 1] & 0xFF) << 8) + (this.aByteArray7[this.anInt1168 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)I")
	public final int method814() {
		this.anInt1168 += 4;
		return (this.aByteArray7[this.anInt1168 - 1] & 0xFF) + ((this.aByteArray7[this.anInt1168 - 2] & 0xFF) << 8) + ((this.aByteArray7[this.anInt1168 + -3] & 0xFF) << 16) + ((this.aByteArray7[-4 + this.anInt1168] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "(I)B")
	public final byte method815() {
		return (byte) (128 - this.aByteArray7[this.anInt1168++]);
	}

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "(II)V")
	public final void method816(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "(II)V")
	public final void method817(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt1168++] = (byte) arg0;
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "(I)B")
	public final byte method818() {
		return (byte) (this.aByteArray7[this.anInt1168++] - 128);
	}

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "(II)V")
	public final void method819(@OriginalArg(1) int arg0) {
		this.aByteArray7[this.anInt1168++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([BIIB)V")
	public final void method820(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = this.aByteArray7[this.anInt1168++];
		}
	}

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "(I)J")
	public final long method821() {
		@Pc(12) long local12 = (long) this.method814() & 0xFFFFFFFFL;
		@Pc(19) long local19 = (long) this.method814() & 0xFFFFFFFFL;
		return local19 + (local12 << 32);
	}

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "(I)I")
	public final int method823() {
		@Pc(21) byte local21 = this.aByteArray7[this.anInt1168++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local21 & 0x7F | local23) << 7;
			local21 = this.aByteArray7[this.anInt1168++];
		}
		return local21 | local23;
	}

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "(B)I")
	public final int method825() {
		@Pc(7) int local7 = this.aByteArray7[this.anInt1168] & 0xFF;
		return local7 >= 128 ? this.method792() - 32768 : this.method791();
	}

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "(II)V")
	public final void method826(@OriginalArg(1) int arg0) {
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt1168++] = (byte) arg0;
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 24);
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(Z)I")
	public final int method827() {
		this.anInt1168 += 2;
		return (this.aByteArray7[this.anInt1168 - 2] - 128 & 0xFF) + ((this.aByteArray7[this.anInt1168 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!a;B)V")
	public final void method828(@OriginalArg(0) Class1 arg0) {
		this.anInt1168 += arg0.method2(arg0.method10(), this.aByteArray7, this.anInt1168);
		this.aByteArray7[this.anInt1168++] = 0;
	}

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "(II)V")
	public final void method829(@OriginalArg(1) int arg0) {
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 24);
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt1168++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt1168++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "(I)I")
	public final int method830() {
		this.anInt1168 += 4;
		return ((this.aByteArray7[this.anInt1168 - 4] & 0xFF) << 8) + ((this.aByteArray7[this.anInt1168 - 2] << 24 & 0xFF000000) + (this.aByteArray7[this.anInt1168 - 1] << 16 & 0xFF0000) + (this.aByteArray7[this.anInt1168 + -3] & 0xFF));
	}

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "(I)B")
	public final byte method831() {
		return this.aByteArray7[this.anInt1168++];
	}

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "(II)V")
	public final void method832(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method788(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method797(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}
}

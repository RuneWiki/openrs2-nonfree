import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public class Class14_Sub29 extends Class14 {

	@OriginalMember(owner = "client!so", name = "nb", descriptor = "I")
	public int anInt7264;

	@OriginalMember(owner = "client!so", name = "vb", descriptor = "[B")
	public byte[] aByteArray84;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(I)V")
	public Class14_Sub29(@OriginalArg(0) int arg0) {
		this.anInt7264 = 0;
		this.aByteArray84 = Static41.method903(arg0);
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "([B)V")
	public Class14_Sub29(@OriginalArg(0) byte[] arg0) {
		this.aByteArray84 = arg0;
		this.anInt7264 = 0;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II[BI)V")
	public final void method5838(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = arg0; local7 < arg2 + arg0; local7++) {
			this.aByteArray84[this.anInt7264++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IB)V")
	public final void method5839(@OriginalArg(0) int arg0) {
		this.aByteArray84[this.anInt7264 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray84[this.anInt7264 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(B)I")
	public final int method5840() {
		this.anInt7264 += 2;
		return (this.aByteArray84[this.anInt7264 - 1] - 128 & 0xFF) + ((this.aByteArray84[this.anInt7264 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I[I)V")
	public final void method5841(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.anInt7264 / 8;
		this.anInt7264 = 0;
		for (@Pc(22) int local22 = 0; local22 < local10; local22++) {
			@Pc(30) int local30 = this.method5878();
			@Pc(34) int local34 = this.method5878();
			@Pc(36) int local36 = -957401312;
			@Pc(40) int local40 = 32;
			while (local40-- > 0) {
				local34 -= local30 + (local30 << 4 ^ local30 >>> 5) ^ arg0[local36 >>> 11 & 0x3] + local36;
				local36 -= -1640531527;
				local30 -= (local34 >>> 5 ^ local34 << 4) + local34 ^ arg0[local36 & 0x3] + local36;
			}
			this.anInt7264 -= 8;
			this.method5861(local30);
			this.method5861(local34);
		}
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(B)I")
	public final int method5842() {
		return 128 - this.aByteArray84[this.anInt7264++] & 0xFF;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)I")
	public final int method5843() {
		this.anInt7264 += 4;
		return (this.aByteArray84[this.anInt7264 - 3] & 0xFF) + ((this.aByteArray84[this.anInt7264 - 4] & 0xFF) << 8) + ((this.aByteArray84[this.anInt7264 + -2] & 0xFF) << 24) + ((this.aByteArray84[this.anInt7264 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(IB)I")
	public final int method5844(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = Static425.method6282(this.anInt7264, arg0, this.aByteArray84);
		this.method5861(local18);
		return local18;
	}

	@OriginalMember(owner = "client!so", name = "e", descriptor = "(B)B")
	public final byte method5845() {
		return this.aByteArray84[this.anInt7264++];
	}

	@OriginalMember(owner = "client!so", name = "f", descriptor = "(B)I")
	public final int method5846() {
		return this.aByteArray84[this.anInt7264++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(II)V")
	public final void method5847(@OriginalArg(1) int arg0) {
		this.aByteArray84[this.anInt7264++] = (byte) arg0;
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 8);
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 16);
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!so", name = "g", descriptor = "(B)I")
	public final int method5848() {
		this.anInt7264 += 3;
		return ((this.aByteArray84[this.anInt7264 - 2] & 0xFF) << 16) + (this.aByteArray84[this.anInt7264 - 3] << 8 & 0xFF00) + (this.aByteArray84[this.anInt7264 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(II)V")
	public final void method5849(@OriginalArg(1) int arg0) {
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 16);
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 24);
		this.aByteArray84[this.anInt7264++] = (byte) arg0;
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!so", name = "h", descriptor = "(B)Z")
	public final boolean method5850() {
		this.anInt7264 -= 4;
		@Pc(22) int local22 = Static425.method6282(this.anInt7264, 0, this.aByteArray84);
		@Pc(26) int local26 = this.method5878();
		return local26 == local22;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method5851(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt7264;
		this.anInt7264 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method5860(local12, 0, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt7264 = 0;
		this.method5859(local31.length);
		this.method5838(0, local31, local31.length);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(JII)V")
	public final void method5852(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(19) int local19 = local2 * 8; local19 >= 0; local19 -= 8) {
			this.aByteArray84[this.anInt7264++] = (byte) (int) (arg0 >> local19);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZI)V")
	public final void method5853(@OriginalArg(1) int arg0) {
		this.aByteArray84[this.anInt7264 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(II)V")
	public final void method5854(@OriginalArg(1) int arg0) {
		this.aByteArray84[this.anInt7264++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method5855(@OriginalArg(0) String arg0) {
		@Pc(12) int local12 = arg0.indexOf(0);
		if (local12 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local12 + " - cannot pjstr");
		}
		this.anInt7264 += Static590.method8408(this.aByteArray84, this.anInt7264, arg0, arg0.length());
		this.aByteArray84[this.anInt7264++] = 0;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)I")
	public final int method5856() {
		this.anInt7264 += 2;
		@Pc(38) int local38 = (this.aByteArray84[this.anInt7264 - 1] - 128 & 0xFF) + ((this.aByteArray84[this.anInt7264 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II[II)V")
	public final void method5857(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(15) int local15 = this.anInt7264;
		this.anInt7264 = 5;
		@Pc(25) int local25 = (arg0 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = this.method5878();
			@Pc(37) int local37 = this.method5878();
			@Pc(39) int local39 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= local33 + (local33 << 4 ^ local33 >>> 5) ^ arg1[local39 >>> 11 & 0x3] + local39;
				local39 -= -1640531527;
				local33 -= local39 + arg1[local39 & 0x3] ^ local37 + (local37 << 4 ^ local37 >>> 5);
			}
			this.anInt7264 -= 8;
			this.method5861(local33);
			this.method5861(local37);
		}
		this.anInt7264 = local15;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(Z)I")
	public final int method5858() {
		this.anInt7264 += 3;
		@Pc(43) int local43 = (this.aByteArray84[this.anInt7264 - 1] & 0xFF) + ((this.aByteArray84[this.anInt7264 - 2] & 0xFF) << 8) + ((this.aByteArray84[this.anInt7264 - 3] & 0xFF) << 16);
		if (local43 > 8388607) {
			local43 -= 16777216;
		}
		return local43;
	}

	@OriginalMember(owner = "client!so", name = "e", descriptor = "(II)V")
	public final void method5859(@OriginalArg(0) int arg0) {
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 8);
		this.aByteArray84[this.anInt7264++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Z[BII)V")
	public final void method5860(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = arg1; local7 < arg1 + arg2; local7++) {
			arg0[local7] = this.aByteArray84[this.anInt7264++];
		}
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(IB)V")
	public final void method5861(@OriginalArg(0) int arg0) {
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 24);
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 16);
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 8);
		this.aByteArray84[this.anInt7264++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!so", name = "i", descriptor = "(B)I")
	public final int method5862() {
		this.anInt7264 += 3;
		return ((this.aByteArray84[this.anInt7264 - 2] & 0xFF) << 8) + ((this.aByteArray84[this.anInt7264 - 3] & 0xFF) << 16) + (this.aByteArray84[this.anInt7264 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BI)V")
	public final void method5863(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5854(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5859(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(I)I")
	public final int method5864() {
		this.anInt7264 += 4;
		return ((this.aByteArray84[this.anInt7264 - 4] & 0xFF) << 16) + ((this.aByteArray84[this.anInt7264 - 3] & 0xFF) << 24) + ((this.aByteArray84[this.anInt7264 + -1] & 0xFF) << 8) + (this.aByteArray84[this.anInt7264 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "([IIII)V")
	public final void method5865(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt7264;
		this.anInt7264 = arg1;
		@Pc(17) int local17 = (arg2 - arg1) / 8;
		for (@Pc(26) int local26 = 0; local26 < local17; local26++) {
			@Pc(32) int local32 = this.method5878();
			@Pc(36) int local36 = this.method5878();
			@Pc(38) int local38 = 0;
			@Pc(42) int local42 = 32;
			while (local42-- > 0) {
				local32 += (local36 >>> 5 ^ local36 << 4) + local36 ^ local38 - -arg0[local38 & 0x3];
				local38 += -1640531527;
				local36 += local38 + arg0[local38 >>> 11 & 0xAF800003] ^ local32 + (local32 >>> 5 ^ local32 << 4);
			}
			this.anInt7264 -= 8;
			this.method5861(local32);
			this.method5861(local36);
		}
		this.anInt7264 = local8;
	}

	@OriginalMember(owner = "client!so", name = "j", descriptor = "(B)I")
	public final int method5866() {
		return this.aByteArray84[this.anInt7264++] & 0xFF;
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(IB)V")
	public final void method5867(@OriginalArg(0) int arg0) {
		this.aByteArray84[this.anInt7264++] = (byte) arg0;
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public final void method5868(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray84[this.anInt7264++] = 0;
		this.anInt7264 += Static590.method8408(this.aByteArray84, this.anInt7264, arg0, arg0.length());
		this.aByteArray84[this.anInt7264++] = 0;
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(I)I")
	public final int method5869() {
		this.anInt7264 += 2;
		@Pc(40) int local40 = (this.aByteArray84[this.anInt7264 - 2] - 128 & 0xFF) + ((this.aByteArray84[this.anInt7264 - 1] & 0xFF) << 8);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!so", name = "f", descriptor = "(II)V")
	public final void method5871(@OriginalArg(0) int arg0) {
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 + 128);
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!so", name = "e", descriptor = "(I)V")
	public final void method5872() {
		if (this.aByteArray84 != null) {
			Static41.method901(this.aByteArray84);
		}
		this.aByteArray84 = null;
	}

	@OriginalMember(owner = "client!so", name = "h", descriptor = "(II)J")
	public final long method5874(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(29) int local29 = local2 * 8;
		@Pc(31) long local31 = 0L;
		while (local29 >= 0) {
			local31 |= ((long) this.aByteArray84[this.anInt7264++] & 0xFFL) << local29;
			local29 -= 8;
		}
		return local31;
	}

	@OriginalMember(owner = "client!so", name = "i", descriptor = "(II)V")
	public final void method5875(@OriginalArg(0) int arg0) {
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 8);
		this.aByteArray84[this.anInt7264++] = (byte) arg0;
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 24);
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!so", name = "k", descriptor = "(B)I")
	public final int method5876() {
		this.anInt7264 += 2;
		return (this.aByteArray84[this.anInt7264 - 2] - 128 & 0xFF) + ((this.aByteArray84[this.anInt7264 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(Z)B")
	public final byte method5877() {
		return (byte) -this.aByteArray84[this.anInt7264++];
	}

	@OriginalMember(owner = "client!so", name = "g", descriptor = "(I)I")
	public final int method5878() {
		this.anInt7264 += 4;
		return (this.aByteArray84[this.anInt7264 - 1] & 0xFF) + ((this.aByteArray84[this.anInt7264 - 2] & 0xFF) << 8) + ((this.aByteArray84[this.anInt7264 + -4] & 0xFF) << 24) + ((this.aByteArray84[this.anInt7264 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!so", name = "j", descriptor = "(II)V")
	public final void method5879(@OriginalArg(1) int arg0) {
		this.aByteArray84[this.anInt7264++] = (byte) arg0;
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 8);
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 16);
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(Z)B")
	public final byte method5880() {
		return (byte) (128 - this.aByteArray84[this.anInt7264++]);
	}

	@OriginalMember(owner = "client!so", name = "l", descriptor = "(B)I")
	public final int method5881() {
		@Pc(19) int local19 = this.aByteArray84[this.anInt7264] & 0xFF;
		return local19 >= 128 ? this.method5900() - 49152 : this.method5866() + -64;
	}

	@OriginalMember(owner = "client!so", name = "m", descriptor = "(B)I")
	public final int method5882() {
		this.anInt7264 += 4;
		return (this.aByteArray84[this.anInt7264 - 4] & 0xFF) + ((this.aByteArray84[this.anInt7264 - 3] & 0xFF) << 8) + ((this.aByteArray84[this.anInt7264 + -2] & 0xFF) << 16) + ((this.aByteArray84[this.anInt7264 + -1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(BI)V")
	public final void method5883(@OriginalArg(1) int arg0) {
		this.aByteArray84[this.anInt7264++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!so", name = "h", descriptor = "(I)I")
	public final int method5884() {
		this.anInt7264 += 2;
		return ((this.aByteArray84[this.anInt7264 - 1] & 0xFF) << 8) + (this.aByteArray84[this.anInt7264 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!so", name = "i", descriptor = "(I)J")
	public final long method5885() {
		@Pc(15) long local15 = (long) this.method5882() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method5882() & 0xFFFFFFFFL;
		return (local22 << 32) + local15;
	}

	@OriginalMember(owner = "client!so", name = "n", descriptor = "(B)Ljava/lang/String;")
	public final String method5886() {
		if (this.aByteArray84[this.anInt7264] == 0) {
			this.anInt7264++;
			return null;
		} else {
			return this.method5898();
		}
	}

	@OriginalMember(owner = "client!so", name = "o", descriptor = "(B)I")
	public final int method5887() {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = this.method5895();
		while (local16 == 32767) {
			local16 = this.method5895();
			local7 += 32767;
		}
		return local7 + local16;
	}

	@OriginalMember(owner = "client!so", name = "j", descriptor = "(I)I")
	public final int method5888() {
		return -this.aByteArray84[this.anInt7264++] & 0xFF;
	}

	@OriginalMember(owner = "client!so", name = "e", descriptor = "(Z)I")
	public final int method5889() {
		@Pc(16) byte local16 = this.aByteArray84[this.anInt7264++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local18 | local16 & 0x7F) << 7;
			local16 = this.aByteArray84[this.anInt7264++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!so", name = "k", descriptor = "(I)I")
	public final int method5890() {
		this.anInt7264 += 2;
		@Pc(31) int local31 = ((this.aByteArray84[this.anInt7264 - 2] & 0xFF) << 8) + (this.aByteArray84[this.anInt7264 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "([BBII)V")
	public final void method5891(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (this.aByteArray84[this.anInt7264++] - 128);
		}
	}

	@OriginalMember(owner = "client!so", name = "k", descriptor = "(II)V")
	public final void method5892(@OriginalArg(1) int arg0) {
		this.aByteArray84[this.anInt7264++] = (byte) arg0;
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!so", name = "l", descriptor = "(II)V")
	public final void method5893(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5854(arg0 >>> 28 | 0x80);
					}
					this.method5854(arg0 >>> 21 | 0x80);
				}
				this.method5854(arg0 >>> 14 | 0x80);
			}
			this.method5854(arg0 >>> 7 | 0x80);
		}
		this.method5854(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(BI)V")
	public final void method5894(@OriginalArg(1) int arg0) {
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 8);
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!so", name = "l", descriptor = "(I)I")
	public final int method5895() {
		@Pc(19) int local19 = this.aByteArray84[this.anInt7264] & 0xFF;
		return local19 < 128 ? this.method5866() : this.method5900() - 32768;
	}

	@OriginalMember(owner = "client!so", name = "e", descriptor = "(IB)V")
	public final void method5896(@OriginalArg(0) int arg0) {
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!so", name = "m", descriptor = "(II)V")
	public final void method5897(@OriginalArg(1) int arg0) {
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 16);
		this.aByteArray84[this.anInt7264++] = (byte) (arg0 >> 8);
		this.aByteArray84[this.anInt7264++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!so", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String method5898() {
		@Pc(11) int local11 = this.anInt7264;
		while (this.aByteArray84[this.anInt7264++] != 0) {
		}
		@Pc(33) int local33 = this.anInt7264 - local11 - 1;
		return local33 == 0 ? "" : Static541.method8227(this.aByteArray84, local11, local33);
	}

	@OriginalMember(owner = "client!so", name = "n", descriptor = "(II)V")
	public final void method5899(@OriginalArg(0) int arg0) {
		this.aByteArray84[this.anInt7264++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!so", name = "f", descriptor = "(Z)I")
	public final int method5900() {
		this.anInt7264 += 2;
		return ((this.aByteArray84[this.anInt7264 - 2] & 0xFF) << 8) + (this.aByteArray84[this.anInt7264 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!so", name = "p", descriptor = "(B)I")
	public final int method5901() {
		this.anInt7264 += 4;
		return ((this.aByteArray84[this.anInt7264 - 2] & 0xFF) << 16) + ((this.aByteArray84[this.anInt7264 - 1] & 0xFF) << 24) + ((this.aByteArray84[this.anInt7264 + -3] & 0xFF) << 8) + (this.aByteArray84[this.anInt7264 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!so", name = "f", descriptor = "(IB)V")
	public final void method5902(@OriginalArg(0) int arg0) {
		this.aByteArray84[this.anInt7264 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray84[this.anInt7264 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray84[this.anInt7264 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray84[this.anInt7264 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!so", name = "q", descriptor = "(B)Ljava/lang/String;")
	public final String method5903() {
		@Pc(22) byte local22 = this.aByteArray84[this.anInt7264++];
		if (local22 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(35) int local35 = this.anInt7264;
		while (this.aByteArray84[this.anInt7264++] != 0) {
		}
		@Pc(58) int local58 = this.anInt7264 - local35 - 1;
		return local58 == 0 ? "" : Static541.method8227(this.aByteArray84, local35, local58);
	}

	@OriginalMember(owner = "client!so", name = "g", descriptor = "(Z)J")
	public final long method5904() {
		@Pc(10) long local10 = (long) this.method5866() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method5878() & 0xFFFFFFFFL;
		return local24 + (local10 << 32);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(JB)V")
	public final void method5905(@OriginalArg(0) long arg0) {
		this.aByteArray84[this.anInt7264++] = (byte) (int) (arg0 >> 56);
		this.aByteArray84[this.anInt7264++] = (byte) (int) (arg0 >> 48);
		this.aByteArray84[this.anInt7264++] = (byte) (int) (arg0 >> 40);
		this.aByteArray84[this.anInt7264++] = (byte) (int) (arg0 >> 32);
		this.aByteArray84[this.anInt7264++] = (byte) (int) (arg0 >> 24);
		this.aByteArray84[this.anInt7264++] = (byte) (int) (arg0 >> 16);
		this.aByteArray84[this.anInt7264++] = (byte) (int) (arg0 >> 8);
		this.aByteArray84[this.anInt7264++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!so", name = "h", descriptor = "(Z)B")
	public final byte method5906() {
		return (byte) (this.aByteArray84[this.anInt7264++] - 128);
	}

	@OriginalMember(owner = "client!so", name = "n", descriptor = "(I)J")
	public final long method5907() {
		@Pc(15) long local15 = (long) this.method5878() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method5878() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}
}

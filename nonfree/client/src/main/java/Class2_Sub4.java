import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!bt", name = "Ab", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_6 = new Class36();

	@OriginalMember(owner = "client!bt", name = "kb", descriptor = "[B")
	public byte[] aByteArray73;

	@OriginalMember(owner = "client!bt", name = "U", descriptor = "I")
	public int anInt5289;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(I)V", line = 1136)
	public Class2_Sub4(@OriginalArg(0) int arg0) {
		this.aByteArray73 = Static45.method1467(arg0);
		this.anInt5289 = 0;
	}

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "([B)V", line = 1186)
	public Class2_Sub4(@OriginalArg(0) byte[] arg0) {
		this.anInt5289 = 0;
		this.aByteArray73 = arg0;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)J", line = 11)
	public final long method4799() {
		@Pc(10) long local10 = (long) this.method4837() & 0xFFFFFFFFL;
		@Pc(19) long local19 = (long) this.method4837() & 0xFFFFFFFFL;
		return local19 + (local10 << 32);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([BIIZ)V", line = 26)
	public final void method4800(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = this.aByteArray73[this.anInt5289++];
		}
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)I", line = 47)
	public final int method4801() {
		this.anInt5289 += 2;
		@Pc(38) int local38 = (this.aByteArray73[this.anInt5289 - 1] - 128 & 0xFF) + ((this.aByteArray73[this.anInt5289 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)B", line = 65)
	public final byte method4802() {
		return (byte) -this.aByteArray73[this.anInt5289++];
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)I", line = 78)
	public final int method4803(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = Static76.method5982(this.anInt5289, arg0, this.aByteArray73);
		this.method4814(local18);
		return local18;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(Z)I", line = 93)
	public final int method4804() {
		this.anInt5289 += 2;
		return (this.aByteArray73[this.anInt5289 - 2] & 0xFF) + ((this.aByteArray73[this.anInt5289 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)I", line = 108)
	public final int method4805() {
		return -this.aByteArray73[this.anInt5289++] & 0xFF;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)V", line = 119)
	public final void method4806(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 16);
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 24);
		this.aByteArray73[this.anInt5289++] = (byte) arg0;
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)I", line = 136)
	public final int method4807() {
		this.anInt5289 += 2;
		return (this.aByteArray73[this.anInt5289 - 1] - 128 & 0xFF) + ((this.aByteArray73[this.anInt5289 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIJ)V", line = 153)
	public final void method4808(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(25) int local25 = local2 * 8; local25 >= 0; local25 -= 8) {
			this.aByteArray73[this.anInt5289++] = (byte) (arg1 >> local25);
		}
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(Z)Z", line = 180)
	public final boolean method4809() {
		this.anInt5289 -= 4;
		@Pc(23) int local23 = Static76.method5982(this.anInt5289, 0, this.aByteArray73);
		@Pc(27) int local27 = this.method4837();
		return local27 == local23;
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(I)Ljava/lang/String;", line = 205)
	public final String method4810() {
		@Pc(14) int local14 = this.anInt5289;
		while (this.aByteArray73[this.anInt5289++] != 0) {
		}
		@Pc(37) int local37 = this.anInt5289 - local14 - 1;
		return local37 == 0 ? "" : Static44.method1464(local14, this.aByteArray73, local37);
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(I)I", line = 244)
	public final int method4812() {
		return 128 - this.aByteArray73[this.anInt5289++] & 0xFF;
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(B)I", line = 255)
	public final int method4813() {
		@Pc(21) byte local21 = this.aByteArray73[this.anInt5289++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local21 & 0x7F | local23) << 7;
			local21 = this.aByteArray73[this.anInt5289++];
		}
		return local23 | local21;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BI)V", line = 279)
	public final void method4814(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 24);
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 16);
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.anInt5289++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(IB)V", line = 294)
	public final void method4815(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.anInt5289++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(B)I", line = 307)
	public final int method4816() {
		return this.aByteArray73[this.anInt5289++] & 0xFF;
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(B)I", line = 318)
	public final int method4817() {
		this.anInt5289 += 2;
		@Pc(33) int local33 = (this.aByteArray73[this.anInt5289 - 2] - 128 & 0xFF) + ((this.aByteArray73[this.anInt5289 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(B)I", line = 340)
	public final int method4818() {
		@Pc(16) int local16 = this.aByteArray73[this.anInt5289] & 0xFF;
		return local16 >= 128 ? this.method4830() - 32768 : this.method4816();
	}

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(B)I", line = 364)
	public final int method4819() {
		@Pc(19) int local19 = this.aByteArray73[this.anInt5289] & 0xFF;
		return local19 >= 128 ? this.method4830() - 49152 : this.method4816() + -64;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(II)V", line = 387)
	public final void method4820(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.anInt5289++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[II)V", line = 447)
	public final void method4822(@OriginalArg(2) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(16) int local16 = this.anInt5289;
		this.anInt5289 = 5;
		@Pc(25) int local25 = (arg1 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = this.method4837();
			@Pc(37) int local37 = this.method4837();
			@Pc(39) int local39 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= arg0[local39 >>> 11 & 0x3] + local39 ^ (local33 >>> 5 ^ local33 << 4) + local33;
				local39 -= -1640531527;
				local33 -= (local37 >>> 5 ^ local37 << 4) + local37 ^ arg0[local39 & 0x3] + local39;
			}
			this.anInt5289 -= 8;
			this.method4814(local33);
			this.method4814(local37);
		}
		this.anInt5289 = local16;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 495)
	public final void method4823(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt5289 += Static325.method5840(arg0.length(), arg0, this.aByteArray73, this.anInt5289);
		this.aByteArray73[this.anInt5289++] = 0;
	}

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(B)I", line = 513)
	public final int method4824() {
		this.anInt5289 += 2;
		@Pc(37) int local37 = ((this.aByteArray73[this.anInt5289 - 2] & 0xFF) << 8) + (this.aByteArray73[this.anInt5289 - 1] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(BI)V", line = 533)
	public final void method4825(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4843(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4844(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(I)B", line = 562)
	public final byte method4826() {
		return this.aByteArray73[this.anInt5289++];
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZI)V", line = 573)
	public final void method4827(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5289 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray73[this.anInt5289 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray73[this.anInt5289 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray73[this.anInt5289 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(BI)V", line = 588)
	public final void method4828(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(B)I", line = 663)
	public final int method4830() {
		this.anInt5289 += 2;
		return ((this.aByteArray73[this.anInt5289 - 2] & 0xFF) << 8) + (this.aByteArray73[this.anInt5289 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(II)V", line = 675)
	public final void method4831(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.anInt5289++] = (byte) arg0;
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[BI)V", line = 694)
	public final void method4832(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(15) int local15 = arg1 - 1; local15 >= 0; local15--) {
			arg0[local15] = this.aByteArray73[this.anInt5289++];
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IJ)V", line = 710)
	public final void method4833(@OriginalArg(1) long arg0) {
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 56);
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 48);
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 40);
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 32);
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 24);
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 16);
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.anInt5289++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(I)I", line = 729)
	public final int method4834() {
		this.anInt5289 += 3;
		return (this.aByteArray73[this.anInt5289 - 1] & 0xFF) + (((this.aByteArray73[this.anInt5289 - 3] & 0xFF) << 16) + ((this.aByteArray73[this.anInt5289 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V", line = 746)
	public final void method4835(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt5289;
		this.anInt5289 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4800(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(36) BigInteger local36 = local23.modPow(arg1, arg0);
		@Pc(39) byte[] local39 = local36.toByteArray();
		this.anInt5289 = 0;
		this.method4843(local39.length);
		this.method4858(local39, local39.length);
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(Z)I", line = 770)
	public final int method4836() {
		this.anInt5289 += 4;
		return ((this.aByteArray73[this.anInt5289 - 4] & 0xFF) << 16) + (((this.aByteArray73[this.anInt5289 - 3] & 0xFF) << 24) + ((this.aByteArray73[this.anInt5289 - 1] & 0xFF) << 8) + (this.aByteArray73[this.anInt5289 + -2] & 0xFF));
	}

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(I)I", line = 782)
	public final int method4837() {
		this.anInt5289 += 4;
		return ((this.aByteArray73[this.anInt5289 - 3] & 0xFF) << 16) + ((this.aByteArray73[this.anInt5289 - 4] & 0xFF) << 24) + ((this.aByteArray73[this.anInt5289 + -2] & 0xFF) << 8) + (this.aByteArray73[this.anInt5289 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(BI)V", line = 794)
	public final void method4838(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5289++] = (byte) arg0;
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 16);
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(II)V", line = 808)
	public final void method4839(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 + 128);
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "(B)I", line = 824)
	public final int method4840() {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.method4818();
		while (local16 == 32767) {
			local16 = this.method4818();
			local12 += 32767;
		}
		return local12 + local16;
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(BI)V", line = 847)
	public final void method4841(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.anInt5289++] = (byte) arg0;
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 24);
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(I)B", line = 862)
	public final byte method4842() {
		return (byte) (128 - this.aByteArray73[this.anInt5289++]);
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(II)V", line = 873)
	public final void method4843(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.anInt5289++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(II)V", line = 886)
	public final void method4844(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.anInt5289++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "(B)I", line = 899)
	public final int method4845() {
		this.anInt5289 += 4;
		return ((this.aByteArray73[this.anInt5289 - 1] & 0xFF) << 24) + ((this.aByteArray73[this.anInt5289 - 2] & 0xFF) << 16) + ((this.aByteArray73[this.anInt5289 + -3] & 0xFF) << 8) + (this.aByteArray73[this.anInt5289 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(II)V", line = 913)
	public final void method4846(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5289++] = (byte) arg0;
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(II)V", line = 926)
	public final void method4847(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 16);
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.anInt5289++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(BI)V", line = 956)
	public final void method4849(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5289++] = (byte) arg0;
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 16);
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(BI)V", line = 970)
	public final void method4850(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4843(arg0 >>> 28 | 0x80);
					}
					this.method4843(arg0 >>> 21 | 0x80);
				}
				this.method4843(arg0 >>> 14 | 0x80);
			}
			this.method4843(arg0 >>> 7 | 0x80);
		}
		this.method4843(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "(B)I", line = 1002)
	public final int method4851() {
		this.anInt5289 += 2;
		@Pc(31) int local31 = (this.aByteArray73[this.anInt5289 - 2] & 0xFF) + ((this.aByteArray73[this.anInt5289 - 1] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(II)V", line = 1019)
	public final void method4852(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5289 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray73[this.anInt5289 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "(I)I", line = 1031)
	public final int method4853() {
		this.anInt5289 += 4;
		return ((this.aByteArray73[this.anInt5289 - 2] & 0xFF) << 24) + (((this.aByteArray73[this.anInt5289 - 1] & 0xFF) << 16) + (this.aByteArray73[this.anInt5289 - 4] << 8 & 0xFF00)) + (this.aByteArray73[this.anInt5289 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "(B)I", line = 1044)
	public final int method4854() {
		this.anInt5289 += 2;
		return ((this.aByteArray73[this.anInt5289 - 1] & 0xFF) << 8) + (this.aByteArray73[this.anInt5289 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "(B)B", line = 1064)
	public final byte method4855() {
		return (byte) (this.aByteArray73[this.anInt5289++] - 128);
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(IB)V", line = 1075)
	public final void method4856(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.anInt5289++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "(I)Ljava/lang/String;", line = 1087)
	public final String method4857() {
		@Pc(14) byte local14 = this.aByteArray73[this.anInt5289++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt5289;
		while (this.aByteArray73[this.anInt5289++] != 0) {
		}
		@Pc(55) int local55 = this.anInt5289 - local27 - 1;
		return local55 == 0 ? "" : Static44.method1464(local27, this.aByteArray73, local55);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BI[BI)V", line = 1120)
	public final void method4858(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1; local8++) {
			this.aByteArray73[this.anInt5289++] = arg0[local8];
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([BIII)V", line = 1147)
	public final void method4859(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = arg1 - 1; local11 >= 0; local11--) {
			arg0[local11] = (byte) (this.aByteArray73[this.anInt5289++] - 128);
		}
	}

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "(B)Ljava/lang/String;", line = 1166)
	public final String method4860() {
		if (this.aByteArray73[this.anInt5289] == 0) {
			this.anInt5289++;
			return null;
		} else {
			return this.method4810();
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(ZI)J", line = 1197)
	public final long method4861(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(22) int local22 = local2 * 8;
		@Pc(24) long local24 = 0L;
		while (local22 >= 0) {
			local24 |= ((long) this.aByteArray73[this.anInt5289++] & 0xFFL) << local22;
			local22 -= 8;
		}
		return local24;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(ZI)V", line = 1227)
	public final void method4862(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5289 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([II)V", line = 1244)
	public final void method4863(@OriginalArg(0) int[] arg0) {
		@Pc(17) int local17 = this.anInt5289 / 8;
		this.anInt5289 = 0;
		for (@Pc(22) int local22 = 0; local22 < local17; local22++) {
			@Pc(28) int local28 = this.method4837();
			@Pc(32) int local32 = this.method4837();
			@Pc(34) int local34 = 0;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local28 += local34 + arg0[local34 & 0x3] ^ local32 + (local32 >>> 5 ^ local32 << 4);
				local34 += -1640531527;
				local32 += local28 + (local28 >>> 5 ^ local28 << 4) ^ arg0[local34 >>> 11 & 0x3] + local34;
			}
			this.anInt5289 -= 8;
			this.method4814(local28);
			this.method4814(local32);
		}
	}

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "(B)I", line = 1286)
	public final int method4864() {
		return this.aByteArray73[this.anInt5289++] - 128 & 0xFF;
	}
}

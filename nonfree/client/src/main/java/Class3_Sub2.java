import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ika")
public class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!ika", name = "R", descriptor = "I")
	public int anInt2178;

	@OriginalMember(owner = "client!ika", name = "q", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!ika", name = "<init>", descriptor = "(I)V")
	public Class3_Sub2(@OriginalArg(0) int arg0) {
		this.anInt2178 = 0;
		this.aByteArray20 = Static348.method4919(arg0);
	}

	@OriginalMember(owner = "client!ika", name = "<init>", descriptor = "([B)V")
	public Class3_Sub2(@OriginalArg(0) byte[] arg0) {
		this.aByteArray20 = arg0;
		this.anInt2178 = 0;
	}

	@OriginalMember(owner = "client!ika", name = "n", descriptor = "(I)I")
	public final int method2009(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = this.aByteArray20[this.anInt2178] & 0xFF;
		return local11 >= arg0 ? this.method2028(arg0 ^ -14667) - 49152 : this.method2048(255) + -64;
	}

	@OriginalMember(owner = "client!ika", name = "e", descriptor = "(II)V")
	public final void method2010(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 + 128);
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ika", name = "d", descriptor = "(I)I")
	public final int method2011() {
		this.anInt2178 += 4;
		return ((this.aByteArray20[this.anInt2178 - 1] & 0xFF) << 16) + ((this.aByteArray20[this.anInt2178 - 2] & 0xFF) << 24) + ((this.aByteArray20[this.anInt2178 + -4] & 0xFF) << 8) + (this.aByteArray20[this.anInt2178 - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!ika", name = "A", descriptor = "(I)I")
	public final int method2012() {
		this.anInt2178 += 3;
		return ((this.aByteArray20[this.anInt2178 - 3] & 0xFF) << 16) + ((this.aByteArray20[this.anInt2178 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt2178 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!ika", name = "l", descriptor = "(I)I")
	public final int method2013() {
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = this.method2054();
		while (local19 == 32767) {
			local19 = this.method2054();
			local15 += 32767;
		}
		return local15 + local19;
	}

	@OriginalMember(owner = "client!ika", name = "e", descriptor = "(B)Ljava/lang/String;")
	public final String method2014() {
		@Pc(8) int local8 = this.anInt2178;
		while (this.aByteArray20[this.anInt2178++] != 0) {
		}
		@Pc(31) int local31 = this.anInt2178 - local8 - 1;
		return local31 == 0 ? "" : Static579.method7511(local8, local31, this.aByteArray20);
	}

	@OriginalMember(owner = "client!ika", name = "t", descriptor = "(I)I")
	public final int method2015() {
		@Pc(16) byte local16 = this.aByteArray20[this.anInt2178++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local18 | local16 & 0x7F) << 7;
			local16 = this.aByteArray20[this.anInt2178++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(IJ)V")
	public final void method2016(@OriginalArg(1) long arg0) {
		this.aByteArray20[this.anInt2178++] = (byte) (int) (arg0 >> 56);
		this.aByteArray20[this.anInt2178++] = (byte) (int) (arg0 >> 48);
		this.aByteArray20[this.anInt2178++] = (byte) (int) (arg0 >> 40);
		this.aByteArray20[this.anInt2178++] = (byte) (int) (arg0 >> 32);
		this.aByteArray20[this.anInt2178++] = (byte) (int) (arg0 >> 24);
		this.aByteArray20[this.anInt2178++] = (byte) (int) (arg0 >> 16);
		this.aByteArray20[this.anInt2178++] = (byte) (int) (arg0 >> 8);
		this.aByteArray20[this.anInt2178++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!ika", name = "u", descriptor = "(I)I")
	public final int method2017() {
		this.anInt2178 += 2;
		@Pc(31) int local31 = (this.aByteArray20[this.anInt2178 - 1] & 0xFF) + ((this.aByteArray20[this.anInt2178 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(BI)V")
	public final void method2018(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt2178++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(Z)Z")
	public final boolean method2019() {
		this.anInt2178 -= 4;
		@Pc(17) int local17 = Static371.method5084(0, this.aByteArray20, this.anInt2178);
		@Pc(21) int local21 = this.method2036();
		return local17 == local21;
	}

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "(IB)V")
	public final void method2020(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt2178++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "([IIIZ)V")
	public final void method2021(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(17) int local17 = this.anInt2178;
		this.anInt2178 = arg2;
		@Pc(27) int local27 = (arg1 - arg2) / 8;
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(37) int local37 = this.method2036();
			@Pc(41) int local41 = this.method2036();
			@Pc(43) int local43 = 0;
			@Pc(47) int local47 = 32;
			while (local47-- > 0) {
				local37 += local43 + arg0[local43 & 0x3] ^ (local41 >>> 5 ^ local41 << 4) + local41;
				local43 += -1640531527;
				local41 += arg0[local43 >>> 11 & 0x3] + local43 ^ (local37 << 4 ^ local37 >>> 5) - -local37;
			}
			this.anInt2178 -= 8;
			this.method2018(local37);
			this.method2018(local41);
		}
		this.anInt2178 = local17;
	}

	@OriginalMember(owner = "client!ika", name = "y", descriptor = "(I)B")
	public final byte method2022() {
		return this.aByteArray20[this.anInt2178++];
	}

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "(I)B")
	public final byte method2023() {
		return (byte) (this.aByteArray20[this.anInt2178++] - 128);
	}

	@OriginalMember(owner = "client!ika", name = "g", descriptor = "(II)V")
	public final void method2024(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt2178++] = (byte) arg0;
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(ZI)V")
	public final void method2025(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt2178++] = (byte) arg0;
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ika", name = "c", descriptor = "(II)J")
	public final long method2026(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(33) int local33 = local6 * 8;
		@Pc(35) long local35 = 0L;
		while (local33 >= 0) {
			local35 |= ((long) this.aByteArray20[this.anInt2178++] & 0xFFL) << local33;
			local33 -= 8;
		}
		return local35;
	}

	@OriginalMember(owner = "client!ika", name = "d", descriptor = "(B)Ljava/lang/String;")
	public final String method2027() {
		@Pc(16) byte local16 = this.aByteArray20[this.anInt2178++];
		if (local16 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(32) int local32 = this.anInt2178;
		while (this.aByteArray20[this.anInt2178++] != 0) {
		}
		@Pc(59) int local59 = this.anInt2178 - local32 - 1;
		return local59 == 0 ? "" : Static579.method7511(local32, local59, this.aByteArray20);
	}

	@OriginalMember(owner = "client!ika", name = "q", descriptor = "(I)I")
	public final int method2028(@OriginalArg(0) int arg0) {
		if (arg0 != -14795) {
			this.method2031();
		}
		this.anInt2178 += 2;
		return (this.aByteArray20[this.anInt2178 - 1] & 0xFF) + ((this.aByteArray20[this.anInt2178 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ika", name = "c", descriptor = "(Z)I")
	public final int method2029() {
		this.anInt2178 += 2;
		return (this.aByteArray20[this.anInt2178 - 2] & 0xFF) + ((this.aByteArray20[this.anInt2178 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ika", name = "g", descriptor = "(B)I")
	public final int method2030() {
		if (this.aByteArray20[this.anInt2178] < 0) {
			return this.method2036() & Integer.MAX_VALUE;
		} else {
			@Pc(26) int local26 = this.method2028(-14795);
			return local26 == 32767 ? -1 : local26;
		}
	}

	@OriginalMember(owner = "client!ika", name = "o", descriptor = "(I)J")
	public final long method2031() {
		@Pc(10) long local10 = (long) this.method2077() & 0xFFFFFFFFL;
		@Pc(23) long local23 = (long) this.method2077() & 0xFFFFFFFFL;
		return (local23 << 32) + local10;
	}

	@OriginalMember(owner = "client!ika", name = "c", descriptor = "(BI)V")
	public final void method2032(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt2178++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ika", name = "d", descriptor = "(II)V")
	public final void method2033(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2065(arg0 >>> 28 | 0x80);
					}
					this.method2065(arg0 >>> 21 | 0x80);
				}
				this.method2065(arg0 >>> 14 | 0x80);
			}
			this.method2065(arg0 >>> 7 | 0x80);
		}
		this.method2065(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ika", name = "d", descriptor = "(BI)V")
	public final void method2034(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt2178++] = (byte) arg0;
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ika", name = "p", descriptor = "(I)J")
	public final long method2035() {
		@Pc(18) long local18 = (long) this.method2048(255) & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method2036() & 0xFFFFFFFFL;
		return (local18 << 32) + local25;
	}

	@OriginalMember(owner = "client!ika", name = "z", descriptor = "(I)I")
	public final int method2036() {
		this.anInt2178 += 4;
		return (this.aByteArray20[this.anInt2178 - 1] & 0xFF) + ((this.aByteArray20[this.anInt2178 - 3] & 0xFF) << 16) + ((this.aByteArray20[this.anInt2178 - 4] & 0xFF) << 24) + ((this.aByteArray20[this.anInt2178 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ika", name = "c", descriptor = "(IB)V")
	public final void method2037(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(B[I)V")
	public final void method2038(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.anInt2178 / 8;
		this.anInt2178 = 0;
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			@Pc(29) int local29 = this.method2036();
			@Pc(35) int local35 = this.method2036();
			@Pc(37) int local37 = -957401312;
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local35 -= (local29 << 4 ^ local29 >>> 5) + local29 ^ arg0[local37 >>> 11 & 0x3] + local37;
				local37 -= -1640531527;
				local29 -= local37 + arg0[local37 & 0x3] ^ local35 + (local35 << 4 ^ local35 >>> 5);
			}
			this.anInt2178 -= 8;
			this.method2018(local29);
			this.method2018(local35);
		}
	}

	@OriginalMember(owner = "client!ika", name = "c", descriptor = "(B)I")
	public final int method2039() {
		return this.aByteArray20[this.anInt2178++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method2040(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(11) int local11 = this.anInt2178;
		this.anInt2178 = 0;
		@Pc(17) byte[] local17 = new byte[local11];
		this.method2064(local11, 0, local17);
		@Pc(28) BigInteger local28 = new BigInteger(local17);
		@Pc(33) BigInteger local33 = local28.modPow(arg1, arg0);
		@Pc(36) byte[] local36 = local33.toByteArray();
		this.anInt2178 = 0;
		this.method2032(local36.length);
		this.method2068(0, local36.length, local36);
	}

	@OriginalMember(owner = "client!ika", name = "i", descriptor = "(II)V")
	public final void method2041(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt2178++] = (byte) arg0;
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ika", name = "d", descriptor = "(IB)V")
	public final void method2042(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt2178 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt2178 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt2178 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt2178 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method2043(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray20[this.anInt2178++] = 0;
		this.anInt2178 += Static152.method9572(this.anInt2178, arg0.length(), this.aByteArray20, arg0);
		this.aByteArray20[this.anInt2178++] = 0;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(B)I")
	public final int method2044() {
		this.anInt2178 += 2;
		return ((this.aByteArray20[this.anInt2178 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt2178 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ika", name = "f", descriptor = "(IB)V")
	public final void method2045(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt2178++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ika", name = "B", descriptor = "(I)V")
	public final void method2046() {
		if (this.aByteArray20 != null) {
			Static348.method4921(this.aByteArray20);
		}
		this.aByteArray20 = null;
	}

	@OriginalMember(owner = "client!ika", name = "w", descriptor = "(I)I")
	public final int method2047() {
		this.anInt2178 += 3;
		@Pc(44) int local44 = (this.aByteArray20[this.anInt2178 - 1] & 0xFF) + (((this.aByteArray20[this.anInt2178 - 3] & 0xFF) << 16) + ((this.aByteArray20[this.anInt2178 - 2] & 0xFF) << 8));
		if (local44 > 8388607) {
			local44 -= 16777216;
		}
		return local44;
	}

	@OriginalMember(owner = "client!ika", name = "c", descriptor = "(I)I")
	public final int method2048(@OriginalArg(0) int arg0) {
		if (arg0 != 255) {
			this.method2017();
		}
		return this.aByteArray20[this.anInt2178++] & 0xFF;
	}

	@OriginalMember(owner = "client!ika", name = "C", descriptor = "(I)B")
	public final byte method2049() {
		return (byte) -this.aByteArray20[this.anInt2178++];
	}

	@OriginalMember(owner = "client!ika", name = "f", descriptor = "(B)I")
	public final int method2050() {
		this.anInt2178 += 2;
		@Pc(33) int local33 = ((this.aByteArray20[this.anInt2178 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt2178 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "(II[BB)V")
	public final void method2051(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			arg1[local10] = (byte) (this.aByteArray20[this.anInt2178++] - 128);
		}
	}

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "(B)I")
	public final int method2052() {
		this.anInt2178 += 2;
		@Pc(37) int local37 = (this.aByteArray20[this.anInt2178 - 2] & 0xFF) + ((this.aByteArray20[this.anInt2178 - 1] & 0xFF) << 8);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "(Z)I")
	public final int method2053() {
		return 128 - this.aByteArray20[this.anInt2178++] & 0xFF;
	}

	@OriginalMember(owner = "client!ika", name = "r", descriptor = "(I)I")
	public final int method2054() {
		@Pc(20) int local20 = this.aByteArray20[this.anInt2178] & 0xFF;
		return local20 >= 128 ? this.method2028(-14795) - 32768 : this.method2048(255);
	}

	@OriginalMember(owner = "client!ika", name = "h", descriptor = "(II)V")
	public final void method2055(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt2178++] = (byte) arg0;
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(II)V")
	public final void method2056(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2065(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2032(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ika", name = "j", descriptor = "(II)V")
	public final void method2057(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt2178 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(III[I)V")
	public final void method2058(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt2178;
		this.anInt2178 = 5;
		@Pc(23) int local23 = (arg0 - 5) / 8;
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(33) int local33 = this.method2036();
			@Pc(39) int local39 = this.method2036();
			@Pc(41) int local41 = -957401312;
			@Pc(45) int local45 = 32;
			while (local45-- > 0) {
				local39 -= local33 + (local33 >>> 5 ^ local33 << 4) ^ local41 + arg1[local41 >>> 11 & 0x3];
				local41 -= -1640531527;
				local33 -= (local39 >>> 5 ^ local39 << 4) + local39 ^ arg1[local41 & 0x3] + local41;
			}
			this.anInt2178 -= 8;
			this.method2018(local33);
			this.method2018(local39);
		}
		this.anInt2178 = local8;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(I)I")
	public final int method2059() {
		this.anInt2178 += 4;
		return (this.aByteArray20[this.anInt2178 - 4] & 0xFF) + ((this.aByteArray20[this.anInt2178 - 3] & 0xFF) << 8) + ((this.aByteArray20[-1 + this.anInt2178] & 0xFF) << 24) + ((this.aByteArray20[this.anInt2178 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ika", name = "s", descriptor = "(I)I")
	public final int method2060() {
		this.anInt2178 += 2;
		return (this.aByteArray20[this.anInt2178 - 1] - 128 & 0xFF) + ((this.aByteArray20[this.anInt2178 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ika", name = "m", descriptor = "(I)I")
	public final int method2061() {
		this.anInt2178 += 3;
		return (this.aByteArray20[this.anInt2178 - 1] & 0xFF) + ((this.aByteArray20[this.anInt2178 - 2] & 0xFF) << 8) + ((this.aByteArray20[this.anInt2178 - 3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ika", name = "v", descriptor = "(I)B")
	public final byte method2062() {
		return (byte) (128 - this.aByteArray20[this.anInt2178++]);
	}

	@OriginalMember(owner = "client!ika", name = "j", descriptor = "(I)J")
	public final long method2063() {
		@Pc(16) long local16 = (long) this.method2036() & 0xFFFFFFFFL;
		@Pc(23) long local23 = (long) this.method2036() & 0xFFFFFFFFL;
		return (local16 << 32) + local23;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(III[B)V")
	public final void method2064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		for (@Pc(3) int local3 = arg1; local3 < arg1 + arg0; local3++) {
			arg2[local3] = this.aByteArray20[this.anInt2178++];
		}
	}

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "(II)V")
	public final void method2065(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt2178++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ika", name = "h", descriptor = "(B)Ljava/lang/String;")
	public final String method2066() {
		if (this.aByteArray20[this.anInt2178] == 0) {
			this.anInt2178++;
			return null;
		} else {
			return this.method2014();
		}
	}

	@OriginalMember(owner = "client!ika", name = "h", descriptor = "(I)I")
	public final int method2067() {
		return this.aByteArray20[this.anInt2178] < 0 ? this.method2036() & Integer.MAX_VALUE : this.method2028(-14795);
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(II[BB)V")
	public final void method2068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		for (@Pc(12) int local12 = arg0; local12 < arg0 + arg1; local12++) {
			this.aByteArray20[this.anInt2178++] = arg2[local12];
		}
	}

	@OriginalMember(owner = "client!ika", name = "x", descriptor = "(I)I")
	public final int method2069() {
		this.anInt2178 += 4;
		return ((this.aByteArray20[this.anInt2178 - 1] & 0xFF) << 8) + ((this.aByteArray20[this.anInt2178 - 4] & 0xFF) << 16) + ((this.aByteArray20[this.anInt2178 + -3] & 0xFF) << 24) + (this.aByteArray20[this.anInt2178 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!ika", name = "f", descriptor = "(II)V")
	public final void method2070(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt2178++] = (byte) arg0;
		this.aByteArray20[this.anInt2178++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(JII)V")
	public final void method2071(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(32) int local32 = local2 * 8; local32 >= 0; local32 -= 8) {
			this.aByteArray20[this.anInt2178++] = (byte) (int) (arg0 >> local32);
		}
	}

	@OriginalMember(owner = "client!ika", name = "e", descriptor = "(IB)I")
	public final int method2072(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = Static371.method5084(arg0, this.aByteArray20, this.anInt2178);
		this.method2018(local19);
		return local19;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public final void method2073(@OriginalArg(0) String arg0) {
		@Pc(16) int local16 = arg0.indexOf(0);
		if (local16 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local16 + " - cannot pjstr");
		}
		this.anInt2178 += Static152.method9572(this.anInt2178, arg0.length(), this.aByteArray20, arg0);
		this.aByteArray20[this.anInt2178++] = 0;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(IB)V")
	public final void method2074(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt2178++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ika", name = "i", descriptor = "(I)I")
	public final int method2075() {
		return -this.aByteArray20[this.anInt2178++] & 0xFF;
	}

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "(BI)V")
	public final void method2076(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt2178 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt2178 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ika", name = "k", descriptor = "(I)I")
	public final int method2077() {
		this.anInt2178 += 4;
		return (this.aByteArray20[this.anInt2178 - 4] & 0xFF) + ((this.aByteArray20[this.anInt2178 - 1] & 0xFF) << 24) + ((this.aByteArray20[this.anInt2178 - 2] & 0xFF) << 16) + ((this.aByteArray20[this.anInt2178 + -3] & 0xFF) << 8);
	}
}

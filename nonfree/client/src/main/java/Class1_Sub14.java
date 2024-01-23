import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!sb", name = "Gb", descriptor = "I")
	public int anInt3290;

	@OriginalMember(owner = "client!sb", name = "A", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V")
	public Class1_Sub14(@OriginalArg(0) int arg0) {
		this.anInt3290 = 0;
		this.aByteArray34 = Static112.method1809(arg0);
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "([B)V")
	public Class1_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray34 = arg0;
		this.anInt3290 = 0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)V")
	public final void method2584(@OriginalArg(0) int arg0) {
		this.aByteArray34[this.anInt3290 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray34[this.anInt3290 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray34[this.anInt3290 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray34[this.anInt3290 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II[BI)V")
	public final void method2585(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			arg1[local10] = this.aByteArray34[this.anInt3290++];
		}
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)Z")
	public final boolean method2586() {
		this.anInt3290 -= 4;
		@Pc(17) int local17 = Static40.method719(this.aByteArray34, this.anInt3290, 0);
		@Pc(23) int local23 = this.method2647();
		return local17 == local23;
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)J")
	public final long method2587() {
		@Pc(8) long local8 = (long) this.method2647() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method2647() & 0xFFFFFFFFL;
		return (local8 << 32) + local17;
	}

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)I")
	public final int method2588() {
		this.anInt3290 += 3;
		return (this.aByteArray34[this.anInt3290 - 1] & 0xFF) + ((this.aByteArray34[this.anInt3290 - 2] & 0xFF) << 8) + ((this.aByteArray34[this.anInt3290 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)V")
	public final void method2589(@OriginalArg(0) int arg0) {
		this.aByteArray34[this.anInt3290++] = (byte) arg0;
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)I")
	public final int method2590() {
		@Pc(7) int local7 = this.aByteArray34[this.anInt3290] & 0xFF;
		return local7 < 128 ? this.method2595() - 64 : this.method2593() - 49152;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)B")
	public final byte method2592() {
		return (byte) (128 - this.aByteArray34[this.anInt3290++]);
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)I")
	public final int method2593() {
		this.anInt3290 += 2;
		return ((this.aByteArray34[this.anInt3290 - 2] & 0xFF) << 8) + (this.aByteArray34[this.anInt3290 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(FB)V")
	public final void method2594(@OriginalArg(0) float arg0) {
		@Pc(12) int local12 = Float.floatToRawIntBits(arg0);
		this.aByteArray34[this.anInt3290++] = (byte) local12;
		this.aByteArray34[this.anInt3290++] = (byte) (local12 >> 8);
		this.aByteArray34[this.anInt3290++] = (byte) (local12 >> 16);
		this.aByteArray34[this.anInt3290++] = (byte) (local12 >> 24);
	}

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "(I)I")
	public final int method2595() {
		return this.aByteArray34[this.anInt3290++] & 0xFF;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)I")
	public final int method2596() {
		return 128 - this.aByteArray34[this.anInt3290++] & 0xFF;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
	public final void method2597(@OriginalArg(0) int arg0) {
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 16);
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 24);
		this.aByteArray34[this.anInt3290++] = (byte) arg0;
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "(I)B")
	public final byte method2598() {
		return this.aByteArray34[this.anInt3290++];
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method2600(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt3290;
		this.anInt3290 = 0;
		@Pc(19) byte[] local19 = new byte[local6];
		this.method2585(local6, local19);
		@Pc(30) BigInteger local30 = new BigInteger(local19);
		@Pc(35) BigInteger local35 = local30.modPow(arg0, arg1);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt3290 = 0;
		this.method2631(local38.length);
		this.method2625(local38.length, local38);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II[IB)V")
	public final void method2602(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) int local8 = this.anInt3290;
		this.anInt3290 = 5;
		@Pc(27) int local27 = (arg0 - 5) / 8;
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(40) int local40 = this.method2647();
			@Pc(44) int local44 = this.method2647();
			@Pc(46) int local46 = -957401312;
			@Pc(48) int local48 = 32;
			while (local48-- > 0) {
				local44 -= (local40 << 4 ^ local40 >>> 5) + local40 ^ local46 + arg1[local46 >>> 11 & 0x13E00003];
				local46 -= -1640531527;
				local40 -= arg1[local46 & 0x3] + local46 ^ local44 + (local44 >>> 5 ^ local44 << 4);
			}
			this.anInt3290 -= 8;
			this.method2630(local40);
			this.method2630(local44);
		}
		this.anInt3290 = local8;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(JB)V")
	public final void method2603(@OriginalArg(0) long arg0) {
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 56);
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 48);
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 40);
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 32);
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 24);
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 16);
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 8);
		this.aByteArray34[this.anInt3290++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BF)V")
	public final void method2604(@OriginalArg(1) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray34[this.anInt3290++] = (byte) (local2 >> 24);
		this.aByteArray34[this.anInt3290++] = (byte) (local2 >> 16);
		this.aByteArray34[this.anInt3290++] = (byte) (local2 >> 8);
		this.aByteArray34[this.anInt3290++] = (byte) local2;
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(B)Ljava/lang/String;")
	public final String method2605() {
		@Pc(12) int local12 = this.anInt3290;
		while (this.aByteArray34[this.anInt3290++] != 0) {
		}
		return Static13.method198(this.anInt3290 - local12 - 1, this.aByteArray34, local12);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)V")
	public final void method2606(@OriginalArg(1) int arg0) {
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 + 128);
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "(I)B")
	public final byte method2607() {
		return (byte) -this.aByteArray34[this.anInt3290++];
	}

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "(I)I")
	public final int method2608() {
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = this.method2648();
		while (local19 == 32767) {
			local19 = this.method2648();
			local13 += 32767;
		}
		return local13 + local19;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V")
	public final void method2610(@OriginalArg(1) int arg0) {
		this.aByteArray34[this.anInt3290++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)V")
	public final void method2611(@OriginalArg(0) int arg0) {
		this.aByteArray34[this.anInt3290++] = (byte) arg0;
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 8);
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 16);
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(BI)V")
	public final void method2612(@OriginalArg(1) int arg0) {
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 8);
		this.aByteArray34[this.anInt3290++] = (byte) arg0;
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 24);
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[I)V")
	public final void method2613(@OriginalArg(1) int[] arg0) {
		@Pc(18) int local18 = this.anInt3290 / 8;
		this.anInt3290 = 0;
		for (@Pc(23) int local23 = 0; local23 < local18; local23++) {
			@Pc(30) int local30 = this.method2647();
			@Pc(34) int local34 = this.method2647();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = 32;
			while (local40-- > 0) {
				local30 += arg0[local38 & 0x3] + local38 ^ local34 + (local34 << 4 ^ local34 >>> 5);
				local38 += -1640531527;
				local34 += (local30 << 4 ^ local30 >>> 5) + local30 ^ local38 - -arg0[local38 >>> 11 & 0x3];
			}
			this.anInt3290 -= 8;
			this.method2630(local30);
			this.method2630(local34);
		}
	}

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "(B)I")
	public final int method2614() {
		this.anInt3290 += 2;
		return ((this.aByteArray34[this.anInt3290 - 1] & 0xFF) << 8) + (this.aByteArray34[this.anInt3290 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(B)I")
	public final int method2615() {
		this.anInt3290 += 2;
		@Pc(33) int local33 = ((this.aByteArray34[this.anInt3290 - 2] & 0xFF) << 8) + (this.aByteArray34[this.anInt3290 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(BI)I")
	public final int method2616(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = Static40.method719(this.aByteArray34, this.anInt3290, arg0);
		this.method2630(local16);
		return local16;
	}

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "(I)I")
	public final int method2617() {
		this.anInt3290 += 2;
		@Pc(34) int local34 = (this.aByteArray34[this.anInt3290 - 2] - 128 & 0xFF) + ((this.aByteArray34[this.anInt3290 - 1] & 0xFF) << 8);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(II)V")
	public final void method2618(@OriginalArg(0) int arg0) {
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 8);
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method2619(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local3 + " - cannot pjstr");
		}
		this.anInt3290 += Static54.method936(arg0, this.aByteArray34, this.anInt3290, arg0.length());
		this.aByteArray34[this.anInt3290++] = 0;
	}

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "(I)I")
	public final int method2620() {
		this.anInt3290 += 4;
		return (this.aByteArray34[this.anInt3290 - 2] & 0xFF) + ((this.aByteArray34[this.anInt3290 - 3] & 0xFF) << 24) + ((this.aByteArray34[this.anInt3290 + -4] & 0xFF) << 16) + ((this.aByteArray34[this.anInt3290 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "(I)I")
	public final int method2621() {
		this.anInt3290 += 2;
		@Pc(38) int local38 = (this.aByteArray34[this.anInt3290 - 2] & 0xFF) + ((this.aByteArray34[this.anInt3290 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(JIB)V")
	public final void method2622(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(27) int local27 = local6 * 8; local27 >= 0; local27 -= 8) {
			this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> local27);
		}
	}

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "(B)I")
	public final int method2623() {
		this.anInt3290 += 2;
		@Pc(38) int local38 = (this.aByteArray34[this.anInt3290 - 1] & 0xFF) + ((this.aByteArray34[this.anInt3290 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(IZ)V")
	public final void method2624(@OriginalArg(0) int arg0) {
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III[B)V")
	public final void method2625(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			this.aByteArray34[this.anInt3290++] = arg1[local13];
		}
	}

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "(I)I")
	public final int method2626() {
		this.anInt3290 += 2;
		return ((this.aByteArray34[this.anInt3290 - 1] & 0xFF) << 8) + (this.aByteArray34[this.anInt3290 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "(I)I")
	public final int method2627() {
		return this.aByteArray34[this.anInt3290++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "(I)I")
	public final int method2628() {
		@Pc(16) byte local16 = this.aByteArray34[this.anInt3290++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local18 | local16 & 0x7F) << 7;
			local16 = this.aByteArray34[this.anInt3290++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "(I)B")
	public final byte method2629() {
		return (byte) (this.aByteArray34[this.anInt3290++] - 128);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(IB)V")
	public final void method2630(@OriginalArg(0) int arg0) {
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 24);
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 16);
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 8);
		this.aByteArray34[this.anInt3290++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(BI)V")
	public final void method2631(@OriginalArg(1) int arg0) {
		this.aByteArray34[this.anInt3290++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "(B)Ljava/lang/String;")
	public final String method2632() {
		if (this.aByteArray34[this.anInt3290] == 0) {
			this.anInt3290++;
			return null;
		} else {
			return this.method2605();
		}
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(BI)J")
	public final long method2633(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(26) int local26 = local6 * 8;
		@Pc(28) long local28 = 0L;
		while (local26 >= 0) {
			local28 |= ((long) this.aByteArray34[this.anInt3290++] & 0xFFL) << local26;
			local26 -= 8;
		}
		return local28;
	}

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "(I)Ljava/lang/String;")
	public final String method2634() {
		@Pc(14) byte local14 = this.aByteArray34[this.anInt3290++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(32) int local32 = this.anInt3290;
		while (this.aByteArray34[this.anInt3290++] != 0) {
		}
		return Static13.method198(this.anInt3290 - local32 - 1, this.aByteArray34, local32);
	}

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "(B)I")
	public final int method2635() {
		this.anInt3290 += 4;
		return (this.aByteArray34[this.anInt3290 - 4] & 0xFF) + ((this.aByteArray34[this.anInt3290 - 1] & 0xFF) << 24) + ((this.aByteArray34[this.anInt3290 - 2] & 0xFF) << 16) + ((this.aByteArray34[this.anInt3290 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(II)V")
	public final void method2636(@OriginalArg(1) int arg0) {
		if ((arg0 & -128) != 0) {
			if ((arg0 & -16384) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2631(arg0 >>> 28 | 0x80);
					}
					this.method2631(arg0 >>> 21 | 0x80);
				}
				this.method2631(arg0 >>> 14 | 0x80);
			}
			this.method2631(arg0 >>> 7 | 0x80);
		}
		this.method2631(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(IB)V")
	public final void method2637(@OriginalArg(0) int arg0) {
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 8);
		this.aByteArray34[this.anInt3290++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "(I)I")
	public final int method2638() {
		this.anInt3290 += 2;
		return ((this.aByteArray34[this.anInt3290 - 2] & 0xFF) << 8) + (this.aByteArray34[this.anInt3290 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "(BI)V")
	public final void method2639(@OriginalArg(1) int arg0) {
		this.aByteArray34[this.anInt3290++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)I")
	public final int method2640() {
		this.anInt3290 += 3;
		return (this.aByteArray34[this.anInt3290 - 3] & 0xFF) + ((this.aByteArray34[this.anInt3290 - 2] & 0xFF) << 8) + ((this.aByteArray34[this.anInt3290 - 1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "(I)I")
	public final int method2641() {
		this.anInt3290 += 4;
		return ((this.aByteArray34[this.anInt3290 - 1] & 0xFF) << 16) + ((this.aByteArray34[this.anInt3290 - 2] & 0xFF) << 24) + ((this.aByteArray34[this.anInt3290 + -4] & 0xFF) << 8) + (this.aByteArray34[this.anInt3290 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(IB)V")
	public final void method2642(@OriginalArg(0) int arg0) {
		this.aByteArray34[this.anInt3290++] = (byte) arg0;
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "(II)V")
	public final void method2643(@OriginalArg(1) int arg0) {
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 16);
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 8);
		this.aByteArray34[this.anInt3290++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(II)V")
	public final void method2644(@OriginalArg(1) int arg0) {
		this.aByteArray34[this.anInt3290++] = (byte) arg0;
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 8);
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 16);
		this.aByteArray34[this.anInt3290++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "([BIII)V")
	public final void method2645(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(15) int local15 = arg1 - 1; local15 >= 0; local15--) {
			arg0[local15] = this.aByteArray34[this.anInt3290++];
		}
	}

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "(I)I")
	public final int method2646() {
		return -this.aByteArray34[this.anInt3290++] & 0xFF;
	}

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "(I)I")
	public final int method2647() {
		this.anInt3290 += 4;
		return (this.aByteArray34[this.anInt3290 - 1] & 0xFF) + ((this.aByteArray34[this.anInt3290 - 2] & 0xFF) << 8) + ((this.aByteArray34[this.anInt3290 + -3] & 0xFF) << 16) + ((this.aByteArray34[-4 + this.anInt3290] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "(I)I")
	public final int method2648() {
		@Pc(7) int local7 = this.aByteArray34[this.anInt3290] & 0xFF;
		return local7 >= 128 ? this.method2593() - 32768 : this.method2595();
	}

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "(II)V")
	public final void method2649(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2631(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2637(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "(II)V")
	public final void method2650(@OriginalArg(1) int arg0) {
		this.aByteArray34[this.anInt3290 - arg0 - 1] = (byte) arg0;
	}
}

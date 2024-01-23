import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!im", name = "X", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!im", name = "Y", descriptor = "I")
	public int anInt3328;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(I)V")
	public Class1_Sub16(@OriginalArg(0) int arg0) {
		this.aByteArray39 = Static75.method1381(arg0);
		this.anInt3328 = 0;
	}

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "([B)V")
	public Class1_Sub16(@OriginalArg(0) byte[] arg0) {
		this.anInt3328 = 0;
		this.aByteArray39 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BI)V")
	public final void method2600(@OriginalArg(1) int arg0) {
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IF)V")
	public final void method2601(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Float.floatToRawIntBits(arg0);
		this.aByteArray39[this.anInt3328++] = (byte) (local6 >> 24);
		this.aByteArray39[this.anInt3328++] = (byte) (local6 >> 16);
		this.aByteArray39[this.anInt3328++] = (byte) (local6 >> 8);
		this.aByteArray39[this.anInt3328++] = (byte) local6;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(I)J")
	public final long method2602() {
		@Pc(15) long local15 = (long) this.method2610() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method2610() & 0xFFFFFFFFL;
		return local22 + (local15 << 32);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BJ)V")
	public final void method2603(@OriginalArg(1) long arg0) {
		this.method2638((int) (arg0 >> 32));
		this.method2638((int) arg0);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method2604(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt3328;
		@Pc(9) byte[] local9 = new byte[local6];
		this.anInt3328 = 0;
		this.method2665(local9, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local9);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt3328 = 0;
		this.method2621(local31.length);
		this.method2623(local31.length, local31);
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(II)V")
	public final void method2605(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2621(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2624(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(II)V")
	public final void method2606(@OriginalArg(0) int arg0) {
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 24);
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 16);
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 8);
		this.aByteArray39[this.anInt3328++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!im", name = "d", descriptor = "(II)V")
	public final void method2607(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((-268435456 & arg0) != 0) {
						this.method2621(arg0 >>> 28 | 0x80);
					}
					this.method2621(arg0 >>> 21 | 0x80);
				}
				this.method2621(arg0 >>> 14 | 0x80);
			}
			this.method2621(arg0 >>> 7 | 0x80);
		}
		this.method2621(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(B)Ljava/lang/String;")
	public final String method2608() {
		@Pc(21) byte local21 = this.aByteArray39[this.anInt3328++];
		if (local21 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(31) int local31 = this.anInt3328;
		while (this.aByteArray39[this.anInt3328++] != 0) {
		}
		return Static74.method1369(this.aByteArray39, this.anInt3328 - local31 - 1, local31);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)V")
	public final void method2609(@OriginalArg(0) int arg0) {
		this.aByteArray39[this.anInt3328++] = (byte) arg0;
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!im", name = "d", descriptor = "(B)I")
	public final int method2610() {
		this.anInt3328 += 4;
		return (this.aByteArray39[this.anInt3328 - 1] & 0xFF) + ((this.aByteArray39[this.anInt3328 - 2] & 0xFF) << 8) + ((this.aByteArray39[this.anInt3328 + -3] & 0xFF) << 16) + ((this.aByteArray39[this.anInt3328 + -4] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!im", name = "e", descriptor = "(B)Ljava/lang/String;")
	public final String method2611() {
		@Pc(6) int local6 = this.anInt3328;
		while (this.aByteArray39[this.anInt3328++] != 0) {
		}
		return Static74.method1369(this.aByteArray39, this.anInt3328 - local6 - 1, local6);
	}

	@OriginalMember(owner = "client!im", name = "e", descriptor = "(II)V")
	public final void method2612(@OriginalArg(0) int arg0) {
		this.aByteArray39[this.anInt3328 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray39[this.anInt3328 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray39[this.anInt3328 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray39[this.anInt3328 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)I")
	public final int method2613() {
		this.anInt3328 += 2;
		return (this.aByteArray39[this.anInt3328 - 2] - 128 & 0xFF) + ((this.aByteArray39[this.anInt3328 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ZI)I")
	public final int method2614(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static238.method4101(arg0, this.aByteArray39, this.anInt3328);
		this.method2606(local11);
		return local11;
	}

	@OriginalMember(owner = "client!im", name = "f", descriptor = "(II)V")
	public final void method2615(@OriginalArg(1) int arg0) {
		this.aByteArray39[this.anInt3328++] = (byte) arg0;
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!im", name = "f", descriptor = "(B)I")
	public final int method2616() {
		this.anInt3328 += 4;
		return ((this.aByteArray39[this.anInt3328 - 2] & 0xFF) << 24) - (-((this.aByteArray39[this.anInt3328 - 1] & 0xFF) << 16) - ((this.aByteArray39[this.anInt3328 - 4] & 0xFF) << 8) - (this.aByteArray39[this.anInt3328 - 3] & 0xFF));
	}

	@OriginalMember(owner = "client!im", name = "g", descriptor = "(II)V")
	public final void method2617(@OriginalArg(0) int arg0) {
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 8);
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(I)I")
	public final int method2618() {
		@Pc(11) int local11 = this.aByteArray39[this.anInt3328] & 0xFF;
		return local11 >= 128 ? this.method2652() - 32768 : this.method2655();
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(JII)V")
	public final void method2619(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(23) int local23 = local6 * 8; local23 >= 0; local23 -= 8) {
			this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> local23);
		}
	}

	@OriginalMember(owner = "client!im", name = "h", descriptor = "(II)V")
	public final void method2621(@OriginalArg(1) int arg0) {
		this.aByteArray39[this.anInt3328++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!im", name = "g", descriptor = "(B)I")
	public final int method2622() {
		@Pc(14) int local14 = 0;
		@Pc(25) byte local25;
		for (local25 = this.aByteArray39[this.anInt3328++]; local25 < 0; local25 = this.aByteArray39[this.anInt3328++]) {
			local14 = (local25 & 0x7F | local14) << 7;
		}
		return local25 | local14;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II[BI)V")
	public final void method2623(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg0; local14++) {
			this.aByteArray39[this.anInt3328++] = arg1[local14];
		}
	}

	@OriginalMember(owner = "client!im", name = "i", descriptor = "(II)V")
	public final void method2624(@OriginalArg(0) int arg0) {
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 8);
		this.aByteArray39[this.anInt3328++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!im", name = "j", descriptor = "(II)J")
	public final long method2625(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(25) int local25 = local6 * 8;
		@Pc(27) long local27 = 0L;
		while (local25 >= 0) {
			local27 |= ((long) this.aByteArray39[this.anInt3328++] & 0xFFL) << local25;
			local25 -= 8;
		}
		return local27;
	}

	@OriginalMember(owner = "client!im", name = "k", descriptor = "(II)V")
	public final void method2626(@OriginalArg(1) int arg0) {
		this.aByteArray39[this.anInt3328++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!im", name = "l", descriptor = "(II)V")
	public final void method2627(@OriginalArg(0) int arg0) {
		this.aByteArray39[this.anInt3328 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(IB)V")
	public final void method2628(@OriginalArg(0) int arg0) {
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 16);
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 8);
		this.aByteArray39[this.anInt3328++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(IF)V")
	public final void method2629(@OriginalArg(1) float arg0) {
		@Pc(12) int local12 = Float.floatToRawIntBits(arg0);
		this.aByteArray39[this.anInt3328++] = (byte) local12;
		this.aByteArray39[this.anInt3328++] = (byte) (local12 >> 8);
		this.aByteArray39[this.anInt3328++] = (byte) (local12 >> 16);
		this.aByteArray39[this.anInt3328++] = (byte) (local12 >> 24);
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(Ljava/lang/String;B)V")
	public final void method2630(@OriginalArg(0) String arg0) {
		@Pc(9) int local9 = arg0.indexOf(0);
		if (local9 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local9 + " - cannot pjstr");
		}
		this.anInt3328 += Static136.method2346(this.aByteArray39, this.anInt3328, arg0.length(), arg0);
		this.aByteArray39[this.anInt3328++] = 0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(JI)V")
	public final void method2631(@OriginalArg(0) long arg0) {
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 56);
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 48);
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 40);
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 32);
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 24);
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 16);
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 8);
		this.aByteArray39[this.anInt3328++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "([BIII)V")
	public final void method2632(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(14) int local14 = arg1 - 1; local14 >= 0; local14--) {
			arg0[local14] = (byte) (this.aByteArray39[this.anInt3328++] - 128);
		}
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(Z)B")
	public final byte method2633() {
		return this.aByteArray39[this.anInt3328++];
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(Z)I")
	public final int method2634() {
		this.anInt3328 += 3;
		return (this.aByteArray39[this.anInt3328 - 1] & 0xFF) + ((this.aByteArray39[this.anInt3328 - 3] & 0xFF) << 16) + ((this.aByteArray39[this.anInt3328 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!im", name = "e", descriptor = "(I)Z")
	public final boolean method2635() {
		this.anInt3328 -= 4;
		@Pc(24) int local24 = Static238.method4101(0, this.aByteArray39, this.anInt3328);
		@Pc(28) int local28 = this.method2610();
		return local28 == local24;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I[I)V")
	public final void method2636(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.anInt3328 / 8;
		this.anInt3328 = 0;
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			@Pc(28) int local28 = this.method2610();
			@Pc(32) int local32 = this.method2610();
			@Pc(34) int local34 = 0;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local28 += local32 + (local32 >>> 5 ^ local32 << 4) ^ local34 - -arg0[local34 & 0x3];
				local34 += -1640531527;
				local32 += (local28 << 4 ^ local28 >>> 5) + local28 ^ local34 - -arg0[local34 >>> 11 & 0x3];
			}
			this.anInt3328 -= 8;
			this.method2606(local28);
			this.method2606(local32);
		}
	}

	@OriginalMember(owner = "client!im", name = "d", descriptor = "(Z)I")
	public final int method2637() {
		this.anInt3328 += 2;
		@Pc(33) int local33 = (this.aByteArray39[this.anInt3328 - 2] - 128 & 0xFF) + ((this.aByteArray39[this.anInt3328 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(ZI)V")
	public final void method2638(@OriginalArg(1) int arg0) {
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 8);
		this.aByteArray39[this.anInt3328++] = (byte) arg0;
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 24);
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!im", name = "f", descriptor = "(I)Ljava/lang/String;")
	public final String method2639() {
		if (this.aByteArray39[this.anInt3328] == 0) {
			this.anInt3328++;
			return null;
		} else {
			return this.method2611();
		}
	}

	@OriginalMember(owner = "client!im", name = "g", descriptor = "(I)I")
	public final int method2640() {
		this.anInt3328 += 2;
		return ((this.aByteArray39[this.anInt3328 - 2] & 0xFF) << 8) + (this.aByteArray39[this.anInt3328 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!im", name = "e", descriptor = "(Z)B")
	public final byte method2641() {
		return (byte) -this.aByteArray39[this.anInt3328++];
	}

	@OriginalMember(owner = "client!im", name = "f", descriptor = "(Z)B")
	public final byte method2642() {
		return (byte) (this.aByteArray39[this.anInt3328++] - 128);
	}

	@OriginalMember(owner = "client!im", name = "h", descriptor = "(B)I")
	public final int method2644() {
		this.anInt3328 += 3;
		return (this.aByteArray39[this.anInt3328 - 2] & 0xFF) + ((this.aByteArray39[this.anInt3328 - 3] & 0xFF) << 16) + ((this.aByteArray39[this.anInt3328 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!im", name = "h", descriptor = "(I)I")
	public final int method2645() {
		this.anInt3328 += 2;
		@Pc(31) int local31 = (this.aByteArray39[this.anInt3328 - 1] & 0xFF) + ((this.aByteArray39[this.anInt3328 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!im", name = "i", descriptor = "(B)I")
	public final int method2646() {
		this.anInt3328 += 4;
		return (this.aByteArray39[this.anInt3328 - 2] & 0xFF) + ((this.aByteArray39[this.anInt3328 - 4] & 0xFF) << 16) + ((this.aByteArray39[this.anInt3328 + -3] & 0xFF) << 24) + ((this.aByteArray39[this.anInt3328 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!im", name = "i", descriptor = "(I)I")
	public final int method2647() {
		@Pc(3) int local3 = 0;
		@Pc(11) int local11;
		for (local11 = this.method2618(); local11 == 32767; local11 = this.method2618()) {
			local3 += 32767;
		}
		return local3 + local11;
	}

	@OriginalMember(owner = "client!im", name = "j", descriptor = "(I)I")
	public final int method2648() {
		this.anInt3328 += 2;
		@Pc(40) int local40 = (this.aByteArray39[this.anInt3328 - 1] - 128 & 0xFF) + ((this.aByteArray39[this.anInt3328 - 2] & 0xFF) << 8);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!im", name = "k", descriptor = "(I)I")
	public final int method2649() {
		return -this.aByteArray39[this.anInt3328++] & 0xFF;
	}

	@OriginalMember(owner = "client!im", name = "g", descriptor = "(Z)I")
	public final int method2650() {
		this.anInt3328 += 2;
		return (this.aByteArray39[this.anInt3328 - 2] & 0xFF) + ((this.aByteArray39[this.anInt3328 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(BI)V")
	public final void method2651(@OriginalArg(1) int arg0) {
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 16);
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 24);
		this.aByteArray39[this.anInt3328++] = (byte) arg0;
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!im", name = "l", descriptor = "(I)I")
	public final int method2652() {
		this.anInt3328 += 2;
		return ((this.aByteArray39[this.anInt3328 - 2] & 0xFF) << 8) + (this.aByteArray39[this.anInt3328 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!im", name = "j", descriptor = "(B)I")
	public final int method2653() {
		return this.aByteArray39[this.anInt3328++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!im", name = "m", descriptor = "(I)B")
	public final byte method2654() {
		return (byte) (128 - this.aByteArray39[this.anInt3328++]);
	}

	@OriginalMember(owner = "client!im", name = "n", descriptor = "(I)I")
	public final int method2655() {
		return this.aByteArray39[this.anInt3328++] & 0xFF;
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(IB)V")
	public final void method2656(@OriginalArg(0) int arg0) {
		this.aByteArray39[this.anInt3328++] = (byte) arg0;
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 8);
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 16);
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!im", name = "n", descriptor = "(II)V")
	public final void method2657(@OriginalArg(0) int arg0) {
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 + 128);
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!im", name = "o", descriptor = "(I)I")
	public final int method2658() {
		@Pc(11) int local11 = this.aByteArray39[this.anInt3328] & 0xFF;
		return local11 < 128 ? this.method2655() - 64 : this.method2652() + -49152;
	}

	@OriginalMember(owner = "client!im", name = "p", descriptor = "(I)I")
	public final int method2659() {
		this.anInt3328 += 4;
		return (this.aByteArray39[this.anInt3328 - 4] & 0xFF) + ((this.aByteArray39[this.anInt3328 - 3] & 0xFF) << 8) + ((this.aByteArray39[this.anInt3328 + -1] & 0xFF) << 24) + ((this.aByteArray39[this.anInt3328 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!im", name = "o", descriptor = "(II)V")
	public final void method2660(@OriginalArg(1) int arg0) {
		this.aByteArray39[this.anInt3328++] = (byte) arg0;
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 8);
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 16);
		this.aByteArray39[this.anInt3328++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!im", name = "d", descriptor = "(IB)V")
	public final void method2662(@OriginalArg(0) int arg0) {
		this.aByteArray39[this.anInt3328++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!im", name = "h", descriptor = "(Z)I")
	public final int method2663() {
		return 128 - this.aByteArray39[this.anInt3328++] & 0xFF;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II[II)V")
	public final void method2664(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(16) int local16 = (arg0 - 5) / 8;
		@Pc(19) int local19 = this.anInt3328;
		this.anInt3328 = 5;
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			@Pc(31) int local31 = this.method2610();
			@Pc(35) int local35 = this.method2610();
			@Pc(37) int local37 = -957401312;
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local35 -= arg1[local37 >>> 11 & 0x3] + local37 ^ (local31 >>> 5 ^ local31 << 4) - -local31;
				local37 -= -1640531527;
				local31 -= arg1[local37 & 0x3] + local37 ^ local35 + (local35 >>> 5 ^ local35 << 4);
			}
			this.anInt3328 -= 8;
			this.method2606(local31);
			this.method2606(local35);
		}
		this.anInt3328 = local19;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B[BII)V")
	public final void method2665(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = this.aByteArray39[this.anInt3328++];
		}
	}
}

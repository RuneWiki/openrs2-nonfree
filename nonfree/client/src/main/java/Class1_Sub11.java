import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!cg", name = "bb", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
	public int anInt3264;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(I)V")
	public Class1_Sub11(@OriginalArg(0) int arg0) {
		this.aByteArray47 = Static132.method2238(arg0);
		this.anInt3264 = 0;
	}

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "([B)V")
	public Class1_Sub11(@OriginalArg(0) byte[] arg0) {
		this.anInt3264 = 0;
		this.aByteArray47 = arg0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([IB)V")
	public final void method2625(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3264 / 8;
		this.anInt3264 = 0;
		for (@Pc(21) int local21 = 0; local21 < local6; local21++) {
			@Pc(28) int local28 = this.method2643();
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 32;
			@Pc(38) int local38 = this.method2643();
			while (local34-- > 0) {
				local28 += local32 + arg0[local32 & 0x3] ^ (local38 << 4 ^ local38 >>> 5) + local38;
				local32 += -1640531527;
				local38 += (local28 << 4 ^ local28 >>> 5) + local28 ^ arg0[local32 >>> 11 & 0x30C00003] + local32;
			}
			this.anInt3264 -= 8;
			this.method2659(local28);
			this.method2659(local38);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
	public final void method2626(@OriginalArg(0) int arg0) {
		this.aByteArray47[this.anInt3264++] = (byte) arg0;
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 8);
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 16);
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)I")
	public final int method2627() {
		this.anInt3264 += 4;
		return (this.aByteArray47[this.anInt3264 - 2] & 0xFF) + ((this.aByteArray47[this.anInt3264 - 4] & 0xFF) << 16) + ((this.aByteArray47[this.anInt3264 + -3] & 0xFF) << 24) + ((this.aByteArray47[this.anInt3264 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method2628(@OriginalArg(1) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local3 + " - cannot pjstr");
		}
		this.anInt3264 += Static153.method2698(this.aByteArray47, arg0.length(), this.anInt3264, arg0);
		this.aByteArray47[this.anInt3264++] = 0;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)Ljava/lang/String;")
	public final String method2629() {
		@Pc(6) int local6 = this.anInt3264;
		while (this.aByteArray47[this.anInt3264++] != 0) {
		}
		return Static100.method1873(this.anInt3264 - local6 - 1, this.aByteArray47, local6);
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)V")
	public final void method2630(@OriginalArg(1) int arg0) {
		this.aByteArray47[this.anInt3264++] = (byte) arg0;
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)I")
	public final int method2631() {
		this.anInt3264 += 2;
		return ((this.aByteArray47[this.anInt3264 - 2] & 0xFF) << 8) + (this.aByteArray47[this.anInt3264 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)I")
	public final int method2632() {
		this.anInt3264 += 2;
		@Pc(27) int local27 = (this.aByteArray47[this.anInt3264 - 1] & 0xFF) + ((this.aByteArray47[this.anInt3264 - 2] & 0xFF) << 8);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)V")
	public final void method2633(@OriginalArg(1) int arg0) {
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(II)V")
	public final void method2634(@OriginalArg(1) int arg0) {
		this.aByteArray47[this.anInt3264 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray47[this.anInt3264 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray47[this.anInt3264 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray47[this.anInt3264 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)I")
	public final int method2636() {
		this.anInt3264 += 3;
		return ((this.aByteArray47[this.anInt3264 - 3] & 0xFF) << 16) - (-((this.aByteArray47[this.anInt3264 - 1] & 0xFF) << 8) - (this.aByteArray47[this.anInt3264 - 2] & 0xFF));
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[III)V")
	public final void method2637(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt3264;
		this.anInt3264 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.method2643();
			@Pc(29) int local29 = -957401312;
			@Pc(33) int local33 = this.method2643();
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local33 -= arg0[local29 >>> 11 & 0x59000003] + local29 ^ (local27 << 4 ^ local27 >>> 5) + local27;
				local29 -= -1640531527;
				local27 -= local29 + arg0[local29 & 0x3] ^ local33 + (local33 >>> 5 ^ local33 << 4);
			}
			this.anInt3264 -= 8;
			this.method2659(local27);
			this.method2659(local33);
		}
		this.anInt3264 = local8;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(JZ)V")
	public final void method2638(@OriginalArg(0) long arg0) {
		this.method2670((int) (arg0 >> 32));
		this.method2670((int) arg0);
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)I")
	public final int method2639() {
		this.anInt3264 += 2;
		return ((this.aByteArray47[this.anInt3264 - 1] & 0xFF) << 8) + (this.aByteArray47[this.anInt3264 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI)V")
	public final void method2640(@OriginalArg(1) int arg0) {
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 + 128);
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(BI)V")
	public final void method2641(@OriginalArg(1) int arg0) {
		this.aByteArray47[this.anInt3264 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IF)V")
	public final void method2642(@OriginalArg(1) float arg0) {
		@Pc(13) int local13 = Float.floatToRawIntBits(arg0);
		this.aByteArray47[this.anInt3264++] = (byte) local13;
		this.aByteArray47[this.anInt3264++] = (byte) (local13 >> 8);
		this.aByteArray47[this.anInt3264++] = (byte) (local13 >> 16);
		this.aByteArray47[this.anInt3264++] = (byte) (local13 >> 24);
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(B)I")
	public final int method2643() {
		this.anInt3264 += 4;
		return (this.aByteArray47[this.anInt3264 - 1] & 0xFF) + ((this.aByteArray47[this.anInt3264 - 2] & 0xFF) << 8) + ((this.aByteArray47[this.anInt3264 + -3] & 0xFF) << 16) + ((this.aByteArray47[this.anInt3264 - 4] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)I")
	public final int method2644() {
		@Pc(11) int local11 = this.aByteArray47[this.anInt3264] & 0xFF;
		return local11 < 128 ? this.method2690() - 64 : this.method2691() + -49152;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(BI)V")
	public final void method2645(@OriginalArg(1) int arg0) {
		this.aByteArray47[this.anInt3264++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)J")
	public final long method2646() {
		@Pc(16) long local16 = (long) this.method2643() & 0xFFFFFFFFL;
		@Pc(23) long local23 = (long) this.method2643() & 0xFFFFFFFFL;
		return local23 + (local16 << 32);
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)I")
	public final int method2647() {
		return this.aByteArray47[this.anInt3264++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(ZI)V")
	public final void method2648(@OriginalArg(1) int arg0) {
		this.aByteArray47[this.anInt3264++] = (byte) arg0;
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(Z)I")
	public final int method2650() {
		@Pc(17) byte local17 = this.aByteArray47[this.anInt3264++];
		@Pc(23) int local23 = 0;
		while (local17 < 0) {
			local23 = (local23 | local17 & 0x7F) << 7;
			local17 = this.aByteArray47[this.anInt3264++];
		}
		return local17 | local23;
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(II)V")
	public final void method2651(@OriginalArg(0) int arg0) {
		this.aByteArray47[this.anInt3264++] = (byte) arg0;
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 8);
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 16);
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI[BI)V")
	public final void method2652(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (this.aByteArray47[this.anInt3264++] - 128);
		}
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(II)V")
	public final void method2653(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2655(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2660(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)I")
	public final int method2654() {
		return -this.aByteArray47[this.anInt3264++] & 0xFF;
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(BI)V")
	public final void method2655(@OriginalArg(1) int arg0) {
		this.aByteArray47[this.anInt3264++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(B)I")
	public final int method2656() {
		@Pc(3) int local3 = 0;
		@Pc(11) int local11;
		for (local11 = this.method2664(); local11 == 32767; local11 = this.method2664()) {
			local3 += 32767;
		}
		return local3 + local11;
	}

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "(I)I")
	public final int method2657() {
		this.anInt3264 += 2;
		@Pc(38) int local38 = (this.aByteArray47[this.anInt3264 - 2] - 128 & 0xFF) + ((this.aByteArray47[this.anInt3264 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "(II)V")
	public final void method2658(@OriginalArg(0) int arg0) {
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 16);
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 24);
		this.aByteArray47[this.anInt3264++] = (byte) arg0;
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "(II)V")
	public final void method2659(@OriginalArg(1) int arg0) {
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 24);
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 16);
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 8);
		this.aByteArray47[this.anInt3264++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "(II)V")
	public final void method2660(@OriginalArg(1) int arg0) {
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 8);
		this.aByteArray47[this.anInt3264++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "(B)I")
	public final int method2661() {
		this.anInt3264 += 2;
		return ((this.aByteArray47[this.anInt3264 - 1] & 0xFF) << 8) + (this.aByteArray47[this.anInt3264 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "(I)B")
	public final byte method2663() {
		return this.aByteArray47[this.anInt3264++];
	}

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "(I)I")
	public final int method2664() {
		@Pc(18) int local18 = this.aByteArray47[this.anInt3264] & 0xFF;
		return local18 >= 128 ? this.method2691() - 32768 : this.method2690();
	}

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "(B)I")
	public final int method2665() {
		this.anInt3264 += 4;
		return ((this.aByteArray47[this.anInt3264 - 4] & 0xFF) << 8) + (((this.aByteArray47[this.anInt3264 - 2] & 0xFF) << 24) + ((this.aByteArray47[this.anInt3264 - 1] & 0xFF) << 16)) + (this.aByteArray47[this.anInt3264 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "(I)B")
	public final byte method2666() {
		return (byte) (128 - this.aByteArray47[this.anInt3264++]);
	}

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "(B)B")
	public final byte method2667() {
		return (byte) -this.aByteArray47[this.anInt3264++];
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(BI)V")
	public final void method2668(@OriginalArg(1) int arg0) {
		this.aByteArray47[this.anInt3264++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "(I)I")
	public final int method2669() {
		this.anInt3264 += 2;
		@Pc(27) int local27 = (this.aByteArray47[this.anInt3264 - 2] & 0xFF) + ((this.aByteArray47[this.anInt3264 - 1] & 0xFF) << 8);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(ZI)V")
	public final void method2670(@OriginalArg(1) int arg0) {
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 8);
		this.aByteArray47[this.anInt3264++] = (byte) arg0;
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 24);
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(ZI)J")
	public final long method2671(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = arg0 - 1;
		if (local11 < 0 || local11 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(25) int local25 = local11 * 8;
		@Pc(27) long local27 = 0L;
		while (local25 >= 0) {
			local27 |= ((long) this.aByteArray47[this.anInt3264++] & 0xFFL) << local25;
			local25 -= 8;
		}
		return local27;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(JI)V")
	public final void method2673(@OriginalArg(0) long arg0) {
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 56);
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 48);
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 40);
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 32);
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 24);
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 16);
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 8);
		this.aByteArray47[this.anInt3264++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "(I)Z")
	public final boolean method2674() {
		this.anInt3264 -= 4;
		@Pc(24) int local24 = Static133.method2240(this.anInt3264, this.aByteArray47, 0);
		@Pc(28) int local28 = this.method2643();
		return local24 == local28;
	}

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "(I)I")
	public final int method2675() {
		return 128 - this.aByteArray47[this.anInt3264++] & 0xFF;
	}

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "(II)V")
	public final void method2676(@OriginalArg(1) int arg0) {
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 16);
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 8);
		this.aByteArray47[this.anInt3264++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "(II)V")
	public final void method2677(@OriginalArg(0) int arg0) {
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> 8);
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([BIBI)V")
	public final void method2678(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = this.aByteArray47[this.anInt3264++];
		}
	}

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "(B)Ljava/lang/String;")
	public final String method2679() {
		if (this.aByteArray47[this.anInt3264] == 0) {
			this.anInt3264++;
			return null;
		} else {
			return this.method2629();
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BJI)V")
	public final void method2680(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 - 1;
		if (local14 < 0 || local14 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(33) int local33 = local14 * 8; local33 >= 0; local33 -= 8) {
			this.aByteArray47[this.anInt3264++] = (byte) (arg0 >> local33);
		}
	}

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "(B)I")
	public final int method2681() {
		this.anInt3264 += 3;
		return (this.aByteArray47[this.anInt3264 - 1] & 0xFF) + ((this.aByteArray47[this.anInt3264 - 3] & 0xFF) << 16) + ((this.aByteArray47[this.anInt3264 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "(I)Ljava/lang/String;")
	public final String method2683() {
		@Pc(10) byte local10 = this.aByteArray47[this.anInt3264++];
		if (local10 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(33) int local33 = this.anInt3264;
		while (this.aByteArray47[this.anInt3264++] != 0) {
		}
		return Static100.method1873(this.anInt3264 - local33 - 1, this.aByteArray47, local33);
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(IF)V")
	public final void method2684(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Float.floatToRawIntBits(arg0);
		this.aByteArray47[this.anInt3264++] = (byte) (local6 >> 24);
		this.aByteArray47[this.anInt3264++] = (byte) (local6 >> 16);
		this.aByteArray47[this.anInt3264++] = (byte) (local6 >> 8);
		this.aByteArray47[this.anInt3264++] = (byte) local6;
	}

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "(II)I")
	public final int method2685(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static133.method2240(this.anInt3264, this.aByteArray47, arg0);
		this.method2659(local11);
		return local11;
	}

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "(B)I")
	public final int method2686() {
		this.anInt3264 += 4;
		return ((this.aByteArray47[this.anInt3264 - 2] & 0xFF) << 16) + ((this.aByteArray47[this.anInt3264 - 1] & 0xFF) << 24) + ((this.aByteArray47[this.anInt3264 - 3] & 0xFF) << 8) + (this.aByteArray47[this.anInt3264 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
	public final void method2687(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt3264;
		this.anInt3264 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method2678(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(32) BigInteger local32 = local23.modPow(arg1, arg0);
		@Pc(35) byte[] local35 = local32.toByteArray();
		this.anInt3264 = 0;
		this.method2655(local35.length);
		this.method2689(local35.length, local35);
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(ZI)V")
	public final void method2688(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & -16384) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2655(arg0 >>> 28 | 0x80);
					}
					this.method2655(arg0 >>> 21 | 0x80);
				}
				this.method2655(arg0 >>> 14 | 0x80);
			}
			this.method2655(arg0 >>> 7 | 0x80);
		}
		this.method2655(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III[B)V")
	public final void method2689(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aByteArray47[this.anInt3264++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "(I)I")
	public final int method2690() {
		return this.aByteArray47[this.anInt3264++] & 0xFF;
	}

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "(B)I")
	public final int method2691() {
		this.anInt3264 += 2;
		return ((this.aByteArray47[this.anInt3264 - 2] & 0xFF) << 8) + (this.aByteArray47[this.anInt3264 - 1] & 0xFF);
	}
}

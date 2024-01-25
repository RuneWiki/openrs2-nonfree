import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public class Class3_Sub25 extends Class3 {

	@OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
	public int anInt9765;

	@OriginalMember(owner = "client!jp", name = "Bb", descriptor = "[B")
	public byte[] aByteArray106;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(I)V")
	public Class3_Sub25(@OriginalArg(0) int arg0) {
		this.anInt9765 = 0;
		this.aByteArray106 = Static34.method900(arg0);
	}

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "([B)V")
	public Class3_Sub25(@OriginalArg(0) byte[] arg0) {
		this.aByteArray106 = arg0;
		this.anInt9765 = 0;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method8583(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt9765 += Static234.method3931(arg0.length(), arg0, this.anInt9765, this.aByteArray106);
		this.aByteArray106[this.anInt9765++] = 0;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)Ljava/lang/String;")
	public final String method8584() {
		@Pc(14) byte local14 = this.aByteArray106[this.anInt9765++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt9765;
		while (this.aByteArray106[this.anInt9765++] != 0) {
		}
		@Pc(46) int local46 = this.anInt9765 - local27 - 1;
		return local46 == 0 ? "" : Static426.method6150(this.aByteArray106, local27, local46);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IB)V")
	public final void method8585(@OriginalArg(0) int arg0) {
		this.aByteArray106[this.anInt9765 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray106[this.anInt9765 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray106[this.anInt9765 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray106[this.anInt9765 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BI)V")
	public final void method8586(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt9765++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(III[I)V")
	public final void method8587(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(8) int local8 = this.anInt9765;
		this.anInt9765 = arg1;
		@Pc(18) int local18 = (arg0 - arg1) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method8618();
			@Pc(30) int local30 = this.method8618();
			@Pc(32) int local32 = 0;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local26 += (local30 >>> 5 ^ local30 << 4) + local30 ^ local32 + arg2[local32 & 0x3];
				local32 += -1640531527;
				local30 += local32 + arg2[local32 >>> 11 & 0x99E00003] ^ (local26 >>> 5 ^ local26 << 4) + local26;
			}
			this.anInt9765 -= 8;
			this.method8588(local26);
			this.method8588(local30);
		}
		this.anInt9765 = local8;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(IB)V")
	public final void method8588(@OriginalArg(0) int arg0) {
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 24);
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 16);
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 8);
		this.aByteArray106[this.anInt9765++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)I")
	public final int method8589() {
		this.anInt9765 += 2;
		@Pc(31) int local31 = (this.aByteArray106[this.anInt9765 - 1] & 0xFF) + ((this.aByteArray106[this.anInt9765 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "(I)B")
	public final byte method8590() {
		return (byte) (this.aByteArray106[this.anInt9765++] - 128);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)I")
	public final int method8591() {
		@Pc(17) int local17 = this.aByteArray106[this.anInt9765] & 0xFF;
		return local17 < 128 ? this.method8632() - 64 : this.method8593() + -49152;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)I")
	public final int method8592() {
		this.anInt9765 += 2;
		return ((this.aByteArray106[this.anInt9765 - 1] & 0xFF) << 8) + (this.aByteArray106[this.anInt9765 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "(I)I")
	public final int method8593() {
		this.anInt9765 += 2;
		return ((this.aByteArray106[this.anInt9765 - 2] & 0xFF) << 8) + (this.aByteArray106[this.anInt9765 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)I")
	public final int method8594(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static523.method7313(this.anInt9765, this.aByteArray106, arg0);
		this.method8588(local11);
		return local11;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)V")
	public final void method8595(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt9765++] = (byte) arg0;
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 8);
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 16);
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(BI)V")
	public final void method8596(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 8);
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(II)V")
	public final void method8597(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 + 128);
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(BI)V")
	public final void method8598(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt9765++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "(I)B")
	public final byte method8599() {
		return (byte) -this.aByteArray106[this.anInt9765++];
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(Z)J")
	public final long method8600() {
		@Pc(10) long local10 = (long) this.method8618() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method8618() & 0xFFFFFFFFL;
		return (local10 << 32) + local22;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public final void method8601(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt9765;
		this.anInt9765 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method8623(0, local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(36) byte[] local36 = local28.toByteArray();
		this.anInt9765 = 0;
		this.method8649(local36.length);
		this.method8637(local36, local36.length, 0);
	}

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "(II)V")
	public final void method8602(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt9765++] = (byte) arg0;
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IJ)V")
	public final void method8603(@OriginalArg(1) long arg0) {
		this.aByteArray106[this.anInt9765++] = (byte) (int) (arg0 >> 56);
		this.aByteArray106[this.anInt9765++] = (byte) (int) (arg0 >> 48);
		this.aByteArray106[this.anInt9765++] = (byte) (int) (arg0 >> 40);
		this.aByteArray106[this.anInt9765++] = (byte) (int) (arg0 >> 32);
		this.aByteArray106[this.anInt9765++] = (byte) (int) (arg0 >> 24);
		this.aByteArray106[this.anInt9765++] = (byte) (int) (arg0 >> 16);
		this.aByteArray106[this.anInt9765++] = (byte) (int) (arg0 >> 8);
		this.aByteArray106[this.anInt9765++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "(I)I")
	public final int method8604() {
		@Pc(16) int local16 = this.aByteArray106[this.anInt9765] & 0xFF;
		return local16 < 128 ? this.method8632() : this.method8593() - 32768;
	}

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "(B)I")
	public final int method8605() {
		this.anInt9765 += 4;
		return ((this.aByteArray106[this.anInt9765 - 1] & 0xFF) << 8) + ((this.aByteArray106[this.anInt9765 - 3] & 0xFF) << 24) + ((this.aByteArray106[this.anInt9765 - 4] & 0xFF) << 16) + (this.aByteArray106[this.anInt9765 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "(BI)J")
	public final long method8606(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(19) int local19 = local2 * 8;
		@Pc(21) long local21 = 0L;
		while (local19 >= 0) {
			local21 |= ((long) this.aByteArray106[this.anInt9765++] & 0xFFL) << local19;
			local19 -= 8;
		}
		return local21;
	}

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "(I)I")
	public final int method8607() {
		this.anInt9765 += 3;
		return (this.aByteArray106[this.anInt9765 - 1] & 0xFF) + (((this.aByteArray106[this.anInt9765 - 3] & 0xFF) << 16) + ((this.aByteArray106[this.anInt9765 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "(II)V")
	public final void method8608(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "(B)I")
	public final int method8609() {
		return this.aByteArray106[this.anInt9765++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "(B)I")
	public final int method8610() {
		this.anInt9765 += 4;
		return (this.aByteArray106[this.anInt9765 - 3] & 0xFF) + (((this.aByteArray106[this.anInt9765 - 2] & 0xFF) << 24) + ((this.aByteArray106[this.anInt9765 - 1] & 0xFF) << 16)) + ((this.aByteArray106[this.anInt9765 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jp", name = "i", descriptor = "(I)I")
	public final int method8611() {
		this.anInt9765 += 3;
		@Pc(43) int local43 = (this.aByteArray106[this.anInt9765 - 1] & 0xFF) + ((this.aByteArray106[this.anInt9765 - 3] & 0xFF) << 16) + ((this.aByteArray106[this.anInt9765 + -2] & 0xFF) << 8);
		if (local43 > 8388607) {
			local43 -= 16777216;
		}
		return local43;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(III[I)V")
	public final void method8612(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt9765;
		this.anInt9765 = 5;
		@Pc(24) int local24 = (arg0 - 5) / 8;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) int local32 = this.method8618();
			@Pc(36) int local36 = this.method8618();
			@Pc(38) int local38 = -957401312;
			@Pc(42) int local42 = 32;
			while (local42-- > 0) {
				local36 -= (local32 << 4 ^ local32 >>> 5) + local32 ^ local38 - -arg1[local38 >>> 11 & 0x3];
				local38 -= -1640531527;
				local32 -= (local36 >>> 5 ^ local36 << 4) + local36 ^ arg1[local38 & 0x3] + local38;
			}
			this.anInt9765 -= 8;
			this.method8588(local32);
			this.method8588(local36);
		}
		this.anInt9765 = local8;
	}

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "(B)Ljava/lang/String;")
	public final String method8613() {
		@Pc(6) int local6 = this.anInt9765;
		while (this.aByteArray106[this.anInt9765++] != 0) {
		}
		@Pc(25) int local25 = this.anInt9765 - local6 - 1;
		return local25 == 0 ? "" : Static426.method6150(this.aByteArray106, local6, local25);
	}

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "(II)V")
	public final void method8614(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt9765++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "(I)I")
	public final int method8615() {
		return -this.aByteArray106[this.anInt9765++] & 0xFF;
	}

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "(II)V")
	public final void method8616(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt9765++] = (byte) arg0;
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "(B)Ljava/lang/String;")
	public final String method8617() {
		if (this.aByteArray106[this.anInt9765] == 0) {
			this.anInt9765++;
			return null;
		} else {
			return this.method8613();
		}
	}

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "(I)I")
	public final int method8618() {
		this.anInt9765 += 4;
		return ((this.aByteArray106[this.anInt9765 - 3] & 0xFF) << 16) + (this.aByteArray106[this.anInt9765 - 4] << 24 & 0xFF000000) + ((this.aByteArray106[this.anInt9765 + -2] & 0xFF) << 8) + (this.aByteArray106[this.anInt9765 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "(I)I")
	public final int method8619() {
		@Pc(5) int local5 = 0;
		@Pc(14) int local14 = this.method8604();
		while (local14 == 32767) {
			local14 = this.method8604();
			local5 += 32767;
		}
		return local5 + local14;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "([IB)V")
	public final void method8620(@OriginalArg(0) int[] arg0) {
		@Pc(10) int local10 = this.anInt9765 / 8;
		this.anInt9765 = 0;
		for (@Pc(22) int local22 = 0; local22 < local10; local22++) {
			@Pc(28) int local28 = this.method8618();
			@Pc(32) int local32 = this.method8618();
			@Pc(34) int local34 = -957401312;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local32 -= (local28 << 4 ^ local28 >>> 5) + local28 ^ local34 + arg0[local34 >>> 11 & 0x3];
				local34 -= -1640531527;
				local28 -= local34 + arg0[local34 & 0x3] ^ local32 + (local32 << 4 ^ local32 >>> 5);
			}
			this.anInt9765 -= 8;
			this.method8588(local28);
			this.method8588(local32);
		}
	}

	@OriginalMember(owner = "client!jp", name = "i", descriptor = "(B)B")
	public final byte method8621() {
		return this.aByteArray106[this.anInt9765++];
	}

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "(B)J")
	public final long method8622() {
		@Pc(18) long local18 = (long) this.method8632() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method8618() & 0xFFFFFFFFL;
		return local25 + (local18 << 32);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(III[B)V")
	public final void method8623(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		for (@Pc(10) int local10 = arg0; local10 < arg1 + arg0; local10++) {
			arg2[local10] = this.aByteArray106[this.anInt9765++];
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IJI)V")
	public final void method8625(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(21) int local21 = local6 * 8; local21 >= 0; local21 -= 8) {
			this.aByteArray106[this.anInt9765++] = (byte) (int) (arg1 >> local21);
		}
	}

	@OriginalMember(owner = "client!jp", name = "n", descriptor = "(I)I")
	public final int method8626() {
		@Pc(16) byte local16 = this.aByteArray106[this.anInt9765++];
		@Pc(25) int local25 = 0;
		while (local16 < 0) {
			local25 = (local25 | local16 & 0x7F) << 7;
			local16 = this.aByteArray106[this.anInt9765++];
		}
		return local25 | local16;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZ)V")
	public final void method8627(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method8614(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method8649(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "(II)V")
	public final void method8628(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt9765 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jp", name = "i", descriptor = "(II)V")
	public final void method8629(@OriginalArg(0) int arg0) {
		this.aByteArray106[this.anInt9765 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray106[this.anInt9765 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "(II)V")
	public final void method8630(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 8);
		this.aByteArray106[this.anInt9765++] = (byte) arg0;
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 24);
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "(B)I")
	public final int method8631() {
		this.anInt9765 += 2;
		@Pc(40) int local40 = ((this.aByteArray106[this.anInt9765 - 2] & 0xFF) << 8) + (this.aByteArray106[this.anInt9765 - 1] - 128 & 0xFF);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!jp", name = "o", descriptor = "(I)I")
	public final int method8632() {
		return this.aByteArray106[this.anInt9765++] & 0xFF;
	}

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "(B)I")
	public final int method8633() {
		this.anInt9765 += 4;
		return (this.aByteArray106[this.anInt9765 - 4] & 0xFF) + (((this.aByteArray106[this.anInt9765 - 2] & 0xFF) << 16) + ((this.aByteArray106[this.anInt9765 - 1] & 0xFF) << 24) + ((this.aByteArray106[this.anInt9765 + -3] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(IB)V")
	public final void method8634(@OriginalArg(0) int arg0) {
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 16);
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 24);
		this.aByteArray106[this.anInt9765++] = (byte) arg0;
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method8635(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray106[this.anInt9765++] = 0;
		this.anInt9765 += Static234.method3931(arg0.length(), arg0, this.anInt9765, this.aByteArray106);
		this.aByteArray106[this.anInt9765++] = 0;
	}

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "(B)I")
	public final int method8636() {
		this.anInt9765 += 4;
		return (this.aByteArray106[this.anInt9765 - 4] & 0xFF) + ((this.aByteArray106[this.anInt9765 - 3] & 0xFF) << 8) + ((this.aByteArray106[this.anInt9765 + -2] & 0xFF) << 16) + ((this.aByteArray106[this.anInt9765 + -1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "([BIII)V")
	public final void method8637(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(12) int local12 = arg2; local12 < arg2 + arg1; local12++) {
			this.aByteArray106[this.anInt9765++] = arg0[local12];
		}
	}

	@OriginalMember(owner = "client!jp", name = "p", descriptor = "(I)J")
	public final long method8638() {
		@Pc(15) long local15 = (long) this.method8633() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method8633() & 0xFFFFFFFFL;
		return local15 + (local22 << 32);
	}

	@OriginalMember(owner = "client!jp", name = "q", descriptor = "(I)I")
	public final int method8639() {
		this.anInt9765 += 2;
		return ((this.aByteArray106[this.anInt9765 - 2] & 0xFF) << 8) + (this.aByteArray106[this.anInt9765 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "(II)V")
	public final void method8640(@OriginalArg(0) int arg0) {
		this.aByteArray106[this.anInt9765++] = (byte) arg0;
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 8);
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 16);
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jp", name = "n", descriptor = "(B)Z")
	public final boolean method8641() {
		this.anInt9765 -= 4;
		@Pc(25) int local25 = Static523.method7313(this.anInt9765, this.aByteArray106, 0);
		@Pc(29) int local29 = this.method8618();
		return local29 == local25;
	}

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "(BI)V")
	public final void method8642(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 16);
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 8);
		this.aByteArray106[this.anInt9765++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "(Z)B")
	public final byte method8643() {
		return (byte) (128 - this.aByteArray106[this.anInt9765++]);
	}

	@OriginalMember(owner = "client!jp", name = "r", descriptor = "(I)I")
	public final int method8644() {
		this.anInt9765 += 2;
		return ((this.aByteArray106[this.anInt9765 - 1] & 0xFF) << 8) + (this.aByteArray106[this.anInt9765 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "(II)V")
	public final void method8645(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method8614(arg0 >>> 28 | 0x80);
					}
					this.method8614(arg0 >>> 21 | 0x80);
				}
				this.method8614(arg0 >>> 14 | 0x80);
			}
			this.method8614(arg0 >>> 7 | 0x80);
		}
		this.method8614(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!jp", name = "s", descriptor = "(I)I")
	public final int method8646() {
		return 128 - this.aByteArray106[this.anInt9765++] & 0xFF;
	}

	@OriginalMember(owner = "client!jp", name = "t", descriptor = "(I)I")
	public final int method8647() {
		this.anInt9765 += 3;
		return (this.aByteArray106[this.anInt9765 - 2] & 0xFF) + ((this.aByteArray106[this.anInt9765 - 1] & 0xFF) << 8) + ((this.aByteArray106[this.anInt9765 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!jp", name = "u", descriptor = "(I)V")
	public final void method8648() {
		if (this.aByteArray106 != null) {
			Static34.method902(this.aByteArray106);
		}
		this.aByteArray106 = null;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZI)V")
	public final void method8649(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt9765++] = (byte) (arg0 >> 8);
		this.aByteArray106[this.anInt9765++] = (byte) arg0;
	}
}

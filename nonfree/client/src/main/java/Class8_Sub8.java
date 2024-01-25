import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public class Class8_Sub8 extends Class8 {

	@OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
	public int anInt10588 = 0;

	@OriginalMember(owner = "client!ig", name = "J", descriptor = "[B")
	public byte[] aByteArray107;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(I)V")
	public Class8_Sub8(@OriginalArg(0) int arg0) {
		this.aByteArray107 = Static474.method7038(arg0);
	}

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "([B)V")
	public Class8_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray107 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)I")
	public final int method8520() {
		this.anInt10588 += 4;
		return (this.aByteArray107[this.anInt10588 - 2] & 0xFF) + ((this.aByteArray107[this.anInt10588 - 4] & 0xFF) << 16) + ((this.aByteArray107[this.anInt10588 + -3] & 0xFF) << 24) + ((this.aByteArray107[this.anInt10588 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)B")
	public final byte method8521() {
		return (byte) -this.aByteArray107[this.anInt10588++];
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[IIB)V")
	public final void method8522(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt10588;
		this.anInt10588 = 5;
		@Pc(25) int local25 = (arg1 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = this.method8540();
			@Pc(37) int local37 = this.method8540();
			@Pc(39) int local39 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= arg0[local39 >>> 11 & 0x2EC00003] + local39 ^ local33 + (local33 << 4 ^ local33 >>> 5);
				local39 -= -1640531527;
				local33 -= local39 + arg0[local39 & 0x3] ^ local37 + (local37 << 4 ^ local37 >>> 5);
			}
			this.anInt10588 -= 8;
			this.method8523(local33);
			this.method8523(local37);
		}
		this.anInt10588 = local16;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
	public final void method8523(@OriginalArg(0) int arg0) {
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 24);
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 16);
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 8);
		this.aByteArray107[this.anInt10588++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)J")
	public final long method8524() {
		@Pc(15) long local15 = (long) this.method8526() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method8526() & 0xFFFFFFFFL;
		return (local24 << 32) + local15;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)I")
	public final int method8525() {
		return this.aByteArray107[this.anInt10588++] & 0xFF;
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)I")
	public final int method8526() {
		this.anInt10588 += 4;
		return (this.aByteArray107[this.anInt10588 - 4] & 0xFF) + ((this.aByteArray107[this.anInt10588 - 3] & 0xFF) << 8) + ((this.aByteArray107[this.anInt10588 + -2] & 0xFF) << 16) + ((this.aByteArray107[this.anInt10588 + -1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)I")
	public final int method8527() {
		return this.aByteArray107[this.anInt10588++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)I")
	public final int method8528() {
		return -this.aByteArray107[this.anInt10588++] & 0xFF;
	}

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "(I)I")
	public final int method8529() {
		@Pc(16) int local16 = this.aByteArray107[this.anInt10588] & 0xFF;
		return local16 < 128 ? this.method8525() - 64 : this.method8578() - 49152;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)V")
	public final void method8530(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method8562(arg0 >>> 28 | 0x80);
					}
					this.method8562(arg0 >>> 21 | 0x80);
				}
				this.method8562(arg0 >>> 14 | 0x80);
			}
			this.method8562(arg0 >>> 7 | 0x80);
		}
		this.method8562(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(IB)I")
	public final int method8531(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = Static386.method6172(this.anInt10588, arg0, this.aByteArray107);
		this.method8523(local18);
		return local18;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBI[B)V")
	public final void method8532(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		for (@Pc(11) int local11 = arg1; local11 < arg0 + arg1; local11++) {
			this.aByteArray107[this.anInt10588++] = arg2[local11];
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)V")
	public final void method8533(@OriginalArg(0) int arg0) {
		this.aByteArray107[this.anInt10588 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray107[this.anInt10588 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(IB)V")
	public final void method8534(@OriginalArg(0) int arg0) {
		this.aByteArray107[this.anInt10588++] = (byte) arg0;
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(II)V")
	public final void method8535(@OriginalArg(1) int arg0) {
		this.aByteArray107[this.anInt10588++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(II)V")
	public final void method8536(@OriginalArg(1) int arg0) {
		this.aByteArray107[this.anInt10588 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)I")
	public final int method8537() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method8565();
		while (local11 == 32767) {
			local11 = this.method8565();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(II)V")
	public final void method8538(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method8562(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method8548(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(B)B")
	public final byte method8539() {
		return (byte) (this.aByteArray107[this.anInt10588++] - 128);
	}

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "(I)I")
	public final int method8540() {
		this.anInt10588 += 4;
		return ((this.aByteArray107[this.anInt10588 - 3] & 0xFF) << 16) + ((this.aByteArray107[this.anInt10588 - 4] & 0xFF) << 24) + ((this.aByteArray107[this.anInt10588 + -2] & 0xFF) << 8) + (this.aByteArray107[this.anInt10588 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(B)I")
	public final int method8541() {
		this.anInt10588 += 2;
		return ((this.aByteArray107[this.anInt10588 - 1] & 0xFF) << 8) + (this.aByteArray107[this.anInt10588 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(IB)V")
	public final void method8542(@OriginalArg(0) int arg0) {
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 16);
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 8);
		this.aByteArray107[this.anInt10588++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(II)V")
	public final void method8543(@OriginalArg(0) int arg0) {
		this.aByteArray107[this.anInt10588++] = (byte) arg0;
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 8);
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 16);
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZII[B)V")
	public final void method8544(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = arg0 - 1; local11 >= 0; local11--) {
			arg1[local11] = (byte) (this.aByteArray107[this.anInt10588++] - 128);
		}
	}

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "(I)I")
	public final int method8545() {
		this.anInt10588 += 2;
		return ((this.aByteArray107[this.anInt10588 - 2] & 0xFF) << 8) + (this.aByteArray107[this.anInt10588 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "(II)V")
	public final void method8546(@OriginalArg(1) int arg0) {
		this.aByteArray107[this.anInt10588++] = (byte) arg0;
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZ)V")
	public final void method8547(@OriginalArg(0) int arg0) {
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 16);
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 24);
		this.aByteArray107[this.anInt10588++] = (byte) arg0;
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(IZ)V")
	public final void method8548(@OriginalArg(0) int arg0) {
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 8);
		this.aByteArray107[this.anInt10588++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "(B)J")
	public final long method8549() {
		@Pc(15) long local15 = (long) this.method8540() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method8540() & 0xFFFFFFFFL;
		return local22 + (local15 << 32);
	}

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "(B)B")
	public final byte method8550() {
		return this.aByteArray107[this.anInt10588++];
	}

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "(II)V")
	public final void method8551(@OriginalArg(1) int arg0) {
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 + 128);
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "(I)I")
	public final int method8552() {
		return 128 - this.aByteArray107[this.anInt10588++] & 0xFF;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)I")
	public final int method8553() {
		this.anInt10588 += 4;
		return (this.aByteArray107[this.anInt10588 - 4] & 0xFF) + ((this.aByteArray107[this.anInt10588 - 1] & 0xFF) << 24) + ((this.aByteArray107[this.anInt10588 + -2] & 0xFF) << 16) + ((this.aByteArray107[this.anInt10588 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)J")
	public final long method8554(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(27) int local27 = local2 * 8;
		@Pc(29) long local29 = 0L;
		while (local27 >= 0) {
			local29 |= ((long) this.aByteArray107[this.anInt10588++] & 0xFFL) << local27;
			local27 -= 8;
		}
		return local29;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(Z)Z")
	public final boolean method8555() {
		this.anInt10588 -= 4;
		@Pc(17) int local17 = Static386.method6172(this.anInt10588, 0, this.aByteArray107);
		@Pc(21) int local21 = this.method8540();
		return local21 == local17;
	}

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "(B)I")
	public final int method8556() {
		this.anInt10588 += 4;
		return ((this.aByteArray107[this.anInt10588 - 4] & 0xFF) << 8) + ((this.aByteArray107[this.anInt10588 - 1] & 0xFF) << 16) + ((this.aByteArray107[this.anInt10588 + -2] & 0xFF) << 24) + (this.aByteArray107[this.anInt10588 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method8557(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt10588;
		this.anInt10588 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method8563(0, local12, local6);
		@Pc(28) BigInteger local28 = new BigInteger(local12);
		@Pc(33) BigInteger local33 = local28.modPow(arg1, arg0);
		@Pc(36) byte[] local36 = local33.toByteArray();
		this.anInt10588 = 0;
		this.method8548(local36.length);
		this.method8532(local36.length, 0, local36);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(BI)V")
	public final void method8558(@OriginalArg(1) int arg0) {
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[IBI)V")
	public final void method8559(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = this.anInt10588;
		this.anInt10588 = arg0;
		@Pc(26) int local26 = (arg2 - arg0) / 8;
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = this.method8540();
			@Pc(38) int local38 = this.method8540();
			@Pc(40) int local40 = 0;
			@Pc(44) int local44 = 32;
			while (local44-- > 0) {
				local34 += (local38 << 4 ^ local38 >>> 5) + local38 ^ local40 - -arg1[local40 & 0x3];
				local40 += -1640531527;
				local38 += (local34 >>> 5 ^ local34 << 4) + local34 ^ arg1[local40 >>> 11 & 0x3] + local40;
			}
			this.anInt10588 -= 8;
			this.method8523(local34);
			this.method8523(local38);
		}
		this.anInt10588 = local16;
	}

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "(B)I")
	public final int method8560() {
		this.anInt10588 += 3;
		return (this.aByteArray107[this.anInt10588 - 1] & 0xFF) + ((this.aByteArray107[this.anInt10588 - 2] & 0xFF) << 8) + ((this.aByteArray107[this.anInt10588 - 3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "(B)I")
	public final int method8561() {
		this.anInt10588 += 3;
		@Pc(43) int local43 = (this.aByteArray107[this.anInt10588 - 1] & 0xFF) + ((this.aByteArray107[this.anInt10588 - 2] & 0xFF) << 8) + ((this.aByteArray107[this.anInt10588 - 3] & 0xFF) << 16);
		if (local43 > 8388607) {
			local43 -= 16777216;
		}
		return local43;
	}

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "(II)V")
	public final void method8562(@OriginalArg(0) int arg0) {
		this.aByteArray107[this.anInt10588++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II[BI)V")
	public final void method8563(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = arg0; local3 < arg0 + arg2; local3++) {
			arg1[local3] = this.aByteArray107[this.anInt10588++];
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IJ)V")
	public final void method8564(@OriginalArg(1) long arg0) {
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 56);
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 48);
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 40);
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 32);
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 24);
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 16);
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 8);
		this.aByteArray107[this.anInt10588++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "(I)I")
	public final int method8565() {
		@Pc(18) int local18 = this.aByteArray107[this.anInt10588] & 0xFF;
		return local18 < 128 ? this.method8525() : this.method8578() - 32768;
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(IB)V")
	public final void method8566(@OriginalArg(0) int arg0) {
		this.aByteArray107[this.anInt10588++] = (byte) arg0;
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 8);
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 16);
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "(II)V")
	public final void method8567(@OriginalArg(1) int arg0) {
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 8);
		this.aByteArray107[this.anInt10588++] = (byte) arg0;
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 24);
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "(B)I")
	public final int method8568() {
		this.anInt10588 += 2;
		@Pc(36) int local36 = (this.aByteArray107[this.anInt10588 - 1] & 0xFF) + ((this.aByteArray107[this.anInt10588 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "(I)Ljava/lang/String;")
	public final String method8569() {
		@Pc(23) byte local23 = this.aByteArray107[this.anInt10588++];
		if (local23 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(36) int local36 = this.anInt10588;
		while (this.aByteArray107[this.anInt10588++] != 0) {
		}
		@Pc(56) int local56 = this.anInt10588 - local36 - 1;
		return local56 == 0 ? "" : Static287.method4822(local36, this.aByteArray107, local56);
	}

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String method8570() {
		@Pc(6) int local6 = this.anInt10588;
		while (this.aByteArray107[this.anInt10588++] != 0) {
		}
		@Pc(33) int local33 = this.anInt10588 - local6 - 1;
		return local33 == 0 ? "" : Static287.method4822(local6, this.aByteArray107, local33);
	}

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "(I)I")
	public final int method8571() {
		this.anInt10588 += 2;
		@Pc(38) int local38 = ((this.aByteArray107[this.anInt10588 - 1] & 0xFF) << 8) + (this.aByteArray107[this.anInt10588 - 2] & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(BI)V")
	public final void method8572(@OriginalArg(1) int arg0) {
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 >> 8);
		this.aByteArray107[this.anInt10588++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "(II)V")
	public final void method8573(@OriginalArg(1) int arg0) {
		this.aByteArray107[this.anInt10588++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "(I)B")
	public final byte method8574() {
		return (byte) (128 - this.aByteArray107[this.anInt10588++]);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IJZ)V")
	public final void method8575(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(19) int local19 = local0 * 8; local19 >= 0; local19 -= 8) {
			this.aByteArray107[this.anInt10588++] = (byte) (arg1 >> local19);
		}
	}

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "(B)I")
	public final int method8576() {
		this.anInt10588 += 2;
		return (this.aByteArray107[this.anInt10588 - 2] & 0xFF) + ((this.aByteArray107[this.anInt10588 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "(B)V")
	public final void method8577() {
		if (this.aByteArray107 != null) {
			Static474.method7037(this.aByteArray107);
		}
		this.aByteArray107 = null;
	}

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "(I)I")
	public final int method8578() {
		this.anInt10588 += 2;
		return (this.aByteArray107[this.anInt10588 - 1] & 0xFF) + ((this.aByteArray107[this.anInt10588 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method8579(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray107[this.anInt10588++] = 0;
		this.anInt10588 += Static97.method2225(arg0, this.anInt10588, this.aByteArray107, arg0.length());
		this.aByteArray107[this.anInt10588++] = 0;
	}

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "(I)I")
	public final int method8580() {
		@Pc(16) byte local16 = this.aByteArray107[this.anInt10588++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local18 | local16 & 0x7F) << 7;
			local16 = this.aByteArray107[this.anInt10588++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "(B)Ljava/lang/String;")
	public final String method8581() {
		if (this.aByteArray107[this.anInt10588] == 0) {
			this.anInt10588++;
			return null;
		} else {
			return this.method8570();
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public final void method8582(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt10588 += Static97.method2225(arg0, this.anInt10588, this.aByteArray107, arg0.length());
		this.aByteArray107[this.anInt10588++] = 0;
	}

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "(II)V")
	public final void method8583(@OriginalArg(0) int arg0) {
		this.aByteArray107[this.anInt10588 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray107[this.anInt10588 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray107[this.anInt10588 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray107[this.anInt10588 - arg0 - 1] = (byte) arg0;
	}
}

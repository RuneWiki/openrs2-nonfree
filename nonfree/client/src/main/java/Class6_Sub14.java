import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public class Class6_Sub14 extends Class6 {

	@OriginalMember(owner = "client!dga", name = "T", descriptor = "I")
	public int anInt7244;

	@OriginalMember(owner = "client!dga", name = "m", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(I)V")
	public Class6_Sub14(@OriginalArg(0) int arg0) {
		this.anInt7244 = 0;
		this.aByteArray88 = Static576.method7845(arg0);
	}

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "([B)V")
	public Class6_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray88 = arg0;
		this.anInt7244 = 0;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)I")
	public final int method5978() {
		this.anInt7244 += 2;
		@Pc(33) int local33 = (this.aByteArray88[this.anInt7244 - 2] - 128 & 0xFF) + ((this.aByteArray88[this.anInt7244 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(I[BII)V")
	public final void method5979(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			arg0[local14] = (byte) (this.aByteArray88[this.anInt7244++] - 128);
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(II)V")
	public final void method5980(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(I)Ljava/lang/String;")
	public final String method5981() {
		if (this.aByteArray88[this.anInt7244] == 0) {
			this.anInt7244++;
			return null;
		} else {
			return this.method5991();
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)I")
	public final int method5982() {
		this.anInt7244 += 2;
		return ((this.aByteArray88[this.anInt7244 - 1] & 0xFF) << 8) + (this.aByteArray88[this.anInt7244 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "(I)B")
	public final byte method5983() {
		return (byte) (this.aByteArray88[this.anInt7244++] - 128);
	}

	@OriginalMember(owner = "client!dga", name = "f", descriptor = "(I)I")
	public final int method5984() {
		@Pc(25) byte local25 = this.aByteArray88[this.anInt7244++];
		@Pc(27) int local27 = 0;
		while (local25 < 0) {
			local27 = (local25 & 0x7F | local27) << 7;
			local25 = this.aByteArray88[this.anInt7244++];
		}
		return local25 | local27;
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(II)V")
	public final void method5985(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt7244 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dga", name = "g", descriptor = "(I)B")
	public final byte method5987() {
		return (byte) (128 - this.aByteArray88[this.anInt7244++]);
	}

	@OriginalMember(owner = "client!dga", name = "h", descriptor = "(I)I")
	public final int method5988() {
		this.anInt7244 += 3;
		return ((this.aByteArray88[this.anInt7244 - 2] & 0xFF) << 8) + ((this.aByteArray88[this.anInt7244 - 3] & 0xFF) << 16) + (this.aByteArray88[this.anInt7244 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method5989(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = arg0.indexOf(0);
		if (local15 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local15 + " - cannot pjstr");
		}
		this.anInt7244 += Static25.method398(this.aByteArray88, arg0.length(), arg0, this.anInt7244);
		this.aByteArray88[this.anInt7244++] = 0;
	}

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "(II)V")
	public final void method5990(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 24);
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt7244++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public final String method5991() {
		@Pc(6) int local6 = this.anInt7244;
		while (this.aByteArray88[this.anInt7244++] != 0) {
		}
		@Pc(28) int local28 = this.anInt7244 - local6 - 1;
		return local28 == 0 ? "" : Static196.method2960(local28, this.aByteArray88, local6);
	}

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "(II)V")
	public final void method5992(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt7244++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(II[IZ)V")
	public final void method5993(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) int local8 = this.anInt7244;
		this.anInt7244 = 5;
		@Pc(17) int local17 = (arg0 - 5) / 8;
		for (@Pc(26) int local26 = 0; local26 < local17; local26++) {
			@Pc(32) int local32 = this.method6027();
			@Pc(36) int local36 = this.method6027();
			@Pc(38) int local38 = -957401312;
			@Pc(42) int local42 = 32;
			while (local42-- > 0) {
				local36 -= arg1[local38 >>> 11 & 0x3] + local38 ^ local32 + (local32 >>> 5 ^ local32 << 4);
				local38 -= -1640531527;
				local32 -= (local36 >>> 5 ^ local36 << 4) + local36 ^ arg1[local38 & 0x3] + local38;
			}
			this.anInt7244 -= 8;
			this.method5990(local32);
			this.method5990(local36);
		}
		this.anInt7244 = local8;
	}

	@OriginalMember(owner = "client!dga", name = "i", descriptor = "(I)I")
	public final int method5994() {
		this.anInt7244 += 3;
		@Pc(51) int local51 = (this.aByteArray88[this.anInt7244 - 1] & 0xFF) + ((this.aByteArray88[this.anInt7244 - 3] & 0xFF) << 16) + ((this.aByteArray88[this.anInt7244 + -2] & 0xFF) << 8);
		if (local51 > 8388607) {
			local51 -= 16777216;
		}
		return local51;
	}

	@OriginalMember(owner = "client!dga", name = "e", descriptor = "(II)V")
	public final void method5995(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt7244++] = (byte) arg0;
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!dga", name = "j", descriptor = "(I)I")
	public final int method5996() {
		this.anInt7244 += 2;
		return ((this.aByteArray88[this.anInt7244 - 1] & 0xFF) << 8) + (this.aByteArray88[this.anInt7244 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!dga", name = "f", descriptor = "(II)V")
	public final void method5997(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 + 128);
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dga", name = "k", descriptor = "(I)I")
	public final int method5998() {
		@Pc(19) int local19 = this.aByteArray88[this.anInt7244] & 0xFF;
		return local19 >= 128 ? this.method6006() - 32768 : this.method6041();
	}

	@OriginalMember(owner = "client!dga", name = "g", descriptor = "(II)V")
	public final void method5999(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt7244++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZI)V")
	public final void method6000(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt7244 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt7244 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(BI)V")
	public final void method6001(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt7244++] = (byte) arg0;
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 24);
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(BI)J")
	public final long method6002(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(30) int local30 = local2 * 8;
		@Pc(32) long local32 = 0L;
		while (local30 >= 0) {
			local32 |= ((long) this.aByteArray88[this.anInt7244++] & 0xFFL) << local30;
			local30 -= 8;
		}
		return local32;
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(Z)I")
	public final int method6003() {
		@Pc(18) int local18 = Static121.method1828(0, this.aByteArray88, this.anInt7244);
		this.method5990(local18);
		return local18;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IZ)V")
	public final void method6004(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "(BI)I")
	public final int method6005(@OriginalArg(1) int arg0) {
		@Pc(20) int local20 = Static121.method1828(arg0, this.aByteArray88, this.anInt7244);
		this.method5990(local20);
		return local20;
	}

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "(B)I")
	public final int method6006() {
		this.anInt7244 += 2;
		return (this.aByteArray88[this.anInt7244 - 1] & 0xFF) + ((this.aByteArray88[this.anInt7244 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(JI)V")
	public final void method6007(@OriginalArg(0) long arg0) {
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 56);
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 48);
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 40);
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 32);
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 24);
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt7244++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dga", name = "l", descriptor = "(I)I")
	public final int method6008() {
		this.anInt7244 += 2;
		@Pc(32) int local32 = ((this.aByteArray88[this.anInt7244 - 2] & 0xFF) << 8) + (this.aByteArray88[this.anInt7244 - 1] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "(BI)V")
	public final void method6009(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 24);
		this.aByteArray88[this.anInt7244++] = (byte) arg0;
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dga", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String method6010() {
		@Pc(14) byte local14 = this.aByteArray88[this.anInt7244++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(28) int local28 = this.method5984();
		if (this.anInt7244 + local28 > this.aByteArray88.length) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(55) String local55 = Static468.method6563(this.anInt7244, this.aByteArray88, local28);
		this.anInt7244 += local28;
		return local55;
	}

	@OriginalMember(owner = "client!dga", name = "h", descriptor = "(II)V")
	public final void method6011(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt7244++] = (byte) arg0;
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dga", name = "n", descriptor = "(I)I")
	public final int method6012() {
		return this.aByteArray88[this.anInt7244++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!dga", name = "o", descriptor = "(I)I")
	public final int method6013() {
		this.anInt7244 += 4;
		return ((this.aByteArray88[this.anInt7244 - 4] & 0xFF) << 8) + ((this.aByteArray88[this.anInt7244 - 2] & 0xFF) << 24) + ((this.aByteArray88[this.anInt7244 + -1] & 0xFF) << 16) + (this.aByteArray88[this.anInt7244 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "(B)I")
	public final int method6014() {
		this.anInt7244 += 4;
		return ((this.aByteArray88[this.anInt7244 - 3] & 0xFF) << 8) + (((this.aByteArray88[this.anInt7244 - 1] & 0xFF) << 24) + ((this.aByteArray88[this.anInt7244 - 2] & 0xFF) << 16) + (this.aByteArray88[this.anInt7244 - 4] & 0xFF));
	}

	@OriginalMember(owner = "client!dga", name = "p", descriptor = "(I)I")
	public final int method6015() {
		@Pc(17) int local17 = this.aByteArray88[this.anInt7244] & 0xFF;
		return local17 >= 128 ? this.method6006() - 49152 : this.method6041() + -64;
	}

	@OriginalMember(owner = "client!dga", name = "i", descriptor = "(II)V")
	public final void method6016(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt7244++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dga", name = "q", descriptor = "(I)I")
	public final int method6017() {
		this.anInt7244 += 2;
		@Pc(33) int local33 = (this.aByteArray88[this.anInt7244 - 1] - 128 & 0xFF) + ((this.aByteArray88[this.anInt7244 - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(III[B)V")
	public final void method6018(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			arg1[local12] = this.aByteArray88[this.anInt7244++];
		}
	}

	@OriginalMember(owner = "client!dga", name = "r", descriptor = "(I)I")
	public final int method6019() {
		this.anInt7244 += 3;
		return (this.aByteArray88[this.anInt7244 - 3] & 0xFF) + ((this.aByteArray88[this.anInt7244 - 1] & 0xFF) << 16) + ((this.aByteArray88[this.anInt7244 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!dga", name = "e", descriptor = "(B)I")
	public final int method6020() {
		return 128 - this.aByteArray88[this.anInt7244++] & 0xFF;
	}

	@OriginalMember(owner = "client!dga", name = "e", descriptor = "(BI)V")
	public final void method6021(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method6035(arg0 >>> 28 | 0x80);
					}
					this.method6035(arg0 >>> 21 | 0x80);
				}
				this.method6035(arg0 >>> 14 | 0x80);
			}
			this.method6035(arg0 >>> 7 | 0x80);
		}
		this.method6035(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(JZI)V")
	public final void method6022(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(19) int local19 = local6 * 8; local19 >= 0; local19 -= 8) {
			this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> local19);
		}
	}

	@OriginalMember(owner = "client!dga", name = "f", descriptor = "(B)Ljava/lang/String;")
	public final String method6023() {
		@Pc(14) byte local14 = this.aByteArray88[this.anInt7244++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(34) int local34 = this.anInt7244;
		while (this.aByteArray88[this.anInt7244++] != 0) {
		}
		@Pc(56) int local56 = this.anInt7244 - local34 - 1;
		return local56 == 0 ? "" : Static196.method2960(local56, this.aByteArray88, local34);
	}

	@OriginalMember(owner = "client!dga", name = "s", descriptor = "(I)Z")
	public final boolean method6024() {
		this.anInt7244 -= 4;
		@Pc(17) int local17 = Static121.method1828(0, this.aByteArray88, this.anInt7244);
		@Pc(21) int local21 = this.method6027();
		return local17 == local21;
	}

	@OriginalMember(owner = "client!dga", name = "g", descriptor = "(B)B")
	public final byte method6025() {
		return (byte) -this.aByteArray88[this.anInt7244++];
	}

	@OriginalMember(owner = "client!dga", name = "t", descriptor = "(I)I")
	public final int method6026() {
		return -this.aByteArray88[this.anInt7244++] & 0xFF;
	}

	@OriginalMember(owner = "client!dga", name = "u", descriptor = "(I)I")
	public final int method6027() {
		this.anInt7244 += 4;
		return (this.aByteArray88[this.anInt7244 - 1] & 0xFF) + ((this.aByteArray88[this.anInt7244 - 2] & 0xFF) << 8) + ((this.aByteArray88[this.anInt7244 + -4] & 0xFF) << 24) + ((this.aByteArray88[this.anInt7244 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!dga", name = "v", descriptor = "(I)I")
	public final int method6028() {
		this.anInt7244 += 4;
		return (this.aByteArray88[this.anInt7244 - 2] & 0xFF) + ((this.aByteArray88[this.anInt7244 - 1] & 0xFF) << 8) + ((this.aByteArray88[this.anInt7244 + -4] & 0xFF) << 16) + ((this.aByteArray88[this.anInt7244 + -3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!dga", name = "w", descriptor = "(I)I")
	public final int method6029() {
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = this.method5998();
		while (local19 == 32767) {
			local19 = this.method5998();
			local15 += 32767;
		}
		return local15 + local19;
	}

	@OriginalMember(owner = "client!dga", name = "j", descriptor = "(II)V")
	public final void method6030(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt7244 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray88[this.anInt7244 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt7244 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt7244 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dga", name = "k", descriptor = "(II)V")
	public final void method6031(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt7244++] = (byte) arg0;
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "(Z)I")
	public final int method6032() {
		this.anInt7244 += 2;
		return (this.aByteArray88[this.anInt7244 - 1] - 128 & 0xFF) + ((this.aByteArray88[this.anInt7244 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!dga", name = "x", descriptor = "(I)J")
	public final long method6033() {
		@Pc(15) long local15 = (long) this.method6027() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method6027() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "(Z)B")
	public final byte method6034() {
		return this.aByteArray88[this.anInt7244++];
	}

	@OriginalMember(owner = "client!dga", name = "f", descriptor = "(BI)V")
	public final void method6035(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt7244++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method6036(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = Static452.method6442(arg0);
		this.aByteArray88[this.anInt7244++] = 0;
		this.method6021(local7);
		this.anInt7244 += Static511.method7041(this.aByteArray88, this.anInt7244, arg0);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IB)V")
	public final void method6037(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method6035(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5999(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!dga", name = "l", descriptor = "(II)V")
	public final void method6038(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt7244++] = (byte) arg0;
		this.aByteArray88[this.anInt7244++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(III[B)V")
	public final void method6039(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aByteArray88[this.anInt7244++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!dga", name = "g", descriptor = "(BI)V")
	public final void method6040(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt7244++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!dga", name = "h", descriptor = "(B)I")
	public final int method6041() {
		return this.aByteArray88[this.anInt7244++] & 0xFF;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method6042(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(14) int local14 = this.anInt7244;
		this.anInt7244 = 0;
		@Pc(20) byte[] local20 = new byte[local14];
		this.method6018(local14, local20);
		@Pc(31) BigInteger local31 = new BigInteger(local20);
		@Pc(36) BigInteger local36 = local31.modPow(arg1, arg0);
		@Pc(39) byte[] local39 = local36.toByteArray();
		this.anInt7244 = 0;
		this.method5999(local39.length);
		this.method6039(local39.length, local39);
	}
}

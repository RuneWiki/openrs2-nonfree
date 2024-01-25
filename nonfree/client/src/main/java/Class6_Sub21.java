import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public class Class6_Sub21 extends Class6 {

	@OriginalMember(owner = "client!ji", name = "ib", descriptor = "I")
	public int anInt7338;

	@OriginalMember(owner = "client!ji", name = "nb", descriptor = "[B")
	public byte[] aByteArray93;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(I)V")
	public Class6_Sub21(@OriginalArg(0) int arg0) {
		this.anInt7338 = 0;
		this.aByteArray93 = Static380.method5626(arg0);
	}

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "([B)V")
	public Class6_Sub21(@OriginalArg(0) byte[] arg0) {
		this.aByteArray93 = arg0;
		this.anInt7338 = 0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)I")
	public final int method6003() {
		this.anInt7338 += 2;
		return (this.aByteArray93[this.anInt7338 - 1] & 0xFF) + ((this.aByteArray93[this.anInt7338 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
	public final void method6004(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method6062(arg0 >>> 28 | 0x80);
					}
					this.method6062(arg0 >>> 21 | 0x80);
				}
				this.method6062(arg0 >>> 14 | 0x80);
			}
			this.method6062(arg0 >>> 7 | 0x80);
		}
		this.method6062(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)I")
	public final int method6005() {
		@Pc(16) int local16 = this.aByteArray93[this.anInt7338] & 0xFF;
		return local16 < 128 ? this.method6069() : this.method6003() - 32768;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)I")
	public final int method6007() {
		this.anInt7338 += 2;
		@Pc(38) int local38 = ((this.aByteArray93[this.anInt7338 - 1] & 0xFF) << 8) + (this.aByteArray93[this.anInt7338 - 2] - 128 & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BI)V")
	public final void method6008(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt7338 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)V")
	public final void method6009(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method6062(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method6052(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(II)V")
	public final void method6010(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt7338++] = (byte) arg0;
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method6011(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = Static554.method7515(arg0);
		this.aByteArray93[this.anInt7338++] = 0;
		this.method6004(local13);
		this.anInt7338 += Static438.method6236(arg0, this.anInt7338, this.aByteArray93);
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)I")
	public final int method6012() {
		this.anInt7338 += 4;
		return (this.aByteArray93[this.anInt7338 - 4] & 0xFF) + ((this.aByteArray93[this.anInt7338 - 3] & 0xFF) << 8) + ((this.aByteArray93[this.anInt7338 - 1] & 0xFF) << 24) + ((this.aByteArray93[this.anInt7338 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)V")
	public final void method6013() {
		if (this.aByteArray93 != null) {
			Static380.method5624(this.aByteArray93);
		}
		this.aByteArray93 = null;
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(II)V")
	public final void method6014(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt7338 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt7338 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(II)V")
	public final void method6015(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt7338++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(BI)J")
	public final long method6016(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(31) int local31 = local2 * 8;
		@Pc(33) long local33 = 0L;
		while (local31 >= 0) {
			local33 |= ((long) this.aByteArray93[this.anInt7338++] & 0xFFL) << local31;
			local31 -= 8;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)I")
	public final int method6017() {
		@Pc(18) int local18 = Static263.method4406(this.anInt7338, this.aByteArray93, 0);
		this.method6033(local18);
		return local18;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)J")
	public final long method6018() {
		@Pc(16) long local16 = (long) this.method6036() & 0xFFFFFFFFL;
		@Pc(23) long local23 = (long) this.method6036() & 0xFFFFFFFFL;
		return (local16 << 32) + local23;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZJ)V")
	public final void method6019(@OriginalArg(1) long arg0) {
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 56);
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 48);
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 40);
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 32);
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt7338++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)I")
	public final int method6020() {
		this.anInt7338 += 4;
		return (this.aByteArray93[this.anInt7338 - 2] & 0xFF) + ((this.aByteArray93[this.anInt7338 - 4] & 0xFF) << 16) + ((this.aByteArray93[this.anInt7338 + -3] & 0xFF) << 24) + ((this.aByteArray93[this.anInt7338 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IB)V")
	public final void method6021(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt7338 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt7338 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt7338 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt7338 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public final void method6022(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt7338 += Static61.method1261(this.aByteArray93, arg0.length(), this.anInt7338, arg0);
		this.aByteArray93[this.anInt7338++] = 0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI)V")
	public final void method6023(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(ZI)V")
	public final void method6024(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt7338++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(ZI)V")
	public final void method6025(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)I")
	public final int method6026() {
		this.anInt7338 += 2;
		return (this.aByteArray93[this.anInt7338 - 2] & 0xFF) + ((this.aByteArray93[this.anInt7338 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(B)I")
	public final int method6027() {
		@Pc(16) byte local16 = this.aByteArray93[this.anInt7338++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local16 & 0x7F | local18) << 7;
			local16 = this.aByteArray93[this.anInt7338++];
		}
		return local16 | local18;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(BI)V")
	public final void method6028(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt7338++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(B)Ljava/lang/String;")
	public final String method6029() {
		@Pc(19) byte local19 = this.aByteArray93[this.anInt7338++];
		if (local19 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(29) int local29 = this.anInt7338;
		while (this.aByteArray93[this.anInt7338++] != 0) {
		}
		@Pc(52) int local52 = this.anInt7338 - local29 - 1;
		return local52 == 0 ? "" : Static242.method4221(local52, local29, this.aByteArray93);
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(B)I")
	public final int method6030() {
		this.anInt7338 += 3;
		return (this.aByteArray93[this.anInt7338 - 3] & 0xFF) + ((this.aByteArray93[this.anInt7338 - 2] & 0xFF) << 8) + ((this.aByteArray93[this.anInt7338 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)I")
	public final int method6031() {
		this.anInt7338 += 3;
		return (this.aByteArray93[this.anInt7338 - 1] & 0xFF) + ((this.aByteArray93[this.anInt7338 - 2] & 0xFF) << 8) + ((this.aByteArray93[this.anInt7338 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(II)V")
	public final void method6032(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt7338++] = (byte) arg0;
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(IB)V")
	public final void method6033(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt7338++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[III)V")
	public final void method6034(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt7338;
		this.anInt7338 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method6036();
			@Pc(30) int local30 = this.method6036();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= arg0[local32 >>> 11 & 0xCAA00003] + local32 ^ (local26 << 4 ^ local26 >>> 5) + local26;
				local32 -= -1640531527;
				local26 -= local32 + arg0[local32 & 0x3] ^ local30 + (local30 >>> 5 ^ local30 << 4);
			}
			this.anInt7338 -= 8;
			this.method6033(local26);
			this.method6033(local30);
		}
		this.anInt7338 = local8;
	}

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "(I)I")
	public final int method6035() {
		return -this.aByteArray93[this.anInt7338++] & 0xFF;
	}

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "(I)I")
	public final int method6036() {
		this.anInt7338 += 4;
		return (this.aByteArray93[this.anInt7338 - 1] & 0xFF) + (((this.aByteArray93[this.anInt7338 - 4] & 0xFF) << 24) - (-((this.aByteArray93[this.anInt7338 - 3] & 0xFF) << 16) - ((this.aByteArray93[this.anInt7338 - 2] & 0xFF) << 8)));
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(II)V")
	public final void method6037(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 + 128);
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "(I)B")
	public final byte method6038() {
		return (byte) (128 - this.aByteArray93[this.anInt7338++]);
	}

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "(II)V")
	public final void method6039(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt7338++] = (byte) arg0;
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "(B)I")
	public final int method6040() {
		return 128 - this.aByteArray93[this.anInt7338++] & 0xFF;
	}

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "(B)I")
	public final int method6041() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		for (local11 = this.method6005(); local11 == 32767; local11 = this.method6005()) {
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "(I)I")
	public final int method6042() {
		this.anInt7338 += 4;
		return ((this.aByteArray93[this.anInt7338 - 1] & 0xFF) << 24) + (((this.aByteArray93[this.anInt7338 - 2] & 0xFF) << 16) - (-((this.aByteArray93[this.anInt7338 - 3] & 0xFF) << 8) - (this.aByteArray93[this.anInt7338 - 4] & 0xFF)));
	}

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "(I)I")
	public final int method6043() {
		this.anInt7338 += 3;
		@Pc(50) int local50 = ((this.aByteArray93[this.anInt7338 - 3] & 0xFF) << 16) + ((this.aByteArray93[this.anInt7338 - 2] & 0xFF) << 8) + (this.aByteArray93[this.anInt7338 + -1] & 0xFF);
		if (local50 > 8388607) {
			local50 -= 16777216;
		}
		return local50;
	}

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String method6044() {
		@Pc(11) int local11 = this.anInt7338;
		while (this.aByteArray93[this.anInt7338++] != 0) {
		}
		@Pc(31) int local31 = this.anInt7338 - local11 - 1;
		return local31 == 0 ? "" : Static242.method4221(local31, local11, this.aByteArray93);
	}

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "(II)V")
	public final void method6045(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt7338++] = (byte) arg0;
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(IB)V")
	public final void method6047(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt7338++] = (byte) arg0;
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "(B)I")
	public final int method6048() {
		return this.aByteArray93[this.anInt7338++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public final String method6049() {
		if (this.aByteArray93[this.anInt7338] == 0) {
			this.anInt7338++;
			return null;
		} else {
			return this.method6044();
		}
	}

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "(B)Z")
	public final boolean method6050() {
		this.anInt7338 -= 4;
		@Pc(22) int local22 = Static263.method4406(this.anInt7338, this.aByteArray93, 0);
		@Pc(26) int local26 = this.method6036();
		return local26 == local22;
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(BI)V")
	public final void method6052(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt7338++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[BI)V")
	public final void method6053(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = this.aByteArray93[this.anInt7338++];
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(JII)V")
	public final void method6054(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 - 1;
		if (local11 < 0 || local11 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(27) int local27 = local11 * 8; local27 >= 0; local27 -= 8) {
			this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> local27);
		}
	}

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "(I)B")
	public final byte method6055() {
		return this.aByteArray93[this.anInt7338++];
	}

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "(B)I")
	public final int method6056() {
		this.anInt7338 += 2;
		return ((this.aByteArray93[this.anInt7338 - 2] & 0xFF) << 8) + (this.aByteArray93[this.anInt7338 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "(I)I")
	public final int method6057() {
		@Pc(16) int local16 = this.aByteArray93[this.anInt7338] & 0xFF;
		return local16 < 128 ? this.method6069() - 64 : this.method6003() + -49152;
	}

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "(I)I")
	public final int method6058() {
		this.anInt7338 += 2;
		@Pc(31) int local31 = (this.aByteArray93[this.anInt7338 - 1] & 0xFF) + ((this.aByteArray93[this.anInt7338 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "(I)B")
	public final byte method6059() {
		return (byte) (this.aByteArray93[this.anInt7338++] - 128);
	}

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "(II)I")
	public final int method6060(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = Static263.method4406(this.anInt7338, this.aByteArray93, arg0);
		this.method6033(local17);
		return local17;
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(BI)V")
	public final void method6061(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt7338++] = (byte) arg0;
		this.aByteArray93[this.anInt7338++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "(II)V")
	public final void method6062(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt7338++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([BBII)V")
	public final void method6063(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			this.aByteArray93[this.anInt7338++] = arg0[local11];
		}
	}

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "(B)I")
	public final int method6064() {
		this.anInt7338 += 2;
		@Pc(39) int local39 = ((this.aByteArray93[this.anInt7338 - 2] & 0xFF) << 8) + (this.aByteArray93[this.anInt7338 - 1] - 128 & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[BII)V")
	public final void method6065(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(13) int local13 = arg1 - 1; local13 >= 0; local13--) {
			arg0[local13] = (byte) (this.aByteArray93[this.anInt7338++] - 128);
		}
	}

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "(B)I")
	public final int method6066() {
		this.anInt7338 += 4;
		return (this.aByteArray93[this.anInt7338 - 3] & 0xFF) + ((this.aByteArray93[this.anInt7338 - 1] & 0xFF) << 16) + ((this.aByteArray93[this.anInt7338 + -2] & 0xFF) << 24) + ((this.aByteArray93[this.anInt7338 - 4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "(I)B")
	public final byte method6067() {
		return (byte) -this.aByteArray93[this.anInt7338++];
	}

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "(I)I")
	public final int method6068() {
		this.anInt7338 += 2;
		return (this.aByteArray93[this.anInt7338 - 2] - 128 & 0xFF) + ((this.aByteArray93[this.anInt7338 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "(B)I")
	public final int method6069() {
		return this.aByteArray93[this.anInt7338++] & 0xFF;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method6070(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt7338;
		this.anInt7338 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method6053(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt7338 = 0;
		this.method6052(local31.length);
		this.method6063(local31, local31.length);
	}

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "(B)Ljava/lang/String;")
	public final String method6071() {
		@Pc(14) byte local14 = this.aByteArray93[this.anInt7338++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(34) int local34 = this.method6027();
		if (local34 + this.anInt7338 > this.aByteArray93.length) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(56) String local56 = Static228.method4045(this.aByteArray93, this.anInt7338, local34);
		this.anInt7338 += local34;
		return local56;
	}
}

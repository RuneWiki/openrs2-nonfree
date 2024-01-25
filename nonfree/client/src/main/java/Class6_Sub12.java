import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public class Class6_Sub12 extends Class6 {

	@OriginalMember(owner = "client!jr", name = "ub", descriptor = "[B")
	public byte[] aByteArray97;

	@OriginalMember(owner = "client!jr", name = "fb", descriptor = "I")
	public int anInt7556;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(I)V")
	public Class6_Sub12(@OriginalArg(0) int arg0) {
		this.aByteArray97 = Static396.method5734(arg0);
		this.anInt7556 = 0;
	}

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "([B)V")
	public Class6_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aByteArray97 = arg0;
		this.anInt7556 = 0;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(Z)I")
	public final int method5998() {
		this.anInt7556 += 4;
		return (this.aByteArray97[this.anInt7556 - 2] & 0xFF) + ((this.aByteArray97[this.anInt7556 - 4] & 0xFF) << 16) + ((this.aByteArray97[this.anInt7556 - 3] & 0xFF) << 24) + ((this.aByteArray97[this.anInt7556 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)Ljava/lang/String;")
	public final String method5999() {
		@Pc(14) byte local14 = this.aByteArray97[this.anInt7556++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(30) int local30 = this.anInt7556;
		while (this.aByteArray97[this.anInt7556++] != 0) {
		}
		@Pc(53) int local53 = this.anInt7556 - local30 - 1;
		return local53 == 0 ? "" : Static497.method6882(local30, local53, this.aByteArray97);
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)I")
	public final int method6000() {
		this.anInt7556 += 2;
		@Pc(38) int local38 = (this.aByteArray97[this.anInt7556 - 2] & 0xFF) + ((this.aByteArray97[this.anInt7556 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)V")
	public final void method6001(@OriginalArg(1) int arg0) {
		this.aByteArray97[this.anInt7556++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)V")
	public final void method6002(@OriginalArg(1) int arg0) {
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 8);
		this.aByteArray97[this.anInt7556++] = (byte) arg0;
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 24);
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)I")
	public final int method6003() {
		@Pc(13) int local13 = 0;
		@Pc(17) int local17;
		for (local17 = this.method6034(); local17 == 32767; local17 = this.method6034()) {
			local13 += 32767;
		}
		return local13 + local17;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)I")
	public final int method6004() {
		this.anInt7556 += 4;
		return ((this.aByteArray97[this.anInt7556 - 3] & 0xFF) << 8) + (this.aByteArray97[this.anInt7556 - 1] << 24 & 0xFF000000) + ((this.aByteArray97[this.anInt7556 + -2] & 0xFF) << 16) + (this.aByteArray97[this.anInt7556 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(II)I")
	public final int method6005(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = Static402.method5813(this.aByteArray97, arg0, this.anInt7556);
		this.method6042(local17);
		return local17;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZI)V")
	public final void method6006(@OriginalArg(1) int arg0) {
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 16);
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 24);
		this.aByteArray97[this.anInt7556++] = (byte) arg0;
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(B)B")
	public final byte method6007() {
		return (byte) (this.aByteArray97[this.anInt7556++] - 128);
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)I")
	public final int method6008() {
		this.anInt7556 += 4;
		return (this.aByteArray97[this.anInt7556 - 3] & 0xFF) + (((this.aByteArray97[this.anInt7556 - 4] & 0xFF) << 8) + ((this.aByteArray97[this.anInt7556 - 2] & 0xFF) << 24) + ((this.aByteArray97[this.anInt7556 - 1] & 0xFF) << 16));
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method6009(@OriginalArg(1) String arg0) {
		@Pc(15) int local15 = arg0.indexOf(0);
		if (local15 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local15 + " - cannot pjstr");
		}
		this.anInt7556 += Static76.method1092(arg0, arg0.length(), this.aByteArray97, this.anInt7556);
		this.aByteArray97[this.anInt7556++] = 0;
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(Z)I")
	public final int method6010() {
		@Pc(11) int local11 = this.aByteArray97[this.anInt7556] & 0xFF;
		return local11 < 128 ? this.method6019() - 64 : this.method6044() + -49152;
	}

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "(I)I")
	public final int method6011() {
		return 128 - this.aByteArray97[this.anInt7556++] & 0xFF;
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "(B)Ljava/lang/String;")
	public final String method6012() {
		@Pc(14) byte local14 = this.aByteArray97[this.anInt7556++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(28) int local28 = this.method6029();
		if (local28 + this.anInt7556 > this.aByteArray97.length) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(53) String local53 = Static412.method7798(this.aByteArray97, this.anInt7556, local28);
		this.anInt7556 += local28;
		return local53;
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "(Z)B")
	public final byte method6013() {
		return (byte) (128 - this.aByteArray97[this.anInt7556++]);
	}

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "(B)I")
	public final int method6014() {
		return -this.aByteArray97[this.anInt7556++] & 0xFF;
	}

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "(Z)I")
	public final int method6015() {
		this.anInt7556 += 4;
		return ((this.aByteArray97[this.anInt7556 - 2] & 0xFF) << 8) + ((this.aByteArray97[this.anInt7556 - 3] & 0xFF) << 16) + ((this.aByteArray97[this.anInt7556 - 4] & 0xFF) << 24) + (this.aByteArray97[this.anInt7556 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "(Z)J")
	public final long method6016() {
		@Pc(15) long local15 = (long) this.method6015() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method6015() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method6017(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt7556;
		this.anInt7556 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method6020(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt7556 = 0;
		this.method6032(local31.length);
		this.method6025(local31.length, local31);
	}

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "(I)Z")
	public final boolean method6018() {
		this.anInt7556 -= 4;
		@Pc(17) int local17 = Static402.method5813(this.aByteArray97, 0, this.anInt7556);
		@Pc(29) int local29 = this.method6015();
		return local29 == local17;
	}

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "(I)I")
	public final int method6019() {
		return this.aByteArray97[this.anInt7556++] & 0xFF;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "([BIII)V")
	public final void method6020(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = this.aByteArray97[this.anInt7556++];
		}
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "(II)V")
	public final void method6021(@OriginalArg(1) int arg0) {
		this.aByteArray97[this.anInt7556++] = (byte) arg0;
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IB)V")
	public final void method6022(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method6047(arg0 >>> 28 | 0x80);
					}
					this.method6047(arg0 >>> 21 | 0x80);
				}
				this.method6047(arg0 >>> 14 | 0x80);
			}
			this.method6047(arg0 >>> 7 | 0x80);
		}
		this.method6047(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "(I)I")
	public final int method6023() {
		this.anInt7556 += 2;
		@Pc(31) int local31 = ((this.aByteArray97[this.anInt7556 - 2] & 0xFF) << 8) + (this.aByteArray97[this.anInt7556 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(ZI)V")
	public final void method6024(@OriginalArg(1) int arg0) {
		this.aByteArray97[this.anInt7556 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray97[this.anInt7556 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II[BI)V")
	public final void method6025(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aByteArray97[this.anInt7556++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BJ)V")
	public final void method6026(@OriginalArg(1) long arg0) {
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 56);
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 48);
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 40);
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 32);
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 24);
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 16);
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 8);
		this.aByteArray97[this.anInt7556++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "(B)I")
	public final int method6027() {
		return this.aByteArray97[this.anInt7556++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(IB)V")
	public final void method6028(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method6047(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method6032(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "(B)I")
	public final int method6029() {
		@Pc(14) byte local14 = this.aByteArray97[this.anInt7556++];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local14 & 0x7F | local16) << 7;
			local14 = this.aByteArray97[this.anInt7556++];
		}
		return local16 | local14;
	}

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "(II)V")
	public final void method6030(@OriginalArg(0) int arg0) {
		this.aByteArray97[this.anInt7556 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray97[this.anInt7556 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray97[this.anInt7556 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray97[this.anInt7556 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IB[BI)V")
	public final void method6031(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = arg1 - 1; local11 >= 0; local11--) {
			arg0[local11] = (byte) (this.aByteArray97[this.anInt7556++] - 128);
		}
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "(II)V")
	public final void method6032(@OriginalArg(1) int arg0) {
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 8);
		this.aByteArray97[this.anInt7556++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "(II)V")
	public final void method6033(@OriginalArg(1) int arg0) {
		this.aByteArray97[this.anInt7556++] = (byte) arg0;
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 8);
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 16);
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "(B)I")
	public final int method6034() {
		@Pc(17) int local17 = this.aByteArray97[this.anInt7556] & 0xFF;
		return local17 >= 128 ? this.method6044() - 32768 : this.method6019();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method6035(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = Static239.method3731(arg0);
		this.aByteArray97[this.anInt7556++] = 0;
		this.method6022(local7);
		this.anInt7556 += Static56.method824(arg0, this.aByteArray97, this.anInt7556);
	}

	@OriginalMember(owner = "client!jr", name = "k", descriptor = "(I)Ljava/lang/String;")
	public final String method6036() {
		if (this.aByteArray97[this.anInt7556] == 0) {
			this.anInt7556++;
			return null;
		} else {
			return this.method6040();
		}
	}

	@OriginalMember(owner = "client!jr", name = "l", descriptor = "(I)I")
	public final int method6037() {
		this.anInt7556 += 3;
		return ((this.aByteArray97[this.anInt7556 - 3] & 0xFF) << 16) + ((this.aByteArray97[this.anInt7556 - 2] & 0xFF) << 8) + (this.aByteArray97[this.anInt7556 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!jr", name = "m", descriptor = "(I)I")
	public final int method6038() {
		@Pc(18) int local18 = Static402.method5813(this.aByteArray97, 0, this.anInt7556);
		this.method6042(local18);
		return local18;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IJI)V")
	public final void method6039(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(28) int local28 = local6 * 8; local28 >= 0; local28 -= 8) {
			this.aByteArray97[this.anInt7556++] = (byte) (arg1 >> local28);
		}
	}

	@OriginalMember(owner = "client!jr", name = "n", descriptor = "(I)Ljava/lang/String;")
	public final String method6040() {
		@Pc(6) int local6 = this.anInt7556;
		while (this.aByteArray97[this.anInt7556++] != 0) {
		}
		@Pc(37) int local37 = this.anInt7556 - local6 - 1;
		return local37 == 0 ? "" : Static497.method6882(local6, local37, this.aByteArray97);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZ)V")
	public final void method6041(@OriginalArg(0) int arg0) {
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 + 128);
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(IB)V")
	public final void method6042(@OriginalArg(0) int arg0) {
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 24);
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 16);
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 8);
		this.aByteArray97[this.anInt7556++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BI)V")
	public final void method6043(@OriginalArg(1) int arg0) {
		this.aByteArray97[this.anInt7556++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "(B)I")
	public final int method6044() {
		this.anInt7556 += 2;
		return (this.aByteArray97[this.anInt7556 - 1] & 0xFF) + ((this.aByteArray97[this.anInt7556 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "(II)V")
	public final void method6045(@OriginalArg(1) int arg0) {
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "(II)V")
	public final void method6046(@OriginalArg(0) int arg0) {
		this.aByteArray97[this.anInt7556++] = (byte) arg0;
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 8);
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 16);
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(BI)V")
	public final void method6047(@OriginalArg(1) int arg0) {
		this.aByteArray97[this.anInt7556++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jr", name = "o", descriptor = "(I)I")
	public final int method6048() {
		this.anInt7556 += 2;
		return (this.aByteArray97[this.anInt7556 - 2] & 0xFF) + ((this.aByteArray97[this.anInt7556 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jr", name = "p", descriptor = "(I)B")
	public final byte method6049() {
		return this.aByteArray97[this.anInt7556++];
	}

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "(II)J")
	public final long method6050(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(24) int local24 = local6 * 8;
		@Pc(33) long local33 = 0L;
		while (local24 >= 0) {
			local33 |= ((long) this.aByteArray97[this.anInt7556++] & 0xFFL) << local24;
			local24 -= 8;
		}
		return local33;
	}

	@OriginalMember(owner = "client!jr", name = "q", descriptor = "(I)B")
	public final byte method6051() {
		return (byte) -this.aByteArray97[this.anInt7556++];
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(III[I)V")
	public final void method6052(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt7556;
		this.anInt7556 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method6015();
			@Pc(30) int local30 = this.method6015();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= (local26 >>> 5 ^ local26 << 4) + local26 ^ arg1[local32 >>> 11 & 0x3] + local32;
				local32 -= -1640531527;
				local26 -= local30 + (local30 << 4 ^ local30 >>> 5) ^ arg1[local32 & 0x3] + local32;
			}
			this.anInt7556 -= 8;
			this.method6042(local26);
			this.method6042(local30);
		}
		this.anInt7556 = local8;
	}

	@OriginalMember(owner = "client!jr", name = "k", descriptor = "(II)V")
	public final void method6053(@OriginalArg(1) int arg0) {
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 8);
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!jr", name = "r", descriptor = "(I)I")
	public final int method6054() {
		this.anInt7556 += 3;
		@Pc(48) int local48 = ((this.aByteArray97[this.anInt7556 - 2] & 0xFF) << 8) + ((this.aByteArray97[this.anInt7556 - 3] & 0xFF) << 16) + (this.aByteArray97[this.anInt7556 + -1] & 0xFF);
		if (local48 > 8388607) {
			local48 -= 16777216;
		}
		return local48;
	}

	@OriginalMember(owner = "client!jr", name = "s", descriptor = "(I)I")
	public final int method6055() {
		this.anInt7556 += 2;
		return (this.aByteArray97[this.anInt7556 - 1] - 128 & 0xFF) + ((this.aByteArray97[this.anInt7556 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jr", name = "l", descriptor = "(II)V")
	public final void method6056(@OriginalArg(1) int arg0) {
		this.aByteArray97[this.anInt7556 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "(B)I")
	public final int method6057() {
		this.anInt7556 += 2;
		return ((this.aByteArray97[this.anInt7556 - 1] & 0xFF) << 8) + (this.aByteArray97[this.anInt7556 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(ZI)V")
	public final void method6058(@OriginalArg(1) int arg0) {
		this.aByteArray97[this.anInt7556++] = (byte) arg0;
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jr", name = "m", descriptor = "(II)V")
	public final void method6059(@OriginalArg(0) int arg0) {
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 16);
		this.aByteArray97[this.anInt7556++] = (byte) (arg0 >> 8);
		this.aByteArray97[this.anInt7556++] = (byte) arg0;
	}
}

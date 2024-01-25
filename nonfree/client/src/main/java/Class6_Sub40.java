import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public class Class6_Sub40 extends Class6 {

	@OriginalMember(owner = "client!rg", name = "kb", descriptor = "I")
	public int anInt10169;

	@OriginalMember(owner = "client!rg", name = "U", descriptor = "[B")
	public byte[] aByteArray113;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V")
	public Class6_Sub40(@OriginalArg(0) int arg0) {
		this.anInt10169 = 0;
		this.aByteArray113 = Static647.method8999(arg0);
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "([B)V")
	public Class6_Sub40(@OriginalArg(0) byte[] arg0) {
		this.aByteArray113 = arg0;
		this.anInt10169 = 0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method8551(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt10169 += Static360.method5723(arg0.length(), this.anInt10169, arg0, this.aByteArray113);
		this.aByteArray113[this.anInt10169++] = 0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)I")
	public final int method8552() {
		this.anInt10169 += 2;
		return ((this.aByteArray113[this.anInt10169 - 1] & 0xFF) << 8) + (this.aByteArray113[this.anInt10169 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)I")
	public final int method8553() {
		this.anInt10169 += 2;
		@Pc(36) int local36 = (this.aByteArray113[this.anInt10169 - 2] & 0xFF) + ((this.aByteArray113[this.anInt10169 - 1] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
	public final void method8554(@OriginalArg(0) int arg0) {
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 24);
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 16);
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 8);
		this.aByteArray113[this.anInt10169++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)Ljava/lang/String;")
	public final String method8555() {
		@Pc(14) byte local14 = this.aByteArray113[this.anInt10169++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(30) int local30 = this.anInt10169;
		while (this.aByteArray113[this.anInt10169++] != 0) {
		}
		@Pc(50) int local50 = this.anInt10169 - local30 - 1;
		return local50 == 0 ? "" : Static510.method7547(local50, local30, this.aByteArray113);
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)V")
	public final void method8556(@OriginalArg(0) int arg0) {
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(II)V")
	public final void method8557(@OriginalArg(1) int arg0) {
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 8);
		this.aByteArray113[this.anInt10169++] = (byte) arg0;
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 24);
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)V")
	public final void method8559(@OriginalArg(0) int arg0) {
		this.aByteArray113[this.anInt10169 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray113[this.anInt10169 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)I")
	public final int method8560() {
		return this.aByteArray113[this.anInt10169++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V")
	public final void method8561(@OriginalArg(0) int arg0) {
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 8);
		this.aByteArray113[this.anInt10169++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[BII)V")
	public final void method8562(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = arg0; local3 < arg0 + arg2; local3++) {
			this.aByteArray113[this.anInt10169++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZI)V")
	public final void method8563(@OriginalArg(1) int arg0) {
		this.aByteArray113[this.anInt10169++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(II)V")
	public final void method8564(@OriginalArg(1) int arg0) {
		this.aByteArray113[this.anInt10169++] = (byte) arg0;
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 8);
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 16);
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)V")
	public final void method8565(@OriginalArg(1) int arg0) {
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 8);
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method8566(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(14) int local14 = this.anInt10169;
		this.anInt10169 = 0;
		@Pc(20) byte[] local20 = new byte[local14];
		this.method8595(local20, local14, 0);
		@Pc(31) BigInteger local31 = new BigInteger(local20);
		@Pc(36) BigInteger local36 = local31.modPow(arg0, arg1);
		@Pc(39) byte[] local39 = local36.toByteArray();
		this.anInt10169 = 0;
		this.method8561(local39.length);
		this.method8562(0, local39, local39.length);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBI[I)V")
	public final void method8567(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt10169;
		this.anInt10169 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method8579();
			@Pc(30) int local30 = this.method8579();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= (local26 >>> 5 ^ local26 << 4) + local26 ^ arg1[local32 >>> 11 & 0xDA000003] + local32;
				local32 -= -1640531527;
				local26 -= arg1[local32 & 0x3] + local32 ^ (local30 >>> 5 ^ local30 << 4) + local30;
			}
			this.anInt10169 -= 8;
			this.method8554(local26);
			this.method8554(local30);
		}
		this.anInt10169 = local8;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)I")
	public final int method8568() {
		this.anInt10169 += 4;
		return ((this.aByteArray113[this.anInt10169 - 3] & 0xFF) << 8) + ((this.aByteArray113[this.anInt10169 - 1] & 0xFF) << 24) + ((this.aByteArray113[this.anInt10169 + -2] & 0xFF) << 16) + (this.aByteArray113[this.anInt10169 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)Z")
	public final boolean method8569() {
		this.anInt10169 -= 4;
		@Pc(25) int local25 = Static150.method2373(this.anInt10169, this.aByteArray113, 0);
		@Pc(29) int local29 = this.method8579();
		return local29 == local25;
	}

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)B")
	public final byte method8570() {
		return (byte) -this.aByteArray113[this.anInt10169++];
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)I")
	public final int method8571() {
		this.anInt10169 += 2;
		return ((this.aByteArray113[this.anInt10169 - 2] & 0xFF) << 8) + (this.aByteArray113[this.anInt10169 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(II)V")
	public final void method8572(@OriginalArg(1) int arg0) {
		this.aByteArray113[this.anInt10169 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray113[this.anInt10169 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray113[this.anInt10169 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray113[this.anInt10169 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)I")
	public final int method8573() {
		return -this.aByteArray113[this.anInt10169++] & 0xFF;
	}

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "(I)V")
	public final void method8574() {
		if (this.aByteArray113 != null) {
			Static647.method9001(this.aByteArray113);
		}
		this.aByteArray113 = null;
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)I")
	public final int method8575() {
		@Pc(16) byte local16 = this.aByteArray113[this.anInt10169++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local16 & 0x7F | local18) << 7;
			local16 = this.aByteArray113[this.anInt10169++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)I")
	public final int method8576() {
		return 128 - this.aByteArray113[this.anInt10169++] & 0xFF;
	}

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "(I)I")
	public final int method8577() {
		this.anInt10169 += 3;
		@Pc(49) int local49 = ((this.aByteArray113[this.anInt10169 - 2] & 0xFF) << 8) + ((this.aByteArray113[this.anInt10169 - 3] & 0xFF) << 16) + (this.aByteArray113[this.anInt10169 + -1] & 0xFF);
		if (local49 > 8388607) {
			local49 -= 16777216;
		}
		return local49;
	}

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "(B)Ljava/lang/String;")
	public final String method8578() {
		if (this.aByteArray113[this.anInt10169] == 0) {
			this.anInt10169++;
			return null;
		} else {
			return this.method8611();
		}
	}

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "(I)I")
	public final int method8579() {
		this.anInt10169 += 4;
		return (this.aByteArray113[this.anInt10169 - 1] & 0xFF) + ((this.aByteArray113[this.anInt10169 - 3] & 0xFF) << 16) + ((this.aByteArray113[-4 + this.anInt10169] & 0xFF) << 24) + ((this.aByteArray113[this.anInt10169 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "(B)I")
	public final int method8581() {
		this.anInt10169 += 4;
		return ((this.aByteArray113[this.anInt10169 - 4] & 0xFF) << 8) + ((this.aByteArray113[this.anInt10169 - 2] << 24 & 0xFF000000) + ((this.aByteArray113[this.anInt10169 - 1] & 0xFF) << 16)) + (this.aByteArray113[this.anInt10169 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "(I)J")
	public final long method8582() {
		@Pc(15) long local15 = (long) this.method8599() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method8599() & 0xFFFFFFFFL;
		return (local22 << 32) + local15;
	}

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "(B)B")
	public final byte method8583() {
		return (byte) (128 - this.aByteArray113[this.anInt10169++]);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method8584(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray113[this.anInt10169++] = 0;
		this.anInt10169 += Static360.method5723(arg0.length(), this.anInt10169, arg0, this.aByteArray113);
		this.aByteArray113[this.anInt10169++] = 0;
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(Z)I")
	public final int method8585() {
		this.anInt10169 += 2;
		return ((this.aByteArray113[this.anInt10169 - 1] & 0xFF) << 8) + (this.aByteArray113[this.anInt10169 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "(II)V")
	public final void method8586(@OriginalArg(0) int arg0) {
		this.aByteArray113[this.anInt10169++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "(B)I")
	public final int method8587() {
		@Pc(18) int local18 = this.aByteArray113[this.anInt10169] & 0xFF;
		return local18 >= 128 ? this.method8571() - 32768 : this.method8604();
	}

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "(II)V")
	public final void method8589(@OriginalArg(1) int arg0) {
		this.aByteArray113[this.anInt10169++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "(I)B")
	public final byte method8590() {
		return (byte) (this.aByteArray113[this.anInt10169++] - 128);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[IBI)V")
	public final void method8591(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt10169;
		this.anInt10169 = arg2;
		@Pc(18) int local18 = (arg0 - arg2) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method8579();
			@Pc(30) int local30 = this.method8579();
			@Pc(32) int local32 = 0;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local26 += arg1[local32 & 0x3] + local32 ^ local30 + (local30 << 4 ^ local30 >>> 5);
				local32 += -1640531527;
				local30 += local26 + (local26 >>> 5 ^ local26 << 4) ^ arg1[local32 >>> 11 & 0xC000003] + local32;
			}
			this.anInt10169 -= 8;
			this.method8554(local26);
			this.method8554(local30);
		}
		this.anInt10169 = local8;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(IB)J")
	public final long method8592(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(24) int local24 = local2 * 8;
		@Pc(33) long local33 = 0L;
		while (local24 >= 0) {
			local33 |= ((long) this.aByteArray113[this.anInt10169++] & 0xFFL) << local24;
			local24 -= 8;
		}
		return local33;
	}

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "(II)V")
	public final void method8593(@OriginalArg(0) int arg0) {
		this.aByteArray113[this.anInt10169++] = (byte) arg0;
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(JI)V")
	public final void method8594(@OriginalArg(0) long arg0) {
		this.aByteArray113[this.anInt10169++] = (byte) (int) (arg0 >> 56);
		this.aByteArray113[this.anInt10169++] = (byte) (int) (arg0 >> 48);
		this.aByteArray113[this.anInt10169++] = (byte) (int) (arg0 >> 40);
		this.aByteArray113[this.anInt10169++] = (byte) (int) (arg0 >> 32);
		this.aByteArray113[this.anInt10169++] = (byte) (int) (arg0 >> 24);
		this.aByteArray113[this.anInt10169++] = (byte) (int) (arg0 >> 16);
		this.aByteArray113[this.anInt10169++] = (byte) (int) (arg0 >> 8);
		this.aByteArray113[this.anInt10169++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I[BII)V")
	public final void method8595(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = arg2; local7 < arg1 + arg2; local7++) {
			arg0[local7] = this.aByteArray113[this.anInt10169++];
		}
	}

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "(II)V")
	public final void method8596(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method8589(arg0 >>> 28 | 0x80);
					}
					this.method8589(arg0 >>> 21 | 0x80);
				}
				this.method8589(arg0 >>> 14 | 0x80);
			}
			this.method8589(arg0 >>> 7 | 0x80);
		}
		this.method8589(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "(B)I")
	public final int method8597() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method8587();
		while (local11 == 32767) {
			local11 = this.method8587();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(IB)V")
	public final void method8598(@OriginalArg(0) int arg0) {
		this.aByteArray113[this.anInt10169++] = (byte) arg0;
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 8);
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 16);
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "(B)I")
	public final int method8599() {
		this.anInt10169 += 4;
		return ((this.aByteArray113[this.anInt10169 - 2] & 0xFF) << 16) + ((this.aByteArray113[this.anInt10169 - 1] & 0xFF) << 24) + ((this.aByteArray113[this.anInt10169 - 3] & 0xFF) << 8) + (this.aByteArray113[this.anInt10169 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "(B)I")
	public final int method8600() {
		@Pc(11) int local11 = this.aByteArray113[this.anInt10169] & 0xFF;
		return local11 >= 128 ? this.method8571() - 49152 : this.method8604() - 64;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(BI)V")
	public final void method8601(@OriginalArg(1) int arg0) {
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 16);
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 24);
		this.aByteArray113[this.anInt10169++] = (byte) arg0;
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(Z)B")
	public final byte method8602() {
		return this.aByteArray113[this.anInt10169++];
	}

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "(B)J")
	public final long method8603() {
		@Pc(17) long local17 = (long) this.method8579() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method8579() & 0xFFFFFFFFL;
		return local24 + (local17 << 32);
	}

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "(I)I")
	public final int method8604() {
		return this.aByteArray113[this.anInt10169++] & 0xFF;
	}

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "(II)V")
	public final void method8605(@OriginalArg(0) int arg0) {
		this.aByteArray113[this.anInt10169 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "(B)I")
	public final int method8606() {
		this.anInt10169 += 3;
		return ((this.aByteArray113[this.anInt10169 - 3] & 0xFF) << 16) + (((this.aByteArray113[this.anInt10169 - 2] & 0xFF) << 8) + (this.aByteArray113[this.anInt10169 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(JII)V")
	public final void method8607(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(31) int local31 = local2 * 8; local31 >= 0; local31 -= 8) {
			this.aByteArray113[this.anInt10169++] = (byte) (int) (arg0 >> local31);
		}
	}

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "(B)I")
	public final int method8608() {
		this.anInt10169 += 2;
		@Pc(33) int local33 = (this.aByteArray113[this.anInt10169 - 1] - 128 & 0xFF) + ((this.aByteArray113[this.anInt10169 - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(IB)V")
	public final void method8609(@OriginalArg(0) int arg0) {
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 + 128);
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "(B)I")
	public final int method8610() {
		this.anInt10169 += 4;
		return (this.aByteArray113[this.anInt10169 - 2] & 0xFF) + ((this.aByteArray113[this.anInt10169 - 1] & 0xFF) << 8) + ((this.aByteArray113[this.anInt10169 + -4] & 0xFF) << 16) + ((this.aByteArray113[this.anInt10169 - 3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "(I)Ljava/lang/String;")
	public final String method8611() {
		@Pc(6) int local6 = this.anInt10169;
		while (this.aByteArray113[this.anInt10169++] != 0) {
		}
		@Pc(36) int local36 = this.anInt10169 - local6 - 1;
		return local36 == 0 ? "" : Static510.method7547(local36, local6, this.aByteArray113);
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(ZI)V")
	public final void method8612(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method8589(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method8561(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(BI)V")
	public final void method8613(@OriginalArg(1) int arg0) {
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 16);
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 8);
		this.aByteArray113[this.anInt10169++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "(I)I")
	public final int method8614() {
		this.anInt10169 += 2;
		return (this.aByteArray113[this.anInt10169 - 1] - 128 & 0xFF) + ((this.aByteArray113[this.anInt10169 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "(I)I")
	public final int method8615() {
		this.anInt10169 += 2;
		@Pc(37) int local37 = ((this.aByteArray113[this.anInt10169 - 2] & 0xFF) << 8) + (this.aByteArray113[this.anInt10169 - 1] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(IZ)I")
	public final int method8616(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static150.method2373(this.anInt10169, this.aByteArray113, arg0);
		this.method8554(local11);
		return local11;
	}

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "(II)V")
	public final void method8617(@OriginalArg(0) int arg0) {
		this.aByteArray113[this.anInt10169++] = (byte) arg0;
		this.aByteArray113[this.anInt10169++] = (byte) (arg0 >> 8);
	}
}

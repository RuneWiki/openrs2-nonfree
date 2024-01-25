import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!bt", name = "w", descriptor = "I")
	public int anInt7620 = 0;

	@OriginalMember(owner = "client!bt", name = "rb", descriptor = "[B")
	public byte[] aByteArray95;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(I)V")
	public Class3_Sub2(@OriginalArg(0) int arg0) {
		this.aByteArray95 = Static451.method5975(arg0);
	}

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "([B)V")
	public Class3_Sub2(@OriginalArg(0) byte[] arg0) {
		this.aByteArray95 = arg0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(JI)V")
	public final void method5990(@OriginalArg(0) long arg0) {
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 56);
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 48);
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 40);
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 32);
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 24);
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 16);
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 8);
		this.aByteArray95[this.anInt7620++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)I")
	public final int method5992() {
		this.anInt7620 += 2;
		@Pc(31) int local31 = ((this.aByteArray95[this.anInt7620 - 1] & 0xFF) << 8) + (this.aByteArray95[this.anInt7620 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IZ)V")
	public final void method5993(@OriginalArg(0) int arg0) {
		this.aByteArray95[this.anInt7620 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I[III)V")
	public final void method5994(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt7620;
		this.anInt7620 = 5;
		@Pc(15) int local15 = (arg1 - 5) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(22) int local22 = this.method6014();
			@Pc(26) int local26 = this.method6014();
			@Pc(28) int local28 = -957401312;
			@Pc(32) int local32 = 32;
			while (local32-- > 0) {
				local26 -= local22 + (local22 << 4 ^ local22 >>> 5) ^ local28 + arg0[local28 >>> 11 & 0x3];
				local28 -= -1640531527;
				local22 -= local28 + arg0[local28 & 0x3] ^ local26 + (local26 << 4 ^ local26 >>> 5);
			}
			this.anInt7620 -= 8;
			this.method6008(local22);
			this.method6008(local26);
		}
		this.anInt7620 = local6;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)V")
	public final void method5995(@OriginalArg(0) int arg0) {
		this.aByteArray95[this.anInt7620++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(ZI)V")
	public final void method5996(@OriginalArg(1) int arg0) {
		this.aByteArray95[this.anInt7620++] = (byte) arg0;
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)I")
	public final int method5997() {
		return -this.aByteArray95[this.anInt7620++] & 0xFF;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)V")
	public final void method5998(@OriginalArg(1) int arg0) {
		this.aByteArray95[this.anInt7620++] = (byte) arg0;
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 8);
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 16);
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)V")
	public final void method5999(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method6001(arg0 >>> 28 | 0x80);
					}
					this.method6001(arg0 >>> 21 | 0x80);
				}
				this.method6001(arg0 >>> 14 | 0x80);
			}
			this.method6001(arg0 >>> 7 | 0x80);
		}
		this.method6001(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(II)V")
	public final void method6000(@OriginalArg(0) int arg0) {
		this.aByteArray95[this.anInt7620++] = (byte) arg0;
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(II)V")
	public final void method6001(@OriginalArg(1) int arg0) {
		this.aByteArray95[this.anInt7620++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(II)V")
	public final void method6002(@OriginalArg(1) int arg0) {
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 + 128);
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(B)I")
	public final int method6003() {
		this.anInt7620 += 2;
		return ((this.aByteArray95[this.anInt7620 - 1] & 0xFF) << 8) + (this.aByteArray95[this.anInt7620 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(B)I")
	public final int method6004() {
		this.anInt7620 += 2;
		return (this.aByteArray95[this.anInt7620 - 1] & 0xFF) + ((this.aByteArray95[this.anInt7620 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)Ljava/lang/String;")
	public final String method6005() {
		if (this.aByteArray95[this.anInt7620] == 0) {
			this.anInt7620++;
			return null;
		} else {
			return this.method6027();
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(Z)I")
	public final int method6006() {
		this.anInt7620 += 2;
		return (this.aByteArray95[this.anInt7620 - 1] - 128 & 0xFF) + ((this.aByteArray95[this.anInt7620 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(II)V")
	public final void method6007(@OriginalArg(1) int arg0) {
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 8);
		this.aByteArray95[this.anInt7620++] = (byte) arg0;
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 24);
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(II)V")
	public final void method6008(@OriginalArg(1) int arg0) {
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 24);
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 16);
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 8);
		this.aByteArray95[this.anInt7620++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([BIII)V")
	public final void method6009(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(6) int local6 = 0; local6 < arg1; local6++) {
			arg0[local6] = (byte) (this.aByteArray95[this.anInt7620++] - 128);
		}
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(I)I")
	public final int method6010() {
		this.anInt7620 += 4;
		return ((this.aByteArray95[this.anInt7620 - 4] & 0xFF) << 16) + (((this.aByteArray95[this.anInt7620 - 3] & 0xFF) << 24) + ((this.aByteArray95[this.anInt7620 - 1] & 0xFF) << 8)) + (this.aByteArray95[this.anInt7620 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(I)B")
	public final byte method6011() {
		return this.aByteArray95[this.anInt7620++];
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([II)V")
	public final void method6012(@OriginalArg(0) int[] arg0) {
		@Pc(8) int local8 = this.anInt7620 / 8;
		this.anInt7620 = 0;
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(18) int local18 = this.method6014();
			@Pc(24) int local24 = this.method6014();
			@Pc(26) int local26 = 0;
			@Pc(30) int local30 = 32;
			while (local30-- > 0) {
				local18 += (local24 << 4 ^ local24 >>> 5) + local24 ^ local26 - -arg0[local26 & 0x3];
				local26 += -1640531527;
				local24 += local26 + arg0[local26 >>> 11 & 0x3] ^ (local18 >>> 5 ^ local18 << 4) + local18;
			}
			this.anInt7620 -= 8;
			this.method6008(local18);
			this.method6008(local24);
		}
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(I)I")
	public final int method6013() {
		return this.aByteArray95[this.anInt7620++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(I)I")
	public final int method6014() {
		this.anInt7620 += 4;
		return (this.aByteArray95[this.anInt7620 - 1] & 0xFF) + ((this.aByteArray95[this.anInt7620 - 3] & 0xFF) << 16) + ((this.aByteArray95[this.anInt7620 + -4] & 0xFF) << 24) + ((this.aByteArray95[this.anInt7620 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(IB)V")
	public final void method6015(@OriginalArg(0) int arg0) {
		this.aByteArray95[this.anInt7620++] = (byte) arg0;
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 8);
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 16);
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BI)V")
	public final void method6016(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method6001(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method6045(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(Z)Z")
	public final boolean method6017() {
		this.anInt7620 -= 4;
		@Pc(23) int local23 = Static35.method4616(this.anInt7620, 0, this.aByteArray95);
		@Pc(27) int local27 = this.method6014();
		return local27 == local23;
	}

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(II)V")
	public final void method6018(@OriginalArg(1) int arg0) {
		this.aByteArray95[this.anInt7620 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray95[this.anInt7620 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(I)I")
	public final int method6020() {
		this.anInt7620 += 3;
		return ((this.aByteArray95[this.anInt7620 - 2] & 0xFF) << 8) + ((this.aByteArray95[this.anInt7620 - 3] & 0xFF) << 16) + (this.aByteArray95[this.anInt7620 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(Z)Ljava/lang/String;")
	public final String method6021() {
		@Pc(14) byte local14 = this.aByteArray95[this.anInt7620++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt7620;
		while (this.aByteArray95[this.anInt7620++] != 0) {
		}
		@Pc(47) int local47 = this.anInt7620 - local27 - 1;
		return local47 == 0 ? "" : Static172.method2969(local47, local27, this.aByteArray95);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IJB)V")
	public final void method6022(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(24) int local24 = local0 * 8; local24 >= 0; local24 -= 8) {
			this.aByteArray95[this.anInt7620++] = (byte) (arg1 >> local24);
		}
	}

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(I)I")
	public final int method6023() {
		this.anInt7620 += 3;
		return (this.aByteArray95[this.anInt7620 - 1] & 0xFF) + (((this.aByteArray95[this.anInt7620 - 2] & 0xFF) << 16) + ((this.aByteArray95[this.anInt7620 - 3] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(Z)I")
	public final int method6025() {
		this.anInt7620 += 4;
		return ((this.aByteArray95[this.anInt7620 - 4] & 0xFF) << 8) + ((this.aByteArray95[this.anInt7620 - 1] & 0xFF) << 16) + ((this.aByteArray95[this.anInt7620 - 2] & 0xFF) << 24) + (this.aByteArray95[this.anInt7620 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[BI)V")
	public final void method6026(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
			this.aByteArray95[this.anInt7620++] = arg1[local9];
		}
	}

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "(I)Ljava/lang/String;")
	public final String method6027() {
		@Pc(6) int local6 = this.anInt7620;
		while (this.aByteArray95[this.anInt7620++] != 0) {
		}
		@Pc(36) int local36 = this.anInt7620 - local6 - 1;
		return local36 == 0 ? "" : Static172.method2969(local36, local6, this.aByteArray95);
	}

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "(I)I")
	public final int method6028() {
		@Pc(14) byte local14 = this.aByteArray95[this.anInt7620++];
		@Pc(24) int local24 = 0;
		while (local14 < 0) {
			local24 = (local14 & 0x7F | local24) << 7;
			local14 = this.aByteArray95[this.anInt7620++];
		}
		return local14 | local24;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(IB)I")
	public final int method6029(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = Static35.method4616(this.anInt7620, arg0, this.aByteArray95);
		this.method6008(local19);
		return local19;
	}

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(II)V")
	public final void method6030(@OriginalArg(1) int arg0) {
		this.aByteArray95[this.anInt7620++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(II[BI)V")
	public final void method6032(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			arg0[local5] = this.aByteArray95[this.anInt7620++];
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method6033(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt7620 += Static398.method5364(this.anInt7620, arg0.length(), arg0, this.aByteArray95);
		this.aByteArray95[this.anInt7620++] = 0;
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(IB)V")
	public final void method6034(@OriginalArg(0) int arg0) {
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(II)V")
	public final void method6035(@OriginalArg(0) int arg0) {
		this.aByteArray95[this.anInt7620 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray95[this.anInt7620 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray95[this.anInt7620 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray95[this.anInt7620 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method6036(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt7620;
		this.anInt7620 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method6032(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt7620 = 0;
		this.method6001(local31.length);
		this.method6026(local31.length, local31);
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(B)I")
	public final int method6037() {
		@Pc(7) int local7 = 0;
		@Pc(18) int local18;
		for (local18 = this.method6040(); local18 == 32767; local18 = this.method6040()) {
			local7 += 32767;
		}
		return local7 + local18;
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(Z)I")
	public final int method6038() {
		@Pc(17) int local17 = this.aByteArray95[this.anInt7620] & 0xFF;
		return local17 < 128 ? this.method6053() - 64 : this.method6004() + -49152;
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(B)I")
	public final int method6039() {
		this.anInt7620 += 2;
		@Pc(39) int local39 = (this.aByteArray95[this.anInt7620 - 1] & 0xFF) + ((this.aByteArray95[this.anInt7620 - 2] & 0xFF) << 8);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "(I)I")
	public final int method6040() {
		@Pc(16) int local16 = this.aByteArray95[this.anInt7620] & 0xFF;
		return local16 >= 128 ? this.method6004() - 32768 : this.method6053();
	}

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "(I)I")
	public final int method6041() {
		this.anInt7620 += 2;
		return (this.aByteArray95[this.anInt7620 - 2] - 128 & 0xFF) + ((this.aByteArray95[this.anInt7620 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(IB)V")
	public final void method6042(@OriginalArg(0) int arg0) {
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 8);
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "(II)V")
	public final void method6043(@OriginalArg(1) int arg0) {
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 16);
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 24);
		this.aByteArray95[this.anInt7620++] = (byte) arg0;
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(B)I")
	public final int method6044() {
		return 128 - this.aByteArray95[this.anInt7620++] & 0xFF;
	}

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "(II)V")
	public final void method6045(@OriginalArg(0) int arg0) {
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 8);
		this.aByteArray95[this.anInt7620++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(B)I")
	public final int method6046() {
		this.anInt7620 += 2;
		@Pc(40) int local40 = (this.aByteArray95[this.anInt7620 - 1] - 128 & 0xFF) + ((this.aByteArray95[this.anInt7620 - 2] & 0xFF) << 8);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(Z)J")
	public final long method6047() {
		@Pc(10) long local10 = (long) this.method6014() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method6014() & 0xFFFFFFFFL;
		return (local10 << 32) + local24;
	}

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(B)B")
	public final byte method6048() {
		return (byte) -this.aByteArray95[this.anInt7620++];
	}

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "(I)B")
	public final byte method6049() {
		return (byte) (this.aByteArray95[this.anInt7620++] - 128);
	}

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "(I)B")
	public final byte method6050() {
		return (byte) (128 - this.aByteArray95[this.anInt7620++]);
	}

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "(B)I")
	public final int method6051() {
		this.anInt7620 += 4;
		return (this.aByteArray95[this.anInt7620 - 4] & 0xFF) + ((this.aByteArray95[this.anInt7620 - 1] & 0xFF) << 24) + ((this.aByteArray95[this.anInt7620 + -2] & 0xFF) << 16) + ((this.aByteArray95[this.anInt7620 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(BI)J")
	public final long method6052(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		if (local4 < 0 || local4 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = local4 * 8;
		@Pc(22) long local22 = 0L;
		while (local20 >= 0) {
			local22 |= ((long) this.aByteArray95[this.anInt7620++] & 0xFFL) << local20;
			local20 -= 8;
		}
		return local22;
	}

	@OriginalMember(owner = "client!bt", name = "r", descriptor = "(I)I")
	public final int method6053() {
		return this.aByteArray95[this.anInt7620++] & 0xFF;
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(IB)V")
	public final void method6054(@OriginalArg(0) int arg0) {
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 16);
		this.aByteArray95[this.anInt7620++] = (byte) (arg0 >> 8);
		this.aByteArray95[this.anInt7620++] = (byte) arg0;
	}
}

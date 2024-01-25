import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public class Class12_Sub8 extends Class12 {

	@OriginalMember(owner = "client!daa", name = "mb", descriptor = "I")
	public int anInt6217 = 0;

	@OriginalMember(owner = "client!daa", name = "K", descriptor = "[B")
	public byte[] aByteArray82;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(I)V")
	public Class12_Sub8(@OriginalArg(0) int arg0) {
		this.aByteArray82 = Static265.method4439(arg0);
	}

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "([B)V")
	public Class12_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray82 = arg0;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)I")
	public final int method5166() {
		this.anInt6217 += 3;
		@Pc(49) int local49 = ((this.aByteArray82[this.anInt6217 - 3] & 0xFF) << 16) - (-(this.aByteArray82[this.anInt6217 - 2] << 8 & 0xFF00) - (this.aByteArray82[this.anInt6217 - 1] & 0xFF));
		if (local49 > 8388607) {
			local49 -= 16777216;
		}
		return local49;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(BI)V")
	public final void method5167(@OriginalArg(1) int arg0) {
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)B")
	public final byte method5168() {
		return (byte) -this.aByteArray82[this.anInt6217++];
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public final String method5169() {
		@Pc(14) byte local14 = this.aByteArray82[this.anInt6217++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(31) int local31 = this.anInt6217;
		while (this.aByteArray82[this.anInt6217++] != 0) {
		}
		@Pc(51) int local51 = this.anInt6217 - local31 - 1;
		return local51 == 0 ? "" : Static157.method3075(local31, local51, this.aByteArray82);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method5170(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt6217;
		this.anInt6217 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method5181(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt6217 = 0;
		this.method5190(local31.length);
		this.method5193(local31, local31.length);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method5171(@OriginalArg(1) String arg0) {
		@Pc(15) int local15 = Static69.method7528(arg0);
		this.aByteArray82[this.anInt6217++] = 0;
		this.method5175(local15);
		this.anInt6217 += Static430.method6592(this.aByteArray82, this.anInt6217, arg0);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IZ)V")
	public final void method5172(@OriginalArg(0) int arg0) {
		this.aByteArray82[this.anInt6217 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)B")
	public final byte method5173() {
		return this.aByteArray82[this.anInt6217++];
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)V")
	public final void method5174(@OriginalArg(1) int arg0) {
		this.aByteArray82[this.anInt6217++] = (byte) arg0;
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 8);
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 16);
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(II)V")
	public final void method5175(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5214(arg0 >>> 28 | 0x80);
					}
					this.method5214(arg0 >>> 21 | 0x80);
				}
				this.method5214(arg0 >>> 14 | 0x80);
			}
			this.method5214(arg0 >>> 7 | 0x80);
		}
		this.method5214(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "(B)I")
	public final int method5177() {
		return 128 - this.aByteArray82[this.anInt6217++] & 0xFF;
	}

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "(II)V")
	public final void method5178(@OriginalArg(1) int arg0) {
		this.aByteArray82[this.anInt6217++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!daa", name = "d", descriptor = "(II)V")
	public final void method5179(@OriginalArg(0) int arg0) {
		this.aByteArray82[this.anInt6217 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray82[this.anInt6217 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray82[this.anInt6217 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray82[this.anInt6217 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method5180(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt6217 += Static126.method7324(arg0.length(), this.anInt6217, this.aByteArray82, arg0);
		this.aByteArray82[this.anInt6217++] = 0;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIB[B)V")
	public final void method5181(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = this.aByteArray82[this.anInt6217++];
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IB)V")
	public final void method5182(@OriginalArg(0) int arg0) {
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 8);
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!daa", name = "e", descriptor = "(II)V")
	public final void method5183(@OriginalArg(0) int arg0) {
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 16);
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 24);
		this.aByteArray82[this.anInt6217++] = (byte) arg0;
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "(I)I")
	public final int method5184() {
		return -this.aByteArray82[this.anInt6217++] & 0xFF;
	}

	@OriginalMember(owner = "client!daa", name = "d", descriptor = "(I)Ljava/lang/String;")
	public final String method5185() {
		@Pc(14) byte local14 = this.aByteArray82[this.anInt6217++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(28) int local28 = this.method5229();
		if (this.aByteArray82.length < this.anInt6217 + local28) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(49) String local49 = Static136.method2789(this.anInt6217, this.aByteArray82, local28);
		this.anInt6217 += local28;
		return local49;
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(Z)I")
	public final int method5186() {
		this.anInt6217 += 4;
		return (this.aByteArray82[this.anInt6217 - 2] & 0xFF) + ((this.aByteArray82[this.anInt6217 - 1] & 0xFF) << 8) + ((this.aByteArray82[this.anInt6217 + -3] & 0xFF) << 24) + ((this.aByteArray82[this.anInt6217 - 4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!daa", name = "i", descriptor = "(I)Ljava/lang/String;")
	public final String method5187() {
		if (this.aByteArray82[this.anInt6217] == 0) {
			this.anInt6217++;
			return null;
		} else {
			return this.method5206();
		}
	}

	@OriginalMember(owner = "client!daa", name = "j", descriptor = "(I)I")
	public final int method5188() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method5218();
		while (local11 == 32767) {
			local11 = this.method5218();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(IB)J")
	public final long method5189(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 - 1;
		if (local14 < 0 || local14 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(30) int local30 = local14 * 8;
		@Pc(32) long local32 = 0L;
		while (local30 >= 0) {
			local32 |= ((long) this.aByteArray82[this.anInt6217++] & 0xFFL) << local30;
			local30 -= 8;
		}
		return local32;
	}

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "(IB)V")
	public final void method5190(@OriginalArg(0) int arg0) {
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 8);
		this.aByteArray82[this.anInt6217++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!daa", name = "k", descriptor = "(I)J")
	public final long method5191() {
		@Pc(10) long local10 = (long) this.method5225() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method5225() & 0xFFFFFFFFL;
		return local17 + (local10 << 32);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IJZ)V")
	public final void method5192(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(25) int local25 = local6 * 8; local25 >= 0; local25 -= 8) {
			this.aByteArray82[this.anInt6217++] = (byte) (arg1 >> local25);
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "([BIII)V")
	public final void method5193(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			this.aByteArray82[this.anInt6217++] = arg0[local3];
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ZI)V")
	public final void method5194(@OriginalArg(1) int arg0) {
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 16);
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 8);
		this.aByteArray82[this.anInt6217++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!daa", name = "d", descriptor = "(B)I")
	public final int method5195() {
		this.anInt6217 += 3;
		return ((this.aByteArray82[this.anInt6217 - 3] & 0xFF) << 16) + ((this.aByteArray82[this.anInt6217 - 2] & 0xFF) << 8) + (this.aByteArray82[this.anInt6217 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!daa", name = "f", descriptor = "(II)V")
	public final void method5196(@OriginalArg(1) int arg0) {
		this.aByteArray82[this.anInt6217 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray82[this.anInt6217 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(BI)V")
	public final void method5197(@OriginalArg(1) int arg0) {
		this.aByteArray82[this.anInt6217++] = (byte) arg0;
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!daa", name = "l", descriptor = "(I)I")
	public final int method5198() {
		this.anInt6217 += 2;
		return (this.aByteArray82[this.anInt6217 - 1] - 128 & 0xFF) + ((this.aByteArray82[this.anInt6217 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!daa", name = "e", descriptor = "(B)I")
	public final int method5199() {
		this.anInt6217 += 2;
		return ((this.aByteArray82[this.anInt6217 - 2] & 0xFF) << 8) + (this.aByteArray82[this.anInt6217 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!daa", name = "m", descriptor = "(I)I")
	public final int method5200() {
		@Pc(16) int local16 = Static29.method559(0, this.aByteArray82, this.anInt6217);
		this.method5223(local16);
		return local16;
	}

	@OriginalMember(owner = "client!daa", name = "g", descriptor = "(II)V")
	public final void method5201(@OriginalArg(1) int arg0) {
		this.aByteArray82[this.anInt6217++] = (byte) arg0;
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "(Z)I")
	public final int method5202() {
		return this.aByteArray82[this.anInt6217++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!daa", name = "n", descriptor = "(I)I")
	public final int method5203() {
		@Pc(11) int local11 = this.aByteArray82[this.anInt6217] & 0xFF;
		return local11 >= 128 ? this.method5199() - 49152 : this.method5216() - 64;
	}

	@OriginalMember(owner = "client!daa", name = "o", descriptor = "(I)I")
	public final int method5204() {
		this.anInt6217 += 2;
		return ((this.aByteArray82[this.anInt6217 - 1] & 0xFF) << 8) + (this.aByteArray82[this.anInt6217 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!daa", name = "f", descriptor = "(B)Ljava/lang/String;")
	public final String method5206() {
		@Pc(6) int local6 = this.anInt6217;
		while (this.aByteArray82[this.anInt6217++] != 0) {
		}
		@Pc(25) int local25 = this.anInt6217 - local6 - 1;
		return local25 == 0 ? "" : Static157.method3075(local6, local25, this.aByteArray82);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IB[II)V")
	public final void method5207(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) int local8 = this.anInt6217;
		this.anInt6217 = 5;
		@Pc(24) int local24 = (arg0 - 5) / 8;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) int local32 = this.method5225();
			@Pc(36) int local36 = this.method5225();
			@Pc(38) int local38 = -957401312;
			@Pc(42) int local42 = 32;
			while (local42-- > 0) {
				local36 -= (local32 >>> 5 ^ local32 << 4) + local32 ^ arg1[local38 >>> 11 & 0x3] + local38;
				local38 -= -1640531527;
				local32 -= local36 + (local36 >>> 5 ^ local36 << 4) ^ arg1[local38 & 0x3] + local38;
			}
			this.anInt6217 -= 8;
			this.method5223(local32);
			this.method5223(local36);
		}
		this.anInt6217 = local8;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(JZ)V")
	public final void method5208(@OriginalArg(0) long arg0) {
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 56);
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 48);
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 40);
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 32);
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 24);
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 16);
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 8);
		this.aByteArray82[this.anInt6217++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!daa", name = "g", descriptor = "(B)B")
	public final byte method5209() {
		return (byte) (128 - this.aByteArray82[this.anInt6217++]);
	}

	@OriginalMember(owner = "client!daa", name = "p", descriptor = "(I)I")
	public final int method5210() {
		this.anInt6217 += 2;
		return (this.aByteArray82[this.anInt6217 - 2] - 128 & 0xFF) + ((this.aByteArray82[this.anInt6217 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!daa", name = "q", descriptor = "(I)Z")
	public final boolean method5211() {
		this.anInt6217 -= 4;
		@Pc(17) int local17 = Static29.method559(0, this.aByteArray82, this.anInt6217);
		@Pc(21) int local21 = this.method5225();
		return local17 == local21;
	}

	@OriginalMember(owner = "client!daa", name = "d", descriptor = "(Z)I")
	public final int method5212() {
		this.anInt6217 += 3;
		return ((this.aByteArray82[this.anInt6217 - 1] & 0xFF) << 16) - (-((this.aByteArray82[this.anInt6217 - 2] & 0xFF) << 8) - (this.aByteArray82[this.anInt6217 - 3] & 0xFF));
	}

	@OriginalMember(owner = "client!daa", name = "r", descriptor = "(I)I")
	public final int method5213() {
		this.anInt6217 += 4;
		return ((this.aByteArray82[this.anInt6217 - 2] & 0xFF) << 24) + ((this.aByteArray82[this.anInt6217 - 1] & 0xFF) << 16) + ((this.aByteArray82[this.anInt6217 + -4] & 0xFF) << 8) + (this.aByteArray82[this.anInt6217 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "(BI)V")
	public final void method5214(@OriginalArg(1) int arg0) {
		this.aByteArray82[this.anInt6217++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!daa", name = "h", descriptor = "(II)V")
	public final void method5215(@OriginalArg(0) int arg0) {
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 + 128);
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!daa", name = "h", descriptor = "(B)I")
	public final int method5216() {
		return this.aByteArray82[this.anInt6217++] & 0xFF;
	}

	@OriginalMember(owner = "client!daa", name = "s", descriptor = "(I)I")
	public final int method5217() {
		this.anInt6217 += 2;
		@Pc(38) int local38 = ((this.aByteArray82[this.anInt6217 - 2] & 0xFF) << 8) + (this.aByteArray82[this.anInt6217 - 1] & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!daa", name = "t", descriptor = "(I)I")
	public final int method5218() {
		@Pc(16) int local16 = this.aByteArray82[this.anInt6217] & 0xFF;
		return local16 < 128 ? this.method5216() : this.method5199() - 32768;
	}

	@OriginalMember(owner = "client!daa", name = "i", descriptor = "(II)V")
	public final void method5219(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5214(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5190(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!daa", name = "d", descriptor = "(BI)I")
	public final int method5221(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static29.method559(arg0, this.aByteArray82, this.anInt6217);
		this.method5223(local11);
		return local11;
	}

	@OriginalMember(owner = "client!daa", name = "i", descriptor = "(B)B")
	public final byte method5222() {
		return (byte) (this.aByteArray82[this.anInt6217++] - 128);
	}

	@OriginalMember(owner = "client!daa", name = "j", descriptor = "(II)V")
	public final void method5223(@OriginalArg(1) int arg0) {
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 24);
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 16);
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 8);
		this.aByteArray82[this.anInt6217++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!daa", name = "e", descriptor = "(BI)V")
	public final void method5224(@OriginalArg(1) int arg0) {
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 8);
		this.aByteArray82[this.anInt6217++] = (byte) arg0;
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 24);
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!daa", name = "u", descriptor = "(I)I")
	public final int method5225() {
		this.anInt6217 += 4;
		return ((this.aByteArray82[this.anInt6217 - 4] & 0xFF) << 24) + ((this.aByteArray82[this.anInt6217 - 3] & 0xFF) << 16) + ((this.aByteArray82[this.anInt6217 + -2] & 0xFF) << 8) + (this.aByteArray82[this.anInt6217 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!daa", name = "j", descriptor = "(B)I")
	public final int method5226() {
		this.anInt6217 += 4;
		return (this.aByteArray82[this.anInt6217 - 4] & 0xFF) + ((this.aByteArray82[this.anInt6217 - 3] & 0xFF) << 8) + ((this.aByteArray82[this.anInt6217 + -1] & 0xFF) << 24) + ((this.aByteArray82[this.anInt6217 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!daa", name = "k", descriptor = "(B)I")
	public final int method5227() {
		this.anInt6217 += 2;
		@Pc(39) int local39 = ((this.aByteArray82[this.anInt6217 - 1] & 0xFF) << 8) + (this.aByteArray82[this.anInt6217 - 2] & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(I[BII)V")
	public final void method5228(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (this.aByteArray82[this.anInt6217++] - 128);
		}
	}

	@OriginalMember(owner = "client!daa", name = "v", descriptor = "(I)I")
	public final int method5229() {
		@Pc(16) byte local16 = this.aByteArray82[this.anInt6217++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local18 | local16 & 0x7F) << 7;
			local16 = this.aByteArray82[this.anInt6217++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!daa", name = "k", descriptor = "(II)V")
	public final void method5230(@OriginalArg(0) int arg0) {
		this.aByteArray82[this.anInt6217++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!daa", name = "f", descriptor = "(BI)V")
	public final void method5231(@OriginalArg(1) int arg0) {
		this.aByteArray82[this.anInt6217++] = (byte) arg0;
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 8);
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 16);
		this.aByteArray82[this.anInt6217++] = (byte) (arg0 >> 24);
	}
}

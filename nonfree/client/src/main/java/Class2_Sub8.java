import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!ol", name = "lb", descriptor = "[B")
	public byte[] lb;

	@OriginalMember(owner = "client!ol", name = "S", descriptor = "I")
	public int anInt5725;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(I)V")
	public Class2_Sub8(@OriginalArg(0) int arg0) {
		this.lb = Static509.method7941(arg0);
		this.anInt5725 = 0;
	}

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "([B)V")
	public Class2_Sub8(@OriginalArg(0) byte[] arg0) {
		this.anInt5725 = 0;
		this.lb = arg0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "([BIBI)V")
	public final void method5160(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = arg2; local7 < arg1 + arg2; local7++) {
			this.lb[this.anInt5725++] = arg0[local7];
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)I")
	public final int method5161() {
		this.anInt5725 += 3;
		return ((this.lb[this.anInt5725 - 2] & 0xFF) << 8) + ((this.lb[this.anInt5725 - 3] & 0xFF) << 16) + (this.lb[this.anInt5725 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZ)V")
	public final void method5162(@OriginalArg(0) int arg0) {
		this.lb[this.anInt5725 - arg0 - 2] = (byte) (arg0 >> 8);
		this.lb[this.anInt5725 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)I")
	public final int method5163() {
		this.anInt5725 += 2;
		@Pc(37) int local37 = ((this.lb[this.anInt5725 - 1] & 0xFF) << 8) + (this.lb[this.anInt5725 - 2] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(BI)V")
	public final void method5164(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5170(arg0 >>> 28 | 0x80);
					}
					this.method5170(arg0 >>> 21 | 0x80);
				}
				this.method5170(arg0 >>> 14 | 0x80);
			}
			this.method5170(arg0 >>> 7 | 0x80);
		}
		this.method5170(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)B")
	public final byte method5165() {
		return (byte) (128 - this.lb[this.anInt5725++]);
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)J")
	public final long method5166() {
		@Pc(15) long local15 = (long) this.method5203() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method5172() & 0xFFFFFFFFL;
		return local22 + (local15 << 32);
	}

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "(I)I")
	public final int method5167() {
		this.anInt5725 += 4;
		return (this.lb[this.anInt5725 - 4] & 0xFF) + ((this.lb[this.anInt5725 - 1] & 0xFF) << 24) + ((this.lb[this.anInt5725 + -2] & 0xFF) << 16) + ((this.lb[this.anInt5725 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "(I)I")
	public final int method5168() {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = this.method5173();
		while (local16 == 32767) {
			local16 = this.method5173();
			local7 += 32767;
		}
		return local7 + local16;
	}

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "(I)J")
	public final long method5169() {
		@Pc(10) long local10 = (long) this.method5216() & 0xFFFFFFFFL;
		@Pc(19) long local19 = (long) this.method5216() & 0xFFFFFFFFL;
		return (local19 << 32) + local10;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)V")
	public final void method5170(@OriginalArg(1) int arg0) {
		this.lb[this.anInt5725++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(IZ)V")
	public final void method5171(@OriginalArg(0) int arg0) {
		this.lb[this.anInt5725 - arg0 - 4] = (byte) (arg0 >> 24);
		this.lb[this.anInt5725 - arg0 - 3] = (byte) (arg0 >> 16);
		this.lb[this.anInt5725 - arg0 - 2] = (byte) (arg0 >> 8);
		this.lb[this.anInt5725 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "(I)I")
	public final int method5172() {
		this.anInt5725 += 4;
		return ((this.lb[this.anInt5725 - 2] & 0xFF) << 8) + ((this.lb[this.anInt5725 - 3] << 16 & 0xFF0000) + ((this.lb[this.anInt5725 - 4] & 0xFF) << 24) + (this.lb[this.anInt5725 + -1] & 0xFF));
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)I")
	public final int method5173() {
		@Pc(18) int local18 = this.lb[this.anInt5725] & 0xFF;
		return local18 < 128 ? this.method5203() : this.method5211() - 32768;
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)I")
	public final int method5174() {
		this.anInt5725 += 2;
		@Pc(38) int local38 = (this.lb[this.anInt5725 - 1] & 0xFF) + ((this.lb[this.anInt5725 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "(I)B")
	public final byte method5175() {
		return this.lb[this.anInt5725++];
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[BII)V")
	public final void method5176(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(5) int local5 = arg1; local5 < arg2 + arg1; local5++) {
			arg0[local5] = this.lb[this.anInt5725++];
		}
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(BI)V")
	public final void method5177(@OriginalArg(1) int arg0) {
		this.lb[this.anInt5725++] = (byte) arg0;
		this.lb[this.anInt5725++] = (byte) (arg0 >> 8);
		this.lb[this.anInt5725++] = (byte) (arg0 >> 16);
		this.lb[this.anInt5725++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "(B)Ljava/lang/String;")
	public final String method5178() {
		@Pc(11) int local11 = this.anInt5725;
		while (this.lb[this.anInt5725++] != 0) {
		}
		@Pc(31) int local31 = this.anInt5725 - local11 - 1;
		return local31 == 0 ? "" : Static4.method88(this.lb, local31, local11);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)V")
	public final void method5179(@OriginalArg(0) int arg0) {
		this.lb[this.anInt5725++] = (byte) (arg0 >> 16);
		this.lb[this.anInt5725++] = (byte) (arg0 >> 24);
		this.lb[this.anInt5725++] = (byte) arg0;
		this.lb[this.anInt5725++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "(B)Z")
	public final boolean method5180() {
		this.anInt5725 -= 4;
		@Pc(24) int local24 = Static312.method5102(this.anInt5725, 0, this.lb);
		@Pc(28) int local28 = this.method5172();
		return local24 == local28;
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(BI)V")
	public final void method5181(@OriginalArg(1) int arg0) {
		this.lb[this.anInt5725++] = (byte) (arg0 >> 16);
		this.lb[this.anInt5725++] = (byte) (arg0 >> 8);
		this.lb[this.anInt5725++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIJ)V")
	public final void method5182(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(31) int local31 = local2 * 8; local31 >= 0; local31 -= 8) {
			this.lb[this.anInt5725++] = (byte) (int) (arg1 >> local31);
		}
	}

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "(B)Ljava/lang/String;")
	public final String method5183() {
		@Pc(23) byte local23 = this.lb[this.anInt5725++];
		if (local23 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(33) int local33 = this.anInt5725;
		while (this.lb[this.anInt5725++] != 0) {
		}
		@Pc(55) int local55 = this.anInt5725 - local33 - 1;
		return local55 == 0 ? "" : Static4.method88(this.lb, local55, local33);
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(ZI)V")
	public final void method5185(@OriginalArg(1) int arg0) {
		this.lb[this.anInt5725++] = (byte) arg0;
		this.lb[this.anInt5725++] = (byte) (arg0 >> 8);
		this.lb[this.anInt5725++] = (byte) (arg0 >> 16);
		this.lb[this.anInt5725++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "(I)I")
	public final int method5186() {
		this.anInt5725 += 4;
		return (this.lb[this.anInt5725 - 2] & 0xFF) + ((this.lb[this.anInt5725 - 3] & 0xFF) << 24) + ((this.lb[this.anInt5725 - 4] & 0xFF) << 16) + ((this.lb[this.anInt5725 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "(BI)V")
	public final void method5187(@OriginalArg(1) int arg0) {
		this.lb[this.anInt5725++] = (byte) (arg0 >> 8);
		this.lb[this.anInt5725++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)V")
	public final void method5188(@OriginalArg(1) int arg0) {
		this.lb[this.anInt5725++] = (byte) (arg0 >> 8);
		this.lb[this.anInt5725++] = (byte) arg0;
		this.lb[this.anInt5725++] = (byte) (arg0 >> 24);
		this.lb[this.anInt5725++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(II)V")
	public final void method5189(@OriginalArg(1) int arg0) {
		this.lb[this.anInt5725++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "(I)B")
	public final byte method5190() {
		return (byte) -this.lb[this.anInt5725++];
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method5191(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = arg0.indexOf(0);
		if (local15 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local15 + " - cannot pjstr2");
		}
		this.lb[this.anInt5725++] = 0;
		this.anInt5725 += Static77.method1381(arg0, this.anInt5725, arg0.length(), this.lb);
		this.lb[this.anInt5725++] = 0;
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(ZI)V")
	public final void method5192(@OriginalArg(1) int arg0) {
		this.lb[this.anInt5725++] = (byte) (arg0 >> 8);
		this.lb[this.anInt5725++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "(I)I")
	public final int method5193() {
		this.anInt5725 += 3;
		@Pc(53) int local53 = ((this.lb[this.anInt5725 - 3] & 0xFF) << 16) - (-((this.lb[this.anInt5725 - 2] & 0xFF) << 8) - (this.lb[this.anInt5725 - 1] & 0xFF));
		if (local53 > 8388607) {
			local53 -= 16777216;
		}
		return local53;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)V")
	public final void method5194(@OriginalArg(0) int arg0) {
		this.lb[this.anInt5725++] = (byte) (arg0 >> 24);
		this.lb[this.anInt5725++] = (byte) (arg0 >> 16);
		this.lb[this.anInt5725++] = (byte) (arg0 >> 8);
		this.lb[this.anInt5725++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "([IBII)V")
	public final void method5195(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(6) int local6 = this.anInt5725;
		this.anInt5725 = 5;
		@Pc(21) int local21 = (arg1 - 5) / 8;
		for (@Pc(23) int local23 = 0; local23 < local21; local23++) {
			@Pc(28) int local28 = this.method5172();
			@Pc(32) int local32 = this.method5172();
			@Pc(34) int local34 = -957401312;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local32 -= (local28 << 4 ^ local28 >>> 5) + local28 ^ local34 + arg0[local34 >>> 11 & 0xDC800003];
				local34 -= -1640531527;
				local28 -= arg0[local34 & 0x3] + local34 ^ (local32 << 4 ^ local32 >>> 5) + local32;
			}
			this.anInt5725 -= 8;
			this.method5194(local28);
			this.method5194(local32);
		}
		this.anInt5725 = local6;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BII[B)V")
	public final void method5196(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = (byte) (this.lb[this.anInt5725++] - 128);
		}
	}

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "(I)I")
	public final int method5198() {
		this.anInt5725 += 2;
		@Pc(34) int local34 = ((this.lb[this.anInt5725 - 1] & 0xFF) << 8) + (this.lb[this.anInt5725 - 2] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "(B)V")
	public final void method5199() {
		if (this.lb != null) {
			Static509.method7934(this.lb);
		}
		this.lb = null;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
	public final void method5200(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt5725;
		this.anInt5725 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method5176(local12, 0, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt5725 = 0;
		this.method5192(local31.length);
		this.method5160(local31, local31.length, 0);
	}

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "(I)I")
	public final int method5201() {
		return -this.lb[this.anInt5725++] & 0xFF;
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(II)J")
	public final long method5202(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 - 1;
		if (local15 < 0 || local15 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(33) int local33 = local15 * 8;
		@Pc(35) long local35 = 0L;
		while (local33 >= 0) {
			local35 |= ((long) this.lb[this.anInt5725++] & 0xFFL) << local33;
			local33 -= 8;
		}
		return local35;
	}

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "(I)I")
	public final int method5203() {
		return this.lb[this.anInt5725++] & 0xFF;
	}

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "(II)V")
	public final void method5205(@OriginalArg(0) int arg0) {
		this.lb[this.anInt5725++] = (byte) arg0;
		this.lb[this.anInt5725++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(Z)I")
	public final int method5206() {
		return this.lb[this.anInt5725++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "(B)I")
	public final int method5207() {
		return 128 - this.lb[this.anInt5725++] & 0xFF;
	}

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "(II)V")
	public final void method5208(@OriginalArg(1) int arg0) {
		this.lb[this.anInt5725++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZJ)V")
	public final void method5209(@OriginalArg(1) long arg0) {
		this.lb[this.anInt5725++] = (byte) (int) (arg0 >> 56);
		this.lb[this.anInt5725++] = (byte) (int) (arg0 >> 48);
		this.lb[this.anInt5725++] = (byte) (int) (arg0 >> 40);
		this.lb[this.anInt5725++] = (byte) (int) (arg0 >> 32);
		this.lb[this.anInt5725++] = (byte) (int) (arg0 >> 24);
		this.lb[this.anInt5725++] = (byte) (int) (arg0 >> 16);
		this.lb[this.anInt5725++] = (byte) (int) (arg0 >> 8);
		this.lb[this.anInt5725++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "(II)V")
	public final void method5210(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5170(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5192(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "(B)I")
	public final int method5211() {
		this.anInt5725 += 2;
		return ((this.lb[this.anInt5725 - 2] & 0xFF) << 8) + (this.lb[this.anInt5725 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method5212(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt5725 += Static77.method1381(arg0, this.anInt5725, arg0.length(), this.lb);
		this.lb[this.anInt5725++] = 0;
	}

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "(B)J")
	public final long method5213() {
		@Pc(15) long local15 = (long) this.method5172() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method5172() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "(B)I")
	public final int method5214() {
		this.anInt5725 += 2;
		return ((this.lb[this.anInt5725 - 2] & 0xFF) << 8) + (this.lb[this.anInt5725 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ol", name = "q", descriptor = "(I)I")
	public final int method5215() {
		@Pc(16) byte local16 = this.lb[this.anInt5725++];
		@Pc(25) int local25 = 0;
		while (local16 < 0) {
			local25 = (local25 | local16 & 0x7F) << 7;
			local16 = this.lb[this.anInt5725++];
		}
		return local25 | local16;
	}

	@OriginalMember(owner = "client!ol", name = "r", descriptor = "(I)I")
	public final int method5216() {
		this.anInt5725 += 4;
		return (this.lb[this.anInt5725 - 4] & 0xFF) + ((this.lb[this.anInt5725 - 3] & 0xFF) << 8) + ((this.lb[this.anInt5725 + -2] & 0xFF) << 16) + ((this.lb[this.anInt5725 - 1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "(II)V")
	public final void method5217(@OriginalArg(1) int arg0) {
		this.lb[this.anInt5725 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(IB)V")
	public final void method5218(@OriginalArg(0) int arg0) {
		this.lb[this.anInt5725++] = (byte) (arg0 + 128);
		this.lb[this.anInt5725++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "(B)I")
	public final int method5219() {
		@Pc(17) int local17 = this.lb[this.anInt5725] & 0xFF;
		return local17 < 128 ? this.method5203() - 64 : this.method5211() + -49152;
	}

	@OriginalMember(owner = "client!ol", name = "s", descriptor = "(I)I")
	public final int method5222() {
		this.anInt5725 += 2;
		return ((this.lb[this.anInt5725 - 1] & 0xFF) << 8) + (this.lb[this.anInt5725 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ol", name = "t", descriptor = "(I)I")
	public final int method5223() {
		this.anInt5725 += 4;
		return (this.lb[this.anInt5725 - 3] & 0xFF) + ((this.lb[this.anInt5725 - 1] & 0xFF) << 16) + ((this.lb[this.anInt5725 + -2] & 0xFF) << 24) + ((this.lb[this.anInt5725 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ol", name = "u", descriptor = "(I)Ljava/lang/String;")
	public final String method5224() {
		if (this.lb[this.anInt5725] == 0) {
			this.anInt5725++;
			return null;
		} else {
			return this.method5178();
		}
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(ZI)V")
	public final void method5225(@OriginalArg(1) int arg0) {
		this.lb[this.anInt5725++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "(B)I")
	public final int method5226() {
		this.anInt5725 += 2;
		return (this.lb[this.anInt5725 - 2] - 128 & 0xFF) + ((this.lb[this.anInt5725 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ol", name = "v", descriptor = "(I)B")
	public final byte method5227() {
		return (byte) (this.lb[this.anInt5725++] - 128);
	}

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "(BI)V")
	public final void method5228(@OriginalArg(1) int arg0) {
		this.lb[this.anInt5725++] = (byte) arg0;
		this.lb[this.anInt5725++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[III)V")
	public final void method5229(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt5725;
		this.anInt5725 = arg2;
		@Pc(18) int local18 = (arg0 - arg2) / 8;
		for (@Pc(25) int local25 = 0; local25 < local18; local25++) {
			@Pc(31) int local31 = this.method5172();
			@Pc(35) int local35 = this.method5172();
			@Pc(37) int local37 = 0;
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local31 += arg1[local37 & 0x3] + local37 ^ local35 + (local35 >>> 5 ^ local35 << 4);
				local37 += -1640531527;
				local35 += local37 + arg1[local37 >>> 11 & 0x3] ^ (local31 >>> 5 ^ local31 << 4) + local31;
			}
			this.anInt5725 -= 8;
			this.method5194(local31);
			this.method5194(local35);
		}
		this.anInt5725 = local8;
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(IZ)I")
	public final int method5230(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = Static312.method5102(this.anInt5725, arg0, this.lb);
		this.method5194(local17);
		return local17;
	}
}

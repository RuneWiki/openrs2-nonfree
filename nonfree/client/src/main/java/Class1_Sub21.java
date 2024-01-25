import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!nj", name = "db", descriptor = "[B")
	public byte[] aByteArray82;

	@OriginalMember(owner = "client!nj", name = "S", descriptor = "I")
	public int anInt6611;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(I)V")
	public Class1_Sub21(@OriginalArg(0) int arg0) {
		this.aByteArray82 = Static283.method4988(arg0);
		this.anInt6611 = 0;
	}

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "([B)V")
	public Class1_Sub21(@OriginalArg(0) byte[] arg0) {
		this.aByteArray82 = arg0;
		this.anInt6611 = 0;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)I")
	public final int method5691() {
		this.anInt6611 += 2;
		@Pc(31) int local31 = (this.aByteArray82[this.anInt6611 - 1] & 0xFF) + ((this.aByteArray82[this.anInt6611 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)I")
	public final int method5692(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static296.method5192(this.anInt6611, this.aByteArray82, arg0);
		this.method5702(local11);
		return local11;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)V")
	public final void method5693(@OriginalArg(1) int arg0) {
		this.aByteArray82[this.anInt6611++] = (byte) arg0;
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 8);
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 16);
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)I")
	public final int method5695() {
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = this.method5699();
		while (local18 == 32767) {
			local18 = this.method5699();
			local14 += 32767;
		}
		return local14 + local18;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IB)V")
	public final void method5696(@OriginalArg(0) int arg0) {
		this.aByteArray82[this.anInt6611++] = (byte) arg0;
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III[I)V")
	public final void method5697(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt6611;
		this.anInt6611 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(34) int local34 = this.method5716();
			@Pc(38) int local38 = this.method5716();
			@Pc(40) int local40 = -957401312;
			@Pc(44) int local44 = 32;
			while (local44-- > 0) {
				local38 -= local34 + (local34 << 4 ^ local34 >>> 5) ^ local40 + arg1[local40 >>> 11 & 0x3];
				local40 -= -1640531527;
				local34 -= local38 + (local38 << 4 ^ local38 >>> 5) ^ local40 + arg1[local40 & 0x3];
			}
			this.anInt6611 -= 8;
			this.method5702(local34);
			this.method5702(local38);
		}
		this.anInt6611 = local8;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)V")
	public final void method5698(@OriginalArg(0) int arg0) {
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 8);
		this.aByteArray82[this.anInt6611++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)I")
	public final int method5699() {
		@Pc(11) int local11 = this.aByteArray82[this.anInt6611] & 0xFF;
		return local11 < 128 ? this.method5720() : this.method5715() - 32768;
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)I")
	public final int method5700() {
		this.anInt6611 += 4;
		return (this.aByteArray82[this.anInt6611 - 2] & 0xFF) + ((this.aByteArray82[this.anInt6611 - 1] & 0xFF) << 8) + ((this.aByteArray82[this.anInt6611 + -3] & 0xFF) << 24) + ((this.aByteArray82[this.anInt6611 + -4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)Ljava/lang/String;")
	public final String method5701() {
		@Pc(6) int local6 = this.anInt6611;
		while (this.aByteArray82[this.anInt6611++] != 0) {
		}
		@Pc(33) int local33 = this.anInt6611 - local6 - 1;
		return local33 == 0 ? "" : Static333.method5566(local6, local33, this.aByteArray82);
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(II)V")
	public final void method5702(@OriginalArg(0) int arg0) {
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 24);
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 16);
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 8);
		this.aByteArray82[this.anInt6611++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
	public final void method5703(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(13) int local13 = this.anInt6611;
		this.anInt6611 = 0;
		@Pc(19) byte[] local19 = new byte[local13];
		this.method5730(local19, local13);
		@Pc(30) BigInteger local30 = new BigInteger(local19);
		@Pc(35) BigInteger local35 = local30.modPow(arg0, arg1);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt6611 = 0;
		this.method5718(local38.length);
		this.method5729(local38.length, local38);
	}

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)J")
	public final long method5704() {
		@Pc(17) long local17 = (long) this.method5716() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method5716() & 0xFFFFFFFFL;
		return (local17 << 32) + local24;
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(B)I")
	public final int method5705() {
		this.anInt6611 += 3;
		return (this.aByteArray82[this.anInt6611 - 1] & 0xFF) + (((this.aByteArray82[this.anInt6611 - 3] & 0xFF) << 16) + ((this.aByteArray82[this.anInt6611 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "(I)I")
	public final int method5706() {
		@Pc(16) byte local16 = this.aByteArray82[this.anInt6611++];
		@Pc(23) int local23 = 0;
		while (local16 < 0) {
			local23 = (local16 & 0x7F | local23) << 7;
			local16 = this.aByteArray82[this.anInt6611++];
		}
		return local23 | local16;
	}

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "(I)B")
	public final byte method5708() {
		return (byte) -this.aByteArray82[this.anInt6611++];
	}

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "(I)Ljava/lang/String;")
	public final String method5709() {
		if (this.aByteArray82[this.anInt6611] == 0) {
			this.anInt6611++;
			return null;
		} else {
			return this.method5701();
		}
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(II)V")
	public final void method5710(@OriginalArg(1) int arg0) {
		this.aByteArray82[this.anInt6611++] = (byte) arg0;
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 8);
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 16);
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "(II)V")
	public final void method5711(@OriginalArg(0) int arg0) {
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 8);
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "(I)I")
	public final int method5712() {
		this.anInt6611 += 2;
		return ((this.aByteArray82[this.anInt6611 - 2] & 0xFF) << 8) + (this.aByteArray82[this.anInt6611 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "(II)V")
	public final void method5713(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5718(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5698(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "(I)I")
	public final int method5714() {
		this.anInt6611 += 2;
		@Pc(31) int local31 = (this.aByteArray82[this.anInt6611 - 2] & 0xFF) + ((this.aByteArray82[this.anInt6611 - 1] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "(I)I")
	public final int method5715() {
		this.anInt6611 += 2;
		return (this.aByteArray82[this.anInt6611 - 1] & 0xFF) + ((this.aByteArray82[this.anInt6611 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "(B)I")
	public final int method5716() {
		this.anInt6611 += 4;
		return ((this.aByteArray82[this.anInt6611 - 3] & 0xFF) << 16) + ((this.aByteArray82[this.anInt6611 - 4] & 0xFF) << 24) + ((this.aByteArray82[this.anInt6611 + -2] & 0xFF) << 8) + (this.aByteArray82[this.anInt6611 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(BI)V")
	public final void method5717(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5718(arg0 >>> 28 | 0x80);
					}
					this.method5718(arg0 >>> 21 | 0x80);
				}
				this.method5718(arg0 >>> 14 | 0x80);
			}
			this.method5718(arg0 >>> 7 | 0x80);
		}
		this.method5718(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "(II)V")
	public final void method5718(@OriginalArg(0) int arg0) {
		this.aByteArray82[this.anInt6611++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "(B)I")
	public final int method5719() {
		this.anInt6611 += 2;
		@Pc(33) int local33 = (this.aByteArray82[this.anInt6611 - 2] - 128 & 0xFF) + ((this.aByteArray82[this.anInt6611 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "(I)I")
	public final int method5720() {
		return this.aByteArray82[this.anInt6611++] & 0xFF;
	}

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "(I)B")
	public final byte method5721() {
		return this.aByteArray82[this.anInt6611++];
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I[I)V")
	public final void method5722(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.anInt6611 / 8;
		this.anInt6611 = 0;
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			@Pc(21) int local21 = this.method5716();
			@Pc(25) int local25 = this.method5716();
			@Pc(27) int local27 = 0;
			@Pc(31) int local31 = 32;
			while (local31-- > 0) {
				local21 += (local25 << 4 ^ local25 >>> 5) + local25 ^ arg0[local27 & 0x3] + local27;
				local27 += -1640531527;
				local25 += (local21 >>> 5 ^ local21 << 4) + local21 ^ arg0[local27 >>> 11 & 0x3] + local27;
			}
			this.anInt6611 -= 8;
			this.method5702(local21);
			this.method5702(local25);
		}
	}

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "(B)I")
	public final int method5723() {
		@Pc(16) int local16 = this.aByteArray82[this.anInt6611] & 0xFF;
		return local16 < 128 ? this.method5720() - 64 : this.method5715() - 49152;
	}

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "(II)V")
	public final void method5724(@OriginalArg(0) int arg0) {
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 16);
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 24);
		this.aByteArray82[this.anInt6611++] = (byte) arg0;
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([BBII)V")
	public final void method5725(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg1; local15++) {
			arg0[local15] = (byte) (this.aByteArray82[this.anInt6611++] - 128);
		}
	}

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "(I)I")
	public final int method5727() {
		return -this.aByteArray82[this.anInt6611++] & 0xFF;
	}

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "(B)I")
	public final int method5728() {
		this.anInt6611 += 2;
		return ((this.aByteArray82[this.anInt6611 - 1] & 0xFF) << 8) + (this.aByteArray82[this.anInt6611 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III[B)V")
	public final void method5729(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aByteArray82[this.anInt6611++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II[BI)V")
	public final void method5730(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = this.aByteArray82[this.anInt6611++];
		}
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "(BI)V")
	public final void method5731(@OriginalArg(1) int arg0) {
		this.aByteArray82[this.anInt6611++] = (byte) arg0;
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "(B)B")
	public final byte method5732() {
		return (byte) (this.aByteArray82[this.anInt6611++] - 128);
	}

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "(I)I")
	public final int method5733() {
		this.anInt6611 += 2;
		return ((this.aByteArray82[this.anInt6611 - 1] & 0xFF) << 8) + (this.aByteArray82[this.anInt6611 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "(II)V")
	public final void method5734(@OriginalArg(1) int arg0) {
		this.aByteArray82[this.anInt6611++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "(I)I")
	public final int method5735() {
		this.anInt6611 += 4;
		return (this.aByteArray82[this.anInt6611 - 4] & 0xFF) + ((this.aByteArray82[this.anInt6611 - 2] & 0xFF) << 16) + ((this.aByteArray82[this.anInt6611 + -1] & 0xFF) << 24) + ((this.aByteArray82[this.anInt6611 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "(BI)J")
	public final long method5736(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(24) int local24 = local6 * 8;
		@Pc(26) long local26 = 0L;
		while (local24 >= 0) {
			local26 |= ((long) this.aByteArray82[this.anInt6611++] & 0xFFL) << local24;
			local24 -= 8;
		}
		return local26;
	}

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "(BI)V")
	public final void method5737(@OriginalArg(1) int arg0) {
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 16);
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 8);
		this.aByteArray82[this.anInt6611++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(IB)V")
	public final void method5738(@OriginalArg(0) int arg0) {
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 8);
		this.aByteArray82[this.anInt6611++] = (byte) arg0;
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 24);
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "(I)I")
	public final int method5739() {
		this.anInt6611 += 4;
		return (this.aByteArray82[this.anInt6611 - 3] & 0xFF) + ((this.aByteArray82[this.anInt6611 - 1] & 0xFF) << 16) + ((this.aByteArray82[this.anInt6611 - 2] & 0xFF) << 24) + ((this.aByteArray82[this.anInt6611 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IJI)V")
	public final void method5740(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(26) int local26 = local6 * 8; local26 >= 0; local26 -= 8) {
			this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> local26);
		}
	}

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "(II)V")
	public final void method5741(@OriginalArg(0) int arg0) {
		this.aByteArray82[this.anInt6611++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "(B)Z")
	public final boolean method5742() {
		this.anInt6611 -= 4;
		@Pc(24) int local24 = Static296.method5192(this.anInt6611, this.aByteArray82, 0);
		@Pc(28) int local28 = this.method5716();
		return local24 == local28;
	}

	@OriginalMember(owner = "client!nj", name = "s", descriptor = "(I)I")
	public final int method5743() {
		return this.aByteArray82[this.anInt6611++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(JI)V")
	public final void method5744(@OriginalArg(0) long arg0) {
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 56);
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 48);
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 40);
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 32);
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 24);
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 16);
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 8);
		this.aByteArray82[this.anInt6611++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nj", name = "t", descriptor = "(I)Ljava/lang/String;")
	public final String method5745() {
		@Pc(19) byte local19 = this.aByteArray82[this.anInt6611++];
		if (local19 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(32) int local32 = this.anInt6611;
		while (this.aByteArray82[this.anInt6611++] != 0) {
		}
		@Pc(52) int local52 = this.anInt6611 - local32 - 1;
		return local52 == 0 ? "" : Static333.method5566(local32, local52, this.aByteArray82);
	}

	@OriginalMember(owner = "client!nj", name = "u", descriptor = "(I)I")
	public final int method5746() {
		return 128 - this.aByteArray82[this.anInt6611++] & 0xFF;
	}

	@OriginalMember(owner = "client!nj", name = "v", descriptor = "(I)I")
	public final int method5747() {
		this.anInt6611 += 3;
		return (this.aByteArray82[this.anInt6611 - 2] & 0xFF) + ((this.aByteArray82[this.anInt6611 - 1] & 0xFF) << 8) + ((this.aByteArray82[this.anInt6611 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(IB)V")
	public final void method5748(@OriginalArg(0) int arg0) {
		this.aByteArray82[this.anInt6611 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray82[this.anInt6611 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray82[this.anInt6611 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray82[this.anInt6611 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(IB)V")
	public final void method5749(@OriginalArg(0) int arg0) {
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "(II)V")
	public final void method5750(@OriginalArg(0) int arg0) {
		this.aByteArray82[this.anInt6611 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "(II)V")
	public final void method5751(@OriginalArg(1) int arg0) {
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 + 128);
		this.aByteArray82[this.anInt6611++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method5752(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt6611 += Static281.method4982(this.aByteArray82, this.anInt6611, arg0, arg0.length());
		this.aByteArray82[this.anInt6611++] = 0;
	}
}

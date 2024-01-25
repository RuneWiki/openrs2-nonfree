import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public class Class2_Sub24 extends Class2 {

	@OriginalMember(owner = "client!vt", name = "kb", descriptor = "I")
	public int anInt6669 = 0;

	@OriginalMember(owner = "client!vt", name = "p", descriptor = "[B")
	public byte[] aByteArray100;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(I)V")
	public Class2_Sub24(@OriginalArg(0) int arg0) {
		this.aByteArray100 = Static315.method5100(arg0);
	}

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "([B)V")
	public Class2_Sub24(@OriginalArg(0) byte[] arg0) {
		this.aByteArray100 = arg0;
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(Z)I")
	public final int method5714() {
		this.anInt6669 += 4;
		return (this.aByteArray100[this.anInt6669 - 2] & 0xFF) + ((this.aByteArray100[this.anInt6669 - 1] & 0xFF) << 8) + ((this.aByteArray100[this.anInt6669 + -3] & 0xFF) << 24) + ((this.aByteArray100[this.anInt6669 + -4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZI)V")
	public final void method5715(@OriginalArg(1) int arg0) {
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 + 128);
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public final String method5716() {
		if (this.aByteArray100[this.anInt6669] == 0) {
			this.anInt6669++;
			return null;
		} else {
			return this.method5744();
		}
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(ZI)V")
	public final void method5717(@OriginalArg(1) int arg0) {
		this.aByteArray100[this.anInt6669++] = (byte) arg0;
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)Z")
	public final boolean method5718() {
		this.anInt6669 -= 4;
		@Pc(17) int local17 = Static178.method3291(this.anInt6669, 0, this.aByteArray100);
		@Pc(26) int local26 = this.method5776();
		return local17 == local26;
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(B)I")
	public final int method5719() {
		this.anInt6669 += 2;
		return ((this.aByteArray100[this.anInt6669 - 2] & 0xFF) << 8) + (this.aByteArray100[this.anInt6669 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(I)I")
	public final int method5720() {
		this.anInt6669 += 2;
		return ((this.aByteArray100[this.anInt6669 - 1] & 0xFF) << 8) + (this.aByteArray100[this.anInt6669 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IZ)V")
	public final void method5721(@OriginalArg(0) int arg0) {
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 8);
		this.aByteArray100[this.anInt6669++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "(Z)I")
	public final int method5722() {
		@Pc(18) int local18 = this.aByteArray100[this.anInt6669] & 0xFF;
		return local18 < 128 ? this.method5732() : this.method5753() - 32768;
	}

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "(B)I")
	public final int method5723() {
		return -this.aByteArray100[this.anInt6669++] & 0xFF;
	}

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "(I)I")
	public final int method5724() {
		this.anInt6669 += 2;
		@Pc(33) int local33 = ((this.aByteArray100[this.anInt6669 - 1] & 0xFF) << 8) + (this.aByteArray100[this.anInt6669 - 2] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)I")
	public final int method5725() {
		this.anInt6669 += 3;
		return (this.aByteArray100[this.anInt6669 - 2] & 0xFF) + ((this.aByteArray100[this.anInt6669 - 1] & 0xFF) << 8) + ((this.aByteArray100[this.anInt6669 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(ZI)V")
	public final void method5726(@OriginalArg(1) int arg0) {
		this.aByteArray100[this.anInt6669++] = (byte) arg0;
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)V")
	public final void method5727(@OriginalArg(0) int arg0) {
		this.aByteArray100[this.anInt6669 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(II)V")
	public final void method5728(@OriginalArg(1) int arg0) {
		this.aByteArray100[this.anInt6669 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray100[this.anInt6669 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray100[this.anInt6669 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray100[this.anInt6669 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I[I)V")
	public final void method5729(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.anInt6669 / 8;
		this.anInt6669 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(27) int local27 = this.method5776();
			@Pc(31) int local31 = this.method5776();
			@Pc(33) int local33 = 0;
			@Pc(37) int local37 = 32;
			while (local37-- > 0) {
				local27 += arg0[local33 & 0x3] + local33 ^ (local31 >>> 5 ^ local31 << 4) - -local31;
				local33 += -1640531527;
				local31 += local27 + (local27 << 4 ^ local27 >>> 5) ^ arg0[local33 >>> 11 & 0xC5800003] + local33;
			}
			this.anInt6669 -= 8;
			this.method5734(local27);
			this.method5734(local31);
		}
	}

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "(I)B")
	public final byte method5730() {
		return (byte) -this.aByteArray100[this.anInt6669++];
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(II)V")
	public final void method5731(@OriginalArg(1) int arg0) {
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "(B)I")
	public final int method5732() {
		return this.aByteArray100[this.anInt6669++] & 0xFF;
	}

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "(I)I")
	public final int method5733() {
		return this.aByteArray100[this.anInt6669++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "(II)V")
	public final void method5734(@OriginalArg(0) int arg0) {
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 24);
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 16);
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 8);
		this.aByteArray100[this.anInt6669++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(IZ)V")
	public final void method5735(@OriginalArg(0) int arg0) {
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 8);
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "(B)I")
	public final int method5736() {
		this.anInt6669 += 3;
		return (this.aByteArray100[this.anInt6669 - 1] & 0xFF) + ((this.aByteArray100[this.anInt6669 - 2] & 0xFF) << 8) + ((this.aByteArray100[this.anInt6669 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IBI[B)V")
	public final void method5737(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(16) int local16 = arg0 - 1; local16 >= 0; local16--) {
			arg1[local16] = this.aByteArray100[this.anInt6669++];
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II[II)V")
	public final void method5738(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) int local8 = this.anInt6669;
		this.anInt6669 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			@Pc(33) int local33 = this.method5776();
			@Pc(37) int local37 = this.method5776();
			@Pc(39) int local39 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= local39 + arg1[local39 >>> 11 & 0x13A00003] ^ local33 + (local33 >>> 5 ^ local33 << 4);
				local39 -= -1640531527;
				local33 -= (local37 << 4 ^ local37 >>> 5) + local37 ^ local39 + arg1[local39 & 0x3];
			}
			this.anInt6669 -= 8;
			this.method5734(local33);
			this.method5734(local37);
		}
		this.anInt6669 = local8;
	}

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "(I)J")
	public final long method5740() {
		@Pc(17) long local17 = (long) this.method5776() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method5776() & 0xFFFFFFFFL;
		return (local17 << 32) + local24;
	}

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "(II)V")
	public final void method5741(@OriginalArg(0) int arg0) {
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 16);
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 8);
		this.aByteArray100[this.anInt6669++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "(Z)B")
	public final byte method5742() {
		return (byte) (this.aByteArray100[this.anInt6669++] - 128);
	}

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "(I)I")
	public final int method5743() {
		this.anInt6669 += 2;
		@Pc(36) int local36 = (this.aByteArray100[this.anInt6669 - 1] & 0xFF) + ((this.aByteArray100[this.anInt6669 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "(I)Ljava/lang/String;")
	public final String method5744() {
		@Pc(13) int local13 = this.anInt6669;
		while (this.aByteArray100[this.anInt6669++] != 0) {
		}
		@Pc(33) int local33 = this.anInt6669 - local13 - 1;
		return local33 == 0 ? "" : Static378.method4271(local33, this.aByteArray100, local13);
	}

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "(I)I")
	public final int method5745() {
		this.anInt6669 += 4;
		return (this.aByteArray100[this.anInt6669 - 3] & 0xFF) + (((this.aByteArray100[this.anInt6669 - 1] & 0xFF) << 16) + ((this.aByteArray100[this.anInt6669 - 2] & 0xFF) << 24) + ((this.aByteArray100[this.anInt6669 + -4] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "(II)V")
	public final void method5746(@OriginalArg(0) int arg0) {
		this.aByteArray100[this.anInt6669++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IB)I")
	public final int method5748(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = Static178.method3291(this.anInt6669, arg0, this.aByteArray100);
		this.method5734(local17);
		return local17;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method5751(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(13) int local13 = this.anInt6669;
		this.anInt6669 = 0;
		@Pc(19) byte[] local19 = new byte[local13];
		this.method5756(local19, local13);
		@Pc(30) BigInteger local30 = new BigInteger(local19);
		@Pc(35) BigInteger local35 = local30.modPow(arg0, arg1);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt6669 = 0;
		this.method5746(local38.length);
		this.method5771(local38, local38.length);
	}

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "(B)I")
	public final int method5752() {
		@Pc(7) int local7 = 0;
		@Pc(19) int local19;
		for (local19 = this.method5722(); local19 == 32767; local19 = this.method5722()) {
			local7 += 32767;
		}
		return local7 + local19;
	}

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "(I)I")
	public final int method5753() {
		this.anInt6669 += 2;
		return ((this.aByteArray100[this.anInt6669 - 2] & 0xFF) << 8) + (this.aByteArray100[this.anInt6669 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "(II)V")
	public final void method5754(@OriginalArg(0) int arg0) {
		this.aByteArray100[this.anInt6669++] = (byte) arg0;
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 8);
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 16);
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(IZ)V")
	public final void method5755(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5746(arg0 >>> 28 | 0x80);
					}
					this.method5746(arg0 >>> 21 | 0x80);
				}
				this.method5746(arg0 >>> 14 | 0x80);
			}
			this.method5746(arg0 >>> 7 | 0x80);
		}
		this.method5746(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z[BII)V")
	public final void method5756(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			arg0[local12] = this.aByteArray100[this.anInt6669++];
		}
	}

	@OriginalMember(owner = "client!vt", name = "n", descriptor = "(I)Ljava/lang/String;")
	public final String method5757() {
		@Pc(14) byte local14 = this.aByteArray100[this.anInt6669++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt6669;
		while (this.aByteArray100[this.anInt6669++] != 0) {
		}
		@Pc(46) int local46 = this.anInt6669 - local27 - 1;
		return local46 == 0 ? "" : Static378.method4271(local46, this.aByteArray100, local27);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BI)J")
	public final long method5758(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		if (local4 < 0 || local4 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(17) int local17 = local4 * 8;
		@Pc(19) long local19 = 0L;
		while (local17 >= 0) {
			local19 |= ((long) this.aByteArray100[this.anInt6669++] & 0xFFL) << local17;
			local17 -= 8;
		}
		return local19;
	}

	@OriginalMember(owner = "client!vt", name = "o", descriptor = "(I)B")
	public final byte method5759() {
		return this.aByteArray100[this.anInt6669++];
	}

	@OriginalMember(owner = "client!vt", name = "p", descriptor = "(I)I")
	public final int method5760() {
		this.anInt6669 += 4;
		return (this.aByteArray100[this.anInt6669 - 4] & 0xFF) + ((this.aByteArray100[this.anInt6669 - 2] & 0xFF) << 16) + ((this.aByteArray100[this.anInt6669 - 1] & 0xFF) << 24) + ((this.aByteArray100[this.anInt6669 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "([BZII)V")
	public final void method5761(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = (byte) (this.aByteArray100[this.anInt6669++] - 128);
		}
	}

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "(II)V")
	public final void method5762(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5746(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5721(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "(B)B")
	public final byte method5763() {
		return (byte) (128 - this.aByteArray100[this.anInt6669++]);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIJ)V")
	public final void method5764(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(22) int local22 = local0 * 8; local22 >= 0; local22 -= 8) {
			this.aByteArray100[this.anInt6669++] = (byte) (arg1 >> local22);
		}
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(BI)V")
	public final void method5765(@OriginalArg(1) int arg0) {
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 16);
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 24);
		this.aByteArray100[this.anInt6669++] = (byte) arg0;
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BJ)V")
	public final void method5766(@OriginalArg(1) long arg0) {
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 56);
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 48);
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 40);
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 32);
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 24);
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 16);
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 8);
		this.aByteArray100[this.anInt6669++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vt", name = "q", descriptor = "(I)I")
	public final int method5767() {
		this.anInt6669 += 2;
		return ((this.aByteArray100[this.anInt6669 - 1] & 0xFF) << 8) + (this.aByteArray100[this.anInt6669 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!vt", name = "r", descriptor = "(I)I")
	public final int method5768() {
		@Pc(11) int local11 = this.aByteArray100[this.anInt6669] & 0xFF;
		return local11 < 128 ? this.method5732() - 64 : this.method5753() + -49152;
	}

	@OriginalMember(owner = "client!vt", name = "s", descriptor = "(I)I")
	public final int method5769() {
		@Pc(14) byte local14 = this.aByteArray100[this.anInt6669++];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local16 | local14 & 0x7F) << 7;
			local14 = this.aByteArray100[this.anInt6669++];
		}
		return local14 | local16;
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(BI)V")
	public final void method5770(@OriginalArg(1) int arg0) {
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 8);
		this.aByteArray100[this.anInt6669++] = (byte) arg0;
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 24);
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(B[BII)V")
	public final void method5771(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			this.aByteArray100[this.anInt6669++] = arg0[local3];
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method5772(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = arg0.indexOf(0);
		if (local15 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local15 + " - cannot pjstr");
		}
		this.anInt6669 += Static276.method6131(arg0, arg0.length(), this.anInt6669, this.aByteArray100);
		this.aByteArray100[this.anInt6669++] = 0;
	}

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "(II)V")
	public final void method5773(@OriginalArg(0) int arg0) {
		this.aByteArray100[this.anInt6669++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "(BI)V")
	public final void method5774(@OriginalArg(1) int arg0) {
		this.aByteArray100[this.anInt6669++] = (byte) arg0;
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 8);
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 16);
		this.aByteArray100[this.anInt6669++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "(II)V")
	public final void method5775(@OriginalArg(1) int arg0) {
		this.aByteArray100[this.anInt6669++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "(B)I")
	public final int method5776() {
		this.anInt6669 += 4;
		return ((this.aByteArray100[this.anInt6669 - 4] & 0xFF) << 24) + ((this.aByteArray100[this.anInt6669 - 3] & 0xFF) << 16) + ((this.aByteArray100[this.anInt6669 + -2] & 0xFF) << 8) + (this.aByteArray100[this.anInt6669 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "(B)I")
	public final int method5777() {
		return 128 - this.aByteArray100[this.anInt6669++] & 0xFF;
	}

	@OriginalMember(owner = "client!vt", name = "t", descriptor = "(I)I")
	public final int method5778() {
		this.anInt6669 += 2;
		@Pc(37) int local37 = (this.aByteArray100[this.anInt6669 - 2] & 0xFF) + ((this.aByteArray100[this.anInt6669 - 1] & 0xFF) << 8);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}
}

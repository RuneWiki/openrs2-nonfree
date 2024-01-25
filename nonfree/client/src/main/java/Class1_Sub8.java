import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!bg", name = "E", descriptor = "[B")
	public byte[] aByteArray81;

	@OriginalMember(owner = "client!bg", name = "bb", descriptor = "I")
	public int anInt5182;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(I)V")
	public Class1_Sub8(@OriginalArg(0) int arg0) {
		this.aByteArray81 = Static26.method719(arg0);
		this.anInt5182 = 0;
	}

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "([B)V")
	public Class1_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray81 = arg0;
		this.anInt5182 = 0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
	public final void method4508(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt5182 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray81[this.anInt5182 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray81[this.anInt5182 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray81[this.anInt5182 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZI)V")
	public final void method4509(@OriginalArg(1) int arg0) {
		this.aByteArray81[this.anInt5182++] = (byte) arg0;
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)J")
	public final long method4511() {
		@Pc(15) long local15 = (long) this.method4545() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method4545() & 0xFFFFFFFFL;
		return local22 + (local15 << 32);
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)Ljava/lang/String;")
	public final String method4512() {
		if (this.aByteArray81[this.anInt5182] == 0) {
			this.anInt5182++;
			return null;
		} else {
			return this.method4534();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III[B)V")
	public final void method4513(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray81[this.anInt5182++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)I")
	public final int method4514() {
		this.anInt5182 += 3;
		return (this.aByteArray81[this.anInt5182 - 1] & 0xFF) + ((this.aByteArray81[this.anInt5182 - 2] & 0xFF) << 8) + ((this.aByteArray81[this.anInt5182 - 3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)V")
	public final void method4515(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 8);
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)V")
	public final void method4516(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt5182++] = (byte) arg0;
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 8);
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 16);
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(II)I")
	public final int method4517(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static239.method4369(this.anInt5182, this.aByteArray81, arg0);
		this.method4529(local11);
		return local11;
	}

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)I")
	public final int method4518() {
		this.anInt5182 += 4;
		return ((this.aByteArray81[this.anInt5182 - 4] & 0xFF) << 8) + ((this.aByteArray81[this.anInt5182 - 1] & 0xFF) << 16) + ((this.aByteArray81[this.anInt5182 + -2] & 0xFF) << 24) + (this.aByteArray81[this.anInt5182 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIB[B)V")
	public final void method4519(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = this.aByteArray81[this.anInt5182++];
		}
	}

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "(I)I")
	public final int method4520() {
		this.anInt5182 += 2;
		return (this.aByteArray81[this.anInt5182 - 1] - 128 & 0xFF) + ((this.aByteArray81[this.anInt5182 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([IIII)V")
	public final void method4521(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt5182;
		this.anInt5182 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(28) int local28 = this.method4545();
			@Pc(32) int local32 = this.method4545();
			@Pc(34) int local34 = -957401312;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local32 -= arg0[local34 >>> 11 & 0x3] + local34 ^ local28 + (local28 << 4 ^ local28 >>> 5);
				local34 -= -1640531527;
				local28 -= local32 + (local32 >>> 5 ^ local32 << 4) ^ arg0[local34 & 0x3] + local34;
			}
			this.anInt5182 -= 8;
			this.method4529(local28);
			this.method4529(local32);
		}
		this.anInt5182 = local8;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)I")
	public final int method4522() {
		@Pc(11) int local11 = this.aByteArray81[this.anInt5182] & 0xFF;
		return local11 < 128 ? this.method4532() - 64 : this.method4556() + -49152;
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(II)V")
	public final void method4523(@OriginalArg(1) int arg0) {
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 8);
		this.aByteArray81[this.anInt5182++] = (byte) arg0;
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 24);
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(ZI)V")
	public final void method4524(@OriginalArg(1) int arg0) {
		this.aByteArray81[this.anInt5182++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([II)V")
	public final void method4525(@OriginalArg(0) int[] arg0) {
		@Pc(14) int local14 = this.anInt5182 / 8;
		this.anInt5182 = 0;
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			@Pc(25) int local25 = this.method4545();
			@Pc(29) int local29 = this.method4545();
			@Pc(31) int local31 = 0;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local25 += arg0[local31 & 0x3] + local31 ^ local29 + (local29 >>> 5 ^ local29 << 4);
				local31 += -1640531527;
				local29 += local31 + arg0[local31 >>> 11 & 0x74000003] ^ (local25 >>> 5 ^ local25 << 4) + local25;
			}
			this.anInt5182 -= 8;
			this.method4529(local25);
			this.method4529(local29);
		}
	}

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "(I)I")
	public final int method4526() {
		this.anInt5182 += 3;
		return ((this.aByteArray81[this.anInt5182 - 1] & 0xFF) << 8) + ((this.aByteArray81[this.anInt5182 - 3] & 0xFF) << 16) + (this.aByteArray81[this.anInt5182 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)V")
	public final void method4527(@OriginalArg(1) int arg0) {
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 16);
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 24);
		this.aByteArray81[this.anInt5182++] = (byte) arg0;
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)I")
	public final int method4528() {
		@Pc(18) int local18 = this.aByteArray81[this.anInt5182] & 0xFF;
		return local18 < 128 ? this.method4532() : this.method4556() - 32768;
	}

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "(II)V")
	public final void method4529(@OriginalArg(1) int arg0) {
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 24);
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 16);
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 8);
		this.aByteArray81[this.anInt5182++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "(I)I")
	public final int method4530() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method4528();
		while (local11 == 32767) {
			local11 = this.method4528();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method4531(@OriginalArg(1) String arg0) {
		@Pc(15) int local15 = arg0.indexOf(0);
		if (local15 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local15 + " - cannot pjstr");
		}
		this.anInt5182 += Static308.method2775(arg0, this.anInt5182, this.aByteArray81, arg0.length());
		this.aByteArray81[this.anInt5182++] = 0;
	}

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "(I)I")
	public final int method4532() {
		return this.aByteArray81[this.anInt5182++] & 0xFF;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(Z)I")
	public final int method4533() {
		this.anInt5182 += 2;
		@Pc(40) int local40 = ((this.aByteArray81[this.anInt5182 - 1] & 0xFF) << 8) + (this.aByteArray81[this.anInt5182 - 2] - 128 & 0xFF);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "(I)Ljava/lang/String;")
	public final String method4534() {
		@Pc(11) int local11 = this.anInt5182;
		while (this.aByteArray81[this.anInt5182++] != 0) {
		}
		@Pc(34) int local34 = this.anInt5182 - local11 - 1;
		return local34 == 0 ? "" : Static31.method799(this.aByteArray81, local34, local11);
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)I")
	public final int method4535() {
		@Pc(21) byte local21 = this.aByteArray81[this.anInt5182++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local23 | local21 & 0x7F) << 7;
			local21 = this.aByteArray81[this.anInt5182++];
		}
		return local23 | local21;
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(Z)I")
	public final int method4536() {
		return -this.aByteArray81[this.anInt5182++] & 0xFF;
	}

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "(I)B")
	public final byte method4537() {
		return (byte) -this.aByteArray81[this.anInt5182++];
	}

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "(Z)I")
	public final int method4538() {
		this.anInt5182 += 2;
		return ((this.aByteArray81[this.anInt5182 - 1] & 0xFF) << 8) + (this.aByteArray81[this.anInt5182 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(B)I")
	public final int method4539() {
		this.anInt5182 += 4;
		return ((this.aByteArray81[this.anInt5182 - 3] & 0xFF) << 8) + ((this.aByteArray81[this.anInt5182 - 2] & 0xFF) << 16) + ((this.aByteArray81[this.anInt5182 + -1] & 0xFF) << 24) + (this.aByteArray81[this.anInt5182 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String method4540() {
		@Pc(14) byte local14 = this.aByteArray81[this.anInt5182++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(25) int local25 = this.anInt5182;
		while (this.aByteArray81[this.anInt5182++] != 0) {
		}
		@Pc(48) int local48 = this.anInt5182 - local25 - 1;
		return local48 == 0 ? "" : Static31.method799(this.aByteArray81, local48, local25);
	}

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "(I)I")
	public final int method4541() {
		return 128 - this.aByteArray81[this.anInt5182++] & 0xFF;
	}

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "(II)V")
	public final void method4542(@OriginalArg(1) int arg0) {
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 8);
		this.aByteArray81[this.anInt5182++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB[BI)V")
	public final void method4543(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(8) int local8 = arg1 - 1; local8 >= 0; local8--) {
			arg0[local8] = this.aByteArray81[this.anInt5182++];
		}
	}

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "(B)Z")
	public final boolean method4544() {
		this.anInt5182 -= 4;
		@Pc(24) int local24 = Static239.method4369(this.anInt5182, this.aByteArray81, 0);
		@Pc(28) int local28 = this.method4545();
		return local24 == local28;
	}

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "(B)I")
	public final int method4545() {
		this.anInt5182 += 4;
		return ((this.aByteArray81[this.anInt5182 - 4] & 0xFF) << 24) + ((this.aByteArray81[this.anInt5182 - 3] & 0xFF) << 16) + ((this.aByteArray81[this.anInt5182 + -2] & 0xFF) << 8) + (this.aByteArray81[this.anInt5182 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "(II)V")
	public final void method4546(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4562(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4542(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bg", name = "o", descriptor = "(I)I")
	public final int method4547() {
		this.anInt5182 += 2;
		return (this.aByteArray81[this.anInt5182 - 2] & 0xFF) + ((this.aByteArray81[this.anInt5182 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(BI)V")
	public final void method4548(@OriginalArg(1) int arg0) {
		this.aByteArray81[this.anInt5182++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "(II)V")
	public final void method4549(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 16);
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 8);
		this.aByteArray81[this.anInt5182++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "(II)J")
	public final long method4550(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(22) int local22 = local6 * 8;
		@Pc(24) long local24 = 0L;
		while (local22 >= 0) {
			local24 |= ((long) this.aByteArray81[this.anInt5182++] & 0xFFL) << local22;
			local22 -= 8;
		}
		return local24;
	}

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "(Z)I")
	public final int method4551() {
		this.anInt5182 += 2;
		@Pc(31) int local31 = (this.aByteArray81[this.anInt5182 - 1] & 0xFF) + ((this.aByteArray81[this.anInt5182 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "(I)I")
	public final int method4552() {
		return this.aByteArray81[this.anInt5182++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "(II)V")
	public final void method4553(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "(B)I")
	public final int method4554() {
		this.anInt5182 += 4;
		return (this.aByteArray81[this.anInt5182 - 2] & 0xFF) + ((this.aByteArray81[this.anInt5182 - 3] & 0xFF) << 24) + ((this.aByteArray81[this.anInt5182 + -4] & 0xFF) << 16) + ((this.aByteArray81[this.anInt5182 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "(II)V")
	public final void method4555(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4562(arg0 >>> 28 | 0x80);
					}
					this.method4562(arg0 >>> 21 | 0x80);
				}
				this.method4562(arg0 >>> 14 | 0x80);
			}
			this.method4562(arg0 >>> 7 | 0x80);
		}
		this.method4562(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "(B)I")
	public final int method4556() {
		this.anInt5182 += 2;
		return (this.aByteArray81[this.anInt5182 - 1] & 0xFF) + ((this.aByteArray81[this.anInt5182 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "(II)V")
	public final void method4557(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 + 128);
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "(Z)B")
	public final byte method4558() {
		return this.aByteArray81[this.anInt5182++];
	}

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "(B)B")
	public final byte method4559() {
		return (byte) (this.aByteArray81[this.anInt5182++] - 128);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IJ)V")
	public final void method4560(@OriginalArg(1) long arg0) {
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 56);
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 48);
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 40);
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 32);
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 24);
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 16);
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 8);
		this.aByteArray81[this.anInt5182++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)V")
	public final void method4561(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt5182++] = (byte) arg0;
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "(II)V")
	public final void method4562(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt5182++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method4563(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt5182;
		this.anInt5182 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4519(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt5182 = 0;
		this.method4562(local31.length);
		this.method4513(local31.length, local31);
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(BI)V")
	public final void method4564(@OriginalArg(1) int arg0) {
		this.aByteArray81[this.anInt5182++] = (byte) arg0;
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 8);
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 16);
		this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(JII)V")
	public final void method4565(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(27) int local27 = local6 * 8; local27 >= 0; local27 -= 8) {
			this.aByteArray81[this.anInt5182++] = (byte) (arg0 >> local27);
		}
	}

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "(II)V")
	public final void method4566(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt5182 - arg0 - 1] = (byte) arg0;
	}
}

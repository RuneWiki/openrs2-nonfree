import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!os", name = "K", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!os", name = "vb", descriptor = "I")
	public int anInt4872;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(I)V")
	public Class1_Sub17(@OriginalArg(0) int arg0) {
		this.aByteArray58 = Static261.method4699(arg0);
		this.anInt4872 = 0;
	}

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "([B)V")
	public Class1_Sub17(@OriginalArg(0) byte[] arg0) {
		this.anInt4872 = 0;
		this.aByteArray58 = arg0;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BI)V")
	public final void method4441(@OriginalArg(1) int arg0) {
		this.aByteArray58[this.anInt4872 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)I")
	public final int method4442() {
		return -this.aByteArray58[this.anInt4872++] & 0xFF;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(BI)I")
	public final int method4443(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = Static430.method8157(arg0, this.anInt4872, this.aByteArray58);
		this.method4489(local16);
		return local16;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)I")
	public final int method4444() {
		this.anInt4872 += 4;
		return (this.aByteArray58[this.anInt4872 - 2] & 0xFF) + ((this.aByteArray58[this.anInt4872 - 4] & 0xFF) << 16) + ((this.aByteArray58[this.anInt4872 + -3] & 0xFF) << 24) + ((this.aByteArray58[this.anInt4872 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IB)V")
	public final void method4445(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4451(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4473(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(II)V")
	public final void method4446(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt4872++] = (byte) arg0;
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)I")
	public final int method4447() {
		this.anInt4872 += 2;
		@Pc(31) int local31 = (this.aByteArray58[this.anInt4872 - 1] & 0xFF) + ((this.aByteArray58[this.anInt4872 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(IB)V")
	public final void method4448(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4451(arg0 >>> 28 | 0x80);
					}
					this.method4451(arg0 >>> 21 | 0x80);
				}
				this.method4451(arg0 >>> 14 | 0x80);
			}
			this.method4451(arg0 >>> 7 | 0x80);
		}
		this.method4451(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(I)I")
	public final int method4449() {
		return this.aByteArray58[this.anInt4872++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(BI)V")
	public final void method4450(@OriginalArg(1) int arg0) {
		this.aByteArray58[this.anInt4872++] = (byte) arg0;
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 16);
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(II)V")
	public final void method4451(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt4872++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(JI)V")
	public final void method4452(@OriginalArg(0) long arg0) {
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 56);
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 48);
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 40);
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 32);
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 24);
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 16);
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt4872++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III[B)V")
	public final void method4454(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0; local5++) {
			this.aByteArray58[this.anInt4872++] = arg1[local5];
		}
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(II)V")
	public final void method4455(@OriginalArg(1) int arg0) {
		this.aByteArray58[this.anInt4872++] = (byte) arg0;
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(I)Ljava/lang/String;")
	public final String method4456() {
		@Pc(14) byte local14 = this.aByteArray58[this.anInt4872++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(24) int local24 = this.anInt4872;
		while (this.aByteArray58[this.anInt4872++] != 0) {
		}
		@Pc(44) int local44 = this.anInt4872 - local24 - 1;
		return local44 == 0 ? "" : Static332.method5654(this.aByteArray58, local24, local44);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method4457(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt4872;
		this.anInt4872 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4505(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt4872 = 0;
		this.method4473(local31.length);
		this.method4454(local31.length, local31);
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(I)I")
	public final int method4458() {
		this.anInt4872 += 4;
		return ((this.aByteArray58[this.anInt4872 - 2] & 0xFF) << 16) + (((this.aByteArray58[this.anInt4872 - 1] & 0xFF) << 24) + ((this.aByteArray58[this.anInt4872 - 3] & 0xFF) << 8)) + (this.aByteArray58[this.anInt4872 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZI)V")
	public final void method4459(@OriginalArg(1) int arg0) {
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 + 128);
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(IB)V")
	public final void method4460(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 16);
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt4872++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(B)I")
	public final int method4461() {
		this.anInt4872 += 2;
		return ((this.aByteArray58[this.anInt4872 - 1] & 0xFF) << 8) + (this.aByteArray58[this.anInt4872 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(I)I")
	public final int method4462() {
		@Pc(16) byte local16 = this.aByteArray58[this.anInt4872++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local18 | local16 & 0x7F) << 7;
			local16 = this.aByteArray58[this.anInt4872++];
		}
		return local16 | local18;
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public final String method4463() {
		if (this.aByteArray58[this.anInt4872] == 0) {
			this.anInt4872++;
			return null;
		} else {
			return this.method4491();
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method4464(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.indexOf(0);
		if (local13 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local13 + " - cannot pjstr");
		}
		this.anInt4872 += Static517.method7910(this.aByteArray58, arg0.length(), arg0, this.anInt4872);
		this.aByteArray58[this.anInt4872++] = 0;
	}

	@OriginalMember(owner = "client!os", name = "h", descriptor = "(I)J")
	public final long method4465() {
		@Pc(18) long local18 = (long) this.method4481() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method4481() & 0xFFFFFFFFL;
		return local25 + (local18 << 32);
	}

	@OriginalMember(owner = "client!os", name = "e", descriptor = "(II)V")
	public final void method4466(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt4872++] = (byte) arg0;
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 16);
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!os", name = "i", descriptor = "(I)I")
	public final int method4467() {
		return 128 - this.aByteArray58[this.anInt4872++] & 0xFF;
	}

	@OriginalMember(owner = "client!os", name = "j", descriptor = "(I)B")
	public final byte method4468() {
		return (byte) -this.aByteArray58[this.anInt4872++];
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(BI)V")
	public final void method4469(@OriginalArg(1) int arg0) {
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 16);
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 24);
		this.aByteArray58[this.anInt4872++] = (byte) arg0;
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!os", name = "e", descriptor = "(B)I")
	public final int method4471() {
		this.anInt4872 += 4;
		return ((this.aByteArray58[this.anInt4872 - 4] & 0xFF) << 8) + ((this.aByteArray58[this.anInt4872 - 2] & 0xFF) << 24) + ((this.aByteArray58[this.anInt4872 - 1] & 0xFF) << 16) + (this.aByteArray58[this.anInt4872 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!os", name = "k", descriptor = "(I)I")
	public final int method4472() {
		this.anInt4872 += 2;
		return (this.aByteArray58[this.anInt4872 - 2] & 0xFF) + ((this.aByteArray58[this.anInt4872 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(II)V")
	public final void method4473(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt4872++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(II)V")
	public final void method4474(@OriginalArg(1) int arg0) {
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(III[B)V")
	public final void method4475(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(15) int local15 = arg0 - 1; local15 >= 0; local15--) {
			arg1[local15] = this.aByteArray58[this.anInt4872++];
		}
	}

	@OriginalMember(owner = "client!os", name = "h", descriptor = "(II)J")
	public final long method4476(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(27) int local27 = local2 * 8;
		@Pc(29) long local29 = 0L;
		while (local27 >= 0) {
			local29 |= ((long) this.aByteArray58[this.anInt4872++] & 0xFFL) << local27;
			local27 -= 8;
		}
		return local29;
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(Z)I")
	public final int method4477() {
		@Pc(16) int local16 = this.aByteArray58[this.anInt4872] & 0xFF;
		return local16 >= 128 ? this.method4494() - 49152 : this.method4487() - 64;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(ILjava/lang/String;)V")
	public final void method4478(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = Static524.method8000(arg0);
		this.aByteArray58[this.anInt4872++] = 0;
		this.method4448(local7);
		this.anInt4872 += Static356.method4470(arg0, this.aByteArray58, this.anInt4872);
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(B)I")
	public final int method4479() {
		this.anInt4872 += 2;
		@Pc(40) int local40 = ((this.aByteArray58[this.anInt4872 - 1] & 0xFF) << 8) + (this.aByteArray58[this.anInt4872 - 2] & 0xFF);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!os", name = "e", descriptor = "(Z)I")
	public final int method4480() {
		@Pc(16) int local16 = this.aByteArray58[this.anInt4872] & 0xFF;
		return local16 < 128 ? this.method4487() : this.method4494() - 32768;
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(Z)I")
	public final int method4481() {
		this.anInt4872 += 4;
		return ((this.aByteArray58[this.anInt4872 - 2] & 0xFF) << 8) + ((this.aByteArray58[this.anInt4872 - 4] & 0xFF) << 24) + ((this.aByteArray58[this.anInt4872 - 3] & 0xFF) << 16) + (this.aByteArray58[this.anInt4872 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!os", name = "l", descriptor = "(I)B")
	public final byte method4482() {
		return this.aByteArray58[this.anInt4872++];
	}

	@OriginalMember(owner = "client!os", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String method4483() {
		@Pc(14) byte local14 = this.aByteArray58[this.anInt4872++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(25) int local25 = this.method4462();
		if (this.aByteArray58.length < this.anInt4872 + local25) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(56) String local56 = Static267.method4736(this.anInt4872, this.aByteArray58, local25);
		this.anInt4872 += local25;
		return local56;
	}

	@OriginalMember(owner = "client!os", name = "i", descriptor = "(II)V")
	public final void method4484(@OriginalArg(1) int arg0) {
		this.aByteArray58[this.anInt4872++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!os", name = "n", descriptor = "(I)B")
	public final byte method4485() {
		return (byte) (this.aByteArray58[this.anInt4872++] - 128);
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(Z)I")
	public final int method4486() {
		this.anInt4872 += 3;
		return ((this.aByteArray58[this.anInt4872 - 3] & 0xFF) << 16) + ((this.aByteArray58[this.anInt4872 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt4872 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!os", name = "o", descriptor = "(I)I")
	public final int method4487() {
		return this.aByteArray58[this.anInt4872++] & 0xFF;
	}

	@OriginalMember(owner = "client!os", name = "j", descriptor = "(II)V")
	public final void method4488(@OriginalArg(1) int arg0) {
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt4872++] = (byte) arg0;
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 24);
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!os", name = "k", descriptor = "(II)V")
	public final void method4489(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 24);
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 16);
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt4872++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(JII)V")
	public final void method4490(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(19) int local19 = local2 * 8; local19 >= 0; local19 -= 8) {
			this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> local19);
		}
	}

	@OriginalMember(owner = "client!os", name = "h", descriptor = "(Z)Ljava/lang/String;")
	public final String method4491() {
		@Pc(6) int local6 = this.anInt4872;
		while (this.aByteArray58[this.anInt4872++] != 0) {
		}
		@Pc(33) int local33 = this.anInt4872 - local6 - 1;
		return local33 == 0 ? "" : Static332.method5654(this.aByteArray58, local6, local33);
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(ZI)V")
	public final void method4492(@OriginalArg(1) int arg0) {
		this.aByteArray58[this.anInt4872 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray58[this.anInt4872 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray58[this.anInt4872 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt4872 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!os", name = "i", descriptor = "(Z)I")
	public final int method4494() {
		this.anInt4872 += 2;
		return (this.aByteArray58[this.anInt4872 - 1] & 0xFF) + ((this.aByteArray58[this.anInt4872 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II[II)V")
	public final void method4495(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) int local8 = this.anInt4872;
		this.anInt4872 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			@Pc(33) int local33 = this.method4481();
			@Pc(37) int local37 = this.method4481();
			@Pc(39) int local39 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= (local33 >>> 5 ^ local33 << 4) + local33 ^ arg1[local39 >>> 11 & 0x22400003] + local39;
				local39 -= -1640531527;
				local33 -= local37 + (local37 >>> 5 ^ local37 << 4) ^ arg1[local39 & 0x3] + local39;
			}
			this.anInt4872 -= 8;
			this.method4489(local33);
			this.method4489(local37);
		}
		this.anInt4872 = local8;
	}

	@OriginalMember(owner = "client!os", name = "p", descriptor = "(I)I")
	public final int method4496() {
		this.anInt4872 += 2;
		@Pc(33) int local33 = ((this.aByteArray58[this.anInt4872 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt4872 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(B)I")
	public final int method4497() {
		@Pc(11) int local11 = Static430.method8157(0, this.anInt4872, this.aByteArray58);
		this.method4489(local11);
		return local11;
	}

	@OriginalMember(owner = "client!os", name = "q", descriptor = "(I)I")
	public final int method4498() {
		this.anInt4872 += 3;
		@Pc(49) int local49 = (this.aByteArray58[this.anInt4872 - 1] & 0xFF) + ((this.aByteArray58[this.anInt4872 - 2] & 0xFF) << 8) + ((this.aByteArray58[this.anInt4872 - 3] & 0xFF) << 16);
		if (local49 > 8388607) {
			local49 -= 16777216;
		}
		return local49;
	}

	@OriginalMember(owner = "client!os", name = "r", descriptor = "(I)I")
	public final int method4499() {
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = this.method4480();
		while (local18 == 32767) {
			local18 = this.method4480();
			local14 += 32767;
		}
		return local14 + local18;
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(ZI)V")
	public final void method4500(@OriginalArg(1) int arg0) {
		this.aByteArray58[this.anInt4872++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!os", name = "h", descriptor = "(B)B")
	public final byte method4501() {
		return (byte) (128 - this.aByteArray58[this.anInt4872++]);
	}

	@OriginalMember(owner = "client!os", name = "i", descriptor = "(B)I")
	public final int method4502() {
		this.anInt4872 += 2;
		return ((this.aByteArray58[this.anInt4872 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt4872 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!os", name = "s", descriptor = "(I)Z")
	public final boolean method4503() {
		this.anInt4872 -= 4;
		@Pc(19) int local19 = Static430.method8157(0, this.anInt4872, this.aByteArray58);
		@Pc(23) int local23 = this.method4481();
		return local19 == local23;
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(IB)V")
	public final void method4504(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt4872 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt4872 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([BBII)V")
	public final void method4505(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = this.aByteArray58[this.anInt4872++];
		}
	}

	@OriginalMember(owner = "client!os", name = "l", descriptor = "(II)V")
	public final void method4506(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt4872++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!os", name = "t", descriptor = "(I)I")
	public final int method4507() {
		this.anInt4872 += 3;
		return (this.aByteArray58[this.anInt4872 - 1] & 0xFF) + (((this.aByteArray58[this.anInt4872 - 2] & 0xFF) << 16) + ((this.aByteArray58[this.anInt4872 - 3] & 0xFF) << 8));
	}
}

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public class Class4_Sub11 extends Class4 {

	@OriginalMember(owner = "client!es", name = "y", descriptor = "I")
	public int anInt10466 = 0;

	@OriginalMember(owner = "client!es", name = "L", descriptor = "[B")
	public byte[] aByteArray107;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(I)V")
	public Class4_Sub11(@OriginalArg(0) int arg0) {
		this.aByteArray107 = Static297.method4197(arg0);
	}

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "([B)V")
	public Class4_Sub11(@OriginalArg(0) byte[] arg0) {
		this.aByteArray107 = arg0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V")
	public final void method8822(@OriginalArg(1) int arg0) {
		this.aByteArray107[this.anInt10466++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)I")
	public final int method8823() {
		@Pc(11) int local11 = this.aByteArray107[this.anInt10466] & 0xFF;
		return local11 < 128 ? this.method8865() : this.method8859() - 32768;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "([BIBI)V")
	public final void method8824(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = arg2; local7 < arg1 + arg2; local7++) {
			this.aByteArray107[this.anInt10466++] = arg0[local7];
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)I")
	public final int method8826() {
		this.anInt10466 += 4;
		return ((this.aByteArray107[this.anInt10466 - 1] & 0xFF) << 24) + (((this.aByteArray107[this.anInt10466 - 2] & 0xFF) << 16) + (this.aByteArray107[this.anInt10466 - 3] << 8 & 0xFF00)) + (this.aByteArray107[this.anInt10466 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(I)I")
	public final int method8827() {
		this.anInt10466 += 3;
		return ((this.aByteArray107[this.anInt10466 - 2] & 0xFF) << 8) + (this.aByteArray107[this.anInt10466 - 3] << 16 & 0xFF0000) + (this.aByteArray107[this.anInt10466 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(II)V")
	public final void method8828(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method8822(arg0 >>> 28 | 0x80);
					}
					this.method8822(arg0 >>> 21 | 0x80);
				}
				this.method8822(arg0 >>> 14 | 0x80);
			}
			this.method8822(arg0 >>> 7 | 0x80);
		}
		this.method8822(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I[I)V")
	public final void method8829(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.anInt10466 / 8;
		this.anInt10466 = 0;
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			@Pc(21) int local21 = this.method8850();
			@Pc(25) int local25 = this.method8850();
			@Pc(27) int local27 = -957401312;
			@Pc(31) int local31 = 32;
			while (local31-- > 0) {
				local25 -= (local21 << 4 ^ local21 >>> 5) + local21 ^ arg0[local27 >>> 11 & 0xACE00003] + local27;
				local27 -= -1640531527;
				local21 -= local27 + arg0[local27 & 0x3] ^ local25 + (local25 << 4 ^ local25 >>> 5);
			}
			this.anInt10466 -= 8;
			this.method8860(local21);
			this.method8860(local25);
		}
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(I)J")
	public final long method8830() {
		@Pc(15) long local15 = (long) this.method8850() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method8850() & 0xFFFFFFFFL;
		return local22 + (local15 << 32);
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(B)B")
	public final byte method8831() {
		return (byte) (128 - this.aByteArray107[this.anInt10466++]);
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(B)J")
	public final long method8832() {
		@Pc(10) long local10 = (long) this.method8865() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method8850() & 0xFFFFFFFFL;
		return (local10 << 32) + local17;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BII[B)V")
	public final void method8833(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (this.aByteArray107[this.anInt10466++] - 128);
		}
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(Z)I")
	public final int method8834() {
		this.anInt10466 += 2;
		@Pc(31) int local31 = (this.aByteArray107[this.anInt10466 - 1] & 0xFF) + ((this.aByteArray107[this.anInt10466 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(II)V")
	public final void method8835(@OriginalArg(1) int arg0) {
		this.aByteArray107[this.anInt10466 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(I)I")
	public final int method8836() {
		@Pc(16) byte local16 = this.aByteArray107[this.anInt10466++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local18 | local16 & 0x7F) << 7;
			local16 = this.aByteArray107[this.anInt10466++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!es", name = "g", descriptor = "(I)I")
	public final int method8837() {
		this.anInt10466 += 4;
		return (this.aByteArray107[this.anInt10466 - 3] & 0xFF) + ((this.aByteArray107[this.anInt10466 - 4] & 0xFF) << 8) + ((this.aByteArray107[this.anInt10466 + -2] & 0xFF) << 24) + ((this.aByteArray107[this.anInt10466 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(II)V")
	public final void method8838(@OriginalArg(1) int arg0) {
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 8);
		this.aByteArray107[this.anInt10466++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "([IIII)V")
	public final void method8839(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt10466;
		this.anInt10466 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			@Pc(33) int local33 = this.method8850();
			@Pc(37) int local37 = this.method8850();
			@Pc(39) int local39 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= local39 + arg0[local39 >>> 11 & 0x66A00003] ^ local33 + (local33 >>> 5 ^ local33 << 4);
				local39 -= -1640531527;
				local33 -= local37 + (local37 >>> 5 ^ local37 << 4) ^ arg0[local39 & 0x3] + local39;
			}
			this.anInt10466 -= 8;
			this.method8860(local33);
			this.method8860(local37);
		}
		this.anInt10466 = local8;
	}

	@OriginalMember(owner = "client!es", name = "e", descriptor = "(II)I")
	public final int method8840(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = Static633.method8385(this.anInt10466, arg0, this.aByteArray107);
		this.method8860(local19);
		return local19;
	}

	@OriginalMember(owner = "client!es", name = "h", descriptor = "(I)J")
	public final long method8841() {
		@Pc(15) long local15 = (long) this.method8874() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method8874() & 0xFFFFFFFFL;
		return (local22 << 32) + local15;
	}

	@OriginalMember(owner = "client!es", name = "i", descriptor = "(I)I")
	public final int method8842() {
		@Pc(17) int local17 = this.aByteArray107[this.anInt10466] & 0xFF;
		return local17 >= 128 ? this.method8859() - 49152 : this.method8865() + -64;
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(B)I")
	public final int method8843() {
		return this.aByteArray107[this.anInt10466++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!es", name = "e", descriptor = "(B)Ljava/lang/String;")
	public final String method8844() {
		@Pc(14) byte local14 = this.aByteArray107[this.anInt10466++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(32) int local32 = this.anInt10466;
		while (this.aByteArray107[this.anInt10466++] != 0) {
		}
		@Pc(54) int local54 = this.anInt10466 - local32 - 1;
		return local54 == 0 ? "" : Static407.method2208(this.aByteArray107, local32, local54);
	}

	@OriginalMember(owner = "client!es", name = "f", descriptor = "(II)V")
	public final void method8845(@OriginalArg(0) int arg0) {
		this.aByteArray107[this.anInt10466++] = (byte) arg0;
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 8);
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 16);
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!es", name = "j", descriptor = "(I)I")
	public final int method8846() {
		this.anInt10466 += 2;
		@Pc(33) int local33 = (this.aByteArray107[this.anInt10466 - 1] - 128 & 0xFF) + ((this.aByteArray107[this.anInt10466 - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BI)V")
	public final void method8847(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method8822(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method8838(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!es", name = "g", descriptor = "(II)V")
	public final void method8848(@OriginalArg(0) int arg0) {
		this.aByteArray107[this.anInt10466++] = (byte) arg0;
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(BI)V")
	public final void method8849(@OriginalArg(1) int arg0) {
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 8);
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!es", name = "f", descriptor = "(B)I")
	public final int method8850() {
		this.anInt10466 += 4;
		return ((this.aByteArray107[this.anInt10466 - 3] & 0xFF) << 16) + ((this.aByteArray107[this.anInt10466 - 4] & 0xFF) << 24) + ((this.aByteArray107[this.anInt10466 - 2] & 0xFF) << 8) + (this.aByteArray107[this.anInt10466 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!es", name = "k", descriptor = "(I)I")
	public final int method8851() {
		this.anInt10466 += 3;
		return (this.aByteArray107[this.anInt10466 - 3] & 0xFF) + ((this.aByteArray107[this.anInt10466 - 2] & 0xFF) << 8) + ((this.aByteArray107[this.anInt10466 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!es", name = "l", descriptor = "(I)Ljava/lang/String;")
	public final String method8852() {
		if (this.aByteArray107[this.anInt10466] == 0) {
			this.anInt10466++;
			return null;
		} else {
			return this.method8853();
		}
	}

	@OriginalMember(owner = "client!es", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String method8853() {
		@Pc(6) int local6 = this.anInt10466;
		while (this.aByteArray107[this.anInt10466++] != 0) {
		}
		@Pc(29) int local29 = this.anInt10466 - local6 - 1;
		return local29 == 0 ? "" : Static407.method2208(this.aByteArray107, local6, local29);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II[II)V")
	public final void method8854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(8) int local8 = this.anInt10466;
		this.anInt10466 = arg0;
		@Pc(18) int local18 = (arg1 - arg0) / 8;
		for (@Pc(24) int local24 = 0; local24 < local18; local24++) {
			@Pc(30) int local30 = this.method8850();
			@Pc(34) int local34 = this.method8850();
			@Pc(36) int local36 = 0;
			@Pc(40) int local40 = 32;
			while (local40-- > 0) {
				local30 += local36 + arg2[local36 & 0x3] ^ (local34 >>> 5 ^ local34 << 4) + local34;
				local36 += -1640531527;
				local34 += local30 + (local30 << 4 ^ local30 >>> 5) ^ arg2[local36 >>> 11 & 0x3] + local36;
			}
			this.anInt10466 -= 8;
			this.method8860(local30);
			this.method8860(local34);
		}
		this.anInt10466 = local8;
	}

	@OriginalMember(owner = "client!es", name = "g", descriptor = "(B)I")
	public final int method8855() {
		return -this.aByteArray107[this.anInt10466++] & 0xFF;
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(Z)I")
	public final int method8856() {
		this.anInt10466 += 3;
		@Pc(48) int local48 = ((this.aByteArray107[this.anInt10466 - 2] & 0xFF) << 8) + ((this.aByteArray107[this.anInt10466 - 3] & 0xFF) << 16) + (this.aByteArray107[this.anInt10466 - 1] & 0xFF);
		if (local48 > 8388607) {
			local48 -= 16777216;
		}
		return local48;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method8857(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt10466 += Static460.method6426(this.anInt10466, this.aByteArray107, arg0.length(), arg0);
		this.aByteArray107[this.anInt10466++] = 0;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(ILjava/lang/String;)V")
	public final void method8858(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray107[this.anInt10466++] = 0;
		this.anInt10466 += Static460.method6426(this.anInt10466, this.aByteArray107, arg0.length(), arg0);
		this.aByteArray107[this.anInt10466++] = 0;
	}

	@OriginalMember(owner = "client!es", name = "h", descriptor = "(B)I")
	public final int method8859() {
		this.anInt10466 += 2;
		return (this.aByteArray107[this.anInt10466 - 1] & 0xFF) + ((this.aByteArray107[this.anInt10466 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!es", name = "h", descriptor = "(II)V")
	public final void method8860(@OriginalArg(1) int arg0) {
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 24);
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 16);
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 8);
		this.aByteArray107[this.anInt10466++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!es", name = "n", descriptor = "(I)B")
	public final byte method8861() {
		return this.aByteArray107[this.anInt10466++];
	}

	@OriginalMember(owner = "client!es", name = "i", descriptor = "(B)I")
	public final int method8862() {
		return 128 - this.aByteArray107[this.anInt10466++] & 0xFF;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IB)V")
	public final void method8863(@OriginalArg(0) int arg0) {
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 8);
		this.aByteArray107[this.anInt10466++] = (byte) arg0;
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 24);
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(Z)V")
	public final void method8864() {
		if (this.aByteArray107 != null) {
			Static297.method4198(this.aByteArray107);
		}
		this.aByteArray107 = null;
	}

	@OriginalMember(owner = "client!es", name = "j", descriptor = "(B)I")
	public final int method8865() {
		return this.aByteArray107[this.anInt10466++] & 0xFF;
	}

	@OriginalMember(owner = "client!es", name = "i", descriptor = "(II)V")
	public final void method8866(@OriginalArg(1) int arg0) {
		this.aByteArray107[this.anInt10466++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(IB)V")
	public final void method8867(@OriginalArg(0) int arg0) {
		this.aByteArray107[this.anInt10466 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray107[this.anInt10466 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray107[this.anInt10466 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray107[this.anInt10466 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I[BII)V")
	public final void method8870(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) int local11 = arg1; local11 < arg2 + arg1; local11++) {
			arg0[local11] = this.aByteArray107[this.anInt10466++];
		}
	}

	@OriginalMember(owner = "client!es", name = "l", descriptor = "(B)I")
	public final int method8871() {
		this.anInt10466 += 2;
		return ((this.aByteArray107[this.anInt10466 - 1] & 0xFF) << 8) + (this.aByteArray107[this.anInt10466 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(BI)V")
	public final void method8872(@OriginalArg(1) int arg0) {
		this.aByteArray107[this.anInt10466++] = (byte) arg0;
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 8);
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 16);
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IJ)V")
	public final void method8873(@OriginalArg(1) long arg0) {
		this.aByteArray107[this.anInt10466++] = (byte) (int) (arg0 >> 56);
		this.aByteArray107[this.anInt10466++] = (byte) (int) (arg0 >> 48);
		this.aByteArray107[this.anInt10466++] = (byte) (int) (arg0 >> 40);
		this.aByteArray107[this.anInt10466++] = (byte) (int) (arg0 >> 32);
		this.aByteArray107[this.anInt10466++] = (byte) (int) (arg0 >> 24);
		this.aByteArray107[this.anInt10466++] = (byte) (int) (arg0 >> 16);
		this.aByteArray107[this.anInt10466++] = (byte) (int) (arg0 >> 8);
		this.aByteArray107[this.anInt10466++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!es", name = "o", descriptor = "(I)I")
	public final int method8874() {
		this.anInt10466 += 4;
		return ((this.aByteArray107[this.anInt10466 - 3] & 0xFF) << 8) + (((this.aByteArray107[this.anInt10466 - 1] & 0xFF) << 24) + ((this.aByteArray107[this.anInt10466 - 2] & 0xFF) << 16) + (this.aByteArray107[this.anInt10466 + -4] & 0xFF));
	}

	@OriginalMember(owner = "client!es", name = "p", descriptor = "(I)B")
	public final byte method8875() {
		return (byte) -this.aByteArray107[this.anInt10466++];
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(IB)V")
	public final void method8876(@OriginalArg(0) int arg0) {
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 + 128);
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(BI)V")
	public final void method8877(@OriginalArg(1) int arg0) {
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method8878(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt10466;
		this.anInt10466 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method8870(local12, 0, local6);
		@Pc(25) BigInteger local25 = new BigInteger(local12);
		@Pc(34) BigInteger local34 = local25.modPow(arg1, arg0);
		@Pc(37) byte[] local37 = local34.toByteArray();
		this.anInt10466 = 0;
		this.method8838(local37.length);
		this.method8824(local37, local37.length, 0);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IJI)V")
	public final void method8879(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(22) int local22 = local2 * 8; local22 >= 0; local22 -= 8) {
			this.aByteArray107[this.anInt10466++] = (byte) (int) (arg1 >> local22);
		}
	}

	@OriginalMember(owner = "client!es", name = "q", descriptor = "(I)Z")
	public final boolean method8880() {
		this.anInt10466 -= 4;
		@Pc(17) int local17 = Static633.method8385(this.anInt10466, 0, this.aByteArray107);
		@Pc(21) int local21 = this.method8850();
		return local21 == local17;
	}

	@OriginalMember(owner = "client!es", name = "s", descriptor = "(I)B")
	public final byte method8882() {
		return (byte) (this.aByteArray107[this.anInt10466++] - 128);
	}

	@OriginalMember(owner = "client!es", name = "t", descriptor = "(I)I")
	public final int method8883() {
		this.anInt10466 += 2;
		return (this.aByteArray107[this.anInt10466 - 2] - 128 & 0xFF) + ((this.aByteArray107[this.anInt10466 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!es", name = "u", descriptor = "(I)I")
	public final int method8884() {
		this.anInt10466 += 4;
		return (this.aByteArray107[this.anInt10466 - 2] & 0xFF) + ((this.aByteArray107[this.anInt10466 - 1] & 0xFF) << 8) + ((this.aByteArray107[this.anInt10466 + -3] & 0xFF) << 24) + ((this.aByteArray107[this.anInt10466 + -4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!es", name = "j", descriptor = "(II)V")
	public final void method8885(@OriginalArg(1) int arg0) {
		this.aByteArray107[this.anInt10466 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray107[this.anInt10466 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!es", name = "v", descriptor = "(I)I")
	public final int method8886() {
		@Pc(7) int local7 = 0;
		@Pc(19) int local19;
		for (local19 = this.method8823(); local19 == 32767; local19 = this.method8823()) {
			local7 += 32767;
		}
		return local7 + local19;
	}

	@OriginalMember(owner = "client!es", name = "w", descriptor = "(I)I")
	public final int method8887() {
		this.anInt10466 += 2;
		@Pc(36) int local36 = ((this.aByteArray107[this.anInt10466 - 1] & 0xFF) << 8) + (this.aByteArray107[this.anInt10466 - 2] & 0xFF);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ZI)J")
	public final long method8888(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = arg0 - 1;
		if (local11 < 0 || local11 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(27) int local27 = local11 * 8;
		@Pc(29) long local29 = 0L;
		while (local27 >= 0) {
			local29 |= ((long) this.aByteArray107[this.anInt10466++] & 0xFFL) << local27;
			local27 -= 8;
		}
		return local29;
	}

	@OriginalMember(owner = "client!es", name = "k", descriptor = "(II)V")
	public final void method8889(@OriginalArg(1) int arg0) {
		this.aByteArray107[this.anInt10466++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!es", name = "m", descriptor = "(B)I")
	public final int method8890() {
		this.anInt10466 += 2;
		return ((this.aByteArray107[this.anInt10466 - 2] & 0xFF) << 8) + (this.aByteArray107[this.anInt10466 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!es", name = "l", descriptor = "(II)V")
	public final void method8891(@OriginalArg(1) int arg0) {
		this.aByteArray107[this.anInt10466++] = (byte) arg0;
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!es", name = "e", descriptor = "(BI)V")
	public final void method8892(@OriginalArg(1) int arg0) {
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 16);
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 8);
		this.aByteArray107[this.anInt10466++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)V")
	public final void method8893(@OriginalArg(0) int arg0) {
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 16);
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 24);
		this.aByteArray107[this.anInt10466++] = (byte) arg0;
		this.aByteArray107[this.anInt10466++] = (byte) (arg0 >> 8);
	}
}

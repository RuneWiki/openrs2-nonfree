import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public class Class2_Sub20 extends Class2 {

	@OriginalMember(owner = "client!et", name = "qb", descriptor = "I")
	public int anInt9723;

	@OriginalMember(owner = "client!et", name = "fb", descriptor = "[B")
	public byte[] aByteArray111;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(I)V")
	public Class2_Sub20(@OriginalArg(0) int arg0) {
		this.anInt9723 = 0;
		this.aByteArray111 = Static246.method3453(arg0);
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "([B)V")
	public Class2_Sub20(@OriginalArg(0) byte[] arg0) {
		this.aByteArray111 = arg0;
		this.anInt9723 = 0;
	}

	@OriginalMember(owner = "client!et", name = "p", descriptor = "(I)I")
	public final int method8528() {
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = this.method8592(255);
		while (local19 == 32767) {
			local19 = this.method8592(255);
			local13 += 32767;
		}
		return local13 + local19;
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(B)I")
	public final int method8529(@OriginalArg(0) byte arg0) {
		this.anInt9723 += 4;
		if (arg0 < 33) {
			this.anInt9723 = -51;
		}
		return (this.aByteArray111[this.anInt9723 - 2] & 0xFF) + (((this.aByteArray111[this.anInt9723 - 1] & 0xFF) << 8) + ((this.aByteArray111[this.anInt9723 - 3] & 0xFF) << 24) + ((this.aByteArray111[this.anInt9723 + -4] & 0xFF) << 16));
	}

	@OriginalMember(owner = "client!et", name = "f", descriptor = "(I)I")
	public final int method8530() {
		this.anInt9723 += 2;
		return (this.aByteArray111[this.anInt9723 - 1] - 128 & 0xFF) + ((this.aByteArray111[this.anInt9723 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!et", name = "m", descriptor = "(B)J")
	public final long method8531() {
		@Pc(10) long local10 = (long) this.method8581(-17416) & 0xFFFFFFFFL;
		@Pc(26) long local26 = (long) this.method8555(-9372) & 0xFFFFFFFFL;
		return local26 + (local10 << 32);
	}

	@OriginalMember(owner = "client!et", name = "k", descriptor = "(II)V")
	public final void method8532(@OriginalArg(0) int arg0) {
		this.aByteArray111[this.anInt9723++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!et", name = "g", descriptor = "(II)V")
	public final void method8533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray111[this.anInt9723++] = (byte) arg1;
		if (arg0 == 3774) {
			this.aByteArray111[this.anInt9723++] = (byte) (arg1 >> 8);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I[I)V")
	public final void method8534(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(10) int local10 = this.anInt9723 / 8;
		this.anInt9723 = 0;
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			@Pc(23) int local23 = this.method8555(-9372);
			@Pc(27) int local27 = this.method8555(-9372);
			@Pc(29) int local29 = -957401312;
			@Pc(33) int local33 = 32;
			while (local33-- > 0) {
				local27 -= local23 + (local23 << 4 ^ local23 >>> 5) ^ arg1[local29 >>> 11 & 0x15000003] + local29;
				local29 -= -1640531527;
				local23 -= local29 + arg1[local29 & 0x3] ^ (local27 >>> 5 ^ local27 << 4) - -local27;
			}
			this.anInt9723 -= 8;
			this.method8577(local23);
			this.method8577(local27);
		}
		if (arg0 >= -32) {
			this.method8533(55, 106);
		}
	}

	@OriginalMember(owner = "client!et", name = "m", descriptor = "(I)V")
	public final void method8535() {
		if (this.aByteArray111 != null) {
			Static246.method3451(this.aByteArray111);
		}
		this.aByteArray111 = null;
	}

	@OriginalMember(owner = "client!et", name = "h", descriptor = "(I)B")
	public final byte method8536() {
		return this.aByteArray111[this.anInt9723++];
	}

	@OriginalMember(owner = "client!et", name = "i", descriptor = "(I)Ljava/lang/String;")
	public final String method8537() {
		@Pc(24) byte local24 = this.aByteArray111[this.anInt9723++];
		if (local24 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(37) int local37 = this.anInt9723;
		while (this.aByteArray111[this.anInt9723++] != 0) {
		}
		@Pc(59) int local59 = this.anInt9723 - local37 - 1;
		return local59 == 0 ? "" : Static155.method2227(local37, local59, this.aByteArray111);
	}

	@OriginalMember(owner = "client!et", name = "l", descriptor = "(I)B")
	public final byte method8538() {
		return (byte) (this.aByteArray111[this.anInt9723++] - 128);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method8539(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray111[this.anInt9723++] = 0;
		this.anInt9723 += Static400.method5899(this.anInt9723, arg0.length(), this.aByteArray111, arg0);
		this.aByteArray111[this.anInt9723++] = 0;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(Z)I")
	public final int method8540() {
		this.anInt9723 += 4;
		return ((this.aByteArray111[this.anInt9723 - 4] & 0xFF) << 8) + ((this.aByteArray111[this.anInt9723 - 1] & 0xFF) << 16) + ((this.aByteArray111[this.anInt9723 + -2] & 0xFF) << 24) + (this.aByteArray111[this.anInt9723 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method8541(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt9723 += Static400.method5899(this.anInt9723, arg0.length(), this.aByteArray111, arg0);
		this.aByteArray111[this.anInt9723++] = 0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(JBI)V")
	public final void method8542(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 - 1;
		if (local11 < 0 || local11 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(29) int local29 = local11 * 8; local29 >= 0; local29 -= 8) {
			this.aByteArray111[this.anInt9723++] = (byte) (int) (arg0 >> local29);
		}
	}

	@OriginalMember(owner = "client!et", name = "s", descriptor = "(I)I")
	public final int method8543() {
		this.anInt9723 += 4;
		return (this.aByteArray111[this.anInt9723 - 4] & 0xFF) + ((this.aByteArray111[this.anInt9723 - 3] & 0xFF) << 8) + ((this.aByteArray111[this.anInt9723 - 2] & 0xFF) << 16) + ((this.aByteArray111[this.anInt9723 + -1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIZ[I)V")
	public final void method8544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(8) int local8 = this.anInt9723;
		this.anInt9723 = arg0;
		@Pc(22) int local22 = (arg1 - arg0) / 8;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(32) int local32 = this.method8555(-9372);
			@Pc(36) int local36 = this.method8555(-9372);
			@Pc(38) int local38 = 0;
			@Pc(42) int local42 = 32;
			while (local42-- > 0) {
				local32 += local36 + (local36 >>> 5 ^ local36 << 4) ^ local38 + arg2[local38 & 0x3];
				local38 += -1640531527;
				local36 += local38 + arg2[local38 >>> 11 & 0x42800003] ^ local32 + (local32 << 4 ^ local32 >>> 5);
			}
			this.anInt9723 -= 8;
			this.method8577(local32);
			this.method8577(local36);
		}
		this.anInt9723 = local8;
	}

	@OriginalMember(owner = "client!et", name = "g", descriptor = "(B)I")
	public final int method8545() {
		@Pc(16) byte local16 = this.aByteArray111[this.anInt9723++];
		@Pc(25) int local25 = 0;
		while (local16 < 0) {
			local25 = (local25 | local16 & 0x7F) << 7;
			local16 = this.aByteArray111[this.anInt9723++];
		}
		return local16 | local25;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method8546(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt9723;
		this.anInt9723 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method8573(local6, 0, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(33) BigInteger local33 = local23.modPow(arg1, arg0);
		@Pc(36) byte[] local36 = local33.toByteArray();
		this.anInt9723 = 0;
		this.method8551(local36.length);
		this.method8565(local36, 0, local36.length);
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(BI)V")
	public final void method8547(@OriginalArg(1) int arg0) {
		this.aByteArray111[this.anInt9723 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(BI)V")
	public final void method8548(@OriginalArg(1) int arg0) {
		this.aByteArray111[this.anInt9723++] = (byte) arg0;
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 8);
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 16);
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!et", name = "l", descriptor = "(II)V")
	public final void method8549(@OriginalArg(1) int arg0) {
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 16);
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 24);
		this.aByteArray111[this.anInt9723++] = (byte) arg0;
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BI)V")
	public final void method8550(@OriginalArg(1) int arg0) {
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(BI)V")
	public final void method8551(@OriginalArg(1) int arg0) {
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 8);
		this.aByteArray111[this.anInt9723++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!et", name = "j", descriptor = "(I)I")
	public final int method8552() {
		if (this.aByteArray111[this.anInt9723] < 0) {
			return this.method8555(-9372) & Integer.MAX_VALUE;
		} else {
			@Pc(22) int local22 = this.method8575();
			return local22 == 32767 ? -1 : local22;
		}
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(B)Ljava/lang/String;")
	public final String method8553() {
		@Pc(8) int local8 = this.anInt9723;
		while (this.aByteArray111[this.anInt9723++] != 0) {
		}
		@Pc(30) int local30 = this.anInt9723 - local8 - 1;
		return local30 == 0 ? "" : Static155.method2227(local8, local30, this.aByteArray111);
	}

	@OriginalMember(owner = "client!et", name = "v", descriptor = "(I)I")
	public final int method8554(@OriginalArg(0) int arg0) {
		if (arg0 == 31493) {
			this.anInt9723 += 2;
			return (this.aByteArray111[this.anInt9723 - 2] - 128 & 0xFF) + ((this.aByteArray111[this.anInt9723 - 1] & 0xFF) << 8);
		} else {
			return -74;
		}
	}

	@OriginalMember(owner = "client!et", name = "o", descriptor = "(I)I")
	public final int method8555(@OriginalArg(0) int arg0) {
		this.anInt9723 += 4;
		return arg0 == -9372 ? ((this.aByteArray111[this.anInt9723 - 2] & 0xFF) << 8) + (this.aByteArray111[this.anInt9723 - 3] << 16 & 0xFF0000) + ((this.aByteArray111[-4 + this.anInt9723] & 0xFF) << 24) + (this.aByteArray111[this.anInt9723 + -1] & 0xFF) : -40;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IZ)V")
	public final void method8556(@OriginalArg(0) int arg0) {
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 8);
		this.aByteArray111[this.anInt9723++] = (byte) arg0;
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 24);
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!et", name = "i", descriptor = "(B)I")
	public final int method8557() {
		return this.aByteArray111[this.anInt9723++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!et", name = "t", descriptor = "(I)I")
	public final int method8558() {
		this.anInt9723 += 2;
		@Pc(40) int local40 = (this.aByteArray111[this.anInt9723 - 2] - 128 & 0xFF) + ((this.aByteArray111[this.anInt9723 - 1] & 0xFF) << 8);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!et", name = "l", descriptor = "(B)I")
	public final int method8559() {
		this.anInt9723 += 2;
		return (this.aByteArray111[this.anInt9723 - 2] & 0xFF) + ((this.aByteArray111[this.anInt9723 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(B)I")
	public final int method8560() {
		@Pc(17) int local17 = this.aByteArray111[this.anInt9723] & 0xFF;
		return local17 < 128 ? this.method8581(-17416) - 64 : this.method8575() + -49152;
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(Z)I")
	public final int method8561() {
		return this.aByteArray111[this.anInt9723] < 0 ? this.method8555(-9372) & Integer.MAX_VALUE : this.method8575();
	}

	@OriginalMember(owner = "client!et", name = "g", descriptor = "(I)Z")
	public final boolean method8563() {
		this.anInt9723 -= 4;
		@Pc(23) int local23 = Static525.method7394(this.anInt9723, 0, this.aByteArray111);
		@Pc(27) int local27 = this.method8555(-9372);
		return local23 == local27;
	}

	@OriginalMember(owner = "client!et", name = "i", descriptor = "(II)V")
	public final void method8564(@OriginalArg(0) int arg0) {
		this.aByteArray111[this.anInt9723 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray111[this.anInt9723 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "([BZII)V")
	public final void method8565(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = arg1; local7 < arg1 + arg2; local7++) {
			this.aByteArray111[this.anInt9723++] = arg0[local7];
		}
	}

	@OriginalMember(owner = "client!et", name = "f", descriptor = "(B)B")
	public final byte method8566() {
		return (byte) -this.aByteArray111[this.anInt9723++];
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(IB)V")
	public final void method8567(@OriginalArg(0) int arg0) {
		this.aByteArray111[this.anInt9723++] = (byte) arg0;
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 8);
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 16);
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(Z)I")
	public final int method8568() {
		this.anInt9723 += 2;
		@Pc(39) int local39 = ((this.aByteArray111[this.anInt9723 - 2] & 0xFF) << 8) + (this.aByteArray111[this.anInt9723 - 1] - 128 & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!et", name = "f", descriptor = "(Z)Ljava/lang/String;")
	public final String method8569() {
		if (this.aByteArray111[this.anInt9723] == 0) {
			this.anInt9723++;
			return null;
		} else {
			return this.method8553();
		}
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(II)V")
	public final void method8570(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method8584(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method8551(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!et", name = "f", descriptor = "(II)V")
	public final void method8571(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method8584(arg0 >>> 28 | 0x80);
					}
					this.method8584(arg0 >>> 21 | 0x80);
				}
				this.method8584(arg0 >>> 14 | 0x80);
			}
			this.method8584(arg0 >>> 7 | 0x80);
		}
		this.method8584(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(II)V")
	public final void method8572(@OriginalArg(0) int arg0) {
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 8);
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(III[B)V")
	public final void method8573(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		for (@Pc(12) int local12 = arg1; local12 < arg0 + arg1; local12++) {
			arg2[local12] = this.aByteArray111[this.anInt9723++];
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I[III)V")
	public final void method8574(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt9723;
		this.anInt9723 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(28) int local28 = this.method8555(-9372);
			@Pc(32) int local32 = this.method8555(-9372);
			@Pc(34) int local34 = -957401312;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local32 -= (local28 >>> 5 ^ local28 << 4) + local28 ^ local34 + arg0[local34 >>> 11 & 0x3];
				local34 -= -1640531527;
				local28 -= arg0[local34 & 0x3] + local34 ^ (local32 >>> 5 ^ local32 << 4) - -local32;
			}
			this.anInt9723 -= 8;
			this.method8577(local28);
			this.method8577(local32);
		}
		this.anInt9723 = local8;
	}

	@OriginalMember(owner = "client!et", name = "h", descriptor = "(B)I")
	public final int method8575() {
		this.anInt9723 += 2;
		return (this.aByteArray111[this.anInt9723 - 1] & 0xFF) + ((this.aByteArray111[this.anInt9723 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)V")
	public final void method8576(@OriginalArg(0) int arg0) {
		this.aByteArray111[this.anInt9723 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray111[this.anInt9723 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray111[this.anInt9723 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray111[this.anInt9723 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!et", name = "j", descriptor = "(II)V")
	public final void method8577(@OriginalArg(0) int arg0) {
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 24);
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 16);
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 8);
		this.aByteArray111[this.anInt9723++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!et", name = "j", descriptor = "(B)I")
	public final int method8578() {
		this.anInt9723 += 4;
		return (this.aByteArray111[this.anInt9723 - 4] & 0xFF) + ((this.aByteArray111[this.anInt9723 - 2] & 0xFF) << 16) + ((this.aByteArray111[this.anInt9723 - 1] & 0xFF) << 24) + ((this.aByteArray111[this.anInt9723 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IJ)V")
	public final void method8580(@OriginalArg(1) long arg0) {
		this.aByteArray111[this.anInt9723++] = (byte) (int) (arg0 >> 56);
		this.aByteArray111[this.anInt9723++] = (byte) (int) (arg0 >> 48);
		this.aByteArray111[this.anInt9723++] = (byte) (int) (arg0 >> 40);
		this.aByteArray111[this.anInt9723++] = (byte) (int) (arg0 >> 32);
		this.aByteArray111[this.anInt9723++] = (byte) (int) (arg0 >> 24);
		this.aByteArray111[this.anInt9723++] = (byte) (int) (arg0 >> 16);
		this.aByteArray111[this.anInt9723++] = (byte) (int) (arg0 >> 8);
		this.aByteArray111[this.anInt9723++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!et", name = "n", descriptor = "(I)I")
	public final int method8581(@OriginalArg(0) int arg0) {
		if (arg0 != -17416) {
			this.method8529((byte) 1);
		}
		return this.aByteArray111[this.anInt9723++] & 0xFF;
	}

	@OriginalMember(owner = "client!et", name = "h", descriptor = "(II)V")
	public final void method8582(@OriginalArg(1) int arg0) {
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 + 128);
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!et", name = "u", descriptor = "(I)I")
	public final int method8583() {
		this.anInt9723 += 3;
		return ((this.aByteArray111[this.anInt9723 - 3] & 0xFF) << 16) + ((this.aByteArray111[this.anInt9723 - 2] & 0xFF) << 8) + (this.aByteArray111[this.anInt9723 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(II)V")
	public final void method8584(@OriginalArg(1) int arg0) {
		this.aByteArray111[this.anInt9723++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(II)V")
	public final void method8585(@OriginalArg(1) int arg0) {
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 16);
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 8);
		this.aByteArray111[this.anInt9723++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(IZ)I")
	public final int method8586(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = Static525.method7394(this.anInt9723, arg0, this.aByteArray111);
		this.method8577(local17);
		return local17;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(I)I")
	public final int method8588() {
		return -this.aByteArray111[this.anInt9723++] & 0xFF;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IB)V")
	public final void method8589(@OriginalArg(0) int arg0) {
		this.aByteArray111[this.anInt9723++] = (byte) arg0;
		this.aByteArray111[this.anInt9723++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!et", name = "k", descriptor = "(B)J")
	public final long method8590() {
		@Pc(18) long local18 = (long) this.method8555(-9372) & 0xFFFFFFFFL;
		@Pc(27) long local27 = (long) this.method8555(-9372) & 0xFFFFFFFFL;
		return local27 + (local18 << 32);
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(Z)J")
	public final long method8591() {
		@Pc(10) long local10 = (long) this.method8543() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method8543() & 0xFFFFFFFFL;
		return (local17 << 32) + local10;
	}

	@OriginalMember(owner = "client!et", name = "r", descriptor = "(I)I")
	public final int method8592(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = arg0 & this.aByteArray111[this.anInt9723];
		return local11 < 128 ? this.method8581(-17416) : this.method8575() - 32768;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)I")
	public final int method8593() {
		return 128 - this.aByteArray111[this.anInt9723++] & 0xFF;
	}

	@OriginalMember(owner = "client!et", name = "n", descriptor = "(B)B")
	public final byte method8594() {
		return (byte) (128 - this.aByteArray111[this.anInt9723++]);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)I")
	public final int method8595() {
		this.anInt9723 += 3;
		@Pc(49) int local49 = (this.aByteArray111[this.anInt9723 - 1] & 0xFF) + ((this.aByteArray111[this.anInt9723 - 2] & 0xFF) << 8) + ((this.aByteArray111[this.anInt9723 - 3] & 0xFF) << 16);
		if (local49 > 8388607) {
			local49 -= 16777216;
		}
		return local49;
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(IB)J")
	public final long method8596(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(33) int local33 = local6 * 8;
		@Pc(35) long local35 = 0L;
		while (local33 >= 0) {
			local35 |= ((long) this.aByteArray111[this.anInt9723++] & 0xFFL) << local33;
			local33 -= 8;
		}
		return local35;
	}

	@OriginalMember(owner = "client!et", name = "m", descriptor = "(II)V")
	public final void method8597(@OriginalArg(1) int arg0) {
		this.aByteArray111[this.anInt9723++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!et", name = "q", descriptor = "(I)I")
	public final int method8598() {
		this.anInt9723 += 2;
		@Pc(31) int local31 = ((this.aByteArray111[this.anInt9723 - 2] & 0xFF) << 8) + (this.aByteArray111[this.anInt9723 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}
}

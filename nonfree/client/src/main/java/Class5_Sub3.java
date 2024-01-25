import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!co", name = "ub", descriptor = "[B")
	public byte[] aByteArray66;

	@OriginalMember(owner = "client!co", name = "H", descriptor = "I")
	public int anInt4960;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(I)V")
	public Class5_Sub3(@OriginalArg(0) int arg0) {
		this.aByteArray66 = Static340.method5290(arg0);
		this.anInt4960 = 0;
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "([B)V")
	public Class5_Sub3(@OriginalArg(0) byte[] arg0) {
		this.aByteArray66 = arg0;
		this.anInt4960 = 0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V")
	public final void method4170(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt4960 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)I")
	public final int method4171() {
		return -this.aByteArray66[this.anInt4960++] & 0xFF;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)J")
	public final long method4172() {
		@Pc(10) long local10 = (long) this.method4230() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method4230() & 0xFFFFFFFFL;
		return local17 + (local10 << 32);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II[BI)V")
	public final void method4173(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (this.aByteArray66[this.anInt4960++] - 128);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IZ)V")
	public final void method4174(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4192(arg0 >>> 28 | 0x80);
					}
					this.method4192(arg0 >>> 21 | 0x80);
				}
				this.method4192(arg0 >>> 14 | 0x80);
			}
			this.method4192(arg0 >>> 7 | 0x80);
		}
		this.method4192(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(II)V")
	public final void method4175(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt4960 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray66[this.anInt4960 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt4960 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt4960 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([BBII)V")
	public final void method4177(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = this.aByteArray66[this.anInt4960++];
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)Z")
	public final boolean method4178() {
		this.anInt4960 -= 4;
		@Pc(22) int local22 = Static518.method7133(this.anInt4960, this.aByteArray66, 0);
		@Pc(26) int local26 = this.method4230();
		return local22 == local26;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(II)V")
	public final void method4179(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt4960 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt4960 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BI)V")
	public final void method4180(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZI)V")
	public final void method4181(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt4960++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(B)I")
	public final int method4182() {
		this.anInt4960 += 3;
		return (this.aByteArray66[this.anInt4960 - 1] & 0xFF) + (((this.aByteArray66[this.anInt4960 - 3] & 0xFF) << 16) + ((this.aByteArray66[this.anInt4960 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(I)I")
	public final int method4183() {
		return 128 - this.aByteArray66[this.anInt4960++] & 0xFF;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(IZ)V")
	public final void method4184(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 24);
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt4960++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(II)V")
	public final void method4185(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt4960++] = (byte) arg0;
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 24);
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(II)V")
	public final void method4186(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4192(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4181(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!co", name = "f", descriptor = "(II)V")
	public final void method4187(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 24);
		this.aByteArray66[this.anInt4960++] = (byte) arg0;
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(B)B")
	public final byte method4188() {
		return (byte) -this.aByteArray66[this.anInt4960++];
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(Z)B")
	public final byte method4189() {
		return (byte) (this.aByteArray66[this.anInt4960++] - 128);
	}

	@OriginalMember(owner = "client!co", name = "f", descriptor = "(I)I")
	public final int method4190() {
		@Pc(16) int local16 = this.aByteArray66[this.anInt4960] & 0xFF;
		return local16 >= 128 ? this.method4227() - 49152 : this.method4220() + -64;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(BI)V")
	public final void method4191(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt4960++] = (byte) arg0;
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!co", name = "g", descriptor = "(II)V")
	public final void method4192(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt4960++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!co", name = "g", descriptor = "(I)Ljava/lang/String;")
	public final String method4193() {
		if (this.aByteArray66[this.anInt4960] == 0) {
			this.anInt4960++;
			return null;
		} else {
			return this.method4234();
		}
	}

	@OriginalMember(owner = "client!co", name = "h", descriptor = "(I)I")
	public final int method4194() {
		this.anInt4960 += 4;
		return (this.aByteArray66[this.anInt4960 - 2] & 0xFF) + ((this.aByteArray66[this.anInt4960 - 1] & 0xFF) << 8) + ((this.aByteArray66[this.anInt4960 + -4] & 0xFF) << 16) + ((this.aByteArray66[this.anInt4960 + -3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(BI)V")
	public final void method4195(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt4960++] = (byte) arg0;
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!co", name = "i", descriptor = "(I)B")
	public final byte method4196() {
		return this.aByteArray66[this.anInt4960++];
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IB)V")
	public final void method4197(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt4960++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!co", name = "j", descriptor = "(I)I")
	public final int method4198() {
		this.anInt4960 += 4;
		return ((this.aByteArray66[this.anInt4960 - 3] & 0xFF) << 8) + ((this.aByteArray66[this.anInt4960 - 2] & 0xFF) << 16) + ((this.aByteArray66[-1 + this.anInt4960] & 0xFF) << 24) + (this.aByteArray66[this.anInt4960 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!co", name = "k", descriptor = "(I)I")
	public final int method4199() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method4231();
		while (local11 == 32767) {
			local11 = this.method4231();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!co", name = "h", descriptor = "(II)V")
	public final void method4200(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!co", name = "l", descriptor = "(I)Ljava/lang/String;")
	public final String method4201() {
		@Pc(19) byte local19 = this.aByteArray66[this.anInt4960++];
		if (local19 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(35) int local35 = this.method4223();
		if (this.aByteArray66.length < this.anInt4960 + local35) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(56) String local56 = Static545.method7423(local35, this.aByteArray66, this.anInt4960);
		this.anInt4960 += local35;
		return local56;
	}

	@OriginalMember(owner = "client!co", name = "m", descriptor = "(I)I")
	public final int method4202() {
		this.anInt4960 += 2;
		return ((this.aByteArray66[this.anInt4960 - 1] & 0xFF) << 8) + (this.aByteArray66[this.anInt4960 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(JZ)V")
	public final void method4203(@OriginalArg(0) long arg0) {
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 56);
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 48);
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 40);
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 32);
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 24);
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt4960++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(IZ)V")
	public final void method4204(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt4960++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(B)I")
	public final int method4205() {
		this.anInt4960 += 2;
		return ((this.aByteArray66[this.anInt4960 - 2] & 0xFF) << 8) + (this.aByteArray66[this.anInt4960 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(BI)J")
	public final long method4206(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(21) int local21 = local2 * 8;
		@Pc(28) long local28 = 0L;
		while (local21 >= 0) {
			local28 |= ((long) this.aByteArray66[this.anInt4960++] & 0xFFL) << local21;
			local21 -= 8;
		}
		return local28;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIB[B)V")
	public final void method4207(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aByteArray66[this.anInt4960++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method4208(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt4960 += Static242.method4121(this.aByteArray66, arg0, arg0.length(), this.anInt4960);
		this.aByteArray66[this.anInt4960++] = 0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method4209(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt4960;
		this.anInt4960 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4177(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(35) BigInteger local35 = local23.modPow(arg1, arg0);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt4960 = 0;
		this.method4181(local38.length);
		this.method4207(local38.length, local38);
	}

	@OriginalMember(owner = "client!co", name = "n", descriptor = "(I)I")
	public final int method4210() {
		this.anInt4960 += 2;
		@Pc(37) int local37 = ((this.aByteArray66[this.anInt4960 - 1] & 0xFF) << 8) + (this.aByteArray66[this.anInt4960 - 2] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(B)Ljava/lang/String;")
	public final String method4211() {
		@Pc(14) byte local14 = this.aByteArray66[this.anInt4960++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(36) int local36 = this.anInt4960;
		while (this.aByteArray66[this.anInt4960++] != 0) {
		}
		@Pc(58) int local58 = this.anInt4960 - local36 - 1;
		return local58 == 0 ? "" : Static152.method2790(local58, local36, this.aByteArray66);
	}

	@OriginalMember(owner = "client!co", name = "o", descriptor = "(I)I")
	public final int method4212() {
		this.anInt4960 += 2;
		@Pc(38) int local38 = (this.aByteArray66[this.anInt4960 - 1] & 0xFF) + ((this.aByteArray66[this.anInt4960 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method4214(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = Static172.method7330(arg0);
		this.aByteArray66[this.anInt4960++] = 0;
		this.method4174(local7);
		this.anInt4960 += Static165.method2928(this.aByteArray66, arg0, this.anInt4960);
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(Z)B")
	public final byte method4215() {
		return (byte) (128 - this.aByteArray66[this.anInt4960++]);
	}

	@OriginalMember(owner = "client!co", name = "i", descriptor = "(II)I")
	public final int method4216(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = Static518.method7133(this.anInt4960, this.aByteArray66, arg0);
		this.method4184(local18);
		return local18;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BIJ)V")
	public final void method4217(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(21) int local21 = local2 * 8; local21 >= 0; local21 -= 8) {
			this.aByteArray66[this.anInt4960++] = (byte) (arg1 >> local21);
		}
	}

	@OriginalMember(owner = "client!co", name = "q", descriptor = "(I)I")
	public final int method4218() {
		this.anInt4960 += 3;
		@Pc(48) int local48 = (this.aByteArray66[this.anInt4960 - 1] & 0xFF) + ((this.aByteArray66[this.anInt4960 - 2] & 0xFF) << 8) + ((this.aByteArray66[this.anInt4960 - 3] & 0xFF) << 16);
		if (local48 > 8388607) {
			local48 -= 16777216;
		}
		return local48;
	}

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(BI)V")
	public final void method4219(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt4960++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!co", name = "r", descriptor = "(I)I")
	public final int method4220() {
		return this.aByteArray66[this.anInt4960++] & 0xFF;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(ZI)V")
	public final void method4221(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt4960++] = (byte) arg0;
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!co", name = "f", descriptor = "(B)I")
	public final int method4222() {
		this.anInt4960 += 4;
		return ((this.aByteArray66[this.anInt4960 - 1] & 0xFF) << 16) + ((this.aByteArray66[this.anInt4960 - 2] & 0xFF) << 24) + ((this.aByteArray66[this.anInt4960 + -4] & 0xFF) << 8) + (this.aByteArray66[this.anInt4960 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!co", name = "s", descriptor = "(I)I")
	public final int method4223() {
		@Pc(16) byte local16 = this.aByteArray66[this.anInt4960++];
		@Pc(25) int local25 = 0;
		while (local16 < 0) {
			local25 = (local25 | local16 & 0x7F) << 7;
			local16 = this.aByteArray66[this.anInt4960++];
		}
		return local25 | local16;
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(IZ)V")
	public final void method4224(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt4960++] = (byte) arg0;
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!co", name = "t", descriptor = "(I)I")
	public final int method4226() {
		return this.aByteArray66[this.anInt4960++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!co", name = "u", descriptor = "(I)I")
	public final int method4227() {
		this.anInt4960 += 2;
		return (this.aByteArray66[this.anInt4960 - 1] & 0xFF) + ((this.aByteArray66[this.anInt4960 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!co", name = "v", descriptor = "(I)I")
	public final int method4228() {
		@Pc(11) int local11 = Static518.method7133(this.anInt4960, this.aByteArray66, 0);
		this.method4184(local11);
		return local11;
	}

	@OriginalMember(owner = "client!co", name = "j", descriptor = "(II)V")
	public final void method4229(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 + 128);
		this.aByteArray66[this.anInt4960++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!co", name = "w", descriptor = "(I)I")
	public final int method4230() {
		this.anInt4960 += 4;
		return (this.aByteArray66[this.anInt4960 - 1] & 0xFF) + ((this.aByteArray66[this.anInt4960 - 4] & 0xFF) << 24) + ((this.aByteArray66[this.anInt4960 + -3] & 0xFF) << 16) + ((this.aByteArray66[this.anInt4960 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!co", name = "g", descriptor = "(B)I")
	public final int method4231() {
		@Pc(19) int local19 = this.aByteArray66[this.anInt4960] & 0xFF;
		return local19 < 128 ? this.method4220() : this.method4227() - 32768;
	}

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(Z)I")
	public final int method4232() {
		this.anInt4960 += 2;
		return ((this.aByteArray66[this.anInt4960 - 1] & 0xFF) << 8) + (this.aByteArray66[this.anInt4960 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([IIII)V")
	public final void method4233(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt4960;
		this.anInt4960 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method4230();
			@Pc(30) int local30 = this.method4230();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= local26 + (local26 << 4 ^ local26 >>> 5) ^ arg0[local32 >>> 11 & 0x3] + local32;
				local32 -= -1640531527;
				local26 -= local30 + (local30 << 4 ^ local30 >>> 5) ^ arg0[local32 & 0x3] + local32;
			}
			this.anInt4960 -= 8;
			this.method4184(local26);
			this.method4184(local30);
		}
		this.anInt4960 = local8;
	}

	@OriginalMember(owner = "client!co", name = "f", descriptor = "(Z)Ljava/lang/String;")
	public final String method4234() {
		@Pc(6) int local6 = this.anInt4960;
		while (this.aByteArray66[this.anInt4960++] != 0) {
		}
		@Pc(28) int local28 = this.anInt4960 - local6 - 1;
		return local28 == 0 ? "" : Static152.method2790(local28, local6, this.aByteArray66);
	}
}

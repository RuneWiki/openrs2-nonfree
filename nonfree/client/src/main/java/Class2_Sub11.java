import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!cea", name = "wb", descriptor = "I")
	public int anInt10066;

	@OriginalMember(owner = "client!cea", name = "F", descriptor = "[B")
	public byte[] aByteArray128;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(I)V")
	public Class2_Sub11(@OriginalArg(0) int arg0) {
		this.anInt10066 = 0;
		this.aByteArray128 = Static235.method4443(arg0);
	}

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "([B)V")
	public Class2_Sub11(@OriginalArg(0) byte[] arg0) {
		this.aByteArray128 = arg0;
		this.anInt10066 = 0;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(B)I")
	public final int method8325() {
		return -this.aByteArray128[this.anInt10066++] & 0xFF;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)I")
	public final int method8326() {
		this.anInt10066 += 2;
		return (this.aByteArray128[this.anInt10066 - 1] & 0xFF) + ((this.aByteArray128[this.anInt10066 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(B)J")
	public final long method8328() {
		@Pc(15) long local15 = (long) this.method8355() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method8355() & 0xFFFFFFFFL;
		return (local22 << 32) + local15;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method8329(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.indexOf(0);
		if (local13 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local13 + " - cannot pjstr");
		}
		this.anInt10066 += Static150.method7140(this.aByteArray128, arg0.length(), arg0, this.anInt10066);
		this.aByteArray128[this.anInt10066++] = 0;
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)I")
	public final int method8330() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		for (local11 = this.method8378(); local11 == 32767; local11 = this.method8378()) {
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "(II)V")
	public final void method8331(@OriginalArg(1) int arg0) {
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 8);
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IB)V")
	public final void method8332(@OriginalArg(0) int arg0) {
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 8);
		this.aByteArray128[this.anInt10066++] = (byte) arg0;
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 24);
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BI)V")
	public final void method8333(@OriginalArg(1) int arg0) {
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 8);
		this.aByteArray128[this.anInt10066++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cea", name = "d", descriptor = "(II)V")
	public final void method8334(@OriginalArg(1) int arg0) {
		this.aByteArray128[this.anInt10066 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray128[this.anInt10066 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray128[this.anInt10066 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray128[this.anInt10066 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "(II)V")
	public final void method8335(@OriginalArg(1) int arg0) {
		this.aByteArray128[this.anInt10066 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cea", name = "f", descriptor = "(II)V")
	public final void method8336(@OriginalArg(1) int arg0) {
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 16);
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 8);
		this.aByteArray128[this.anInt10066++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cea", name = "d", descriptor = "(I)B")
	public final byte method8337() {
		return (byte) (this.aByteArray128[this.anInt10066++] - 128);
	}

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "(B)I")
	public final int method8338() {
		return 128 - this.aByteArray128[this.anInt10066++] & 0xFF;
	}

	@OriginalMember(owner = "client!cea", name = "f", descriptor = "(B)I")
	public final int method8339() {
		this.anInt10066 += 4;
		return ((this.aByteArray128[this.anInt10066 - 1] & 0xFF) << 16) + (this.aByteArray128[this.anInt10066 - 2] << 24 & 0xFF000000) + ((this.aByteArray128[this.anInt10066 + -4] & 0xFF) << 8) + (this.aByteArray128[this.anInt10066 - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IZ)I")
	public final int method8340(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = Static432.method6884(this.anInt10066, this.aByteArray128, arg0);
		this.method8387(local17);
		return local17;
	}

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "(I)B")
	public final byte method8341() {
		return (byte) (128 - this.aByteArray128[this.anInt10066++]);
	}

	@OriginalMember(owner = "client!cea", name = "f", descriptor = "(I)I")
	public final int method8342() {
		this.anInt10066 += 4;
		return ((this.aByteArray128[this.anInt10066 - 1] & 0xFF) << 8) + ((this.aByteArray128[this.anInt10066 - 3] & 0xFF) << 24) + ((this.aByteArray128[this.anInt10066 - 4] & 0xFF) << 16) + (this.aByteArray128[this.anInt10066 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "([BIIB)V")
	public final void method8343(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = arg1 - 1; local11 >= 0; local11--) {
			arg0[local11] = this.aByteArray128[this.anInt10066++];
		}
	}

	@OriginalMember(owner = "client!cea", name = "g", descriptor = "(II)V")
	public final void method8344(@OriginalArg(1) int arg0) {
		this.aByteArray128[this.anInt10066++] = (byte) arg0;
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 8);
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 16);
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!cea", name = "h", descriptor = "(II)V")
	public final void method8345(@OriginalArg(1) int arg0) {
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 + 128);
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IZ[II)V")
	public final void method8346(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt10066;
		this.anInt10066 = arg0;
		@Pc(18) int local18 = (arg2 - arg0) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method8381();
			@Pc(30) int local30 = this.method8381();
			@Pc(32) int local32 = 0;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local26 += local32 + arg1[local32 & 0x3] ^ (local30 >>> 5 ^ local30 << 4) - -local30;
				local32 += -1640531527;
				local30 += local32 + arg1[local32 >>> 11 & 0x3] ^ local26 + (local26 >>> 5 ^ local26 << 4);
			}
			this.anInt10066 -= 8;
			this.method8387(local26);
			this.method8387(local30);
		}
		this.anInt10066 = local8;
	}

	@OriginalMember(owner = "client!cea", name = "g", descriptor = "(I)I")
	public final int method8347() {
		this.anInt10066 += 3;
		return ((this.aByteArray128[this.anInt10066 - 2] & 0xFF) << 8) + (((this.aByteArray128[this.anInt10066 - 3] & 0xFF) << 16) + (this.aByteArray128[this.anInt10066 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!cea", name = "h", descriptor = "(I)Z")
	public final boolean method8348() {
		this.anInt10066 -= 4;
		@Pc(24) int local24 = Static432.method6884(this.anInt10066, this.aByteArray128, 0);
		@Pc(28) int local28 = this.method8381();
		return local24 == local28;
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(IB)V")
	public final void method8349(@OriginalArg(0) int arg0) {
		this.aByteArray128[this.anInt10066++] = (byte) arg0;
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!cea", name = "j", descriptor = "(I)I")
	public final int method8351() {
		this.anInt10066 += 2;
		return ((this.aByteArray128[this.anInt10066 - 2] & 0xFF) << 8) + (this.aByteArray128[this.anInt10066 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!cea", name = "i", descriptor = "(II)V")
	public final void method8352(@OriginalArg(0) int arg0) {
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 16);
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 24);
		this.aByteArray128[this.anInt10066++] = (byte) arg0;
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IJB)V")
	public final void method8353(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(32) int local32 = local6 * 8; local32 >= 0; local32 -= 8) {
			this.aByteArray128[this.anInt10066++] = (byte) (arg1 >> local32);
		}
	}

	@OriginalMember(owner = "client!cea", name = "k", descriptor = "(I)I")
	public final int method8354() {
		this.anInt10066 += 2;
		return (this.aByteArray128[this.anInt10066 - 2] - 128 & 0xFF) + ((this.aByteArray128[this.anInt10066 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!cea", name = "l", descriptor = "(I)I")
	public final int method8355() {
		this.anInt10066 += 4;
		return ((this.aByteArray128[this.anInt10066 - 3] & 0xFF) << 8) + (this.aByteArray128[this.anInt10066 - 1] << 24 & 0xFF000000) + ((this.aByteArray128[this.anInt10066 + -2] & 0xFF) << 16) + (this.aByteArray128[this.anInt10066 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!cea", name = "g", descriptor = "(B)V")
	public final void method8356() {
		if (this.aByteArray128 != null) {
			Static235.method4441(this.aByteArray128);
		}
		this.aByteArray128 = null;
	}

	@OriginalMember(owner = "client!cea", name = "m", descriptor = "(I)B")
	public final byte method8357() {
		return (byte) -this.aByteArray128[this.anInt10066++];
	}

	@OriginalMember(owner = "client!cea", name = "h", descriptor = "(B)I")
	public final int method8358() {
		@Pc(11) int local11 = this.aByteArray128[this.anInt10066] & 0xFF;
		return local11 < 128 ? this.method8383() - 64 : this.method8326() - 49152;
	}

	@OriginalMember(owner = "client!cea", name = "n", descriptor = "(I)I")
	public final int method8359() {
		this.anInt10066 += 3;
		return (this.aByteArray128[this.anInt10066 - 3] & 0xFF) + ((this.aByteArray128[this.anInt10066 - 2] & 0xFF) << 8) + ((this.aByteArray128[this.anInt10066 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!cea", name = "i", descriptor = "(B)I")
	public final int method8360() {
		this.anInt10066 += 4;
		return (this.aByteArray128[this.anInt10066 - 4] & 0xFF) + ((this.aByteArray128[this.anInt10066 - 3] & 0xFF) << 8) + ((this.aByteArray128[this.anInt10066 - 1] & 0xFF) << 24) + ((this.aByteArray128[this.anInt10066 - 2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!cea", name = "o", descriptor = "(I)J")
	public final long method8361() {
		@Pc(15) long local15 = (long) this.method8381() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method8381() & 0xFFFFFFFFL;
		return local22 + (local15 << 32);
	}

	@OriginalMember(owner = "client!cea", name = "j", descriptor = "(B)I")
	public final int method8362() {
		@Pc(14) byte local14 = this.aByteArray128[this.anInt10066++];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local14 & 0x7F | local16) << 7;
			local14 = this.aByteArray128[this.anInt10066++];
		}
		return local16 | local14;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(I[III)V")
	public final void method8363(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt10066;
		this.anInt10066 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method8381();
			@Pc(30) int local30 = this.method8381();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= (local26 << 4 ^ local26 >>> 5) + local26 ^ local32 - -arg0[local32 >>> 11 & 0x4D000003];
				local32 -= -1640531527;
				local26 -= local32 + arg0[local32 & 0x3] ^ (local30 << 4 ^ local30 >>> 5) - -local30;
			}
			this.anInt10066 -= 8;
			this.method8387(local26);
			this.method8387(local30);
		}
		this.anInt10066 = local8;
	}

	@OriginalMember(owner = "client!cea", name = "j", descriptor = "(II)J")
	public final long method8364(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(26) int local26 = local2 * 8;
		@Pc(28) long local28 = 0L;
		while (local26 >= 0) {
			local28 |= ((long) this.aByteArray128[this.anInt10066++] & 0xFFL) << local26;
			local26 -= 8;
		}
		return local28;
	}

	@OriginalMember(owner = "client!cea", name = "k", descriptor = "(B)I")
	public final int method8365() {
		this.anInt10066 += 3;
		@Pc(48) int local48 = (this.aByteArray128[this.anInt10066 - 1] & 0xFF) + ((this.aByteArray128[this.anInt10066 - 3] & 0xFF) << 16) + ((this.aByteArray128[this.anInt10066 + -2] & 0xFF) << 8);
		if (local48 > 8388607) {
			local48 -= 16777216;
		}
		return local48;
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(BI)V")
	public final void method8366(@OriginalArg(1) int arg0) {
		this.aByteArray128[this.anInt10066++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!cea", name = "p", descriptor = "(I)Ljava/lang/String;")
	public final String method8367() {
		@Pc(14) byte local14 = this.aByteArray128[this.anInt10066++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(24) int local24 = this.anInt10066;
		while (this.aByteArray128[this.anInt10066++] != 0) {
		}
		@Pc(46) int local46 = this.anInt10066 - local24 - 1;
		return local46 == 0 ? "" : Static299.method5335(this.aByteArray128, local46, local24);
	}

	@OriginalMember(owner = "client!cea", name = "q", descriptor = "(I)I")
	public final int method8368() {
		this.anInt10066 += 2;
		@Pc(40) int local40 = (this.aByteArray128[this.anInt10066 - 1] & 0xFF) + ((this.aByteArray128[this.anInt10066 - 2] & 0xFF) << 8);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Z)I")
	public final int method8369() {
		this.anInt10066 += 2;
		return ((this.aByteArray128[this.anInt10066 - 1] & 0xFF) << 8) + (this.aByteArray128[this.anInt10066 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "(BI)V")
	public final void method8370(@OriginalArg(1) int arg0) {
		this.aByteArray128[this.anInt10066++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!cea", name = "l", descriptor = "(B)I")
	public final int method8371() {
		this.anInt10066 += 2;
		@Pc(33) int local33 = (this.aByteArray128[this.anInt10066 - 1] - 128 & 0xFF) + ((this.aByteArray128[this.anInt10066 - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!cea", name = "m", descriptor = "(B)Ljava/lang/String;")
	public final String method8373() {
		@Pc(14) int local14 = this.anInt10066;
		while (this.aByteArray128[this.anInt10066++] != 0) {
		}
		@Pc(36) int local36 = this.anInt10066 - local14 - 1;
		return local36 == 0 ? "" : Static299.method5335(this.aByteArray128, local36, local14);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZI)V")
	public final void method8374(@OriginalArg(1) int arg0) {
		this.aByteArray128[this.anInt10066++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(II[BI)V")
	public final void method8376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		for (@Pc(3) int local3 = arg1; local3 < arg1 + arg0; local3++) {
			this.aByteArray128[this.anInt10066++] = arg2[local3];
		}
	}

	@OriginalMember(owner = "client!cea", name = "l", descriptor = "(II)V")
	public final void method8377(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method8374(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method8333(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cea", name = "s", descriptor = "(I)I")
	public final int method8378() {
		@Pc(16) int local16 = this.aByteArray128[this.anInt10066] & 0xFF;
		return local16 < 128 ? this.method8383() : this.method8326() - 32768;
	}

	@OriginalMember(owner = "client!cea", name = "m", descriptor = "(II)V")
	public final void method8379(@OriginalArg(1) int arg0) {
		this.aByteArray128[this.anInt10066 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray128[this.anInt10066 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cea", name = "t", descriptor = "(I)Ljava/lang/String;")
	public final String method8380() {
		if (this.aByteArray128[this.anInt10066] == 0) {
			this.anInt10066++;
			return null;
		} else {
			return this.method8373();
		}
	}

	@OriginalMember(owner = "client!cea", name = "n", descriptor = "(B)I")
	public final int method8381() {
		this.anInt10066 += 4;
		return (this.aByteArray128[this.anInt10066 - 1] & 0xFF) + ((this.aByteArray128[this.anInt10066 - 4] & 0xFF) << 24) + ((this.aByteArray128[this.anInt10066 + -3] & 0xFF) << 16) + ((this.aByteArray128[this.anInt10066 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method8382(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = arg0.indexOf(0);
		if (local15 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local15 + " - cannot pjstr2");
		}
		this.aByteArray128[this.anInt10066++] = 0;
		this.anInt10066 += Static150.method7140(this.aByteArray128, arg0.length(), arg0, this.anInt10066);
		this.aByteArray128[this.anInt10066++] = 0;
	}

	@OriginalMember(owner = "client!cea", name = "u", descriptor = "(I)I")
	public final int method8383() {
		return this.aByteArray128[this.anInt10066++] & 0xFF;
	}

	@OriginalMember(owner = "client!cea", name = "v", descriptor = "(I)B")
	public final byte method8384() {
		return this.aByteArray128[this.anInt10066++];
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(III[B)V")
	public final void method8385(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		for (@Pc(7) int local7 = arg0; local7 < arg1 + arg0; local7++) {
			arg2[local7] = this.aByteArray128[this.anInt10066++];
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method8386(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt10066;
		this.anInt10066 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method8385(0, local6, local12);
		@Pc(28) BigInteger local28 = new BigInteger(local12);
		@Pc(33) BigInteger local33 = local28.modPow(arg1, arg0);
		@Pc(36) byte[] local36 = local33.toByteArray();
		this.anInt10066 = 0;
		this.method8333(local36.length);
		this.method8376(local36.length, 0, local36);
	}

	@OriginalMember(owner = "client!cea", name = "d", descriptor = "(BI)V")
	public final void method8387(@OriginalArg(1) int arg0) {
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 24);
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 16);
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 8);
		this.aByteArray128[this.anInt10066++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(JB)V")
	public final void method8388(@OriginalArg(0) long arg0) {
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 56);
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 48);
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 40);
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 32);
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 24);
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 16);
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 8);
		this.aByteArray128[this.anInt10066++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cea", name = "o", descriptor = "(B)I")
	public final int method8389() {
		return this.aByteArray128[this.anInt10066++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!cea", name = "n", descriptor = "(II)V")
	public final void method8390(@OriginalArg(1) int arg0) {
		this.aByteArray128[this.anInt10066++] = (byte) arg0;
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 8);
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 16);
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "(BI)V")
	public final void method8391(@OriginalArg(1) int arg0) {
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!cea", name = "o", descriptor = "(II)V")
	public final void method8392(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method8374(arg0 >>> 28 | 0x80);
					}
					this.method8374(arg0 >>> 21 | 0x80);
				}
				this.method8374(arg0 >>> 14 | 0x80);
			}
			this.method8374(arg0 >>> 7 | 0x80);
		}
		this.method8374(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!cea", name = "p", descriptor = "(II)V")
	public final void method8393(@OriginalArg(1) int arg0) {
		this.aByteArray128[this.anInt10066++] = (byte) arg0;
		this.aByteArray128[this.anInt10066++] = (byte) (arg0 >> 8);
	}
}

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!ra", name = "eb", descriptor = "I")
	public int anInt340;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(I)V")
	public Class2_Sub3(@OriginalArg(0) int arg0) {
		this.aByteArray2 = Static104.method1812(arg0);
		this.anInt340 = 0;
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "([B)V")
	public Class2_Sub3(@OriginalArg(0) byte[] arg0) {
		this.aByteArray2 = arg0;
		this.anInt340 = 0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
	public final void method218(@OriginalArg(0) int arg0) {
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 16);
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 24);
		this.aByteArray2[this.anInt340++] = (byte) arg0;
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)I")
	public final int method219() {
		return -this.aByteArray2[this.anInt340++] & 0xFF;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)I")
	public final int method220() {
		return 128 - this.aByteArray2[this.anInt340++] & 0xFF;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)B")
	public final byte method221() {
		return this.aByteArray2[this.anInt340++];
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)V")
	public final void method223(@OriginalArg(0) int arg0) {
		this.aByteArray2[this.anInt340 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray2[this.anInt340 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray2[this.anInt340 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray2[this.anInt340 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)B")
	public final byte method224() {
		return (byte) (this.aByteArray2[this.anInt340++] - 128);
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)V")
	public final void method225(@OriginalArg(1) int arg0) {
		this.aByteArray2[this.anInt340++] = (byte) arg0;
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[IZI)V")
	public final void method227(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(12) int local12 = this.anInt340;
		this.anInt340 = 5;
		@Pc(22) int local22 = (arg0 - 5) / 8;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(30) int local30 = this.method248();
			@Pc(34) int local34 = this.method248();
			@Pc(36) int local36 = -957401312;
			@Pc(40) int local40 = 32;
			while (local40-- > 0) {
				local34 -= local30 + (local30 >>> 5 ^ local30 << 4) ^ arg1[local36 >>> 11 & 0xF2800003] + local36;
				local36 -= -1640531527;
				local30 -= local36 + arg1[local36 & 0x3] ^ local34 + (local34 << 4 ^ local34 >>> 5);
			}
			this.anInt340 -= 8;
			this.method246(local30);
			this.method246(local34);
		}
		this.anInt340 = local12;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZJ)V")
	public final void method228(@OriginalArg(1) long arg0) {
		this.method218((int) (arg0 >> 32));
		this.method218((int) arg0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLclient!qe;)V")
	public final void method229(@OriginalArg(1) Class83 arg0) {
		this.anInt340 += arg0.method2406(arg0.method2428(), this.aByteArray2, this.anInt340);
		this.aByteArray2[this.anInt340++] = 0;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(Z)I")
	public final int method230() {
		@Pc(16) int local16 = this.method232();
		@Pc(18) int local18 = 0;
		while (local16 == 32767) {
			local18 += 32767;
			local16 = this.method232();
		}
		return local18 + local16;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(II)V")
	public final void method231(@OriginalArg(1) int arg0) {
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 16);
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 8);
		this.aByteArray2[this.anInt340++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(B)I")
	public final int method232() {
		@Pc(12) int local12 = this.aByteArray2[this.anInt340] & 0xFF;
		return local12 < 128 ? this.method260() : this.method269() - 32768;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)V")
	public final void method233(@OriginalArg(1) int arg0) {
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 8);
		this.aByteArray2[this.anInt340++] = (byte) arg0;
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 24);
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[BII)V")
	public final void method234(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (this.aByteArray2[this.anInt340++] - 128);
		}
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)I")
	public final int method235() {
		@Pc(12) byte local12 = this.aByteArray2[this.anInt340++];
		@Pc(25) int local25 = 0;
		while (local12 < 0) {
			local25 = (local25 | local12 & 0x7F) << 7;
			local12 = this.aByteArray2[this.anInt340++];
		}
		return local25 | local12;
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)Lclient!qe;")
	public final Class83 method236() {
		if (this.aByteArray2[this.anInt340] == 0) {
			this.anInt340++;
			return null;
		} else {
			return this.method259();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method237(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt340;
		this.anInt340 = 0;
		@Pc(12) byte[] local12 = new byte[local2];
		this.method271(local2, local12);
		@Pc(27) BigInteger local27 = new BigInteger(local12);
		@Pc(32) BigInteger local32 = local27.modPow(arg0, arg1);
		@Pc(35) byte[] local35 = local32.toByteArray();
		this.anInt340 = 0;
		this.method247(local35.length);
		this.method265(local35, local35.length);
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(BI)V")
	public final void method238(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method247(arg0 >>> 28 | 0x80);
					}
					this.method247(arg0 >>> 21 | 0x80);
				}
				this.method247(arg0 >>> 14 | 0x80);
			}
			this.method247(arg0 >>> 7 | 0x80);
		}
		this.method247(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(BI)V")
	public final void method239(@OriginalArg(1) int arg0) {
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 8);
		this.aByteArray2[this.anInt340++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)I")
	public final int method240() {
		return this.aByteArray2[this.anInt340++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(Z)I")
	public final int method241() {
		@Pc(7) int local7 = this.aByteArray2[this.anInt340] & 0xFF;
		return local7 < 128 ? this.method260() - 64 : this.method269() + -49152;
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(B)I")
	public final int method242() {
		this.anInt340 += 2;
		@Pc(36) int local36 = (this.aByteArray2[this.anInt340 - 1] & 0xFF) + ((this.aByteArray2[this.anInt340 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)J")
	public final long method243() {
		@Pc(19) long local19 = (long) this.method248() & 0xFFFFFFFFL;
		@Pc(26) long local26 = (long) this.method248() & 0xFFFFFFFFL;
		return (local19 << 32) + local26;
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(B)I")
	public final int method244() {
		this.anInt340 += 4;
		return (this.aByteArray2[this.anInt340 - 2] & 0xFF) + ((this.aByteArray2[this.anInt340 - 4] & 0xFF) << 16) + ((this.aByteArray2[this.anInt340 - 3] & 0xFF) << 24) + ((this.aByteArray2[this.anInt340 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)I")
	public final int method245(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static208.method3144(this.aByteArray2, this.anInt340, arg0);
		this.method246(local11);
		return local11;
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(BI)V")
	public final void method246(@OriginalArg(1) int arg0) {
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 24);
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 16);
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 8);
		this.aByteArray2[this.anInt340++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(BI)V")
	public final void method247(@OriginalArg(1) int arg0) {
		this.aByteArray2[this.anInt340++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)I")
	public final int method248() {
		this.anInt340 += 4;
		return (this.aByteArray2[this.anInt340 - 1] & 0xFF) + ((this.aByteArray2[this.anInt340 - 4] & 0xFF) << 24) + ((this.aByteArray2[this.anInt340 + -3] & 0xFF) << 16) + ((this.aByteArray2[this.anInt340 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(JB)V")
	public final void method249(@OriginalArg(0) long arg0) {
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 56);
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 48);
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 40);
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 32);
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 24);
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 16);
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 8);
		this.aByteArray2[this.anInt340++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(BI)V")
	public final void method250(@OriginalArg(1) int arg0) {
		this.aByteArray2[this.anInt340++] = (byte) arg0;
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 8);
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 16);
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "(B)B")
	public final byte method251() {
		return (byte) (128 - this.aByteArray2[this.anInt340++]);
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(II)V")
	public final void method253(@OriginalArg(1) int arg0) {
		this.aByteArray2[this.anInt340++] = (byte) (arg0 + 128);
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "(I)I")
	public final int method254() {
		this.anInt340 += 2;
		return (this.aByteArray2[this.anInt340 - 2] - 128 & 0xFF) + ((this.aByteArray2[this.anInt340 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(II)V")
	public final void method255(@OriginalArg(1) int arg0) {
		this.aByteArray2[this.anInt340 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IJI)V")
	public final void method256(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(28) int local28 = local2 * 8; local28 >= 0; local28 -= 8) {
			this.aByteArray2[this.anInt340++] = (byte) (arg1 >> local28);
		}
	}

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "(B)I")
	public final int method257() {
		this.anInt340 += 4;
		return ((this.aByteArray2[this.anInt340 - 1] & 0xFF) << 16) + ((this.aByteArray2[this.anInt340 - 2] & 0xFF) << 24) + ((this.aByteArray2[this.anInt340 - 4] & 0xFF) << 8) + (this.aByteArray2[this.anInt340 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "(I)I")
	public final int method258() {
		this.anInt340 += 2;
		@Pc(38) int local38 = ((this.aByteArray2[this.anInt340 - 2] & 0xFF) << 8) + (this.aByteArray2[this.anInt340 - 1] - 128 & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "(I)Lclient!qe;")
	public final Class83 method259() {
		@Pc(13) int local13 = this.anInt340;
		while (this.aByteArray2[this.anInt340++] != 0) {
		}
		return Static16.method1831(this.anInt340 - local13 - 1, this.aByteArray2, local13);
	}

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "(I)I")
	public final int method260() {
		return this.aByteArray2[this.anInt340++] & 0xFF;
	}

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "(I)I")
	public final int method261() {
		this.anInt340 += 3;
		return (this.aByteArray2[this.anInt340 - 1] & 0xFF) + ((this.aByteArray2[this.anInt340 - 2] & 0xFF) << 8) + ((this.aByteArray2[this.anInt340 - 3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "(I)I")
	public final int method262() {
		this.anInt340 += 2;
		return (this.aByteArray2[this.anInt340 - 1] - 128 & 0xFF) + ((this.aByteArray2[this.anInt340 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(II)V")
	public final void method263(@OriginalArg(0) int arg0) {
		this.aByteArray2[this.anInt340++] = (byte) (arg0 >> 8);
		this.aByteArray2[this.anInt340++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "(B)I")
	public final int method264() {
		this.anInt340 += 3;
		return ((this.aByteArray2[this.anInt340 - 1] & 0xFF) << 16) - (-((this.aByteArray2[this.anInt340 - 2] & 0xFF) << 8) - (this.aByteArray2[this.anInt340 - 3] & 0xFF));
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([BIII)V")
	public final void method265(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			this.aByteArray2[this.anInt340++] = arg0[local14];
		}
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "(II)J")
	public final long method266(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(30) int local30 = local2 * 8;
		@Pc(32) long local32 = 0L;
		while (local30 >= 0) {
			local32 |= ((long) this.aByteArray2[this.anInt340++] & 0xFFL) << local30;
			local30 -= 8;
		}
		return local32;
	}

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "(I)I")
	public final int method267() {
		this.anInt340 += 2;
		return (this.aByteArray2[this.anInt340 - 2] & 0xFF) + ((this.aByteArray2[this.anInt340 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "(B)I")
	public final int method268() {
		this.anInt340 += 4;
		return (this.aByteArray2[this.anInt340 - 4] & 0xFF) + ((this.aByteArray2[this.anInt340 - 1] & 0xFF) << 24) + ((this.aByteArray2[this.anInt340 + -2] & 0xFF) << 16) + ((this.aByteArray2[this.anInt340 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "(I)I")
	public final int method269() {
		this.anInt340 += 2;
		return (this.aByteArray2[this.anInt340 - 1] & 0xFF) + ((this.aByteArray2[this.anInt340 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(IZ)V")
	public final void method270(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method247(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method239(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIB[B)V")
	public final void method271(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = this.aByteArray2[this.anInt340++];
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(IB)V")
	public final void method272(@OriginalArg(0) int arg0) {
		this.aByteArray2[this.anInt340++] = (byte) -arg0;
	}
}

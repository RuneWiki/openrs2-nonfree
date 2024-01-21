import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!rc", name = "Hb", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!rc", name = "Qb", descriptor = "I")
	public int anInt1266;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(I)V")
	public Class1_Sub5(@OriginalArg(0) int arg0) {
		this.aByteArray6 = Static67.method1269(arg0);
		this.anInt1266 = 0;
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "([B)V")
	public Class1_Sub5(@OriginalArg(0) byte[] arg0) {
		this.anInt1266 = 0;
		this.aByteArray6 = arg0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIZ[B)V")
	public final void method671(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(6) int local6 = 0; local6 < arg0; local6++) {
			arg1[local6] = (byte) (this.aByteArray6[this.anInt1266++] - 128);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)I")
	public final int method672() {
		this.anInt1266 += 4;
		return ((this.aByteArray6[this.anInt1266 - 4] & 0xFF) << 8) + (this.aByteArray6[this.anInt1266 - 2] << 24 & 0xFF000000) + ((this.aByteArray6[this.anInt1266 - 1] & 0xFF) << 16) + (this.aByteArray6[this.anInt1266 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)I")
	public final int method673() {
		this.anInt1266 += 4;
		return ((this.aByteArray6[this.anInt1266 - 1] & 0xFF) << 8) + (((this.aByteArray6[this.anInt1266 - 3] & 0xFF) << 24) + ((this.aByteArray6[this.anInt1266 - 4] & 0xFF) << 16)) + (this.aByteArray6[this.anInt1266 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
	public final void method674(@OriginalArg(0) int arg0) {
		this.aByteArray6[this.anInt1266++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)I")
	public final int method675() {
		this.anInt1266 += 2;
		return ((this.aByteArray6[this.anInt1266 - 1] & 0xFF) << 8) + (this.aByteArray6[this.anInt1266 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)I")
	public final int method676() {
		return this.aByteArray6[this.anInt1266++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)I")
	public final int method678() {
		this.anInt1266 += 2;
		return ((this.aByteArray6[this.anInt1266 - 1] & 0xFF) << 8) + (this.aByteArray6[this.anInt1266 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)V")
	public final void method679(@OriginalArg(0) int arg0) {
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 24);
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 16);
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 8);
		this.aByteArray6[this.anInt1266++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)V")
	public final void method680(@OriginalArg(0) int arg0) {
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 16);
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 8);
		this.aByteArray6[this.anInt1266++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)I")
	public final int method681() {
		this.anInt1266 += 3;
		return (this.aByteArray6[this.anInt1266 - 3] & 0xFF) + ((this.aByteArray6[this.anInt1266 - 2] & 0xFF) << 8) + ((this.aByteArray6[this.anInt1266 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)I")
	public final int method682() {
		this.anInt1266 += 4;
		return ((this.aByteArray6[this.anInt1266 - 1] & 0xFF) << 24) + (((this.aByteArray6[this.anInt1266 - 2] & 0xFF) << 16) + (this.aByteArray6[this.anInt1266 - 3] << 8 & 0xFF00) + (this.aByteArray6[this.anInt1266 + -4] & 0xFF));
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)Lclient!gd;")
	public final Class23 method683() {
		@Pc(13) int local13 = this.anInt1266;
		while (this.aByteArray6[this.anInt1266++] != 0) {
		}
		return Static42.method904(this.anInt1266 - local13 - 1, this.aByteArray6, local13);
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(II)V")
	public final void method684(@OriginalArg(0) int arg0) {
		this.aByteArray6[this.anInt1266 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(ZI)V")
	public final void method685(@OriginalArg(1) int arg0) {
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(II)V")
	public final void method686(@OriginalArg(0) int arg0) {
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 8);
		this.aByteArray6[this.anInt1266++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(II)V")
	public final void method687(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method674(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method686(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "(I)I")
	public final int method688() {
		this.anInt1266 += 3;
		return ((this.aByteArray6[this.anInt1266 - 3] & 0xFF) << 16) + (this.aByteArray6[this.anInt1266 - 2] << 8 & 0xFF00) + (this.aByteArray6[this.anInt1266 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)V")
	public final void method689(@OriginalArg(1) int arg0) {
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 8);
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(B)I")
	public final int method691() {
		this.anInt1266 += 2;
		@Pc(39) int local39 = ((this.aByteArray6[this.anInt1266 - 2] & 0xFF) << 8) + (this.aByteArray6[this.anInt1266 - 1] & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "(I)I")
	public final int method692() {
		this.anInt1266 += 4;
		return ((this.aByteArray6[this.anInt1266 - 2] & 0xFF) << 8) + (((this.aByteArray6[this.anInt1266 - 4] & 0xFF) << 24) + ((this.aByteArray6[this.anInt1266 - 3] & 0xFF) << 16)) + (this.aByteArray6[this.anInt1266 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "(I)B")
	public final byte method693() {
		return (byte) -this.aByteArray6[this.anInt1266++];
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(II)V")
	public final void method694(@OriginalArg(0) int arg0) {
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 + 128);
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "(II)V")
	public final void method695(@OriginalArg(0) int arg0) {
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 16);
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> -944783368);
		this.aByteArray6[this.anInt1266++] = (byte) arg0;
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "(I)I")
	public final int method696() {
		this.anInt1266 += 2;
		@Pc(31) int local31 = ((this.aByteArray6[this.anInt1266 - 1] & 0xFF) << 8) + (this.aByteArray6[this.anInt1266 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II[IB)V")
	public final void method697(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(6) int local6 = this.anInt1266;
		this.anInt1266 = 5;
		@Pc(24) int local24 = (arg0 - 5) / 8;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(31) int local31 = this.method692();
			@Pc(35) int local35 = this.method692();
			@Pc(37) int local37 = -957401312;
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local35 -= (local31 >>> 5 ^ local31 << 4) + local31 ^ local37 + arg1[local37 >>> 11 & 0xB6200003];
				local37 -= -1640531527;
				local31 -= local35 + (local35 >>> 5 ^ local35 << 4) ^ arg1[local37 & 0x3] + local37;
			}
			this.anInt1266 -= 8;
			this.method679(local31);
			this.method679(local35);
		}
		this.anInt1266 = local6;
	}

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "(II)V")
	public final void method698(@OriginalArg(0) int arg0) {
		this.aByteArray6[this.anInt1266++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "(I)B")
	public final byte method699() {
		return this.aByteArray6[this.anInt1266++];
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(BI)V")
	public final void method700(@OriginalArg(1) int arg0) {
		this.aByteArray6[this.anInt1266++] = (byte) arg0;
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 8);
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 16);
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II[BB)V")
	public final void method701(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(9) int local9 = arg0 - 1; local9 >= 0; local9--) {
			arg1[local9] = (byte) (this.aByteArray6[this.anInt1266++] - 128);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZ)I")
	public final int method703(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static49.method895(this.anInt1266, this.aByteArray6, arg0);
		this.method679(local16);
		return local16;
	}

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "(II)V")
	public final void method704(@OriginalArg(1) int arg0) {
		this.aByteArray6[this.anInt1266++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(B)I")
	public final int method705() {
		this.anInt1266 += 2;
		@Pc(34) int local34 = ((this.aByteArray6[this.anInt1266 - 1] & 0xFF) << 8) + (this.aByteArray6[this.anInt1266 - 2] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "(I)I")
	public final int method706() {
		@Pc(14) int local14 = this.aByteArray6[this.anInt1266] & 0xFF;
		return local14 >= 128 ? this.method715() - 49152 : this.method716() - 64;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLclient!gd;)V")
	public final void method707(@OriginalArg(1) Class23 arg0) {
		this.anInt1266 += arg0.method535(arg0.method525(), this.aByteArray6, this.anInt1266);
		this.aByteArray6[this.anInt1266++] = 0;
	}

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "(II)V")
	public final void method708(@OriginalArg(1) int arg0) {
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 8);
		this.aByteArray6[this.anInt1266++] = (byte) arg0;
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 24);
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([BIIZ)V")
	public final void method709(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			arg0[local5] = this.aByteArray6[this.anInt1266++];
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(JZ)V")
	public final void method711(@OriginalArg(0) long arg0) {
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 56);
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 48);
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 40);
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 32);
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 24);
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 16);
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 8);
		this.aByteArray6[this.anInt1266++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "(I)I")
	public final int method713() {
		return -this.aByteArray6[this.anInt1266++] & 0xFF;
	}

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "(I)I")
	public final int method714() {
		@Pc(7) int local7 = 0;
		@Pc(18) byte local18;
		for (local18 = this.aByteArray6[this.anInt1266++]; local18 < 0; local18 = this.aByteArray6[this.anInt1266++]) {
			local7 = (local7 | local18 & 0x7F) << 7;
		}
		return local18 | local7;
	}

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "(I)I")
	public final int method715() {
		this.anInt1266 += 2;
		return ((this.aByteArray6[this.anInt1266 - 2] & 0xFF) << 8) + (this.aByteArray6[this.anInt1266 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(B)I")
	public final int method716() {
		return this.aByteArray6[this.anInt1266++] & 0xFF;
	}

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "(B)I")
	public final int method718() {
		return 128 - this.aByteArray6[this.anInt1266++] & 0xFF;
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(BI)V")
	public final void method719(@OriginalArg(1) int arg0) {
		this.aByteArray6[this.anInt1266++] = (byte) arg0;
		this.aByteArray6[this.anInt1266++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "(B)I")
	public final int method721() {
		@Pc(19) int local19 = this.aByteArray6[this.anInt1266] & 0xFF;
		return local19 < 128 ? this.method716() : this.method715() - 32768;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method722(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt1266;
		@Pc(14) byte[] local14 = new byte[local6];
		this.anInt1266 = 0;
		this.method709(local14, local6);
		@Pc(28) BigInteger local28 = new BigInteger(local14);
		@Pc(33) BigInteger local33 = local28.modPow(arg1, arg0);
		@Pc(36) byte[] local36 = local33.toByteArray();
		this.anInt1266 = 0;
		this.method674(local36.length);
		this.method729(local36.length, local36);
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)I")
	public final int method723() {
		this.anInt1266 += 2;
		@Pc(38) int local38 = ((this.aByteArray6[this.anInt1266 - 2] & 0xFF) << 8) + (this.aByteArray6[this.anInt1266 - 1] - 128 & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "(B)B")
	public final byte method724() {
		return (byte) (128 - this.aByteArray6[this.anInt1266++]);
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(Z)J")
	public final long method726() {
		@Pc(6) long local6 = (long) this.method692() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method692() & 0xFFFFFFFFL;
		return (local6 << 32) + local17;
	}

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "(I)B")
	public final byte method727() {
		return (byte) (this.aByteArray6[this.anInt1266++] - 128);
	}

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "(B)I")
	public final int method728() {
		this.anInt1266 += 2;
		return ((this.aByteArray6[this.anInt1266 - 2] & 0xFF) << 8) + (this.aByteArray6[this.anInt1266 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZII[B)V")
	public final void method729(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			this.aByteArray6[this.anInt1266++] = arg1[local12];
		}
	}
}

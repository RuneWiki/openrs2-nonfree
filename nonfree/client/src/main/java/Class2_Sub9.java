import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!na", name = "Lb", descriptor = "I")
	public int anInt976;

	@OriginalMember(owner = "client!na", name = "L", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I)V")
	public Class2_Sub9(@OriginalArg(0) int arg0) {
		this.anInt976 = 0;
		this.aByteArray16 = Static123.method2069(arg0);
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "([B)V")
	public Class2_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray16 = arg0;
		this.anInt976 = 0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
	public final void method608(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt976 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)V")
	public final void method609(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt976++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(JB)V")
	public final void method610(@OriginalArg(0) long arg0) {
		this.method631((int) (arg0 >> 32));
		this.method631((int) arg0);
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(B)I")
	public final int method611() {
		@Pc(16) byte local16 = this.aByteArray16[this.anInt976++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local16 & 0x7F | local18) << 7;
			local16 = this.aByteArray16[this.anInt976++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)I")
	public final int method612() {
		return 128 - this.aByteArray16[this.anInt976++] & 0xFF;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(B)I")
	public final int method613() {
		return this.aByteArray16[this.anInt976++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(I)I")
	public final int method614() {
		return -this.aByteArray16[this.anInt976++] & 0xFF;
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(I)Lclient!je;")
	public final Class40 method615() {
		if (this.aByteArray16[this.anInt976] == 0) {
			this.anInt976++;
			return null;
		} else {
			return this.method625();
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(II)V")
	public final void method616(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt976++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([BIIB)V")
	public final void method617(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = (byte) (this.aByteArray16[this.anInt976++] - 128);
		}
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(B)B")
	public final byte method618() {
		return (byte) (128 - this.aByteArray16[this.anInt976++]);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III[B)V")
	public final void method619(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray16[this.anInt976++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)V")
	public final void method620(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 24);
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt976++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(B)I")
	public final int method621() {
		this.anInt976 += 2;
		return (this.aByteArray16[this.anInt976 - 2] & 0xFF) + ((this.aByteArray16[this.anInt976 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(I)I")
	public final int method622() {
		this.anInt976 += 4;
		return ((this.aByteArray16[this.anInt976 - 4] & 0xFF) << 24) + (this.aByteArray16[this.anInt976 - 3] << 16 & 0xFF0000) + ((this.aByteArray16[this.anInt976 + -2] & 0xFF) << 8) + (this.aByteArray16[this.anInt976 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)V")
	public final void method623(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method644(arg0 >>> 28 | 0x80);
					}
					this.method644(arg0 >>> 21 | 0x80);
				}
				this.method644(arg0 >>> 14 | 0x80);
			}
			this.method644(arg0 >>> 7 | 0x80);
		}
		this.method644(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(II)V")
	public final void method624(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 24);
		this.aByteArray16[this.anInt976++] = (byte) arg0;
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "(I)Lclient!je;")
	public final Class40 method625() {
		@Pc(13) int local13 = this.anInt976;
		while (this.aByteArray16[this.anInt976++] != 0) {
		}
		return Static74.method651(this.anInt976 - local13 - 1, this.aByteArray16, local13);
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "(B)J")
	public final long method626() {
		@Pc(14) long local14 = (long) this.method622() & 0xFFFFFFFFL;
		@Pc(21) long local21 = (long) this.method622() & 0xFFFFFFFFL;
		return local21 + (local14 << 32);
	}

	@OriginalMember(owner = "client!na", name = "h", descriptor = "(I)I")
	public final int method628() {
		this.anInt976 += 3;
		return (this.aByteArray16[this.anInt976 - 1] & 0xFF) + ((this.aByteArray16[this.anInt976 - 3] & 0xFF) << 16) + ((this.aByteArray16[this.anInt976 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IZ)V")
	public final void method629(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt976++] = (byte) arg0;
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)B")
	public final byte method630() {
		return (byte) (this.aByteArray16[this.anInt976++] - 128);
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(II)V")
	public final void method631(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt976++] = (byte) arg0;
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 24);
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!na", name = "i", descriptor = "(I)I")
	public final int method632() {
		this.anInt976 += 2;
		return ((this.aByteArray16[this.anInt976 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt976 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(II)V")
	public final void method633(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method644(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method657(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(II)V")
	public final void method636(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt976++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!na", name = "h", descriptor = "(B)I")
	public final int method637() {
		this.anInt976 += 4;
		return ((this.aByteArray16[this.anInt976 - 4] & 0xFF) << 8) + ((this.aByteArray16[this.anInt976 - 1] & 0xFF) << 16) + ((this.aByteArray16[this.anInt976 + -2] & 0xFF) << 24) + (this.aByteArray16[this.anInt976 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)V")
	public final void method638(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt976++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!na", name = "k", descriptor = "(I)I")
	public final int method639() {
		this.anInt976 += 2;
		return ((this.aByteArray16[this.anInt976 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt976 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)I")
	public final int method640() {
		return this.aByteArray16[this.anInt976++] & 0xFF;
	}

	@OriginalMember(owner = "client!na", name = "l", descriptor = "(I)I")
	public final int method641() {
		@Pc(7) int local7 = this.aByteArray16[this.anInt976] & 0xFF;
		return local7 < 128 ? this.method640() - 64 : this.method632() + -49152;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BII[B)V")
	public final void method642(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = arg0 - 1; local7 >= 0; local7--) {
			arg1[local7] = this.aByteArray16[this.anInt976++];
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([BIII)V")
	public final void method643(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = this.aByteArray16[this.anInt976++];
		}
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "(II)V")
	public final void method644(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt976++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!na", name = "h", descriptor = "(II)V")
	public final void method645(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt976++] = (byte) (arg0 + 128);
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!na", name = "i", descriptor = "(II)V")
	public final void method646(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt976++] = (byte) arg0;
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IJ)V")
	public final void method647(@OriginalArg(1) long arg0) {
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 56);
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 48);
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 40);
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 32);
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 24);
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt976++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!na", name = "m", descriptor = "(I)I")
	public final int method648() {
		this.anInt976 += 4;
		return (this.aByteArray16[this.anInt976 - 2] & 0xFF) + ((this.aByteArray16[this.anInt976 - 4] & 0xFF) << 16) + ((this.aByteArray16[this.anInt976 + -3] & 0xFF) << 24) + ((this.aByteArray16[this.anInt976 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!na", name = "n", descriptor = "(I)I")
	public final int method649() {
		this.anInt976 += 2;
		@Pc(38) int local38 = (this.aByteArray16[this.anInt976 - 1] - 128 & 0xFF) + ((this.aByteArray16[this.anInt976 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(Z)I")
	public final int method650() {
		this.anInt976 += 2;
		return ((this.aByteArray16[this.anInt976 - 1] & 0xFF) << 8) + (this.aByteArray16[this.anInt976 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method652(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(11) int local11 = this.anInt976;
		this.anInt976 = 0;
		@Pc(21) byte[] local21 = new byte[local11];
		this.method643(local21, local11);
		@Pc(32) BigInteger local32 = new BigInteger(local21);
		@Pc(37) BigInteger local37 = local32.modPow(arg1, arg0);
		@Pc(40) byte[] local40 = local37.toByteArray();
		this.anInt976 = 0;
		this.method644(local40.length);
		this.method619(local40.length, local40);
	}

	@OriginalMember(owner = "client!na", name = "i", descriptor = "(B)I")
	public final int method653() {
		@Pc(17) int local17 = this.aByteArray16[this.anInt976] & 0xFF;
		return local17 < 128 ? this.method640() : this.method632() - 32768;
	}

	@OriginalMember(owner = "client!na", name = "j", descriptor = "(B)I")
	public final int method655() {
		this.anInt976 += 3;
		return ((this.aByteArray16[this.anInt976 - 2] & 0xFF) << 8) + ((this.aByteArray16[this.anInt976 - 1] & 0xFF) << 16) + (this.aByteArray16[this.anInt976 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III[I)V")
	public final void method656(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt976;
		this.anInt976 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			@Pc(31) int local31 = -957401312;
			@Pc(37) int local37 = this.method622();
			@Pc(41) int local41 = this.method622();
			@Pc(45) int local45 = 32;
			while (local45-- > 0) {
				local41 -= local31 + arg1[local31 >>> 11 & 0x47A00003] ^ local37 + (local37 >>> 5 ^ local37 << 4);
				local31 -= -1640531527;
				local37 -= local31 + arg1[local31 & 0x3] ^ (local41 << 4 ^ local41 >>> 5) + local41;
			}
			this.anInt976 -= 8;
			this.method620(local37);
			this.method620(local41);
		}
		this.anInt976 = local8;
	}

	@OriginalMember(owner = "client!na", name = "j", descriptor = "(II)V")
	public final void method657(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt976++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt976++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!na", name = "k", descriptor = "(B)B")
	public final byte method658() {
		return this.aByteArray16[this.anInt976++];
	}

	@OriginalMember(owner = "client!na", name = "l", descriptor = "(II)V")
	public final void method660(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt976 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray16[this.anInt976 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt976 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt976 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!na", name = "o", descriptor = "(I)I")
	public final int method661() {
		this.anInt976 += 2;
		@Pc(33) int local33 = (this.aByteArray16[this.anInt976 - 2] - 128 & 0xFF) + ((this.aByteArray16[this.anInt976 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!na", name = "p", descriptor = "(I)I")
	public final int method662() {
		this.anInt976 += 4;
		return ((this.aByteArray16[this.anInt976 - 2] & 0xFF) << 16) + ((this.aByteArray16[this.anInt976 - 1] & 0xFF) << 24) + ((this.aByteArray16[this.anInt976 + -3] & 0xFF) << 8) + (this.aByteArray16[this.anInt976 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IB)I")
	public final int method663(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static119.method2007(this.anInt976, arg0, this.aByteArray16);
		this.method620(local7);
		return local7;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!je;I)V")
	public final void method664(@OriginalArg(0) Class40 arg0) {
		this.anInt976 += arg0.method978(this.aByteArray16, arg0.method950(), this.anInt976);
		this.aByteArray16[this.anInt976++] = 0;
	}

	@OriginalMember(owner = "client!na", name = "l", descriptor = "(B)I")
	public final int method666() {
		this.anInt976 += 2;
		@Pc(39) int local39 = (this.aByteArray16[this.anInt976 - 1] & 0xFF) + ((this.aByteArray16[this.anInt976 - 2] & 0xFF) << 8);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}
}

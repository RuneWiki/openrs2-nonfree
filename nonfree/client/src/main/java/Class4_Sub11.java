import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public class Class4_Sub11 extends Class4 {

	@OriginalMember(owner = "client!jd", name = "Db", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!jd", name = "lb", descriptor = "I")
	public int anInt1099;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I)V")
	public Class4_Sub11(@OriginalArg(0) int arg0) {
		this.aByteArray9 = Static93.method1626(arg0);
		this.anInt1099 = 0;
	}

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "([B)V")
	public Class4_Sub11(@OriginalArg(0) byte[] arg0) {
		this.aByteArray9 = arg0;
		this.anInt1099 = 0;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)V")
	public final void method691(@OriginalArg(1) int arg0) {
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 + 128);
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)I")
	public final int method692() {
		@Pc(16) int local16 = this.aByteArray9[this.anInt1099] & 0xFF;
		return local16 < 128 ? this.method719() : this.method718() - 32768;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)V")
	public final void method693(@OriginalArg(1) int arg0) {
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Lclient!ec;")
	public final Class22 method694() {
		if (this.aByteArray9[this.anInt1099] == 0) {
			this.anInt1099++;
			return null;
		} else {
			return this.method742();
		}
	}

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)I")
	public final int method696() {
		this.anInt1099 += 4;
		return (this.aByteArray9[this.anInt1099 - 2] & 0xFF) + ((this.aByteArray9[this.anInt1099 - 3] & 0xFF) << 24) + ((this.aByteArray9[this.anInt1099 + -4] & 0xFF) << 16) + ((this.aByteArray9[this.anInt1099 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)I")
	public final int method697() {
		@Pc(23) byte local23 = this.aByteArray9[this.anInt1099++];
		@Pc(25) int local25 = 0;
		while (local23 < 0) {
			local25 = (local25 | local23 & 0x7F) << 7;
			local23 = this.aByteArray9[this.anInt1099++];
		}
		return local23 | local25;
	}

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)B")
	public final byte method698() {
		return (byte) (128 - this.aByteArray9[this.anInt1099++]);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IJ)V")
	public final void method699(@OriginalArg(1) long arg0) {
		this.method713((int) (arg0 >> 32));
		this.method713((int) arg0);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
	public final void method700(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt1099++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(BI)V")
	public final void method701(@OriginalArg(1) int arg0) {
		this.aByteArray9[this.anInt1099++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)V")
	public final void method702(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt1099 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "(I)I")
	public final int method703() {
		@Pc(12) int local12 = this.aByteArray9[this.anInt1099] & 0xFF;
		return local12 >= 128 ? this.method718() - 49152 : this.method719() + -64;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)I")
	public final int method704() {
		this.anInt1099 += 3;
		return (this.aByteArray9[this.anInt1099 - 1] & 0xFF) + ((this.aByteArray9[this.anInt1099 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt1099 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)I")
	public final int method705() {
		this.anInt1099 += 2;
		return (this.aByteArray9[this.anInt1099 - 1] - 128 & 0xFF) + ((this.aByteArray9[this.anInt1099 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)I")
	public final int method706() {
		this.anInt1099 += 2;
		return ((this.aByteArray9[this.anInt1099 - 1] & 0xFF) << 8) + (this.aByteArray9[this.anInt1099 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "(I)I")
	public final int method707() {
		return this.aByteArray9[this.anInt1099++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!ec;B)V")
	public final void method708(@OriginalArg(0) Class22 arg0) {
		this.anInt1099 += arg0.method444(this.anInt1099, arg0.method449(), this.aByteArray9);
		this.aByteArray9[this.anInt1099++] = 0;
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(BI)I")
	public final int method709(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = Static121.method1880(this.anInt1099, arg0, this.aByteArray9);
		this.method717(local13);
		return local13;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III[I)V")
	public final void method710(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt1099;
		this.anInt1099 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(25) int local25 = 0; local25 < local18; local25++) {
			@Pc(31) int local31 = this.method725();
			@Pc(33) int local33 = -957401312;
			@Pc(37) int local37 = this.method725();
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local37 -= local33 + arg1[local33 >>> 11 & 0x3] ^ (local31 >>> 5 ^ local31 << 4) - -local31;
				local33 -= -1640531527;
				local31 -= local33 + arg1[local33 & 0x3] ^ (local37 >>> 5 ^ local37 << 4) + local37;
			}
			this.anInt1099 -= 8;
			this.method717(local31);
			this.method717(local37);
		}
		this.anInt1099 = local8;
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)I")
	public final int method711() {
		this.anInt1099 += 2;
		return ((this.aByteArray9[this.anInt1099 - 1] & 0xFF) << 8) + (this.aByteArray9[this.anInt1099 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "(I)I")
	public final int method712() {
		this.anInt1099 += 4;
		return ((this.aByteArray9[this.anInt1099 - 3] & 0xFF) << 8) + (this.aByteArray9[this.anInt1099 - 2] << 16 & 0xFF0000) + ((this.aByteArray9[this.anInt1099 + -1] & 0xFF) << 24) + (this.aByteArray9[this.anInt1099 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(II)V")
	public final void method713(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt1099++] = (byte) arg0;
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "(I)J")
	public final long method714() {
		@Pc(6) long local6 = (long) this.method725() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method725() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "(I)I")
	public final int method715() {
		this.anInt1099 += 2;
		@Pc(40) int local40 = (this.aByteArray9[this.anInt1099 - 1] - 128 & 0xFF) + ((this.aByteArray9[this.anInt1099 - 2] & 0xFF) << 8);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "(B)I")
	public final int method716() {
		return -this.aByteArray9[this.anInt1099++] & 0xFF;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)V")
	public final void method717(@OriginalArg(1) int arg0) {
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt1099++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "(I)I")
	public final int method718() {
		this.anInt1099 += 2;
		return (this.aByteArray9[this.anInt1099 - 1] & 0xFF) + ((this.aByteArray9[this.anInt1099 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "(I)I")
	public final int method719() {
		return this.aByteArray9[this.anInt1099++] & 0xFF;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IZ)V")
	public final void method720(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt1099++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "(I)B")
	public final byte method721() {
		return (byte) -this.aByteArray9[this.anInt1099++];
	}

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "(I)I")
	public final int method722() {
		return 128 - this.aByteArray9[this.anInt1099++] & 0xFF;
	}

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "(I)B")
	public final byte method723() {
		return (byte) (this.aByteArray9[this.anInt1099++] - 128);
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(Z)I")
	public final int method725() {
		this.anInt1099 += 4;
		return (this.aByteArray9[this.anInt1099 - 1] & 0xFF) + ((this.aByteArray9[this.anInt1099 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt1099 + -4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt1099 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([BIBI)V")
	public final void method726(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = arg1 - 1; local11 >= 0; local11--) {
			arg0[local11] = this.aByteArray9[this.anInt1099++];
		}
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(IZ)V")
	public final void method727(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt1099 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt1099 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt1099 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt1099 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(JB)V")
	public final void method728(@OriginalArg(0) long arg0) {
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 56);
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 48);
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 40);
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 32);
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt1099++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III[B)V")
	public final void method730(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aByteArray9[this.anInt1099++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(B)B")
	public final byte method731() {
		return this.aByteArray9[this.anInt1099++];
	}

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "(II)V")
	public final void method732(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method701(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method700(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(II)V")
	public final void method733(@OriginalArg(1) int arg0) {
		this.aByteArray9[this.anInt1099++] = (byte) arg0;
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IB)V")
	public final void method734(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt1099++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "(II)V")
	public final void method735(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "(B)I")
	public final int method736() {
		this.anInt1099 += 4;
		return (this.aByteArray9[this.anInt1099 - 3] & 0xFF) + (((this.aByteArray9[this.anInt1099 - 2] & 0xFF) << 24) - (-((this.aByteArray9[this.anInt1099 - 1] & 0xFF) << 16) - ((this.aByteArray9[this.anInt1099 - 4] & 0xFF) << 8)));
	}

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "(II)V")
	public final void method737(@OriginalArg(1) int arg0) {
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt1099++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(Z)I")
	public final int method738() {
		this.anInt1099 += 2;
		@Pc(31) int local31 = ((this.aByteArray9[this.anInt1099 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt1099 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method739(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt1099;
		this.anInt1099 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method744(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt1099 = 0;
		this.method701(local31.length);
		this.method730(local31.length, local31);
	}

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "(II)V")
	public final void method740(@OriginalArg(1) int arg0) {
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt1099++] = (byte) arg0;
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(IZ)V")
	public final void method741(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method701(arg0 >>> 28 | 0x80);
					}
					this.method701(arg0 >>> 21 | 0x80);
				}
				this.method701(arg0 >>> 14 | 0x80);
			}
			this.method701(arg0 >>> 7 | 0x80);
		}
		this.method701(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "(I)Lclient!ec;")
	public final Class22 method742() {
		@Pc(11) int local11 = this.anInt1099;
		while (this.aByteArray9[this.anInt1099++] != 0) {
		}
		return Static22.method1817(this.aByteArray9, local11, this.anInt1099 - local11 - 1);
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(IB)V")
	public final void method743(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt1099++] = (byte) arg0;
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt1099++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZ[B)V")
	public final void method744(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = this.aByteArray9[this.anInt1099++];
		}
	}
}

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!nc", name = "ib", descriptor = "I")
	public int anInt1192;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(I)V")
	public Class1_Sub9(@OriginalArg(0) int arg0) {
		this.aByteArray20 = Static200.method3115(arg0);
		this.anInt1192 = 0;
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([B)V")
	public Class1_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray20 = arg0;
		this.anInt1192 = 0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([IZII)V")
	public final void method884(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(4) int local4 = this.anInt1192;
		this.anInt1192 = 5;
		@Pc(24) int local24 = (arg1 - 5) / 8;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) int local32 = this.method915();
			@Pc(36) int local36 = this.method915();
			@Pc(40) int local40 = -957401312;
			@Pc(42) int local42 = 32;
			while (local42-- > 0) {
				local36 -= (local32 << 4 ^ local32 >>> 5) + local32 ^ local40 - -arg0[local40 >>> 11 & 0x60000003];
				local40 -= -1640531527;
				local32 -= local36 + (local36 << 4 ^ local36 >>> 5) ^ local40 - -arg0[local40 & 0x3];
			}
			this.anInt1192 -= 8;
			this.method921(local32);
			this.method921(local36);
		}
		this.anInt1192 = local4;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)I")
	public final int method885() {
		this.anInt1192 += 2;
		return (this.aByteArray20[this.anInt1192 - 2] - 128 & 0xFF) + ((this.aByteArray20[this.anInt1192 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(II)V")
	public final void method889(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt1192++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)V")
	public final void method890(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1192++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(B)B")
	public final byte method891() {
		return this.aByteArray20[this.anInt1192++];
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(B)I")
	public final int method892() {
		this.anInt1192 += 4;
		return (this.aByteArray20[this.anInt1192 - 3] & 0xFF) + ((this.aByteArray20[this.anInt1192 - 4] & 0xFF) << 8) + ((this.aByteArray20[this.anInt1192 + -2] & 0xFF) << 24) + ((this.aByteArray20[this.anInt1192 - 1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(II)V")
	public final void method893(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method899(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method890(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([BIII)V")
	public final void method894(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = arg1 - 1; local11 >= 0; local11--) {
			arg0[local11] = this.aByteArray20[this.anInt1192++];
		}
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)I")
	public final int method895() {
		return this.aByteArray20[this.anInt1192++] & 0xFF;
	}

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "(B)I")
	public final int method896() {
		@Pc(3) int local3 = 0;
		@Pc(7) int local7 = this.method900();
		while (local7 == 32767) {
			local7 = this.method900();
			local3 += 32767;
		}
		return local3 + local7;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BJ)V")
	public final void method897(@OriginalArg(1) long arg0) {
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 56);
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 48);
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 40);
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 32);
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1192++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(ZI)V")
	public final void method899(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1192++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)I")
	public final int method900() {
		@Pc(11) int local11 = this.aByteArray20[this.anInt1192] & 0xFF;
		return local11 < 128 ? this.method895() : this.method946() - 32768;
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)I")
	public final int method901() {
		this.anInt1192 += 2;
		return (this.aByteArray20[this.anInt1192 - 1] - 128 & 0xFF) + ((this.aByteArray20[this.anInt1192 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(II)V")
	public final void method902(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 + 128);
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IJI)V")
	public final void method903(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(26) int local26 = local2 * 8; local26 >= 0; local26 -= 8) {
			this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> local26);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZ)V")
	public final void method904(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt1192 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)I")
	public final int method905() {
		this.anInt1192 += 4;
		return ((this.aByteArray20[this.anInt1192 - 1] & 0xFF) << 24) + (this.aByteArray20[this.anInt1192 - 2] << 16 & 0xFF0000) + ((this.aByteArray20[this.anInt1192 + -3] & 0xFF) << 8) + (this.aByteArray20[this.anInt1192 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "(B)B")
	public final byte method906() {
		return (byte) -this.aByteArray20[this.anInt1192++];
	}

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "(I)B")
	public final byte method907() {
		return (byte) (this.aByteArray20[this.anInt1192++] - 128);
	}

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "(II)V")
	public final void method908(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt1192++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "(B)J")
	public final long method909() {
		@Pc(12) long local12 = (long) this.method915() & 0xFFFFFFFFL;
		@Pc(21) long local21 = (long) this.method915() & 0xFFFFFFFFL;
		return local21 + (local12 << 32);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)V")
	public final void method910(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt1192++] = (byte) arg0;
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "(II)V")
	public final void method911(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1192++] = (byte) arg0;
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(IZ)V")
	public final void method912(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt1192 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt1192 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt1192 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1192 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IJ)V")
	public final void method913(@OriginalArg(1) long arg0) {
		this.method910((int) (arg0 >> 32));
		this.method910((int) arg0);
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(IZ)V")
	public final void method914(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt1192++] = (byte) arg0;
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "(I)I")
	public final int method915() {
		this.anInt1192 += 4;
		return (this.aByteArray20[this.anInt1192 - 1] & 0xFF) + ((this.aByteArray20[this.anInt1192 - 4] & 0xFF) << 24) + ((this.aByteArray20[this.anInt1192 + -3] & 0xFF) << 16) + ((this.aByteArray20[this.anInt1192 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "(B)I")
	public final int method916() {
		this.anInt1192 += 2;
		return ((this.aByteArray20[this.anInt1192 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt1192 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(IZ)I")
	public final int method918(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static192.method3003(this.aByteArray20, arg0, this.anInt1192);
		this.method921(local11);
		return local11;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III[B)V")
	public final void method919(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			arg1[local1] = this.aByteArray20[this.anInt1192++];
		}
	}

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "(I)I")
	public final int method920() {
		this.anInt1192 += 3;
		return ((this.aByteArray20[this.anInt1192 - 2] & 0xFF) << 8) + (((this.aByteArray20[this.anInt1192 - 3] & 0xFF) << 16) + (this.aByteArray20[this.anInt1192 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "(II)V")
	public final void method921(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1192++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)I")
	public final int method923() {
		this.anInt1192 += 4;
		return (this.aByteArray20[this.anInt1192 - 2] & 0xFF) + ((this.aByteArray20[this.anInt1192 - 1] & 0xFF) << 8) + ((this.aByteArray20[this.anInt1192 + -3] & 0xFF) << 24) + ((this.aByteArray20[this.anInt1192 - 4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!kh;)V")
	public final void method924(@OriginalArg(1) Class60 arg0) {
		this.anInt1192 += arg0.method1801(arg0.method1835(), this.anInt1192, this.aByteArray20);
		this.aByteArray20[this.anInt1192++] = 0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method925(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt1192;
		@Pc(9) byte[] local9 = new byte[local6];
		this.anInt1192 = 0;
		this.method919(local6, local9);
		@Pc(23) BigInteger local23 = new BigInteger(local9);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(36) byte[] local36 = local28.toByteArray();
		this.anInt1192 = 0;
		this.method899(local36.length);
		this.method944(local36.length, local36);
	}

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "(B)I")
	public final int method926() {
		@Pc(19) int local19 = this.aByteArray20[this.anInt1192] & 0xFF;
		return local19 >= 128 ? this.method946() - 49152 : this.method895() + -64;
	}

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "(I)Lclient!kh;")
	public final Class60 method927() {
		if (this.aByteArray20[this.anInt1192] == 0) {
			this.anInt1192++;
			return null;
		} else {
			return this.method935();
		}
	}

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "(II)V")
	public final void method929(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1192++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "(I)I")
	public final int method930() {
		return 128 - this.aByteArray20[this.anInt1192++] & 0xFF;
	}

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "(B)I")
	public final int method931() {
		this.anInt1192 += 2;
		@Pc(35) int local35 = ((this.aByteArray20[this.anInt1192 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt1192 - 2] - 128 & 0xFF);
		if (local35 > 32767) {
			local35 -= 65536;
		}
		return local35;
	}

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "(I)I")
	public final int method932() {
		this.anInt1192 += 2;
		@Pc(31) int local31 = ((this.aByteArray20[this.anInt1192 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt1192 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "(I)I")
	public final int method934() {
		this.anInt1192 += 2;
		@Pc(41) int local41 = ((this.aByteArray20[this.anInt1192 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt1192 - 1] - 128 & 0xFF);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "(I)Lclient!kh;")
	public final Class60 method935() {
		@Pc(6) int local6 = this.anInt1192;
		while (this.aByteArray20[this.anInt1192++] != 0) {
		}
		return Static102.method1755(this.anInt1192 - local6 - 1, local6, this.aByteArray20);
	}

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "(II)J")
	public final long method936(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(24) int local24 = local6 * 8;
		@Pc(27) long local27 = (long) 0;
		while (local24 >= 0) {
			local27 |= ((long) this.aByteArray20[this.anInt1192++] & 0xFFL) << local24;
			local24 -= 8;
		}
		return local27;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)V")
	public final void method937(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1192++] = (byte) arg0;
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)I")
	public final int method939() {
		return -this.aByteArray20[this.anInt1192++] & 0xFF;
	}

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "(I)I")
	public final int method940() {
		this.anInt1192 += 3;
		return (this.aByteArray20[this.anInt1192 - 1] & 0xFF) + ((this.aByteArray20[this.anInt1192 - 3] & 0xFF) << 8) + ((this.aByteArray20[this.anInt1192 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(BI)V")
	public final void method941(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method899(arg0 >>> 28 | 0x80);
					}
					this.method899(arg0 >>> 21 | 0x80);
				}
				this.method899(arg0 >>> 14 | 0x80);
			}
			this.method899(arg0 >>> 7 | 0x80);
		}
		this.method899(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "(B)I")
	public final int method942() {
		return this.aByteArray20[this.anInt1192++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "(II)V")
	public final void method943(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1192++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIB[B)V")
	public final void method944(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aByteArray20[this.anInt1192++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "(I)I")
	public final int method945() {
		@Pc(21) byte local21 = this.aByteArray20[this.anInt1192++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local23 | local21 & 0x7F) << 7;
			local21 = this.aByteArray20[this.anInt1192++];
		}
		return local21 | local23;
	}

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "(B)I")
	public final int method946() {
		this.anInt1192 += 2;
		return ((this.aByteArray20[this.anInt1192 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt1192 - 1] & 0xFF);
	}
}

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
	public int anInt232 = 0;

	@OriginalMember(owner = "client!rd", name = "R", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4(@OriginalArg(0) int arg0) {
		this.aByteArray5 = Static37.method656(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([B)V")
	public Class3_Sub4(@OriginalArg(0) byte[] arg0) {
		this.aByteArray5 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)I")
	public final int method169() {
		@Pc(12) int local12 = 0;
		@Pc(23) byte local23;
		for (local23 = this.aByteArray5[this.anInt232++]; local23 < 0; local23 = this.aByteArray5[this.anInt232++]) {
			local12 = (local12 | local23 & 0x7F) << 7;
		}
		return local23 | local12;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(ZI)V")
	public final void method170(@OriginalArg(1) int arg0) {
		this.aByteArray5[this.anInt232++] = (byte) arg0;
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)I")
	public final int method171() {
		this.anInt232 += 2;
		return (this.aByteArray5[this.anInt232 - 2] & 0xFF) + ((this.aByteArray5[this.anInt232 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)Lclient!kb;")
	public final Class46 method172() {
		@Pc(6) int local6 = this.anInt232;
		while (this.aByteArray5[this.anInt232++] != 0) {
		}
		return Static98.method1604(this.anInt232 - local6 - 1, this.aByteArray5, local6);
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)I")
	public final int method174() {
		this.anInt232 += 2;
		return ((this.aByteArray5[this.anInt232 - 2] & 0xFF) << 8) + (this.aByteArray5[this.anInt232 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)I")
	public final int method175() {
		this.anInt232 += 2;
		@Pc(41) int local41 = ((this.aByteArray5[this.anInt232 - 1] & 0xFF) << 8) + (this.aByteArray5[this.anInt232 - 2] - 128 & 0xFF);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
	public final void method176(@OriginalArg(1) int arg0) {
		this.aByteArray5[this.anInt232++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)B")
	public final byte method177() {
		return (byte) (this.aByteArray5[this.anInt232++] - 128);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II[BI)V")
	public final void method178(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			arg1[local1] = this.aByteArray5[this.anInt232++];
		}
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)I")
	public final int method179() {
		this.anInt232 += 2;
		@Pc(37) int local37 = ((this.aByteArray5[this.anInt232 - 1] & 0xFF) << 8) + (this.aByteArray5[this.anInt232 - 2] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ[BI)V")
	public final void method180(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(17) int local17 = arg1 - 1; local17 >= 0; local17--) {
			arg0[local17] = (byte) (this.aByteArray5[this.anInt232++] - 128);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)V")
	public final void method181(@OriginalArg(0) int arg0) {
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 8);
		this.aByteArray5[this.anInt232++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)V")
	public final void method182(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method206(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method198(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)V")
	public final void method183(@OriginalArg(1) int arg0) {
		this.aByteArray5[this.anInt232++] = (byte) (arg0 + 128);
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)I")
	public final int method184() {
		this.anInt232 += 2;
		return ((this.aByteArray5[this.anInt232 - 1] & 0xFF) << 8) + (this.aByteArray5[this.anInt232 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(Z)J")
	public final long method185() {
		@Pc(6) long local6 = (long) this.method213() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method213() & 0xFFFFFFFFL;
		return local17 + (local6 << 32);
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(ZI)V")
	public final void method187(@OriginalArg(1) int arg0) {
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 16);
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 8);
		this.aByteArray5[this.anInt232++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(ZI)V")
	public final void method188(@OriginalArg(1) int arg0) {
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 24);
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 16);
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 8);
		this.aByteArray5[this.anInt232++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLclient!kb;)V")
	public final void method189(@OriginalArg(1) Class46 arg0) {
		this.anInt232 += arg0.method1381(this.aByteArray5, arg0.method1376(), this.anInt232);
		this.aByteArray5[this.anInt232++] = 0;
	}

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "(I)I")
	public final int method190() {
		this.anInt232 += 3;
		return (this.aByteArray5[this.anInt232 - 3] & 0xFF) + ((this.aByteArray5[this.anInt232 - 2] & 0xFF) << 8) + ((this.aByteArray5[this.anInt232 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "(I)I")
	public final int method191() {
		return this.aByteArray5[this.anInt232++] & 0xFF;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)I")
	public final int method192() {
		return -this.aByteArray5[this.anInt232++] & 0xFF;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(JI)V")
	public final void method193(@OriginalArg(0) long arg0) {
		this.method224((int) (arg0 >> 32));
		this.method224((int) arg0);
	}

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "(I)B")
	public final byte method194() {
		return (byte) (128 - this.aByteArray5[this.anInt232++]);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)I")
	public final int method195(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static27.method446(this.aByteArray5, this.anInt232, arg0);
		this.method188(local16);
		return local16;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III[I)V")
	public final void method196(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(12) int local12 = (arg0 - 5) / 8;
		@Pc(15) int local15 = this.anInt232;
		this.anInt232 = 5;
		for (@Pc(20) int local20 = 0; local20 < local12; local20++) {
			@Pc(26) int local26 = this.method213();
			@Pc(28) int local28 = -957401312;
			@Pc(30) int local30 = 32;
			@Pc(34) int local34 = this.method213();
			while (local30-- > 0) {
				local34 -= arg1[local28 >>> 11 & 0x7BE00003] + local28 ^ local26 + (local26 << 4 ^ local26 >>> 5);
				local28 -= -1640531527;
				local26 -= local34 + (local34 << 4 ^ local34 >>> 5) ^ arg1[local28 & 0x3] + local28;
			}
			this.anInt232 -= 8;
			this.method188(local26);
			this.method188(local34);
		}
		this.anInt232 = local15;
	}

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "(I)I")
	public final int method197() {
		this.anInt232 += 3;
		return (this.aByteArray5[this.anInt232 - 1] & 0xFF) + ((this.aByteArray5[this.anInt232 - 2] & 0xFF) << 8) + ((this.aByteArray5[this.anInt232 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)V")
	public final void method198(@OriginalArg(0) int arg0) {
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 8);
		this.aByteArray5[this.anInt232++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "(I)B")
	public final byte method199() {
		return (byte) -this.aByteArray5[this.anInt232++];
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BII[B)V")
	public final void method200(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			this.aByteArray5[this.anInt232++] = arg1[local11];
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(JI)V")
	public final void method201(@OriginalArg(0) long arg0) {
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 56);
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 48);
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 40);
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 32);
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 24);
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 16);
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 8);
		this.aByteArray5[this.anInt232++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IB)V")
	public final void method202(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method206(arg0 >>> 28 | 0x80);
					}
					this.method206(arg0 >>> 21 | 0x80);
				}
				this.method206(arg0 >>> 14 | 0x80);
			}
			this.method206(arg0 >>> 7 | 0x80);
		}
		this.method206(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(Z)B")
	public final byte method203() {
		return this.aByteArray5[this.anInt232++];
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)Lclient!kb;")
	public final Class46 method204() {
		if (this.aByteArray5[this.anInt232] == 0) {
			this.anInt232++;
			return null;
		} else {
			return this.method172();
		}
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)I")
	public final int method205() {
		return 128 - this.aByteArray5[this.anInt232++] & 0xFF;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(IB)V")
	public final void method206(@OriginalArg(0) int arg0) {
		this.aByteArray5[this.anInt232++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "(I)I")
	public final int method207() {
		this.anInt232 += 4;
		return (this.aByteArray5[this.anInt232 - 2] & 0xFF) + ((this.aByteArray5[this.anInt232 - 3] & 0xFF) << 24) + ((this.aByteArray5[this.anInt232 + -4] & 0xFF) << 16) + ((this.aByteArray5[this.anInt232 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "(I)I")
	public final int method208() {
		this.anInt232 += 2;
		return (this.aByteArray5[this.anInt232 - 1] & 0xFF) + ((this.aByteArray5[this.anInt232 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "(I)I")
	public final int method209() {
		@Pc(18) int local18 = this.aByteArray5[this.anInt232] & 0xFF;
		return local18 < 128 ? this.method191() : this.method208() - 32768;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IZ[BI)V")
	public final void method210(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			arg0[local14] = (byte) (this.aByteArray5[this.anInt232++] - 128);
		}
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(II)V")
	public final void method211(@OriginalArg(1) int arg0) {
		this.aByteArray5[this.anInt232 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray5[this.anInt232 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray5[this.anInt232 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray5[this.anInt232 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "(I)I")
	public final int method212() {
		this.anInt232 += 4;
		return (this.aByteArray5[this.anInt232 - 4] & 0xFF) + ((this.aByteArray5[this.anInt232 - 1] & 0xFF) << 24) + ((this.aByteArray5[this.anInt232 + -2] & 0xFF) << 16) + ((this.aByteArray5[this.anInt232 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "(I)I")
	public final int method213() {
		this.anInt232 += 4;
		return (this.aByteArray5[this.anInt232 - 1] & 0xFF) + ((this.aByteArray5[this.anInt232 - 2] & 0xFF) << 8) + ((this.aByteArray5[this.anInt232 + -3] & 0xFF) << 16) + ((this.aByteArray5[this.anInt232 - 4] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(B)I")
	public final int method214() {
		this.anInt232 += 4;
		return ((this.aByteArray5[this.anInt232 - 4] & 0xFF) << 8) + ((this.aByteArray5[this.anInt232 - 1] & 0xFF) << 16) + ((this.aByteArray5[this.anInt232 - 2] & 0xFF) << 24) + (this.aByteArray5[this.anInt232 - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(II)V")
	public final void method215(@OriginalArg(0) int arg0) {
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 8);
		this.aByteArray5[this.anInt232++] = (byte) arg0;
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 24);
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(B)I")
	public final int method216() {
		@Pc(16) int local16 = this.aByteArray5[this.anInt232] & 0xFF;
		return local16 < 128 ? this.method191() - 64 : this.method208() + -49152;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method217(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(12) int local12 = this.anInt232;
		this.anInt232 = 0;
		@Pc(18) byte[] local18 = new byte[local12];
		this.method178(local12, local18);
		@Pc(29) BigInteger local29 = new BigInteger(local18);
		@Pc(34) BigInteger local34 = local29.modPow(arg1, arg0);
		@Pc(37) byte[] local37 = local34.toByteArray();
		this.anInt232 = 0;
		this.method206(local37.length);
		this.method200(local37.length, local37);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IZ)V")
	public final void method218(@OriginalArg(0) int arg0) {
		this.aByteArray5[this.anInt232++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(II)V")
	public final void method219(@OriginalArg(0) int arg0) {
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 16);
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 24);
		this.aByteArray5[this.anInt232++] = (byte) arg0;
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(Z)I")
	public final int method220() {
		this.anInt232 += 2;
		@Pc(36) int local36 = (this.aByteArray5[this.anInt232 - 1] & 0xFF) + ((this.aByteArray5[this.anInt232 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "(II)V")
	public final void method222(@OriginalArg(1) int arg0) {
		this.aByteArray5[this.anInt232 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "(I)I")
	public final int method223() {
		return this.aByteArray5[this.anInt232++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "(II)V")
	public final void method224(@OriginalArg(1) int arg0) {
		this.aByteArray5[this.anInt232++] = (byte) arg0;
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 8);
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 16);
		this.aByteArray5[this.anInt232++] = (byte) (arg0 >> 24);
	}
}

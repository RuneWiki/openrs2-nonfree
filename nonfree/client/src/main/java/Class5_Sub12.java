import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public class Class5_Sub12 extends Class5 {

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
	public int anInt10154;

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "[B")
	public byte[] aByteArray104;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I)V")
	public Class5_Sub12(@OriginalArg(0) int arg0) {
		this.anInt10154 = 0;
		this.aByteArray104 = Static31.method614(arg0);
	}

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "([B)V")
	public Class5_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aByteArray104 = arg0;
		this.anInt10154 = 0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)B")
	public final byte method8592() {
		return (byte) -this.aByteArray104[this.anInt10154++];
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)I")
	public final int method8593() {
		this.anInt10154 += 3;
		return (this.aByteArray104[this.anInt10154 - 2] & 0xFF) + ((this.aByteArray104[this.anInt10154 - 3] & 0xFF) << 16) + ((this.aByteArray104[this.anInt10154 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
	public final void method8594(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method8647(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method8655(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)I")
	public final int method8595() {
		this.anInt10154 += 2;
		@Pc(32) int local32 = ((this.aByteArray104[this.anInt10154 - 2] & 0xFF) << 8) + (this.aByteArray104[this.anInt10154 - 1] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)V")
	public final void method8596(@OriginalArg(0) int arg0) {
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 + 128);
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(II)V")
	public final void method8597(@OriginalArg(0) int arg0) {
		this.aByteArray104[this.anInt10154 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray104[this.anInt10154 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray104[this.anInt10154 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray104[this.anInt10154 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(JII)V")
	public final void method8598(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(29) int local29 = local2 * 8; local29 >= 0; local29 -= 8) {
			this.aByteArray104[this.anInt10154++] = (byte) (int) (arg0 >> local29);
		}
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(II)J")
	public final long method8599(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(26) int local26 = local6 * 8;
		@Pc(28) long local28 = 0L;
		while (local26 >= 0) {
			local28 |= ((long) this.aByteArray104[this.anInt10154++] & 0xFFL) << local26;
			local26 -= 8;
		}
		return local28;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I")
	public final int method8600() {
		@Pc(16) byte local16 = this.aByteArray104[this.anInt10154++];
		@Pc(23) int local23 = 0;
		while (local16 < 0) {
			local23 = (local23 | local16 & 0x7F) << 7;
			local16 = this.aByteArray104[this.anInt10154++];
		}
		return local23 | local16;
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(B)I")
	public final int method8601() {
		this.anInt10154 += 4;
		return ((this.aByteArray104[this.anInt10154 - 1] & 0xFF) << 16) + (((this.aByteArray104[this.anInt10154 - 2] & 0xFF) << 24) + ((this.aByteArray104[this.anInt10154 - 4] & 0xFF) << 8) + (this.aByteArray104[this.anInt10154 - 3] & 0xFF));
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)V")
	public final void method8602(@OriginalArg(1) int arg0) {
		this.aByteArray104[this.anInt10154++] = (byte) arg0;
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 8);
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 16);
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[IZI)V")
	public final void method8603(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(13) int local13 = this.anInt10154;
		this.anInt10154 = 5;
		@Pc(23) int local23 = (arg0 - 5) / 8;
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) int local31 = this.method8623();
			@Pc(35) int local35 = this.method8623();
			@Pc(37) int local37 = -957401312;
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local35 -= local31 + (local31 >>> 5 ^ local31 << 4) ^ local37 + arg1[local37 >>> 11 & 0x61200003];
				local37 -= -1640531527;
				local31 -= arg1[local37 & 0x3] + local37 ^ (local35 >>> 5 ^ local35 << 4) + local35;
			}
			this.anInt10154 -= 8;
			this.method8622(local31);
			this.method8622(local35);
		}
		this.anInt10154 = local13;
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(II)V")
	public final void method8604(@OriginalArg(0) int arg0) {
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 8);
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI)V")
	public final void method8605(@OriginalArg(1) int arg0) {
		this.aByteArray104[this.anInt10154++] = (byte) arg0;
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)I")
	public final int method8606() {
		this.anInt10154 += 2;
		return ((this.aByteArray104[this.anInt10154 - 1] & 0xFF) << 8) + (this.aByteArray104[this.anInt10154 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(B)I")
	public final int method8607() {
		return this.aByteArray104[this.anInt10154++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)V")
	public final void method8609(@OriginalArg(0) int arg0) {
		this.aByteArray104[this.anInt10154++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(BI)V")
	public final void method8611(@OriginalArg(1) int arg0) {
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 16);
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 24);
		this.aByteArray104[this.anInt10154++] = (byte) arg0;
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(IB)V")
	public final void method8612(@OriginalArg(0) int arg0) {
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(II)V")
	public final void method8613(@OriginalArg(0) int arg0) {
		this.aByteArray104[this.anInt10154++] = (byte) arg0;
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 8);
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 16);
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(B)I")
	public final int method8614() {
		@Pc(11) int local11 = this.aByteArray104[this.anInt10154] & 0xFF;
		return local11 >= 128 ? this.method8631() - 32768 : this.method8645();
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(Z)I")
	public final int method8615() {
		return -this.aByteArray104[this.anInt10154++] & 0xFF;
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(BI)V")
	public final void method8616(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method8647(arg0 >>> 28 | 0x80);
					}
					this.method8647(arg0 >>> 21 | 0x80);
				}
				this.method8647(arg0 >>> 14 | 0x80);
			}
			this.method8647(arg0 >>> 7 | 0x80);
		}
		this.method8647(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)Ljava/lang/String;")
	public final String method8617() {
		@Pc(6) int local6 = this.anInt10154;
		while (this.aByteArray104[this.anInt10154++] != 0) {
		}
		@Pc(33) int local33 = this.anInt10154 - local6 - 1;
		return local33 == 0 ? "" : Static62.method1073(local6, local33, this.aByteArray104);
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)Ljava/lang/String;")
	public final String method8618() {
		if (this.aByteArray104[this.anInt10154] == 0) {
			this.anInt10154++;
			return null;
		} else {
			return this.method8617();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method8619(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt10154 += Static433.method6472(this.aByteArray104, arg0, arg0.length(), this.anInt10154);
		this.aByteArray104[this.anInt10154++] = 0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([IIBI)V")
	public final void method8620(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt10154;
		this.anInt10154 = arg2;
		@Pc(18) int local18 = (arg1 - arg2) / 8;
		for (@Pc(29) int local29 = 0; local29 < local18; local29++) {
			@Pc(35) int local35 = this.method8623();
			@Pc(39) int local39 = this.method8623();
			@Pc(41) int local41 = 0;
			@Pc(45) int local45 = 32;
			while (local45-- > 0) {
				local35 += local39 + (local39 >>> 5 ^ local39 << 4) ^ local41 - -arg0[local41 & 0x3];
				local41 += -1640531527;
				local39 += (local35 >>> 5 ^ local35 << 4) + local35 ^ local41 + arg0[local41 >>> 11 & 0x3];
			}
			this.anInt10154 -= 8;
			this.method8622(local35);
			this.method8622(local39);
		}
		this.anInt10154 = local8;
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(BI)V")
	public final void method8621(@OriginalArg(1) int arg0) {
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 16);
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 8);
		this.aByteArray104[this.anInt10154++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(II)V")
	public final void method8622(@OriginalArg(1) int arg0) {
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 24);
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 16);
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 8);
		this.aByteArray104[this.anInt10154++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(Z)I")
	public final int method8623() {
		this.anInt10154 += 4;
		return (this.aByteArray104[this.anInt10154 - 1] & 0xFF) + ((this.aByteArray104[this.anInt10154 - 2] & 0xFF) << 8) + ((this.aByteArray104[-4 + this.anInt10154] & 0xFF) << 24) + ((this.aByteArray104[this.anInt10154 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "(B)I")
	public final int method8624() {
		this.anInt10154 += 4;
		return ((this.aByteArray104[this.anInt10154 - 3] & 0xFF) << 8) + (this.aByteArray104[this.anInt10154 - 1] << 24 & 0xFF000000) + ((this.aByteArray104[this.anInt10154 + -2] & 0xFF) << 16) + (this.aByteArray104[this.anInt10154 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([BIII)V")
	public final void method8625(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = arg1; local3 < arg2 + arg1; local3++) {
			arg0[local3] = this.aByteArray104[this.anInt10154++];
		}
	}

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)I")
	public final int method8626() {
		this.anInt10154 += 3;
		@Pc(44) int local44 = (this.aByteArray104[this.anInt10154 - 1] & 0xFF) + (((this.aByteArray104[this.anInt10154 - 3] & 0xFF) << 16) + ((this.aByteArray104[this.anInt10154 - 2] & 0xFF) << 8));
		if (local44 > 8388607) {
			local44 -= 16777216;
		}
		return local44;
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)I")
	public final int method8627() {
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = this.method8614();
		while (local19 == 32767) {
			local19 = this.method8614();
			local15 += 32767;
		}
		return local15 + local19;
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(IB)V")
	public final void method8628(@OriginalArg(0) int arg0) {
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 8);
		this.aByteArray104[this.anInt10154++] = (byte) arg0;
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 24);
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "(B)I")
	public final int method8629() {
		this.anInt10154 += 4;
		return (this.aByteArray104[this.anInt10154 - 4] & 0xFF) + ((this.aByteArray104[this.anInt10154 - 1] & 0xFF) << 24) + ((this.aByteArray104[this.anInt10154 - 2] & 0xFF) << 16) + ((this.aByteArray104[this.anInt10154 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method8630(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt10154;
		this.anInt10154 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method8625(local12, 0, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt10154 = 0;
		this.method8655(local31.length);
		this.method8651(0, local31, local31.length);
	}

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "(I)I")
	public final int method8631() {
		this.anInt10154 += 2;
		return (this.aByteArray104[this.anInt10154 - 1] & 0xFF) + ((this.aByteArray104[this.anInt10154 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(IZ)I")
	public final int method8632(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static199.method6981(this.anInt10154, arg0, this.aByteArray104);
		this.method8622(local11);
		return local11;
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(Z)I")
	public final int method8633() {
		this.anInt10154 += 2;
		return ((this.aByteArray104[this.anInt10154 - 1] & 0xFF) << 8) + (this.aByteArray104[this.anInt10154 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "(B)I")
	public final int method8634() {
		this.anInt10154 += 2;
		@Pc(33) int local33 = (this.aByteArray104[this.anInt10154 - 2] - 128 & 0xFF) + ((this.aByteArray104[this.anInt10154 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "(I)B")
	public final byte method8635() {
		return this.aByteArray104[this.anInt10154++];
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[BZI)V")
	public final void method8636(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(7) int local7 = arg0 - 1; local7 >= 0; local7--) {
			arg1[local7] = (byte) (this.aByteArray104[this.anInt10154++] - 128);
		}
	}

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "(I)V")
	public final void method8637() {
		if (this.aByteArray104 != null) {
			Static31.method613(this.aByteArray104);
		}
		this.aByteArray104 = null;
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(BI)V")
	public final void method8638(@OriginalArg(1) int arg0) {
		this.aByteArray104[this.anInt10154++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "(B)I")
	public final int method8639() {
		return 128 - this.aByteArray104[this.anInt10154++] & 0xFF;
	}

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "(I)I")
	public final int method8640() {
		this.anInt10154 += 2;
		return (this.aByteArray104[this.anInt10154 - 1] - 128 & 0xFF) + ((this.aByteArray104[this.anInt10154 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "(I)I")
	public final int method8641() {
		this.anInt10154 += 2;
		@Pc(38) int local38 = ((this.aByteArray104[this.anInt10154 - 1] & 0xFF) << 8) + (this.aByteArray104[this.anInt10154 - 2] & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "(II)V")
	public final void method8642(@OriginalArg(0) int arg0) {
		this.aByteArray104[this.anInt10154 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray104[this.anInt10154 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "(II)V")
	public final void method8643(@OriginalArg(0) int arg0) {
		this.aByteArray104[this.anInt10154++] = (byte) arg0;
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "(I)J")
	public final long method8644() {
		@Pc(10) long local10 = (long) this.method8623() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method8623() & 0xFFFFFFFFL;
		return local17 + (local10 << 32);
	}

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "(B)I")
	public final int method8645() {
		return this.aByteArray104[this.anInt10154++] & 0xFF;
	}

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "(B)I")
	public final int method8646() {
		@Pc(11) int local11 = this.aByteArray104[this.anInt10154] & 0xFF;
		return local11 >= 128 ? this.method8631() - 49152 : this.method8645() + -64;
	}

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "(II)V")
	public final void method8647(@OriginalArg(1) int arg0) {
		this.aByteArray104[this.anInt10154++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "(I)Ljava/lang/String;")
	public final String method8648() {
		@Pc(14) byte local14 = this.aByteArray104[this.anInt10154++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt10154;
		while (this.aByteArray104[this.anInt10154++] != 0) {
		}
		@Pc(51) int local51 = this.anInt10154 - local27 - 1;
		return local51 == 0 ? "" : Static62.method1073(local27, local51, this.aByteArray104);
	}

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "(I)B")
	public final byte method8649() {
		return (byte) (128 - this.aByteArray104[this.anInt10154++]);
	}

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "(I)I")
	public final int method8650() {
		this.anInt10154 += 4;
		return ((this.aByteArray104[this.anInt10154 - 1] & 0xFF) << 8) + (((this.aByteArray104[this.anInt10154 - 3] & 0xFF) << 24) + (this.aByteArray104[this.anInt10154 - 4] << 16 & 0xFF0000)) + (this.aByteArray104[this.anInt10154 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB[BI)V")
	public final void method8651(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = arg0; local3 < arg2 + arg0; local3++) {
			this.aByteArray104[this.anInt10154++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "(II)V")
	public final void method8652(@OriginalArg(1) int arg0) {
		this.aByteArray104[this.anInt10154 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IJ)V")
	public final void method8653(@OriginalArg(1) long arg0) {
		this.aByteArray104[this.anInt10154++] = (byte) (int) (arg0 >> 56);
		this.aByteArray104[this.anInt10154++] = (byte) (int) (arg0 >> 48);
		this.aByteArray104[this.anInt10154++] = (byte) (int) (arg0 >> 40);
		this.aByteArray104[this.anInt10154++] = (byte) (int) (arg0 >> 32);
		this.aByteArray104[this.anInt10154++] = (byte) (int) (arg0 >> 24);
		this.aByteArray104[this.anInt10154++] = (byte) (int) (arg0 >> 16);
		this.aByteArray104[this.anInt10154++] = (byte) (int) (arg0 >> 8);
		this.aByteArray104[this.anInt10154++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "(B)J")
	public final long method8654() {
		@Pc(10) long local10 = (long) this.method8624() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method8624() & 0xFFFFFFFFL;
		return local10 + (local22 << 32);
	}

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "(II)V")
	public final void method8655(@OriginalArg(1) int arg0) {
		this.aByteArray104[this.anInt10154++] = (byte) (arg0 >> 8);
		this.aByteArray104[this.anInt10154++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public final void method8656(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray104[this.anInt10154++] = 0;
		this.anInt10154 += Static433.method6472(this.aByteArray104, arg0, arg0.length(), this.anInt10154);
		this.aByteArray104[this.anInt10154++] = 0;
	}

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "(I)I")
	public final int method8657() {
		this.anInt10154 += 3;
		return ((this.aByteArray104[this.anInt10154 - 2] & 0xFF) << 8) + (((this.aByteArray104[this.anInt10154 - 3] & 0xFF) << 16) + (this.aByteArray104[this.anInt10154 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "(I)B")
	public final byte method8658() {
		return (byte) (this.aByteArray104[this.anInt10154++] - 128);
	}

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "(I)Z")
	public final boolean method8659() {
		this.anInt10154 -= 4;
		@Pc(17) int local17 = Static199.method6981(this.anInt10154, 0, this.aByteArray104);
		@Pc(21) int local21 = this.method8623();
		return local21 == local17;
	}
}

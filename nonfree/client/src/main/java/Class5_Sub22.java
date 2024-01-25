import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ofa")
public class Class5_Sub22 extends Class5 {

	@OriginalMember(owner = "client!ofa", name = "y", descriptor = "[B")
	public byte[] aByteArray71;

	@OriginalMember(owner = "client!ofa", name = "p", descriptor = "I")
	public int anInt6629;

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(I)V")
	public Class5_Sub22(@OriginalArg(0) int arg0) {
		this.aByteArray71 = Static333.method5010(arg0);
		this.anInt6629 = 0;
	}

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "([B)V")
	public Class5_Sub22(@OriginalArg(0) byte[] arg0) {
		this.aByteArray71 = arg0;
		this.anInt6629 = 0;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)I")
	public final int method5903() {
		return 128 - this.aByteArray71[this.anInt6629++] & 0xFF;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IB)V")
	public final void method5904(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 + 128);
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "(II)V")
	public final void method5905(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt6629++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(I)J")
	public final long method5907() {
		@Pc(15) long local15 = (long) this.method5913() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method5913() & 0xFFFFFFFFL;
		return (local15 << 32) + local24;
	}

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "(I)I")
	public final int method5908() {
		this.anInt6629 += 2;
		@Pc(38) int local38 = ((this.aByteArray71[this.anInt6629 - 1] & 0xFF) << 8) + (this.aByteArray71[this.anInt6629 - 2] - 128 & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ofa", name = "f", descriptor = "(I)B")
	public final byte method5909() {
		return (byte) (128 - this.aByteArray71[this.anInt6629++]);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method5910(@OriginalArg(1) String arg0) {
		@Pc(12) int local12 = arg0.indexOf(0);
		if (local12 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local12 + " - cannot pjstr");
		}
		this.anInt6629 += Static334.method5084(arg0.length(), this.aByteArray71, arg0, this.anInt6629);
		this.aByteArray71[this.anInt6629++] = 0;
	}

	@OriginalMember(owner = "client!ofa", name = "g", descriptor = "(I)I")
	public final int method5911() {
		this.anInt6629 += 4;
		return ((this.aByteArray71[this.anInt6629 - 3] & 0xFF) << 8) + ((this.aByteArray71[this.anInt6629 - 2] & 0xFF) << 16) + ((this.aByteArray71[-1 + this.anInt6629] & 0xFF) << 24) + (this.aByteArray71[this.anInt6629 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!ofa", name = "d", descriptor = "(II)V")
	public final void method5912(@OriginalArg(1) int arg0) {
		if ((-128 & arg0) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5905(arg0 >>> 28 | 0x80);
					}
					this.method5905(arg0 >>> 21 | 0x80);
				}
				this.method5905(arg0 >>> 14 | 0x80);
			}
			this.method5905(arg0 >>> 7 | 0x80);
		}
		this.method5905(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ofa", name = "h", descriptor = "(I)I")
	public final int method5913() {
		this.anInt6629 += 4;
		return (this.aByteArray71[this.anInt6629 - 1] & 0xFF) + ((this.aByteArray71[this.anInt6629 - 3] & 0xFF) << 16) + ((this.aByteArray71[this.anInt6629 - 4] & 0xFF) << 24) + ((this.aByteArray71[this.anInt6629 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(JII)V")
	public final void method5914(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(30) int local30 = local2 * 8; local30 >= 0; local30 -= 8) {
			this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> local30);
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(III[B)V")
	public final void method5915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		for (@Pc(9) int local9 = arg0; local9 < arg0 + arg1; local9++) {
			arg2[local9] = this.aByteArray71[this.anInt6629++];
		}
	}

	@OriginalMember(owner = "client!ofa", name = "i", descriptor = "(I)I")
	public final int method5916() {
		this.anInt6629 += 4;
		return ((this.aByteArray71[this.anInt6629 - 3] & 0xFF) << 8) + ((this.aByteArray71[this.anInt6629 - 2] & 0xFF) << 16) + ((this.aByteArray71[this.anInt6629 - 1] & 0xFF) << 24) + (this.aByteArray71[this.anInt6629 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!ofa", name = "j", descriptor = "(I)I")
	public final int method5917() {
		this.anInt6629 += 2;
		return (this.aByteArray71[this.anInt6629 - 2] - 128 & 0xFF) + ((this.aByteArray71[this.anInt6629 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ofa", name = "e", descriptor = "(II)V")
	public final void method5918(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt6629++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(III[I)V")
	public final void method5919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = this.anInt6629;
		this.anInt6629 = arg1;
		@Pc(25) int local25 = (arg0 - arg1) / 8;
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(35) int local35 = this.method5913();
			@Pc(39) int local39 = this.method5913();
			@Pc(41) int local41 = 0;
			@Pc(45) int local45 = 32;
			while (local45-- > 0) {
				local35 += (local39 << 4 ^ local39 >>> 5) + local39 ^ local41 - -arg2[local41 & 0x3];
				local41 += -1640531527;
				local39 += arg2[local41 >>> 11 & 0x3E800003] + local41 ^ (local35 << 4 ^ local35 >>> 5) + local35;
			}
			this.anInt6629 -= 8;
			this.method5949(local35);
			this.method5949(local39);
		}
		this.anInt6629 = local15;
	}

	@OriginalMember(owner = "client!ofa", name = "k", descriptor = "(I)I")
	public final int method5920() {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9;
		for (local9 = this.method5947(); local9 == 32767; local9 = this.method5947()) {
			local5 += 32767;
		}
		return local5 + local9;
	}

	@OriginalMember(owner = "client!ofa", name = "l", descriptor = "(I)Z")
	public final boolean method5921() {
		this.anInt6629 -= 4;
		@Pc(17) int local17 = Static71.method1207(0, this.anInt6629, this.aByteArray71);
		@Pc(29) int local29 = this.method5913();
		return local29 == local17;
	}

	@OriginalMember(owner = "client!ofa", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String method5923() {
		@Pc(20) byte local20 = this.aByteArray71[this.anInt6629++];
		if (local20 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(30) int local30 = this.anInt6629;
		while (this.aByteArray71[this.anInt6629++] != 0) {
		}
		@Pc(50) int local50 = this.anInt6629 - local30 - 1;
		return local50 == 0 ? "" : Static392.method5817(this.aByteArray71, local30, local50);
	}

	@OriginalMember(owner = "client!ofa", name = "n", descriptor = "(I)I")
	public final int method5924() {
		return -this.aByteArray71[this.anInt6629++] & 0xFF;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I[BII)V")
	public final void method5925(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(12) int local12 = arg1; local12 < arg1 + arg2; local12++) {
			this.aByteArray71[this.anInt6629++] = arg0[local12];
		}
	}

	@OriginalMember(owner = "client!ofa", name = "e", descriptor = "(B)I")
	public final int method5926() {
		this.anInt6629 += 3;
		@Pc(44) int local44 = ((this.aByteArray71[this.anInt6629 - 3] & 0xFF) << 16) + (((this.aByteArray71[this.anInt6629 - 2] & 0xFF) << 8) + (this.aByteArray71[this.anInt6629 - 1] & 0xFF));
		if (local44 > 8388607) {
			local44 -= 16777216;
		}
		return local44;
	}

	@OriginalMember(owner = "client!ofa", name = "f", descriptor = "(II)V")
	public final void method5927(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(II[II)V")
	public final void method5928(@OriginalArg(2) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(6) int local6 = this.anInt6629;
		this.anInt6629 = 5;
		@Pc(16) int local16 = (arg1 - 5) / 8;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(23) int local23 = this.method5913();
			@Pc(29) int local29 = this.method5913();
			@Pc(31) int local31 = -957401312;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local29 -= (local23 << 4 ^ local23 >>> 5) + local23 ^ local31 + arg0[local31 >>> 11 & 0x3];
				local31 -= -1640531527;
				local23 -= local29 + (local29 << 4 ^ local29 >>> 5) ^ arg0[local31 & 0x3] + local31;
			}
			this.anInt6629 -= 8;
			this.method5949(local23);
			this.method5949(local29);
		}
		this.anInt6629 = local6;
	}

	@OriginalMember(owner = "client!ofa", name = "g", descriptor = "(II)V")
	public final void method5929(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt6629++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ofa", name = "f", descriptor = "(B)J")
	public final long method5930() {
		@Pc(18) long local18 = (long) this.method5911() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method5911() & 0xFFFFFFFFL;
		return local18 + (local25 << 32);
	}

	@OriginalMember(owner = "client!ofa", name = "o", descriptor = "(I)I")
	public final int method5931() {
		this.anInt6629 += 3;
		return (this.aByteArray71[this.anInt6629 - 1] & 0xFF) + ((this.aByteArray71[this.anInt6629 - 2] & 0xFF) << 8) + ((this.aByteArray71[this.anInt6629 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ofa", name = "h", descriptor = "(II)V")
	public final void method5932(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5905(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5918(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method5933(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.indexOf(0);
		if (local13 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local13 + " - cannot pjstr2");
		}
		this.aByteArray71[this.anInt6629++] = 0;
		this.anInt6629 += Static334.method5084(arg0.length(), this.aByteArray71, arg0, this.anInt6629);
		this.aByteArray71[this.anInt6629++] = 0;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BI)V")
	public final void method5934(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt6629++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(IB)V")
	public final void method5935(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt6629++] = (byte) arg0;
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ofa", name = "p", descriptor = "(I)Ljava/lang/String;")
	public final String method5937() {
		@Pc(6) int local6 = this.anInt6629;
		while (this.aByteArray71[this.anInt6629++] != 0) {
		}
		@Pc(26) int local26 = this.anInt6629 - local6 - 1;
		return local26 == 0 ? "" : Static392.method5817(this.aByteArray71, local6, local26);
	}

	@OriginalMember(owner = "client!ofa", name = "i", descriptor = "(II)V")
	public final void method5938(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ofa", name = "g", descriptor = "(B)I")
	public final int method5939() {
		@Pc(24) byte local24 = this.aByteArray71[this.anInt6629++];
		@Pc(26) int local26 = 0;
		while (local24 < 0) {
			local26 = (local24 & 0x7F | local26) << 7;
			local24 = this.aByteArray71[this.anInt6629++];
		}
		return local26 | local24;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Z)I")
	public final int method5940() {
		this.anInt6629 += 2;
		return (this.aByteArray71[this.anInt6629 - 2] & 0xFF) + ((this.aByteArray71[this.anInt6629 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ofa", name = "j", descriptor = "(II)V")
	public final void method5941(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt6629++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ofa", name = "h", descriptor = "(B)Ljava/lang/String;")
	public final String method5942() {
		if (this.aByteArray71[this.anInt6629] == 0) {
			this.anInt6629++;
			return null;
		} else {
			return this.method5937();
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(JB)V")
	public final void method5943(@OriginalArg(0) long arg0) {
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 56);
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 48);
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 40);
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 32);
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 24);
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt6629++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ofa", name = "k", descriptor = "(II)V")
	public final void method5944(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt6629 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray71[this.anInt6629 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt6629 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt6629 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "(IB)J")
	public final long method5945(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 - 1;
		if (local9 < 0 || local9 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(31) int local31 = local9 * 8;
		@Pc(33) long local33 = 0L;
		while (local31 >= 0) {
			local33 |= ((long) this.aByteArray71[this.anInt6629++] & 0xFFL) << local31;
			local31 -= 8;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ofa", name = "q", descriptor = "(I)V")
	public final void method5946() {
		if (this.aByteArray71 != null) {
			Static333.method5012(this.aByteArray71);
		}
		this.aByteArray71 = null;
	}

	@OriginalMember(owner = "client!ofa", name = "i", descriptor = "(B)I")
	public final int method5947() {
		@Pc(16) int local16 = this.aByteArray71[this.anInt6629] & 0xFF;
		return local16 < 128 ? this.method5966() : this.method5968() - 32768;
	}

	@OriginalMember(owner = "client!ofa", name = "d", descriptor = "(IB)V")
	public final void method5948(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt6629++] = (byte) arg0;
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(BI)V")
	public final void method5949(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 24);
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt6629++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(III[B)V")
	public final void method5950(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = arg0 - 1; local7 >= 0; local7--) {
			arg1[local7] = this.aByteArray71[this.anInt6629++];
		}
	}

	@OriginalMember(owner = "client!ofa", name = "r", descriptor = "(I)I")
	public final int method5951() {
		this.anInt6629 += 2;
		return (this.aByteArray71[this.anInt6629 - 1] - 128 & 0xFF) + ((this.aByteArray71[this.anInt6629 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ZI)V")
	public final void method5952(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt6629 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt6629 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ofa", name = "s", descriptor = "(I)I")
	public final int method5953() {
		this.anInt6629 += 4;
		return (this.aByteArray71[this.anInt6629 - 3] & 0xFF) + ((this.aByteArray71[this.anInt6629 - 1] & 0xFF) << 16) + ((this.aByteArray71[this.anInt6629 - 2] & 0xFF) << 24) + ((this.aByteArray71[this.anInt6629 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ofa", name = "l", descriptor = "(II)V")
	public final void method5954(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt6629++] = (byte) arg0;
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method5955(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt6629;
		this.anInt6629 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method5915(0, local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt6629 = 0;
		this.method5918(local31.length);
		this.method5925(local31, 0, local31.length);
	}

	@OriginalMember(owner = "client!ofa", name = "j", descriptor = "(B)I")
	public final int method5956() {
		this.anInt6629 += 2;
		@Pc(31) int local31 = (this.aByteArray71[this.anInt6629 - 1] & 0xFF) + ((this.aByteArray71[this.anInt6629 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ofa", name = "t", descriptor = "(I)I")
	public final int method5957() {
		this.anInt6629 += 4;
		return (this.aByteArray71[this.anInt6629 - 2] & 0xFF) + ((this.aByteArray71[this.anInt6629 - 1] & 0xFF) << 8) + ((this.aByteArray71[this.anInt6629 - 4] & 0xFF) << 16) + ((this.aByteArray71[this.anInt6629 - 3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ofa", name = "k", descriptor = "(B)B")
	public final byte method5958() {
		return (byte) -this.aByteArray71[this.anInt6629++];
	}

	@OriginalMember(owner = "client!ofa", name = "e", descriptor = "(IB)V")
	public final void method5959(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 24);
		this.aByteArray71[this.anInt6629++] = (byte) arg0;
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ofa", name = "f", descriptor = "(IB)I")
	public final int method5960(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static71.method1207(arg0, this.anInt6629, this.aByteArray71);
		this.method5949(local16);
		return local16;
	}

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "(BI)V")
	public final void method5961(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt6629++] = (byte) arg0;
		this.aByteArray71[this.anInt6629++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ofa", name = "u", descriptor = "(I)B")
	public final byte method5962() {
		return (byte) (this.aByteArray71[this.anInt6629++] - 128);
	}

	@OriginalMember(owner = "client!ofa", name = "v", descriptor = "(I)B")
	public final byte method5963() {
		return this.aByteArray71[this.anInt6629++];
	}

	@OriginalMember(owner = "client!ofa", name = "w", descriptor = "(I)I")
	public final int method5964() {
		@Pc(20) int local20 = this.aByteArray71[this.anInt6629] & 0xFF;
		return local20 < 128 ? this.method5966() - 64 : this.method5968() - 49152;
	}

	@OriginalMember(owner = "client!ofa", name = "m", descriptor = "(II)V")
	public final void method5965(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt6629 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ofa", name = "x", descriptor = "(I)I")
	public final int method5966() {
		return this.aByteArray71[this.anInt6629++] & 0xFF;
	}

	@OriginalMember(owner = "client!ofa", name = "y", descriptor = "(I)I")
	public final int method5967() {
		return this.aByteArray71[this.anInt6629++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ofa", name = "l", descriptor = "(B)I")
	public final int method5968() {
		this.anInt6629 += 2;
		return ((this.aByteArray71[this.anInt6629 - 2] & 0xFF) << 8) + (this.aByteArray71[this.anInt6629 - 1] & 0xFF);
	}
}

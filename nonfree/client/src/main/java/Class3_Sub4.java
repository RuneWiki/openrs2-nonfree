import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
	public int anInt9739;

	@OriginalMember(owner = "client!dt", name = "Bb", descriptor = "[B")
	public byte[] aByteArray90;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4(@OriginalArg(0) int arg0) {
		this.anInt9739 = 0;
		this.aByteArray90 = Static411.method5617(arg0);
	}

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "([B)V")
	public Class3_Sub4(@OriginalArg(0) byte[] arg0) {
		this.aByteArray90 = arg0;
		this.anInt9739 = 0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)I")
	public final int method7892() {
		@Pc(11) int local11 = this.aByteArray90[this.anInt9739] & 0xFF;
		return local11 >= 128 ? this.method7951() - 49152 : this.method7954() + -64;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IJ)V")
	public final void method7893(@OriginalArg(1) long arg0) {
		this.aByteArray90[this.anInt9739++] = (byte) (int) (arg0 >> 56);
		this.aByteArray90[this.anInt9739++] = (byte) (int) (arg0 >> 48);
		this.aByteArray90[this.anInt9739++] = (byte) (int) (arg0 >> 40);
		this.aByteArray90[this.anInt9739++] = (byte) (int) (arg0 >> 32);
		this.aByteArray90[this.anInt9739++] = (byte) (int) (arg0 >> 24);
		this.aByteArray90[this.anInt9739++] = (byte) (int) (arg0 >> 16);
		this.aByteArray90[this.anInt9739++] = (byte) (int) (arg0 >> 8);
		this.aByteArray90[this.anInt9739++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)I")
	public final int method7894() {
		this.anInt9739 += 2;
		@Pc(39) int local39 = (this.aByteArray90[this.anInt9739 - 1] - 128 & 0xFF) + ((this.aByteArray90[this.anInt9739 - 2] & 0xFF) << 8);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)I")
	public final int method7895() {
		this.anInt9739 += 4;
		return ((this.aByteArray90[this.anInt9739 - 2] & 0xFF) << 8) + ((this.aByteArray90[this.anInt9739 - 3] & 0xFF) << 16) + ((this.aByteArray90[this.anInt9739 + -4] & 0xFF) << 24) + (this.aByteArray90[this.anInt9739 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(I)I")
	public final int method7896() {
		@Pc(17) int local17 = this.aByteArray90[this.anInt9739] & 0xFF;
		return local17 >= 128 ? this.method7951() - 32768 : this.method7954();
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)J")
	public final long method7897(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(24) int local24 = local2 * 8;
		@Pc(26) long local26 = 0L;
		while (local24 >= 0) {
			local26 |= ((long) this.aByteArray90[this.anInt9739++] & 0xFFL) << local24;
			local24 -= 8;
		}
		return local26;
	}

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "(I)I")
	public final int method7899() {
		return this.aByteArray90[this.anInt9739++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method7900(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray90[this.anInt9739++] = 0;
		this.anInt9739 += Static194.method3005(this.aByteArray90, arg0.length(), this.anInt9739, arg0);
		this.aByteArray90[this.anInt9739++] = 0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method7901(@OriginalArg(0) String arg0) {
		@Pc(12) int local12 = arg0.indexOf(0);
		if (local12 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local12 + " - cannot pjstr");
		}
		this.anInt9739 += Static194.method3005(this.aByteArray90, arg0.length(), this.anInt9739, arg0);
		this.aByteArray90[this.anInt9739++] = 0;
	}

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "(I)I")
	public final int method7902() {
		this.anInt9739 += 4;
		return (this.aByteArray90[this.anInt9739 - 4] & 0xFF) + ((this.aByteArray90[this.anInt9739 - 3] & 0xFF) << 8) + ((this.aByteArray90[this.anInt9739 + -2] & 0xFF) << 16) + ((this.aByteArray90[-1 + this.anInt9739] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "(I)B")
	public final byte method7903() {
		return (byte) (128 - this.aByteArray90[this.anInt9739++]);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BI)V")
	public final void method7904(@OriginalArg(1) int arg0) {
		this.aByteArray90[this.anInt9739++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IB)V")
	public final void method7905(@OriginalArg(0) int arg0) {
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 16);
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 8);
		this.aByteArray90[this.anInt9739++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dt", name = "i", descriptor = "(I)B")
	public final byte method7906() {
		return (byte) -this.aByteArray90[this.anInt9739++];
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(IB)V")
	public final void method7908(@OriginalArg(0) int arg0) {
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 8);
		this.aByteArray90[this.anInt9739++] = (byte) arg0;
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 24);
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(II)V")
	public final void method7909(@OriginalArg(1) int arg0) {
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 24);
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 16);
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 8);
		this.aByteArray90[this.anInt9739++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "(I)B")
	public final byte method7910() {
		return (byte) (this.aByteArray90[this.anInt9739++] - 128);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IZ)V")
	public final void method7911(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method7948(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method7956(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(B)I")
	public final int method7912() {
		this.anInt9739 += 3;
		@Pc(43) int local43 = (this.aByteArray90[this.anInt9739 - 1] & 0xFF) + ((this.aByteArray90[this.anInt9739 - 2] & 0xFF) << 8) + ((this.aByteArray90[this.anInt9739 + -3] & 0xFF) << 16);
		if (local43 > 8388607) {
			local43 -= 16777216;
		}
		return local43;
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(II)V")
	public final void method7913(@OriginalArg(1) int arg0) {
		this.aByteArray90[this.anInt9739++] = (byte) arg0;
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 8);
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 16);
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!dt", name = "k", descriptor = "(I)I")
	public final int method7914() {
		return -this.aByteArray90[this.anInt9739++] & 0xFF;
	}

	@OriginalMember(owner = "client!dt", name = "l", descriptor = "(I)J")
	public final long method7916() {
		@Pc(15) long local15 = (long) this.method7902() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method7902() & 0xFFFFFFFFL;
		return (local22 << 32) + local15;
	}

	@OriginalMember(owner = "client!dt", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String method7917() {
		if (this.aByteArray90[this.anInt9739] == 0) {
			this.anInt9739++;
			return null;
		} else {
			return this.method7922();
		}
	}

	@OriginalMember(owner = "client!dt", name = "n", descriptor = "(I)I")
	public final int method7918() {
		this.anInt9739 += 2;
		@Pc(39) int local39 = ((this.aByteArray90[this.anInt9739 - 2] & 0xFF) << 8) + (this.aByteArray90[this.anInt9739 - 1] & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(IB)V")
	public final void method7919(@OriginalArg(0) int arg0) {
		this.aByteArray90[this.anInt9739++] = (byte) arg0;
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 8);
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 16);
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(IZ)V")
	public final void method7920(@OriginalArg(0) int arg0) {
		this.aByteArray90[this.anInt9739++] = (byte) arg0;
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "(B)I")
	public final int method7921() {
		this.anInt9739 += 4;
		return (this.aByteArray90[this.anInt9739 - 4] & 0xFF) + ((this.aByteArray90[this.anInt9739 - 2] & 0xFF) << 16) + ((this.aByteArray90[this.anInt9739 + -1] & 0xFF) << 24) + ((this.aByteArray90[this.anInt9739 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!dt", name = "o", descriptor = "(I)Ljava/lang/String;")
	public final String method7922() {
		@Pc(11) int local11 = this.anInt9739;
		while (this.aByteArray90[this.anInt9739++] != 0) {
		}
		@Pc(31) int local31 = this.anInt9739 - local11 - 1;
		return local31 == 0 ? "" : Static216.method3190(this.aByteArray90, local31, local11);
	}

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "(II)V")
	public final void method7923(@OriginalArg(0) int arg0) {
		this.aByteArray90[this.anInt9739 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray90[this.anInt9739 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)I")
	public final int method7925() {
		@Pc(16) byte local16 = this.aByteArray90[this.anInt9739++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local18 | local16 & 0x7F) << 7;
			local16 = this.aByteArray90[this.anInt9739++];
		}
		return local16 | local18;
	}

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "(B)I")
	public final int method7926() {
		this.anInt9739 += 2;
		return ((this.aByteArray90[this.anInt9739 - 1] & 0xFF) << 8) + (this.aByteArray90[this.anInt9739 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I[IIZ)V")
	public final void method7927(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(8) int local8 = this.anInt9739;
		this.anInt9739 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method7895();
			@Pc(30) int local30 = this.method7895();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= arg1[local32 >>> 11 & 0x3] + local32 ^ local26 + (local26 << 4 ^ local26 >>> 5);
				local32 -= -1640531527;
				local26 -= arg1[local32 & 0x3] + local32 ^ (local30 << 4 ^ local30 >>> 5) - -local30;
			}
			this.anInt9739 -= 8;
			this.method7909(local26);
			this.method7909(local30);
		}
		this.anInt9739 = local8;
	}

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "(B)Ljava/lang/String;")
	public final String method7928() {
		@Pc(22) byte local22 = this.aByteArray90[this.anInt9739++];
		if (local22 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(32) int local32 = this.anInt9739;
		while (this.aByteArray90[this.anInt9739++] != 0) {
		}
		@Pc(55) int local55 = this.anInt9739 - local32 - 1;
		return local55 == 0 ? "" : Static216.method3190(this.aByteArray90, local55, local32);
	}

	@OriginalMember(owner = "client!dt", name = "p", descriptor = "(I)I")
	public final int method7929() {
		this.anInt9739 += 4;
		return ((this.aByteArray90[this.anInt9739 - 3] & 0xFF) << 24) + (this.aByteArray90[this.anInt9739 - 4] << 16 & 0xFF0000) + ((this.aByteArray90[this.anInt9739 + -1] & 0xFF) << 8) + (this.aByteArray90[this.anInt9739 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!dt", name = "q", descriptor = "(I)I")
	public final int method7930() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method7896();
		while (local11 == 32767) {
			local11 = this.method7896();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(BI)I")
	public final int method7931(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = Static359.method5201(arg0, this.anInt9739, this.aByteArray90);
		this.method7909(local19);
		return local19;
	}

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "(II)V")
	public final void method7932(@OriginalArg(0) int arg0) {
		this.aByteArray90[this.anInt9739 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray90[this.anInt9739 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray90[this.anInt9739 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray90[this.anInt9739 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "(II)V")
	public final void method7933(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method7948(arg0 >>> 28 | 0x80);
					}
					this.method7948(arg0 >>> 21 | 0x80);
				}
				this.method7948(arg0 >>> 14 | 0x80);
			}
			this.method7948(arg0 >>> 7 | 0x80);
		}
		this.method7948(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!dt", name = "r", descriptor = "(I)I")
	public final int method7934() {
		return 128 - this.aByteArray90[this.anInt9739++] & 0xFF;
	}

	@OriginalMember(owner = "client!dt", name = "s", descriptor = "(I)I")
	public final int method7935() {
		this.anInt9739 += 2;
		return (this.aByteArray90[this.anInt9739 - 1] - 128 & 0xFF) + ((this.aByteArray90[this.anInt9739 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(BI)V")
	public final void method7936(@OriginalArg(1) int arg0) {
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 8);
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BII[B)V")
	public final void method7937(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(12) int local12 = arg0 - 1; local12 >= 0; local12--) {
			arg1[local12] = this.aByteArray90[this.anInt9739++];
		}
	}

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "(II)V")
	public final void method7938(@OriginalArg(1) int arg0) {
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "([BIIZ)V")
	public final void method7939(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(10) int local10 = arg2; local10 < arg1 + arg2; local10++) {
			this.aByteArray90[this.anInt9739++] = arg0[local10];
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(II[II)V")
	public final void method7940(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt9739;
		this.anInt9739 = arg2;
		@Pc(18) int local18 = (arg0 - arg2) / 8;
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			@Pc(35) int local35 = this.method7895();
			@Pc(39) int local39 = this.method7895();
			@Pc(41) int local41 = 0;
			@Pc(45) int local45 = 32;
			while (local45-- > 0) {
				local35 += (local39 >>> 5 ^ local39 << 4) + local39 ^ arg1[local41 & 0x3] + local41;
				local41 += -1640531527;
				local39 += local41 + arg1[local41 >>> 11 & 0x3] ^ (local35 << 4 ^ local35 >>> 5) - -local35;
			}
			this.anInt9739 -= 8;
			this.method7909(local35);
			this.method7909(local39);
		}
		this.anInt9739 = local8;
	}

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "(BI)V")
	public final void method7941(@OriginalArg(1) int arg0) {
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 + 128);
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "(II)V")
	public final void method7942(@OriginalArg(1) int arg0) {
		this.aByteArray90[this.anInt9739++] = (byte) arg0;
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dt", name = "i", descriptor = "(II)V")
	public final void method7943(@OriginalArg(1) int arg0) {
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 16);
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 24);
		this.aByteArray90[this.anInt9739++] = (byte) arg0;
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "(B)I")
	public final int method7944() {
		this.anInt9739 += 2;
		@Pc(33) int local33 = ((this.aByteArray90[this.anInt9739 - 1] & 0xFF) << 8) + (this.aByteArray90[this.anInt9739 - 2] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(Z)I")
	public final int method7945() {
		this.anInt9739 += 3;
		return (this.aByteArray90[this.anInt9739 - 1] & 0xFF) + ((this.aByteArray90[this.anInt9739 - 2] & 0xFF) << 8) + ((this.aByteArray90[this.anInt9739 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!dt", name = "t", descriptor = "(I)J")
	public final long method7946() {
		@Pc(17) long local17 = (long) this.method7895() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method7895() & 0xFFFFFFFFL;
		return (local17 << 32) + local24;
	}

	@OriginalMember(owner = "client!dt", name = "u", descriptor = "(I)I")
	public final int method7947() {
		this.anInt9739 += 4;
		return ((this.aByteArray90[this.anInt9739 - 2] & 0xFF) << 24) + ((this.aByteArray90[this.anInt9739 - 1] & 0xFF) << 16) + ((this.aByteArray90[this.anInt9739 + -4] & 0xFF) << 8) + (this.aByteArray90[this.anInt9739 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "(II)V")
	public final void method7948(@OriginalArg(0) int arg0) {
		this.aByteArray90[this.anInt9739++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "(BI)V")
	public final void method7949(@OriginalArg(1) int arg0) {
		this.aByteArray90[this.anInt9739 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method7950(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt9739;
		this.anInt9739 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method7958(0, local12, local6);
		@Pc(29) BigInteger local29 = new BigInteger(local12);
		@Pc(34) BigInteger local34 = local29.modPow(arg1, arg0);
		@Pc(37) byte[] local37 = local34.toByteArray();
		this.anInt9739 = 0;
		this.method7956(local37.length);
		this.method7939(local37, local37.length, 0);
	}

	@OriginalMember(owner = "client!dt", name = "i", descriptor = "(B)I")
	public final int method7951() {
		this.anInt9739 += 2;
		return ((this.aByteArray90[this.anInt9739 - 2] & 0xFF) << 8) + (this.aByteArray90[this.anInt9739 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!dt", name = "v", descriptor = "(I)Z")
	public final boolean method7952() {
		this.anInt9739 -= 4;
		@Pc(17) int local17 = Static359.method5201(0, this.anInt9739, this.aByteArray90);
		@Pc(21) int local21 = this.method7895();
		return local17 == local21;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(JII)V")
	public final void method7953(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg1 - 1;
		if (local9 < 0 || local9 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(31) int local31 = local9 * 8; local31 >= 0; local31 -= 8) {
			this.aByteArray90[this.anInt9739++] = (byte) (int) (arg0 >> local31);
		}
	}

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "(B)I")
	public final int method7954() {
		return this.aByteArray90[this.anInt9739++] & 0xFF;
	}

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "(IB)V")
	public final void method7955(@OriginalArg(0) int arg0) {
		this.aByteArray90[this.anInt9739++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!dt", name = "k", descriptor = "(II)V")
	public final void method7956(@OriginalArg(0) int arg0) {
		this.aByteArray90[this.anInt9739++] = (byte) (arg0 >> 8);
		this.aByteArray90[this.anInt9739++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dt", name = "w", descriptor = "(I)V")
	public final void method7957() {
		if (this.aByteArray90 != null) {
			Static411.method5619(this.aByteArray90);
		}
		this.aByteArray90 = null;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(II[BI)V")
	public final void method7958(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(15) int local15 = arg0; local15 < arg2 + arg0; local15++) {
			arg1[local15] = this.aByteArray90[this.anInt9739++];
		}
	}

	@OriginalMember(owner = "client!dt", name = "x", descriptor = "(I)I")
	public final int method7959() {
		this.anInt9739 += 2;
		return (this.aByteArray90[this.anInt9739 - 2] & 0xFF) + ((this.aByteArray90[this.anInt9739 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(Z)B")
	public final byte method7960() {
		return this.aByteArray90[this.anInt9739++];
	}

	@OriginalMember(owner = "client!dt", name = "y", descriptor = "(I)J")
	public final long method7961() {
		@Pc(15) long local15 = (long) this.method7954() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method7895() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}
}

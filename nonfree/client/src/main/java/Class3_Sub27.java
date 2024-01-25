import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public class Class3_Sub27 extends Class3 {

	@OriginalMember(owner = "client!rt", name = "eb", descriptor = "I")
	public int anInt9191;

	@OriginalMember(owner = "client!rt", name = "qb", descriptor = "[B")
	public byte[] aByteArray114;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(I)V")
	public Class3_Sub27(@OriginalArg(0) int arg0) {
		this.anInt9191 = 0;
		this.aByteArray114 = Static212.method3884(arg0);
	}

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "([B)V")
	public Class3_Sub27(@OriginalArg(0) byte[] arg0) {
		this.aByteArray114 = arg0;
		this.anInt9191 = 0;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)I")
	public final int method7545(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = Static41.method950(arg0, this.anInt9191, this.aByteArray114);
		this.method7594(local18);
		return local18;
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(II)V")
	public final void method7546(@OriginalArg(1) int arg0) {
		this.aByteArray114[this.anInt9191++] = (byte) arg0;
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 8);
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 16);
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)I")
	public final int method7547() {
		@Pc(19) int local19 = this.aByteArray114[this.anInt9191] & 0xFF;
		return local19 < 128 ? this.method7548() : this.method7591() - 32768;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)I")
	public final int method7548() {
		return this.aByteArray114[this.anInt9191++] & 0xFF;
	}

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "(I)I")
	public final int method7549() {
		this.anInt9191 += 4;
		return ((this.aByteArray114[this.anInt9191 - 4] & 0xFF) << 24) + (this.aByteArray114[this.anInt9191 + -1] & 0xFF) - (-((this.aByteArray114[this.anInt9191 - 3] & 0xFF) << 16) - ((this.aByteArray114[this.anInt9191 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "(I)I")
	public final int method7551() {
		this.anInt9191 += 3;
		return (this.aByteArray114[this.anInt9191 - 1] & 0xFF) + ((this.aByteArray114[this.anInt9191 - 2] & 0xFF) << 8) + ((this.aByteArray114[this.anInt9191 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(Z)I")
	public final int method7552() {
		@Pc(23) byte local23 = this.aByteArray114[this.anInt9191++];
		@Pc(25) int local25 = 0;
		while (local23 < 0) {
			local25 = (local25 | local23 & 0x7F) << 7;
			local23 = this.aByteArray114[this.anInt9191++];
		}
		return local23 | local25;
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(II)V")
	public final void method7553(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method7576(arg0 >>> 28 | 0x80);
					}
					this.method7576(arg0 >>> 21 | 0x80);
				}
				this.method7576(arg0 >>> 14 | 0x80);
			}
			this.method7576(arg0 >>> 7 | 0x80);
		}
		this.method7576(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "(I)I")
	public final int method7554() {
		this.anInt9191 += 3;
		@Pc(45) int local45 = ((this.aByteArray114[this.anInt9191 - 3] & 0xFF) << 16) - (-(this.aByteArray114[this.anInt9191 - 2] << 8 & 0xFF00) - (this.aByteArray114[this.anInt9191 - 1] & 0xFF));
		if (local45 > 8388607) {
			local45 -= 16777216;
		}
		return local45;
	}

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "(I)J")
	public final long method7555() {
		@Pc(10) long local10 = (long) this.method7549() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method7549() & 0xFFFFFFFFL;
		return (local10 << 32) + local25;
	}

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "(II)V")
	public final void method7556(@OriginalArg(0) int arg0) {
		this.aByteArray114[this.anInt9191++] = (byte) arg0;
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "(I)B")
	public final byte method7557() {
		return (byte) -this.aByteArray114[this.anInt9191++];
	}

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "(II)V")
	public final void method7559(@OriginalArg(0) int arg0) {
		this.aByteArray114[this.anInt9191 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BI)J")
	public final long method7560(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(22) int local22 = local0 * 8;
		@Pc(24) long local24 = 0L;
		while (local22 >= 0) {
			local24 |= ((long) this.aByteArray114[this.anInt9191++] & 0xFFL) << local22;
			local22 -= 8;
		}
		return local24;
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(Z)I")
	public final int method7561() {
		return -this.aByteArray114[this.anInt9191++] & 0xFF;
	}

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "(I)I")
	public final int method7562() {
		this.anInt9191 += 4;
		return (this.aByteArray114[this.anInt9191 - 2] & 0xFF) + ((this.aByteArray114[this.anInt9191 - 1] & 0xFF) << 8) + ((this.aByteArray114[-3 + this.anInt9191] & 0xFF) << 24) + ((this.aByteArray114[this.anInt9191 + -4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "(I)Z")
	public final boolean method7563() {
		this.anInt9191 -= 4;
		@Pc(22) int local22 = Static41.method950(0, this.anInt9191, this.aByteArray114);
		@Pc(26) int local26 = this.method7549();
		return local26 == local22;
	}

	@OriginalMember(owner = "client!rt", name = "l", descriptor = "(I)I")
	public final int method7564() {
		@Pc(11) int local11 = this.aByteArray114[this.anInt9191] & 0xFF;
		return local11 >= 128 ? this.method7591() - 49152 : this.method7548() + -64;
	}

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "(I)I")
	public final int method7565() {
		this.anInt9191 += 4;
		return (this.aByteArray114[this.anInt9191 - 4] & 0xFF) + ((this.aByteArray114[this.anInt9191 - 3] & 0xFF) << 8) + ((this.aByteArray114[this.anInt9191 + -2] & 0xFF) << 16) + ((this.aByteArray114[this.anInt9191 + -1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)I")
	public final int method7566() {
		this.anInt9191 += 2;
		return (this.aByteArray114[this.anInt9191 - 2] - 128 & 0xFF) + ((this.aByteArray114[this.anInt9191 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(BI)V")
	public final void method7567(@OriginalArg(1) int arg0) {
		this.aByteArray114[this.anInt9191++] = (byte) arg0;
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "(Z)I")
	public final int method7568() {
		this.anInt9191 += 2;
		return (this.aByteArray114[this.anInt9191 - 1] - 128 & 0xFF) + ((this.aByteArray114[this.anInt9191 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(II[BI)V")
	public final void method7569(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aByteArray114[this.anInt9191++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method7570(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt9191;
		this.anInt9191 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method7571(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt9191 = 0;
		this.method7600(local31.length, 30364);
		this.method7569(local31.length, local31);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "([BBII)V")
	public final void method7571(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = this.aByteArray114[this.anInt9191++];
		}
	}

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "(I)Ljava/lang/String;")
	public final String method7572() {
		@Pc(14) byte local14 = this.aByteArray114[this.anInt9191++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(29) int local29 = this.anInt9191;
		while (this.aByteArray114[this.anInt9191++] != 0) {
		}
		@Pc(52) int local52 = this.anInt9191 - local29 - 1;
		return local52 == 0 ? "" : Static77.method1559(local29, this.aByteArray114, local52);
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(BI)V")
	public final void method7573(@OriginalArg(1) int arg0) {
		this.aByteArray114[this.anInt9191++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "(II)V")
	public final void method7574(@OriginalArg(1) int arg0) {
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 16);
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 24);
		this.aByteArray114[this.anInt9191++] = (byte) arg0;
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)I")
	public final int method7575() {
		this.anInt9191 += 3;
		return (this.aByteArray114[this.anInt9191 - 3] & 0xFF) + ((this.aByteArray114[this.anInt9191 - 1] & 0xFF) << 16) + ((this.aByteArray114[this.anInt9191 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "(BI)V")
	public final void method7576(@OriginalArg(1) int arg0) {
		this.aByteArray114[this.anInt9191++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(JI)V")
	public final void method7577(@OriginalArg(0) long arg0) {
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 56);
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 48);
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 40);
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 32);
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 24);
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 16);
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 8);
		this.aByteArray114[this.anInt9191++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "(BI)V")
	public final void method7578(@OriginalArg(1) int arg0) {
		this.aByteArray114[this.anInt9191++] = (byte) arg0;
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 8);
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 16);
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!rt", name = "o", descriptor = "(I)I")
	public final int method7579() {
		this.anInt9191 += 2;
		@Pc(33) int local33 = (this.aByteArray114[this.anInt9191 - 1] - 128 & 0xFF) + ((this.aByteArray114[this.anInt9191 - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!rt", name = "p", descriptor = "(I)I")
	public final int method7580() {
		return this.aByteArray114[this.anInt9191++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIJ)V")
	public final void method7581(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(22) int local22 = local2 * 8; local22 >= 0; local22 -= 8) {
			this.aByteArray114[this.anInt9191++] = (byte) (arg1 >> local22);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method7582(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = Static319.method5147(arg0);
		this.aByteArray114[this.anInt9191++] = 0;
		this.method7553(local7);
		this.anInt9191 += Static462.method6894(this.aByteArray114, arg0, this.anInt9191);
	}

	@OriginalMember(owner = "client!rt", name = "q", descriptor = "(I)I")
	public final int method7583() {
		@Pc(18) int local18 = Static41.method950(0, this.anInt9191, this.aByteArray114);
		this.method7594(local18);
		return local18;
	}

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "(B)B")
	public final byte method7584() {
		return this.aByteArray114[this.anInt9191++];
	}

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "(II)V")
	public final void method7585(@OriginalArg(0) int arg0) {
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 8);
		this.aByteArray114[this.anInt9191++] = (byte) arg0;
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 24);
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!rt", name = "r", descriptor = "(I)B")
	public final byte method7586() {
		return (byte) (128 - this.aByteArray114[this.anInt9191++]);
	}

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "(II)V")
	public final void method7587(@OriginalArg(0) int arg0) {
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 8);
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IB)V")
	public final void method7588(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method7576(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method7600(arg0 + 32768, 30364);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "(Z)Ljava/lang/String;")
	public final String method7589() {
		@Pc(11) int local11 = this.anInt9191;
		while (this.aByteArray114[this.anInt9191++] != 0) {
		}
		@Pc(33) int local33 = this.anInt9191 - local11 - 1;
		return local33 == 0 ? "" : Static77.method1559(local11, this.aByteArray114, local33);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(III[B)V")
	public final void method7590(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (this.aByteArray114[this.anInt9191++] - 128);
		}
	}

	@OriginalMember(owner = "client!rt", name = "s", descriptor = "(I)I")
	public final int method7591() {
		this.anInt9191 += 2;
		return ((this.aByteArray114[this.anInt9191 - 2] & 0xFF) << 8) + (this.aByteArray114[this.anInt9191 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZ)V")
	public final void method7593(@OriginalArg(0) int arg0) {
		this.aByteArray114[this.anInt9191++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZI)V")
	public final void method7594(@OriginalArg(1) int arg0) {
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 24);
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 16);
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 8);
		this.aByteArray114[this.anInt9191++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rt", name = "u", descriptor = "(I)Ljava/lang/String;")
	public final String method7595() {
		if (this.aByteArray114[this.anInt9191] == 0) {
			this.anInt9191++;
			return null;
		} else {
			return this.method7589();
		}
	}

	@OriginalMember(owner = "client!rt", name = "v", descriptor = "(I)I")
	public final int method7597() {
		return 128 - this.aByteArray114[this.anInt9191++] & 0xFF;
	}

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "(B)B")
	public final byte method7598() {
		return (byte) (this.aByteArray114[this.anInt9191++] - 128);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[III)V")
	public final void method7599(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(8) int local8 = this.anInt9191;
		this.anInt9191 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method7549();
			@Pc(30) int local30 = this.method7549();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= (local26 << 4 ^ local26 >>> 5) + local26 ^ local32 - -arg1[local32 >>> 11 & 0x3];
				local32 -= -1640531527;
				local26 -= arg1[local32 & 0x3] + local32 ^ local30 + (local30 >>> 5 ^ local30 << 4);
			}
			this.anInt9191 -= 8;
			this.method7594(local26);
			this.method7594(local30);
		}
		this.anInt9191 = local8;
	}

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "(II)V")
	public final void method7600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 8);
		this.aByteArray114[this.anInt9191++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "(B)I")
	public final int method7601() {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9;
		for (local9 = this.method7547(); local9 == 32767; local9 = this.method7547()) {
			local5 += 32767;
		}
		return local5 + local9;
	}

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "(BI)V")
	public final void method7602(@OriginalArg(1) int arg0) {
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(ZI)V")
	public final void method7603(@OriginalArg(1) int arg0) {
		this.aByteArray114[this.anInt9191 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray114[this.anInt9191 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray114[this.anInt9191 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray114[this.anInt9191 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rt", name = "w", descriptor = "(I)I")
	public final int method7604() {
		this.anInt9191 += 2;
		@Pc(32) int local32 = ((this.aByteArray114[this.anInt9191 - 2] & 0xFF) << 8) + (this.aByteArray114[this.anInt9191 - 1] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "(B)I")
	public final int method7605() {
		this.anInt9191 += 4;
		return (this.aByteArray114[this.anInt9191 - 3] & 0xFF) + ((this.aByteArray114[this.anInt9191 - 4] & 0xFF) << 8) + ((this.aByteArray114[this.anInt9191 + -1] & 0xFF) << 16) + ((this.aByteArray114[this.anInt9191 + -2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(IB)V")
	public final void method7606(@OriginalArg(0) int arg0) {
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 + 128);
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "(B)Ljava/lang/String;")
	public final String method7607() {
		@Pc(14) byte local14 = this.aByteArray114[this.anInt9191++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(25) int local25 = this.method7552();
		if (local25 + this.anInt9191 > this.aByteArray114.length) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(55) String local55 = Static357.method5602(this.anInt9191, local25, this.aByteArray114);
		this.anInt9191 += local25;
		return local55;
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(ILjava/lang/String;)V")
	public final void method7608(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt9191 += Static267.method4690(arg0, arg0.length(), this.anInt9191, this.aByteArray114);
		this.aByteArray114[this.anInt9191++] = 0;
	}

	@OriginalMember(owner = "client!rt", name = "x", descriptor = "(I)I")
	public final int method7609() {
		this.anInt9191 += 2;
		@Pc(31) int local31 = (this.aByteArray114[this.anInt9191 - 2] & 0xFF) + ((this.aByteArray114[this.anInt9191 - 1] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "(B)I")
	public final int method7610() {
		this.anInt9191 += 2;
		return ((this.aByteArray114[this.anInt9191 - 1] & 0xFF) << 8) + (this.aByteArray114[this.anInt9191 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(IB)V")
	public final void method7611(@OriginalArg(0) int arg0) {
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 16);
		this.aByteArray114[this.anInt9191++] = (byte) (arg0 >> 8);
		this.aByteArray114[this.anInt9191++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "(II)V")
	public final void method7612(@OriginalArg(1) int arg0) {
		this.aByteArray114[this.anInt9191 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray114[this.anInt9191 - arg0 - 1] = (byte) arg0;
	}
}

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public class Class5_Sub36 extends Class5 {

	@OriginalMember(owner = "client!wq", name = "zb", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!wq", name = "B", descriptor = "I")
	public int anInt8456;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(I)V")
	public Class5_Sub36(@OriginalArg(0) int arg0) {
		this.aByteArray89 = Static305.method4760(arg0);
		this.anInt8456 = 0;
	}

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "([B)V")
	public Class5_Sub36(@OriginalArg(0) byte[] arg0) {
		this.anInt8456 = 0;
		this.aByteArray89 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)I")
	public final int method7265() {
		this.anInt8456 += 4;
		return (this.aByteArray89[this.anInt8456 - 4] & 0xFF) + (((this.aByteArray89[this.anInt8456 - 3] & 0xFF) << 8) + ((this.aByteArray89[this.anInt8456 - 1] & 0xFF) << 24) + ((this.aByteArray89[this.anInt8456 + -2] & 0xFF) << 16));
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(JIB)V")
	public final void method7266(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(34) int local34 = local2 * 8; local34 >= 0; local34 -= 8) {
			this.aByteArray89[this.anInt8456++] = (byte) (int) (arg0 >> local34);
		}
	}

	@OriginalMember(owner = "client!wq", name = "q", descriptor = "(II)V")
	public final void method7267(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method7324(arg0 >>> 28 | 0x80);
					}
					this.method7324(arg0 >>> 21 | 0x80);
				}
				this.method7324(arg0 >>> 14 | 0x80);
			}
			this.method7324(arg0 >>> 7 | 0x80);
		}
		this.method7324(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!wq", name = "r", descriptor = "(I)I")
	public final int method7268() {
		this.anInt8456 += 4;
		return ((this.aByteArray89[this.anInt8456 - 4] & 0xFF) << 24) + (this.aByteArray89[this.anInt8456 - 1] & 0xFF) - (-((this.aByteArray89[this.anInt8456 - 3] & 0xFF) << 16) - ((this.aByteArray89[this.anInt8456 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "(I)I")
	public final int method7269() {
		this.anInt8456 += 3;
		@Pc(43) int local43 = (this.aByteArray89[this.anInt8456 - 1] & 0xFF) + ((this.aByteArray89[this.anInt8456 - 2] & 0xFF) << 8) + ((this.aByteArray89[this.anInt8456 - 3] & 0xFF) << 16);
		if (local43 > 8388607) {
			local43 -= 16777216;
		}
		return local43;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "([IB)V")
	public final void method7270(@OriginalArg(0) int[] arg0) {
		@Pc(17) int local17 = this.anInt8456 / 8;
		this.anInt8456 = 0;
		for (@Pc(22) int local22 = 0; local22 < local17; local22++) {
			@Pc(30) int local30 = this.method7268();
			@Pc(34) int local34 = this.method7268();
			@Pc(36) int local36 = -957401312;
			@Pc(40) int local40 = 32;
			while (local40-- > 0) {
				local34 -= arg0[local36 >>> 11 & 0x3] + local36 ^ local30 + (local30 >>> 5 ^ local30 << 4);
				local36 -= -1640531527;
				local30 -= local36 + arg0[local36 & 0x3] ^ (local34 << 4 ^ local34 >>> 5) - -local34;
			}
			this.anInt8456 -= 8;
			this.method7287(local30);
			this.method7287(local34);
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I[BII)V")
	public final void method7271(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (this.aByteArray89[this.anInt8456++] - 128);
		}
	}

	@OriginalMember(owner = "client!wq", name = "w", descriptor = "(I)B")
	public final byte method7272() {
		return (byte) -this.aByteArray89[this.anInt8456++];
	}

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "(Z)I")
	public final int method7273() {
		@Pc(20) int local20 = this.aByteArray89[this.anInt8456] & 0xFF;
		return local20 < 128 ? this.method7291() - 64 : this.method7333() + -49152;
	}

	@OriginalMember(owner = "client!wq", name = "t", descriptor = "(I)I")
	public final int method7274() {
		this.anInt8456 += 4;
		return ((this.aByteArray89[this.anInt8456 - 4] & 0xFF) << 8) + ((this.aByteArray89[this.anInt8456 - 2] & 0xFF) << 24) + ((this.aByteArray89[this.anInt8456 + -1] & 0xFF) << 16) + (this.aByteArray89[this.anInt8456 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!wq", name = "u", descriptor = "(I)Ljava/lang/String;")
	public final String method7275() {
		@Pc(16) byte local16 = this.aByteArray89[this.anInt8456++];
		if (local16 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(29) int local29 = this.anInt8456;
		while (this.aByteArray89[this.anInt8456++] != 0) {
		}
		@Pc(52) int local52 = this.anInt8456 - local29 - 1;
		return local52 == 0 ? "" : Static262.method4274(this.aByteArray89, local29, local52);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(III[I)V")
	public final void method7276(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt8456;
		this.anInt8456 = 5;
		@Pc(23) int local23 = (arg0 - 5) / 8;
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(33) int local33 = this.method7268();
			@Pc(37) int local37 = this.method7268();
			@Pc(39) int local39 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= local39 + arg1[local39 >>> 11 & 0x3] ^ local33 + (local33 >>> 5 ^ local33 << 4);
				local39 -= -1640531527;
				local33 -= local39 + arg1[local39 & 0x3] ^ (local37 << 4 ^ local37 >>> 5) - -local37;
			}
			this.anInt8456 -= 8;
			this.method7287(local33);
			this.method7287(local37);
		}
		this.anInt8456 = local8;
	}

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "(II)V")
	public final void method7277(@OriginalArg(0) int arg0) {
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 + 128);
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method7278(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray89[this.anInt8456++] = 0;
		this.anInt8456 += Static311.method4808(this.anInt8456, arg0, arg0.length(), this.aByteArray89);
		this.aByteArray89[this.anInt8456++] = 0;
	}

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "(II)V")
	public final void method7279(@OriginalArg(0) int arg0) {
		this.aByteArray89[this.anInt8456++] = (byte) arg0;
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(B)I")
	public final int method7280() {
		return 128 - this.aByteArray89[this.anInt8456++] & 0xFF;
	}

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "(B)Ljava/lang/String;")
	public final String method7281() {
		@Pc(17) int local17 = this.anInt8456;
		while (this.aByteArray89[this.anInt8456++] != 0) {
		}
		@Pc(40) int local40 = this.anInt8456 - local17 - 1;
		return local40 == 0 ? "" : Static262.method4274(this.aByteArray89, local17, local40);
	}

	@OriginalMember(owner = "client!wq", name = "o", descriptor = "(I)I")
	public final int method7282() {
		this.anInt8456 += 2;
		return ((this.aByteArray89[this.anInt8456 - 1] & 0xFF) << 8) + (this.aByteArray89[this.anInt8456 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!wq", name = "v", descriptor = "(I)Z")
	public final boolean method7283() {
		this.anInt8456 -= 4;
		@Pc(25) int local25 = Static292.method4637(0, this.aByteArray89, this.anInt8456);
		@Pc(29) int local29 = this.method7268();
		return local29 == local25;
	}

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "(II)V")
	public final void method7284(@OriginalArg(0) int arg0) {
		this.aByteArray89[this.anInt8456++] = (byte) arg0;
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 8);
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 16);
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "(II)V")
	public final void method7285(@OriginalArg(0) int arg0) {
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 8);
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(II)V")
	public final void method7286(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt8456++] = (byte) arg0;
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BI)V")
	public final void method7287(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 24);
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 16);
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 8);
		this.aByteArray89[this.anInt8456++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(II)V")
	public final void method7288(@OriginalArg(0) int arg0) {
		this.aByteArray89[this.anInt8456++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "(I)I")
	public final int method7289() {
		this.anInt8456 += 2;
		@Pc(41) int local41 = (this.aByteArray89[this.anInt8456 - 2] - 128 & 0xFF) + ((this.aByteArray89[this.anInt8456 - 1] & 0xFF) << 8);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "(B)I")
	public final int method7290() {
		return -this.aByteArray89[this.anInt8456++] & 0xFF;
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(B)I")
	public final int method7291() {
		return this.aByteArray89[this.anInt8456++] & 0xFF;
	}

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "(B)I")
	public final int method7292() {
		this.anInt8456 += 4;
		return ((this.aByteArray89[this.anInt8456 - 1] & 0xFF) << 8) + ((this.aByteArray89[this.anInt8456 - 3] & 0xFF) << 24) + ((this.aByteArray89[this.anInt8456 + -4] & 0xFF) << 16) + (this.aByteArray89[this.anInt8456 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!wq", name = "r", descriptor = "(II)V")
	public final void method7293(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!wq", name = "q", descriptor = "(I)I")
	public final int method7294() {
		@Pc(16) byte local16 = this.aByteArray89[this.anInt8456++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local18 | local16 & 0x7F) << 7;
			local16 = this.aByteArray89[this.anInt8456++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)I")
	public final int method7295(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		for (local11 = this.method7306(); local11 == 32767; local11 = this.method7306()) {
			local7 += 32767;
		}
		local7 += local11;
		return arg0 < 13 ? 67 : local7;
	}

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "(BI)V")
	public final void method7296(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 8);
		this.aByteArray89[this.anInt8456++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "([BIII)V")
	public final void method7297(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) int local16 = arg1; local16 < arg2 + arg1; local16++) {
			arg0[local16] = this.aByteArray89[this.anInt8456++];
		}
	}

	@OriginalMember(owner = "client!wq", name = "g", descriptor = "(B)I")
	public final int method7298() {
		this.anInt8456 += 4;
		return ((this.aByteArray89[this.anInt8456 - 3] & 0xFF) << 8) + (this.aByteArray89[this.anInt8456 - 1] << 24 & 0xFF000000) + ((this.aByteArray89[this.anInt8456 + -2] & 0xFF) << 16) + (this.aByteArray89[this.anInt8456 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "(II)I")
	public final int method7299(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static292.method4637(arg0, this.aByteArray89, this.anInt8456);
		this.method7287(local11);
		return local11;
	}

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "(I)I")
	public final int method7300() {
		this.anInt8456 += 2;
		return (this.aByteArray89[this.anInt8456 - 2] & 0xFF) + ((this.aByteArray89[this.anInt8456 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(BI)V")
	public final void method7301(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt8456 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray89[this.anInt8456 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray89[this.anInt8456 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray89[this.anInt8456 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "(I)B")
	public final byte method7302() {
		return (byte) (128 - this.aByteArray89[this.anInt8456++]);
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)I")
	public final int method7303() {
		this.anInt8456 += 2;
		@Pc(38) int local38 = (this.aByteArray89[this.anInt8456 - 1] & 0xFF) + ((this.aByteArray89[this.anInt8456 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)J")
	public final long method7304() {
		@Pc(12) long local12 = (long) this.method7268() & 0xFFFFFFFFL;
		@Pc(26) long local26 = (long) this.method7268() & 0xFFFFFFFFL;
		return local26 + (local12 << 32);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method7305(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt8456;
		this.anInt8456 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method7297(local12, 0, local6);
		@Pc(25) BigInteger local25 = new BigInteger(local12);
		@Pc(30) BigInteger local30 = local25.modPow(arg0, arg1);
		@Pc(33) byte[] local33 = local30.toByteArray();
		this.anInt8456 = 0;
		this.method7296(local33.length);
		this.method7313(0, local33.length, local33);
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(Z)I")
	public final int method7306() {
		@Pc(20) int local20 = this.aByteArray89[this.anInt8456] & 0xFF;
		return local20 >= 128 ? this.method7333() - 32768 : this.method7291();
	}

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "(II)V")
	public final void method7307(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 8);
		this.aByteArray89[this.anInt8456++] = (byte) arg0;
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 24);
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "(II)V")
	public final void method7308(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt8456 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray89[this.anInt8456 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wq", name = "g", descriptor = "(II)V")
	public final void method7309(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt8456++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IB)V")
	public final void method7310(@OriginalArg(0) int arg0) {
		this.aByteArray89[this.anInt8456++] = (byte) arg0;
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 8);
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 16);
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!wq", name = "s", descriptor = "(I)J")
	public final long method7311() {
		@Pc(10) long local10 = (long) this.method7291() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method7268() & 0xFFFFFFFFL;
		return local17 + (local10 << 32);
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(I)Ljava/lang/String;")
	public final String method7312() {
		if (this.aByteArray89[this.anInt8456] == 0) {
			this.anInt8456++;
			return null;
		} else {
			return this.method7281();
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(III[B)V")
	public final void method7313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		for (@Pc(3) int local3 = arg0; local3 < arg0 + arg1; local3++) {
			this.aByteArray89[this.anInt8456++] = arg2[local3];
		}
	}

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "(II)V")
	public final void method7314(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt8456 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "(B)I")
	public final int method7316() {
		this.anInt8456 += 2;
		return ((this.aByteArray89[this.anInt8456 - 2] & 0xFF) << 8) + (this.aByteArray89[this.anInt8456 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "(II)V")
	public final void method7317(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 16);
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 8);
		this.aByteArray89[this.anInt8456++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "(I)B")
	public final byte method7318() {
		return this.aByteArray89[this.anInt8456++];
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(BI)V")
	public final void method7319(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method7324(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method7296(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "(B)I")
	public final int method7320() {
		if (this.aByteArray89[this.anInt8456] < 0) {
			return this.method7268() & Integer.MAX_VALUE;
		} else {
			@Pc(32) int local32 = this.method7333();
			return local32 == 32767 ? -1 : local32;
		}
	}

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "(Z)J")
	public final long method7321() {
		@Pc(10) long local10 = (long) this.method7298() & 0xFFFFFFFFL;
		@Pc(26) long local26 = (long) this.method7298() & 0xFFFFFFFFL;
		return (local26 << 32) + local10;
	}

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "(I)I")
	public final int method7322() {
		this.anInt8456 += 3;
		return (this.aByteArray89[this.anInt8456 - 1] & 0xFF) + ((this.aByteArray89[this.anInt8456 - 3] & 0xFF) << 8) + ((this.aByteArray89[this.anInt8456 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "(I)V")
	public final void method7323() {
		if (this.aByteArray89 != null) {
			Static305.method4759(this.aByteArray89);
		}
		this.aByteArray89 = null;
	}

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "(II)V")
	public final void method7324(@OriginalArg(0) int arg0) {
		this.aByteArray89[this.anInt8456++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "([IIII)V")
	public final void method7325(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anInt8456;
		this.anInt8456 = arg1;
		@Pc(18) int local18 = (arg2 - arg1) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(29) int local29 = this.method7268();
			@Pc(33) int local33 = this.method7268();
			@Pc(35) int local35 = 0;
			@Pc(39) int local39 = 32;
			while (local39-- > 0) {
				local29 += arg0[local35 & 0x3] + local35 ^ (local33 << 4 ^ local33 >>> 5) + local33;
				local35 += -1640531527;
				local33 += local35 + arg0[local35 >>> 11 & 0x3] ^ local29 + (local29 << 4 ^ local29 >>> 5);
			}
			this.anInt8456 -= 8;
			this.method7287(local29);
			this.method7287(local33);
		}
		this.anInt8456 = local8;
	}

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "(II)V")
	public final void method7326(@OriginalArg(0) int arg0) {
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 16);
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 24);
		this.aByteArray89[this.anInt8456++] = (byte) arg0;
		this.aByteArray89[this.anInt8456++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method7327(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt8456 += Static311.method4808(this.anInt8456, arg0, arg0.length(), this.aByteArray89);
		this.aByteArray89[this.anInt8456++] = 0;
	}

	@OriginalMember(owner = "client!wq", name = "o", descriptor = "(II)J")
	public final long method7328(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 - 1;
		if (local13 < 0 || local13 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(32) int local32 = local13 * 8;
		@Pc(34) long local34 = 0L;
		while (local32 >= 0) {
			local34 |= ((long) this.aByteArray89[this.anInt8456++] & 0xFFL) << local32;
			local32 -= 8;
		}
		return local34;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(JI)V")
	public final void method7329(@OriginalArg(0) long arg0) {
		this.aByteArray89[this.anInt8456++] = (byte) (int) (arg0 >> 56);
		this.aByteArray89[this.anInt8456++] = (byte) (int) (arg0 >> 48);
		this.aByteArray89[this.anInt8456++] = (byte) (int) (arg0 >> 40);
		this.aByteArray89[this.anInt8456++] = (byte) (int) (arg0 >> 32);
		this.aByteArray89[this.anInt8456++] = (byte) (int) (arg0 >> 24);
		this.aByteArray89[this.anInt8456++] = (byte) (int) (arg0 >> 16);
		this.aByteArray89[this.anInt8456++] = (byte) (int) (arg0 >> 8);
		this.aByteArray89[this.anInt8456++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(Z)I")
	public final int method7330() {
		return this.aByteArray89[this.anInt8456++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "(Z)I")
	public final int method7331() {
		this.anInt8456 += 3;
		return (this.aByteArray89[this.anInt8456 - 1] & 0xFF) + ((this.aByteArray89[this.anInt8456 - 2] & 0xFF) << 8) + ((this.aByteArray89[this.anInt8456 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "(I)B")
	public final byte method7332() {
		return (byte) (this.aByteArray89[this.anInt8456++] - 128);
	}

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "(B)I")
	public final int method7333() {
		this.anInt8456 += 2;
		return (this.aByteArray89[this.anInt8456 - 1] & 0xFF) + ((this.aByteArray89[this.anInt8456 - 2] & 0xFF) << 8);
	}
}

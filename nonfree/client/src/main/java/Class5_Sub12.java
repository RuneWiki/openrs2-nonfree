import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public class Class5_Sub12 extends Class5 {

	@OriginalMember(owner = "client!rg", name = "S", descriptor = "I")
	public int anInt5731 = 0;

	@OriginalMember(owner = "client!rg", name = "ub", descriptor = "[B")
	public byte[] aByteArray90;

	static {
		new Class85("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V")
	public Class5_Sub12(@OriginalArg(0) int arg0) {
		this.aByteArray90 = Static277.method4844(arg0);
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "([B)V")
	public Class5_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aByteArray90 = arg0;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)B")
	public final byte method5055() {
		return (byte) (this.aByteArray90[this.anInt5731++] - 128);
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)V")
	public final void method5056(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5089(arg0 >>> 28 | 0x80);
					}
					this.method5089(arg0 >>> 21 | 0x80);
				}
				this.method5089(arg0 >>> 14 | 0x80);
			}
			this.method5089(arg0 >>> 7 | 0x80);
		}
		this.method5089(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(II)V")
	public final void method5057(@OriginalArg(0) int arg0) {
		this.aByteArray90[this.anInt5731 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray90[this.anInt5731 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray90[this.anInt5731 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray90[this.anInt5731 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBI[B)V")
	public final void method5058(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
			arg1[local9] = this.aByteArray90[this.anInt5731++];
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZI)V")
	public final void method5059(@OriginalArg(1) int arg0) {
		this.aByteArray90[this.anInt5731++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)I")
	public final int method5060() {
		@Pc(11) int local11 = this.aByteArray90[this.anInt5731] & 0xFF;
		return local11 >= 128 ? this.method5106() - 32768 : this.method5115();
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)B")
	public final byte method5061() {
		return (byte) (128 - this.aByteArray90[this.anInt5731++]);
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)I")
	public final int method5062() {
		@Pc(21) byte local21 = this.aByteArray90[this.anInt5731++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local23 | local21 & 0x7F) << 7;
			local21 = this.aByteArray90[this.anInt5731++];
		}
		return local23 | local21;
	}

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)Ljava/lang/String;")
	public final String method5064() {
		@Pc(15) int local15 = this.anInt5731;
		while (this.aByteArray90[this.anInt5731++] != 0) {
		}
		@Pc(34) int local34 = this.anInt5731 - local15 - 1;
		return local34 == 0 ? "" : Static315.method5537(this.aByteArray90, local34, local15);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(JI)V")
	public final void method5065(@OriginalArg(0) long arg0) {
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 56);
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 48);
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 40);
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 32);
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 24);
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 16);
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 8);
		this.aByteArray90[this.anInt5731++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)I")
	public final int method5066() {
		this.anInt5731 += 2;
		@Pc(37) int local37 = ((this.aByteArray90[this.anInt5731 - 2] & 0xFF) << 8) + (this.aByteArray90[this.anInt5731 - 1] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)I")
	public final int method5067() {
		this.anInt5731 += 4;
		return (this.aByteArray90[this.anInt5731 - 1] & 0xFF) + ((this.aByteArray90[this.anInt5731 - 2] & 0xFF) << 8) + ((this.aByteArray90[this.anInt5731 + -4] & 0xFF) << 24) + ((this.aByteArray90[this.anInt5731 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)I")
	public final int method5068() {
		return this.aByteArray90[this.anInt5731++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(IB)V")
	public final void method5069(@OriginalArg(0) int arg0) {
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(II)V")
	public final void method5070(@OriginalArg(0) int arg0) {
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 24);
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 16);
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 8);
		this.aByteArray90[this.anInt5731++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(II)V")
	public final void method5071(@OriginalArg(0) int arg0) {
		this.aByteArray90[this.anInt5731++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "(B)I")
	public final int method5072() {
		this.anInt5731 += 3;
		return (this.aByteArray90[this.anInt5731 - 1] & 0xFF) + (((this.aByteArray90[this.anInt5731 - 3] & 0xFF) << 16) + ((this.aByteArray90[this.anInt5731 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "(I)I")
	public final int method5073() {
		this.anInt5731 += 2;
		@Pc(39) int local39 = ((this.aByteArray90[this.anInt5731 - 2] & 0xFF) << 8) + (this.aByteArray90[this.anInt5731 - 1] - 128 & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "(I)I")
	public final int method5074() {
		this.anInt5731 += 4;
		return (this.aByteArray90[this.anInt5731 - 4] & 0xFF) + ((this.aByteArray90[this.anInt5731 - 2] & 0xFF) << 16) + ((this.aByteArray90[-1 + this.anInt5731] & 0xFF) << 24) + ((this.aByteArray90[this.anInt5731 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "(I)I")
	public final int method5075() {
		this.anInt5731 += 2;
		return (this.aByteArray90[this.anInt5731 - 1] - 128 & 0xFF) + ((this.aByteArray90[this.anInt5731 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(IB)V")
	public final void method5076(@OriginalArg(0) int arg0) {
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 + 128);
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "(II)J")
	public final long method5077(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = arg0 - 1;
		if (local11 < 0 || local11 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(24) int local24 = local11 * 8;
		@Pc(26) long local26 = 0L;
		while (local24 >= 0) {
			local26 |= ((long) this.aByteArray90[this.anInt5731++] & 0xFFL) << local24;
			local24 -= 8;
		}
		return local26;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method5078(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt5731;
		this.anInt5731 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method5058(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(33) BigInteger local33 = local23.modPow(arg1, arg0);
		@Pc(36) byte[] local36 = local33.toByteArray();
		this.anInt5731 = 0;
		this.method5089(local36.length);
		this.method5110(local36.length, local36);
	}

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "(II)V")
	public final void method5080(@OriginalArg(1) int arg0) {
		this.aByteArray90[this.anInt5731++] = (byte) arg0;
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z[I)V")
	public final void method5081(@OriginalArg(1) int[] arg0) {
		@Pc(8) int local8 = this.anInt5731 / 8;
		this.anInt5731 = 0;
		for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
			@Pc(24) int local24 = this.method5067();
			@Pc(28) int local28 = this.method5067();
			@Pc(30) int local30 = 0;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local24 += arg0[local30 & 0x3] + local30 ^ (local28 << 4 ^ local28 >>> 5) - -local28;
				local30 += -1640531527;
				local28 += (local24 >>> 5 ^ local24 << 4) + local24 ^ arg0[local30 >>> 11 & 0x75600003] + local30;
			}
			this.anInt5731 -= 8;
			this.method5070(local24);
			this.method5070(local28);
		}
	}

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "(II)V")
	public final void method5082(@OriginalArg(1) int arg0) {
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 16);
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 24);
		this.aByteArray90[this.anInt5731++] = (byte) arg0;
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(IB)I")
	public final int method5083(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static103.method4835(this.aByteArray90, this.anInt5731, arg0);
		this.method5070(local16);
		return local16;
	}

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "(II)V")
	public final void method5084(@OriginalArg(1) int arg0) {
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 8);
		this.aByteArray90[this.anInt5731++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "(II)V")
	public final void method5085(@OriginalArg(1) int arg0) {
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 16);
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 8);
		this.aByteArray90[this.anInt5731++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "(B)I")
	public final int method5086() {
		return 128 - this.aByteArray90[this.anInt5731++] & 0xFF;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public final String method5087() {
		@Pc(14) byte local14 = this.aByteArray90[this.anInt5731++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt5731;
		while (this.aByteArray90[this.anInt5731++] != 0) {
		}
		@Pc(53) int local53 = this.anInt5731 - local27 - 1;
		return local53 == 0 ? "" : Static315.method5537(this.aByteArray90, local53, local27);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)V")
	public final void method5088(@OriginalArg(1) int arg0) {
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 8);
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "(II)V")
	public final void method5089(@OriginalArg(0) int arg0) {
		this.aByteArray90[this.anInt5731++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "(B)I")
	public final int method5090() {
		this.anInt5731 += 4;
		return ((this.aByteArray90[this.anInt5731 - 1] & 0xFF) << 16) + (this.aByteArray90[this.anInt5731 - 2] << 24 & 0xFF000000) + ((this.aByteArray90[this.anInt5731 - 4] & 0xFF) << 8) + (this.aByteArray90[this.anInt5731 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(BI)V")
	public final void method5093(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5089(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5084(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method5094(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = arg0.indexOf(0);
		if (local15 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local15 + " - cannot pjstr");
		}
		this.anInt5731 += Static115.method2015(this.aByteArray90, this.anInt5731, arg0.length(), arg0);
		this.aByteArray90[this.anInt5731++] = 0;
	}

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "(II)V")
	public final void method5095(@OriginalArg(0) int arg0) {
		this.aByteArray90[this.anInt5731++] = (byte) arg0;
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(BI)V")
	public final void method5096(@OriginalArg(1) int arg0) {
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 8);
		this.aByteArray90[this.anInt5731++] = (byte) arg0;
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 24);
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "(B)I")
	public final int method5097() {
		this.anInt5731 += 4;
		return ((this.aByteArray90[this.anInt5731 - 1] & 0xFF) << 8) + ((this.aByteArray90[this.anInt5731 - 3] & 0xFF) << 24) + ((this.aByteArray90[this.anInt5731 + -4] & 0xFF) << 16) + (this.aByteArray90[this.anInt5731 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "(B)B")
	public final byte method5098() {
		return this.aByteArray90[this.anInt5731++];
	}

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "(I)J")
	public final long method5099() {
		@Pc(10) long local10 = (long) this.method5067() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method5067() & 0xFFFFFFFFL;
		return (local10 << 32) + local24;
	}

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "(I)I")
	public final int method5100() {
		this.anInt5731 += 2;
		return (this.aByteArray90[this.anInt5731 - 2] & 0xFF) + ((this.aByteArray90[this.anInt5731 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(Z)I")
	public final int method5101() {
		return -this.aByteArray90[this.anInt5731++] & 0xFF;
	}

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "(I)I")
	public final int method5102() {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16;
		for (local16 = this.method5060(); local16 == 32767; local16 = this.method5060()) {
			local12 += 32767;
		}
		return local12 + local16;
	}

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "(I)I")
	public final int method5103() {
		@Pc(20) int local20 = this.aByteArray90[this.anInt5731] & 0xFF;
		return local20 >= 128 ? this.method5106() - 49152 : this.method5115() + -64;
	}

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "(I)B")
	public final byte method5104() {
		return (byte) -this.aByteArray90[this.anInt5731++];
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)V")
	public final void method5105(@OriginalArg(0) int arg0) {
		this.aByteArray90[this.anInt5731++] = (byte) arg0;
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 8);
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 16);
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!rg", name = "r", descriptor = "(I)I")
	public final int method5106() {
		this.anInt5731 += 2;
		return (this.aByteArray90[this.anInt5731 - 1] & 0xFF) + ((this.aByteArray90[this.anInt5731 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BIJ)V")
	public final void method5107(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(21) int local21 = local0 * 8; local21 >= 0; local21 -= 8) {
			this.aByteArray90[this.anInt5731++] = (byte) (arg1 >> local21);
		}
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(BI)V")
	public final void method5108(@OriginalArg(1) int arg0) {
		this.aByteArray90[this.anInt5731++] = (byte) arg0;
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 8);
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 16);
		this.aByteArray90[this.anInt5731++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[BII)V")
	public final void method5109(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (this.aByteArray90[this.anInt5731++] - 128);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[BBI)V")
	public final void method5110(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0; local5++) {
			this.aByteArray90[this.anInt5731++] = arg1[local5];
		}
	}

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "(II)V")
	public final void method5111(@OriginalArg(1) int arg0) {
		this.aByteArray90[this.anInt5731 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "(I)Z")
	public final boolean method5112() {
		this.anInt5731 -= 4;
		@Pc(17) int local17 = Static103.method4835(this.aByteArray90, this.anInt5731, 0);
		@Pc(28) int local28 = this.method5067();
		return local28 == local17;
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(Z)I")
	public final int method5113() {
		this.anInt5731 += 2;
		return ((this.aByteArray90[this.anInt5731 - 1] & 0xFF) << 8) + (this.aByteArray90[this.anInt5731 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "(I)Ljava/lang/String;")
	public final String method5114() {
		if (this.aByteArray90[this.anInt5731] == 0) {
			this.anInt5731++;
			return null;
		} else {
			return this.method5064();
		}
	}

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "(B)I")
	public final int method5115() {
		return this.aByteArray90[this.anInt5731++] & 0xFF;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II[II)V")
	public final void method5116(@OriginalArg(2) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(6) int local6 = this.anInt5731;
		this.anInt5731 = 5;
		@Pc(20) int local20 = (arg1 - 5) / 8;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(27) int local27 = this.method5067();
			@Pc(31) int local31 = this.method5067();
			@Pc(33) int local33 = -957401312;
			@Pc(37) int local37 = 32;
			while (local37-- > 0) {
				local31 -= local27 + (local27 >>> 5 ^ local27 << 4) ^ local33 + arg0[local33 >>> 11 & 0xA1800003];
				local33 -= -1640531527;
				local27 -= local31 + (local31 << 4 ^ local31 >>> 5) ^ local33 + arg0[local33 & 0x3];
			}
			this.anInt5731 -= 8;
			this.method5070(local27);
			this.method5070(local31);
		}
		this.anInt5731 = local6;
	}
}

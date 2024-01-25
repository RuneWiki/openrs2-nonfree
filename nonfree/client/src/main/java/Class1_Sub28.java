import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
	public int anInt6812;

	@OriginalMember(owner = "client!ug", name = "eb", descriptor = "[B")
	public byte[] aByteArray86;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I)V")
	public Class1_Sub28(@OriginalArg(0) int arg0) {
		this.anInt6812 = 0;
		this.aByteArray86 = Static433.method5709(arg0);
	}

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "([B)V")
	public Class1_Sub28(@OriginalArg(0) byte[] arg0) {
		this.aByteArray86 = arg0;
		this.anInt6812 = 0;
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)Ljava/lang/String;")
	public final String method5334() {
		if (this.aByteArray86[this.anInt6812] == 0) {
			this.anInt6812++;
			return null;
		} else {
			return this.method5381();
		}
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)I")
	public final int method5335() {
		this.anInt6812 += 2;
		return (this.aByteArray86[this.anInt6812 - 1] & 0xFF) + ((this.aByteArray86[this.anInt6812 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)I")
	public final int method5336() {
		this.anInt6812 += 2;
		return (this.aByteArray86[this.anInt6812 - 2] & 0xFF) + ((this.aByteArray86[this.anInt6812 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)I")
	public final int method5337() {
		return this.aByteArray86[this.anInt6812++] & 0xFF;
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)I")
	public final int method5338() {
		@Pc(16) int local16 = this.aByteArray86[this.anInt6812] & 0xFF;
		return local16 >= 128 ? this.method5335() - 49152 : this.method5337() - 64;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(JII)V")
	public final void method5339(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(19) int local19 = local6 * 8; local19 >= 0; local19 -= 8) {
			this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> local19);
		}
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)J")
	public final long method5340() {
		@Pc(18) long local18 = (long) this.method5355() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method5355() & 0xFFFFFFFFL;
		return (local18 << 32) + local25;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)I")
	public final int method5341() {
		this.anInt6812 += 2;
		return ((this.aByteArray86[this.anInt6812 - 1] & 0xFF) << 8) + (this.aByteArray86[this.anInt6812 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)I")
	public final int method5342() {
		this.anInt6812 += 3;
		return ((this.aByteArray86[this.anInt6812 - 1] & 0xFF) << 16) + ((this.aByteArray86[this.anInt6812 - 2] & 0xFF) << 8) + (this.aByteArray86[this.anInt6812 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B[BII)V")
	public final void method5343(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (this.aByteArray86[this.anInt6812++] - 128);
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(B[BII)V")
	public final void method5344(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg1; local15++) {
			arg0[local15] = this.aByteArray86[this.anInt6812++];
		}
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(B)I")
	public final int method5345() {
		this.anInt6812 += 3;
		return ((this.aByteArray86[this.anInt6812 - 3] & 0xFF) << 16) - (-((this.aByteArray86[this.anInt6812 - 2] & 0xFF) << 8) - (this.aByteArray86[this.anInt6812 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)I")
	public final int method5346() {
		this.anInt6812 += 2;
		@Pc(40) int local40 = (this.aByteArray86[this.anInt6812 - 2] - 128 & 0xFF) + ((this.aByteArray86[this.anInt6812 - 1] & 0xFF) << 8);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V")
	public final void method5347(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 24);
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt6812++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZI)V")
	public final void method5348(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt6812++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B[III)V")
	public final void method5349(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt6812;
		this.anInt6812 = 5;
		@Pc(26) int local26 = (arg1 - 5) / 8;
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = this.method5355();
			@Pc(38) int local38 = this.method5355();
			@Pc(40) int local40 = -957401312;
			@Pc(44) int local44 = 32;
			while (local44-- > 0) {
				local38 -= arg0[local40 >>> 11 & 0x1FA00003] + local40 ^ (local34 << 4 ^ local34 >>> 5) + local34;
				local40 -= -1640531527;
				local34 -= (local38 << 4 ^ local38 >>> 5) + local38 ^ arg0[local40 & 0x3] + local40;
			}
			this.anInt6812 -= 8;
			this.method5347(local34);
			this.method5347(local38);
		}
		this.anInt6812 = local8;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)V")
	public final void method5350(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 + 128);
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method5351(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = Static253.method3632(arg0);
		this.aByteArray86[this.anInt6812++] = 0;
		this.method5379(local7);
		this.anInt6812 += Static229.method3281(this.anInt6812, arg0, this.aByteArray86);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)V")
	public final void method5352(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt6812 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(B)B")
	public final byte method5353() {
		return (byte) (128 - this.aByteArray86[this.anInt6812++]);
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(Z)I")
	public final int method5354() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method5392();
		while (local11 == 32767) {
			local11 = this.method5392();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "(B)I")
	public final int method5355() {
		this.anInt6812 += 4;
		return (this.aByteArray86[this.anInt6812 - 1] & 0xFF) + (((this.aByteArray86[this.anInt6812 - 4] & 0xFF) << 24) + ((this.aByteArray86[this.anInt6812 - 3] & 0xFF) << 16) + ((this.aByteArray86[this.anInt6812 + -2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(II)J")
	public final long method5356(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(24) int local24 = local6 * 8;
		@Pc(26) long local26 = 0L;
		while (local24 >= 0) {
			local26 |= ((long) this.aByteArray86[this.anInt6812++] & 0xFFL) << local24;
			local24 -= 8;
		}
		return local26;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(IB)V")
	public final void method5357(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt6812++] = (byte) arg0;
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "(I)I")
	public final int method5358() {
		this.anInt6812 += 4;
		return (this.aByteArray86[this.anInt6812 - 4] & 0xFF) + ((this.aByteArray86[this.anInt6812 - 1] & 0xFF) << 24) + ((this.aByteArray86[this.anInt6812 + -2] & 0xFF) << 16) + ((this.aByteArray86[this.anInt6812 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(ZI)V")
	public final void method5359(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(IB)V")
	public final void method5360(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5398(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5393(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "(I)I")
	public final int method5361() {
		this.anInt6812 += 4;
		return (this.aByteArray86[this.anInt6812 - 2] & 0xFF) + ((this.aByteArray86[this.anInt6812 - 4] & 0xFF) << 16) + ((this.aByteArray86[this.anInt6812 + -3] & 0xFF) << 24) + ((this.aByteArray86[this.anInt6812 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "(I)I")
	public final int method5362() {
		@Pc(18) int local18 = Static328.method4417(this.aByteArray86, 0, this.anInt6812);
		this.method5347(local18);
		return local18;
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(Z)I")
	public final int method5363() {
		return this.aByteArray86[this.anInt6812++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public final void method5364(@OriginalArg(0) String arg0) {
		@Pc(12) int local12 = arg0.indexOf(0);
		if (local12 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local12 + " - cannot pjstr");
		}
		this.anInt6812 += Static81.method1355(this.aByteArray86, arg0.length(), this.anInt6812, arg0);
		this.aByteArray86[this.anInt6812++] = 0;
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(ZI)I")
	public final int method5365(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = Static328.method4417(this.aByteArray86, arg0, this.anInt6812);
		this.method5347(local17);
		return local17;
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(II)V")
	public final void method5366(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "(I)B")
	public final byte method5367() {
		return this.aByteArray86[this.anInt6812++];
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(II)V")
	public final void method5368(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6812++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "(B)Ljava/lang/String;")
	public final String method5369() {
		@Pc(14) byte local14 = this.aByteArray86[this.anInt6812++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt6812;
		while (this.aByteArray86[this.anInt6812++] != 0) {
		}
		@Pc(47) int local47 = this.anInt6812 - local27 - 1;
		return local47 == 0 ? "" : Static312.method4243(local47, local27, this.aByteArray86);
	}

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "(II)V")
	public final void method5370(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt6812++] = (byte) arg0;
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(JI)V")
	public final void method5371(@OriginalArg(0) long arg0) {
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 56);
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 48);
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 40);
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 32);
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 24);
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt6812++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "(I)Z")
	public final boolean method5372() {
		this.anInt6812 -= 4;
		@Pc(17) int local17 = Static328.method4417(this.aByteArray86, 0, this.anInt6812);
		@Pc(21) int local21 = this.method5355();
		return local21 == local17;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method5373(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt6812;
		this.anInt6812 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method5344(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt6812 = 0;
		this.method5393(local31.length);
		this.method5387(local31, local31.length);
	}

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "(II)V")
	public final void method5374(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt6812++] = (byte) arg0;
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 24);
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "(B)I")
	public final int method5375() {
		this.anInt6812 += 2;
		return (this.aByteArray86[this.anInt6812 - 1] - 128 & 0xFF) + ((this.aByteArray86[this.anInt6812 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)V")
	public final void method5376(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6812++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "(I)B")
	public final byte method5377() {
		return (byte) -this.aByteArray86[this.anInt6812++];
	}

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "(I)I")
	public final int method5378() {
		this.anInt6812 += 2;
		@Pc(38) int local38 = (this.aByteArray86[this.anInt6812 - 1] - 128 & 0xFF) + ((this.aByteArray86[this.anInt6812 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZ)V")
	public final void method5379(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5398(arg0 >>> 28 | 0x80);
					}
					this.method5398(arg0 >>> 21 | 0x80);
				}
				this.method5398(arg0 >>> 14 | 0x80);
			}
			this.method5398(arg0 >>> 7 | 0x80);
		}
		this.method5398(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "(B)I")
	public final int method5380() {
		this.anInt6812 += 4;
		return (this.aByteArray86[this.anInt6812 - 3] & 0xFF) + ((this.aByteArray86[this.anInt6812 - 4] & 0xFF) << 8) + ((this.aByteArray86[this.anInt6812 - 1] & 0xFF) << 16) + ((this.aByteArray86[-2 + this.anInt6812] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "(B)Ljava/lang/String;")
	public final String method5381() {
		@Pc(13) int local13 = this.anInt6812;
		while (this.aByteArray86[this.anInt6812++] != 0) {
		}
		@Pc(32) int local32 = this.anInt6812 - local13 - 1;
		return local32 == 0 ? "" : Static312.method4243(local32, local13, this.aByteArray86);
	}

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "(B)I")
	public final int method5382() {
		this.anInt6812 += 2;
		@Pc(36) int local36 = (this.aByteArray86[this.anInt6812 - 1] & 0xFF) + ((this.aByteArray86[this.anInt6812 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "(II)V")
	public final void method5383(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6812++] = (byte) arg0;
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "(II)V")
	public final void method5384(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6812 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray86[this.anInt6812 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt6812 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt6812 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "(I)Ljava/lang/String;")
	public final String method5385() {
		@Pc(14) byte local14 = this.aByteArray86[this.anInt6812++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(25) int local25 = this.method5394();
		if (this.aByteArray86.length < this.anInt6812 + local25) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(46) String local46 = Static447.method3432(this.aByteArray86, this.anInt6812, local25);
		this.anInt6812 += local25;
		return local46;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(IZ)V")
	public final void method5386(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt6812 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt6812 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[BII)V")
	public final void method5387(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			this.aByteArray86[this.anInt6812++] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "(II)V")
	public final void method5388(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 24);
		this.aByteArray86[this.anInt6812++] = (byte) arg0;
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "(B)I")
	public final int method5389() {
		this.anInt6812 += 3;
		@Pc(44) int local44 = (this.aByteArray86[this.anInt6812 - 1] & 0xFF) + (((this.aByteArray86[this.anInt6812 - 3] & 0xFF) << 16) + ((this.aByteArray86[this.anInt6812 - 2] & 0xFF) << 8));
		if (local44 > 8388607) {
			local44 -= 16777216;
		}
		return local44;
	}

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "(I)I")
	public final int method5390() {
		return 128 - this.aByteArray86[this.anInt6812++] & 0xFF;
	}

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "(B)B")
	public final byte method5391() {
		return (byte) (this.aByteArray86[this.anInt6812++] - 128);
	}

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "(I)I")
	public final int method5392() {
		@Pc(11) int local11 = this.aByteArray86[this.anInt6812] & 0xFF;
		return local11 < 128 ? this.method5337() : this.method5335() - 32768;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(BI)V")
	public final void method5393(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.anInt6812++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "(I)I")
	public final int method5394() {
		@Pc(16) byte local16 = this.aByteArray86[this.anInt6812++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local16 & 0x7F | local18) << 7;
			local16 = this.aByteArray86[this.anInt6812++];
		}
		return local16 | local18;
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(IB)V")
	public final void method5395(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.anInt6812++] = (byte) arg0;
		this.aByteArray86[this.anInt6812++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "(I)I")
	public final int method5396() {
		return -this.aByteArray86[this.anInt6812++] & 0xFF;
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(BI)V")
	public final void method5398(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.anInt6812++] = (byte) arg0;
	}
}

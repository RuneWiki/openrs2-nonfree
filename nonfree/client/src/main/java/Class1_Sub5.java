import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!hp", name = "db", descriptor = "I")
	public int anInt6475;

	@OriginalMember(owner = "client!hp", name = "tb", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(I)V")
	public Class1_Sub5(@OriginalArg(0) int arg0) {
		this.anInt6475 = 0;
		this.aByteArray89 = Static403.method5426(arg0);
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "([B)V")
	public Class1_Sub5(@OriginalArg(0) byte[] arg0) {
		this.aByteArray89 = arg0;
		this.anInt6475 = 0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)V")
	public final void method5353(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt6475 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray89[this.anInt6475 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray89[this.anInt6475 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray89[this.anInt6475 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)B")
	public final byte method5354() {
		return (byte) (128 - this.aByteArray89[this.anInt6475++]);
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(BI)V")
	public final void method5355(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt6475++] = (byte) arg0;
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)Ljava/lang/String;")
	public final String method5356() {
		if (this.aByteArray89[this.anInt6475] == 0) {
			this.anInt6475++;
			return null;
		} else {
			return this.method5401();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(JB)V")
	public final void method5358(@OriginalArg(0) long arg0) {
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 56);
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 48);
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 40);
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 32);
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 24);
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 16);
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 8);
		this.aByteArray89[this.anInt6475++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)V")
	public final void method5359(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 + 128);
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIZ[I)V")
	public final void method5360(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(11) int local11 = this.anInt6475;
		this.anInt6475 = 5;
		@Pc(20) int local20 = (arg0 - 5) / 8;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(27) int local27 = this.method5407();
			@Pc(31) int local31 = this.method5407();
			@Pc(33) int local33 = -957401312;
			@Pc(37) int local37 = 32;
			while (local37-- > 0) {
				local31 -= local27 + (local27 << 4 ^ local27 >>> 5) ^ local33 + arg1[local33 >>> 11 & 0xBB800003];
				local33 -= -1640531527;
				local27 -= local33 + arg1[local33 & 0x3] ^ (local31 << 4 ^ local31 >>> 5) - -local31;
			}
			this.anInt6475 -= 8;
			this.method5417(local27);
			this.method5417(local31);
		}
		this.anInt6475 = local11;
	}

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "(I)I")
	public final int method5361() {
		@Pc(11) int local11 = this.aByteArray89[this.anInt6475] & 0xFF;
		return local11 < 128 ? this.method5366() : this.method5362() - 32768;
	}

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "(I)I")
	public final int method5362() {
		this.anInt6475 += 2;
		return (this.aByteArray89[this.anInt6475 - 1] & 0xFF) + ((this.aByteArray89[this.anInt6475 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)I")
	public final int method5363() {
		this.anInt6475 += 2;
		return (this.aByteArray89[this.anInt6475 - 2] & 0xFF) + ((this.aByteArray89[this.anInt6475 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB)V")
	public final void method5364(@OriginalArg(0) int arg0) {
		this.aByteArray89[this.anInt6475 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method5365(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt6475;
		this.anInt6475 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method5391(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt6475 = 0;
		this.method5393(local31.length);
		this.method5367(local31, local31.length);
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(B)I")
	public final int method5366() {
		return this.aByteArray89[this.anInt6475++] & 0xFF;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "([BIII)V")
	public final void method5367(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			this.aByteArray89[this.anInt6475++] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(II)V")
	public final void method5368(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5396(arg0 >>> 28 | 0x80);
					}
					this.method5396(arg0 >>> 21 | 0x80);
				}
				this.method5396(arg0 >>> 14 | 0x80);
			}
			this.method5396(arg0 >>> 7 | 0x80);
		}
		this.method5396(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(B)I")
	public final int method5369() {
		this.anInt6475 += 4;
		return (this.aByteArray89[this.anInt6475 - 4] & 0xFF) + ((this.aByteArray89[this.anInt6475 - 3] & 0xFF) << 8) + ((this.aByteArray89[this.anInt6475 + -2] & 0xFF) << 16) + ((this.aByteArray89[this.anInt6475 - 1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(II)V")
	public final void method5370(@OriginalArg(0) int arg0) {
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 16);
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 8);
		this.aByteArray89[this.anInt6475++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "(B)J")
	public final long method5371() {
		@Pc(15) long local15 = (long) this.method5407() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method5407() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "(B)I")
	public final int method5372() {
		this.anInt6475 += 2;
		@Pc(41) int local41 = (this.aByteArray89[this.anInt6475 - 2] - 128 & 0xFF) + ((this.aByteArray89[this.anInt6475 - 1] & 0xFF) << 8);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(IB)V")
	public final void method5373(@OriginalArg(0) int arg0) {
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 16);
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 24);
		this.aByteArray89[this.anInt6475++] = (byte) arg0;
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "(I)I")
	public final int method5374() {
		return -this.aByteArray89[this.anInt6475++] & 0xFF;
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(II)V")
	public final void method5375(@OriginalArg(0) int arg0) {
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 8);
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "(II)V")
	public final void method5376(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "(B)I")
	public final int method5377() {
		@Pc(22) byte local22 = this.aByteArray89[this.anInt6475++];
		@Pc(24) int local24 = 0;
		while (local22 < 0) {
			local24 = (local24 | local22 & 0x7F) << 7;
			local22 = this.aByteArray89[this.anInt6475++];
		}
		return local22 | local24;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method5378(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = Static201.method3259(arg0);
		this.aByteArray89[this.anInt6475++] = 0;
		this.method5368(local7);
		this.anInt6475 += Static185.method2912(this.anInt6475, this.aByteArray89, arg0);
	}

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "(B)B")
	public final byte method5379() {
		return (byte) -this.aByteArray89[this.anInt6475++];
	}

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "(B)I")
	public final int method5380() {
		this.anInt6475 += 2;
		@Pc(40) int local40 = ((this.aByteArray89[this.anInt6475 - 2] & 0xFF) << 8) + (this.aByteArray89[this.anInt6475 - 1] & 0xFF);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(IB)V")
	public final void method5381(@OriginalArg(0) int arg0) {
		this.aByteArray89[this.anInt6475++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(III[B)V")
	public final void method5382(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = (byte) (this.aByteArray89[this.anInt6475++] - 128);
		}
	}

	@OriginalMember(owner = "client!hp", name = "j", descriptor = "(B)I")
	public final int method5383() {
		return 128 - this.aByteArray89[this.anInt6475++] & 0xFF;
	}

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "(B)I")
	public final int method5384() {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.method5361();
		while (local16 == 32767) {
			local16 = this.method5361();
			local12 += 32767;
		}
		return local12 + local16;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public final void method5385(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt6475 += Static311.method4438(this.aByteArray89, this.anInt6475, arg0.length(), arg0);
		this.aByteArray89[this.anInt6475++] = 0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "([IB)V")
	public final void method5386(@OriginalArg(0) int[] arg0) {
		@Pc(8) int local8 = this.anInt6475 / 8;
		this.anInt6475 = 0;
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(25) int local25 = this.method5407();
			@Pc(29) int local29 = this.method5407();
			@Pc(31) int local31 = 0;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local25 += arg0[local31 & 0x3] + local31 ^ (local29 >>> 5 ^ local29 << 4) + local29;
				local31 += -1640531527;
				local29 += arg0[local31 >>> 11 & 0x3] + local31 ^ local25 + (local25 >>> 5 ^ local25 << 4);
			}
			this.anInt6475 -= 8;
			this.method5417(local25);
			this.method5417(local29);
		}
	}

	@OriginalMember(owner = "client!hp", name = "j", descriptor = "(I)I")
	public final int method5387() {
		this.anInt6475 += 4;
		return ((this.aByteArray89[this.anInt6475 - 4] & 0xFF) << 16) + (this.aByteArray89[this.anInt6475 - 3] << 24 & 0xFF000000) + ((this.aByteArray89[this.anInt6475 + -1] & 0xFF) << 8) + (this.aByteArray89[this.anInt6475 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(BI)V")
	public final void method5388(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt6475++] = (byte) arg0;
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 8);
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 16);
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!hp", name = "l", descriptor = "(B)I")
	public final int method5389() {
		this.anInt6475 += 2;
		@Pc(33) int local33 = ((this.aByteArray89[this.anInt6475 - 2] & 0xFF) << 8) + (this.aByteArray89[this.anInt6475 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(BI)V")
	public final void method5390(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt6475++] = (byte) arg0;
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I[BII)V")
	public final void method5391(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = this.aByteArray89[this.anInt6475++];
		}
	}

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "(BI)I")
	public final int method5392(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = Static233.method1221(arg0, this.anInt6475, this.aByteArray89);
		this.method5417(local17);
		return local17;
	}

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "(II)V")
	public final void method5393(@OriginalArg(0) int arg0) {
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 8);
		this.aByteArray89[this.anInt6475++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "(BI)V")
	public final void method5394(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt6475++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(Z)I")
	public final int method5395() {
		this.anInt6475 += 4;
		return ((this.aByteArray89[this.anInt6475 - 1] & 0xFF) << 16) + (this.aByteArray89[this.anInt6475 - 2] << 24 & 0xFF000000) + ((this.aByteArray89[this.anInt6475 - 4] & 0xFF) << 8) + (this.aByteArray89[this.anInt6475 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "(II)V")
	public final void method5396(@OriginalArg(0) int arg0) {
		this.aByteArray89[this.anInt6475++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(JIZ)V")
	public final void method5397(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - 1;
		if (local4 < 0 || local4 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(24) int local24 = local4 * 8; local24 >= 0; local24 -= 8) {
			this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> local24);
		}
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(Z)I")
	public final int method5398() {
		this.anInt6475 += 2;
		return (this.aByteArray89[this.anInt6475 - 1] - 128 & 0xFF) + ((this.aByteArray89[this.anInt6475 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "(I)I")
	public final int method5399() {
		this.anInt6475 += 3;
		return (this.aByteArray89[this.anInt6475 - 1] & 0xFF) + ((this.aByteArray89[this.anInt6475 - 3] & 0xFF) << 16) + ((this.aByteArray89[this.anInt6475 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!hp", name = "l", descriptor = "(I)I")
	public final int method5400() {
		this.anInt6475 += 2;
		return ((this.aByteArray89[this.anInt6475 - 1] & 0xFF) << 8) + (this.aByteArray89[this.anInt6475 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!hp", name = "m", descriptor = "(B)Ljava/lang/String;")
	public final String method5401() {
		@Pc(6) int local6 = this.anInt6475;
		while (this.aByteArray89[this.anInt6475++] != 0) {
		}
		@Pc(36) int local36 = this.anInt6475 - local6 - 1;
		return local36 == 0 ? "" : Static98.method1759(local6, local36, this.aByteArray89);
	}

	@OriginalMember(owner = "client!hp", name = "m", descriptor = "(I)Z")
	public final boolean method5402() {
		this.anInt6475 -= 4;
		@Pc(17) int local17 = Static233.method1221(0, this.anInt6475, this.aByteArray89);
		@Pc(21) int local21 = this.method5407();
		return local17 == local21;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I[BII)V")
	public final void method5403(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(19) int local19 = arg1 - 1; local19 >= 0; local19--) {
			arg0[local19] = (byte) (this.aByteArray89[this.anInt6475++] - 128);
		}
	}

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "(B)I")
	public final int method5404() {
		this.anInt6475 += 3;
		return (this.aByteArray89[this.anInt6475 - 3] & 0xFF) + ((this.aByteArray89[this.anInt6475 - 1] & 0xFF) << 16) + ((this.aByteArray89[this.anInt6475 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "(BI)V")
	public final void method5405(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 8);
		this.aByteArray89[this.anInt6475++] = (byte) arg0;
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 24);
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!hp", name = "o", descriptor = "(B)Ljava/lang/String;")
	public final String method5406() {
		@Pc(14) byte local14 = this.aByteArray89[this.anInt6475++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(35) int local35 = this.anInt6475;
		while (this.aByteArray89[this.anInt6475++] != 0) {
		}
		@Pc(54) int local54 = this.anInt6475 - local35 - 1;
		return local54 == 0 ? "" : Static98.method1759(local35, local54, this.aByteArray89);
	}

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "(I)I")
	public final int method5407() {
		this.anInt6475 += 4;
		return (this.aByteArray89[this.anInt6475 - 1] & 0xFF) + ((this.aByteArray89[this.anInt6475 - 2] & 0xFF) << 8) + ((this.aByteArray89[this.anInt6475 + -4] & 0xFF) << 24) + ((this.aByteArray89[this.anInt6475 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "(II)V")
	public final void method5408(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5396(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5393(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZI)V")
	public final void method5409(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt6475++] = (byte) arg0;
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 8);
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 16);
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(Z)Ljava/lang/String;")
	public final String method5410() {
		@Pc(14) byte local14 = this.aByteArray89[this.anInt6475++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(28) int local28 = this.method5377();
		if (local28 + this.anInt6475 > this.aByteArray89.length) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(54) String local54 = Static355.method4888(this.anInt6475, this.aByteArray89, local28);
		this.anInt6475 += local28;
		return local54;
	}

	@OriginalMember(owner = "client!hp", name = "o", descriptor = "(I)I")
	public final int method5411() {
		return this.aByteArray89[this.anInt6475++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "(BI)V")
	public final void method5412(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt6475 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray89[this.anInt6475 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hp", name = "p", descriptor = "(B)I")
	public final int method5413() {
		@Pc(16) int local16 = this.aByteArray89[this.anInt6475] & 0xFF;
		return local16 >= 128 ? this.method5362() - 49152 : this.method5366() + -64;
	}

	@OriginalMember(owner = "client!hp", name = "q", descriptor = "(B)B")
	public final byte method5414() {
		return (byte) (this.aByteArray89[this.anInt6475++] - 128);
	}

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "(II)J")
	public final long method5415(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(19) int local19 = local6 * 8;
		@Pc(21) long local21 = 0L;
		while (local19 >= 0) {
			local21 |= ((long) this.aByteArray89[this.anInt6475++] & 0xFFL) << local19;
			local19 -= 8;
		}
		return local21;
	}

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "(Z)B")
	public final byte method5416() {
		return this.aByteArray89[this.anInt6475++];
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(ZI)V")
	public final void method5417(@OriginalArg(1) int arg0) {
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 24);
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 16);
		this.aByteArray89[this.anInt6475++] = (byte) (arg0 >> 8);
		this.aByteArray89[this.anInt6475++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hp", name = "r", descriptor = "(B)I")
	public final int method5418() {
		@Pc(16) int local16 = Static233.method1221(0, this.anInt6475, this.aByteArray89);
		this.method5417(local16);
		return local16;
	}
}

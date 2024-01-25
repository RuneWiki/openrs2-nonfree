import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public class Class2_Sub16 extends Class2 {

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "[B")
	public byte[] aByteArray112;

	@OriginalMember(owner = "client!kk", name = "bb", descriptor = "I")
	public int anInt6145;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(I)V")
	public Class2_Sub16(@OriginalArg(0) int arg0) {
		this.aByteArray112 = Static88.method1655(arg0);
		this.anInt6145 = 0;
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "([B)V")
	public Class2_Sub16(@OriginalArg(0) byte[] arg0) {
		this.aByteArray112 = arg0;
		this.anInt6145 = 0;
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)I")
	public final int method5311() {
		@Pc(17) int local17 = this.aByteArray112[this.anInt6145] & 0xFF;
		return local17 < 128 ? this.method5350() : this.method5312() - 32768;
	}

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)I")
	public final int method5312() {
		this.anInt6145 += 2;
		return (this.aByteArray112[this.anInt6145 - 1] & 0xFF) + ((this.aByteArray112[this.anInt6145 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)V")
	public final void method5313(@OriginalArg(1) int arg0) {
		this.aByteArray112[this.anInt6145++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)Ljava/lang/String;")
	public final String method5314() {
		@Pc(19) byte local19 = this.aByteArray112[this.anInt6145++];
		if (local19 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(29) int local29 = this.anInt6145;
		while (this.aByteArray112[this.anInt6145++] != 0) {
		}
		@Pc(49) int local49 = this.anInt6145 - local29 - 1;
		return local49 == 0 ? "" : Static49.method851(this.aByteArray112, local49, local29);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)I")
	public final int method5315() {
		return -this.aByteArray112[this.anInt6145++] & 0xFF;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)V")
	public final void method5316(@OriginalArg(0) int arg0) {
		this.aByteArray112[this.anInt6145 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "(I)I")
	public final int method5317() {
		this.anInt6145 += 2;
		return (this.aByteArray112[this.anInt6145 - 2] - 128 & 0xFF) + ((this.aByteArray112[this.anInt6145 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(II)V")
	public final void method5318(@OriginalArg(0) int arg0) {
		this.aByteArray112[this.anInt6145++] = (byte) arg0;
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "(I)I")
	public final int method5319() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		for (local11 = this.method5311(); local11 == 32767; local11 = this.method5311()) {
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BI)V")
	public final void method5320(@OriginalArg(1) int arg0) {
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 16);
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 8);
		this.aByteArray112[this.anInt6145++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "(I)I")
	public final int method5321() {
		this.anInt6145 += 3;
		return ((this.aByteArray112[this.anInt6145 - 1] & 0xFF) << 8) + (this.aByteArray112[this.anInt6145 - 3] << 16 & 0xFF0000) + (this.aByteArray112[this.anInt6145 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)J")
	public final long method5322(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(26) int local26 = local2 * 8;
		@Pc(28) long local28 = 0L;
		while (local26 >= 0) {
			local28 |= ((long) this.aByteArray112[this.anInt6145++] & 0xFFL) << local26;
			local26 -= 8;
		}
		return local28;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)I")
	public final int method5323() {
		this.anInt6145 += 2;
		return ((this.aByteArray112[this.anInt6145 - 2] & 0xFF) << 8) + (this.aByteArray112[this.anInt6145 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)B")
	public final byte method5325() {
		return (byte) (this.aByteArray112[this.anInt6145++] - 128);
	}

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "(I)Z")
	public final boolean method5326() {
		this.anInt6145 -= 4;
		@Pc(24) int local24 = Static204.method3472(this.aByteArray112, this.anInt6145, 0);
		@Pc(28) int local28 = this.method5346();
		return local28 == local24;
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(II)V")
	public final void method5328(@OriginalArg(1) int arg0) {
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 8);
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(B)I")
	public final int method5329() {
		@Pc(16) byte local16 = this.aByteArray112[this.anInt6145++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local16 & 0x7F | local18) << 7;
			local16 = this.aByteArray112[this.anInt6145++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "(I)B")
	public final byte method5330() {
		return this.aByteArray112[this.anInt6145++];
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)V")
	public final void method5332(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5358(arg0 >>> 28 | 0x80);
					}
					this.method5358(arg0 >>> 21 | 0x80);
				}
				this.method5358(arg0 >>> 14 | 0x80);
			}
			this.method5358(arg0 >>> 7 | 0x80);
		}
		this.method5358(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "(II)V")
	public final void method5333(@OriginalArg(1) int arg0) {
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "(I)I")
	public final int method5335() {
		this.anInt6145 += 2;
		@Pc(36) int local36 = (this.aByteArray112[this.anInt6145 - 2] & 0xFF) + ((this.aByteArray112[this.anInt6145 - 1] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "(II)V")
	public final void method5336(@OriginalArg(0) int arg0) {
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 16);
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 24);
		this.aByteArray112[this.anInt6145++] = (byte) arg0;
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "(B)I")
	public final int method5337() {
		this.anInt6145 += 2;
		@Pc(41) int local41 = (this.aByteArray112[this.anInt6145 - 1] - 128 & 0xFF) + ((this.aByteArray112[this.anInt6145 - 2] & 0xFF) << 8);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "(I)I")
	public final int method5338() {
		return this.aByteArray112[this.anInt6145++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(BI)V")
	public final void method5339(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5358(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5351(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I[BIZ)V")
	public final void method5340(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(16) int local16 = arg1 - 1; local16 >= 0; local16--) {
			arg0[local16] = this.aByteArray112[this.anInt6145++];
		}
	}

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "(I)I")
	public final int method5341() {
		this.anInt6145 += 2;
		@Pc(36) int local36 = (this.aByteArray112[this.anInt6145 - 1] & 0xFF) + ((this.aByteArray112[this.anInt6145 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "(I)I")
	public final int method5342() {
		@Pc(19) int local19 = this.aByteArray112[this.anInt6145] & 0xFF;
		return local19 >= 128 ? this.method5312() - 49152 : this.method5350() - 64;
	}

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "(II)V")
	public final void method5343(@OriginalArg(1) int arg0) {
		this.aByteArray112[this.anInt6145++] = (byte) arg0;
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 8);
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 16);
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([BIIZ)V")
	public final void method5344(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			this.aByteArray112[this.anInt6145++] = arg0[local3];
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(IB)I")
	public final int method5345(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static204.method3472(this.aByteArray112, this.anInt6145, arg0);
		this.method5355(local11);
		return local11;
	}

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "(I)I")
	public final int method5346() {
		this.anInt6145 += 4;
		return (this.aByteArray112[this.anInt6145 - 1] & 0xFF) + ((this.aByteArray112[this.anInt6145 - 3] & 0xFF) << 16) + ((this.aByteArray112[this.anInt6145 + -4] & 0xFF) << 24) + ((this.aByteArray112[this.anInt6145 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method5347(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt6145;
		this.anInt6145 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method5357(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(33) BigInteger local33 = local23.modPow(arg0, arg1);
		@Pc(36) byte[] local36 = local33.toByteArray();
		this.anInt6145 = 0;
		this.method5358(local36.length);
		this.method5344(local36, local36.length);
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(Z)J")
	public final long method5348() {
		@Pc(15) long local15 = (long) this.method5346() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method5346() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "(B)I")
	public final int method5349() {
		this.anInt6145 += 2;
		return (this.aByteArray112[this.anInt6145 - 2] & 0xFF) + ((this.aByteArray112[this.anInt6145 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "(B)I")
	public final int method5350() {
		return this.aByteArray112[this.anInt6145++] & 0xFF;
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(IB)V")
	public final void method5351(@OriginalArg(0) int arg0) {
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 8);
		this.aByteArray112[this.anInt6145++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "(I)I")
	public final int method5353() {
		this.anInt6145 += 4;
		return (this.aByteArray112[this.anInt6145 - 2] & 0xFF) + ((this.aByteArray112[this.anInt6145 - 3] & 0xFF) << 24) + ((this.aByteArray112[this.anInt6145 + -4] & 0xFF) << 16) + ((this.aByteArray112[this.anInt6145 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(IZ)V")
	public final void method5354(@OriginalArg(0) int arg0) {
		this.aByteArray112[this.anInt6145 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray112[this.anInt6145 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray112[this.anInt6145 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray112[this.anInt6145 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "(II)V")
	public final void method5355(@OriginalArg(0) int arg0) {
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 24);
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 16);
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 8);
		this.aByteArray112[this.anInt6145++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "(B)I")
	public final int method5356() {
		this.anInt6145 += 3;
		return ((this.aByteArray112[this.anInt6145 - 3] & 0xFF) << 16) + ((this.aByteArray112[this.anInt6145 - 2] << 8 & 0xFF00) + (this.aByteArray112[this.anInt6145 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II[BZ)V")
	public final void method5357(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0; local5++) {
			arg1[local5] = this.aByteArray112[this.anInt6145++];
		}
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(BI)V")
	public final void method5358(@OriginalArg(1) int arg0) {
		this.aByteArray112[this.anInt6145++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "(B)I")
	public final int method5359() {
		return 128 - this.aByteArray112[this.anInt6145++] & 0xFF;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IJI)V")
	public final void method5360(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(21) int local21 = local2 * 8; local21 >= 0; local21 -= 8) {
			this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> local21);
		}
	}

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "(II)V")
	public final void method5361(@OriginalArg(1) int arg0) {
		this.aByteArray112[this.anInt6145++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method5362(@OriginalArg(1) String arg0) {
		@Pc(15) int local15 = arg0.indexOf(0);
		if (local15 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local15 + " - cannot pjstr");
		}
		this.anInt6145 += Static55.method916(this.anInt6145, arg0.length(), this.aByteArray112, arg0);
		this.aByteArray112[this.anInt6145++] = 0;
	}

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "(I)Ljava/lang/String;")
	public final String method5363() {
		if (this.aByteArray112[this.anInt6145] == 0) {
			this.anInt6145++;
			return null;
		} else {
			return this.method5364();
		}
	}

	@OriginalMember(owner = "client!kk", name = "u", descriptor = "(I)Ljava/lang/String;")
	public final String method5364() {
		@Pc(6) int local6 = this.anInt6145;
		while (this.aByteArray112[this.anInt6145++] != 0) {
		}
		@Pc(29) int local29 = this.anInt6145 - local6 - 1;
		return local29 == 0 ? "" : Static49.method851(this.aByteArray112, local29, local6);
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(IB)V")
	public final void method5365(@OriginalArg(0) int arg0) {
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 + 128);
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "(I)I")
	public final int method5366() {
		this.anInt6145 += 4;
		return ((this.aByteArray112[this.anInt6145 - 4] & 0xFF) << 8) + (this.aByteArray112[this.anInt6145 - 1] << 16 & 0xFF0000) + ((this.aByteArray112[this.anInt6145 + -2] & 0xFF) << 24) + (this.aByteArray112[this.anInt6145 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z[I)V")
	public final void method5367(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.anInt6145 / 8;
		this.anInt6145 = 0;
		for (@Pc(19) int local19 = 0; local19 < local10; local19++) {
			@Pc(25) int local25 = this.method5346();
			@Pc(29) int local29 = this.method5346();
			@Pc(31) int local31 = 0;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local25 += (local29 >>> 5 ^ local29 << 4) + local29 ^ arg0[local31 & 0x3] + local31;
				local31 += -1640531527;
				local29 += local31 + arg0[local31 >>> 11 & 0x3] ^ (local25 >>> 5 ^ local25 << 4) + local25;
			}
			this.anInt6145 -= 8;
			this.method5355(local25);
			this.method5355(local29);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(JB)V")
	public final void method5368(@OriginalArg(0) long arg0) {
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 56);
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 48);
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 40);
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 32);
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 24);
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 16);
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 8);
		this.aByteArray112[this.anInt6145++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kk", name = "w", descriptor = "(I)I")
	public final int method5369() {
		this.anInt6145 += 4;
		return (this.aByteArray112[this.anInt6145 - 4] & 0xFF) + ((this.aByteArray112[this.anInt6145 - 2] & 0xFF) << 16) + ((this.aByteArray112[-1 + this.anInt6145] & 0xFF) << 24) + ((this.aByteArray112[this.anInt6145 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!kk", name = "x", descriptor = "(I)B")
	public final byte method5371() {
		return (byte) (128 - this.aByteArray112[this.anInt6145++]);
	}

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "(II)V")
	public final void method5372(@OriginalArg(1) int arg0) {
		this.aByteArray112[this.anInt6145++] = (byte) arg0;
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 8);
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 16);
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!kk", name = "y", descriptor = "(I)B")
	public final byte method5373() {
		return (byte) -this.aByteArray112[this.anInt6145++];
	}

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "(IB)V")
	public final void method5374(@OriginalArg(0) int arg0) {
		this.aByteArray112[this.anInt6145++] = (byte) arg0;
		this.aByteArray112[this.anInt6145++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I[IZI)V")
	public final void method5375(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(10) int local10 = this.anInt6145;
		this.anInt6145 = 5;
		@Pc(19) int local19 = (arg1 - 5) / 8;
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(26) int local26 = this.method5346();
			@Pc(30) int local30 = this.method5346();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= arg0[local32 >>> 11 & 0x96E00003] + local32 ^ local26 + (local26 >>> 5 ^ local26 << 4);
				local32 -= -1640531527;
				local26 -= local30 + (local30 >>> 5 ^ local30 << 4) ^ local32 - -arg0[local32 & 0x3];
			}
			this.anInt6145 -= 8;
			this.method5355(local26);
			this.method5355(local30);
		}
		this.anInt6145 = local10;
	}
}

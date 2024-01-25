import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public class Class5_Sub15 extends Class5 {

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "[B")
	public byte[] aByteArray93;

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
	public int anInt7013;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(I)V")
	public Class5_Sub15(@OriginalArg(0) int arg0) {
		this.aByteArray93 = Static291.method3605(arg0);
		this.anInt7013 = 0;
	}

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "([B)V")
	public Class5_Sub15(@OriginalArg(0) byte[] arg0) {
		this.aByteArray93 = arg0;
		this.anInt7013 = 0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)I")
	public final int method5537() {
		this.anInt7013 += 2;
		@Pc(38) int local38 = ((this.aByteArray93[this.anInt7013 - 1] & 0xFF) << 8) + (this.aByteArray93[this.anInt7013 - 2] - 128 & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B[BII)V")
	public final void method5538(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			arg0[local14] = (byte) (this.aByteArray93[this.anInt7013++] - 128);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)I")
	public final int method5539() {
		return this.aByteArray93[this.anInt7013++] & 0xFF;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[BI)V")
	public final void method5540(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = this.aByteArray93[this.anInt7013++];
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)I")
	public final int method5541() {
		this.anInt7013 += 3;
		return ((this.aByteArray93[this.anInt7013 - 3] & 0xFF) << 16) + ((this.aByteArray93[this.anInt7013 - 2] & 0xFF) << 8) + (this.aByteArray93[this.anInt7013 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)I")
	public final int method5542() {
		@Pc(16) int local16 = this.aByteArray93[this.anInt7013] & 0xFF;
		return local16 < 128 ? this.method5539() : this.method5598() - 32768;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)V")
	public final void method5543(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5583(arg0 >>> 28 | 0x80);
					}
					this.method5583(arg0 >>> 21 | 0x80);
				}
				this.method5583(arg0 >>> 14 | 0x80);
			}
			this.method5583(arg0 >>> 7 | 0x80);
		}
		this.method5583(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([IIII)V")
	public final void method5544(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt7013;
		this.anInt7013 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method5603();
			@Pc(30) int local30 = this.method5603();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= local26 + (local26 >>> 5 ^ local26 << 4) ^ local32 - -arg0[local32 >>> 11 & 0x49600003];
				local32 -= -1640531527;
				local26 -= (local30 << 4 ^ local30 >>> 5) + local30 ^ local32 + arg0[local32 & 0x3];
			}
			this.anInt7013 -= 8;
			this.method5550(local26);
			this.method5550(local30);
		}
		this.anInt7013 = local8;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method5545(@OriginalArg(0) String arg0) {
		@Pc(12) int local12 = arg0.indexOf(0);
		if (local12 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local12 + " - cannot pjstr");
		}
		this.anInt7013 += Static408.method5395(this.aByteArray93, arg0.length(), arg0, this.anInt7013);
		this.aByteArray93[this.anInt7013++] = 0;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)I")
	public final int method5546() {
		this.anInt7013 += 2;
		return (this.aByteArray93[this.anInt7013 - 2] & 0xFF) + ((this.aByteArray93[this.anInt7013 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)I")
	public final int method5547() {
		this.anInt7013 += 4;
		return ((this.aByteArray93[this.anInt7013 - 3] & 0xFF) << 24) + (this.aByteArray93[this.anInt7013 - 4] << 16 & 0xFF0000) + ((this.aByteArray93[this.anInt7013 + -1] & 0xFF) << 8) + (this.aByteArray93[this.anInt7013 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(B)B")
	public final byte method5548() {
		return (byte) -this.aByteArray93[this.anInt7013++];
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)Ljava/lang/String;")
	public final String method5549() {
		@Pc(13) int local13 = this.anInt7013;
		while (this.aByteArray93[this.anInt7013++] != 0) {
		}
		@Pc(33) int local33 = this.anInt7013 - local13 - 1;
		return local33 == 0 ? "" : Static8.method148(local13, local33, this.aByteArray93);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(BI)V")
	public final void method5550(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt7013++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
	public final void method5551(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5583(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5566(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)V")
	public final void method5552(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 + 128);
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(Z)J")
	public final long method5553() {
		@Pc(16) long local16 = (long) this.method5603() & 0xFFFFFFFFL;
		@Pc(23) long local23 = (long) this.method5603() & 0xFFFFFFFFL;
		return (local16 << 32) + local23;
	}

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "(I)Z")
	public final boolean method5554() {
		this.anInt7013 -= 4;
		@Pc(24) int local24 = Static27.method445(this.anInt7013, this.aByteArray93, 0);
		@Pc(28) int local28 = this.method5603();
		return local24 == local28;
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(B)I")
	public final int method5555() {
		this.anInt7013 += 3;
		return ((this.aByteArray93[this.anInt7013 - 1] & 0xFF) << 8) + (((this.aByteArray93[this.anInt7013 - 3] & 0xFF) << 16) + (this.aByteArray93[this.anInt7013 - 2] & 0xFF));
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZ)V")
	public final void method5556(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt7013 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBI[B)V")
	public final void method5557(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray93[this.anInt7013++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "(I)I")
	public final int method5558() {
		this.anInt7013 += 3;
		@Pc(43) int local43 = (this.aByteArray93[this.anInt7013 - 1] & 0xFF) + ((this.aByteArray93[this.anInt7013 - 2] & 0xFF) << 8) + ((this.aByteArray93[this.anInt7013 - 3] & 0xFF) << 16);
		if (local43 > 8388607) {
			local43 -= 16777216;
		}
		return local43;
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(Z)I")
	public final int method5559() {
		this.anInt7013 += 4;
		return (this.aByteArray93[this.anInt7013 - 4] & 0xFF) + ((this.aByteArray93[this.anInt7013 - 3] & 0xFF) << 8) + ((this.aByteArray93[this.anInt7013 + -2] & 0xFF) << 16) + ((this.aByteArray93[this.anInt7013 + -1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(ZI)V")
	public final void method5561(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt7013++] = (byte) arg0;
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(IB)V")
	public final void method5562(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "(I)I")
	public final int method5563() {
		this.anInt7013 += 4;
		return ((this.aByteArray93[this.anInt7013 - 4] & 0xFF) << 8) + ((this.aByteArray93[this.anInt7013 - 1] & 0xFF) << 16) + ((this.aByteArray93[this.anInt7013 + -2] & 0xFF) << 24) + (this.aByteArray93[this.anInt7013 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)V")
	public final void method5564(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt7013++] = (byte) arg0;
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(Z)Ljava/lang/String;")
	public final String method5565() {
		if (this.aByteArray93[this.anInt7013] == 0) {
			this.anInt7013++;
			return null;
		} else {
			return this.method5549();
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(IZ)V")
	public final void method5566(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt7013++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(IB)V")
	public final void method5567(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt7013++] = (byte) arg0;
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(ZI)V")
	public final void method5568(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt7013++] = (byte) arg0;
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZJI)V")
	public final void method5569(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(19) int local19 = local2 * 8; local19 >= 0; local19 -= 8) {
			this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> local19);
		}
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(B)B")
	public final byte method5570() {
		return (byte) (128 - this.aByteArray93[this.anInt7013++]);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(II)I")
	public final int method5571(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static27.method445(this.anInt7013, this.aByteArray93, arg0);
		this.method5550(local16);
		return local16;
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(II)V")
	public final void method5572(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt7013 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt7013 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt7013 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt7013 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "(I)I")
	public final int method5573() {
		this.anInt7013 += 2;
		@Pc(34) int local34 = ((this.aByteArray93[this.anInt7013 - 2] & 0xFF) << 8) + (this.aByteArray93[this.anInt7013 - 1] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(Z)I")
	public final int method5574() {
		@Pc(16) byte local16 = this.aByteArray93[this.anInt7013++];
		@Pc(25) int local25 = 0;
		while (local16 < 0) {
			local25 = (local25 | local16 & 0x7F) << 7;
			local16 = this.aByteArray93[this.anInt7013++];
		}
		return local25 | local16;
	}

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "(B)I")
	public final int method5575() {
		@Pc(11) int local11 = Static27.method445(this.anInt7013, this.aByteArray93, 0);
		this.method5550(local11);
		return local11;
	}

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "(Z)I")
	public final int method5576() {
		@Pc(16) int local16 = this.aByteArray93[this.anInt7013] & 0xFF;
		return local16 >= 128 ? this.method5598() - 49152 : this.method5539() + -64;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(Ljava/lang/String;B)V")
	public final void method5577(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = Static180.method2458(arg0);
		this.aByteArray93[this.anInt7013++] = 0;
		this.method5543(local7);
		this.anInt7013 += Static39.method633(this.aByteArray93, arg0, this.anInt7013);
	}

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "(I)I")
	public final int method5578() {
		return this.aByteArray93[this.anInt7013++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(IB)V")
	public final void method5580(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt7013++] = (byte) arg0;
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "(I)B")
	public final byte method5582() {
		return (byte) (this.aByteArray93[this.anInt7013++] - 128);
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(IB)V")
	public final void method5583(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt7013++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(II)V")
	public final void method5584(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt7013 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt7013 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "(I)I")
	public final int method5585() {
		return 128 - this.aByteArray93[this.anInt7013++] & 0xFF;
	}

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "(Z)I")
	public final int method5586() {
		this.anInt7013 += 2;
		@Pc(31) int local31 = (this.aByteArray93[this.anInt7013 - 1] & 0xFF) + ((this.aByteArray93[this.anInt7013 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(JB)V")
	public final void method5587(@OriginalArg(0) long arg0) {
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 56);
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 48);
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 40);
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 32);
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt7013++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(ZI)V")
	public final void method5588(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method5589(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt7013;
		this.anInt7013 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method5540(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt7013 = 0;
		this.method5566(local31.length);
		this.method5557(local31.length, local31);
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(II)J")
	public final long method5590(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(22) int local22 = local2 * 8;
		@Pc(24) long local24 = 0L;
		while (local22 >= 0) {
			local24 |= ((long) this.aByteArray93[this.anInt7013++] & 0xFFL) << local22;
			local22 -= 8;
		}
		return local24;
	}

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "(I)I")
	public final int method5591() {
		this.anInt7013 += 2;
		return (this.aByteArray93[this.anInt7013 - 2] - 128 & 0xFF) + ((this.aByteArray93[this.anInt7013 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "(I)I")
	public final int method5592() {
		@Pc(7) int local7 = 0;
		@Pc(18) int local18;
		for (local18 = this.method5542(); local18 == 32767; local18 = this.method5542()) {
			local7 += 32767;
		}
		return local7 + local18;
	}

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "(I)I")
	public final int method5593() {
		this.anInt7013 += 2;
		return (this.aByteArray93[this.anInt7013 - 1] - 128 & 0xFF) + ((this.aByteArray93[this.anInt7013 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fh", name = "r", descriptor = "(I)I")
	public final int method5594() {
		return -this.aByteArray93[this.anInt7013++] & 0xFF;
	}

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "(II)V")
	public final void method5595(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt7013++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(IZ)V")
	public final void method5596(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt7013++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "(II)V")
	public final void method5597(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt7013++] = (byte) arg0;
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt7013++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "(I)I")
	public final int method5598() {
		this.anInt7013 += 2;
		return ((this.aByteArray93[this.anInt7013 - 2] & 0xFF) << 8) + (this.aByteArray93[this.anInt7013 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "(B)Ljava/lang/String;")
	public final String method5599() {
		@Pc(14) byte local14 = this.aByteArray93[this.anInt7013++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(35) int local35 = this.method5574();
		if (this.anInt7013 + local35 > this.aByteArray93.length) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(56) String local56 = Static220.method2892(this.aByteArray93, this.anInt7013, local35);
		this.anInt7013 += local35;
		return local56;
	}

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "(I)B")
	public final byte method5600() {
		return this.aByteArray93[this.anInt7013++];
	}

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "(B)Ljava/lang/String;")
	public final String method5601() {
		@Pc(14) byte local14 = this.aByteArray93[this.anInt7013++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(24) int local24 = this.anInt7013;
		while (this.aByteArray93[this.anInt7013++] != 0) {
		}
		@Pc(44) int local44 = this.anInt7013 - local24 - 1;
		return local44 == 0 ? "" : Static8.method148(local24, local44, this.aByteArray93);
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(IZ)V")
	public final void method5602(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt7013++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "(I)I")
	public final int method5603() {
		this.anInt7013 += 4;
		return (this.aByteArray93[this.anInt7013 - 1] & 0xFF) + ((this.aByteArray93[this.anInt7013 - 2] & 0xFF) << 8) + ((this.aByteArray93[this.anInt7013 - 3] & 0xFF) << 16) + ((this.aByteArray93[-4 + this.anInt7013] & 0xFF) << 24);
	}
}

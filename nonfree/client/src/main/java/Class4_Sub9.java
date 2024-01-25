import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public class Class4_Sub9 extends Class4 {

	@OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
	public int anInt7219 = 0;

	@OriginalMember(owner = "client!eh", name = "q", descriptor = "[B")
	public byte[] aByteArray97;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(I)V")
	public Class4_Sub9(@OriginalArg(0) int arg0) {
		this.aByteArray97 = Static219.method3783(arg0);
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "([B)V")
	public Class4_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray97 = arg0;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
	public final void method5961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray97[this.anInt7219++] = (byte) arg1;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)Ljava/lang/String;")
	public final String method5962() {
		@Pc(21) byte local21 = this.aByteArray97[this.anInt7219++];
		if (local21 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(35) int local35 = this.method5969();
		if (this.aByteArray97.length < local35 + this.anInt7219) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(61) String local61 = Static550.method7598(this.anInt7219, local35, this.aByteArray97);
		this.anInt7219 += local35;
		return local61;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)V")
	public final void method5963(@OriginalArg(0) int arg0) {
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 24);
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 16);
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 8);
		this.aByteArray97[this.anInt7219++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)V")
	public final void method5964(@OriginalArg(0) int arg0) {
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 8);
		this.aByteArray97[this.anInt7219++] = (byte) arg0;
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 24);
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)I")
	public final int method5965() {
		this.anInt7219 += 4;
		return (this.aByteArray97[this.anInt7219 - 2] & 0xFF) + ((this.aByteArray97[this.anInt7219 - 3] & 0xFF) << 24) + ((this.aByteArray97[this.anInt7219 + -4] & 0xFF) << 16) + ((this.aByteArray97[this.anInt7219 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI[BI)V")
	public final void method5966(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = this.aByteArray97[this.anInt7219++];
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)I")
	public final int method5967() {
		@Pc(11) int local11 = Static266.method4355(this.aByteArray97, 0, this.anInt7219);
		this.method5963(local11);
		return local11;
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)Ljava/lang/String;")
	public final String method5968() {
		@Pc(14) byte local14 = this.aByteArray97[this.anInt7219++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(24) int local24 = this.anInt7219;
		while (this.aByteArray97[this.anInt7219++] != 0) {
		}
		@Pc(53) int local53 = this.anInt7219 - local24 - 1;
		return local53 == 0 ? "" : Static519.method7291(this.aByteArray97, local24, local53);
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(B)I")
	public final int method5969() {
		@Pc(21) byte local21 = this.aByteArray97[this.anInt7219++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local21 & 0x7F | local23) << 7;
			local21 = this.aByteArray97[this.anInt7219++];
		}
		return local21 | local23;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)V")
	public final void method5970(@OriginalArg(1) int arg0) {
		this.aByteArray97[this.anInt7219++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(B)I")
	public final int method5971() {
		this.anInt7219 += 3;
		return ((this.aByteArray97[this.anInt7219 - 3] & 0xFF) << 16) + ((this.aByteArray97[this.anInt7219 - 1] & 0xFF) << 8) + (this.aByteArray97[this.anInt7219 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(JII)V")
	public final void method5972(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(21) int local21 = local2 * 8; local21 >= 0; local21 -= 8) {
			this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> local21);
		}
	}

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)I")
	public final int method5973() {
		this.anInt7219 += 4;
		return (this.aByteArray97[this.anInt7219 - 4] & 0xFF) + ((this.aByteArray97[this.anInt7219 - 2] & 0xFF) << 16) + ((this.aByteArray97[-1 + this.anInt7219] & 0xFF) << 24) + ((this.aByteArray97[this.anInt7219 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "(I)I")
	public final int method5974() {
		this.anInt7219 += 3;
		@Pc(51) int local51 = (this.aByteArray97[this.anInt7219 - 1] & 0xFF) + ((this.aByteArray97[this.anInt7219 - 2] & 0xFF) << 8) + ((this.aByteArray97[this.anInt7219 - 3] & 0xFF) << 16);
		if (local51 > 8388607) {
			local51 -= 16777216;
		}
		return local51;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method5975(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(14) int local14 = this.anInt7219;
		this.anInt7219 = 0;
		@Pc(20) byte[] local20 = new byte[local14];
		this.method5966(local14, local20);
		@Pc(31) BigInteger local31 = new BigInteger(local20);
		@Pc(36) BigInteger local36 = local31.modPow(arg1, arg0);
		@Pc(39) byte[] local39 = local36.toByteArray();
		this.anInt7219 = 0;
		this.method6012(local39.length);
		this.method5985(local39, local39.length);
	}

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "(B)I")
	public final int method5976() {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.method5978();
		while (local16 == 32767) {
			local16 = this.method5978();
			local12 += 32767;
		}
		return local12 + local16;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)I")
	public final int method5977() {
		this.anInt7219 += 2;
		return (this.aByteArray97[this.anInt7219 - 2] & 0xFF) + ((this.aByteArray97[this.anInt7219 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "(I)I")
	public final int method5978() {
		@Pc(11) int local11 = this.aByteArray97[this.anInt7219] & 0xFF;
		return local11 >= 128 ? this.method5982() - 32768 : this.method6015();
	}

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "(B)I")
	public final int method5980() {
		this.anInt7219 += 2;
		@Pc(42) int local42 = ((this.aByteArray97[this.anInt7219 - 1] & 0xFF) << 8) + (this.aByteArray97[this.anInt7219 - 2] - 128 & 0xFF);
		if (local42 > 32767) {
			local42 -= 65536;
		}
		return local42;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(Z)B")
	public final byte method5981() {
		return (byte) -this.aByteArray97[this.anInt7219++];
	}

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "(B)I")
	public final int method5982() {
		this.anInt7219 += 2;
		return (this.aByteArray97[this.anInt7219 - 1] & 0xFF) + ((this.aByteArray97[this.anInt7219 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(BI)V")
	public final void method5983(@OriginalArg(1) int arg0) {
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 16);
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 24);
		this.aByteArray97[this.anInt7219++] = (byte) arg0;
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(II)V")
	public final void method5984(@OriginalArg(0) int arg0) {
		this.aByteArray97[this.anInt7219++] = (byte) arg0;
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[BII)V")
	public final void method5985(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			this.aByteArray97[this.anInt7219++] = arg0[local7];
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II[BI)V")
	public final void method5986(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = (byte) (this.aByteArray97[this.anInt7219++] - 128);
		}
	}

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "(I)Ljava/lang/String;")
	public final String method5987() {
		if (this.aByteArray97[this.anInt7219] == 0) {
			this.anInt7219++;
			return null;
		} else {
			return this.method6010();
		}
	}

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "(B)I")
	public final int method5988() {
		this.anInt7219 += 4;
		return ((this.aByteArray97[this.anInt7219 - 4] & 0xFF) << 8) + ((this.aByteArray97[this.anInt7219 - 1] & 0xFF) << 16) + ((this.aByteArray97[-2 + this.anInt7219] & 0xFF) << 24) + (this.aByteArray97[this.anInt7219 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(II)V")
	public final void method5989(@OriginalArg(1) int arg0) {
		this.aByteArray97[this.anInt7219++] = (byte) arg0;
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "(II)V")
	public final void method5990(@OriginalArg(0) int arg0) {
		this.aByteArray97[this.anInt7219 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray97[this.anInt7219 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray97[this.anInt7219 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray97[this.anInt7219 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "(II)V")
	public final void method5992(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5961(-345277664, arg0 >>> 28 | 0x80);
					}
					this.method5961(-345277664, arg0 >>> 21 | 0x80);
				}
				this.method5961(-345277664, arg0 >>> 14 | 0x80);
			}
			this.method5961(-345277664, arg0 >>> 7 | 0x80);
		}
		this.method5961(-345277664, arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(BI)V")
	public final void method5993(@OriginalArg(1) int arg0) {
		this.aByteArray97[this.anInt7219++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "(I)I")
	public final int method5994() {
		this.anInt7219 += 2;
		return ((this.aByteArray97[this.anInt7219 - 2] & 0xFF) << 8) + (this.aByteArray97[this.anInt7219 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "(II)V")
	public final void method5995(@OriginalArg(1) int arg0) {
		this.aByteArray97[this.anInt7219++] = (byte) arg0;
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 8);
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 16);
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZ)V")
	public final void method5996(@OriginalArg(0) int arg0) {
		this.aByteArray97[this.anInt7219 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray97[this.anInt7219 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "(B)J")
	public final long method5997() {
		@Pc(15) long local15 = (long) this.method6026() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method6026() & 0xFFFFFFFFL;
		return local22 + (local15 << 32);
	}

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "(B)V")
	public final void method5998() {
		if (this.aByteArray97 != null) {
			Static219.method3782(this.aByteArray97);
		}
		this.aByteArray97 = null;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[IBI)V")
	public final void method5999(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(8) int local8 = this.anInt7219;
		this.anInt7219 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(25) int local25 = 0; local25 < local18; local25++) {
			@Pc(31) int local31 = this.method6026();
			@Pc(35) int local35 = this.method6026();
			@Pc(37) int local37 = -957401312;
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local35 -= arg1[local37 >>> 11 & 0x8C600003] + local37 ^ local31 + (local31 << 4 ^ local31 >>> 5);
				local37 -= -1640531527;
				local31 -= local37 + arg1[local37 & 0x3] ^ local35 + (local35 >>> 5 ^ local35 << 4);
			}
			this.anInt7219 -= 8;
			this.method5963(local31);
			this.method5963(local35);
		}
		this.anInt7219 = local8;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method6000(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt7219 += Static316.method4829(this.aByteArray97, this.anInt7219, arg0.length(), arg0);
		this.aByteArray97[this.anInt7219++] = 0;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(IB)V")
	public final void method6001(@OriginalArg(0) int arg0) {
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "(II)V")
	public final void method6002(@OriginalArg(1) int arg0) {
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 + 128);
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "(I)I")
	public final int method6003() {
		this.anInt7219 += 2;
		@Pc(37) int local37 = (this.aByteArray97[this.anInt7219 - 1] & 0xFF) + ((this.aByteArray97[this.anInt7219 - 2] & 0xFF) << 8);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "(B)B")
	public final byte method6004() {
		return (byte) (128 - this.aByteArray97[this.anInt7219++]);
	}

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "(B)I")
	public final int method6005() {
		this.anInt7219 += 2;
		return ((this.aByteArray97[this.anInt7219 - 1] & 0xFF) << 8) + (this.aByteArray97[this.anInt7219 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "(II)I")
	public final int method6006(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static266.method4355(this.aByteArray97, arg0, this.anInt7219);
		this.method5963(local16);
		return local16;
	}

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "(I)I")
	public final int method6007() {
		@Pc(11) int local11 = this.aByteArray97[this.anInt7219] & 0xFF;
		return local11 >= 128 ? this.method5982() - 49152 : this.method6015() + -64;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BJ)V")
	public final void method6008(@OriginalArg(1) long arg0) {
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 56);
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 48);
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 40);
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 32);
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 24);
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 16);
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 8);
		this.aByteArray97[this.anInt7219++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(Z)I")
	public final int method6009() {
		return -this.aByteArray97[this.anInt7219++] & 0xFF;
	}

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "(B)Ljava/lang/String;")
	public final String method6010() {
		@Pc(13) int local13 = this.anInt7219;
		while (this.aByteArray97[this.anInt7219++] != 0) {
		}
		@Pc(36) int local36 = this.anInt7219 - local13 - 1;
		return local36 == 0 ? "" : Static519.method7291(this.aByteArray97, local13, local36);
	}

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "(II)V")
	public final void method6011(@OriginalArg(0) int arg0) {
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 8);
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(BI)V")
	public final void method6012(@OriginalArg(1) int arg0) {
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 8);
		this.aByteArray97[this.anInt7219++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(IZ)V")
	public final void method6013(@OriginalArg(0) int arg0) {
		this.aByteArray97[this.anInt7219++] = (byte) arg0;
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 8);
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 16);
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "(I)I")
	public final int method6014() {
		return this.aByteArray97[this.anInt7219++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "(I)I")
	public final int method6015() {
		return this.aByteArray97[this.anInt7219++] & 0xFF;
	}

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "(II)V")
	public final void method6016(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5961(-345277664, arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method6012(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!eh", name = "o", descriptor = "(I)I")
	public final int method6017() {
		this.anInt7219 += 2;
		@Pc(36) int local36 = (this.aByteArray97[this.anInt7219 - 2] & 0xFF) + ((this.aByteArray97[this.anInt7219 - 1] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!eh", name = "p", descriptor = "(I)I")
	public final int method6018() {
		this.anInt7219 += 2;
		@Pc(40) int local40 = ((this.aByteArray97[this.anInt7219 - 2] & 0xFF) << 8) + (this.aByteArray97[this.anInt7219 - 1] - 128 & 0xFF);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "(II)J")
	public final long method6019(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(19) int local19 = local2 * 8;
		@Pc(26) long local26 = 0L;
		while (local19 >= 0) {
			local26 |= ((long) this.aByteArray97[this.anInt7219++] & 0xFFL) << local19;
			local19 -= 8;
		}
		return local26;
	}

	@OriginalMember(owner = "client!eh", name = "q", descriptor = "(I)I")
	public final int method6020() {
		this.anInt7219 += 4;
		return ((this.aByteArray97[this.anInt7219 - 1] & 0xFF) << 24) + ((this.aByteArray97[this.anInt7219 - 2] & 0xFF) << 16) + ((this.aByteArray97[this.anInt7219 + -3] & 0xFF) << 8) + (this.aByteArray97[this.anInt7219 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!eh", name = "r", descriptor = "(I)B")
	public final byte method6021() {
		return this.aByteArray97[this.anInt7219++];
	}

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "(II)V")
	public final void method6022(@OriginalArg(0) int arg0) {
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 16);
		this.aByteArray97[this.anInt7219++] = (byte) (arg0 >> 8);
		this.aByteArray97[this.anInt7219++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eh", name = "o", descriptor = "(B)I")
	public final int method6023() {
		this.anInt7219 += 3;
		return ((this.aByteArray97[this.anInt7219 - 2] & 0xFF) << 8) + ((this.aByteArray97[this.anInt7219 - 3] & 0xFF) << 16) + (this.aByteArray97[this.anInt7219 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!eh", name = "p", descriptor = "(B)Z")
	public final boolean method6024() {
		this.anInt7219 -= 4;
		@Pc(22) int local22 = Static266.method4355(this.aByteArray97, 0, this.anInt7219);
		@Pc(26) int local26 = this.method6026();
		return local26 == local22;
	}

	@OriginalMember(owner = "client!eh", name = "s", descriptor = "(I)B")
	public final byte method6025() {
		return (byte) (this.aByteArray97[this.anInt7219++] - 128);
	}

	@OriginalMember(owner = "client!eh", name = "t", descriptor = "(I)I")
	public final int method6026() {
		this.anInt7219 += 4;
		return ((this.aByteArray97[this.anInt7219 - 2] & 0xFF) << 8) + ((this.aByteArray97[this.anInt7219 - 4] << 24 & 0xFF000000) + ((this.aByteArray97[this.anInt7219 - 3] & 0xFF) << 16) + (this.aByteArray97[this.anInt7219 + -1] & 0xFF));
	}

	@OriginalMember(owner = "client!eh", name = "q", descriptor = "(B)I")
	public final int method6027() {
		return 128 - this.aByteArray97[this.anInt7219++] & 0xFF;
	}

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "(II)V")
	public final void method6028(@OriginalArg(0) int arg0) {
		this.aByteArray97[this.anInt7219 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(ILjava/lang/String;)V")
	public final void method6029(@OriginalArg(1) String arg0) {
		@Pc(14) int local14 = Static142.method2869(arg0);
		this.aByteArray97[this.anInt7219++] = 0;
		this.method5992(local14);
		this.anInt7219 += Static85.method2037(this.aByteArray97, this.anInt7219, arg0);
	}
}

import java.awt.Rectangle;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public class Class4_Sub9 extends Class4 {

	@OriginalMember(owner = "client!fh", name = "S", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray3 = new Rectangle[100];

	@OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
	public int anInt6207;

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "[B")
	public byte[] aByteArray81;

	static {
		for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
			aRectangleArray3[local6] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(I)V")
	public Class4_Sub9(@OriginalArg(0) int arg0) {
		this.anInt6207 = 0;
		this.aByteArray81 = Static173.method2401(arg0);
	}

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "([B)V")
	public Class4_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray81 = arg0;
		this.anInt6207 = 0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)I")
	public final int method4995() {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16;
		for (local16 = this.method5033(); local16 == 32767; local16 = this.method5033()) {
			local12 += 32767;
		}
		return local12 + local16;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
	public final void method4996(@OriginalArg(1) int arg0) {
		this.aByteArray81[this.anInt6207++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)I")
	public final int method4997() {
		this.anInt6207 += 4;
		return (this.aByteArray81[this.anInt6207 - 1] & 0xFF) + (((this.aByteArray81[this.anInt6207 - 4] & 0xFF) << 24) - (-((this.aByteArray81[this.anInt6207 - 3] & 0xFF) << 16) - ((this.aByteArray81[this.anInt6207 - 2] & 0xFF) << 8)));
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)I")
	public final int method4998() {
		this.anInt6207 += 4;
		return (this.aByteArray81[this.anInt6207 - 2] & 0xFF) + ((this.aByteArray81[this.anInt6207 - 1] & 0xFF) << 8) + ((this.aByteArray81[this.anInt6207 + -4] & 0xFF) << 16) + ((this.aByteArray81[this.anInt6207 - 3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZ)V")
	public final void method4999(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt6207++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)I")
	public final int method5000() {
		@Pc(21) byte local21 = this.aByteArray81[this.anInt6207++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local23 | local21 & 0x7F) << 7;
			local21 = this.aByteArray81[this.anInt6207++];
		}
		return local23 | local21;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)V")
	public final void method5001(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 16);
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 8);
		this.aByteArray81[this.anInt6207++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method5002(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(13) int local13 = this.anInt6207;
		this.anInt6207 = 0;
		@Pc(19) byte[] local19 = new byte[local13];
		this.method5005(local19, local13);
		@Pc(30) BigInteger local30 = new BigInteger(local19);
		@Pc(35) BigInteger local35 = local30.modPow(arg1, arg0);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt6207 = 0;
		this.method5029(local38.length);
		this.method5052(local38.length, local38);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)V")
	public final void method5004(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4999(arg0 >>> 28 | 0x80);
					}
					this.method4999(arg0 >>> 21 | 0x80);
				}
				this.method4999(arg0 >>> 14 | 0x80);
			}
			this.method4999(arg0 >>> 7 | 0x80);
		}
		this.method4999(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([BIII)V")
	public final void method5005(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg1; local10++) {
			arg0[local10] = this.aByteArray81[this.anInt6207++];
		}
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(II)I")
	public final int method5006(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = Static262.method3734(arg0, this.aByteArray81, this.anInt6207);
		this.method5047(local16);
		return local16;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)I")
	public final int method5007() {
		return this.aByteArray81[this.anInt6207++] & 0xFF;
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)I")
	public final int method5008() {
		this.anInt6207 += 3;
		return (this.aByteArray81[this.anInt6207 - 1] & 0xFF) + (((this.aByteArray81[this.anInt6207 - 3] & 0xFF) << 16) + ((this.aByteArray81[this.anInt6207 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(II)J")
	public final long method5009(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(31) int local31 = local6 * 8;
		@Pc(33) long local33 = 0L;
		while (local31 >= 0) {
			local33 |= ((long) this.aByteArray81[this.anInt6207++] & 0xFFL) << local31;
			local31 -= 8;
		}
		return local33;
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(II)V")
	public final void method5010(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4999(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5029(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)B")
	public final byte method5011() {
		return (byte) -this.aByteArray81[this.anInt6207++];
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(B)I")
	public final int method5012() {
		return 128 - this.aByteArray81[this.anInt6207++] & 0xFF;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(Z)I")
	public final int method5013() {
		return this.aByteArray81[this.anInt6207++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(Z)Ljava/lang/String;")
	public final String method5015() {
		@Pc(19) byte local19 = this.aByteArray81[this.anInt6207++];
		if (local19 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(29) int local29 = this.anInt6207;
		while (this.aByteArray81[this.anInt6207++] != 0) {
		}
		@Pc(48) int local48 = this.anInt6207 - local29 - 1;
		return local48 == 0 ? "" : Static383.method5080(local48, local29, this.aByteArray81);
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(B)I")
	public final int method5016() {
		this.anInt6207 += 4;
		return ((this.aByteArray81[this.anInt6207 - 1] & 0xFF) << 24) - (-((this.aByteArray81[this.anInt6207 - 2] & 0xFF) << 16) - ((this.aByteArray81[this.anInt6207 - 3] & 0xFF) << 8) - (this.aByteArray81[this.anInt6207 + -4] & 0xFF));
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(II)V")
	public final void method5017(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 8);
		this.aByteArray81[this.anInt6207++] = (byte) arg0;
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 24);
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "(II)V")
	public final void method5018(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 8);
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "(I)Ljava/lang/String;")
	public final String method5019() {
		@Pc(14) byte local14 = this.aByteArray81[this.anInt6207++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(30) int local30 = this.method5000();
		if (this.anInt6207 + local30 > this.aByteArray81.length) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(55) String local55 = Static391.method5160(this.anInt6207, this.aByteArray81, local30);
		this.anInt6207 += local30;
		return local55;
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(B)I")
	public final int method5020() {
		@Pc(16) int local16 = this.aByteArray81[this.anInt6207] & 0xFF;
		return local16 >= 128 ? this.method5028() - 49152 : this.method5007() + -64;
	}

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "(II)V")
	public final void method5021(@OriginalArg(1) int arg0) {
		this.aByteArray81[this.anInt6207 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray81[this.anInt6207 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray81[this.anInt6207 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray81[this.anInt6207 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "(I)B")
	public final byte method5022() {
		return (byte) (this.aByteArray81[this.anInt6207++] - 128);
	}

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "(II)V")
	public final void method5023(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 16);
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 24);
		this.aByteArray81[this.anInt6207++] = (byte) arg0;
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "(I)J")
	public final long method5024() {
		@Pc(10) long local10 = (long) this.method4997() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method4997() & 0xFFFFFFFFL;
		return (local10 << 32) + local22;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(IB)V")
	public final void method5025(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt6207 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "(I)B")
	public final byte method5026() {
		return (byte) (128 - this.aByteArray81[this.anInt6207++]);
	}

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "(I)I")
	public final int method5027() {
		@Pc(16) int local16 = Static262.method3734(0, this.aByteArray81, this.anInt6207);
		this.method5047(local16);
		return local16;
	}

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "(B)I")
	public final int method5028() {
		this.anInt6207 += 2;
		return (this.aByteArray81[this.anInt6207 - 1] & 0xFF) + ((this.aByteArray81[this.anInt6207 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)V")
	public final void method5029(@OriginalArg(1) int arg0) {
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 8);
		this.aByteArray81[this.anInt6207++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(JI)V")
	public final void method5030(@OriginalArg(0) long arg0) {
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 56);
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 48);
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 40);
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 32);
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 24);
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 16);
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 8);
		this.aByteArray81[this.anInt6207++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "(B)I")
	public final int method5031() {
		this.anInt6207 += 3;
		return ((this.aByteArray81[this.anInt6207 - 3] & 0xFF) << 16) + ((this.aByteArray81[this.anInt6207 - 1] & 0xFF) << 8) + (this.aByteArray81[this.anInt6207 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "(B)Ljava/lang/String;")
	public final String method5032() {
		if (this.aByteArray81[this.anInt6207] == 0) {
			this.anInt6207++;
			return null;
		} else {
			return this.method5038();
		}
	}

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "(I)I")
	public final int method5033() {
		@Pc(11) int local11 = this.aByteArray81[this.anInt6207] & 0xFF;
		return local11 >= 128 ? this.method5028() - 32768 : this.method5007();
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(IZ)V")
	public final void method5035(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt6207++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "(I)I")
	public final int method5036() {
		this.anInt6207 += 4;
		return ((this.aByteArray81[this.anInt6207 - 4] & 0xFF) << 8) + ((this.aByteArray81[this.anInt6207 - 2] & 0xFF) << 24) + ((this.aByteArray81[this.anInt6207 + -1] & 0xFF) << 16) + (this.aByteArray81[this.anInt6207 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "(I)I")
	public final int method5037() {
		this.anInt6207 += 2;
		@Pc(34) int local34 = ((this.aByteArray81[this.anInt6207 - 1] & 0xFF) << 8) + (this.aByteArray81[this.anInt6207 - 2] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "(B)Ljava/lang/String;")
	public final String method5038() {
		@Pc(6) int local6 = this.anInt6207;
		while (this.aByteArray81[this.anInt6207++] != 0) {
		}
		@Pc(37) int local37 = this.anInt6207 - local6 - 1;
		return local37 == 0 ? "" : Static383.method5080(local37, local6, this.aByteArray81);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public final void method5039(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt6207 += Static109.method5034(this.anInt6207, this.aByteArray81, arg0.length(), arg0);
		this.aByteArray81[this.anInt6207++] = 0;
	}

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "(II)V")
	public final void method5040(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt6207++] = (byte) arg0;
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 8);
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 16);
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIB[I)V")
	public final void method5041(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt6207;
		this.anInt6207 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			@Pc(33) int local33 = this.method4997();
			@Pc(37) int local37 = this.method4997();
			@Pc(39) int local39 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= (local33 >>> 5 ^ local33 << 4) + local33 ^ arg1[local39 >>> 11 & 0x3] + local39;
				local39 -= -1640531527;
				local33 -= local37 + (local37 >>> 5 ^ local37 << 4) ^ arg1[local39 & 0x3] + local39;
			}
			this.anInt6207 -= 8;
			this.method5047(local33);
			this.method5047(local37);
		}
		this.anInt6207 = local8;
	}

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "(B)I")
	public final int method5042() {
		this.anInt6207 += 2;
		return ((this.aByteArray81[this.anInt6207 - 2] & 0xFF) << 8) + (this.aByteArray81[this.anInt6207 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method5043(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = Static36.method494(arg0);
		this.aByteArray81[this.anInt6207++] = 0;
		this.method5004(local7);
		this.anInt6207 += Static250.method3305(arg0, this.anInt6207, this.aByteArray81);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III[B)V")
	public final void method5044(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (this.aByteArray81[this.anInt6207++] - 128);
		}
	}

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "(I)I")
	public final int method5045() {
		this.anInt6207 += 2;
		return (this.aByteArray81[this.anInt6207 - 2] - 128 & 0xFF) + ((this.aByteArray81[this.anInt6207 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "(B)I")
	public final int method5046() {
		return -this.aByteArray81[this.anInt6207++] & 0xFF;
	}

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "(II)V")
	public final void method5047(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 24);
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 16);
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 8);
		this.aByteArray81[this.anInt6207++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "(II)V")
	public final void method5048(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt6207++] = (byte) arg0;
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 8);
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 16);
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "(B)I")
	public final int method5049() {
		this.anInt6207 += 2;
		@Pc(36) int local36 = ((this.aByteArray81[this.anInt6207 - 1] & 0xFF) << 8) + (this.aByteArray81[this.anInt6207 - 2] & 0xFF);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "(II)V")
	public final void method5050(@OriginalArg(1) int arg0) {
		this.aByteArray81[this.anInt6207 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray81[this.anInt6207 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "(B)I")
	public final int method5051() {
		this.anInt6207 += 2;
		@Pc(38) int local38 = ((this.aByteArray81[this.anInt6207 - 2] & 0xFF) << 8) + (this.aByteArray81[this.anInt6207 - 1] - 128 & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[BZI)V")
	public final void method5052(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aByteArray81[this.anInt6207++] = arg1[local1];
		}
	}

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "(II)V")
	public final void method5053(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 + 128);
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "(I)Z")
	public final boolean method5054() {
		this.anInt6207 -= 4;
		@Pc(17) int local17 = Static262.method3734(0, this.aByteArray81, this.anInt6207);
		@Pc(21) int local21 = this.method4997();
		return local21 == local17;
	}

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "(II)V")
	public final void method5055(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt6207++] = (byte) arg0;
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "(I)I")
	public final int method5056() {
		this.anInt6207 += 2;
		return ((this.aByteArray81[this.anInt6207 - 1] & 0xFF) << 8) + (this.aByteArray81[this.anInt6207 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBJ)V")
	public final void method5057(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(8) int local8 = arg0 - 1;
		if (local8 < 0 || local8 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(27) int local27 = local8 * 8; local27 >= 0; local27 -= 8) {
			this.aByteArray81[this.anInt6207++] = (byte) (arg1 >> local27);
		}
	}

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "(II)V")
	public final void method5058(@OriginalArg(0) int arg0) {
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "(II)V")
	public final void method5060(@OriginalArg(1) int arg0) {
		this.aByteArray81[this.anInt6207++] = (byte) arg0;
		this.aByteArray81[this.anInt6207++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(Z)I")
	public final int method5061() {
		this.anInt6207 += 2;
		@Pc(31) int local31 = (this.aByteArray81[this.anInt6207 - 1] & 0xFF) + ((this.aByteArray81[this.anInt6207 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "(I)B")
	public final byte method5063() {
		return this.aByteArray81[this.anInt6207++];
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([IB)V")
	public final void method5064(@OriginalArg(0) int[] arg0) {
		@Pc(18) int local18 = this.anInt6207 / 8;
		this.anInt6207 = 0;
		for (@Pc(23) int local23 = 0; local23 < local18; local23++) {
			@Pc(29) int local29 = this.method4997();
			@Pc(33) int local33 = this.method4997();
			@Pc(35) int local35 = 0;
			@Pc(39) int local39 = 32;
			while (local39-- > 0) {
				local29 += arg0[local35 & 0x3] + local35 ^ (local33 << 4 ^ local33 >>> 5) - -local33;
				local35 += -1640531527;
				local33 += local35 + arg0[local35 >>> 11 & 0x3] ^ local29 + (local29 >>> 5 ^ local29 << 4);
			}
			this.anInt6207 -= 8;
			this.method5047(local29);
			this.method5047(local33);
		}
	}
}

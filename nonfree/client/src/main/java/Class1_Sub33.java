import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public class Class1_Sub33 extends Class1 {

	@OriginalMember(owner = "client!re", name = "mb", descriptor = "[B")
	public byte[] aByteArray86;

	@OriginalMember(owner = "client!re", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(I)V")
	public Class1_Sub33(@OriginalArg(0) int arg0) {
		this.aByteArray86 = Static301.method4498(arg0);
		this.lb = 0;
	}

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "([B)V")
	public Class1_Sub33(@OriginalArg(0) byte[] arg0) {
		this.lb = 0;
		this.aByteArray86 = arg0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
	public final void method5126(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.lb++] = (byte) arg0;
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IJ)V")
	public final void method5127(@OriginalArg(1) long arg0) {
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 56);
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 48);
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 40);
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 32);
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 24);
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.lb++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)Ljava/lang/String;")
	public final String method5128() {
		@Pc(14) int local14 = this.lb;
		while (this.aByteArray86[this.lb++] != 0) {
		}
		@Pc(33) int local33 = this.lb - local14 - 1;
		return local33 == 0 ? "" : Static41.method635(local33, this.aByteArray86, local14);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I[III)V")
	public final void method5129(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(15) int local15 = this.lb;
		this.lb = 5;
		@Pc(25) int local25 = (arg0 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = this.method5150();
			@Pc(37) int local37 = this.method5150();
			@Pc(39) int local39 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= (local33 >>> 5 ^ local33 << 4) + local33 ^ arg1[local39 >>> 11 & 0xBF800003] + local39;
				local39 -= -1640531527;
				local33 -= arg1[local39 & 0x3] + local39 ^ (local37 << 4 ^ local37 >>> 5) - -local37;
			}
			this.lb -= 8;
			this.method5142(local33);
			this.method5142(local37);
		}
		this.lb = local15;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public final void method5130(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(13) int local13 = this.lb;
		this.lb = 0;
		@Pc(19) byte[] local19 = new byte[local13];
		this.method5135(local13, local19);
		@Pc(30) BigInteger local30 = new BigInteger(local19);
		@Pc(35) BigInteger local35 = local30.modPow(arg0, arg1);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.lb = 0;
		this.method5165(local38.length);
		this.method5152(local38.length, local38);
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)I")
	public final int method5131() {
		this.lb += 2;
		return ((this.aByteArray86[this.lb - 2] & 0xFF) << 8) + (this.aByteArray86[this.lb - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)I")
	public final int method5133(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static245.method1575(arg0, this.aByteArray86, this.lb);
		this.method5142(local11);
		return local11;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I[BBI)V")
	public final void method5134(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(16) int local16 = arg0 - 1; local16 >= 0; local16--) {
			arg1[local16] = (byte) (this.aByteArray86[this.lb++] - 128);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III[B)V")
	public final void method5135(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = this.aByteArray86[this.lb++];
		}
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(I)I")
	public final int method5136() {
		@Pc(19) int local19 = this.aByteArray86[this.lb] & 0xFF;
		return local19 < 128 ? this.method5174() - 64 : this.method5177() + -49152;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(II)V")
	public final void method5137(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.lb++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(IB)V")
	public final void method5138(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.lb++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(II)V")
	public final void method5139(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.lb++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(II)V")
	public final void method5140(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.lb++] = (byte) arg0;
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)V")
	public final void method5142(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 24);
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.lb++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method5143(@OriginalArg(0) String arg0) {
		@Pc(14) int local14 = arg0.indexOf(0);
		if (local14 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local14 + " - cannot pjstr");
		}
		this.lb += Static369.method2450(arg0.length(), arg0, this.aByteArray86, this.lb);
		this.aByteArray86[this.lb++] = 0;
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(I)I")
	public final int method5144() {
		this.lb += 2;
		return ((this.aByteArray86[this.lb - 1] & 0xFF) << 8) + (this.aByteArray86[this.lb - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IBJ)V")
	public final void method5145(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(24) int local24 = local6 * 8; local24 >= 0; local24 -= 8) {
			this.aByteArray86[this.lb++] = (byte) (arg1 >> local24);
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(B)I")
	public final int method5146() {
		this.lb += 2;
		@Pc(36) int local36 = (this.aByteArray86[this.lb - 2] & 0xFF) + ((this.aByteArray86[this.lb - 1] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(II)V")
	public final void method5148(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.lb - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray86[this.lb - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(II)V")
	public final void method5149(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.lb - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!re", name = "h", descriptor = "(I)I")
	public final int method5150() {
		this.lb += 4;
		return (this.aByteArray86[this.lb - 1] & 0xFF) + ((this.aByteArray86[this.lb - 2] & 0xFF) << 8) + ((this.aByteArray86[this.lb + -3] & 0xFF) << 16) + ((this.aByteArray86[this.lb + -4] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(B)Ljava/lang/String;")
	public final String method5151() {
		if (this.aByteArray86[this.lb] == 0) {
			this.lb++;
			return null;
		} else {
			return this.method5128();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II[BB)V")
	public final void method5152(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aByteArray86[this.lb++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(IB)V")
	public final void method5153(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.lb++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ)V")
	public final void method5154(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.lb++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(B)I")
	public final int method5155() {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16;
		for (local16 = this.method5181(); local16 == 32767; local16 = this.method5181()) {
			local7 += 32767;
		}
		return local7 + local16;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(IB)V")
	public final void method5156(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.lb++] = (byte) arg0;
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 24);
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!re", name = "i", descriptor = "(I)I")
	public final int method5157() {
		this.lb += 4;
		return ((this.aByteArray86[this.lb - 4] & 0xFF) << 8) + ((this.aByteArray86[this.lb - 1] & 0xFF) << 16) + ((this.aByteArray86[this.lb + -2] & 0xFF) << 24) + (this.aByteArray86[this.lb + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!re", name = "h", descriptor = "(II)V")
	public final void method5158(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5165(arg0 >>> 28 | 0x80);
					}
					this.method5165(arg0 >>> 21 | 0x80);
				}
				this.method5165(arg0 >>> 14 | 0x80);
			}
			this.method5165(arg0 >>> 7 | 0x80);
		}
		this.method5165(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!re", name = "j", descriptor = "(I)I")
	public final int method5159() {
		this.lb += 3;
		return ((this.aByteArray86[this.lb - 3] & 0xFF) << 16) - (-((this.aByteArray86[this.lb - 2] & 0xFF) << 8) - (this.aByteArray86[this.lb - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!re", name = "k", descriptor = "(I)I")
	public final int method5160() {
		this.lb += 4;
		return ((this.aByteArray86[this.lb - 1] & 0xFF) << 8) + ((this.aByteArray86[this.lb - 3] & 0xFF) << 24) + ((this.aByteArray86[this.lb + -4] & 0xFF) << 16) + (this.aByteArray86[this.lb - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(IB)V")
	public final void method5161(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.lb++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(B)I")
	public final int method5162() {
		return 128 - this.aByteArray86[this.lb++] & 0xFF;
	}

	@OriginalMember(owner = "client!re", name = "l", descriptor = "(I)I")
	public final int method5163() {
		this.lb += 4;
		return (this.aByteArray86[this.lb - 4] & 0xFF) + ((this.aByteArray86[this.lb - 1] & 0xFF) << 24) + ((this.aByteArray86[this.lb + -2] & 0xFF) << 16) + ((this.aByteArray86[this.lb - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)B")
	public final byte method5164() {
		return (byte) (128 - this.aByteArray86[this.lb++]);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(BI)V")
	public final void method5165(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.lb++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!re", name = "m", descriptor = "(I)I")
	public final int method5166() {
		return -this.aByteArray86[this.lb++] & 0xFF;
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(B)I")
	public final int method5167() {
		this.lb += 2;
		@Pc(41) int local41 = (this.aByteArray86[this.lb - 2] - 128 & 0xFF) + ((this.aByteArray86[this.lb - 1] & 0xFF) << 8);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(B)I")
	public final int method5168() {
		@Pc(21) byte local21 = this.aByteArray86[this.lb++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local21 & 0x7F | local23) << 7;
			local21 = this.aByteArray86[this.lb++];
		}
		return local23 | local21;
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(IB)V")
	public final void method5169(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.lb++] = (byte) arg0;
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(BI)V")
	public final void method5170(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.lb++] = (byte) (arg0 + 128);
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!re", name = "i", descriptor = "(II)J")
	public final long method5171(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(24) int local24 = local2 * 8;
		@Pc(26) long local26 = 0L;
		while (local24 >= 0) {
			local26 |= ((long) this.aByteArray86[this.lb++] & 0xFFL) << local24;
			local24 -= 8;
		}
		return local26;
	}

	@OriginalMember(owner = "client!re", name = "n", descriptor = "(I)I")
	public final int method5172() {
		return this.aByteArray86[this.lb++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(IZ)V")
	public final void method5173(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 24);
		this.aByteArray86[this.lb++] = (byte) arg0;
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!re", name = "o", descriptor = "(I)I")
	public final int method5174() {
		return this.aByteArray86[this.lb++] & 0xFF;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I[I)V")
	public final void method5175(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.lb / 8;
		this.lb = 0;
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			@Pc(25) int local25 = this.method5150();
			@Pc(29) int local29 = this.method5150();
			@Pc(31) int local31 = 0;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local25 += local29 + (local29 << 4 ^ local29 >>> 5) ^ local31 + arg0[local31 & 0x3];
				local31 += -1640531527;
				local29 += local31 + arg0[local31 >>> 11 & 0x3] ^ (local25 << 4 ^ local25 >>> 5) + local25;
			}
			this.lb -= 8;
			this.method5142(local25);
			this.method5142(local29);
		}
	}

	@OriginalMember(owner = "client!re", name = "j", descriptor = "(II)V")
	public final void method5176(@OriginalArg(1) int arg0) {
		this.aByteArray86[this.lb++] = (byte) arg0;
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 8);
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 16);
		this.aByteArray86[this.lb++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!re", name = "p", descriptor = "(I)I")
	public final int method5177() {
		this.lb += 2;
		return (this.aByteArray86[this.lb - 1] & 0xFF) + ((this.aByteArray86[this.lb - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!re", name = "h", descriptor = "(B)J")
	public final long method5178() {
		@Pc(16) long local16 = (long) this.method5150() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method5150() & 0xFFFFFFFFL;
		return local25 + (local16 << 32);
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(IB)V")
	public final void method5179(@OriginalArg(0) int arg0) {
		this.aByteArray86[this.lb - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray86[this.lb - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray86[this.lb - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray86[this.lb - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!re", name = "q", descriptor = "(I)I")
	public final int method5180() {
		this.lb += 2;
		@Pc(31) int local31 = ((this.aByteArray86[this.lb - 2] & 0xFF) << 8) + (this.aByteArray86[this.lb - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!re", name = "r", descriptor = "(I)I")
	public final int method5181() {
		@Pc(11) int local11 = this.aByteArray86[this.lb] & 0xFF;
		return local11 >= 128 ? this.method5177() - 32768 : this.method5174();
	}

	@OriginalMember(owner = "client!re", name = "s", descriptor = "(I)B")
	public final byte method5182() {
		return (byte) (this.aByteArray86[this.lb++] - 128);
	}

	@OriginalMember(owner = "client!re", name = "t", descriptor = "(I)I")
	public final int method5183() {
		this.lb += 2;
		return ((this.aByteArray86[this.lb - 1] & 0xFF) << 8) + (this.aByteArray86[this.lb - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!re", name = "u", descriptor = "(I)Z")
	public final boolean method5184() {
		this.lb -= 4;
		@Pc(22) int local22 = Static245.method1575(0, this.aByteArray86, this.lb);
		@Pc(28) int local28 = this.method5150();
		return local22 == local28;
	}

	@OriginalMember(owner = "client!re", name = "k", descriptor = "(II)V")
	public final void method5185(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5165(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5138(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!re", name = "v", descriptor = "(I)I")
	public final int method5186() {
		this.lb += 3;
		return ((this.aByteArray86[this.lb - 2] & 0xFF) << 8) + (((this.aByteArray86[this.lb - 1] & 0xFF) << 16) + (this.aByteArray86[this.lb - 3] & 0xFF));
	}

	@OriginalMember(owner = "client!re", name = "w", descriptor = "(I)B")
	public final byte method5187() {
		return (byte) -this.aByteArray86[this.lb++];
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(Z)B")
	public final byte method5188() {
		return this.aByteArray86[this.lb++];
	}

	@OriginalMember(owner = "client!re", name = "i", descriptor = "(B)Ljava/lang/String;")
	public final String method5189() {
		@Pc(14) byte local14 = this.aByteArray86[this.lb++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.lb;
		while (this.aByteArray86[this.lb++] != 0) {
		}
		@Pc(50) int local50 = this.lb - local27 - 1;
		return local50 == 0 ? "" : Static41.method635(local50, this.aByteArray86, local27);
	}
}

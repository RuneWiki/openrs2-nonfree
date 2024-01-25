import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!lk", name = "tb", descriptor = "[B")
	public byte[] aByteArray77;

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
	public int anInt4788;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(I)V")
	public Class2_Sub13(@OriginalArg(0) int arg0) {
		this.aByteArray77 = Static72.method1296(arg0);
		this.anInt4788 = 0;
	}

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "([B)V")
	public Class2_Sub13(@OriginalArg(0) byte[] arg0) {
		this.anInt4788 = 0;
		this.aByteArray77 = arg0;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZ)V")
	public final void method4190(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt4788++] = (byte) arg0;
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZI[BI)V")
	public final void method4191(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aByteArray77[this.anInt4788++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)I")
	public final int method4192() {
		@Pc(11) int local11 = this.aByteArray77[this.anInt4788] & 0xFF;
		return local11 >= 128 ? this.method4245() - 49152 : this.method4240() + -64;
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)I")
	public final int method4193() {
		return 128 - this.aByteArray77[this.anInt4788++] & 0xFF;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZI)J")
	public final long method4194(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(19) int local19 = local2 * 8;
		@Pc(26) long local26 = 0L;
		while (local19 >= 0) {
			local26 |= ((long) this.aByteArray77[this.anInt4788++] & 0xFFL) << local19;
			local19 -= 8;
		}
		return local26;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)V")
	public final void method4195(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt4788++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)I")
	public final int method4196() {
		return this.aByteArray77[this.anInt4788++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "([BIIZ)V")
	public final void method4197(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (this.aByteArray77[this.anInt4788++] - 128);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)Z")
	public final boolean method4198() {
		this.anInt4788 -= 4;
		@Pc(22) int local22 = Static63.method1158(this.anInt4788, 0, this.aByteArray77);
		@Pc(26) int local26 = this.method4239();
		return local26 == local22;
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(IB)V")
	public final void method4199(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt4788++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IJZ)V")
	public final void method4200(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(24) int local24 = local6 * 8; local24 >= 0; local24 -= 8) {
			this.aByteArray77[this.anInt4788++] = (byte) (arg1 >> local24);
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public final String method4201() {
		@Pc(11) int local11 = this.anInt4788;
		while (this.aByteArray77[this.anInt4788++] != 0) {
		}
		@Pc(34) int local34 = this.anInt4788 - local11 - 1;
		return local34 == 0 ? "" : Static158.method2649(this.aByteArray77, local34, local11);
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public final String method4202() {
		@Pc(20) byte local20 = this.aByteArray77[this.anInt4788++];
		if (local20 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(30) int local30 = this.anInt4788;
		while (this.aByteArray77[this.anInt4788++] != 0) {
		}
		@Pc(53) int local53 = this.anInt4788 - local30 - 1;
		return local53 == 0 ? "" : Static158.method2649(this.aByteArray77, local53, local30);
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(ZI)V")
	public final void method4203(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt4788++] = (byte) arg0;
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(III[I)V")
	public final void method4204(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt4788;
		this.anInt4788 = 5;
		@Pc(23) int local23 = (arg0 - 5) / 8;
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) int local31 = this.method4239();
			@Pc(35) int local35 = this.method4239();
			@Pc(37) int local37 = -957401312;
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local35 -= arg1[local37 >>> 11 & 0xE0400003] + local37 ^ local31 + (local31 << 4 ^ local31 >>> 5);
				local37 -= -1640531527;
				local31 -= local37 + arg1[local37 & 0x3] ^ (local35 << 4 ^ local35 >>> 5) - -local35;
			}
			this.anInt4788 -= 8;
			this.method4218(local31);
			this.method4218(local35);
		}
		this.anInt4788 = local8;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V")
	public final void method4205(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4207(arg0 >>> 28 | 0x80);
					}
					this.method4207(arg0 >>> 21 | 0x80);
				}
				this.method4207(arg0 >>> 14 | 0x80);
			}
			this.method4207(arg0 >>> 7 | 0x80);
		}
		this.method4207(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BI)V")
	public final void method4207(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt4788++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IJ)V")
	public final void method4208(@OriginalArg(1) long arg0) {
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 56);
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 48);
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 40);
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 32);
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt4788++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "(I)I")
	public final int method4209() {
		this.anInt4788 += 4;
		return (this.aByteArray77[this.anInt4788 - 3] & 0xFF) + ((this.aByteArray77[this.anInt4788 - 1] & 0xFF) << 16) + ((this.aByteArray77[this.anInt4788 + -2] & 0xFF) << 24) + ((this.aByteArray77[this.anInt4788 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(IB)V")
	public final void method4210(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt4788++] = (byte) arg0;
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)I")
	public final int method4211() {
		@Pc(11) int local11 = this.aByteArray77[this.anInt4788] & 0xFF;
		return local11 >= 128 ? this.method4245() - 32768 : this.method4240();
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)V")
	public final void method4212(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 + 128);
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(B)I")
	public final int method4213() {
		@Pc(16) byte local16 = this.aByteArray77[this.anInt4788++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local18 | local16 & 0x7F) << 7;
			local16 = this.aByteArray77[this.anInt4788++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(IB)V")
	public final void method4215(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(II)V")
	public final void method4216(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt4788++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "(I)B")
	public final byte method4217() {
		return this.aByteArray77[this.anInt4788++];
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(IZ)V")
	public final void method4218(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt4788++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "(IB)V")
	public final void method4219(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4207(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4199(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "(I)I")
	public final int method4220() {
		this.anInt4788 += 2;
		return ((this.aByteArray77[this.anInt4788 - 1] & 0xFF) << 8) + (this.aByteArray77[this.anInt4788 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "(I)I")
	public final int method4221() {
		this.anInt4788 += 4;
		return (this.aByteArray77[this.anInt4788 - 4] & 0xFF) + ((this.aByteArray77[this.anInt4788 - 3] & 0xFF) << 8) + ((this.aByteArray77[-1 + this.anInt4788] & 0xFF) << 24) + ((this.aByteArray77[this.anInt4788 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "(I)I")
	public final int method4222() {
		this.anInt4788 += 2;
		@Pc(34) int local34 = ((this.aByteArray77[this.anInt4788 - 2] & 0xFF) << 8) + (this.aByteArray77[this.anInt4788 - 1] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "(I)B")
	public final byte method4223() {
		return (byte) -this.aByteArray77[this.anInt4788++];
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(II)V")
	public final void method4224(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt4788++] = (byte) arg0;
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "([BIBI)V")
	public final void method4225(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(9) int local9 = arg1 - 1; local9 >= 0; local9--) {
			arg0[local9] = (byte) (this.aByteArray77[this.anInt4788++] - 128);
		}
	}

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "(I)I")
	public final int method4226() {
		@Pc(15) int local15 = 0;
		@Pc(19) int local19;
		for (local19 = this.method4211(); local19 == 32767; local19 = this.method4211()) {
			local15 += 32767;
		}
		return local15 + local19;
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(B)I")
	public final int method4227() {
		this.anInt4788 += 3;
		return ((this.aByteArray77[this.anInt4788 - 2] & 0xFF) << 8) + (((this.aByteArray77[this.anInt4788 - 1] & 0xFF) << 16) + (this.aByteArray77[this.anInt4788 - 3] & 0xFF));
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(IZ)V")
	public final void method4228(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt4788 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt4788 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt4788 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt4788 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "(B)I")
	public final int method4229() {
		this.anInt4788 += 2;
		return ((this.aByteArray77[this.anInt4788 - 2] & 0xFF) << 8) + (this.aByteArray77[this.anInt4788 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method4230(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt4788 += Static202.method3375(this.aByteArray77, arg0, arg0.length(), this.anInt4788);
		this.aByteArray77[this.anInt4788++] = 0;
	}

	@OriginalMember(owner = "client!lk", name = "m", descriptor = "(I)J")
	public final long method4231() {
		@Pc(10) long local10 = (long) this.method4239() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method4239() & 0xFFFFFFFFL;
		return local17 + (local10 << 32);
	}

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "(I)Ljava/lang/String;")
	public final String method4232() {
		if (this.aByteArray77[this.anInt4788] == 0) {
			this.anInt4788++;
			return null;
		} else {
			return this.method4201();
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method4233(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt4788;
		this.anInt4788 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4244(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt4788 = 0;
		this.method4207(local31.length);
		this.method4191(local31.length, local31);
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "(Z)B")
	public final byte method4234() {
		return (byte) (this.aByteArray77[this.anInt4788++] - 128);
	}

	@OriginalMember(owner = "client!lk", name = "o", descriptor = "(I)I")
	public final int method4235() {
		this.anInt4788 += 3;
		return ((this.aByteArray77[this.anInt4788 - 3] & 0xFF) << 16) + ((this.aByteArray77[this.anInt4788 - 2] & 0xFF) << 8) + (this.aByteArray77[this.anInt4788 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "(II)V")
	public final void method4236(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt4788++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "(I)I")
	public final int method4237() {
		this.anInt4788 += 2;
		return (this.aByteArray77[this.anInt4788 - 2] & 0xFF) + ((this.aByteArray77[this.anInt4788 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "(II)V")
	public final void method4238(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "(B)I")
	public final int method4239() {
		this.anInt4788 += 4;
		return ((this.aByteArray77[this.anInt4788 - 3] & 0xFF) << 16) + ((this.aByteArray77[this.anInt4788 - 4] & 0xFF) << 24) + ((this.aByteArray77[this.anInt4788 + -2] & 0xFF) << 8) + (this.aByteArray77[this.anInt4788 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "(Z)I")
	public final int method4240() {
		return this.aByteArray77[this.anInt4788++] & 0xFF;
	}

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "(II)V")
	public final void method4241(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt4788 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(BI)I")
	public final int method4242(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = Static63.method1158(this.anInt4788, arg0, this.aByteArray77);
		this.method4218(local18);
		return local18;
	}

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "(IB)V")
	public final void method4243(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt4788++] = (byte) arg0;
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "([BBII)V")
	public final void method4244(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg1; local10++) {
			arg0[local10] = this.aByteArray77[this.anInt4788++];
		}
	}

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "(Z)I")
	public final int method4245() {
		this.anInt4788 += 2;
		return ((this.aByteArray77[this.anInt4788 - 2] & 0xFF) << 8) + (this.aByteArray77[this.anInt4788 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "(I)B")
	public final byte method4246() {
		return (byte) (128 - this.aByteArray77[this.anInt4788++]);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "([II)V")
	public final void method4247(@OriginalArg(0) int[] arg0) {
		@Pc(14) int local14 = this.anInt4788 / 8;
		this.anInt4788 = 0;
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			@Pc(25) int local25 = this.method4239();
			@Pc(29) int local29 = this.method4239();
			@Pc(31) int local31 = 0;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local25 += local29 + (local29 >>> 5 ^ local29 << 4) ^ arg0[local31 & 0x3] + local31;
				local31 += -1640531527;
				local29 += arg0[local31 >>> 11 & 0x3] + local31 ^ local25 + (local25 >>> 5 ^ local25 << 4);
			}
			this.anInt4788 -= 8;
			this.method4218(local25);
			this.method4218(local29);
		}
	}

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "(Z)I")
	public final int method4248() {
		this.anInt4788 += 4;
		return (this.aByteArray77[this.anInt4788 - 2] & 0xFF) + ((this.aByteArray77[this.anInt4788 - 1] & 0xFF) << 8) + ((this.aByteArray77[this.anInt4788 + -3] & 0xFF) << 24) + ((this.aByteArray77[this.anInt4788 + -4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "(B)I")
	public final int method4249() {
		return -this.aByteArray77[this.anInt4788++] & 0xFF;
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(BI)V")
	public final void method4250(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt4788++] = (byte) arg0;
		this.aByteArray77[this.anInt4788++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "(I)I")
	public final int method4251() {
		this.anInt4788 += 2;
		@Pc(36) int local36 = (this.aByteArray77[this.anInt4788 - 1] & 0xFF) + ((this.aByteArray77[this.anInt4788 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}
}

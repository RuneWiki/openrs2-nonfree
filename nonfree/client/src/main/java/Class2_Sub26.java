import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!wm", name = "wb", descriptor = "I")
	public int anInt5328 = 0;

	@OriginalMember(owner = "client!wm", name = "W", descriptor = "[B")
	public byte[] aByteArray72;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I)V")
	public Class2_Sub26(@OriginalArg(0) int arg0) {
		this.aByteArray72 = Static134.method2324(arg0);
	}

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "([B)V")
	public Class2_Sub26(@OriginalArg(0) byte[] arg0) {
		this.aByteArray72 = arg0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)V")
	public final void method4213(@OriginalArg(1) int arg0) {
		this.aByteArray72[this.anInt5328++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(I)I")
	public final int method4214() {
		this.anInt5328 += 4;
		return (this.aByteArray72[this.anInt5328 - 4] & 0xFF) + ((this.aByteArray72[this.anInt5328 - 2] & 0xFF) << 16) + ((this.aByteArray72[this.anInt5328 - 1] & 0xFF) << 24) + ((this.aByteArray72[this.anInt5328 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(B)I")
	public final int method4215() {
		this.anInt5328 += 2;
		return ((this.aByteArray72[this.anInt5328 - 1] & 0xFF) << 8) + (this.aByteArray72[this.anInt5328 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(B)I")
	public final int method4216() {
		this.anInt5328 += 2;
		@Pc(40) int local40 = (this.aByteArray72[this.anInt5328 - 1] - 128 & 0xFF) + ((this.aByteArray72[this.anInt5328 - 2] & 0xFF) << 8);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)I")
	public final int method4217() {
		@Pc(17) int local17 = this.aByteArray72[this.anInt5328] & 0xFF;
		return local17 >= 128 ? this.method4242() - 32768 : this.method4261();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(JB)V")
	public final void method4218(@OriginalArg(0) long arg0) {
		this.method4256((int) (arg0 >> 32));
		this.method4256((int) arg0);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BI)J")
	public final long method4219(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(28) int local28 = local6 * 8;
		@Pc(30) long local30 = 0L;
		while (local28 >= 0) {
			local30 |= ((long) this.aByteArray72[this.anInt5328++] & 0xFFL) << local28;
			local28 -= 8;
		}
		return local30;
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(I)B")
	public final byte method4220() {
		return this.aByteArray72[this.anInt5328++];
	}

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "(I)I")
	public final int method4221() {
		this.anInt5328 += 3;
		return (this.aByteArray72[this.anInt5328 - 3] & 0xFF) + (((this.aByteArray72[this.anInt5328 - 1] & 0xFF) << 16) + ((this.aByteArray72[this.anInt5328 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([IIBI)V")
	public final void method4222(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(4) int local4 = this.anInt5328;
		@Pc(10) int local10 = (arg1 - 5) / 8;
		this.anInt5328 = 5;
		for (@Pc(19) int local19 = 0; local19 < local10; local19++) {
			@Pc(24) int local24 = -957401312;
			@Pc(28) int local28 = this.method4228();
			@Pc(32) int local32 = this.method4228();
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local32 -= local28 + (local28 >>> 5 ^ local28 << 4) ^ local24 - -arg0[local24 >>> 11 & 0x3];
				local24 -= -1640531527;
				local28 -= local32 + (local32 >>> 5 ^ local32 << 4) ^ local24 - -arg0[local24 & 0x3];
			}
			this.anInt5328 -= 8;
			this.method4260(local28);
			this.method4260(local32);
		}
		this.anInt5328 = local4;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)I")
	public final int method4224(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static66.method1282(this.anInt5328, this.aByteArray72, arg0);
		this.method4260(local11);
		return local11;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BJ)V")
	public final void method4225(@OriginalArg(1) long arg0) {
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 56);
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 48);
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 40);
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 32);
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 24);
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 16);
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 8);
		this.aByteArray72[this.anInt5328++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([BIII)V")
	public final void method4226(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			arg0[local14] = this.aByteArray72[this.anInt5328++];
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(Z)I")
	public final int method4227() {
		this.anInt5328 += 4;
		return (this.aByteArray72[this.anInt5328 - 2] & 0xFF) + ((this.aByteArray72[this.anInt5328 - 3] & 0xFF) << 24) + ((this.aByteArray72[this.anInt5328 + -4] & 0xFF) << 16) + ((this.aByteArray72[this.anInt5328 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "(I)I")
	public final int method4228() {
		this.anInt5328 += 4;
		return (this.aByteArray72[this.anInt5328 - 1] & 0xFF) + ((this.aByteArray72[this.anInt5328 - 2] & 0xFF) << 8) + ((this.aByteArray72[this.anInt5328 + -4] & 0xFF) << 24) + ((this.aByteArray72[this.anInt5328 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "(I)Ljava/lang/String;")
	public final String method4229() {
		@Pc(16) byte local16 = this.aByteArray72[this.anInt5328++];
		if (local16 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(33) int local33 = this.anInt5328;
		while (this.aByteArray72[this.anInt5328++] != 0) {
		}
		return Static236.method3911(this.aByteArray72, this.anInt5328 - local33 - 1, local33);
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(BI)V")
	public final void method4230(@OriginalArg(1) int arg0) {
		this.aByteArray72[this.anInt5328++] = (byte) arg0;
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZI)V")
	public final void method4231(@OriginalArg(1) int arg0) {
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 8);
		this.aByteArray72[this.anInt5328++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public final String method4232() {
		if (this.aByteArray72[this.anInt5328] == 0) {
			this.anInt5328++;
			return null;
		} else {
			return this.method4265();
		}
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(B)I")
	public final int method4233() {
		return -this.aByteArray72[this.anInt5328++] & 0xFF;
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(II)V")
	public final void method4234(@OriginalArg(1) int arg0) {
		this.aByteArray72[this.anInt5328++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "(I)Z")
	public final boolean method4235() {
		this.anInt5328 -= 4;
		@Pc(17) int local17 = Static66.method1282(this.anInt5328, this.aByteArray72, 0);
		@Pc(21) int local21 = this.method4228();
		return local21 == local17;
	}

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "(B)I")
	public final int method4236() {
		this.anInt5328 += 2;
		return (this.aByteArray72[this.anInt5328 - 2] - 128 & 0xFF) + ((this.aByteArray72[this.anInt5328 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(II)V")
	public final void method4237(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4239(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4231(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "(I)I")
	public final int method4238() {
		this.anInt5328 += 2;
		@Pc(41) int local41 = ((this.aByteArray72[this.anInt5328 - 1] & 0xFF) << 8) + (this.aByteArray72[this.anInt5328 - 2] - 128 & 0xFF);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(II)V")
	public final void method4239(@OriginalArg(0) int arg0) {
		this.aByteArray72[this.anInt5328++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "(I)I")
	public final int method4240() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method4217();
		while (local11 == 32767) {
			local11 = this.method4217();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "(I)B")
	public final byte method4241() {
		return (byte) (this.aByteArray72[this.anInt5328++] - 128);
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(Z)I")
	public final int method4242() {
		this.anInt5328 += 2;
		return (this.aByteArray72[this.anInt5328 - 1] & 0xFF) + ((this.aByteArray72[this.anInt5328 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II[BI)V")
	public final void method4243(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (this.aByteArray72[this.anInt5328++] - 128);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IF)V")
	public final void method4244(@OriginalArg(1) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray72[this.anInt5328++] = (byte) local2;
		this.aByteArray72[this.anInt5328++] = (byte) (local2 >> 8);
		this.aByteArray72[this.anInt5328++] = (byte) (local2 >> 16);
		this.aByteArray72[this.anInt5328++] = (byte) (local2 >> 24);
	}

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "(B)I")
	public final int method4245() {
		this.anInt5328 += 3;
		return ((this.aByteArray72[this.anInt5328 - 3] & 0xFF) << 16) + ((this.aByteArray72[this.anInt5328 - 2] & 0xFF) << 8) + (this.aByteArray72[this.anInt5328 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I[BII)V")
	public final void method4246(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			this.aByteArray72[this.anInt5328++] = arg0[local3];
		}
	}

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "(I)I")
	public final int method4247() {
		return 128 - this.aByteArray72[this.anInt5328++] & 0xFF;
	}

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "(II)V")
	public final void method4248(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & -16384) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4239(arg0 >>> 28 | 0x80);
					}
					this.method4239(arg0 >>> 21 | 0x80);
				}
				this.method4239(arg0 >>> 14 | 0x80);
			}
			this.method4239(arg0 >>> 7 | 0x80);
		}
		this.method4239(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "(II)V")
	public final void method4249(@OriginalArg(0) int arg0) {
		this.aByteArray72[this.anInt5328++] = (byte) arg0;
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "(B)I")
	public final int method4250() {
		@Pc(18) int local18 = this.aByteArray72[this.anInt5328] & 0xFF;
		return local18 < 128 ? this.method4261() - 64 : this.method4242() + -49152;
	}

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "(B)I")
	public final int method4251() {
		@Pc(12) byte local12 = this.aByteArray72[this.anInt5328++];
		@Pc(14) int local14 = 0;
		while (local12 < 0) {
			local14 = (local12 & 0x7F | local14) << 7;
			local12 = this.aByteArray72[this.anInt5328++];
		}
		return local12 | local14;
	}

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "(II)V")
	public final void method4252(@OriginalArg(0) int arg0) {
		this.aByteArray72[this.anInt5328++] = (byte) arg0;
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 8);
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 16);
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method4253(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt5328 += Static148.method2601(this.anInt5328, this.aByteArray72, arg0, arg0.length());
		this.aByteArray72[this.anInt5328++] = 0;
	}

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "(II)V")
	public final void method4254(@OriginalArg(0) int arg0) {
		this.aByteArray72[this.anInt5328 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "(I)I")
	public final int method4255() {
		this.anInt5328 += 2;
		@Pc(31) int local31 = ((this.aByteArray72[this.anInt5328 - 2] & 0xFF) << 8) + (this.aByteArray72[this.anInt5328 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)V")
	public final void method4256(@OriginalArg(0) int arg0) {
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 16);
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 24);
		this.aByteArray72[this.anInt5328++] = (byte) arg0;
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "(I)I")
	public final int method4257() {
		this.anInt5328 += 2;
		return (this.aByteArray72[this.anInt5328 - 1] - 128 & 0xFF) + ((this.aByteArray72[this.anInt5328 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "(II)V")
	public final void method4258(@OriginalArg(0) int arg0) {
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 16);
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 8);
		this.aByteArray72[this.anInt5328++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(IB)V")
	public final void method4259(@OriginalArg(0) int arg0) {
		this.aByteArray72[this.anInt5328++] = (byte) arg0;
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 8);
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 16);
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZ)V")
	public final void method4260(@OriginalArg(0) int arg0) {
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 24);
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 16);
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 8);
		this.aByteArray72[this.anInt5328++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "(B)I")
	public final int method4261() {
		return this.aByteArray72[this.anInt5328++] & 0xFF;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(ZI)V")
	public final void method4262(@OriginalArg(1) int arg0) {
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 8);
		this.aByteArray72[this.anInt5328++] = (byte) arg0;
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 24);
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "(I)J")
	public final long method4264() {
		@Pc(19) long local19 = (long) this.method4228() & 0xFFFFFFFFL;
		@Pc(28) long local28 = (long) this.method4228() & 0xFFFFFFFFL;
		return (local19 << 32) + local28;
	}

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "(I)Ljava/lang/String;")
	public final String method4265() {
		@Pc(12) int local12 = this.anInt5328;
		while (this.aByteArray72[this.anInt5328++] != 0) {
		}
		return Static236.method3911(this.aByteArray72, this.anInt5328 - local12 - 1, local12);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BF)V")
	public final void method4266(@OriginalArg(1) float arg0) {
		@Pc(14) int local14 = Float.floatToRawIntBits(arg0);
		this.aByteArray72[this.anInt5328++] = (byte) (local14 >> 24);
		this.aByteArray72[this.anInt5328++] = (byte) (local14 >> 16);
		this.aByteArray72[this.anInt5328++] = (byte) (local14 >> 8);
		this.aByteArray72[this.anInt5328++] = (byte) local14;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BIJ)V")
	public final void method4267(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(31) int local31 = local2 * 8; local31 >= 0; local31 -= 8) {
			this.aByteArray72[this.anInt5328++] = (byte) (arg1 >> local31);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method4268(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt5328;
		this.anInt5328 = 0;
		@Pc(12) byte[] local12 = new byte[local2];
		this.method4226(local12, local2);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt5328 = 0;
		this.method4239(local31.length);
		this.method4246(local31, local31.length);
	}

	@OriginalMember(owner = "client!wm", name = "r", descriptor = "(I)I")
	public final int method4269() {
		this.anInt5328 += 4;
		return (this.aByteArray72[this.anInt5328 - 3] & 0xFF) + ((this.aByteArray72[this.anInt5328 - 4] & 0xFF) << 8) + ((this.aByteArray72[this.anInt5328 + -1] & 0xFF) << 16) + ((this.aByteArray72[this.anInt5328 + -2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(IB)V")
	public final void method4270(@OriginalArg(0) int arg0) {
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(IB)V")
	public final void method4271(@OriginalArg(0) int arg0) {
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 + 128);
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(IB)V")
	public final void method4272(@OriginalArg(0) int arg0) {
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 >> 8);
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([IB)V")
	public final void method4273(@OriginalArg(0) int[] arg0) {
		@Pc(14) int local14 = this.anInt5328 / 8;
		this.anInt5328 = 0;
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 32;
			@Pc(36) int local36 = this.method4228();
			@Pc(42) int local42 = this.method4228();
			while (local30-- > 0) {
				local36 += (local42 << 4 ^ local42 >>> 5) + local42 ^ arg0[local28 & 0x3] + local28;
				local28 += -1640531527;
				local42 += local28 + arg0[local28 >>> 11 & 0xC2400003] ^ local36 + (local36 >>> 5 ^ local36 << 4);
			}
			this.anInt5328 -= 8;
			this.method4260(local36);
			this.method4260(local42);
		}
	}

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "(I)I")
	public final int method4274() {
		return this.aByteArray72[this.anInt5328++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "(II)V")
	public final void method4275(@OriginalArg(0) int arg0) {
		this.aByteArray72[this.anInt5328 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray72[this.anInt5328 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray72[this.anInt5328 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray72[this.anInt5328 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "(I)B")
	public final byte method4277() {
		return (byte) (128 - this.aByteArray72[this.anInt5328++]);
	}
}

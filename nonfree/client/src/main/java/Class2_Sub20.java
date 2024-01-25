import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public class Class2_Sub20 extends Class2 {

	@OriginalMember(owner = "client!md", name = "Z", descriptor = "[B")
	public byte[] aByteArray136;

	@OriginalMember(owner = "client!md", name = "ub", descriptor = "I")
	public int anInt4608;

	static {
		new Class256("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I)V")
	public Class2_Sub20(@OriginalArg(0) int arg0) {
		this.aByteArray136 = Static235.method3566(arg0);
		this.anInt4608 = 0;
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "([B)V")
	public Class2_Sub20(@OriginalArg(0) byte[] arg0) {
		this.anInt4608 = 0;
		this.aByteArray136 = arg0;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(B)I")
	public final int method3683() {
		@Pc(16) int local16 = this.aByteArray136[this.anInt4608] & 0xFF;
		return local16 < 128 ? this.method3737() - 64 : this.method3711() + -49152;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)V")
	public final void method3684(@OriginalArg(0) int arg0) {
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 16);
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 8);
		this.aByteArray136[this.anInt4608++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
	public final void method3685(@OriginalArg(0) int arg0) {
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 16);
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 24);
		this.aByteArray136[this.anInt4608++] = (byte) arg0;
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(B)I")
	public final int method3686() {
		this.anInt4608 += 3;
		return (this.aByteArray136[this.anInt4608 - 2] & 0xFF) + ((this.aByteArray136[this.anInt4608 - 1] & 0xFF) << 8) + ((this.aByteArray136[this.anInt4608 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(II)V")
	public final void method3687(@OriginalArg(0) int arg0) {
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 8);
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(B)Ljava/lang/String;")
	public final String method3688() {
		if (this.aByteArray136[this.anInt4608] == 0) {
			this.anInt4608++;
			return null;
		} else {
			return this.method3717();
		}
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(II)J")
	public final long method3689(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(22) int local22 = local6 * 8;
		@Pc(25) long local25 = (long) 0;
		while (local22 >= 0) {
			local25 |= ((long) this.aByteArray136[this.anInt4608++] & 0xFFL) << local22;
			local22 -= 8;
		}
		return local25;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II[BI)V")
	public final void method3690(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = this.aByteArray136[this.anInt4608++];
		}
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(B)I")
	public final int method3691() {
		@Pc(24) byte local24 = this.aByteArray136[this.anInt4608++];
		@Pc(26) int local26 = 0;
		while (local24 < 0) {
			local26 = (local26 | local24 & 0x7F) << 7;
			local24 = this.aByteArray136[this.anInt4608++];
		}
		return local26 | local24;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(JI)V")
	public final void method3692(@OriginalArg(0) long arg0) {
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 56);
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 48);
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 40);
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 32);
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 24);
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 16);
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 8);
		this.aByteArray136[this.anInt4608++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)B")
	public final byte method3693() {
		return this.aByteArray136[this.anInt4608++];
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([BIBI)V")
	public final void method3694(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = arg1 - 1; local7 >= 0; local7--) {
			arg0[local7] = this.aByteArray136[this.anInt4608++];
		}
	}

	@OriginalMember(owner = "client!md", name = "f", descriptor = "(B)I")
	public final int method3695() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method3698();
		while (local11 == 32767) {
			local11 = this.method3698();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!md", name = "g", descriptor = "(B)B")
	public final byte method3696() {
		return (byte) (128 - this.aByteArray136[this.anInt4608++]);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)V")
	public final void method3697(@OriginalArg(0) int arg0) {
		this.aByteArray136[this.anInt4608++] = (byte) arg0;
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!md", name = "h", descriptor = "(B)I")
	public final int method3698() {
		@Pc(16) int local16 = this.aByteArray136[this.anInt4608] & 0xFF;
		return local16 >= 128 ? this.method3711() - 32768 : this.method3737();
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(II)V")
	public final void method3699(@OriginalArg(1) int arg0) {
		this.aByteArray136[this.anInt4608++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BII[B)V")
	public final void method3700(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = arg0 - 1; local11 >= 0; local11--) {
			arg1[local11] = (byte) (this.aByteArray136[this.anInt4608++] - 128);
		}
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(I)I")
	public final int method3701() {
		this.anInt4608 += 2;
		@Pc(36) int local36 = ((this.aByteArray136[this.anInt4608 - 2] & 0xFF) << 8) + (this.aByteArray136[this.anInt4608 - 1] & 0xFF);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(II)V")
	public final void method3702(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method3699(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method3745(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(IB)V")
	public final void method3703(@OriginalArg(0) int arg0) {
		this.aByteArray136[this.anInt4608++] = (byte) arg0;
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 8);
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 16);
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!md", name = "f", descriptor = "(II)V")
	public final void method3705(@OriginalArg(0) int arg0) {
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 8);
		this.aByteArray136[this.anInt4608++] = (byte) arg0;
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 24);
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(I)I")
	public final int method3706() {
		this.anInt4608 += 2;
		return ((this.aByteArray136[this.anInt4608 - 2] & 0xFF) << 8) + (this.aByteArray136[this.anInt4608 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!md", name = "g", descriptor = "(II)V")
	public final void method3707(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method3699(arg0 >>> 28 | 0x80);
					}
					this.method3699(arg0 >>> 21 | 0x80);
				}
				this.method3699(arg0 >>> 14 | 0x80);
			}
			this.method3699(arg0 >>> 7 | 0x80);
		}
		this.method3699(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!md", name = "h", descriptor = "(II)V")
	public final void method3708(@OriginalArg(1) int arg0) {
		this.aByteArray136[this.anInt4608++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(IB)V")
	public final void method3709(@OriginalArg(0) int arg0) {
		this.aByteArray136[this.anInt4608 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II[BB)V")
	public final void method3710(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray136[this.anInt4608++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!md", name = "i", descriptor = "(B)I")
	public final int method3711() {
		this.anInt4608 += 2;
		return (this.aByteArray136[this.anInt4608 - 1] & 0xFF) + ((this.aByteArray136[this.anInt4608 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(Z)B")
	public final byte method3712() {
		return (byte) (this.aByteArray136[this.anInt4608++] - 128);
	}

	@OriginalMember(owner = "client!md", name = "i", descriptor = "(II)V")
	public final void method3713(@OriginalArg(1) int arg0) {
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 24);
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 16);
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 8);
		this.aByteArray136[this.anInt4608++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(IB)V")
	public final void method3714(@OriginalArg(0) int arg0) {
		this.aByteArray136[this.anInt4608++] = (byte) arg0;
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method3715(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt4608 += Static113.method1699(this.aByteArray136, arg0.length(), this.anInt4608, arg0);
		this.aByteArray136[this.anInt4608++] = 0;
	}

	@OriginalMember(owner = "client!md", name = "j", descriptor = "(B)I")
	public final int method3716() {
		return this.aByteArray136[this.anInt4608++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!md", name = "f", descriptor = "(I)Ljava/lang/String;")
	public final String method3717() {
		@Pc(6) int local6 = this.anInt4608;
		while (this.aByteArray136[this.anInt4608++] != 0) {
		}
		@Pc(37) int local37 = this.anInt4608 - local6 - 1;
		return local37 == 0 ? "" : Static142.method2021(local37, local6, this.aByteArray136);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II[IB)V")
	public final void method3718(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(15) int local15 = this.anInt4608;
		this.anInt4608 = 5;
		@Pc(25) int local25 = (arg0 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = this.method3731();
			@Pc(37) int local37 = this.method3731();
			@Pc(39) int local39 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= local39 + arg1[local39 >>> 11 & 0x3] ^ local33 + (local33 >>> 5 ^ local33 << 4);
				local39 -= -1640531527;
				local33 -= local37 + (local37 << 4 ^ local37 >>> 5) ^ local39 + arg1[local39 & 0x3];
			}
			this.anInt4608 -= 8;
			this.method3713(local33);
			this.method3713(local37);
		}
		this.anInt4608 = local15;
	}

	@OriginalMember(owner = "client!md", name = "g", descriptor = "(I)J")
	public final long method3719() {
		@Pc(17) long local17 = (long) this.method3731() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method3731() & 0xFFFFFFFFL;
		return local24 + (local17 << 32);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(JII)V")
	public final void method3720(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(23) int local23 = local2 * 8; local23 >= 0; local23 -= 8) {
			this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> local23);
		}
	}

	@OriginalMember(owner = "client!md", name = "h", descriptor = "(I)I")
	public final int method3721() {
		return -this.aByteArray136[this.anInt4608++] & 0xFF;
	}

	@OriginalMember(owner = "client!md", name = "i", descriptor = "(I)Z")
	public final boolean method3722() {
		this.anInt4608 -= 4;
		@Pc(24) int local24 = Static322.method4616(this.aByteArray136, 0, this.anInt4608);
		@Pc(28) int local28 = this.method3731();
		return local28 == local24;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(IZ)V")
	public final void method3723(@OriginalArg(0) int arg0) {
		this.aByteArray136[this.anInt4608 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray136[this.anInt4608 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B[I)V")
	public final void method3725(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.anInt4608 / 8;
		this.anInt4608 = 0;
		for (@Pc(19) int local19 = 0; local19 < local10; local19++) {
			@Pc(25) int local25 = this.method3731();
			@Pc(29) int local29 = this.method3731();
			@Pc(31) int local31 = 0;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local25 += (local29 << 4 ^ local29 >>> 5) + local29 ^ arg0[local31 & 0x3] + local31;
				local31 += -1640531527;
				local29 += arg0[local31 >>> 11 & 0x3] + local31 ^ (local25 << 4 ^ local25 >>> 5) + local25;
			}
			this.anInt4608 -= 8;
			this.method3713(local25);
			this.method3713(local29);
		}
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(IB)V")
	public final void method3726(@OriginalArg(0) int arg0) {
		this.aByteArray136[this.anInt4608++] = (byte) arg0;
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 8);
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 16);
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)V")
	public final void method3728(@OriginalArg(1) int arg0) {
		this.aByteArray136[this.anInt4608++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!md", name = "k", descriptor = "(I)Ljava/lang/String;")
	public final String method3729() {
		@Pc(14) byte local14 = this.aByteArray136[this.anInt4608++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(24) int local24 = this.anInt4608;
		while (this.aByteArray136[this.anInt4608++] != 0) {
		}
		@Pc(47) int local47 = this.anInt4608 - local24 - 1;
		return local47 == 0 ? "" : Static142.method2021(local47, local24, this.aByteArray136);
	}

	@OriginalMember(owner = "client!md", name = "k", descriptor = "(B)B")
	public final byte method3730() {
		return (byte) -this.aByteArray136[this.anInt4608++];
	}

	@OriginalMember(owner = "client!md", name = "l", descriptor = "(B)I")
	public final int method3731() {
		this.anInt4608 += 4;
		return ((this.aByteArray136[this.anInt4608 - 2] & 0xFF) << 8) + (this.aByteArray136[this.anInt4608 - 3] << 16 & 0xFF0000) + ((this.aByteArray136[this.anInt4608 + -4] & 0xFF) << 24) + (this.aByteArray136[this.anInt4608 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!md", name = "m", descriptor = "(B)I")
	public final int method3732() {
		this.anInt4608 += 2;
		return ((this.aByteArray136[this.anInt4608 - 1] & 0xFF) << 8) + (this.aByteArray136[this.anInt4608 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!md", name = "j", descriptor = "(II)I")
	public final int method3733(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = Static322.method4616(this.aByteArray136, arg0, this.anInt4608);
		this.method3713(local15);
		return local15;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(Z)I")
	public final int method3735() {
		this.anInt4608 += 2;
		@Pc(37) int local37 = ((this.aByteArray136[this.anInt4608 - 1] & 0xFF) << 8) + (this.aByteArray136[this.anInt4608 - 2] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!md", name = "l", descriptor = "(I)I")
	public final int method3737() {
		return this.aByteArray136[this.anInt4608++] & 0xFF;
	}

	@OriginalMember(owner = "client!md", name = "l", descriptor = "(II)V")
	public final void method3738(@OriginalArg(0) int arg0) {
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!md", name = "m", descriptor = "(I)I")
	public final int method3739() {
		return 128 - this.aByteArray136[this.anInt4608++] & 0xFF;
	}

	@OriginalMember(owner = "client!md", name = "m", descriptor = "(II)V")
	public final void method3740(@OriginalArg(1) int arg0) {
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 + 128);
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!md", name = "n", descriptor = "(II)V")
	public final void method3741(@OriginalArg(1) int arg0) {
		this.aByteArray136[this.anInt4608 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray136[this.anInt4608 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray136[this.anInt4608 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray136[this.anInt4608 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(Z)I")
	public final int method3742() {
		this.anInt4608 += 4;
		return (this.aByteArray136[this.anInt4608 - 3] & 0xFF) + ((this.aByteArray136[this.anInt4608 - 4] & 0xFF) << 8) + ((this.aByteArray136[this.anInt4608 + -2] & 0xFF) << 24) + ((this.aByteArray136[this.anInt4608 - 1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!md", name = "n", descriptor = "(I)I")
	public final int method3743() {
		this.anInt4608 += 4;
		return ((this.aByteArray136[this.anInt4608 - 3] & 0xFF) << 8) + (((this.aByteArray136[this.anInt4608 - 1] & 0xFF) << 24) - (-((this.aByteArray136[this.anInt4608 - 2] & 0xFF) << 16) - (this.aByteArray136[this.anInt4608 - 4] & 0xFF)));
	}

	@OriginalMember(owner = "client!md", name = "o", descriptor = "(I)I")
	public final int method3744() {
		this.anInt4608 += 2;
		return (this.aByteArray136[this.anInt4608 - 2] - 128 & 0xFF) + ((this.aByteArray136[this.anInt4608 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!md", name = "f", descriptor = "(IB)V")
	public final void method3745(@OriginalArg(0) int arg0) {
		this.aByteArray136[this.anInt4608++] = (byte) (arg0 >> 8);
		this.aByteArray136[this.anInt4608++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!md", name = "p", descriptor = "(I)I")
	public final int method3746() {
		this.anInt4608 += 2;
		@Pc(33) int local33 = (this.aByteArray136[this.anInt4608 - 2] - 128 & 0xFF) + ((this.aByteArray136[this.anInt4608 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!md", name = "n", descriptor = "(B)I")
	public final int method3747() {
		this.anInt4608 += 4;
		return (this.aByteArray136[this.anInt4608 - 2] & 0xFF) + (((this.aByteArray136[this.anInt4608 - 1] & 0xFF) << 8) + ((this.aByteArray136[this.anInt4608 - 3] & 0xFF) << 24) + ((this.aByteArray136[this.anInt4608 + -4] & 0xFF) << 16));
	}

	@OriginalMember(owner = "client!md", name = "o", descriptor = "(B)I")
	public final int method3748() {
		this.anInt4608 += 3;
		return (this.aByteArray136[this.anInt4608 - 1] & 0xFF) + ((this.aByteArray136[this.anInt4608 - 2] & 0xFF) << 8) + ((this.aByteArray136[this.anInt4608 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public final void method3749(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt4608;
		this.anInt4608 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method3690(local12, local6);
		@Pc(27) BigInteger local27 = new BigInteger(local12);
		@Pc(32) BigInteger local32 = local27.modPow(arg1, arg0);
		@Pc(35) byte[] local35 = local32.toByteArray();
		this.anInt4608 = 0;
		this.method3699(local35.length);
		this.method3710(local35.length, local35);
	}
}

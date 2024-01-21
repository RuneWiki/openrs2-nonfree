import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
	public int anInt3592 = 0;

	@OriginalMember(owner = "client!fj", name = "P", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(I)V")
	public Class1_Sub7(@OriginalArg(0) int arg0) {
		this.aByteArray38 = Static82.method1513(arg0);
	}

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "([B)V")
	public Class1_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray38 = arg0;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)V")
	public final void method2744(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt3592++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)I")
	public final int method2745() {
		this.anInt3592 += 3;
		return ((this.aByteArray38[this.anInt3592 - 3] & 0xFF) << 16) - (-((this.aByteArray38[this.anInt3592 - 2] & 0xFF) << 8) - (this.aByteArray38[this.anInt3592 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IB)J")
	public final long method2746(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(22) int local22 = local6 * 8;
		@Pc(29) long local29 = 0L;
		while (local22 >= 0) {
			local29 |= ((long) this.aByteArray38[this.anInt3592++] & 0xFFL) << local22;
			local22 -= 8;
		}
		return local29;
	}

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)I")
	public final int method2747() {
		this.anInt3592 += 3;
		return (this.aByteArray38[this.anInt3592 - 1] & 0xFF) + ((this.aByteArray38[this.anInt3592 - 3] & 0xFF) << 8) + ((this.aByteArray38[this.anInt3592 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(II)V")
	public final void method2748(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 16);
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt3592++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)V")
	public final void method2749(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt3592++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "(II)V")
	public final void method2750(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt3592 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray38[this.anInt3592 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray38[this.anInt3592 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt3592 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "(II)V")
	public final void method2751(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2753(arg0 >>> 28 | 0x80);
					}
					this.method2753(arg0 >>> 21 | 0x80);
				}
				this.method2753(arg0 >>> 14 | 0x80);
			}
			this.method2753(arg0 >>> 7 | 0x80);
		}
		this.method2753(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)I")
	public final int method2752() {
		this.anInt3592 += 2;
		return ((this.aByteArray38[this.anInt3592 - 1] & 0xFF) << 8) + (this.aByteArray38[this.anInt3592 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "(II)V")
	public final void method2753(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt3592++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "(II)V")
	public final void method2754(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 24);
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 16);
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt3592++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)I")
	public final int method2755() {
		this.anInt3592 += 2;
		@Pc(33) int local33 = (this.aByteArray38[this.anInt3592 - 2] - 128 & 0xFF) + ((this.aByteArray38[this.anInt3592 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)J")
	public final long method2756() {
		@Pc(10) long local10 = (long) this.method2793() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method2793() & 0xFFFFFFFFL;
		return (local10 << 32) + local17;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!dj;)V")
	public final void method2757(@OriginalArg(1) Class24 arg0) {
		this.anInt3592 += arg0.method742(this.anInt3592, arg0.method781(), this.aByteArray38);
		this.aByteArray38[this.anInt3592++] = 0;
	}

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "(II)V")
	public final void method2758(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(B)I")
	public final int method2759() {
		@Pc(11) int local11 = this.aByteArray38[this.anInt3592] & 0xFF;
		return local11 >= 128 ? this.method2765() - 49152 : this.method2771() - 64;
	}

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "(B)B")
	public final byte method2760() {
		return (byte) (128 - this.aByteArray38[this.anInt3592++]);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)Lclient!dj;")
	public final Class24 method2761() {
		@Pc(6) int local6 = this.anInt3592;
		while (this.aByteArray38[this.anInt3592++] != 0) {
		}
		return Static84.method1555(this.anInt3592 - local6 - 1, this.aByteArray38, local6);
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(BI)V")
	public final void method2762(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt3592++] = (byte) arg0;
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 24);
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I[BII)V")
	public final void method2763(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			this.aByteArray38[this.anInt3592++] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "(I)I")
	public final int method2764() {
		this.anInt3592 += 4;
		return ((this.aByteArray38[this.anInt3592 - 1] & 0xFF) << 8) + (this.aByteArray38[this.anInt3592 - 4] << 16 & 0xFF0000) + ((this.aByteArray38[this.anInt3592 + -3] & 0xFF) << 24) + (this.aByteArray38[this.anInt3592 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "(I)I")
	public final int method2765() {
		this.anInt3592 += 2;
		return ((this.aByteArray38[this.anInt3592 - 2] & 0xFF) << 8) + (this.aByteArray38[this.anInt3592 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "(B)I")
	public final int method2766() {
		@Pc(21) byte local21 = this.aByteArray38[this.anInt3592++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local21 & 0x7F | local23) << 7;
			local21 = this.aByteArray38[this.anInt3592++];
		}
		return local23 | local21;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBJ)V")
	public final void method2767(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(24) int local24 = local0 * 8; local24 >= 0; local24 -= 8) {
			this.aByteArray38[this.anInt3592++] = (byte) (arg1 >> local24);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method2768(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt3592;
		@Pc(13) byte[] local13 = new byte[local6];
		this.anInt3592 = 0;
		this.method2780(local6, local13);
		@Pc(27) BigInteger local27 = new BigInteger(local13);
		@Pc(32) BigInteger local32 = local27.modPow(arg0, arg1);
		@Pc(35) byte[] local35 = local32.toByteArray();
		this.anInt3592 = 0;
		this.method2753(local35.length);
		this.method2763(local35, local35.length);
	}

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "(B)I")
	public final int method2769() {
		return 128 - this.aByteArray38[this.anInt3592++] & 0xFF;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)B")
	public final byte method2770() {
		return this.aByteArray38[this.anInt3592++];
	}

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "(I)I")
	public final int method2771() {
		return this.aByteArray38[this.anInt3592++] & 0xFF;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(I[BII)V")
	public final void method2772(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = arg1 - 1; local7 >= 0; local7--) {
			arg0[local7] = (byte) (this.aByteArray38[this.anInt3592++] - 128);
		}
	}

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "(II)V")
	public final void method2773(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt3592 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "(B)Lclient!dj;")
	public final Class24 method2774() {
		if (this.aByteArray38[this.anInt3592] == 0) {
			this.anInt3592++;
			return null;
		} else {
			return this.method2761();
		}
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(BI)V")
	public final void method2775(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt3592++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(IB)V")
	public final void method2776(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt3592++] = (byte) arg0;
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 16);
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "(B)I")
	public final int method2777() {
		return this.aByteArray38[this.anInt3592++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "(I)I")
	public final int method2778() {
		this.anInt3592 += 4;
		return (this.aByteArray38[this.anInt3592 - 4] & 0xFF) + (((this.aByteArray38[this.anInt3592 - 3] & 0xFF) << 8) + ((this.aByteArray38[this.anInt3592 - 1] & 0xFF) << 24) + ((this.aByteArray38[this.anInt3592 + -2] & 0xFF) << 16));
	}

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "(B)I")
	public final int method2779() {
		this.anInt3592 += 2;
		@Pc(39) int local39 = (this.aByteArray38[this.anInt3592 - 1] & 0xFF) + ((this.aByteArray38[this.anInt3592 - 2] & 0xFF) << 8);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II[BI)V")
	public final void method2780(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			arg1[local1] = this.aByteArray38[this.anInt3592++];
		}
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(Z)I")
	public final int method2782() {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.method2795();
		while (local16 == 32767) {
			local16 = this.method2795();
			local12 += 32767;
		}
		return local12 + local16;
	}

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "(II)I")
	public final int method2783(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = Static140.method2434(this.aByteArray38, this.anInt3592, arg0);
		this.method2754(local14);
		return local14;
	}

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "(B)I")
	public final int method2784() {
		this.anInt3592 += 4;
		return (this.aByteArray38[this.anInt3592 - 3] & 0xFF) + ((this.aByteArray38[this.anInt3592 - 4] & 0xFF) << 8) + ((this.aByteArray38[this.anInt3592 - 2] & 0xFF) << 24) + ((this.aByteArray38[this.anInt3592 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "([BIII)V")
	public final void method2785(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = (byte) (this.aByteArray38[this.anInt3592++] - 128);
		}
	}

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "(II)V")
	public final void method2787(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 16);
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 24);
		this.aByteArray38[this.anInt3592++] = (byte) arg0;
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "(I)I")
	public final int method2788() {
		this.anInt3592 += 2;
		@Pc(29) int local29 = (this.aByteArray38[this.anInt3592 - 1] - 128 & 0xFF) + ((this.aByteArray38[this.anInt3592 - 2] & 0xFF) << 8);
		if (local29 > 32767) {
			local29 -= 65536;
		}
		return local29;
	}

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "(II)V")
	public final void method2789(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt3592++] = (byte) arg0;
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)V")
	public final void method2790(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2753(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2775(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "(II)V")
	public final void method2791(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 + 128);
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "(Z)I")
	public final int method2793() {
		this.anInt3592 += 4;
		return ((this.aByteArray38[this.anInt3592 - 4] & 0xFF) << 24) - (-(this.aByteArray38[this.anInt3592 - 3] << 16 & 0xFF0000) - (((this.aByteArray38[this.anInt3592 - 2] & 0xFF) << 8) + (this.aByteArray38[this.anInt3592 - 1] & 0xFF)));
	}

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "(B)I")
	public final int method2794() {
		this.anInt3592 += 2;
		return ((this.aByteArray38[this.anInt3592 - 2] & 0xFF) << 8) + (this.aByteArray38[this.anInt3592 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "(B)I")
	public final int method2795() {
		@Pc(16) int local16 = this.aByteArray38[this.anInt3592] & 0xFF;
		return local16 < 128 ? this.method2771() : this.method2765() - 32768;
	}

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "(B)I")
	public final int method2796() {
		this.anInt3592 += 2;
		return ((this.aByteArray38[this.anInt3592 - 1] & 0xFF) << 8) + (this.aByteArray38[this.anInt3592 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I[IBI)V")
	public final void method2797(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(2) int local2 = this.anInt3592;
		@Pc(17) int local17 = (arg1 - 5) / 8;
		this.anInt3592 = 5;
		for (@Pc(26) int local26 = 0; local26 < local17; local26++) {
			@Pc(31) int local31 = this.method2793();
			@Pc(35) int local35 = this.method2793();
			@Pc(37) int local37 = -957401312;
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local35 -= (local31 >>> 5 ^ local31 << 4) + local31 ^ local37 + arg0[local37 >>> 11 & 0x55A00003];
				local37 -= -1640531527;
				local31 -= local35 + (local35 << 4 ^ local35 >>> 5) ^ local37 - -arg0[local37 & 0x3];
			}
			this.anInt3592 -= 8;
			this.method2754(local31);
			this.method2754(local35);
		}
		this.anInt3592 = local2;
	}

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "(I)I")
	public final int method2798() {
		this.anInt3592 += 2;
		@Pc(31) int local31 = (this.aByteArray38[this.anInt3592 - 2] & 0xFF) + ((this.aByteArray38[this.anInt3592 - 1] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "(I)I")
	public final int method2799() {
		return -this.aByteArray38[this.anInt3592++] & 0xFF;
	}

	@OriginalMember(owner = "client!fj", name = "o", descriptor = "(I)B")
	public final byte method2800() {
		return (byte) (this.aByteArray38[this.anInt3592++] - 128);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(JI)V")
	public final void method2801(@OriginalArg(0) long arg0) {
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 56);
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 48);
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 40);
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 32);
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 24);
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 16);
		this.aByteArray38[this.anInt3592++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt3592++] = (byte) arg0;
	}
}

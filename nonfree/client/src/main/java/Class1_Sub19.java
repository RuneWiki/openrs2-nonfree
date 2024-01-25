import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!wm", name = "A", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!wm", name = "C", descriptor = "I")
	public int anInt3698;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I)V")
	public Class1_Sub19(@OriginalArg(0) int arg0) {
		this.aByteArray38 = Static64.method873(arg0);
		this.anInt3698 = 0;
	}

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "([B)V")
	public Class1_Sub19(@OriginalArg(0) byte[] arg0) {
		this.anInt3698 = 0;
		this.aByteArray38 = arg0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)I")
	public final int method2877() {
		this.anInt3698 += 4;
		return (this.aByteArray38[this.anInt3698 - 1] & 0xFF) + ((this.aByteArray38[this.anInt3698 - 2] & 0xFF) << 8) + ((this.aByteArray38[this.anInt3698 + -3] & 0xFF) << 16) + ((this.aByteArray38[this.anInt3698 - 4] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)I")
	public final int method2878() {
		@Pc(21) byte local21 = this.aByteArray38[this.anInt3698++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local23 | local21 & 0x7F) << 7;
			local21 = this.aByteArray38[this.anInt3698++];
		}
		return local23 | local21;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)V")
	public final void method2879(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt3698++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([IIII)V")
	public final void method2880(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt3698;
		this.anInt3698 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method2877();
			@Pc(30) int local30 = this.method2877();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= local32 + arg0[local32 >>> 11 & 0x79800003] ^ (local26 << 4 ^ local26 >>> 5) + local26;
				local32 -= -1640531527;
				local26 -= local32 + arg0[local32 & 0x3] ^ (local30 << 4 ^ local30 >>> 5) + local30;
			}
			this.anInt3698 -= 8;
			this.method2912(local26);
			this.method2912(local30);
		}
		this.anInt3698 = local8;
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(B)I")
	public final int method2881() {
		this.anInt3698 += 3;
		return (this.aByteArray38[this.anInt3698 - 1] & 0xFF) + ((this.aByteArray38[this.anInt3698 - 2] & 0xFF) << 8) + ((this.aByteArray38[this.anInt3698 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)I")
	public final int method2882() {
		this.anInt3698 += 2;
		return (this.aByteArray38[this.anInt3698 - 2] & 0xFF) + ((this.aByteArray38[this.anInt3698 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)I")
	public final int method2883() {
		@Pc(19) int local19 = this.aByteArray38[this.anInt3698] & 0xFF;
		return local19 >= 128 ? this.method2896() - 32768 : this.method2915();
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(I)I")
	public final int method2884() {
		return this.aByteArray38[this.anInt3698++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BI)V")
	public final void method2885(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt3698++] = (byte) arg0;
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 24);
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(B)Z")
	public final boolean method2886() {
		this.anInt3698 -= 4;
		@Pc(17) int local17 = Static428.method5439(0, this.aByteArray38, this.anInt3698);
		@Pc(21) int local21 = this.method2877();
		return local21 == local17;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)V")
	public final void method2887(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 16);
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 24);
		this.aByteArray38[this.anInt3698++] = (byte) arg0;
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(II)V")
	public final void method2888(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 16);
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt3698++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(II)V")
	public final void method2889(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 + 128);
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(II)J")
	public final long method2890(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(28) int local28 = local2 * 8;
		@Pc(30) long local30 = 0L;
		while (local28 >= 0) {
			local30 |= ((long) this.aByteArray38[this.anInt3698++] & 0xFFL) << local28;
			local28 -= 8;
		}
		return local30;
	}

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "(I)I")
	public final int method2891() {
		this.anInt3698 += 4;
		return (this.aByteArray38[this.anInt3698 - 4] & 0xFF) + ((this.aByteArray38[this.anInt3698 - 1] & 0xFF) << 24) + ((this.aByteArray38[this.anInt3698 + -2] & 0xFF) << 16) + ((this.aByteArray38[this.anInt3698 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "(I)I")
	public final int method2892() {
		this.anInt3698 += 2;
		return ((this.aByteArray38[this.anInt3698 - 2] & 0xFF) << 8) + (this.aByteArray38[this.anInt3698 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIJ)V")
	public final void method2893(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(26) int local26 = local2 * 8; local26 >= 0; local26 -= 8) {
			this.aByteArray38[this.anInt3698++] = (byte) (arg1 >> local26);
		}
	}

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "(II)V")
	public final void method2894(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt3698++] = (byte) arg0;
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "(II)V")
	public final void method2895(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2934(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2930(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "(I)I")
	public final int method2896() {
		this.anInt3698 += 2;
		return ((this.aByteArray38[this.anInt3698 - 2] & 0xFF) << 8) + (this.aByteArray38[this.anInt3698 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "(B)I")
	public final int method2897() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		for (local11 = this.method2883(); local11 == 32767; local11 = this.method2883()) {
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "(II)V")
	public final void method2898(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(Z)B")
	public final byte method2899() {
		return (byte) (this.aByteArray38[this.anInt3698++] - 128);
	}

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "(I)I")
	public final int method2900() {
		this.anInt3698 += 4;
		return ((this.aByteArray38[this.anInt3698 - 2] & 0xFF) << 24) + (this.aByteArray38[this.anInt3698 - 3] & 0xFF) - (-((this.aByteArray38[this.anInt3698 - 1] & 0xFF) << 16) - ((this.aByteArray38[this.anInt3698 - 4] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "(B)I")
	public final int method2901() {
		this.anInt3698 += 2;
		@Pc(40) int local40 = ((this.aByteArray38[this.anInt3698 - 2] & 0xFF) << 8) + (this.aByteArray38[this.anInt3698 - 1] - 128 & 0xFF);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZI)I")
	public final int method2902(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static428.method5439(arg0, this.aByteArray38, this.anInt3698);
		this.method2912(local11);
		return local11;
	}

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "(B)I")
	public final int method2903() {
		this.anInt3698 += 4;
		return (this.aByteArray38[this.anInt3698 - 2] & 0xFF) + ((this.aByteArray38[this.anInt3698 - 1] & 0xFF) << 8) + ((this.aByteArray38[this.anInt3698 - 4] & 0xFF) << 16) + ((this.aByteArray38[this.anInt3698 - 3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "(B)I")
	public final int method2904() {
		this.anInt3698 += 3;
		@Pc(44) int local44 = ((this.aByteArray38[this.anInt3698 - 3] & 0xFF) << 16) + ((this.aByteArray38[this.anInt3698 - 2] << 8 & 0xFF00) + (this.aByteArray38[this.anInt3698 - 1] & 0xFF));
		if (local44 > 8388607) {
			local44 -= 16777216;
		}
		return local44;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(BI)V")
	public final void method2905(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt3698 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt3698 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method2906(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = Static448.method5770(arg0);
		this.aByteArray38[this.anInt3698++] = 0;
		this.method2927(local7);
		this.anInt3698 += Static365.method4790(this.aByteArray38, this.anInt3698, arg0);
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(BI)V")
	public final void method2907(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt3698 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "(II)V")
	public final void method2908(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt3698 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray38[this.anInt3698 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray38[this.anInt3698 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt3698 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "(I)J")
	public final long method2909() {
		@Pc(15) long local15 = (long) this.method2877() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method2877() & 0xFFFFFFFFL;
		return local22 + (local15 << 32);
	}

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "(I)B")
	public final byte method2910() {
		return (byte) (128 - this.aByteArray38[this.anInt3698++]);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZ)V")
	public final void method2912(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 24);
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 16);
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt3698++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "(II)V")
	public final void method2913(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt3698++] = (byte) arg0;
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 16);
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "(I)Ljava/lang/String;")
	public final String method2914() {
		@Pc(6) int local6 = this.anInt3698;
		while (this.aByteArray38[this.anInt3698++] != 0) {
		}
		@Pc(33) int local33 = this.anInt3698 - local6 - 1;
		return local33 == 0 ? "" : Static244.method236(local33, local6, this.aByteArray38);
	}

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "(B)I")
	public final int method2915() {
		return this.aByteArray38[this.anInt3698++] & 0xFF;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(JB)V")
	public final void method2916(@OriginalArg(0) long arg0) {
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 56);
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 48);
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 40);
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 32);
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 24);
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 16);
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt3698++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "(I)B")
	public final byte method2917() {
		return this.aByteArray38[this.anInt3698++];
	}

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "(I)I")
	public final int method2918() {
		@Pc(16) int local16 = this.aByteArray38[this.anInt3698] & 0xFF;
		return local16 < 128 ? this.method2915() - 64 : this.method2896() + -49152;
	}

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "(I)I")
	public final int method2919() {
		return -this.aByteArray38[this.anInt3698++] & 0xFF;
	}

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "(I)I")
	public final int method2920() {
		this.anInt3698 += 3;
		return ((this.aByteArray38[this.anInt3698 - 1] & 0xFF) << 8) + ((this.aByteArray38[this.anInt3698 - 3] << 16 & 0xFF0000) + (this.aByteArray38[this.anInt3698 - 2] & 0xFF));
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I[BII)V")
	public final void method2921(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1; local8++) {
			this.aByteArray38[this.anInt3698++] = arg0[local8];
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method2922(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt3698;
		this.anInt3698 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method2937(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(36) BigInteger local36 = local23.modPow(arg1, arg0);
		@Pc(39) byte[] local39 = local36.toByteArray();
		this.anInt3698 = 0;
		this.method2930(local39.length);
		this.method2921(local39, local39.length);
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(Z)B")
	public final byte method2923() {
		return (byte) -this.aByteArray38[this.anInt3698++];
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(Z)Ljava/lang/String;")
	public final String method2924() {
		@Pc(21) byte local21 = this.aByteArray38[this.anInt3698++];
		if (local21 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(35) int local35 = this.method2878();
		if (this.anInt3698 + local35 > this.aByteArray38.length) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(60) String local60 = Static101.method1182(this.anInt3698, local35, this.aByteArray38);
		this.anInt3698 += local35;
		return local60;
	}

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "(I)Ljava/lang/String;")
	public final String method2925() {
		@Pc(14) byte local14 = this.aByteArray38[this.anInt3698++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(32) int local32 = this.anInt3698;
		while (this.aByteArray38[this.anInt3698++] != 0) {
		}
		@Pc(54) int local54 = this.anInt3698 - local32 - 1;
		return local54 == 0 ? "" : Static244.method236(local54, local32, this.aByteArray38);
	}

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "(II)V")
	public final void method2926(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "(II)V")
	public final void method2927(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2934(arg0 >>> 28 | 0x80);
					}
					this.method2934(arg0 >>> 21 | 0x80);
				}
				this.method2934(arg0 >>> 14 | 0x80);
			}
			this.method2934(arg0 >>> 7 | 0x80);
		}
		this.method2934(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "(B)I")
	public final int method2928() {
		return 128 - this.aByteArray38[this.anInt3698++] & 0xFF;
	}

	@OriginalMember(owner = "client!wm", name = "r", descriptor = "(I)I")
	public final int method2929() {
		this.anInt3698 += 2;
		@Pc(36) int local36 = ((this.aByteArray38[this.anInt3698 - 2] & 0xFF) << 8) + (this.aByteArray38[this.anInt3698 - 1] & 0xFF);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "(II)V")
	public final void method2930(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt3698++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "(I)I")
	public final int method2932() {
		@Pc(11) int local11 = Static428.method5439(0, this.aByteArray38, this.anInt3698);
		this.method2912(local11);
		return local11;
	}

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "(II)V")
	public final void method2933(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt3698++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(BI)V")
	public final void method2934(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt3698++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method2935(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt3698 += Static369.method4806(this.anInt3698, arg0, arg0.length(), this.aByteArray38);
		this.aByteArray38[this.anInt3698++] = 0;
	}

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "(II)V")
	public final void method2936(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt3698++] = (byte) arg0;
		this.aByteArray38[this.anInt3698++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II[BI)V")
	public final void method2937(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
			arg1[local15] = this.aByteArray38[this.anInt3698++];
		}
	}

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "(I)I")
	public final int method2938() {
		this.anInt3698 += 2;
		return (this.aByteArray38[this.anInt3698 - 2] - 128 & 0xFF) + ((this.aByteArray38[this.anInt3698 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(Z)Ljava/lang/String;")
	public final String method2939() {
		if (this.aByteArray38[this.anInt3698] == 0) {
			this.anInt3698++;
			return null;
		} else {
			return this.method2914();
		}
	}
}

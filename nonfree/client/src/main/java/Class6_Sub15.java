import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public class Class6_Sub15 extends Class6 {

	@OriginalMember(owner = "client!ha", name = "qb", descriptor = "I")
	public int anInt3487 = 0;

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(I)V")
	public Class6_Sub15(@OriginalArg(0) int arg0) {
		this.aByteArray51 = Static231.method3611(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "([B)V")
	public Class6_Sub15(@OriginalArg(0) byte[] arg0) {
		this.aByteArray51 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
	public final void method3075(@OriginalArg(1) int arg0) {
		this.aByteArray51[this.anInt3487++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B[I)V")
	public final void method3076(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.anInt3487 / 8;
		this.anInt3487 = 0;
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			@Pc(29) int local29 = this.method3109();
			@Pc(33) int local33 = this.method3109();
			@Pc(35) int local35 = 0;
			@Pc(39) int local39 = 32;
			while (local39-- > 0) {
				local29 += (local33 << 4 ^ local33 >>> 5) + local33 ^ local35 - -arg0[local35 & 0x3];
				local35 += -1640531527;
				local33 += arg0[local35 >>> 11 & 0xD6200003] + local35 ^ (local29 >>> 5 ^ local29 << 4) - -local29;
			}
			this.anInt3487 -= 8;
			this.method3107(local29);
			this.method3107(local33);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)B")
	public final byte method3077() {
		return (byte) (128 - this.aByteArray51[this.anInt3487++]);
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)I")
	public final int method3078() {
		this.anInt3487 += 3;
		return (this.aByteArray51[this.anInt3487 - 1] & 0xFF) + ((this.aByteArray51[this.anInt3487 - 2] & 0xFF) << 8) + ((this.aByteArray51[this.anInt3487 - 3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V")
	public final void method3079(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt3487++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB)V")
	public final void method3080(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt3487 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt3487 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)V")
	public final void method3081(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 16);
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt3487++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)I")
	public final int method3083() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method3090();
		while (local11 == 32767) {
			local11 = this.method3090();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)V")
	public final void method3085(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method3075(arg0 >>> 28 | 0x80);
					}
					this.method3075(arg0 >>> 21 | 0x80);
				}
				this.method3075(arg0 >>> 14 | 0x80);
			}
			this.method3075(arg0 >>> 7 | 0x80);
		}
		this.method3075(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)I")
	public final int method3086() {
		return 128 - this.aByteArray51[this.anInt3487++] & 0xFF;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method3087(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt3487;
		this.anInt3487 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method3127(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(36) byte[] local36 = local28.toByteArray();
		this.anInt3487 = 0;
		this.method3075(local36.length);
		this.method3135(local36.length, local36);
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)Z")
	public final boolean method3088() {
		this.anInt3487 -= 4;
		@Pc(17) int local17 = Static317.method5229(0, this.aByteArray51, this.anInt3487);
		@Pc(21) int local21 = this.method3109();
		return local17 == local21;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI)V")
	public final void method3089(@OriginalArg(1) int arg0) {
		this.aByteArray51[this.anInt3487++] = (byte) arg0;
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 16);
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)I")
	public final int method3090() {
		@Pc(11) int local11 = this.aByteArray51[this.anInt3487] & 0xFF;
		return local11 >= 128 ? this.method3108() - 32768 : this.method3111();
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)V")
	public final void method3091(@OriginalArg(1) int arg0) {
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)I")
	public final int method3092() {
		this.anInt3487 += 4;
		return (this.aByteArray51[this.anInt3487 - 2] & 0xFF) + ((this.aByteArray51[this.anInt3487 - 4] & 0xFF) << 16) + ((this.aByteArray51[this.anInt3487 + -3] & 0xFF) << 24) + ((this.aByteArray51[this.anInt3487 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public final String method3093() {
		@Pc(6) int local6 = this.anInt3487;
		while (this.aByteArray51[this.anInt3487++] != 0) {
		}
		@Pc(28) int local28 = this.anInt3487 - local6 - 1;
		return local28 == 0 ? "" : Static27.method357(local28, this.aByteArray51, local6);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method3094(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt3487 += Static255.method3944(this.aByteArray51, this.anInt3487, arg0.length(), arg0);
		this.aByteArray51[this.anInt3487++] = 0;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(BI)V")
	public final void method3095(@OriginalArg(1) int arg0) {
		this.aByteArray51[this.anInt3487 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray51[this.anInt3487 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray51[this.anInt3487 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt3487 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(BI)J")
	public final long method3096(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(24) int local24 = local6 * 8;
		@Pc(26) long local26 = 0L;
		while (local24 >= 0) {
			local26 |= ((long) this.aByteArray51[this.anInt3487++] & 0xFFL) << local24;
			local24 -= 8;
		}
		return local26;
	}

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)I")
	public final int method3097() {
		this.anInt3487 += 2;
		return ((this.aByteArray51[this.anInt3487 - 1] & 0xFF) << 8) + (this.aByteArray51[this.anInt3487 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)I")
	public final int method3098() {
		this.anInt3487 += 3;
		return (this.aByteArray51[this.anInt3487 - 3] & 0xFF) + (((this.aByteArray51[this.anInt3487 - 1] & 0xFF) << 16) + ((this.aByteArray51[this.anInt3487 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "(I)B")
	public final byte method3099() {
		return (byte) (this.aByteArray51[this.anInt3487++] - 128);
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(BI)V")
	public final void method3100(@OriginalArg(1) int arg0) {
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt3487++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)I")
	public final int method3101() {
		this.anInt3487 += 2;
		return (this.aByteArray51[this.anInt3487 - 1] - 128 & 0xFF) + ((this.aByteArray51[this.anInt3487 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(Z)I")
	public final int method3103() {
		this.anInt3487 += 2;
		@Pc(32) int local32 = ((this.aByteArray51[this.anInt3487 - 2] & 0xFF) << 8) + (this.aByteArray51[this.anInt3487 - 1] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(Z)B")
	public final byte method3104() {
		return (byte) -this.aByteArray51[this.anInt3487++];
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)I")
	public final int method3105(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static317.method5229(arg0, this.aByteArray51, this.anInt3487);
		this.method3107(local11);
		return local11;
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(II)V")
	public final void method3106(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 + 128);
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(II)V")
	public final void method3107(@OriginalArg(1) int arg0) {
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 24);
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 16);
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt3487++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)I")
	public final int method3108() {
		this.anInt3487 += 2;
		return (this.aByteArray51[this.anInt3487 - 1] & 0xFF) + ((this.aByteArray51[this.anInt3487 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(B)I")
	public final int method3109() {
		this.anInt3487 += 4;
		return ((this.aByteArray51[this.anInt3487 - 4] & 0xFF) << 24) + ((this.aByteArray51[this.anInt3487 - 3] & 0xFF) << 16) + ((this.aByteArray51[this.anInt3487 + -2] & 0xFF) << 8) + (this.aByteArray51[this.anInt3487 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(Z)I")
	public final int method3110() {
		return this.aByteArray51[this.anInt3487++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(B)I")
	public final int method3111() {
		return this.aByteArray51[this.anInt3487++] & 0xFF;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBJ)V")
	public final void method3112(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(26) int local26 = local2 * 8; local26 >= 0; local26 -= 8) {
			this.aByteArray51[this.anInt3487++] = (byte) (arg1 >> local26);
		}
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(BI)V")
	public final void method3113(@OriginalArg(1) int arg0) {
		this.aByteArray51[this.anInt3487++] = (byte) arg0;
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 16);
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "(II)V")
	public final void method3114(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt3487++] = (byte) arg0;
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BJ)V")
	public final void method3115(@OriginalArg(1) long arg0) {
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 56);
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 48);
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 40);
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 32);
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 24);
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 16);
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt3487++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "(I)B")
	public final byte method3116() {
		return this.aByteArray51[this.anInt3487++];
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IB)V")
	public final void method3117(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "(II)V")
	public final void method3118(@OriginalArg(1) int arg0) {
		this.aByteArray51[this.anInt3487 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(B)J")
	public final long method3119() {
		@Pc(18) long local18 = (long) this.method3109() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method3109() & 0xFFFFFFFFL;
		return (local18 << 32) + local25;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ)V")
	public final void method3120(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt3487++] = (byte) arg0;
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 24);
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "(II)V")
	public final void method3121(@OriginalArg(1) int arg0) {
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 16);
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 24);
		this.aByteArray51[this.anInt3487++] = (byte) arg0;
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "(II)V")
	public final void method3122(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt3487++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(B)I")
	public final int method3123() {
		@Pc(16) byte local16 = this.aByteArray51[this.anInt3487++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local18 | local16 & 0x7F) << 7;
			local16 = this.aByteArray51[this.anInt3487++];
		}
		return local16 | local18;
	}

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "(B)I")
	public final int method3124() {
		this.anInt3487 += 4;
		return (this.aByteArray51[this.anInt3487 - 3] & 0xFF) + ((this.aByteArray51[this.anInt3487 - 1] & 0xFF) << 16) + ((this.aByteArray51[this.anInt3487 + -2] & 0xFF) << 24) + ((this.aByteArray51[this.anInt3487 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "(I)I")
	public final int method3125() {
		@Pc(11) int local11 = this.aByteArray51[this.anInt3487] & 0xFF;
		return local11 >= 128 ? this.method3108() - 49152 : this.method3111() - 64;
	}

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "(I)I")
	public final int method3126() {
		this.anInt3487 += 2;
		return (this.aByteArray51[this.anInt3487 - 2] - 128 & 0xFF) + ((this.aByteArray51[this.anInt3487 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[BI)V")
	public final void method3127(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = this.aByteArray51[this.anInt3487++];
		}
	}

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "(B)I")
	public final int method3128() {
		this.anInt3487 += 2;
		@Pc(34) int local34 = ((this.aByteArray51[this.anInt3487 - 1] & 0xFF) << 8) + (this.aByteArray51[this.anInt3487 - 2] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "(B)I")
	public final int method3129() {
		this.anInt3487 += 4;
		return (this.aByteArray51[this.anInt3487 - 4] & 0xFF) + ((this.aByteArray51[this.anInt3487 - 3] & 0xFF) << 8) + ((this.aByteArray51[this.anInt3487 + -1] & 0xFF) << 24) + ((this.aByteArray51[this.anInt3487 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "(I)Ljava/lang/String;")
	public final String method3130() {
		@Pc(14) byte local14 = this.aByteArray51[this.anInt3487++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(24) int local24 = this.anInt3487;
		while (this.aByteArray51[this.anInt3487++] != 0) {
		}
		@Pc(51) int local51 = this.anInt3487 - local24 - 1;
		return local51 == 0 ? "" : Static27.method357(local51, this.aByteArray51, local24);
	}

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(Z)I")
	public final int method3131() {
		return -this.aByteArray51[this.anInt3487++] & 0xFF;
	}

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "(I)I")
	public final int method3132() {
		this.anInt3487 += 2;
		@Pc(38) int local38 = ((this.aByteArray51[this.anInt3487 - 2] & 0xFF) << 8) + (this.aByteArray51[this.anInt3487 - 1] - 128 & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "(II)V")
	public final void method3133(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method3075(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method3100(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "(I)Ljava/lang/String;")
	public final String method3134() {
		if (this.aByteArray51[this.anInt3487] == 0) {
			this.anInt3487++;
			return null;
		} else {
			return this.method3093();
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[BII)V")
	public final void method3135(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray51[this.anInt3487++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "(II)V")
	public final void method3136(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt3487++] = (byte) arg0;
		this.aByteArray51[this.anInt3487++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ[I)V")
	public final void method3137(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt3487;
		this.anInt3487 = 5;
		@Pc(21) int local21 = (arg0 - 5) / 8;
		for (@Pc(23) int local23 = 0; local23 < local21; local23++) {
			@Pc(29) int local29 = this.method3109();
			@Pc(33) int local33 = this.method3109();
			@Pc(35) int local35 = -957401312;
			@Pc(39) int local39 = 32;
			while (local39-- > 0) {
				local33 -= arg1[local35 >>> 11 & 0xEF200003] + local35 ^ local29 + (local29 >>> 5 ^ local29 << 4);
				local35 -= -1640531527;
				local29 -= arg1[local35 & 0x3] + local35 ^ local33 + (local33 >>> 5 ^ local33 << 4);
			}
			this.anInt3487 -= 8;
			this.method3107(local29);
			this.method3107(local33);
		}
		this.anInt3487 = local8;
	}
}

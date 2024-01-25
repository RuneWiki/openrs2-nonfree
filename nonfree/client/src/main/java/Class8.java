import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class8 {

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "[Z")
	private boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "Lclient!kt;")
	private Class143 aClass143_1;

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
	private int anInt209;

	@OriginalMember(owner = "client!ah", name = "x", descriptor = "Lclient!e;")
	private Class57 aClass57_1;

	@OriginalMember(owner = "client!ah", name = "z", descriptor = "Lclient!i;")
	private Class5_Sub2_Sub1 aClass5_Sub2_Sub1_1;

	@OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
	private int anInt213;

	@OriginalMember(owner = "client!ah", name = "B", descriptor = "Lclient!td;")
	public Class88_Sub6 aClass88_Sub6_1;

	@OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!ah", name = "I", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
	private int anInt212 = -32768;

	@OriginalMember(owner = "client!ah", name = "D", descriptor = "Z")
	private boolean aBoolean31 = false;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "Z")
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
	private int anInt214 = -1;

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
	private int anInt200 = -1;

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
	private int anInt206;

	@OriginalMember(owner = "client!ah", name = "u", descriptor = "B")
	private final byte aByte3;

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
	public final int anInt196;

	@OriginalMember(owner = "client!ah", name = "H", descriptor = "B")
	private final byte aByte4;

	@OriginalMember(owner = "client!ah", name = "K", descriptor = "I")
	public final int anInt219;

	@OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
	public final int anInt215;

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
	private int anInt203;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "Z")
	private final boolean aBoolean28;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!za;Lclient!ii;IIIIIIZI)V")
	public Class8(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt206 = arg6;
		this.aByte3 = (byte) arg5;
		this.anInt196 = arg3;
		this.aByte4 = (byte) arg4;
		this.anInt219 = arg2;
		this.anInt215 = arg1.anInt2994;
		this.anInt203 = arg7;
		this.aBoolean31 = arg8;
		this.aBoolean28 = arg0.method5821() && arg1.aBoolean192 && !this.aBoolean31;
		if (arg9 != -1) {
			this.aBoolean29 = true;
		}
		this.method159(arg9);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)V")
	private void method151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass143_1 == null) {
				if (this.aBoolean29) {
					return;
				}
				this.method159(-1);
				if (this.aClass143_1 == null) {
					return;
				}
			}
			@Pc(32) int local32 = Static85.anInt1536 - this.anInt217;
			if (local32 > 100 && this.aClass143_1.anInt3784 > 0) {
				@Pc(51) int local51 = this.aClass143_1.anIntArray241.length - this.aClass143_1.anInt3784;
				while (this.anInt213 < local51 && this.aClass143_1.anIntArray239[this.anInt213] < local32) {
					local32 -= this.aClass143_1.anIntArray239[this.anInt213];
					this.anInt213++;
				}
				if (local51 <= this.anInt213) {
					@Pc(90) int local90 = 0;
					for (@Pc(92) int local92 = local51; local92 < this.aClass143_1.anIntArray241.length; local92++) {
						local90 += this.aClass143_1.anIntArray239[local92];
					}
					local32 %= local90;
				}
				this.anInt209 = this.anInt213 + 1;
				if (this.aClass143_1.anIntArray241.length <= this.anInt209) {
					this.anInt209 -= this.aClass143_1.anInt3784;
					if (this.anInt209 < 0 || this.anInt209 >= this.aClass143_1.anIntArray241.length) {
						this.anInt209 = -1;
					}
				}
			}
			while (local32 > this.aClass143_1.anIntArray239[this.anInt213]) {
				Static340.method4406(false, this.aClass143_1, arg1, this.anInt213, arg0, this.aByte4);
				local32 -= this.aClass143_1.anIntArray239[this.anInt213];
				this.anInt213++;
				if (this.anInt213 >= this.aClass143_1.anIntArray241.length) {
					this.anInt213 -= this.aClass143_1.anInt3784;
					if (this.anInt213 < 0 || this.anInt213 >= this.aClass143_1.anIntArray241.length) {
						this.aClass143_1 = null;
						continue label80;
					}
				}
				this.anInt209 = this.anInt213 + 1;
				if (this.aClass143_1.anIntArray241.length <= this.anInt209) {
					this.anInt209 -= this.aClass143_1.anInt3784;
					if (this.anInt209 < 0 || this.anInt209 >= this.aClass143_1.anIntArray241.length) {
						this.anInt209 = -1;
					}
				}
			}
			this.anInt217 = Static85.anInt1536 - local32;
			this.anInt216 = local32;
			return;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!za;)V")
	public void method152(@OriginalArg(1) Class200 arg0) {
		this.method155(this.anInt206, arg0, true, true, 262144, this.anInt203);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)V")
	public void method153(@OriginalArg(1) int arg0) {
		this.aBoolean29 = true;
		this.method159(arg0);
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(ILclient!za;)V")
	public void method154(@OriginalArg(1) Class200 arg0) {
		if (this.aClass5_Sub2_Sub1_1 != null) {
			Static107.method1478(this.aClass5_Sub2_Sub1_1, this.aByte3, this.anInt206, this.anInt203, this.aBooleanArray1);
			this.aBooleanArray1 = null;
			this.aClass5_Sub2_Sub1_1 = null;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!za;BZZII)Lclient!e;")
	public Class57 method155(@OriginalArg(0) int arg0, @OriginalArg(1) Class200 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Class114 local11 = Static398.aClass256_4.method5782(this.anInt215);
		if (local11.anIntArray170 != null) {
			local11 = local11.method2393(Static408.aClass39_1);
		}
		if (local11 == null) {
			this.method154(arg1);
			this.anInt200 = this.anInt213;
			this.anInt214 = -1;
			return null;
		}
		if (!this.aBoolean29 && this.anInt214 != local11.anInt2994) {
			this.aClass57_1 = null;
			this.method159(-1);
		}
		this.method151(arg5, arg0);
		@Pc(88) boolean local88 = arg2 & this.aBoolean28 & Static216.aClass1_Sub1_1.method3580(Static146.anInt2644) != 0;
		@Pc(128) boolean local128 = local88 & (local11.anInt2994 != this.anInt214 || (this.anInt213 != this.anInt200 || this.aClass143_1 != null && (this.aClass143_1.aBoolean244 || Static17.aBoolean33) && this.anInt209 != this.anInt213) && Static216.aClass1_Sub1_1.method3580(Static146.anInt2644) >= 2);
		if (arg3 && !local128) {
			this.anInt200 = this.anInt213;
			this.anInt214 = local11.anInt2994;
			return null;
		}
		if (local128) {
			Static107.method1478(this.aClass5_Sub2_Sub1_1, this.aByte3, this.anInt206, this.anInt203, this.aBooleanArray1);
		}
		@Pc(160) Class125 local160 = Static410.aClass125Array3[this.aByte3];
		@Pc(167) Class125 local167;
		if (this.aBoolean31) {
			local167 = Static110.aClass125Array1[0];
		} else {
			local167 = this.aByte3 < 3 ? Static410.aClass125Array3[this.aByte3 + 1] : null;
		}
		@Pc(184) Class57 local184 = null;
		if (this.aClass143_1 != null) {
			if (local128) {
				arg4 |= 0x40000;
			}
			local184 = local11.method2396(this.aClass143_1, this.anInt219 == 11 ? 10 : this.anInt219, this.anInt219 == 11 ? this.anInt196 + 4 : this.anInt196, arg1, this.anInt203, local160.ca(this.anInt206, this.anInt203), this.anInt216, this.anInt209, local160, this.anInt206, arg4, this.anInt213, local167);
			if (local184 == null) {
				this.anInt212 = 0;
				this.aBooleanArray1 = null;
				this.aClass5_Sub2_Sub1_1 = null;
			} else {
				if (local128) {
					if (this.aBooleanArray1 == null) {
						this.aBooleanArray1 = new boolean[4];
					}
					this.aClass5_Sub2_Sub1_1 = local184.EA(this.aClass5_Sub2_Sub1_1);
					Static79.method1162(this.aClass5_Sub2_Sub1_1, this.aByte3, arg0, arg5, this.aBooleanArray1);
				}
				this.anInt212 = local184.B();
			}
			this.aClass57_1 = null;
		} else if (this.aClass57_1 != null && arg4 == (arg4 & this.aClass57_1.RA()) && local11.anInt2994 == this.anInt214) {
			local184 = this.aClass57_1;
		} else {
			if (this.aClass57_1 != null) {
				arg4 |= this.aClass57_1.RA();
			}
			@Pc(261) Class108 local261 = local11.method2407(local160, arg4, this.anInt219 == 11 ? 10 : this.anInt219, local160.ca(this.anInt206, this.anInt203), this.anInt203, arg1, this.anInt219 == 11 ? this.anInt196 + 4 : this.anInt196, local128, this.anInt206, local167);
			if (local261 == null) {
				this.aBooleanArray1 = null;
				this.anInt212 = 0;
				this.aClass5_Sub2_Sub1_1 = null;
				this.aClass57_1 = null;
			} else {
				local184 = local261.aClass57_5;
				this.aClass57_1 = local261.aClass57_5;
				if (local128) {
					this.aBooleanArray1 = null;
					this.aClass5_Sub2_Sub1_1 = local261.aClass5_Sub2_Sub1_4;
					Static79.method1162(this.aClass5_Sub2_Sub1_1, this.aByte3, arg0, arg5, null);
				}
				this.anInt212 = local184.B();
			}
		}
		this.anInt200 = this.anInt213;
		this.anInt214 = local11.anInt2994;
		this.anInt206 = arg0;
		this.anInt203 = arg5;
		return local184;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILclient!za;ZLclient!e;III)V")
	public void method156(@OriginalArg(0) int arg0, @OriginalArg(2) Class200 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class57 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class179[] local12 = arg3.method6073();
		@Pc(15) Class236[] local15 = arg3.method6064();
		if ((this.aClass88_Sub6_1 == null || this.aClass88_Sub6_1.aBoolean420) && (local12 != null || local15 != null)) {
			@Pc(32) Class114 local32 = Static398.aClass256_4.method5782(this.anInt215);
			if (local32.anIntArray170 != null) {
				local32 = local32.method2393(Static408.aClass39_1);
			}
			if (local32 != null) {
				this.aClass88_Sub6_1 = new Class88_Sub6(Static85.anInt1536);
			}
		}
		if (this.aClass88_Sub6_1 == null) {
			return;
		}
		if (arg2) {
			this.aClass88_Sub6_1.method5042(arg1, (long) Static85.anInt1536, local12, local15);
		} else {
			this.aClass88_Sub6_1.method5044((long) Static85.anInt1536);
		}
		this.aClass88_Sub6_1.method5052(this.aByte4, arg4, arg5, arg0, arg6);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)I")
	public int method157() {
		return this.anInt212;
	}

	@OriginalMember(owner = "client!ah", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass88_Sub6_1 != null) {
			this.aClass88_Sub6_1.method5051();
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(BI)V")
	private void method159(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0;
		@Pc(17) boolean local17 = false;
		if (arg0 == -1) {
			@Pc(27) Class114 local27 = Static398.aClass256_4.method5782(this.anInt215);
			@Pc(29) Class114 local29 = local27;
			if (local27.anIntArray170 != null) {
				local27 = local27.method2393(Static408.aClass39_1);
			}
			if (local27 == null) {
				return;
			}
			if (local27 == local29) {
				local29 = null;
			}
			if (local27.anIntArray169 != null) {
				if (this.aClass143_1 != null && local27.method2403(this.aClass143_1.anInt3771)) {
					return;
				}
				local15 = local27.method2399();
				if (local27.anInt2994 != this.anInt214) {
					local17 = local27.aBoolean196;
				}
			} else if (local27.anInt2967 == -1) {
				if (local29 != null && local29.anIntArray169 != null) {
					if (this.aClass143_1 != null && local29.method2403(this.aClass143_1.anInt3771)) {
						return;
					}
					local15 = local29.method2399();
					if (this.anInt214 != local29.anInt2994) {
						local17 = local29.aBoolean196;
					}
				} else if (local29 != null && local29.anInt2967 != -1 && local29.anInt2994 != this.anInt214) {
					local17 = local29.aBoolean196;
					local15 = local29.anInt2967;
				}
			} else if (this.anInt214 != local27.anInt2994) {
				local15 = local27.anInt2967;
				local17 = local27.aBoolean196;
			}
		}
		if (local15 == -1) {
			this.aClass143_1 = null;
			return;
		}
		this.aClass57_1 = null;
		if (this.aClass143_1 == null || this.aClass143_1.anInt3771 != local15) {
			this.aClass143_1 = Static271.aClass219_4.method4752(local15);
		} else if (this.aClass143_1.anInt3772 == 0) {
			return;
		}
		if (this.aClass143_1.anIntArray241 == null) {
			this.aClass143_1 = null;
			return;
		}
		if (local17) {
			this.anInt213 = (int) ((double) this.aClass143_1.anIntArray241.length * Math.random());
			this.anInt216 = (int) ((double) this.aClass143_1.anIntArray239[this.anInt213] * Math.random()) + 1;
		} else {
			this.anInt213 = 0;
			this.anInt216 = 1;
		}
		this.anInt209 = this.anInt213 + 1;
		if (this.anInt209 < 0 || this.aClass143_1.anIntArray241.length <= this.anInt209) {
			this.anInt209 = -1;
		}
		this.anInt217 = Static85.anInt1536 - this.anInt216;
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)Z")
	public boolean method161() {
		return this.aBoolean28;
	}
}

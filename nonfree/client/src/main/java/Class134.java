import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class134 {

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "Lclient!hg;")
	private Class109 aClass109_2;

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "Lclient!bn;")
	public Class28_Sub1 aClass28_Sub1_4;

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "[Z")
	private boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
	private int anInt3398;

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
	private int anInt3399;

	@OriginalMember(owner = "client!ji", name = "A", descriptor = "Lclient!e;")
	private Class63 aClass63_3;

	@OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
	private int anInt3407;

	@OriginalMember(owner = "client!ji", name = "G", descriptor = "Lclient!i;")
	private Class2_Sub1_Sub5 aClass2_Sub1_Sub5_3;

	@OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
	private int anInt3411;

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
	private int anInt3391 = -1;

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
	private int anInt3395 = -32768;

	@OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
	private int anInt3405 = -1;

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
	public final int anInt3400;

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "B")
	private final byte aByte56;

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "B")
	private final byte aByte55;

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
	private int anInt3397;

	@OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
	private int anInt3409;

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
	public final int anInt3401;

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
	public final int anInt3396;

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "Z")
	private final boolean aBoolean222;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!za;Lclient!oq;IIIIIIZI)V")
	public Class134(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt3400 = arg3;
		this.aByte56 = (byte) arg5;
		this.aByte55 = (byte) arg4;
		this.aBoolean224 = arg8;
		this.anInt3397 = arg7;
		this.anInt3409 = arg6;
		this.anInt3401 = arg1.anInt5422;
		this.anInt3396 = arg2;
		this.aBoolean222 = arg0.method5952() && arg1.aBoolean384 && !this.aBoolean224;
		if (arg9 != -1) {
			this.aBoolean223 = true;
		}
		this.method2793(arg9);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIB)V")
	private void method2787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass109_2 == null) {
				if (this.aBoolean223) {
					return;
				}
				this.method2793(-1);
				if (this.aClass109_2 == null) {
					return;
				}
			}
			@Pc(34) int local34 = Static277.anInt5022 - this.anInt3398;
			if (local34 > 100 && this.aClass109_2.anInt2785 > 0) {
				@Pc(54) int local54 = this.aClass109_2.anIntArray240.length - this.aClass109_2.anInt2785;
				while (local54 > this.anInt3411 && this.aClass109_2.anIntArray238[this.anInt3411] < local34) {
					local34 -= this.aClass109_2.anIntArray238[this.anInt3411];
					this.anInt3411++;
				}
				if (this.anInt3411 >= local54) {
					@Pc(97) int local97 = 0;
					for (@Pc(99) int local99 = local54; local99 < this.aClass109_2.anIntArray240.length; local99++) {
						local97 += this.aClass109_2.anIntArray238[local99];
					}
					local34 %= local97;
				}
				this.anInt3407 = this.anInt3411 + 1;
				if (this.anInt3407 >= this.aClass109_2.anIntArray240.length) {
					this.anInt3407 -= this.aClass109_2.anInt2785;
					if (this.anInt3407 < 0 || this.anInt3407 >= this.aClass109_2.anIntArray240.length) {
						this.anInt3407 = -1;
					}
				}
			}
			while (local34 > this.aClass109_2.anIntArray238[this.anInt3411]) {
				Static245.method3411(false, this.anInt3411, this.aClass109_2, arg0, arg1, this.aByte55);
				local34 -= this.aClass109_2.anIntArray238[this.anInt3411];
				this.anInt3411++;
				if (this.aClass109_2.anIntArray240.length <= this.anInt3411) {
					this.anInt3411 -= this.aClass109_2.anInt2785;
					if (this.anInt3411 < 0 || this.anInt3411 >= this.aClass109_2.anIntArray240.length) {
						this.aClass109_2 = null;
						continue label80;
					}
				}
				this.anInt3407 = this.anInt3411 + 1;
				if (this.anInt3407 >= this.aClass109_2.anIntArray240.length) {
					this.anInt3407 -= this.aClass109_2.anInt2785;
					if (this.anInt3407 < 0 || this.aClass109_2.anIntArray240.length <= this.anInt3407) {
						this.anInt3407 = -1;
					}
				}
			}
			this.anInt3398 = Static277.anInt5022 - local34;
			this.anInt3399 = local34;
			return;
		}
	}

	@OriginalMember(owner = "client!ji", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass28_Sub1_4 != null) {
			this.aClass28_Sub1_4.method538();
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)I")
	public int method2788() {
		return this.anInt3395;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILclient!za;)V")
	public void method2789(@OriginalArg(1) Class75 arg0) {
		this.method2796(this.anInt3397, 262144, true, this.anInt3409, true, arg0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BI)V")
	public void method2790(@OriginalArg(1) int arg0) {
		this.aBoolean223 = true;
		this.method2793(arg0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILclient!za;Lclient!e;IIZ)V")
	public void method2791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class75 arg3, @OriginalArg(4) Class63 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(6) Class191[] local6 = arg4.method6288();
		@Pc(15) Class254[] local15 = arg4.method6291();
		if ((this.aClass28_Sub1_4 == null || this.aClass28_Sub1_4.aBoolean24) && (local6 != null || local15 != null)) {
			@Pc(32) Class192 local32 = Static249.aClass39_2.method748(this.anInt3401);
			if (local32.anIntArray462 != null) {
				local32 = local32.method4323(Static63.aClass120_2);
			}
			if (local32 != null) {
				this.aClass28_Sub1_4 = new Class28_Sub1(Static277.anInt5022);
			}
		}
		if (this.aClass28_Sub1_4 == null) {
			return;
		}
		if (arg6) {
			this.aClass28_Sub1_4.method534(arg3, (long) Static277.anInt5022, local6, local15);
		} else {
			this.aClass28_Sub1_4.method539((long) Static277.anInt5022);
		}
		this.aClass28_Sub1_4.method531(this.aByte55, arg1, arg0, arg2, arg5);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLclient!za;)V")
	public void method2792(@OriginalArg(1) Class75 arg0) {
		if (this.aClass2_Sub1_Sub5_3 != null) {
			Static213.method3025(this.aClass2_Sub1_Sub5_3, this.aByte56, this.anInt3409, this.anInt3397, this.aBooleanArray14);
			this.aClass2_Sub1_Sub5_3 = null;
			this.aBooleanArray14 = null;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
	private void method2793(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class192 local19 = Static249.aClass39_2.method748(this.anInt3401);
			@Pc(21) Class192 local21 = local19;
			if (local19.anIntArray462 != null) {
				local19 = local19.method4323(Static63.aClass120_2);
			}
			if (local19 == null) {
				return;
			}
			if (local21 == local19) {
				local21 = null;
			}
			if (local19.anIntArray459 != null) {
				if (this.aClass109_2 != null && local19.method4321(this.aClass109_2.anInt2780)) {
					return;
				}
				local7 = local19.method4326();
				if (this.anInt3391 != local19.anInt5422) {
					local9 = local19.lb;
				}
			} else if (local19.anInt5415 == -1) {
				if (local21 != null && local21.anIntArray459 != null) {
					if (this.aClass109_2 != null && local21.method4321(this.aClass109_2.anInt2780)) {
						return;
					}
					local7 = local21.method4326();
					if (local21.anInt5422 != this.anInt3391) {
						local9 = local21.lb;
					}
				} else if (local21 != null && local21.anInt5415 != -1 && this.anInt3391 != local21.anInt5422) {
					local9 = local21.lb;
					local7 = local21.anInt5415;
				}
			} else if (this.anInt3391 != local19.anInt5422) {
				local9 = local19.lb;
				local7 = local19.anInt5415;
			}
		}
		if (local7 == -1) {
			this.aClass109_2 = null;
			return;
		}
		this.aClass63_3 = null;
		if (this.aClass109_2 == null || this.aClass109_2.anInt2780 != local7) {
			this.aClass109_2 = Static37.aClass80_1.method1879(local7);
		} else if (this.aClass109_2.anInt2788 == 0) {
			return;
		}
		if (this.aClass109_2.anIntArray240 == null) {
			this.aClass109_2 = null;
			return;
		}
		if (local9) {
			this.anInt3411 = (int) ((double) this.aClass109_2.anIntArray240.length * Math.random());
			this.anInt3399 = (int) ((double) this.aClass109_2.anIntArray238[this.anInt3411] * Math.random()) + 1;
		} else {
			this.anInt3399 = 1;
			this.anInt3411 = 0;
		}
		this.anInt3407 = this.anInt3411 + 1;
		if (this.anInt3407 < 0 || this.aClass109_2.anIntArray240.length <= this.anInt3407) {
			this.anInt3407 = -1;
		}
		this.anInt3398 = Static277.anInt5022 - this.anInt3399;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIZBIZLclient!za;)Lclient!e;")
	public Class63 method2796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class75 arg5) {
		@Pc(11) Class192 local11 = Static249.aClass39_2.method748(this.anInt3401);
		if (local11.anIntArray462 != null) {
			local11 = local11.method4323(Static63.aClass120_2);
		}
		if (local11 == null) {
			this.method2792(arg5);
			this.anInt3391 = -1;
			this.anInt3405 = this.anInt3411;
			return null;
		}
		if (!this.aBoolean223 && this.anInt3391 != local11.anInt5422) {
			this.aClass63_3 = null;
			this.method2793(-1);
		}
		this.method2787(arg3, arg0);
		@Pc(80) boolean local80 = arg4 & this.aBoolean222 & Static434.aClass165_Sub1_1.method3392(Static404.anInt2752) != 0;
		@Pc(126) boolean local126 = local80 & (local11.anInt5422 != this.anInt3391 || (this.anInt3405 != this.anInt3411 || this.aClass109_2 != null && (this.aClass109_2.aBoolean174 || Static83.aBoolean76) && this.anInt3407 != this.anInt3411) && Static434.aClass165_Sub1_1.method3392(Static404.anInt2752) >= 2);
		if (arg2 && !local126) {
			this.anInt3391 = local11.anInt5422;
			this.anInt3405 = this.anInt3411;
			return null;
		}
		if (local126) {
			Static213.method3025(this.aClass2_Sub1_Sub5_3, this.aByte56, this.anInt3409, this.anInt3397, this.aBooleanArray14);
		}
		@Pc(158) Class22 local158 = Static241.aClass22Array3[this.aByte56];
		@Pc(174) Class22 local174;
		if (this.aBoolean224) {
			local174 = Static114.aClass22Array2[0];
		} else {
			local174 = this.aByte56 >= 3 ? null : Static241.aClass22Array3[this.aByte56 + 1];
		}
		@Pc(182) Class63 local182 = null;
		if (this.aClass109_2 != null) {
			if (local126) {
				arg1 |= 0x40000;
			}
			local182 = local11.method4311(this.anInt3411, local158, this.anInt3397, this.anInt3407, this.anInt3399, local158.ca(this.anInt3409, this.anInt3397), this.anInt3409, arg1, this.aClass109_2, arg5, local174, this.anInt3396 == 11 ? this.anInt3400 + 4 : this.anInt3400, this.anInt3396 == 11 ? 10 : this.anInt3396);
			if (local182 == null) {
				this.aBooleanArray14 = null;
				this.anInt3395 = 0;
				this.aClass2_Sub1_Sub5_3 = null;
			} else {
				if (local126) {
					if (this.aBooleanArray14 == null) {
						this.aBooleanArray14 = new boolean[4];
					}
					this.aClass2_Sub1_Sub5_3 = local182.EA(this.aClass2_Sub1_Sub5_3);
					Static452.method844(this.aClass2_Sub1_Sub5_3, this.aByte56, arg3, arg0, this.aBooleanArray14);
				}
				this.anInt3395 = local182.B();
			}
			this.aClass63_3 = null;
		} else if (this.aClass63_3 != null && (this.aClass63_3.RA() & arg1) == arg1 && local11.anInt5422 == this.anInt3391) {
			local182 = this.aClass63_3;
		} else {
			if (this.aClass63_3 != null) {
				arg1 |= this.aClass63_3.RA();
			}
			@Pc(255) Class189 local255 = local11.method4319(local126, local158.ca(this.anInt3409, this.anInt3397), this.anInt3397, arg1, local174, this.anInt3396 == 11 ? 10 : this.anInt3396, this.anInt3409, local158, arg5, this.anInt3396 == 11 ? this.anInt3400 + 4 : this.anInt3400);
			if (local255 == null) {
				this.aBooleanArray14 = null;
				this.aClass2_Sub1_Sub5_3 = null;
				this.aClass63_3 = null;
				this.anInt3395 = 0;
			} else {
				local182 = local255.aClass63_6;
				this.aClass63_3 = local255.aClass63_6;
				if (local126) {
					this.aBooleanArray14 = null;
					this.aClass2_Sub1_Sub5_3 = local255.aClass2_Sub1_Sub5_5;
					Static452.method844(this.aClass2_Sub1_Sub5_3, this.aByte56, arg3, arg0, null);
				}
				this.anInt3395 = local182.B();
			}
		}
		this.anInt3405 = this.anInt3411;
		this.anInt3409 = arg3;
		this.anInt3397 = arg0;
		this.anInt3391 = local11.anInt5422;
		return local182;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)Z")
	public boolean method2797() {
		return this.aBoolean222;
	}
}

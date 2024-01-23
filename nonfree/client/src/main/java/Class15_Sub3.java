import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class15_Sub3 extends Class15 {

	@OriginalMember(owner = "client!bn", name = "t", descriptor = "Lclient!lg;")
	private Class87_Sub2 aClass87_Sub2_1;

	@OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
	private int anInt463 = 0;

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
	private int anInt466 = 0;

	@OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
	private int anInt464 = -1;

	@OriginalMember(owner = "client!bn", name = "E", descriptor = "Z")
	private boolean aBoolean17 = true;

	@OriginalMember(owner = "client!bn", name = "O", descriptor = "I")
	private int anInt487 = -1;

	@OriginalMember(owner = "client!bn", name = "s", descriptor = "Lclient!fe;")
	private Class23_Sub1 aClass23_Sub1_1 = null;

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
	private int anInt465 = -32768;

	@OriginalMember(owner = "client!bn", name = "R", descriptor = "Z")
	private boolean aBoolean18 = false;

	@OriginalMember(owner = "client!bn", name = "L", descriptor = "I")
	private int anInt484 = 0;

	@OriginalMember(owner = "client!bn", name = "C", descriptor = "Z")
	private boolean aBoolean16 = false;

	@OriginalMember(owner = "client!bn", name = "X", descriptor = "I")
	private int anInt495;

	@OriginalMember(owner = "client!bn", name = "Q", descriptor = "I")
	private int anInt489;

	@OriginalMember(owner = "client!bn", name = "T", descriptor = "I")
	private int anInt491;

	@OriginalMember(owner = "client!bn", name = "D", descriptor = "I")
	private int anInt477;

	@OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
	private int anInt472;

	@OriginalMember(owner = "client!bn", name = "I", descriptor = "I")
	private int anInt481;

	@OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
	private int anInt470;

	@OriginalMember(owner = "client!bn", name = "w", descriptor = "Lclient!ro;")
	private Class157 aClass157_1;

	@OriginalMember(owner = "client!bn", name = "V", descriptor = "I")
	private int anInt493;

	@OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
	private int anInt462;

	@OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
	private int anInt473;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(IIIIIIIZLclient!io;)V")
	public Class15_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class15 arg8) {
		this.anInt495 = arg4;
		this.anInt489 = arg1;
		this.anInt491 = arg5;
		this.anInt477 = arg2;
		this.anInt472 = arg0;
		this.anInt481 = arg3;
		if (arg8 != null) {
			this.aBoolean16 = true;
			if (arg8 instanceof Class15_Sub3) {
				@Pc(96) Class15_Sub3 local96 = (Class15_Sub3) arg8;
				if (Static156.aBoolean211) {
					local96.method454();
				}
				this.anInt470 = local96.anInt470;
				this.aClass157_1 = local96.aClass157_1;
				this.anInt493 = local96.anInt493;
				this.anInt462 = local96.anInt462;
				this.anInt473 = local96.anInt473;
			} else if (Static156.aBoolean211) {
				@Pc(66) Class71 local66 = Static255.method4052(this.anInt472);
				if (local66.anIntArray209 != null) {
					local66 = local66.method2039();
				}
				if (local66 != null) {
					Static217.method3414(local66, this.anInt495, 0, 0, this.anInt491, this.anInt481, this.anInt477, this.anInt489);
				}
			}
		}
		if (this.aBoolean16) {
			this.method452(arg6);
		}
		if (Static156.aBoolean211 && arg8 != null) {
			this.method460(true);
		}
	}

	@OriginalMember(owner = "client!bn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass87_Sub2_1 != null) {
			this.aClass87_Sub2_1.method2722();
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "()I")
	@Override
	public int method4676() {
		return this.anInt465;
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)Lclient!io;")
	public Class15 method450() {
		return this.method460(false);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)V")
	private void method452(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(25) Class71 local25 = Static255.method4052(this.anInt472);
			@Pc(27) Class71 local27 = local25;
			if (local25.anIntArray209 != null) {
				local25 = local25.method2039();
			}
			if (local25 == null) {
				return;
			}
			if (local27 == local25) {
				local27 = null;
			}
			if (local25.anIntArray207 != null) {
				if (this.aClass157_1 != null && local25.method2027(this.aClass157_1.anInt4523)) {
					return;
				}
				local7 = local25.method2035();
				if (this.anInt487 != local25.anInt2388) {
					local9 = local25.aBoolean150;
				}
			} else if (local25.anInt2373 == -1) {
				if (local27 != null && local27.anIntArray207 != null) {
					if (this.aClass157_1 != null && local27.method2027(this.aClass157_1.anInt4523)) {
						return;
					}
					local7 = local27.method2035();
					if (local27.anInt2388 != this.anInt487) {
						local9 = local27.aBoolean150;
					}
				} else if (local27 != null && local27.anInt2373 != -1 && this.anInt487 != local27.anInt2388) {
					local7 = local27.anInt2373;
					local9 = local27.aBoolean150;
				}
			} else if (local25.anInt2388 != this.anInt487) {
				local7 = local25.anInt2373;
				local9 = local25.aBoolean150;
			}
		}
		if (local7 == -1) {
			this.aClass157_1 = null;
			return;
		}
		if (this.aClass157_1 == null || local7 != this.aClass157_1.anInt4523) {
			this.aClass157_1 = Static80.method1561(local7);
		} else if (this.aClass157_1.anInt4524 == 0) {
			return;
		}
		if (local9) {
			this.anInt462 = (int) ((double) this.aClass157_1.anIntArray396.length * Math.random());
			this.anInt493 = (int) ((double) this.aClass157_1.anIntArray395[this.anInt462] * Math.random()) + 1;
		} else {
			this.anInt462 = 0;
			this.anInt493 = 1;
		}
		this.anInt470 = this.anInt462 + 1;
		if (this.anInt470 < 0 || this.anInt470 >= this.aClass157_1.anIntArray396.length) {
			this.anInt470 = -1;
		}
		this.anInt473 = Static313.anInt2966 - this.anInt493;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!io;Z)V")
	private void method453(@OriginalArg(0) Class15 arg0) {
		@Pc(24) Class71 local24;
		if (Static156.aBoolean211) {
			@Pc(4) Class15_Sub2_Sub1 local4 = (Class15_Sub2_Sub1) arg0;
			if ((this.aClass87_Sub2_1 == null || this.aClass87_Sub2_1.aBoolean213) && (local4.aClass180Array1 != null || local4.aClass176Array1 != null)) {
				local24 = Static255.method4052(this.anInt472);
				if (local24.anIntArray209 != null) {
					local24 = local24.method2039();
				}
				if (local24 != null) {
					this.aClass87_Sub2_1 = new Class87_Sub2(Static313.anInt2966, local24.anInt2377, local24.anInt2385);
				}
			}
			if (this.aClass87_Sub2_1 != null) {
				this.aClass87_Sub2_1.method2718(local4.aClass180Array1, local4.aClass176Array1, false, local4.anIntArray53, local4.anIntArray51, local4.anIntArray49);
			}
		} else {
			@Pc(68) Class15_Sub2_Sub2 local68 = (Class15_Sub2_Sub2) arg0;
			if ((this.aClass87_Sub2_1 == null || this.aClass87_Sub2_1.aBoolean213) && (local68.aClass180Array2 != null || local68.aClass176Array2 != null)) {
				local24 = Static255.method4052(this.anInt472);
				if (local24.anIntArray209 != null) {
					local24 = local24.method2039();
				}
				if (local24 != null) {
					this.aClass87_Sub2_1 = new Class87_Sub2(Static313.anInt2966, local24.anInt2377, local24.anInt2385);
				}
			}
			if (this.aClass87_Sub2_1 != null) {
				this.aClass87_Sub2_1.method2718(local68.aClass180Array2, local68.aClass176Array2, false, local68.anIntArray70, local68.anIntArray69, local68.anIntArray71);
			}
		}
		this.aBoolean18 = true;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
	public void method454() {
		if (this.aClass23_Sub1_1 != null) {
			Static150.method2531(this.aClass23_Sub1_1, this.anInt466, this.anInt484, this.anInt463);
			this.aClass23_Sub1_1 = null;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIIIJILclient!lg;)V")
	@Override
	public void method4678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class87_Sub2 arg10) {
		@Pc(7) Class15 local7 = this.method450();
		if (local7 != null) {
			this.method453(local7);
			local7.method4678(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass87_Sub2_1);
		}
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(III)V")
	private void method459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label84: while (true) {
			if (this.aClass157_1 == null) {
				if (this.aBoolean16) {
					return;
				}
				this.method452(-1);
				if (this.aClass157_1 == null) {
					return;
				}
			}
			@Pc(34) int local34 = Static313.anInt2966 - this.anInt473;
			if (local34 > 100 && this.aClass157_1.anInt4530 > 0) {
				@Pc(56) int local56 = this.aClass157_1.anIntArray396.length - this.aClass157_1.anInt4530;
				while (local56 > this.anInt462 && local34 > this.aClass157_1.anIntArray395[this.anInt462]) {
					local34 -= this.aClass157_1.anIntArray395[this.anInt462];
					this.anInt462++;
				}
				if (this.anInt462 >= local56) {
					@Pc(95) int local95 = 0;
					for (@Pc(97) int local97 = local56; local97 < this.aClass157_1.anIntArray396.length; local97++) {
						local95 += this.aClass157_1.anIntArray395[local97];
					}
					local34 %= local95;
				}
				this.anInt470 = this.anInt462 + 1;
				if (this.aClass157_1.anIntArray396.length <= this.anInt470) {
					this.anInt470 -= this.aClass157_1.anInt4530;
					if (this.anInt470 < 0 || this.anInt470 >= this.aClass157_1.anIntArray396.length) {
						this.anInt470 = -1;
					}
				}
			}
			while (local34 > this.aClass157_1.anIntArray395[this.anInt462]) {
				Static31.method503(this.aClass157_1, this.anInt462, arg1, false, arg0);
				local34 -= this.aClass157_1.anIntArray395[this.anInt462];
				this.anInt462++;
				if (this.aClass157_1.anIntArray396.length <= this.anInt462) {
					this.anInt462 -= this.aClass157_1.anInt4530;
					if (this.anInt462 < 0 || this.anInt462 >= this.aClass157_1.anIntArray396.length) {
						this.aClass157_1 = null;
						continue label84;
					}
				}
				this.anInt470 = this.anInt462 + 1;
				if (this.anInt470 >= this.aClass157_1.anIntArray396.length) {
					this.anInt470 -= this.aClass157_1.anInt4530;
					if (this.anInt470 < 0 || this.anInt470 >= this.aClass157_1.anIntArray396.length) {
						this.anInt470 = -1;
					}
				}
			}
			this.anInt493 = local34;
			this.anInt473 = Static313.anInt2966 - local34;
			return;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZB)Lclient!io;")
	private Class15 method460(@OriginalArg(0) boolean arg0) {
		@Pc(12) boolean local12 = Static95.anIntArrayArrayArray5 != Static24.anIntArrayArrayArray2;
		@Pc(17) Class71 local17 = Static255.method4052(this.anInt472);
		if (local17.anIntArray209 != null) {
			local17 = local17.method2039();
		}
		if (local17 == null) {
			if (Static156.aBoolean211 && !local12) {
				this.method454();
			}
			this.anInt487 = -1;
			this.anInt464 = this.anInt462;
			return null;
		}
		if (!this.aBoolean16 && this.anInt487 != local17.anInt2388) {
			this.method452(-1);
		}
		@Pc(67) int local67 = this.anInt477 & 0x3;
		@Pc(83) int local83;
		@Pc(80) int local80;
		if (local67 == 1 || local67 == 3) {
			local80 = local17.anInt2377;
			local83 = local17.anInt2385;
		} else {
			local80 = local17.anInt2385;
			local83 = local17.anInt2377;
		}
		@Pc(98) int local98 = (local83 >> 1) + this.anInt495;
		@Pc(108) int local108 = this.anInt491 + (local80 + 1 >> 1);
		@Pc(115) int local115 = (local80 >> 1) + this.anInt491;
		@Pc(124) int local124 = (local83 + 1 >> 1) + this.anInt495;
		this.method459(local98 * 128, local115 * 128);
		@Pc(179) boolean local179 = !local12 && local17.aBoolean149 && (local17.anInt2388 != this.anInt487 || (this.anInt462 != this.anInt464 || this.aClass157_1 != null && (this.aClass157_1.aBoolean312 || Static269.aBoolean159) && this.anInt470 != this.anInt462) && Static192.anInt3641 >= 2);
		if (arg0 && !local179) {
			this.anInt464 = this.anInt462;
			this.anInt487 = local17.anInt2388;
			return null;
		}
		@Pc(202) int local202 = (local83 << 6) + (this.anInt495 << 7);
		@Pc(205) int[][] local205 = null;
		if (local12) {
			local205 = Static95.anIntArrayArrayArray5[0];
		} else if (this.anInt481 < 3) {
			local205 = Static24.anIntArrayArrayArray2[this.anInt481 + 1];
		}
		@Pc(237) int[][] local237 = Static24.anIntArrayArrayArray2[this.anInt481];
		@Pc(246) int local246 = (this.anInt491 << 7) + (local80 << 6);
		@Pc(272) int local272 = local237[local98][local108] + local237[local98][local115] + local237[local124][local115] + local237[local124][local108] >> 2;
		if (Static156.aBoolean211 && local179) {
			Static150.method2531(this.aClass23_Sub1_1, this.anInt466, this.anInt484, this.anInt463);
		}
		@Pc(294) boolean local294 = this.aClass23_Sub1_1 == null;
		@Pc(326) Class177 local326;
		if (this.aClass157_1 == null) {
			local326 = local17.method2037(false, this.anInt489, this.anInt477, local294 ? Static183.aClass23_Sub1_3 : this.aClass23_Sub1_1, local179, local246, local237, local272, local202, local205);
		} else {
			local326 = local17.method2038(local246, this.aClass157_1, local202, local237, this.anInt493, local272, local294 ? Static183.aClass23_Sub1_3 : this.aClass23_Sub1_1, local205, local179, this.anInt470, this.anInt489, this.anInt477, this.anInt462);
		}
		if (local326 == null) {
			this.anInt464 = this.anInt462;
			this.anInt487 = local17.anInt2388;
			return null;
		}
		if (Static156.aBoolean211 && local179) {
			@Pc(368) int local368 = 0;
			if (local294) {
				Static183.aClass23_Sub1_3 = local326.aClass23_Sub1_4;
			}
			if (this.anInt481 != 0) {
				@Pc(384) int[][] local384 = Static24.anIntArrayArrayArray2[0];
				local368 = local272 - (local384[local124][local115] + local384[local98][local115] + local384[local98][local108] + local384[local124][local108] >> 2);
			}
			@Pc(416) Class23_Sub1 local416 = local326.aClass23_Sub1_4;
			if (this.aBoolean17 && Static150.method2537(local416, local202, local368, local246)) {
				this.aBoolean17 = false;
			}
			if (!this.aBoolean17) {
				Static150.method2533(local416, local202, local368, local246);
				if (local294) {
					Static183.aClass23_Sub1_3 = null;
				}
				this.anInt463 = local246;
				this.anInt484 = local368;
				this.anInt466 = local202;
				this.aClass23_Sub1_1 = local416;
			}
		}
		this.anInt464 = this.anInt462;
		this.anInt487 = local17.anInt2388;
		return local326.aClass15_10;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) Class15 local5 = null;
		if (Static156.aBoolean211) {
			local5 = this.method460(true);
		} else {
			this.method459(arg3, arg4);
		}
		if (!this.aBoolean18) {
			if (local5 == null) {
				local5 = this.method450();
			}
			if (local5 == null) {
				return;
			}
			this.method453(local5);
		}
		if (this.aClass87_Sub2_1 != null) {
			this.aClass87_Sub2_1.method2719(arg0, arg1, arg3, arg2, arg4);
		}
	}
}

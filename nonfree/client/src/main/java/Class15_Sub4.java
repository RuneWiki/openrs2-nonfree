import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class15_Sub4 extends Class15 {

	@OriginalMember(owner = "client!go", name = "p", descriptor = "Lclient!gl;")
	private Class20_Sub2 aClass20_Sub2_4;

	@OriginalMember(owner = "client!go", name = "j", descriptor = "I")
	private int anInt2357 = 0;

	@OriginalMember(owner = "client!go", name = "y", descriptor = "Z")
	private boolean aBoolean155 = true;

	@OriginalMember(owner = "client!go", name = "O", descriptor = "I")
	private int anInt2381 = -1;

	@OriginalMember(owner = "client!go", name = "T", descriptor = "I")
	private int anInt2385 = -32768;

	@OriginalMember(owner = "client!go", name = "P", descriptor = "I")
	private int anInt2382 = 0;

	@OriginalMember(owner = "client!go", name = "M", descriptor = "Z")
	private boolean aBoolean156 = false;

	@OriginalMember(owner = "client!go", name = "H", descriptor = "I")
	private int anInt2376 = -1;

	@OriginalMember(owner = "client!go", name = "L", descriptor = "I")
	private int anInt2379 = 0;

	@OriginalMember(owner = "client!go", name = "cb", descriptor = "Z")
	private boolean aBoolean157 = false;

	@OriginalMember(owner = "client!go", name = "W", descriptor = "Lclient!ka;")
	private Class93_Sub1 aClass93_Sub1_2 = null;

	@OriginalMember(owner = "client!go", name = "r", descriptor = "I")
	private int anInt2364;

	@OriginalMember(owner = "client!go", name = "n", descriptor = "I")
	private int anInt2361;

	@OriginalMember(owner = "client!go", name = "R", descriptor = "I")
	private int anInt2383;

	@OriginalMember(owner = "client!go", name = "o", descriptor = "I")
	private int anInt2362;

	@OriginalMember(owner = "client!go", name = "U", descriptor = "I")
	private int anInt2386;

	@OriginalMember(owner = "client!go", name = "bb", descriptor = "I")
	private int anInt2392;

	@OriginalMember(owner = "client!go", name = "v", descriptor = "I")
	private int anInt2366;

	@OriginalMember(owner = "client!go", name = "Z", descriptor = "I")
	private int anInt2390;

	@OriginalMember(owner = "client!go", name = "D", descriptor = "I")
	private int anInt2373;

	@OriginalMember(owner = "client!go", name = "u", descriptor = "Lclient!mi;")
	private Class112 aClass112_2;

	@OriginalMember(owner = "client!go", name = "J", descriptor = "I")
	private int anInt2378;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIIIIIIZLclient!ml;)V")
	public Class15_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class15 arg8) {
		this.anInt2364 = arg2;
		this.anInt2361 = arg1;
		this.anInt2383 = arg3;
		this.anInt2362 = arg5;
		this.anInt2386 = arg0;
		this.anInt2392 = arg4;
		if (arg8 != null) {
			this.aBoolean157 = true;
			if (arg8 instanceof Class15_Sub4) {
				@Pc(95) Class15_Sub4 local95 = (Class15_Sub4) arg8;
				if (Static116.aBoolean184) {
					local95.method1734();
				}
				this.anInt2366 = local95.anInt2366;
				this.anInt2390 = local95.anInt2390;
				this.anInt2373 = local95.anInt2373;
				this.aClass112_2 = local95.aClass112_2;
				this.anInt2378 = local95.anInt2378;
			} else if (Static116.aBoolean184) {
				@Pc(64) Class146 local64 = Static10.method158(this.anInt2386);
				if (local64.anIntArray467 != null) {
					local64 = local64.method3815();
				}
				if (local64 != null) {
					Static100.method1733(local64, this.anInt2383, this.anInt2362, 0, this.anInt2392, 0, this.anInt2364, this.anInt2361);
				}
			}
		}
		if (this.aBoolean157) {
			this.method1725(arg6);
		}
		if (Static116.aBoolean184 && arg8 != null) {
			this.method1737(true);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)V")
	private void method1725(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class146 local19 = Static10.method158(this.anInt2386);
			@Pc(21) Class146 local21 = local19;
			if (local19.anIntArray467 != null) {
				local19 = local19.method3815();
			}
			if (local19 == null) {
				return;
			}
			if (local19 == local21) {
				local21 = null;
			}
			if (local19.anIntArray465 != null) {
				if (this.aClass112_2 != null && local19.method3823(this.aClass112_2.anInt3850)) {
					return;
				}
				local7 = local19.method3817();
				if (local19.anInt4724 != this.anInt2376) {
					local9 = local19.aBoolean319;
				}
			} else if (local19.anInt4731 == -1) {
				if (local21 != null && local21.anIntArray465 != null) {
					if (this.aClass112_2 != null && local21.method3823(this.aClass112_2.anInt3850)) {
						return;
					}
					local7 = local21.method3817();
					if (local21.anInt4724 != this.anInt2376) {
						local9 = local21.aBoolean319;
					}
				} else if (local21 != null && local21.anInt4731 != -1 && this.anInt2376 != local21.anInt4724) {
					local7 = local21.anInt4731;
					local9 = local21.aBoolean319;
				}
			} else if (local19.anInt4724 != this.anInt2376) {
				local9 = local19.aBoolean319;
				local7 = local19.anInt4731;
			}
		}
		if (local7 == -1) {
			this.aClass112_2 = null;
			return;
		}
		if (this.aClass112_2 == null || local7 != this.aClass112_2.anInt3850) {
			this.aClass112_2 = Static208.method3496(local7);
		} else if (this.aClass112_2.anInt3857 == 0) {
			return;
		}
		if (local9) {
			this.anInt2390 = (int) (Math.random() * (double) this.aClass112_2.anIntArray378.length);
			this.anInt2378 = (int) (Math.random() * (double) this.aClass112_2.anIntArray377[this.anInt2390]) + 1;
		} else {
			this.anInt2390 = 0;
			this.anInt2378 = 1;
		}
		this.anInt2366 = this.anInt2390 + 1;
		if (this.anInt2366 < 0 || this.aClass112_2.anIntArray378.length <= this.anInt2366) {
			this.anInt2366 = -1;
		}
		this.anInt2373 = Static268.anInt5236 - this.anInt2378;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)Lclient!ml;")
	public Class15 method1727() {
		return this.method1737(false);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILclient!ml;)V")
	private void method1731(@OriginalArg(1) Class15 arg0) {
		@Pc(23) Class146 local23;
		if (Static116.aBoolean184) {
			@Pc(4) Class15_Sub5_Sub2 local4 = (Class15_Sub5_Sub2) arg0;
			if ((this.aClass20_Sub2_4 == null || this.aClass20_Sub2_4.aBoolean150) && (local4.aClass185Array2 != null || local4.aClass176Array2 != null)) {
				local23 = Static10.method158(this.anInt2386);
				if (local23.anIntArray467 != null) {
					local23 = local23.method3815();
				}
				if (local23 != null) {
					this.aClass20_Sub2_4 = new Class20_Sub2(Static268.anInt5236, local23.anInt4749, local23.anInt4721);
				}
			}
			if (this.aClass20_Sub2_4 != null) {
				this.aClass20_Sub2_4.method1699(local4.aClass185Array2, local4.aClass176Array2, false, local4.anIntArray285, local4.anIntArray287, local4.anIntArray288);
			}
		} else {
			@Pc(69) Class15_Sub5_Sub1 local69 = (Class15_Sub5_Sub1) arg0;
			if ((this.aClass20_Sub2_4 == null || this.aClass20_Sub2_4.aBoolean150) && (local69.aClass185Array1 != null || local69.aClass176Array1 != null)) {
				local23 = Static10.method158(this.anInt2386);
				if (local23.anIntArray467 != null) {
					local23 = local23.method3815();
				}
				if (local23 != null) {
					this.aClass20_Sub2_4 = new Class20_Sub2(Static268.anInt5236, local23.anInt4749, local23.anInt4721);
				}
			}
			if (this.aClass20_Sub2_4 != null) {
				this.aClass20_Sub2_4.method1699(local69.aClass185Array1, local69.aClass176Array1, false, local69.anIntArray251, local69.anIntArray244, local69.anIntArray249);
			}
		}
		this.aBoolean156 = true;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "()I")
	@Override
	public int method4274() {
		return this.anInt2385;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIIIIIJILclient!gl;)V")
	@Override
	public void method4272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub2 arg10) {
		@Pc(3) Class15 local3 = this.method1727();
		if (local3 != null) {
			this.method1731(local3);
			local3.method4272(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub2_4);
		}
	}

	@OriginalMember(owner = "client!go", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass20_Sub2_4 != null) {
			this.aClass20_Sub2_4.method1694();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V")
	public void method1734() {
		if (this.aClass93_Sub1_2 != null) {
			Static266.method4172(this.aClass93_Sub1_2, this.anInt2379, this.anInt2382, this.anInt2357);
			this.aClass93_Sub1_2 = null;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) Class15 local5 = null;
		if (Static116.aBoolean184) {
			local5 = this.method1737(true);
		} else {
			this.method1735(arg3, arg4);
		}
		if (!this.aBoolean156) {
			if (local5 == null) {
				local5 = this.method1727();
			}
			if (local5 == null) {
				return;
			}
			this.method1731(local5);
		}
		if (this.aClass20_Sub2_4 != null) {
			this.aClass20_Sub2_4.method1691(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(III)V")
	private void method1735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label83: while (true) {
			if (this.aClass112_2 == null) {
				if (this.aBoolean157) {
					return;
				}
				this.method1725(-1);
				if (this.aClass112_2 == null) {
					return;
				}
			}
			@Pc(34) int local34 = Static268.anInt5236 - this.anInt2373;
			if (local34 > 100 && this.aClass112_2.anInt3856 > 0) {
				@Pc(52) int local52 = this.aClass112_2.anIntArray378.length - this.aClass112_2.anInt3856;
				while (this.anInt2390 < local52 && local34 > this.aClass112_2.anIntArray377[this.anInt2390]) {
					local34 -= this.aClass112_2.anIntArray377[this.anInt2390];
					this.anInt2390++;
				}
				if (local52 <= this.anInt2390) {
					@Pc(95) int local95 = 0;
					for (@Pc(97) int local97 = local52; local97 < this.aClass112_2.anIntArray378.length; local97++) {
						local95 += this.aClass112_2.anIntArray377[local97];
					}
					local34 %= local95;
				}
				this.anInt2366 = this.anInt2390 + 1;
				if (this.aClass112_2.anIntArray378.length <= this.anInt2366) {
					this.anInt2366 -= this.aClass112_2.anInt3856;
					if (this.anInt2366 < 0 || this.anInt2366 >= this.aClass112_2.anIntArray378.length) {
						this.anInt2366 = -1;
					}
				}
			}
			while (this.aClass112_2.anIntArray377[this.anInt2390] < local34) {
				Static28.method558(false, this.aClass112_2, this.anInt2390, arg0, arg1);
				local34 -= this.aClass112_2.anIntArray377[this.anInt2390];
				this.anInt2390++;
				if (this.aClass112_2.anIntArray378.length <= this.anInt2390) {
					this.anInt2390 -= this.aClass112_2.anInt3856;
					if (this.anInt2390 < 0 || this.aClass112_2.anIntArray378.length <= this.anInt2390) {
						this.aClass112_2 = null;
						continue label83;
					}
				}
				this.anInt2366 = this.anInt2390 + 1;
				if (this.aClass112_2.anIntArray378.length <= this.anInt2366) {
					this.anInt2366 -= this.aClass112_2.anInt3856;
					if (this.anInt2366 < 0 || this.anInt2366 >= this.aClass112_2.anIntArray378.length) {
						this.anInt2366 = -1;
					}
				}
			}
			this.anInt2373 = Static268.anInt5236 - local34;
			this.anInt2378 = local34;
			return;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)Lclient!ml;")
	private Class15 method1737(@OriginalArg(0) boolean arg0) {
		@Pc(18) boolean local18 = Static300.anIntArrayArrayArray15 != Static9.anIntArrayArrayArray7;
		@Pc(23) Class146 local23 = Static10.method158(this.anInt2386);
		if (local23.anIntArray467 != null) {
			local23 = local23.method3815();
		}
		if (local23 == null) {
			if (Static116.aBoolean184 && !local18) {
				this.method1734();
			}
			this.anInt2381 = this.anInt2390;
			this.anInt2376 = -1;
			return null;
		}
		if (!this.aBoolean157 && this.anInt2376 != local23.anInt4724) {
			this.method1725(-1);
		}
		@Pc(69) int local69 = this.anInt2364 & 0x3;
		@Pc(83) int local83;
		@Pc(80) int local80;
		if (local69 == 1 || local69 == 3) {
			local80 = local23.anInt4749;
			local83 = local23.anInt4721;
		} else {
			local80 = local23.anInt4721;
			local83 = local23.anInt4749;
		}
		@Pc(99) int local99 = this.anInt2392 + (local83 >> 1);
		@Pc(109) int local109 = this.anInt2392 + (local83 + 1 >> 1);
		@Pc(116) int local116 = (local80 >> 1) + this.anInt2362;
		@Pc(125) int local125 = (local80 + 1 >> 1) + this.anInt2362;
		this.method1735(local99 * 128, local116 * 128);
		@Pc(178) boolean local178 = !local18 && local23.aBoolean322 && (local23.anInt4724 != this.anInt2376 || (this.anInt2390 != this.anInt2381 || this.aClass112_2 != null && (this.aClass112_2.aBoolean261 || Static104.aBoolean160) && this.anInt2366 != this.anInt2390) && Static243.anInt4839 >= 2);
		if (arg0 && !local178) {
			this.anInt2376 = local23.anInt4724;
			this.anInt2381 = this.anInt2390;
			return null;
		}
		@Pc(197) int[][] local197 = Static9.anIntArrayArrayArray7[this.anInt2383];
		@Pc(223) int local223 = local197[local109][local125] + local197[local99][local125] + local197[local109][local116] + local197[local99][local116] >> 2;
		@Pc(232) int local232 = (local80 << 6) + (this.anInt2362 << 7);
		@Pc(241) int local241 = (local83 << 6) + (this.anInt2392 << 7);
		@Pc(244) int[][] local244 = null;
		if (local18) {
			local244 = Static300.anIntArrayArrayArray15[0];
		} else if (this.anInt2383 < 3) {
			local244 = Static9.anIntArrayArrayArray7[this.anInt2383 + 1];
		}
		if (Static116.aBoolean184 && local178) {
			Static266.method4172(this.aClass93_Sub1_2, this.anInt2379, this.anInt2382, this.anInt2357);
		}
		@Pc(285) boolean local285 = this.aClass93_Sub1_2 == null;
		@Pc(309) Class50 local309;
		if (this.aClass112_2 == null) {
			local309 = local23.method3825(local232, this.anInt2364, local223, local241, false, local285 ? Static108.aClass93_Sub1_3 : this.aClass93_Sub1_2, this.anInt2361, local244, local178, local197);
		} else {
			local309 = local23.method3819(local223, this.anInt2390, this.anInt2361, this.aClass112_2, this.anInt2366, local285 ? Static108.aClass93_Sub1_3 : this.aClass93_Sub1_2, local197, local178, this.anInt2364, local244, local241, this.anInt2378, local232);
		}
		if (local309 == null) {
			this.anInt2376 = local23.anInt4724;
			this.anInt2381 = this.anInt2390;
			return null;
		}
		if (Static116.aBoolean184 && local178) {
			if (local285) {
				Static108.aClass93_Sub1_3 = local309.aClass93_Sub1_1;
			}
			@Pc(363) int local363 = 0;
			if (this.anInt2383 != 0) {
				@Pc(374) int[][] local374 = Static9.anIntArrayArrayArray7[0];
				local363 = local223 - (local374[local109][local125] + local374[local109][local116] + local374[local99][local116] + local374[local99][local125] >> 2);
			}
			@Pc(406) Class93_Sub1 local406 = local309.aClass93_Sub1_1;
			if (this.aBoolean155 && Static266.method4164(local406, local241, local363, local232)) {
				this.aBoolean155 = false;
			}
			if (!this.aBoolean155) {
				Static266.method4179(local406, local241, local363, local232);
				this.anInt2357 = local232;
				this.anInt2382 = local363;
				this.anInt2379 = local241;
				if (local285) {
					Static108.aClass93_Sub1_3 = null;
				}
				this.aClass93_Sub1_2 = local406;
			}
		}
		this.anInt2381 = this.anInt2390;
		this.anInt2376 = local23.anInt4724;
		return local309.aClass15_1;
	}
}

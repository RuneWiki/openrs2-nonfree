import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!bk", name = "z", descriptor = "[I")
	public static int[] anIntArray71 = new int[32];

	@OriginalMember(owner = "client!bk", name = "q", descriptor = "Lclient!il;")
	private Class21_Sub1 aClass21_Sub1_1;

	@OriginalMember(owner = "client!bk", name = "D", descriptor = "Z")
	private boolean aBoolean43 = true;

	@OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
	private int anInt555 = 0;

	@OriginalMember(owner = "client!bk", name = "r", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
	private int anInt549 = 0;

	@OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
	private int anInt562 = -1;

	@OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
	private int anInt563 = -32768;

	@OriginalMember(owner = "client!bk", name = "y", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!bk", name = "M", descriptor = "Lclient!ta;")
	private Class58_Sub2 aClass58_Sub2_1 = null;

	@OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
	private int anInt553 = 0;

	@OriginalMember(owner = "client!bk", name = "Q", descriptor = "I")
	private int anInt569 = -1;

	@OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
	private int anInt564;

	@OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
	private int anInt554;

	@OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
	private int anInt558;

	@OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
	private int anInt566;

	@OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
	private int anInt550;

	@OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
	private int anInt559;

	@OriginalMember(owner = "client!bk", name = "T", descriptor = "I")
	private int anInt572;

	@OriginalMember(owner = "client!bk", name = "u", descriptor = "Lclient!wi;")
	private Class186 aClass186_1;

	@OriginalMember(owner = "client!bk", name = "O", descriptor = "I")
	private int anInt567;

	@OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
	private int anInt561;

	@OriginalMember(owner = "client!bk", name = "W", descriptor = "I")
	private int anInt575;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray71[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(IIIIIIIZLclient!uk;)V")
	public Class13_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class13 arg8) {
		this.anInt564 = arg1;
		this.anInt554 = arg0;
		this.anInt558 = arg4;
		this.anInt566 = arg5;
		this.anInt550 = arg3;
		this.anInt559 = arg2;
		if (arg8 != null) {
			this.aBoolean41 = true;
			if (arg8 instanceof Class13_Sub2) {
				@Pc(96) Class13_Sub2 local96 = (Class13_Sub2) arg8;
				if (Static251.aBoolean330) {
					local96.method559();
				}
				this.anInt572 = local96.anInt572;
				this.aClass186_1 = local96.aClass186_1;
				this.anInt567 = local96.anInt567;
				this.anInt561 = local96.anInt561;
				this.anInt575 = local96.anInt575;
			} else if (Static251.aBoolean330) {
				@Pc(66) Class73 local66 = Static296.method4591(this.anInt554);
				if (local66.anIntArray196 != null) {
					local66 = local66.method1899();
				}
				if (local66 != null) {
					Static52.method1023(this.anInt558, local66, this.anInt559, this.anInt566, this.anInt564, this.anInt550, 0, 0);
				}
			}
		}
		if (this.aBoolean41) {
			this.method560(arg6);
		}
		if (Static251.aBoolean330 && arg8 != null) {
			this.method557(true);
		}
	}

	@OriginalMember(owner = "client!bk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass21_Sub1_1 != null) {
			this.aClass21_Sub1_1.method1985();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) Class13 local5 = null;
		if (Static251.aBoolean330) {
			local5 = this.method557(true);
		} else {
			this.method556(arg4, arg3);
		}
		if (!this.aBoolean42) {
			if (local5 == null) {
				local5 = this.method563();
			}
			if (local5 == null) {
				return;
			}
			this.method562(local5);
		}
		if (this.aClass21_Sub1_1 != null) {
			this.aClass21_Sub1_1.method1976(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIIIIJILclient!il;)V")
	@Override
	public void method4262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class21_Sub1 arg10) {
		@Pc(7) Class13 local7 = this.method563();
		if (local7 != null) {
			this.method562(local7);
			local7.method4262(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass21_Sub1_1);
		}
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "()I")
	@Override
	public int method4266() {
		return this.anInt563;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(III)V")
	private void method556(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label86: while (true) {
			if (this.aClass186_1 == null) {
				if (this.aBoolean41) {
					return;
				}
				this.method560(-1);
				if (this.aClass186_1 == null) {
					return;
				}
			}
			@Pc(35) int local35 = Static50.anInt1118 - this.anInt567;
			if (local35 > 100 && this.aClass186_1.anInt5823 > 0) {
				@Pc(57) int local57 = this.aClass186_1.anIntArray469.length - this.aClass186_1.anInt5823;
				while (this.anInt575 < local57 && local35 > this.aClass186_1.anIntArray470[this.anInt575]) {
					local35 -= this.aClass186_1.anIntArray470[this.anInt575];
					this.anInt575++;
				}
				if (local57 <= this.anInt575) {
					@Pc(97) int local97 = 0;
					for (@Pc(99) int local99 = local57; local99 < this.aClass186_1.anIntArray469.length; local99++) {
						local97 += this.aClass186_1.anIntArray470[local99];
					}
					local35 %= local97;
				}
				this.anInt572 = this.anInt575 + 1;
				if (this.anInt572 >= this.aClass186_1.anIntArray469.length) {
					this.anInt572 -= this.aClass186_1.anInt5823;
					if (this.anInt572 < 0 || this.anInt572 >= this.aClass186_1.anIntArray469.length) {
						this.anInt572 = -1;
					}
				}
			}
			while (this.aClass186_1.anIntArray470[this.anInt575] < local35) {
				Static229.method3598(false, arg0, this.aClass186_1, arg1, this.anInt575);
				local35 -= this.aClass186_1.anIntArray470[this.anInt575];
				this.anInt575++;
				if (this.aClass186_1.anIntArray469.length <= this.anInt575) {
					this.anInt575 -= this.aClass186_1.anInt5823;
					if (this.anInt575 < 0 || this.anInt575 >= this.aClass186_1.anIntArray469.length) {
						this.aClass186_1 = null;
						continue label86;
					}
				}
				this.anInt572 = this.anInt575 + 1;
				if (this.aClass186_1.anIntArray469.length <= this.anInt572) {
					this.anInt572 -= this.aClass186_1.anInt5823;
					if (this.anInt572 < 0 || this.anInt572 >= this.aClass186_1.anIntArray469.length) {
						this.anInt572 = -1;
					}
				}
			}
			this.anInt561 = local35;
			this.anInt567 = Static50.anInt1118 - local35;
			return;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)Lclient!uk;")
	private Class13 method557(@OriginalArg(0) boolean arg0) {
		@Pc(12) boolean local12 = Static154.anIntArrayArrayArray5 != Static230.anIntArrayArrayArray12;
		@Pc(17) Class73 local17 = Static296.method4591(this.anInt554);
		if (local17.anIntArray196 != null) {
			local17 = local17.method1899();
		}
		if (local17 == null) {
			if (Static251.aBoolean330 && !local12) {
				this.method559();
			}
			this.anInt562 = this.anInt575;
			this.anInt569 = -1;
			return null;
		}
		if (!this.aBoolean41 && local17.anInt2237 != this.anInt569) {
			this.method560(-1);
		}
		@Pc(61) int local61 = this.anInt559 & 0x3;
		@Pc(75) int local75;
		@Pc(72) int local72;
		if (local61 == 1 || local61 == 3) {
			local75 = local17.anInt2253;
			local72 = local17.anInt2259;
		} else {
			local72 = local17.anInt2253;
			local75 = local17.anInt2259;
		}
		@Pc(92) int local92 = (local75 + 1 >> 1) + this.anInt558;
		@Pc(105) int local105 = this.anInt566 + (local72 >> 1);
		@Pc(112) int local112 = (local75 >> 1) + this.anInt558;
		@Pc(121) int local121 = (local72 + 1 >> 1) + this.anInt566;
		this.method556(local105 * 128, local112 * 128);
		@Pc(177) boolean local177 = !local12 && local17.aBoolean140 && (this.anInt569 != local17.anInt2237 || (this.anInt575 != this.anInt562 || this.aClass186_1 != null && (this.aClass186_1.aBoolean406 || Static230.aBoolean289) && this.anInt572 != this.anInt575) && Static154.anInt3207 >= 2);
		if (arg0 && !local177) {
			this.anInt562 = this.anInt575;
			this.anInt569 = local17.anInt2237;
			return null;
		}
		@Pc(197) int[][] local197 = Static154.anIntArrayArrayArray5[this.anInt550];
		@Pc(207) int local207 = (this.anInt558 << 7) + (local75 << 6);
		@Pc(210) int[][] local210 = null;
		@Pc(219) int local219 = (local72 << 6) + (this.anInt566 << 7);
		if (local12) {
			local210 = Static230.anIntArrayArrayArray12[0];
		} else if (this.anInt550 < 3) {
			local210 = Static154.anIntArrayArrayArray5[this.anInt550 + 1];
		}
		@Pc(265) int local265 = local197[local92][local121] + local197[local112][local121] + local197[local112][local105] + local197[local92][local105] >> 2;
		if (Static251.aBoolean330 && local177) {
			Static249.method3815(this.aClass58_Sub2_1, this.anInt553, this.anInt555, this.anInt549);
		}
		@Pc(285) boolean local285 = this.aClass58_Sub2_1 == null;
		@Pc(309) Class129 local309;
		if (this.aClass186_1 == null) {
			local309 = local17.method1889(this.anInt564, local285 ? Static165.aClass58_Sub2_2 : this.aClass58_Sub2_1, local177, local210, local197, this.anInt559, local219, false, local265, local207);
		} else {
			local309 = local17.method1893(this.anInt561, this.aClass186_1, this.anInt559, this.anInt564, this.anInt575, local197, local219, local177, local265, local210, local285 ? Static165.aClass58_Sub2_2 : this.aClass58_Sub2_1, this.anInt572, local207);
		}
		if (local309 == null) {
			this.anInt569 = local17.anInt2237;
			this.anInt562 = this.anInt575;
			return null;
		}
		if (Static251.aBoolean330 && local177) {
			if (local285) {
				Static165.aClass58_Sub2_2 = local309.aClass58_Sub2_3;
			}
			@Pc(366) int local366 = 0;
			if (this.anInt550 != 0) {
				@Pc(377) int[][] local377 = Static154.anIntArrayArrayArray5[0];
				local366 = local265 - (local377[local112][local121] + local377[local112][local105] + local377[local92][local105] + local377[local92][local121] >> 2);
			}
			@Pc(410) Class58_Sub2 local410 = local309.aClass58_Sub2_3;
			if (this.aBoolean43 && Static249.method3813(local410, local207, local366, local219)) {
				this.aBoolean43 = false;
			}
			if (!this.aBoolean43) {
				Static249.method3807(local410, local207, local366, local219);
				if (local285) {
					Static165.aClass58_Sub2_2 = null;
				}
				this.anInt555 = local366;
				this.aClass58_Sub2_1 = local410;
				this.anInt553 = local207;
				this.anInt549 = local219;
			}
		}
		this.anInt569 = local17.anInt2237;
		this.anInt562 = this.anInt575;
		return local309.aClass13_8;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
	public void method559() {
		if (this.aClass58_Sub2_1 != null) {
			Static249.method3815(this.aClass58_Sub2_1, this.anInt553, this.anInt555, this.anInt549);
			this.aClass58_Sub2_1 = null;
		}
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)V")
	private void method560(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(22) Class73 local22 = Static296.method4591(this.anInt554);
			@Pc(24) Class73 local24 = local22;
			if (local22.anIntArray196 != null) {
				local22 = local22.method1899();
			}
			if (local22 == null) {
				return;
			}
			if (local22 == local24) {
				local24 = null;
			}
			if (local22.anIntArray197 != null) {
				if (this.aClass186_1 != null && local22.method1905(this.aClass186_1.anInt5808)) {
					return;
				}
				local7 = local22.method1895();
				if (local22.anInt2237 != this.anInt569) {
					local9 = local22.aBoolean131;
				}
			} else if (local22.anInt2229 == -1) {
				if (local24 != null && local24.anIntArray197 != null) {
					if (this.aClass186_1 != null && local24.method1905(this.aClass186_1.anInt5808)) {
						return;
					}
					local7 = local24.method1895();
					if (local24.anInt2237 != this.anInt569) {
						local9 = local24.aBoolean131;
					}
				} else if (local24 != null && local24.anInt2229 != -1 && this.anInt569 != local24.anInt2237) {
					local7 = local24.anInt2229;
					local9 = local24.aBoolean131;
				}
			} else if (this.anInt569 != local22.anInt2237) {
				local7 = local22.anInt2229;
				local9 = local22.aBoolean131;
			}
		}
		if (local7 == -1) {
			this.aClass186_1 = null;
			return;
		}
		if (this.aClass186_1 == null || this.aClass186_1.anInt5808 != local7) {
			this.aClass186_1 = Static51.method992(local7);
		} else if (this.aClass186_1.anInt5814 == 0) {
			return;
		}
		if (local9) {
			this.anInt575 = (int) ((double) this.aClass186_1.anIntArray469.length * Math.random());
			this.anInt561 = (int) (Math.random() * (double) this.aClass186_1.anIntArray470[this.anInt575]) + 1;
		} else {
			this.anInt575 = 0;
			this.anInt561 = 1;
		}
		this.anInt572 = this.anInt575 + 1;
		if (this.anInt572 < 0 || this.aClass186_1.anIntArray469.length <= this.anInt572) {
			this.anInt572 = -1;
		}
		this.anInt567 = Static50.anInt1118 - this.anInt561;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!uk;)V")
	private void method562(@OriginalArg(1) Class13 arg0) {
		@Pc(29) Class73 local29;
		if (Static251.aBoolean330) {
			@Pc(72) Class13_Sub1_Sub2 local72 = (Class13_Sub1_Sub2) arg0;
			if ((this.aClass21_Sub1_1 == null || this.aClass21_Sub1_1.aBoolean152) && (local72.aClass62Array2 != null || local72.aClass88Array2 != null)) {
				local29 = Static296.method4591(this.anInt554);
				if (local29.anIntArray196 != null) {
					local29 = local29.method1899();
				}
				if (local29 != null) {
					this.aClass21_Sub1_1 = new Class21_Sub1(Static50.anInt1118, local29.anInt2259, local29.anInt2253);
				}
			}
			if (this.aClass21_Sub1_1 != null) {
				this.aClass21_Sub1_1.method1974(local72.aClass62Array2, local72.aClass88Array2, false, local72.anIntArray289, local72.anIntArray286, local72.anIntArray290);
			}
		} else {
			@Pc(8) Class13_Sub1_Sub1 local8 = (Class13_Sub1_Sub1) arg0;
			if ((this.aClass21_Sub1_1 == null || this.aClass21_Sub1_1.aBoolean152) && (local8.aClass62Array1 != null || local8.aClass88Array1 != null)) {
				local29 = Static296.method4591(this.anInt554);
				if (local29.anIntArray196 != null) {
					local29 = local29.method1899();
				}
				if (local29 != null) {
					this.aClass21_Sub1_1 = new Class21_Sub1(Static50.anInt1118, local29.anInt2259, local29.anInt2253);
				}
			}
			if (this.aClass21_Sub1_1 != null) {
				this.aClass21_Sub1_1.method1974(local8.aClass62Array1, local8.aClass88Array1, false, local8.anIntArray15, local8.anIntArray22, local8.anIntArray20);
			}
		}
		this.aBoolean42 = true;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)Lclient!uk;")
	public Class13 method563() {
		return this.method557(false);
	}
}

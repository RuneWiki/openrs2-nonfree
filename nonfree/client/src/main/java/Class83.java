import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class83 {

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
	private int anInt2617;

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "[Z")
	private boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "Lclient!bq;")
	public Class8_Sub3 aClass8_Sub3_3;

	@OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
	private int anInt2624;

	@OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
	private int anInt2625;

	@OriginalMember(owner = "client!fr", name = "o", descriptor = "Lclient!ba;")
	private Class2_Sub5_Sub1 aClass2_Sub5_Sub1_2;

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
	private int anInt2626;

	@OriginalMember(owner = "client!fr", name = "x", descriptor = "Lclient!vf;")
	private Class250 aClass250_1;

	@OriginalMember(owner = "client!fr", name = "z", descriptor = "Lclient!t;")
	private Class91 aClass91_2;

	@OriginalMember(owner = "client!fr", name = "q", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!fr", name = "D", descriptor = "I")
	private int anInt2635 = -1;

	@OriginalMember(owner = "client!fr", name = "C", descriptor = "I")
	private int anInt2634 = -1;

	@OriginalMember(owner = "client!fr", name = "F", descriptor = "I")
	private int anInt2637 = -32768;

	@OriginalMember(owner = "client!fr", name = "B", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
	private int anInt2628;

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
	public final int anInt2619;

	@OriginalMember(owner = "client!fr", name = "y", descriptor = "I")
	public final int anInt2633;

	@OriginalMember(owner = "client!fr", name = "E", descriptor = "I")
	private int anInt2636;

	@OriginalMember(owner = "client!fr", name = "I", descriptor = "B")
	private final byte aByte39;

	@OriginalMember(owner = "client!fr", name = "G", descriptor = "B")
	private final byte aByte38;

	@OriginalMember(owner = "client!fr", name = "u", descriptor = "I")
	public final int anInt2630;

	@OriginalMember(owner = "client!fr", name = "A", descriptor = "Z")
	private final boolean aBoolean201;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!ya;Lclient!jo;IIIIIIZI)V")
	public Class83(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt2628 = arg6;
		this.anInt2619 = arg2;
		this.anInt2633 = arg3;
		this.anInt2636 = arg7;
		this.aByte39 = (byte) arg5;
		this.aBoolean202 = arg8;
		this.aByte38 = (byte) arg4;
		this.anInt2630 = arg1.anInt3648;
		this.aBoolean201 = arg0.method4469() && arg1.aBoolean268 && !this.aBoolean202;
		if (arg9 != -1) {
			this.aBoolean200 = true;
		}
		this.method2047(arg9);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
	public void method2042(@OriginalArg(1) int arg0) {
		this.aBoolean200 = true;
		this.method2047(arg0);
	}

	@OriginalMember(owner = "client!fr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass8_Sub3_3 != null) {
			this.aClass8_Sub3_3.method565();
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BLclient!ya;)V")
	public void method2043(@OriginalArg(1) Class49 arg0) {
		this.method2051(true, true, this.anInt2628, this.anInt2636, arg0, 262144);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)Z")
	public boolean method2044() {
		return this.aBoolean201;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZILclient!ya;IIILclient!t;B)V")
	public void method2045(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class49 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class91 arg6) {
		@Pc(14) Class200[] local14 = arg6.method3290();
		@Pc(17) Class189[] local17 = arg6.method3278();
		if ((this.aClass8_Sub3_3 == null || this.aClass8_Sub3_3.aBoolean35) && (local14 != null || local17 != null)) {
			@Pc(34) Class134 local34 = Static118.aClass165_2.method3799(this.anInt2630);
			if (local34.anIntArray322 != null) {
				local34 = local34.method2969(Static344.aClass108_1);
			}
			if (local34 != null) {
				this.aClass8_Sub3_3 = new Class8_Sub3(Static131.anInt2821);
			}
		}
		if (this.aClass8_Sub3_3 == null) {
			return;
		}
		if (arg0) {
			this.aClass8_Sub3_3.method556(arg2, (long) Static131.anInt2821, local14, local17);
		} else {
			this.aClass8_Sub3_3.method562((long) Static131.anInt2821);
		}
		this.aClass8_Sub3_3.method558(this.aByte38, arg4, arg3, arg5, arg1);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)V")
	private void method2046(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass250_1 == null) {
				if (this.aBoolean200) {
					return;
				}
				this.method2047(-1);
				if (this.aClass250_1 == null) {
					return;
				}
			}
			@Pc(33) int local33 = Static131.anInt2821 - this.anInt2624;
			if (local33 > 100 && this.aClass250_1.anInt7016 > 0) {
				@Pc(50) int local50 = this.aClass250_1.anIntArray592.length - this.aClass250_1.anInt7016;
				while (local50 > this.anInt2626 && local33 > this.aClass250_1.anIntArray594[this.anInt2626]) {
					local33 -= this.aClass250_1.anIntArray594[this.anInt2626];
					this.anInt2626++;
				}
				if (local50 <= this.anInt2626) {
					@Pc(89) int local89 = 0;
					for (@Pc(91) int local91 = local50; local91 < this.aClass250_1.anIntArray592.length; local91++) {
						local89 += this.aClass250_1.anIntArray594[local91];
					}
					local33 %= local89;
				}
				this.anInt2617 = this.anInt2626 + 1;
				if (this.aClass250_1.anIntArray592.length <= this.anInt2617) {
					this.anInt2617 -= this.aClass250_1.anInt7016;
					if (this.anInt2617 < 0 || this.aClass250_1.anIntArray592.length <= this.anInt2617) {
						this.anInt2617 = -1;
					}
				}
			}
			while (this.aClass250_1.anIntArray594[this.anInt2626] < local33) {
				Static131.method2230(arg0, arg1, this.aByte38, false, this.aClass250_1, this.anInt2626);
				local33 -= this.aClass250_1.anIntArray594[this.anInt2626];
				this.anInt2626++;
				if (this.anInt2626 >= this.aClass250_1.anIntArray592.length) {
					this.anInt2626 -= this.aClass250_1.anInt7016;
					if (this.anInt2626 < 0 || this.aClass250_1.anIntArray592.length <= this.anInt2626) {
						this.aClass250_1 = null;
						continue label80;
					}
				}
				this.anInt2617 = this.anInt2626 + 1;
				if (this.anInt2617 >= this.aClass250_1.anIntArray592.length) {
					this.anInt2617 -= this.aClass250_1.anInt7016;
					if (this.anInt2617 < 0 || this.anInt2617 >= this.aClass250_1.anIntArray592.length) {
						this.anInt2617 = -1;
					}
				}
			}
			this.anInt2625 = local33;
			this.anInt2624 = Static131.anInt2821 - local33;
			return;
		}
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)V")
	private void method2047(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class134 local19 = Static118.aClass165_2.method3799(this.anInt2630);
			@Pc(21) Class134 local21 = local19;
			if (local19.anIntArray322 != null) {
				local19 = local19.method2969(Static344.aClass108_1);
			}
			if (local19 == null) {
				return;
			}
			if (local21 == local19) {
				local21 = null;
			}
			if (local19.anIntArray319 != null) {
				if (this.aClass250_1 != null && local19.method2970(this.aClass250_1.anInt7008)) {
					return;
				}
				local7 = local19.method2981();
				if (local19.anInt3648 != this.anInt2635) {
					local9 = local19.aBoolean269;
				}
			} else if (local19.anInt3663 == -1) {
				if (local21 != null && local21.anIntArray319 != null) {
					if (this.aClass250_1 != null && local21.method2970(this.aClass250_1.anInt7008)) {
						return;
					}
					local7 = local21.method2981();
					if (local21.anInt3648 != this.anInt2635) {
						local9 = local21.aBoolean269;
					}
				} else if (local21 != null && local21.anInt3663 != -1 && local21.anInt3648 != this.anInt2635) {
					local9 = local21.aBoolean269;
					local7 = local21.anInt3663;
				}
			} else if (this.anInt2635 != local19.anInt3648) {
				local7 = local19.anInt3663;
				local9 = local19.aBoolean269;
			}
		}
		if (local7 == -1) {
			this.aClass250_1 = null;
			return;
		}
		this.aClass91_2 = null;
		if (this.aClass250_1 == null || local7 != this.aClass250_1.anInt7008) {
			this.aClass250_1 = Static338.aClass12_2.method255(local7);
		} else if (this.aClass250_1.anInt7015 == 0) {
			return;
		}
		if (this.aClass250_1.anIntArray592 == null) {
			this.aClass250_1 = null;
			return;
		}
		if (local9) {
			this.anInt2626 = (int) (Math.random() * (double) this.aClass250_1.anIntArray592.length);
			this.anInt2625 = (int) ((double) this.aClass250_1.anIntArray594[this.anInt2626] * Math.random()) + 1;
		} else {
			this.anInt2625 = 1;
			this.anInt2626 = 0;
		}
		this.anInt2617 = this.anInt2626 + 1;
		if (this.anInt2617 < 0 || this.anInt2617 >= this.aClass250_1.anIntArray592.length) {
			this.anInt2617 = -1;
		}
		this.anInt2624 = Static131.anInt2821 - this.anInt2625;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)I")
	public int method2048() {
		return this.anInt2637;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BZZIILclient!ya;I)Lclient!t;")
	public Class91 method2051(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class49 arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Class134 local11 = Static118.aClass165_2.method3799(this.anInt2630);
		if (local11.anIntArray322 != null) {
			local11 = local11.method2969(Static344.aClass108_1);
		}
		if (local11 == null) {
			this.method2052(arg4);
			this.anInt2635 = -1;
			this.anInt2634 = this.anInt2626;
			return null;
		}
		if (!this.aBoolean200 && local11.anInt3648 != this.anInt2635) {
			this.aClass91_2 = null;
			this.method2047(-1);
		}
		this.method2046(arg2, arg3);
		@Pc(73) boolean local73 = arg0 & this.aBoolean201 & Static12.aClass79_Sub1_1.method3960(Static399.anInt6653) != 0;
		@Pc(121) boolean local121 = local73 & (this.anInt2635 != local11.anInt3648 || (this.anInt2626 != this.anInt2634 || this.aClass250_1 != null && (this.aClass250_1.aBoolean467 || Static133.aBoolean221) && this.anInt2626 != this.anInt2617) && Static12.aClass79_Sub1_1.method3960(Static399.anInt6653) >= 2);
		if (arg1 && !local121) {
			this.anInt2635 = local11.anInt3648;
			this.anInt2634 = this.anInt2626;
			return null;
		}
		if (local121) {
			Static221.method3470(this.aClass2_Sub5_Sub1_2, this.aByte39, this.anInt2628, this.anInt2636, this.aBooleanArray12);
		}
		@Pc(153) Class64 local153 = Static58.aClass64Array1[this.aByte39];
		@Pc(160) Class64 local160;
		if (this.aBoolean202) {
			local160 = Static263.aClass64Array2[0];
		} else {
			local160 = this.aByte39 < 3 ? Static58.aClass64Array1[this.aByte39 + 1] : null;
		}
		@Pc(179) Class91 local179 = null;
		if (this.aClass250_1 != null) {
			if (local121) {
				arg5 |= 0x40000;
			}
			local179 = local11.method2975(this.anInt2619 == 11 ? 10 : this.anInt2619, local153.a(this.anInt2628, this.anInt2636), this.anInt2626, local160, this.anInt2636, this.anInt2619 == 11 ? this.anInt2633 + 4 : this.anInt2633, arg4, arg5, this.anInt2625, this.aClass250_1, this.anInt2628, this.anInt2617, local153);
			if (local179 == null) {
				this.aClass2_Sub5_Sub1_2 = null;
				this.aBooleanArray12 = null;
				this.anInt2637 = 0;
			} else {
				if (local121) {
					if (this.aBooleanArray12 == null) {
						this.aBooleanArray12 = new boolean[4];
					}
					this.aClass2_Sub5_Sub1_2 = local179.fa(this.aClass2_Sub5_Sub1_2);
					Static434.method5668(this.aClass2_Sub5_Sub1_2, this.aByte39, arg2, arg3, this.aBooleanArray12);
				}
				this.anInt2637 = local179.MA();
			}
			this.aClass91_2 = null;
		} else if (this.aClass91_2 != null && arg5 == (this.aClass91_2.P() & arg5) && this.anInt2635 == local11.anInt3648) {
			local179 = this.aClass91_2;
		} else {
			if (this.aClass91_2 != null) {
				arg5 |= this.aClass91_2.P();
			}
			@Pc(255) Class225 local255 = local11.method2984(arg4, local153, this.anInt2619 == 11 ? this.anInt2633 + 4 : this.anInt2633, this.anInt2628, local121, local160, local153.a(this.anInt2628, this.anInt2636), this.anInt2636, arg5, this.anInt2619 == 11 ? 10 : this.anInt2619);
			if (local255 == null) {
				this.anInt2637 = 0;
				this.aClass91_2 = null;
				this.aBooleanArray12 = null;
				this.aClass2_Sub5_Sub1_2 = null;
			} else {
				local179 = local255.aClass91_6;
				this.aClass91_2 = local255.aClass91_6;
				if (local121) {
					this.aBooleanArray12 = null;
					this.aClass2_Sub5_Sub1_2 = local255.aClass2_Sub5_Sub1_6;
					Static434.method5668(this.aClass2_Sub5_Sub1_2, this.aByte39, arg2, arg3, null);
				}
				this.anInt2637 = local179.MA();
			}
		}
		this.anInt2636 = arg3;
		this.anInt2635 = local11.anInt3648;
		this.anInt2634 = this.anInt2626;
		this.anInt2628 = arg2;
		return local179;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(BLclient!ya;)V")
	public void method2052(@OriginalArg(1) Class49 arg0) {
		if (this.aClass2_Sub5_Sub1_2 != null) {
			Static221.method3470(this.aClass2_Sub5_Sub1_2, this.aByte39, this.anInt2628, this.anInt2636, this.aBooleanArray12);
			this.aBooleanArray12 = null;
			this.aClass2_Sub5_Sub1_2 = null;
		}
	}
}

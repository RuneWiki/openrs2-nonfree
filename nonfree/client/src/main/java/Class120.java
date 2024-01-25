import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class120 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	private int anInt3606;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	private int anInt3607;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Lclient!kq;")
	public Class8_Sub6 aClass8_Sub6_4;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "[Z")
	private boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "Lclient!gi;")
	private Class1_Sub4_Sub10 aClass1_Sub4_Sub10_2;

	@OriginalMember(owner = "client!lc", name = "E", descriptor = "Lclient!ge;")
	private Class73 aClass73_3;

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "Lclient!bo;")
	private Class24 aClass24_1;

	@OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
	private int anInt3629;

	@OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
	private int anInt3631;

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
	private int anInt3624 = -32768;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "Z")
	private boolean aBoolean340 = false;

	@OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
	private int anInt3623 = -1;

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
	private int anInt3627 = -1;

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "Z")
	private boolean aBoolean341 = false;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "B")
	private final byte aByte25;

	@OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
	private int anInt3628;

	@OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
	public final int anInt3632;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	public final int anInt3610;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	public final int anInt3613;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
	private int anInt3614;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "B")
	private final byte aByte24;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Z")
	private final boolean aBoolean339;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!uo;Lclient!nd;IIIIIIZI)V")
	public Class120(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.aByte25 = (byte) arg5;
		this.anInt3628 = arg6;
		this.anInt3632 = arg2;
		this.aBoolean340 = arg8;
		this.anInt3610 = arg1.anInt4281;
		this.anInt3613 = arg3;
		this.anInt3614 = arg7;
		this.aByte24 = (byte) arg4;
		this.aBoolean339 = arg0.method2160() && arg1.aBoolean402 && !this.aBoolean340;
		if (arg9 != -1) {
			this.aBoolean341 = true;
		}
		this.method3371(arg9);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)I")
	public int method3365() {
		return this.anInt3624;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!uo;IIZZZ)Lclient!ge;")
	public Class73 method3366(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) Class141 local10 = Static119.method2548(this.anInt3610);
		if (local10.anIntArray391 != null) {
			local10 = local10.method3833();
		}
		if (local10 == null) {
			this.method3367(arg1);
			this.anInt3623 = this.anInt3631;
			this.anInt3627 = -1;
			return null;
		}
		if (!this.aBoolean341 && this.anInt3627 != local10.anInt4281) {
			this.aClass73_3 = null;
			this.method3371(-1);
		}
		this.method3369(arg2, arg3);
		@Pc(67) boolean local67 = arg4 & this.aBoolean339 & Static163.anInt3549 != 0;
		@Pc(112) boolean local112 = local67 & (this.anInt3627 != local10.anInt4281 || (this.anInt3623 != this.anInt3631 || this.aClass24_1 != null && (this.aClass24_1.aBoolean97 || Static159.aBoolean329) && this.anInt3631 != this.anInt3629) && Static163.anInt3549 >= 2);
		if (arg5 && !local112) {
			this.anInt3627 = local10.anInt4281;
			this.anInt3623 = this.anInt3631;
			return null;
		}
		if (local112) {
			Static304.method5121(this.aClass1_Sub4_Sub10_2, this.aByte25, this.anInt3628, this.anInt3614, this.aBooleanArray19);
		}
		@Pc(144) Class53 local144 = Static298.aClass53Array3[this.aByte25];
		@Pc(160) Class53 local160;
		if (this.aBoolean340) {
			local160 = Static190.aClass53Array1[0];
		} else {
			local160 = this.aByte25 < 3 ? Static298.aClass53Array3[this.aByte25 + 1] : null;
		}
		@Pc(168) Class73 local168 = null;
		if (this.aClass24_1 != null) {
			if (local112) {
				arg0 |= 0x20000;
			}
			local168 = local10.method3838(this.aClass24_1, this.anInt3631, this.anInt3607, arg0, local160, local144.method2792(this.anInt3628, this.anInt3614), arg1, this.anInt3628, this.anInt3632 == 11 ? 10 : this.anInt3632, this.anInt3629, this.anInt3614, local144, this.anInt3632 == 11 ? this.anInt3613 + 4 : this.anInt3613);
			if (local168 == null) {
				this.aBooleanArray19 = null;
				this.anInt3624 = 0;
				this.aClass1_Sub4_Sub10_2 = null;
			} else {
				if (local112) {
					if (this.aBooleanArray19 == null) {
						this.aBooleanArray19 = new boolean[4];
					}
					this.aClass1_Sub4_Sub10_2 = local168.method3304(this.aClass1_Sub4_Sub10_2);
					Static75.method1716(this.aClass1_Sub4_Sub10_2, this.aByte25, arg3, arg2, this.aBooleanArray19);
				}
				this.anInt3624 = local168.method3327();
			}
			this.aClass73_3 = null;
		} else if (this.aClass73_3 != null && arg0 == (arg0 & this.aClass73_3.method3298()) && local10.anInt4281 == this.anInt3627) {
			local168 = this.aClass73_3;
		} else {
			if (this.aClass73_3 != null) {
				arg0 |= this.aClass73_3.method3298();
			}
			@Pc(241) Class26 local241 = local10.method3848(local160, this.anInt3632 == 11 ? this.anInt3613 + 4 : this.anInt3613, local144.method2792(this.anInt3628, this.anInt3614), this.anInt3614, this.anInt3628, local144, this.anInt3632 == 11 ? 10 : this.anInt3632, arg1, arg0, local112);
			if (local241 == null) {
				this.aClass1_Sub4_Sub10_2 = null;
				this.anInt3624 = 0;
				this.aBooleanArray19 = null;
				this.aClass73_3 = null;
			} else {
				local168 = local241.aClass73_1;
				this.aClass73_3 = local241.aClass73_1;
				if (local112) {
					this.aClass1_Sub4_Sub10_2 = local241.aClass1_Sub4_Sub10_1;
					this.aBooleanArray19 = null;
					Static75.method1716(this.aClass1_Sub4_Sub10_2, this.aByte25, arg3, arg2, null);
				}
				this.anInt3624 = local168.method3327();
			}
		}
		this.anInt3623 = this.anInt3631;
		this.anInt3627 = local10.anInt4281;
		this.anInt3628 = arg3;
		this.anInt3614 = arg2;
		return local168;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!uo;I)V")
	public void method3367(@OriginalArg(0) Class32 arg0) {
		if (this.aClass1_Sub4_Sub10_2 != null) {
			Static304.method5121(this.aClass1_Sub4_Sub10_2, this.aByte25, this.anInt3628, this.anInt3614, this.aBooleanArray19);
			this.aClass1_Sub4_Sub10_2 = null;
			this.aBooleanArray19 = null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass8_Sub6_4 != null) {
			this.aClass8_Sub6_4.method3280();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V")
	private void method3369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass24_1 == null) {
				if (this.aBoolean341) {
					return;
				}
				this.method3371(-1);
				if (this.aClass24_1 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static5.anInt208 - this.anInt3606;
			if (local30 > 100 && this.aClass24_1.anInt1034 > 0) {
				@Pc(46) int local46 = this.aClass24_1.anIntArray90.length - this.aClass24_1.anInt1034;
				while (local46 > this.anInt3631 && local30 > this.aClass24_1.anIntArray89[this.anInt3631]) {
					local30 -= this.aClass24_1.anIntArray89[this.anInt3631];
					this.anInt3631++;
				}
				if (local46 <= this.anInt3631) {
					@Pc(85) int local85 = 0;
					for (@Pc(87) int local87 = local46; local87 < this.aClass24_1.anIntArray90.length; local87++) {
						local85 += this.aClass24_1.anIntArray89[local87];
					}
					local30 %= local85;
				}
				this.anInt3629 = this.anInt3631 + 1;
				if (this.anInt3629 >= this.aClass24_1.anIntArray90.length) {
					this.anInt3629 -= this.aClass24_1.anInt1034;
					if (this.anInt3629 < 0 || this.aClass24_1.anIntArray90.length <= this.anInt3629) {
						this.anInt3629 = -1;
					}
				}
			}
			while (local30 > this.aClass24_1.anIntArray89[this.anInt3631]) {
				Static318.method5216(arg1, arg0, false, this.aClass24_1, this.anInt3631);
				local30 -= this.aClass24_1.anIntArray89[this.anInt3631];
				this.anInt3631++;
				if (this.anInt3631 >= this.aClass24_1.anIntArray90.length) {
					this.anInt3631 -= this.aClass24_1.anInt1034;
					if (this.anInt3631 < 0 || this.anInt3631 >= this.aClass24_1.anIntArray90.length) {
						this.aClass24_1 = null;
						continue label80;
					}
				}
				this.anInt3629 = this.anInt3631 + 1;
				if (this.aClass24_1.anIntArray90.length <= this.anInt3629) {
					this.anInt3629 -= this.aClass24_1.anInt1034;
					if (this.anInt3629 < 0 || this.anInt3629 >= this.aClass24_1.anIntArray90.length) {
						this.anInt3629 = -1;
					}
				}
			}
			this.anInt3607 = local30;
			this.anInt3606 = Static5.anInt208 - local30;
			return;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!uo;)V")
	public void method3370(@OriginalArg(1) Class32 arg0) {
		this.method3366(131072, arg0, this.anInt3614, this.anInt3628, true, true);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)V")
	private void method3371(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class141 local18 = Static119.method2548(this.anInt3610);
			@Pc(20) Class141 local20 = local18;
			if (local18.anIntArray391 != null) {
				local18 = local18.method3833();
			}
			if (local18 == null) {
				return;
			}
			if (local18 == local20) {
				local20 = null;
			}
			if (local18.anIntArray392 != null) {
				if (this.aClass24_1 != null && local18.method3845(this.aClass24_1.anInt1041)) {
					return;
				}
				local7 = local18.method3834();
				if (this.anInt3627 != local18.anInt4281) {
					local9 = local18.aBoolean405;
				}
			} else if (local18.anInt4280 == -1) {
				if (local20 != null && local20.anIntArray392 != null) {
					if (this.aClass24_1 != null && local20.method3845(this.aClass24_1.anInt1041)) {
						return;
					}
					local7 = local20.method3834();
					if (this.anInt3627 != local20.anInt4281) {
						local9 = local20.aBoolean405;
					}
				} else if (local20 != null && local20.anInt4280 != -1 && this.anInt3627 != local20.anInt4281) {
					local9 = local20.aBoolean405;
					local7 = local20.anInt4280;
				}
			} else if (local18.anInt4281 != this.anInt3627) {
				local9 = local18.aBoolean405;
				local7 = local18.anInt4280;
			}
		}
		if (local7 == -1) {
			this.aClass24_1 = null;
			return;
		}
		this.aClass73_3 = null;
		if (this.aClass24_1 == null || local7 != this.aClass24_1.anInt1041) {
			this.aClass24_1 = Static110.method5411(local7);
		} else if (this.aClass24_1.anInt1037 == 0) {
			return;
		}
		if (this.aClass24_1.anIntArray90 == null) {
			this.aClass24_1 = null;
			return;
		}
		if (local9) {
			this.anInt3631 = (int) ((double) this.aClass24_1.anIntArray90.length * Math.random());
			this.anInt3607 = (int) (Math.random() * (double) this.aClass24_1.anIntArray89[this.anInt3631]) + 1;
		} else {
			this.anInt3631 = 0;
			this.anInt3607 = 1;
		}
		this.anInt3629 = this.anInt3631 + 1;
		if (this.anInt3629 < 0 || this.aClass24_1.anIntArray90.length <= this.anInt3629) {
			this.anInt3629 = -1;
		}
		this.anInt3606 = Static5.anInt208 - this.anInt3607;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
	public void method3372(@OriginalArg(1) int arg0) {
		this.aBoolean341 = true;
		this.method3371(arg0);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLclient!uo;Lclient!ge;IIZII)V")
	public void method3374(@OriginalArg(1) Class32 arg0, @OriginalArg(2) Class73 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) Class206[] local6 = arg1.method3330();
		@Pc(9) Class115[] local9 = arg1.method3325();
		if ((this.aClass8_Sub6_4 == null || this.aClass8_Sub6_4.aBoolean331) && (local6 != null || local9 != null)) {
			@Pc(25) Class141 local25 = Static119.method2548(this.anInt3610);
			if (local25.anIntArray391 != null) {
				local25 = local25.method3833();
			}
			if (local25 != null) {
				this.aClass8_Sub6_4 = new Class8_Sub6(Static5.anInt208);
			}
		}
		if (this.aClass8_Sub6_4 == null) {
			return;
		}
		if (arg4) {
			this.aClass8_Sub6_4.method3271(arg0, (long) Static5.anInt208, local6, local9);
		} else {
			this.aClass8_Sub6_4.method3277((long) Static5.anInt208);
		}
		this.aClass8_Sub6_4.method3281(this.aByte24, arg6, arg3, arg2, arg5);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z")
	public boolean method3375() {
		return this.aBoolean339;
	}
}

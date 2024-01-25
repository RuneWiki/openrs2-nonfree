import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class151 {

	@OriginalMember(owner = "client!op", name = "d", descriptor = "I")
	private int anInt5102;

	@OriginalMember(owner = "client!op", name = "f", descriptor = "Lclient!mk;")
	public Class57_Sub6 aClass57_Sub6_5;

	@OriginalMember(owner = "client!op", name = "l", descriptor = "Lclient!gr;")
	private Class84 aClass84_2;

	@OriginalMember(owner = "client!op", name = "m", descriptor = "I")
	private int anInt5108;

	@OriginalMember(owner = "client!op", name = "n", descriptor = "I")
	private int anInt5109;

	@OriginalMember(owner = "client!op", name = "A", descriptor = "Lclient!qn;")
	private Class2_Sub9_Sub16 aClass2_Sub9_Sub16_3;

	@OriginalMember(owner = "client!op", name = "E", descriptor = "[Z")
	private boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!op", name = "G", descriptor = "Lclient!wp;")
	private Class49 aClass49_4;

	@OriginalMember(owner = "client!op", name = "I", descriptor = "I")
	private int anInt5122;

	@OriginalMember(owner = "client!op", name = "u", descriptor = "I")
	private int anInt5114 = -1;

	@OriginalMember(owner = "client!op", name = "i", descriptor = "I")
	private int anInt5105 = -32768;

	@OriginalMember(owner = "client!op", name = "p", descriptor = "Z")
	private boolean aBoolean445 = false;

	@OriginalMember(owner = "client!op", name = "q", descriptor = "I")
	private int anInt5111 = -1;

	@OriginalMember(owner = "client!op", name = "g", descriptor = "Z")
	private boolean aBoolean444 = false;

	@OriginalMember(owner = "client!op", name = "b", descriptor = "I")
	public final int anInt5101;

	@OriginalMember(owner = "client!op", name = "o", descriptor = "I")
	public final int anInt5110;

	@OriginalMember(owner = "client!op", name = "y", descriptor = "B")
	private final byte aByte56;

	@OriginalMember(owner = "client!op", name = "v", descriptor = "I")
	public final int anInt5115;

	@OriginalMember(owner = "client!op", name = "x", descriptor = "I")
	private int anInt5117;

	@OriginalMember(owner = "client!op", name = "r", descriptor = "B")
	private final byte aByte55;

	@OriginalMember(owner = "client!op", name = "h", descriptor = "I")
	private int anInt5104;

	@OriginalMember(owner = "client!op", name = "F", descriptor = "Z")
	private final boolean aBoolean446;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!dr;Lclient!fq;IIIIIIZI)V")
	public Class151(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt5101 = arg2;
		this.anInt5110 = arg1.anInt2071;
		this.aByte56 = (byte) arg4;
		this.anInt5115 = arg3;
		this.anInt5117 = arg7;
		this.aByte55 = (byte) arg5;
		this.aBoolean444 = arg8;
		this.anInt5104 = arg6;
		this.aBoolean446 = arg0.method3645() && arg1.aBoolean194 && !this.aBoolean444;
		if (arg9 != -1) {
			this.aBoolean445 = true;
		}
		this.method4339(arg9);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIILclient!wp;BILclient!dr;Z)V")
	public void method4330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class49 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5, @OriginalArg(7) boolean arg6) {
		@Pc(14) Class197[] local14 = arg3.method5828();
		@Pc(17) Class136[] local17 = arg3.method5832();
		if ((this.aClass57_Sub6_5 == null || this.aClass57_Sub6_5.aBoolean379) && (local14 != null || local17 != null)) {
			@Pc(33) Class74 local33 = Static228.method4210(this.anInt5110);
			if (local33.anIntArray161 != null) {
				local33 = local33.method1997();
			}
			if (local33 != null) {
				this.aClass57_Sub6_5 = new Class57_Sub6(Static6.anInt91);
			}
		}
		if (this.aClass57_Sub6_5 == null) {
			return;
		}
		if (arg6) {
			this.aClass57_Sub6_5.method3854(arg5, (long) Static6.anInt91, local14, local17);
		} else {
			this.aClass57_Sub6_5.method3848((long) Static6.anInt91);
		}
		this.aClass57_Sub6_5.method3843(this.aByte56, arg0, arg1, arg2, arg4);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IB)V")
	public void method4332(@OriginalArg(0) int arg0) {
		this.aBoolean445 = true;
		this.method4339(arg0);
	}

	@OriginalMember(owner = "client!op", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass57_Sub6_5 != null) {
			this.aClass57_Sub6_5.method3845();
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)Z")
	public boolean method4333() {
		return this.aBoolean446;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(III)V")
	private void method4334(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass84_2 == null) {
				if (this.aBoolean445) {
					return;
				}
				this.method4339(-1);
				if (this.aClass84_2 == null) {
					return;
				}
			}
			@Pc(34) int local34 = Static6.anInt91 - this.anInt5109;
			if (local34 > 100 && this.aClass84_2.anInt2452 > 0) {
				@Pc(53) int local53 = this.aClass84_2.anIntArray197.length - this.aClass84_2.anInt2452;
				while (this.anInt5108 < local53 && this.aClass84_2.anIntArray198[this.anInt5108] < local34) {
					local34 -= this.aClass84_2.anIntArray198[this.anInt5108];
					this.anInt5108++;
				}
				if (local53 <= this.anInt5108) {
					@Pc(96) int local96 = 0;
					for (@Pc(98) int local98 = local53; local98 < this.aClass84_2.anIntArray197.length; local98++) {
						local96 += this.aClass84_2.anIntArray198[local98];
					}
					local34 %= local96;
				}
				this.anInt5102 = this.anInt5108 + 1;
				if (this.anInt5102 >= this.aClass84_2.anIntArray197.length) {
					this.anInt5102 -= this.aClass84_2.anInt2452;
					if (this.anInt5102 < 0 || this.aClass84_2.anIntArray197.length <= this.anInt5102) {
						this.anInt5102 = -1;
					}
				}
			}
			while (this.aClass84_2.anIntArray198[this.anInt5108] < local34) {
				Static41.method4705(false, this.anInt5108, arg0, arg1, this.aClass84_2, this.aByte56);
				local34 -= this.aClass84_2.anIntArray198[this.anInt5108];
				this.anInt5108++;
				if (this.aClass84_2.anIntArray197.length <= this.anInt5108) {
					this.anInt5108 -= this.aClass84_2.anInt2452;
					if (this.anInt5108 < 0 || this.anInt5108 >= this.aClass84_2.anIntArray197.length) {
						this.aClass84_2 = null;
						continue label80;
					}
				}
				this.anInt5102 = this.anInt5108 + 1;
				if (this.anInt5102 >= this.aClass84_2.anIntArray197.length) {
					this.anInt5102 -= this.aClass84_2.anInt2452;
					if (this.anInt5102 < 0 || this.aClass84_2.anIntArray197.length <= this.anInt5102) {
						this.anInt5102 = -1;
					}
				}
			}
			this.anInt5109 = Static6.anInt91 - local34;
			this.anInt5122 = local34;
			return;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!dr;B)V")
	public void method4335(@OriginalArg(0) Class37 arg0) {
		this.method4337(this.anInt5117, true, true, arg0, 131072, this.anInt5104);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IZZLclient!dr;III)Lclient!wp;")
	public Class49 method4337(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class37 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) Class74 local10 = Static228.method4210(this.anInt5110);
		if (local10.anIntArray161 != null) {
			local10 = local10.method1997();
		}
		if (local10 == null) {
			this.method4340(arg3);
			this.anInt5114 = -1;
			this.anInt5111 = this.anInt5108;
			return null;
		}
		if (!this.aBoolean445 && this.anInt5114 != local10.anInt2071) {
			this.aClass49_4 = null;
			this.method4339(-1);
		}
		this.method4334(arg0, arg5);
		@Pc(63) boolean local63 = arg2 & Static222.anInt6836 != 0 & this.aBoolean446;
		@Pc(104) boolean local104 = local63 & (this.anInt5114 != local10.anInt2071 || (this.anInt5111 != this.anInt5108 || this.aClass84_2 != null && (this.aClass84_2.aBoolean234 || Static263.aBoolean483) && this.anInt5102 != this.anInt5108) && Static222.anInt6836 >= 2);
		if (arg1 && !local104) {
			this.anInt5111 = this.anInt5108;
			this.anInt5114 = local10.anInt2071;
			return null;
		}
		if (local104) {
			Static101.method2012(this.aClass2_Sub9_Sub16_3, this.aByte55, this.anInt5104, this.anInt5117, this.aBooleanArray18);
		}
		@Pc(136) Class105 local136 = Static9.aClass105Array1[this.aByte55];
		@Pc(154) Class105 local154;
		if (this.aBoolean444) {
			local154 = Static101.aClass105Array2[0];
		} else {
			local154 = this.aByte55 < 3 ? Static9.aClass105Array1[this.aByte55 + 1] : null;
		}
		@Pc(162) Class49 local162 = null;
		if (this.aClass84_2 != null) {
			if (local104) {
				arg4 |= 0x20000;
			}
			local162 = local10.method2003(this.anInt5104, this.anInt5117, arg3, local136.method4452(this.anInt5104, this.anInt5117), local136, this.anInt5122, this.anInt5102, this.anInt5101 == 11 ? this.anInt5115 + 4 : this.anInt5115, arg4, this.anInt5101 == 11 ? 10 : this.anInt5101, this.anInt5108, local154, this.aClass84_2);
			if (local162 == null) {
				this.anInt5105 = 0;
				this.aClass2_Sub9_Sub16_3 = null;
				this.aBooleanArray18 = null;
			} else {
				if (local104) {
					if (this.aBooleanArray18 == null) {
						this.aBooleanArray18 = new boolean[4];
					}
					this.aClass2_Sub9_Sub16_3 = local162.method5824(this.aClass2_Sub9_Sub16_3);
					Static300.method5055(this.aClass2_Sub9_Sub16_3, this.aByte55, arg5, arg0, this.aBooleanArray18);
				}
				this.anInt5105 = local162.method5842();
			}
			this.aClass49_4 = null;
		} else if (this.aClass49_4 != null && (this.aClass49_4.method5820() & arg4) == arg4 && this.anInt5114 == local10.anInt2071) {
			local162 = this.aClass49_4;
		} else {
			if (this.aClass49_4 != null) {
				arg4 |= this.aClass49_4.method5820();
			}
			@Pc(335) Class206 local335 = local10.method1993(local154, this.anInt5117, this.anInt5101 == 11 ? this.anInt5115 + 4 : this.anInt5115, this.anInt5101 == 11 ? 10 : this.anInt5101, local136, arg4, local136.method4452(this.anInt5104, this.anInt5117), arg3, this.anInt5104, local104);
			if (local335 == null) {
				this.aClass49_4 = null;
				this.anInt5105 = 0;
				this.aClass2_Sub9_Sub16_3 = null;
				this.aBooleanArray18 = null;
			} else {
				local162 = local335.aClass49_7;
				this.aClass49_4 = local335.aClass49_7;
				if (local104) {
					this.aClass2_Sub9_Sub16_3 = local335.aClass2_Sub9_Sub16_6;
					this.aBooleanArray18 = null;
					Static300.method5055(this.aClass2_Sub9_Sub16_3, this.aByte55, arg5, arg0, null);
				}
				this.anInt5105 = local162.method5842();
			}
		}
		this.anInt5117 = arg0;
		this.anInt5114 = local10.anInt2071;
		this.anInt5104 = arg5;
		this.anInt5111 = this.anInt5108;
		return local162;
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)I")
	public int method4338() {
		return this.anInt5105;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II)V")
	private void method4339(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = arg0;
		@Pc(13) boolean local13 = false;
		if (arg0 == -1) {
			@Pc(22) Class74 local22 = Static228.method4210(this.anInt5110);
			@Pc(24) Class74 local24 = local22;
			if (local22.anIntArray161 != null) {
				local22 = local22.method1997();
			}
			if (local22 == null) {
				return;
			}
			if (local24 == local22) {
				local24 = null;
			}
			if (local22.anIntArray160 != null) {
				if (this.aClass84_2 != null && local22.method2007(this.aClass84_2.anInt2448)) {
					return;
				}
				local11 = local22.method1996();
				if (local22.anInt2071 != this.anInt5114) {
					local13 = local22.aBoolean191;
				}
			} else if (local22.anInt2050 == -1) {
				if (local24 != null && local24.anIntArray160 != null) {
					if (this.aClass84_2 != null && local24.method2007(this.aClass84_2.anInt2448)) {
						return;
					}
					local11 = local24.method1996();
					if (this.anInt5114 != local24.anInt2071) {
						local13 = local24.aBoolean191;
					}
				} else if (local24 != null && local24.anInt2050 != -1 && this.anInt5114 != local24.anInt2071) {
					local13 = local24.aBoolean191;
					local11 = local24.anInt2050;
				}
			} else if (this.anInt5114 != local22.anInt2071) {
				local11 = local22.anInt2050;
				local13 = local22.aBoolean191;
			}
		}
		if (local11 == -1) {
			this.aClass84_2 = null;
			return;
		}
		this.aClass49_4 = null;
		if (this.aClass84_2 == null || local11 != this.aClass84_2.anInt2448) {
			this.aClass84_2 = Static91.method1822(local11);
		} else if (this.aClass84_2.anInt2456 == 0) {
			return;
		}
		if (this.aClass84_2.anIntArray197 == null) {
			this.aClass84_2 = null;
			return;
		}
		if (local13) {
			this.anInt5108 = (int) (Math.random() * (double) this.aClass84_2.anIntArray197.length);
			this.anInt5122 = (int) (Math.random() * (double) this.aClass84_2.anIntArray198[this.anInt5108]) + 1;
		} else {
			this.anInt5122 = 1;
			this.anInt5108 = 0;
		}
		this.anInt5102 = this.anInt5108 + 1;
		if (this.anInt5102 < 0 || this.anInt5102 >= this.aClass84_2.anIntArray197.length) {
			this.anInt5102 = -1;
		}
		this.anInt5109 = Static6.anInt91 - this.anInt5122;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLclient!dr;)V")
	public void method4340(@OriginalArg(1) Class37 arg0) {
		if (this.aClass2_Sub9_Sub16_3 != null) {
			Static101.method2012(this.aClass2_Sub9_Sub16_3, this.aByte55, this.anInt5104, this.anInt5117, this.aBooleanArray18);
			this.aClass2_Sub9_Sub16_3 = null;
			this.aBooleanArray18 = null;
		}
	}
}

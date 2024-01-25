import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class205 {

	@OriginalMember(owner = "client!km", name = "b", descriptor = "[Z")
	private boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "Lclient!ka;")
	private Class114 aClass114_3;

	@OriginalMember(owner = "client!km", name = "y", descriptor = "I")
	private int anInt5566;

	@OriginalMember(owner = "client!km", name = "z", descriptor = "Lclient!pi;")
	private Class272 aClass272_1;

	@OriginalMember(owner = "client!km", name = "A", descriptor = "I")
	private int anInt5567;

	@OriginalMember(owner = "client!km", name = "B", descriptor = "Lclient!qo;")
	public Class41_Sub7 aClass41_Sub7_4;

	@OriginalMember(owner = "client!km", name = "C", descriptor = "I")
	private int anInt5568;

	@OriginalMember(owner = "client!km", name = "F", descriptor = "Lclient!co;")
	private Class65 aClass65_2;

	@OriginalMember(owner = "client!km", name = "H", descriptor = "Lclient!r;")
	private Class5_Sub2_Sub7 aClass5_Sub2_Sub7_3;

	@OriginalMember(owner = "client!km", name = "K", descriptor = "I")
	private int anInt5573;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "I")
	private int anInt5550 = -1;

	@OriginalMember(owner = "client!km", name = "o", descriptor = "I")
	private int anInt5557 = -1;

	@OriginalMember(owner = "client!km", name = "h", descriptor = "Z")
	private boolean aBoolean394 = false;

	@OriginalMember(owner = "client!km", name = "w", descriptor = "Z")
	private boolean aBoolean395 = false;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "I")
	private int anInt5551 = 0;

	@OriginalMember(owner = "client!km", name = "D", descriptor = "I")
	private int anInt5569 = -1;

	@OriginalMember(owner = "client!km", name = "i", descriptor = "I")
	private int anInt5552 = 0;

	@OriginalMember(owner = "client!km", name = "t", descriptor = "I")
	public final int anInt5562;

	@OriginalMember(owner = "client!km", name = "I", descriptor = "I")
	public final int anInt5571;

	@OriginalMember(owner = "client!km", name = "c", descriptor = "B")
	private final byte aByte75;

	@OriginalMember(owner = "client!km", name = "G", descriptor = "Lclient!sf;")
	private final Class41_Sub1 aClass41_Sub1_15;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "B")
	private final byte aByte74;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "I")
	public final int anInt5549;

	@OriginalMember(owner = "client!km", name = "L", descriptor = "Z")
	private final boolean aBoolean396;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!ha;Lclient!dja;IIIILclient!sf;ZI)V")
	public Class205(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class41_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.anInt5562 = arg3;
		this.anInt5571 = arg1.anInt1883;
		this.aByte75 = (byte) arg5;
		this.aBoolean394 = arg7;
		this.aClass41_Sub1_15 = arg6;
		this.aByte74 = (byte) arg4;
		this.anInt5549 = arg2;
		this.aBoolean396 = arg0.method6206() && arg1.aBoolean140 && !this.aBoolean394;
		if (arg8 != -1) {
			this.aBoolean395 = true;
		}
		this.method4797(arg8);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZLclient!ha;IZI)Lclient!ka;")
	public Class114 method4788(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(9) Class81 local9 = Static400.aClass140_4.method2839(this.anInt5571);
		if (local9.anIntArray100 != null) {
			local9 = local9.method1760(Static413.aClass63_1);
		}
		if (local9 == null) {
			this.method4790(arg1);
			this.anInt5550 = -1;
			this.anInt5569 = -1;
			this.anInt5557 = -1;
			return null;
		}
		if (!this.aBoolean395 && local9.anInt1883 != this.anInt5550) {
			this.aClass114_3 = null;
			this.method4797(-1);
		}
		this.method4798(this.aClass41_Sub1_15);
		if (arg3) {
			@Pc(77) boolean local77 = arg3 & this.aBoolean396 & Static655.aClass5_Sub36_29.aClass2_Sub5_1.method3269() != 0;
			arg3 = local77 & (local9.anInt1883 != this.anInt5557 || this.aClass65_2 != null && Static655.aClass5_Sub36_29.aClass2_Sub5_1.method3269() >= 2 && (this.anInt5573 != this.anInt5569 || (this.aClass65_2.aBoolean105 || Static67.aBoolean65) && this.anInt5573 != this.anInt5567));
		}
		if (arg0 && !arg3) {
			this.anInt5550 = local9.anInt1883;
			return null;
		}
		if (arg3) {
			Static465.method6890(this.aClass5_Sub2_Sub7_3, this.aByte75, this.aClass41_Sub1_15.anInt10366, this.aClass41_Sub1_15.anInt10367, this.aBooleanArray12);
			this.anInt5557 = -1;
			this.anInt5569 = -1;
		}
		@Pc(151) Class88 local151 = Static298.aClass88Array3[this.aByte75];
		@Pc(163) Class88 local163;
		if (this.aBoolean394) {
			local163 = Static230.aClass88Array2[0];
		} else {
			local163 = this.aByte75 < 3 ? Static298.aClass88Array3[this.aByte75 + 1] : null;
		}
		@Pc(179) Class114 local179 = null;
		if (this.aClass65_2 != null) {
			if (arg3) {
				arg2 |= 0x40000;
			}
			local179 = local9.method1754(local151.method8753(this.aClass41_Sub1_15.anInt10366, this.aClass41_Sub1_15.anInt10367), this.aClass41_Sub1_15.anInt10366, this.anInt5549 == 11 ? this.anInt5562 + 4 : this.anInt5562, local151, this.aClass272_1, this.anInt5573, this.anInt5549 == 11 ? 10 : this.anInt5549, this.aClass65_2, this.aClass41_Sub1_15.anInt10367, this.anInt5567, local163, this.anInt5568, arg2, arg1);
			if (local179 == null) {
				this.anInt5551 = 0;
				this.anInt5552 = 0;
				this.aClass5_Sub2_Sub7_3 = null;
				this.aBooleanArray12 = null;
			} else {
				if (arg3) {
					if (this.aBooleanArray12 == null) {
						this.aBooleanArray12 = new boolean[4];
					}
					this.aClass5_Sub2_Sub7_3 = local179.ba(this.aClass5_Sub2_Sub7_3);
					Static92.method1426(this.aClass5_Sub2_Sub7_3, this.aByte75, this.aClass41_Sub1_15.anInt10366, this.aClass41_Sub1_15.anInt10367, this.aBooleanArray12);
					this.anInt5569 = this.anInt5573;
					this.anInt5557 = local9.anInt1883;
				}
				this.anInt5552 = local179.fa();
				this.anInt5551 = local179.ma();
			}
			this.aClass114_3 = null;
		} else if (this.aClass114_3 != null && (arg2 & this.aClass114_3.ua()) == arg2 && this.anInt5550 == local9.anInt1883) {
			local179 = this.aClass114_3;
		} else {
			if (this.aClass114_3 != null) {
				arg2 |= this.aClass114_3.ua();
			}
			@Pc(379) Class353 local379 = local9.method1752(this.aClass41_Sub1_15.anInt10366, this.anInt5549 == 11 ? 10 : this.anInt5549, arg2, this.aClass272_1, this.aClass41_Sub1_15.anInt10367, arg3, this.anInt5549 == 11 ? this.anInt5562 + 4 : this.anInt5562, local163, local151, local151.method8753(this.aClass41_Sub1_15.anInt10366, this.aClass41_Sub1_15.anInt10367), arg1);
			if (local379 == null) {
				this.aClass114_3 = null;
				this.aClass5_Sub2_Sub7_3 = null;
				this.anInt5552 = 0;
				this.aBooleanArray12 = null;
				this.anInt5551 = 0;
			} else {
				local179 = local379.aClass114_6;
				this.aClass114_3 = local379.aClass114_6;
				if (arg3) {
					this.aClass5_Sub2_Sub7_3 = local379.aClass5_Sub2_Sub7_5;
					this.aBooleanArray12 = null;
					Static92.method1426(this.aClass5_Sub2_Sub7_3, this.aByte75, this.aClass41_Sub1_15.anInt10366, this.aClass41_Sub1_15.anInt10367, (boolean[]) null);
					this.anInt5557 = local9.anInt1883;
					this.anInt5569 = -1;
				}
				this.anInt5552 = local179.fa();
				this.anInt5551 = local179.ma();
			}
		}
		this.anInt5550 = local9.anInt1883;
		return local179;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)V")
	public void method4789(@OriginalArg(0) int arg0) {
		this.aBoolean395 = true;
		this.method4797(arg0);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BLclient!ha;)V")
	public void method4790(@OriginalArg(1) Class143 arg0) {
		if (this.aClass5_Sub2_Sub7_3 != null) {
			Static465.method6890(this.aClass5_Sub2_Sub7_3, this.aByte75, this.aClass41_Sub1_15.anInt10366, this.aClass41_Sub1_15.anInt10367, this.aBooleanArray12);
			this.aBooleanArray12 = null;
			this.aClass5_Sub2_Sub7_3 = null;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)Z")
	public boolean method4793() {
		return this.aBoolean396;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!pi;I)V")
	public void method4794(@OriginalArg(0) Class272 arg0) {
		this.aClass114_3 = null;
		this.aClass272_1 = arg0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!ha;B)V")
	public void method4795(@OriginalArg(0) Class143 arg0) {
		this.method4788(true, arg0, 262144, true);
	}

	@OriginalMember(owner = "client!km", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass41_Sub7_4 != null) {
			this.aClass41_Sub7_4.method7088();
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIILclient!ha;Lclient!ka;Lclient!eh;ZI)V")
	public void method4796(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class143 arg3, @OriginalArg(5) Class114 arg4, @OriginalArg(6) Class56 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class244[] local6 = arg4.method8790();
		@Pc(9) Class303[] local9 = arg4.method8806();
		if ((this.aClass41_Sub7_4 == null || this.aClass41_Sub7_4.aBoolean596) && (local6 != null || local9 != null)) {
			@Pc(34) Class81 local34 = Static400.aClass140_4.method2839(this.anInt5571);
			if (local34.anIntArray100 != null) {
				local34 = local34.method1760(Static413.aClass63_1);
			}
			if (local34 != null) {
				this.aClass41_Sub7_4 = Static485.method7087(Static421.anInt7434, true);
			}
		}
		if (this.aClass41_Sub7_4 == null) {
			return;
		}
		arg4.method8811(arg5);
		if (arg6) {
			this.aClass41_Sub7_4.method7092(arg3, (long) Static421.anInt7434, local6, local9);
		} else {
			this.aClass41_Sub7_4.method7090((long) Static421.anInt7434);
		}
		this.aClass41_Sub7_4.method7078(this.aByte74, arg2, arg7, arg0, arg1);
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(II)V")
	private void method4797(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0;
		@Pc(7) boolean local7 = false;
		if (arg0 == -1) {
			@Pc(18) Class81 local18 = Static400.aClass140_4.method2839(this.anInt5571);
			@Pc(20) Class81 local20 = local18;
			if (local18.anIntArray100 != null) {
				local18 = local18.method1760(Static413.aClass63_1);
			}
			if (local18 == null) {
				return;
			}
			if (local20 == local18) {
				local20 = null;
			}
			if (local18.anIntArray99 != null) {
				if (this.aClass65_2 != null && local18.method1749(this.aClass65_2.anInt1431)) {
					return;
				}
				local5 = local18.method1761();
				if (local18.anInt1883 != this.anInt5550) {
					local7 = local18.aBoolean138;
				}
			} else if (local18.anInt1909 == -1) {
				if (local20 != null && local20.anIntArray99 != null) {
					if (this.aClass65_2 != null && local20.method1749(this.aClass65_2.anInt1431)) {
						return;
					}
					local5 = local20.method1761();
					if (local20.anInt1883 != this.anInt5550) {
						local7 = local20.aBoolean138;
					}
				} else if (local20 != null && local20.anInt1909 != -1 && local20.anInt1883 != this.anInt5550) {
					local5 = local20.anInt1909;
					local7 = local20.aBoolean138;
				}
			} else if (this.anInt5550 != local18.anInt1883) {
				local5 = local18.anInt1909;
				local7 = local18.aBoolean138;
			}
		}
		if (local5 == -1) {
			this.aClass65_2 = null;
			return;
		}
		this.aClass114_3 = null;
		if (this.aClass65_2 == null || local5 != this.aClass65_2.anInt1431) {
			this.aClass65_2 = Static459.aClass128_2.method2686(local5);
		} else if (this.aClass65_2.anInt1425 == 0) {
			return;
		}
		if (this.aClass65_2.anIntArray75 == null) {
			this.aClass65_2 = null;
			return;
		}
		if (local7) {
			this.anInt5573 = (int) ((double) this.aClass65_2.anIntArray75.length * Math.random());
			this.anInt5568 = (int) ((double) this.aClass65_2.anIntArray71[this.anInt5573] * Math.random()) + 1;
		} else {
			this.anInt5573 = 0;
			this.anInt5568 = 1;
		}
		this.anInt5567 = this.anInt5573 + 1;
		if (this.anInt5567 < 0 || this.aClass65_2.anIntArray75.length <= this.anInt5567) {
			this.anInt5567 = -1;
		}
		this.anInt5566 = Static421.anInt7434 - this.anInt5568;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!sf;)V")
	private void method4798(@OriginalArg(1) Class41_Sub1 arg0) {
		label80: while (true) {
			if (this.aClass65_2 == null) {
				if (this.aBoolean395) {
					return;
				}
				this.method4797(-1);
				if (this.aClass65_2 == null) {
					return;
				}
			}
			@Pc(29) int local29 = Static421.anInt7434 - this.anInt5566;
			if (local29 > 100 && this.aClass65_2.anInt1432 > 0) {
				@Pc(46) int local46 = this.aClass65_2.anIntArray75.length - this.aClass65_2.anInt1432;
				while (local46 > this.anInt5573 && this.aClass65_2.anIntArray71[this.anInt5573] < local29) {
					local29 -= this.aClass65_2.anIntArray71[this.anInt5573];
					this.anInt5573++;
				}
				if (local46 <= this.anInt5573) {
					@Pc(84) int local84 = 0;
					for (@Pc(86) int local86 = local46; local86 < this.aClass65_2.anIntArray75.length; local86++) {
						local84 += this.aClass65_2.anIntArray71[local86];
					}
					local29 %= local84;
				}
				this.anInt5567 = this.anInt5573 + 1;
				if (this.anInt5567 >= this.aClass65_2.anIntArray75.length) {
					this.anInt5567 -= this.aClass65_2.anInt1432;
					if (this.anInt5567 < 0 || this.anInt5567 >= this.aClass65_2.anIntArray75.length) {
						this.anInt5567 = -1;
					}
				}
			}
			while (local29 > this.aClass65_2.anIntArray71[this.anInt5573]) {
				Static119.method1899(this.anInt5573, arg0, this.aClass65_2);
				local29 -= this.aClass65_2.anIntArray71[this.anInt5573];
				this.anInt5573++;
				if (this.anInt5573 >= this.aClass65_2.anIntArray75.length) {
					this.anInt5573 -= this.aClass65_2.anInt1432;
					if (this.anInt5573 < 0 || this.aClass65_2.anIntArray75.length <= this.anInt5573) {
						this.aClass65_2 = null;
						continue label80;
					}
				}
				this.anInt5567 = this.anInt5573 + 1;
				if (this.anInt5567 >= this.aClass65_2.anIntArray75.length) {
					this.anInt5567 -= this.aClass65_2.anInt1432;
					if (this.anInt5567 < 0 || this.anInt5567 >= this.aClass65_2.anIntArray75.length) {
						this.anInt5567 = -1;
					}
				}
			}
			this.anInt5568 = local29;
			this.anInt5566 = Static421.anInt7434 - local29;
			return;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)I")
	public int method4799() {
		return this.anInt5552;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(B)I")
	public int method4800(@OriginalArg(0) byte arg0) {
		if (arg0 != 14) {
			this.method4789(-99);
		}
		return this.anInt5551;
	}
}

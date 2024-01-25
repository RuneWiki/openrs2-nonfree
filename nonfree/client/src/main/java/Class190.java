import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class190 {

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "[Z")
	private boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "Lclient!dl;")
	public Class4_Sub2 aClass4_Sub2_7;

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
	private int anInt5397;

	@OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
	private int anInt5401;

	@OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
	private int anInt5402;

	@OriginalMember(owner = "client!pm", name = "A", descriptor = "Lclient!oj;")
	private Class177 aClass177_3;

	@OriginalMember(owner = "client!pm", name = "D", descriptor = "Lclient!e;")
	private Class57 aClass57_6;

	@OriginalMember(owner = "client!pm", name = "E", descriptor = "Lclient!i;")
	private Class1_Sub5_Sub10 aClass1_Sub5_Sub10_5;

	@OriginalMember(owner = "client!pm", name = "G", descriptor = "I")
	private int anInt5405;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
	private int anInt5384 = -32768;

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "Z")
	private boolean aBoolean609 = false;

	@OriginalMember(owner = "client!pm", name = "H", descriptor = "I")
	private int anInt5406 = -1;

	@OriginalMember(owner = "client!pm", name = "I", descriptor = "Z")
	private boolean aBoolean611 = false;

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
	private int anInt5398 = -1;

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "B")
	private final byte aByte91;

	@OriginalMember(owner = "client!pm", name = "C", descriptor = "I")
	private int anInt5404;

	@OriginalMember(owner = "client!pm", name = "P", descriptor = "I")
	public final int anInt5412;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
	public final int anInt5392;

	@OriginalMember(owner = "client!pm", name = "z", descriptor = "B")
	private final byte aByte92;

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
	private int anInt5396;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
	public final int anInt5385;

	@OriginalMember(owner = "client!pm", name = "F", descriptor = "Z")
	private final boolean aBoolean610;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!za;Lclient!er;IIIIIIZI)V")
	public Class190(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.aByte91 = (byte) arg5;
		this.anInt5404 = arg7;
		this.anInt5412 = arg2;
		this.anInt5392 = arg3;
		this.aByte92 = (byte) arg4;
		this.anInt5396 = arg6;
		this.anInt5385 = arg1.anInt1787;
		this.aBoolean609 = arg8;
		this.aBoolean610 = arg0.method5758() && arg1.aBoolean205 && !this.aBoolean609;
		if (arg9 != -1) {
			this.aBoolean611 = true;
		}
		this.method4228(arg9);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLclient!za;)V")
	public void method4225(@OriginalArg(1) Class34 arg0) {
		this.method4235(this.anInt5404, this.anInt5396, arg0, true, true, 262144);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)I")
	public int method4226() {
		return this.anInt5384;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!e;IZIILclient!za;IZ)V")
	public void method4227(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class34 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(6) Class229[] local6 = arg0.method5958();
		@Pc(13) Class181[] local13 = arg0.method5959();
		if ((this.aClass4_Sub2_7 == null || this.aClass4_Sub2_7.aBoolean162) && (local6 != null || local13 != null)) {
			@Pc(30) Class68 local30 = Static341.aClass75_4.method1616(this.anInt5385);
			if (local30.anIntArray125 != null) {
				local30 = local30.method1535(Static320.aClass249_2);
			}
			if (local30 != null) {
				this.aClass4_Sub2_7 = new Class4_Sub2(Static236.anInt4213);
			}
		}
		if (this.aClass4_Sub2_7 == null) {
			return;
		}
		if (arg6) {
			this.aClass4_Sub2_7.method1242(arg4, (long) Static236.anInt4213, local6, local13);
		} else {
			this.aClass4_Sub2_7.method1248((long) Static236.anInt4213);
		}
		this.aClass4_Sub2_7.method1236(this.aByte92, arg2, arg1, arg5, arg3);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
	private void method4228(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class68 local18 = Static341.aClass75_4.method1616(this.anInt5385);
			@Pc(20) Class68 local20 = local18;
			if (local18.anIntArray125 != null) {
				local18 = local18.method1535(Static320.aClass249_2);
			}
			if (local18 == null) {
				return;
			}
			if (local20 == local18) {
				local20 = null;
			}
			if (local18.anIntArray124 != null) {
				if (this.aClass177_3 != null && local18.method1547(this.aClass177_3.anInt5032)) {
					return;
				}
				local7 = local18.method1540();
				if (local18.anInt1787 != this.anInt5406) {
					local9 = local18.aBoolean211;
				}
			} else if (local18.anInt1830 == -1) {
				if (local20 != null && local20.anIntArray124 != null) {
					if (this.aClass177_3 != null && local20.method1547(this.aClass177_3.anInt5032)) {
						return;
					}
					local7 = local20.method1540();
					if (local20.anInt1787 != this.anInt5406) {
						local9 = local20.aBoolean211;
					}
				} else if (local20 != null && local20.anInt1830 != -1 && this.anInt5406 != local20.anInt1787) {
					local9 = local20.aBoolean211;
					local7 = local20.anInt1830;
				}
			} else if (this.anInt5406 != local18.anInt1787) {
				local9 = local18.aBoolean211;
				local7 = local18.anInt1830;
			}
		}
		if (local7 == -1) {
			this.aClass177_3 = null;
			return;
		}
		this.aClass57_6 = null;
		if (this.aClass177_3 == null || this.aClass177_3.anInt5032 != local7) {
			this.aClass177_3 = Static174.aClass254_1.method5670(local7);
		} else if (this.aClass177_3.anInt5037 == 0) {
			return;
		}
		if (this.aClass177_3.anIntArray326 == null) {
			this.aClass177_3 = null;
			return;
		}
		if (local9) {
			this.anInt5397 = (int) (Math.random() * (double) this.aClass177_3.anIntArray326.length);
			this.anInt5402 = (int) (Math.random() * (double) this.aClass177_3.anIntArray327[this.anInt5397]) + 1;
		} else {
			this.anInt5402 = 1;
			this.anInt5397 = 0;
		}
		this.anInt5401 = this.anInt5397 + 1;
		if (this.anInt5401 < 0 || this.aClass177_3.anIntArray326.length <= this.anInt5401) {
			this.anInt5401 = -1;
		}
		this.anInt5405 = Static236.anInt4213 - this.anInt5402;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V")
	private void method4230(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass177_3 == null) {
				if (this.aBoolean611) {
					return;
				}
				this.method4228(-1);
				if (this.aClass177_3 == null) {
					return;
				}
			}
			@Pc(34) int local34 = Static236.anInt4213 - this.anInt5405;
			if (local34 > 100 && this.aClass177_3.anInt5041 > 0) {
				@Pc(50) int local50 = this.aClass177_3.anIntArray326.length - this.aClass177_3.anInt5041;
				while (this.anInt5397 < local50 && this.aClass177_3.anIntArray327[this.anInt5397] < local34) {
					local34 -= this.aClass177_3.anIntArray327[this.anInt5397];
					this.anInt5397++;
				}
				if (local50 <= this.anInt5397) {
					@Pc(89) int local89 = 0;
					for (@Pc(91) int local91 = local50; local91 < this.aClass177_3.anIntArray326.length; local91++) {
						local89 += this.aClass177_3.anIntArray327[local91];
					}
					local34 %= local89;
				}
				this.anInt5401 = this.anInt5397 + 1;
				if (this.aClass177_3.anIntArray326.length <= this.anInt5401) {
					this.anInt5401 -= this.aClass177_3.anInt5041;
					if (this.anInt5401 < 0 || this.aClass177_3.anIntArray326.length <= this.anInt5401) {
						this.anInt5401 = -1;
					}
				}
			}
			while (this.aClass177_3.anIntArray327[this.anInt5397] < local34) {
				Static70.method1141(this.aClass177_3, this.aByte92, arg0, arg1, false, this.anInt5397);
				local34 -= this.aClass177_3.anIntArray327[this.anInt5397];
				this.anInt5397++;
				if (this.anInt5397 >= this.aClass177_3.anIntArray326.length) {
					this.anInt5397 -= this.aClass177_3.anInt5041;
					if (this.anInt5397 < 0 || this.anInt5397 >= this.aClass177_3.anIntArray326.length) {
						this.aClass177_3 = null;
						continue label80;
					}
				}
				this.anInt5401 = this.anInt5397 + 1;
				if (this.anInt5401 >= this.aClass177_3.anIntArray326.length) {
					this.anInt5401 -= this.aClass177_3.anInt5041;
					if (this.anInt5401 < 0 || this.anInt5401 >= this.aClass177_3.anIntArray326.length) {
						this.anInt5401 = -1;
					}
				}
			}
			this.anInt5405 = Static236.anInt4213 - local34;
			this.anInt5402 = local34;
			return;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)V")
	public void method4231(@OriginalArg(1) int arg0) {
		this.aBoolean611 = true;
		this.method4228(arg0);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILclient!za;ZBZI)Lclient!e;")
	public Class57 method4235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Class68 local11 = Static341.aClass75_4.method1616(this.anInt5385);
		if (local11.anIntArray125 != null) {
			local11 = local11.method1535(Static320.aClass249_2);
		}
		if (local11 == null) {
			this.method4240(arg2);
			this.anInt5398 = this.anInt5397;
			this.anInt5406 = -1;
			return null;
		}
		if (!this.aBoolean611 && this.anInt5406 != local11.anInt1787) {
			this.aClass57_6 = null;
			this.method4228(-1);
		}
		this.method4230(arg1, arg0);
		@Pc(75) boolean local75 = arg3 & this.aBoolean610 & Static453.aClass136_Sub1_1.method3516(Static14.anInt293) != 0;
		@Pc(121) boolean local121 = local75 & (local11.anInt1787 != this.anInt5406 || (this.anInt5397 != this.anInt5398 || this.aClass177_3 != null && (this.aClass177_3.aBoolean574 || Static389.aBoolean713) && this.anInt5397 != this.anInt5401) && Static453.aClass136_Sub1_1.method3516(Static14.anInt293) >= 2);
		if (arg4 && !local121) {
			this.anInt5398 = this.anInt5397;
			this.anInt5406 = local11.anInt1787;
			return null;
		}
		if (local121) {
			Static195.method2810(this.aClass1_Sub5_Sub10_5, this.aByte91, this.anInt5396, this.anInt5404, this.aBooleanArray18);
		}
		@Pc(161) Class157 local161 = Static94.aClass157Array1[this.aByte91];
		@Pc(179) Class157 local179;
		if (this.aBoolean609) {
			local179 = Static330.aClass157Array2[0];
		} else {
			local179 = this.aByte91 >= 3 ? null : Static94.aClass157Array1[this.aByte91 + 1];
		}
		@Pc(187) Class57 local187 = null;
		if (this.aClass177_3 != null) {
			if (local121) {
				arg5 |= 0x40000;
			}
			local187 = local11.method1541(this.anInt5404, this.anInt5397, local161.ca(this.anInt5396, this.anInt5404), arg5, local179, this.anInt5402, this.anInt5412 == 11 ? this.anInt5392 + 4 : this.anInt5392, this.aClass177_3, this.anInt5401, arg2, local161, this.anInt5396, this.anInt5412 == 11 ? 10 : this.anInt5412);
			if (local187 == null) {
				this.aBooleanArray18 = null;
				this.aClass1_Sub5_Sub10_5 = null;
				this.anInt5384 = 0;
			} else {
				if (local121) {
					if (this.aBooleanArray18 == null) {
						this.aBooleanArray18 = new boolean[4];
					}
					this.aClass1_Sub5_Sub10_5 = local187.EA(this.aClass1_Sub5_Sub10_5);
					Static343.method4626(this.aClass1_Sub5_Sub10_5, this.aByte91, arg1, arg0, this.aBooleanArray18);
				}
				this.anInt5384 = local187.B();
			}
			this.aClass57_6 = null;
		} else if (this.aClass57_6 != null && (this.aClass57_6.RA() & arg5) == arg5 && local11.anInt1787 == this.anInt5406) {
			local187 = this.aClass57_6;
		} else {
			if (this.aClass57_6 != null) {
				arg5 |= this.aClass57_6.RA();
			}
			@Pc(361) Class247 local361 = local11.method1548(local161, arg5, local121, this.anInt5412 == 11 ? 10 : this.anInt5412, this.anInt5404, local179, local161.ca(this.anInt5396, this.anInt5404), arg2, this.anInt5396, this.anInt5412 == 11 ? this.anInt5392 + 4 : this.anInt5392);
			if (local361 == null) {
				this.aClass1_Sub5_Sub10_5 = null;
				this.anInt5384 = 0;
				this.aBooleanArray18 = null;
				this.aClass57_6 = null;
			} else {
				local187 = local361.aClass57_7;
				this.aClass57_6 = local361.aClass57_7;
				if (local121) {
					this.aBooleanArray18 = null;
					this.aClass1_Sub5_Sub10_5 = local361.aClass1_Sub5_Sub10_6;
					Static343.method4626(this.aClass1_Sub5_Sub10_5, this.aByte91, arg1, arg0, null);
				}
				this.anInt5384 = local187.B();
			}
		}
		this.anInt5396 = arg1;
		this.anInt5404 = arg0;
		this.anInt5398 = this.anInt5397;
		this.anInt5406 = local11.anInt1787;
		return local187;
	}

	@OriginalMember(owner = "client!pm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub2_7 != null) {
			this.aClass4_Sub2_7.method1244();
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)Z")
	public boolean method4236() {
		return this.aBoolean610;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILclient!za;)V")
	public void method4240(@OriginalArg(1) Class34 arg0) {
		if (this.aClass1_Sub5_Sub10_5 != null) {
			Static195.method2810(this.aClass1_Sub5_Sub10_5, this.aByte91, this.anInt5396, this.anInt5404, this.aBooleanArray18);
			this.aClass1_Sub5_Sub10_5 = null;
			this.aBooleanArray18 = null;
		}
	}
}

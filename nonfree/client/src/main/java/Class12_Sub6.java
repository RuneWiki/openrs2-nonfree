import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class12_Sub6 extends Class12 {

	@OriginalMember(owner = "client!pm", name = "z", descriptor = "Lclient!id;")
	private Class67_Sub1 aClass67_Sub1_5;

	@OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
	private int anInt4068 = -32768;

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
	private int anInt4063 = 0;

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "Lclient!tb;")
	private Class59_Sub2 aClass59_Sub2_2 = null;

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "Z")
	private boolean aBoolean268 = true;

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
	private int anInt4064 = 0;

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "Z")
	private boolean aBoolean267 = false;

	@OriginalMember(owner = "client!pm", name = "N", descriptor = "I")
	private int anInt4080 = -1;

	@OriginalMember(owner = "client!pm", name = "I", descriptor = "I")
	private int anInt4075 = -1;

	@OriginalMember(owner = "client!pm", name = "M", descriptor = "I")
	private int anInt4079 = 0;

	@OriginalMember(owner = "client!pm", name = "G", descriptor = "I")
	private int anInt4073;

	@OriginalMember(owner = "client!pm", name = "O", descriptor = "I")
	private int anInt4081;

	@OriginalMember(owner = "client!pm", name = "T", descriptor = "I")
	private int anInt4084;

	@OriginalMember(owner = "client!pm", name = "D", descriptor = "I")
	private int anInt4070;

	@OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
	private int anInt4067;

	@OriginalMember(owner = "client!pm", name = "U", descriptor = "I")
	private int anInt4085;

	@OriginalMember(owner = "client!pm", name = "C", descriptor = "Lclient!qm;")
	private Class141 aClass141_3;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
	private int anInt4060;

	@OriginalMember(owner = "client!pm", name = "A", descriptor = "I")
	private int anInt4069;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
	private int anInt4058;

	@OriginalMember(owner = "client!pm", name = "F", descriptor = "I")
	private int anInt4072;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(IIIIIIIZLclient!en;)V")
	public Class12_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class12 arg8) {
		this.anInt4073 = arg0;
		this.anInt4081 = arg5;
		this.anInt4084 = arg2;
		this.anInt4070 = arg1;
		this.anInt4067 = arg4;
		this.anInt4085 = arg3;
		@Pc(68) Class47 local68;
		if (Static178.aBoolean216 && arg8 != null) {
			if (arg8 instanceof Class12_Sub6) {
				((Class12_Sub6) arg8).method3305();
			} else {
				local68 = Static170.method2683(this.anInt4073);
				if (local68.anIntArray142 != null) {
					local68 = local68.method1096();
				}
				if (local68 != null) {
					Static212.method3392(this.anInt4081, this.anInt4084, this.anInt4070, this.anInt4067, 0, 0, this.anInt4085, local68);
				}
			}
		}
		if (arg6 != -1) {
			this.aClass141_3 = Static296.method1376(arg6);
			this.anInt4060 = 0;
			if (this.aClass141_3.anIntArray390.length > 1) {
				this.anInt4069 = 1;
			} else {
				this.anInt4069 = 0;
			}
			this.anInt4058 = Static104.anInt2226 - 1;
			this.anInt4072 = 1;
			if (this.aClass141_3.anInt4349 == 0 && arg8 != null && arg8 instanceof Class12_Sub6) {
				@Pc(141) Class12_Sub6 local141 = (Class12_Sub6) arg8;
				if (local141.aClass141_3 == this.aClass141_3) {
					this.anInt4069 = local141.anInt4069;
					this.anInt4060 = local141.anInt4060;
					this.anInt4058 = local141.anInt4058;
					this.anInt4072 = local141.anInt4072;
					return;
				}
			}
			if (arg7 && this.aClass141_3.anInt4367 != -1) {
				this.anInt4060 = (int) ((double) this.aClass141_3.anIntArray390.length * Math.random());
				this.anInt4069 = this.anInt4060 + 1;
				if (this.anInt4069 >= this.aClass141_3.anIntArray390.length) {
					this.anInt4069 -= this.aClass141_3.anInt4367;
					if (this.anInt4069 < 0 || this.anInt4069 >= this.aClass141_3.anIntArray390.length) {
						this.anInt4069 = -1;
					}
				}
				this.anInt4072 = (int) ((double) this.aClass141_3.anIntArray392[this.anInt4060] * Math.random()) + 1;
				this.anInt4058 = Static104.anInt2226 - this.anInt4072;
			}
		}
		if (Static178.aBoolean216 && arg8 != null) {
			this.method3304(true);
		}
		if (arg8 == null) {
			local68 = Static170.method2683(this.anInt4073);
			if (local68.anIntArray142 != null) {
				this.aBoolean267 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)Lclient!en;")
	public Class12 method3303() {
		return this.method3304(false);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static178.aBoolean216) {
			this.method3304(true);
		} else {
			this.method3306(arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIIIJILclient!id;)V")
	@Override
	public void method3357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class67_Sub1 arg10) {
		@Pc(7) Class12 local7 = this.method3303();
		if (local7 != null) {
			local7.method3357(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass67_Sub1_5);
		}
	}

	@OriginalMember(owner = "client!pm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZI)Lclient!en;")
	private Class12 method3304(@OriginalArg(0) boolean arg0) {
		@Pc(8) boolean local8 = Static231.anIntArrayArrayArray12 != Static250.anIntArrayArrayArray13;
		@Pc(19) Class47 local19 = Static170.method2683(this.anInt4073);
		@Pc(22) int local22 = local19.anInt1336;
		if (local19.anIntArray142 != null) {
			local19 = local19.method1096();
		}
		if (local19 == null) {
			if (Static178.aBoolean216 && !local8) {
				this.method3305();
			}
			return null;
		}
		@Pc(60) int local60;
		if (Static132.anInt2784 != 0 && this.aBoolean267 && (this.aClass141_3 == null || this.aClass141_3 != null && this.aClass141_3.anInt4357 != local19.anInt1336)) {
			local60 = local19.anInt1336;
			if (local19.anInt1336 == -1) {
				local60 = local22;
			}
			if (local60 == -1) {
				this.aClass141_3 = null;
			} else {
				this.aClass141_3 = Static296.method1376(local60);
			}
			if (this.aClass141_3 != null) {
				if (local19.aBoolean112 && this.aClass141_3.anInt4367 != -1) {
					this.anInt4060 = (int) ((double) this.aClass141_3.anIntArray390.length * Math.random());
					this.anInt4058 -= (int) ((double) this.aClass141_3.anIntArray392[this.anInt4060] * Math.random());
				} else {
					this.anInt4060 = 0;
					this.anInt4058 = Static104.anInt2226 - 1;
				}
			}
		}
		local60 = this.anInt4084 & 0x3;
		@Pc(160) int local160;
		@Pc(157) int local157;
		if (local60 == 1 || local60 == 3) {
			local157 = local19.anInt1327;
			local160 = local19.anInt1354;
		} else {
			local160 = local19.anInt1327;
			local157 = local19.anInt1354;
		}
		@Pc(175) int local175 = this.anInt4067 + (local160 >> 1);
		@Pc(184) int local184 = this.anInt4067 + (local160 + 1 >> 1);
		@Pc(191) int local191 = (local157 >> 1) + this.anInt4081;
		@Pc(200) int local200 = (local157 + 1 >> 1) + this.anInt4081;
		this.method3306(local191 * 128, local175 * 128);
		@Pc(250) boolean local250 = !local8 && local19.aBoolean111 && (this.anInt4080 != local19.anInt1366 || (this.anInt4060 != this.anInt4075 || this.aClass141_3 != null && (this.aClass141_3.aBoolean291 || Static112.aBoolean164) && this.anInt4069 != this.anInt4060) && Static18.anInt380 >= 2);
		if (arg0 && !local250) {
			return null;
		}
		@Pc(262) int[][] local262 = Static250.anIntArrayArrayArray13[this.anInt4085];
		@Pc(289) int local289 = local262[local175][local200] + local262[local184][local191] + local262[local175][local191] + local262[local184][local200] >> 2;
		@Pc(292) int[][] local292 = null;
		@Pc(301) int local301 = (local157 << 6) + (this.anInt4081 << 7);
		@Pc(310) int local310 = (local160 << 6) + (this.anInt4067 << 7);
		if (local8) {
			local292 = Static231.anIntArrayArrayArray12[0];
		} else if (this.anInt4085 < 3) {
			local292 = Static250.anIntArrayArrayArray13[this.anInt4085 + 1];
		}
		if (Static178.aBoolean216 && local250) {
			Static64.method981(this.aClass59_Sub2_2, this.anInt4064, this.anInt4063, this.anInt4079);
		}
		@Pc(355) boolean local355 = this.aClass59_Sub2_2 == null;
		@Pc(379) Class154 local379;
		if (this.aClass141_3 == null) {
			local379 = local19.method1091(local292, this.anInt4070, local262, this.anInt4084, false, local250, local355 ? Static241.aClass59_Sub2_3 : this.aClass59_Sub2_2, local289, local301, local310);
		} else {
			local379 = local19.method1085(this.anInt4070, this.anInt4069, local262, this.anInt4072, this.anInt4060, local289, local292, local250, this.anInt4084, local310, local355 ? Static241.aClass59_Sub2_3 : this.aClass59_Sub2_2, local301, this.aClass141_3);
		}
		if (local379 == null) {
			return null;
		}
		if (Static178.aBoolean216 && local250) {
			if (local355) {
				Static241.aClass59_Sub2_3 = local379.aClass59_Sub2_4;
			}
			@Pc(426) int local426 = 0;
			if (this.anInt4085 != 0) {
				@Pc(437) int[][] local437 = Static250.anIntArrayArrayArray13[0];
				local426 = local289 - (local437[local184][local191] + local437[local175][local191] + local437[local175][local200] + local437[local184][local200] >> 2);
			}
			@Pc(470) Class59_Sub2 local470 = local379.aClass59_Sub2_4;
			if (this.aBoolean268 && Static64.method986(local470, local310, local426, local301)) {
				this.aBoolean268 = false;
			}
			if (!this.aBoolean268) {
				Static64.method972(local470, local310, local426, local301);
				if (local355) {
					Static241.aClass59_Sub2_3 = null;
				}
				this.anInt4064 = local310;
				this.aClass59_Sub2_2 = local470;
				this.anInt4063 = local426;
				this.anInt4079 = local301;
			}
			this.anInt4075 = this.anInt4060;
			this.anInt4080 = local19.anInt1366;
		}
		return local379.aClass12_9;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	public void method3305() {
		if (this.aClass59_Sub2_2 != null) {
			Static64.method981(this.aClass59_Sub2_2, this.anInt4064, this.anInt4063, this.anInt4079);
		}
		this.aClass59_Sub2_2 = null;
		this.anInt4075 = -1;
		this.anInt4080 = -1;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(III)V")
	private void method3306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass141_3 == null) {
			return;
		}
		@Pc(11) int local11 = Static104.anInt2226 - this.anInt4058;
		if (local11 > 100 && this.aClass141_3.anInt4367 > 0) {
			@Pc(34) int local34 = this.aClass141_3.anIntArray390.length - this.aClass141_3.anInt4367;
			while (this.anInt4060 < local34 && local11 > this.aClass141_3.anIntArray392[this.anInt4060]) {
				local11 -= this.aClass141_3.anIntArray392[this.anInt4060];
				this.anInt4060++;
			}
			if (local34 <= this.anInt4060) {
				@Pc(78) int local78 = 0;
				for (@Pc(80) int local80 = local34; local80 < this.aClass141_3.anIntArray390.length; local80++) {
					local78 += this.aClass141_3.anIntArray392[local80];
				}
				local11 %= local78;
			}
			this.anInt4069 = this.anInt4060 + 1;
			if (this.anInt4069 >= this.aClass141_3.anIntArray390.length) {
				this.anInt4069 -= this.aClass141_3.anInt4367;
				if (this.anInt4069 < 0 || this.anInt4069 >= this.aClass141_3.anIntArray390.length) {
					this.anInt4069 = -1;
				}
			}
		}
		while (this.aClass141_3.anIntArray392[this.anInt4060] < local11) {
			Static11.method188(false, this.aClass141_3, arg1, arg0, this.anInt4060);
			local11 -= this.aClass141_3.anIntArray392[this.anInt4060];
			this.anInt4060++;
			if (this.aClass141_3.anIntArray390.length <= this.anInt4060) {
				this.anInt4060 -= this.aClass141_3.anInt4367;
				if (this.anInt4060 < 0 || this.anInt4060 >= this.aClass141_3.anIntArray390.length) {
					this.aClass141_3 = null;
					break;
				}
			}
			this.anInt4069 = this.anInt4060 + 1;
			if (this.aClass141_3.anIntArray390.length <= this.anInt4069) {
				this.anInt4069 -= this.aClass141_3.anInt4367;
				if (this.anInt4069 < 0 || this.anInt4069 >= this.aClass141_3.anIntArray390.length) {
					this.anInt4069 = -1;
				}
			}
		}
		this.anInt4072 = local11;
		this.anInt4058 = Static104.anInt2226 - local11;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "()I")
	@Override
	public int method3355() {
		return this.anInt4068;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class136 {

	@OriginalMember(owner = "client!gg", name = "M", descriptor = "Lclient!hr;")
	private Class165 aClass165_1;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "[Z")
	private boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
	private int anInt3391;

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "Lclient!ms;")
	public Class9_Sub5 aClass9_Sub5_4;

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "Lclient!ka;")
	private Class170 aClass170_3;

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "Lclient!r;")
	private Class3_Sub7_Sub17 aClass3_Sub7_Sub17_3;

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
	private int anInt3388 = 0;

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
	private int anInt3393 = -1;

	@OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
	private int anInt3402 = 0;

	@OriginalMember(owner = "client!gg", name = "L", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
	public final int anInt3394;

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
	public final int anInt3398;

	@OriginalMember(owner = "client!gg", name = "y", descriptor = "B")
	private final byte aByte59;

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
	public final int anInt3392;

	@OriginalMember(owner = "client!gg", name = "x", descriptor = "Lclient!ee;")
	private final Class9_Sub1 aClass9_Sub1_9;

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "B")
	private final byte aByte60;

	@OriginalMember(owner = "client!gg", name = "J", descriptor = "Z")
	private final boolean aBoolean213;

	@OriginalMember(owner = "client!gg", name = "F", descriptor = "Lclient!rf;")
	private final Class45 aClass45_6;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!ha;Lclient!mf;IIIILclient!ee;ZI)V")
	public Class136(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class9_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.anInt3394 = arg2;
		this.anInt3398 = arg3;
		this.aBoolean215 = arg8 != -1;
		this.aByte59 = (byte) arg5;
		this.anInt3392 = arg1.anInt6249;
		this.aBoolean216 = arg7;
		this.aClass9_Sub1_9 = arg6;
		this.aByte60 = (byte) arg4;
		this.aBoolean213 = arg0.method9346() && arg1.aBoolean422 && !this.aBoolean216;
		this.aClass45_6 = new Class45_Sub2(arg6, false);
		this.method3104(false, arg8, 1);
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)Z")
	public boolean method3096() {
		return this.aBoolean213;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)I")
	public int method3097() {
		return this.anInt3402;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLclient!ha;)V")
	public void method3098(@OriginalArg(1) Class22 arg0) {
		if (this.aClass3_Sub7_Sub17_3 != null) {
			Static325.method4736(this.aClass3_Sub7_Sub17_3, this.aByte59, this.aClass9_Sub1_9.anInt10694, this.aClass9_Sub1_9.anInt10695, this.aBooleanArray5);
			this.aBooleanArray5 = null;
			this.aClass3_Sub7_Sub17_3 = null;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ha;ZIIZ)Lclient!ka;")
	public Class170 method3099(@OriginalArg(0) Class22 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) Class247 local11 = Static216.aClass53_3.method1523(this.anInt3392);
		if (local11.anIntArray477 != null) {
			local11 = local11.method5442(Static103.anInt2245 == 3 ? Static229.anInterface12_3 : Static380.aClass127_1);
		}
		if (local11 == null) {
			this.method3098(arg0);
			this.anInt3393 = -1;
			return null;
		}
		if (!this.aBoolean215 && local11.anInt6249 != this.anInt3393) {
			this.method3104(true, -1, 0);
			this.aClass170_3 = null;
			this.aBoolean214 = false;
		}
		this.method3102(this.aClass9_Sub1_9);
		if (arg3) {
			arg3 &= this.aBoolean213 & !this.aBoolean214 & Static580.aClass3_Sub22_24.aClass21_Sub30_1.method9242() != 0;
		}
		if (arg1 && !arg3) {
			this.anInt3393 = local11.anInt6249;
			return null;
		}
		if (arg3) {
			Static325.method4736(this.aClass3_Sub7_Sub17_3, this.aByte59, this.aClass9_Sub1_9.anInt10694, this.aClass9_Sub1_9.anInt10695, this.aBooleanArray5);
			this.aBoolean214 = false;
		}
		@Pc(141) Class259 local141 = Static477.aClass259Array3[this.aByte59];
		@Pc(148) Class259 local148;
		if (this.aBoolean216) {
			local148 = Static43.aClass259Array1[0];
		} else {
			local148 = this.aByte59 >= 3 ? null : Static477.aClass259Array3[this.aByte59 + 1];
		}
		@Pc(170) Class170 local170 = null;
		if (this.aClass45_6.method6572()) {
			if (arg3) {
				arg2 |= 0x40000;
			}
			local170 = local11.method5441(this.anInt3394 == 11 ? this.anInt3398 + 4 : this.anInt3398, this.anInt3394 == 11 ? 10 : this.anInt3394, this.aClass9_Sub1_9.anInt10694, arg2, local141, this.aClass9_Sub1_9.anInt10695, arg0, local148, this.aClass165_1, this.aClass45_6, local141.method9294(this.aClass9_Sub1_9.anInt10695, this.aClass9_Sub1_9.anInt10694));
			if (local170 == null) {
				this.anInt3402 = 0;
				this.aClass3_Sub7_Sub17_3 = null;
				this.anInt3388 = 0;
				this.aBooleanArray5 = null;
			} else {
				if (arg3) {
					if (this.aBooleanArray5 == null) {
						this.aBooleanArray5 = new boolean[4];
					}
					this.aClass3_Sub7_Sub17_3 = local170.ba(this.aClass3_Sub7_Sub17_3);
					Static436.method5764(this.aClass3_Sub7_Sub17_3, this.aByte59, this.aClass9_Sub1_9.anInt10694, this.aClass9_Sub1_9.anInt10695, this.aBooleanArray5);
					this.aBoolean214 = true;
				}
				this.anInt3402 = local170.fa();
				this.anInt3388 = local170.ma();
			}
			this.aClass170_3 = null;
		} else if (this.aClass170_3 != null && (this.aClass170_3.ua() & arg2) == arg2 && local11.anInt6249 == this.anInt3393) {
			local170 = this.aClass170_3;
		} else {
			if (this.aClass170_3 != null) {
				arg2 |= this.aClass170_3.ua();
			}
			@Pc(262) Class347 local262 = local11.method5446(this.aClass165_1, arg3, local141.method9294(this.aClass9_Sub1_9.anInt10695, this.aClass9_Sub1_9.anInt10694), this.anInt3394 == 11 ? 10 : this.anInt3394, arg2, this.aClass9_Sub1_9.anInt10695, arg0, local141, this.aClass9_Sub1_9.anInt10694, local148, this.anInt3394 == 11 ? this.anInt3398 + 4 : this.anInt3398);
			if (local262 == null) {
				this.aClass170_3 = null;
				this.aClass3_Sub7_Sub17_3 = null;
				this.aBooleanArray5 = null;
				this.anInt3388 = 0;
				this.anInt3402 = 0;
			} else {
				local170 = local262.aClass170_8;
				this.aClass170_3 = local262.aClass170_8;
				if (arg3) {
					this.aBooleanArray5 = null;
					this.aClass3_Sub7_Sub17_3 = local262.aClass3_Sub7_Sub17_6;
					Static436.method5764(this.aClass3_Sub7_Sub17_3, this.aByte59, this.aClass9_Sub1_9.anInt10694, this.aClass9_Sub1_9.anInt10695, (boolean[]) null);
					this.aBoolean214 = true;
				}
				this.anInt3402 = local170.fa();
				this.anInt3388 = local170.ma();
			}
		}
		this.anInt3393 = local11.anInt6249;
		return local170;
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)I")
	public int method3100(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.anInt3388 : -104;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!hr;)V")
	public void method3101(@OriginalArg(1) Class165 arg0) {
		this.aClass165_1 = arg0;
		this.aClass170_3 = null;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ee;I)V")
	private void method3102(@OriginalArg(0) Class9_Sub1 arg0) {
		if (!this.aClass45_6.method6572()) {
			this.method3104(false, -1, 0);
		} else if (this.aClass45_6.method6593(Static716.anInt11157 - this.anInt3391)) {
			if (Static580.aClass3_Sub22_24.aClass21_Sub30_1.method9242() == 2) {
				this.aBoolean214 = false;
			}
			if (this.aClass45_6.method6584()) {
				this.aClass45_6.method6576(-1);
				this.aBoolean215 = false;
				this.method3104(false, -1, 0);
			}
		}
		this.anInt3391 = Static716.anInt11157;
	}

	@OriginalMember(owner = "client!gg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass9_Sub5_4 != null) {
			this.aClass9_Sub5_4.method5583();
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZIIB)V")
	private void method3104(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1;
		@Pc(9) boolean local9 = false;
		if (arg1 == -1) {
			@Pc(19) Class247 local19 = Static216.aClass53_3.method1523(this.anInt3392);
			@Pc(21) Class247 local21 = local19;
			if (local19.anIntArray477 != null) {
				local19 = local19.method5442(Static103.anInt2245 == 3 ? Static229.anInterface12_3 : Static380.aClass127_1);
			}
			if (local19 == null) {
				return;
			}
			if (local19 == local21) {
				local21 = null;
			}
			if (local19.method5433()) {
				if (arg0 && this.aClass45_6.method6572() && local19.method5438(this.aClass45_6.method6577())) {
					return;
				}
				if (local19.anInt6249 != this.anInt3393) {
					local9 = local19.aBoolean411;
				}
				local7 = local19.method5435();
				if (local19.method5445()) {
					arg2 = 0;
				} else {
					arg2 = 1;
				}
			} else if (local21 != null && local21.method5433()) {
				if (arg0 && this.aClass45_6.method6572() && local21.method5438(this.aClass45_6.method6577())) {
					return;
				}
				if (local19.anInt6249 != this.anInt3393) {
					local9 = local21.aBoolean411;
				}
				local7 = local21.method5435();
				if (local21.method5445()) {
					arg2 = 0;
				} else {
					arg2 = 1;
				}
			}
		}
		if (local7 == -1) {
			this.aClass45_6.method6581();
		} else {
			this.aClass45_6.method6586(arg2, 0, local9, local7);
			this.anInt3391 = Static716.anInt11157;
			this.aClass170_3 = null;
			this.aBoolean214 = false;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
	public void method3105(@OriginalArg(1) int arg0) {
		this.aBoolean215 = true;
		this.method3104(false, arg0, 1);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIILclient!ha;ILclient!ka;ZLclient!cl;B)V")
	public void method3107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class22 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class170 arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) Class58 arg7) {
		@Pc(6) Class184[] local6 = arg5.method8354();
		@Pc(17) Class232[] local17 = arg5.method8352();
		if ((this.aClass9_Sub5_4 == null || this.aClass9_Sub5_4.aBoolean434) && (local6 != null || local17 != null)) {
			@Pc(42) Class247 local42 = Static216.aClass53_3.method1523(this.anInt3392);
			if (local42.anIntArray477 != null) {
				local42 = local42.method5442(Static103.anInt2245 == 3 ? Static229.anInterface12_3 : Static380.aClass127_1);
			}
			if (local42 != null) {
				this.aClass9_Sub5_4 = Static421.method5577(Static716.anInt11157, true);
			}
		}
		if (this.aClass9_Sub5_4 == null) {
			return;
		}
		arg5.method8357(arg7);
		if (arg6) {
			this.aClass9_Sub5_4.method5585(arg3, (long) Static716.anInt11157, local6, local17);
		} else {
			this.aClass9_Sub5_4.method5576((long) Static716.anInt11157);
		}
		this.aClass9_Sub5_4.method5570(this.aByte60, arg2, arg4, arg1, arg0);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method3109(@OriginalArg(0) Class22 arg0) {
		this.method3099(arg0, true, 262144, true);
	}
}

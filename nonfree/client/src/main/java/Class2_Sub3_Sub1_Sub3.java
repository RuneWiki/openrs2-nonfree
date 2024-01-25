import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class2_Sub3_Sub1_Sub3 extends Class2_Sub3_Sub1 {

	@OriginalMember(owner = "client!gf", name = "N", descriptor = "D")
	private double aDouble18;

	@OriginalMember(owner = "client!gf", name = "X", descriptor = "D")
	private double aDouble19;

	@OriginalMember(owner = "client!gf", name = "db", descriptor = "D")
	private double aDouble20;

	@OriginalMember(owner = "client!gf", name = "eb", descriptor = "D")
	private double aDouble21;

	@OriginalMember(owner = "client!gf", name = "kb", descriptor = "Lclient!aj;")
	private Class2_Sub2 aClass2_Sub2_5;

	@OriginalMember(owner = "client!gf", name = "mb", descriptor = "D")
	private double aDouble22;

	@OriginalMember(owner = "client!gf", name = "sb", descriptor = "D")
	private double aDouble23;

	@OriginalMember(owner = "client!gf", name = "xb", descriptor = "I")
	private int anInt4201;

	@OriginalMember(owner = "client!gf", name = "yb", descriptor = "D")
	private double aDouble24;

	@OriginalMember(owner = "client!gf", name = "Ab", descriptor = "D")
	private double aDouble25;

	@OriginalMember(owner = "client!gf", name = "Fb", descriptor = "I")
	private int anInt4206;

	@OriginalMember(owner = "client!gf", name = "J", descriptor = "Z")
	private boolean aBoolean360 = false;

	@OriginalMember(owner = "client!gf", name = "W", descriptor = "I")
	private int anInt4184 = 0;

	@OriginalMember(owner = "client!gf", name = "P", descriptor = "I")
	private int anInt4177 = -1;

	@OriginalMember(owner = "client!gf", name = "L", descriptor = "Z")
	private boolean aBoolean361 = false;

	@OriginalMember(owner = "client!gf", name = "S", descriptor = "I")
	private int anInt4180 = 0;

	@OriginalMember(owner = "client!gf", name = "rb", descriptor = "I")
	private int anInt4197 = 0;

	@OriginalMember(owner = "client!gf", name = "Db", descriptor = "I")
	private int anInt4205 = 0;

	@OriginalMember(owner = "client!gf", name = "qb", descriptor = "I")
	public final int anInt4196;

	@OriginalMember(owner = "client!gf", name = "pb", descriptor = "I")
	private final int anInt4195;

	@OriginalMember(owner = "client!gf", name = "hb", descriptor = "I")
	public final int anInt4191;

	@OriginalMember(owner = "client!gf", name = "vb", descriptor = "I")
	public final int anInt4200;

	@OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
	private final int anInt4176;

	@OriginalMember(owner = "client!gf", name = "Y", descriptor = "I")
	private final int anInt4185;

	@OriginalMember(owner = "client!gf", name = "V", descriptor = "I")
	private final int anInt4183;

	@OriginalMember(owner = "client!gf", name = "fb", descriptor = "I")
	private final int anInt4189;

	@OriginalMember(owner = "client!gf", name = "ab", descriptor = "Z")
	private final boolean aBoolean362;

	@OriginalMember(owner = "client!gf", name = "ob", descriptor = "I")
	private final int anInt4194;

	@OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
	public final int anInt4178;

	@OriginalMember(owner = "client!gf", name = "ib", descriptor = "Lclient!rj;")
	private final Class290 aClass290_2;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class2_Sub3_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static202.method3958(arg4, arg1, arg3) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt4196 = arg6;
		this.anInt4195 = arg0;
		this.anInt4191 = arg12;
		this.aBoolean360 = false;
		this.anInt4200 = arg11;
		this.anInt4176 = arg5;
		this.anInt4185 = arg10;
		this.anInt4183 = arg14;
		this.anInt4189 = arg9;
		this.aBoolean362 = arg13;
		this.anInt4194 = arg8;
		this.anInt4178 = arg7;
		@Pc(91) int local91 = Static35.aClass343_1.method8033(this.anInt4195).anInt8068;
		if (local91 == -1) {
			this.aClass290_2 = null;
		} else {
			this.aClass290_2 = Static618.aClass222_2.method5867(local91);
		}
	}

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)I")
	@Override
	public int method8574() {
		return this.anInt4197;
	}

	@OriginalMember(owner = "client!gf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass2_Sub2_5 != null) {
			this.aClass2_Sub2_5.method232();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!ha;I)Lclient!ie;")
	@Override
	public Class2_Sub6 method8566(@OriginalArg(0) Class33 arg0) {
		@Pc(11) Class128 local11 = this.method3612(2048, arg0);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class47 local18 = arg0.method6225();
		local18.method7866(this.anInt4206);
		local18.method7871(this.anInt4201);
		local18.method7876((int) this.aDouble18, (int) this.aDouble24, (int) this.aDouble22);
		this.method3615(arg0, local18, local11);
		@Pc(50) Class2_Sub6 local50 = Static481.method2823(1, false);
		if (Static216.aBoolean440) {
			local11.method6294(local18, local50.aClass2_Sub5Array1[0], Static467.anInt8440, 0);
		} else {
			local11.method6281(local18, local50.aClass2_Sub5Array1[0], 0);
		}
		if (this.aClass2_Sub2_5 != null) {
			@Pc(84) Class40 local84 = this.aClass2_Sub2_5.method222();
			if (Static216.aBoolean440) {
				arg0.method6214(local84, Static467.anInt8440);
			} else {
				arg0.method6160(local84);
			}
		}
		this.aBoolean361 = local11.F();
		this.anInt4197 = local11.fa();
		this.anInt4205 = local11.ma();
		return local50;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public void method3608() {
		if (this.aBoolean360 || this.anInt4185 == 0) {
			return;
		}
		@Pc(21) Class2_Sub3_Sub1_Sub2 local21 = null;
		@Pc(29) int local29;
		if (this.anInt4185 >= 0) {
			local29 = this.anInt4185 - 1;
			@Pc(36) Class3_Sub49 local36 = (Class3_Sub49) Static60.aClass307_6.method7424((long) local29);
			if (local36 != null) {
				local21 = local36.aClass2_Sub3_Sub1_Sub2_Sub1_2;
			}
		} else {
			local29 = -this.anInt4185 - 1;
			if (Static399.anInt7626 == local29) {
				local21 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2;
			} else {
				local21 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local29];
			}
		}
		if (local21 == null) {
			return;
		}
		super.anInt10424 = local21.anInt10424;
		super.anInt10428 = local21.anInt10428;
		super.anInt10429 = Static202.method3958(local21.anInt10424, super.aByte128, local21.anInt10428) - this.anInt4176;
		if (this.anInt4183 < 0) {
			return;
		}
		@Pc(89) Class232 local89 = local21.method5304();
		@Pc(91) int local91 = 0;
		@Pc(93) int local93 = 0;
		if (local89.anIntArrayArray66 != null && local89.anIntArrayArray66[this.anInt4183] != null) {
			local93 = local89.anIntArrayArray66[this.anInt4183][2];
			local91 = local89.anIntArrayArray66[this.anInt4183][0];
		}
		if (local89.anIntArrayArray65 != null && local89.anIntArrayArray65[this.anInt4183] != null) {
			local93 += local89.anIntArrayArray65[this.anInt4183][2];
			local91 += local89.anIntArrayArray65[this.anInt4183][0];
		}
		if (local91 != 0 || local93 != 0) {
			@Pc(163) int local163 = local21.aClass145_7.method4535();
			@Pc(165) int local165 = local163;
			if (local21.anIntArray373 != null && local21.anIntArray373[this.anInt4183] != -1) {
				local165 = local21.anIntArray373[this.anInt4183];
			}
			@Pc(189) int local189 = local165 - local163 & 0x3FFF;
			@Pc(193) int local193 = Class3_Sub1_Sub2.anIntArray84[local189];
			@Pc(197) int local197 = Class3_Sub1_Sub2.anIntArray85[local189];
			@Pc(207) int local207 = local193 * local93 + local197 * local91 >> 14;
			local93 = local93 * local197 - local193 * local91 >> 14;
			super.anInt10424 += local93;
			super.anInt10428 += local207;
		}
		return;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
	public void method3609(@OriginalArg(1) int arg0) {
		this.aDouble18 += (double) arg0 * this.aDouble25;
		this.aBoolean360 = true;
		this.aDouble22 += this.aDouble21 * (double) arg0;
		if (this.aBoolean362) {
			this.aDouble24 = Static202.method3958((int) this.aDouble22, super.aByte128, (int) this.aDouble18) - this.anInt4176;
		} else if (this.anInt4194 == -1) {
			this.aDouble24 += (double) arg0 * this.aDouble19;
		} else {
			this.aDouble24 += (double) arg0 * 0.5D * this.aDouble20 * (double) arg0 + (double) arg0 * this.aDouble19;
			this.aDouble19 += this.aDouble20 * (double) arg0;
		}
		this.anInt4201 = (int) (Math.atan2(this.aDouble25, this.aDouble21) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt4206 = (int) (Math.atan2(this.aDouble19, this.aDouble23) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass290_2 == null) {
			return;
		}
		this.anInt4184 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass290_2.anIntArray548[this.anInt4180] >= this.anInt4184) {
						return;
					}
					this.anInt4184 -= this.aClass290_2.anIntArray548[this.anInt4180];
					this.anInt4180++;
					if (this.aClass290_2.anIntArray550.length <= this.anInt4180) {
						this.anInt4180 -= this.aClass290_2.anInt8684;
						if (this.anInt4180 < 0 || this.anInt4180 >= this.aClass290_2.anIntArray550.length) {
							this.anInt4180 = 0;
						}
					}
					this.anInt4177 = this.anInt4180 + 1;
				} while (this.anInt4177 < this.aClass290_2.anIntArray550.length);
				this.anInt4177 -= this.aClass290_2.anInt8684;
			} while (this.anInt4177 >= 0 && this.anInt4177 < this.aClass290_2.anIntArray550.length);
			this.anInt4177 = -1;
		}
	}

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8579() {
		return this.aBoolean361;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIBLclient!ha;)Z")
	@Override
	public boolean method8573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V")
	public void method3610() {
		if (this.aClass2_Sub2_5 != null) {
			this.aClass2_Sub2_5.method232();
		}
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8570() {
		return false;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZILclient!mb;Lclient!ha;III)V")
	@Override
	public void method8569(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub3 arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "(B)V")
	@Override
	public void method8581() {
		super.aShort121 = super.aShort122 = (short) (this.aDouble18 / 512.0D);
		super.aShort124 = super.aShort123 = (short) (this.aDouble22 / 512.0D);
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8564() {
		return false;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BILclient!ha;)Lclient!ka;")
	private Class128 method3612(@OriginalArg(1) int arg0, @OriginalArg(2) Class33 arg1) {
		@Pc(15) Class268 local15 = Static35.aClass343_1.method8033(this.anInt4195);
		return local15.method6746(arg1, Static618.aClass222_2, arg0, this.anInt4180, this.anInt4177, this.anInt4184);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIBII)V")
	public void method3613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean360) {
			local13 = arg2 - super.anInt10428;
			@Pc(20) double local20 = (double) (arg3 - super.anInt10424);
			@Pc(29) double local29 = Math.sqrt(local13 * local13 + local20 * local20);
			this.aDouble18 = (double) this.anInt4189 * local13 / local29 + (double) super.anInt10428;
			this.aDouble22 = (double) super.anInt10424 + (double) this.anInt4189 * local20 / local29;
			if (this.aBoolean362) {
				this.aDouble24 = Static202.method3958((int) this.aDouble22, super.aByte128, (int) this.aDouble18) - this.anInt4176;
			} else {
				this.aDouble24 = super.anInt10429;
			}
		}
		local13 = this.anInt4178 + 1 - arg1;
		this.aDouble21 = ((double) arg3 - this.aDouble22) / local13;
		this.aDouble25 = ((double) arg2 - this.aDouble18) / local13;
		this.aDouble23 = Math.sqrt(this.aDouble25 * this.aDouble25 + this.aDouble21 * this.aDouble21);
		if (this.anInt4194 == -1) {
			this.aDouble19 = ((double) arg0 - this.aDouble24) / local13;
		} else {
			if (!this.aBoolean360) {
				this.aDouble19 = -this.aDouble23 * Math.tan((double) this.anInt4194 * 0.02454369D);
			}
			this.aDouble20 = ((double) arg0 - this.aDouble24 - local13 * this.aDouble19) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(Lclient!ha;B)Lclient!ufa;")
	@Override
	public Class332 method8572(@OriginalArg(0) Class33 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!ha;Lclient!wc;ZLclient!ka;)V")
	private void method3615(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(3) Class128 arg2) {
		arg2.method6287(arg1);
		@Pc(9) Class18[] local9 = arg2.method6277();
		@Pc(12) Class215[] local12 = arg2.method6278();
		if ((this.aClass2_Sub2_5 == null || this.aClass2_Sub2_5.aBoolean15) && (local9 != null || local12 != null)) {
			this.aClass2_Sub2_5 = Static15.method226(Static251.anInt5580, true);
		}
		if (this.aClass2_Sub2_5 != null) {
			this.aClass2_Sub2_5.method223(arg0, (long) Static251.anInt5580, local9, local12);
			this.aClass2_Sub2_5.method233(super.aByte128, super.aShort121, super.aShort122, super.aShort124, super.aShort123);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8565(@OriginalArg(1) Class33 arg0) {
		@Pc(9) Class128 local9 = this.method3612(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class47 local15 = arg0.method6225();
		local15.method7866(this.anInt4206);
		local15.method7871(this.anInt4201);
		local15.method7876((int) this.aDouble18, (int) this.aDouble24, (int) this.aDouble22);
		this.anInt4197 = local9.fa();
		this.anInt4205 = local9.ma();
		this.method3615(arg0, local15, local9);
	}

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)V")
	@Override
	public void method8563() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "(B)I")
	@Override
	public int method8575(@OriginalArg(0) byte arg0) {
		if (arg0 != 30) {
			this.method8579();
		}
		return this.anInt4205;
	}
}

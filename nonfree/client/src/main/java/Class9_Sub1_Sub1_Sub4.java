import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jja")
public final class Class9_Sub1_Sub1_Sub4 extends Class9_Sub1_Sub1 {

	@OriginalMember(owner = "client!jja", name = "ib", descriptor = "I")
	private int anInt5028;

	@OriginalMember(owner = "client!jja", name = "tb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!jja", name = "ob", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!jja", name = "V", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!jja", name = "kb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!jja", name = "jb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!jja", name = "Eb", descriptor = "I")
	private int anInt5048;

	@OriginalMember(owner = "client!jja", name = "X", descriptor = "Lclient!ms;")
	private Class9_Sub5 aClass9_Sub5_6;

	@OriginalMember(owner = "client!jja", name = "qb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!jja", name = "bb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!jja", name = "vb", descriptor = "D")
	private double aDouble10;

	@OriginalMember(owner = "client!jja", name = "eb", descriptor = "I")
	private int anInt5036 = 0;

	@OriginalMember(owner = "client!jja", name = "db", descriptor = "Z")
	private boolean aBoolean330 = false;

	@OriginalMember(owner = "client!jja", name = "Ab", descriptor = "Z")
	private boolean aBoolean331 = false;

	@OriginalMember(owner = "client!jja", name = "Kb", descriptor = "I")
	private int anInt5056 = 0;

	@OriginalMember(owner = "client!jja", name = "T", descriptor = "I")
	public final int anInt5044;

	@OriginalMember(owner = "client!jja", name = "fb", descriptor = "I")
	public final int anInt5029;

	@OriginalMember(owner = "client!jja", name = "xb", descriptor = "I")
	private final int anInt5043;

	@OriginalMember(owner = "client!jja", name = "Hb", descriptor = "I")
	private final int anInt5060;

	@OriginalMember(owner = "client!jja", name = "rb", descriptor = "I")
	private final int anInt5039;

	@OriginalMember(owner = "client!jja", name = "ub", descriptor = "I")
	public final int anInt5052;

	@OriginalMember(owner = "client!jja", name = "gb", descriptor = "Z")
	private final boolean aBoolean332;

	@OriginalMember(owner = "client!jja", name = "ab", descriptor = "I")
	public final int anInt5053;

	@OriginalMember(owner = "client!jja", name = "Mb", descriptor = "I")
	private final int anInt5041;

	@OriginalMember(owner = "client!jja", name = "R", descriptor = "I")
	private final int anInt5037;

	@OriginalMember(owner = "client!jja", name = "U", descriptor = "I")
	private final int anInt5034;

	@OriginalMember(owner = "client!jja", name = "Jb", descriptor = "Lclient!rf;")
	private final Class45 aClass45_7;

	@OriginalMember(owner = "client!jja", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class9_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static77.method1633(arg4, arg3, arg1) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt5044 = arg7;
		this.anInt5029 = arg6;
		this.anInt5043 = arg10;
		this.anInt5060 = arg14;
		this.anInt5039 = arg8;
		this.aBoolean331 = false;
		this.anInt5052 = arg11;
		this.aBoolean332 = arg13;
		this.anInt5053 = arg12;
		this.anInt5041 = arg5;
		this.anInt5037 = arg0;
		this.anInt5034 = arg9;
		@Pc(82) int local82 = Static381.aClass106_2.method2618(this.anInt5037).anInt3453;
		this.aClass45_7 = new Class45_Sub2(this, false);
		this.aClass45_7.method6576(local82);
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(Lclient!ee;Lclient!ha;IZIIZ)V")
	@Override
	public void method9091(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(B)V")
	public void method4624() {
		if (this.aClass9_Sub5_6 != null) {
			this.aClass9_Sub5_6.method5583();
		}
	}

	@OriginalMember(owner = "client!jja", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method9084() {
		return this.aBoolean330;
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(I)V")
	public void method4625() {
		if (this.aBoolean331 || this.anInt5043 == 0) {
			return;
		}
		@Pc(18) Class9_Sub1_Sub1_Sub2 local18 = null;
		if (Static103.anInt2245 == 3) {
			local18 = Static470.aClass7Array1[this.anInt5043 - 1].method249();
		} else {
			@Pc(36) int local36;
			if (this.anInt5043 >= 0) {
				local36 = this.anInt5043 - 1;
				@Pc(43) Class3_Sub52 local43 = (Class3_Sub52) Static94.aClass313_8.method7104((long) local36);
				if (local43 != null) {
					local18 = local43.aClass9_Sub1_Sub1_Sub2_Sub2_2;
				}
			} else {
				local36 = -this.anInt5043 - 1;
				if (local36 == Static574.anInt8718) {
					local18 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2;
				} else {
					local18 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local36];
				}
			}
		}
		if (local18 == null) {
			return;
		}
		super.anInt10695 = local18.anInt10695;
		super.anInt10694 = local18.anInt10694;
		super.anInt10690 = Static77.method1633(local18.anInt10695, local18.anInt10694, super.aByte139) - this.anInt5041;
		if (this.anInt5060 < 0) {
			return;
		}
		@Pc(114) Class226 local114 = local18.method7489();
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		if (local114.anIntArrayArray30 != null && local114.anIntArrayArray30[this.anInt5060] != null) {
			local118 = local114.anIntArrayArray30[this.anInt5060][2];
			local116 = local114.anIntArrayArray30[this.anInt5060][0];
		}
		if (local114.anIntArrayArray29 != null && local114.anIntArrayArray29[this.anInt5060] != null) {
			local116 += local114.anIntArrayArray29[this.anInt5060][0];
			local118 += local114.anIntArrayArray29[this.anInt5060][2];
		}
		if (local116 != 0 || local118 != 0) {
			@Pc(194) int local194 = local18.aClass365_7.method8385();
			@Pc(196) int local196 = local194;
			if (local18.anIntArray642 != null && local18.anIntArray642[this.anInt5060] != -1) {
				local196 = local18.anIntArray642[this.anInt5060];
			}
			@Pc(222) int local222 = local196 - local194 & 0x3FFF;
			@Pc(226) int local226 = Class3_Sub7_Sub17_Sub1.anIntArray549[local222];
			@Pc(230) int local230 = Class3_Sub7_Sub17_Sub1.anIntArray548[local222];
			@Pc(240) int local240 = local118 * local226 + local230 * local116 >> 14;
			local118 = local118 * local230 - local116 * local226 >> 14;
			super.anInt10695 += local118;
			super.anInt10694 += local240;
		}
		return;
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(Lclient!ha;ILclient!cl;Lclient!ka;)V")
	private void method4626(@OriginalArg(0) Class22 arg0, @OriginalArg(2) Class58 arg1, @OriginalArg(3) Class170 arg2) {
		arg2.method8357(arg1);
		@Pc(9) Class184[] local9 = arg2.method8354();
		@Pc(20) Class232[] local20 = arg2.method8352();
		if ((this.aClass9_Sub5_6 == null || this.aClass9_Sub5_6.aBoolean434) && (local9 != null || local20 != null)) {
			this.aClass9_Sub5_6 = Static421.method5577(Static716.anInt11157, true);
		}
		if (this.aClass9_Sub5_6 != null) {
			this.aClass9_Sub5_6.method5585(arg0, (long) Static716.anInt11157, local9, local20);
			this.aClass9_Sub5_6.method5570(super.aByte139, super.aShort123, super.aShort122, super.aShort120, super.aShort121);
		}
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9085(@OriginalArg(1) Class22 arg0) {
		@Pc(9) Class170 local9 = this.method4628(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(16) Class58 local16 = arg0.method9354();
		local16.method9510(this.anInt5048);
		local16.method9521(this.anInt5028);
		local16.method9509((int) this.aDouble4, (int) this.aDouble3, (int) this.aDouble8);
		this.anInt5036 = local9.fa();
		this.anInt5056 = local9.ma();
		this.method4626(arg0, local16, local9);
	}

	@OriginalMember(owner = "client!jja", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method9077() {
		return false;
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(IZ)V")
	public void method4627(@OriginalArg(0) int arg0) {
		this.aDouble8 += (double) arg0 * this.aDouble7;
		this.aBoolean331 = true;
		this.aDouble4 += (double) arg0 * this.aDouble9;
		if (this.aBoolean332) {
			this.aDouble3 = (double) (Static77.method1633((int) this.aDouble8, (int) this.aDouble4, super.aByte139) - this.anInt5041);
		} else if (this.anInt5039 == -1) {
			this.aDouble3 += this.aDouble6 * (double) arg0;
		} else {
			this.aDouble3 += this.aDouble6 * (double) arg0 + (double) arg0 * (double) arg0 * this.aDouble10 * 0.5D;
			this.aDouble6 += this.aDouble10 * (double) arg0;
		}
		this.anInt5028 = (int) (Math.atan2(this.aDouble9, this.aDouble7) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt5048 = (int) (Math.atan2(this.aDouble6, this.aDouble5) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass45_7.method6593(1) && this.aClass45_7.method6584()) {
			this.aClass45_7.method6591();
		}
	}

	@OriginalMember(owner = "client!jja", name = "b", descriptor = "(ILclient!ha;)Lclient!tc;")
	@Override
	public Class354 method9080(@OriginalArg(1) Class22 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(ZLclient!ha;)Lclient!nk;")
	@Override
	public Class9_Sub6 method9092(@OriginalArg(1) Class22 arg0) {
		@Pc(16) Class170 local16 = this.method4628(2048, arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(24) Class58 local24 = arg0.method9354();
		local24.method9510(this.anInt5048);
		local24.method9521(this.anInt5028);
		local24.method9509((int) this.aDouble4, (int) this.aDouble3, (int) this.aDouble8);
		this.method4626(arg0, local24, local16);
		@Pc(60) Class9_Sub6 local60 = Static135.method9083(1, false);
		if (Static444.aBoolean451) {
			local16.method8350(local24, local60.aClass9_Sub9Array1[0], Static668.anInt10260, 0);
		} else {
			local16.method8360(local24, local60.aClass9_Sub9Array1[0], 0);
		}
		if (this.aClass9_Sub5_6 != null) {
			@Pc(92) Class346 local92 = this.aClass9_Sub5_6.method5580();
			if (Static444.aBoolean451) {
				arg0.method9360(local92, Static668.anInt10260);
			} else {
				arg0.method9384(local92);
			}
		}
		this.aBoolean330 = local16.F();
		this.anInt5036 = local16.fa();
		this.anInt5056 = local16.ma();
		return local60;
	}

	@OriginalMember(owner = "client!jja", name = "c", descriptor = "(Z)I")
	@Override
	public int method9081() {
		return this.anInt5036;
	}

	@OriginalMember(owner = "client!jja", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9093() {
		return false;
	}

	@OriginalMember(owner = "client!jja", name = "h", descriptor = "(I)V")
	@Override
	public void method9097() {
		super.aShort123 = super.aShort122 = (short) (int) (this.aDouble4 / 512.0D);
		super.aShort120 = super.aShort121 = (short) (int) (this.aDouble8 / 512.0D);
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(IZLclient!ha;)Lclient!ka;")
	private Class170 method4628(@OriginalArg(0) int arg0, @OriginalArg(2) Class22 arg1) {
		@Pc(9) Class139 local9 = Static381.aClass106_2.method2618(this.anInt5037);
		return local9.method3146(arg0, this.aClass45_7, arg1, (byte) 2);
	}

	@OriginalMember(owner = "client!jja", name = "g", descriptor = "(B)I")
	@Override
	public int method9095(@OriginalArg(0) byte arg0) {
		if (arg0 >= -5) {
			this.method9092((Class22) null);
		}
		return this.anInt5056;
	}

	@OriginalMember(owner = "client!jja", name = "f", descriptor = "(I)V")
	@Override
	public void method9086() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jja", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass9_Sub5_6 != null) {
			this.aClass9_Sub5_6.method5583();
		}
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method9089(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!jja", name = "b", descriptor = "(IIIII)V")
	public void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean331) {
			local9 = (double) (arg1 - super.anInt10694);
			@Pc(16) double local16 = (double) (arg3 - super.anInt10695);
			@Pc(25) double local25 = Math.sqrt(local9 * local9 + local16 * local16);
			this.aDouble8 = local16 * (double) this.anInt5034 / local25 + (double) super.anInt10695;
			this.aDouble4 = local9 * (double) this.anInt5034 / local25 + (double) super.anInt10694;
			if (this.aBoolean332) {
				this.aDouble3 = (double) (Static77.method1633((int) this.aDouble8, (int) this.aDouble4, super.aByte139) - this.anInt5041);
			} else {
				this.aDouble3 = (double) super.anInt10690;
			}
		}
		local9 = (double) (this.anInt5044 + 1 - arg2);
		this.aDouble7 = ((double) arg3 - this.aDouble8) / local9;
		this.aDouble9 = ((double) arg1 - this.aDouble4) / local9;
		this.aDouble5 = Math.sqrt(this.aDouble9 * this.aDouble9 + this.aDouble7 * this.aDouble7);
		if (this.anInt5039 == -1) {
			this.aDouble6 = ((double) arg0 - this.aDouble3) / local9;
		} else {
			if (!this.aBoolean331) {
				this.aDouble6 = -this.aDouble5 * Math.tan((double) this.anInt5039 * 0.02454369D);
			}
			this.aDouble10 = ((double) arg0 - this.aDouble6 * local9 - this.aDouble3) * 2.0D / (local9 * local9);
		}
	}
}

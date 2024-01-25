import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class19_Sub1_Sub3_Sub1 extends Class19_Sub1_Sub3 {

	@OriginalMember(owner = "client!ev", name = "lb", descriptor = "I")
	public static int lb = 0;

	@OriginalMember(owner = "client!ev", name = "xb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ev", name = "Fb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ev", name = "X", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!ev", name = "Hb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!ev", name = "ub", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!ev", name = "W", descriptor = "Lclient!oi;")
	private Class19_Sub9 aClass19_Sub9_2;

	@OriginalMember(owner = "client!ev", name = "mb", descriptor = "I")
	private int anInt3028;

	@OriginalMember(owner = "client!ev", name = "vb", descriptor = "D")
	private double aDouble10;

	@OriginalMember(owner = "client!ev", name = "eb", descriptor = "I")
	private int anInt3038;

	@OriginalMember(owner = "client!ev", name = "kb", descriptor = "D")
	private double aDouble11;

	@OriginalMember(owner = "client!ev", name = "cb", descriptor = "D")
	private double aDouble12;

	@OriginalMember(owner = "client!ev", name = "R", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!ev", name = "ob", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!ev", name = "qb", descriptor = "I")
	private int anInt3034 = 0;

	@OriginalMember(owner = "client!ev", name = "fb", descriptor = "I")
	private int anInt3037 = 0;

	@OriginalMember(owner = "client!ev", name = "tb", descriptor = "I")
	public final int anInt3033;

	@OriginalMember(owner = "client!ev", name = "hb", descriptor = "I")
	private final int anInt3041;

	@OriginalMember(owner = "client!ev", name = "Z", descriptor = "Z")
	private final boolean aBoolean244;

	@OriginalMember(owner = "client!ev", name = "S", descriptor = "I")
	private final int anInt3035;

	@OriginalMember(owner = "client!ev", name = "Q", descriptor = "I")
	private final int anInt3032;

	@OriginalMember(owner = "client!ev", name = "U", descriptor = "I")
	private final int anInt3012;

	@OriginalMember(owner = "client!ev", name = "Cb", descriptor = "I")
	public final int anInt3023;

	@OriginalMember(owner = "client!ev", name = "Gb", descriptor = "I")
	public final int anInt3031;

	@OriginalMember(owner = "client!ev", name = "V", descriptor = "I")
	private final int anInt3025;

	@OriginalMember(owner = "client!ev", name = "jb", descriptor = "I")
	private final int anInt3011;

	@OriginalMember(owner = "client!ev", name = "K", descriptor = "I")
	public final int anInt3019;

	@OriginalMember(owner = "client!ev", name = "ab", descriptor = "Lclient!js;")
	private final Class100 aClass100_2;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class19_Sub1_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static505.method7237(arg1, arg4, arg3) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt3033 = arg11;
		this.anInt3041 = arg10;
		this.aBoolean244 = arg13;
		this.anInt3035 = arg9;
		this.anInt3032 = arg5;
		this.anInt3012 = arg14;
		this.aBoolean245 = false;
		this.anInt3023 = arg6;
		this.anInt3031 = arg7;
		this.anInt3025 = arg0;
		this.anInt3011 = arg8;
		this.anInt3019 = arg12;
		@Pc(81) int local81 = Static660.aClass307_2.method7493(this.anInt3025).anInt8987;
		this.aClass100_2 = new Class100_Sub1(this, false);
		this.aClass100_2.method8962(local81);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZILclient!ha;IILclient!bla;I)V")
	@Override
	public void method9373(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class19_Sub1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)V")
	public void method2615() {
		if (this.aClass19_Sub9_2 != null) {
			this.aClass19_Sub9_2.method6766();
		}
	}

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method9368() {
		return false;
	}

	@OriginalMember(owner = "client!ev", name = "f", descriptor = "(B)V")
	@Override
	public void method9367() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(Z)V")
	@Override
	public void method8182() {
		super.aShort121 = super.aShort123 = (short) (int) (this.aDouble6 / 512.0D);
		super.aShort124 = super.aShort122 = (short) (int) (this.aDouble10 / 512.0D);
	}

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9366() {
		return false;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9374(@OriginalArg(0) Class67 arg0) {
		@Pc(9) Class157 local9 = this.method2619(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(16) Class181 local16 = arg0.method7693();
		local16.method6345(this.anInt3028);
		local16.method6358(this.anInt3038);
		local16.method6354((int) this.aDouble6, (int) this.aDouble8, (int) this.aDouble10);
		this.anInt3037 = local9.fa();
		this.anInt3034 = local9.ma();
		this.method2616(local16, local9, arg0);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILclient!iu;Lclient!ka;Lclient!ha;)V")
	private void method2616(@OriginalArg(1) Class181 arg0, @OriginalArg(2) Class157 arg1, @OriginalArg(3) Class67 arg2) {
		arg1.method5226(arg0);
		@Pc(17) Class156[] local17 = arg1.method5214();
		@Pc(20) Class348[] local20 = arg1.method5222();
		if ((this.aClass19_Sub9_2 == null || this.aClass19_Sub9_2.aBoolean615) && (local17 != null || local20 != null)) {
			this.aClass19_Sub9_2 = Static457.method6772(Static269.anInt4883, true);
		}
		if (this.aClass19_Sub9_2 != null) {
			this.aClass19_Sub9_2.method6774(arg2, (long) Static269.anInt4883, local17, local20);
			this.aClass19_Sub9_2.method6768(super.aByte146, super.aShort121, super.aShort123, super.aShort124, super.aShort122);
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!ha;B)Lclient!dfa;")
	@Override
	public Class68 method9371(@OriginalArg(0) Class67 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "(B)I")
	@Override
	public int method9364() {
		return this.anInt3037;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIII)V")
	public void method2618(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) double local11;
		if (!this.aBoolean245) {
			local11 = (double) (arg2 - super.anInt11204);
			@Pc(18) double local18 = (double) (arg1 - super.anInt11211);
			@Pc(27) double local27 = Math.sqrt(local18 * local18 + local11 * local11);
			this.aDouble10 = (double) super.anInt11211 + (double) this.anInt3035 * local18 / local27;
			this.aDouble6 = (double) this.anInt3035 * local11 / local27 + (double) super.anInt11204;
			if (this.aBoolean244) {
				this.aDouble8 = (double) (Static505.method7237(super.aByte146, (int) this.aDouble10, (int) this.aDouble6) - this.anInt3032);
			} else {
				this.aDouble8 = (double) super.anInt11208;
			}
		}
		local11 = (double) (this.anInt3031 + 1 - arg3);
		this.aDouble11 = ((double) arg2 - this.aDouble6) / local11;
		this.aDouble12 = ((double) arg1 - this.aDouble10) / local11;
		this.aDouble5 = Math.sqrt(this.aDouble11 * this.aDouble11 + this.aDouble12 * this.aDouble12);
		if (this.anInt3011 == -1) {
			this.aDouble9 = ((double) arg0 - this.aDouble8) / local11;
		} else {
			if (!this.aBoolean245) {
				this.aDouble9 = -this.aDouble5 * Math.tan((double) this.anInt3011 * 0.02454369D);
			}
			this.aDouble7 = ((double) arg0 - this.aDouble8 - this.aDouble9 * local11) * 2.0D / (local11 * local11);
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class157 method2619(@OriginalArg(1) int arg0, @OriginalArg(2) Class67 arg1) {
		@Pc(11) Class310 local11 = Static660.aClass307_2.method7493(this.anInt3025);
		return local11.method7502(this.aClass100_2, (byte) 2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method9360() {
		return this.aBoolean243;
	}

	@OriginalMember(owner = "client!ev", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass19_Sub9_2 != null) {
			this.aClass19_Sub9_2.method6766();
		}
	}

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "(I)I")
	@Override
	public int method9361(@OriginalArg(0) int arg0) {
		if (arg0 != 4) {
			this.aDouble11 = -0.3029779103039161D;
		}
		return this.anInt3034;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!ha;I)Lclient!mla;")
	@Override
	public Class19_Sub8 method9377(@OriginalArg(0) Class67 arg0) {
		@Pc(23) Class157 local23 = this.method2619(2048, arg0);
		if (local23 == null) {
			return null;
		}
		@Pc(31) Class181 local31 = arg0.method7693();
		local31.method6345(this.anInt3028);
		local31.method6358(this.anInt3038);
		local31.method6354((int) this.aDouble6, (int) this.aDouble8, (int) this.aDouble10);
		this.method2616(local31, local23, arg0);
		@Pc(61) Class19_Sub8 local61 = Static58.method727(1, false);
		if (Static568.aBoolean784) {
			local23.method5227(local31, local61.aClass19_Sub6Array1[0], Static705.anInt11029, 0);
		} else {
			local23.method5232(local31, local61.aClass19_Sub6Array1[0], 0);
		}
		if (this.aClass19_Sub9_2 != null) {
			@Pc(93) Class162 local93 = this.aClass19_Sub9_2.method6779();
			if (Static568.aBoolean784) {
				arg0.method7692(local93, Static705.anInt11029);
			} else {
				arg0.method7656(local93);
			}
		}
		this.aBoolean243 = local23.F();
		this.anInt3037 = local23.fa();
		this.anInt3034 = local23.ma();
		return local61;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method9369(@OriginalArg(1) int arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
	public void method2620() {
		if (this.aBoolean245 || this.anInt3041 == 0) {
			return;
		}
		@Pc(13) Class19_Sub1_Sub3_Sub2 local13 = null;
		if (Static334.anInt5845 == 3) {
			local13 = Static154.aClass11Array1[this.anInt3041 - 1].method295();
		} else {
			@Pc(27) int local27;
			if (this.anInt3041 < 0) {
				local27 = -this.anInt3041 - 1;
				if (Static584.anInt9539 == local27) {
					local13 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2;
				} else {
					local13 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local27];
				}
			} else {
				local27 = this.anInt3041 - 1;
				@Pc(50) Class3_Sub13 local50 = (Class3_Sub13) Static612.aClass136_44.method3503((long) local27);
				if (local50 != null) {
					local13 = local50.aClass19_Sub1_Sub3_Sub2_Sub1_2;
				}
			}
		}
		if (local13 == null) {
			return;
		}
		super.anInt11211 = local13.anInt11211;
		super.anInt11204 = local13.anInt11204;
		super.anInt11208 = Static505.method7237(super.aByte146, local13.anInt11211, local13.anInt11204) - this.anInt3032;
		if (this.anInt3012 < 0) {
			return;
		}
		@Pc(101) Class274 local101 = local13.method6600();
		@Pc(103) int local103 = 0;
		@Pc(105) int local105 = 0;
		if (local101.anIntArrayArray44 != null && local101.anIntArrayArray44[this.anInt3012] != null) {
			local103 = local101.anIntArrayArray44[this.anInt3012][0];
			local105 = local101.anIntArrayArray44[this.anInt3012][2];
		}
		if (local101.anIntArrayArray43 != null && local101.anIntArrayArray43[this.anInt3012] != null) {
			local105 += local101.anIntArrayArray43[this.anInt3012][2];
			local103 += local101.anIntArrayArray43[this.anInt3012][0];
		}
		if (local103 == 0 && local105 == 0) {
			return;
		}
		@Pc(184) int local184 = local13.aClass340_7.method8085();
		@Pc(186) int local186 = local184;
		if (local13.anIntArray429 != null && local13.anIntArray429[this.anInt3012] != -1) {
			local186 = local13.anIntArray429[this.anInt3012];
		}
		@Pc(211) int local211 = local186 - local184 & 0x3FFF;
		@Pc(215) int local215 = Class3_Sub2_Sub21.anIntArray358[local211];
		@Pc(219) int local219 = Class3_Sub2_Sub21.anIntArray356[local211];
		@Pc(230) int local230 = local105 * local215 + local103 * local219 >> 14;
		local105 = local219 * local105 - local215 * local103 >> 14;
		super.anInt11211 += local105;
		super.anInt11204 += local230;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZI)V")
	public void method2621(@OriginalArg(1) int arg0) {
		this.aBoolean245 = true;
		this.aDouble6 += (double) arg0 * this.aDouble11;
		this.aDouble10 += this.aDouble12 * (double) arg0;
		if (this.aBoolean244) {
			this.aDouble8 = (double) (Static505.method7237(super.aByte146, (int) this.aDouble10, (int) this.aDouble6) - this.anInt3032);
		} else if (this.anInt3011 == -1) {
			this.aDouble8 += (double) arg0 * this.aDouble9;
		} else {
			this.aDouble8 += this.aDouble7 * 0.5D * (double) arg0 * (double) arg0 + this.aDouble9 * (double) arg0;
			this.aDouble9 += this.aDouble7 * (double) arg0;
		}
		this.anInt3038 = (int) (Math.atan2(this.aDouble11, this.aDouble12) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt3028 = (int) (Math.atan2(this.aDouble9, this.aDouble5) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass100_2.method8971(1) && this.aClass100_2.method8959()) {
			this.aClass100_2.method8958();
		}
	}
}

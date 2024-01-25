import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eha")
public final class Class34_Sub1_Sub1_Sub3 extends Class34_Sub1_Sub1 {

	@OriginalMember(owner = "client!eha", name = "Q", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!eha", name = "T", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!eha", name = "V", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!eha", name = "X", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!eha", name = "bb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!eha", name = "cb", descriptor = "Lclient!ls;")
	private Class34_Sub7 aClass34_Sub7_3;

	@OriginalMember(owner = "client!eha", name = "db", descriptor = "I")
	private int anInt2612;

	@OriginalMember(owner = "client!eha", name = "fb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!eha", name = "hb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!eha", name = "Jb", descriptor = "I")
	private int anInt2637;

	@OriginalMember(owner = "client!eha", name = "Nb", descriptor = "D")
	private double aDouble10;

	@OriginalMember(owner = "client!eha", name = "S", descriptor = "I")
	private int anInt2606 = 0;

	@OriginalMember(owner = "client!eha", name = "nb", descriptor = "I")
	private int anInt2618 = 0;

	@OriginalMember(owner = "client!eha", name = "Z", descriptor = "I")
	private int anInt2610 = 0;

	@OriginalMember(owner = "client!eha", name = "ob", descriptor = "I")
	private int anInt2619 = -1;

	@OriginalMember(owner = "client!eha", name = "Cb", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!eha", name = "vb", descriptor = "I")
	private int anInt2625 = 0;

	@OriginalMember(owner = "client!eha", name = "xb", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!eha", name = "gb", descriptor = "I")
	private final int anInt2614;

	@OriginalMember(owner = "client!eha", name = "P", descriptor = "Z")
	private final boolean aBoolean200;

	@OriginalMember(owner = "client!eha", name = "yb", descriptor = "I")
	public final int anInt2627;

	@OriginalMember(owner = "client!eha", name = "qb", descriptor = "I")
	private final int anInt2621;

	@OriginalMember(owner = "client!eha", name = "ab", descriptor = "I")
	private final int anInt2611;

	@OriginalMember(owner = "client!eha", name = "mb", descriptor = "I")
	public final int anInt2617;

	@OriginalMember(owner = "client!eha", name = "Gb", descriptor = "I")
	private final int anInt2634;

	@OriginalMember(owner = "client!eha", name = "zb", descriptor = "I")
	private final int anInt2628;

	@OriginalMember(owner = "client!eha", name = "Y", descriptor = "I")
	public final int anInt2609;

	@OriginalMember(owner = "client!eha", name = "eb", descriptor = "I")
	private final int anInt2613;

	@OriginalMember(owner = "client!eha", name = "jb", descriptor = "I")
	public final int anInt2615;

	@OriginalMember(owner = "client!eha", name = "ub", descriptor = "Lclient!mu;")
	private final Class239 aClass239_1;

	@OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class34_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static662.method8831(arg4, arg3, arg1) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt2614 = arg10;
		this.aBoolean200 = arg13;
		this.aBoolean201 = false;
		this.anInt2627 = arg11;
		this.anInt2621 = arg8;
		this.anInt2611 = arg14;
		this.anInt2617 = arg12;
		this.anInt2634 = arg0;
		this.anInt2628 = arg5;
		this.anInt2609 = arg6;
		this.anInt2613 = arg9;
		this.anInt2615 = arg7;
		@Pc(91) int local91 = Static366.aClass182_2.method4107(this.anInt2634).anInt2680;
		if (local91 == -1) {
			this.aClass239_1 = null;
		} else {
			this.aClass239_1 = Static13.aClass213_1.method5008(local91);
		}
	}

	@OriginalMember(owner = "client!eha", name = "b", descriptor = "(Z)I")
	@Override
	public int method7840(@OriginalArg(0) boolean arg0) {
		return arg0 ? -23 : this.anInt2618;
	}

	@OriginalMember(owner = "client!eha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass34_Sub7_3 != null) {
			this.aClass34_Sub7_3.method5094();
		}
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)V")
	public void method2306() {
		if (this.aClass34_Sub7_3 != null) {
			this.aClass34_Sub7_3.method5094();
		}
	}

	@OriginalMember(owner = "client!eha", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7845() {
		return false;
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(BI)V")
	public void method2307(@OriginalArg(1) int arg0) {
		this.aDouble6 += this.aDouble7 * (double) arg0;
		this.aDouble3 += (double) arg0 * this.aDouble9;
		this.aBoolean201 = true;
		if (this.aBoolean200) {
			this.aDouble10 = (double) (Static662.method8831((int) this.aDouble3, (int) this.aDouble6, super.aByte132) - this.anInt2628);
		} else if (this.anInt2621 == -1) {
			this.aDouble10 += this.aDouble8 * (double) arg0;
		} else {
			this.aDouble10 += (double) arg0 * this.aDouble4 * 0.5D * (double) arg0 + (double) arg0 * this.aDouble8;
			this.aDouble8 += this.aDouble4 * (double) arg0;
		}
		this.anInt2637 = (int) (Math.atan2(this.aDouble7, this.aDouble9) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt2612 = (int) (Math.atan2(this.aDouble8, this.aDouble5) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass239_1 == null) {
			return;
		}
		this.anInt2610 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt2610 <= this.aClass239_1.anIntArray337[this.anInt2625]) {
						return;
					}
					this.anInt2610 -= this.aClass239_1.anIntArray337[this.anInt2625];
					this.anInt2625++;
					if (this.anInt2625 >= this.aClass239_1.anIntArray339.length) {
						this.anInt2625 -= this.aClass239_1.anInt6414;
						if (this.anInt2625 < 0 || this.aClass239_1.anIntArray339.length <= this.anInt2625) {
							this.anInt2625 = 0;
						}
					}
					this.anInt2619 = this.anInt2625 + 1;
				} while (this.aClass239_1.anIntArray339.length > this.anInt2619);
				this.anInt2619 -= this.aClass239_1.anInt6414;
			} while (this.anInt2619 >= 0 && this.anInt2619 < this.aClass239_1.anIntArray339.length);
			this.anInt2619 = -1;
		}
	}

	@OriginalMember(owner = "client!eha", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7841() {
		return false;
	}

	@OriginalMember(owner = "client!eha", name = "k", descriptor = "(I)V")
	@Override
	public void method7856() {
		super.aShort99 = super.aShort96 = (short) (int) (this.aDouble3 / 512.0D);
		super.aShort98 = super.aShort97 = (short) (int) (this.aDouble6 / 512.0D);
	}

	@OriginalMember(owner = "client!eha", name = "e", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7849(@OriginalArg(0) Class95 arg0) {
		@Pc(9) Class149 local9 = this.method2308(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class17 local15 = arg0.method8013();
		local15.method6242(this.anInt2612);
		local15.method6234(this.anInt2637);
		local15.method6235((int) this.aDouble6, (int) this.aDouble10, (int) this.aDouble3);
		this.anInt2606 = local9.fa();
		this.anInt2618 = local9.ma();
		this.method2309(local15, arg0, local9);
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class149 method2308(@OriginalArg(1) int arg0, @OriginalArg(2) Class95 arg1) {
		@Pc(15) Class106 local15 = Static366.aClass182_2.method4107(this.anInt2634);
		return local15.method2345(this.anInt2619, arg0, Static13.aClass213_1, this.anInt2610, this.anInt2625, arg1);
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(Lclient!al;ZLclient!ha;Lclient!ka;)V")
	private void method2309(@OriginalArg(0) Class17 arg0, @OriginalArg(2) Class95 arg1, @OriginalArg(3) Class149 arg2) {
		arg2.method8848(arg0);
		@Pc(16) Class373[] local16 = arg2.method8867();
		@Pc(19) Class305[] local19 = arg2.method8861();
		if ((this.aClass34_Sub7_3 == null || this.aClass34_Sub7_3.aBoolean416) && (local16 != null || local19 != null)) {
			this.aClass34_Sub7_3 = Static350.method5095(Static122.anInt2190, true);
		}
		if (this.aClass34_Sub7_3 != null) {
			this.aClass34_Sub7_3.method5088(arg1, (long) Static122.anInt2190, local16, local19);
			this.aClass34_Sub7_3.method5101(super.aByte132, super.aShort98, super.aShort97, super.aShort99, super.aShort96);
		}
	}

	@OriginalMember(owner = "client!eha", name = "d", descriptor = "(B)I")
	@Override
	public int method7847() {
		return this.anInt2606;
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(Z)V")
	public void method2310() {
		if (this.aBoolean201 || this.anInt2614 == 0) {
			return;
		}
		@Pc(16) Class34_Sub1_Sub1_Sub2 local16 = null;
		@Pc(24) int local24;
		if (this.anInt2614 >= 0) {
			local24 = this.anInt2614 - 1;
			@Pc(31) Class3_Sub52 local31 = (Class3_Sub52) Static105.aClass333_11.method7489((long) local24);
			if (local31 != null) {
				local16 = local31.aClass34_Sub1_Sub1_Sub2_Sub2_2;
			}
		} else {
			local24 = -this.anInt2614 - 1;
			if (Static291.anInt4955 == local24) {
				local16 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1;
			} else {
				local16 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local24];
			}
		}
		if (local16 == null) {
			return;
		}
		super.anInt9614 = local16.anInt9614;
		super.anInt9619 = local16.anInt9619;
		super.anInt9622 = Static662.method8831(local16.anInt9619, local16.anInt9614, super.aByte132) - this.anInt2628;
		if (this.anInt2611 < 0) {
			return;
		}
		@Pc(87) Class286 local87 = local16.method7878();
		@Pc(89) int local89 = 0;
		@Pc(91) int local91 = 0;
		if (local87.anIntArrayArray43 != null && local87.anIntArrayArray43[this.anInt2611] != null) {
			local89 = local87.anIntArrayArray43[this.anInt2611][0];
			local91 = local87.anIntArrayArray43[this.anInt2611][2];
		}
		if (local87.anIntArrayArray42 != null && local87.anIntArrayArray42[this.anInt2611] != null) {
			local89 += local87.anIntArrayArray42[this.anInt2611][0];
			local91 += local87.anIntArrayArray42[this.anInt2611][2];
		}
		if (local89 != 0 || local91 != 0) {
			@Pc(161) int local161 = local16.aClass292_7.method6390();
			@Pc(163) int local163 = local161;
			if (local16.anIntArray522 != null && local16.anIntArray522[this.anInt2611] != -1) {
				local163 = local16.anIntArray522[this.anInt2611];
			}
			@Pc(187) int local187 = local163 - local161 & 0x3FFF;
			@Pc(191) int local191 = Class94.anIntArray561[local187];
			@Pc(195) int local195 = Class94.anIntArray560[local187];
			@Pc(205) int local205 = local195 * local89 + local191 * local91 >> 14;
			local91 = local91 * local195 - local89 * local191 >> 14;
			super.anInt9614 += local205;
			super.anInt9619 += local91;
		}
		return;
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method7850(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!eha", name = "h", descriptor = "(I)V")
	@Override
	public void method7848() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(ILclient!fq;BIILclient!ha;Z)V")
	@Override
	public void method7842(@OriginalArg(0) int arg0, @OriginalArg(1) Class34_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class95 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!eha", name = "d", descriptor = "(Lclient!ha;B)Lclient!ln;")
	@Override
	public Class214 method7846(@OriginalArg(0) Class95 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!eha", name = "c", descriptor = "(Lclient!ha;B)Lclient!pia;")
	@Override
	public Class34_Sub8 method7835(@OriginalArg(0) Class95 arg0) {
		@Pc(11) Class149 local11 = this.method2308(2048, arg0);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class17 local18 = arg0.method8013();
		local18.method6242(this.anInt2612);
		local18.method6234(this.anInt2637);
		local18.method6235((int) this.aDouble6, (int) this.aDouble10, (int) this.aDouble3);
		this.method2309(local18, arg0, local11);
		@Pc(48) Class34_Sub8 local48 = Static327.method4658(1, false);
		if (Static375.aBoolean532) {
			local11.method8869(local18, local48.aClass34_Sub6Array1[0], Static501.anInt7929, 0);
		} else {
			local11.method8857(local18, local48.aClass34_Sub6Array1[0], 0);
		}
		if (this.aClass34_Sub7_3 != null) {
			@Pc(81) Class347 local81 = this.aClass34_Sub7_3.method5100();
			if (Static375.aBoolean532) {
				arg0.method8051(local81, Static501.anInt7929);
			} else {
				arg0.method8057(local81);
			}
		}
		this.aBoolean202 = local11.F();
		this.anInt2606 = local11.fa();
		this.anInt2618 = local11.ma();
		return local48;
	}

	@OriginalMember(owner = "client!eha", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7853() {
		return this.aBoolean202;
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IIIII)V")
	public void method2312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) double local16;
		if (!this.aBoolean201) {
			local16 = (double) (arg0 - super.anInt9614);
			@Pc(23) double local23 = (double) (arg3 - super.anInt9619);
			@Pc(32) double local32 = Math.sqrt(local16 * local16 + local23 * local23);
			this.aDouble3 = (double) super.anInt9619 + (double) this.anInt2613 * local23 / local32;
			this.aDouble6 = (double) this.anInt2613 * local16 / local32 + (double) super.anInt9614;
			if (this.aBoolean200) {
				this.aDouble10 = (double) (Static662.method8831((int) this.aDouble3, (int) this.aDouble6, super.aByte132) - this.anInt2628);
			} else {
				this.aDouble10 = (double) super.anInt9622;
			}
		}
		local16 = (double) (this.anInt2615 + 1 - arg2);
		this.aDouble7 = ((double) arg0 - this.aDouble6) / local16;
		this.aDouble9 = ((double) arg3 - this.aDouble3) / local16;
		this.aDouble5 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble9 * this.aDouble9);
		if (this.anInt2621 == -1) {
			this.aDouble8 = ((double) arg1 - this.aDouble10) / local16;
		} else {
			if (!this.aBoolean201) {
				this.aDouble8 = -this.aDouble5 * Math.tan((double) this.anInt2621 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg1 - this.aDouble10 - this.aDouble8 * local16) * 2.0D / (local16 * local16);
		}
	}
}

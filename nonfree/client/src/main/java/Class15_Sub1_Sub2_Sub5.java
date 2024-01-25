import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class15_Sub1_Sub2_Sub5 extends Class15_Sub1_Sub2 {

	@OriginalMember(owner = "client!tca", name = "X", descriptor = "D")
	private double aDouble17;

	@OriginalMember(owner = "client!tca", name = "rb", descriptor = "D")
	private double aDouble18;

	@OriginalMember(owner = "client!tca", name = "Db", descriptor = "I")
	private int anInt9268;

	@OriginalMember(owner = "client!tca", name = "Fb", descriptor = "D")
	private double aDouble19;

	@OriginalMember(owner = "client!tca", name = "Hb", descriptor = "D")
	private double aDouble20;

	@OriginalMember(owner = "client!tca", name = "Ib", descriptor = "D")
	private double aDouble21;

	@OriginalMember(owner = "client!tca", name = "Jb", descriptor = "D")
	private double aDouble22;

	@OriginalMember(owner = "client!tca", name = "Kb", descriptor = "D")
	private double aDouble23;

	@OriginalMember(owner = "client!tca", name = "Mb", descriptor = "Lclient!pd;")
	private Class15_Sub8 aClass15_Sub8_7;

	@OriginalMember(owner = "client!tca", name = "Ob", descriptor = "D")
	private double aDouble24;

	@OriginalMember(owner = "client!tca", name = "Pb", descriptor = "I")
	private int anInt9273;

	@OriginalMember(owner = "client!tca", name = "hb", descriptor = "I")
	private int anInt9251 = 0;

	@OriginalMember(owner = "client!tca", name = "T", descriptor = "I")
	private int anInt9239 = -1;

	@OriginalMember(owner = "client!tca", name = "jb", descriptor = "I")
	private int anInt9253 = 0;

	@OriginalMember(owner = "client!tca", name = "gb", descriptor = "Z")
	private boolean aBoolean653 = false;

	@OriginalMember(owner = "client!tca", name = "ub", descriptor = "I")
	private int anInt9259 = 0;

	@OriginalMember(owner = "client!tca", name = "tb", descriptor = "Z")
	private boolean aBoolean655 = false;

	@OriginalMember(owner = "client!tca", name = "Lb", descriptor = "I")
	private int anInt9271 = 0;

	@OriginalMember(owner = "client!tca", name = "sb", descriptor = "I")
	public final int anInt9258;

	@OriginalMember(owner = "client!tca", name = "ab", descriptor = "I")
	private final int anInt9245;

	@OriginalMember(owner = "client!tca", name = "vb", descriptor = "I")
	private final int anInt9260;

	@OriginalMember(owner = "client!tca", name = "cb", descriptor = "I")
	private final int anInt9247;

	@OriginalMember(owner = "client!tca", name = "mb", descriptor = "I")
	private final int anInt9255;

	@OriginalMember(owner = "client!tca", name = "V", descriptor = "I")
	public final int anInt9241;

	@OriginalMember(owner = "client!tca", name = "wb", descriptor = "I")
	private final int anInt9261;

	@OriginalMember(owner = "client!tca", name = "Bb", descriptor = "I")
	public final int anInt9266;

	@OriginalMember(owner = "client!tca", name = "zb", descriptor = "I")
	public final int anInt9264;

	@OriginalMember(owner = "client!tca", name = "pb", descriptor = "Z")
	private final boolean aBoolean654;

	@OriginalMember(owner = "client!tca", name = "yb", descriptor = "I")
	private final int anInt9263;

	@OriginalMember(owner = "client!tca", name = "nb", descriptor = "Lclient!fba;")
	private final Class97 aClass97_3;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class15_Sub1_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static177.method3098(arg4, arg3, arg1) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt9258 = arg7;
		this.anInt9245 = arg9;
		this.anInt9260 = arg5;
		this.aBoolean653 = false;
		this.anInt9247 = arg0;
		this.anInt9255 = arg10;
		this.anInt9241 = arg11;
		this.anInt9261 = arg8;
		this.anInt9266 = arg6;
		this.anInt9264 = arg12;
		this.aBoolean654 = arg13;
		this.anInt9263 = arg14;
		@Pc(90) int local90 = Static202.aClass333_2.method7823(this.anInt9247).anInt2718;
		if (local90 == -1) {
			this.aClass97_3 = null;
		} else {
			this.aClass97_3 = Static28.aClass220_1.method5670(local90);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)V")
	public void method7559() {
		if (this.aClass15_Sub8_7 != null) {
			this.aClass15_Sub8_7.method6531();
		}
	}

	@OriginalMember(owner = "client!tca", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8328() {
		return this.aBoolean655;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!tca", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8332() {
		return false;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(ILclient!ha;)Lclient!lca;")
	@Override
	public Class191 method8319(@OriginalArg(1) Class16 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZLclient!ha;Lclient!rr;IIII)V")
	@Override
	public void method8322(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class15_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8327(@OriginalArg(0) Class16 arg0) {
		@Pc(9) Class83 local9 = this.method7561(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class54 local15 = arg0.method6124();
		local15.method5131(this.anInt9268);
		local15.method5145(this.anInt9273);
		local15.method5142((int) this.aDouble23, (int) this.aDouble21, (int) this.aDouble22);
		this.anInt9253 = local9.fa();
		this.anInt9259 = local9.ma();
		this.method7563(arg0, local9, local15);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class83 method7561(@OriginalArg(0) int arg0, @OriginalArg(2) Class16 arg1) {
		@Pc(9) Class73 local9 = Static202.aClass333_2.method7823(this.anInt9247);
		return local9.method2308(this.anInt9251, arg0, arg1, Static28.aClass220_1, this.anInt9239, this.anInt9271);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIIBI)V")
	public void method7562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) double local14;
		if (!this.aBoolean653) {
			local14 = arg0 - super.anInt10301;
			@Pc(20) double local20 = (double) (arg2 - super.anInt10298);
			@Pc(29) double local29 = Math.sqrt(local20 * local20 + local14 * local14);
			this.aDouble22 = (double) this.anInt9245 * local20 / local29 + (double) super.anInt10298;
			this.aDouble23 = (double) super.anInt10301 + (double) this.anInt9245 * local14 / local29;
			if (this.aBoolean654) {
				this.aDouble21 = Static177.method3098((int) this.aDouble22, (int) this.aDouble23, super.aByte124) - this.anInt9260;
			} else {
				this.aDouble21 = super.anInt10297;
			}
		}
		local14 = this.anInt9258 + 1 - arg1;
		this.aDouble20 = ((double) arg0 - this.aDouble23) / local14;
		this.aDouble18 = ((double) arg2 - this.aDouble22) / local14;
		this.aDouble17 = Math.sqrt(this.aDouble18 * this.aDouble18 + this.aDouble20 * this.aDouble20);
		if (this.anInt9261 == -1) {
			this.aDouble19 = ((double) arg3 - this.aDouble21) / local14;
		} else {
			if (!this.aBoolean653) {
				this.aDouble19 = -this.aDouble17 * Math.tan((double) this.anInt9261 * 0.02454369D);
			}
			this.aDouble24 = ((double) arg3 - this.aDouble21 - this.aDouble19 * local14) * 2.0D / (local14 * local14);
		}
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V")
	@Override
	public void method8317() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tca", name = "e", descriptor = "(Z)I")
	@Override
	public int method8333(@OriginalArg(0) boolean arg0) {
		return arg0 ? -73 : this.anInt9259;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ILclient!ha;Lclient!ka;Lclient!dfa;)V")
	private void method7563(@OriginalArg(1) Class16 arg0, @OriginalArg(2) Class83 arg1, @OriginalArg(3) Class54 arg2) {
		arg1.method7999(arg2);
		@Pc(15) Class219[] local15 = arg1.method8010();
		@Pc(18) Class238[] local18 = arg1.method8005();
		if ((this.aClass15_Sub8_7 == null || this.aClass15_Sub8_7.aBoolean568) && (local15 != null || local18 != null)) {
			this.aClass15_Sub8_7 = Static417.method6545(Static435.anInt8192, true);
		}
		if (this.aClass15_Sub8_7 != null) {
			this.aClass15_Sub8_7.method6535(arg0, (long) Static435.anInt8192, local15, local18);
			this.aClass15_Sub8_7.method6544(super.aByte124, super.aShort105, super.aShort104, super.aShort103, super.aShort106);
		}
	}

	@OriginalMember(owner = "client!tca", name = "f", descriptor = "(I)I")
	@Override
	public int method8326() {
		return this.anInt9253;
	}

	@OriginalMember(owner = "client!tca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass15_Sub8_7 != null) {
			this.aClass15_Sub8_7.method6531();
		}
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(B)V")
	public void method7564() {
		if (this.aBoolean653 || this.anInt9255 == 0) {
			return;
		}
		@Pc(20) Class15_Sub1_Sub2_Sub2 local20 = null;
		@Pc(31) int local31;
		if (this.anInt9255 >= 0) {
			local31 = this.anInt9255 - 1;
			@Pc(38) Class8_Sub50 local38 = (Class8_Sub50) Static278.aClass253_20.method6594((long) local31);
			if (local38 != null) {
				local20 = local38.aClass15_Sub1_Sub2_Sub2_Sub2_2;
			}
		} else {
			local31 = -this.anInt9255 - 1;
			if (Static616.anInt10362 == local31) {
				local20 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2;
			} else {
				local20 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local31];
			}
		}
		if (local20 == null) {
			return;
		}
		super.anInt10298 = local20.anInt10298;
		super.anInt10301 = local20.anInt10301;
		super.anInt10297 = Static177.method3098(local20.anInt10298, local20.anInt10301, super.aByte124) - this.anInt9260;
		if (this.anInt9263 < 0) {
			return;
		}
		@Pc(91) Class102 local91 = local20.method6686();
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 0;
		if (local91.anIntArrayArray16 != null && local91.anIntArrayArray16[this.anInt9263] != null) {
			local95 = local91.anIntArrayArray16[this.anInt9263][2];
			local93 = local91.anIntArrayArray16[this.anInt9263][0];
		}
		if (local91.anIntArrayArray17 != null && local91.anIntArrayArray17[this.anInt9263] != null) {
			local95 += local91.anIntArrayArray17[this.anInt9263][2];
			local93 += local91.anIntArrayArray17[this.anInt9263][0];
		}
		if (local93 != 0 || local95 != 0) {
			@Pc(165) int local165 = local20.aClass371_7.method8432();
			@Pc(167) int local167 = local165;
			if (local20.anIntArray433 != null && local20.anIntArray433[this.anInt9263] != -1) {
				local167 = local20.anIntArray433[this.anInt9263];
			}
			@Pc(190) int local190 = local167 - local165 & 0x3FFF;
			@Pc(194) int local194 = Class344.anIntArray579[local190];
			@Pc(198) int local198 = Class344.anIntArray578[local190];
			@Pc(209) int local209 = local95 * local194 + local93 * local198 >> 14;
			local95 = local198 * local95 - local93 * local194 >> 14;
			super.anInt10301 += local209;
			super.anInt10298 += local95;
		}
		return;
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8320() {
		return false;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BLclient!ha;)Lclient!lba;")
	@Override
	public Class15_Sub7 method8331(@OriginalArg(1) Class16 arg0) {
		@Pc(11) Class83 local11 = this.method7561(2048, arg0);
		if (local11 == null) {
			return null;
		}
		@Pc(23) Class54 local23 = arg0.method6124();
		local23.method5131(this.anInt9268);
		local23.method5145(this.anInt9273);
		local23.method5142((int) this.aDouble23, (int) this.aDouble21, (int) this.aDouble22);
		this.method7563(arg0, local11, local23);
		@Pc(53) Class15_Sub7 local53 = Static342.method5465(false, 1);
		if (Static183.aBoolean308) {
			local11.method8009(local23, local53.aClass15_Sub6Array1[0], Static115.anInt3009, 0);
		} else {
			local11.method8003(local23, local53.aClass15_Sub6Array1[0], 0);
		}
		if (this.aClass15_Sub8_7 != null) {
			@Pc(81) Class250 local81 = this.aClass15_Sub8_7.method6540();
			if (Static183.aBoolean308) {
				arg0.method6108(local81, Static115.anInt3009);
			} else {
				arg0.method6100(local81);
			}
		}
		this.aBoolean655 = local11.F();
		this.anInt9253 = local11.fa();
		this.anInt9259 = local11.ma();
		return local53;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(II)V")
	public void method7565(@OriginalArg(1) int arg0) {
		this.aDouble23 += this.aDouble20 * (double) arg0;
		this.aDouble22 += (double) arg0 * this.aDouble18;
		this.aBoolean653 = true;
		if (this.aBoolean654) {
			this.aDouble21 = Static177.method3098((int) this.aDouble22, (int) this.aDouble23, super.aByte124) - this.anInt9260;
		} else if (this.anInt9261 == -1) {
			this.aDouble21 += (double) arg0 * this.aDouble19;
		} else {
			this.aDouble21 += (double) arg0 * (double) arg0 * 0.5D * this.aDouble24 + (double) arg0 * this.aDouble19;
			this.aDouble19 += (double) arg0 * this.aDouble24;
		}
		this.anInt9273 = (int) (Math.atan2(this.aDouble20, this.aDouble18) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt9268 = (int) (Math.atan2(this.aDouble19, this.aDouble17) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass97_3 == null) {
			return;
		}
		this.anInt9251 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt9251 <= this.aClass97_3.anIntArray180[this.anInt9271]) {
						return;
					}
					this.anInt9251 -= this.aClass97_3.anIntArray180[this.anInt9271];
					this.anInt9271++;
					if (this.anInt9271 >= this.aClass97_3.anIntArray182.length) {
						this.anInt9271 -= this.aClass97_3.anInt3609;
						if (this.anInt9271 < 0 || this.anInt9271 >= this.aClass97_3.anIntArray182.length) {
							this.anInt9271 = 0;
						}
					}
					this.anInt9239 = this.anInt9271 + 1;
				} while (this.anInt9239 < this.aClass97_3.anIntArray182.length);
				this.anInt9239 -= this.aClass97_3.anInt3609;
			} while (this.anInt9239 >= 0 && this.anInt9239 < this.aClass97_3.anIntArray182.length);
			this.anInt9239 = -1;
		}
	}

	@OriginalMember(owner = "client!tca", name = "i", descriptor = "(I)V")
	@Override
	public void method7558() {
		super.aShort105 = super.aShort104 = (short) (this.aDouble23 / 512.0D);
		super.aShort103 = super.aShort106 = (short) (this.aDouble22 / 512.0D);
	}
}

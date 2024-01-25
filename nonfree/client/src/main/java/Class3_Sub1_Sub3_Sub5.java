import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class3_Sub1_Sub3_Sub5 extends Class3_Sub1_Sub3 {

	@OriginalMember(owner = "client!to", name = "X", descriptor = "D")
	private double aDouble21;

	@OriginalMember(owner = "client!to", name = "eb", descriptor = "Lclient!uj;")
	private Class3_Sub9 aClass3_Sub9_8;

	@OriginalMember(owner = "client!to", name = "jb", descriptor = "D")
	private double aDouble22;

	@OriginalMember(owner = "client!to", name = "kb", descriptor = "D")
	private double aDouble23;

	@OriginalMember(owner = "client!to", name = "mb", descriptor = "I")
	private int anInt9866;

	@OriginalMember(owner = "client!to", name = "wb", descriptor = "I")
	private int anInt9876;

	@OriginalMember(owner = "client!to", name = "Ab", descriptor = "D")
	private double aDouble24;

	@OriginalMember(owner = "client!to", name = "Bb", descriptor = "D")
	private double aDouble25;

	@OriginalMember(owner = "client!to", name = "Ib", descriptor = "D")
	private double aDouble26;

	@OriginalMember(owner = "client!to", name = "Jb", descriptor = "D")
	private double aDouble27;

	@OriginalMember(owner = "client!to", name = "Ob", descriptor = "D")
	private double aDouble28;

	@OriginalMember(owner = "client!to", name = "V", descriptor = "I")
	private int anInt9855 = -1;

	@OriginalMember(owner = "client!to", name = "I", descriptor = "I")
	private int anInt9851 = 0;

	@OriginalMember(owner = "client!to", name = "Db", descriptor = "I")
	private int anInt9879 = 0;

	@OriginalMember(owner = "client!to", name = "Hb", descriptor = "Z")
	private boolean aBoolean690 = false;

	@OriginalMember(owner = "client!to", name = "zb", descriptor = "Z")
	private boolean aBoolean689 = false;

	@OriginalMember(owner = "client!to", name = "Kb", descriptor = "I")
	private int anInt9883 = 0;

	@OriginalMember(owner = "client!to", name = "U", descriptor = "I")
	private int anInt9854 = 0;

	@OriginalMember(owner = "client!to", name = "tb", descriptor = "I")
	private final int anInt9873;

	@OriginalMember(owner = "client!to", name = "T", descriptor = "I")
	private final int anInt9853;

	@OriginalMember(owner = "client!to", name = "Mb", descriptor = "I")
	public final int anInt9885;

	@OriginalMember(owner = "client!to", name = "yb", descriptor = "Z")
	private final boolean aBoolean688;

	@OriginalMember(owner = "client!to", name = "S", descriptor = "I")
	public final int anInt9852;

	@OriginalMember(owner = "client!to", name = "rb", descriptor = "I")
	private final int anInt9871;

	@OriginalMember(owner = "client!to", name = "sb", descriptor = "I")
	public final int anInt9872;

	@OriginalMember(owner = "client!to", name = "Nb", descriptor = "I")
	private final int anInt9886;

	@OriginalMember(owner = "client!to", name = "hb", descriptor = "I")
	private final int anInt9864;

	@OriginalMember(owner = "client!to", name = "Lb", descriptor = "I")
	public final int anInt9884;

	@OriginalMember(owner = "client!to", name = "nb", descriptor = "I")
	private final int anInt9867;

	@OriginalMember(owner = "client!to", name = "bb", descriptor = "Lclient!hg;")
	private final Class130 aClass130_3;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class3_Sub1_Sub3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static590.method8716(arg3, arg1, arg4) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt9873 = arg9;
		this.anInt9853 = arg14;
		this.anInt9885 = arg11;
		this.aBoolean688 = arg13;
		this.aBoolean690 = false;
		this.anInt9852 = arg12;
		this.anInt9871 = arg0;
		this.anInt9872 = arg7;
		this.anInt9886 = arg5;
		this.anInt9864 = arg8;
		this.anInt9884 = arg6;
		this.anInt9867 = arg10;
		@Pc(91) int local91 = Static459.aClass62_2.method2250(this.anInt9871).anInt3971;
		if (local91 == -1) {
			this.aClass130_3 = null;
		} else {
			this.aClass130_3 = Static195.aClass193_1.method5573(local91);
		}
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8611(@OriginalArg(0) Class20 arg0) {
		@Pc(9) Class166 local9 = this.method8229(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(21) Class30 local21 = arg0.method7308();
		local21.method4654(this.anInt9876);
		local21.method4651(this.anInt9866);
		local21.method4646((int) this.aDouble26, (int) this.aDouble23, (int) this.aDouble21);
		this.anInt9883 = local9.fa();
		this.anInt9854 = local9.ma();
		this.method8226(local21, local9, arg0);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BIIII)V")
	public void method8224(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean690) {
			local9 = arg3 - super.anInt10303;
			@Pc(16) double local16 = (double) (arg1 - super.anInt10310);
			@Pc(25) double local25 = Math.sqrt(local9 * local9 + local16 * local16);
			this.aDouble26 = (double) super.anInt10303 + (double) this.anInt9873 * local9 / local25;
			this.aDouble21 = (double) this.anInt9873 * local16 / local25 + (double) super.anInt10310;
			if (this.aBoolean688) {
				this.aDouble23 = Static590.method8716((int) this.aDouble26, super.aByte132, (int) this.aDouble21) - this.anInt9886;
			} else {
				this.aDouble23 = super.anInt10306;
			}
		}
		local9 = this.anInt9872 + 1 - arg2;
		this.aDouble28 = ((double) arg1 - this.aDouble21) / local9;
		this.aDouble25 = ((double) arg3 - this.aDouble26) / local9;
		this.aDouble24 = Math.sqrt(this.aDouble25 * this.aDouble25 + this.aDouble28 * this.aDouble28);
		if (this.anInt9864 == -1) {
			this.aDouble27 = ((double) arg0 - this.aDouble23) / local9;
		} else {
			if (!this.aBoolean690) {
				this.aDouble27 = -this.aDouble24 * Math.tan((double) this.anInt9864 * 0.02454369D);
			}
			this.aDouble22 = ((double) arg0 - this.aDouble23 - local9 * this.aDouble27) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ha;IZLclient!ga;IBI)V")
	@Override
	public void method8604(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!to", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass3_Sub9_8 != null) {
			this.aClass3_Sub9_8.method8585();
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
	public void method8225() {
		if (this.aClass3_Sub9_8 != null) {
			this.aClass3_Sub9_8.method8585();
		}
	}

	@OriginalMember(owner = "client!to", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8612() {
		return false;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!bca;Lclient!ka;Lclient!ha;I)V")
	private void method8226(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class166 arg1, @OriginalArg(2) Class20 arg2) {
		arg1.method6690(arg0);
		@Pc(9) Class227[] local9 = arg1.method6689();
		@Pc(12) Class87[] local12 = arg1.method6674();
		if ((this.aClass3_Sub9_8 == null || this.aClass3_Sub9_8.aBoolean701) && (local9 != null || local12 != null)) {
			this.aClass3_Sub9_8 = Static575.method8577(Static407.anInt7704, true);
		}
		if (this.aClass3_Sub9_8 != null) {
			this.aClass3_Sub9_8.method8587(arg2, (long) Static407.anInt7704, local9, local12);
			this.aClass3_Sub9_8.method8584(super.aByte132, super.aShort118, super.aShort121, super.aShort120, super.aShort119);
		}
	}

	@OriginalMember(owner = "client!to", name = "i", descriptor = "(I)I")
	@Override
	public int method8603(@OriginalArg(0) int arg0) {
		return arg0 == -25675 ? this.anInt9854 : -92;
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(Z)I")
	@Override
	public int method8618() {
		return this.anInt9883;
	}

	@OriginalMember(owner = "client!to", name = "f", descriptor = "(B)V")
	public void method8227() {
		if (this.aBoolean690 || this.anInt9867 == 0) {
			return;
		}
		@Pc(19) Class3_Sub1_Sub3_Sub3 local19 = null;
		@Pc(31) int local31;
		if (this.anInt9867 < 0) {
			local31 = -this.anInt9867 - 1;
			if (Static569.anInt10211 == local31) {
				local19 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2;
			} else {
				local19 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local31];
			}
		} else {
			local31 = this.anInt9867 - 1;
			@Pc(58) Class2_Sub33 local58 = (Class2_Sub33) Static600.aClass99_79.method3056((long) local31);
			if (local58 != null) {
				local19 = local58.aClass3_Sub1_Sub3_Sub3_Sub1_2;
			}
		}
		if (local19 == null) {
			return;
		}
		super.anInt10310 = local19.anInt10310;
		super.anInt10303 = local19.anInt10303;
		super.anInt10306 = Static590.method8716(local19.anInt10303, super.aByte132, local19.anInt10310) - this.anInt9886;
		if (this.anInt9853 < 0) {
			return;
		}
		@Pc(94) Class311 local94 = local19.method5200();
		@Pc(96) int local96 = 0;
		@Pc(98) int local98 = 0;
		if (local94.anIntArrayArray52 != null && local94.anIntArrayArray52[this.anInt9853] != null) {
			local96 = local94.anIntArrayArray52[this.anInt9853][0];
			local98 = local94.anIntArrayArray52[this.anInt9853][2];
		}
		if (local94.anIntArrayArray51 != null && local94.anIntArrayArray51[this.anInt9853] != null) {
			local98 += local94.anIntArrayArray51[this.anInt9853][2];
			local96 += local94.anIntArrayArray51[this.anInt9853][0];
		}
		if (local96 != 0 || local98 != 0) {
			@Pc(171) int local171 = local19.aClass343_7.method8548();
			@Pc(173) int local173 = local171;
			if (local19.anIntArray354 != null && local19.anIntArray354[this.anInt9853] != -1) {
				local173 = local19.anIntArray354[this.anInt9853];
			}
			@Pc(197) int local197 = local173 - local171 & 0x3FFF;
			@Pc(201) int local201 = Class177.anIntArray361[local197];
			@Pc(205) int local205 = Class177.anIntArray360[local197];
			@Pc(215) int local215 = local98 * local201 + local96 * local205 >> 14;
			local98 = local98 * local205 - local96 * local201 >> 14;
			super.anInt10303 += local215;
			super.anInt10310 += local98;
		}
		return;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(Lclient!ha;I)Lclient!hw;")
	@Override
	public Class142 method8605(@OriginalArg(0) Class20 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(ILclient!ha;)Lclient!jda;")
	@Override
	public Class3_Sub4 method8610(@OriginalArg(1) Class20 arg0) {
		@Pc(11) Class166 local11 = this.method8229(2048, arg0);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class30 local18 = arg0.method7308();
		local18.method4654(this.anInt9876);
		local18.method4651(this.anInt9866);
		local18.method4646((int) this.aDouble26, (int) this.aDouble23, (int) this.aDouble21);
		this.method8226(local18, local11, arg0);
		@Pc(48) Class3_Sub4 local48 = Static546.method8162(1, false);
		if (Static639.aBoolean753) {
			local11.method6678(local18, local48.aClass3_Sub3Array1[0], Static380.anInt7419, 0);
		} else {
			local11.method6685(local18, local48.aClass3_Sub3Array1[0], 0);
		}
		if (this.aClass3_Sub9_8 != null) {
			@Pc(76) Class203 local76 = this.aClass3_Sub9_8.method8576();
			if (Static639.aBoolean753) {
				arg0.method7288(local76, Static380.anInt7419);
			} else {
				arg0.method7287(local76);
			}
		}
		this.aBoolean689 = local11.F();
		this.anInt9883 = local11.fa();
		this.anInt9854 = local11.ma();
		return local48;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8615(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BI)V")
	public void method8228(@OriginalArg(1) int arg0) {
		this.aBoolean690 = true;
		this.aDouble26 += (double) arg0 * this.aDouble25;
		this.aDouble21 += (double) arg0 * this.aDouble28;
		if (this.aBoolean688) {
			this.aDouble23 = Static590.method8716((int) this.aDouble26, super.aByte132, (int) this.aDouble21) - this.anInt9886;
		} else if (this.anInt9864 == -1) {
			this.aDouble23 += this.aDouble27 * (double) arg0;
		} else {
			this.aDouble23 += (double) arg0 * this.aDouble22 * 0.5D * (double) arg0 + (double) arg0 * this.aDouble27;
			this.aDouble27 += this.aDouble22 * (double) arg0;
		}
		this.anInt9866 = (int) (Math.atan2(this.aDouble25, this.aDouble28) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt9876 = (int) (Math.atan2(this.aDouble27, this.aDouble24) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass130_3 == null) {
			return;
		}
		this.anInt9879 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt9879 <= this.aClass130_3.anIntArray242[this.anInt9851]) {
						return;
					}
					this.anInt9879 -= this.aClass130_3.anIntArray242[this.anInt9851];
					this.anInt9851++;
					if (this.aClass130_3.anIntArray237.length <= this.anInt9851) {
						this.anInt9851 -= this.aClass130_3.anInt4698;
						if (this.anInt9851 < 0 || this.anInt9851 >= this.aClass130_3.anIntArray237.length) {
							this.anInt9851 = 0;
						}
					}
					this.anInt9855 = this.anInt9851 + 1;
				} while (this.aClass130_3.anIntArray237.length > this.anInt9855);
				this.anInt9855 -= this.aClass130_3.anInt4698;
			} while (this.anInt9855 >= 0 && this.aClass130_3.anIntArray237.length > this.anInt9855);
			this.anInt9855 = -1;
		}
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(Z)V")
	@Override
	public void method8616() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!to", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8600() {
		return false;
	}

	@OriginalMember(owner = "client!to", name = "e", descriptor = "(B)V")
	@Override
	public void method8219() {
		super.aShort118 = super.aShort121 = (short) (this.aDouble26 / 512.0D);
		super.aShort120 = super.aShort119 = (short) (this.aDouble21 / 512.0D);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!ha;B)Lclient!ka;")
	private Class166 method8229(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1) {
		@Pc(9) Class109 local9 = Static459.aClass62_2.method2250(this.anInt9871);
		return local9.method3485(this.anInt9851, arg1, this.anInt9879, arg0, this.anInt9855, Static195.aClass193_1);
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8601() {
		return this.aBoolean689;
	}
}

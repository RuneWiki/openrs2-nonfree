import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public final class Class41_Sub1_Sub1_Sub5 extends Class41_Sub1_Sub1 {

	@OriginalMember(owner = "client!tfa", name = "V", descriptor = "I")
	private int anInt9243;

	@OriginalMember(owner = "client!tfa", name = "cb", descriptor = "D")
	private double aDouble21;

	@OriginalMember(owner = "client!tfa", name = "db", descriptor = "D")
	private double aDouble22;

	@OriginalMember(owner = "client!tfa", name = "ib", descriptor = "D")
	private double aDouble23;

	@OriginalMember(owner = "client!tfa", name = "nb", descriptor = "D")
	private double aDouble24;

	@OriginalMember(owner = "client!tfa", name = "sb", descriptor = "I")
	private int anInt9258;

	@OriginalMember(owner = "client!tfa", name = "zb", descriptor = "D")
	private double aDouble25;

	@OriginalMember(owner = "client!tfa", name = "Eb", descriptor = "D")
	private double aDouble26;

	@OriginalMember(owner = "client!tfa", name = "Hb", descriptor = "D")
	private double aDouble27;

	@OriginalMember(owner = "client!tfa", name = "Ib", descriptor = "D")
	private double aDouble28;

	@OriginalMember(owner = "client!tfa", name = "Jb", descriptor = "Lclient!qo;")
	private Class41_Sub7 aClass41_Sub7_6;

	@OriginalMember(owner = "client!tfa", name = "X", descriptor = "I")
	private int anInt9245 = 0;

	@OriginalMember(owner = "client!tfa", name = "gb", descriptor = "Z")
	private boolean aBoolean675 = false;

	@OriginalMember(owner = "client!tfa", name = "Y", descriptor = "Z")
	private boolean aBoolean674 = false;

	@OriginalMember(owner = "client!tfa", name = "ab", descriptor = "I")
	private int anInt9247 = 0;

	@OriginalMember(owner = "client!tfa", name = "Z", descriptor = "I")
	private int anInt9246 = -1;

	@OriginalMember(owner = "client!tfa", name = "Bb", descriptor = "I")
	private int anInt9266 = 0;

	@OriginalMember(owner = "client!tfa", name = "pb", descriptor = "I")
	private int anInt9255 = 0;

	@OriginalMember(owner = "client!tfa", name = "yb", descriptor = "I")
	public final int anInt9264;

	@OriginalMember(owner = "client!tfa", name = "lb", descriptor = "I")
	private final int lb;

	@OriginalMember(owner = "client!tfa", name = "U", descriptor = "I")
	private final int anInt9242;

	@OriginalMember(owner = "client!tfa", name = "Kb", descriptor = "I")
	public final int anInt9271;

	@OriginalMember(owner = "client!tfa", name = "qb", descriptor = "I")
	public final int anInt9256;

	@OriginalMember(owner = "client!tfa", name = "S", descriptor = "Z")
	private final boolean aBoolean673;

	@OriginalMember(owner = "client!tfa", name = "xb", descriptor = "I")
	private int anInt9263;

	@OriginalMember(owner = "client!tfa", name = "Nb", descriptor = "I")
	private final int anInt9274;

	@OriginalMember(owner = "client!tfa", name = "R", descriptor = "I")
	private final int anInt9240;

	@OriginalMember(owner = "client!tfa", name = "Fb", descriptor = "I")
	private final int anInt9269;

	@OriginalMember(owner = "client!tfa", name = "rb", descriptor = "I")
	public final int anInt9257;

	@OriginalMember(owner = "client!tfa", name = "jb", descriptor = "Lclient!co;")
	private final Class65 aClass65_3;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class41_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static161.method1246(arg1, arg4, arg3) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt9264 = arg12;
		this.aBoolean674 = false;
		this.lb = arg10;
		this.anInt9242 = arg14;
		this.anInt9271 = arg6;
		this.anInt9256 = arg7;
		this.aBoolean673 = arg13;
		this.anInt9263 = arg0;
		this.anInt9274 = arg9;
		this.anInt9240 = arg8;
		this.anInt9269 = arg5;
		this.anInt9257 = arg11;
		@Pc(91) int local91 = Static312.aClass179_1.method3798(this.anInt9263).anInt10218;
		if (local91 == -1) {
			this.aClass65_3 = null;
		} else {
			this.aClass65_3 = Static459.aClass128_2.method2686(local91);
		}
	}

	@OriginalMember(owner = "client!tfa", name = "j", descriptor = "(I)I")
	@Override
	public int method8660(@OriginalArg(0) int arg0) {
		if (arg0 > -9) {
			this.anInt9263 = 27;
		}
		return this.anInt9247;
	}

	@OriginalMember(owner = "client!tfa", name = "i", descriptor = "(I)V")
	@Override
	public void method8654() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)V")
	public void method7758(@OriginalArg(0) int arg0) {
		this.aDouble26 += (double) arg0 * this.aDouble24;
		this.aDouble27 += (double) arg0 * this.aDouble28;
		this.aBoolean674 = true;
		if (this.aBoolean673) {
			this.aDouble21 = (double) (Static161.method1246(super.aByte149, (int) this.aDouble26, (int) this.aDouble27) - this.anInt9269);
		} else if (this.anInt9240 == -1) {
			this.aDouble21 += (double) arg0 * this.aDouble22;
		} else {
			this.aDouble21 += this.aDouble22 * (double) arg0 + (double) arg0 * (double) arg0 * 0.5D * this.aDouble25;
			this.aDouble22 += (double) arg0 * this.aDouble25;
		}
		this.anInt9258 = (int) (Math.atan2(this.aDouble28, this.aDouble24) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt9243 = (int) (Math.atan2(this.aDouble22, this.aDouble23) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass65_3 == null) {
			return;
		}
		this.anInt9245 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass65_3.anIntArray71[this.anInt9255] >= this.anInt9245) {
						return;
					}
					this.anInt9245 -= this.aClass65_3.anIntArray71[this.anInt9255];
					this.anInt9255++;
					if (this.aClass65_3.anIntArray75.length <= this.anInt9255) {
						this.anInt9255 -= this.aClass65_3.anInt1432;
						if (this.anInt9255 < 0 || this.anInt9255 >= this.aClass65_3.anIntArray75.length) {
							this.anInt9255 = 0;
						}
					}
					this.anInt9246 = this.anInt9255 + 1;
				} while (this.aClass65_3.anIntArray75.length > this.anInt9246);
				this.anInt9246 -= this.aClass65_3.anInt1432;
			} while (this.anInt9246 >= 0 && this.anInt9246 < this.aClass65_3.anIntArray75.length);
			this.anInt9246 = -1;
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ILclient!sf;Lclient!ha;BIIZ)V")
	@Override
	public void method8658(@OriginalArg(0) int arg0, @OriginalArg(1) Class41_Sub1 arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tfa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass41_Sub7_6 != null) {
			this.aClass41_Sub7_6.method7088();
		}
	}

	@OriginalMember(owner = "client!tfa", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8653() {
		return false;
	}

	@OriginalMember(owner = "client!tfa", name = "g", descriptor = "(I)I")
	@Override
	public int method8652() {
		return this.anInt9266;
	}

	@OriginalMember(owner = "client!tfa", name = "m", descriptor = "(I)V")
	@Override
	public void method7909() {
		super.aShort108 = super.aShort110 = (short) (int) (this.aDouble26 / 512.0D);
		super.aShort109 = super.aShort107 = (short) (int) (this.aDouble27 / 512.0D);
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8647() {
		return this.aBoolean675;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!ka;Lclient!eh;ILclient!ha;)V")
	private void method7761(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(3) Class143 arg2) {
		arg0.method8811(arg1);
		@Pc(13) Class244[] local13 = arg0.method8790();
		@Pc(16) Class303[] local16 = arg0.method8806();
		if ((this.aClass41_Sub7_6 == null || this.aClass41_Sub7_6.aBoolean596) && (local13 != null || local16 != null)) {
			this.aClass41_Sub7_6 = Static485.method7087(Static421.anInt7434, true);
		}
		if (this.aClass41_Sub7_6 != null) {
			this.aClass41_Sub7_6.method7092(arg2, (long) Static421.anInt7434, local13, local16);
			this.aClass41_Sub7_6.method7078(super.aByte149, super.aShort109, super.aShort107, super.aShort108, super.aShort110);
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(B)V")
	public void method7762() {
		if (this.aClass41_Sub7_6 != null) {
			this.aClass41_Sub7_6.method7088();
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!ha;ZI)Lclient!ka;")
	private Class114 method7763(@OriginalArg(0) Class143 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class385 local15 = Static312.aClass179_1.method3798(this.anInt9263);
		return local15.method8527(arg0, this.anInt9246, this.anInt9255, arg1, Static459.aClass128_2, this.anInt9245);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V")
	public void method7764() {
		if (this.aBoolean674 || this.lb == 0) {
			return;
		}
		@Pc(16) Class41_Sub1_Sub1_Sub3 local16 = null;
		@Pc(25) int local25;
		if (this.lb < 0) {
			local25 = -this.lb - 1;
			if (local25 == Static177.anInt2910) {
				local16 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1;
			} else {
				local16 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local25];
			}
		} else {
			local25 = this.lb - 1;
			@Pc(52) Class5_Sub34 local52 = (Class5_Sub34) Static223.aClass335_19.method7766((long) local25);
			if (local52 != null) {
				local16 = local52.aClass41_Sub1_Sub1_Sub3_Sub1_1;
			}
		}
		if (local16 == null) {
			return;
		}
		super.anInt10367 = local16.anInt10367;
		super.anInt10366 = local16.anInt10366;
		super.anInt10370 = Static161.method1246(super.aByte149, local16.anInt10367, local16.anInt10366) - this.anInt9269;
		if (this.anInt9242 < 0) {
			return;
		}
		@Pc(88) Class201 local88 = local16.method7933();
		@Pc(90) int local90 = 0;
		@Pc(92) int local92 = 0;
		if (local88.anIntArrayArray44 != null && local88.anIntArrayArray44[this.anInt9242] != null) {
			local90 = local88.anIntArrayArray44[this.anInt9242][0];
			local92 = local88.anIntArrayArray44[this.anInt9242][2];
		}
		if (local88.anIntArrayArray43 != null && local88.anIntArrayArray43[this.anInt9242] != null) {
			local92 += local88.anIntArrayArray43[this.anInt9242][2];
			local90 += local88.anIntArrayArray43[this.anInt9242][0];
		}
		if (local90 != 0 || local92 != 0) {
			@Pc(162) int local162 = local16.aClass165_7.method3503();
			@Pc(164) int local164 = local162;
			if (local16.anIntArray520 != null && local16.anIntArray520[this.anInt9242] != -1) {
				local164 = local16.anIntArray520[this.anInt9242];
			}
			@Pc(188) int local188 = local164 - local162 & 0x3FFF;
			@Pc(192) int local192 = Class242.anIntArray384[local188];
			@Pc(196) int local196 = Class242.anIntArray383[local188];
			@Pc(207) int local207 = local192 * local92 + local196 * local90 >> 14;
			local92 = local92 * local196 - local90 * local192 >> 14;
			super.anInt10367 += local92;
			super.anInt10366 += local207;
		}
		return;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IZLclient!ha;I)Z")
	@Override
	public boolean method8661(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8650() {
		return false;
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(Lclient!ha;B)Lclient!pw;")
	@Override
	public Class280 method8656(@OriginalArg(0) Class143 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIZII)V")
	public void method7765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) double local12;
		if (!this.aBoolean674) {
			local12 = (double) (arg0 - super.anInt10366);
			@Pc(19) double local19 = (double) (arg2 - super.anInt10367);
			@Pc(28) double local28 = Math.sqrt(local12 * local12 + local19 * local19);
			this.aDouble27 = local12 * (double) this.anInt9274 / local28 + (double) super.anInt10366;
			this.aDouble26 = (double) this.anInt9274 * local19 / local28 + (double) super.anInt10367;
			if (this.aBoolean673) {
				this.aDouble21 = (double) (Static161.method1246(super.aByte149, (int) this.aDouble26, (int) this.aDouble27) - this.anInt9269);
			} else {
				this.aDouble21 = (double) super.anInt10370;
			}
		}
		local12 = (double) (this.anInt9256 + 1 - arg1);
		this.aDouble24 = ((double) arg2 - this.aDouble26) / local12;
		this.aDouble28 = ((double) arg0 - this.aDouble27) / local12;
		this.aDouble23 = Math.sqrt(this.aDouble28 * this.aDouble28 + this.aDouble24 * this.aDouble24);
		if (this.anInt9240 == -1) {
			this.aDouble22 = ((double) arg3 - this.aDouble21) / local12;
		} else {
			if (!this.aBoolean674) {
				this.aDouble22 = -this.aDouble23 * Math.tan((double) this.anInt9240 * 0.02454369D);
			}
			this.aDouble25 = ((double) arg3 - local12 * this.aDouble22 - this.aDouble21) * 2.0D / (local12 * local12);
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8662(@OriginalArg(0) Class143 arg0) {
		@Pc(15) Class114 local15 = this.method7763(arg0, 0);
		if (local15 == null) {
			return;
		}
		@Pc(21) Class56 local21 = arg0.method6212();
		local21.method8392(this.anInt9243);
		local21.method8386(this.anInt9258);
		local21.method8390((int) this.aDouble27, (int) this.aDouble21, (int) this.aDouble26);
		this.anInt9266 = local15.fa();
		this.anInt9247 = local15.ma();
		this.method7761(local15, local21, arg0);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!ha;B)Lclient!hq;")
	@Override
	public Class41_Sub3 method8648(@OriginalArg(0) Class143 arg0) {
		@Pc(11) Class114 local11 = this.method7763(arg0, 2048);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class56 local18 = arg0.method6212();
		local18.method8392(this.anInt9243);
		local18.method8386(this.anInt9258);
		local18.method8390((int) this.aDouble27, (int) this.aDouble21, (int) this.aDouble26);
		this.method7761(local11, local18, arg0);
		@Pc(55) Class41_Sub3 local55 = Static578.method7877(1, false);
		if (Static426.aBoolean555) {
			local11.method8807(local18, local55.aClass41_Sub9Array1[0], Static663.anInt10391, 0);
		} else {
			local11.method8801(local18, local55.aClass41_Sub9Array1[0], 0);
		}
		if (this.aClass41_Sub7_6 != null) {
			@Pc(83) Class149 local83 = this.aClass41_Sub7_6.method7086();
			if (Static426.aBoolean555) {
				arg0.method6233(local83, Static663.anInt10391);
			} else {
				arg0.method6215(local83);
			}
		}
		this.aBoolean675 = local11.F();
		this.anInt9266 = local11.fa();
		this.anInt9247 = local11.ma();
		return local55;
	}
}

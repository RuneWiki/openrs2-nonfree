import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class3_Sub1_Sub2_Sub1 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!bd", name = "U", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
	private int anInt734;

	@OriginalMember(owner = "client!bd", name = "Y", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!bd", name = "Z", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!bd", name = "gb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!bd", name = "mb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!bd", name = "wb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!bd", name = "zb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!bd", name = "Fb", descriptor = "D")
	private double aDouble10;

	@OriginalMember(owner = "client!bd", name = "Ib", descriptor = "Lclient!sia;")
	private Class3_Sub7 aClass3_Sub7_1;

	@OriginalMember(owner = "client!bd", name = "Mb", descriptor = "I")
	private int anInt764;

	@OriginalMember(owner = "client!bd", name = "db", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!bd", name = "ob", descriptor = "I")
	private int anInt745 = 0;

	@OriginalMember(owner = "client!bd", name = "yb", descriptor = "I")
	private int anInt754 = 0;

	@OriginalMember(owner = "client!bd", name = "fb", descriptor = "I")
	private int anInt740 = -1;

	@OriginalMember(owner = "client!bd", name = "kb", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!bd", name = "Qb", descriptor = "I")
	private int anInt768 = 0;

	@OriginalMember(owner = "client!bd", name = "X", descriptor = "I")
	private int anInt736 = 0;

	@OriginalMember(owner = "client!bd", name = "bb", descriptor = "I")
	public final int anInt738;

	@OriginalMember(owner = "client!bd", name = "Jb", descriptor = "I")
	private final int anInt761;

	@OriginalMember(owner = "client!bd", name = "Db", descriptor = "I")
	private final int anInt758;

	@OriginalMember(owner = "client!bd", name = "Hb", descriptor = "I")
	public final int anInt760;

	@OriginalMember(owner = "client!bd", name = "Ab", descriptor = "I")
	public final int anInt755;

	@OriginalMember(owner = "client!bd", name = "jb", descriptor = "I")
	private final int anInt743;

	@OriginalMember(owner = "client!bd", name = "Cb", descriptor = "I")
	private final int anInt757;

	@OriginalMember(owner = "client!bd", name = "Gb", descriptor = "Z")
	private final boolean aBoolean67;

	@OriginalMember(owner = "client!bd", name = "Ob", descriptor = "I")
	private final int anInt766;

	@OriginalMember(owner = "client!bd", name = "eb", descriptor = "I")
	private final int anInt739;

	@OriginalMember(owner = "client!bd", name = "Kb", descriptor = "I")
	public final int anInt762;

	@OriginalMember(owner = "client!bd", name = "Sb", descriptor = "Lclient!fs;")
	private final Class124 aClass124_1;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class3_Sub1_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static674.method8951(arg1, arg4, arg3) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt738 = arg6;
		this.anInt761 = arg5;
		this.anInt758 = arg8;
		this.anInt760 = arg12;
		this.anInt755 = arg11;
		this.anInt743 = arg0;
		this.anInt757 = arg10;
		this.aBoolean67 = arg13;
		this.aBoolean66 = false;
		this.anInt766 = arg9;
		this.anInt739 = arg14;
		this.anInt762 = arg7;
		@Pc(91) int local91 = Static341.aClass349_1.method7597(this.anInt743).anInt8322;
		if (local91 == -1) {
			this.aClass124_1 = null;
		} else {
			this.aClass124_1 = Static99.aClass2_1.method22(local91);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)V")
	public void method705(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) double local19;
		if (!this.aBoolean66) {
			local19 = (double) (arg3 - super.anInt9925);
			@Pc(26) double local26 = (double) (arg1 - super.anInt9917);
			@Pc(35) double local35 = Math.sqrt(local19 * local19 + local26 * local26);
			this.aDouble3 = (double) this.anInt766 * local19 / local35 + (double) super.anInt9925;
			this.aDouble4 = local26 * (double) this.anInt766 / local35 + (double) super.anInt9917;
			if (this.aBoolean67) {
				this.aDouble8 = (double) (Static674.method8951(super.aByte141, (int) this.aDouble4, (int) this.aDouble3) - this.anInt761);
			} else {
				this.aDouble8 = (double) super.anInt9915;
			}
		}
		local19 = (double) (this.anInt762 + 1 - arg0);
		this.aDouble7 = ((double) arg1 - this.aDouble4) / local19;
		this.aDouble6 = ((double) arg3 - this.aDouble3) / local19;
		this.aDouble5 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble6 * this.aDouble6);
		if (this.anInt758 == -1) {
			this.aDouble10 = ((double) arg2 - this.aDouble8) / local19;
		} else {
			if (!this.aBoolean66) {
				this.aDouble10 = -this.aDouble5 * Math.tan((double) this.anInt758 * 0.02454369D);
			}
			this.aDouble9 = ((double) arg2 - local19 * this.aDouble10 - this.aDouble8) * 2.0D / (local19 * local19);
		}
	}

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)I")
	@Override
	public int method8499() {
		return this.anInt745;
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(B)V")
	@Override
	public void method8508() {
		super.aShort125 = super.aShort122 = (short) (int) (this.aDouble4 / 512.0D);
		super.aShort124 = super.aShort123 = (short) (int) (this.aDouble3 / 512.0D);
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8501() {
		return this.aBoolean65;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class3_Sub6 method8502(@OriginalArg(1) Class33 arg0) {
		@Pc(11) Class62 local11 = this.method710(2048, arg0);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class92 local18 = arg0.method8078();
		local18.method3852(this.anInt764);
		local18.method3861(this.anInt734);
		local18.method3851((int) this.aDouble3, (int) this.aDouble8, (int) this.aDouble4);
		this.method706(local18, local11, arg0);
		@Pc(56) Class3_Sub6 local56 = Static665.method8806(1, false);
		if (Static499.aBoolean608) {
			local11.method7332(local18, local56.aClass3_Sub4Array1[0], Static140.anInt8126, 0);
		} else {
			local11.method7335(local18, local56.aClass3_Sub4Array1[0], 0);
		}
		if (this.aClass3_Sub7_1 != null) {
			@Pc(84) Class9 local84 = this.aClass3_Sub7_1.method7301();
			if (Static499.aBoolean608) {
				arg0.method8094(local84, Static140.anInt8126);
			} else {
				arg0.method8085(local84);
			}
		}
		this.aBoolean65 = local11.F();
		this.anInt745 = local11.fa();
		this.anInt768 = local11.ma();
		return local56;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!nh;Lclient!ka;Lclient!ha;B)V")
	private void method706(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) Class33 arg2) {
		arg1.method7336(arg0);
		@Pc(16) Class235[] local16 = arg1.method7331();
		@Pc(19) Class170[] local19 = arg1.method7333();
		if ((this.aClass3_Sub7_1 == null || this.aClass3_Sub7_1.aBoolean652) && (local16 != null || local19 != null)) {
			this.aClass3_Sub7_1 = Static549.method7310(Static177.anInt3088, true);
		}
		if (this.aClass3_Sub7_1 != null) {
			this.aClass3_Sub7_1.method7307(arg2, (long) Static177.anInt3088, local16, local19);
			this.aClass3_Sub7_1.method7297(super.aByte141, super.aShort124, super.aShort123, super.aShort125, super.aShort122);
		}
	}

	@OriginalMember(owner = "client!bd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass3_Sub7_1 != null) {
			this.aClass3_Sub7_1.method7304();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public void method707() {
		if (this.aBoolean66 || this.anInt757 == 0) {
			return;
		}
		@Pc(18) Class3_Sub1_Sub2_Sub2 local18 = null;
		@Pc(26) int local26;
		if (this.anInt757 >= 0) {
			local26 = this.anInt757 - 1;
			@Pc(33) Class4_Sub45 local33 = (Class4_Sub45) Static597.aClass66_41.method1994((long) local26);
			if (local33 != null) {
				local18 = local33.aClass3_Sub1_Sub2_Sub2_Sub2_2;
			}
		} else {
			local26 = -this.anInt757 - 1;
			if (local26 == Static184.anInt3149) {
				local18 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4;
			} else {
				local18 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local26];
			}
		}
		if (local18 == null) {
			return;
		}
		super.anInt9925 = local18.anInt9925;
		super.anInt9917 = local18.anInt9917;
		super.anInt9915 = Static674.method8951(super.aByte141, local18.anInt9917, local18.anInt9925) - this.anInt761;
		if (this.anInt739 < 0) {
			return;
		}
		@Pc(86) Class377 local86 = local18.method8525();
		@Pc(88) int local88 = 0;
		@Pc(90) int local90 = 0;
		if (local86.anIntArrayArray62 != null && local86.anIntArrayArray62[this.anInt739] != null) {
			local88 = local86.anIntArrayArray62[this.anInt739][0];
			local90 = local86.anIntArrayArray62[this.anInt739][2];
		}
		if (local86.anIntArrayArray61 != null && local86.anIntArrayArray61[this.anInt739] != null) {
			local88 += local86.anIntArrayArray61[this.anInt739][0];
			local90 += local86.anIntArrayArray61[this.anInt739][2];
		}
		if (local88 != 0 || local90 != 0) {
			@Pc(160) int local160 = local18.aClass240_7.method4986();
			@Pc(162) int local162 = local160;
			if (local18.anIntArray684 != null && local18.anIntArray684[this.anInt739] != -1) {
				local162 = local18.anIntArray684[this.anInt739];
			}
			@Pc(185) int local185 = local162 - local160 & 0x3FFF;
			@Pc(189) int local189 = Class4_Sub2_Sub26.anIntArray563[local185];
			@Pc(193) int local193 = Class4_Sub2_Sub26.anIntArray562[local185];
			@Pc(203) int local203 = local90 * local189 + local193 * local88 >> 14;
			local90 = local193 * local90 - local88 * local189 >> 14;
			super.anInt9925 += local203;
			super.anInt9917 += local90;
		}
		return;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBILclient!ha;)Z")
	@Override
	public boolean method8488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8500() {
		return false;
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)I")
	@Override
	public int method8495(@OriginalArg(0) int arg0) {
		if (arg0 != -4798) {
			this.method706((Class92) null, (Class62) null, (Class33) null);
		}
		return this.anInt768;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8492(@OriginalArg(0) Class33 arg0) {
		@Pc(9) Class62 local9 = this.method710(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(19) Class92 local19 = arg0.method8078();
		local19.method3852(this.anInt764);
		local19.method3861(this.anInt734);
		local19.method3851((int) this.aDouble3, (int) this.aDouble8, (int) this.aDouble4);
		this.anInt745 = local9.fa();
		this.anInt768 = local9.ma();
		this.method706(local19, local9, arg0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLclient!ha;)Lclient!oba;")
	@Override
	public Class261 method8507(@OriginalArg(1) Class33 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!gda;Lclient!ha;IIZII)V")
	@Override
	public void method8491(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(Z)V")
	@Override
	public void method8504() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!ha;B)Lclient!ka;")
	private Class62 method710(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1) {
		@Pc(14) Class323 local14 = Static341.aClass349_1.method7597(this.anInt743);
		return local14.method7206(this.anInt754, arg1, Static99.aClass2_1, this.anInt736, arg0, this.anInt740);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)V")
	public void method711(@OriginalArg(0) int arg0) {
		this.aDouble3 += (double) arg0 * this.aDouble6;
		this.aBoolean66 = true;
		this.aDouble4 += (double) arg0 * this.aDouble7;
		if (this.aBoolean67) {
			this.aDouble8 = (double) (Static674.method8951(super.aByte141, (int) this.aDouble4, (int) this.aDouble3) - this.anInt761);
		} else if (this.anInt758 == -1) {
			this.aDouble8 += this.aDouble10 * (double) arg0;
		} else {
			this.aDouble8 += this.aDouble10 * (double) arg0 + this.aDouble9 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble10 += (double) arg0 * this.aDouble9;
		}
		this.anInt734 = (int) (Math.atan2(this.aDouble6, this.aDouble7) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt764 = (int) (Math.atan2(this.aDouble10, this.aDouble5) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass124_1 == null) {
			return;
		}
		this.anInt754 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt754 <= this.aClass124_1.anIntArray221[this.anInt736]) {
						return;
					}
					this.anInt754 -= this.aClass124_1.anIntArray221[this.anInt736];
					this.anInt736++;
					if (this.anInt736 >= this.aClass124_1.anIntArray224.length) {
						this.anInt736 -= this.aClass124_1.anInt3035;
						if (this.anInt736 < 0 || this.anInt736 >= this.aClass124_1.anIntArray224.length) {
							this.anInt736 = 0;
						}
					}
					this.anInt740 = this.anInt736 + 1;
				} while (this.aClass124_1.anIntArray224.length > this.anInt740);
				this.anInt740 -= this.aClass124_1.anInt3035;
			} while (this.anInt740 >= 0 && this.aClass124_1.anIntArray224.length > this.anInt740);
			this.anInt740 = -1;
		}
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method8505() {
		return false;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public void method712() {
		if (this.aClass3_Sub7_1 != null) {
			this.aClass3_Sub7_1.method7304();
		}
	}
}

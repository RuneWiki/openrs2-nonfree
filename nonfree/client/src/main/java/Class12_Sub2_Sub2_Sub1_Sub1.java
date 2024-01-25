import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class12_Sub2_Sub2_Sub1_Sub1 extends Class12_Sub2_Sub2_Sub1 {

	@OriginalMember(owner = "client!av", name = "Uc", descriptor = "Lclient!qha;")
	public Class283 aClass283_1;

	@OriginalMember(owner = "client!av", name = "Xc", descriptor = "Ljava/lang/String;")
	public String aString8;

	@OriginalMember(owner = "client!av", name = "cd", descriptor = "I")
	public int anInt682;

	@OriginalMember(owner = "client!av", name = "gd", descriptor = "Lclient!jka;")
	public Class183 aClass183_1;

	@OriginalMember(owner = "client!av", name = "jd", descriptor = "I")
	public int anInt688 = -1;

	@OriginalMember(owner = "client!av", name = "ed", descriptor = "I")
	public int anInt684 = 1;

	@OriginalMember(owner = "client!av", name = "qd", descriptor = "I")
	public int anInt695 = 1;

	@OriginalMember(owner = "client!av", name = "pd", descriptor = "I")
	public int anInt694 = -1;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!qha;I)V")
	public void method611(@OriginalArg(0) Class283 arg0) {
		this.aClass283_1 = arg0;
		if (this.aClass283_1 != null) {
			this.aString8 = this.aClass283_1.aString84;
			this.anInt682 = this.aClass283_1.anInt8632;
		}
		if (super.aClass12_Sub4_3 != null) {
			super.aClass12_Sub4_3.method1615();
		}
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(B)I")
	@Override
	public int method2424() {
		if (this.aClass283_1.anIntArray638 != null) {
			@Pc(13) Class283 local13 = this.aClass283_1.method7129(Static595.aClass241_1);
			if (local13 != null && local13.anInt8621 != -1) {
				return local13.anInt8621;
			}
		}
		return this.aClass283_1.anInt8621 == -1 ? super.method2424() : this.aClass283_1.anInt8621;
	}

	@OriginalMember(owner = "client!av", name = "f", descriptor = "(B)I")
	@Override
	public int method9153() {
		return this.aClass283_1 == null ? 0 : this.aClass283_1.anInt8639;
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9164(@OriginalArg(1) Class137 arg0) {
		if (this.aClass283_1 == null || !super.aBoolean225 && !this.method613(0, arg0)) {
			return;
		}
		@Pc(34) Class26 local34 = arg0.method7923();
		local34.method6444(super.aClass139_7.method3204());
		local34.method6443(super.anInt10998, super.anInt10997 - 20, super.anInt11002);
		this.method2418(arg0, super.aBoolean225, local34, super.aClass80Array3);
		for (@Pc(61) int local61 = 0; local61 < super.aClass80Array3.length; local61++) {
			super.aClass80Array3[local61] = null;
		}
	}

	@OriginalMember(owner = "client!av", name = "k", descriptor = "(I)I")
	@Override
	public int method2421() {
		if (this.aClass283_1.anIntArray638 != null) {
			@Pc(13) Class283 local13 = this.aClass283_1.method7129(Static595.aClass241_1);
			if (local13 != null && local13.anInt8629 != -1) {
				return local13.anInt8629;
			}
		}
		return this.aClass283_1.anInt8629;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(Lclient!ha;I)Lclient!rn;")
	@Override
	public Class305 method9156(@OriginalArg(0) Class137 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ILclient!ha;Z)Z")
	private boolean method613(@OriginalArg(0) int arg0, @OriginalArg(1) Class137 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(14) Class132 local14 = this.method2416();
		@Pc(29) Class275 local29 = super.anInt2921 != -1 && super.anInt2900 == 0 ? Static501.aClass191_2.method4322(super.anInt2921) : null;
		@Pc(47) Class275 local47 = super.anInt2960 == -1 || super.aBoolean222 && local29 != null ? null : Static501.aClass191_2.method4322(super.anInt2960);
		@Pc(50) int local50 = local14.anInt3655;
		@Pc(53) int local53 = local14.anInt3670;
		if (local50 != 0 || local53 != 0 || local14.anInt3643 != 0 || local14.anInt3645 != 0) {
			arg0 |= 0x7;
		}
		@Pc(92) boolean local92 = super.aByte60 != 0 && super.anInt2962 <= Static87.anInt1951 && Static87.anInt1951 < super.anInt2936;
		if (local92) {
			arg0 |= 0x80000;
		}
		@Pc(103) int local103 = super.aClass139_7.method3204();
		@Pc(139) Class80 local139 = super.aClass80Array3[0] = this.aClass283_1.method7136(this.aClass183_1, super.lb, Static110.aClass197_1, local29, super.anIntArray233, Static501.aClass191_2, local47, arg0, super.anInt2942, super.anInt2958, Static595.aClass241_1, super.anInt2898, super.anInt2950, super.anInt2902, arg1, super.aClass351Array3, local103);
		if (local139 == null) {
			return false;
		}
		super.anInt2916 = local139.fa();
		super.anInt2951 = local139.ma();
		this.method2427(local139);
		if (local50 == 0 && local53 == 0) {
			this.method2430(0, this.method2422() << 9, 0, this.method2422() << 9, local103);
		} else {
			this.method2430(local14.anInt3662, local50, local14.anInt3658, local53, local103);
			if (super.anInt2956 != 0) {
				super.aClass80Array3[0].FA(super.anInt2956);
			}
			if (super.anInt2897 != 0) {
				super.aClass80Array3[0].VA(super.anInt2897);
			}
			if (super.anInt2928 != 0) {
				super.aClass80Array3[0].H(0, super.anInt2928, 0);
			}
		}
		if (local92) {
			local139.method6394(super.aByte58, super.aByte57, super.aByte61, super.aByte60 & 0xFF);
		}
		this.method2426(local14, local53, local103, local5, local50, arg1);
		return true;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class137 arg2) {
		if (this.aClass283_1 == null || !this.method613(131072, arg2)) {
			return false;
		}
		@Pc(19) Class26 local19 = arg2.method7923();
		@Pc(24) int local24 = super.aClass139_7.method3204();
		local19.method6444(local24);
		local19.method6443(super.anInt10998, super.anInt10997, super.anInt11002);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass80Array3.length > local39; local39++) {
			if (super.aClass80Array3[local39] != null) {
				@Pc(64) boolean var10000;
				label50: {
					if (this.aClass283_1.anInt8639 <= 0) {
						label48: {
							if (this.aClass283_1.anInt8608 == -1) {
								if (this.aClass283_1.anInt8617 == 1) {
									break label48;
								}
								var10000 = false;
							} else {
								if (this.aClass283_1.anInt8608 == 1) {
									break label48;
								}
								var10000 = false;
							}
							if (!var10000) {
								var10000 = false;
								break label50;
							}
						}
					}
					var10000 = true;
				}
				@Pc(79) boolean local79 = var10000;
				@Pc(94) boolean local94;
				if (Static401.aBoolean511) {
					local94 = super.aClass80Array3[local39].method6386(arg0, arg1, local19, local79, this.aClass283_1.anInt8639, Static331.anInt6277);
				} else {
					local94 = super.aClass80Array3[local39].method6380(arg0, arg1, local19, local79, this.aClass283_1.anInt8639);
				}
				if (local94) {
					local37 = true;
					break;
				}
			}
		}
		for (@Pc(134) int local134 = 0; super.aClass80Array3.length > local134; local134++) {
			super.aClass80Array3[local134] = null;
		}
		return local37;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZLclient!je;IIILclient!ha;I)V")
	@Override
	public void method9166(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class137 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!av", name = "m", descriptor = "(I)Z")
	public boolean method615() {
		return this.aClass283_1 != null;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIZIIZ)V")
	public void method616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte146 = super.aByte145 = (byte) arg1;
		if (Static329.method5158(arg4, arg3)) {
			super.aByte145++;
		}
		if (super.anInt2921 != -1 && Static501.aClass191_2.method4322(super.anInt2921).anInt7922 == 1) {
			super.anInt2921 = -1;
			super.anIntArray234 = null;
		}
		for (@Pc(44) int local44 = 0; local44 < super.aClass84Array3.length; local44++) {
			if (super.aClass84Array3[local44].anInt2468 != -1) {
				@Pc(63) Class60 local63 = Static556.aClass216_2.method5268(super.aClass84Array3[local44].anInt2468);
				if (local63.aBoolean127 && local63.anInt1664 != -1 && Static501.aClass191_2.method4322(local63.anInt1664).anInt7922 == 1) {
					super.aClass84Array3[local44].anInt2468 = -1;
				}
			}
		}
		if (!arg2) {
			@Pc(104) int local104 = arg3 - super.anIntArray241[0];
			@Pc(112) int local112 = arg4 - super.anIntArray242[0];
			if (local104 >= -8 && local104 <= 8 && local112 >= -8 && local112 <= 8) {
				if (super.anInt2964 < 9) {
					super.anInt2964++;
				}
				for (@Pc(143) int local143 = super.anInt2964; local143 > 0; local143--) {
					super.anIntArray241[local143] = super.anIntArray241[local143 - 1];
					super.anIntArray242[local143] = super.anIntArray242[local143 - 1];
					super.aByteArray43[local143] = super.aByteArray43[local143 - 1];
				}
				super.anIntArray241[0] = arg3;
				super.anIntArray242[0] = arg4;
				super.aByteArray43[0] = 1;
				return;
			}
		}
		super.anIntArray241[0] = arg3;
		super.anInt2964 = 0;
		super.anInt2967 = 0;
		super.anInt2966 = 0;
		super.anIntArray242[0] = arg4;
		super.anInt11002 = (super.anIntArray242[0] << 9) + (arg0 << 8);
		super.anInt10998 = (super.anIntArray241[0] << 9) + (arg0 << 8);
		if (super.aClass12_Sub4_3 != null) {
			super.aClass12_Sub4_3.method1615();
		}
	}

	@OriginalMember(owner = "client!av", name = "g", descriptor = "(I)V")
	@Override
	public void method9158() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!ha;I)Lclient!maa;")
	@Override
	public Class12_Sub8 method9151(@OriginalArg(0) Class137 arg0) {
		if (this.aClass283_1 == null || !this.method613(2048, arg0)) {
			return null;
		}
		@Pc(19) Class26 local19 = arg0.method7923();
		@Pc(24) int local24 = super.aClass139_7.method3204();
		local19.method6444(local24);
		@Pc(42) Class58 local42 = Static486.aClass58ArrayArrayArray2[super.aByte146][super.anInt10998 >> Static579.anInt9935][super.anInt11002 >> Static579.anInt9935];
		if (local42 == null || local42.aClass12_Sub2_Sub4_1 == null) {
			super.anInt2939 = (int) ((float) super.anInt2939 - (float) super.anInt2939 / 10.0F);
		} else {
			@Pc(54) int local54 = super.anInt2939 - local42.aClass12_Sub2_Sub4_1.aShort87;
			super.anInt2939 = (int) ((float) super.anInt2939 - (float) local54 / 10.0F);
		}
		local19.method6443(super.anInt10998, -super.anInt2939 + super.anInt10997 - 20, super.anInt11002);
		@Pc(97) Class132 local97 = this.method2416();
		@Pc(112) Class283 local112 = this.aClass283_1.anIntArray638 == null ? this.aClass283_1 : this.aClass283_1.method7129(Static595.aClass241_1);
		super.aBoolean224 = false;
		@Pc(117) Class12_Sub8 local117 = null;
		if (Static56.aClass14_Sub22_5.aClass21_Sub10_1.method2383() == 1 && local112.aBoolean616 && local97.aBoolean277) {
			@Pc(148) Class275 local148 = super.anInt2921 != -1 && super.anInt2900 == 0 ? Static501.aClass191_2.method4322(super.anInt2921) : null;
			@Pc(165) Class275 local165 = super.anInt2960 == -1 || super.aBoolean222 && local148 != null ? null : Static501.aClass191_2.method4322(super.anInt2960);
			@Pc(215) Class80 local215 = Static501.method7350(local24, arg0, super.anInt2956, this.aClass283_1.aShort88 & 0xFFFF, local165 == null ? local148 : local165, this.aClass283_1.aByte129 & 0xFF, local165 == null ? super.anInt2902 : super.anInt2942, super.anInt2928, this.aClass283_1.anInt8617, this.aClass283_1.aShort89 & 0xFFFF, this.aClass283_1.aByte124 & 0xFF, super.aClass80Array3[0], super.anInt2897);
			if (local215 != null) {
				local117 = Static291.method4323(this.method618(), super.aClass80Array3.length + 1);
				super.aBoolean224 = true;
				arg0.C(false);
				if (Static401.aBoolean511) {
					local215.method6375(local19, local117.aClass12_Sub1Array1[super.aClass80Array3.length], Static331.anInt6277, 0);
				} else {
					local215.method6391(local19, local117.aClass12_Sub1Array1[super.aClass80Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local19.method6444(local24);
		local19.method6443(super.anInt10998, super.anInt10997 - super.anInt2939 - 5, super.anInt11002);
		if (local117 == null) {
			local117 = Static291.method4323(this.method618(), super.aClass80Array3.length);
		}
		this.method2418(arg0, false, local19, super.aClass80Array3);
		@Pc(304) int local304;
		if (Static401.aBoolean511) {
			for (local304 = 0; super.aClass80Array3.length > local304; local304++) {
				if (super.aClass80Array3[local304] != null) {
					super.aClass80Array3[local304].method6375(local19, local117.aClass12_Sub1Array1[local304], Static331.anInt6277, 0);
				}
			}
		} else {
			for (local304 = 0; super.aClass80Array3.length > local304; local304++) {
				if (super.aClass80Array3[local304] != null) {
					super.aClass80Array3[local304].method6391(local19, local117.aClass12_Sub1Array1[local304], 0);
				}
			}
		}
		if (super.aClass12_Sub4_3 != null) {
			@Pc(369) Class196 local369 = super.aClass12_Sub4_3.method1613();
			if (Static401.aBoolean511) {
				arg0.method7942(local369, Static331.anInt6277);
			} else {
				arg0.method7917(local369);
			}
		}
		for (local304 = 0; super.aClass80Array3.length > local304; local304++) {
			if (super.aClass80Array3[local304] != null) {
				super.aBoolean224 |= super.aClass80Array3[local304].F();
			}
		}
		super.aClass80Array3[0] = super.aClass80Array3[1] = super.aClass80Array3[2] = null;
		super.anInt2926 = Static274.anInt4757;
		return local117;
	}

	@OriginalMember(owner = "client!av", name = "i", descriptor = "(B)Z")
	private boolean method618() {
		return this.aClass283_1.aBoolean618;
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method9160() {
		return false;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)I")
	@Override
	protected int method2414() {
		if (this.aClass283_1.anIntArray638 != null) {
			@Pc(19) Class283 local19 = this.aClass283_1.method7129(Static595.aClass241_1);
			if (local19 != null && local19.anInt8614 != -1) {
				return local19.anInt8614;
			}
		}
		return this.aClass283_1.anInt8614;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(BII)V")
	public void method620(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray241[0];
		@Pc(15) int local15 = super.anIntArray242[0];
		if (arg1 == 0) {
			local15++;
		}
		if (arg1 == 1) {
			local15++;
			local10++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local10++;
			local15--;
		}
		if (arg1 == 4) {
			local15--;
		}
		if (arg1 == 5) {
			local10--;
			local15--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (super.anInt2921 != -1 && Static501.aClass191_2.method4322(super.anInt2921).anInt7922 == 1) {
			super.anInt2921 = -1;
			super.anIntArray234 = null;
		}
		if (arg1 == 7) {
			local10--;
			local15++;
		}
		for (@Pc(77) int local77 = 0; local77 < super.aClass84Array3.length; local77++) {
			if (super.aClass84Array3[local77].anInt2468 != -1) {
				@Pc(95) Class60 local95 = Static556.aClass216_2.method5268(super.aClass84Array3[local77].anInt2468);
				if (local95.aBoolean127 && local95.anInt1664 != -1 && Static501.aClass191_2.method4322(local95.anInt1664).anInt7922 == 1) {
					super.aClass84Array3[local77].anInt2468 = -1;
				}
			}
		}
		if (super.anInt2964 < 9) {
			super.anInt2964++;
		}
		for (@Pc(143) int local143 = super.anInt2964; local143 > 0; local143--) {
			super.anIntArray241[local143] = super.anIntArray241[local143 - 1];
			super.anIntArray242[local143] = super.anIntArray242[local143 - 1];
			super.aByteArray43[local143] = super.aByteArray43[local143 - 1];
		}
		super.anIntArray241[0] = local10;
		super.anIntArray242[0] = local15;
		super.aByteArray43[0] = (byte) arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class4_Sub3_Sub3_Sub3_Sub1 extends Class4_Sub3_Sub3_Sub3 {

	@OriginalMember(owner = "client!fr", name = "bd", descriptor = "[I")
	public static final int[] anIntArray173 = new int[4096];

	@OriginalMember(owner = "client!fr", name = "Mc", descriptor = "Lclient!ufa;")
	public Class362 aClass362_1;

	@OriginalMember(owner = "client!fr", name = "jd", descriptor = "I")
	public int anInt2817;

	@OriginalMember(owner = "client!fr", name = "Hc", descriptor = "Lclient!js;")
	public Class194 aClass194_1;

	@OriginalMember(owner = "client!fr", name = "Sc", descriptor = "Ljava/lang/String;")
	public String aString34;

	@OriginalMember(owner = "client!fr", name = "Fc", descriptor = "I")
	public int anInt2814 = -1;

	@OriginalMember(owner = "client!fr", name = "Oc", descriptor = "I")
	public int anInt2811 = 1;

	@OriginalMember(owner = "client!fr", name = "Ic", descriptor = "I")
	public int anInt2829 = -1;

	@OriginalMember(owner = "client!fr", name = "Xc", descriptor = "I")
	public int anInt2819 = 1;

	static {
		for (@Pc(152) int local152 = 0; local152 < 4096; local152++) {
			anIntArray173[local152] = Static536.method7903(local152);
		}
	}

	@OriginalMember(owner = "client!fr", name = "s", descriptor = "(I)Z")
	private boolean method2566() {
		return this.aClass362_1.aBoolean698;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!ha;BIIZLclient!haa;I)V")
	@Override
	public void method9480(@OriginalArg(0) Class144 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class4_Sub3 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(ILclient!ha;)Lclient!w;")
	@Override
	public Class4_Sub9 method9491(@OriginalArg(1) Class144 arg0) {
		if (this.aClass362_1 == null || !this.method2573(2048, arg0)) {
			return null;
		}
		@Pc(22) Class263 local22 = arg0.method6907();
		@Pc(27) int local27 = super.aClass200_7.method4987();
		local22.method8447(local27);
		@Pc(45) Class89 local45 = Static63.aClass89ArrayArrayArray1[super.aByte146][super.anInt11184 >> Static110.anInt1858][super.anInt11178 >> Static110.anInt1858];
		if (local45 == null || local45.aClass4_Sub3_Sub2_1 == null) {
			super.anInt3279 = (int) ((float) super.anInt3279 - (float) super.anInt3279 / 10.0F);
		} else {
			@Pc(76) int local76 = super.anInt3279 - local45.aClass4_Sub3_Sub2_1.aShort123;
			super.anInt3279 = (int) ((float) super.anInt3279 - (float) local76 / 10.0F);
		}
		local22.method8442(super.anInt11184, -super.anInt3279 + super.anInt11182 - 20, super.anInt11178);
		@Pc(105) Class141 local105 = this.method2865();
		@Pc(119) Class362 local119 = this.aClass362_1.lb == null ? this.aClass362_1 : this.aClass362_1.method8641(Static188.aClass238_1);
		super.aBoolean240 = false;
		@Pc(124) Class4_Sub9 local124 = null;
		if (Static181.aClass14_Sub26_9.aClass43_Sub12_1.method4071() == 1 && local119.aBoolean696 && local105.aBoolean255) {
			@Pc(160) Class181 local160 = super.aClass181_8.method8970() && super.aClass181_8.method8969() ? super.aClass181_8 : null;
			@Pc(180) Class181 local180 = super.aClass181_7.method8970() && (!super.aBoolean236 || local160 == null) ? super.aClass181_7 : null;
			@Pc(224) Class129 local224 = Static205.method3044(super.aClass129Array3[0], local27, super.anInt3253, this.aClass362_1.aByte122 & 0xFF, local180 == null ? local160 : local180, super.anInt3246, this.aClass362_1.aShort105 & 0xFFFF, arg0, this.aClass362_1.aByte126 & 0xFF, this.aClass362_1.anInt10069, this.aClass362_1.aShort106 & 0xFFFF, super.anInt3281);
			if (local224 != null) {
				local124 = Static272.method7693(super.aClass129Array3.length + 1, this.method2566());
				super.aBoolean240 = true;
				arg0.C(false);
				if (Static6.aBoolean9) {
					local224.method5289(local22, local124.aClass4_Sub1Array1[super.aClass129Array3.length], Static481.anInt10749, 0);
				} else {
					local224.method5307(local22, local124.aClass4_Sub1Array1[super.aClass129Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local22.method8447(local27);
		local22.method8442(super.anInt11184, super.anInt11182 - super.anInt3279 - 5, super.anInt11178);
		if (local124 == null) {
			local124 = Static272.method7693(super.aClass129Array3.length, this.method2566());
		}
		this.method2883(false, local22, arg0, super.aClass129Array3);
		@Pc(323) int local323;
		if (Static6.aBoolean9) {
			for (local323 = 0; local323 < super.aClass129Array3.length; local323++) {
				if (super.aClass129Array3[local323] != null) {
					super.aClass129Array3[local323].method5289(local22, local124.aClass4_Sub1Array1[local323], Static481.anInt10749, 0);
				}
			}
		} else {
			for (local323 = 0; super.aClass129Array3.length > local323; local323++) {
				if (super.aClass129Array3[local323] != null) {
					super.aClass129Array3[local323].method5307(local22, local124.aClass4_Sub1Array1[local323], 0);
				}
			}
		}
		if (super.aClass4_Sub8_5 != null) {
			@Pc(399) Class304 local399 = super.aClass4_Sub8_5.method8671();
			if (Static6.aBoolean9) {
				arg0.method6902(local399, Static481.anInt10749);
			} else {
				arg0.method6903(local399);
			}
		}
		for (local323 = 0; super.aClass129Array3.length > local323; local323++) {
			if (super.aClass129Array3[local323] != null) {
				super.aBoolean240 |= super.aClass129Array3[local323].F();
			}
		}
		super.aClass129Array3[0] = super.aClass129Array3[1] = super.aClass129Array3[2] = null;
		super.anInt3262 = Static688.anInt11168;
		return local124;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method2876() {
		return Static551.aClass355_1.aBoolean679;
	}

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method9483() {
		return false;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9490(@OriginalArg(0) Class144 arg0) {
		if (this.aClass362_1 == null || !super.aBoolean239 && !this.method2573(0, arg0)) {
			return;
		}
		@Pc(26) Class263 local26 = arg0.method6907();
		local26.method8447(super.aClass200_7.method4987());
		local26.method8442(super.anInt11184, super.anInt11182 - 20, super.anInt11178);
		this.method2883(super.aBoolean239, local26, arg0, super.aClass129Array3);
		for (@Pc(58) int local58 = 0; local58 < super.aClass129Array3.length; local58++) {
			super.aClass129Array3[local58] = null;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILjava/lang/String;IZ)V")
	public void method2568(@OriginalArg(1) String arg0) {
		@Pc(9) int local9 = Static258.method4324() * Static551.aClass355_1.anInt9853;
		this.method2879(local9, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!fr", name = "n", descriptor = "(I)I")
	@Override
	public int method2869() {
		if (this.aClass362_1.lb != null) {
			@Pc(18) Class362 local18 = this.aClass362_1.method8641(Static188.aClass238_1);
			if (local18 != null && local18.anInt10076 != -1) {
				return local18.anInt10076;
			}
		}
		return this.aClass362_1.anInt10076;
	}

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "(I)I")
	@Override
	public int method9477() {
		return this.aClass362_1 == null ? 0 : this.aClass362_1.anInt10081;
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(B)Z")
	public boolean method2569() {
		return this.aClass362_1 != null;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(Lclient!ha;I)Lclient!th;")
	@Override
	public Class348 method9492(@OriginalArg(0) Class144 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIB)V")
	public void method2570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray200[0];
		@Pc(15) int local15 = super.anIntArray201[0];
		if (arg1 == 0) {
			local15++;
		}
		if (arg1 == 1) {
			local10++;
			local15++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local15--;
			local10++;
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
		if (arg1 == 7) {
			local10--;
			local15++;
		}
		if (super.aClass181_8.method8970() && super.aClass181_8.method8952().anInt7191 == 1) {
			super.anIntArray198 = null;
			super.aClass181_8.method8964(-1, 0);
		}
		for (@Pc(100) int local100 = 0; super.aClass214Array3.length > local100; local100++) {
			if (super.aClass214Array3[local100].anInt5678 != -1) {
				@Pc(121) Class203 local121 = Static453.aClass281_2.method6686(super.aClass214Array3[local100].anInt5678);
				if (local121.aBoolean402 && local121.anInt5538 != -1 && Static59.aClass204_1.method5041(local121.anInt5538).anInt7191 == 1) {
					super.aClass214Array3[local100].aClass181_10.method8964(-1, 0);
					super.aClass214Array3[local100].anInt5678 = -1;
				}
			}
		}
		if (super.anIntArray200.length - 1 > super.anInt3298) {
			super.anInt3298++;
		}
		for (@Pc(193) int local193 = super.anInt3298; local193 > 0; local193--) {
			super.anIntArray200[local193] = super.anIntArray200[local193 - 1];
			super.anIntArray201[local193] = super.anIntArray201[local193 - 1];
			super.aByteArray50[local193] = super.aByteArray50[local193 - 1];
		}
		super.anIntArray200[0] = local10;
		if (37 != 37) {
			this.method2866((byte) 42);
		}
		super.aByteArray50[0] = (byte) arg0;
		super.anIntArray201[0] = local15;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IZILclient!ha;)Z")
	@Override
	public boolean method9478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class144 arg2) {
		if (this.aClass362_1 == null || !this.method2573(131072, arg2)) {
			return false;
		}
		@Pc(22) Class263 local22 = arg2.method6907();
		@Pc(27) int local27 = super.aClass200_7.method4987();
		local22.method8447(local27);
		local22.method8442(super.anInt11184, super.anInt11182, super.anInt11178);
		@Pc(40) boolean local40 = false;
		for (@Pc(42) int local42 = 0; super.aClass129Array3.length > local42; local42++) {
			if (super.aClass129Array3[local42] != null) {
				@Pc(75) boolean var10000;
				label50: {
					if (this.aClass362_1.anInt10081 <= 0) {
						label48: {
							if (this.aClass362_1.anInt10084 == -1) {
								if (this.aClass362_1.anInt10069 == 1) {
									break label48;
								}
								var10000 = false;
							} else {
								if (this.aClass362_1.anInt10084 == 1) {
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
				@Pc(91) boolean local91 = var10000;
				@Pc(107) boolean local107;
				if (Static6.aBoolean9) {
					local107 = super.aClass129Array3[local42].method5302(arg1, arg0, local22, local91, this.aClass362_1.anInt10081, Static481.anInt10749);
				} else {
					local107 = super.aClass129Array3[local42].method5296(arg1, arg0, local22, local91, this.aClass362_1.anInt10081);
				}
				if (local107) {
					local40 = true;
					break;
				}
			}
		}
		for (@Pc(136) int local136 = 0; super.aClass129Array3.length > local136; local136++) {
			super.aClass129Array3[local136] = null;
		}
		return local40;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIZI)V")
	public void method2571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte146 = super.aByte147 = (byte) arg1;
		if (Static551.method7974(arg2, arg4)) {
			super.aByte147++;
		}
		if (super.aClass181_8.method8970() && super.aClass181_8.method8952().anInt7191 == 1) {
			super.anIntArray198 = null;
			super.aClass181_8.method8964(-1, 0);
		}
		for (@Pc(52) int local52 = 0; local52 < super.aClass214Array3.length; local52++) {
			if (super.aClass214Array3[local52].anInt5678 != -1) {
				@Pc(72) Class203 local72 = Static453.aClass281_2.method6686(super.aClass214Array3[local52].anInt5678);
				if (local72.aBoolean402 && local72.anInt5538 != -1 && Static59.aClass204_1.method5041(local72.anInt5538).anInt7191 == 1) {
					super.aClass214Array3[local52].aClass181_10.method8964(-1, 0);
					super.aClass214Array3[local52].anInt5678 = -1;
				}
			}
		}
		if (!arg3) {
			@Pc(128) int local128 = arg2 - super.anIntArray200[0];
			@Pc(136) int local136 = arg4 - super.anIntArray201[0];
			if (local128 >= -8 && local128 <= 8 && local136 >= -8 && local136 <= 8) {
				if (super.anIntArray200.length - 1 > super.anInt3298) {
					super.anInt3298++;
				}
				for (@Pc(183) int local183 = super.anInt3298; local183 > 0; local183--) {
					super.anIntArray200[local183] = super.anIntArray200[local183 - 1];
					super.anIntArray201[local183] = super.anIntArray201[local183 - 1];
					super.aByteArray50[local183] = super.aByteArray50[local183 - 1];
				}
				super.anIntArray200[0] = arg2;
				super.aByteArray50[0] = 1;
				super.anIntArray201[0] = arg4;
				return;
			}
		}
		super.anInt3298 = 0;
		super.anInt3299 = 0;
		super.anIntArray200[0] = arg2;
		super.anInt3297 = 0;
		super.anIntArray201[0] = arg4;
		super.anInt11184 = (super.anIntArray200[0] << 9) + (arg0 << 8);
		super.anInt11178 = (super.anIntArray201[0] << 9) + (arg0 << 8);
		if (super.aClass4_Sub8_5 != null) {
			super.aClass4_Sub8_5.method8681();
		}
	}

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "(I)I")
	@Override
	public int method2867() {
		if (this.aClass362_1.lb != null) {
			@Pc(20) Class362 local20 = this.aClass362_1.method8641(Static188.aClass238_1);
			if (local20 != null && local20.anInt10065 != -1) {
				return local20.anInt10065;
			}
		}
		return this.aClass362_1.anInt10065 == -1 ? super.method2867() : this.aClass362_1.anInt10065;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILclient!ufa;)V")
	public void method2572(@OriginalArg(1) Class362 arg0) {
		if (arg0 != this.aClass362_1 && Static455.aBoolean533 && Static157.method2249(super.anInt3238)) {
			Static465.method6860();
		}
		this.aClass362_1 = arg0;
		if (this.aClass362_1 != null) {
			this.aString34 = this.aClass362_1.aString115;
			this.anInt2817 = this.aClass362_1.anInt10104;
		}
		if (super.aClass4_Sub8_5 != null) {
			super.aClass4_Sub8_5.method8681();
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IILclient!ha;)Z")
	private boolean method2573(@OriginalArg(0) int arg0, @OriginalArg(2) Class144 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) Class141 local9 = this.method2865();
		@Pc(27) Class181 local27 = super.aClass181_8.method8970() && !super.aClass181_8.method8969() ? super.aClass181_8 : null;
		@Pc(47) Class181 local47 = super.aClass181_7.method8970() && (!super.aBoolean236 || local27 == null) ? super.aClass181_7 : null;
		@Pc(50) int local50 = local9.anInt3557;
		@Pc(53) int local53 = local9.anInt3524;
		if (local50 != 0 || local53 != 0 || local9.anInt3537 != 0 || local9.anInt3551 != 0) {
			arg0 |= 0x7;
		}
		@Pc(100) boolean local100 = super.aByte75 != 0 && Static530.anInt9105 >= super.anInt3288 && Static530.anInt9105 < super.anInt3284;
		if (local100) {
			arg0 |= 0x80000;
		}
		@Pc(111) int local111 = super.aClass200_7.method4987();
		@Pc(134) Class129 local134 = super.aClass129Array3[0] = this.aClass362_1.method8640(super.anIntArray199, local47, local27, local111, Static188.aClass238_1, this.aClass194_1, Static52.aClass175_1, arg1, arg0, super.aClass181_Sub2_Sub1Array3);
		if (local134 == null) {
			return false;
		}
		super.anInt3243 = local134.fa();
		super.anInt3244 = local134.ma();
		this.method2860(local134);
		if (local50 == 0 && local53 == 0) {
			this.method2878(this.method2870(0) << 9, 0, 0, this.method2870(0) << 9, local111);
		} else {
			this.method2878(local50, local9.anInt3555, local9.anInt3527, local53, local111);
			if (super.anInt3246 != 0) {
				super.aClass129Array3[0].FA(super.anInt3246);
			}
			if (super.anInt3253 != 0) {
				super.aClass129Array3[0].VA(super.anInt3253);
			}
			if (super.anInt3281 != 0) {
				super.aClass129Array3[0].H(0, super.anInt3281, 0);
			}
		}
		if (local100) {
			local134.method5285(super.aByte74, super.aByte73, super.aByte72, super.aByte75 & 0xFF);
		}
		this.method2872(local53, local111, local5, local50, local9, arg1);
		return true;
	}

	@OriginalMember(owner = "client!fr", name = "k", descriptor = "(I)V")
	@Override
	public void method9482() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)Lclient!wp;")
	@Override
	public Class396 method2874() {
		return super.aClass396_3 != null && super.aClass396_3.aString123 == null ? null : super.aClass396_3;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)I")
	@Override
	protected int method2866(@OriginalArg(0) byte arg0) {
		if (this.aClass362_1.lb != null) {
			@Pc(13) Class362 local13 = this.aClass362_1.method8641(Static188.aClass238_1);
			if (local13 != null && local13.anInt10100 != -1) {
				return local13.anInt10100;
			}
		}
		if (arg0 != -25) {
			this.anInt2814 = 0;
		}
		return this.aClass362_1.anInt10100;
	}
}

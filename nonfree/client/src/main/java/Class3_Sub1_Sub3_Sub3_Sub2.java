import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class3_Sub1_Sub3_Sub3_Sub2 extends Class3_Sub1_Sub3_Sub3 {

	@OriginalMember(owner = "client!ke", name = "td", descriptor = "I")
	private int anInt6109;

	@OriginalMember(owner = "client!ke", name = "Ed", descriptor = "I")
	public int anInt6119;

	@OriginalMember(owner = "client!ke", name = "Jd", descriptor = "Lclient!oo;")
	public Class249 aClass249_1;

	@OriginalMember(owner = "client!ke", name = "Kd", descriptor = "Ljava/lang/String;")
	public String aString63;

	@OriginalMember(owner = "client!ke", name = "Rd", descriptor = "Ljava/lang/String;")
	public String aString64;

	@OriginalMember(owner = "client!ke", name = "Wd", descriptor = "I")
	public int anInt6132;

	@OriginalMember(owner = "client!ke", name = "qd", descriptor = "Z")
	public boolean aBoolean457 = false;

	@OriginalMember(owner = "client!ke", name = "pd", descriptor = "I")
	public int anInt6106 = 0;

	@OriginalMember(owner = "client!ke", name = "Id", descriptor = "I")
	public int anInt6123 = -1;

	@OriginalMember(owner = "client!ke", name = "ud", descriptor = "Z")
	public boolean aBoolean458 = false;

	@OriginalMember(owner = "client!ke", name = "zd", descriptor = "I")
	public int anInt6114 = -1;

	@OriginalMember(owner = "client!ke", name = "Md", descriptor = "Z")
	public boolean aBoolean459 = false;

	@OriginalMember(owner = "client!ke", name = "sd", descriptor = "I")
	public int anInt6108 = -1;

	@OriginalMember(owner = "client!ke", name = "vd", descriptor = "I")
	public int anInt6110 = -1;

	@OriginalMember(owner = "client!ke", name = "be", descriptor = "Z")
	public boolean aBoolean461 = false;

	@OriginalMember(owner = "client!ke", name = "ee", descriptor = "I")
	public int anInt6136 = 0;

	@OriginalMember(owner = "client!ke", name = "xd", descriptor = "I")
	public int anInt6112 = -1;

	@OriginalMember(owner = "client!ke", name = "Yd", descriptor = "Z")
	public boolean aBoolean460 = false;

	@OriginalMember(owner = "client!ke", name = "he", descriptor = "I")
	public int anInt6139 = -1;

	@OriginalMember(owner = "client!ke", name = "Pd", descriptor = "I")
	public int anInt6126 = 0;

	@OriginalMember(owner = "client!ke", name = "ae", descriptor = "I")
	public int anInt6134 = 0;

	@OriginalMember(owner = "client!ke", name = "de", descriptor = "B")
	private byte aByte101 = 0;

	@OriginalMember(owner = "client!ke", name = "fe", descriptor = "I")
	public int anInt6137 = 255;

	@OriginalMember(owner = "client!ke", name = "Nd", descriptor = "I")
	public int anInt6124 = -1;

	@OriginalMember(owner = "client!ke", name = "Zd", descriptor = "B")
	private byte aByte100 = 0;

	@OriginalMember(owner = "client!ke", name = "Ld", descriptor = "B")
	private byte aByte99 = 0;

	@OriginalMember(owner = "client!ke", name = "ie", descriptor = "I")
	public int anInt6140 = -1;

	@OriginalMember(owner = "client!ke", name = "le", descriptor = "I")
	public int anInt6143 = 0;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8611(@OriginalArg(0) Class20 arg0) {
		if (this.aClass249_1 == null || !super.aBoolean455 && !this.method5229(0, arg0)) {
			return;
		}
		@Pc(20) Class30 local20 = arg0.method7308();
		local20.method4650(super.aClass343_7.method8548());
		local20.method4646(super.anInt10303, super.anInt10306 - 5, super.anInt10310);
		this.method5210(arg0, local20, super.aBoolean455, super.aClass166Array3);
		super.aClass166Array3[0] = super.aClass166Array3[1] = super.aClass166Array3[2] = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIB)V")
	public void method5219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt6103 = 0;
		super.anIntArray358[0] = arg1;
		super.anInt6102 = 0;
		super.anInt6105 = 0;
		super.anIntArray357[0] = arg0;
		@Pc(31) int local31 = this.method5214();
		super.anInt10310 = local31 * 256 + super.anIntArray357[0] * 512;
		super.anInt10303 = super.anIntArray358[0] * 512 + local31 * 256;
		if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 == this) {
			Static305.method5400();
		}
		if (super.aClass3_Sub9_5 != null) {
			super.aClass3_Sub9_5.method8580();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method5220() {
		return this.aString64;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BIII)V")
	public void method5221(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt6102 < 9) {
			super.anInt6102++;
		}
		for (@Pc(26) int local26 = super.anInt6102; local26 > 0; local26--) {
			super.anIntArray358[local26] = super.anIntArray358[local26 - 1];
			super.anIntArray357[local26] = super.anIntArray357[local26 - 1];
			super.aByteArray82[local26] = super.aByteArray82[local26 - 1];
		}
		super.anIntArray358[0] = arg1;
		super.aByteArray82[0] = arg0;
		super.anIntArray357[0] = arg2;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8615(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass249_1 == null || !this.method5229(131072, arg0)) {
			return false;
		}
		@Pc(19) Class30 local19 = arg0.method7308();
		@Pc(24) int local24 = super.aClass343_7.method8548();
		local19.method4650(local24);
		local19.method4646(super.anInt10303, super.anInt10306, super.anInt10310);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass166Array3.length; local39++) {
			if (super.aClass166Array3[local39] != null && (Static639.aBoolean753 ? super.aClass166Array3[local39].method6693(arg2, arg1, local19, true, 0, Static380.anInt7419) : super.aClass166Array3[local39].method6698(arg2, arg1, local19, true, 0))) {
				local37 = true;
				break;
			}
		}
		super.aClass166Array3[0] = super.aClass166Array3[1] = super.aClass166Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLclient!cea;)V")
	public void method5222(@OriginalArg(1) Class2_Sub11 arg0) {
		arg0.anInt10066 = 0;
		@Pc(12) int local12 = arg0.method8383();
		this.aByte99 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean457;
		this.aBoolean457 = (local12 & 0x2) != 0;
		@Pc(41) boolean local41 = (local12 & 0x4) != 0;
		@Pc(45) int local45 = super.method5214();
		this.method5212((local12 >> 3 & 0x7) + 1);
		this.aByte100 = (byte) (local12 >> 6 & 0x3);
		super.anInt10303 += this.method5214() - local45 << 8;
		super.anInt10310 += this.method5214() - local45 << 8;
		this.aByte101 = arg0.method8384();
		this.anInt6124 = arg0.method8384();
		this.anInt6110 = arg0.method8384();
		this.aBoolean460 = arg0.method8384() == 1;
		if (Static193.aClass107_2 == Static448.aClass107_7 && Static468.anInt8823 >= 2) {
			this.aBoolean460 = false;
		}
		this.anInt6126 = 0;
		@Pc(132) int local132 = -1;
		@Pc(135) int[] local135 = new int[12];
		@Pc(158) int local158;
		@Pc(164) int local164;
		@Pc(205) int local205;
		for (@Pc(137) int local137 = 0; local137 < 12; local137++) {
			@Pc(143) int local143 = arg0.method8383();
			if (local143 == 0) {
				local135[local137] = 0;
			} else {
				local158 = arg0.method8383();
				local164 = local158 + (local143 << 8);
				if (local137 == 0 && local164 == 65535) {
					local132 = arg0.method8326();
					this.anInt6126 = arg0.method8383();
					break;
				}
				if (local164 >= 32768) {
					local164 = Static221.anIntArray251[local164 - 32768];
					local135[local137] = local164 | 0x40000000;
					local205 = Static635.aClass336_2.method8424(local164).anInt9225;
					if (local205 != 0) {
						this.anInt6126 = local205;
					}
				} else {
					local135[local137] = local164 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(229) int[] local229 = new int[5];
		for (local158 = 0; local158 < 5; local158++) {
			local164 = arg0.method8383();
			if (Static411.aShortArrayArrayArray6.length < 1 || local164 < 0 || Static411.aShortArrayArrayArray6[0][local158].length <= local164) {
				local164 = 0;
			}
			local229[local158] = local164;
		}
		this.anInt6109 = arg0.method8326();
		this.aString63 = arg0.method8373();
		this.aString64 = this.aString63;
		if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 == this) {
			Static119.aString24 = this.aString63;
		}
		this.anInt6106 = arg0.method8383();
		if (local41) {
			this.anInt6143 = arg0.method8326();
			this.anInt6136 = this.anInt6106;
			if (this.anInt6143 == 65535) {
				this.anInt6143 = -1;
			}
			this.anInt6140 = -1;
		} else {
			this.anInt6143 = 0;
			this.anInt6136 = arg0.method8383();
			this.anInt6140 = arg0.method8383();
			if (this.anInt6140 == 255) {
				this.anInt6140 = -1;
			}
		}
		local164 = this.anInt6134;
		this.anInt6134 = arg0.method8383();
		@Pc(371) int local371;
		if (this.anInt6134 == 0) {
			Static619.method9025(this);
		} else {
			local205 = this.anInt6123;
			@Pc(368) int local368 = this.anInt6114;
			local371 = this.anInt6139;
			@Pc(374) int local374 = this.anInt6108;
			@Pc(377) int local377 = this.anInt6137;
			this.anInt6123 = arg0.method8326();
			this.anInt6114 = arg0.method8326();
			this.anInt6139 = arg0.method8326();
			this.anInt6108 = arg0.method8326();
			this.anInt6137 = arg0.method8383();
			if (this.aBoolean457 != local21 || this.anInt6134 != local164 || this.anInt6123 != local205 || local368 != this.anInt6114 || local371 != this.anInt6139 || this.anInt6108 != local374 || local377 != this.anInt6137) {
				Static326.method5607(this);
			}
		}
		if (this.aClass249_1 == null) {
			this.aClass249_1 = new Class249();
		}
		local205 = this.aClass249_1.anInt7681;
		@Pc(467) int[] local467 = this.aClass249_1.anIntArray494;
		this.aClass249_1.method6587(local132, this.method5199(), local135, this.aByte99 == 1, local229);
		if (local132 != local205) {
			super.anInt10303 = (super.anIntArray358[0] << 9) + (this.method5214() << 8);
			super.anInt10310 = (super.anIntArray357[0] << 9) + (this.method5214() << 8);
		}
		if (super.anInt6083 == Static569.anInt10211 && local467 != null) {
			for (local371 = 0; local371 < local229.length; local371++) {
				if (local229[local371] != local467[local371]) {
					Static635.aClass336_2.method8420();
					break;
				}
			}
		}
		if (super.aClass3_Sub9_5 != null) {
			super.aClass3_Sub9_5.method8580();
		}
		if (super.anInt6064 == -1 || !super.aBoolean450) {
			return;
		}
		@Pc(567) Class311 local567 = this.method5200();
		if (!local567.method7840(super.anInt6064)) {
			super.aBoolean450 = false;
			super.anInt6064 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!ha;ILclient!ka;IILclient!bca;I)V")
	private void method5223(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class166 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class30 arg5, @OriginalArg(7) int arg6) {
		@Pc(14) int local14 = arg0 * arg0 + arg4 * arg4;
		if (local14 < 262144 || arg2 < local14) {
			return;
		}
		@Pc(34) int local34 = (int) (Math.atan2((double) arg0, (double) arg4) * 2607.5945876176133D) & 0x3FFF;
		@Pc(46) Class166 local46 = Static599.method8795(super.anInt6053, super.anInt6093, super.anInt6022, local34, arg6, arg1);
		if (local46 != null) {
			arg1.C(false);
			local46.method6685(arg5, null, 0);
			arg1.C(true);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIILclient!ka;ILclient!bca;Lclient!ha;I)V")
	private void method5224(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class166 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class30 arg5, @OriginalArg(7) Class20 arg6, @OriginalArg(8) int arg7) {
		@Pc(17) int local17 = arg7 * arg7 + arg0 * arg0;
		if (local17 < 262144 || arg4 < local17) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg0, (double) arg7) * 2607.5945876176133D) & 0x3FFF;
		@Pc(51) Class166 local51 = Static599.method8795(super.anInt6053, super.anInt6093, super.anInt6022, local39, arg2, arg6);
		if (local51 != null) {
			arg6.C(false);
			local51.method6678(arg5, null, arg1, 0);
			arg6.C(true);
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(Lclient!ha;I)Lclient!hw;")
	@Override
	public Class142 method8605(@OriginalArg(0) Class20 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V")
	@Override
	public void method8616() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ha;IZLclient!ga;IBI)V")
	@Override
	public void method8604(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIBI)V")
	public void method5225(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt6079 != -1 && Static195.aClass193_1.method5573(super.anInt6079).anInt4703 == 1) {
			super.anInt6079 = -1;
			super.anIntArray349 = null;
		}
		@Pc(42) Class109 local42;
		if (super.anInt6065 != -1) {
			local42 = Static459.aClass62_2.method2250(super.anInt6065);
			if (local42.aBoolean296 && local42.anInt3971 != -1 && Static195.aClass193_1.method5573(local42.anInt3971).anInt4703 == 1) {
				super.anInt6065 = -1;
			}
		}
		if (super.anInt6084 != -1) {
			local42 = Static459.aClass62_2.method2250(super.anInt6084);
			if (local42.aBoolean296 && local42.anInt3971 != -1 && Static195.aClass193_1.method5573(local42.anInt3971).anInt4703 == 1) {
				super.anInt6084 = -1;
			}
		}
		this.anInt6112 = -1;
		if (arg2 < 0 || arg2 >= Static47.anInt1794 || arg0 < 0 || arg0 >= Static209.anInt4742) {
			this.method5219(arg0, arg2);
		} else if (super.anIntArray358[0] >= 0 && Static47.anInt1794 > super.anIntArray358[0] && super.anIntArray357[0] >= 0 && Static209.anInt4742 > super.anIntArray357[0]) {
			if (arg1 == 2) {
				Static501.method7741(arg0, arg2, this);
			}
			this.method5221(arg1, arg2, arg0);
		} else {
			this.method5219(arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(ILclient!ha;)Lclient!jda;")
	@Override
	public Class3_Sub4 method8610(@OriginalArg(1) Class20 arg0) {
		if (this.aClass249_1 == null || !this.method5229(2048, arg0)) {
			return null;
		}
		@Pc(19) Class30 local19 = arg0.method7308();
		@Pc(24) int local24 = super.aClass343_7.method8548();
		local19.method4650(local24);
		@Pc(42) Class100 local42 = Static395.aClass100ArrayArrayArray3[super.aByte132][super.anInt10303 >> Static151.anInt3896][super.anInt10310 >> Static151.anInt3896];
		if (local42 == null || local42.aClass3_Sub1_Sub1_1 == null) {
			super.anInt6069 = (int) ((float) super.anInt6069 - (float) super.anInt6069 / 10.0F);
		} else {
			@Pc(69) int local69 = super.anInt6069 - local42.aClass3_Sub1_Sub1_1.aShort127;
			super.anInt6069 = (int) ((float) super.anInt6069 - (float) local69 / 10.0F);
		}
		local19.method4646(super.anInt10303, super.anInt10306 - super.anInt6069 - 20, super.anInt10310);
		@Pc(95) Class3_Sub4 local95 = null;
		super.aBoolean456 = false;
		if (Static74.aClass2_Sub13_5.aClass14_Sub28_1.method8965() == 1) {
			@Pc(110) Class311 local110 = this.method5200();
			if (local110.aBoolean669 && (this.aClass249_1.anInt7681 == -1 || Static462.aClass355_2.method8744(this.aClass249_1.anInt7681).aBoolean52)) {
				@Pc(144) Class130 local144 = super.anInt6079 != -1 && super.anInt6029 == 0 ? Static195.aClass193_1.method5573(super.anInt6079) : null;
				@Pc(165) Class130 local165 = super.anInt6064 == -1 || this.aBoolean458 || super.aBoolean450 && local144 != null ? null : Static195.aClass193_1.method5573(super.anInt6064);
				@Pc(197) Class166 local197 = Static124.method9249(super.anInt6093, local24, super.aClass166Array3[0], super.anInt6022, local165 == null ? super.anInt6063 : super.anInt6047, 0, 1, super.anInt6053, arg0, 160, 0, 240, local165 == null ? local144 : local165);
				if (local197 != null) {
					local95 = Static546.method8162(super.aClass166Array3.length + 1, true);
					super.aBoolean456 = true;
					arg0.C(false);
					if (Static639.aBoolean753) {
						local197.method6678(local19, local95.aClass3_Sub3Array1[super.aClass166Array3.length], Static380.anInt7419, 0);
					} else {
						local197.method6685(local19, local95.aClass3_Sub3Array1[super.aClass166Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(258) int local258;
		if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 == this) {
			local19.method4649(super.anInt10303, super.anInt10306, super.anInt10310);
			for (local258 = Static351.aClass373Array1.length - 1; local258 >= 0; local258--) {
				@Pc(264) Class373 local264 = Static351.aClass373Array1[local258];
				if (local264 != null && local264.anInt11015 != -1) {
					@Pc(296) int local296;
					if (local264.anInt11021 == 1) {
						@Pc(284) Class2_Sub33 local284 = (Class2_Sub33) Static600.aClass99_79.method3056((long) local264.anInt11014);
						if (local284 != null) {
							@Pc(289) Class3_Sub1_Sub3_Sub3_Sub1 local289 = local284.aClass3_Sub1_Sub3_Sub3_Sub1_2;
							local296 = local289.anInt10303 - Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303;
							@Pc(303) int local303 = local289.anInt10310 - Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310;
							if (Static639.aBoolean753) {
								this.method5224(local296, Static380.anInt7419, local264.anInt11015, super.aClass166Array3[0], 92160000, local19, arg0, local303);
							} else {
								this.method5223(local296, arg0, 92160000, super.aClass166Array3[0], local303, local19, local264.anInt11015);
							}
						}
					}
					@Pc(358) int local358;
					if (local264.anInt11021 == 2) {
						@Pc(349) int local349 = local264.anInt11016 + 256 - Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303;
						local358 = local264.anInt11013 + 256 - Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310;
						local296 = local264.anInt11018 << 9;
						local296 *= local296;
						if (Static639.aBoolean753) {
							this.method5224(local349, Static380.anInt7419, local264.anInt11015, super.aClass166Array3[0], local296, local19, arg0, local358);
						} else {
							this.method5223(local349, arg0, local296, super.aClass166Array3[0], local358, local19, local264.anInt11015);
						}
					}
					if (local264.anInt11021 == 10 && local264.anInt11014 >= 0 && Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1.length > local264.anInt11014) {
						@Pc(424) Class3_Sub1_Sub3_Sub3_Sub2 local424 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local264.anInt11014];
						if (local424 != null) {
							local358 = local424.anInt10303 - Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303;
							local296 = local424.anInt10310 - Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310;
							if (Static639.aBoolean753) {
								this.method5224(local358, Static380.anInt7419, local264.anInt11015, super.aClass166Array3[0], 92160000, local19, arg0, local296);
							} else {
								this.method5223(local358, arg0, 92160000, super.aClass166Array3[0], local296, local19, local264.anInt11015);
							}
						}
					}
				}
			}
			local19.method4650(local24);
			local19.method4646(super.anInt10303, super.anInt10306, super.anInt10310);
		}
		local19.method4650(local24);
		local19.method4646(super.anInt10303, super.anInt10306 - super.anInt6069 - 5, super.anInt10310);
		if (local95 == null) {
			local95 = Static546.method8162(super.aClass166Array3.length, true);
		}
		this.method5210(arg0, local19, false, super.aClass166Array3);
		if (Static639.aBoolean753) {
			for (local258 = 0; local258 < super.aClass166Array3.length; local258++) {
				if (super.aClass166Array3[local258] != null) {
					super.aClass166Array3[local258].method6678(local19, local95.aClass3_Sub3Array1[local258], Static380.anInt7419, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local258 = 0; local258 < super.aClass166Array3.length; local258++) {
				if (super.aClass166Array3[local258] != null) {
					super.aClass166Array3[local258].method6685(local19, local95.aClass3_Sub3Array1[local258], Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass3_Sub9_5 != null) {
			@Pc(597) Class203 local597 = super.aClass3_Sub9_5.method8576();
			if (Static639.aBoolean753) {
				arg0.method7288(local597, Static380.anInt7419);
			} else {
				arg0.method7287(local597);
			}
		}
		for (local258 = 0; local258 < super.aClass166Array3.length; local258++) {
			if (super.aClass166Array3[local258] != null) {
				super.aBoolean456 |= super.aClass166Array3[local258].F();
			}
		}
		super.aClass166Array3[0] = super.aClass166Array3[1] = super.aClass166Array3[2] = null;
		super.anInt6092 = Static438.anInt8137;
		return local95;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method5226() {
		@Pc(7) String local7 = "";
		if (Static302.aStringArray26 != null) {
			local7 = local7 + Static302.aStringArray26[this.aByte100];
		}
		@Pc(31) int[] local31;
		if (this.aByte99 == 1 && Static543.anIntArray640 != null) {
			local31 = Static543.anIntArray640;
		} else {
			local31 = Static291.anIntArray362;
		}
		if (local31 != null && local31[this.aByte100] != -1) {
			@Pc(57) Class218 local57 = Static176.aClass145_1.method4404(local31[this.aByte100]);
			if (local57.aChar3 == 's') {
				local7 = local7 + local57.method6199(this.aByte101 & 0xFF);
			} else {
				Static408.method6625("gdn1", new Throwable());
				local31[this.aByte100] = -1;
			}
		}
		local7 = local7 + this.aString63;
		if (Static258.aStringArray21 != null) {
			local7 = local7 + Static258.aStringArray21[this.aByte100];
		}
		return local7;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)I")
	@Override
	public int method5203() {
		return -1;
	}

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "(B)Z")
	public boolean method5227() {
		return this.aClass249_1 != null;
	}

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8612() {
		return false;
	}

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "(B)I")
	@Override
	public int method5214() {
		return this.aClass249_1 == null || this.aClass249_1.anInt7681 == -1 ? super.method5214() : Static462.aClass355_2.method8744(this.aClass249_1.anInt7681).anInt666;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!ha;I)Z")
	private boolean method5229(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class311 local11 = this.method5200();
		@Pc(26) Class130 local26 = super.anInt6079 != -1 && super.anInt6029 == 0 ? Static195.aClass193_1.method5573(super.anInt6079) : null;
		@Pc(47) Class130 local47 = super.anInt6064 == -1 || this.aBoolean458 || super.aBoolean450 && local26 != null ? null : Static195.aClass193_1.method5573(super.anInt6064);
		@Pc(50) int local50 = local11.anInt9399;
		@Pc(53) int local53 = local11.anInt9407;
		if (local50 != 0 || local53 != 0 || local11.anInt9415 != 0 || local11.anInt9395 != 0) {
			arg0 |= 0x7;
		}
		@Pc(75) int local75 = super.aClass343_7.method8548();
		@Pc(94) boolean local94 = super.aByte98 != 0 && super.anInt6049 <= Static407.anInt7704 && super.anInt6051 > Static407.anInt7704;
		if (local94) {
			arg0 |= 0x80000;
		}
		@Pc(138) Class166 local138 = super.aClass166Array3[0] = this.aClass249_1.method6585(Static286.aClass263_3, local47, super.aClass274Array3, Static635.aClass336_2, local75, local26, super.anInt6046, super.anInt6099, super.anIntArray354, arg0, Static541.aClass245_2, super.anInt6037, arg1, Static462.aClass355_2, Static195.aClass193_1, super.anInt6047, super.anInt6063, super.anInt6019, Static415.aClass340_1);
		@Pc(141) int local141 = Static616.method8983();
		if (Static514.anInt9425 < 96 && local141 > 50) {
			Static307.method5437();
		}
		if (Static448.aClass107_7 != Static193.aClass107_2 && local141 < 50) {
			@Pc(172) int local172 = 50 - local141;
			while (local172 > Static133.anInt3323) {
				Static642.aByteArrayArray26[Static133.anInt3323] = new byte[102400];
				Static133.anInt3323++;
			}
			while (Static133.anInt3323 > local172) {
				Static133.anInt3323--;
				Static642.aByteArrayArray26[Static133.anInt3323] = null;
			}
		} else if (Static193.aClass107_2 != Static448.aClass107_7) {
			Static133.anInt3323 = 0;
			Static642.aByteArrayArray26 = new byte[50][];
		}
		if (local138 == null) {
			return false;
		}
		super.anInt6021 = local138.fa();
		super.anInt6035 = local138.ma();
		this.method5217(local138);
		if (local50 == 0 && local53 == 0) {
			this.method5202(local75, this.method5214() << 9, 0, this.method5214() << 9, 0);
		} else {
			this.method5202(local75, local50, local11.anInt9409, local53, local11.anInt9384);
			if (super.anInt6093 != 0) {
				local138.FA(super.anInt6093);
			}
			if (super.anInt6022 != 0) {
				local138.VA(super.anInt6022);
			}
			if (super.anInt6053 != 0) {
				local138.H(0, super.anInt6053, 0);
			}
		}
		if (local94) {
			local138.method6694(super.aByte96, super.aByte94, super.aByte97, super.aByte98 & 0xFF);
		}
		@Pc(339) boolean local339;
		@Pc(341) int local341;
		@Pc(391) Class166 local391;
		@Pc(407) int local407;
		@Pc(409) int local409;
		@Pc(411) int local411;
		@Pc(495) int local495;
		@Pc(523) int local523;
		@Pc(535) int local535;
		@Pc(539) int local539;
		@Pc(549) int local549;
		@Pc(324) Class109 local324;
		if (this.aBoolean458 || super.anInt6065 == -1 || super.anInt6043 == -1) {
			super.aClass166Array3[1] = null;
		} else {
			local324 = Static459.aClass62_2.method2250(super.anInt6065);
			local339 = local324.aByte63 == 3 && (local50 != 0 || local53 != 0);
			local341 = local7;
			if (local339) {
				local341 = local7 | 0x7;
			} else {
				if (super.anInt6041 != 0) {
					local341 = local7 | 0x5;
				}
				if (super.lb != 0) {
					local341 |= 0x2;
				}
				if (super.anInt6073 >= 0) {
					local341 |= 0x7;
				}
			}
			local391 = super.aClass166Array3[1] = local324.method3485(super.anInt6043, arg1, super.anInt6045, local341, super.anInt6077, Static195.aClass193_1);
			if (local391 != null) {
				if (super.anInt6073 >= 0 && local11.anIntArrayArray52 != null && local11.anIntArrayArray52[super.anInt6073] != null) {
					local407 = 0;
					local409 = 0;
					local411 = 0;
					if (local11.anIntArrayArray52 != null && local11.anIntArrayArray52[super.anInt6073] != null) {
						local409 = local11.anIntArrayArray52[super.anInt6073][1];
						local411 = local11.anIntArrayArray52[super.anInt6073][2];
						local407 = local11.anIntArrayArray52[super.anInt6073][0];
					}
					if (local11.anIntArrayArray51 != null && local11.anIntArrayArray51[super.anInt6073] != null) {
						local409 += local11.anIntArrayArray51[super.anInt6073][1];
						local411 += local11.anIntArrayArray51[super.anInt6073][2];
						local407 += local11.anIntArrayArray51[super.anInt6073][0];
					}
					if (local411 != 0 || local407 != 0) {
						local495 = local75;
						if (super.anIntArray354 != null && super.anIntArray354[super.anInt6073] != -1) {
							local495 = super.anIntArray354[super.anInt6073];
						}
						local523 = local495 + super.anInt6041 * 2048 - local75 & 0x3FFF;
						if (local523 != 0) {
							local391.a(local523);
						}
						local535 = Class177.anIntArray361[local523];
						local539 = Class177.anIntArray360[local523];
						local549 = local539 * local407 + local411 * local535 >> 14;
						local411 = local411 * local539 - local407 * local535 >> 14;
						local407 = local549;
					}
					local391.H(local407, local409, local411);
				} else if (super.anInt6041 != 0) {
					local391.a(super.anInt6041 * 2048);
				}
				if (super.lb != 0) {
					local391.H(0, -super.lb << 2, 0);
				}
				if (local339) {
					if (super.anInt6093 != 0) {
						local391.FA(super.anInt6093);
					}
					if (super.anInt6022 != 0) {
						local391.VA(super.anInt6022);
					}
					if (super.anInt6053 != 0) {
						local391.H(0, super.anInt6053, 0);
					}
				}
			}
		}
		if (this.aBoolean458 || super.anInt6084 == -1 || super.anInt6031 == -1) {
			super.aClass166Array3[2] = null;
		} else {
			local324 = Static459.aClass62_2.method2250(super.anInt6084);
			local339 = local324.aByte63 == 3 && (local50 != 0 || local53 != 0);
			local341 = local7;
			if (local339) {
				local341 = local7 | 0x7;
			} else {
				if (super.anInt6018 != 0) {
					local341 = local7 | 0x5;
				}
				if (super.anInt6057 != 0) {
					local341 |= 0x2;
				}
				if (super.anInt6082 >= 0) {
					local341 |= 0x7;
				}
			}
			local391 = super.aClass166Array3[2] = local324.method3481(super.anInt6068, super.anInt6071, arg1, local341, Static195.aClass193_1, super.anInt6031);
			if (local391 != null) {
				if (super.anInt6082 >= 0 && local11.anIntArrayArray52 != null && local11.anIntArrayArray52[super.anInt6082] != null) {
					local407 = 0;
					local409 = 0;
					local411 = 0;
					if (local11.anIntArrayArray52 != null && local11.anIntArrayArray52[super.anInt6082] != null) {
						local407 = local11.anIntArrayArray52[super.anInt6082][0];
						local409 = local11.anIntArrayArray52[super.anInt6082][1];
						local411 = local11.anIntArrayArray52[super.anInt6082][2];
					}
					if (local11.anIntArrayArray51 != null && local11.anIntArrayArray51[super.anInt6082] != null) {
						local407 += local11.anIntArrayArray51[super.anInt6082][0];
						local409 += local11.anIntArrayArray51[super.anInt6082][1];
						local411 += local11.anIntArrayArray51[super.anInt6082][2];
					}
					if (local411 != 0 || local407 != 0) {
						local495 = local75;
						if (super.anIntArray354 != null && super.anIntArray354[super.anInt6082] != -1) {
							local495 = super.anIntArray354[super.anInt6082];
						}
						local523 = super.anInt6018 * 2048 + local495 - local75 & 0x3FFF;
						if (local523 != 0) {
							local391.a(local523);
						}
						local535 = Class177.anIntArray361[local523];
						local539 = Class177.anIntArray360[local523];
						local549 = local411 * local535 + local539 * local407 >> 14;
						local411 = local539 * local411 - local535 * local407 >> 14;
						local407 = local549;
					}
					local391.H(local407, local409, local411);
				} else if (super.anInt6018 != 0) {
					local391.a(super.anInt6018 * 2048);
				}
				if (super.anInt6057 != 0) {
					local391.H(0, -super.anInt6057 << 2, 0);
				}
				if (local339) {
					if (super.anInt6093 != 0) {
						local391.FA(super.anInt6093);
					}
					if (super.anInt6022 != 0) {
						local391.VA(super.anInt6022);
					}
					if (super.anInt6053 != 0) {
						local391.H(0, super.anInt6053, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(B)I")
	@Override
	protected int method5199() {
		return this.anInt6109;
	}
}

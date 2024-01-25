import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class30_Sub1_Sub1_Sub1 extends Class30_Sub1_Sub1 {

	@OriginalMember(owner = "client!bl", name = "Kc", descriptor = "Lclient!ak;")
	public Class11 aClass11_1;

	@OriginalMember(owner = "client!bl", name = "Oc", descriptor = "I")
	public int anInt896 = -1;

	@OriginalMember(owner = "client!bl", name = "dd", descriptor = "I")
	public int anInt908 = -1;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!ak;)V")
	public void method666(@OriginalArg(1) Class11 arg0) {
		this.aClass11_1 = arg0;
		if (super.aClass41_Sub1_3 != null) {
			super.aClass41_Sub1_3.method877();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)I")
	@Override
	public int method942() {
		if (this.aClass11_1.anIntArray12 != null) {
			@Pc(22) Class11 local22 = this.aClass11_1.method136(Static366.aClass190_1);
			if (local22 != null && local22.anInt194 != -1) {
				return local22.anInt194;
			}
		}
		return this.aClass11_1.anInt194;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(BLclient!za;)V")
	@Override
	public void method5716(@OriginalArg(1) Class106 arg0) {
		if (this.aClass11_1 != null && (super.aBoolean82 || this.method676(arg0, 0))) {
			this.method954(super.aClass17Array3, super.aBoolean82, arg0);
			super.aClass17Array3[0] = super.aClass17Array3[1] = super.aClass17Array3[2] = super.aClass17Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZIIII)V")
	public void method669(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte102 = (byte) arg4;
		if (super.anInt1303 != -1 && Static107.aClass239_1.method5420(super.anInt1303).anInt6850 == 1) {
			super.anInt1303 = -1;
		}
		if (super.anInt1279 != -1) {
			@Pc(34) Class223 local34 = Static145.aClass63_1.method1524(super.anInt1279);
			if (local34.aBoolean420 && local34.anInt6642 != -1 && Static107.aClass239_1.method5420(local34.anInt6642).anInt6850 == 1) {
				super.anInt1279 = -1;
			}
		}
		if (super.anInt1249 != -1) {
			@Pc(71) Class223 local71 = Static145.aClass63_1.method1524(super.anInt1249);
			if (local71.aBoolean420 && local71.anInt6642 != -1 && Static107.aClass239_1.method5420(local71.anInt6642).anInt6850 == 1) {
				super.anInt1249 = -1;
			}
		}
		if (!arg1) {
			@Pc(99) int local99 = arg0 - super.anIntArray130[0];
			@Pc(107) int local107 = arg2 - super.anIntArray129[0];
			if (local99 >= -8 && local99 <= 8 && local107 >= -8 && local107 <= 8) {
				if (super.anInt1314 < 9) {
					super.anInt1314++;
				}
				for (@Pc(138) int local138 = super.anInt1314; local138 > 0; local138--) {
					super.anIntArray130[local138] = super.anIntArray130[local138 - 1];
					super.anIntArray129[local138] = super.anIntArray129[local138 - 1];
					super.aByteArray13[local138] = super.aByteArray13[local138 - 1];
				}
				super.anIntArray130[0] = arg0;
				super.aByteArray13[0] = 1;
				super.anIntArray129[0] = arg2;
				return;
			}
		}
		super.anInt1314 = 0;
		super.anInt1316 = 0;
		super.anIntArray130[0] = arg0;
		super.anInt1315 = 0;
		super.anIntArray129[0] = arg2;
		super.anInt7490 = (super.anIntArray130[0] << 7) + (arg3 << 6);
		super.anInt7488 = (super.anIntArray129[0] << 7) + (arg3 << 6);
		if (super.aClass41_Sub1_3 != null) {
			super.aClass41_Sub1_3.method877();
		}
	}

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "(I)Z")
	private boolean method670() {
		return this.aClass11_1.aBoolean11;
	}

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)I")
	@Override
	public int method947() {
		if (this.aClass11_1.anIntArray12 != null) {
			@Pc(13) Class11 local13 = this.aClass11_1.method136(Static366.aClass190_1);
			if (local13 != null && local13.anInt189 != -1) {
				return local13.anInt189;
			}
		}
		return this.aClass11_1.anInt189 == -1 ? super.method947() : this.aClass11_1.anInt189;
	}

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)I")
	@Override
	public int method5724() {
		return super.anInt1257;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method5717(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass11_1 == null || !this.method676(arg0, 131072)) {
			return false;
		}
		@Pc(19) Class40 local19 = arg0.method5918();
		@Pc(24) int local24 = super.aClass15_7.method327();
		local19.ca(local24);
		local19.W(super.anInt7490, super.anInt7495, super.anInt7488);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass17Array3.length > local39; local39++) {
			if (super.aClass17Array3[local39] != null && super.aClass17Array3[local39].method6203(arg2, arg1, local19, this.aClass11_1.anInt162 == 1)) {
				local37 = true;
				break;
			}
		}
		super.aClass17Array3[0] = super.aClass17Array3[1] = super.aClass17Array3[2] = super.aClass17Array3[3] = null;
		return local37;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(Z)V")
	@Override
	public void method5721() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IBI)V")
	public void method672(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = super.anIntArray130[0];
		@Pc(26) int local26 = super.anIntArray129[0];
		if (arg1 == 0) {
			local26++;
		}
		if (arg1 == 1) {
			local26++;
			local8++;
		}
		if (arg1 == 2) {
			local8++;
		}
		if (arg1 == 3) {
			local8++;
			local26--;
		}
		if (arg1 == 4) {
			local26--;
		}
		if (arg1 == 5) {
			local26--;
			local8--;
		}
		if (arg1 == 6) {
			local8--;
		}
		if (arg1 == 7) {
			local8--;
			local26++;
		}
		if (super.anInt1303 != -1 && Static107.aClass239_1.method5420(super.anInt1303).anInt6850 == 1) {
			super.anInt1303 = -1;
		}
		@Pc(93) Class223 local93;
		if (super.anInt1279 != -1) {
			local93 = Static145.aClass63_1.method1524(super.anInt1279);
			if (local93.aBoolean420 && local93.anInt6642 != -1 && Static107.aClass239_1.method5420(local93.anInt6642).anInt6850 == 1) {
				super.anInt1279 = -1;
			}
		}
		if (super.anInt1249 != -1) {
			local93 = Static145.aClass63_1.method1524(super.anInt1249);
			if (local93.aBoolean420 && local93.anInt6642 != -1 && Static107.aClass239_1.method5420(local93.anInt6642).anInt6850 == 1) {
				super.anInt1249 = -1;
			}
		}
		if (super.anInt1314 < 9) {
			super.anInt1314++;
		}
		for (@Pc(158) int local158 = super.anInt1314; local158 > 0; local158--) {
			super.anIntArray130[local158] = super.anIntArray130[local158 - 1];
			super.anIntArray129[local158] = super.anIntArray129[local158 - 1];
			super.aByteArray13[local158] = super.aByteArray13[local158 - 1];
		}
		super.anIntArray130[0] = local8;
		super.anIntArray129[0] = local26;
		super.aByteArray13[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)I")
	@Override
	protected int method946() {
		if (this.aClass11_1.anIntArray12 != null) {
			@Pc(13) Class11 local13 = this.aClass11_1.method136(Static366.aClass190_1);
			if (local13 != null && local13.anInt180 != -1) {
				return local13.anInt180;
			}
		}
		return this.aClass11_1.anInt180;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5719() {
		return false;
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(Z)Z")
	public boolean method673() {
		return this.aClass11_1 != null;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!za;II)Z")
	private boolean method676(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class212 local11 = this.method948();
		@Pc(26) Class235 local26 = super.anInt1303 != -1 && super.anInt1271 == 0 ? Static107.aClass239_1.method5420(super.anInt1303) : null;
		@Pc(43) Class235 local43 = super.anInt1255 == -1 || super.aBoolean81 && local26 != null ? null : Static107.aClass239_1.method5420(super.anInt1255);
		@Pc(46) int local46 = local11.anInt6249;
		@Pc(49) int local49 = local11.anInt6264;
		if (local46 != 0 || local49 != 0 || local11.anInt6268 != 0 || local11.anInt6286 != 0) {
			arg1 |= 0x7;
		}
		@Pc(89) boolean local89 = super.aByte28 != 0 && super.anInt1258 <= Static187.anInt3975 && Static187.anInt3975 < super.anInt1310;
		if (local89) {
			arg1 |= 0x80000;
		}
		@Pc(126) Class17 local126 = super.aClass17Array3[0] = this.aClass11_1.method132(Static366.aClass190_1, super.anInt1297, local26, arg0, super.anInt1267, arg1, super.anInt1242, super.aClass232Array3, local43, super.anInt1294, super.anInt1260, Static241.aClass258_1, super.anInt1278, Static107.aClass239_1);
		if (local126 == null) {
			return false;
		}
		super.anInt1257 = local126.B();
		this.method955(local126);
		@Pc(143) int local143 = super.aClass15_7.method327();
		if (local46 == 0 && local49 == 0) {
			this.method938(0, this.method944() << 7, local143, 0, this.method944() << 7);
		} else {
			this.method938(local11.anInt6289, local49, local143, local11.anInt6295, local46);
			if (super.anInt1286 != 0) {
				super.aClass17Array3[0].W(super.anInt1286);
			}
			if (super.anInt1273 != 0) {
				super.aClass17Array3[0].K(super.anInt1273);
			}
			if (super.anInt1250 != 0) {
				super.aClass17Array3[0].a(0, super.anInt1250, 0);
			}
		}
		if (local89) {
			local126.method6197(super.aByte31, super.aByte30, super.aByte29, super.aByte28 & 0xFF);
		}
		@Pc(252) Class223 local252;
		@Pc(267) boolean local267;
		@Pc(269) int local269;
		@Pc(315) Class17 local315;
		if (super.anInt1279 == -1 || super.anInt1261 == -1) {
			super.aClass17Array3[1] = null;
		} else {
			local252 = Static145.aClass63_1.method1524(super.anInt1279);
			local267 = local252.aByte91 == 3 && (local46 != 0 || local49 != 0);
			local269 = local7;
			if (local267) {
				local269 = local7 | 0x7;
			} else {
				if (super.anInt1308 != 0) {
					local269 = local7 | 0x5;
				}
				if (super.anInt1296 != 0) {
					local269 |= 0x2;
				}
			}
			local315 = super.aClass17Array3[1] = local252.method5069(local269, super.anInt1261, Static107.aClass239_1, arg0, super.anInt1264, super.anInt1284);
			if (local315 != null) {
				if (super.anInt1296 != 0) {
					local315.a(0, -super.anInt1296 << 0, 0);
				}
				if (super.anInt1308 != 0) {
					local315.ma(super.anInt1308 * 2048);
				}
				if (local267) {
					if (super.anInt1286 != 0) {
						local315.W(super.anInt1286);
					}
					if (super.anInt1273 != 0) {
						local315.K(super.anInt1273);
					}
					if (super.anInt1250 != 0) {
						local315.a(0, super.anInt1250, 0);
					}
				}
			}
		}
		if (super.anInt1249 == -1 || super.anInt1252 == -1) {
			super.aClass17Array3[3] = null;
		} else {
			local252 = Static145.aClass63_1.method1524(super.anInt1249);
			local267 = local252.aByte91 == 3 && (local46 != 0 || local49 != 0);
			local269 = local7;
			if (local267) {
				local269 = local7 | 0x7;
			} else {
				if (super.anInt1275 != 0) {
					local269 = local7 | 0x5;
				}
				if (super.anInt1287 != 0) {
					local269 |= 0x2;
				}
			}
			local315 = super.aClass17Array3[3] = local252.method5072(super.anInt1270, arg0, super.anInt1289, super.anInt1252, Static107.aClass239_1, local269);
			if (local315 != null) {
				if (super.anInt1287 != 0) {
					local315.a(0, -super.anInt1287 << 0, 0);
				}
				if (super.anInt1275 != 0) {
					local315.ma(super.anInt1275 * 2048);
				}
				if (local267) {
					if (super.anInt1286 != 0) {
						local315.W(super.anInt1286);
					}
					if (super.anInt1273 != 0) {
						local315.K(super.anInt1273);
					}
					if (super.anInt1250 != 0) {
						local315.a(0, super.anInt1250, 0);
					}
				}
			}
		}
		super.aClass17Array3[2] = null;
		if (super.aClass1_Sub31_3 != null) {
			if (Static187.anInt3975 >= super.aClass1_Sub31_3.anInt5423) {
				super.aClass1_Sub31_3 = null;
			} else if (Static187.anInt3975 >= super.aClass1_Sub31_3.anInt5420) {
				@Pc(544) Class17 local544 = super.aClass1_Sub31_3.method4186(local7 | 0x7, arg0);
				if (local544 != null) {
					local544.a(-super.anInt7490 + super.aClass1_Sub31_3.anInt5431, -super.anInt7495 + super.aClass1_Sub31_3.anInt5421, -super.anInt7488 + super.aClass1_Sub31_3.anInt5432);
					if (local143 != 0) {
						local544.ma(local143);
					}
					super.aClass17Array3[2] = local544;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILclient!za;IILclient!vl;Z)V")
	@Override
	public void method5718(@OriginalArg(1) int arg0, @OriginalArg(2) Class106 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class30 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(ILclient!za;)Lclient!sr;")
	@Override
	public Class41_Sub7 method5722(@OriginalArg(1) Class106 arg0) {
		if (this.aClass11_1 == null || !this.method676(arg0, 2048)) {
			return null;
		}
		@Pc(17) Class40 local17 = arg0.method5918();
		@Pc(22) int local22 = super.aClass15_7.method327();
		local17.ca(local22);
		local17.W(super.anInt7490, super.anInt7495, super.anInt7488);
		@Pc(42) Class212 local42 = this.method948();
		@Pc(55) Class11 local55 = this.aClass11_1.anIntArray12 == null ? this.aClass11_1 : this.aClass11_1.method136(Static366.aClass190_1);
		if (Static12.aClass34_Sub1_1.aBoolean452 && local55.aBoolean14 && local42.aBoolean398) {
			@Pc(79) Class235 local79 = super.anInt1303 != -1 && super.anInt1271 == 0 ? Static107.aClass239_1.method5420(super.anInt1303) : null;
			@Pc(96) Class235 local96 = super.anInt1255 == -1 || super.aBoolean81 && local79 != null ? null : Static107.aClass239_1.method5420(super.anInt1255);
			@Pc(98) int local98 = 0;
			if (super.anInt1298 != 0) {
				local98 = this.method953();
			}
			@Pc(156) Class17 local156 = Static389.method5424(this.aClass11_1.aShort2 & 0xFFFF, this.aClass11_1.aByte5 & 0xFF, local22, this.aClass11_1.aByte9 & 0xFF, this.aClass11_1.anInt162, local98, super.anInt1273, super.anInt1286, local96 == null ? super.anInt1294 : super.anInt1297, super.aClass17Array3[0], local96 == null ? local79 : local96, arg0, super.anInt1250, this.aClass11_1.aShort3 & 0xFFFF);
			if (local156 != null) {
				@Pc(161) float local161 = arg0.T();
				@Pc(164) float local164 = arg0.aa();
				arg0.method5955(false);
				arg0.da(local161, local164 - 150.0F);
				local156.method6189(local17, null, 0);
				arg0.da(local161, local164);
				arg0.method5955(true);
			}
		}
		@Pc(187) Class41_Sub7 local187 = null;
		if (this.method670()) {
			local187 = Static306.method4409(super.aClass17Array3.length);
		}
		if (super.aClass41_Sub1_3 == null) {
			arg0.method5943(super.aClass17Array3, local17, local187 == null ? null : local187.aClass41_Sub8Array1, 0);
		} else {
			@Pc(204) Class51 local204 = super.aClass41_Sub1_3.method875();
			arg0.method5947(super.aClass17Array3, local204, local17, local187 == null ? null : local187.aClass41_Sub8Array1, 0);
		}
		this.method954(super.aClass17Array3, false, arg0);
		if (super.aClass17Array3[2] != null) {
			if (local22 != 0) {
				super.aClass17Array3[2].ma(local22);
			}
			super.aClass17Array3[2].a(super.anInt7490 - super.aClass1_Sub31_3.anInt5431, super.anInt7495 - super.aClass1_Sub31_3.anInt5421, -super.aClass1_Sub31_3.anInt5432 + super.anInt7488);
		}
		super.aClass17Array3[0] = super.aClass17Array3[1] = super.aClass17Array3[2] = super.aClass17Array3[3] = null;
		super.anInt1251 = Static140.anInt3086;
		return local187;
	}
}

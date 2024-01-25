import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public final class Class2_Sub2_Sub1_Sub2 extends Class2_Sub2_Sub1 {

	@OriginalMember(owner = "client!pca", name = "wc", descriptor = "Lclient!jf;")
	public Class169 aClass169_1;

	@OriginalMember(owner = "client!pca", name = "tc", descriptor = "I")
	public int anInt7661 = -1;

	@OriginalMember(owner = "client!pca", name = "Nc", descriptor = "I")
	public int anInt7680 = -1;

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "(B)Z")
	private boolean method6317() {
		return this.aClass169_1.aBoolean416;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Z)I")
	@Override
	protected int method6302() {
		if (this.aClass169_1.anIntArray306 != null) {
			@Pc(22) Class169 local22 = this.aClass169_1.method4177(Static588.aClass322_1);
			if (local22 != null && local22.anInt4985 != -1) {
				return local22.anInt4985;
			}
		}
		return this.aClass169_1.anInt4985;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ZILclient!oa;)Z")
	private boolean method6318(@OriginalArg(1) int arg0, @OriginalArg(2) Class15 arg1) {
		@Pc(12) int local12 = arg0;
		@Pc(16) Class171 local16 = this.method6316();
		@Pc(31) Class174 local31 = super.anInt7651 != -1 && super.anInt7584 == 0 ? Static532.aClass157_2.method3734(super.anInt7651) : null;
		@Pc(49) Class174 local49 = super.anInt7655 == -1 || super.aBoolean645 && local31 != null ? null : Static532.aClass157_2.method3734(super.anInt7655);
		@Pc(52) int local52 = local16.anInt5097;
		@Pc(55) int local55 = local16.anInt5084;
		if (local52 != 0 || local55 != 0 || local16.anInt5105 != 0 || local16.anInt5091 != 0) {
			arg0 |= 0x7;
		}
		@Pc(97) boolean local97 = super.aByte81 != 0 && super.anInt7593 <= Static129.anInt10429 && super.anInt7624 > Static129.anInt10429;
		if (local97) {
			arg0 |= 0x80000;
		}
		@Pc(134) Class21 local134 = super.aClass21Array3[0] = this.aClass169_1.method4178(local49, arg0, super.anInt7586, super.anInt7617, super.anInt7588, arg1, Static532.aClass157_2, local31, super.anInt7615, super.anInt7625, Static588.aClass322_1, super.aClass216Array3, super.anInt7646, Static144.aClass188_1);
		if (local134 == null) {
			return false;
		}
		super.anInt7601 = local134.DA();
		this.method6306(local134);
		@Pc(151) int local151 = super.aClass358_7.method8345();
		if (local52 == 0 && local55 == 0) {
			this.method6310(this.method6311() << 9, local151, 0, 0, this.method6311() << 9);
		} else {
			this.method6310(local55, local151, local16.anInt5110, local16.anInt5098, local52);
			if (super.anInt7590 != 0) {
				super.aClass21Array3[0].AA(super.anInt7590);
			}
			if (super.anInt7587 != 0) {
				super.aClass21Array3[0].v(super.anInt7587);
			}
			if (super.anInt7629 != 0) {
				super.aClass21Array3[0].m(0, super.anInt7629, 0);
			}
		}
		if (local97) {
			local134.method7150(super.aByte79, super.aByte78, super.aByte80, super.aByte81 & 0xFF);
		}
		@Pc(252) Class77 local252;
		@Pc(270) boolean local270;
		@Pc(272) int local272;
		@Pc(317) Class21 local317;
		if (super.anInt7621 == -1 || super.anInt7594 == -1) {
			super.aClass21Array3[1] = null;
		} else {
			local252 = Static107.aClass303_1.method7476(super.anInt7621);
			local270 = local252.aByte24 == 3 && (local52 != 0 || local55 != 0);
			local272 = local12;
			if (local270) {
				local272 = local12 | 0x7;
			} else {
				if (super.anInt7614 != 0) {
					local272 = local12 | 0x5;
				}
				if (super.anInt7611 != 0) {
					local272 |= 0x2;
				}
			}
			local317 = super.aClass21Array3[1] = local252.method2276(local272, super.anInt7594, Static532.aClass157_2, super.anInt7623, super.anInt7596, arg1);
			if (local317 != null) {
				if (super.anInt7611 != 0) {
					local317.m(0, -super.anInt7611 << 2, 0);
				}
				if (super.anInt7614 != 0) {
					local317.I(super.anInt7614 * 2048);
				}
				if (local270) {
					if (super.anInt7590 != 0) {
						local317.AA(super.anInt7590);
					}
					if (super.anInt7587 != 0) {
						local317.v(super.anInt7587);
					}
					if (super.anInt7629 != 0) {
						local317.m(0, super.anInt7629, 0);
					}
				}
			}
		}
		if (super.anInt7638 == -1 || super.anInt7656 == -1) {
			super.aClass21Array3[3] = null;
		} else {
			local252 = Static107.aClass303_1.method7476(super.anInt7638);
			local270 = local252.aByte24 == 3 && (local52 != 0 || local55 != 0);
			local272 = local12;
			if (local270) {
				local272 = local12 | 0x7;
			} else {
				if (super.anInt7652 != 0) {
					local272 = local12 | 0x5;
				}
				if (super.lb != 0) {
					local272 |= 0x2;
				}
			}
			local317 = super.aClass21Array3[3] = local252.method2271(super.anInt7612, local272, arg1, super.anInt7653, super.anInt7656, Static532.aClass157_2);
			if (local317 != null) {
				if (super.lb != 0) {
					local317.m(0, -super.lb << 2, 0);
				}
				if (super.anInt7652 != 0) {
					local317.I(super.anInt7652 * 2048);
				}
				if (local270) {
					if (super.anInt7590 != 0) {
						local317.AA(super.anInt7590);
					}
					if (super.anInt7587 != 0) {
						local317.v(super.anInt7587);
					}
					if (super.anInt7629 != 0) {
						local317.m(0, super.anInt7629, 0);
					}
				}
			}
		}
		super.aClass21Array3[2] = null;
		if (super.aClass3_Sub25_3 != null) {
			if (super.aClass3_Sub25_3.anInt4617 <= Static129.anInt10429) {
				super.aClass3_Sub25_3 = null;
			} else if (Static129.anInt10429 >= super.aClass3_Sub25_3.anInt4615) {
				@Pc(541) Class21 local541 = super.aClass3_Sub25_3.method3884(local12 | 0x7, arg1);
				if (local541 != null) {
					local541.m(super.aClass3_Sub25_3.anInt4606 - super.anInt9398, super.aClass3_Sub25_3.anInt4609 + 5 + -super.anInt9400, super.aClass3_Sub25_3.anInt4618 - super.anInt9396);
					if (local151 != 0) {
						local541.I(local151);
					}
					super.aClass21Array3[2] = local541;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)V")
	public void method6319(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = super.anIntArray487[0];
		@Pc(13) int local13 = super.anIntArray488[0];
		if (arg0 == 0) {
			local13++;
		}
		if (arg0 == 1) {
			local13++;
			local8++;
		}
		if (arg0 == 2) {
			local8++;
		}
		if (arg0 == 3) {
			local13--;
			local8++;
		}
		if (arg0 == 4) {
			local13--;
		}
		if (arg0 == 5) {
			local13--;
			local8--;
		}
		if (arg0 == 6) {
			local8--;
		}
		if (super.anInt7651 != -1 && Static532.aClass157_2.method3734(super.anInt7651).anInt5496 == 1) {
			super.anInt7651 = -1;
			super.anIntArray484 = null;
		}
		if (arg0 == 7) {
			local13++;
			local8--;
		}
		@Pc(87) Class77 local87;
		if (super.anInt7621 != -1) {
			local87 = Static107.aClass303_1.method7476(super.anInt7621);
			if (local87.aBoolean197 && local87.anInt2573 != -1 && Static532.aClass157_2.method3734(local87.anInt2573).anInt5496 == 1) {
				super.anInt7621 = -1;
			}
		}
		if (super.anInt7638 != -1) {
			local87 = Static107.aClass303_1.method7476(super.anInt7638);
			if (local87.aBoolean197 && local87.anInt2573 != -1 && Static532.aClass157_2.method3734(local87.anInt2573).anInt5496 == 1) {
				super.anInt7638 = -1;
			}
		}
		if (super.anInt7660 < 9) {
			super.anInt7660++;
		}
		for (@Pc(150) int local150 = super.anInt7660; local150 > 0; local150--) {
			super.anIntArray487[local150] = super.anIntArray487[local150 - 1];
			super.anIntArray488[local150] = super.anIntArray488[local150 - 1];
			super.aByteArray85[local150] = super.aByteArray85[local150 - 1];
		}
		super.anIntArray487[0] = local8;
		super.anIntArray488[0] = local13;
		super.aByteArray85[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(Z)I")
	@Override
	public int method6303() {
		if (this.aClass169_1.anIntArray306 != null) {
			@Pc(13) Class169 local13 = this.aClass169_1.method4177(Static588.aClass322_1);
			if (local13 != null && local13.anInt4962 != -1) {
				return local13.anInt4962;
			}
		}
		return this.aClass169_1.anInt4962 == -1 ? super.method6303() : this.aClass169_1.anInt4962;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IILclient!oa;ILclient!cq;ZI)V")
	@Override
	public void method8387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pca", name = "d", descriptor = "(I)I")
	@Override
	public int method7629() {
		return super.anInt7601;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIIIZI)V")
	public void method6320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte103 = (byte) arg4;
		if (super.anInt7651 != -1 && Static532.aClass157_2.method3734(super.anInt7651).anInt5496 == 1) {
			super.anIntArray484 = null;
			super.anInt7651 = -1;
		}
		@Pc(42) Class77 local42;
		if (super.anInt7621 != -1) {
			local42 = Static107.aClass303_1.method7476(super.anInt7621);
			if (local42.aBoolean197 && local42.anInt2573 != -1 && Static532.aClass157_2.method3734(local42.anInt2573).anInt5496 == 1) {
				super.anInt7621 = -1;
			}
		}
		if (super.anInt7638 != -1) {
			local42 = Static107.aClass303_1.method7476(super.anInt7638);
			if (local42.aBoolean197 && local42.anInt2573 != -1 && Static532.aClass157_2.method3734(local42.anInt2573).anInt5496 == 1) {
				super.anInt7638 = -1;
			}
		}
		if (!arg3) {
			@Pc(102) int local102 = arg2 - super.anIntArray487[0];
			@Pc(109) int local109 = arg1 - super.anIntArray488[0];
			if (local102 >= -8 && local102 <= 8 && local109 >= -8 && local109 <= 8) {
				if (super.anInt7660 < 9) {
					super.anInt7660++;
				}
				for (@Pc(138) int local138 = super.anInt7660; local138 > 0; local138--) {
					super.anIntArray487[local138] = super.anIntArray487[local138 - 1];
					super.anIntArray488[local138] = super.anIntArray488[local138 - 1];
					super.aByteArray85[local138] = super.aByteArray85[local138 - 1];
				}
				super.anIntArray487[0] = arg2;
				super.aByteArray85[0] = 1;
				super.anIntArray488[0] = arg1;
				return;
			}
		}
		super.anInt7658 = 0;
		super.anInt7659 = 0;
		super.anInt7660 = 0;
		super.anIntArray487[0] = arg2;
		super.anIntArray488[0] = arg1;
		super.anInt9398 = (arg0 << 8) + (super.anIntArray487[0] << 9);
		super.anInt9396 = (super.anIntArray488[0] << 9) + (arg0 << 8);
		if (super.aClass55_Sub8_5 != null) {
			super.aClass55_Sub8_5.method7123();
		}
	}

	@OriginalMember(owner = "client!pca", name = "d", descriptor = "(Lclient!oa;I)Lclient!cd;")
	@Override
	public Class44 method8385(@OriginalArg(0) Class15 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!pca", name = "d", descriptor = "(B)V")
	@Override
	public void method8386() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)I")
	@Override
	public int method6300() {
		if (this.aClass169_1.anIntArray306 != null) {
			@Pc(13) Class169 local13 = this.aClass169_1.method4177(Static588.aClass322_1);
			if (local13 != null && local13.anInt4998 != -1) {
				return local13.anInt4998;
			}
		}
		return this.aClass169_1.anInt4998;
	}

	@OriginalMember(owner = "client!pca", name = "f", descriptor = "(B)Z")
	public boolean method6321() {
		return this.aClass169_1 != null;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(BLclient!jf;)V")
	public void method6322(@OriginalArg(1) Class169 arg0) {
		this.aClass169_1 = arg0;
		if (super.aClass55_Sub8_5 != null) {
			super.aClass55_Sub8_5.method7123();
		}
	}

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8384(@OriginalArg(0) Class15 arg0) {
		if (this.aClass169_1 == null || !super.aBoolean648 && !this.method6318(0, arg0)) {
			return;
		}
		@Pc(20) Class255 local20 = arg0.method5343();
		local20.a(super.aClass358_7.method8345());
		local20.G(super.anInt9398, super.anInt9400 - 20, super.anInt9396);
		this.method6308(super.aClass21Array3, arg0, super.aBoolean648, local20);
		super.aClass21Array3[0] = super.aClass21Array3[1] = super.aClass21Array3[2] = super.aClass21Array3[3] = null;
	}

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8388() {
		return false;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lclient!oa;B)Lclient!pl;")
	@Override
	public Class55_Sub6 method8382(@OriginalArg(0) Class15 arg0) {
		if (this.aClass169_1 == null || !this.method6318(2048, arg0)) {
			return null;
		}
		@Pc(17) Class255 local17 = arg0.method5343();
		@Pc(22) int local22 = super.aClass358_7.method8345();
		local17.a(local22);
		local17.G(super.anInt9398, super.anInt9400 - 20, super.anInt9396);
		@Pc(39) Class171 local39 = this.method6316();
		@Pc(52) Class169 local52 = this.aClass169_1.anIntArray306 == null ? this.aClass169_1 : this.aClass169_1.method4177(Static588.aClass322_1);
		if (Static455.aClass3_Sub27_Sub1_1.aBoolean384 && local52.aBoolean418 && local39.aBoolean431) {
			@Pc(80) Class174 local80 = super.anInt7651 != -1 && super.anInt7584 == 0 ? Static532.aClass157_2.method3734(super.anInt7651) : null;
			@Pc(97) Class174 local97 = super.anInt7655 == -1 || super.aBoolean645 && local80 != null ? null : Static532.aClass157_2.method3734(super.anInt7655);
			@Pc(99) int local99 = 0;
			if (super.anInt7598 != 0) {
				local99 = this.method6299();
			}
			@Pc(157) Class21 local157 = Static208.method3663(local97 == null ? super.anInt7646 : super.anInt7586, super.anInt7590, local22, super.aClass21Array3[0], local97 == null ? local80 : local97, this.aClass169_1.aByte51 & 0xFF, arg0, this.aClass169_1.aShort52 & 0xFFFF, this.aClass169_1.anInt4979, local99, super.anInt7587, this.aClass169_1.aByte50 & 0xFF, super.anInt7629, this.aClass169_1.aShort51 & 0xFFFF);
			if (local157 != null) {
				arg0.method5336(false);
				local157.method7145(local17, null, 0);
				arg0.method5336(true);
			}
		}
		local17.a(local22);
		local17.G(super.anInt9398, super.anInt9400 - 5, super.anInt9396);
		@Pc(185) Class55_Sub6 local185 = null;
		if (this.method6317()) {
			local185 = Static232.method3979(super.aClass21Array3.length);
		}
		this.method6308(super.aClass21Array3, arg0, false, local17);
		if (super.aClass55_Sub8_5 == null) {
			arg0.method5310(super.aClass21Array3, local17, local185 == null ? null : local185.aClass55_Sub3Array1, 0);
		} else {
			@Pc(218) Class274 local218 = super.aClass55_Sub8_5.method7127();
			arg0.method5297(super.aClass21Array3, local218, local17, local185 == null ? null : local185.aClass55_Sub3Array1, 0);
		}
		super.anInt7636 = Static453.anInt8598;
		super.aClass21Array3[0] = super.aClass21Array3[1] = super.aClass21Array3[2] = super.aClass21Array3[3] = null;
		return local185;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		if (this.aClass169_1 == null || !this.method6318(131072, arg2)) {
			return false;
		}
		@Pc(19) Class255 local19 = arg2.method5343();
		@Pc(24) int local24 = super.aClass358_7.method8345();
		local19.a(local24);
		local19.G(super.anInt9398, super.anInt9400, super.anInt9396);
		@Pc(42) boolean local42 = false;
		for (@Pc(44) int local44 = 0; local44 < super.aClass21Array3.length; local44++) {
			if (super.aClass21Array3[local44] != null) {
				@Pc(74) boolean local74 = this.aClass169_1.anInt5000 == -1 ? this.aClass169_1.anInt4979 == 1 : this.aClass169_1.anInt5000 == 1;
				@Pc(84) boolean local84 = super.aClass21Array3[local44].method7148(arg1, arg0, local19, local74);
				if (local84) {
					local42 = true;
					break;
				}
			}
		}
		super.aClass21Array3[0] = super.aClass21Array3[1] = super.aClass21Array3[2] = super.aClass21Array3[3] = null;
		return local42;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class2_Sub2_Sub1_Sub1 extends Class2_Sub2_Sub1 {

	@OriginalMember(owner = "client!dg", name = "uc", descriptor = "Lclient!to;")
	public Class314 aClass314_1;

	@OriginalMember(owner = "client!dg", name = "yc", descriptor = "Ljava/lang/String;")
	public String aString22;

	@OriginalMember(owner = "client!dg", name = "Rc", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!dg", name = "kd", descriptor = "I")
	private int anInt2221;

	@OriginalMember(owner = "client!dg", name = "nd", descriptor = "I")
	public int anInt2223;

	@OriginalMember(owner = "client!dg", name = "rd", descriptor = "I")
	public int anInt2225;

	@OriginalMember(owner = "client!dg", name = "Cc", descriptor = "I")
	public int anInt2193 = -1;

	@OriginalMember(owner = "client!dg", name = "vc", descriptor = "I")
	public int anInt2187 = -1;

	@OriginalMember(owner = "client!dg", name = "Jc", descriptor = "I")
	public int anInt2199 = 0;

	@OriginalMember(owner = "client!dg", name = "Vc", descriptor = "I")
	public int anInt2210 = -1;

	@OriginalMember(owner = "client!dg", name = "Wc", descriptor = "I")
	public int anInt2211 = 0;

	@OriginalMember(owner = "client!dg", name = "xc", descriptor = "I")
	public int anInt2189 = -1;

	@OriginalMember(owner = "client!dg", name = "wc", descriptor = "I")
	public int anInt2188 = 0;

	@OriginalMember(owner = "client!dg", name = "Yc", descriptor = "I")
	public int anInt2212 = 0;

	@OriginalMember(owner = "client!dg", name = "Ic", descriptor = "I")
	public int anInt2198 = 0;

	@OriginalMember(owner = "client!dg", name = "Nc", descriptor = "I")
	public int anInt2203 = -1;

	@OriginalMember(owner = "client!dg", name = "cd", descriptor = "I")
	public int anInt2215 = -1;

	@OriginalMember(owner = "client!dg", name = "Kc", descriptor = "I")
	public int anInt2200 = -1;

	@OriginalMember(owner = "client!dg", name = "ld", descriptor = "Z")
	public boolean aBoolean172 = false;

	@OriginalMember(owner = "client!dg", name = "Zc", descriptor = "Z")
	public boolean aBoolean171 = false;

	@OriginalMember(owner = "client!dg", name = "bd", descriptor = "I")
	public int anInt2214 = 255;

	@OriginalMember(owner = "client!dg", name = "pd", descriptor = "Z")
	public boolean aBoolean173 = false;

	@OriginalMember(owner = "client!dg", name = "fd", descriptor = "I")
	public int anInt2218 = -1;

	@OriginalMember(owner = "client!dg", name = "qd", descriptor = "Z")
	public boolean aBoolean174 = false;

	@OriginalMember(owner = "client!dg", name = "gd", descriptor = "B")
	private byte aByte20 = 0;

	@OriginalMember(owner = "client!dg", name = "Ec", descriptor = "B")
	private byte aByte19 = 0;

	@OriginalMember(owner = "client!dg", name = "id", descriptor = "B")
	private byte aByte21 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIBI)V")
	public void method2032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (super.anInt7660 < 9) {
			super.anInt7660++;
		}
		for (@Pc(16) int local16 = super.anInt7660; local16 > 0; local16--) {
			super.anIntArray487[local16] = super.anIntArray487[local16 - 1];
			super.anIntArray488[local16] = super.anIntArray488[local16 - 1];
			super.aByteArray85[local16] = super.aByteArray85[local16 - 1];
		}
		super.anIntArray487[0] = arg1;
		super.aByteArray85[0] = arg2;
		super.anIntArray488[0] = arg0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBI)V")
	public void method2033(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt7660 = 0;
		super.anIntArray487[0] = arg0;
		super.anInt7659 = 0;
		super.anInt7658 = 0;
		super.anIntArray488[0] = arg1;
		@Pc(32) int local32 = this.method6311();
		super.anInt9396 = local32 * 256 + super.anIntArray488[0] * 512;
		super.anInt9398 = super.anIntArray487[0] * 512 + local32 * 256;
		if (Static443.aClass2_Sub2_Sub1_Sub1_2 == this) {
			Static423.method6761();
		}
		if (super.aClass55_Sub8_5 != null) {
			super.aClass55_Sub8_5.method7123();
		}
	}

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)I")
	@Override
	public int method6311() {
		return this.aClass314_1 == null || this.aClass314_1.anInt9420 == -1 ? super.method6311() : Static121.aClass118_2.method3029(this.aClass314_1.anInt9420).anInt4979;
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(Lclient!oa;I)Lclient!cd;")
	@Override
	public Class44 method8385(@OriginalArg(0) Class15 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8388() {
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!oa;B)Lclient!pl;")
	@Override
	public Class55_Sub6 method8382(@OriginalArg(0) Class15 arg0) {
		if (this.aClass314_1 == null || !this.method2037(2048, arg0)) {
			return null;
		}
		@Pc(27) Class255 local27 = arg0.method5343();
		@Pc(32) int local32 = super.aClass358_7.method8345();
		local27.a(local32);
		local27.G(super.anInt9398, super.anInt9400 - 20, super.anInt9396);
		@Pc(110) int local110;
		if (Static455.aClass3_Sub27_Sub1_1.aBoolean384) {
			@Pc(52) Class171 local52 = this.method6316();
			if (local52.aBoolean431 && (this.aClass314_1.anInt9420 == -1 || Static121.aClass118_2.method3029(this.aClass314_1.anInt9420).aBoolean418)) {
				@Pc(87) Class174 local87 = super.anInt7651 != -1 && super.anInt7584 == 0 ? Static532.aClass157_2.method3734(super.anInt7651) : null;
				@Pc(108) Class174 local108 = super.anInt7655 == -1 || this.aBoolean174 || super.aBoolean645 && local87 != null ? null : Static532.aClass157_2.method3734(super.anInt7655);
				local110 = 0;
				if (super.anInt7598 != 0) {
					local110 = this.method6299();
				}
				@Pc(150) Class21 local150 = Static208.method3663(local108 == null ? super.anInt7646 : super.anInt7586, super.anInt7590, local32, super.aClass21Array3[0], local108 == null ? local87 : local108, 240, arg0, 0, 1, local110, super.anInt7587, 160, super.anInt7629, 0);
				if (local150 != null) {
					arg0.method5336(false);
					local150.method7145(local27, null, 0);
					arg0.method5336(true);
				}
			}
		}
		if (Static443.aClass2_Sub2_Sub1_Sub1_2 == this) {
			local27.GA(super.anInt9398, super.anInt9400, super.anInt9396);
			for (@Pc(179) int local179 = Static516.aClass357Array3.length - 1; local179 >= 0; local179--) {
				@Pc(185) Class357 local185 = Static516.aClass357Array3[local179];
				if (local185 != null && local185.anInt10308 != -1) {
					@Pc(216) int local216;
					if (local185.anInt10299 == 1) {
						@Pc(205) Class3_Sub46 local205 = (Class3_Sub46) Static331.aClass25_25.method946((long) local185.anInt10302);
						if (local205 != null) {
							@Pc(210) Class2_Sub2_Sub1_Sub2 local210 = local205.aClass2_Sub2_Sub1_Sub2_2;
							local216 = local210.anInt9398 - Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398;
							@Pc(223) int local223 = local210.anInt9396 - Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396;
							this.method2041(local185.anInt10308, arg0, local216, local27, local223, super.aClass21Array3[0], 92160000);
						}
					}
					if (local185.anInt10299 == 2) {
						@Pc(251) int local251 = local185.anInt10300 + 256 - Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398;
						local110 = local185.anInt10303 + 256 - Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396;
						local216 = local185.anInt10305 << 9;
						local216 *= local216;
						this.method2041(local185.anInt10308, arg0, local251, local27, local110, super.aClass21Array3[0], local216);
					}
					if (local185.anInt10299 == 10 && local185.anInt10302 >= 0 && local185.anInt10302 < Static378.aClass2_Sub2_Sub1_Sub1Array10.length) {
						@Pc(302) Class2_Sub2_Sub1_Sub1 local302 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local185.anInt10302];
						if (local302 != null) {
							local110 = local302.anInt9398 - Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398;
							local216 = local302.anInt9396 - Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396;
							this.method2041(local185.anInt10308, arg0, local110, local27, local216, super.aClass21Array3[0], 92160000);
						}
					}
				}
			}
			local27.a(local32);
			local27.G(super.anInt9398, super.anInt9400, super.anInt9396);
		}
		local27.a(local32);
		local27.G(super.anInt9398, super.anInt9400 - 5, super.anInt9396);
		@Pc(365) Class55_Sub6 local365 = Static232.method3979(super.aClass21Array3.length);
		this.method6308(super.aClass21Array3, arg0, false, local27);
		if (super.aClass55_Sub8_5 == null) {
			arg0.method5310(super.aClass21Array3, local27, local365.aClass55_Sub3Array1, Static443.aClass2_Sub2_Sub1_Sub1_2 == this ? 1 : 0);
		} else {
			@Pc(395) Class274 local395 = super.aClass55_Sub8_5.method7127();
			arg0.method5297(super.aClass21Array3, local395, local27, local365.aClass55_Sub3Array1, Static443.aClass2_Sub2_Sub1_Sub1_2 == this ? 1 : 0);
		}
		super.aClass21Array3[0] = super.aClass21Array3[1] = super.aClass21Array3[2] = super.aClass21Array3[3] = null;
		super.anInt7636 = Static453.anInt8598;
		return local365;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		if (this.aClass314_1 == null || !this.method2037(131072, arg2)) {
			return false;
		}
		@Pc(19) Class255 local19 = arg2.method5343();
		@Pc(24) int local24 = super.aClass358_7.method8345();
		local19.a(local24);
		local19.G(super.anInt9398, super.anInt9400, super.anInt9396);
		@Pc(37) boolean local37 = false;
		for (@Pc(44) int local44 = 0; local44 < super.aClass21Array3.length; local44++) {
			if (super.aClass21Array3[local44] != null && super.aClass21Array3[local44].method7148(arg1, arg0, local19, true)) {
				local37 = true;
				break;
			}
		}
		super.aClass21Array3[0] = super.aClass21Array3[1] = super.aClass21Array3[2] = super.aClass21Array3[3] = null;
		return local37;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)I")
	@Override
	protected int method6302() {
		return this.anInt2221;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BIII)V")
	public void method2035(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt7651 != -1 && Static532.aClass157_2.method3734(super.anInt7651).anInt5496 == 1) {
			super.anIntArray484 = null;
			super.anInt7651 = -1;
		}
		@Pc(37) Class77 local37;
		if (super.anInt7621 != -1) {
			local37 = Static107.aClass303_1.method7476(super.anInt7621);
			if (local37.aBoolean197 && local37.anInt2573 != -1 && Static532.aClass157_2.method3734(local37.anInt2573).anInt5496 == 1) {
				super.anInt7621 = -1;
			}
		}
		if (super.anInt7638 != -1) {
			local37 = Static107.aClass303_1.method7476(super.anInt7638);
			if (local37.aBoolean197 && local37.anInt2573 != -1 && Static532.aClass157_2.method3734(local37.anInt2573).anInt5496 == 1) {
				super.anInt7638 = -1;
			}
		}
		this.anInt2218 = -1;
		if (arg2 < 0 || arg2 >= Static460.anInt8640 || arg1 < 0 || arg1 >= Static292.anInt7682) {
			this.method2033(arg2, arg1);
		} else if (super.anIntArray487[0] >= 0 && Static460.anInt8640 > super.anIntArray487[0] && super.anIntArray488[0] >= 0 && Static292.anInt7682 > super.anIntArray488[0]) {
			if (arg0 == 2) {
				Static250.method4492(this, arg1, arg2);
			}
			this.method2032(arg1, arg2, arg0);
		} else {
			this.method2033(arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILclient!oa;ILclient!cq;ZI)V")
	@Override
	public void method8387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBLclient!oa;)Z")
	private boolean method2037(@OriginalArg(0) int arg0, @OriginalArg(2) Class15 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) Class171 local9 = this.method6316();
		@Pc(30) Class174 local30 = super.anInt7651 != -1 && super.anInt7584 == 0 ? Static532.aClass157_2.method3734(super.anInt7651) : null;
		@Pc(50) Class174 local50 = super.anInt7655 == -1 || this.aBoolean174 || super.aBoolean645 && local30 != null ? null : Static532.aClass157_2.method3734(super.anInt7655);
		@Pc(53) int local53 = local9.anInt5097;
		@Pc(56) int local56 = local9.anInt5084;
		if (local53 != 0 || local56 != 0 || local9.anInt5105 != 0 || local9.anInt5091 != 0) {
			arg0 |= 0x7;
		}
		@Pc(95) boolean local95 = super.aByte81 != 0 && Static129.anInt10429 >= super.anInt7593 && super.anInt7624 > Static129.anInt10429;
		if (local95) {
			arg0 |= 0x80000;
		}
		@Pc(136) Class21 local136 = super.aClass21Array3[0] = this.aClass314_1.method7649(super.aClass216Array3, super.anInt7586, local30, arg1, local50, Static588.aClass322_1, arg0, Static341.aClass6_1, Static144.aClass188_1, super.anInt7646, super.anInt7617, Static532.aClass157_2, super.anInt7615, super.anInt7588, super.anInt7625, Static121.aClass118_2, Static517.aClass23_2);
		@Pc(139) int local139 = Static72.method6649();
		if (Static188.anInt3749 < 96 && local139 > 50) {
			Static580.method8284();
		}
		@Pc(169) int local169;
		if (Static508.aClass109_7 != Static51.aClass109_2 && local139 < 50) {
			local169 = 50 - local139;
			while (Static515.anInt9460 < local169) {
				Static574.aByteArrayArray31[Static515.anInt9460] = new byte[102400];
				Static515.anInt9460++;
			}
			while (local169 < Static515.anInt9460) {
				Static515.anInt9460--;
				Static574.aByteArrayArray31[Static515.anInt9460] = null;
			}
		} else if (Static508.aClass109_7 != Static51.aClass109_2) {
			Static574.aByteArrayArray31 = new byte[50][];
			Static515.anInt9460 = 0;
		}
		if (local136 == null) {
			return false;
		}
		super.anInt7601 = local136.DA();
		this.method6306(local136);
		local169 = super.aClass358_7.method8345();
		if (local53 == 0 && local56 == 0) {
			this.method6310(this.method6311() << 9, local169, 0, 0, this.method6311() << 9);
		} else {
			this.method6310(local56, local169, local9.anInt5110, local9.anInt5098, local53);
			if (super.anInt7590 != 0) {
				local136.AA(super.anInt7590);
			}
			if (super.anInt7587 != 0) {
				local136.v(super.anInt7587);
			}
			if (super.anInt7629 != 0) {
				local136.m(0, super.anInt7629, 0);
			}
		}
		if (local95) {
			local136.method7150(super.aByte79, super.aByte78, super.aByte80, super.aByte81 & 0xFF);
		}
		@Pc(324) Class77 local324;
		@Pc(339) boolean local339;
		@Pc(341) int local341;
		@Pc(380) Class21 local380;
		if (this.aBoolean174 || super.anInt7621 == -1 || super.anInt7594 == -1) {
			super.aClass21Array3[1] = null;
		} else {
			local324 = Static107.aClass303_1.method7476(super.anInt7621);
			local339 = local324.aByte24 == 3 && (local53 != 0 || local56 != 0);
			local341 = local5;
			if (local339) {
				local341 = local5 | 0x7;
			} else {
				if (super.anInt7614 != 0) {
					local341 = local5 | 0x5;
				}
				if (super.anInt7611 != 0) {
					local341 |= 0x2;
				}
			}
			local380 = super.aClass21Array3[1] = local324.method2276(local341, super.anInt7594, Static532.aClass157_2, super.anInt7623, super.anInt7596, arg1);
			if (local380 != null) {
				if (super.anInt7611 != 0) {
					local380.m(0, -super.anInt7611 << 2, 0);
				}
				if (super.anInt7614 != 0) {
					local380.I(super.anInt7614 * 2048);
				}
				if (local339) {
					if (super.anInt7590 != 0) {
						local380.AA(super.anInt7590);
					}
					if (super.anInt7587 != 0) {
						local380.v(super.anInt7587);
					}
					if (super.anInt7629 != 0) {
						local380.m(0, super.anInt7629, 0);
					}
				}
			}
		}
		if (this.aBoolean174 || super.anInt7638 == -1 || super.anInt7656 == -1) {
			super.aClass21Array3[3] = null;
		} else {
			local324 = Static107.aClass303_1.method7476(super.anInt7638);
			local339 = local324.aByte24 == 3 && (local53 != 0 || local56 != 0);
			local341 = local5;
			if (local339) {
				local341 = local5 | 0x7;
			} else {
				if (super.anInt7652 != 0) {
					local341 = local5 | 0x5;
				}
				if (super.lb != 0) {
					local341 |= 0x2;
				}
			}
			local380 = super.aClass21Array3[3] = local324.method2271(super.anInt7612, local341, arg1, super.anInt7653, super.anInt7656, Static532.aClass157_2);
			if (local380 != null) {
				if (super.lb != 0) {
					local380.m(0, -super.lb << 2, 0);
				}
				if (super.anInt7652 != 0) {
					local380.I(super.anInt7652 * 2048);
				}
				if (local339) {
					if (super.anInt7590 != 0) {
						local380.AA(super.anInt7590);
					}
					if (super.anInt7587 != 0) {
						local380.v(super.anInt7587);
					}
					if (super.anInt7629 != 0) {
						local380.m(0, super.anInt7629, 0);
					}
				}
			}
		}
		super.aClass21Array3[2] = null;
		if (!this.aBoolean174 && super.aClass3_Sub25_3 != null) {
			if (Static129.anInt10429 >= super.aClass3_Sub25_3.anInt4617) {
				super.aClass3_Sub25_3 = null;
			} else if (super.aClass3_Sub25_3.anInt4615 <= Static129.anInt10429) {
				@Pc(618) Class21 local618 = super.aClass3_Sub25_3.method3884(local5 | 0x7, arg1);
				if (local618 != null) {
					local618.m(super.aClass3_Sub25_3.anInt4606 - super.anInt9398, super.aClass3_Sub25_3.anInt4609 - super.anInt9400 + 5, -super.anInt9396 + super.aClass3_Sub25_3.anInt4618);
					if (local169 != 0) {
						local618.I(-local169 & 0x3FFF);
					}
					super.aClass21Array3[2] = local618;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BZ)Ljava/lang/String;")
	public String method2038() {
		@Pc(5) String local5 = "";
		if (Static164.aStringArray13 != null) {
			local5 = local5 + Static164.aStringArray13[this.aByte20];
		}
		@Pc(38) int[] local38;
		if (this.aByte21 == 1 && Static130.anIntArray192 != null) {
			local38 = Static130.anIntArray192;
		} else {
			local38 = Static565.anIntArray659;
		}
		if (local38 != null && local38[this.aByte20] != -1) {
			@Pc(57) Class227 local57 = Static547.aClass207_1.method5258(local38[this.aByte20]);
			if (local57.aChar4 == 's') {
				local5 = local5 + local57.method5828(this.aByte19 & 0xFF);
			} else {
				Static468.method7192("gdn1", new Throwable());
				local38[this.aByte20] = -1;
			}
		}
		local5 = local5 + this.aString22;
		if (Static89.aStringArray6 != null) {
			local5 = local5 + Static89.aStringArray6[this.aByte20];
		}
		return local5;
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)I")
	@Override
	public int method7629() {
		return super.anInt7601;
	}

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "(B)Z")
	public boolean method2040() {
		return this.aClass314_1 != null;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8384(@OriginalArg(0) Class15 arg0) {
		if (this.aClass314_1 == null || !super.aBoolean648 && !this.method2037(0, arg0)) {
			return;
		}
		@Pc(20) Class255 local20 = arg0.method5343();
		local20.a(super.aClass358_7.method8345());
		local20.G(super.anInt9398, super.anInt9400 - 5, super.anInt9396);
		this.method6308(super.aClass21Array3, arg0, super.aBoolean648, local20);
		super.aClass21Array3[0] = super.aClass21Array3[1] = super.aClass21Array3[2] = super.aClass21Array3[3] = null;
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(B)V")
	@Override
	public void method8386() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILclient!oa;ILclient!q;ILclient!ba;I)V")
	private void method2041(@OriginalArg(0) int arg0, @OriginalArg(2) Class15 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class255 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class21 arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg4 * arg4 + arg2 * arg2;
		if (local11 < 262144 || local11 > arg6) {
			return;
		}
		@Pc(42) int local42 = (int) (Math.atan2((double) arg2, (double) arg4) * 2607.5945876176133D) & 0x3FFF;
		@Pc(54) Class21 local54 = Static546.method7998(arg1, super.anInt7587, arg0, super.anInt7629, local42, super.anInt7590);
		if (local54 != null) {
			arg1.method5336(false);
			local54.method7145(arg3, null, 0);
			arg1.method5336(true);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method2042() {
		return this.aString23;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!fd;I)V")
	public void method2043(@OriginalArg(0) Class3_Sub7 arg0) {
		arg0.anInt7869 = 0;
		@Pc(12) int local12 = arg0.method6538();
		this.aByte21 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean173;
		this.aBoolean173 = (local12 & 0x2) != 0;
		@Pc(41) boolean local41 = (local12 & 0x4) != 0;
		@Pc(45) int local45 = super.method6311();
		this.method6315((local12 >> 3 & 0x7) + 1);
		this.aByte20 = (byte) (local12 >> 6 & 0x3);
		super.anInt9398 += this.method6311() - local45 << 8;
		super.anInt9396 += this.method6311() - local45 << 8;
		this.aByte19 = arg0.method6529();
		this.anInt2187 = arg0.method6529();
		this.anInt2189 = arg0.method6529();
		this.anInt2199 = 0;
		@Pc(109) int local109 = -1;
		@Pc(112) int[] local112 = new int[12];
		@Pc(132) int local132;
		@Pc(138) int local138;
		@Pc(174) int local174;
		for (@Pc(114) int local114 = 0; local114 < 12; local114++) {
			@Pc(121) int local121 = arg0.method6538();
			if (local121 == 0) {
				local112[local114] = 0;
			} else {
				local132 = arg0.method6538();
				local138 = (local121 << 8) + local132;
				if (local114 == 0 && local138 == 65535) {
					local109 = arg0.method6535();
					this.anInt2199 = arg0.method6538();
					break;
				}
				if (local138 >= 32768) {
					local138 = Static354.anIntArray454[local138 - 32768];
					local112[local114] = local138 | 0x40000000;
					local174 = Static517.aClass23_2.method901(local138).anInt627;
					if (local174 != 0) {
						this.anInt2199 = local174;
					}
				} else {
					local112[local114] = local138 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(198) int[] local198 = new int[5];
		for (local132 = 0; local132 < 5; local132++) {
			local138 = arg0.method6538();
			if (Static152.aShortArrayArrayArray1.length < 1 || local138 < 0 || local138 >= Static152.aShortArrayArrayArray1[0][local132].length) {
				local138 = 0;
			}
			local198[local132] = local138;
		}
		this.anInt2221 = arg0.method6535();
		this.aString22 = arg0.method6536();
		this.aString23 = this.aString22;
		this.anInt2212 = arg0.method6538();
		if (local41) {
			this.anInt2188 = arg0.method6535();
			this.anInt2215 = -1;
			if (this.anInt2188 == 65535) {
				this.anInt2188 = -1;
			}
			this.anInt2211 = this.anInt2212;
		} else {
			this.anInt2188 = 0;
			this.anInt2211 = arg0.method6538();
			this.anInt2215 = arg0.method6538();
			if (this.anInt2215 == 255) {
				this.anInt2215 = -1;
			}
		}
		local138 = this.anInt2198;
		this.anInt2198 = arg0.method6538();
		@Pc(321) int local321;
		if (this.anInt2198 == 0) {
			Static286.method8361(this);
		} else {
			local174 = this.anInt2210;
			@Pc(318) int local318 = this.anInt2193;
			local321 = this.anInt2203;
			@Pc(324) int local324 = this.anInt2200;
			@Pc(327) int local327 = this.anInt2214;
			this.anInt2210 = arg0.method6535();
			this.anInt2193 = arg0.method6535();
			this.anInt2203 = arg0.method6535();
			this.anInt2200 = arg0.method6535();
			this.anInt2214 = arg0.method6538();
			if (this.aBoolean173 != local21 || this.anInt2198 != local138 || local174 != this.anInt2210 || this.anInt2193 != local318 || this.anInt2203 != local321 || this.anInt2200 != local324 || this.anInt2214 != local327) {
				Static415.method6706(this);
			}
		}
		if (this.aClass314_1 == null) {
			this.aClass314_1 = new Class314();
		}
		local174 = this.aClass314_1.anInt9420;
		@Pc(419) int[] local419 = this.aClass314_1.anIntArray615;
		this.aClass314_1.method7647(this.aByte21 == 1, local109, local198, local112, this.method6302());
		if (local109 != local174) {
			super.anInt9398 = (super.anIntArray487[0] << 9) + (this.method6311() << 8);
			super.anInt9396 = (super.anIntArray488[0] << 9) + (this.method6311() << 8);
		}
		if (super.anInt7603 == Static381.anInt1560 && local419 != null) {
			for (local321 = 0; local321 < local198.length; local321++) {
				if (local419[local321] != local198[local321]) {
					Static517.aClass23_2.method898();
					break;
				}
			}
		}
		if (super.aClass55_Sub8_5 != null) {
			super.aClass55_Sub8_5.method7123();
		}
		if (super.anInt7655 == -1 || !super.aBoolean645) {
			return;
		}
		@Pc(518) Class171 local518 = this.method6316();
		if (!local518.method4289(super.anInt7655)) {
			super.anInt7655 = -1;
			super.aBoolean645 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)I")
	@Override
	public int method6300() {
		return -1;
	}
}

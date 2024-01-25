import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class16_Sub1_Sub1_Sub3_Sub1 extends Class16_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!cc", name = "gd", descriptor = "Ljava/lang/String;")
	public String aString15;

	@OriginalMember(owner = "client!cc", name = "jd", descriptor = "Lclient!fg;")
	public Class113 aClass113_1;

	@OriginalMember(owner = "client!cc", name = "vd", descriptor = "I")
	public int anInt1684;

	@OriginalMember(owner = "client!cc", name = "Gd", descriptor = "Lclient!lba;")
	public Class207 aClass207_1;

	@OriginalMember(owner = "client!cc", name = "pd", descriptor = "I")
	public int anInt1679 = 1;

	@OriginalMember(owner = "client!cc", name = "sd", descriptor = "I")
	public int anInt1681 = 1;

	@OriginalMember(owner = "client!cc", name = "ud", descriptor = "I")
	public int anInt1683 = -1;

	@OriginalMember(owner = "client!cc", name = "id", descriptor = "I")
	public int anInt1673 = -1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
	public void method1407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray595[0];
		@Pc(15) int local15 = super.anIntArray594[0];
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
			local15--;
			local10--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (super.anInt8049 != -1 && Static479.aClass308_2.method7075(super.anInt8049).anInt6221 == 1) {
			super.anIntArray586 = null;
			super.anInt8049 = -1;
		}
		if (arg1 == 7) {
			local10--;
			local15++;
		}
		@Pc(98) Class354 local98;
		if (super.anInt8053 != -1) {
			local98 = Static546.aClass263_1.method6113(super.anInt8053);
			if (local98.aBoolean712 && local98.anInt9829 != -1 && Static479.aClass308_2.method7075(local98.anInt9829).anInt6221 == 1) {
				super.anInt8053 = -1;
			}
		}
		if (super.anInt8084 != -1) {
			local98 = Static546.aClass263_1.method6113(super.anInt8084);
			if (local98.aBoolean712 && local98.anInt9829 != -1 && Static479.aClass308_2.method7075(local98.anInt9829).anInt6221 == 1) {
				super.anInt8084 = -1;
			}
		}
		if (super.anInt8133 < 9) {
			super.anInt8133++;
		}
		for (@Pc(161) int local161 = super.anInt8133; local161 > 0; local161--) {
			super.anIntArray595[local161] = super.anIntArray595[local161 - 1];
			super.anIntArray594[local161] = super.anIntArray594[local161 - 1];
			super.aByteArray85[local161] = super.aByteArray85[local161 - 1];
		}
		super.anIntArray595[0] = local10;
		super.aByteArray85[0] = (byte) arg0;
		super.anIntArray594[0] = local15;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6978(@OriginalArg(0) Class13 arg0) {
		if (this.aClass113_1 == null || !super.aBoolean589 && !this.method1413(arg0, 0)) {
			return;
		}
		@Pc(20) Class51 local20 = arg0.method8154();
		local20.method6710(super.aClass111_7.method2696());
		local20.method6711(super.anInt8037, super.anInt8036 - 20, super.anInt8034);
		this.method7006(arg0, super.aClass193Array3, super.aBoolean589, local20);
		super.aClass193Array3[0] = super.aClass193Array3[1] = super.aClass193Array3[2] = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)I")
	@Override
	public int method6996() {
		if (this.aClass113_1.anIntArray213 != null) {
			@Pc(13) Class113 local13 = this.aClass113_1.method2752(Static382.aClass282_1);
			if (local13 != null && local13.lb != -1) {
				return local13.lb;
			}
		}
		return this.aClass113_1.lb == -1 ? super.method6996() : this.aClass113_1.lb;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lclient!ha;I)Lclient!jk;")
	@Override
	public Class16_Sub5 method6991(@OriginalArg(0) Class13 arg0) {
		if (this.aClass113_1 == null || !this.method1413(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class51 local19 = arg0.method8154();
		@Pc(24) int local24 = super.aClass111_7.method2696();
		local19.method6710(local24);
		@Pc(42) Class84 local42 = Static348.aClass84ArrayArrayArray5[super.aByte109][super.anInt8037 >> Static326.anInt5713][super.anInt8034 >> Static326.anInt5713];
		if (local42 == null || local42.aClass16_Sub1_Sub3_1 == null) {
			super.anInt8077 = (int) ((float) super.anInt8077 - (float) super.anInt8077 / 10.0F);
		} else {
			@Pc(54) int local54 = super.anInt8077 - local42.aClass16_Sub1_Sub3_1.aShort72;
			super.anInt8077 = (int) ((float) super.anInt8077 - (float) local54 / 10.0F);
		}
		local19.method6711(super.anInt8037, -super.anInt8077 + super.anInt8036 - 20, super.anInt8034);
		@Pc(97) Class291 local97 = this.method7007();
		@Pc(110) Class113 local110 = this.aClass113_1.anIntArray213 == null ? this.aClass113_1 : this.aClass113_1.method2752(Static382.aClass282_1);
		super.aBoolean590 = false;
		@Pc(115) Class16_Sub5 local115 = null;
		if (Static305.aClass2_Sub49_15.aClass33_Sub3_1.method1655() == 1 && local110.aBoolean252 && local97.aBoolean548) {
			@Pc(145) Class228 local145 = super.anInt8049 != -1 && super.lb == 0 ? Static479.aClass308_2.method7075(super.anInt8049) : null;
			@Pc(162) Class228 local162 = super.anInt8095 == -1 || super.aBoolean588 && local145 != null ? null : Static479.aClass308_2.method7075(super.anInt8095);
			@Pc(212) Class193 local212 = Static144.method2589(super.aClass193Array3[0], local24, this.aClass113_1.aShort62 & 0xFFFF, super.anInt8089, this.aClass113_1.aByte63 & 0xFF, local162 == null ? local145 : local162, local162 == null ? super.anInt8083 : super.anInt8059, super.anInt8122, arg0, this.aClass113_1.anInt3238, this.aClass113_1.aByte59 & 0xFF, this.aClass113_1.aShort61 & 0xFFFF, super.anInt8085);
			if (local212 != null) {
				local115 = Static134.method8011(this.method1412(), super.aClass193Array3.length + 1);
				super.aBoolean590 = true;
				arg0.C(false);
				if (Static582.aBoolean678) {
					local212.method6622(local19, local115.aClass16_Sub10Array1[super.aClass193Array3.length], Static529.anInt8509, 0);
				} else {
					local212.method6612(local19, local115.aClass16_Sub10Array1[super.aClass193Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local19.method6710(local24);
		local19.method6711(super.anInt8037, super.anInt8036 - super.anInt8077 - 5, super.anInt8034);
		if (local115 == null) {
			local115 = Static134.method8011(this.method1412(), super.aClass193Array3.length);
		}
		this.method7006(arg0, super.aClass193Array3, false, local19);
		@Pc(299) int local299;
		if (Static582.aBoolean678) {
			for (local299 = 0; local299 < super.aClass193Array3.length; local299++) {
				if (super.aClass193Array3[local299] != null) {
					super.aClass193Array3[local299].method6622(local19, local115.aClass16_Sub10Array1[local299], Static529.anInt8509, 0);
				}
			}
		} else {
			for (local299 = 0; super.aClass193Array3.length > local299; local299++) {
				if (super.aClass193Array3[local299] != null) {
					super.aClass193Array3[local299].method6612(local19, local115.aClass16_Sub10Array1[local299], 0);
				}
			}
		}
		if (super.aClass16_Sub7_8 != null) {
			@Pc(367) Class119 local367 = super.aClass16_Sub7_8.method5982();
			if (Static582.aBoolean678) {
				arg0.method8165(local367, Static529.anInt8509);
			} else {
				arg0.method8101(local367);
			}
		}
		for (local299 = 0; super.aClass193Array3.length > local299; local299++) {
			if (super.aClass193Array3[local299] != null) {
				super.aBoolean590 |= super.aClass193Array3[local299].F();
			}
		}
		super.aClass193Array3[0] = super.aClass193Array3[1] = super.aClass193Array3[2] = null;
		super.anInt8109 = Static364.anInt6282;
		return local115;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)I")
	@Override
	protected int method7009() {
		if (this.aClass113_1.anIntArray213 != null) {
			@Pc(13) Class113 local13 = this.aClass113_1.method2752(Static382.aClass282_1);
			if (local13 != null && local13.anInt3224 != -1) {
				return local13.anInt3224;
			}
		}
		return this.aClass113_1.anInt3224;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!fg;I)V")
	public void method1409(@OriginalArg(0) Class113 arg0) {
		this.aClass113_1 = arg0;
		if (this.aClass113_1 != null) {
			this.anInt1684 = this.aClass113_1.anInt3227;
			this.aString15 = this.aClass113_1.aString31;
		}
		if (super.aClass16_Sub7_8 != null) {
			super.aClass16_Sub7_8.method5989();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZIIIB)V")
	public void method1410(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte109 = super.aByte108 = (byte) arg3;
		if (Static481.method6813(arg4, arg2)) {
			super.aByte108++;
		}
		if (super.anInt8049 != -1 && Static479.aClass308_2.method7075(super.anInt8049).anInt6221 == 1) {
			super.anInt8049 = -1;
			super.anIntArray586 = null;
		}
		@Pc(62) Class354 local62;
		if (super.anInt8053 != -1) {
			local62 = Static546.aClass263_1.method6113(super.anInt8053);
			if (local62.aBoolean712 && local62.anInt9829 != -1 && Static479.aClass308_2.method7075(local62.anInt9829).anInt6221 == 1) {
				super.anInt8053 = -1;
			}
		}
		if (super.anInt8084 != -1) {
			local62 = Static546.aClass263_1.method6113(super.anInt8084);
			if (local62.aBoolean712 && local62.anInt9829 != -1 && Static479.aClass308_2.method7075(local62.anInt9829).anInt6221 == 1) {
				super.anInt8084 = -1;
			}
		}
		if (!arg1) {
			@Pc(121) int local121 = arg2 - super.anIntArray595[0];
			@Pc(129) int local129 = arg4 - super.anIntArray594[0];
			if (local121 >= -8 && local121 <= 8 && local129 >= -8 && local129 <= 8) {
				if (super.anInt8133 < 9) {
					super.anInt8133++;
				}
				for (@Pc(160) int local160 = super.anInt8133; local160 > 0; local160--) {
					super.anIntArray595[local160] = super.anIntArray595[local160 - 1];
					super.anIntArray594[local160] = super.anIntArray594[local160 - 1];
					super.aByteArray85[local160] = super.aByteArray85[local160 - 1];
				}
				super.anIntArray595[0] = arg2;
				super.aByteArray85[0] = 1;
				super.anIntArray594[0] = arg4;
				return;
			}
		}
		super.anInt8135 = 0;
		super.anIntArray595[0] = arg2;
		super.anInt8133 = 0;
		super.anInt8136 = 0;
		super.anIntArray594[0] = arg4;
		super.anInt8034 = (arg0 << 8) + (super.anIntArray594[0] << 9);
		super.anInt8037 = (arg0 << 8) + (super.anIntArray595[0] << 9);
		if (super.aClass16_Sub7_8 != null) {
			super.aClass16_Sub7_8.method5989();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	@Override
	public int method6997() {
		if (this.aClass113_1.anIntArray213 != null) {
			@Pc(13) Class113 local13 = this.aClass113_1.method2752(Static382.aClass282_1);
			if (local13 != null && local13.anInt3235 != -1) {
				return local13.anInt3235;
			}
		}
		return this.aClass113_1.anInt3235;
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(ILclient!ha;)Lclient!wg;")
	@Override
	public Class379 method6983(@OriginalArg(1) Class13 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "(B)Z")
	private boolean method1412() {
		return this.aClass113_1.aBoolean254;
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "(B)V")
	@Override
	public void method6987() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILclient!rba;Lclient!ha;ZII)V")
	@Override
	public void method6984(@OriginalArg(1) int arg0, @OriginalArg(2) Class16_Sub1 arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!ha;I)Z")
	private boolean method1413(@OriginalArg(1) Class13 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class291 local11 = this.method7007();
		@Pc(26) Class228 local26 = super.anInt8049 != -1 && super.lb == 0 ? Static479.aClass308_2.method7075(super.anInt8049) : null;
		@Pc(43) Class228 local43 = super.anInt8095 == -1 || super.aBoolean588 && local26 != null ? null : Static479.aClass308_2.method7075(super.anInt8095);
		@Pc(46) int local46 = local11.anInt7628;
		@Pc(49) int local49 = local11.anInt7630;
		if (local46 != 0 || local49 != 0 || local11.anInt7631 != 0 || local11.anInt7627 != 0) {
			arg1 |= 0x7;
		}
		@Pc(89) boolean local89 = super.aByte115 != 0 && Static389.anInt6694 >= super.anInt8097 && Static389.anInt6694 < super.anInt8101;
		if (local89) {
			arg1 |= 0x80000;
		}
		@Pc(100) int local100 = super.aClass111_7.method2696();
		@Pc(136) Class193 local136 = super.aClass193Array3[0] = this.aClass113_1.method2747(this.aClass207_1, local100, local43, super.anInt8096, Static6.aClass146_1, arg1, Static382.aClass282_1, Static479.aClass308_2, super.anInt8059, super.anInt8087, super.aClass148Array3, local26, super.anInt8121, super.anInt8128, arg0, super.anInt8083, super.anIntArray592);
		if (local136 == null) {
			return false;
		}
		super.anInt8123 = local136.fa();
		super.anInt8098 = local136.ma();
		this.method7002(local136);
		if (local46 == 0 && local49 == 0) {
			this.method7004(0, local100, this.method6999() << 9, 0, this.method6999() << 9);
		} else {
			this.method7004(local11.anInt7621, local100, local46, local11.anInt7618, local49);
			if (super.anInt8089 != 0) {
				super.aClass193Array3[0].FA(super.anInt8089);
			}
			if (super.anInt8122 != 0) {
				super.aClass193Array3[0].VA(super.anInt8122);
			}
			if (super.anInt8085 != 0) {
				super.aClass193Array3[0].H(0, super.anInt8085, 0);
			}
		}
		if (local89) {
			local136.method6616(super.aByte112, super.aByte114, super.aByte111, super.aByte115 & 0xFF);
		}
		@Pc(252) Class354 local252;
		@Pc(267) boolean local267;
		@Pc(269) int local269;
		@Pc(325) Class193 local325;
		@Pc(346) int local346;
		@Pc(348) int local348;
		@Pc(350) int local350;
		@Pc(440) int local440;
		@Pc(468) int local468;
		@Pc(480) int local480;
		@Pc(484) int local484;
		@Pc(494) int local494;
		if (super.anInt8053 == -1 || super.anInt8099 == -1) {
			super.aClass193Array3[1] = null;
		} else {
			local252 = Static546.aClass263_1.method6113(super.anInt8053);
			local267 = local252.aByte130 == 3 && (local46 != 0 || local49 != 0);
			local269 = local7;
			if (local267) {
				local269 = local7 | 0x7;
			} else {
				if (super.anInt8052 != 0) {
					local269 = local7 | 0x5;
				}
				if (super.anInt8055 != 0) {
					local269 |= 0x2;
				}
				if (super.anInt8063 >= 0) {
					local269 |= 0x7;
				}
			}
			local325 = super.aClass193Array3[1] = local252.method8348(super.anInt8099, local269, super.anInt8132, arg0, Static479.aClass308_2, super.anInt8066);
			if (local325 != null) {
				if (super.anInt8063 >= 0) {
					local346 = 0;
					local348 = 0;
					local350 = 0;
					if (local11.anIntArrayArray93 != null && local11.anIntArrayArray93[super.anInt8063] != null) {
						local346 = local11.anIntArrayArray93[super.anInt8063][0];
						local350 = local11.anIntArrayArray93[super.anInt8063][2];
						local348 = local11.anIntArrayArray93[super.anInt8063][1];
					}
					if (local11.anIntArrayArray92 != null && local11.anIntArrayArray92[super.anInt8063] != null) {
						local350 += local11.anIntArrayArray92[super.anInt8063][2];
						local348 += local11.anIntArrayArray92[super.anInt8063][1];
						local346 += local11.anIntArrayArray92[super.anInt8063][0];
					}
					if (local350 != 0 || local346 != 0) {
						local440 = local100;
						if (super.anIntArray592 != null && super.anIntArray592[super.anInt8063] != -1) {
							local440 = super.anIntArray592[super.anInt8063];
						}
						local468 = super.anInt8052 * 2048 + local440 - local100 & 0x3FFF;
						if (local468 != 0) {
							local325.a(local468);
						}
						local480 = Class290.anIntArray546[local468];
						local484 = Class290.anIntArray547[local468];
						local494 = local350 * local480 + local346 * local484 >> 14;
						local350 = local484 * local350 - local346 * local480 >> 14;
						local346 = local494;
					}
					local325.H(local346, local348, local350);
				} else if (super.anInt8052 != 0) {
					local325.a(super.anInt8052 * 2048);
				}
				if (super.anInt8055 != 0) {
					local325.H(0, -super.anInt8055 << 2, 0);
				}
				if (local267) {
					if (super.anInt8089 != 0) {
						local325.FA(super.anInt8089);
					}
					if (super.anInt8122 != 0) {
						local325.VA(super.anInt8122);
					}
					if (super.anInt8085 != 0) {
						local325.H(0, super.anInt8085, 0);
					}
				}
			}
		}
		if (super.anInt8084 == -1 || super.anInt8058 == -1) {
			super.aClass193Array3[2] = null;
		} else {
			local252 = Static546.aClass263_1.method6113(super.anInt8084);
			local267 = local252.aByte130 == 3 && (local46 != 0 || local49 != 0);
			local269 = local7;
			if (local267) {
				local269 = local7 | 0x7;
			} else {
				if (super.anInt8061 != 0) {
					local269 = local7 | 0x5;
				}
				if (super.anInt8093 != 0) {
					local269 |= 0x2;
				}
				if (super.anInt8070 >= 0) {
					local269 |= 0x7;
				}
			}
			local325 = super.aClass193Array3[2] = local252.method8347(super.anInt8079, super.anInt8058, Static479.aClass308_2, super.anInt8129, local269, arg0);
			if (local325 != null) {
				if (super.anInt8070 >= 0 && local11.anIntArrayArray93 != null && local11.anIntArrayArray93[super.anInt8070] != null) {
					local346 = 0;
					local348 = 0;
					local350 = 0;
					if (local11.anIntArrayArray93 != null && local11.anIntArrayArray93[super.anInt8070] != null) {
						local348 = local11.anIntArrayArray93[super.anInt8070][1];
						local350 = local11.anIntArrayArray93[super.anInt8070][2];
						local346 = local11.anIntArrayArray93[super.anInt8070][0];
					}
					if (local11.anIntArrayArray92 != null && local11.anIntArrayArray92[super.anInt8070] != null) {
						local346 += local11.anIntArrayArray92[super.anInt8070][0];
						local348 += local11.anIntArrayArray92[super.anInt8070][1];
						local350 += local11.anIntArrayArray92[super.anInt8070][2];
					}
					if (local350 != 0 || local346 != 0) {
						local440 = local100;
						if (super.anIntArray592 != null && super.anIntArray592[super.anInt8070] != -1) {
							local440 = super.anIntArray592[super.anInt8070];
						}
						local468 = local440 + super.anInt8061 * 2048 - local100 & 0x3FFF;
						if (local468 != 0) {
							local325.a(local468);
						}
						local480 = Class290.anIntArray546[local468];
						local484 = Class290.anIntArray547[local468];
						local494 = local480 * local350 + local346 * local484 >> 14;
						local350 = local484 * local350 - local480 * local346 >> 14;
						local346 = local494;
					}
					local325.H(local346, local348, local350);
				} else if (super.anInt8061 != 0) {
					local325.a(super.anInt8061 * 2048);
				}
				if (super.anInt8093 != 0) {
					local325.H(0, -super.anInt8093 << 2, 0);
				}
				if (local267) {
					if (super.anInt8089 != 0) {
						local325.FA(super.anInt8089);
					}
					if (super.anInt8122 != 0) {
						local325.VA(super.anInt8122);
					}
					if (super.anInt8085 != 0) {
						local325.H(0, super.anInt8085, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method6985(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass113_1 == null || !this.method1413(arg1, 131072)) {
			return false;
		}
		@Pc(19) Class51 local19 = arg1.method8154();
		@Pc(24) int local24 = super.aClass111_7.method2696();
		local19.method6710(local24);
		local19.method6711(super.anInt8037, super.anInt8036, super.anInt8034);
		@Pc(37) boolean local37 = false;
		for (@Pc(48) int local48 = 0; local48 < super.aClass193Array3.length; local48++) {
			if (super.aClass193Array3[local48] != null) {
				@Pc(71) boolean var10000;
				label41: {
					if (this.aClass113_1.anInt3199 <= 0) {
						label39: {
							if (this.aClass113_1.anInt3213 == -1) {
								if (this.aClass113_1.anInt3238 == 1) {
									break label39;
								}
								var10000 = false;
							} else {
								if (this.aClass113_1.anInt3213 == 1) {
									break label39;
								}
								var10000 = false;
							}
							if (!var10000) {
								var10000 = false;
								break label41;
							}
						}
					}
					var10000 = true;
				}
				@Pc(84) boolean local84 = var10000;
				@Pc(99) boolean local99;
				if (Static582.aBoolean678) {
					local99 = super.aClass193Array3[local48].method6617(arg0, arg2, local19, local84, this.aClass113_1.anInt3199, Static529.anInt8509);
				} else {
					local99 = super.aClass193Array3[local48].method6623(arg0, arg2, local19, local84, this.aClass113_1.anInt3199);
				}
				if (local99) {
					local37 = true;
					break;
				}
			}
		}
		super.aClass193Array3[0] = super.aClass193Array3[1] = super.aClass193Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)I")
	@Override
	public int method6975() {
		return this.aClass113_1 == null ? 0 : this.aClass113_1.anInt3199;
	}

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "(B)Z")
	public boolean method1414() {
		return this.aClass113_1 != null;
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method6976() {
		return false;
	}
}

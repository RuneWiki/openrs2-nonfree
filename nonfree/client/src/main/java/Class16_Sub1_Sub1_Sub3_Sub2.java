import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class16_Sub1_Sub1_Sub3_Sub2 extends Class16_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!rl", name = "kd", descriptor = "Ljava/lang/String;")
	public String aString82;

	@OriginalMember(owner = "client!rl", name = "md", descriptor = "Ljava/lang/String;")
	public String aString83;

	@OriginalMember(owner = "client!rl", name = "Ad", descriptor = "I")
	public int anInt8151;

	@OriginalMember(owner = "client!rl", name = "Dd", descriptor = "Lclient!qe;")
	public Class284 aClass284_1;

	@OriginalMember(owner = "client!rl", name = "Fd", descriptor = "I")
	public int anInt8155;

	@OriginalMember(owner = "client!rl", name = "Ld", descriptor = "I")
	private int anInt8159;

	@OriginalMember(owner = "client!rl", name = "pd", descriptor = "I")
	public int anInt8141 = 255;

	@OriginalMember(owner = "client!rl", name = "Cd", descriptor = "I")
	public int anInt8153 = 0;

	@OriginalMember(owner = "client!rl", name = "zd", descriptor = "I")
	public int anInt8150 = -1;

	@OriginalMember(owner = "client!rl", name = "yd", descriptor = "I")
	public int anInt8149 = 0;

	@OriginalMember(owner = "client!rl", name = "Gd", descriptor = "Z")
	public boolean aBoolean593 = false;

	@OriginalMember(owner = "client!rl", name = "Qd", descriptor = "I")
	public int anInt8163 = 0;

	@OriginalMember(owner = "client!rl", name = "sd", descriptor = "I")
	public int anInt8144 = 0;

	@OriginalMember(owner = "client!rl", name = "Md", descriptor = "B")
	private byte aByte118 = 0;

	@OriginalMember(owner = "client!rl", name = "od", descriptor = "B")
	private byte aByte117 = 0;

	@OriginalMember(owner = "client!rl", name = "wd", descriptor = "Z")
	public boolean aBoolean592 = false;

	@OriginalMember(owner = "client!rl", name = "rd", descriptor = "I")
	public int anInt8143 = -1;

	@OriginalMember(owner = "client!rl", name = "Kd", descriptor = "I")
	public int anInt8158 = -1;

	@OriginalMember(owner = "client!rl", name = "ld", descriptor = "B")
	private byte aByte116 = 0;

	@OriginalMember(owner = "client!rl", name = "Rd", descriptor = "I")
	public int anInt8164 = -1;

	@OriginalMember(owner = "client!rl", name = "Sd", descriptor = "I")
	public int anInt8165 = 0;

	@OriginalMember(owner = "client!rl", name = "gd", descriptor = "Z")
	public boolean aBoolean591 = false;

	@OriginalMember(owner = "client!rl", name = "Yd", descriptor = "Z")
	public boolean aBoolean595 = false;

	@OriginalMember(owner = "client!rl", name = "Pd", descriptor = "I")
	public int anInt8162 = -1;

	@OriginalMember(owner = "client!rl", name = "Xd", descriptor = "I")
	public int anInt8170 = -1;

	@OriginalMember(owner = "client!rl", name = "be", descriptor = "I")
	public int anInt8173 = -1;

	@OriginalMember(owner = "client!rl", name = "Jd", descriptor = "Z")
	public boolean aBoolean594 = false;

	@OriginalMember(owner = "client!rl", name = "ce", descriptor = "I")
	public int anInt8174 = -1;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLclient!ha;I)Z")
	private boolean method7013(@OriginalArg(1) Class13 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class291 local11 = this.method7007();
		@Pc(26) Class228 local26 = super.anInt8049 != -1 && super.lb == 0 ? Static479.aClass308_2.method7075(super.anInt8049) : null;
		@Pc(46) Class228 local46 = super.anInt8095 == -1 || this.aBoolean593 || super.aBoolean588 && local26 != null ? null : Static479.aClass308_2.method7075(super.anInt8095);
		@Pc(49) int local49 = local11.anInt7628;
		@Pc(52) int local52 = local11.anInt7630;
		if (local49 != 0 || local52 != 0 || local11.anInt7631 != 0 || local11.anInt7627 != 0) {
			arg1 |= 0x7;
		}
		@Pc(85) int local85 = super.aClass111_7.method2696();
		@Pc(104) boolean local104 = super.aByte115 != 0 && Static389.anInt6694 >= super.anInt8097 && Static389.anInt6694 < super.anInt8101;
		if (local104) {
			arg1 |= 0x80000;
		}
		@Pc(148) Class193 local148 = super.aClass193Array3[0] = this.aClass284_1.method6518(Static629.aClass177_2, arg1, super.anInt8096, super.anInt8121, local26, super.anInt8083, super.aClass148Array3, Static137.aClass366_1, super.anInt8059, Static6.aClass146_1, local46, super.anInt8128, Static479.aClass308_2, super.anIntArray592, local85, Static470.aClass250_1, Static382.aClass282_1, arg0, super.anInt8087);
		@Pc(151) int local151 = Static265.method4369();
		if (Static79.anInt2093 < 96 && local151 > 50) {
			Static287.method8820();
		}
		if (Static242.aClass373_4 != Static392.aClass373_6 && local151 < 50) {
			@Pc(171) int local171 = 50 - local151;
			while (local171 > Static342.anInt6000) {
				Static462.aByteArrayArray19[Static342.anInt6000] = new byte[102400];
				Static342.anInt6000++;
			}
			while (Static342.anInt6000 > local171) {
				Static342.anInt6000--;
				Static462.aByteArrayArray19[Static342.anInt6000] = null;
			}
		} else if (Static242.aClass373_4 != Static392.aClass373_6) {
			Static342.anInt6000 = 0;
			Static462.aByteArrayArray19 = new byte[50][];
		}
		if (local148 == null) {
			return false;
		}
		super.anInt8123 = local148.fa();
		super.anInt8098 = local148.ma();
		this.method7002(local148);
		if (local49 == 0 && local52 == 0) {
			this.method7004(0, local85, this.method6999() << 9, 0, this.method6999() << 9);
		} else {
			this.method7004(local11.anInt7621, local85, local49, local11.anInt7618, local52);
			if (super.anInt8089 != 0) {
				local148.FA(super.anInt8089);
			}
			if (super.anInt8122 != 0) {
				local148.VA(super.anInt8122);
			}
			if (super.anInt8085 != 0) {
				local148.H(0, super.anInt8085, 0);
			}
		}
		if (local104) {
			local148.method6616(super.aByte112, super.aByte114, super.aByte111, super.aByte115 & 0xFF);
		}
		@Pc(349) boolean local349;
		@Pc(351) int local351;
		@Pc(404) Class193 local404;
		@Pc(423) int local423;
		@Pc(425) int local425;
		@Pc(427) int local427;
		@Pc(514) int local514;
		@Pc(542) int local542;
		@Pc(554) int local554;
		@Pc(558) int local558;
		@Pc(569) int local569;
		@Pc(331) Class354 local331;
		if (this.aBoolean593 || super.anInt8053 == -1 || super.anInt8099 == -1) {
			super.aClass193Array3[1] = null;
		} else {
			local331 = Static546.aClass263_1.method6113(super.anInt8053);
			local349 = local331.aByte130 == 3 && (local49 != 0 || local52 != 0);
			local351 = local7;
			if (local349) {
				local351 = local7 | 0x7;
			} else {
				if (super.anInt8052 != 0) {
					local351 = local7 | 0x5;
				}
				if (super.anInt8055 != 0) {
					local351 |= 0x2;
				}
				if (super.anInt8063 >= 0) {
					local351 |= 0x7;
				}
			}
			local404 = super.aClass193Array3[1] = local331.method8348(super.anInt8099, local351, super.anInt8132, arg0, Static479.aClass308_2, super.anInt8066);
			if (local404 != null) {
				if (super.anInt8063 >= 0 && local11.anIntArrayArray93 != null && local11.anIntArrayArray93[super.anInt8063] != null) {
					local423 = 0;
					local425 = 0;
					local427 = 0;
					if (local11.anIntArrayArray93 != null && local11.anIntArrayArray93[super.anInt8063] != null) {
						local427 = local11.anIntArrayArray93[super.anInt8063][2];
						local425 = local11.anIntArrayArray93[super.anInt8063][1];
						local423 = local11.anIntArrayArray93[super.anInt8063][0];
					}
					if (local11.anIntArrayArray92 != null && local11.anIntArrayArray92[super.anInt8063] != null) {
						local423 += local11.anIntArrayArray92[super.anInt8063][0];
						local425 += local11.anIntArrayArray92[super.anInt8063][1];
						local427 += local11.anIntArrayArray92[super.anInt8063][2];
					}
					if (local427 != 0 || local423 != 0) {
						local514 = local85;
						if (super.anIntArray592 != null && super.anIntArray592[super.anInt8063] != -1) {
							local514 = super.anIntArray592[super.anInt8063];
						}
						local542 = super.anInt8052 * 2048 + local514 - local85 & 0x3FFF;
						if (local542 != 0) {
							local404.a(local542);
						}
						local554 = Class290.anIntArray546[local542];
						local558 = Class290.anIntArray547[local542];
						local569 = local554 * local427 + local558 * local423 >> 14;
						local427 = local558 * local427 - local554 * local423 >> 14;
						local423 = local569;
					}
					local404.H(local423, local425, local427);
				} else if (super.anInt8052 != 0) {
					local404.a(super.anInt8052 * 2048);
				}
				if (super.anInt8055 != 0) {
					local404.H(0, -super.anInt8055 << 2, 0);
				}
				if (local349) {
					if (super.anInt8089 != 0) {
						local404.FA(super.anInt8089);
					}
					if (super.anInt8122 != 0) {
						local404.VA(super.anInt8122);
					}
					if (super.anInt8085 != 0) {
						local404.H(0, super.anInt8085, 0);
					}
				}
			}
		}
		if (this.aBoolean593 || super.anInt8084 == -1 || super.anInt8058 == -1) {
			super.aClass193Array3[2] = null;
		} else {
			local331 = Static546.aClass263_1.method6113(super.anInt8084);
			local349 = local331.aByte130 == 3 && (local49 != 0 || local52 != 0);
			local351 = local7;
			if (local349) {
				local351 = local7 | 0x7;
			} else {
				if (super.anInt8061 != 0) {
					local351 = local7 | 0x5;
				}
				if (super.anInt8093 != 0) {
					local351 |= 0x2;
				}
				if (super.anInt8070 >= 0) {
					local351 |= 0x7;
				}
			}
			local404 = super.aClass193Array3[2] = local331.method8347(super.anInt8079, super.anInt8058, Static479.aClass308_2, super.anInt8129, local351, arg0);
			if (local404 != null) {
				if (super.anInt8070 >= 0 && local11.anIntArrayArray93 != null && local11.anIntArrayArray93[super.anInt8070] != null) {
					local423 = 0;
					local425 = 0;
					local427 = 0;
					if (local11.anIntArrayArray93 != null && local11.anIntArrayArray93[super.anInt8070] != null) {
						local427 = local11.anIntArrayArray93[super.anInt8070][2];
						local423 = local11.anIntArrayArray93[super.anInt8070][0];
						local425 = local11.anIntArrayArray93[super.anInt8070][1];
					}
					if (local11.anIntArrayArray92 != null && local11.anIntArrayArray92[super.anInt8070] != null) {
						local423 += local11.anIntArrayArray92[super.anInt8070][0];
						local425 += local11.anIntArrayArray92[super.anInt8070][1];
						local427 += local11.anIntArrayArray92[super.anInt8070][2];
					}
					if (local427 != 0 || local423 != 0) {
						local514 = local85;
						if (super.anIntArray592 != null && super.anIntArray592[super.anInt8070] != -1) {
							local514 = super.anIntArray592[super.anInt8070];
						}
						local542 = super.anInt8061 * 2048 + local514 - local85 & 0x3FFF;
						if (local542 != 0) {
							local404.a(local542);
						}
						local554 = Class290.anIntArray546[local542];
						local558 = Class290.anIntArray547[local542];
						local569 = local558 * local423 + local554 * local427 >> 14;
						local427 = local427 * local558 - local423 * local554 >> 14;
						local423 = local569;
					}
					local404.H(local423, local425, local427);
				} else if (super.anInt8061 != 0) {
					local404.a(super.anInt8061 * 2048);
				}
				if (super.anInt8093 != 0) {
					local404.H(0, -super.anInt8093 << 2, 0);
				}
				if (local349) {
					if (super.anInt8089 != 0) {
						local404.FA(super.anInt8089);
					}
					if (super.anInt8122 != 0) {
						local404.VA(super.anInt8122);
					}
					if (super.anInt8085 != 0) {
						local404.H(0, super.anInt8085, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BIII)V")
	public void method7014(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt8133 < 9) {
			super.anInt8133++;
		}
		for (@Pc(16) int local16 = super.anInt8133; local16 > 0; local16--) {
			super.anIntArray595[local16] = super.anIntArray595[local16 - 1];
			super.anIntArray594[local16] = super.anIntArray594[local16 - 1];
			super.aByteArray85[local16] = super.aByteArray85[local16 - 1];
		}
		super.anIntArray595[0] = arg2;
		super.anIntArray594[0] = arg1;
		super.aByteArray85[0] = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILclient!rba;Lclient!ha;ZII)V")
	@Override
	public void method6984(@OriginalArg(1) int arg0, @OriginalArg(2) Class16_Sub1 arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method7015() {
		@Pc(10) String local10 = "";
		if (Static328.aStringArray35 != null) {
			local10 = local10 + Static328.aStringArray35[this.aByte118];
		}
		@Pc(34) int[] local34;
		if (this.aByte117 == 1 && Static123.anIntArray179 != null) {
			local34 = Static123.anIntArray179;
		} else {
			local34 = Static187.anIntArray242;
		}
		if (local34 != null && local34[this.aByte118] != -1) {
			@Pc(53) Class295 local53 = Static132.aClass184_1.method4465(local34[this.aByte118]);
			if (local53.aChar3 == 's') {
				local10 = local10 + local53.method6817(this.aByte116 & 0xFF);
			} else {
				Static25.method7457(new Throwable(), "gdn1");
				local34[this.aByte118] = -1;
			}
		}
		local10 = local10 + this.aString83;
		if (Static210.aStringArray51 != null) {
			local10 = local10 + Static210.aStringArray51[this.aByte118];
		}
		return local10;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)I")
	@Override
	protected int method7009() {
		return this.anInt8159;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ha;Lclient!ka;IIIIILclient!pda;)V")
	private void method7016(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class51 arg6) {
		@Pc(17) int local17 = arg3 * arg3 + arg5 * arg5;
		if (local17 < 262144 || local17 > arg2) {
			return;
		}
		@Pc(35) int local35 = (int) (Math.atan2((double) arg5, (double) arg3) * 2607.5945876176133D) & 0x3FFF;
		@Pc(47) Class193 local47 = Static1.method7184(arg0, super.anInt8085, super.anInt8089, local35, arg4, super.anInt8122);
		if (local47 != null) {
			arg0.C(false);
			local47.method6612(arg6, (Class16_Sub10) null, 0);
			arg0.C(true);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)V")
	public void method7017(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt8133 = 0;
		super.anInt8136 = 0;
		super.anIntArray595[0] = arg0;
		super.anInt8135 = 0;
		super.anIntArray594[0] = arg1;
		@Pc(35) int local35 = this.method6999();
		super.anInt8037 = local35 * 256 + super.anIntArray595[0] * 512;
		super.anInt8034 = local35 * 256 + super.anIntArray594[0] * 512;
		if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1 == this) {
			Static350.method5258();
		}
		if (super.aClass16_Sub7_8 != null) {
			super.aClass16_Sub7_8.method5989();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method7018() {
		return this.aString82;
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(B)V")
	@Override
	public void method6987() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method6976() {
		return false;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIBB)V")
	public void method7019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt8049 != -1 && Static479.aClass308_2.method7075(super.anInt8049).anInt6221 == 1) {
			super.anIntArray586 = null;
			super.anInt8049 = -1;
		}
		@Pc(41) Class354 local41;
		if (super.anInt8053 != -1) {
			local41 = Static546.aClass263_1.method6113(super.anInt8053);
			if (local41.aBoolean712 && local41.anInt9829 != -1 && Static479.aClass308_2.method7075(local41.anInt9829).anInt6221 == 1) {
				super.anInt8053 = -1;
			}
		}
		if (super.anInt8084 != -1) {
			local41 = Static546.aClass263_1.method6113(super.anInt8084);
			if (local41.aBoolean712 && local41.anInt9829 != -1 && Static479.aClass308_2.method7075(local41.anInt9829).anInt6221 == 1) {
				super.anInt8084 = -1;
			}
		}
		this.anInt8170 = -1;
		if (arg0 < 0 || arg0 >= Static456.anInt7428 || arg1 < 0 || arg1 >= Static5.anInt112) {
			this.method7017(arg0, arg1);
		} else if (super.anIntArray595[0] >= 0 && super.anIntArray595[0] < Static456.anInt7428 && super.anIntArray594[0] >= 0 && super.anIntArray594[0] < Static5.anInt112) {
			if (arg2 == 2) {
				Static292.method4625(arg0, arg1, this);
			}
			this.method7014(arg2, arg1, arg0);
		} else {
			this.method7017(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6978(@OriginalArg(0) Class13 arg0) {
		if (this.aClass284_1 == null || !super.aBoolean589 && !this.method7013(arg0, 0)) {
			return;
		}
		@Pc(20) Class51 local20 = arg0.method8154();
		local20.method6710(super.aClass111_7.method2696());
		local20.method6711(super.anInt8037, super.anInt8036 - 5, super.anInt8034);
		this.method7006(arg0, super.aClass193Array3, super.aBoolean589, local20);
		super.aClass193Array3[0] = super.aClass193Array3[1] = super.aClass193Array3[2] = null;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)I")
	@Override
	public int method6999() {
		return this.aClass284_1 == null || this.aClass284_1.anInt7473 == -1 ? super.method6999() : Static137.aClass366_1.method8551(this.aClass284_1.anInt7473).anInt3238;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILclient!ka;IILclient!ha;ILclient!pda;I)V")
	private void method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class193 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class13 arg5, @OriginalArg(7) Class51 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg1 * arg1 + arg3 * arg3;
		if (local11 < 262144 || arg4 < local11) {
			return;
		}
		@Pc(29) int local29 = (int) (Math.atan2((double) arg3, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
		@Pc(45) Class193 local45 = Static1.method7184(arg5, super.anInt8085, super.anInt8089, local29, arg7, super.anInt8122);
		if (local45 != null) {
			arg5.C(false);
			local45.method6622(arg6, (Class16_Sub10) null, arg0, 0);
			arg5.C(true);
		}
	}

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "(B)Z")
	public boolean method7021() {
		return this.aClass284_1 != null;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(Lclient!ha;I)Lclient!jk;")
	@Override
	public Class16_Sub5 method6991(@OriginalArg(0) Class13 arg0) {
		if (this.aClass284_1 == null || !this.method7013(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class51 local19 = arg0.method8154();
		@Pc(24) int local24 = super.aClass111_7.method2696();
		local19.method6710(local24);
		@Pc(42) Class84 local42 = Static348.aClass84ArrayArrayArray5[super.aByte109][super.anInt8037 >> Static326.anInt5713][super.anInt8034 >> Static326.anInt5713];
		if (local42 == null || local42.aClass16_Sub1_Sub3_1 == null) {
			super.anInt8077 = (int) ((float) super.anInt8077 - (float) super.anInt8077 / 10.0F);
		} else {
			@Pc(69) int local69 = super.anInt8077 - local42.aClass16_Sub1_Sub3_1.aShort72;
			super.anInt8077 = (int) ((float) super.anInt8077 - (float) local69 / 10.0F);
		}
		local19.method6711(super.anInt8037, super.anInt8036 - super.anInt8077 - 20, super.anInt8034);
		@Pc(95) Class16_Sub5 local95 = null;
		super.aBoolean590 = false;
		if (Static305.aClass2_Sub49_15.aClass33_Sub3_1.method1655() == 1) {
			@Pc(110) Class291 local110 = this.method7007();
			if (local110.aBoolean548 && (this.aClass284_1.anInt7473 == -1 || Static137.aClass366_1.method8551(this.aClass284_1.anInt7473).aBoolean252)) {
				@Pc(144) Class228 local144 = super.anInt8049 != -1 && super.lb == 0 ? Static479.aClass308_2.method7075(super.anInt8049) : null;
				@Pc(165) Class228 local165 = super.anInt8095 == -1 || this.aBoolean593 || super.aBoolean588 && local144 != null ? null : Static479.aClass308_2.method7075(super.anInt8095);
				@Pc(197) Class193 local197 = Static144.method2589(super.aClass193Array3[0], local24, 0, super.anInt8089, 240, local165 == null ? local144 : local165, local165 == null ? super.anInt8083 : super.anInt8059, super.anInt8122, arg0, 1, 160, 0, super.anInt8085);
				if (local197 != null) {
					local95 = Static134.method8011(true, super.aClass193Array3.length + 1);
					super.aBoolean590 = true;
					arg0.C(false);
					if (Static582.aBoolean678) {
						local197.method6622(local19, local95.aClass16_Sub10Array1[super.aClass193Array3.length], Static529.anInt8509, 0);
					} else {
						local197.method6612(local19, local95.aClass16_Sub10Array1[super.aClass193Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1 == this) {
			local19.method6705(super.anInt8037, super.anInt8036, super.anInt8034);
			for (@Pc(258) int local258 = Static448.aClass110Array1.length - 1; local258 >= 0; local258--) {
				@Pc(264) Class110 local264 = Static448.aClass110Array1[local258];
				if (local264 != null && local264.anInt3140 != -1) {
					@Pc(294) int local294;
					if (local264.anInt3142 == 1) {
						@Pc(282) Class2_Sub32 local282 = (Class2_Sub32) Static514.aClass323_32.method7484((long) local264.anInt3136);
						if (local282 != null) {
							@Pc(287) Class16_Sub1_Sub1_Sub3_Sub1 local287 = local282.aClass16_Sub1_Sub1_Sub3_Sub1_2;
							local294 = local287.anInt8037 - Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037;
							@Pc(301) int local301 = local287.anInt8034 - Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034;
							if (Static582.aBoolean678) {
								this.method7020(Static529.anInt8509, local301, super.aClass193Array3[0], local294, 92160000, arg0, local19, local264.anInt3140);
							} else {
								this.method7016(arg0, super.aClass193Array3[0], 92160000, local301, local264.anInt3140, local294, local19);
							}
						}
					}
					@Pc(355) int local355;
					if (local264.anInt3142 == 2) {
						@Pc(346) int local346 = local264.anInt3139 + 256 - Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037;
						local355 = local264.anInt3143 + 256 - Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034;
						local294 = local264.anInt3145 << 9;
						local294 *= local294;
						if (Static582.aBoolean678) {
							this.method7020(Static529.anInt8509, local355, super.aClass193Array3[0], local346, local294, arg0, local19, local264.anInt3140);
						} else {
							this.method7016(arg0, super.aClass193Array3[0], local294, local355, local264.anInt3140, local346, local19);
						}
					}
					if (local264.anInt3142 == 10 && local264.anInt3136 >= 0 && local264.anInt3136 < Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1.length) {
						@Pc(414) Class16_Sub1_Sub1_Sub3_Sub2 local414 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local264.anInt3136];
						if (local414 != null) {
							local355 = local414.anInt8037 - Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037;
							local294 = local414.anInt8034 - Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034;
							if (Static582.aBoolean678) {
								this.method7020(Static529.anInt8509, local294, super.aClass193Array3[0], local355, 92160000, arg0, local19, local264.anInt3140);
							} else {
								this.method7016(arg0, super.aClass193Array3[0], 92160000, local294, local264.anInt3140, local355, local19);
							}
						}
					}
				}
			}
			local19.method6710(local24);
			local19.method6711(super.anInt8037, super.anInt8036, super.anInt8034);
		}
		local19.method6710(local24);
		local19.method6711(super.anInt8037, super.anInt8036 - super.anInt8077 - 5, super.anInt8034);
		if (local95 == null) {
			local95 = Static134.method8011(true, super.aClass193Array3.length);
		}
		this.method7006(arg0, super.aClass193Array3, false, local19);
		@Pc(520) int local520;
		if (Static582.aBoolean678) {
			for (local520 = 0; local520 < super.aClass193Array3.length; local520++) {
				if (super.aClass193Array3[local520] != null) {
					super.aClass193Array3[local520].method6622(local19, local95.aClass16_Sub10Array1[local520], Static529.anInt8509, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1 == this ? 1 : 0);
				}
			}
		} else {
			for (local520 = 0; local520 < super.aClass193Array3.length; local520++) {
				if (super.aClass193Array3[local520] != null) {
					super.aClass193Array3[local520].method6612(local19, local95.aClass16_Sub10Array1[local520], Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass16_Sub7_8 != null) {
			@Pc(598) Class119 local598 = super.aClass16_Sub7_8.method5982();
			if (Static582.aBoolean678) {
				arg0.method8165(local598, Static529.anInt8509);
			} else {
				arg0.method8101(local598);
			}
		}
		for (local520 = 0; super.aClass193Array3.length > local520; local520++) {
			if (super.aClass193Array3[local520] != null) {
				super.aBoolean590 |= super.aClass193Array3[local520].F();
			}
		}
		super.aClass193Array3[0] = super.aClass193Array3[1] = super.aClass193Array3[2] = null;
		super.anInt8109 = Static364.anInt6282;
		return local95;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)I")
	@Override
	public int method6997() {
		return -1;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!sl;Z)V")
	public void method7023(@OriginalArg(0) Class2_Sub17 arg0) {
		arg0.anInt3378 = 0;
		@Pc(10) int local10 = arg0.method2859();
		this.aByte117 = (byte) (local10 & 0x1);
		@Pc(19) boolean local19 = this.aBoolean594;
		this.aBoolean594 = (local10 & 0x2) != 0;
		@Pc(39) boolean local39 = (local10 & 0x4) != 0;
		@Pc(43) int local43 = super.method6999();
		this.method7005((local10 >> 3 & 0x7) + 1);
		this.aByte118 = (byte) (local10 >> 6 & 0x3);
		super.anInt8037 += this.method6999() - local43 << 8;
		super.anInt8034 += this.method6999() - local43 << 8;
		this.aByte116 = arg0.method2860();
		this.anInt8174 = arg0.method2860();
		this.anInt8173 = arg0.method2860();
		this.aBoolean595 = arg0.method2860() == 1;
		if (Static242.aClass373_4 == Static392.aClass373_6 && Static463.anInt7496 >= 2) {
			this.aBoolean595 = false;
		}
		this.anInt8163 = 0;
		@Pc(128) int local128 = -1;
		@Pc(131) int[] local131 = new int[12];
		@Pc(152) int local152;
		@Pc(158) int local158;
		@Pc(201) int local201;
		for (@Pc(133) int local133 = 0; local133 < 12; local133++) {
			@Pc(138) int local138 = arg0.method2859();
			if (local138 == 0) {
				local131[local133] = 0;
			} else {
				local152 = arg0.method2859();
				local158 = local152 + (local138 << 8);
				if (local133 == 0 && local158 == 65535) {
					local128 = arg0.method2825();
					this.anInt8163 = arg0.method2859();
					break;
				}
				if (local158 >= 32768) {
					local158 = Static260.anIntArray297[local158 - 32768];
					local131[local133] = local158 | 0x40000000;
					local201 = Static470.aClass250_1.method5960(local158).anInt8753;
					if (local201 != 0) {
						this.anInt8163 = local201;
					}
				} else {
					local131[local133] = Integer.MIN_VALUE | local158 - 256;
				}
			}
		}
		@Pc(225) int[] local225 = new int[5];
		for (local152 = 0; local152 < 5; local152++) {
			local158 = arg0.method2859();
			if (Static260.aShortArrayArrayArray1.length < 1 || local158 < 0 || local158 >= Static260.aShortArrayArrayArray1[0][local152].length) {
				local158 = 0;
			}
			local225[local152] = local158;
		}
		this.anInt8159 = arg0.method2825();
		this.aString83 = arg0.method2833();
		if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1 == this) {
			Static191.aString34 = this.aString83;
		}
		this.aString82 = this.aString83;
		this.anInt8144 = arg0.method2859();
		if (local39) {
			this.anInt8149 = arg0.method2825();
			this.anInt8165 = this.anInt8144;
			if (this.anInt8149 == 65535) {
				this.anInt8149 = -1;
			}
			this.anInt8150 = -1;
		} else {
			this.anInt8149 = 0;
			this.anInt8165 = arg0.method2859();
			this.anInt8150 = arg0.method2859();
			if (this.anInt8150 == 255) {
				this.anInt8150 = -1;
			}
		}
		local158 = this.anInt8153;
		this.anInt8153 = arg0.method2859();
		@Pc(354) int local354;
		if (this.anInt8153 == 0) {
			Static406.method6021(this);
		} else {
			local201 = this.anInt8164;
			@Pc(351) int local351 = this.anInt8162;
			local354 = this.anInt8158;
			@Pc(357) int local357 = this.anInt8143;
			@Pc(360) int local360 = this.anInt8141;
			this.anInt8164 = arg0.method2825();
			this.anInt8162 = arg0.method2825();
			this.anInt8158 = arg0.method2825();
			this.anInt8143 = arg0.method2825();
			this.anInt8141 = arg0.method2859();
			if (this.aBoolean594 != local19 || this.anInt8153 != local158 || this.anInt8164 != local201 || local351 != this.anInt8162 || this.anInt8158 != local354 || local357 != this.anInt8143 || this.anInt8141 != local360) {
				Static567.method7967(this);
			}
		}
		if (this.aClass284_1 == null) {
			this.aClass284_1 = new Class284();
		}
		local201 = this.aClass284_1.anInt7473;
		@Pc(452) int[] local452 = this.aClass284_1.anIntArray514;
		this.aClass284_1.method6512(this.aByte117 == 1, local225, local131, this.method7009(), local128);
		if (local201 != local128) {
			super.anInt8037 = (super.anIntArray595[0] << 9) + (this.method6999() << 8);
			super.anInt8034 = (super.anIntArray594[0] << 9) + (this.method6999() << 8);
		}
		if (Static608.anInt10056 == super.anInt8075 && local452 != null) {
			for (local354 = 0; local354 < local225.length; local354++) {
				if (local225[local354] != local452[local354]) {
					Static470.aClass250_1.method5959();
					break;
				}
			}
		}
		if (super.aClass16_Sub7_8 != null) {
			super.aClass16_Sub7_8.method5989();
		}
		if (super.anInt8095 == -1 || !super.aBoolean588) {
			return;
		}
		@Pc(558) Class291 local558 = this.method7007();
		if (!local558.method6685(super.anInt8095)) {
			super.aBoolean588 = false;
			super.anInt8095 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(ILclient!ha;)Lclient!wg;")
	@Override
	public Class379 method6983(@OriginalArg(1) Class13 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method6985(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass284_1 == null || !this.method7013(arg1, 131072)) {
			return false;
		}
		@Pc(19) Class51 local19 = arg1.method8154();
		@Pc(24) int local24 = super.aClass111_7.method2696();
		local19.method6710(local24);
		local19.method6711(super.anInt8037, super.anInt8036, super.anInt8034);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass193Array3.length > local39; local39++) {
			if (super.aClass193Array3[local39] != null && (Static582.aBoolean678 ? super.aClass193Array3[local39].method6617(arg0, arg2, local19, true, 0, Static529.anInt8509) : super.aClass193Array3[local39].method6623(arg0, arg2, local19, true, 0))) {
				local37 = true;
				break;
			}
		}
		super.aClass193Array3[0] = super.aClass193Array3[1] = super.aClass193Array3[2] = null;
		return local37;
	}
}

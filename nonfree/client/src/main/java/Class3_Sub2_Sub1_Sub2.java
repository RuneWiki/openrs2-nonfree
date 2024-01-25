import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class3_Sub2_Sub1_Sub2 extends Class3_Sub2_Sub1 {

	@OriginalMember(owner = "client!so", name = "Vc", descriptor = "Ljava/lang/String;")
	public String aString53;

	@OriginalMember(owner = "client!so", name = "id", descriptor = "I")
	public int anInt6640;

	@OriginalMember(owner = "client!so", name = "nd", descriptor = "Ljava/lang/String;")
	public String aString54;

	@OriginalMember(owner = "client!so", name = "qd", descriptor = "I")
	public int anInt6645;

	@OriginalMember(owner = "client!so", name = "rd", descriptor = "I")
	private int anInt6646;

	@OriginalMember(owner = "client!so", name = "ud", descriptor = "Lclient!wb;")
	public Class259 aClass259_1;

	@OriginalMember(owner = "client!so", name = "Ec", descriptor = "Z")
	public boolean aBoolean422 = false;

	@OriginalMember(owner = "client!so", name = "Hc", descriptor = "I")
	public int anInt6617 = -1;

	@OriginalMember(owner = "client!so", name = "Jc", descriptor = "B")
	private byte aByte93 = 0;

	@OriginalMember(owner = "client!so", name = "Ic", descriptor = "I")
	public int anInt6618 = -1;

	@OriginalMember(owner = "client!so", name = "Oc", descriptor = "I")
	public int anInt6623 = -1;

	@OriginalMember(owner = "client!so", name = "Mc", descriptor = "I")
	public int anInt6621 = -1;

	@OriginalMember(owner = "client!so", name = "Dc", descriptor = "I")
	public int anInt6615 = -1;

	@OriginalMember(owner = "client!so", name = "Xc", descriptor = "I")
	public int anInt6631 = 0;

	@OriginalMember(owner = "client!so", name = "gd", descriptor = "I")
	public int anInt6639 = 0;

	@OriginalMember(owner = "client!so", name = "Rc", descriptor = "I")
	public int anInt6626 = -1;

	@OriginalMember(owner = "client!so", name = "fd", descriptor = "I")
	public int anInt6638 = 0;

	@OriginalMember(owner = "client!so", name = "bd", descriptor = "B")
	private byte aByte94 = 0;

	@OriginalMember(owner = "client!so", name = "kd", descriptor = "I")
	public int anInt6642 = 0;

	@OriginalMember(owner = "client!so", name = "ld", descriptor = "Z")
	public boolean aBoolean423 = false;

	@OriginalMember(owner = "client!so", name = "Kc", descriptor = "I")
	public int anInt6619 = -1;

	@OriginalMember(owner = "client!so", name = "od", descriptor = "Z")
	public boolean aBoolean424 = false;

	@OriginalMember(owner = "client!so", name = "ed", descriptor = "I")
	public int anInt6637 = -1;

	@OriginalMember(owner = "client!so", name = "pd", descriptor = "I")
	public int anInt6644 = 0;

	@OriginalMember(owner = "client!so", name = "sd", descriptor = "I")
	public int anInt6647 = 255;

	@OriginalMember(owner = "client!so", name = "hd", descriptor = "B")
	private byte aByte95 = 0;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIB)V")
	public void method5530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt6613 < 9) {
			super.anInt6613++;
		}
		for (@Pc(28) int local28 = super.anInt6613; local28 > 0; local28--) {
			super.anIntArray458[local28] = super.anIntArray458[local28 - 1];
			super.anIntArray459[local28] = super.anIntArray459[local28 - 1];
			super.aByteArray85[local28] = super.aByteArray85[local28 - 1];
		}
		super.anIntArray458[0] = arg0;
		super.aByteArray85[0] = arg2;
		super.anIntArray459[0] = arg1;
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(B)I")
	@Override
	public int method5947() {
		return super.anInt6607;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILclient!eq;BI)Z")
	@Override
	public boolean method5939(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass259_1 == null || !this.method5533(arg1, 131072)) {
			return true;
		}
		@Pc(27) Class5 local27 = arg1.method5064();
		@Pc(32) int local32 = super.aClass214_7.method4965();
		local27.method3844(local32);
		local27.method3843(super.anInt7202, super.anInt7208, super.anInt7207);
		for (@Pc(45) int local45 = 0; super.aClass224Array3.length > local45; local45++) {
			if (super.aClass224Array3[local45] != null && super.aClass224Array3[local45].method5836(arg0, arg2, local27, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!ae;B)V")
	public void method5531(@OriginalArg(0) Class6_Sub1 arg0) {
		arg0.anInt7898 = 0;
		@Pc(12) int local12 = arg0.method6433();
		this.aByte95 = (byte) (local12 & 0x1);
		@Pc(29) boolean local29 = (local12 & 0x2) != 0;
		@Pc(40) boolean local40 = (local12 & 0x4) != 0;
		@Pc(44) int local44 = super.method5521();
		this.method5515((local12 >> 3 & 0x7) + 1);
		this.aByte94 = (byte) (local12 >> 6 & 0x3);
		super.anInt7202 += this.method5521() - local44 << 6;
		super.anInt7207 += this.method5521() - local44 << 6;
		this.aByte93 = arg0.method6438();
		this.anInt6617 = arg0.method6438();
		this.anInt6623 = arg0.method6438();
		@Pc(103) int local103 = -1;
		this.anInt6644 = 0;
		@Pc(109) int[] local109 = new int[12];
		@Pc(135) int local135;
		@Pc(141) int local141;
		@Pc(180) int local180;
		for (@Pc(117) int local117 = 0; local117 < 12; local117++) {
			@Pc(123) int local123 = arg0.method6433();
			if (local123 == 0) {
				local109[local117] = 0;
			} else {
				local135 = arg0.method6433();
				local141 = local135 + (local123 << 8);
				if (local117 == 0 && local141 == 65535) {
					local103 = arg0.method6485();
					this.anInt6644 = arg0.method6433();
					break;
				}
				if (local141 >= 32768) {
					local141 = Static46.anIntArray78[local141 - 32768];
					local109[local117] = local141 | 0x40000000;
					local180 = Static380.aClass231_2.method5648(local141).anInt96;
					if (local180 != 0) {
						this.anInt6644 = local180;
					}
				} else {
					local109[local117] = local141 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(202) int[] local202 = new int[5];
		for (local135 = 0; local135 < 5; local135++) {
			local141 = arg0.method6433();
			if (local141 < 0 || Static368.aShortArrayArray9[local135].length <= local141) {
				local141 = 0;
			}
			local202[local135] = local141;
		}
		this.anInt6646 = arg0.method6485();
		this.aString53 = arg0.method6473();
		if (local29) {
			this.aString54 = arg0.method6473();
		} else {
			this.aString54 = this.aString53;
		}
		this.anInt6631 = arg0.method6433();
		if (local40) {
			this.anInt6638 = arg0.method6485();
			this.anInt6642 = this.anInt6631;
			this.anInt6618 = -1;
		} else {
			this.anInt6638 = 0;
			this.anInt6642 = arg0.method6433();
			this.anInt6618 = arg0.method6433();
			if (this.anInt6618 == 255) {
				this.anInt6618 = -1;
			}
		}
		local141 = this.anInt6639;
		this.anInt6639 = arg0.method6433();
		@Pc(326) int local326;
		if (this.anInt6639 == 0) {
			Static69.method1415(this);
		} else {
			local180 = this.anInt6621;
			@Pc(323) int local323 = this.anInt6615;
			local326 = this.anInt6619;
			@Pc(329) int local329 = this.anInt6637;
			@Pc(332) int local332 = this.anInt6647;
			this.anInt6621 = arg0.method6485();
			this.anInt6615 = arg0.method6485();
			this.anInt6619 = arg0.method6485();
			this.anInt6637 = arg0.method6485();
			this.anInt6647 = arg0.method6433();
			if (this.anInt6639 != local141 || local180 != this.anInt6621 || this.anInt6615 != local323 || this.anInt6619 != local326 || local329 != this.anInt6637 || local332 != this.anInt6647) {
				Static129.method2312(this);
			}
		}
		if (this.aClass259_1 == null) {
			this.aClass259_1 = new Class259();
		}
		local180 = this.aClass259_1.anInt7708;
		@Pc(425) int[] local425 = this.aClass259_1.anIntArray530;
		this.aClass259_1.method6311(local202, local103, this.aByte95 == 1, local109, this.method5519());
		if (local103 != local180) {
			super.anInt7202 = (super.anIntArray458[0] << 7) + (this.method5521() << 6);
			super.anInt7207 = (super.anIntArray459[0] << 7) + (this.method5521() << 6);
		}
		if (Static4.anInt7923 == super.anInt6602 && local425 != null) {
			for (local326 = 0; local326 < local202.length; local326++) {
				if (local202[local326] != local425[local326]) {
					Static380.aClass231_2.method5644();
					break;
				}
			}
		}
		if (super.aClass57_Sub4_6 != null) {
			super.aClass57_Sub4_6.method3249();
		}
		if (super.anInt6597 == -1 || !super.aBoolean418) {
			return;
		}
		@Pc(531) Class246 local531 = this.method5513();
		if (!local531.method6014(super.anInt6597)) {
			super.anInt6597 = -1;
			super.aBoolean418 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(Lclient!eq;Z)Lclient!gl;")
	@Override
	public Class57_Sub2 method5936(@OriginalArg(0) Class66 arg0) {
		if (this.aClass259_1 == null || !this.method5533(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class5 local19 = arg0.method5064();
		@Pc(24) int local24 = super.aClass214_7.method4965();
		local19.method3844(local24);
		local19.method3843(super.anInt7202, super.anInt7208, super.anInt7207);
		@Pc(38) float local38 = arg0.method5024();
		@Pc(41) float local41 = arg0.method5015();
		if (Static291.aClass28_Sub1_1.aBoolean77) {
			@Pc(48) Class246 local48 = this.method5513();
			if (local48.aBoolean464 && (this.aClass259_1.anInt7708 == -1 || Static235.aClass263_2.method6416(this.aClass259_1.anInt7708).aBoolean133)) {
				@Pc(82) Class131 local82 = super.lb != -1 && super.anInt6557 == 0 ? Static5.aClass217_1.method5234(super.lb) : null;
				@Pc(102) Class131 local102 = super.anInt6597 == -1 || this.aBoolean424 || super.aBoolean418 && local82 != null ? null : Static5.aClass217_1.method5234(super.anInt6597);
				@Pc(136) Class224 local136 = Static160.method2663(super.anInt6553, super.anInt6562, 240, 160, super.anInt6546, super.aBoolean420, super.aClass224Array3[0], local102 == null ? super.anInt6563 : super.anInt6594, 0, 0, arg0, local102 == null ? local82 : local102, local24, 1);
				if (local136 != null) {
					arg0.method5055(local38, local41 - 128.0F);
					arg0.method5007(false);
					local136.method5798(local19, null, 0);
					arg0.method5007(true);
				}
			}
		}
		if (Static302.aClass3_Sub2_Sub1_Sub2_2 == this) {
			arg0.method5055(local38, local41 - 144.0F);
			local19.method3846(super.anInt7202, super.anInt7208, super.anInt7207);
			for (@Pc(177) int local177 = Static122.aClass17Array1.length - 1; local177 >= 0; local177--) {
				@Pc(183) Class17 local183 = Static122.aClass17Array1[local177];
				if (local183 != null && local183.anInt539 != -1) {
					@Pc(226) int local226;
					@Pc(219) int local219;
					if (local183.anInt532 == 1 && local183.anInt531 >= 0 && local183.anInt531 < Static308.aClass3_Sub2_Sub1_Sub1Array1.length) {
						@Pc(210) Class3_Sub2_Sub1_Sub1 local210 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local183.anInt531];
						if (local210 != null) {
							local219 = local210.anInt7202 - Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202;
							local226 = local210.anInt7207 - Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207;
							this.method5538(5760000, local226, arg0, local183.anInt539, super.aClass224Array3[0], local19, local219);
						}
					}
					if (local183.anInt532 == 2) {
						@Pc(255) int local255 = local183.anInt533 + 64 - Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202;
						local219 = local183.anInt535 + 64 - Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207;
						local226 = local183.anInt536 << 7;
						local226 *= local226;
						this.method5538(local226, local219, arg0, local183.anInt539, super.aClass224Array3[0], local19, local255);
					}
					if (local183.anInt532 == 10 && local183.anInt531 >= 0 && local183.anInt531 < Static374.aClass3_Sub2_Sub1_Sub2Array1.length) {
						@Pc(309) Class3_Sub2_Sub1_Sub2 local309 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local183.anInt531];
						if (local309 != null) {
							local219 = local309.anInt7202 - Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202;
							local226 = local309.anInt7207 - Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207;
							this.method5538(5760000, local226, arg0, local183.anInt539, super.aClass224Array3[0], local19, local219);
						}
					}
				}
			}
			local19.method3844(local24);
			local19.method3843(super.anInt7202, super.anInt7208, super.anInt7207);
		}
		arg0.method5055(local38, local41);
		@Pc(365) Class57_Sub2 local365 = Static291.method4377(super.aClass224Array3.length);
		if (super.aClass57_Sub4_6 == null) {
			arg0.method5046(super.aClass224Array3, local19, local365.aClass57_Sub5Array1, Static302.aClass3_Sub2_Sub1_Sub2_2 == this ? 1 : 0);
		} else {
			@Pc(372) Class32 local372 = super.aClass57_Sub4_6.method3250();
			arg0.method4979(super.aClass224Array3, local372, local19, local365.aClass57_Sub5Array1, Static302.aClass3_Sub2_Sub1_Sub2_2 == this ? 1 : 0);
		}
		this.method5527(false, super.aClass224Array3, arg0);
		if (super.aClass224Array3[2] != null) {
			if (local24 != 0) {
				super.aClass224Array3[2].method5839(local24);
			}
			super.aClass224Array3[2].method5806(-super.aClass6_Sub34_3.anInt6213 + super.anInt7202, super.anInt7208 + -super.aClass6_Sub34_3.anInt6223, -super.aClass6_Sub34_3.anInt6211 + super.anInt7207);
		}
		super.anInt6549 = Static347.anInt6264;
		return local365;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method5532() {
		return this.aString54;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILclient!eq;I)Z")
	private boolean method5533(@OriginalArg(1) Class66 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class246 local11 = this.method5513();
		@Pc(33) Class131 local33 = super.lb != -1 && super.anInt6557 == 0 ? Static5.aClass217_1.method5234(super.lb) : null;
		@Pc(53) Class131 local53 = super.anInt6597 == -1 || this.aBoolean424 || super.aBoolean418 && local33 != null ? null : Static5.aClass217_1.method5234(super.anInt6597);
		@Pc(56) int local56 = local11.anInt7335;
		@Pc(59) int local59 = local11.anInt7320;
		if (local56 != 0 || local59 != 0 || local11.anInt7301 != 0 || local11.anInt7326 != 0) {
			arg1 |= 0x7;
		}
		@Pc(94) boolean local94 = super.aByte90 != 0 && super.anInt6582 <= Static66.anInt1741 && Static66.anInt1741 < super.anInt6600;
		if (local94) {
			arg1 |= 0x80000;
		}
		@Pc(137) Class224 local137 = super.aClass224Array3[0] = this.aClass259_1.method6312(super.anInt6568, super.anInt6581, Static380.aClass231_2, super.anInt6601, arg0, Static235.aClass263_2, Static5.aClass217_1, super.anInt6576, super.aClass235Array3, super.anInt6594, Static270.aClass18_1, arg1, local33, local53, Static393.aClass207_1, Static145.aClass27_1, super.anInt6563);
		@Pc(140) int local140 = Static357.method5295();
		if (Static270.anInt4876 < 96 && local140 > 50) {
			Static217.method3261();
		}
		@Pc(160) int local160;
		if (Static136.aClass193_3 != Static170.aClass193_5 && local140 < 50) {
			local160 = 50 - local140;
			while (local160 > Static141.anInt1394) {
				Static412.aByteArrayArray25[Static141.anInt1394] = new byte[102400];
				Static141.anInt1394++;
			}
			while (Static141.anInt1394 > local160) {
				Static141.anInt1394--;
				Static412.aByteArrayArray25[Static141.anInt1394] = null;
			}
		} else if (Static136.aClass193_3 != Static170.aClass193_5) {
			Static141.anInt1394 = 0;
			Static412.aByteArrayArray25 = new byte[50][];
		}
		if (local137 == null) {
			return false;
		}
		super.anInt6607 = local137.method5812();
		this.method5514(local137);
		local160 = super.aClass214_7.method4965();
		if (local56 == 0 && local59 == 0) {
			this.method5518(this.method5521() << 7, 0, 0, this.method5521() << 7, local160);
		} else {
			this.method5518(local59, local11.anInt7321, local11.anInt7299, local56, local160);
			if (super.anInt6553 != 0) {
				local137.method5817(super.anInt6553);
			}
			if (super.anInt6562 != 0) {
				local137.method5840(super.anInt6562);
			}
			if (super.anInt6546 != 0) {
				local137.method5806(0, super.anInt6546, 0);
			}
		}
		if (local94) {
			local137.method5814(super.aByte91, super.aByte92, super.aByte89, super.aByte90 & 0xFF);
		}
		@Pc(321) Class58 local321;
		@Pc(336) boolean local336;
		@Pc(338) int local338;
		@Pc(381) Class224 local381;
		if (this.aBoolean424 || super.anInt6609 == -1 || super.anInt6538 == -1) {
			super.aClass224Array3[1] = null;
		} else {
			local321 = Static141.aClass141_2.method3177(super.anInt6609);
			local336 = local321.aByte36 == 3 && (local56 != 0 || local59 != 0);
			local338 = local7;
			if (local336) {
				local338 = local7 | 0x7;
			} else {
				if (super.anInt6544 != 0) {
					local338 = local7 | 0x5;
				}
				if (super.anInt6543 != 0) {
					local338 |= 0x2;
				}
			}
			local381 = super.aClass224Array3[1] = local321.method1571(Static5.aClass217_1, super.anInt6538, super.anInt6541, arg0, local338, super.anInt6599);
			if (local381 != null) {
				if (super.anInt6543 != 0) {
					local381.method5806(0, -super.anInt6543 << 0, 0);
				}
				if (super.anInt6544 != 0) {
					local381.method5839(super.anInt6544 * 2048);
				}
				if (local336) {
					if (super.anInt6553 != 0) {
						local381.method5817(super.anInt6553);
					}
					if (super.anInt6562 != 0) {
						local381.method5840(super.anInt6562);
					}
					if (super.anInt6546 != 0) {
						local381.method5806(0, super.anInt6546, 0);
					}
				}
			}
		}
		if (this.aBoolean424 || super.anInt6603 == -1 || super.anInt6550 == -1) {
			super.aClass224Array3[3] = null;
		} else {
			local321 = Static141.aClass141_2.method3177(super.anInt6603);
			local336 = local321.aByte36 == 3 && (local56 != 0 || local59 != 0);
			local338 = local7;
			if (local336) {
				local338 = local7 | 0x7;
			} else {
				if (super.anInt6547 != 0) {
					local338 = local7 | 0x5;
				}
				if (super.anInt6606 != 0) {
					local338 |= 0x2;
				}
			}
			local381 = super.aClass224Array3[3] = local321.method1572(super.anInt6550, local338, super.anInt6565, Static5.aClass217_1, super.anInt6567, arg0);
			if (local381 != null) {
				if (super.anInt6606 != 0) {
					local381.method5806(0, -super.anInt6606 << 0, 0);
				}
				if (super.anInt6547 != 0) {
					local381.method5839(super.anInt6547 * 2048);
				}
				if (local336) {
					if (super.anInt6553 != 0) {
						local381.method5817(super.anInt6553);
					}
					if (super.anInt6562 != 0) {
						local381.method5840(super.anInt6562);
					}
					if (super.anInt6546 != 0) {
						local381.method5806(0, super.anInt6546, 0);
					}
				}
			}
		}
		super.aClass224Array3[2] = null;
		if (!this.aBoolean424 && super.aClass6_Sub34_3 != null) {
			if (Static66.anInt1741 >= super.aClass6_Sub34_3.anInt6215) {
				super.aClass6_Sub34_3 = null;
			} else if (Static66.anInt1741 >= super.aClass6_Sub34_3.anInt6222) {
				@Pc(617) Class224 local617 = super.aClass6_Sub34_3.method5183(arg0, local7 | 0x7);
				if (local617 != null) {
					local617.method5806(super.aClass6_Sub34_3.anInt6213 - super.anInt7202, super.aClass6_Sub34_3.anInt6223 - super.anInt7208, super.aClass6_Sub34_3.anInt6211 - super.anInt7207);
					if (local160 != 0) {
						local617.method5839(-local160 & 0x3FFF);
					}
					super.aClass224Array3[2] = local617;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(I)V")
	@Override
	public void method5938() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(Z)Z")
	public boolean method5534() {
		return this.aClass259_1 != null;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BIIB)V")
	public void method5535(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (super.lb != -1 && Static5.aClass217_1.method5234(super.lb).anInt3706 == 1) {
			super.lb = -1;
		}
		@Pc(36) Class58 local36;
		if (super.anInt6609 != -1) {
			local36 = Static141.aClass141_2.method3177(super.anInt6609);
			if (local36.aBoolean141 && local36.anInt2019 != -1 && Static5.aClass217_1.method5234(local36.anInt2019).anInt3706 == 1) {
				super.anInt6609 = -1;
			}
		}
		if (super.anInt6603 != -1) {
			local36 = Static141.aClass141_2.method3177(super.anInt6603);
			if (local36.aBoolean141 && local36.anInt2019 != -1 && Static5.aClass217_1.method5234(local36.anInt2019).anInt3706 == 1) {
				super.anInt6603 = -1;
			}
		}
		this.anInt6626 = -1;
		if (arg1 < 0 || Static181.anInt3574 <= arg1 || arg2 < 0 || arg2 >= Static117.anInt2450) {
			this.method5537(arg1, arg2);
		} else if (super.anIntArray458[0] >= 0 && super.anIntArray458[0] < Static181.anInt3574 && super.anIntArray459[0] >= 0 && super.anIntArray459[0] < Static117.anInt2450) {
			if (arg0 == 2) {
				Static63.method1340(arg1, this, arg2);
			}
			this.method5530(arg1, arg2, arg0);
		} else {
			this.method5537(arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method5536() {
		@Pc(7) String local7 = "";
		if (Static387.aStringArray44 != null) {
			local7 = local7 + Static387.aStringArray44[this.aByte94];
		}
		@Pc(29) int[] local29;
		if (this.aByte95 == 1 && Static434.anIntArray528 != null) {
			local29 = Static434.anIntArray528;
		} else {
			local29 = Static430.anIntArray527;
		}
		if (local29 != null && local29[this.aByte94] != -1) {
			@Pc(50) Class79 local50 = Static176.aClass192_1.method4482(local29[this.aByte94]);
			if (local50.aChar2 == 's') {
				local7 = local7 + local50.method2014(this.aByte93 & 0xFF);
			} else {
				Static390.method5741(new Throwable(), "gdn1");
				local29[this.aByte94] = -1;
			}
		}
		local7 = local7 + this.aString53;
		if (Static53.aStringArray6 != null) {
			local7 = local7 + Static53.aStringArray6[this.aByte94];
		}
		return local7;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)I")
	@Override
	protected int method5519() {
		return this.anInt6646;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(I)I")
	@Override
	public int method5521() {
		return this.aClass259_1 == null || this.aClass259_1.anInt7708 == -1 ? super.method5521() : Static235.aClass263_2.method6416(this.aClass259_1.anInt7708).anInt1752;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(IIB)V")
	public void method5537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anIntArray458[0] = arg0;
		super.anInt6612 = 0;
		super.anInt6613 = 0;
		super.anInt6611 = 0;
		super.anIntArray459[0] = arg1;
		@Pc(34) int local34 = this.method5521();
		super.anInt7207 = super.anIntArray459[0] * 128 + local34 * 64;
		super.anInt7202 = local34 * 64 + super.anIntArray458[0] * 128;
		if (Static302.aClass3_Sub2_Sub1_Sub2_2 == this) {
			Static245.method3817();
		}
		if (super.aClass57_Sub4_6 != null) {
			super.aClass57_Sub4_6.method3249();
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!eq;I)V")
	@Override
	public void method5937(@OriginalArg(0) Class66 arg0) {
		if (this.aClass259_1 != null && (super.aBoolean421 || this.method5533(arg0, 0))) {
			this.method5527(super.aBoolean421, super.aClass224Array3, arg0);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIILclient!bp;IZLclient!eq;)V")
	@Override
	public void method5941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class66 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5942() {
		return false;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(Z)I")
	@Override
	public int method5520() {
		return -1;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIILclient!eq;ILclient!va;Lclient!gs;I)V")
	private void method5538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class66 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class224 arg4, @OriginalArg(6) Class5 arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg6 * arg6 + arg1 * arg1;
		if (local11 < 16384 || local11 > arg0) {
			return;
		}
		@Pc(31) int local31 = (int) (Math.atan2((double) arg6, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
		@Pc(43) Class224 local43 = Static191.method3041(arg3, arg2, super.anInt6553, super.anInt6562, local31, super.anInt6546);
		if (local43 != null) {
			arg2.method5007(false);
			local43.method5798(arg5, null, 0);
			arg2.method5007(true);
		}
	}
}

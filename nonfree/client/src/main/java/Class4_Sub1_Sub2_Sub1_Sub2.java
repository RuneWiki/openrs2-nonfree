import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class4_Sub1_Sub2_Sub1_Sub2 extends Class4_Sub1_Sub2_Sub1 {

	@OriginalMember(owner = "client!l", name = "cd", descriptor = "Ljava/lang/String;")
	public String aString63;

	@OriginalMember(owner = "client!l", name = "rd", descriptor = "I")
	public int anInt5814;

	@OriginalMember(owner = "client!l", name = "Bd", descriptor = "Lclient!jr;")
	public Class178 aClass178_1;

	@OriginalMember(owner = "client!l", name = "Jd", descriptor = "I")
	private int anInt5829;

	@OriginalMember(owner = "client!l", name = "Od", descriptor = "I")
	public int anInt5833;

	@OriginalMember(owner = "client!l", name = "Qd", descriptor = "Ljava/lang/String;")
	public String aString64;

	@OriginalMember(owner = "client!l", name = "Rc", descriptor = "I")
	public int anInt5796 = 0;

	@OriginalMember(owner = "client!l", name = "Wc", descriptor = "Z")
	public boolean aBoolean408 = false;

	@OriginalMember(owner = "client!l", name = "md", descriptor = "I")
	public int anInt5809 = 0;

	@OriginalMember(owner = "client!l", name = "gd", descriptor = "I")
	public int anInt5805 = -1;

	@OriginalMember(owner = "client!l", name = "kd", descriptor = "I")
	public int anInt5808 = -1;

	@OriginalMember(owner = "client!l", name = "nd", descriptor = "I")
	public int anInt5810 = -1;

	@OriginalMember(owner = "client!l", name = "pd", descriptor = "I")
	public int anInt5812 = 0;

	@OriginalMember(owner = "client!l", name = "Cd", descriptor = "I")
	public int anInt5823 = 0;

	@OriginalMember(owner = "client!l", name = "xd", descriptor = "I")
	public int anInt5819 = 0;

	@OriginalMember(owner = "client!l", name = "ld", descriptor = "Z")
	public boolean aBoolean412 = false;

	@OriginalMember(owner = "client!l", name = "Fd", descriptor = "I")
	public int anInt5826 = -1;

	@OriginalMember(owner = "client!l", name = "dd", descriptor = "Z")
	public boolean aBoolean410 = false;

	@OriginalMember(owner = "client!l", name = "yd", descriptor = "I")
	public int anInt5820 = -1;

	@OriginalMember(owner = "client!l", name = "jd", descriptor = "I")
	public int anInt5807 = -1;

	@OriginalMember(owner = "client!l", name = "vd", descriptor = "I")
	public int anInt5818 = -1;

	@OriginalMember(owner = "client!l", name = "bd", descriptor = "Z")
	public boolean aBoolean409 = false;

	@OriginalMember(owner = "client!l", name = "Ld", descriptor = "Z")
	public boolean aBoolean413 = false;

	@OriginalMember(owner = "client!l", name = "Md", descriptor = "I")
	public int anInt5831 = 255;

	@OriginalMember(owner = "client!l", name = "Gd", descriptor = "I")
	public int anInt5827 = -1;

	@OriginalMember(owner = "client!l", name = "wd", descriptor = "B")
	private byte aByte93 = 0;

	@OriginalMember(owner = "client!l", name = "id", descriptor = "B")
	private byte aByte92 = 0;

	@OriginalMember(owner = "client!l", name = "Hd", descriptor = "B")
	private byte aByte94 = 0;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(Z)I")
	@Override
	protected int method5064() {
		return this.anInt5829;
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
	@Override
	public void method7697() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(Z)I")
	@Override
	public int method5059() {
		return this.aClass178_1 == null || this.aClass178_1.anInt4993 == -1 ? super.method5059() : Static547.aClass177_2.method4471(this.aClass178_1.anInt4993).anInt3032;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!sl;B)V")
	public void method5075(@OriginalArg(0) Class3_Sub3 arg0) {
		arg0.anInt4736 = 0;
		@Pc(12) int local12 = arg0.method4225();
		this.aByte93 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean413;
		this.aBoolean413 = (local12 & 0x2) != 0;
		@Pc(41) boolean local41 = (local12 & 0x4) != 0;
		@Pc(45) int local45 = super.method5059();
		this.method5072((local12 >> 3 & 0x7) + 1);
		this.aByte92 = (byte) (local12 >> 6 & 0x3);
		super.anInt8916 += this.method5059() - local45 << 8;
		super.anInt8911 += this.method5059() - local45 << 8;
		this.aByte94 = arg0.method4254();
		this.anInt5805 = arg0.method4254();
		this.anInt5820 = arg0.method4254();
		this.aBoolean409 = arg0.method4254() == 1;
		if (Static2.aClass135_1 == Static42.aClass135_2 && Static302.anInt5364 >= 2) {
			this.aBoolean409 = false;
		}
		@Pc(123) int local123 = -1;
		this.anInt5809 = 0;
		@Pc(129) int[] local129 = new int[12];
		@Pc(149) int local149;
		@Pc(155) int local155;
		@Pc(199) int local199;
		for (@Pc(131) int local131 = 0; local131 < 12; local131++) {
			@Pc(137) int local137 = arg0.method4225();
			if (local137 == 0) {
				local129[local131] = 0;
			} else {
				local149 = arg0.method4225();
				local155 = local149 + (local137 << 8);
				if (local131 == 0 && local155 == 65535) {
					local123 = arg0.method4221();
					this.anInt5809 = arg0.method4225();
					break;
				}
				if (local155 >= 32768) {
					local155 = Static466.anIntArray510[local155 - 32768];
					local129[local131] = local155 | 0x40000000;
					local199 = Static320.aClass53_2.method1770(local155).anInt1467;
					if (local199 != 0) {
						this.anInt5809 = local199;
					}
				} else {
					local129[local131] = Integer.MIN_VALUE | local155 - 256;
				}
			}
		}
		@Pc(223) int[] local223 = new int[5];
		for (local149 = 0; local149 < 5; local149++) {
			local155 = arg0.method4225();
			if (Static341.aShortArrayArrayArray5.length < 1 || local155 < 0 || local155 >= Static341.aShortArrayArrayArray5[0][local149].length) {
				local155 = 0;
			}
			local223[local149] = local155;
		}
		this.anInt5829 = arg0.method4221();
		this.aString64 = arg0.method4233();
		this.aString63 = this.aString64;
		this.anInt5812 = arg0.method4225();
		if (local41) {
			this.anInt5796 = arg0.method4221();
			if (this.anInt5796 == 65535) {
				this.anInt5796 = -1;
			}
			this.anInt5826 = -1;
			this.anInt5823 = this.anInt5812;
		} else {
			this.anInt5796 = 0;
			this.anInt5823 = arg0.method4225();
			this.anInt5826 = arg0.method4225();
			if (this.anInt5826 == 255) {
				this.anInt5826 = -1;
			}
		}
		local155 = this.anInt5819;
		this.anInt5819 = arg0.method4225();
		@Pc(358) int local358;
		if (this.anInt5819 == 0) {
			Static313.method5145(this);
		} else {
			local199 = this.anInt5808;
			@Pc(355) int local355 = this.anInt5810;
			local358 = this.anInt5827;
			@Pc(361) int local361 = this.anInt5807;
			@Pc(364) int local364 = this.anInt5831;
			this.anInt5808 = arg0.method4221();
			this.anInt5810 = arg0.method4221();
			this.anInt5827 = arg0.method4221();
			this.anInt5807 = arg0.method4221();
			this.anInt5831 = arg0.method4225();
			if (local21 != this.aBoolean413 || this.anInt5819 != local155 || this.anInt5808 != local199 || local355 != this.anInt5810 || this.anInt5827 != local358 || this.anInt5807 != local361 || local364 != this.anInt5831) {
				Static524.method7242(this);
			}
		}
		if (this.aClass178_1 == null) {
			this.aClass178_1 = new Class178();
		}
		local199 = this.aClass178_1.anInt4993;
		@Pc(460) int[] local460 = this.aClass178_1.anIntArray266;
		this.aClass178_1.method4489(local123, this.method5064(), local223, this.aByte93 == 1, local129);
		if (local123 != local199) {
			super.anInt8916 = (super.anIntArray310[0] << 9) + (this.method5059() << 8);
			super.anInt8911 = (super.anIntArray309[0] << 9) + (this.method5059() << 8);
		}
		if (super.anInt5759 == Static97.anInt2234 && local460 != null) {
			for (local358 = 0; local358 < local223.length; local358++) {
				if (local223[local358] != local460[local358]) {
					Static320.aClass53_2.method1775();
					break;
				}
			}
		}
		if (super.aClass4_Sub10_5 != null) {
			super.aClass4_Sub10_5.method7848();
		}
		if (super.anInt5743 == -1 || !super.aBoolean404) {
			return;
		}
		@Pc(558) Class143 local558 = this.method5058();
		if (!local558.method3688(super.anInt5743)) {
			super.aBoolean404 = false;
			super.anInt5743 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method7699(@OriginalArg(1) Class5 arg0) {
		if (this.aClass178_1 == null || !super.aBoolean407 && !this.method5087(arg0, 0)) {
			return;
		}
		@Pc(20) Class39 local20 = arg0.method7546();
		local20.method7239(super.aClass63_7.method1994());
		local20.method7244(super.anInt8916, super.anInt8915 - 5, super.anInt8911);
		this.method5074(arg0, super.aBoolean407, local20, super.aClass17Array3);
		super.aClass17Array3[0] = super.aClass17Array3[1] = super.aClass17Array3[2] = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!jw;Lclient!ha;BIZI)V")
	@Override
	public void method7696(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "n", descriptor = "(I)Z")
	public boolean method5079() {
		return this.aClass178_1 != null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IBII)V")
	public void method5080(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt5792 < 9) {
			super.anInt5792++;
		}
		for (@Pc(18) int local18 = super.anInt5792; local18 > 0; local18--) {
			super.anIntArray310[local18] = super.anIntArray310[local18 - 1];
			super.anIntArray309[local18] = super.anIntArray309[local18 - 1];
			super.aByteArray61[local18] = super.aByteArray61[local18 - 1];
		}
		super.anIntArray310[0] = arg2;
		super.anIntArray309[0] = arg0;
		super.aByteArray61[0] = arg1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IILclient!ka;IIILclient!sk;Lclient!ha;)V")
	private void method5081(@OriginalArg(1) int arg0, @OriginalArg(2) Class17 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class39 arg5, @OriginalArg(7) Class5 arg6) {
		@Pc(12) int local12 = arg4 * arg4 + arg0 * arg0;
		if (local12 < 262144 || arg2 < local12) {
			return;
		}
		@Pc(32) int local32 = (int) (Math.atan2((double) arg4, (double) arg0) * 2607.5945876176133D) & 0x3FFF;
		@Pc(50) Class17 local50 = Static331.method5407(local32, super.anInt5728, super.anInt5753, super.anInt5751, arg3, arg6);
		if (local50 != null) {
			arg6.C(false);
			local50.method5411(arg5, null, 0);
			arg6.C(true);
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(III)V")
	public void method5082(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt5792 = 0;
		super.anIntArray310[0] = arg1;
		super.anInt5793 = 0;
		super.anInt5794 = 0;
		super.anIntArray309[0] = arg0;
		@Pc(26) int local26 = this.method5059();
		super.anInt8911 = super.anIntArray309[0] * 512 + local26 * 256;
		super.anInt8916 = local26 * 256 + super.anIntArray310[0] * 512;
		if (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2 == this) {
			Static175.method3056();
		}
		if (super.aClass4_Sub10_5 != null) {
			super.aClass4_Sub10_5.method7848();
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ha;BLclient!ka;ILclient!sk;IIII)V")
	private void method5085(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class17 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class39 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(19) int local19 = arg2 * arg2 + arg4 * arg4;
		if (local19 < 262144 || arg5 < local19) {
			return;
		}
		@Pc(43) int local43 = (int) (Math.atan2((double) arg4, (double) arg2) * 2607.5945876176133D) & 0x3FFF;
		@Pc(55) Class17 local55 = Static331.method5407(local43, super.anInt5728, super.anInt5753, super.anInt5751, arg6, arg0);
		if (local55 != null) {
			arg0.C(false);
			local55.method5413(arg3, null, arg7, 0);
			arg0.C(true);
		}
	}

	@OriginalMember(owner = "client!l", name = "k", descriptor = "(I)I")
	@Override
	public int method5070() {
		return -1;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method5086() {
		return this.aString63;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ha;IB)Z")
	private boolean method5087(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class143 local11 = this.method5058();
		@Pc(29) Class361 local29 = super.anInt5718 != -1 && super.anInt5710 == 0 ? Static115.aClass227_1.method5968(super.anInt5718) : null;
		@Pc(50) Class361 local50 = super.anInt5743 == -1 || this.aBoolean410 || super.aBoolean404 && local29 != null ? null : Static115.aClass227_1.method5968(super.anInt5743);
		@Pc(53) int local53 = local11.anInt4188;
		@Pc(56) int local56 = local11.anInt4191;
		if (local53 != 0 || local56 != 0 || local11.anInt4163 != 0 || local11.anInt4152 != 0) {
			arg1 |= 0x7;
		}
		@Pc(89) int local89 = super.aClass63_7.method1994();
		@Pc(104) boolean local104 = super.aByte91 != 0 && super.anInt5749 <= Static101.anInt2262 && Static101.anInt2262 < super.anInt5779;
		if (local104) {
			arg1 |= 0x80000;
		}
		@Pc(148) Class17 local148 = super.aClass17Array3[0] = this.aClass178_1.method4493(super.anInt5709, Static373.aClass150_1, local50, super.anInt5791, local29, Static547.aClass177_2, Static115.aClass227_1, local89, super.anInt5777, Static53.aClass286_6, arg0, super.anInt5770, super.anInt5723, Static78.aClass261_1, Static320.aClass53_2, super.anIntArray305, arg1, super.lb, super.aClass256Array3);
		@Pc(151) int local151 = Static104.method2167();
		if (Static131.anInt2701 < 96 && local151 > 50) {
			Static414.method6551();
		}
		if (Static42.aClass135_2 != Static2.aClass135_1 && local151 < 50) {
			@Pc(171) int local171 = 50 - local151;
			while (local171 > Static429.anInt7699) {
				Static178.aByteArrayArray33[Static429.anInt7699] = new byte[102400];
				Static429.anInt7699++;
			}
			while (Static429.anInt7699 > local171) {
				Static429.anInt7699--;
				Static178.aByteArrayArray33[Static429.anInt7699] = null;
			}
		} else if (Static2.aClass135_1 != Static42.aClass135_2) {
			Static178.aByteArrayArray33 = new byte[50][];
			Static429.anInt7699 = 0;
		}
		if (local148 == null) {
			return false;
		}
		super.anInt5780 = local148.fa();
		super.anInt5733 = local148.ma();
		this.method5061(local148);
		if (local53 == 0 && local56 == 0) {
			this.method5069(0, 0, this.method5059() << 9, this.method5059() << 9, local89);
		} else {
			this.method5069(local11.anInt4155, local11.anInt4167, local56, local53, local89);
			if (super.anInt5728 != 0) {
				local148.FA(super.anInt5728);
			}
			if (super.anInt5753 != 0) {
				local148.VA(super.anInt5753);
			}
			if (super.anInt5751 != 0) {
				local148.H(0, super.anInt5751, 0);
			}
		}
		if (local104) {
			local148.method5431(super.aByte88, super.aByte90, super.aByte89, super.aByte91 & 0xFF);
		}
		@Pc(347) boolean local347;
		@Pc(349) int local349;
		@Pc(402) Class17 local402;
		@Pc(421) int local421;
		@Pc(423) int local423;
		@Pc(425) int local425;
		@Pc(512) int local512;
		@Pc(541) int local541;
		@Pc(550) int local550;
		@Pc(554) int local554;
		@Pc(564) int local564;
		@Pc(330) Class145 local330;
		if (this.aBoolean410 || super.anInt5720 == -1 || super.anInt5714 == -1) {
			super.aClass17Array3[1] = null;
		} else {
			local330 = Static275.aClass68_2.method2087(super.anInt5720);
			local347 = local330.aByte63 == 3 && (local53 != 0 || local56 != 0);
			local349 = local7;
			if (local347) {
				local349 = local7 | 0x7;
			} else {
				if (super.anInt5713 != 0) {
					local349 = local7 | 0x5;
				}
				if (super.anInt5736 != 0) {
					local349 |= 0x2;
				}
				if (super.anInt5719 != 0) {
					local349 |= 0x7;
				}
			}
			local402 = super.aClass17Array3[1] = local330.method3711(super.anInt5714, Static115.aClass227_1, super.anInt5752, local349, arg0, super.anInt5769);
			if (local402 != null) {
				if (super.anInt5719 >= 0 && local11.anIntArrayArray32 != null && local11.anIntArrayArray32[super.anInt5719] != null) {
					local421 = 0;
					local423 = 0;
					local425 = 0;
					if (local11.anIntArrayArray32 != null && local11.anIntArrayArray32[super.anInt5719] != null) {
						local421 = local11.anIntArrayArray32[super.anInt5719][0];
						local425 = local11.anIntArrayArray32[super.anInt5719][2];
						local423 = local11.anIntArrayArray32[super.anInt5719][1];
					}
					if (local11.anIntArrayArray31 != null && local11.anIntArrayArray31[super.anInt5719] != null) {
						local421 += local11.anIntArrayArray31[super.anInt5719][0];
						local425 += local11.anIntArrayArray31[super.anInt5719][2];
						local423 += local11.anIntArrayArray31[super.anInt5719][1];
					}
					if (local425 != 0 || local421 != 0) {
						local512 = local89;
						if (super.anIntArray305 != null && super.anIntArray305[super.anInt5719] != -1) {
							local512 = super.anIntArray305[super.anInt5719];
						}
						local541 = super.anInt5713 * 2048 + local512 - local89 & 0x3FFF;
						if (local541 != 0) {
							local402.a(local541);
						}
						local550 = Class21.anIntArray656[local541];
						local554 = Class21.anIntArray655[local541];
						local564 = local421 * local554 + local425 * local550 >> 14;
						local425 = local425 * local554 - local421 * local550 >> 14;
						local421 = local564;
					}
					local402.H(local421, local423, local425);
				} else if (super.anInt5713 != 0) {
					local402.a(super.anInt5713 * 2048);
				}
				if (super.anInt5736 != 0) {
					local402.H(0, -super.anInt5736 << 2, 0);
				}
				if (local347) {
					if (super.anInt5728 != 0) {
						local402.FA(super.anInt5728);
					}
					if (super.anInt5753 != 0) {
						local402.VA(super.anInt5753);
					}
					if (super.anInt5751 != 0) {
						local402.H(0, super.anInt5751, 0);
					}
				}
			}
		}
		if (this.aBoolean410 || super.anInt5717 == -1 || super.anInt5765 == -1) {
			super.aClass17Array3[2] = null;
		} else {
			local330 = Static275.aClass68_2.method2087(super.anInt5717);
			local347 = local330.aByte63 == 3 && (local53 != 0 || local56 != 0);
			local349 = local7;
			if (local347) {
				local349 = local7 | 0x7;
			} else {
				if (super.anInt5756 != 0) {
					local349 = local7 | 0x5;
				}
				if (super.anInt5784 != 0) {
					local349 |= 0x2;
				}
				if (super.anInt5781 != 0) {
					local349 |= 0x7;
				}
			}
			local402 = super.aClass17Array3[2] = local330.method3716(super.anInt5783, local349, super.anInt5765, super.anInt5726, Static115.aClass227_1, arg0);
			if (local402 != null) {
				if (super.anInt5781 >= 0 && local11.anIntArrayArray32 != null && local11.anIntArrayArray32[super.anInt5781] != null) {
					local421 = 0;
					local423 = 0;
					local425 = 0;
					if (local11.anIntArrayArray32 != null && local11.anIntArrayArray32[super.anInt5781] != null) {
						local425 = local11.anIntArrayArray32[super.anInt5781][2];
						local423 = local11.anIntArrayArray32[super.anInt5781][1];
						local421 = local11.anIntArrayArray32[super.anInt5781][0];
					}
					if (local11.anIntArrayArray31 != null && local11.anIntArrayArray31[super.anInt5781] != null) {
						local421 += local11.anIntArrayArray31[super.anInt5781][0];
						local425 += local11.anIntArrayArray31[super.anInt5781][2];
						local423 += local11.anIntArrayArray31[super.anInt5781][1];
					}
					if (local425 != 0 || local421 != 0) {
						local512 = local89;
						if (super.anIntArray305 != null && super.anIntArray305[super.anInt5781] != -1) {
							local512 = super.anIntArray305[super.anInt5781];
						}
						local541 = super.anInt5756 * 2048 + local512 - local89 & 0x3FFF;
						if (local541 != 0) {
							local402.a(local541);
						}
						local550 = Class21.anIntArray656[local541];
						local554 = Class21.anIntArray655[local541];
						local564 = local554 * local421 + local425 * local550 >> 14;
						local425 = local554 * local425 - local550 * local421 >> 14;
						local421 = local564;
					}
					local402.H(local421, local423, local425);
				} else if (super.anInt5756 != 0) {
					local402.a(super.anInt5756 * 2048);
				}
				if (super.anInt5784 != 0) {
					local402.H(0, -super.anInt5784 << 2, 0);
				}
				if (local347) {
					if (super.anInt5728 != 0) {
						local402.FA(super.anInt5728);
					}
					if (super.anInt5753 != 0) {
						local402.VA(super.anInt5753);
					}
					if (super.anInt5751 != 0) {
						local402.H(0, super.anInt5751, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BLclient!ha;)Lclient!qs;")
	@Override
	public Class4_Sub8 method7692(@OriginalArg(1) Class5 arg0) {
		if (this.aClass178_1 == null || !this.method5087(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class39 local19 = arg0.method7546();
		@Pc(24) int local24 = super.aClass63_7.method1994();
		local19.method7239(local24);
		@Pc(47) Class77 local47 = Static330.aClass77ArrayArrayArray2[super.aByte123][super.anInt8916 >> Static308.anInt5834][super.anInt8911 >> Static308.anInt5834];
		if (local47 == null || local47.aClass4_Sub1_Sub5_1 == null) {
			super.anInt5775 = (int) ((float) super.anInt5775 - (float) super.anInt5775 / 10.0F);
		} else {
			@Pc(74) int local74 = super.anInt5775 - local47.aClass4_Sub1_Sub5_1.aShort115;
			super.anInt5775 = (int) ((float) super.anInt5775 - (float) local74 / 10.0F);
		}
		local19.method7244(super.anInt8916, super.anInt8915 - super.anInt5775 - 20, super.anInt8911);
		@Pc(100) Class4_Sub8 local100 = null;
		super.aBoolean406 = false;
		if (Static262.aClass3_Sub27_12.aClass21_Sub19_1.method6583() == 1) {
			@Pc(115) Class143 local115 = this.method5058();
			if (local115.aBoolean286 && (this.aClass178_1.anInt4993 == -1 || Static547.aClass177_2.method4471(this.aClass178_1.anInt4993).aBoolean199)) {
				@Pc(151) Class361 local151 = super.anInt5718 != -1 && super.anInt5710 == 0 ? Static115.aClass227_1.method5968(super.anInt5718) : null;
				@Pc(172) Class361 local172 = super.anInt5743 == -1 || this.aBoolean410 || super.aBoolean404 && local151 != null ? null : Static115.aClass227_1.method5968(super.anInt5743);
				@Pc(204) Class17 local204 = Static65.method1666(arg0, 240, 0, super.anInt5751, super.anInt5728, 0, super.anInt5753, 160, local172 == null ? super.anInt5770 : super.lb, super.aClass17Array3[0], local24, 1, local172 == null ? local151 : local172);
				if (local204 != null) {
					local100 = Static271.method4457(true, super.aClass17Array3.length + 1);
					super.aBoolean406 = true;
					arg0.C(false);
					if (Static279.aBoolean329) {
						local204.method5413(local19, local100.aClass4_Sub5Array1[super.aClass17Array3.length], Static401.anInt7417, 0);
					} else {
						local204.method5411(local19, local100.aClass4_Sub5Array1[super.aClass17Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(265) int local265;
		if (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2 == this) {
			local19.method7240(super.anInt8916, super.anInt8915, super.anInt8911);
			for (local265 = Static82.aClass251Array1.length - 1; local265 >= 0; local265--) {
				@Pc(271) Class251 local271 = Static82.aClass251Array1[local265];
				if (local271 != null && local271.anInt7488 != -1) {
					@Pc(304) int local304;
					if (local271.anInt7476 == 1) {
						@Pc(292) Class3_Sub28 local292 = (Class3_Sub28) Static551.aClass280_43.method7107((long) local271.anInt7486);
						if (local292 != null) {
							@Pc(297) Class4_Sub1_Sub2_Sub1_Sub1 local297 = local292.aClass4_Sub1_Sub2_Sub1_Sub1_2;
							local304 = local297.anInt8916 - Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916;
							@Pc(311) int local311 = local297.anInt8911 - Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911;
							if (Static279.aBoolean329) {
								this.method5085(arg0, super.aClass17Array3[0], local311, local19, local304, 92160000, local271.anInt7488, Static401.anInt7417);
							} else {
								this.method5081(local311, super.aClass17Array3[0], 92160000, local271.anInt7488, local304, local19, arg0);
							}
						}
					}
					@Pc(367) int local367;
					if (local271.anInt7476 == 2) {
						@Pc(358) int local358 = local271.anInt7487 + 256 - Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916;
						local367 = local271.anInt7477 + 256 - Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911;
						local304 = local271.anInt7485 << 9;
						local304 *= local304;
						if (Static279.aBoolean329) {
							this.method5085(arg0, super.aClass17Array3[0], local367, local19, local358, local304, local271.anInt7488, Static401.anInt7417);
						} else {
							this.method5081(local367, super.aClass17Array3[0], local304, local271.anInt7488, local358, local19, arg0);
						}
					}
					if (local271.anInt7476 == 10 && local271.anInt7486 >= 0 && Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1.length > local271.anInt7486) {
						@Pc(428) Class4_Sub1_Sub2_Sub1_Sub2 local428 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local271.anInt7486];
						if (local428 != null) {
							local367 = local428.anInt8916 - Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916;
							local304 = local428.anInt8911 - Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911;
							if (Static279.aBoolean329) {
								this.method5085(arg0, super.aClass17Array3[0], local304, local19, local367, 92160000, local271.anInt7488, Static401.anInt7417);
							} else {
								this.method5081(local304, super.aClass17Array3[0], 92160000, local271.anInt7488, local367, local19, arg0);
							}
						}
					}
				}
			}
			local19.method7239(local24);
			local19.method7244(super.anInt8916, super.anInt8915, super.anInt8911);
		}
		local19.method7239(local24);
		local19.method7244(super.anInt8916, -super.anInt5775 + super.anInt8915 - 5, super.anInt8911);
		if (local100 == null) {
			local100 = Static271.method4457(true, super.aClass17Array3.length);
		}
		this.method5074(arg0, false, local19, super.aClass17Array3);
		if (Static279.aBoolean329) {
			for (local265 = 0; super.aClass17Array3.length > local265; local265++) {
				if (super.aClass17Array3[local265] != null) {
					super.aClass17Array3[local265].method5413(local19, local100.aClass4_Sub5Array1[local265], Static401.anInt7417, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local265 = 0; super.aClass17Array3.length > local265; local265++) {
				if (super.aClass17Array3[local265] != null) {
					super.aClass17Array3[local265].method5411(local19, local100.aClass4_Sub5Array1[local265], Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass4_Sub10_5 != null) {
			@Pc(605) Class85 local605 = super.aClass4_Sub10_5.method7850();
			if (Static279.aBoolean329) {
				arg0.method7551(local605, Static401.anInt7417);
			} else {
				arg0.method7538(local605);
			}
		}
		for (local265 = 0; super.aClass17Array3.length > local265; local265++) {
			if (super.aClass17Array3[local265] != null) {
				super.aBoolean406 |= super.aClass17Array3[local265].F();
			}
		}
		super.aClass17Array3[0] = super.aClass17Array3[1] = super.aClass17Array3[2] = null;
		super.anInt5732 = Static45.anInt1320;
		return local100;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIBB)V")
	public void method5088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt5718 != -1 && Static115.aClass227_1.method5968(super.anInt5718).anInt9856 == 1) {
			super.anInt5718 = -1;
			super.anIntArray306 = null;
		}
		@Pc(35) Class145 local35;
		if (super.anInt5720 != -1) {
			local35 = Static275.aClass68_2.method2087(super.anInt5720);
			if (local35.aBoolean288 && local35.anInt4224 != -1 && Static115.aClass227_1.method5968(local35.anInt4224).anInt9856 == 1) {
				super.anInt5720 = -1;
			}
		}
		if (super.anInt5717 != -1) {
			local35 = Static275.aClass68_2.method2087(super.anInt5717);
			if (local35.aBoolean288 && local35.anInt4224 != -1 && Static115.aClass227_1.method5968(local35.anInt4224).anInt9856 == 1) {
				super.anInt5717 = -1;
			}
		}
		this.anInt5818 = -1;
		if (arg0 < 0 || Static634.anInt10129 <= arg0 || arg1 < 0 || arg1 >= Static638.anInt10172) {
			this.method5082(arg1, arg0);
		} else if (super.anIntArray310[0] >= 0 && Static634.anInt10129 > super.anIntArray310[0] && super.anIntArray309[0] >= 0 && super.anIntArray309[0] < Static638.anInt10172) {
			if (arg2 == 2) {
				Static632.method8662(arg0, arg1, this);
			}
			this.method5080(arg1, arg2, arg0);
		} else {
			this.method5082(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BZ)Ljava/lang/String;")
	public String method5089() {
		@Pc(7) String local7 = "";
		if (Static380.aStringArray25 != null) {
			local7 = local7 + Static380.aStringArray25[this.aByte92];
		}
		@Pc(37) int[] local37;
		if (this.aByte93 == 1 && Static449.anIntArray497 != null) {
			local37 = Static449.anIntArray497;
		} else {
			local37 = Static435.anIntArray479;
		}
		if (local37 != null && local37[this.aByte92] != -1) {
			@Pc(58) Class290 local58 = Static571.aClass31_1.method1344(local37[this.aByte92]);
			if (local58.aChar1 == 's') {
				local7 = local7 + local58.method7229(this.aByte94 & 0xFF);
			} else {
				Static335.method5467("gdn1", new Throwable());
				local37[this.aByte92] = -1;
			}
		}
		local7 = local7 + this.aString64;
		if (Static163.aStringArray15 != null) {
			local7 = local7 + Static163.aStringArray15[this.aByte92];
		}
		return local7;
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7690() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method7704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5 arg2) {
		if (this.aClass178_1 == null || !this.method5087(arg2, 131072)) {
			return false;
		}
		@Pc(19) Class39 local19 = arg2.method7546();
		@Pc(24) int local24 = super.aClass63_7.method1994();
		local19.method7239(local24);
		local19.method7244(super.anInt8916, super.anInt8915, super.anInt8911);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass17Array3.length; local39++) {
			if (super.aClass17Array3[local39] != null && (Static279.aBoolean329 ? super.aClass17Array3[local39].method5420(arg1, arg0, local19, true, 0, Static401.anInt7417) : super.aClass17Array3[local39].method5433(arg1, arg0, local19, true, 0))) {
				local37 = true;
				break;
			}
		}
		super.aClass17Array3[0] = super.aClass17Array3[1] = super.aClass17Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(BLclient!ha;)Lclient!ro;")
	@Override
	public Class297 method7700(@OriginalArg(1) Class5 arg0) {
		return null;
	}
}

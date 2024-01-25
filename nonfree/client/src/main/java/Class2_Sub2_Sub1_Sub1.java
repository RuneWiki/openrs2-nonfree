import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class2_Sub2_Sub1_Sub1 extends Class2_Sub2_Sub1 {

	@OriginalMember(owner = "client!c", name = "Pc", descriptor = "Lclient!ol;")
	public Class148 aClass148_4;

	@OriginalMember(owner = "client!c", name = "ed", descriptor = "I")
	private int anInt736;

	@OriginalMember(owner = "client!c", name = "gd", descriptor = "Ljava/lang/String;")
	public String aString22;

	@OriginalMember(owner = "client!c", name = "pd", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!c", name = "Ic", descriptor = "I")
	public int anInt717 = 0;

	@OriginalMember(owner = "client!c", name = "Rc", descriptor = "I")
	public int anInt724 = 0;

	@OriginalMember(owner = "client!c", name = "Gc", descriptor = "I")
	public int anInt715 = -1;

	@OriginalMember(owner = "client!c", name = "Hc", descriptor = "I")
	public int anInt716 = 0;

	@OriginalMember(owner = "client!c", name = "Xc", descriptor = "I")
	public int anInt730 = 0;

	@OriginalMember(owner = "client!c", name = "dd", descriptor = "I")
	public int anInt735 = -1;

	@OriginalMember(owner = "client!c", name = "Qc", descriptor = "I")
	public int anInt723 = -1;

	@OriginalMember(owner = "client!c", name = "Oc", descriptor = "I")
	public int anInt722 = -1;

	@OriginalMember(owner = "client!c", name = "bd", descriptor = "B")
	private byte aByte14 = 0;

	@OriginalMember(owner = "client!c", name = "Jc", descriptor = "Z")
	public boolean aBoolean44 = false;

	@OriginalMember(owner = "client!c", name = "cd", descriptor = "I")
	public int anInt734 = -1;

	@OriginalMember(owner = "client!c", name = "Uc", descriptor = "I")
	public int anInt727 = 0;

	@OriginalMember(owner = "client!c", name = "id", descriptor = "I")
	public int anInt739 = -1;

	@OriginalMember(owner = "client!c", name = "Sc", descriptor = "I")
	public int anInt725 = 255;

	@OriginalMember(owner = "client!c", name = "nd", descriptor = "I")
	public int anInt744 = -1;

	@OriginalMember(owner = "client!c", name = "sd", descriptor = "B")
	private byte aByte15 = 0;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "(I)Z")
	public boolean method651() {
		return this.aClass148_4 != null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!vm;I)V")
	@Override
	public void method5409(@OriginalArg(0) Class92 arg0) {
		if (this.aClass148_4 != null && (super.aBoolean570 || this.method657(arg0, 0))) {
			this.method5431(super.aBoolean570, arg0, super.aClass5Array3);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method652() {
		@Pc(7) String local7 = "";
		if (Static217.aStringArray38 != null) {
			local7 = local7 + Static217.aStringArray38[this.aByte15];
		}
		if (Static100.anIntArray223 != null && Static100.anIntArray223[this.aByte15] != -1) {
			@Pc(37) Class4_Sub1_Sub17 local37 = Static257.method4394(Static100.anIntArray223[this.aByte15]);
			if (local37.aChar2 == 's') {
				local7 = local7 + local37.method4084(this.aByte14 & 0xFF);
			} else {
				Static103.method2841(new Throwable(), "gdn1");
				Static100.anIntArray223[this.aByte15] = -1;
			}
		}
		local7 = local7 + this.aString23;
		if (Static78.aStringArray14 != null) {
			local7 = local7 + Static78.aStringArray14[this.aByte15];
		}
		return local7;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZIIILclient!ai;ILclient!vm;)V")
	@Override
	public void method5406(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class92 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!tq;)V")
	public void method653(@OriginalArg(1) Class4_Sub7 arg0) {
		arg0.anInt2667 = 0;
		@Pc(12) int local12 = arg0.method2380();
		@Pc(16) int local16 = local12 & 0x1;
		@Pc(24) boolean local24 = (local12 & 0x2) != 0;
		@Pc(35) boolean local35 = (local12 & 0x4) != 0;
		@Pc(39) int local39 = super.method5425();
		this.method5433((local12 >> 3 & 0x7) + 1);
		this.aByte15 = (byte) (local12 >> 6 & 0x3);
		super.anInt6465 += (this.method5425() - local39) * 64;
		super.anInt6466 += (this.method5425() - local39) * 64;
		this.aByte14 = arg0.method2393();
		this.anInt715 = arg0.method2393();
		this.anInt734 = arg0.method2393();
		@Pc(99) int local99 = -1;
		this.anInt717 = 0;
		@Pc(105) int[] local105 = new int[12];
		@Pc(127) int local127;
		@Pc(133) int local133;
		@Pc(176) int local176;
		for (@Pc(107) int local107 = 0; local107 < 12; local107++) {
			@Pc(113) int local113 = arg0.method2380();
			if (local113 == 0) {
				local105[local107] = 0;
			} else {
				local127 = arg0.method2380();
				local133 = (local113 << 8) + local127;
				if (local107 == 0 && local133 == 65535) {
					local99 = arg0.method2404();
					this.anInt717 = arg0.method2380();
					break;
				}
				if (local133 >= 32768) {
					local133 = Static292.anIntArray488[local133 - 32768];
					local105[local107] = local133 | 0x40000000;
					local176 = Static247.method4270(local133).anInt4511;
					if (local176 != 0) {
						this.anInt717 = local176;
					}
				} else {
					local105[local107] = Integer.MIN_VALUE | local133 - 256;
				}
			}
		}
		@Pc(203) int[] local203 = new int[5];
		for (local127 = 0; local127 < 5; local127++) {
			local133 = arg0.method2380();
			if (local133 < 0 || local133 >= Static335.aShortArrayArray12[local127].length) {
				local133 = 0;
			}
			local203[local127] = local133;
		}
		this.anInt736 = arg0.method2404();
		this.aString23 = arg0.method2379();
		if (local24) {
			this.aString22 = arg0.method2379();
		} else {
			this.aString22 = this.aString23;
		}
		this.anInt727 = arg0.method2380();
		if (local35) {
			this.anInt716 = arg0.method2404();
			this.anInt723 = -1;
			this.anInt724 = this.anInt727;
		} else {
			this.anInt716 = 0;
			this.anInt724 = arg0.method2380();
			this.anInt723 = arg0.method2380();
			if (this.anInt723 == 255) {
				this.anInt723 = -1;
			}
		}
		local133 = this.anInt730;
		this.anInt730 = arg0.method2380();
		@Pc(322) int local322;
		if (this.anInt730 == 0) {
			Static354.method4052(this);
		} else {
			local176 = this.anInt735;
			@Pc(319) int local319 = this.anInt722;
			local322 = this.anInt739;
			@Pc(325) int local325 = this.anInt744;
			@Pc(328) int local328 = this.anInt725;
			this.anInt735 = arg0.method2404();
			this.anInt722 = arg0.method2404();
			this.anInt739 = arg0.method2404();
			this.anInt744 = arg0.method2404();
			this.anInt725 = arg0.method2380();
			if (this.anInt730 != local133 || this.anInt735 != local176 || local319 != this.anInt722 || this.anInt739 != local322 || this.anInt744 != local325 || local328 != this.anInt725) {
				Static115.method2091(this);
			}
		}
		if (this.aClass148_4 == null) {
			this.aClass148_4 = new Class148();
		}
		local176 = this.aClass148_4.anInt4772;
		@Pc(417) int[] local417 = this.aClass148_4.anIntArray390;
		this.aClass148_4.method3924(local203, local105, local16 == 1, local99, this.method5434());
		if (local176 != local99) {
			super.anInt6465 = super.anIntArray518[0] * 128 + this.method5425() * 64;
			super.anInt6466 = super.anIntArray517[0] * 128 + this.method5425() * 64;
		}
		if (super.anInt6535 == 2047 && local417 != null) {
			for (local322 = 0; local322 < local203.length; local322++) {
				if (local417[local322] != local203[local322]) {
					Static50.method928();
					break;
				}
			}
		}
		if (super.aClass17_Sub3_7 != null) {
			super.aClass17_Sub3_7.method1062();
		}
		if (super.anInt6540 == -1 || !super.aBoolean569) {
			return;
		}
		@Pc(515) Class10 local515 = this.method5428();
		if (!local515.method248(super.anInt6540)) {
			super.anInt6540 = -1;
			super.aBoolean569 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(B)I")
	@Override
	protected int method5434() {
		return this.anInt736;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IBIZI)V")
	public void method654(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		super.method5422(arg3, arg0, arg2, this.method5425(), arg1);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!jn;IILclient!vm;Lclient!ib;I)V")
	private void method655(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class92 arg4, @OriginalArg(6) Class23 arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg0 * arg0 + arg2 * arg2;
		if (local11 < 16 || arg3 < local11) {
			return;
		}
		@Pc(31) int local31 = (int) (Math.atan2((double) arg2, (double) arg0) * 2607.5945876176133D) & 0x3FFF;
		@Pc(50) Class5 local50 = Static160.method3095(super.anInt6510, super.anInt6466, super.anInt6465, arg4, super.anInt6494, super.anInt6464, super.lb, arg6, arg1, local31);
		if (local50 != null) {
			arg4.method4439(false);
			local50.method4029(arg5, null, 0);
			arg4.method4439(true);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method656() {
		return this.aString22;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!vm;II)Z")
	private boolean method657(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1;
		@Pc(19) Class10 local19 = this.method5428();
		@Pc(33) Class116 local33 = super.anInt6517 != -1 && super.anInt6490 == 0 ? Static340.method5560(super.anInt6517) : null;
		@Pc(53) Class116 local53 = super.anInt6540 == -1 || this.aBoolean44 || super.aBoolean569 && local33 != null ? null : Static340.method5560(super.anInt6540);
		@Pc(56) int local56 = local19.anInt237;
		@Pc(59) int local59 = local19.anInt235;
		if (local56 != 0 || local59 != 0 || local19.anInt206 != 0 || local19.anInt220 != 0) {
			arg1 |= 0x7;
		}
		super.aClass5Array3[0] = this.aClass148_4.method3919(super.anInt6487, local33, super.anInt6518, super.anInt6485, super.anInt6534, arg0, local53, super.aClass186Array3, super.anInt6504, super.anInt6493, arg1);
		@Pc(109) int local109 = Static240.method4160();
		if (Static161.anInt3644 < 96 && local109 > 50) {
			Static309.method5197();
		}
		@Pc(146) int local146;
		if (Static189.anInt4083 != 0 && local109 < 50) {
			local146 = 50 - local109;
			while (Static120.anInt2722 < local146) {
				Static329.aByteArrayArray24[Static120.anInt2722] = new byte[102400];
				Static120.anInt2722++;
			}
			while (Static120.anInt2722 > local146) {
				Static120.anInt2722--;
				Static329.aByteArrayArray24[Static120.anInt2722] = null;
			}
		} else if (Static189.anInt4083 != 0) {
			Static329.aByteArrayArray24 = new byte[50][];
			Static120.anInt2722 = 0;
		}
		if (super.aClass5Array3[0] == null) {
			return false;
		}
		super.anInt6522 = super.aClass5Array3[0].method4020();
		this.method5423(super.aClass5Array3[0]);
		local146 = super.aClass108_7.method2976();
		super.anInt6494 = 0;
		super.lb = 0;
		super.anInt6510 = 0;
		if (local56 == 0 && local59 == 0) {
			this.method5432(this.method5425() << 7, local146, this.method5425() << 7);
		} else {
			this.method5432(local56, local146, local59);
			if (super.anInt6494 != 0) {
				super.aClass5Array3[0].method4003(super.anInt6494);
			}
			if (super.lb != 0) {
				super.aClass5Array3[0].method3987(super.lb);
			}
			if (super.anInt6510 != 0) {
				super.aClass5Array3[0].method4026(0, super.anInt6510, 0);
			}
		}
		super.aClass5Array3[1] = null;
		if (!this.aBoolean44 && super.anInt6482 != -1 && super.anInt6492 != -1) {
			@Pc(299) Class156 local299 = Static244.method4224(super.anInt6482);
			@Pc(318) Class5 local318 = local299.method4236(super.anInt6525, super.anInt6492, arg0, super.anInt6512, (local299.aBoolean431 ? 7 : 2) | local15);
			if (local318 != null) {
				local318.method4026(0, -super.anInt6531, 0);
				if (local299.aBoolean431 && (local56 != 0 || local59 != 0)) {
					if (super.anInt6494 != 0) {
						local318.method4003(super.anInt6494);
					}
					if (super.lb != 0) {
						local318.method3987(super.lb);
					}
					if (super.anInt6510 != 0) {
						local318.method4026(0, super.anInt6510, 0);
					}
				}
				super.aClass5Array3[1] = local318;
			}
		}
		super.aClass5Array3[2] = null;
		if (!this.aBoolean44 && super.anInterface5_3 != null) {
			if (Static342.anInt6706 >= super.anInt6554) {
				super.anInterface5_3 = null;
			}
			if (super.anInt6546 <= Static342.anInt6706 && super.anInt6554 > Static342.anInt6706) {
				@Pc(410) Class5 local410 = super.anInterface5_3.method4727(arg0, local15 | 0x7);
				if (local410 != null) {
					local410.method4026(super.anInt6549 - super.anInt6465, -super.anInt6464 + super.anInt6544, super.anInt6555 - super.anInt6466);
					if (local146 != 0) {
						local410.method3997(-local146 & 0x3FFF);
					}
					super.aClass5Array3[2] = local410;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	@Override
	public void method5408() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!vm;Z)Lclient!dn;")
	@Override
	public Class17_Sub2 method5413(@OriginalArg(0) Class92 arg0) {
		if (this.aClass148_4 == null || !this.method657(arg0, 1024)) {
			return null;
		}
		@Pc(19) Class23 local19 = arg0.method4466();
		@Pc(24) int local24 = super.aClass108_7.method2976();
		local19.method5099(local24);
		local19.method5089(super.anInt6465, super.anInt6464, super.anInt6466);
		@Pc(38) float local38 = arg0.method4490();
		@Pc(41) float local41 = arg0.method4473();
		if (Static128.aBoolean242) {
			@Pc(47) Class10 local47 = this.method5428();
			if (local47.aBoolean16 && (this.aClass148_4.anInt4772 == -1 || Static165.method2927(this.aClass148_4.anInt4772).aBoolean54)) {
				@Pc(78) Class116 local78 = super.anInt6517 != -1 && super.anInt6490 == 0 ? Static340.method5560(super.anInt6517) : null;
				@Pc(98) Class116 local98 = super.anInt6540 == -1 || this.aBoolean44 || super.aBoolean569 && local78 != null ? null : Static340.method5560(super.anInt6540);
				@Pc(132) Class5 local132 = Static224.method3840(local98 == null ? local78 : local98, 240, 0, local98 == null ? super.anInt6487 : super.anInt6485, super.anInt6510, super.lb, 160, 0, arg0, 1, local24, super.aClass5Array3[0], super.anInt6494, super.aBoolean567);
				if (local132 != null) {
					arg0.method4539(local38, local41 - 128.0F);
					arg0.method4439(false);
					local132.method4029(local19, null, 0);
					arg0.method4439(true);
				}
			}
		}
		if (Static110.aClass2_Sub2_Sub1_Sub1_1 == this) {
			arg0.method4539(local38, local41 - 144.0F);
			local19.method5091(super.anInt6465, super.anInt6464, super.anInt6466);
			for (@Pc(173) int local173 = Static190.aClass121Array1.length - 1; local173 >= 0; local173--) {
				@Pc(179) Class121 local179 = Static190.aClass121Array1[local173];
				if (local179 != null && local179.anInt3842 != -1) {
					@Pc(230) int local230;
					@Pc(219) int local219;
					if (local179.anInt3844 == 1 && local179.anInt3846 >= 0 && Static101.aClass2_Sub2_Sub1_Sub2Array6.length > local179.anInt3846) {
						@Pc(206) Class2_Sub2_Sub1_Sub2 local206 = Static101.aClass2_Sub2_Sub1_Sub2Array6[local179.anInt3846];
						if (local206 != null) {
							local219 = local206.anInt6465 / 32 - Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465 / 32;
							local230 = local206.anInt6466 / 32 - Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466 / 32;
							this.method655(local230, super.aClass5Array3[0], local219, 360000, arg0, local19, local179.anInt3842);
						}
					}
					if (local179.anInt3844 == 2) {
						@Pc(265) int local265 = (local179.anInt3841 - Static10.anInt231) * 4 + 2 - Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465 / 32;
						local219 = (local179.anInt3845 - Static81.anInt1732) * 4 + 2 - Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466 / 32;
						local230 = local179.anInt3839 * 4;
						local230 *= local230;
						this.method655(local219, super.aClass5Array3[0], local265, local230, arg0, local19, local179.anInt3842);
					}
					if (local179.anInt3844 == 10 && local179.anInt3846 >= 0 && local179.anInt3846 < Static253.aClass2_Sub2_Sub1_Sub1Array1.length) {
						@Pc(326) Class2_Sub2_Sub1_Sub1 local326 = Static253.aClass2_Sub2_Sub1_Sub1Array1[local179.anInt3846];
						if (local326 != null) {
							local219 = local326.anInt6465 / 32 - Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465 / 32;
							local230 = local326.anInt6466 / 32 - Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466 / 32;
							this.method655(local230, super.aClass5Array3[0], local219, 360000, arg0, local19, local179.anInt3842);
						}
					}
				}
			}
			local19.method5099(local24);
			local19.method5089(super.anInt6465, super.anInt6464, super.anInt6466);
		}
		arg0.method4539(local38, local41);
		@Pc(391) Class17_Sub2 local391 = Static238.method4100(super.aClass5Array3.length);
		if (super.aClass17_Sub3_7 == null) {
			arg0.method4455(super.aClass5Array3, local19, local391.aClass17_Sub6Array1, Static110.aClass2_Sub2_Sub1_Sub1_1 == this ? 1 : 0);
		} else {
			@Pc(413) Class88 local413 = super.aClass17_Sub3_7.method1067();
			arg0.method4474(super.aClass5Array3, local413, local19, local391.aClass17_Sub6Array1, Static110.aClass2_Sub2_Sub1_Sub1_1 == this ? 1 : 0);
		}
		this.method5431(false, arg0, super.aClass5Array3);
		if (super.aClass5Array3[2] != null) {
			if (local24 != 0) {
				super.aClass5Array3[2].method3997(local24);
			}
			super.aClass5Array3[2].method4026(super.anInt6465 - super.anInt6549, super.anInt6464 - super.anInt6544, super.anInt6466 - super.anInt6555);
		}
		return local391;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)I")
	@Override
	public int method5425() {
		return this.aClass148_4 == null || this.aClass148_4.anInt4772 == -1 ? super.method5425() : Static165.method2927(this.aClass148_4.anInt4772).anInt842;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILclient!vm;)Z")
	@Override
	public boolean method5414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class92 arg2) {
		if (this.aClass148_4 == null || !this.method657(arg2, 65536)) {
			return true;
		}
		@Pc(19) Class23 local19 = arg2.method4466();
		@Pc(24) int local24 = super.aClass108_7.method2976();
		local19.method5099(local24);
		local19.method5091(super.anInt6465, super.anInt6464, super.anInt6466);
		for (@Pc(37) int local37 = 0; local37 < super.aClass5Array3.length; local37++) {
			if (super.aClass5Array3[local37] != null) {
				return super.aClass5Array3[local37].method3995(arg0, arg1, local19, true);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5411() {
		return false;
	}

	@OriginalMember(owner = "client!c", name = "f", descriptor = "(B)I")
	@Override
	public int method5436() {
		return -1;
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(I)I")
	@Override
	public int method5416() {
		return super.anInt6522;
	}
}

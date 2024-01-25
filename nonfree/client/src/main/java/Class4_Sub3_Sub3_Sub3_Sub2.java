import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class4_Sub3_Sub3_Sub3_Sub2 extends Class4_Sub3_Sub3_Sub3 {

	@OriginalMember(owner = "client!gg", name = "cd", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!gg", name = "Ic", descriptor = "I")
	public int anInt3313;

	@OriginalMember(owner = "client!gg", name = "bd", descriptor = "I")
	private int anInt3317;

	@OriginalMember(owner = "client!gg", name = "Oc", descriptor = "I")
	public int anInt3319;

	@OriginalMember(owner = "client!gg", name = "kd", descriptor = "Lclient!wt;")
	public Class398 aClass398_1;

	@OriginalMember(owner = "client!gg", name = "Ad", descriptor = "Ljava/lang/String;")
	public String aString38;

	@OriginalMember(owner = "client!gg", name = "ad", descriptor = "I")
	public int anInt3310 = -1;

	@OriginalMember(owner = "client!gg", name = "vd", descriptor = "I")
	public int anInt3309 = 0;

	@OriginalMember(owner = "client!gg", name = "Lc", descriptor = "I")
	public int anInt3301 = -1;

	@OriginalMember(owner = "client!gg", name = "ud", descriptor = "Z")
	public boolean aBoolean241 = false;

	@OriginalMember(owner = "client!gg", name = "Mc", descriptor = "I")
	public int anInt3304 = 0;

	@OriginalMember(owner = "client!gg", name = "zd", descriptor = "B")
	private byte aByte77 = 0;

	@OriginalMember(owner = "client!gg", name = "td", descriptor = "I")
	public int anInt3324 = 0;

	@OriginalMember(owner = "client!gg", name = "Bd", descriptor = "I")
	public int anInt3303 = -1;

	@OriginalMember(owner = "client!gg", name = "md", descriptor = "Z")
	public boolean aBoolean246 = false;

	@OriginalMember(owner = "client!gg", name = "Rc", descriptor = "Z")
	public boolean aBoolean242 = false;

	@OriginalMember(owner = "client!gg", name = "Ed", descriptor = "I")
	public int anInt3323 = 255;

	@OriginalMember(owner = "client!gg", name = "Zc", descriptor = "I")
	public int anInt3325 = -1;

	@OriginalMember(owner = "client!gg", name = "fd", descriptor = "Z")
	public boolean aBoolean243 = false;

	@OriginalMember(owner = "client!gg", name = "Dc", descriptor = "Z")
	public boolean aBoolean245 = false;

	@OriginalMember(owner = "client!gg", name = "Vc", descriptor = "I")
	public int anInt3338 = 0;

	@OriginalMember(owner = "client!gg", name = "wd", descriptor = "I")
	public int anInt3302 = 0;

	@OriginalMember(owner = "client!gg", name = "dd", descriptor = "I")
	public int anInt3322 = -1;

	@OriginalMember(owner = "client!gg", name = "Hc", descriptor = "Z")
	public boolean aBoolean247 = false;

	@OriginalMember(owner = "client!gg", name = "ld", descriptor = "I")
	public int anInt3337 = -1;

	@OriginalMember(owner = "client!gg", name = "Pc", descriptor = "I")
	public int anInt3339 = -1;

	@OriginalMember(owner = "client!gg", name = "Fc", descriptor = "B")
	private byte aByte76 = 0;

	@OriginalMember(owner = "client!gg", name = "rd", descriptor = "B")
	private byte aByte78 = 0;

	@OriginalMember(owner = "client!gg", name = "qd", descriptor = "I")
	public int anInt3336 = -1;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZILclient!ha;)Z")
	@Override
	public boolean method9478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class144 arg2) {
		if (this.aClass398_1 == null || !this.method2895(arg2, 131072)) {
			return false;
		}
		@Pc(22) Class263 local22 = arg2.method6907();
		@Pc(27) int local27 = super.aClass200_7.method4987();
		local22.method8447(local27);
		local22.method8442(super.anInt11184, super.anInt11182, super.anInt11178);
		@Pc(40) boolean local40 = false;
		for (@Pc(42) int local42 = 0; local42 < super.aClass129Array3.length; local42++) {
			if (super.aClass129Array3[local42] != null && (Static6.aBoolean9 ? super.aClass129Array3[local42].method5302(arg1, arg0, local22, true, 0, Static481.anInt10749) : super.aClass129Array3[local42].method5296(arg1, arg0, local22, true, 0))) {
				local40 = true;
				break;
			}
		}
		super.aClass129Array3[0] = super.aClass129Array3[1] = super.aClass129Array3[2] = null;
		return local40;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!jc;I)V")
	public void method2885(@OriginalArg(0) Class14_Sub21 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt8936 = 0;
		@Pc(10) int local10 = arg0.method7695(123);
		this.aByte78 = (byte) (local10 & 0x1);
		@Pc(19) boolean local19 = this.aBoolean247;
		this.aBoolean247 = (local10 & 0x2) != 0;
		@Pc(44) boolean local44 = (local10 & 0x4) != 0;
		@Pc(48) int local48 = super.method2870(0);
		this.method2882((local10 >> 3 & 0x7) + 1);
		this.aByte76 = (byte) (local10 >> 6 & 0x3);
		super.anInt11184 += this.method2870(0) - local48 << 8;
		super.anInt11178 += this.method2870(0) - local48 << 8;
		this.aByte77 = arg0.method7720();
		this.anInt3339 = arg0.method7720();
		this.anInt3301 = arg0.method7720();
		this.aBoolean245 = arg0.method7720() == 1;
		if (Static548.aClass59_10 == Static115.aClass59_4 && Static469.anInt11068 >= 2) {
			this.aBoolean245 = false;
		}
		@Pc(137) int local137 = -1;
		this.anInt3302 = 0;
		@Pc(145) int[] local145 = new int[Static642.aClass400_2.anIntArray603.length];
		@Pc(150) Class206[] local150 = new Class206[Static642.aClass400_2.anIntArray603.length];
		@Pc(155) Class284[] local155 = new Class284[Static642.aClass400_2.anIntArray603.length];
		@Pc(168) int local168;
		@Pc(180) int local180;
		@Pc(186) int local186;
		@Pc(235) int local235;
		for (@Pc(157) int local157 = 0; local157 < Static642.aClass400_2.anIntArray603.length; local157++) {
			if (Static642.aClass400_2.anIntArray603[local157] != 1) {
				local168 = arg0.method7695(127);
				if (local168 == 0) {
					local145[local157] = 0;
				} else {
					local180 = arg0.method7695(97);
					local186 = local180 + (local168 << 8);
					if (local157 == 0 && local186 == 65535) {
						local137 = arg0.method7717(-1978450544);
						this.anInt3302 = arg0.method7695(arg1 ^ 0x7A);
						break;
					}
					if (local186 >= 32768) {
						local186 = Static260.anIntArray243[local186 - 32768];
						local145[local157] = local186 | 0x40000000;
						local155[local157] = Static252.aClass56_1.method1052(local186);
						local235 = local155[local157].anInt7788;
						if (local235 != 0) {
							this.anInt3302 = local235;
						}
					} else {
						local145[local157] = local186 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (local137 == -1) {
			local168 = arg0.method7717(-1978450544);
			local180 = 0;
			for (local186 = 0; local186 < Static642.aClass400_2.anIntArray603.length; local186++) {
				if (Static642.aClass400_2.anIntArray603[local186] == 0) {
					if ((0x1 << local180 & local168) != 0) {
						local150[local186] = Static542.method7951(arg0, local155[local186]);
					}
					local180++;
				}
			}
		}
		@Pc(308) int[] local308 = new int[10];
		for (local180 = arg1; local180 < 10; local180++) {
			local186 = arg0.method7695(arg1 ^ 0x60);
			if (local180 >= Static222.aShortArrayArrayArray1.length || local186 < 0 || Static222.aShortArrayArrayArray1[local180][0].length <= local186) {
				local186 = 0;
			}
			local308[local180] = local186;
		}
		this.anInt3317 = arg0.method7717(arg1 ^ 0x8A133D90);
		this.aString38 = arg0.method7703(arg1);
		this.aString37 = this.aString38;
		if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1 == this) {
			Static519.aString108 = this.aString38;
		}
		this.anInt3338 = arg0.method7695(arg1 + 106);
		if (local44) {
			this.anInt3324 = arg0.method7717(-1978450544);
			if (this.anInt3324 == 65535) {
				this.anInt3324 = -1;
			}
			this.anInt3304 = this.anInt3338;
			this.anInt3303 = -1;
		} else {
			this.anInt3324 = 0;
			this.anInt3304 = arg0.method7695(arg1 ^ 0x76);
			this.anInt3303 = arg0.method7695(127);
			if (this.anInt3303 == 255) {
				this.anInt3303 = -1;
			}
		}
		local186 = this.anInt3309;
		this.anInt3309 = arg0.method7695(113);
		@Pc(458) int local458;
		if (this.anInt3309 == 0) {
			Static343.method5235(this);
		} else {
			local235 = this.anInt3310;
			@Pc(455) int local455 = this.anInt3336;
			local458 = this.anInt3337;
			@Pc(461) int local461 = this.anInt3325;
			@Pc(464) int local464 = this.anInt3323;
			this.anInt3310 = arg0.method7717(arg1 - 1978450544);
			this.anInt3336 = arg0.method7717(-1978450544);
			this.anInt3337 = arg0.method7717(-1978450544);
			this.anInt3325 = arg0.method7717(-1978450544);
			this.anInt3323 = arg0.method7695(arg1 + 113);
			if (local19 != this.aBoolean247 || this.anInt3309 != local186 || this.anInt3310 != local235 || this.anInt3336 != local455 || this.anInt3337 != local458 || local461 != this.anInt3325 || this.anInt3323 != local464) {
				Static525.method7779(this);
			}
		}
		if (this.aClass398_1 == null) {
			this.aClass398_1 = new Class398();
		}
		local235 = this.aClass398_1.anInt11149;
		@Pc(581) int[] local581 = this.aClass398_1.anIntArray601;
		this.aClass398_1.method9452(local145, local308, local150, local137, this.aByte78 == 1, this.method2866((byte) -25));
		if (local137 != local235) {
			super.anInt11184 = (super.anIntArray200[0] << 9) + (this.method2870(0) << 8);
			super.anInt11178 = (super.anIntArray201[0] << 9) + (this.method2870(arg1) << 8);
		}
		if (super.anInt3238 == Static597.anInt9858 && local581 != null) {
			for (local458 = 0; local458 < local308.length; local458++) {
				if (local581[local458] != local308[local458]) {
					Static252.aClass56_1.method1047();
					break;
				}
			}
		}
		if (super.aClass4_Sub8_5 != null) {
			super.aClass4_Sub8_5.method8681();
		}
		if (!super.aClass181_7.method8970() || !super.aBoolean236) {
			return;
		}
		@Pc(692) Class141 local692 = this.method2865();
		if (!local692.method3041(super.aClass181_7.method8959())) {
			super.aClass181_7.method8964(-1, arg1);
			super.aBoolean236 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9490(@OriginalArg(0) Class144 arg0) {
		if (this.aClass398_1 == null || !super.aBoolean239 && !this.method2895(arg0, 0)) {
			return;
		}
		@Pc(26) Class263 local26 = arg0.method6907();
		local26.method8447(super.aClass200_7.method4987());
		local26.method8442(super.anInt11184, super.anInt11182 - 5, super.anInt11178);
		this.method2883(super.aBoolean239, local26, arg0, super.aClass129Array3);
		for (@Pc(62) int local62 = 0; local62 < super.aClass129Array3.length; local62++) {
			super.aClass129Array3[local62] = null;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BIII)V")
	public void method2886(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (super.aClass181_8.method8970() && super.aClass181_8.method8952().anInt7191 == 1) {
			super.anIntArray198 = null;
			super.aClass181_8.method8964(-1, 0);
		}
		for (@Pc(37) int local37 = 0; super.aClass214Array3.length > local37; local37++) {
			if (super.aClass214Array3[local37].anInt5678 != -1) {
				@Pc(54) Class203 local54 = Static453.aClass281_2.method6686(super.aClass214Array3[local37].anInt5678);
				if (local54.aBoolean402 && local54.anInt5538 != -1 && Static59.aClass204_1.method5041(local54.anInt5538).anInt7191 == 1) {
					super.aClass214Array3[local37].aClass181_10.method8964(-1, 0);
					super.aClass214Array3[local37].anInt5678 = -1;
				}
			}
		}
		this.anInt3322 = -1;
		if (arg2 < 0 || Static380.anInt6689 <= arg2 || arg1 < 0 || arg1 >= Static542.anInt9214) {
			this.method2897(arg2, arg1);
		} else if (super.anIntArray200[0] >= 0 && super.anIntArray200[0] < Static380.anInt6689 && super.anIntArray201[0] >= 0 && Static542.anInt9214 > super.anIntArray201[0]) {
			if (arg0 == 2) {
				Static231.method3889(arg2, arg1, this);
			}
			this.method2892(arg1, arg2, arg0);
		} else {
			this.method2897(arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!gg", name = "n", descriptor = "(I)I")
	@Override
	public int method2869() {
		return -1;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BZ)Ljava/lang/String;")
	public String method2887() {
		return this.aString37;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method2888() {
		@Pc(5) String local5 = "";
		if (Static603.aStringArray42 != null) {
			local5 = local5 + Static603.aStringArray42[this.aByte76];
		}
		@Pc(38) int[] local38;
		if (this.aByte78 == 1 && Static151.anIntArray147 != null) {
			local38 = Static151.anIntArray147;
		} else {
			local38 = Static535.anIntArray474;
		}
		if (local38 != null && local38[this.aByte76] != -1) {
			@Pc(60) Class33 local60 = Static153.aClass322_1.method7940(local38[this.aByte76]);
			if (local60.aChar4 == 's') {
				local5 = local5 + local60.method656(this.aByte77 & 0xFF);
			} else {
				Static629.method8829("gdn1", new Throwable());
				local38[this.aByte76] = -1;
			}
		}
		local5 = local5 + this.aString38;
		if (Static217.aStringArray20 != null) {
			local5 = local5 + Static217.aStringArray20[this.aByte76];
		}
		return local5;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)I")
	@Override
	protected int method2866(@OriginalArg(0) byte arg0) {
		return arg0 == -25 ? this.anInt3317 : -122;
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)Z")
	public boolean method2889() {
		return this.aClass398_1 != null;
	}

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "(I)I")
	@Override
	public int method2870(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return this.aClass398_1 == null || this.aClass398_1.anInt11149 == -1 ? super.method2870(0) : Static152.aClass61_1.method1230(this.aClass398_1.anInt11149).anInt10069;
		} else {
			return -32;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIB)V")
	public void method2892(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anIntArray200.length - 1 > super.anInt3298) {
			super.anInt3298++;
		}
		for (@Pc(22) int local22 = super.anInt3298; local22 > 0; local22--) {
			super.anIntArray200[local22] = super.anIntArray200[local22 - 1];
			super.anIntArray201[local22] = super.anIntArray201[local22 - 1];
			super.aByteArray50[local22] = super.aByteArray50[local22 - 1];
		}
		super.anIntArray200[0] = arg1;
		super.anIntArray201[0] = arg0;
		super.aByteArray50[0] = arg2;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILclient!ka;ILclient!ha;BILclient!rd;)V")
	private void method2893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class129 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class144 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class263 arg6) {
		@Pc(11) int local11 = arg3 * arg3 + arg1 * arg1;
		if (local11 < 262144 || arg0 < local11) {
			return;
		}
		@Pc(52) int local52 = (int) (Math.atan2((double) arg3, (double) arg1) * 2607.5945876176133D - (double) super.aClass200_7.method4987()) & 0x3FFF;
		@Pc(64) Class129 local64 = Static55.method997(arg4, super.anInt3281, arg5, super.anInt3253, local52, super.anInt3246);
		if (local64 != null) {
			arg4.C(false);
			local64.method5307(arg6, (Class4_Sub1) null, 0);
			arg4.C(true);
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method2876() {
		return Static551.aClass355_1.aBoolean680;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(Lclient!ha;I)Lclient!th;")
	@Override
	public Class348 method9492(@OriginalArg(0) Class144 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ha;IB)Z")
	private boolean method2895(@OriginalArg(0) Class144 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class141 local11 = this.method2865();
		@Pc(29) Class181 local29 = super.aClass181_8.method8970() && !super.aClass181_8.method8969() ? super.aClass181_8 : null;
		@Pc(54) Class181 local54 = !super.aClass181_7.method8970() || this.aBoolean243 || super.aBoolean236 && local29 != null ? null : super.aClass181_7;
		@Pc(57) int local57 = local11.anInt3557;
		@Pc(60) int local60 = local11.anInt3524;
		if (local57 != 0 || local60 != 0 || local11.anInt3537 != 0 || local11.anInt3551 != 0) {
			arg1 |= 0x7;
		}
		@Pc(99) int local99 = super.aClass200_7.method4987();
		@Pc(126) boolean local126 = super.aByte75 != 0 && Static530.anInt9105 >= super.anInt3288 && super.anInt3284 > Static530.anInt9105;
		if (local126) {
			arg1 |= 0x80000;
		}
		@Pc(159) Class129 local159 = super.aClass129Array3[0] = this.aClass398_1.method9460(Static52.aClass175_1, Static642.aClass400_2, arg1, local99, local54, Static152.aClass61_1, Static59.aClass204_1, super.aClass181_Sub2_Sub1Array3, arg0, super.anIntArray199, Static252.aClass56_1, local29, Static265.aClass103_2, Static188.aClass238_1);
		@Pc(162) int local162 = Static376.method7668();
		if (Static360.anInt6168 < 96 && local162 > 50) {
			Static608.method8581();
		}
		if (Static548.aClass59_10 != Static115.aClass59_4 && local162 < 50) {
			@Pc(207) int local207 = 50 - local162;
			while (local207 > Static194.anInt3387) {
				Static519.aByteArrayArray28[Static194.anInt3387] = new byte[102400];
				Static194.anInt3387++;
			}
			while (local207 < Static194.anInt3387) {
				Static194.anInt3387--;
				Static519.aByteArrayArray28[Static194.anInt3387] = null;
			}
		} else if (Static115.aClass59_4 != Static548.aClass59_10) {
			Static194.anInt3387 = 0;
			Static519.aByteArrayArray28 = new byte[50][];
		}
		if (local159 == null) {
			return false;
		}
		super.anInt3243 = local159.fa();
		super.anInt3244 = local159.ma();
		this.method2860(local159);
		if (local57 == 0 && local60 == 0) {
			this.method2878(this.method2870(0) << 9, 0, 0, this.method2870(0) << 9, local99);
		} else {
			this.method2878(local57, local11.anInt3555, local11.anInt3527, local60, local99);
			if (super.anInt3246 != 0) {
				local159.FA(super.anInt3246);
			}
			if (super.anInt3253 != 0) {
				local159.VA(super.anInt3253);
			}
			if (super.anInt3281 != 0) {
				local159.H(0, super.anInt3281, 0);
			}
		}
		if (local126) {
			local159.method5285(super.aByte74, super.aByte73, super.aByte72, super.aByte75 & 0xFF);
		}
		if (!this.aBoolean243) {
			this.method2872(local60, local99, local7, local57, local11, arg0);
		}
		return true;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIILclient!ka;IILclient!ha;ILclient!rd;)V")
	private void method2896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class129 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class144 arg6, @OriginalArg(8) Class263 arg7) {
		@Pc(12) int local12 = arg2 * arg2 + arg4 * arg4;
		if (local12 < 262144 || local12 > arg5) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg2, (double) arg4) * 2607.5945876176133D - (double) super.aClass200_7.method4987()) & 0x3FFF;
		@Pc(59) Class129 local59 = Static55.method997(arg6, super.anInt3281, arg0, super.anInt3253, local39, super.anInt3246);
		if (local59 != null) {
			arg6.C(false);
			local59.method5289(arg7, (Class4_Sub1) null, arg1, 0);
			arg6.C(true);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIB)V")
	public void method2897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anIntArray200[0] = arg0;
		super.anInt3299 = 0;
		super.anInt3297 = 0;
		super.anInt3298 = 0;
		super.anIntArray201[0] = arg1;
		@Pc(34) int local34 = this.method2870(0);
		super.anInt11184 = local34 * 256 + super.anIntArray200[0] * 512;
		super.anInt11178 = local34 * 256 + super.anIntArray201[0] * 512;
		if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1 == this) {
			Static452.method6681();
		}
		if (super.aClass4_Sub8_5 != null) {
			super.aClass4_Sub8_5.method8681();
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ha;BIIZLclient!haa;I)V")
	@Override
	public void method9480(@OriginalArg(0) Class144 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class4_Sub3 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "(I)V")
	@Override
	public void method9482() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(ILclient!ha;)Lclient!w;")
	@Override
	public Class4_Sub9 method9491(@OriginalArg(1) Class144 arg0) {
		if (this.aClass398_1 == null || !this.method2895(arg0, 2048)) {
			return null;
		}
		@Pc(30) Class263 local30 = arg0.method6907();
		@Pc(37) int local37 = super.aClass200_7.method4987();
		local30.method8447(local37);
		@Pc(55) Class89 local55 = Static63.aClass89ArrayArrayArray1[super.aByte146][super.anInt11184 >> Static110.anInt1858][super.anInt11178 >> Static110.anInt1858];
		if (local55 == null || local55.aClass4_Sub3_Sub2_1 == null) {
			super.anInt3279 = (int) ((float) super.anInt3279 - (float) super.anInt3279 / 10.0F);
		} else {
			@Pc(86) int local86 = super.anInt3279 - local55.aClass4_Sub3_Sub2_1.aShort123;
			super.anInt3279 = (int) ((float) super.anInt3279 - (float) local86 / 10.0F);
		}
		local30.method8442(super.anInt11184, -super.anInt3279 + super.anInt11182 - 20, super.anInt11178);
		@Pc(113) Class4_Sub9 local113 = null;
		super.aBoolean240 = false;
		if (Static181.aClass14_Sub26_9.aClass43_Sub12_1.method4071() == 1) {
			@Pc(126) Class141 local126 = this.method2865();
			if (local126.aBoolean255 && (this.aClass398_1.anInt11149 == -1 || Static152.aClass61_1.method1230(this.aClass398_1.anInt11149).aBoolean696)) {
				@Pc(166) Class181 local166 = super.aClass181_8.method8970() && super.aClass181_8.method8969() ? super.aClass181_8 : null;
				@Pc(186) Class181 local186 = super.aClass181_7.method8970() && (!super.aBoolean236 || local166 == null) ? super.aClass181_7 : null;
				@Pc(214) Class129 local214 = Static205.method3044(super.aClass129Array3[0], local37, super.anInt3253, 240, local186 == null ? local166 : local186, super.anInt3246, 0, arg0, 160, 1, 0, super.anInt3281);
				if (local214 != null) {
					local113 = Static272.method7693(super.aClass129Array3.length + 1, true);
					super.aBoolean240 = true;
					arg0.C(false);
					if (Static6.aBoolean9) {
						local214.method5289(local30, local113.aClass4_Sub1Array1[super.aClass129Array3.length], Static481.anInt10749, 0);
					} else {
						local214.method5307(local30, local113.aClass4_Sub1Array1[super.aClass129Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(271) int local271;
		if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1 == this) {
			for (local271 = Static8.aClass136Array1.length - 1; local271 >= 0; local271--) {
				@Pc(277) Class136 local277 = Static8.aClass136Array1[local271];
				if (local277 != null && local277.anInt3426 != -1) {
					@Pc(312) int local312;
					if (local277.anInt3427 == 1) {
						@Pc(300) Class14_Sub44 local300 = (Class14_Sub44) Static100.aClass125_9.method2630((long) local277.anInt3419);
						if (local300 != null) {
							@Pc(305) Class4_Sub3_Sub3_Sub3_Sub1 local305 = local300.aClass4_Sub3_Sub3_Sub3_Sub1_2;
							local312 = local305.anInt11184 - Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184;
							@Pc(319) int local319 = local305.anInt11178 - Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178;
							if (Static6.aBoolean9) {
								this.method2896(local277.anInt3426, Static481.anInt10749, local312, super.aClass129Array3[0], local319, 92160000, arg0, local30);
							} else {
								this.method2893(92160000, local319, super.aClass129Array3[0], local312, arg0, local277.anInt3426, local30);
							}
						}
					}
					@Pc(373) int local373;
					if (local277.anInt3427 == 2) {
						@Pc(366) int local366 = local277.anInt3425 - Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184;
						local373 = local277.anInt3420 - Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178;
						local312 = local277.anInt3423 << 9;
						local312 *= local312;
						if (Static6.aBoolean9) {
							this.method2896(local277.anInt3426, Static481.anInt10749, local366, super.aClass129Array3[0], local373, local312, arg0, local30);
						} else {
							this.method2893(local312, local373, super.aClass129Array3[0], local366, arg0, local277.anInt3426, local30);
						}
					}
					if (local277.anInt3427 == 10 && local277.anInt3419 >= 0 && local277.anInt3419 < Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4.length) {
						@Pc(440) Class4_Sub3_Sub3_Sub3_Sub2 local440 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local277.anInt3419];
						if (local440 != null) {
							local373 = local440.anInt11184 - Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184;
							local312 = local440.anInt11178 - Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178;
							if (Static6.aBoolean9) {
								this.method2896(local277.anInt3426, Static481.anInt10749, local373, super.aClass129Array3[0], local312, 92160000, arg0, local30);
							} else {
								this.method2893(92160000, local312, super.aClass129Array3[0], local373, arg0, local277.anInt3426, local30);
							}
						}
					}
				}
			}
			local30.method8447(local37);
			local30.method8442(super.anInt11184, super.anInt11182, super.anInt11178);
		}
		local30.method8447(local37);
		local30.method8442(super.anInt11184, -super.anInt3279 + super.anInt11182 - 5, super.anInt11178);
		if (local113 == null) {
			local113 = Static272.method7693(super.aClass129Array3.length, true);
		}
		this.method2883(false, local30, arg0, super.aClass129Array3);
		if (Static6.aBoolean9) {
			for (local271 = 0; local271 < super.aClass129Array3.length; local271++) {
				if (super.aClass129Array3[local271] != null) {
					super.aClass129Array3[local271].method5289(local30, local113.aClass4_Sub1Array1[local271], Static481.anInt10749, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1 == this ? 1 : 0);
				}
			}
		} else {
			for (local271 = 0; super.aClass129Array3.length > local271; local271++) {
				if (super.aClass129Array3[local271] != null) {
					super.aClass129Array3[local271].method5307(local30, local113.aClass4_Sub1Array1[local271], Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass4_Sub8_5 != null) {
			@Pc(646) Class304 local646 = super.aClass4_Sub8_5.method8671();
			if (Static6.aBoolean9) {
				arg0.method6902(local646, Static481.anInt10749);
			} else {
				arg0.method6903(local646);
			}
		}
		for (local271 = 0; local271 < super.aClass129Array3.length; local271++) {
			if (super.aClass129Array3[local271] != null) {
				super.aBoolean240 |= super.aClass129Array3[local271].F();
			}
			super.aClass129Array3[local271] = null;
		}
		super.anInt3262 = Static688.anInt11168;
		return local113;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/lang/String;IZ)V")
	public void method2898(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		this.method2879(Static258.method4324() * Static551.aClass355_1.anInt9857, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method9483() {
		return false;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)Lclient!wp;")
	@Override
	public Class396 method2874() {
		if (super.aClass396_3 != null) {
			if (super.aClass396_3.aString123 == null) {
				return null;
			}
			if (Static242.anInt4629 == 0 || Static242.anInt4629 == 3 || Static242.anInt4629 == 1 && Static597.method8452(this.aString37)) {
				return super.aClass396_3;
			}
		}
		return null;
	}
}

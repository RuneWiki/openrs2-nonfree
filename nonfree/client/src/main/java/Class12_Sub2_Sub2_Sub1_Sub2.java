import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class12_Sub2_Sub2_Sub1_Sub2 extends Class12_Sub2_Sub2_Sub1 {

	@OriginalMember(owner = "client!fb", name = "Qc", descriptor = "I")
	public int anInt2969;

	@OriginalMember(owner = "client!fb", name = "Uc", descriptor = "Ljava/lang/String;")
	public String aString34;

	@OriginalMember(owner = "client!fb", name = "gd", descriptor = "Lclient!sq;")
	public Class325 aClass325_1;

	@OriginalMember(owner = "client!fb", name = "jd", descriptor = "Ljava/lang/String;")
	public String aString35;

	@OriginalMember(owner = "client!fb", name = "md", descriptor = "I")
	private int anInt2983;

	@OriginalMember(owner = "client!fb", name = "zd", descriptor = "I")
	public int anInt2994;

	@OriginalMember(owner = "client!fb", name = "Wc", descriptor = "I")
	public int anInt2973 = -1;

	@OriginalMember(owner = "client!fb", name = "Sc", descriptor = "Z")
	public boolean aBoolean226 = false;

	@OriginalMember(owner = "client!fb", name = "cd", descriptor = "I")
	public int anInt2977 = -1;

	@OriginalMember(owner = "client!fb", name = "Tc", descriptor = "I")
	public int anInt2971 = -1;

	@OriginalMember(owner = "client!fb", name = "ad", descriptor = "Z")
	public boolean aBoolean228 = false;

	@OriginalMember(owner = "client!fb", name = "rd", descriptor = "I")
	public int anInt2988 = -1;

	@OriginalMember(owner = "client!fb", name = "wd", descriptor = "I")
	public int anInt2991 = -1;

	@OriginalMember(owner = "client!fb", name = "kd", descriptor = "I")
	public int anInt2982 = 0;

	@OriginalMember(owner = "client!fb", name = "xd", descriptor = "I")
	public int anInt2992 = 255;

	@OriginalMember(owner = "client!fb", name = "bd", descriptor = "I")
	public int anInt2976 = 0;

	@OriginalMember(owner = "client!fb", name = "ld", descriptor = "Z")
	public boolean aBoolean230 = false;

	@OriginalMember(owner = "client!fb", name = "hd", descriptor = "I")
	public int anInt2981 = -1;

	@OriginalMember(owner = "client!fb", name = "od", descriptor = "I")
	public int anInt2985 = -1;

	@OriginalMember(owner = "client!fb", name = "Fd", descriptor = "I")
	public int anInt2998 = -1;

	@OriginalMember(owner = "client!fb", name = "Bd", descriptor = "I")
	public int anInt2995 = 0;

	@OriginalMember(owner = "client!fb", name = "Zc", descriptor = "Z")
	public boolean aBoolean227 = false;

	@OriginalMember(owner = "client!fb", name = "td", descriptor = "B")
	private byte aByte62 = 0;

	@OriginalMember(owner = "client!fb", name = "yd", descriptor = "I")
	public int anInt2993 = 0;

	@OriginalMember(owner = "client!fb", name = "Hd", descriptor = "B")
	private byte aByte64 = 0;

	@OriginalMember(owner = "client!fb", name = "id", descriptor = "Z")
	public boolean aBoolean229 = false;

	@OriginalMember(owner = "client!fb", name = "sd", descriptor = "Z")
	public boolean aBoolean231 = false;

	@OriginalMember(owner = "client!fb", name = "Gd", descriptor = "I")
	public int anInt2999 = 0;

	@OriginalMember(owner = "client!fb", name = "Ed", descriptor = "B")
	private byte aByte63 = 0;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BIIB)V")
	public void method2432(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt2921 != -1 && Static501.aClass191_2.method4322(super.anInt2921).anInt7922 == 1) {
			super.anInt2921 = -1;
			super.anIntArray234 = null;
		}
		for (@Pc(32) int local32 = 0; local32 < super.aClass84Array3.length; local32++) {
			if (super.aClass84Array3[local32].anInt2468 != -1) {
				@Pc(51) Class60 local51 = Static556.aClass216_2.method5268(super.aClass84Array3[local32].anInt2468);
				if (local51.aBoolean127 && local51.anInt1664 != -1 && Static501.aClass191_2.method4322(local51.anInt1664).anInt7922 == 1) {
					super.aClass84Array3[local32].anInt2468 = -1;
				}
			}
		}
		this.anInt2977 = -1;
		if (arg1 < 0 || arg1 >= Static26.anInt462 || arg0 < 0 || Static445.anInt6140 <= arg0) {
			this.method2442(arg1, arg0);
		} else if (super.anIntArray241[0] >= 0 && super.anIntArray241[0] < Static26.anInt462 && super.anIntArray242[0] >= 0 && super.anIntArray242[0] < Static445.anInt6140) {
			if (arg2 == 2) {
				Static556.method7804(this, arg1, arg0);
			}
			this.method2437(arg1, arg2, arg0);
		} else {
			this.method2442(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class137 arg2) {
		if (this.aClass325_1 == null || !this.method2439(arg2, 131072)) {
			return false;
		}
		@Pc(25) Class26 local25 = arg2.method7923();
		@Pc(30) int local30 = super.aClass139_7.method3204();
		local25.method6444(local30);
		local25.method6443(super.anInt10998, super.anInt10997, super.anInt11002);
		@Pc(43) boolean local43 = false;
		for (@Pc(45) int local45 = 0; local45 < super.aClass80Array3.length; local45++) {
			if (super.aClass80Array3[local45] != null && (Static401.aBoolean511 ? super.aClass80Array3[local45].method6386(arg0, arg1, local25, true, 0, Static331.anInt6277) : super.aClass80Array3[local45].method6380(arg0, arg1, local25, true, 0))) {
				local43 = true;
				break;
			}
		}
		super.aClass80Array3[0] = super.aClass80Array3[1] = super.aClass80Array3[2] = null;
		return local43;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method9160() {
		return false;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLclient!so;)V")
	public void method2433(@OriginalArg(1) Class14_Sub29 arg0) {
		arg0.anInt7264 = 0;
		@Pc(12) int local12 = arg0.method5866();
		this.aByte63 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean228;
		this.aBoolean228 = (local12 & 0x2) != 0;
		@Pc(41) boolean local41 = (local12 & 0x4) != 0;
		@Pc(45) int local45 = super.method2422();
		this.method2415((local12 >> 3 & 0x7) + 1);
		this.aByte64 = (byte) (local12 >> 6 & 0x3);
		super.anInt10998 += this.method2422() - local45 << 8;
		super.anInt11002 += this.method2422() - local45 << 8;
		this.aByte62 = arg0.method5845();
		this.anInt2991 = arg0.method5845();
		this.anInt2988 = arg0.method5845();
		this.aBoolean230 = arg0.method5845() == 1;
		if (Static420.aClass240_5 == Static513.aClass240_7 && Static447.anInt10238 >= 2) {
			this.aBoolean230 = false;
		}
		@Pc(129) int local129 = -1;
		this.anInt2982 = 0;
		@Pc(137) int[] local137 = new int[Static431.aClass180_2.anIntArray390.length];
		@Pc(142) Class110[] local142 = new Class110[Static431.aClass180_2.anIntArray390.length];
		@Pc(147) Class27[] local147 = new Class27[Static431.aClass180_2.anIntArray390.length];
		@Pc(161) int local161;
		@Pc(176) int local176;
		@Pc(182) int local182;
		@Pc(225) int local225;
		for (@Pc(149) int local149 = 0; local149 < Static431.aClass180_2.anIntArray390.length; local149++) {
			if (Static431.aClass180_2.anIntArray390[local149] != 1) {
				local161 = arg0.method5866();
				if (local161 == 0) {
					local137[local149] = 0;
				} else {
					local176 = arg0.method5866();
					local182 = (local161 << 8) + local176;
					if (local149 == 0 && local182 == 65535) {
						local129 = arg0.method5900();
						this.anInt2982 = arg0.method5866();
						break;
					}
					if (local182 >= 32768) {
						local182 = Static603.anIntArray739[local182 - 32768];
						local137[local149] = local182 | 0x40000000;
						local147[local149] = Static175.aClass247_2.method5962(local182);
						local225 = local147[local149].anInt955;
						if (local225 != 0) {
							this.anInt2982 = local225;
						}
					} else {
						local137[local149] = Integer.MIN_VALUE | local182 - 256;
					}
				}
			}
		}
		if (local129 == -1) {
			local161 = arg0.method5900();
			local176 = 0;
			for (local182 = 0; local182 < Static431.aClass180_2.anIntArray390.length; local182++) {
				if (Static431.aClass180_2.anIntArray390[local182] == 0) {
					if ((local161 & 0x1 << local176) != 0) {
						local142[local182] = Static399.method5983(arg0, local147[local182]);
					}
					local176++;
				}
			}
		}
		@Pc(300) int[] local300 = new int[5];
		for (local176 = 0; local176 < 5; local176++) {
			local182 = arg0.method5866();
			if (Static509.aShortArrayArrayArray4.length < 1 || local182 < 0 || Static509.aShortArrayArrayArray4[0][local176].length <= local182) {
				local182 = 0;
			}
			local300[local176] = local182;
		}
		this.anInt2983 = arg0.method5900();
		this.aString34 = arg0.method5898();
		if (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2 == this) {
			Static219.aString46 = this.aString34;
		}
		this.aString35 = this.aString34;
		this.anInt2995 = arg0.method5866();
		if (local41) {
			this.anInt2999 = arg0.method5900();
			this.anInt2985 = -1;
			if (this.anInt2999 == 65535) {
				this.anInt2999 = -1;
			}
			this.anInt2993 = this.anInt2995;
		} else {
			this.anInt2999 = 0;
			this.anInt2993 = arg0.method5866();
			this.anInt2985 = arg0.method5866();
			if (this.anInt2985 == 255) {
				this.anInt2985 = -1;
			}
		}
		local182 = this.anInt2976;
		this.anInt2976 = arg0.method5866();
		@Pc(432) int local432;
		if (this.anInt2976 == 0) {
			Static275.method3998(this);
		} else {
			local225 = this.anInt2998;
			@Pc(429) int local429 = this.anInt2973;
			local432 = this.anInt2981;
			@Pc(435) int local435 = this.anInt2971;
			@Pc(438) int local438 = this.anInt2992;
			this.anInt2998 = arg0.method5900();
			this.anInt2973 = arg0.method5900();
			this.anInt2981 = arg0.method5900();
			this.anInt2971 = arg0.method5900();
			this.anInt2992 = arg0.method5866();
			if (local21 != this.aBoolean228 || this.anInt2976 != local182 || this.anInt2998 != local225 || this.anInt2973 != local429 || this.anInt2981 != local432 || this.anInt2971 != local435 || this.anInt2992 != local438) {
				Static512.method7463(this);
			}
		}
		if (this.aClass325_1 == null) {
			this.aClass325_1 = new Class325();
		}
		local225 = this.aClass325_1.anInt9424;
		@Pc(539) int[] local539 = this.aClass325_1.anIntArray693;
		this.aClass325_1.method7787(this.method2414(), local142, local129, this.aByte63 == 1, local137, local300);
		if (local225 != local129) {
			super.anInt10998 = (super.anIntArray241[0] << 9) + (this.method2422() << 8);
			super.anInt11002 = (super.anIntArray242[0] << 9) + (this.method2422() << 8);
		}
		if (super.anInt2945 == Static568.anInt9800 && local539 != null) {
			for (local432 = 0; local432 < local300.length; local432++) {
				if (local539[local432] != local300[local432]) {
					Static175.aClass247_2.method5953();
					break;
				}
			}
		}
		if (super.aClass12_Sub4_3 != null) {
			super.aClass12_Sub4_3.method1615();
		}
		if (super.anInt2960 == -1 || !super.aBoolean222) {
			return;
		}
		@Pc(654) Class132 local654 = this.method2416();
		if (!local654.method3028(super.anInt2960)) {
			super.aBoolean222 = false;
			super.anInt2960 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLclient!je;IIILclient!ha;I)V")
	@Override
	public void method9166(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class137 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(Lclient!ha;I)Lclient!rn;")
	@Override
	public Class305 method9156(@OriginalArg(0) Class137 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!qja;Lclient!ka;Lclient!ha;IIII)V")
	private void method2436(@OriginalArg(0) int arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class80 arg2, @OriginalArg(3) Class137 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) int local12 = arg0 * arg0 + arg6 * arg6;
		if (local12 < 262144 || arg4 < local12) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg0, (double) arg6) * 2607.5945876176133D - (double) super.aClass139_7.method3204()) & 0x3FFF;
		@Pc(51) Class80 local51 = Static245.method9053(local39, super.anInt2956, super.anInt2897, arg5, super.anInt2928, arg3);
		if (local51 != null) {
			arg3.C(false);
			local51.method6391(arg1, (Class12_Sub1) null, 0);
			arg3.C(true);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBIB)V")
	public void method2437(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		if (super.anInt2964 < 9) {
			super.anInt2964++;
		}
		for (@Pc(22) int local22 = super.anInt2964; local22 > 0; local22--) {
			super.anIntArray241[local22] = super.anIntArray241[local22 - 1];
			super.anIntArray242[local22] = super.anIntArray242[local22 - 1];
			super.aByteArray43[local22] = super.aByteArray43[local22 - 1];
		}
		super.anIntArray241[0] = arg0;
		super.aByteArray43[0] = arg1;
		super.anIntArray242[0] = arg2;
	}

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "(I)Z")
	public boolean method2438() {
		return this.aClass325_1 != null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLclient!ha;I)Z")
	private boolean method2439(@OriginalArg(1) Class137 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1;
		@Pc(20) Class132 local20 = this.method2416();
		@Pc(36) Class275 local36 = super.anInt2921 != -1 && super.anInt2900 == 0 ? Static501.aClass191_2.method4322(super.anInt2921) : null;
		@Pc(56) Class275 local56 = super.anInt2960 == -1 || this.aBoolean226 || super.aBoolean222 && local36 != null ? null : Static501.aClass191_2.method4322(super.anInt2960);
		@Pc(59) int local59 = local20.anInt3655;
		@Pc(62) int local62 = local20.anInt3670;
		if (local59 != 0 || local62 != 0 || local20.anInt3643 != 0 || local20.anInt3645 != 0) {
			arg1 |= 0x7;
		}
		@Pc(87) int local87 = super.aClass139_7.method3204();
		@Pc(106) boolean local106 = super.aByte60 != 0 && super.anInt2962 <= Static87.anInt1951 && super.anInt2936 > Static87.anInt1951;
		if (local106) {
			arg1 |= 0x80000;
		}
		@Pc(150) Class80 local150 = super.aClass80Array3[0] = this.aClass325_1.method7783(super.anInt2958, Static110.aClass197_1, local56, local87, super.aClass351Array3, super.anInt2902, arg0, Static63.aClass37_1, Static501.aClass191_2, super.lb, local36, arg1, super.anInt2942, Static595.aClass241_1, Static372.aClass154_2, super.anIntArray233, Static175.aClass247_2, super.anInt2950, super.anInt2898);
		@Pc(153) int local153 = Static522.method7500();
		if (Static189.anInt3553 < 96 && local153 > 50) {
			Static543.method7678();
		}
		if (Static420.aClass240_5 != Static513.aClass240_7 && local153 < 50) {
			@Pc(184) int local184 = 50 - local153;
			while (local184 > Static608.anInt10278) {
				Static24.aByteArrayArray5[Static608.anInt10278] = new byte[102400];
				Static608.anInt10278++;
			}
			while (Static608.anInt10278 > local184) {
				Static608.anInt10278--;
				Static24.aByteArrayArray5[Static608.anInt10278] = null;
			}
		} else if (Static513.aClass240_7 != Static420.aClass240_5) {
			Static24.aByteArrayArray5 = new byte[50][];
			Static608.anInt10278 = 0;
		}
		if (local150 == null) {
			return false;
		}
		super.anInt2916 = local150.fa();
		super.anInt2951 = local150.ma();
		this.method2427(local150);
		if (local59 == 0 && local62 == 0) {
			this.method2430(0, this.method2422() << 9, 0, this.method2422() << 9, local87);
		} else {
			this.method2430(local20.anInt3662, local59, local20.anInt3658, local62, local87);
			if (super.anInt2956 != 0) {
				local150.FA(super.anInt2956);
			}
			if (super.anInt2897 != 0) {
				local150.VA(super.anInt2897);
			}
			if (super.anInt2928 != 0) {
				local150.H(0, super.anInt2928, 0);
			}
		}
		if (local106) {
			local150.method6394(super.aByte58, super.aByte57, super.aByte61, super.aByte60 & 0xFF);
		}
		if (!this.aBoolean226) {
			this.method2426(local20, local62, local87, local16, local59, arg0);
		}
		return true;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9164(@OriginalArg(1) Class137 arg0) {
		if (this.aClass325_1 == null || !super.aBoolean225 && !this.method2439(arg0, 0)) {
			return;
		}
		@Pc(28) Class26 local28 = arg0.method7923();
		local28.method6444(super.aClass139_7.method3204());
		local28.method6443(super.anInt10998, super.anInt10997 - 5, super.anInt11002);
		this.method2418(arg0, super.aBoolean225, local28, super.aClass80Array3);
		for (@Pc(55) int local55 = 0; super.aClass80Array3.length > local55; local55++) {
			super.aClass80Array3[local55] = null;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!ha;I)Lclient!maa;")
	@Override
	public Class12_Sub8 method9151(@OriginalArg(0) Class137 arg0) {
		if (this.aClass325_1 == null || !this.method2439(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class26 local19 = arg0.method7923();
		@Pc(24) int local24 = super.aClass139_7.method3204();
		local19.method6444(local24);
		@Pc(42) Class58 local42 = Static486.aClass58ArrayArrayArray2[super.aByte146][super.anInt10998 >> Static579.anInt9935][super.anInt11002 >> Static579.anInt9935];
		if (local42 == null || local42.aClass12_Sub2_Sub4_1 == null) {
			super.anInt2939 = (int) ((float) super.anInt2939 - (float) super.anInt2939 / 10.0F);
		} else {
			@Pc(69) int local69 = super.anInt2939 - local42.aClass12_Sub2_Sub4_1.aShort87;
			super.anInt2939 = (int) ((float) super.anInt2939 - (float) local69 / 10.0F);
		}
		local19.method6443(super.anInt10998, -super.anInt2939 + super.anInt10997 - 20, super.anInt11002);
		@Pc(102) Class12_Sub8 local102 = null;
		super.aBoolean224 = false;
		if (Static56.aClass14_Sub22_5.aClass21_Sub10_1.method2383() == 1) {
			@Pc(115) Class132 local115 = this.method2416();
			if (local115.aBoolean277 && (this.aClass325_1.anInt9424 == -1 || Static63.aClass37_1.method974(this.aClass325_1.anInt9424).aBoolean616)) {
				@Pc(147) Class275 local147 = super.anInt2921 != -1 && super.anInt2900 == 0 ? Static501.aClass191_2.method4322(super.anInt2921) : null;
				@Pc(168) Class275 local168 = super.anInt2960 == -1 || this.aBoolean226 || super.aBoolean222 && local147 != null ? null : Static501.aClass191_2.method4322(super.anInt2960);
				@Pc(200) Class80 local200 = Static501.method7350(local24, arg0, super.anInt2956, 0, local168 == null ? local147 : local168, 160, local168 == null ? super.anInt2902 : super.anInt2942, super.anInt2928, 1, 0, 240, super.aClass80Array3[0], super.anInt2897);
				if (local200 != null) {
					local102 = Static291.method4323(true, super.aClass80Array3.length + 1);
					super.aBoolean224 = true;
					arg0.C(false);
					if (Static401.aBoolean511) {
						local200.method6375(local19, local102.aClass12_Sub1Array1[super.aClass80Array3.length], Static331.anInt6277, 0);
					} else {
						local200.method6391(local19, local102.aClass12_Sub1Array1[super.aClass80Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(253) int local253;
		if (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2 == this) {
			for (local253 = Static590.aClass390Array1.length - 1; local253 >= 0; local253--) {
				@Pc(259) Class390 local259 = Static590.aClass390Array1[local253];
				if (local259 != null && local259.anInt11110 != -1) {
					@Pc(290) int local290;
					if (local259.anInt11100 == 1) {
						@Pc(278) Class14_Sub44 local278 = (Class14_Sub44) Static579.aClass187_73.method4078((long) local259.anInt11103);
						if (local278 != null) {
							@Pc(283) Class12_Sub2_Sub2_Sub1_Sub1 local283 = local278.aClass12_Sub2_Sub2_Sub1_Sub1_2;
							local290 = local283.anInt10998 - Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998;
							@Pc(297) int local297 = local283.anInt11002 - Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002;
							if (Static401.aBoolean511) {
								this.method2444(local290, super.aClass80Array3[0], local259.anInt11110, 92160000, local19, Static331.anInt6277, local297, arg0);
							} else {
								this.method2436(local290, local19, super.aClass80Array3[0], arg0, 92160000, local259.anInt11110, local297);
							}
						}
					}
					@Pc(348) int local348;
					if (local259.anInt11100 == 2) {
						@Pc(341) int local341 = local259.anInt11107 - Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998;
						local348 = local259.anInt11105 - Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002;
						local290 = local259.anInt11099 << 9;
						local290 *= local290;
						if (Static401.aBoolean511) {
							this.method2444(local341, super.aClass80Array3[0], local259.anInt11110, local290, local19, Static331.anInt6277, local348, arg0);
						} else {
							this.method2436(local341, local19, super.aClass80Array3[0], arg0, local290, local259.anInt11110, local348);
						}
					}
					if (local259.anInt11100 == 10 && local259.anInt11103 >= 0 && Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1.length > local259.anInt11103) {
						@Pc(412) Class12_Sub2_Sub2_Sub1_Sub2 local412 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local259.anInt11103];
						if (local412 != null) {
							local348 = local412.anInt10998 - Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998;
							local290 = local412.anInt11002 - Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002;
							if (Static401.aBoolean511) {
								this.method2444(local348, super.aClass80Array3[0], local259.anInt11110, 92160000, local19, Static331.anInt6277, local290, arg0);
							} else {
								this.method2436(local348, local19, super.aClass80Array3[0], arg0, 92160000, local259.anInt11110, local290);
							}
						}
					}
				}
			}
			local19.method6444(local24);
			local19.method6443(super.anInt10998, super.anInt10997, super.anInt11002);
		}
		local19.method6444(local24);
		local19.method6443(super.anInt10998, -super.anInt2939 + super.anInt10997 - 5, super.anInt11002);
		if (local102 == null) {
			local102 = Static291.method4323(true, super.aClass80Array3.length);
		}
		this.method2418(arg0, false, local19, super.aClass80Array3);
		if (Static401.aBoolean511) {
			for (local253 = 0; super.aClass80Array3.length > local253; local253++) {
				if (super.aClass80Array3[local253] != null) {
					super.aClass80Array3[local253].method6375(local19, local102.aClass12_Sub1Array1[local253], Static331.anInt6277, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local253 = 0; super.aClass80Array3.length > local253; local253++) {
				if (super.aClass80Array3[local253] != null) {
					super.aClass80Array3[local253].method6391(local19, local102.aClass12_Sub1Array1[local253], Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass12_Sub4_3 != null) {
			@Pc(593) Class196 local593 = super.aClass12_Sub4_3.method1613();
			if (Static401.aBoolean511) {
				arg0.method7942(local593, Static331.anInt6277);
			} else {
				arg0.method7917(local593);
			}
		}
		for (local253 = 0; super.aClass80Array3.length > local253; local253++) {
			if (super.aClass80Array3[local253] != null) {
				super.aBoolean224 |= super.aClass80Array3[local253].F();
			}
			super.aClass80Array3[local253] = null;
		}
		super.anInt2926 = Static274.anInt4757;
		return local102;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method2440() {
		@Pc(7) String local7 = "";
		if (Static612.aStringArray41 != null) {
			local7 = local7 + Static612.aStringArray41[this.aByte64];
		}
		@Pc(31) int[] local31;
		if (this.aByte63 == 1 && Static333.anIntArray457 != null) {
			local31 = Static333.anIntArray457;
		} else {
			local31 = Static508.anIntArray662;
		}
		if (local31 != null && local31[this.aByte64] != -1) {
			@Pc(51) Class61 local51 = Static202.aClass172_1.method3783(local31[this.aByte64]);
			if (local51.aChar1 == 's') {
				local7 = local7 + local51.method1493(this.aByte62 & 0xFF);
			} else {
				Static524.method7532("gdn1", new Throwable());
				local31[this.aByte64] = -1;
			}
		}
		local7 = local7 + this.aString34;
		if (Static633.aStringArray45 != null) {
			local7 = local7 + Static633.aStringArray45[this.aByte64];
		}
		return local7;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)I")
	@Override
	public int method2422() {
		return this.aClass325_1 == null || this.aClass325_1.anInt9424 == -1 ? super.method2422() : Static63.aClass37_1.method974(this.aClass325_1.anInt9424).anInt8617;
	}

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)V")
	@Override
	public void method9158() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIB)V")
	public void method2442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt2967 = 0;
		super.anIntArray241[0] = arg0;
		super.anInt2964 = 0;
		super.anInt2966 = 0;
		super.anIntArray242[0] = arg1;
		@Pc(32) int local32 = this.method2422();
		super.anInt10998 = local32 * 256 + super.anIntArray241[0] * 512;
		super.anInt11002 = local32 * 256 + super.anIntArray242[0] * 512;
		if (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2 == this) {
			Static677.method9300();
		}
		if (super.aClass12_Sub4_3 != null) {
			super.aClass12_Sub4_3.method1615();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method2443() {
		return this.aString35;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILclient!ka;IILclient!qja;IILclient!ha;)V")
	private void method2444(@OriginalArg(0) int arg0, @OriginalArg(2) Class80 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class26 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class137 arg7) {
		@Pc(15) int local15 = arg6 * arg6 + arg0 * arg0;
		if (local15 < 262144 || local15 > arg3) {
			return;
		}
		@Pc(41) int local41 = (int) (Math.atan2((double) arg0, (double) arg6) * 2607.5945876176133D - (double) super.aClass139_7.method3204()) & 0x3FFF;
		@Pc(53) Class80 local53 = Static245.method9053(local41, super.anInt2956, super.anInt2897, arg2, super.anInt2928, arg7);
		if (local53 != null) {
			arg7.C(false);
			local53.method6375(arg4, (Class12_Sub1) null, arg5, 0);
			arg7.C(true);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)I")
	@Override
	protected int method2414() {
		return this.anInt2983;
	}

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "(I)I")
	@Override
	public int method2421() {
		return -1;
	}
}

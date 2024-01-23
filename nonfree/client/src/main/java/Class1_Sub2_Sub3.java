import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bl", name = "O", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!bl", name = "T", descriptor = "[I")
	private int[] anIntArray61;

	@OriginalMember(owner = "client!bl", name = "L", descriptor = "Lclient!tl;")
	private Class1_Sub3 aClass1_Sub3_2;

	@OriginalMember(owner = "client!bl", name = "P", descriptor = "Lclient!tl;")
	private Class1_Sub3 aClass1_Sub3_3;

	@OriginalMember(owner = "client!bl", name = "F", descriptor = "Lclient!tl;")
	private Class1_Sub3 aClass1_Sub3_1;

	@OriginalMember(owner = "client!bl", name = "M", descriptor = "[Lclient!tl;")
	private Class1_Sub3[] aClass1_Sub3Array5;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!ql;)V")
	public Class1_Sub2_Sub3(@OriginalArg(0) Class1_Sub13 arg0) {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9 = arg0.method1772();
		this.aClass1_Sub3Array5 = new Class1_Sub3[local9];
		@Pc(15) int local15 = 0;
		@Pc(18) int[][] local18 = new int[local9][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local9; local20++) {
			@Pc(26) Class1_Sub3 local26 = Static133.method2492(arg0);
			if (local26.method4122() >= 0) {
				local5++;
			}
			if (local26.method4126() >= 0) {
				local15++;
			}
			@Pc(43) int local43 = local26.aClass1_Sub3Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method1772();
			}
			this.aClass1_Sub3Array5[local20] = local26;
		}
		this.anIntArray61 = new int[local5];
		this.anIntArray60 = new int[local15];
		local5 = 0;
		local15 = 0;
		for (@Pc(95) int local95 = 0; local95 < local9; local95++) {
			@Pc(102) Class1_Sub3 local102 = this.aClass1_Sub3Array5[local95];
			local50 = local102.aClass1_Sub3Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass1_Sub3Array42[local108] = this.aClass1_Sub3Array5[local18[local95][local108]];
			}
			@Pc(130) int local130 = local102.method4122();
			@Pc(134) int local134 = local102.method4126();
			if (local130 > 0) {
				this.anIntArray61[local5++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray60[local15++] = local134;
			}
			local18[local95] = null;
		}
		this.aClass1_Sub3_3 = this.aClass1_Sub3Array5[arg0.method1772()];
		this.aClass1_Sub3_1 = this.aClass1_Sub3Array5[arg0.method1772()];
		this.aClass1_Sub3_2 = this.aClass1_Sub3Array5[arg0.method1772()];
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!hc;Lclient!v;I)Z")
	public boolean method501(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Interface4 arg1) {
		@Pc(12) int local12;
		if (Static264.anInt5541 <= 0) {
			for (local12 = 0; local12 < this.anIntArray61.length; local12++) {
				if (!arg0.method1868(this.anIntArray61[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray61.length; local12++) {
				if (!arg0.method1862(Static264.anInt5541, this.anIntArray61[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray60.length; local12++) {
			if (!arg1.method377(this.anIntArray60[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!hc;ILclient!v;ZDZ)Lclient!dc;")
	public Class1_Sub2_Sub4_Sub1_Sub1 method502(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface4 arg3, @OriginalArg(5) double arg4) {
		Static180.method3110(arg4);
		Static262.anInterface4_1 = arg3;
		Static115.aClass51_38 = arg1;
		Static67.method1316(arg2, arg0);
		@Pc(27) Class1_Sub2_Sub4_Sub1_Sub1 local27 = new Class1_Sub2_Sub4_Sub1_Sub1(arg0, arg2);
		for (@Pc(29) int local29 = 0; local29 < this.aClass1_Sub3Array5.length; local29++) {
			this.aClass1_Sub3Array5[local29].method4119(arg2, arg0);
		}
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < arg2; local53++) {
			@Pc(73) int[] local73;
			@Pc(75) int[] local75;
			@Pc(77) int[] local77;
			@Pc(71) int[] local71;
			if (this.aClass1_Sub3_3.aBoolean275) {
				local71 = this.aClass1_Sub3_3.method4123(local53);
				local73 = local71;
				local75 = local71;
				local77 = local71;
			} else {
				@Pc(85) int[][] local85 = this.aClass1_Sub3_3.method4120(local53);
				local77 = local85[2];
				local73 = local85[0];
				local75 = local85[1];
			}
			if (this.aClass1_Sub3_1.aBoolean275) {
				local71 = this.aClass1_Sub3_1.method4123(local53);
			} else {
				local71 = this.aClass1_Sub3_1.method4120(local53)[0];
			}
			for (@Pc(121) int local121 = arg0 - 1; local121 >= 0; local121--) {
				@Pc(129) int local129 = local75[local121] >> 4;
				if (local129 > 255) {
					local129 = 255;
				}
				@Pc(140) int local140 = local73[local121] >> 4;
				if (local129 < 0) {
					local129 = 0;
				}
				local129 = Static89.anIntArray180[local129];
				@Pc(154) int local154 = local77[local121] >> 4;
				if (local154 > 255) {
					local154 = 255;
				}
				if (local140 > 255) {
					local140 = 255;
				}
				if (local154 < 0) {
					local154 = 0;
				}
				if (local140 < 0) {
					local140 = 0;
				}
				local140 = Static89.anIntArray180[local140];
				local154 = Static89.anIntArray180[local154];
				@Pc(199) int local199;
				if (local140 == 0 && local129 == 0 && local154 == 0) {
					local199 = 0;
				} else {
					local199 = local71[local121] >> 4;
					if (local199 > 255) {
						local199 = 255;
					}
					if (local199 < 0) {
						local199 = 0;
					}
				}
				local27.anIntArray94[local51++] = local154 + (local140 << 16) + (local199 << 24) + (local129 << 8);
			}
		}
		for (@Pc(257) int local257 = 0; local257 < this.aClass1_Sub3Array5.length; local257++) {
			this.aClass1_Sub3Array5[local257].method4128();
		}
		return local27;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!hc;ZLclient!v;IIZBD)[I")
	public int[] method503(@OriginalArg(0) Class51 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) double arg6) {
		Static180.method3110(arg6);
		Static115.aClass51_38 = arg0;
		Static262.anInterface4_1 = arg2;
		Static67.method1316(arg3, arg4);
		for (@Pc(23) int local23 = 0; local23 < this.aClass1_Sub3Array5.length; local23++) {
			this.aClass1_Sub3Array5[local23].method4119(arg3, arg4);
		}
		@Pc(46) int[] local46 = new int[arg3 * arg4];
		@Pc(52) int local52;
		@Pc(54) int local54;
		@Pc(50) byte local50;
		if (arg5) {
			local54 = -1;
			local52 = arg4 - 1;
			local50 = -1;
		} else {
			local50 = 1;
			local52 = 0;
			local54 = arg4;
		}
		@Pc(66) int local66 = 0;
		for (@Pc(68) int local68 = 0; local68 < arg3; local68++) {
			if (arg1) {
				local66 = local68;
			}
			@Pc(88) int[] local88;
			@Pc(90) int[] local90;
			@Pc(86) int[] local86;
			if (this.aClass1_Sub3_3.aBoolean275) {
				@Pc(84) int[] local84 = this.aClass1_Sub3_3.method4123(local68);
				local86 = local84;
				local88 = local84;
				local90 = local84;
			} else {
				@Pc(98) int[][] local98 = this.aClass1_Sub3_3.method4120(local68);
				local88 = local98[0];
				local86 = local98[2];
				local90 = local98[1];
			}
			for (@Pc(112) int local112 = local52; local112 != local54; local112 += local50) {
				@Pc(120) int local120 = local88[local112] >> 4;
				@Pc(126) int local126 = local90[local112] >> 4;
				if (local120 > 255) {
					local120 = 255;
				}
				if (local126 > 255) {
					local126 = 255;
				}
				if (local120 < 0) {
					local120 = 0;
				}
				@Pc(151) int local151 = local86[local112] >> 4;
				local120 = Static89.anIntArray180[local120];
				if (local151 > 255) {
					local151 = 255;
				}
				if (local151 < 0) {
					local151 = 0;
				}
				local151 = Static89.anIntArray180[local151];
				if (local126 < 0) {
					local126 = 0;
				}
				local126 = Static89.anIntArray180[local126];
				local46[local66++] = local151 + (local126 << 8) + (local120 << 16);
				if (arg1) {
					local66 += arg4 - 1;
				}
			}
		}
		for (@Pc(224) int local224 = 0; local224 < this.aClass1_Sub3Array5.length; local224++) {
			this.aClass1_Sub3Array5[local224].method4128();
		}
		return local46;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIZLclient!hc;Lclient!v;DI)Lclient!q;")
	public Class1_Sub2_Sub4_Sub1 method504(@OriginalArg(0) int arg0, @OriginalArg(3) Class51 arg1, @OriginalArg(4) Interface4 arg2, @OriginalArg(5) double arg3, @OriginalArg(6) int arg4) {
		Static180.method3110(arg3);
		Static115.aClass51_38 = arg1;
		Static262.anInterface4_1 = arg2;
		Static67.method1316(arg0, arg4);
		@Pc(18) Class1_Sub2_Sub4_Sub1 local18 = new Class1_Sub2_Sub4_Sub1(arg4, arg0);
		for (@Pc(20) int local20 = 0; local20 < this.aClass1_Sub3Array5.length; local20++) {
			this.aClass1_Sub3Array5[local20].method4119(arg0, arg4);
		}
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg0; local46++) {
			@Pc(70) int[] local70;
			@Pc(74) int[] local74;
			@Pc(66) int[] local66;
			if (this.aClass1_Sub3_3.aBoolean275) {
				@Pc(82) int[] local82 = this.aClass1_Sub3_3.method4123(local46);
				local70 = local82;
				local66 = local82;
				local74 = local82;
			} else {
				@Pc(62) int[][] local62 = this.aClass1_Sub3_3.method4120(local46);
				local66 = local62[2];
				local70 = local62[0];
				local74 = local62[1];
			}
			for (@Pc(90) int local90 = 0; local90 != arg4; local90++) {
				@Pc(98) int local98 = local70[local90] >> 4;
				if (local98 > 255) {
					local98 = 255;
				}
				@Pc(111) int local111 = local74[local90] >> 4;
				@Pc(117) int local117 = local66[local90] >> 4;
				if (local98 < 0) {
					local98 = 0;
				}
				if (local111 > 255) {
					local111 = 255;
				}
				if (local117 > 255) {
					local117 = 255;
				}
				if (local111 < 0) {
					local111 = 0;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				local111 = Static89.anIntArray180[local111];
				local117 = Static89.anIntArray180[local117];
				local98 = Static89.anIntArray180[local98];
				local18.anIntArray94[local44++] = local117 + (local111 << 8) + (local98 << 16);
			}
		}
		for (@Pc(195) int local195 = 0; local195 < this.aClass1_Sub3Array5.length; local195++) {
			this.aClass1_Sub3Array5[local195].method4128();
		}
		return local18;
	}
}

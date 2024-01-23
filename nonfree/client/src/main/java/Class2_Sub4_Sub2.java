import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class2_Sub4_Sub2 extends Class2_Sub4 {

	@OriginalMember(owner = "client!jh", name = "oc", descriptor = "Lclient!tf;")
	public Class167 aClass167_1;

	@OriginalMember(owner = "client!jh", name = "Mc", descriptor = "Ljava/lang/String;")
	public String aString180;

	@OriginalMember(owner = "client!jh", name = "Vc", descriptor = "Ljava/lang/String;")
	public String aString182;

	@OriginalMember(owner = "client!jh", name = "tc", descriptor = "Z")
	public boolean aBoolean182 = false;

	@OriginalMember(owner = "client!jh", name = "xc", descriptor = "I")
	public int anInt2863 = -1;

	@OriginalMember(owner = "client!jh", name = "yc", descriptor = "I")
	public int anInt2864 = -1;

	@OriginalMember(owner = "client!jh", name = "pc", descriptor = "I")
	public int anInt2857 = 0;

	@OriginalMember(owner = "client!jh", name = "Jc", descriptor = "I")
	public int anInt2873 = -1;

	@OriginalMember(owner = "client!jh", name = "Lc", descriptor = "I")
	public int anInt2874 = 0;

	@OriginalMember(owner = "client!jh", name = "Ic", descriptor = "I")
	public int anInt2872 = -1;

	@OriginalMember(owner = "client!jh", name = "Hc", descriptor = "B")
	private byte aByte13 = 0;

	@OriginalMember(owner = "client!jh", name = "zc", descriptor = "I")
	public int anInt2865 = -1;

	@OriginalMember(owner = "client!jh", name = "Oc", descriptor = "I")
	public int anInt2876 = 0;

	@OriginalMember(owner = "client!jh", name = "qc", descriptor = "I")
	public int anInt2858 = -1;

	@OriginalMember(owner = "client!jh", name = "Yc", descriptor = "I")
	public int anInt2883 = 255;

	@OriginalMember(owner = "client!jh", name = "Cc", descriptor = "I")
	public int anInt2867 = 0;

	@OriginalMember(owner = "client!jh", name = "Xc", descriptor = "I")
	public int anInt2882 = 0;

	@OriginalMember(owner = "client!jh", name = "Zc", descriptor = "I")
	public int anInt2884 = -1;

	@OriginalMember(owner = "client!jh", name = "bd", descriptor = "B")
	private byte aByte14 = 0;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean176) {
			if (this.aClass167_1 == null) {
				return;
			}
			@Pc(24) Class32 local24 = this.anInt2822 != -1 && this.anInt2830 == 0 ? Static202.method3231(this.anInt2822) : null;
			@Pc(52) Class32 local52 = this.anInt2820 == -1 || this.aBoolean182 || this.anInt2820 == this.method2095().anInt3138 && local24 != null ? null : Static202.method3231(this.anInt2820);
			@Pc(75) Class2_Sub1 local75 = this.aClass167_1.method4027(local52, this.anInt2776, local24, this.anInt2812, this.anInt2800, false, this.anInt2845, this.anInt2826, false, this.anInt2829, this.aClass36Array3);
			if (local75 == null) {
				return;
			}
			this.method2103(null, local75);
		}
		if (this.aClass34_Sub1_4 != null) {
			this.aClass34_Sub1_4.method860(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method2104(@OriginalArg(0) boolean arg0) {
		@Pc(7) String local7 = "";
		if (Static137.aStringArray23 != null) {
			local7 = local7 + Static137.aStringArray23[this.aByte13];
		}
		if (Static170.anIntArray342 != null && Static170.anIntArray342[this.aByte13] != -1) {
			@Pc(45) Class1_Sub3_Sub14 local45 = Static94.method1608(Static170.anIntArray342[this.aByte13]);
			if (local45.aChar3 == 's') {
				local7 = local7 + local45.method2804(this.aByte14 & 0xFF);
			} else {
				Static66.method3525(new Throwable(), "gdn1");
				Static170.anIntArray342[this.aByte13] = -1;
			}
		}
		if (arg0) {
			local7 = local7 + this.aString180;
		} else {
			local7 = local7 + this.aString182;
		}
		if (Static282.aStringArray44 != null) {
			local7 = local7 + Static282.aStringArray44[this.aByte13];
		}
		return local7;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!o;IIIILclient!dc;IIIIIIBII)V")
	private void method2106(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class34_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		@Pc(18) int local18 = arg5 * arg5 + arg14 * arg14;
		if (local18 < 16 || arg11 < local18) {
			return;
		}
		@Pc(42) int local42 = (int) (Math.atan2((double) arg5, (double) arg14) * 325.949D) & 0x7FF;
		@Pc(54) Class2_Sub1 local54 = Static38.method797(this.anInt2794, this.anInt2846, arg7, arg1, this.anInt2788, local42);
		if (local54 == null) {
			return;
		}
		if (!Static294.aBoolean367) {
			local54.method3951(0, arg12, arg2, arg13, arg9, arg10, arg0, arg4, -1L, arg3, arg6);
			return;
		}
		@Pc(75) float local75 = Static294.method4516();
		@Pc(77) float local77 = Static294.method4503();
		Static294.method4492();
		Static294.method4513(local75, local77 - 150.0F);
		local54.method3951(0, arg12, arg2, arg13, arg9, arg10, arg0, arg4, -1L, arg3, arg6);
		Static294.method4495();
		Static294.method4513(local75, local77);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZLclient!qm;I)V")
	public void method2108(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		arg0.anInt3000 = 0;
		@Pc(12) int local12 = arg0.method2199();
		@Pc(16) int local16 = local12 & 0x1;
		@Pc(27) boolean local27 = (local12 & 0x4) != 0;
		@Pc(38) boolean local38 = (local12 & 0x2) != 0;
		@Pc(42) int local42 = super.method2088();
		this.method2089((local12 >> 3 & 0x7) + 1);
		this.aByte13 = (byte) (local12 >> 6 & 0x3);
		@Pc(62) int local62 = -1;
		this.anInt2846 += (this.method2088() - local42) * 64;
		this.anInt2794 += (this.method2088() - local42) * 64;
		this.aByte14 = arg0.method2212();
		this.anInt2865 = arg0.method2212();
		this.anInt2858 = arg0.method2212();
		@Pc(105) int[] local105 = new int[12];
		this.anInt2857 = 0;
		@Pc(117) int local117;
		@Pc(133) int local133;
		@Pc(139) int local139;
		@Pc(178) int local178;
		for (@Pc(110) int local110 = 0; local110 < 12; local110++) {
			local117 = arg0.method2199();
			if (local117 == 0) {
				local105[local110] = 0;
			} else {
				local133 = arg0.method2199();
				local139 = local133 + (local117 << 8);
				if (local110 == 0 && local139 == 65535) {
					local62 = arg0.method2244();
					this.anInt2857 = arg0.method2199();
					break;
				}
				if (local139 < 32768) {
					local105[local110] = local139 - 256 | Integer.MIN_VALUE;
				} else {
					local139 = Static194.anIntArray369[local139 - 32768];
					local105[local110] = local139 | 0x40000000;
					local178 = Static56.method1050(local139).anInt1781;
					if (local178 != 0) {
						this.anInt2857 = local178;
					}
				}
			}
		}
		@Pc(199) int[] local199 = new int[5];
		for (local117 = 0; local117 < 5; local117++) {
			local133 = arg0.method2199();
			if (local133 < 0 || Static211.aShortArrayArray9[local117].length <= local133) {
				local133 = 0;
			}
			local199[local117] = local133;
		}
		this.anInt2832 = arg0.method2244();
		this.aString180 = arg0.method2237();
		if (local38) {
			this.aString182 = arg0.method2237();
		} else {
			this.aString182 = this.aString180;
		}
		this.anInt2867 = arg0.method2199();
		if (local27) {
			this.anInt2876 = arg0.method2244();
			this.anInt2874 = this.anInt2867;
			this.anInt2884 = -1;
		} else {
			this.anInt2876 = 0;
			this.anInt2874 = arg0.method2199();
			this.anInt2884 = arg0.method2199();
			if (this.anInt2884 == 255) {
				this.anInt2884 = -1;
			}
		}
		local117 = this.anInt2882;
		this.anInt2882 = arg0.method2199();
		if (this.anInt2882 == 0) {
			Static83.method1428(this, arg1);
		} else {
			local139 = this.anInt2873;
			local133 = this.anInt2872;
			@Pc(313) int local313 = this.anInt2883;
			local178 = this.anInt2863;
			@Pc(319) int local319 = this.anInt2864;
			this.anInt2872 = arg0.method2244();
			this.anInt2873 = arg0.method2244();
			this.anInt2863 = arg0.method2244();
			this.anInt2864 = arg0.method2244();
			this.anInt2883 = arg0.method2199();
			if (local117 != this.anInt2882 || this.anInt2872 != local133 || this.anInt2873 != local139 || this.anInt2863 != local178 || local319 != this.anInt2864 || this.anInt2883 != local313) {
				Static175.method290(this, arg1);
			}
		}
		if (this.aClass167_1 == null) {
			this.aClass167_1 = new Class167();
		}
		local133 = this.aClass167_1.anInt5337;
		this.aClass167_1.method4028(local199, local62, this.anInt2832, local105, local16 == 1);
		if (local133 != local62) {
			this.anInt2846 = this.anIntArray283[0] * 128 + this.method2088() * 64;
			this.anInt2794 = this.anIntArray286[0] * 128 + this.method2088() * 64;
		}
		if (this.aClass34_Sub1_4 != null) {
			this.aClass34_Sub1_4.method869();
		}
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)I")
	@Override
	public int method2102() {
		return -1;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)I")
	@Override
	public int method2088() {
		return this.aClass167_1 == null || this.aClass167_1.anInt5337 == -1 ? super.method2088() : Static197.method3172(this.aClass167_1.anInt5337).anInt4909;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "()I")
	@Override
	public int method3948() {
		return this.anInt2813;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIIIJILclient!dc;)V")
	@Override
	public void method3951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class34_Sub1 arg10) {
		if (this.aClass167_1 == null) {
			return;
		}
		@Pc(24) Class32 local24 = this.anInt2822 != -1 && this.anInt2830 == 0 ? Static202.method3231(this.anInt2822) : null;
		@Pc(28) Class91 local28 = this.method2095();
		@Pc(53) boolean local53 = local28.anInt3156 != 0 || local28.anInt3145 != 0 || local28.anInt3121 != 0 || local28.anInt3139 != 0;
		@Pc(81) Class32 local81 = this.anInt2820 == -1 || this.aBoolean182 || this.anInt2820 == this.method2095().anInt3138 && local24 != null ? null : Static202.method3231(this.anInt2820);
		@Pc(104) Class2_Sub1 local104 = this.aClass167_1.method4027(local81, this.anInt2776, local24, this.anInt2812, this.anInt2800, true, this.anInt2845, this.anInt2826, local53, this.anInt2829, this.aClass36Array3);
		@Pc(107) int local107 = Static200.method3204();
		if (Static294.aBoolean367 && Static196.anInt4274 < 96 && local107 > 50) {
			Static187.method3025();
		}
		@Pc(133) int local133;
		if (Static159.anInt3534 != 0 && local107 < 50) {
			local133 = 50 - local107;
			while (Static194.anInt4265 < local133) {
				Static271.aByteArrayArray17[Static194.anInt4265] = new byte[102400];
				Static194.anInt4265++;
			}
			while (local133 < Static194.anInt4265) {
				Static194.anInt4265--;
				Static271.aByteArrayArray17[Static194.anInt4265] = null;
			}
		}
		if (local104 == null) {
			return;
		}
		this.anInt2813 = local104.method3948();
		@Pc(214) Class2_Sub1 local214;
		if (Static35.aBoolean65 && (this.aClass167_1.anInt5337 == -1 || Static197.method3172(this.aClass167_1.anInt5337).aBoolean302)) {
			local214 = Static135.method2295(240, this.anInt2794, arg0, 0, 1, this.aBoolean178, local81 == null ? local24 : local81, 0, local104, this.anInt2788, 160, local81 == null ? this.anInt2800 : this.anInt2826, this.anInt2846);
			if (Static294.aBoolean367) {
				@Pc(233) float local233 = Static294.method4516();
				@Pc(235) float local235 = Static294.method4503();
				Static294.method4492();
				Static294.method4513(local233, local235 - 150.0F);
				local214.method3951(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
				Static294.method4495();
				Static294.method4513(local233, local235);
			} else {
				local214.method3951(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
			}
		}
		if (Static56.aClass2_Sub4_Sub2_1 == this) {
			for (local133 = Static170.aClass64Array1.length - 1; local133 >= 0; local133--) {
				@Pc(273) Class64 local273 = Static170.aClass64Array1[local133];
				if (local273 != null && local273.anInt2089 != -1) {
					@Pc(316) int local316;
					@Pc(327) int local327;
					if (local273.anInt2092 == 1 && local273.anInt2090 >= 0 && local273.anInt2090 < Static105.aClass2_Sub4_Sub1Array1.length) {
						@Pc(304) Class2_Sub4_Sub1 local304 = Static105.aClass2_Sub4_Sub1Array1[local273.anInt2090];
						if (local304 != null) {
							local316 = local304.anInt2846 / 32 - Static56.aClass2_Sub4_Sub2_1.anInt2846 / 32;
							local327 = local304.anInt2794 / 32 - Static56.aClass2_Sub4_Sub2_1.anInt2794 / 32;
							this.method2106(arg6, local104, arg2, arg9, arg7, local316, null, local273.anInt2089, arg0, arg4, arg5, 360000, arg1, arg3, local327);
						}
					}
					if (local273.anInt2092 == 2) {
						@Pc(367) int local367 = (local273.anInt2097 - Static159.anInt3527) * 4 + 2 - Static56.aClass2_Sub4_Sub2_1.anInt2846 / 32;
						local316 = (local273.anInt2095 - Static217.anInt4673) * 4 + 2 - Static56.aClass2_Sub4_Sub2_1.anInt2794 / 32;
						local327 = local273.anInt2093 * 4;
						local327 *= local327;
						this.method2106(arg6, local104, arg2, arg9, arg7, local367, null, local273.anInt2089, arg0, arg4, arg5, local327, arg1, arg3, local316);
					}
					if (local273.anInt2092 == 10 && local273.anInt2090 >= 0 && Static155.aClass2_Sub4_Sub2Array1.length > local273.anInt2090) {
						@Pc(437) Class2_Sub4_Sub2 local437 = Static155.aClass2_Sub4_Sub2Array1[local273.anInt2090];
						if (local437 != null) {
							local316 = local437.anInt2846 / 32 - Static56.aClass2_Sub4_Sub2_1.anInt2846 / 32;
							local327 = local437.anInt2794 / 32 - Static56.aClass2_Sub4_Sub2_1.anInt2794 / 32;
							this.method2106(arg6, local104, arg2, arg9, arg7, local316, null, local273.anInt2089, arg0, arg4, arg5, 360000, arg1, arg3, local327);
						}
					}
				}
			}
		}
		local214 = null;
		this.method2094(local104);
		this.method2099(arg0, local104);
		if (!this.aBoolean182 && this.anInt2825 != -1 && this.anInt2837 != -1) {
			@Pc(513) Class94 local513 = Static28.method611(this.anInt2825);
			local214 = local513.method2423(this.anInt2808, this.anInt2837, this.anInt2785);
			if (local214 != null) {
				local214.method572(0, -this.anInt2792, 0);
				if (local513.aBoolean219) {
					if (Static144.anInt3286 != 0) {
						local214.method554(Static144.anInt3286);
					}
					if (Static270.anInt5410 != 0) {
						local214.method552(Static270.anInt5410);
					}
					if (Static269.anInt5352 != 0) {
						local214.method572(0, Static269.anInt5352, 0);
					}
				}
			}
		}
		@Pc(561) Class2_Sub1 local561 = null;
		if (!this.aBoolean182 && this.anObject5 != null) {
			if (Static133.anInt3061 >= this.anInt2805) {
				this.anObject5 = null;
			}
			if (this.anInt2773 <= Static133.anInt3061 && Static133.anInt3061 < this.anInt2805) {
				if (this.anObject5 instanceof Class2_Sub5) {
					local561 = (Class2_Sub1) ((Class2_Sub5) this.anObject5).method2527();
				} else {
					local561 = (Class2_Sub1) this.anObject5;
				}
				local561.method572(this.anInt2799 - this.anInt2846, this.anInt2854 + -this.anInt2788, this.anInt2791 - this.anInt2794);
				if (this.anInt2823 == 512) {
					local561.method562();
				} else if (this.anInt2823 == 1024) {
					local561.method567();
				} else if (this.anInt2823 == 1536) {
					local561.method565();
				}
			}
		}
		if (Static294.aBoolean367) {
			this.method2103(local214, local104);
			local104.aBoolean39 = true;
			local104.method3951(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass34_Sub1_4);
			if (local214 != null) {
				if (this.aClass34_Sub1_4 != null) {
					@Pc(719) Class2_Sub1_Sub1 local719 = (Class2_Sub1_Sub1) local214;
					this.aClass34_Sub1_4.method858(local719.aClass135Array1, local719.aClass86Array1, true, local719.anIntArray6, local719.anIntArray9, local719.anIntArray4);
				}
				local214.aBoolean39 = true;
				local214.method3951(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass34_Sub1_4);
			}
		} else {
			if (local214 != null) {
				local104 = ((Class2_Sub1_Sub2) local104).method584(local214);
			}
			if (local561 != null) {
				local104 = ((Class2_Sub1_Sub2) local104).method584(local561);
			}
			this.method2103(local214, local104);
			local104.aBoolean39 = true;
			local104.method3951(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass34_Sub1_4);
		}
		if (local561 == null) {
			return;
		}
		if (this.anInt2823 == 512) {
			local561.method565();
		} else if (this.anInt2823 == 1024) {
			local561.method567();
		} else if (this.anInt2823 == 1536) {
			local561.method562();
		}
		local561.method572(this.anInt2846 - this.anInt2799, -this.anInt2854 + this.anInt2788, this.anInt2794 - this.anInt2791);
	}

	@OriginalMember(owner = "client!jh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass34_Sub1_4 != null) {
			this.aClass34_Sub1_4.method862();
		}
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)I")
	@Override
	protected int method2090() {
		return this.anInt2832;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIZB)V")
	public void method2110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		super.method2087(arg2, arg0, this.method2088(), arg1);
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method2100() {
		return this.aClass167_1 != null;
	}
}

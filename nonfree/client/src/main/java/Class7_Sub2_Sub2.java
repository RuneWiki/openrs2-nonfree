import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class7_Sub2_Sub2 extends Class7_Sub2 {

	@OriginalMember(owner = "client!og", name = "Ob", descriptor = "I")
	public int anInt3101;

	@OriginalMember(owner = "client!og", name = "Sb", descriptor = "Lclient!mb;")
	public Class62 aClass62_1072;

	@OriginalMember(owner = "client!og", name = "Ub", descriptor = "I")
	public int anInt3106;

	@OriginalMember(owner = "client!og", name = "Vb", descriptor = "Lclient!eg;")
	public Class28 aClass28_2;

	@OriginalMember(owner = "client!og", name = "Xb", descriptor = "I")
	public int anInt3107;

	@OriginalMember(owner = "client!og", name = "Yb", descriptor = "I")
	public int anInt3108;

	@OriginalMember(owner = "client!og", name = "dc", descriptor = "I")
	public int anInt3112;

	@OriginalMember(owner = "client!og", name = "ec", descriptor = "I")
	public int anInt3113;

	@OriginalMember(owner = "client!og", name = "kc", descriptor = "I")
	public int anInt3118;

	@OriginalMember(owner = "client!og", name = "lc", descriptor = "Lclient!ug;")
	public Class7_Sub7 aClass7_Sub7_1;

	@OriginalMember(owner = "client!og", name = "Qb", descriptor = "I")
	public int anInt3103 = -1;

	@OriginalMember(owner = "client!og", name = "Wb", descriptor = "Z")
	public boolean aBoolean136 = false;

	@OriginalMember(owner = "client!og", name = "fc", descriptor = "I")
	public int anInt3114 = 0;

	@OriginalMember(owner = "client!og", name = "jc", descriptor = "I")
	public int anInt3117 = 0;

	@OriginalMember(owner = "client!og", name = "Zb", descriptor = "I")
	public int anInt3109 = -1;

	@OriginalMember(owner = "client!og", name = "ac", descriptor = "S")
	private short aShort9 = 0;

	@OriginalMember(owner = "client!og", name = "oc", descriptor = "I")
	public int anInt3120 = 0;

	@OriginalMember(owner = "client!og", name = "qc", descriptor = "I")
	public int anInt3122 = 0;

	@OriginalMember(owner = "client!og", name = "hc", descriptor = "S")
	private short aShort10 = 0;

	@OriginalMember(owner = "client!og", name = "bc", descriptor = "I")
	public int anInt3110 = 0;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "()I")
	@Override
	public int method3148() {
		return super.anInt3093;
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method2177() {
		return this.aClass28_2 != null;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!kd;I)V")
	public void method2180(@OriginalArg(0) Class2_Sub11 arg0) {
		arg0.anInt2235 = 0;
		@Pc(10) int local10 = -1;
		@Pc(14) int local14 = arg0.method1534();
		if ((local14 & 0x2) == 2) {
			this.aShort9 = (short) (arg0.method1534() << 2);
			this.aShort10 = (short) (arg0.method1534() << 2);
		} else {
			this.aShort10 = 0;
			this.aShort9 = 0;
		}
		@Pc(54) boolean local54 = (local14 & 0x4) != 0;
		@Pc(58) int local58 = local14 & 0x1;
		super.anInt3048 = (local14 >> 3) + 1;
		this.anInt3103 = arg0.method1552();
		@Pc(73) int[] local73 = new int[12];
		this.anInt3109 = arg0.method1552();
		this.anInt3114 = 0;
		@Pc(101) int local101;
		@Pc(107) int local107;
		for (@Pc(83) int local83 = 0; local83 < 12; local83++) {
			@Pc(89) int local89 = arg0.method1534();
			if (local89 == 0) {
				local73[local83] = 0;
			} else {
				local101 = arg0.method1534();
				local107 = local101 + (local89 << 8);
				if (local83 == 0 && local107 == 65535) {
					local10 = arg0.method1557();
					break;
				}
				if (local107 >= 32768) {
					local107 = Static95.anIntArray202[local107 - 32768];
					local73[local83] = local107 | 0x40000000;
					@Pc(143) int local143 = Static52.method774(local107).anInt4513;
					if (local143 != 0) {
						this.anInt3114 = local143;
					}
				} else {
					local73[local83] = Integer.MIN_VALUE | local107 - 256;
				}
			}
		}
		@Pc(167) int[] local167 = new int[5];
		for (local101 = 0; local101 < 5; local101++) {
			local107 = arg0.method1534();
			if (local107 < 0 || local107 >= Static140.aShortArrayArray3[local101].length) {
				local107 = 0;
			}
			local167[local101] = local107;
		}
		super.anInt3077 = arg0.method1557();
		if (super.anInt3077 == 65535) {
			super.anInt3077 = -1;
		}
		super.anInt3074 = arg0.method1557();
		if (super.anInt3074 == 65535) {
			super.anInt3074 = -1;
		}
		super.anInt3082 = super.anInt3074;
		super.anInt3088 = arg0.method1557();
		if (super.anInt3088 == 65535) {
			super.anInt3088 = -1;
		}
		super.anInt3095 = arg0.method1557();
		if (super.anInt3095 == 65535) {
			super.anInt3095 = -1;
		}
		super.anInt3072 = arg0.method1557();
		if (super.anInt3072 == 65535) {
			super.anInt3072 = -1;
		}
		super.anInt3068 = arg0.method1557();
		if (super.anInt3068 == 65535) {
			super.anInt3068 = -1;
		}
		super.anInt3053 = arg0.method1557();
		if (super.anInt3053 == 65535) {
			super.anInt3053 = -1;
		}
		this.aClass62_1072 = Static149.method2218(arg0.method1580()).method1876();
		this.anInt3117 = arg0.method1534();
		if (local54) {
			this.anInt3110 = arg0.method1557();
		} else {
			this.anInt3110 = 0;
		}
		if (this.aClass28_2 == null) {
			this.aClass28_2 = new Class28();
		}
		this.aClass28_2.method721(local167, local58 == 1, local73, local10);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZIIIIIIIIILclient!ug;I)V")
	private void method2181(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class7_Sub7 arg10, @OriginalArg(12) int arg11) {
		if (arg5 * arg5 + arg9 * arg9 > 360000) {
			return;
		}
		@Pc(31) int local31 = (int) (Math.atan2((double) arg9, (double) arg5) * 325.949D) & 0x7FF;
		@Pc(43) Class7_Sub7 local43 = Static96.method1462(arg10, arg0, super.anInt3081, super.anInt3046, super.anInt3085, local31);
		if (local43 != null) {
			local43.method3143(0, arg8, arg1, arg7, arg2, arg6, arg4, arg3, -1L);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass28_2 == null) {
			return;
		}
		@Pc(27) Class2_Sub1_Sub25 local27 = super.anInt3062 != -1 && super.anInt3075 == 0 ? Static90.method27(super.anInt3062) : null;
		@Pc(52) Class2_Sub1_Sub25 local52 = super.anInt3096 == -1 || this.aBoolean136 || super.anInt3096 == super.anInt3077 && local27 != null ? null : Static90.method27(super.anInt3096);
		@Pc(63) Class7_Sub7 local63 = this.aClass28_2.method718(super.anInt3066, super.anInt3060, local27, local52);
		if (local63 == null) {
			return;
		}
		super.anInt3093 = local63.method3148();
		@Pc(78) int local78;
		@Pc(132) int local132;
		@Pc(121) int local121;
		@Pc(168) int local168;
		if (Static186.aClass7_Sub2_Sub2_1 == this) {
			for (local78 = Static181.aClass32Array1.length - 1; local78 >= 0; local78--) {
				@Pc(84) Class32 local84 = Static181.aClass32Array1[local78];
				if (local84 != null && local84.anInt1124 != -1) {
					if (local84.anInt1118 == 1 && local84.anInt1120 >= 0 && Static9.aClass7_Sub2_Sub1Array1.length > local84.anInt1120) {
						@Pc(109) Class7_Sub2_Sub1 local109 = Static9.aClass7_Sub2_Sub1Array1[local84.anInt1120];
						if (local109 != null) {
							local121 = local109.anInt3085 / 32 - Static186.aClass7_Sub2_Sub2_1.anInt3085 / 32;
							local132 = local109.anInt3046 / 32 - Static186.aClass7_Sub2_Sub2_1.anInt3046 / 32;
							this.method2181(local84.anInt1124, arg2, arg4, arg7, arg6, local121, arg5, arg3, arg1, local132, local63, arg0);
						}
					}
					if (local84.anInt1118 == 2) {
						local168 = (local84.anInt1116 - Static116.anInt2535) * 4 + 2 - Static186.aClass7_Sub2_Sub2_1.anInt3046 / 32;
						local132 = (local84.anInt1117 - Static153.anInt3278) * 4 + 2 - Static186.aClass7_Sub2_Sub2_1.anInt3085 / 32;
						this.method2181(local84.anInt1124, arg2, arg4, arg7, arg6, local132, arg5, arg3, arg1, local168, local63, arg0);
					}
					if (local84.anInt1118 == 10 && local84.anInt1120 >= 0 && local84.anInt1120 < Static62.aClass7_Sub2_Sub2Array1.length) {
						@Pc(222) Class7_Sub2_Sub2 local222 = Static62.aClass7_Sub2_Sub2Array1[local84.anInt1120];
						if (local222 != null) {
							local121 = local222.anInt3085 / 32 - Static186.aClass7_Sub2_Sub2_1.anInt3085 / 32;
							local132 = local222.anInt3046 / 32 - Static186.aClass7_Sub2_Sub2_1.anInt3046 / 32;
							this.method2181(local84.anInt1124, arg2, arg4, arg7, arg6, local121, arg5, arg3, arg1, local132, local63, arg0);
						}
					}
				}
			}
		}
		local78 = 0;
		local168 = 0;
		@Pc(272) int local272 = 0;
		if (this.aShort9 != 0 && this.aShort10 != 0) {
			local121 = Class26.anIntArray76[arg0];
			local132 = Class26.anIntArray77[arg0];
			@Pc(292) short local292 = this.aShort9;
			@Pc(295) short local295 = this.aShort10;
			@Pc(300) int local300 = -local295 / 2;
			@Pc(305) int local305 = -local292 / 2;
			@Pc(316) int local316 = local132 * local300 + local305 * local121 >> 16;
			@Pc(327) int local327 = local300 * local121 - local305 * local132 >> 16;
			@Pc(339) int local339 = Static175.method2548(local327 + super.anInt3085, Static126.anInt2806, super.anInt3046 + local316);
			@Pc(343) int local343 = local292 / 2;
			@Pc(348) int local348 = -local295 / 2;
			@Pc(358) int local358 = local348 * local121 - local343 * local132 >> 16;
			@Pc(368) int local368 = local348 * local132 + local343 * local121 >> 16;
			@Pc(372) int local372 = local295 / 2;
			@Pc(377) int local377 = -local292 / 2;
			@Pc(389) int local389 = Static175.method2548(super.anInt3085 + local358, Static126.anInt2806, local368 + super.anInt3046);
			@Pc(399) int local399 = local377 * local121 + local372 * local132 >> 16;
			@Pc(410) int local410 = local121 * local372 - local132 * local377 >> 16;
			@Pc(414) int local414 = local292 / 2;
			@Pc(426) int local426 = Static175.method2548(super.anInt3085 + local410, Static126.anInt2806, local399 + super.anInt3046);
			@Pc(430) int local430 = local295 / 2;
			@Pc(440) int local440 = local414 * local121 + local132 * local430 >> 16;
			@Pc(451) int local451 = local430 * local121 - local414 * local132 >> 16;
			@Pc(462) int local462 = local339 >= local389 ? local389 : local339;
			@Pc(474) int local474 = Static175.method2548(local451 + super.anInt3085, Static126.anInt2806, local440 + super.anInt3046);
			@Pc(485) int local485 = local474 > local426 ? local426 : local474;
			local78 = (int) (Math.atan2((double) (local462 - local485), (double) local295) * 325.95D) & 0x7FF;
			if (local78 != 0) {
				local63.method3167(local78);
			}
			local168 = local339 + local474;
			@Pc(515) int local515 = local389 >= local474 ? local474 : local389;
			if (local426 + local389 < local168) {
				local168 = local426 + local389;
			}
			@Pc(535) int local535 = local339 >= local426 ? local426 : local339;
			local272 = (int) (Math.atan2((double) (local535 - local515), (double) local292) * 325.95D) & 0x7FF;
			if (local272 != 0) {
				local63.method3153(local272);
			}
			local168 = (local168 >> 1) - super.anInt3081;
			if (local168 != 0) {
				local63.method3154(0, local168, 0);
			}
		}
		@Pc(574) Class7_Sub7 local574 = null;
		if (!this.aBoolean136 && super.anInt3091 != -1 && super.anInt3099 != -1) {
			@Pc(590) Class2_Sub1_Sub23 local590 = Static99.method1597(super.anInt3091);
			local574 = local590.method2759(super.anInt3099);
			if (local574 != null) {
				local574.method3154(0, -super.anInt3079, 0);
				if (local590.aBoolean177) {
					if (local78 != 0) {
						local574.method3167(local78);
					}
					if (local272 != 0) {
						local574.method3153(local272);
					}
					if (local168 != 0) {
						local574.method3154(0, local168, 0);
					}
				}
			}
		}
		@Pc(633) Class7_Sub7 local633 = null;
		if (!this.aBoolean136 && this.aClass7_Sub7_1 != null) {
			if (this.anInt3120 <= Static25.anInt581) {
				this.aClass7_Sub7_1 = null;
			}
			if (Static25.anInt581 >= this.anInt3122 && Static25.anInt581 < this.anInt3120) {
				local633 = this.aClass7_Sub7_1;
				local633.method3154(this.anInt3108 - super.anInt3046, -super.anInt3081 + this.anInt3101, this.anInt3118 - super.anInt3085);
				if (super.anInt3098 == 512) {
					local633.method3163();
				} else if (super.anInt3098 == 1024) {
					local633.method3158();
				} else if (super.anInt3098 == 1536) {
					local633.method3165();
				}
			}
		}
		if (local574 != null) {
			local63 = ((Class7_Sub7_Sub1) local63).method3169(local574);
		}
		if (local633 != null) {
			local63 = ((Class7_Sub7_Sub1) local63).method3169(local633);
		}
		local63.aBoolean191 = true;
		local63.method3143(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local633 == null) {
			return;
		}
		if (super.anInt3098 == 512) {
			local633.method3165();
		} else if (super.anInt3098 == 1024) {
			local633.method3158();
		} else if (super.anInt3098 == 1536) {
			local633.method3163();
		}
		local633.method3154(super.anInt3046 - this.anInt3108, -this.anInt3101 + super.anInt3081, super.anInt3085 - this.anInt3118);
	}
}

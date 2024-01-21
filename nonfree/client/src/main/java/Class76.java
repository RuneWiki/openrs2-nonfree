import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class76 {

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
	private int anInt3886;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
	private int[] anIntArray651;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "Z")
	public boolean aBoolean180;

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "[I")
	private int[] anIntArray653;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "J")
	private long aLong130;

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "J")
	private long aLong131;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z[IZI[I)V")
	public void method2962(@OriginalArg(1) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(14) int local14 = 0; local14 < 7; local14++) {
				for (@Pc(17) int local17 = 0; local17 < Static126.anInt3247; local17++) {
					@Pc(22) Class3_Sub2_Sub5 local22 = Static95.method2094(local17);
					if (local22 != null && !local22.aBoolean38 && local22.anInt596 == (arg1 ? 7 : 0) + local14) {
						arg3[Static125.anIntArray551[local14]] = Integer.MIN_VALUE | local17;
						break;
					}
				}
			}
		}
		this.anIntArray651 = arg0;
		this.anInt3886 = arg2;
		this.anIntArray653 = arg3;
		this.aBoolean180 = arg1;
		this.method2965();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZI)V")
	public void method2964(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 && this.aBoolean180) {
			return;
		}
		@Pc(25) int local25 = this.anIntArray653[Static125.anIntArray551[arg1]];
		if (local25 == 0) {
			return;
		}
		local25 &= 0x3FFFFFFF;
		@Pc(52) Class3_Sub2_Sub5 local52;
		do {
			if (arg0) {
				local25++;
				if (Static126.anInt3247 <= local25) {
					local25 = 0;
				}
			} else {
				local25--;
				if (local25 < 0) {
					local25 = Static126.anInt3247 - 1;
				}
			}
			local52 = Static95.method2094(local25);
		} while (local52 == null || local52.aBoolean38 || (this.aBoolean180 ? 7 : 0) + arg1 != local52.anInt596);
		this.anIntArray653[Static125.anIntArray551[arg1]] = Integer.MIN_VALUE | local25;
		this.method2965();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	private void method2965() {
		@Pc(1) long[] local1 = Class3_Sub1_Sub37.aLongArray10;
		@Pc(8) long local8 = this.aLong130;
		this.aLong130 = -1L;
		for (@Pc(21) int local21 = 0; local21 < 12; local21++) {
			this.aLong130 = local1[(int) ((this.aLong130 ^ (long) (this.anIntArray653[local21] >> 24)) & 0xFFL)] ^ this.aLong130 >>> 8;
			this.aLong130 = this.aLong130 >>> 8 ^ local1[(int) ((this.aLong130 ^ (long) (this.anIntArray653[local21] >> 16)) & 0xFFL)];
			this.aLong130 = local1[(int) ((this.aLong130 ^ (long) (this.anIntArray653[local21] >> 8)) & 0xFFL)] ^ this.aLong130 >>> 8;
			this.aLong130 = local1[(int) (((long) this.anIntArray653[local21] ^ this.aLong130) & 0xFFL)] ^ this.aLong130 >>> 8;
		}
		for (@Pc(116) int local116 = 0; local116 < 5; local116++) {
			this.aLong130 = local1[(int) (((long) this.anIntArray651[local116] ^ this.aLong130) & 0xFFL)] ^ this.aLong130 >>> 8;
		}
		this.aLong130 = local1[(int) ((this.aLong130 ^ (long) (this.aBoolean180 ? 1 : 0)) & 0xFFL)] ^ this.aLong130 >>> 8;
		if (local8 != 0L && this.aLong130 != local8) {
			Static131.aClass63_22.method2341(local8);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIB)V")
	public void method2966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray651[arg0] = arg1;
		this.method2965();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!ca;Lclient!ca;II)Lclient!d;")
	public Class3_Sub2_Sub1_Sub1 method2967(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2_Sub4 arg1, @OriginalArg(2) Class3_Sub2_Sub4 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt3886 != -1) {
			return Static170.method3103(this.anInt3886).method1116(arg1, arg2, arg3, arg0);
		}
		@Pc(28) int[] local28 = this.anIntArray653;
		@Pc(31) long local31 = this.aLong130;
		if (arg1 != null && (arg1.anInt548 >= 0 || arg1.anInt532 >= 0)) {
			local28 = new int[12];
			for (@Pc(44) int local44 = 0; local44 < 12; local44++) {
				local28[local44] = this.anIntArray653[local44];
			}
			if (arg1.anInt548 >= 0) {
				if (arg1.anInt548 == 65535) {
					local28[5] = 0;
					local31 ^= 0xFFFFFFFF00000000L;
				} else {
					local28[5] = arg1.anInt548 | 0x40000000;
					local31 ^= (long) local28[5] << 32;
				}
			}
			if (arg1.anInt532 >= 0) {
				if (arg1.anInt532 == 65535) {
					local31 ^= 0xFFFFFFFFL;
					local28[3] = 0;
				} else {
					local28[3] = arg1.anInt532 | 0x40000000;
					local31 ^= local28[3];
				}
			}
		}
		@Pc(130) Class3_Sub2_Sub1_Sub1 local130 = (Class3_Sub2_Sub1_Sub1) Static131.aClass63_22.method2337(local31);
		if (local130 == null) {
			@Pc(134) boolean local134 = false;
			for (@Pc(136) int local136 = 0; local136 < 12; local136++) {
				@Pc(141) int local141 = local28[local136];
				if ((local141 & 0x40000000) == 0) {
					if ((local141 & Integer.MIN_VALUE) != 0 && !Static95.method2094(local141 & 0x3FFFFFFF).method612()) {
						local134 = true;
					}
				} else if (!Static76.method1736(local141 & 0x3FFFFFFF).method1467(this.aBoolean180)) {
					local134 = true;
				}
			}
			if (local134) {
				if (this.aLong131 != -1L) {
					local130 = (Class3_Sub2_Sub1_Sub1) Static131.aClass63_22.method2337(this.aLong131);
				}
				if (local130 == null) {
					return null;
				}
			}
			if (local130 == null) {
				@Pc(201) Class3_Sub2_Sub1_Sub4[] local201 = new Class3_Sub2_Sub1_Sub4[12];
				@Pc(203) int local203 = 0;
				for (@Pc(205) int local205 = 0; local205 < 12; local205++) {
					@Pc(210) int local210 = local28[local205];
					@Pc(232) Class3_Sub2_Sub1_Sub4 local232;
					if ((local210 & 0x40000000) != 0) {
						local232 = Static76.method1736(local210 & 0x3FFFFFFF).method1460(this.aBoolean180);
						if (local232 != null) {
							local201[local203++] = local232;
						}
					} else if ((local210 & Integer.MIN_VALUE) != 0) {
						local232 = Static95.method2094(local210 & 0x3FFFFFFF).method614();
						if (local232 != null) {
							local201[local203++] = local232;
						}
					}
				}
				@Pc(267) Class3_Sub2_Sub1_Sub4 local267 = new Class3_Sub2_Sub1_Sub4(local201, local203);
				for (@Pc(269) int local269 = 0; local269 < 5; local269++) {
					if (Static74.aShortArrayArray5[local269].length > this.anIntArray651[local269]) {
						local267.method2029(Static160.aShortArray37[local269], Static74.aShortArrayArray5[local269][this.anIntArray651[local269]]);
					}
					if (Static170.aShortArrayArray8[local269].length > this.anIntArray651[local269]) {
						local267.method2029(Static5.aShortArray1[local269], Static170.aShortArrayArray8[local269][this.anIntArray651[local269]]);
					}
				}
				local130 = local267.method2041(64, 850, -30, -50, -30, true);
				Static131.aClass63_22.method2338(local31, local130);
				this.aLong131 = local31;
			}
		}
		if (arg1 == null && arg2 == null) {
			return local130;
		}
		@Pc(354) Class3_Sub2_Sub1_Sub1 local354;
		if (arg1 != null && arg2 != null) {
			local354 = arg1.method569(local130, arg0, arg2, arg3);
		} else if (arg1 == null) {
			local354 = arg2.method565(local130, arg0);
		} else {
			local354 = arg1.method565(local130, arg3);
		}
		return local354;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BZ)V")
	public void method2969(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean180) {
			this.method2962(this.anIntArray651, arg0, -1, null);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BII)V")
	public void method2970(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = Static125.anIntArray551[arg0];
		if (this.anIntArray653[local3] != 0 && Static95.method2094(arg1) != null) {
			this.anIntArray653[local3] = Integer.MIN_VALUE | arg1;
			this.method2965();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZBI)V")
	public void method2971(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray651[arg1];
		if (arg0) {
			local4++;
			if (Static74.aShortArrayArray5[arg1].length <= local4) {
				local4 = 0;
			}
		} else {
			local4--;
			if (local4 < 0) {
				local4 = Static74.aShortArrayArray5[arg1].length - 1;
			}
		}
		this.anIntArray651[arg1] = local4;
		this.method2965();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLclient!hd;)V")
	public void method2972(@OriginalArg(1) Class3_Sub8 arg0) {
		arg0.method1550(this.aBoolean180 ? 1 : 0);
		@Pc(26) int local26;
		for (@Pc(10) int local10 = 0; local10 < 7; local10++) {
			local26 = this.anIntArray653[Static125.anIntArray551[local10]];
			if ((local26 & Integer.MIN_VALUE) == 0) {
				arg0.method1531(65535);
			} else {
				arg0.method1531(local26 & 0x3FFFFFFF);
			}
		}
		for (local26 = 0; local26 < 5; local26++) {
			arg0.method1550(this.anIntArray651[local26]);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!ca;I)Lclient!d;")
	public Class3_Sub2_Sub1_Sub1 method2973(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2_Sub4 arg1) {
		if (this.anInt3886 != -1) {
			return Static170.method3103(this.anInt3886).method1119(arg0, arg1);
		}
		@Pc(31) Class3_Sub2_Sub1_Sub1 local31 = (Class3_Sub2_Sub1_Sub1) Static82.aClass63_14.method2337(this.aLong130);
		if (local31 == null) {
			@Pc(35) boolean local35 = false;
			for (@Pc(37) int local37 = 0; local37 < 12; local37++) {
				@Pc(43) int local43 = this.anIntArray653[local37];
				if ((local43 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local43) != 0 && !Static95.method2094(local43 & 0x3FFFFFFF).method611()) {
						local35 = true;
					}
				} else if (!Static76.method1736(local43 & 0x3FFFFFFF).method1456(this.aBoolean180)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(93) Class3_Sub2_Sub1_Sub4[] local93 = new Class3_Sub2_Sub1_Sub4[12];
			@Pc(95) int local95 = 0;
			for (@Pc(97) int local97 = 0; local97 < 12; local97++) {
				@Pc(103) int local103 = this.anIntArray653[local97];
				@Pc(125) Class3_Sub2_Sub1_Sub4 local125;
				if ((local103 & 0x40000000) != 0) {
					local125 = Static76.method1736(local103 & 0x3FFFFFFF).method1461(this.aBoolean180);
					if (local125 != null) {
						local93[local95++] = local125;
					}
				} else if ((local103 & Integer.MIN_VALUE) != 0) {
					local125 = Static95.method2094(local103 & 0x3FFFFFFF).method608();
					if (local125 != null) {
						local93[local95++] = local125;
					}
				}
			}
			@Pc(162) Class3_Sub2_Sub1_Sub4 local162 = new Class3_Sub2_Sub1_Sub4(local93, local95);
			for (@Pc(164) int local164 = 0; local164 < 5; local164++) {
				if (Static74.aShortArrayArray5[local164].length > this.anIntArray651[local164]) {
					local162.method2029(Static160.aShortArray37[local164], Static74.aShortArrayArray5[local164][this.anIntArray651[local164]]);
				}
				if (this.anIntArray651[local164] < Static170.aShortArrayArray8[local164].length) {
					local162.method2029(Static5.aShortArray1[local164], Static170.aShortArrayArray8[local164][this.anIntArray651[local164]]);
				}
			}
			local31 = local162.method2041(64, 768, -50, -10, -50, true);
			Static82.aClass63_14.method2338(this.aLong130, local31);
		}
		if (arg1 != null) {
			local31 = arg1.method570(arg0, local31);
		}
		return local31;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)V")
	public void method2975(@OriginalArg(0) boolean arg0) {
		this.aBoolean180 = arg0;
		this.method2965();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
	public int method2976() {
		return this.anInt3886 == -1 ? (this.anIntArray653[0] << 15) + (this.anIntArray651[4] << 20) + (this.anIntArray651[0] << 25) + (this.anIntArray653[8] << 10) + (this.anIntArray653[11] << 5) + this.anIntArray653[1] : Static170.method3103(this.anInt3886).anInt1315 + 305419896;
	}
}

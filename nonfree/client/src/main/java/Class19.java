import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class19 {

	@OriginalMember(owner = "client!di", name = "b", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!di", name = "m", descriptor = "I")
	private int anInt1081;

	@OriginalMember(owner = "client!di", name = "q", descriptor = "[I")
	private int[] anIntArray108;

	@OriginalMember(owner = "client!di", name = "u", descriptor = "Z")
	public boolean aBoolean43;

	@OriginalMember(owner = "client!di", name = "z", descriptor = "[I")
	private int[] anIntArray109;

	@OriginalMember(owner = "client!di", name = "A", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(I)I")
	public int method695() {
		return this.anInt1081 == -1 ? (this.anIntArray109[8] << 10) + (this.anIntArray108[4] << 20) + (this.anIntArray108[0] << 25) + (this.anIntArray109[0] << 15) + (this.anIntArray109[11] << 5) + this.anIntArray109[1] : Static114.method2108(this.anInt1081).anInt1599 + 305419896;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IZB[I[I)V")
	public void method697(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				for (@Pc(9) int local9 = 0; local9 < Static209.anInt4437; local9++) {
					@Pc(14) Class1_Sub2_Sub1 local14 = Static200.method3237(local9);
					if (local14 != null && !local14.aBoolean2 && local14.anInt62 == (arg1 ? 7 : 0) + local6) {
						arg3[Static129.anIntArray369[local6]] = Integer.MIN_VALUE | local9;
						break;
					}
				}
			}
		}
		this.aBoolean43 = arg1;
		this.anInt1081 = arg0;
		this.anIntArray109 = arg3;
		this.anIntArray108 = arg2;
		this.method703();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IILclient!kg;Lclient!kg;I)Lclient!bf;")
	public Class6_Sub3 method698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub14 arg2, @OriginalArg(3) Class1_Sub2_Sub14 arg3) {
		if (this.anInt1081 != -1) {
			return Static114.method2108(this.anInt1081).method1077(arg2, arg1, arg3, arg0);
		}
		@Pc(31) int[] local31 = this.anIntArray109;
		@Pc(34) long local34 = this.aLong32;
		if (arg3 != null && (arg3.anInt2505 >= 0 || arg3.anInt2506 >= 0)) {
			local31 = new int[12];
			for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
				local31[local50] = this.anIntArray109[local50];
			}
			if (arg3.anInt2505 >= 0) {
				if (arg3.anInt2505 == 65535) {
					local34 ^= 0xFFFFFFFF00000000L;
					local31[5] = 0;
				} else {
					local31[5] = arg3.anInt2505 | 0x40000000;
					local34 ^= (long) local31[5] << 32;
				}
			}
			if (arg3.anInt2506 >= 0) {
				if (arg3.anInt2506 == 65535) {
					local34 ^= 0xFFFFFFFFL;
					local31[3] = 0;
				} else {
					local31[3] = arg3.anInt2506 | 0x40000000;
					local34 ^= local31[3];
				}
			}
		}
		@Pc(143) Class6_Sub3 local143 = (Class6_Sub3) Static108.aClass67_5.method2570(local34);
		if (local143 == null) {
			@Pc(147) boolean local147 = false;
			for (@Pc(149) int local149 = 0; local149 < 12; local149++) {
				@Pc(155) int local155 = local31[local149];
				if ((local155 & 0x40000000) == 0) {
					if ((local155 & Integer.MIN_VALUE) != 0 && !Static200.method3237(local155 & 0x3FFFFFFF).method52()) {
						local147 = true;
					}
				} else if (!Static40.method700(local155 & 0x3FFFFFFF).method218(this.aBoolean43)) {
					local147 = true;
				}
			}
			if (local147) {
				if (this.aLong33 != -1L) {
					local143 = (Class6_Sub3) Static108.aClass67_5.method2570(this.aLong33);
				}
				if (local143 == null) {
					return null;
				}
			}
			if (local143 == null) {
				@Pc(219) Class6_Sub1[] local219 = new Class6_Sub1[12];
				@Pc(221) int local221 = 0;
				for (@Pc(223) int local223 = 0; local223 < 12; local223++) {
					@Pc(229) int local229 = local31[local223];
					@Pc(248) Class6_Sub1 local248;
					if ((local229 & 0x40000000) != 0) {
						local248 = Static40.method700(local229 & 0x3FFFFFFF).method229(this.aBoolean43);
						if (local248 != null) {
							local219[local221++] = local248;
						}
					} else if ((Integer.MIN_VALUE & local229) != 0) {
						local248 = Static200.method3237(local229 & 0x3FFFFFFF).method47();
						if (local248 != null) {
							local219[local221++] = local248;
						}
					}
				}
				@Pc(284) Class6_Sub1 local284 = new Class6_Sub1(local219, local221);
				for (@Pc(286) int local286 = 0; local286 < 5; local286++) {
					if (this.anIntArray108[local286] < Static168.aShortArrayArray5[local286].length) {
						local284.method199(Static24.aShortArray17[local286], Static168.aShortArrayArray5[local286][this.anIntArray108[local286]]);
					}
					if (Static26.aShortArrayArray1[local286].length > this.anIntArray108[local286]) {
						local284.method199(Static125.aShortArray49[local286], Static26.aShortArrayArray1[local286][this.anIntArray108[local286]]);
					}
				}
				local143 = local284.method184(64, 850, -30, -50, -30);
				Static108.aClass67_5.method2567(local143, local34);
				this.aLong33 = local34;
			}
		}
		if (arg3 == null && arg2 == null) {
			return local143;
		}
		@Pc(368) Class6_Sub3 local368;
		if (arg3 != null && arg2 != null) {
			local368 = arg3.method1884(local143, arg0, arg2, arg1);
		} else if (arg3 == null) {
			local368 = arg2.method1886(local143, arg1);
		} else {
			local368 = arg3.method1886(local143, arg0);
		}
		return local368;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZLclient!kg;I)Lclient!bf;")
	public Class6_Sub3 method699(@OriginalArg(1) Class1_Sub2_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1081 != -1) {
			return Static114.method2108(this.anInt1081).method1080(arg1, arg0);
		}
		@Pc(30) Class6_Sub3 local30 = (Class6_Sub3) Static79.aClass67_3.method2570(this.aLong32);
		if (local30 == null) {
			@Pc(34) boolean local34 = false;
			for (@Pc(36) int local36 = 0; local36 < 12; local36++) {
				@Pc(43) int local43 = this.anIntArray109[local36];
				if ((local43 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local43) != 0 && !Static200.method3237(local43 & 0x3FFFFFFF).method44()) {
						local34 = true;
					}
				} else if (!Static40.method700(local43 & 0x3FFFFFFF).method227(this.aBoolean43)) {
					local34 = true;
				}
			}
			if (local34) {
				return null;
			}
			@Pc(91) Class6_Sub1[] local91 = new Class6_Sub1[12];
			@Pc(93) int local93 = 0;
			for (@Pc(95) int local95 = 0; local95 < 12; local95++) {
				@Pc(102) int local102 = this.anIntArray109[local95];
				@Pc(119) Class6_Sub1 local119;
				if ((local102 & 0x40000000) != 0) {
					local119 = Static40.method700(local102 & 0x3FFFFFFF).method228(this.aBoolean43);
					if (local119 != null) {
						local91[local93++] = local119;
					}
				} else if ((Integer.MIN_VALUE & local102) != 0) {
					local119 = Static200.method3237(local102 & 0x3FFFFFFF).method45();
					if (local119 != null) {
						local91[local93++] = local119;
					}
				}
			}
			@Pc(160) Class6_Sub1 local160 = new Class6_Sub1(local91, local93);
			for (@Pc(162) int local162 = 0; local162 < 5; local162++) {
				if (Static168.aShortArrayArray5[local162].length > this.anIntArray108[local162]) {
					local160.method199(Static24.aShortArray17[local162], Static168.aShortArrayArray5[local162][this.anIntArray108[local162]]);
				}
				if (this.anIntArray108[local162] < Static26.aShortArrayArray1[local162].length) {
					local160.method199(Static125.aShortArray49[local162], Static26.aShortArrayArray1[local162][this.anIntArray108[local162]]);
				}
			}
			local30 = local160.method184(64, 768, -50, -10, -50);
			Static79.aClass67_3.method2567(local30, this.aLong32);
		}
		if (arg0 != null) {
			local30 = arg0.method1881(arg1, local30);
		}
		return local30;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
	public void method701(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray108[arg0] = arg1;
		this.method703();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BII)V")
	public void method702(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static129.anIntArray369[arg0];
		if (this.anIntArray109[local7] != 0 && Static200.method3237(arg1) != null) {
			this.anIntArray109[local7] = Integer.MIN_VALUE | arg1;
			this.method703();
		}
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V")
	private void method703() {
		@Pc(5) long[] local5 = Class1_Sub1_Sub10.aLongArray4;
		@Pc(8) long local8 = this.aLong32;
		this.aLong32 = -1L;
		for (@Pc(13) int local13 = 0; local13 < 12; local13++) {
			this.aLong32 = this.aLong32 >>> 8 ^ local5[(int) (((long) (this.anIntArray109[local13] >> 24) ^ this.aLong32) & 0xFFL)];
			this.aLong32 = this.aLong32 >>> 8 ^ local5[(int) ((this.aLong32 ^ (long) (this.anIntArray109[local13] >> 16)) & 0xFFL)];
			this.aLong32 = local5[(int) ((this.aLong32 ^ (long) (this.anIntArray109[local13] >> 8)) & 0xFFL)] ^ this.aLong32 >>> 8;
			this.aLong32 = this.aLong32 >>> 8 ^ local5[(int) ((this.aLong32 ^ (long) this.anIntArray109[local13]) & 0xFFL)];
		}
		for (@Pc(106) int local106 = 0; local106 < 5; local106++) {
			this.aLong32 = this.aLong32 >>> 8 ^ local5[(int) ((this.aLong32 ^ (long) this.anIntArray108[local106]) & 0xFFL)];
		}
		this.aLong32 = this.aLong32 >>> 8 ^ local5[(int) (((long) (this.aBoolean43 ? 1 : 0) ^ this.aLong32) & 0xFFL)];
		if (local8 != 0L && local8 != this.aLong32) {
			Static108.aClass67_5.method2566(local8);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)V")
	public void method704(@OriginalArg(1) boolean arg0) {
		this.aBoolean43 = arg0;
		this.method703();
	}
}

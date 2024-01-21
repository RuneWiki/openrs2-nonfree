import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class80 {

	@OriginalMember(owner = "client!te", name = "u", descriptor = "I")
	private int anInt3858 = 0;

	@OriginalMember(owner = "client!te", name = "L", descriptor = "[Lclient!ae;")
	private final Class4[] aClass4Array3 = new Class4[5000];

	@OriginalMember(owner = "client!te", name = "E", descriptor = "I")
	private int anInt3866 = 0;

	@OriginalMember(owner = "client!te", name = "Z", descriptor = "[[I")
	private final int[][] anIntArrayArray36 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!te", name = "ab", descriptor = "[[I")
	private final int[][] anIntArrayArray37 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!te", name = "x", descriptor = "I")
	private final int anInt3860;

	@OriginalMember(owner = "client!te", name = "t", descriptor = "I")
	private final int anInt3857;

	@OriginalMember(owner = "client!te", name = "s", descriptor = "I")
	private final int anInt3856;

	@OriginalMember(owner = "client!te", name = "m", descriptor = "[[[Lclient!ib;")
	private final Class1_Sub10[][][] aClass1_Sub10ArrayArrayArray1;

	@OriginalMember(owner = "client!te", name = "N", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!te", name = "A", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(III[[[I)V")
	public Class80(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt3860 = arg0;
		this.anInt3857 = arg1;
		this.anInt3856 = arg2;
		this.aClass1_Sub10ArrayArrayArray1 = new Class1_Sub10[arg0][arg1][arg2];
		this.anIntArrayArrayArray8 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray7 = arg3;
		this.method2707();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
	public void method2661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static159.aBoolean197 = true;
		Static159.anInt3848 = arg0;
		Static159.anInt3863 = arg1;
		Static159.anInt3867 = arg2;
		Static159.anInt3869 = -1;
		Static159.anInt3872 = -1;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(III)V")
	public void method2662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub10 local8 = this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass85_1 = null;
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(III)V")
	public void method2663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub10 local8 = this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass72_1 = null;
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(III)I")
	public int method2664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub10 local8 = this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass43_1 == null ? 0 : local8.aClass43_1.anInt2034;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIILclient!ka;Lclient!ka;IIIIII)V")
	public void method2666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub1 arg4, @OriginalArg(5) Class1_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class72 local6 = new Class72();
		local6.anInt3594 = arg10;
		local6.anInt3599 = arg11;
		local6.anInt3601 = arg1 * 128 + 64;
		local6.anInt3596 = arg2 * 128 + 64;
		local6.anInt3592 = arg3;
		local6.aClass1_Sub1_Sub1_7 = arg4;
		local6.aClass1_Sub1_Sub1_8 = arg5;
		local6.anInt3600 = arg6;
		local6.anInt3591 = arg7;
		local6.anInt3597 = arg8;
		local6.anInt3595 = arg9;
		for (@Pc(49) int local49 = arg0; local49 >= 0; local49--) {
			if (this.aClass1_Sub10ArrayArrayArray1[local49][arg1][arg2] == null) {
				this.aClass1_Sub10ArrayArrayArray1[local49][arg1][arg2] = new Class1_Sub10(local49, arg1, arg2);
			}
		}
		this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2].aClass72_1 = local6;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(IIII)V")
	public void method2667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub10 local8 = this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2].anInt1785 = arg3;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!sf;III)V")
	private void method2668(@OriginalArg(0) Class1_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class1_Sub10 local14;
		@Pc(29) Class1_Sub1_Sub1_Sub6 local29;
		if (arg2 < this.anInt3857) {
			local14 = this.aClass1_Sub10ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass85_1 != null && local14.aClass85_1.aClass1_Sub1_Sub1_9 instanceof Class1_Sub1_Sub1_Sub6) {
				local29 = (Class1_Sub1_Sub1_Sub6) local14.aClass85_1.aClass1_Sub1_Sub1_9;
				Static151.method2598(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt3857) {
			local14 = this.aClass1_Sub10ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass85_1 != null && local14.aClass85_1.aClass1_Sub1_Sub1_9 instanceof Class1_Sub1_Sub1_Sub6) {
				local29 = (Class1_Sub1_Sub1_Sub6) local14.aClass85_1.aClass1_Sub1_Sub1_9;
				Static151.method2598(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt3857 && arg3 < this.anInt3856) {
			local14 = this.aClass1_Sub10ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass85_1 != null && local14.aClass85_1.aClass1_Sub1_Sub1_9 instanceof Class1_Sub1_Sub1_Sub6) {
				local29 = (Class1_Sub1_Sub1_Sub6) local14.aClass85_1.aClass1_Sub1_Sub1_9;
				Static151.method2598(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt3857 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass1_Sub10ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass85_1 != null && local14.aClass85_1.aClass1_Sub1_Sub1_9 instanceof Class1_Sub1_Sub1_Sub6) {
			local29 = (Class1_Sub1_Sub1_Sub6) local14.aClass85_1.aClass1_Sub1_Sub1_9;
			Static151.method2598(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIILclient!ka;ILclient!ka;Lclient!ka;)V")
	public void method2670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub1 arg6, @OriginalArg(7) Class1_Sub1_Sub1 arg7) {
		@Pc(3) Class8 local3 = new Class8();
		local3.aClass1_Sub1_Sub1_3 = arg4;
		local3.anInt387 = arg1 * 128 + 64;
		local3.anInt386 = arg2 * 128 + 64;
		local3.anInt383 = arg3;
		local3.anInt385 = arg5;
		local3.aClass1_Sub1_Sub1_2 = arg6;
		local3.aClass1_Sub1_Sub1_4 = arg7;
		@Pc(34) short local34 = 0;
		@Pc(43) Class1_Sub10 local43 = this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt1777; local47++) {
				if ((local43.aClass4Array1[local47].anInt304 & 0x100) == 256 && local43.aClass4Array1[local47].aClass1_Sub1_Sub1_1 instanceof Class1_Sub1_Sub1_Sub2) {
					@Pc(71) Class1_Sub1_Sub1_Sub2 local71 = (Class1_Sub1_Sub1_Sub2) local43.aClass4Array1[local47].aClass1_Sub1_Sub1_1;
					local71.method1085();
					if (local71.aShort36 < local34) {
						local34 = local71.aShort36;
					}
				}
			}
		}
		local3.anInt384 = -local34;
		if (this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub10(arg0, arg1, arg2);
		}
		this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2].aClass8_1 = local3;
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(III)Z")
	private boolean method2672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray8[arg0][arg1][arg2];
		if (local8 == -Static159.anInt3861) {
			return false;
		} else if (local8 == Static159.anInt3861) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method2709(local23 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2], local27 + 1) && this.method2709(local23 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2], local27 + 1) && this.method2709(local23 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method2709(local23 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray8[arg0][arg1][arg2] = Static159.anInt3861;
				return true;
			} else {
				this.anIntArrayArrayArray8[arg0][arg1][arg2] = -Static159.anInt3861;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "()V")
	private void method2673() {
		@Pc(3) int local3 = Static159.anIntArray522[Static159.anInt3871];
		@Pc(7) Class62[] local7 = Static159.aClass62ArrayArray1[Static159.anInt3871];
		Static159.anInt3852 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class62 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(42) int local42;
			@Pc(53) int local53;
			@Pc(85) int local85;
			@Pc(64) boolean local64;
			if (local16.anInt3117 == 1) {
				local27 = local16.anInt3105 + Static159.anInt3864 - Static159.anInt3862;
				if (local27 >= 0 && local27 <= Static159.anInt3864 + Static159.anInt3864) {
					local42 = local16.anInt3115 + Static159.anInt3864 - Static159.anInt3854;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3120 + Static159.anInt3864 - Static159.anInt3854;
					if (local53 > Static159.anInt3864 + Static159.anInt3864) {
						local53 = Static159.anInt3864 + Static159.anInt3864;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static159.aBooleanArrayArray1[local27][local42++]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static159.anInt3859 - local16.anInt3111;
						if (local85 > 32) {
							local16.anInt3108 = 1;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt3108 = 2;
							local85 = -local85;
						}
						local16.anInt3104 = (local16.anInt3121 - Static159.anInt3853 << 8) / local85;
						local16.anInt3106 = (local16.anInt3119 - Static159.anInt3853 << 8) / local85;
						local16.anInt3109 = (local16.anInt3122 - Static159.anInt3873 << 8) / local85;
						local16.anInt3107 = (local16.anInt3103 - Static159.anInt3873 << 8) / local85;
						Static159.aClass62Array1[Static159.anInt3852++] = local16;
					}
				}
			} else if (local16.anInt3117 == 2) {
				local27 = local16.anInt3115 + Static159.anInt3864 - Static159.anInt3854;
				if (local27 >= 0 && local27 <= Static159.anInt3864 + Static159.anInt3864) {
					local42 = local16.anInt3105 + Static159.anInt3864 - Static159.anInt3862;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3102 + Static159.anInt3864 - Static159.anInt3862;
					if (local53 > Static159.anInt3864 + Static159.anInt3864) {
						local53 = Static159.anInt3864 + Static159.anInt3864;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static159.aBooleanArrayArray1[local42++][local27]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static159.anInt3853 - local16.anInt3121;
						if (local85 > 32) {
							local16.anInt3108 = 3;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt3108 = 4;
							local85 = -local85;
						}
						local16.anInt3110 = (local16.anInt3111 - Static159.anInt3859 << 8) / local85;
						local16.anInt3118 = (local16.anInt3113 - Static159.anInt3859 << 8) / local85;
						local16.anInt3109 = (local16.anInt3122 - Static159.anInt3873 << 8) / local85;
						local16.anInt3107 = (local16.anInt3103 - Static159.anInt3873 << 8) / local85;
						Static159.aClass62Array1[Static159.anInt3852++] = local16;
					}
				}
			} else if (local16.anInt3117 == 4) {
				local27 = local16.anInt3122 - Static159.anInt3873;
				if (local27 > 128) {
					local42 = local16.anInt3115 + Static159.anInt3864 - Static159.anInt3854;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3120 + Static159.anInt3864 - Static159.anInt3854;
					if (local53 > Static159.anInt3864 + Static159.anInt3864) {
						local53 = Static159.anInt3864 + Static159.anInt3864;
					}
					if (local42 <= local53) {
						@Pc(335) int local335 = local16.anInt3105 + Static159.anInt3864 - Static159.anInt3862;
						if (local335 < 0) {
							local335 = 0;
						}
						local85 = local16.anInt3102 + Static159.anInt3864 - Static159.anInt3862;
						if (local85 > Static159.anInt3864 + Static159.anInt3864) {
							local85 = Static159.anInt3864 + Static159.anInt3864;
						}
						@Pc(357) boolean local357 = false;
						label142: for (@Pc(359) int local359 = local335; local359 <= local85; local359++) {
							for (@Pc(362) int local362 = local42; local362 <= local53; local362++) {
								if (Static159.aBooleanArrayArray1[local359][local362]) {
									local357 = true;
									break label142;
								}
							}
						}
						if (local357) {
							local16.anInt3108 = 5;
							local16.anInt3110 = (local16.anInt3111 - Static159.anInt3859 << 8) / local27;
							local16.anInt3118 = (local16.anInt3113 - Static159.anInt3859 << 8) / local27;
							local16.anInt3104 = (local16.anInt3121 - Static159.anInt3853 << 8) / local27;
							local16.anInt3106 = (local16.anInt3119 - Static159.anInt3853 << 8) / local27;
							Static159.aClass62Array1[Static159.anInt3852++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIII)V")
	public void method2674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt3857 * 128) {
			arg0 = this.anInt3857 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt3856 * 128) {
			arg2 = this.anInt3856 * 128 - 1;
		}
		Static159.anInt3861++;
		Static159.anInt3845 = Class1_Sub1_Sub12_Sub2.anIntArray416[arg3];
		Static159.anInt3855 = Class1_Sub1_Sub12_Sub2.anIntArray417[arg3];
		Static159.anInt3851 = Class1_Sub1_Sub12_Sub2.anIntArray416[arg4];
		Static159.anInt3849 = Class1_Sub1_Sub12_Sub2.anIntArray417[arg4];
		Static159.aBooleanArrayArray1 = Static159.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static159.anInt3859 = arg0;
		Static159.anInt3873 = arg1;
		Static159.anInt3853 = arg2;
		Static159.anInt3862 = arg0 / 128;
		Static159.anInt3854 = arg2 / 128;
		Static159.anInt3871 = arg5;
		Static159.anInt3846 = Static159.anInt3862 - Static159.anInt3864;
		if (Static159.anInt3846 < 0) {
			Static159.anInt3846 = 0;
		}
		Static159.anInt3865 = Static159.anInt3854 - Static159.anInt3864;
		if (Static159.anInt3865 < 0) {
			Static159.anInt3865 = 0;
		}
		Static159.anInt3870 = Static159.anInt3862 + Static159.anInt3864;
		if (Static159.anInt3870 > this.anInt3857) {
			Static159.anInt3870 = this.anInt3857;
		}
		Static159.anInt3847 = Static159.anInt3854 + Static159.anInt3864;
		if (Static159.anInt3847 > this.anInt3856) {
			Static159.anInt3847 = this.anInt3856;
		}
		this.method2673();
		Static159.anInt3868 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt3858; local128 < this.anInt3860; local128++) {
			@Pc(134) Class1_Sub10[][] local134 = this.aClass1_Sub10ArrayArrayArray1[local128];
			for (local136 = Static159.anInt3846; local136 < Static159.anInt3870; local136++) {
				for (local139 = Static159.anInt3865; local139 < Static159.anInt3847; local139++) {
					@Pc(146) Class1_Sub10 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt1785 <= arg5 && (Static159.aBooleanArrayArray1[local136 + Static159.anInt3864 - Static159.anInt3862][local139 + Static159.anInt3864 - Static159.anInt3854] || this.anIntArrayArrayArray7[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean90 = true;
							local146.aBoolean88 = true;
							if (local146.anInt1777 > 0) {
								local146.aBoolean89 = true;
							} else {
								local146.aBoolean89 = false;
							}
							Static159.anInt3868++;
						} else {
							local146.aBoolean90 = false;
							local146.aBoolean88 = false;
							local146.anInt1782 = 0;
						}
					}
				}
			}
		}
		@Pc(242) int local242;
		@Pc(251) int local251;
		@Pc(256) int local256;
		@Pc(260) int local260;
		@Pc(238) int local238;
		for (@Pc(224) int local224 = this.anInt3858; local224 < this.anInt3860; local224++) {
			@Pc(230) Class1_Sub10[][] local230 = this.aClass1_Sub10ArrayArrayArray1[local224];
			for (local139 = -Static159.anInt3864; local139 <= 0; local139++) {
				local238 = Static159.anInt3862 + local139;
				local242 = Static159.anInt3862 - local139;
				if (local238 >= Static159.anInt3846 || local242 < Static159.anInt3870) {
					for (local251 = -Static159.anInt3864; local251 <= 0; local251++) {
						local256 = Static159.anInt3854 + local251;
						local260 = Static159.anInt3854 - local251;
						@Pc(272) Class1_Sub10 local272;
						if (local238 >= Static159.anInt3846) {
							if (local256 >= Static159.anInt3865) {
								local272 = local230[local238][local256];
								if (local272 != null && local272.aBoolean90) {
									this.method2711(local272, true);
								}
							}
							if (local260 < Static159.anInt3847) {
								local272 = local230[local238][local260];
								if (local272 != null && local272.aBoolean90) {
									this.method2711(local272, true);
								}
							}
						}
						if (local242 < Static159.anInt3870) {
							if (local256 >= Static159.anInt3865) {
								local272 = local230[local242][local256];
								if (local272 != null && local272.aBoolean90) {
									this.method2711(local272, true);
								}
							}
							if (local260 < Static159.anInt3847) {
								local272 = local230[local242][local260];
								if (local272 != null && local272.aBoolean90) {
									this.method2711(local272, true);
								}
							}
						}
						if (Static159.anInt3868 == 0) {
							Static159.aBoolean197 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt3858; local136 < this.anInt3860; local136++) {
			@Pc(363) Class1_Sub10[][] local363 = this.aClass1_Sub10ArrayArrayArray1[local136];
			for (local238 = -Static159.anInt3864; local238 <= 0; local238++) {
				local242 = Static159.anInt3862 + local238;
				local251 = Static159.anInt3862 - local238;
				if (local242 >= Static159.anInt3846 || local251 < Static159.anInt3870) {
					for (local256 = -Static159.anInt3864; local256 <= 0; local256++) {
						local260 = Static159.anInt3854 + local256;
						@Pc(393) int local393 = Static159.anInt3854 - local256;
						@Pc(405) Class1_Sub10 local405;
						if (local242 >= Static159.anInt3846) {
							if (local260 >= Static159.anInt3865) {
								local405 = local363[local242][local260];
								if (local405 != null && local405.aBoolean90) {
									this.method2711(local405, false);
								}
							}
							if (local393 < Static159.anInt3847) {
								local405 = local363[local242][local393];
								if (local405 != null && local405.aBoolean90) {
									this.method2711(local405, false);
								}
							}
						}
						if (local251 < Static159.anInt3870) {
							if (local260 >= Static159.anInt3865) {
								local405 = local363[local251][local260];
								if (local405 != null && local405.aBoolean90) {
									this.method2711(local405, false);
								}
							}
							if (local393 < Static159.anInt3847) {
								local405 = local363[local251][local393];
								if (local405 != null && local405.aBoolean90) {
									this.method2711(local405, false);
								}
							}
						}
						if (Static159.anInt3868 == 0) {
							Static159.aBoolean197 = false;
							return;
						}
					}
				}
			}
		}
		Static159.aBoolean197 = false;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(IIII)Z")
	private boolean method2675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method2672(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray7[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static159.anInt3859) {
					if (!this.method2709(local11, local26, local15)) {
						return false;
					}
					if (!this.method2709(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method2709(local11, local30, local15)) {
						return false;
					}
					if (!this.method2709(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method2709(local11, local34, local15)) {
					return false;
				}
				if (!this.method2709(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static159.anInt3853) {
					if (!this.method2709(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method2709(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method2709(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method2709(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method2709(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method2709(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static159.anInt3859) {
					if (!this.method2709(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method2709(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method2709(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method2709(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method2709(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method2709(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static159.anInt3853) {
					if (!this.method2709(local11, local26, local15)) {
						return false;
					}
					if (!this.method2709(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method2709(local11, local30, local15)) {
						return false;
					}
					if (!this.method2709(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method2709(local11, local34, local15)) {
					return false;
				}
				if (!this.method2709(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method2709(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method2709(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method2709(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method2709(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method2709(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(IIII)I")
	public int method2676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub10 local8 = this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass43_1 != null && local8.aClass43_1.anInt2034 == arg3) {
			return local8.aClass43_1.anInt2035 & 0xFF;
		} else if (local8.aClass72_1 != null && local8.aClass72_1.anInt3594 == arg3) {
			return local8.aClass72_1.anInt3599 & 0xFF;
		} else if (local8.aClass85_1 != null && local8.aClass85_1.anInt4123 == arg3) {
			return local8.aClass85_1.anInt4114 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt1777; local56++) {
				if (local8.aClass4Array1[local56].anInt316 == arg3) {
					return local8.aClass4Array1[local56].anInt304 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(III)V")
	public void method2677() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3860; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt3857; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt3856; local7++) {
					@Pc(17) Class1_Sub10 local17 = this.aClass1_Sub10ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class43 local22 = local17.aClass43_1;
						if (local22 != null && local22.aClass1_Sub1_Sub1_5 instanceof Class1_Sub1_Sub1_Sub6) {
							@Pc(32) Class1_Sub1_Sub1_Sub6 local32 = (Class1_Sub1_Sub1_Sub6) local22.aClass1_Sub1_Sub1_5;
							this.method2700(local32, local1, local4, local7, 1, 1);
							if (local22.aClass1_Sub1_Sub1_6 instanceof Class1_Sub1_Sub1_Sub6) {
								@Pc(48) Class1_Sub1_Sub1_Sub6 local48 = (Class1_Sub1_Sub1_Sub6) local22.aClass1_Sub1_Sub1_6;
								this.method2700(local48, local1, local4, local7, 1, 1);
								Static151.method2598(local32, local48, 0, 0, 0, false);
								local22.aClass1_Sub1_Sub1_6 = local48.method2609(local48.aShort35, local48.aShort32, -50, -10, -50, false);
							}
							local22.aClass1_Sub1_Sub1_5 = local32.method2609(local32.aShort35, local32.aShort32, -50, -10, -50, false);
						}
						@Pc(107) Class1_Sub1_Sub1_Sub6 local107;
						for (@Pc(91) int local91 = 0; local91 < local17.anInt1777; local91++) {
							@Pc(97) Class4 local97 = local17.aClass4Array1[local91];
							if (local97 != null && local97.aClass1_Sub1_Sub1_1 instanceof Class1_Sub1_Sub1_Sub6) {
								local107 = (Class1_Sub1_Sub1_Sub6) local97.aClass1_Sub1_Sub1_1;
								this.method2700(local107, local1, local4, local7, local97.anInt314 + 1 - local97.anInt312, local97.anInt317 - local97.anInt310 + 1);
								local97.aClass1_Sub1_Sub1_1 = local107.method2609(local107.aShort35, local107.aShort32, -50, -10, -50, false);
							}
						}
						@Pc(148) Class85 local148 = local17.aClass85_1;
						if (local148 != null && local148.aClass1_Sub1_Sub1_9 instanceof Class1_Sub1_Sub1_Sub6) {
							local107 = (Class1_Sub1_Sub1_Sub6) local148.aClass1_Sub1_Sub1_9;
							this.method2668(local107, local1, local4, local7);
							local148.aClass1_Sub1_Sub1_9 = local107.method2609(local107.aShort35, local107.aShort32, -50, -10, -50, false);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "g", descriptor = "(III)I")
	public int method2678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub10 local8 = this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass72_1 == null ? 0 : local8.aClass72_1.anInt3594;
	}

	@OriginalMember(owner = "client!te", name = "h", descriptor = "(III)V")
	public void method2679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub10 local8 = this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass43_1 = null;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public void method2680(@OriginalArg(0) int arg0) {
		this.anInt3858 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt3857; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt3856; local7++) {
				if (this.aClass1_Sub10ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass1_Sub10ArrayArrayArray1[arg0][local4][local7] = new Class1_Sub10(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(IIIIII)Z")
	private boolean method2681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray8[arg0][local17][local21] == -Static159.anInt3861) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray7[arg0][arg1][arg3] + arg5;
			if (!this.method2709(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method2709(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method2709(local21, local167, local195)) {
				return false;
			} else if (this.method2709(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method2672(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method2709(local17 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg3] + arg5, local21 + 1) && this.method2709(local17 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg3] + arg5, local21 + 1) && this.method2709(local17 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg3 + 1] + arg5, local21 + 128 - 1) && this.method2709(local17 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg3 + 1] + arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ae;)V")
	private void method2682(@OriginalArg(0) Class4 arg0) {
		for (@Pc(2) int local2 = arg0.anInt312; local2 <= arg0.anInt314; local2++) {
			for (@Pc(6) int local6 = arg0.anInt310; local6 <= arg0.anInt317; local6++) {
				@Pc(17) Class1_Sub10 local17 = this.aClass1_Sub10ArrayArrayArray1[arg0.anInt311][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt1777; local21++) {
						if (local17.aClass4Array1[local21] == arg0) {
							local17.anInt1777--;
							for (local36 = local21; local36 < local17.anInt1777; local36++) {
								local17.aClass4Array1[local36] = local17.aClass4Array1[local36 + 1];
								local17.anIntArray243[local36] = local17.anIntArray243[local36 + 1];
							}
							local17.aClass4Array1[local17.anInt1777] = null;
							break;
						}
					}
					local17.anInt1786 = 0;
					for (local36 = 0; local36 < local17.anInt1777; local36++) {
						local17.anInt1786 |= local17.anIntArray243[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIILclient!ka;III)Z")
	public boolean method2683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method2697(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!te", name = "i", descriptor = "(III)Lclient!ae;")
	public Class4 method2684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub10 local8 = this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1777; local14++) {
			@Pc(20) Class4 local20 = local8.aClass4Array1[local14];
			if ((local20.anInt316 >> 29 & 0x3) == 2 && local20.anInt312 == arg1 && local20.anInt310 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!te", name = "j", descriptor = "(III)V")
	public void method2685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub10 local8 = this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt1777; local13++) {
			@Pc(19) Class4 local19 = local8.aClass4Array1[local13];
			if ((local19.anInt316 >> 29 & 0x3) == 2 && local19.anInt312 == arg1 && local19.anInt310 == arg2) {
				this.method2682(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method2686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class24 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class24(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub10ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub10ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub10(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2].aClass24_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class24(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub10ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub10ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub10(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2].aClass24_1 = local12;
		} else {
			@Pc(140) Class3 local140 = new Class3(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub10ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub10ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub10(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2].aClass3_1 = local140;
		}
	}

	@OriginalMember(owner = "client!te", name = "k", descriptor = "(III)I")
	public int method2687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub10 local8 = this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass85_1 == null ? 0 : local8.aClass85_1.anInt4123;
	}

	@OriginalMember(owner = "client!te", name = "l", descriptor = "(III)I")
	public int method2688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub10 local8 = this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1777; local14++) {
			@Pc(20) Class4 local20 = local8.aClass4Array1[local14];
			if ((local20.anInt316 >> 29 & 0x3) == 2 && local20.anInt312 == arg1 && local20.anInt310 == arg2) {
				return local20.anInt316;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIILclient!ka;Lclient!ka;IIII)V")
	public void method2689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub1 arg4, @OriginalArg(5) Class1_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class43 local8 = new Class43();
		local8.anInt2034 = arg8;
		local8.anInt2035 = arg9;
		local8.anInt2030 = arg1 * 128 + 64;
		local8.anInt2033 = arg2 * 128 + 64;
		local8.anInt2037 = arg3;
		local8.aClass1_Sub1_Sub1_5 = arg4;
		local8.aClass1_Sub1_Sub1_6 = arg5;
		local8.anInt2038 = arg6;
		local8.anInt2032 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass1_Sub10ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass1_Sub10ArrayArrayArray1[local45][arg1][arg2] = new Class1_Sub10(local45, arg1, arg2);
			}
		}
		this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2].aClass43_1 = local8;
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(IIII)Z")
	private boolean method2690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method2672(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method2709(local11 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2] + arg3, local15 + 1) && this.method2709(local11 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2] + arg3, local15 + 1) && this.method2709(local11 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1] + arg3, local15 + 128 - 1) && this.method2709(local11 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2 + 1] + arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIILclient!ka;II)V")
	public void method2691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class85 local6 = new Class85();
		local6.aClass1_Sub1_Sub1_9 = arg4;
		local6.anInt4119 = arg1 * 128 + 64;
		local6.anInt4121 = arg2 * 128 + 64;
		local6.anInt4115 = arg3;
		local6.anInt4123 = arg5;
		local6.anInt4114 = arg6;
		if (this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub10(arg0, arg1, arg2);
		}
		this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2].aClass85_1 = local6;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ee;IIIIIII)V")
	private void method2692(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static159.anInt3859;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static159.anInt3853;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray7[arg1][arg6][arg7] - Static159.anInt3873;
		@Pc(51) int local51 = this.anIntArrayArrayArray7[arg1][arg6 + 1][arg7] - Static159.anInt3873;
		@Pc(66) int local66 = this.anIntArrayArrayArray7[arg1][arg6 + 1][arg7 + 1] - Static159.anInt3873;
		@Pc(79) int local79 = this.anIntArrayArrayArray7[arg1][arg6][arg7 + 1] - Static159.anInt3873;
		@Pc(89) int local89 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(99) int local99 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(101) int local101 = local89;
		@Pc(111) int local111 = local38 * arg3 - local99 * arg2 >> 16;
		@Pc(121) int local121 = local38 * arg2 + local99 * arg3 >> 16;
		@Pc(123) int local123 = local111;
		if (local121 < 50) {
			return;
		}
		local89 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(147) int local147 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local89;
		local89 = local51 * arg3 - local147 * arg2 >> 16;
		@Pc(169) int local169 = local51 * arg2 + local147 * arg3 >> 16;
		local51 = local89;
		if (local169 < 50) {
			return;
		}
		local89 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(197) int local197 = local89;
		local89 = local66 * arg3 - local27 * arg2 >> 16;
		local27 = local66 * arg2 + local27 * arg3 >> 16;
		local66 = local89;
		if (local27 < 50) {
			return;
		}
		local89 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(243) int local243 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(245) int local245 = local89;
		local89 = local79 * arg3 - local243 * arg2 >> 16;
		@Pc(265) int local265 = local79 * arg2 + local243 * arg3 >> 16;
		if (local265 < 50) {
			return;
		}
		@Pc(279) int local279 = Static121.anInt3151 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static121.anInt3145 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static121.anInt3151 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static121.anInt3145 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static121.anInt3151 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static121.anInt3145 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static121.anInt3151 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static121.anInt3145 + (local89 << 9) / local265;
		Static121.anInt3150 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			if (Static159.aBoolean197 && this.method2708(Static159.anInt3863, Static159.anInt3867, local319, local335, local303, local311, local327, local295)) {
				Static159.anInt3869 = arg6;
				Static159.anInt3872 = arg7;
			}
			Static121.aBoolean162 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static121.anInt3146 || local327 > Static121.anInt3146 || local295 > Static121.anInt3146) {
				Static121.aBoolean162 = true;
			}
			if (arg0.anInt1098 == -1) {
				if (arg0.anInt1095 != 12345678) {
					Static121.method2149(local319, local335, local303, local311, local327, local295, arg0.anInt1095, arg0.anInt1100, arg0.anInt1094);
				}
			} else if (Static159.aBoolean196) {
				local472 = Static121.anInterface1_1.method109(arg0.anInt1098);
				Static121.method2149(local319, local335, local303, local311, local327, local295, Static159.method2699(local472, arg0.anInt1095), Static159.method2699(local472, arg0.anInt1100), Static159.method2699(local472, arg0.anInt1094));
			} else if (arg0.aBoolean51) {
				Static121.method2146(local319, local335, local303, local311, local327, local295, arg0.anInt1095, arg0.anInt1100, arg0.anInt1094, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1098);
			} else {
				Static121.method2146(local319, local335, local303, local311, local327, local295, arg0.anInt1095, arg0.anInt1100, arg0.anInt1094, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1098);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		if (Static159.aBoolean197 && this.method2708(Static159.anInt3863, Static159.anInt3867, local287, local303, local335, local279, local295, local327)) {
			Static159.anInt3869 = arg6;
			Static159.anInt3872 = arg7;
		}
		Static121.aBoolean162 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static121.anInt3146 || local295 > Static121.anInt3146 || local327 > Static121.anInt3146) {
			Static121.aBoolean162 = true;
		}
		if (arg0.anInt1098 != -1) {
			if (!Static159.aBoolean196) {
				Static121.method2146(local287, local303, local335, local279, local295, local327, arg0.anInt1093, arg0.anInt1094, arg0.anInt1100, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1098);
				return;
			}
			local472 = Static121.anInterface1_1.method109(arg0.anInt1098);
			Static121.method2149(local287, local303, local335, local279, local295, local327, Static159.method2699(local472, arg0.anInt1093), Static159.method2699(local472, arg0.anInt1094), Static159.method2699(local472, arg0.anInt1100));
		} else if (arg0.anInt1093 != 12345678) {
			Static121.method2149(local287, local303, local335, local279, local295, local327, arg0.anInt1093, arg0.anInt1094, arg0.anInt1100);
			return;
		}
	}

	@OriginalMember(owner = "client!te", name = "m", descriptor = "(III)Lclient!ja;")
	public Class43 method2693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub10 local8 = this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass43_1;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "()V")
	public void method2694() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3866; local1++) {
			@Pc(7) Class4 local7 = this.aClass4Array3[local1];
			this.method2682(local7);
			this.aClass4Array3[local1] = null;
		}
		this.anInt3866 = 0;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIILclient!ka;IIIIII)Z")
	public boolean method2695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class1_Sub1_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method2697(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIIILclient!ka;IZII)Z")
	private boolean method2697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub1_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt3857 || local4 >= this.anInt3856) {
					return false;
				}
				@Pc(28) Class1_Sub10 local28 = this.aClass1_Sub10ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt1777 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class4 local52 = new Class4();
		local52.anInt316 = arg11;
		local52.anInt304 = arg12;
		local52.anInt311 = arg0;
		local52.anInt315 = arg5;
		local52.anInt306 = arg6;
		local52.anInt307 = arg7;
		local52.aClass1_Sub1_Sub1_1 = arg8;
		local52.anInt308 = arg9;
		local52.anInt312 = arg1;
		local52.anInt310 = arg2;
		local52.anInt314 = arg1 + arg3 - 1;
		local52.anInt317 = arg2 + arg4 - 1;
		for (@Pc(98) int local98 = arg1; local98 < arg1 + arg3; local98++) {
			for (@Pc(101) int local101 = arg2; local101 < arg2 + arg4; local101++) {
				@Pc(104) int local104 = 0;
				if (local98 > arg1) {
					local104++;
				}
				if (local98 < arg1 + arg3 - 1) {
					local104 += 4;
				}
				if (local101 > arg2) {
					local104 += 8;
				}
				if (local101 < arg2 + arg4 - 1) {
					local104 += 2;
				}
				for (@Pc(130) int local130 = arg0; local130 >= 0; local130--) {
					if (this.aClass1_Sub10ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass1_Sub10ArrayArrayArray1[local130][local98][local101] = new Class1_Sub10(local130, local98, local101);
					}
				}
				@Pc(166) Class1_Sub10 local166 = this.aClass1_Sub10ArrayArrayArray1[arg0][local98][local101];
				local166.aClass4Array1[local166.anInt1777] = local52;
				local166.anIntArray243[local166.anInt1777] = local104;
				local166.anInt1786 |= local104;
				local166.anInt1777++;
			}
		}
		if (arg10) {
			this.aClass4Array3[this.anInt3866++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!te", name = "n", descriptor = "(III)Lclient!rd;")
	public Class72 method2698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub10 local8 = this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass72_1;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!sf;IIIII)V")
	private void method2700(@OriginalArg(0) Class1_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt3860) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt3857) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt3856 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class1_Sub10 local66 = this.aClass1_Sub10ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray7[local17][local24][local34] + this.anIntArrayArrayArray7[local17][local24 + 1][local34] + this.anIntArrayArrayArray7[local17][local24][local34 + 1] + this.anIntArrayArrayArray7[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray7[arg1][arg2][arg3] + this.anIntArrayArrayArray7[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray7[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray7[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class43 local163 = local66.aClass43_1;
									if (local163 != null) {
										@Pc(173) Class1_Sub1_Sub1_Sub6 local173;
										if (local163.aClass1_Sub1_Sub1_5 instanceof Class1_Sub1_Sub1_Sub6) {
											local173 = (Class1_Sub1_Sub1_Sub6) local163.aClass1_Sub1_Sub1_5;
											Static151.method2598(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass1_Sub1_Sub1_6 instanceof Class1_Sub1_Sub1_Sub6) {
											local173 = (Class1_Sub1_Sub1_Sub6) local163.aClass1_Sub1_Sub1_6;
											Static151.method2598(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt1777; local237++) {
										@Pc(243) Class4 local243 = local66.aClass4Array1[local237];
										if (local243 != null && local243.aClass1_Sub1_Sub1_1 instanceof Class1_Sub1_Sub1_Sub6) {
											@Pc(253) Class1_Sub1_Sub1_Sub6 local253 = (Class1_Sub1_Sub1_Sub6) local243.aClass1_Sub1_Sub1_1;
											@Pc(261) int local261 = local243.anInt314 + 1 - local243.anInt312;
											@Pc(269) int local269 = local243.anInt317 + 1 - local243.anInt310;
											Static151.method2598(arg0, local253, (local243.anInt312 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt310 - arg3) * 128 + (local269 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "o", descriptor = "(III)V")
	public void method2701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub10 local8 = this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass8_1 = null;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([IIIIII)V")
	public void method2702(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class1_Sub10 local8 = this.aClass1_Sub10ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class24 local14 = local8.aClass24_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1096;
			if (local19 != 0) {
				for (local24 = 0; local24 < 4; local24++) {
					arg0[arg1] = local19;
					arg0[arg1 + 1] = local19;
					arg0[arg1 + 2] = local19;
					arg0[arg1 + 3] = local19;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(59) Class3 local59 = local8.aClass3_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt240;
		@Pc(68) int local68 = local59.anInt238;
		@Pc(71) int local71 = local59.anInt239;
		@Pc(74) int local74 = local59.anInt241;
		@Pc(79) int[] local79 = this.anIntArrayArray36[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray37[local68];
		@Pc(86) int local86 = 0;
		@Pc(90) int local90;
		if (local71 != 0) {
			for (local90 = 0; local90 < 4; local90++) {
				arg0[arg1] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 1] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 2] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 3] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg1 += 512;
			}
			return;
		}
		for (local90 = 0; local90 < 4; local90++) {
			if (local79[local84[local86++]] != 0) {
				arg0[arg1] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 1] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 2] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 3] = local74;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(II)V")
	public void method2703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub10 local8 = this.aClass1_Sub10ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class1_Sub10 local31 = this.aClass1_Sub10ArrayArrayArray1[local10][arg0][arg1] = this.aClass1_Sub10ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt1787--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt1777; local41++) {
					@Pc(47) Class4 local47 = local31.aClass4Array1[local41];
					if ((local47.anInt316 >> 29 & 0x3) == 2 && local47.anInt312 == arg0 && local47.anInt310 == arg1) {
						local47.anInt311--;
					}
				}
			}
		}
		if (this.aClass1_Sub10ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass1_Sub10ArrayArrayArray1[0][arg0][arg1] = new Class1_Sub10(0, arg0, arg1);
		}
		this.aClass1_Sub10ArrayArrayArray1[0][arg0][arg1].aClass1_Sub10_1 = local8;
		this.aClass1_Sub10ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ab;IIIIII)V")
	private void method2704(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray27.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray27[local5] - Static159.anInt3859;
			local20 = arg0.anIntArray30[local5] - Static159.anInt3873;
			local27 = arg0.anIntArray25[local5] - Static159.anInt3853;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray36 != null) {
				Static3.anIntArray32[local5] = local37;
				Static3.anIntArray26[local5] = local59;
				Static3.anIntArray35[local5] = local69;
			}
			Static3.anIntArray23[local5] = Static121.anInt3151 + (local37 << 9) / local69;
			Static3.anIntArray31[local5] = Static121.anInt3145 + (local59 << 9) / local69;
		}
		Static121.anInt3150 = 0;
		local3 = arg0.anIntArray34.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray34[local13];
			local27 = arg0.anIntArray37[local13];
			local37 = arg0.anIntArray29[local13];
			@Pc(142) int local142 = Static3.anIntArray23[local20];
			@Pc(146) int local146 = Static3.anIntArray23[local27];
			@Pc(150) int local150 = Static3.anIntArray23[local37];
			@Pc(154) int local154 = Static3.anIntArray31[local20];
			@Pc(158) int local158 = Static3.anIntArray31[local27];
			@Pc(162) int local162 = Static3.anIntArray31[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static159.aBoolean197 && this.method2708(Static159.anInt3863, Static159.anInt3867, local154, local158, local162, local142, local146, local150)) {
					Static159.anInt3869 = arg5;
					Static159.anInt3872 = arg6;
				}
				Static121.aBoolean162 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static121.anInt3146 || local146 > Static121.anInt3146 || local150 > Static121.anInt3146) {
					Static121.aBoolean162 = true;
				}
				if (arg0.anIntArray36 == null || arg0.anIntArray36[local13] == -1) {
					if (arg0.anIntArray33[local13] != 12345678) {
						Static121.method2149(local154, local158, local162, local142, local146, local150, arg0.anIntArray33[local13], arg0.anIntArray28[local13], arg0.anIntArray24[local13]);
					}
				} else if (Static159.aBoolean196) {
					@Pc(364) int local364 = Static121.anInterface1_1.method109(arg0.anIntArray36[local13]);
					Static121.method2149(local154, local158, local162, local142, local146, local150, Static159.method2699(local364, arg0.anIntArray33[local13]), Static159.method2699(local364, arg0.anIntArray28[local13]), Static159.method2699(local364, arg0.anIntArray24[local13]));
				} else if (arg0.aBoolean13) {
					Static121.method2146(local154, local158, local162, local142, local146, local150, arg0.anIntArray33[local13], arg0.anIntArray28[local13], arg0.anIntArray24[local13], Static3.anIntArray32[0], Static3.anIntArray32[1], Static3.anIntArray32[3], Static3.anIntArray26[0], Static3.anIntArray26[1], Static3.anIntArray26[3], Static3.anIntArray35[0], Static3.anIntArray35[1], Static3.anIntArray35[3], arg0.anIntArray36[local13]);
				} else {
					Static121.method2146(local154, local158, local162, local142, local146, local150, arg0.anIntArray33[local13], arg0.anIntArray28[local13], arg0.anIntArray24[local13], Static3.anIntArray32[local20], Static3.anIntArray32[local27], Static3.anIntArray32[local37], Static3.anIntArray26[local20], Static3.anIntArray26[local27], Static3.anIntArray26[local37], Static3.anIntArray35[local20], Static3.anIntArray35[local27], Static3.anIntArray35[local37], arg0.anIntArray36[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIILclient!ka;IIZ)Z")
	public boolean method2705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return this.method2697(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(IIII)V")
	public void method2706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub10 local8 = this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class72 local14 = local8.aClass72_1;
		if (local14 != null) {
			local14.anInt3597 = local14.anInt3597 * arg3 / 16;
			local14.anInt3595 = local14.anInt3595 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "()V")
	public void method2707() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt3860; local1++) {
			for (local4 = 0; local4 < this.anInt3857; local4++) {
				for (local7 = 0; local7 < this.anInt3856; local7++) {
					this.aClass1_Sub10ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static159.anInt3850; local4++) {
			for (local7 = 0; local7 < Static159.anIntArray522[local4]; local7++) {
				Static159.aClass62ArrayArray1[local4][local7] = null;
			}
			Static159.anIntArray522[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt3866; local7++) {
			this.aClass4Array3[local7] = null;
		}
		this.anInt3866 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static159.aClass4Array2.length; local76++) {
			Static159.aClass4Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method2708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!te", name = "p", descriptor = "(III)Z")
	private boolean method2709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static159.anInt3852; local1++) {
			@Pc(6) Class62 local6 = Static159.aClass62Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt3108 == 1) {
				local15 = local6.anInt3111 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt3121 + (local6.anInt3104 * local15 >> 8);
					local37 = local6.anInt3119 + (local6.anInt3106 * local15 >> 8);
					local47 = local6.anInt3122 + (local6.anInt3109 * local15 >> 8);
					local57 = local6.anInt3103 + (local6.anInt3107 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3108 == 2) {
				local15 = arg0 - local6.anInt3111;
				if (local15 > 0) {
					local27 = local6.anInt3121 + (local6.anInt3104 * local15 >> 8);
					local37 = local6.anInt3119 + (local6.anInt3106 * local15 >> 8);
					local47 = local6.anInt3122 + (local6.anInt3109 * local15 >> 8);
					local57 = local6.anInt3103 + (local6.anInt3107 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3108 == 3) {
				local15 = local6.anInt3121 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt3111 + (local6.anInt3110 * local15 >> 8);
					local37 = local6.anInt3113 + (local6.anInt3118 * local15 >> 8);
					local47 = local6.anInt3122 + (local6.anInt3109 * local15 >> 8);
					local57 = local6.anInt3103 + (local6.anInt3107 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3108 == 4) {
				local15 = arg2 - local6.anInt3121;
				if (local15 > 0) {
					local27 = local6.anInt3111 + (local6.anInt3110 * local15 >> 8);
					local37 = local6.anInt3113 + (local6.anInt3118 * local15 >> 8);
					local47 = local6.anInt3122 + (local6.anInt3109 * local15 >> 8);
					local57 = local6.anInt3103 + (local6.anInt3107 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3108 == 5) {
				local15 = arg1 - local6.anInt3122;
				if (local15 > 0) {
					local27 = local6.anInt3111 + (local6.anInt3110 * local15 >> 8);
					local37 = local6.anInt3113 + (local6.anInt3118 * local15 >> 8);
					local47 = local6.anInt3121 + (local6.anInt3104 * local15 >> 8);
					local57 = local6.anInt3119 + (local6.anInt3106 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!te", name = "q", descriptor = "(III)Lclient!va;")
	public Class85 method2710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub10 local8 = this.aClass1_Sub10ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass85_1 == null ? null : local8.aClass85_1;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ib;Z)V")
	private void method2711(@OriginalArg(0) Class1_Sub10 arg0, @OriginalArg(1) boolean arg1) {
		Static159.aClass56_16.method1856(arg0);
		while (true) {
			@Pc(8) Class1_Sub10 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class1_Sub10[][] local31;
			@Pc(49) Class1_Sub10 local49;
			@Pc(251) int local251;
			@Pc(592) int local592;
			@Pc(597) int local597;
			@Pc(602) int local602;
			@Pc(919) Class43 local919;
			@Pc(1093) int local1093;
			@Pc(978) int local978;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class4 var12;
										@Pc(605) int var17;
										@Pc(614) int var18;
										@Pc(626) int var19;
										@Pc(345) int var21;
										@Pc(289) boolean var22;
										@Pc(800) Class1_Sub10 var33;
										while (true) {
											do {
												local8 = (Class1_Sub10) Static159.aClass56_16.method1857();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean88);
											local17 = local8.anInt1783;
											local20 = local8.anInt1778;
											local23 = local8.anInt1787;
											local26 = local8.anInt1781;
											local31 = this.aClass1_Sub10ArrayArrayArray1[local23];
											if (!local8.aBoolean90) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass1_Sub10ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean88) {
														continue;
													}
												}
												if (local17 <= Static159.anInt3862 && local17 > Static159.anInt3846) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean88 && (local49.aBoolean90 || (local8.anInt1786 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static159.anInt3862 && local17 < Static159.anInt3870 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean88 && (local49.aBoolean90 || (local8.anInt1786 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static159.anInt3854 && local20 > Static159.anInt3865) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean88 && (local49.aBoolean90 || (local8.anInt1786 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static159.anInt3854 && local20 < Static159.anInt3847 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean88 && (local49.aBoolean90 || (local8.anInt1786 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean90 = false;
											if (local8.aClass1_Sub10_1 != null) {
												local49 = local8.aClass1_Sub10_1;
												if (local49.aClass24_1 == null) {
													if (local49.aClass3_1 != null && !this.method2672(0, local17, local20)) {
														this.method2704(local49.aClass3_1, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local17, local20);
													}
												} else if (!this.method2672(0, local17, local20)) {
													this.method2692(local49.aClass24_1, 0, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local17, local20);
												}
												@Pc(225) Class43 local225 = local49.aClass43_1;
												if (local225 != null) {
													local225.aClass1_Sub1_Sub1_5.method3156(0, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local225.anInt2030 - Static159.anInt3859, local225.anInt2037 - Static159.anInt3873, local225.anInt2033 - Static159.anInt3853, local225.anInt2034);
												}
												for (local251 = 0; local251 < local49.anInt1777; local251++) {
													var12 = local49.aClass4Array1[local251];
													if (var12 != null) {
														var12.aClass1_Sub1_Sub1_1.method3156(var12.anInt308, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, var12.anInt315 - Static159.anInt3859, var12.anInt307 - Static159.anInt3873, var12.anInt306 - Static159.anInt3853, var12.anInt316);
													}
												}
											}
											var22 = false;
											if (local8.aClass24_1 == null) {
												if (local8.aClass3_1 != null && !this.method2672(local26, local17, local20)) {
													var22 = true;
													this.method2704(local8.aClass3_1, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local17, local20);
												}
											} else if (!this.method2672(local26, local17, local20)) {
												var22 = true;
												if (local8.aClass24_1.anInt1095 != 12345678 || Static159.aBoolean197 && local23 <= Static159.anInt3848) {
													this.method2692(local8.aClass24_1, local26, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local17, local20);
												}
											}
											var21 = 0;
											local251 = 0;
											@Pc(350) Class43 local350 = local8.aClass43_1;
											@Pc(353) Class72 local353 = local8.aClass72_1;
											if (local350 != null || local353 != null) {
												if (Static159.anInt3862 == local17) {
													var21++;
												} else if (Static159.anInt3862 < local17) {
													var21 += 2;
												}
												if (Static159.anInt3854 == local20) {
													var21 += 3;
												} else if (Static159.anInt3854 > local20) {
													var21 += 6;
												}
												local251 = Static159.anIntArray524[var21];
												local8.anInt1784 = Static159.anIntArray525[var21];
											}
											if (local350 != null) {
												if ((local350.anInt2038 & Static159.anIntArray526[var21]) == 0) {
													local8.anInt1782 = 0;
												} else if (local350.anInt2038 == 16) {
													local8.anInt1782 = 3;
													local8.anInt1779 = Static159.anIntArray528[var21];
													local8.anInt1780 = 3 - local8.anInt1779;
												} else if (local350.anInt2038 == 32) {
													local8.anInt1782 = 6;
													local8.anInt1779 = Static159.anIntArray529[var21];
													local8.anInt1780 = 6 - local8.anInt1779;
												} else if (local350.anInt2038 == 64) {
													local8.anInt1782 = 12;
													local8.anInt1779 = Static159.anIntArray523[var21];
													local8.anInt1780 = 12 - local8.anInt1779;
												} else {
													local8.anInt1782 = 9;
													local8.anInt1779 = Static159.anIntArray527[var21];
													local8.anInt1780 = 9 - local8.anInt1779;
												}
												if ((local350.anInt2038 & local251) != 0 && !this.method2675(local26, local17, local20, local350.anInt2038)) {
													local350.aClass1_Sub1_Sub1_5.method3156(0, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local350.anInt2030 - Static159.anInt3859, local350.anInt2037 - Static159.anInt3873, local350.anInt2033 - Static159.anInt3853, local350.anInt2034);
												}
												if ((local350.anInt2032 & local251) != 0 && !this.method2675(local26, local17, local20, local350.anInt2032)) {
													local350.aClass1_Sub1_Sub1_6.method3156(0, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local350.anInt2030 - Static159.anInt3859, local350.anInt2037 - Static159.anInt3873, local350.anInt2033 - Static159.anInt3853, local350.anInt2034);
												}
											}
											if (local353 != null && !this.method2690(local26, local17, local20, local353.aClass1_Sub1_Sub1_7.aShort36)) {
												if ((local353.anInt3600 & local251) != 0) {
													local353.aClass1_Sub1_Sub1_7.method3156(0, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local353.anInt3601 + local353.anInt3597 - Static159.anInt3859, local353.anInt3592 - Static159.anInt3873, local353.anInt3596 + local353.anInt3595 - Static159.anInt3853, local353.anInt3594);
												} else if (local353.anInt3600 == 256) {
													local592 = local353.anInt3601 - Static159.anInt3859;
													local597 = local353.anInt3592 - Static159.anInt3873;
													local602 = local353.anInt3596 - Static159.anInt3853;
													var17 = local353.anInt3591;
													if (var17 == 1 || var17 == 2) {
														var18 = -local592;
													} else {
														var18 = local592;
													}
													if (var17 == 2 || var17 == 3) {
														var19 = -local602;
													} else {
														var19 = local602;
													}
													if (var19 < var18) {
														local353.aClass1_Sub1_Sub1_7.method3156(0, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local592 + local353.anInt3597, local597, local602 + local353.anInt3595, local353.anInt3594);
													} else if (local353.aClass1_Sub1_Sub1_8 != null) {
														local353.aClass1_Sub1_Sub1_8.method3156(0, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local592, local597, local602, local353.anInt3594);
													}
												}
											}
											if (var22) {
												@Pc(673) Class85 local673 = local8.aClass85_1;
												if (local673 != null) {
													local673.aClass1_Sub1_Sub1_9.method3156(0, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local673.anInt4119 - Static159.anInt3859, local673.anInt4115 - Static159.anInt3873, local673.anInt4121 - Static159.anInt3853, local673.anInt4123);
												}
												@Pc(700) Class8 local700 = local8.aClass8_1;
												if (local700 != null && local700.anInt384 == 0) {
													if (local700.aClass1_Sub1_Sub1_2 != null) {
														local700.aClass1_Sub1_Sub1_2.method3156(0, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local700.anInt387 - Static159.anInt3859, local700.anInt383 - Static159.anInt3873, local700.anInt386 - Static159.anInt3853, local700.anInt385);
													}
													if (local700.aClass1_Sub1_Sub1_4 != null) {
														local700.aClass1_Sub1_Sub1_4.method3156(0, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local700.anInt387 - Static159.anInt3859, local700.anInt383 - Static159.anInt3873, local700.anInt386 - Static159.anInt3853, local700.anInt385);
													}
													if (local700.aClass1_Sub1_Sub1_3 != null) {
														local700.aClass1_Sub1_Sub1_3.method3156(0, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local700.anInt387 - Static159.anInt3859, local700.anInt383 - Static159.anInt3873, local700.anInt386 - Static159.anInt3853, local700.anInt385);
													}
												}
											}
											local592 = local8.anInt1786;
											if (local592 != 0) {
												if (local17 < Static159.anInt3862 && (local592 & 0x4) != 0) {
													var33 = local31[local17 + 1][local20];
													if (var33 != null && var33.aBoolean88) {
														Static159.aClass56_16.method1856(var33);
													}
												}
												if (local20 < Static159.anInt3854 && (local592 & 0x2) != 0) {
													var33 = local31[local17][local20 + 1];
													if (var33 != null && var33.aBoolean88) {
														Static159.aClass56_16.method1856(var33);
													}
												}
												if (local17 > Static159.anInt3862 && (local592 & 0x1) != 0) {
													var33 = local31[local17 - 1][local20];
													if (var33 != null && var33.aBoolean88) {
														Static159.aClass56_16.method1856(var33);
													}
												}
												if (local20 > Static159.anInt3854 && (local592 & 0x8) != 0) {
													var33 = local31[local17][local20 - 1];
													if (var33 != null && var33.aBoolean88) {
														Static159.aClass56_16.method1856(var33);
													}
												}
											}
											break;
										}
										if (local8.anInt1782 != 0) {
											var22 = true;
											for (var21 = 0; var21 < local8.anInt1777; var21++) {
												if (local8.aClass4Array1[var21].anInt309 != Static159.anInt3861 && (local8.anIntArray243[var21] & local8.anInt1782) == local8.anInt1779) {
													var22 = false;
													break;
												}
											}
											if (var22) {
												local919 = local8.aClass43_1;
												if (!this.method2675(local26, local17, local20, local919.anInt2038)) {
													local919.aClass1_Sub1_Sub1_5.method3156(0, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local919.anInt2030 - Static159.anInt3859, local919.anInt2037 - Static159.anInt3873, local919.anInt2033 - Static159.anInt3853, local919.anInt2034);
												}
												local8.anInt1782 = 0;
											}
										}
										if (!local8.aBoolean89) {
											break;
										}
										try {
											@Pc(958) int local958 = local8.anInt1777;
											local8.aBoolean89 = false;
											var21 = 0;
											label558: for (local251 = 0; local251 < local958; local251++) {
												var12 = local8.aClass4Array1[local251];
												if (var12.anInt309 != Static159.anInt3861) {
													for (local978 = var12.anInt312; local978 <= var12.anInt314; local978++) {
														for (local592 = var12.anInt310; local592 <= var12.anInt317; local592++) {
															var33 = local31[local978][local592];
															if (var33.aBoolean90) {
																local8.aBoolean89 = true;
																continue label558;
															}
															if (var33.anInt1782 != 0) {
																local602 = 0;
																if (local978 > var12.anInt312) {
																	local602++;
																}
																if (local978 < var12.anInt314) {
																	local602 += 4;
																}
																if (local592 > var12.anInt310) {
																	local602 += 8;
																}
																if (local592 < var12.anInt317) {
																	local602 += 2;
																}
																if ((local602 & var33.anInt1782) == local8.anInt1780) {
																	local8.aBoolean89 = true;
																	continue label558;
																}
															}
														}
													}
													Static159.aClass4Array2[var21++] = var12;
													local592 = Static159.anInt3862 - var12.anInt312;
													local597 = var12.anInt314 - Static159.anInt3862;
													if (local597 > local592) {
														local592 = local597;
													}
													local602 = Static159.anInt3854 - var12.anInt310;
													var17 = var12.anInt317 - Static159.anInt3854;
													if (var17 > local602) {
														var12.anInt318 = local592 + var17;
													} else {
														var12.anInt318 = local592 + local602;
													}
												}
											}
											while (var21 > 0) {
												local1093 = -50;
												local978 = -1;
												@Pc(1102) Class4 local1102;
												for (local592 = 0; local592 < var21; local592++) {
													local1102 = Static159.aClass4Array2[local592];
													if (local1102.anInt309 != Static159.anInt3861) {
														if (local1102.anInt318 > local1093) {
															local1093 = local1102.anInt318;
															local978 = local592;
														} else if (local1102.anInt318 == local1093) {
															local602 = local1102.anInt315 - Static159.anInt3859;
															var17 = local1102.anInt306 - Static159.anInt3853;
															var18 = Static159.aClass4Array2[local978].anInt315 - Static159.anInt3859;
															var19 = Static159.aClass4Array2[local978].anInt306 - Static159.anInt3853;
															if (local602 * local602 + var17 * var17 > var18 * var18 + var19 * var19) {
																local978 = local592;
															}
														}
													}
												}
												if (local978 == -1) {
													break;
												}
												local1102 = Static159.aClass4Array2[local978];
												local1102.anInt309 = Static159.anInt3861;
												if (!this.method2681(local26, local1102.anInt312, local1102.anInt314, local1102.anInt310, local1102.anInt317, local1102.aClass1_Sub1_Sub1_1.aShort36)) {
													local1102.aClass1_Sub1_Sub1_1.method3156(local1102.anInt308, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local1102.anInt315 - Static159.anInt3859, local1102.anInt307 - Static159.anInt3873, local1102.anInt306 - Static159.anInt3853, local1102.anInt316);
												}
												for (local602 = local1102.anInt312; local602 <= local1102.anInt314; local602++) {
													for (var17 = local1102.anInt310; var17 <= local1102.anInt317; var17++) {
														@Pc(1227) Class1_Sub10 local1227 = local31[local602][var17];
														if (local1227.anInt1782 != 0) {
															Static159.aClass56_16.method1856(local1227);
														} else if ((local602 != local17 || var17 != local20) && local1227.aBoolean88) {
															Static159.aClass56_16.method1856(local1227);
														}
													}
												}
											}
											if (!local8.aBoolean89) {
												break;
											}
										} catch (@Pc(1265) Exception local1265) {
											local8.aBoolean89 = false;
											break;
										}
									}
								} while (!local8.aBoolean88);
							} while (local8.anInt1782 != 0);
							if (local17 > Static159.anInt3862 || local17 <= Static159.anInt3846) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean88);
						if (local17 < Static159.anInt3862 || local17 >= Static159.anInt3870 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean88);
					if (local20 > Static159.anInt3854 || local20 <= Static159.anInt3865) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean88);
				if (local20 < Static159.anInt3854 || local20 >= Static159.anInt3847 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean88);
			local8.aBoolean88 = false;
			Static159.anInt3868--;
			@Pc(1369) Class8 local1369 = local8.aClass8_1;
			if (local1369 != null && local1369.anInt384 != 0) {
				if (local1369.aClass1_Sub1_Sub1_2 != null) {
					local1369.aClass1_Sub1_Sub1_2.method3156(0, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local1369.anInt387 - Static159.anInt3859, local1369.anInt383 - Static159.anInt3873 - local1369.anInt384, local1369.anInt386 - Static159.anInt3853, local1369.anInt385);
				}
				if (local1369.aClass1_Sub1_Sub1_4 != null) {
					local1369.aClass1_Sub1_Sub1_4.method3156(0, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local1369.anInt387 - Static159.anInt3859, local1369.anInt383 - Static159.anInt3873 - local1369.anInt384, local1369.anInt386 - Static159.anInt3853, local1369.anInt385);
				}
				if (local1369.aClass1_Sub1_Sub1_3 != null) {
					local1369.aClass1_Sub1_Sub1_3.method3156(0, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local1369.anInt387 - Static159.anInt3859, local1369.anInt383 - Static159.anInt3873 - local1369.anInt384, local1369.anInt386 - Static159.anInt3853, local1369.anInt385);
				}
			}
			if (local8.anInt1784 != 0) {
				@Pc(1464) Class72 local1464 = local8.aClass72_1;
				if (local1464 != null && !this.method2690(local26, local17, local20, local1464.aClass1_Sub1_Sub1_7.aShort36)) {
					if ((local1464.anInt3600 & local8.anInt1784) != 0) {
						local1464.aClass1_Sub1_Sub1_7.method3156(0, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local1464.anInt3601 + local1464.anInt3597 - Static159.anInt3859, local1464.anInt3592 - Static159.anInt3873, local1464.anInt3596 + local1464.anInt3595 - Static159.anInt3853, local1464.anInt3594);
					} else if (local1464.anInt3600 == 256) {
						local251 = local1464.anInt3601 - Static159.anInt3859;
						local1093 = local1464.anInt3592 - Static159.anInt3873;
						local978 = local1464.anInt3596 - Static159.anInt3853;
						local592 = local1464.anInt3591;
						if (local592 == 1 || local592 == 2) {
							local597 = -local251;
						} else {
							local597 = local251;
						}
						if (local592 == 2 || local592 == 3) {
							local602 = -local978;
						} else {
							local602 = local978;
						}
						if (local602 >= local597) {
							local1464.aClass1_Sub1_Sub1_7.method3156(0, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local251 + local1464.anInt3597, local1093, local978 + local1464.anInt3595, local1464.anInt3594);
						} else if (local1464.aClass1_Sub1_Sub1_8 != null) {
							local1464.aClass1_Sub1_Sub1_8.method3156(0, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local251, local1093, local978, local1464.anInt3594);
						}
					}
				}
				local919 = local8.aClass43_1;
				if (local919 != null) {
					if ((local919.anInt2032 & local8.anInt1784) != 0 && !this.method2675(local26, local17, local20, local919.anInt2032)) {
						local919.aClass1_Sub1_Sub1_6.method3156(0, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local919.anInt2030 - Static159.anInt3859, local919.anInt2037 - Static159.anInt3873, local919.anInt2033 - Static159.anInt3853, local919.anInt2034);
					}
					if ((local919.anInt2038 & local8.anInt1784) != 0 && !this.method2675(local26, local17, local20, local919.anInt2038)) {
						local919.aClass1_Sub1_Sub1_5.method3156(0, Static159.anInt3845, Static159.anInt3855, Static159.anInt3851, Static159.anInt3849, local919.anInt2030 - Static159.anInt3859, local919.anInt2037 - Static159.anInt3873, local919.anInt2033 - Static159.anInt3853, local919.anInt2034);
					}
				}
			}
			@Pc(1689) Class1_Sub10 local1689;
			if (local23 < this.anInt3860 - 1) {
				local1689 = this.aClass1_Sub10ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1689 != null && local1689.aBoolean88) {
					Static159.aClass56_16.method1856(local1689);
				}
			}
			if (local17 < Static159.anInt3862) {
				local1689 = local31[local17 + 1][local20];
				if (local1689 != null && local1689.aBoolean88) {
					Static159.aClass56_16.method1856(local1689);
				}
			}
			if (local20 < Static159.anInt3854) {
				local1689 = local31[local17][local20 + 1];
				if (local1689 != null && local1689.aBoolean88) {
					Static159.aClass56_16.method1856(local1689);
				}
			}
			if (local17 > Static159.anInt3862) {
				local1689 = local31[local17 - 1][local20];
				if (local1689 != null && local1689.aBoolean88) {
					Static159.aClass56_16.method1856(local1689);
				}
			}
			if (local20 > Static159.anInt3854) {
				local1689 = local31[local17][local20 - 1];
				if (local1689 != null && local1689.aBoolean88) {
					Static159.aClass56_16.method1856(local1689);
				}
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class1_Sub6_Sub14 extends Class1_Sub6 {

	@OriginalMember(owner = "client!rr", name = "t", descriptor = "[I")
	private final int[] anIntArray612;

	@OriginalMember(owner = "client!rr", name = "E", descriptor = "[I")
	private final int[] anIntArray613;

	@OriginalMember(owner = "client!rr", name = "z", descriptor = "Lclient!ap;")
	private final Class1_Sub1 aClass1_Sub1_3;

	@OriginalMember(owner = "client!rr", name = "v", descriptor = "Lclient!ap;")
	private final Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!rr", name = "x", descriptor = "Lclient!ap;")
	private final Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!rr", name = "u", descriptor = "[Lclient!ap;")
	private final Class1_Sub1[] aClass1_Sub1Array35;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V")
	private Class1_Sub6_Sub14() {
		this.anIntArray612 = new int[0];
		this.anIntArray613 = new int[0];
		this.aClass1_Sub1_3 = new Class1_Sub1_Sub9(0);
		this.aClass1_Sub1_3.anInt9443 = 1;
		this.aClass1_Sub1_1 = new Class1_Sub1_Sub9();
		this.aClass1_Sub1_1.anInt9443 = 1;
		this.aClass1_Sub1_2 = new Class1_Sub1_Sub9();
		this.aClass1_Sub1_2.anInt9443 = 1;
		this.aClass1_Sub1Array35 = new Class1_Sub1[] { this.aClass1_Sub1_1, this.aClass1_Sub1_2, this.aClass1_Sub1_3 };
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!mo;)V")
	public Class1_Sub6_Sub14(@OriginalArg(0) Class1_Sub35 arg0) {
		@Pc(7) int local7 = arg0.method5750();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass1_Sub1Array35 = new Class1_Sub1[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub1 local26 = Static107.method1470(arg0);
			if (local26.method7704() >= 0) {
				local9++;
			}
			if (local26.method7703() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass1_Sub1Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method5750();
			}
			this.aClass1_Sub1Array35[local20] = local26;
		}
		this.anIntArray613 = new int[local9];
		local9 = 0;
		this.anIntArray612 = new int[local11];
		local11 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class1_Sub1 local98 = this.aClass1_Sub1Array35[local91];
			local50 = local98.aClass1_Sub1Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass1_Sub1Array42[local104] = this.aClass1_Sub1Array35[local14[local91][local104]];
			}
			@Pc(130) int local130 = local98.method7704();
			@Pc(134) int local134 = local98.method7703();
			if (local130 > 0) {
				this.anIntArray613[local9++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray612[local11++] = local134;
			}
			local14[local91] = null;
		}
		this.aClass1_Sub1_1 = this.aClass1_Sub1Array35[arg0.method5750()];
		this.aClass1_Sub1_2 = this.aClass1_Sub1Array35[arg0.method5750()];
		this.aClass1_Sub1_3 = this.aClass1_Sub1Array35[arg0.method5750()];
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!fa;Lclient!pu;IZIDIZ)[I")
	public int[] method6331(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) double arg5, @OriginalArg(7) boolean arg6) {
		Static535.anInterface7_11 = arg0;
		Static543.aClass270_113 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub1Array35.length; local11++) {
			this.aClass1_Sub1Array35[local11].method7698(arg4, arg2);
		}
		Static395.method5459(arg5);
		Static122.method1913(arg4, arg2);
		@Pc(43) int[] local43 = new int[arg4 * arg2];
		@Pc(56) int local56;
		@Pc(54) int local54;
		@Pc(52) byte local52;
		if (arg3) {
			local54 = -1;
			local56 = arg4 - 1;
			local52 = -1;
		} else {
			local52 = 1;
			local54 = arg4;
			local56 = 0;
		}
		@Pc(68) int local68 = 0;
		for (@Pc(70) int local70 = 0; local70 < arg2; local70++) {
			if (arg6) {
				local68 = local70;
			}
			@Pc(92) int[] local92;
			@Pc(88) int[] local88;
			@Pc(90) int[] local90;
			if (this.aClass1_Sub1_1.aBoolean737) {
				@Pc(86) int[] local86 = this.aClass1_Sub1_1.method7706(local70);
				local88 = local86;
				local90 = local86;
				local92 = local86;
			} else {
				@Pc(102) int[][] local102 = this.aClass1_Sub1_1.method7705(local70);
				local90 = local102[2];
				local88 = local102[1];
				local92 = local102[0];
			}
			for (@Pc(116) int local116 = local56; local116 != local54; local116 += local52) {
				@Pc(124) int local124 = local92[local116] >> 4;
				if (local124 > 255) {
					local124 = 255;
				}
				if (local124 < 0) {
					local124 = 0;
				}
				@Pc(142) int local142 = local88[local116] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				@Pc(157) int local157 = local90[local116] >> 4;
				if (local157 > 255) {
					local157 = 255;
				}
				local124 = Static287.anIntArray387[local124];
				local142 = Static287.anIntArray387[local142];
				if (local157 < 0) {
					local157 = 0;
				}
				local157 = Static287.anIntArray387[local157];
				@Pc(188) int local188 = local157 + (local142 << 8) + (local124 << 16);
				if (local188 != 0) {
					local188 |= 0xFF000000;
				}
				local43[local68++] = local188;
				if (arg6) {
					local68 += arg4 - 1;
				}
			}
		}
		for (@Pc(227) int local227 = 0; local227 < this.aClass1_Sub1Array35.length; local227++) {
			this.aClass1_Sub1Array35[local227].method7710();
		}
		return local43;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!fa;DLclient!pu;ZIBI)[I")
	public int[] method6332(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) double arg1, @OriginalArg(2) Class270 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static535.anInterface7_11 = arg0;
		Static543.aClass270_113 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub1Array35.length; local11++) {
			this.aClass1_Sub1Array35[local11].method7698(arg5, arg4);
		}
		Static395.method5459(arg1);
		Static122.method1913(arg5, arg4);
		@Pc(47) int[] local47 = new int[arg4 * arg5 * 4];
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < arg4; local51++) {
			@Pc(71) int[] local71;
			@Pc(75) int[] local75;
			@Pc(67) int[] local67;
			@Pc(83) int[] local83;
			if (this.aClass1_Sub1_1.aBoolean737) {
				local83 = this.aClass1_Sub1_1.method7706(local51);
				local67 = local83;
				local75 = local83;
				local71 = local83;
			} else {
				@Pc(63) int[][] local63 = this.aClass1_Sub1_1.method7705(local51);
				local67 = local63[2];
				local71 = local63[0];
				local75 = local63[1];
			}
			if (this.aClass1_Sub1_2.aBoolean737) {
				local83 = this.aClass1_Sub1_2.method7706(local51);
			} else {
				local83 = this.aClass1_Sub1_2.method7705(local51)[0];
			}
			if (arg3) {
				local49 = local51;
			}
			for (@Pc(117) int local117 = arg5 - 1; local117 >= 0; local117--) {
				@Pc(125) int local125 = local71[local117] >> 4;
				if (local125 > 255) {
					local125 = 255;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				@Pc(145) int local145 = local75[local117] >> 4;
				if (local145 > 255) {
					local145 = 255;
				}
				if (local145 < 0) {
					local145 = 0;
				}
				@Pc(162) int local162 = local67[local117] >> 4;
				if (local162 > 255) {
					local162 = 255;
				}
				local125 = Static287.anIntArray387[local125];
				if (local162 < 0) {
					local162 = 0;
				}
				local145 = Static287.anIntArray387[local145];
				local162 = Static287.anIntArray387[local162];
				@Pc(196) int local196;
				if (local125 == 0 && local145 == 0 && local162 == 0) {
					local196 = 0;
				} else {
					local196 = local83[local117] >> 4;
					if (local196 > 255) {
						local196 = 255;
					}
					if (local196 < 0) {
						local196 = 0;
					}
				}
				local47[local49++] = (local125 << 16) + (local196 << 24) + (local145 << 8) + local162;
				if (arg3) {
					local49 += arg5 - 1;
				}
			}
		}
		for (@Pc(251) int local251 = 0; local251 < this.aClass1_Sub1Array35.length; local251++) {
			this.aClass1_Sub1Array35[local251].method7710();
		}
		return local47;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!pu;Lclient!fa;B)Z")
	public boolean method6338(@OriginalArg(0) Class270 arg0, @OriginalArg(1) Interface7 arg1) {
		@Pc(9) int local9;
		if (Static524.anInt2122 < 0) {
			for (local9 = 0; local9 < this.anIntArray613.length; local9++) {
				if (!arg0.method5694(this.anIntArray613[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray613.length; local9++) {
				if (!arg0.method5688(Static524.anInt2122, this.anIntArray613[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray612.length; local9++) {
			if (!arg1.method3871(this.anIntArray612[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILclient!fa;Lclient!pu;ZI)[F")
	public float[] method6339(@OriginalArg(1) int arg0, @OriginalArg(2) Interface7 arg1, @OriginalArg(3) Class270 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		Static535.anInterface7_11 = arg1;
		Static543.aClass270_113 = arg2;
		for (@Pc(16) int local16 = 0; local16 < this.aClass1_Sub1Array35.length; local16++) {
			this.aClass1_Sub1Array35[local16].method7698(arg4, arg0);
		}
		Static122.method1913(arg4, arg0);
		@Pc(47) float[] local47 = new float[arg0 * 4 * arg4];
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < arg0; local51++) {
			@Pc(69) int[] local69;
			@Pc(67) int[] local67;
			@Pc(65) int[] local65;
			if (this.aClass1_Sub1_1.aBoolean737) {
				@Pc(63) int[] local63 = this.aClass1_Sub1_1.method7706(local51);
				local65 = local63;
				local67 = local63;
				local69 = local63;
			} else {
				@Pc(77) int[][] local77 = this.aClass1_Sub1_1.method7705(local51);
				local67 = local77[1];
				local69 = local77[0];
				local65 = local77[2];
			}
			@Pc(99) int[] local99;
			if (this.aClass1_Sub1_2.aBoolean737) {
				local99 = this.aClass1_Sub1_2.method7706(local51);
			} else {
				local99 = this.aClass1_Sub1_2.method7705(local51)[0];
			}
			@Pc(119) int[] local119;
			if (this.aClass1_Sub1_3.aBoolean737) {
				local119 = this.aClass1_Sub1_3.method7706(local51);
			} else {
				local119 = this.aClass1_Sub1_3.method7705(local51)[0];
			}
			if (arg3) {
				local49 = local51 << 2;
			}
			for (@Pc(139) int local139 = arg4 - 1; local139 >= 0; local139--) {
				@Pc(148) float local148 = (float) local99[local139] / 4096.0F;
				if (local148 < 0.0F) {
					local148 = 0.0F;
				} else if (local148 > 1.0F) {
					local148 = 1.0F;
				}
				@Pc(175) float local175 = ((float) local119[local139] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local47[local49++] = (float) local69[local139] * local175;
				local47[local49++] = (float) local67[local139] * local175;
				local47[local49++] = (float) local65[local139] * local175;
				local47[local49++] = local148;
				if (arg3) {
					local49 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(233) int local233 = 0; local233 < this.aClass1_Sub1Array35.length; local233++) {
			this.aClass1_Sub1Array35[local233].method7710();
		}
		return local47;
	}
}

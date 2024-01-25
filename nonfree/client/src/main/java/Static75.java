import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
	public static int anInt1326;

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "Lclient!ha;")
	public static Class100 aClass100_2;

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "[I")
	public static int[] anIntArray68;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
	public static void method1248() {
		Static487.method7255(false);
		if (Static171.anInt5361 >= 0 && Static171.anInt5361 != 0) {
			Static462.method6506(false, Static171.anInt5361);
			Static171.anInt5361 = -1;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIILclient!lv;)V")
	public static void method1249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1_Sub4 arg4) {
		@Pc(4) Class128 local4 = Static362.method8360(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt9805 = (arg1 << Static314.anInt5377) + Static377.anInt6337;
		arg4.anInt9797 = arg3;
		arg4.anInt9803 = (arg2 << Static314.anInt5377) + Static377.anInt6337;
		local4.aClass4_Sub1_Sub4_1 = arg4;
		@Pc(36) int local36 = Static177.aClass84Array2 == Static77.aClass84Array1 ? 1 : 0;
		if (arg4.method8356()) {
			if (arg4.method8344()) {
				arg4.aClass4_Sub1_23 = Static194.aClass4_Sub1Array13[local36];
				Static194.aClass4_Sub1Array13[local36] = arg4;
				return;
			}
			arg4.aClass4_Sub1_23 = Static623.aClass4_Sub1Array11[local36];
			Static623.aClass4_Sub1Array11[local36] = arg4;
			Static597.aBoolean675 = true;
			return;
		}
		arg4.aClass4_Sub1_23 = Static321.aClass4_Sub1Array5[local36];
		Static321.aClass4_Sub1Array5[local36] = arg4;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!kha;)V")
	public static void method1250(@OriginalArg(0) Class204 arg0) {
		if (Static257.anInt4639 >= 65535) {
			return;
		}
		@Pc(7) Class5_Sub12 local7 = arg0.aClass5_Sub12_2;
		Static665.aClass204Array3[Static257.anInt4639] = arg0;
		Static488.aBooleanArray22[Static257.anInt4639] = false;
		Static257.anInt4639++;
		@Pc(22) int local22 = arg0.anInt5222;
		if (arg0.aBoolean332) {
			local22 = 0;
		}
		@Pc(30) int local30 = arg0.anInt5222;
		if (arg0.aBoolean333) {
			local30 = Static237.anInt4100 - 1;
		}
		for (@Pc(39) int local39 = local22; local39 <= local30; local39++) {
			@Pc(42) int local42 = 0;
			@Pc(54) int local54 = local7.method4534() + Static377.anInt6337 - local7.method4531() >> Static314.anInt5377;
			if (local54 < 0) {
				local42 = -local54;
				local54 = 0;
			}
			@Pc(74) int local74 = local7.method4534() + local7.method4531() - Static377.anInt6337 >> Static314.anInt5377;
			if (local74 >= Static532.anInt8517) {
				local74 = Static532.anInt8517 - 1;
			}
			for (@Pc(83) int local83 = local54; local83 <= local74; local83++) {
				@Pc(90) short local90 = arg0.aShortArray73[local42++];
				@Pc(106) int local106 = (local7.method4537() + Static377.anInt6337 - local7.method4531() >> Static314.anInt5377) + (local90 >>> 8);
				@Pc(114) int local114 = local106 + (local90 & 0xFF) - 1;
				if (local106 < 0) {
					local106 = 0;
				}
				if (local114 >= Static672.anInt10829) {
					local114 = Static672.anInt10829 - 1;
				}
				for (@Pc(127) int local127 = local106; local127 <= local114; local127++) {
					@Pc(136) long local136 = Static680.aLongArrayArrayArray1[local39][local127][local83];
					if ((local136 & 0xFFFFL) == 0L) {
						Static680.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static257.anInt4639;
					} else if ((local136 & 0xFFFF0000L) == 0L) {
						Static680.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static257.anInt4639 << 16;
					} else if ((local136 & 0xFFFF00000000L) == 0L) {
						Static680.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static257.anInt4639 << 32;
					} else if ((local136 & 0xFFFF000000000000L) == 0L) {
						Static680.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static257.anInt4639 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!ip;)I")
	public static int method1251(@OriginalArg(1) Class4_Sub1_Sub1_Sub2_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt4536;
		@Pc(12) Class92 local12 = arg0.method5930();
		if (arg0.anInt6837 == -1 || arg0.aBoolean456) {
			local8 = arg0.anInt4534;
		} else if (arg0.anInt6837 == local12.anInt1905 || arg0.anInt6837 == local12.anInt1896 || arg0.anInt6837 == local12.anInt1923 || local12.anInt1915 == arg0.anInt6837) {
			local8 = arg0.anInt4562;
		} else if (local12.anInt1931 == arg0.anInt6837 || arg0.anInt6837 == local12.anInt1897 || local12.anInt1935 == arg0.anInt6837 || arg0.anInt6837 == local12.anInt1911) {
			local8 = arg0.anInt4539;
		}
		return local8;
	}
}

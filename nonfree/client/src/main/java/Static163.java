import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!pe", name = "B", descriptor = "Lclient!pa;")
	public static Class86 aClass86_61;

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1095 = Static186.method3527("Cancel");

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1092 = aClass50_1095;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
	public static int anInt3371 = 0;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1093 = Static186.method3527("null");

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1094 = Static186.method3527(" <col=ffffff>");

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "[S")
	public static short[] aShortArray43 = new short[256];

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
	public static int anInt3374 = 0;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
	public static int anInt3375 = 0;

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1096 = Static186.method3527("Choose Option");

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1097 = Static186.method3527("Created gameworld");

	@OriginalMember(owner = "client!pe", name = "F", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1098 = aClass50_1097;

	@OriginalMember(owner = "client!pe", name = "G", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1099 = aClass50_1096;

	@OriginalMember(owner = "client!pe", name = "I", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1100 = Static186.method3527("<br>(X100(U(Y");

	@OriginalMember(owner = "client!pe", name = "J", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1101 = Static186.method3527("hint_mapmarkers");

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
	public static void method2721() {
		if (Static48.method758() != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static1.anInt41 - 4 & 0xFF);
		@Pc(23) int local23 = Static1.anInt41 % 104;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < 104; local29++) {
				Static217.aByteArrayArrayArray14[local25][local23][local29] = local19;
			}
		}
		if (Static212.anInt4195 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static172.anIntArray376[local29] = -1000000;
			Static232.anIntArray509[local29] = 1000000;
			Static230.anIntArray331[local29] = 0;
			Static85.anIntArray138[local29] = 1000000;
			Static171.anIntArray375[local29] = 0;
		}
		@Pc(99) int local99;
		if (Static28.anInt544 != 1) {
			local99 = Static131.method2213(Static137.anInt2804, Static159.anInt4227, Static212.anInt4195);
			if (local99 - Static32.anInt601 < 800 && (Static159.aByteArrayArrayArray13[Static212.anInt4195][Static159.anInt4227 >> 7][Static137.anInt2804 >> 7] & 0x4) != 0) {
				Static124.method1978(false, 1, Static159.anInt4227 >> 7, Static56.aClass1_Sub11ArrayArrayArray3, Static137.anInt2804 >> 7);
				return;
			}
			return;
		}
		if ((Static159.aByteArrayArrayArray13[Static212.anInt4195][Static230.aClass20_Sub3_Sub1_3.anInt3022 >> 7][Static230.aClass20_Sub3_Sub1_3.anInt3008 >> 7] & 0x4) != 0) {
			Static124.method1978(false, 0, Static230.aClass20_Sub3_Sub1_3.anInt3022 >> 7, Static56.aClass1_Sub11ArrayArrayArray3, Static230.aClass20_Sub3_Sub1_3.anInt3008 >> 7);
		}
		if (Static218.anInt3563 >= 310) {
			return;
		}
		local99 = Static159.anInt4227 >> 7;
		@Pc(178) int local178 = Static137.anInt2804 >> 7;
		@Pc(183) int local183 = Static230.aClass20_Sub3_Sub1_3.anInt3008 >> 7;
		@Pc(188) int local188 = Static230.aClass20_Sub3_Sub1_3.anInt3022 >> 7;
		@Pc(196) int local196;
		if (local188 <= local99) {
			local196 = local99 - local188;
		} else {
			local196 = local188 - local99;
		}
		@Pc(215) int local215;
		if (local178 < local183) {
			local215 = local183 - local178;
		} else {
			local215 = local178 - local183;
		}
		@Pc(230) int local230;
		@Pc(232) int local232;
		if (local196 <= local215) {
			local230 = local196 * 65536 / local215;
			local232 = 32768;
			while (local178 != local183) {
				if (local178 < local183) {
					local178++;
				} else if (local183 < local178) {
					local178--;
				}
				if ((Static159.aByteArrayArrayArray13[Static212.anInt4195][local99][local178] & 0x4) != 0) {
					Static124.method1978(false, 1, local99, Static56.aClass1_Sub11ArrayArrayArray3, local178);
					return;
				}
				local232 += local230;
				if (local232 >= 65536) {
					local232 -= 65536;
					if (local99 < local188) {
						local99++;
					} else if (local99 > local188) {
						local99--;
					}
					if ((Static159.aByteArrayArrayArray13[Static212.anInt4195][local99][local178] & 0x4) != 0) {
						Static124.method1978(false, 1, local99, Static56.aClass1_Sub11ArrayArrayArray3, local178);
						return;
					}
				}
			}
			return;
		}
		local230 = local215 * 65536 / local196;
		local232 = 32768;
		while (local188 != local99) {
			if (local188 > local99) {
				local99++;
			} else if (local99 > local188) {
				local99--;
			}
			if ((Static159.aByteArrayArrayArray13[Static212.anInt4195][local99][local178] & 0x4) != 0) {
				Static124.method1978(false, 1, local99, Static56.aClass1_Sub11ArrayArrayArray3, local178);
				return;
			}
			local232 += local230;
			if (local232 >= 65536) {
				if (local178 < local183) {
					local178++;
				} else if (local183 < local178) {
					local178--;
				}
				local232 -= 65536;
				if ((Static159.aByteArrayArrayArray13[Static212.anInt4195][local99][local178] & 0x4) != 0) {
					Static124.method1978(false, 1, local99, Static56.aClass1_Sub11ArrayArrayArray3, local178);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BZ)I")
	public static int method2723(@OriginalArg(1) boolean arg0) {
		@Pc(9) long local9 = Static179.method2941();
		for (@Pc(25) Class1_Sub18 local25 = arg0 ? (Class1_Sub18) Static4.aClass90_1.method2823() : (Class1_Sub18) Static4.aClass90_1.method2821(); local25 != null; local25 = (Class1_Sub18) Static4.aClass90_1.method2821()) {
			if (local9 > (local25.aLong109 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local25.aLong109 & 0x4000000000000000L) != 0L) {
					@Pc(56) int local56 = (int) local25.aLong173;
					Static24.anIntArray49[local56] = Static66.anIntArray108[local56];
					local25.method3525();
					return local56;
				}
				local25.method3525();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method2724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg4;
		@Pc(13) int local13 = arg6 - arg2;
		for (@Pc(15) int local15 = arg4; local15 < local9; local15++) {
			Static107.method1641(arg5, arg3, Static139.anIntArrayArray21[local15], arg1);
		}
		for (@Pc(39) int local39 = arg6; local39 > local13; local39--) {
			Static107.method1641(arg5, arg3, Static139.anIntArrayArray21[local39], arg1);
		}
		@Pc(62) int local62 = arg1 - arg2;
		@Pc(66) int local66 = arg2 + arg5;
		for (@Pc(68) int local68 = local9; local68 <= local13; local68++) {
			@Pc(74) int[] local74 = Static139.anIntArrayArray21[local68];
			Static107.method1641(arg5, arg3, local74, local66);
			Static107.method1641(local66, arg0, local74, local62);
			Static107.method1641(local62, arg3, local74, arg1);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_417 = Static81.method1507("Fri");

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_418 = Static81.method1507("Mon");

	@OriginalMember(owner = "client!ga", name = "F", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_423 = Static81.method1507("Sun");

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_419 = Static81.method1507("Tue");

	@OriginalMember(owner = "client!ga", name = "Z", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_424 = Static81.method1507("Wed");

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_421 = Static81.method1507("Thu");

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_420 = Static81.method1507("Sat");

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "[Lclient!dj;")
	public static final Class24[] aClass24Array9 = new Class24[] { aClass24_423, aClass24_418, aClass24_419, aClass24_424, aClass24_421, aClass24_417, aClass24_420 };

	@OriginalMember(owner = "client!ga", name = "w", descriptor = "[[S")
	public static final short[][] aShortArrayArray14 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[100];

	@OriginalMember(owner = "client!ga", name = "z", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_422 = Static81.method1507("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIILclient!wd;Lclient!wd;IIIIJLclient!oc;)V")
	public static void method1200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10, @OriginalArg(11) Class74 arg11) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class49 local6 = new Class49();
		local6.aLong62 = arg10;
		local6.anInt2084 = arg1 * 128 + 64;
		local6.anInt2075 = arg2 * 128 + 64;
		local6.anInt2077 = arg3;
		local6.aClass5_5 = arg4;
		local6.aClass5_4 = arg5;
		local6.anInt2076 = arg6;
		local6.anInt2079 = arg7;
		local6.anInt2081 = arg8;
		local6.anInt2078 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static29.aClass1_Sub8ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static29.aClass1_Sub8ArrayArrayArray1[local46][arg1][arg2] = new Class1_Sub8(local46, arg1, arg2);
			}
		}
		Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass49_1 = local6;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILclient!vc;IIII)V")
	public static void method1201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class98 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static37.aBoolean56) {
			Static108.anInt2439 = 32;
		} else {
			Static108.anInt2439 = 0;
		}
		Static37.aBoolean56 = false;
		@Pc(136) int local136;
		if (Static188.anInt4176 != 0) {
			if (arg1 <= arg4 && arg4 < arg1 + 16 && arg2 >= arg6 && arg6 + 16 > arg2) {
				arg3.anInt4348 -= 4;
				Static199.method2199(arg3);
			} else if (arg4 >= arg1 && arg1 + 16 > arg4 && arg2 >= arg0 + arg6 - 16 && arg0 + arg6 > arg2) {
				arg3.anInt4348 += 4;
				Static199.method2199(arg3);
			} else if (arg4 >= arg1 - Static108.anInt2439 && arg4 < Static108.anInt2439 + arg1 + 16 && arg6 + 16 <= arg2 && arg2 < arg6 + arg0 - 16) {
				@Pc(117) int local117 = arg0 * (arg0 - 32) / arg5;
				if (local117 < 8) {
					local117 = 8;
				}
				local136 = arg2 - local117 / 2 - arg6 - 16;
				@Pc(143) int local143 = arg0 - local117 - 32;
				arg3.anInt4348 = local136 * (arg5 - arg0) / local143;
				Static199.method2199(arg3);
				Static37.aBoolean56 = true;
			}
		}
		if (Static188.anInt4177 == 0) {
			return;
		}
		local136 = arg3.anInt4400;
		if (arg4 >= arg1 - local136 && arg6 <= arg2 && arg1 + 16 > arg4 && arg2 <= arg0 + arg6) {
			arg3.anInt4348 += Static188.anInt4177 * 45;
			Static199.method2199(arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Z")
	public static boolean method1202(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)I")
	public static int method1203() {
		return 6;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)V")
	public static void method1205(@OriginalArg(1) int arg0) {
		Static175.anInt3911 += arg0 * 128;
		@Pc(27) int local27;
		if (Static77.anIntArray160.length < Static175.anInt3911) {
			Static175.anInt3911 -= Static77.anIntArray160.length;
			local27 = (int) (Math.random() * 12.0D);
			Static163.method2733(Static65.aClass1_Sub2_Sub8_Sub2Array8[local27]);
		}
		local27 = 0;
		@Pc(42) int local42 = arg0 * 128;
		@Pc(49) int local49 = (256 - arg0) * 128;
		@Pc(75) int local75;
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local75 = Static63.anIntArray139[local27 + local42] - arg0 * Static77.anIntArray160[local27 + Static175.anInt3911 & Static77.anIntArray160.length + -1] / 6;
			if (local75 < 0) {
				local75 = 0;
			}
			Static63.anIntArray139[local27++] = local75;
		}
		@Pc(102) int local102;
		@Pc(104) int local104;
		@Pc(111) int local111;
		for (local75 = 256 - arg0; local75 < 256; local75++) {
			local102 = local75 * 128;
			for (local104 = 0; local104 < 128; local104++) {
				local111 = (int) (Math.random() * 100.0D);
				if (local111 < 50 && local104 > 10 && local104 < 118) {
					Static63.anIntArray139[local104 + local102] = 255;
				} else {
					Static63.anIntArray139[local104 + local102] = 0;
				}
			}
		}
		if (Static162.anInt3574 > 0) {
			Static162.anInt3574 -= arg0 * 4;
		}
		if (Static121.anInt2693 > 0) {
			Static121.anInt2693 -= arg0 * 4;
		}
		if (Static121.anInt2693 == 0 && Static162.anInt3574 == 0) {
			local102 = (int) (Math.random() * (double) (2000 / arg0));
			if (local102 == 1) {
				Static162.anInt3574 = 1024;
			}
			if (local102 == 0) {
				Static121.anInt2693 = 1024;
			}
		}
		for (local102 = 0; local102 < 256 - arg0; local102++) {
			Static135.anIntArray244[local102] = Static135.anIntArray244[local102 + arg0];
		}
		for (local104 = 256 - arg0; local104 < 256; local104++) {
			Static135.anIntArray244[local104] = (int) (Math.sin((double) Static41.anInt1354 / 14.0D) * 16.0D + Math.sin((double) Static41.anInt1354 / 15.0D) * 14.0D + Math.sin((double) Static41.anInt1354 / 16.0D) * 12.0D);
			Static41.anInt1354++;
		}
		Static120.anInt2670 += arg0;
		local111 = (arg0 + (Static42.anInt1100 & 0x1)) / 2;
		if (local111 <= 0) {
			return;
		}
		@Pc(295) int local295;
		@Pc(288) int local288;
		for (@Pc(279) int local279 = 0; local279 < Static120.anInt2670 * 100; local279++) {
			local288 = (int) (Math.random() * 128.0D) + 128;
			local295 = (int) (Math.random() * 124.0D) + 2;
			Static63.anIntArray139[local295 + (local288 << 7)] = 192;
		}
		Static120.anInt2670 = 0;
		@Pc(326) int local326;
		@Pc(329) int local329;
		for (local295 = 0; local295 < 256; local295++) {
			local288 = 0;
			local326 = local295 * 128;
			for (local329 = -local111; local329 < 128; local329++) {
				if (local329 + local111 < 128) {
					local288 += Static63.anIntArray139[local111 + local326 + local329];
				}
				if (local329 - local111 - 1 >= 0) {
					local288 -= Static63.anIntArray139[local329 + local326 - local111 - 1];
				}
				if (local329 >= 0) {
					Static85.anIntArray286[local329 + local326] = local288 / (local111 * 2 + 1);
				}
			}
		}
		for (local288 = 0; local288 < 128; local288++) {
			local326 = 0;
			for (local329 = -local111; local329 < 256; local329++) {
				@Pc(409) int local409 = local329 * 128;
				if (local111 + local329 < 256) {
					local326 += Static85.anIntArray286[local111 * 128 + local288 + local409];
				}
				if (local329 - local111 - 1 >= 0) {
					local326 -= Static85.anIntArray286[local288 + local409 - (local111 + 1) * 128];
				}
				if (local329 >= 0) {
					Static63.anIntArray139[local409 + local288] = local326 / (local111 * 2 + 1);
				}
			}
		}
	}
}

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!g", name = "i", descriptor = "[I")
	public static int[] anIntArray115;

	@OriginalMember(owner = "client!g", name = "m", descriptor = "Lclient!b;")
	public static Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_8;

	@OriginalMember(owner = "client!g", name = "t", descriptor = "I")
	public static int anInt869;

	@OriginalMember(owner = "client!g", name = "w", descriptor = "[Lclient!i;")
	public static Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2;

	@OriginalMember(owner = "client!g", name = "x", descriptor = "[Lclient!i;")
	public static Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3;

	@OriginalMember(owner = "client!g", name = "z", descriptor = "Lclient!sf;")
	public static Class5 aClass5_27;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Lclient!sc;")
	public static Class66 aClass66_501 = Static106.method1849(")4l");

	@OriginalMember(owner = "client!g", name = "h", descriptor = "Lclient!sc;")
	public static Class66 aClass66_502 = Static106.method1849("");

	@OriginalMember(owner = "client!g", name = "j", descriptor = "Lclient!sc;")
	public static Class66 aClass66_503 = Static106.method1849(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!g", name = "o", descriptor = "Lclient!rc;")
	public static Class61 aClass61_8 = new Class61();

	@OriginalMember(owner = "client!g", name = "p", descriptor = "[Z")
	public static boolean[] aBooleanArray5 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!g", name = "q", descriptor = "I")
	public static int anInt866 = 0;

	@OriginalMember(owner = "client!g", name = "v", descriptor = "Lclient!sc;")
	public static Class66 aClass66_504 = Static106.method1849("<col=c0ff00>");

	@OriginalMember(owner = "client!g", name = "y", descriptor = "Lclient!he;")
	public static Class1_Sub10 aClass1_Sub10_6 = null;

	@OriginalMember(owner = "client!g", name = "A", descriptor = "Lclient!sc;")
	public static Class66 aClass66_505 = Static106.method1849("T");

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method631() {
		aClass61_8 = null;
		aBooleanArray5 = null;
		aClass66_505 = null;
		aClass1_Sub1_Sub2_Sub3Array3 = null;
		aClass1_Sub1_Sub2_Sub3Array2 = null;
		aClass66_504 = null;
		anIntArray115 = null;
		aClass5_27 = null;
		aClass1_Sub10_6 = null;
		aClass66_503 = null;
		aClass66_501 = null;
		aClass1_Sub1_Sub2_Sub1_8 = null;
		aClass66_502 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lclient!v;")
	public static Class1_Sub1_Sub16 method632(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub1_Sub16 local15 = (Class1_Sub1_Sub16) Static92.aClass60_74.method1745((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static66.aClass5_17.method107(arg0, 4);
		local15 = new Class1_Sub1_Sub16();
		if (local25 != null) {
			local15.method1986(arg0, new Class1_Sub12(local25));
		}
		local15.method1991();
		Static92.aClass60_74.method1741((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIIBZIII)Z")
	public static boolean method633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static56.anIntArrayArray17[local3][local7] = 0;
				Static52.anIntArrayArray16[local3][local7] = 99999999;
			}
		}
		Static56.anIntArrayArray17[arg9][arg8] = 99;
		local7 = arg9;
		Static52.anIntArrayArray16[arg9][arg8] = 0;
		@Pc(45) int local45 = arg8;
		@Pc(51) byte local51 = 0;
		Static86.anIntArray384[0] = arg9;
		@Pc(58) int local58 = local51 + 1;
		Static41.anIntArray179[0] = arg8;
		@Pc(62) int local62 = 0;
		@Pc(64) boolean local64 = false;
		@Pc(67) int local67 = Static86.anIntArray384.length;
		@Pc(72) int[][] local72 = Static83.aClass13Array1[Static22.anInt635].anIntArrayArray11;
		@Pc(184) int local184;
		while (local62 != local58) {
			local7 = Static86.anIntArray384[local62];
			local45 = Static41.anIntArray179[local62];
			local62 = (local62 + 1) % local67;
			if (arg0 == local7 && local45 == arg5) {
				local64 = true;
				break;
			}
			if (arg2 != 0) {
				if ((arg2 < 5 || arg2 == 10) && Static83.aClass13Array1[Static22.anInt635].method462(arg1, arg2 - 1, local45, local7, arg5, arg0)) {
					local64 = true;
					break;
				}
				if (arg2 < 10 && Static83.aClass13Array1[Static22.anInt635].method463(arg5, local7, arg1, arg2 - 1, local45, arg0)) {
					local64 = true;
					break;
				}
			}
			if (arg3 != 0 && arg6 != 0 && Static83.aClass13Array1[Static22.anInt635].method461(arg6, local45, arg3, arg10, arg0, arg5, local7)) {
				local64 = true;
				break;
			}
			local184 = Static52.anIntArrayArray16[local7][local45] + 1;
			if (local7 > 0 && Static56.anIntArrayArray17[local7 - 1][local45] == 0 && (local72[local7 - 1][local45] & 0x12C0108) == 0) {
				Static86.anIntArray384[local58] = local7 - 1;
				Static41.anIntArray179[local58] = local45;
				Static56.anIntArrayArray17[local7 - 1][local45] = 2;
				local58 = (local58 + 1) % local67;
				Static52.anIntArrayArray16[local7 - 1][local45] = local184;
			}
			if (local7 < 103 && Static56.anIntArrayArray17[local7 + 1][local45] == 0 && (local72[local7 + 1][local45] & 0x12C0180) == 0) {
				Static86.anIntArray384[local58] = local7 + 1;
				Static41.anIntArray179[local58] = local45;
				local58 = (local58 + 1) % local67;
				Static56.anIntArrayArray17[local7 + 1][local45] = 8;
				Static52.anIntArrayArray16[local7 + 1][local45] = local184;
			}
			if (local45 > 0 && Static56.anIntArrayArray17[local7][local45 - 1] == 0 && (local72[local7][local45 - 1] & 0x12C0102) == 0) {
				Static86.anIntArray384[local58] = local7;
				Static41.anIntArray179[local58] = local45 - 1;
				Static56.anIntArrayArray17[local7][local45 - 1] = 1;
				local58 = (local58 + 1) % local67;
				Static52.anIntArrayArray16[local7][local45 - 1] = local184;
			}
			if (local45 < 103 && Static56.anIntArrayArray17[local7][local45 + 1] == 0 && (local72[local7][local45 + 1] & 0x12C0120) == 0) {
				Static86.anIntArray384[local58] = local7;
				Static41.anIntArray179[local58] = local45 + 1;
				local58 = (local58 + 1) % local67;
				Static56.anIntArrayArray17[local7][local45 + 1] = 4;
				Static52.anIntArrayArray16[local7][local45 + 1] = local184;
			}
			if (local7 > 0 && local45 > 0 && Static56.anIntArrayArray17[local7 - 1][local45 - 1] == 0 && (local72[local7 - 1][local45 - 1] & 0x12C010E) == 0 && (local72[local7 - 1][local45] & 0x12C0108) == 0 && (local72[local7][local45 - 1] & 0x12C0102) == 0) {
				Static86.anIntArray384[local58] = local7 - 1;
				Static41.anIntArray179[local58] = local45 - 1;
				local58 = (local58 + 1) % local67;
				Static56.anIntArrayArray17[local7 - 1][local45 - 1] = 3;
				Static52.anIntArrayArray16[local7 - 1][local45 - 1] = local184;
			}
			if (local7 < 103 && local45 > 0 && Static56.anIntArrayArray17[local7 + 1][local45 - 1] == 0 && (local72[local7 + 1][local45 - 1] & 0x12C0183) == 0 && (local72[local7 + 1][local45] & 0x12C0180) == 0 && (local72[local7][local45 - 1] & 0x12C0102) == 0) {
				Static86.anIntArray384[local58] = local7 + 1;
				Static41.anIntArray179[local58] = local45 - 1;
				Static56.anIntArrayArray17[local7 + 1][local45 - 1] = 9;
				local58 = (local58 + 1) % local67;
				Static52.anIntArrayArray16[local7 + 1][local45 - 1] = local184;
			}
			if (local7 > 0 && local45 < 103 && Static56.anIntArrayArray17[local7 - 1][local45 + 1] == 0 && (local72[local7 - 1][local45 + 1] & 0x12C0138) == 0 && (local72[local7 - 1][local45] & 0x12C0108) == 0 && (local72[local7][local45 + 1] & 0x12C0120) == 0) {
				Static86.anIntArray384[local58] = local7 - 1;
				Static41.anIntArray179[local58] = local45 + 1;
				Static56.anIntArrayArray17[local7 - 1][local45 + 1] = 6;
				local58 = (local58 + 1) % local67;
				Static52.anIntArrayArray16[local7 - 1][local45 + 1] = local184;
			}
			if (local7 < 103 && local45 < 103 && Static56.anIntArrayArray17[local7 + 1][local45 + 1] == 0 && (local72[local7 + 1][local45 + 1] & 0x12C01E0) == 0 && (local72[local7 + 1][local45] & 0x12C0180) == 0 && (local72[local7][local45 + 1] & 0x12C0120) == 0) {
				Static86.anIntArray384[local58] = local7 + 1;
				Static41.anIntArray179[local58] = local45 + 1;
				Static56.anIntArrayArray17[local7 + 1][local45 + 1] = 12;
				local58 = (local58 + 1) % local67;
				Static52.anIntArrayArray16[local7 + 1][local45 + 1] = local184;
			}
		}
		Static121.anInt2820 = 0;
		@Pc(831) int local831;
		@Pc(838) int local838;
		@Pc(845) int local845;
		@Pc(906) int local906;
		if (!local64) {
			if (!arg7) {
				return false;
			}
			local184 = 1000;
			local831 = 100;
			for (local838 = arg0 - 10; local838 <= arg0 + 10; local838++) {
				for (local845 = arg5 - 10; local845 <= arg5 + 10; local845++) {
					if (local838 >= 0 && local845 >= 0 && local838 < 104 && local845 < 104 && Static52.anIntArrayArray16[local838][local845] < 100) {
						@Pc(871) int local871 = 0;
						if (arg5 > local845) {
							local871 = arg5 - local845;
						} else if (arg6 + arg5 - 1 < local845) {
							local871 = local845 + 1 - arg6 - arg5;
						}
						local906 = 0;
						if (local838 < arg0) {
							local906 = arg0 - local838;
						} else if (arg3 + arg0 - 1 < local838) {
							local906 = local838 + 1 - arg0 - arg3;
						}
						@Pc(944) int local944 = local871 * local871 + local906 * local906;
						if (local184 > local944 || local944 == local184 && local831 > Static52.anIntArrayArray16[local838][local845]) {
							local184 = local944;
							local7 = local838;
							local831 = Static52.anIntArrayArray16[local838][local845];
							local45 = local845;
						}
					}
				}
			}
			if (local184 == 1000) {
				return false;
			}
			if (local7 == arg9 && local45 == arg8) {
				return false;
			}
			Static121.anInt2820 = 1;
		}
		@Pc(1029) byte local1029 = 0;
		Static86.anIntArray384[0] = local7;
		local62 = local1029 + 1;
		Static41.anIntArray179[0] = local45;
		@Pc(1045) int local1045;
		local831 = local1045 = Static56.anIntArrayArray17[local7][local45];
		while (local7 != arg9 || local45 != arg8) {
			if (local831 != local1045) {
				local1045 = local831;
				Static86.anIntArray384[local62] = local7;
				Static41.anIntArray179[local62++] = local45;
			}
			if ((local831 & 0x2) != 0) {
				local7++;
			} else if ((local831 & 0x8) != 0) {
				local7--;
			}
			if ((local831 & 0x1) != 0) {
				local45++;
			} else if ((local831 & 0x4) != 0) {
				local45--;
			}
			local831 = Static56.anIntArrayArray17[local7][local45];
		}
		if (local62 > 0) {
			local67 = local62--;
			local838 = Static86.anIntArray384[local62];
			local845 = Static41.anIntArray179[local62];
			if (local67 > 25) {
				local67 = 25;
			}
			if (arg4 == 0) {
				Static127.aClass1_Sub12_Sub1_2.method1227(95);
				Static127.aClass1_Sub12_Sub1_2.method1197(local67 + local67 + 3);
			}
			if (arg4 == 1) {
				Static127.aClass1_Sub12_Sub1_2.method1227(156);
				Static127.aClass1_Sub12_Sub1_2.method1197(local67 + local67 + 3 + 14);
			}
			if (arg4 == 2) {
				Static127.aClass1_Sub12_Sub1_2.method1227(220);
				Static127.aClass1_Sub12_Sub1_2.method1197(local67 + local67 + 3);
			}
			Static127.aClass1_Sub12_Sub1_2.method1175(local838 + Static48.anInt1496);
			Static127.aClass1_Sub12_Sub1_2.method1200(local845 + Static52.anInt1603);
			Static52.anInt1607 = Static86.anIntArray384[0];
			Static13.anInt451 = Static41.anIntArray179[0];
			for (local906 = 1; local906 < local67; local906++) {
				local62--;
				Static127.aClass1_Sub12_Sub1_2.method1168(Static86.anIntArray384[local62] - local838);
				Static127.aClass1_Sub12_Sub1_2.method1205(Static41.anIntArray179[local62] - local845);
			}
			Static127.aClass1_Sub12_Sub1_2.method1168(Static122.aBooleanArray17[82] ? 1 : 0);
			return true;
		} else if (arg4 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!b;IIII)V")
	public static void method634(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = arg4 * arg4 + arg3 * arg3;
		if (local12 <= 4225 || local12 >= 90000) {
			Static75.method1438(arg4, arg0, arg3, arg2, arg1);
			return;
		}
		@Pc(32) int local32 = Static38.anInt2851 + Static75.anInt2076 & 0x7FF;
		@Pc(36) int local36 = Class1_Sub1_Sub2_Sub4.anIntArray399[local32];
		@Pc(44) int local44 = local36 * 256 / (Static70.anInt712 + 256);
		@Pc(48) int local48 = Class1_Sub1_Sub2_Sub4.anIntArray397[local32];
		@Pc(56) int local56 = local48 * 256 / (Static70.anInt712 + 256);
		@Pc(66) int local66 = local56 * arg3 + local44 * arg4 >> 16;
		@Pc(77) int local77 = arg4 * local56 - arg3 * local44 >> 16;
		@Pc(83) double local83 = Math.atan2((double) local66, (double) local77);
		@Pc(89) int local89 = (int) (Math.sin(local83) * 63.0D);
		@Pc(95) int local95 = (int) (Math.cos(local83) * 57.0D);
		aClass1_Sub1_Sub2_Sub1_8.method245(arg2 + local89 + 94 + 4 - 10, -local95 + -20 + arg0 + 83, local83);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIII)V")
	public static void method635(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = Static129.aClass9_1.method337(arg0, arg4, arg1);
		@Pc(28) int local28;
		@Pc(38) int local38;
		@Pc(32) int local32;
		@Pc(40) int local40;
		@Pc(61) int local61;
		@Pc(67) int local67;
		if (local16 != 0) {
			local28 = Static129.aClass9_1.method311(arg0, arg4, arg1, local16);
			local32 = local28 & 0x1F;
			local38 = local28 >> 6 & 0x3;
			local40 = arg2;
			if (local16 > 0) {
				local40 = arg3;
			}
			@Pc(47) int[] local47 = Static131.aClass1_Sub1_Sub2_Sub1_14.anIntArray44;
			local61 = (103 - arg1) * 2048 + arg4 * 4 + 24624;
			local67 = local16 >> 14 & 0x7FFF;
			@Pc(71) Class1_Sub1_Sub9 local71 = Static122.method1995(local67);
			if (local71.anInt2071 == -1) {
				if (local32 == 0 || local32 == 2) {
					if (local38 == 0) {
						local47[local61] = local40;
						local47[local61 + 512] = local40;
						local47[local61 + 1024] = local40;
						local47[local61 + 1536] = local40;
					} else if (local38 == 1) {
						local47[local61] = local40;
						local47[local61 + 1] = local40;
						local47[local61 + 2] = local40;
						local47[local61 + 3] = local40;
					} else if (local38 == 2) {
						local47[local61 + 3] = local40;
						local47[local61 + 512 + 3] = local40;
						local47[local61 + 1024 + 3] = local40;
						local47[local61 + 1539] = local40;
					} else if (local38 == 3) {
						local47[local61 + 1536] = local40;
						local47[local61 + 1537] = local40;
						local47[local61 + 1536 + 2] = local40;
						local47[local61 + 3 + 1536] = local40;
					}
				}
				if (local32 == 3) {
					if (local38 == 0) {
						local47[local61] = local40;
					} else if (local38 == 1) {
						local47[local61 + 3] = local40;
					} else if (local38 == 2) {
						local47[local61 + 3 + 1536] = local40;
					} else if (local38 == 3) {
						local47[local61 + 1536] = local40;
					}
				}
				if (local32 == 2) {
					if (local38 == 3) {
						local47[local61] = local40;
						local47[local61 + 512] = local40;
						local47[local61 + 1024] = local40;
						local47[local61 + 1536] = local40;
					} else if (local38 == 0) {
						local47[local61] = local40;
						local47[local61 + 1] = local40;
						local47[local61 + 2] = local40;
						local47[local61 + 3] = local40;
					} else if (local38 == 1) {
						local47[local61 + 3] = local40;
						local47[local61 + 512 + 3] = local40;
						local47[local61 + 1024 + 3] = local40;
						local47[local61 + 3 + 1536] = local40;
					} else if (local38 == 2) {
						local47[local61 + 1536] = local40;
						local47[local61 + 1536 + 1] = local40;
						local47[local61 + 2 + 1536] = local40;
						local47[local61 + 3 + 1536] = local40;
					}
				}
			} else {
				@Pc(80) Class1_Sub1_Sub2_Sub3 local80 = Static77.aClass1_Sub1_Sub2_Sub3Array8[local71.anInt2071];
				if (local80 != null) {
					@Pc(93) int local93 = (local71.anInt2083 * 4 - local80.anInt1429) / 2;
					@Pc(104) int local104 = (local71.anInt2065 * 4 - local80.anInt1432) / 2;
					local80.method997(local104 + arg4 * 4 + 48, (-local71.anInt2083 + -arg1 + 104) * 4 - -local93 + 48);
				}
			}
		}
		local16 = Static129.aClass9_1.method323(arg0, arg4, arg1);
		if (local16 != 0) {
			local28 = Static129.aClass9_1.method311(arg0, arg4, arg1, local16);
			local32 = local28 & 0x1F;
			local40 = local16 >> 14 & 0x7FFF;
			local38 = local28 >> 6 & 0x3;
			@Pc(480) Class1_Sub1_Sub9 local480 = Static122.method1995(local40);
			@Pc(512) int local512;
			if (local480.anInt2071 != -1) {
				@Pc(583) Class1_Sub1_Sub2_Sub3 local583 = Static77.aClass1_Sub1_Sub2_Sub3Array8[local480.anInt2071];
				if (local583 != null) {
					local67 = (local480.anInt2065 * 4 - local583.anInt1432) / 2;
					local512 = (local480.anInt2083 * 4 - local583.anInt1429) / 2;
					local583.method997(arg4 * 4 + local67 + 48, 48 - (-((-arg1 + (104 - local480.anInt2083)) * 4) + -local512));
				}
			} else if (local32 == 9) {
				local61 = 15658734;
				if (local16 > 0) {
					local61 = 15597568;
				}
				local512 = (52736 - arg1 * 512) * 4 + arg4 * 4 + 24624;
				@Pc(515) int[] local515 = Static131.aClass1_Sub1_Sub2_Sub1_14.anIntArray44;
				if (local38 == 0 || local38 == 2) {
					local515[local512 + 1536] = local61;
					local515[local512 + 1025] = local61;
					local515[local512 + 512 + 2] = local61;
					local515[local512 + 3] = local61;
				} else {
					local515[local512] = local61;
					local515[local512 + 512 + 1] = local61;
					local515[local512 + 1026] = local61;
					local515[local512 + 1536 + 3] = local61;
				}
			}
		}
		local16 = Static129.aClass9_1.method352(arg0, arg4, arg1);
		if (local16 == 0) {
			return;
		}
		local28 = local16 >> 14 & 0x7FFF;
		@Pc(653) Class1_Sub1_Sub9 local653 = Static122.method1995(local28);
		if (local653.anInt2071 == -1) {
			return;
		}
		@Pc(662) Class1_Sub1_Sub2_Sub3 local662 = Static77.aClass1_Sub1_Sub2_Sub3Array8[local653.anInt2071];
		if (local662 != null) {
			local40 = (local653.anInt2065 * 4 - local662.anInt1432) / 2;
			@Pc(686) int local686 = (local653.anInt2083 * 4 - local662.anInt1429) / 2;
			local662.method997(local40 + arg4 * 4 + 48, local686 + 48 - -((-arg1 + (104 - local653.anInt2083)) * 4));
			return;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!je;I)V")
	public static void method636(@OriginalArg(1) Class1_Sub12_Sub1 arg0) {
		while (true) {
			@Pc(15) Class1_Sub17 local15 = (Class1_Sub17) Static20.aClass61_5.method1748();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt2174; local22++) {
				if (local15.aClass32Array2[local22] != null) {
					if (local15.aClass32Array2[local22].anInt1494 == 2) {
						local15.anIntArray357[local22] = -5;
					}
					if (local15.aClass32Array2[local22].anInt1494 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass32Array1[local22] != null) {
					if (local15.aClass32Array1[local22].anInt1494 == 2) {
						local15.anIntArray357[local22] = -6;
					}
					if (local15.aClass32Array1[local22].anInt1494 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method1227(155);
			arg0.method1197(0);
			@Pc(98) int local98 = arg0.anInt1694;
			arg0.method1193(local15.anInt2177);
			for (@Pc(105) int local105 = 0; local105 < local15.anInt2174; local105++) {
				if (local15.anIntArray357[local105] == 0) {
					try {
						@Pc(128) int local128 = local15.anIntArray358[local105];
						@Pc(140) Field local140;
						@Pc(144) int local144;
						if (local128 == 0) {
							local140 = (Field) local15.aClass32Array2[local105].anObject4;
							local144 = local140.getInt(null);
							arg0.method1197(0);
							arg0.method1193(local144);
						} else if (local128 == 1) {
							local140 = (Field) local15.aClass32Array2[local105].anObject4;
							local140.setInt(null, local15.anIntArray356[local105]);
							arg0.method1197(0);
						} else if (local128 == 2) {
							local140 = (Field) local15.aClass32Array2[local105].anObject4;
							local144 = local140.getModifiers();
							arg0.method1197(0);
							arg0.method1193(local144);
						}
						@Pc(221) Method local221;
						if (local128 == 3) {
							local221 = (Method) local15.aClass32Array1[local105].anObject4;
							@Pc(248) byte[][] local248 = local15.aByteArrayArrayArray13[local105];
							@Pc(252) Object[] local252 = new Object[local248.length];
							for (@Pc(254) int local254 = 0; local254 < local248.length; local254++) {
								@Pc(266) ObjectInputStream local266 = new ObjectInputStream(new ByteArrayInputStream(local248[local254]));
								local252[local254] = local266.readObject();
							}
							@Pc(281) Object local281 = local221.invoke(null, local252);
							if (local281 == null) {
								arg0.method1197(0);
							} else if (local281 instanceof Number) {
								arg0.method1197(1);
								arg0.method1195(((Number) local281).longValue());
							} else if (local281 instanceof Class66) {
								arg0.method1197(2);
								arg0.method1188((Class66) local281);
							} else {
								arg0.method1197(4);
							}
						} else if (local128 == 4) {
							local221 = (Method) local15.aClass32Array1[local105].anObject4;
							local144 = local221.getModifiers();
							arg0.method1197(0);
							arg0.method1193(local144);
						}
					} catch (@Pc(326) ClassNotFoundException local326) {
						arg0.method1197(-10);
					} catch (@Pc(334) InvalidClassException local334) {
						arg0.method1197(-11);
					} catch (@Pc(342) StreamCorruptedException local342) {
						arg0.method1197(-12);
					} catch (@Pc(348) OptionalDataException local348) {
						arg0.method1197(-13);
					} catch (@Pc(354) IllegalAccessException local354) {
						arg0.method1197(-14);
					} catch (@Pc(360) IllegalArgumentException local360) {
						arg0.method1197(-15);
					} catch (@Pc(368) InvocationTargetException local368) {
						arg0.method1197(-16);
					} catch (@Pc(374) SecurityException local374) {
						arg0.method1197(-17);
					} catch (@Pc(382) IOException local382) {
						arg0.method1197(-18);
					} catch (@Pc(390) NullPointerException local390) {
						arg0.method1197(-19);
					} catch (@Pc(396) Exception local396) {
						arg0.method1197(-20);
					} catch (@Pc(402) Throwable local402) {
						arg0.method1197(-21);
					}
				} else {
					arg0.method1197(local15.anIntArray357[local105]);
				}
			}
			arg0.method1178(local98);
			arg0.method1191(arg0.anInt1694 - local98);
			local15.method2050();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IBI)I")
	public static int method637(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = (local20 * local20 * 15731 + 789221) * local20 + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void method638() {
		if (Static122.aBooleanArray17[98]) {
			Static51.anInt1591 += (12 - Static51.anInt1591) / 2;
		} else if (Static122.aBooleanArray17[99]) {
			Static51.anInt1591 += (-Static51.anInt1591 - 12) / 2;
		} else {
			Static51.anInt1591 /= 2;
		}
		if (Static122.aBooleanArray17[96]) {
			Static95.anInt2442 += (-Static95.anInt2442 - 24) / 2;
		} else if (Static122.aBooleanArray17[97]) {
			Static95.anInt2442 += (24 - Static95.anInt2442) / 2;
		} else {
			Static95.anInt2442 /= 2;
		}
		@Pc(78) int local78 = Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271 + Static103.anInt2544;
		Static75.anInt2076 = Static75.anInt2076 + Static95.anInt2442 / 2 & 0x7FF;
		@Pc(92) int local92 = Static121.anInt2809 + Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261;
		if (Static90.anInt1840 - local92 < -500 || Static90.anInt1840 - local92 > 500 || Static65.anInt1954 - local78 < -500 || Static65.anInt1954 - local78 > 500) {
			Static65.anInt1954 = local78;
			Static90.anInt1840 = local92;
		}
		if (Static65.anInt1954 != local78) {
			Static65.anInt1954 += (local78 - Static65.anInt1954) / 16;
		}
		if (local92 != Static90.anInt1840) {
			Static90.anInt1840 += (local92 - Static90.anInt1840) / 16;
		}
		@Pc(160) int local160 = Static90.anInt1840 >> 7;
		Static65.anInt1950 += Static51.anInt1591 / 2;
		@Pc(170) int local170 = Static65.anInt1954 >> 7;
		if (Static65.anInt1950 < 128) {
			Static65.anInt1950 = 128;
		}
		if (Static65.anInt1950 > 383) {
			Static65.anInt1950 = 383;
		}
		@Pc(195) int local195 = Static77.method1476(Static65.anInt1954, Static22.anInt635, Static90.anInt1840);
		@Pc(197) int local197 = 0;
		@Pc(213) int local213;
		if (local160 > 3 && local170 > 3 && local160 < 100 && local170 < 100) {
			for (local213 = local160 - 4; local213 <= local160 + 4; local213++) {
				for (@Pc(219) int local219 = local170 - 4; local219 <= local170 + 4; local219++) {
					@Pc(223) int local223 = Static22.anInt635;
					if (local223 < 3 && (Static87.aByteArrayArrayArray15[1][local213][local219] & 0x2) == 2) {
						local223++;
					}
					@Pc(250) int local250 = local195 - Static44.anIntArrayArrayArray3[local223][local213][local219];
					if (local250 > local197) {
						local197 = local250;
					}
				}
			}
		}
		local213 = local197 * 192;
		if (local213 > 98048) {
			local213 = 98048;
		}
		if (local213 < 32768) {
			local213 = 32768;
		}
		if (Static2.anInt89 < local213) {
			Static2.anInt89 += (local213 - Static2.anInt89) / 24;
		} else if (Static2.anInt89 > local213) {
			Static2.anInt89 += (local213 - Static2.anInt89) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!he;B)Z")
	public static boolean method639(@OriginalArg(0) Class1_Sub10 arg0) {
		if (Static3.aBoolean2) {
			if (Static61.method1301(arg0) != 0) {
				return false;
			}
			if (arg0.anInt1359 == 0) {
				return false;
			}
		}
		return arg0.aBoolean53;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
	public static int anInt4612;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "[Z")
	public static boolean[] aBooleanArray21 = new boolean[100];

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
	public static int anInt4609 = 0;

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "[Lclient!od;")
	public static Class123[] aClass123Array1 = new Class123[50];

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBZII)V")
	public static void method3717(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static249.method3997(arg3)) {
			Static189.method3191(arg1, arg0, -1, arg2, Static219.aClass115ArrayArray1[arg3]);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([[II)V")
	public static void method3718(@OriginalArg(0) int[][] arg0) {
		Static274.anIntArrayArray50 = arg0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V")
	public static void method3719() {
		@Pc(3) boolean local3 = false;
		while (!local3) {
			local3 = true;
			for (@Pc(9) int local9 = 0; local9 < Static216.anInt4481 - 1; local9++) {
				if (Static289.aShortArray93[local9] < 1000 && Static289.aShortArray93[local9 + 1] > 1000) {
					local3 = false;
					@Pc(32) String local32 = Static214.aStringArray22[local9];
					Static214.aStringArray22[local9] = Static214.aStringArray22[local9 + 1];
					Static214.aStringArray22[local9 + 1] = local32;
					@Pc(50) String local50 = Static250.aStringArray28[local9];
					Static250.aStringArray28[local9] = Static250.aStringArray28[local9 + 1];
					Static250.aStringArray28[local9 + 1] = local50;
					@Pc(68) int local68 = Static163.anIntArray262[local9];
					Static163.anIntArray262[local9] = Static163.anIntArray262[local9 + 1];
					Static163.anIntArray262[local9 + 1] = local68;
					@Pc(86) int local86 = Static55.anIntArray97[local9];
					Static55.anIntArray97[local9] = Static55.anIntArray97[local9 + 1];
					Static55.anIntArray97[local9 + 1] = local86;
					@Pc(104) int local104 = Static77.anIntArray116[local9];
					Static77.anIntArray116[local9] = Static77.anIntArray116[local9 + 1];
					Static77.anIntArray116[local9 + 1] = local104;
					@Pc(122) short local122 = Static289.aShortArray93[local9];
					Static289.aShortArray93[local9] = Static289.aShortArray93[local9 + 1];
					Static289.aShortArray93[local9 + 1] = local122;
					@Pc(140) long local140 = Static232.aLongArray18[local9];
					Static232.aLongArray18[local9] = Static232.aLongArray18[local9 + 1];
					Static232.aLongArray18[local9 + 1] = local140;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)Lclient!ij;")
	public static Class80 method3720(@OriginalArg(1) int arg0) {
		@Pc(6) Class80 local6 = (Class80) Static186.aClass46_31.method1074((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(27) byte[] local27 = Static97.aClass84_42.method2127(arg0, 29);
		local6 = new Class80();
		if (local27 != null) {
			local6.method2004(new Class2_Sub26(local27), arg0);
		}
		Static186.aClass46_31.method1071(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!jd;I)I")
	public static int method3721(@OriginalArg(0) Class84 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method2138(Static79.anInt1760)) {
			local10++;
		}
		if (arg0.method2138(Static200.anInt4154)) {
			local10++;
		}
		if (arg0.method2138(Static140.anInt3021)) {
			local10++;
		}
		if (arg0.method2138(Static157.anInt3298)) {
			local10++;
		}
		if (arg0.method2138(Static106.anInt2315)) {
			local10++;
		}
		if (arg0.method2138(Static44.anInt1073)) {
			local10++;
		}
		if (arg0.method2138(Static243.anInt3778)) {
			local10++;
		}
		if (arg0.method2138(Static35.anInt849)) {
			local10++;
		}
		if (arg0.method2138(Static274.anInt5699)) {
			local10++;
		}
		if (arg0.method2138(Static16.anInt403)) {
			local10++;
		}
		if (arg0.method2138(Static247.anInt4929)) {
			local10++;
		}
		if (arg0.method2138(Static15.anInt354)) {
			local10++;
		}
		if (arg0.method2138(Static89.anInt1991)) {
			local10++;
		}
		if (arg0.method2138(Static182.anInt3885)) {
			local10++;
		}
		if (arg0.method2138(Static70.anInt1539)) {
			local10++;
		}
		return local10;
	}
}

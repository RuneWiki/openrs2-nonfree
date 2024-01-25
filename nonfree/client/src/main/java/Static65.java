import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!d", name = "h", descriptor = "Lclient!fv;")
	public static Class86 aClass86_1;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)I")
	public static int method1071(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public static void method1072() {
		for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
			Static369.aBooleanArray23[local12] = true;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public static void method1073() {
		Static222.method3246((long) Static236.anInt4213, Static185.aClass34_7);
		if (Static207.anInt6026 != -1) {
			Static150.method5309(Static207.anInt6026);
		}
		for (@Pc(19) int local19 = 0; local19 < Static250.anInt4507; local19++) {
			if (Static369.aBooleanArray23[local19]) {
				Static408.aBooleanArray25[local19] = true;
			}
			Static10.aBooleanArray1[local19] = Static369.aBooleanArray23[local19];
			Static369.aBooleanArray23[local19] = false;
		}
		Static453.anInt7489 = Static236.anInt4213;
		if (Static185.aClass34_7.method5772()) {
			Static332.aBoolean646 = true;
		}
		if (Static207.anInt6026 != -1) {
			Static250.anInt4507 = 0;
			Static385.method5054();
		}
		Static185.aClass34_7.va();
		Static336.method4511(Static185.aClass34_7);
		@Pc(70) int local70 = Static116.method1852();
		if (local70 == -1) {
			local70 = Static33.anInt530;
		}
		if (local70 == -1) {
			local70 = Static54.anInt973;
		}
		Static46.method622(local70);
		Static341.anInt5831 = 0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BLclient!za;)V")
	public static void method1074(@OriginalArg(1) Class34 arg0) {
		if (Static382.aBoolean780) {
			Static452.method5906(arg0);
		} else {
			Static194.method5859(arg0);
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V")
	public static void method1075() {
		if (Static441.anInt7355 < 0) {
			Static222.anInt3998 = -1;
			Static78.anInt3523 = -1;
			Static441.anInt7355 = 0;
		}
		if (Static167.anInt2093 < Static441.anInt7355) {
			Static222.anInt3998 = -1;
			Static441.anInt7355 = Static167.anInt2093;
			Static78.anInt3523 = -1;
		}
		if (Static169.anInt2773 < 0) {
			Static169.anInt2773 = 0;
			Static78.anInt3523 = -1;
			Static222.anInt3998 = -1;
		}
		if (Static167.anInt2094 < Static169.anInt2773) {
			Static222.anInt3998 = -1;
			Static78.anInt3523 = -1;
			Static169.anInt2773 = Static167.anInt2094;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([JII[II)V")
	public static void method1076(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg3) / 2;
		@Pc(21) int local21 = arg1;
		@Pc(25) long local25 = arg0[local19];
		arg0[local19] = arg0[arg3];
		arg0[arg3] = local25;
		@Pc(39) int local39 = arg2[local19];
		arg2[local19] = arg2[arg3];
		arg2[arg3] = local39;
		@Pc(59) int local59 = ~local25 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg1; local61 < arg3; local61++) {
			if ((long) (local61 & local59) + local25 > arg0[local61]) {
				@Pc(82) long local82 = arg0[local61];
				arg0[local61] = arg0[local21];
				arg0[local21] = local82;
				@Pc(96) int local96 = arg2[local61];
				arg2[local61] = arg2[local21];
				arg2[local21++] = local96;
			}
		}
		arg0[arg3] = arg0[local21];
		arg0[local21] = local25;
		arg2[arg3] = arg2[local21];
		arg2[local21] = local39;
		method1076(arg0, arg1, arg2, local21 - 1);
		method1076(arg0, local21 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!gp;I)V")
	public static void method1077(@OriginalArg(0) Class1_Sub19 arg0) {
		if (!Static17.aBoolean39) {
			arg0.method5915();
			Static118.anInt2201--;
		}
	}
}

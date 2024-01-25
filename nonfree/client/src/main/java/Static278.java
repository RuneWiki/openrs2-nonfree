import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "Lclient!am;")
	public static final Class14 aClass14_39 = new Class14();

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!oi;I)I")
	public static int method4438(@OriginalArg(0) Class185 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method4000(Static408.anInt4867)) {
			local10++;
		}
		if (arg0.method4000(Static294.anInt4896)) {
			local10++;
		}
		if (arg0.method4000(Static393.anInt6332)) {
			local10++;
		}
		if (arg0.method4000(Static144.anInt7178)) {
			local10++;
		}
		if (arg0.method4000(Static308.anInt5112)) {
			local10++;
		}
		if (arg0.method4000(Static276.anInt4735)) {
			local10++;
		}
		if (arg0.method4000(Static199.anInt3657)) {
			local10++;
		}
		if (arg0.method4000(Static442.anInt6948)) {
			local10++;
		}
		if (arg0.method4000(Static333.anInt5458)) {
			local10++;
		}
		if (arg0.method4000(Static62.anInt965)) {
			local10++;
		}
		if (arg0.method4000(Static372.anInt6000)) {
			local10++;
		}
		if (arg0.method4000(Static356.anInt5793)) {
			local10++;
		}
		if (arg0.method4000(Static219.anInt4006)) {
			local10++;
		}
		if (arg0.method4000(Static336.anInt5487)) {
			local10++;
		}
		if (arg0.method4000(Static100.anInt1338)) {
			local10++;
		}
		if (arg0.method4000(Static45.anInt666)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZZIBII)V")
	public static void method4439(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 >= arg4) {
			return;
		}
		@Pc(15) int local15 = (arg3 + arg4) / 2;
		@Pc(17) int local17 = arg3;
		@Pc(21) Class239_Sub1 local21 = Static13.aClass239_Sub1Array1[local15];
		Static13.aClass239_Sub1Array1[local15] = Static13.aClass239_Sub1Array1[arg4];
		Static13.aClass239_Sub1Array1[arg4] = local21;
		for (@Pc(33) int local33 = arg3; local33 < arg4; local33++) {
			if (Static77.method955(arg0, local21, arg2, arg5, Static13.aClass239_Sub1Array1[local33], arg1) <= 0) {
				@Pc(50) Class239_Sub1 local50 = Static13.aClass239_Sub1Array1[local33];
				Static13.aClass239_Sub1Array1[local33] = Static13.aClass239_Sub1Array1[local17];
				Static13.aClass239_Sub1Array1[local17++] = local50;
			}
		}
		Static13.aClass239_Sub1Array1[arg4] = Static13.aClass239_Sub1Array1[local17];
		Static13.aClass239_Sub1Array1[local17] = local21;
		method4439(arg0, arg1, arg2, arg3, local17 - 1, arg5);
		method4439(arg0, arg1, arg2, local17 + 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)V")
	public static void method4441(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = Static98.anInt1304 - Static157.anInt2566;
		if (local12 >= 100) {
			Static139.anInt2147 = 1;
			return;
		}
		@Pc(21) int local21 = (int) Static336.aFloat72;
		if (Static77.anInt1084 >> 8 > local21) {
			local21 = Static77.anInt1084 >> 8;
		}
		if (Static269.aBooleanArray106[4] && local21 < Static301.anIntArray379[4] + 128) {
			local21 = Static301.anIntArray379[4] + 128;
		}
		@Pc(58) int local58 = Static232.anInt4194 + (int) Static99.aFloat9 & 0x3FFF;
		Static164.method5258(Static446.anInt7039, Static135.method1732(Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428, Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430, Static390.anInt6272) - 50, 600 - -((local21 >> 3) * 3) << 0, Static23.anInt350, local21, arg0, local58);
		@Pc(104) float local104 = 1.0F - (float) ((100 - local12) * (100 - local12) * (100 - local12)) / 1000000.0F;
		Static80.anInt1106 = (int) (local104 * (float) (Static80.anInt1106 - Static342.anInt5550) + (float) Static342.anInt5550);
		Static386.anInt7155 = (int) ((float) Static404.anInt6473 + (float) (Static386.anInt7155 - Static404.anInt6473) * local104);
		Static129.anInt1972 = (int) (local104 * (float) (Static129.anInt1972 - Static163.anInt5784) + (float) Static163.anInt5784);
		Static375.anInt6055 = (int) ((float) (Static375.anInt6055 - Static294.anInt4900) * local104 + (float) Static294.anInt4900);
		@Pc(157) int local157 = Static398.anInt6386 - Static379.anInt124;
		if (local157 > 8192) {
			local157 -= 16384;
		} else if (local157 < -8192) {
			local157 += 16384;
		}
		Static398.anInt6386 = (int) ((float) local157 * local104 + (float) Static379.anInt124);
		Static398.anInt6386 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
	public static void method4442() {
		Static154.method1923(10);
		Static142.method1768();
		System.gc();
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
	public static void method4443() {
		for (@Pc(10) Class1_Sub3_Sub13 local10 = (Class1_Sub3_Sub13) Static170.aClass14_9.method203(); local10 != null; local10 = (Class1_Sub3_Sub13) Static170.aClass14_9.method208()) {
			@Pc(15) Class11_Sub1_Sub6 local15 = local10.aClass11_Sub1_Sub6_1;
			if (local15.aBoolean564) {
				local10.method5953();
				local15.method5194();
			} else if (local15.anInt6445 <= Static98.anInt1304) {
				local15.method5188(Static71.anInt1041);
				if (local15.aBoolean564) {
					local10.method5953();
				} else {
					Static95.method5201(local15, true);
				}
			}
		}
	}
}

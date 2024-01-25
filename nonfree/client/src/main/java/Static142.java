import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "Lclient!qt;")
	public static Class199 aClass199_6;

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "[J")
	public static final long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!iv;B)V")
	public static void method2425(@OriginalArg(0) Class4_Sub12 arg0) {
		@Pc(9) int local9 = arg0.method2506();
		Static136.aClass10Array1 = new Class10[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static136.aClass10Array1[local14] = new Class10();
			Static136.aClass10Array1[local14].anInt169 = arg0.method2506();
			Static136.aClass10Array1[local14].aString3 = arg0.method2497();
		}
		Static396.anInt4816 = arg0.method2506();
		Static339.anInt5874 = arg0.method2506();
		Static33.anInt602 = arg0.method2506();
		Static407.aClass78_Sub1Array2 = new Class78_Sub1[Static339.anInt5874 + 1 - Static396.anInt4816];
		for (@Pc(67) int local67 = 0; local67 < Static33.anInt602; local67++) {
			@Pc(73) int local73 = arg0.method2506();
			@Pc(81) Class78_Sub1 local81 = Static407.aClass78_Sub1Array2[local73] = new Class78_Sub1();
			local81.anInt3877 = arg0.method2490();
			local81.anInt3874 = arg0.method2529();
			local81.anInt3881 = Static396.anInt4816 + local73;
			local81.aString37 = arg0.method2497();
			local81.aString38 = arg0.method2497();
		}
		Static70.anInt1504 = arg0.method2529();
		Static94.aBoolean176 = true;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	public static void method2426() {
		Static384.aClass244_1.method5486();
		Static420.aClass80_1.method2227();
		if (Static223.aClass14_1 != null) {
			Static223.aClass14_1.method213(Static273.aCanvas5);
		}
		Static6.aClient1.method874();
		Static273.aCanvas5.setBackground(Color.black);
		Static6.anInt57 = -1;
		Static384.aClass244_1 = Static140.method2398(Static273.aCanvas5);
		Static420.aClass80_1 = Static376.method4882(Static273.aCanvas5);
		if (Static223.aClass14_1 != null) {
			Static223.aClass14_1.method209(Static273.aCanvas5);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BIC)I")
	public static int method2428(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIII)V")
	public static void method2429(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(6) Class3_Sub8 local6 = (Class3_Sub8) Static276.aClass84_4.method2312(); local6 != null; local6 = (Class3_Sub8) Static276.aClass84_4.method2309()) {
			if (Static24.anInt5323 >= local6.anInt7367) {
				local6.method5676();
			} else {
				Static270.method3871((local6.anInt7366 << 7) + 64, (local6.anInt7374 << 7) + 64, local6.anInt7372, local6.anInt7375 * 2, arg0 >> 1, arg2 >> 1);
				Static331.aClass46_10.method5056(arg3 + Static449.anIntArray557[0], local6.anInt7376 | 0xFF000000, arg1 + Static449.anIntArray557[1], 0, local6.aString71);
			}
		}
	}
}

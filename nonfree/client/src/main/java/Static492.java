import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "Lclient!ra;")
	public static Class13 aClass13_3;

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
	public static int anInt8448 = -1;

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
	public static int anInt8451 = 100;

	@OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
	public static int anInt8455 = 0;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZ)V")
	public static void method6830(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static463.aBooleanArray33[arg0]) {
			Static182.aClass117_100.method2948(arg0);
			Static139.aClass220ArrayArray1[arg0] = null;
			Static424.aClass220ArrayArray2[arg0] = null;
			Static463.aBooleanArray33[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILjava/lang/Object;II)[B")
	public static byte[] method6832(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return Static62.method6714(local18, arg0);
		} else if (arg1 instanceof Class216) {
			@Pc(30) Class216 local30 = (Class216) arg1;
			return local30.method5324(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IJ)V")
	public static void method6833(@OriginalArg(1) long arg0) {
		if (Static152.aClass37ArrayArrayArray1 != null) {
			if (Static166.anInt3343 == 1 || Static166.anInt3343 == 5) {
				Static225.method3575(arg0);
			} else if (Static166.anInt3343 == 4) {
				Static544.method2106(arg0);
			}
		}
		Static215.method3475((long) Static481.anInt8318, Static110.aClass62_15);
		if (Static395.anInt7085 != -1) {
			Static327.method5196(Static395.anInt7085);
		}
		for (@Pc(44) int local44 = 0; local44 < Static423.anInt7490; local44++) {
			if (Static345.aBooleanArray24[local44]) {
				Static386.aBooleanArray15[local44] = true;
			}
			Static106.aBooleanArray13[local44] = Static345.aBooleanArray24[local44];
			Static345.aBooleanArray24[local44] = false;
		}
		Static276.anInt5395 = Static481.anInt8318;
		if (Static110.aClass62_15.method7062()) {
			Static256.aBoolean357 = true;
		}
		if (Static395.anInt7085 != -1) {
			Static423.anInt7490 = 0;
			Static101.method2095();
		}
		Static110.aClass62_15.n();
		Static213.method3466(Static110.aClass62_15);
		@Pc(98) int local98 = Static278.method4540();
		if (local98 == -1) {
			local98 = Static92.anInt2142;
		}
		if (local98 == -1) {
			local98 = Static221.anInt4156;
		}
		Static354.method5481(local98);
		Static447.method6326(Static168.anInt7198, Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493, Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91, Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492);
		Static168.anInt7198 = 0;
	}
}

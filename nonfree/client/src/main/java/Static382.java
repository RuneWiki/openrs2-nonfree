import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	public static int anInt6588;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
	public static int anInt6590;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "[I")
	public static final int[] anIntArray556 = new int[4];

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Lclient!fca;")
	public static Class97 aClass97_10 = null;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)I")
	public static int method5560() {
		if (Static330.aBoolean415) {
			return 6;
		} else if (Static185.aClass6_Sub48_1 == null) {
			return 0;
		} else {
			@Pc(20) int local20 = Static185.aClass6_Sub48_1.anInt8333;
			if (Static248.method3541(local20)) {
				return 1;
			} else if (Static557.method7618(local20)) {
				return 2;
			} else if (Static90.method1435(local20)) {
				return 3;
			} else if (Static197.method2979(local20)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)[Lclient!jv;")
	public static Class165[] method5562() {
		return new Class165[] { Static91.aClass165_13, Static343.aClass165_14, Static245.aClass165_9, Static188.aClass165_7, Static227.aClass165_8, Static153.aClass165_4, Static500.aClass165_17, Static348.aClass165_18, Static471.aClass165_16 };
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!uca;IBILclient!oa;)V")
	public static void method5563(@OriginalArg(0) int arg0, @OriginalArg(1) Class313 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class121 arg4) {
		@Pc(9) Class111 local9 = Static32.aClass245_1.method5768(arg1.anInt8446);
		if (local9.anInt2677 == -1) {
			return;
		}
		if (arg1.aBoolean584) {
			@Pc(22) int local22 = arg3 + arg1.anInt8454;
			arg3 = local22 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(38) Class4 local38 = local9.method2216(arg1.aBoolean593, arg4, arg3);
		if (local38 == null) {
			return;
		}
		@Pc(44) int local44 = arg1.anInt8478;
		@Pc(47) int local47 = arg1.anInt8463;
		if ((arg3 & 0x1) == 1) {
			local47 = arg1.anInt8478;
			local44 = arg1.anInt8463;
		}
		@Pc(65) int local65 = local38.AA();
		@Pc(68) int local68 = local38.a();
		if (local9.aBoolean181) {
			local68 = local47 * 4;
			local65 = local44 * 4;
		}
		if (local9.anInt2680 == 0) {
			local38.method6509(arg0, arg2 - (local47 - 1) * 4, local65, local68);
		} else {
			local38.KA(arg0, arg2 + 4 - local47 * 4, local65, local68, 0, local9.anInt2680 | 0xFF000000, 1);
		}
	}
}

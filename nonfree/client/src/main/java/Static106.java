import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
	public static int anInt2025;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "Z")
	public static boolean aBoolean155 = false;

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "Lclient!raa;")
	public static Class295 aClass295_6 = null;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
	public static void method1668() {
		@Pc(5) Class87 local5 = Static213.aClass87_107;
		synchronized (Static213.aClass87_107) {
			Static213.aClass87_107.method1801();
		}
		local5 = Static163.aClass87_242;
		synchronized (Static163.aClass87_242) {
			Static163.aClass87_242.method1801();
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILclient!pe;)V")
	public static void method1670(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub2_Sub1_Sub1 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static631.anInt10493 < arg1.anInt1237) {
			Static230.method3864(arg1);
		} else if (Static631.anInt10493 <= arg1.anInt1249) {
			Static593.method8546(arg1);
		} else {
			Static192.method2915(arg1, false);
			local9 = Static308.anInt7114;
			local7 = Static36.anInt576;
		}
		if (arg1.anInt10231 < 512 || arg1.anInt10229 < 512 || Static326.anInt5541 * 512 - 512 <= arg1.anInt10231 || (Static448.anInt7637 - 1) * 512 <= arg1.anInt10229) {
			local7 = -1;
			arg1.anInt1276 = -1;
			arg1.anInt1277 = -1;
			arg1.anInt1197 = -1;
			arg1.anInt1237 = 0;
			arg1.anIntArray85 = null;
			arg1.anInt1249 = 0;
			local9 = 0;
			arg1.anInt10231 = arg1.anIntArray94[0] * 512 + arg1.method1018() * 256;
			arg1.anInt10229 = arg1.anIntArray95[0] * 512 + arg1.method1018() * 256;
			arg1.method1022();
		}
		if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2 == arg1 && (arg1.anInt10231 < 6144 || arg1.anInt10229 < 6144 || (Static326.anInt5541 - 12) * 512 <= arg1.anInt10231 || (Static448.anInt7637 - 12) * 512 <= arg1.anInt10229)) {
			arg1.anInt1249 = 0;
			arg1.anInt1276 = -1;
			arg1.anInt1277 = -1;
			arg1.anIntArray85 = null;
			local7 = -1;
			arg1.anInt1237 = 0;
			local9 = 0;
			arg1.anInt1197 = -1;
			arg1.anInt10231 = arg1.anIntArray94[0] * 512 + arg1.method1018() * 256;
			arg1.anInt10229 = arg1.anIntArray95[0] * 512 + arg1.method1018() * 256;
			arg1.method1022();
		}
		@Pc(217) int local217 = Static641.method9010(arg1);
		Static407.method6300(arg1);
		Static132.method6358(arg1, local7, local9, local217);
		Static32.method413(local7, arg1);
		Static155.method1874(arg1);
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(B)V")
	public static void method1674() {
		if (Static482.anInt8212 != -1) {
			Static484.method7186(false, -1, -1, Static482.anInt8212);
			Static482.anInt8212 = -1;
		}
	}
}

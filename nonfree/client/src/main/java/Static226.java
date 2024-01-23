import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "Lclient!fb;")
	public static Class1_Sub12_Sub1 aClass1_Sub12_Sub1_2;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
	public static int anInt4351 = 0;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1375 = Static186.method3527("mapfunction");

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
	public static int anInt4354 = -1;

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1376 = Static186.method3527("Hierhin gehen");

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!sh;I)V")
	public static void method3432(@OriginalArg(0) Class20_Sub3 arg0) {
		if (arg0.anInt3031 == 0) {
			arg0.anInt3042 = 1024;
		}
		arg0.anInt3029 = 0;
		@Pc(21) int local21 = arg0.anInt3028 - Static107.anInt2132;
		if (arg0.anInt3031 == 1) {
			arg0.anInt3042 = 1536;
		}
		if (arg0.anInt3031 == 2) {
			arg0.anInt3042 = 0;
		}
		@Pc(47) int local47 = arg0.anInt3059 * 128 + arg0.anInt3034 * 64;
		arg0.anInt3008 += (local47 - arg0.anInt3008) / local21;
		if (arg0.anInt3031 == 3) {
			arg0.anInt3042 = 512;
		}
		@Pc(78) int local78 = arg0.anInt3034 * 64 + arg0.anInt3049 * 128;
		arg0.anInt3022 += (local78 - arg0.anInt3022) / local21;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "Lclient!pe;")
	public static Class254 aClass254_116;

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
	public static int anInt8446 = 2;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILclient!cda;B)V")
	public static void method6925(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7_Sub1 arg1) {
		Static114.aBoolean207 = false;
		Static293.anInt6017 = 0;
		Static147.method2903(arg1);
		Static132.method5422(arg1);
		if (Static114.aBoolean207) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt7869 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt7869 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIILclient!un;)V")
	public static void method6926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub5 arg4) {
		@Pc(4) Class125 local4 = Static188.method3288(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt9845 = (arg1 << Static309.anInt6172) + Static377.anInt7321;
		arg4.anInt9847 = arg3;
		arg4.anInt9848 = (arg2 << Static309.anInt6172) + Static377.anInt7321;
		for (@Pc(28) Class302 local28 = local4.aClass302_1; local28 != null; local28 = local28.aClass302_2) {
			if (local28.aClass2_Sub2_1.aBoolean788) {
				@Pc(38) int local38 = local28.aClass2_Sub2_1.method7629();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt9847 += local8;
			arg4.aBoolean822 = true;
		} else if (local4.aClass2_Sub1_1 != null) {
			arg4.anInt9847 -= local4.aClass2_Sub1_1.aShort128;
		}
		local4.aClass2_Sub5_1 = arg4;
	}
}

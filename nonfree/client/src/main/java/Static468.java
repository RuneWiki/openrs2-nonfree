import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
	public static int anInt8821;

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "[S")
	public static short[] aShortArray116;

	@OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
	public static int anInt8823 = 0;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
	public static void method7399() {
		for (@Pc(10) Class3_Sub6 local10 = (Class3_Sub6) Static512.aClass325_7.method8019(); local10 != null; local10 = (Class3_Sub6) Static512.aClass325_7.method8019()) {
			Static320.method5562(local10);
		}
		@Pc(32) int local32;
		@Pc(31) int local31;
		if (Static74.aClass2_Sub13_5.aClass14_Sub7_2.method3523() == 1) {
			local32 = 0;
			local31 = 3;
		} else {
			local31 = Static425.anInt8001;
			local32 = Static425.anInt8001;
		}
		Static76.method2245();
		for (@Pc(41) int local41 = local32; local41 <= local31; local41++) {
			Static76.method2239();
			Static76.method2247(local41);
			Static76.method2234(local41);
		}
		Static76.method2236();
		Static76.method2242();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)Z")
	public static boolean method7401(@OriginalArg(1) int arg0) {
		return (arg0 & -arg0) == arg0;
	}
}

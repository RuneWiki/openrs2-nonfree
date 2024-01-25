import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "[Lclient!lq;")
	public static Class28_Sub1[] aClass28_Sub1Array2;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "S")
	public static short aShort24 = 1;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "Z")
	public static boolean aBoolean234 = false;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!tia;I)V")
	public static void method2399(@OriginalArg(0) Class5_Sub41_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static311.anInt5915; local7++) {
			@Pc(13) int local13 = Static675.anIntArray611[local7];
			@Pc(17) Class28_Sub1_Sub4_Sub2_Sub2 local17 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local13];
			@Pc(21) int local21 = arg0.method7816();
			if ((local21 & 0x20) != 0) {
				local21 += arg0.method7816() << 8;
			}
			if ((local21 & 0x8000) != 0) {
				local21 += arg0.method7816() << 16;
			}
			Static369.method5566(arg0, local17, local21, local13);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)Z")
	public static boolean method2404(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static439.method6410(arg0, arg1)) {
			return (arg0 & 0x9000) != 0 | Static297.method4773(arg0, arg1) | Static438.method6518(arg1, arg0) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | Static97.method1947(arg1, arg0) | Static302.method4800(arg1, arg0));
		} else {
			return false;
		}
	}
}

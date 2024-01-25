import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static709 {

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "Lclient!ug;")
	public static Class43 aClass43_32;

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "Z")
	public static boolean aBoolean930 = true;

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!tw;B)V")
	public static void method9456(@OriginalArg(0) Class2_Sub20_Sub2 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static559.anInt8813; local3++) {
			@Pc(11) int local11 = Static668.anIntArray730[local3];
			@Pc(15) Class4_Sub2_Sub1_Sub2_Sub1 local15 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local11];
			@Pc(19) int local19 = arg0.method8581(-17416);
			if ((local19 & 0x2) != 0) {
				local19 += arg0.method8581(-17416) << 8;
			}
			if ((local19 & 0x100) != 0) {
				local19 += arg0.method8581(-17416) << 16;
			}
			Static485.method6937(local15, arg0, local11, local19);
		}
		if (-73 <= -100) {
			method9455(-13);
		}
	}
}

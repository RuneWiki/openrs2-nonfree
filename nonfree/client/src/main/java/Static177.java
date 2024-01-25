import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
	public static int anInt3132;

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "Lclient!ik;")
	public static Class182 aClass182_47;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V")
	public static void method2858() {
		if (Static343.aClass208ArrayArray1 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < Static343.aClass208ArrayArray1.length; local5++) {
			for (@Pc(9) int local9 = 0; local9 < Static343.aClass208ArrayArray1[local5].length; local9++) {
				Static343.aClass208ArrayArray1[local5][local9] = Static559.aClass208_6;
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method2860(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(16) Class3_Sub7_Sub21 local16 = Static136.method2378((long) arg0, 2);
		local16.method9256();
		local16.aString131 = arg1;
	}
}

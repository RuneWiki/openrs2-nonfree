import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!et", name = "A", descriptor = "Lclient!oha;")
	public static Class254 aClass254_3;

	@OriginalMember(owner = "client!et", name = "D", descriptor = "I")
	public static int anInt3096 = 0;

	@OriginalMember(owner = "client!et", name = "G", descriptor = "Z")
	public static boolean aBoolean260 = false;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(III)Lclient!fa;")
	public static Class28_Sub1_Sub1 method2741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class226 local7 = Static635.aClass226ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class28_Sub1_Sub1 local14 = local7.aClass28_Sub1_Sub1_1;
			local7.aClass28_Sub1_Sub1_1 = null;
			Static81.method1222(local14);
			return local14;
		}
	}
}

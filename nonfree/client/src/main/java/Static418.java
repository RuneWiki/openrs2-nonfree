import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!ur", name = "y", descriptor = "Lclient!lt;")
	public static Class159 aClass159_5;

	@OriginalMember(owner = "client!ur", name = "p", descriptor = "Lclient!mf;")
	public static final Class163 aClass163_43 = new Class163();

	@OriginalMember(owner = "client!ur", name = "x", descriptor = "Lclient!s;")
	public static final Class217 aClass217_147 = new Class217(48, -2);

	@OriginalMember(owner = "client!ur", name = "z", descriptor = "Lclient!mf;")
	public static Class163 aClass163_44 = new Class163();

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)Z")
	public static boolean method5485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static68.method1351(arg0, arg1) || Static214.method3288(arg1, arg0);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILjava/lang/String;C)I")
	public static int method5490(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg0.charAt(local17) == arg1) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)V")
	public static void method5491() {
		if (Static9.aBoolean8) {
			return;
		}
		if (Static361.aClass85_Sub1_1.aBoolean164) {
			Static149.aFloat53 = (int) Static149.aFloat53 - 65 & 0xFFFFFF80;
		} else {
			Static231.aFloat70 += (-Static231.aFloat70 - 24.0F) / 2.0F;
		}
		Static406.aBoolean448 = true;
		Static9.aBoolean8 = true;
	}
}

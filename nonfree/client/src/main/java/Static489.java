import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!qga", name = "B", descriptor = "[Lclient!ai;")
	public static Class15[] aClass15Array1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!qga", name = "z", descriptor = "Ljava/lang/Class;")
	private static Class aClass17;

	// $FF: synthetic field
	@OriginalMember(owner = "client!qga", name = "v", descriptor = "Ljava/lang/Class;")
	private static Class aClass18;

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method7244(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(15) int local15 = arg0.indexOf(arg2); local15 != -1; local15 = arg0.indexOf(arg2, arg1.length() + local15)) {
			arg0 = arg0.substring(0, local15) + arg1 + arg0.substring(local15 + arg2.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)I")
	public static int method7248() {
		@Pc(15) int local15 = 0;
		@Pc(28) Field[] local28 = (aClass17 == null ? (aClass17 = Class6_Sub2_Sub17.a("pp")) : aClass17).getDeclaredFields();
		for (@Pc(32) int local32 = 0; local32 < local28.length; local32++) {
			@Pc(38) Field local38 = local28[local32];
			if ((aClass18 == null ? (aClass18 = Class6_Sub2_Sub17.a("qc")) : aClass18).isAssignableFrom(local38.getType())) {
				local15++;
			}
		}
		return local15 + 1;
	}
}

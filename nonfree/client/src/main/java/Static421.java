import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!oga", name = "l", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray31;

	// $FF: synthetic field
	@OriginalMember(owner = "client!oga", name = "q", descriptor = "Ljava/lang/Class;")
	private static Class aClass18;

	// $FF: synthetic field
	@OriginalMember(owner = "client!oga", name = "e", descriptor = "Ljava/lang/Class;")
	private static Class aClass19;

	@OriginalMember(owner = "client!oga", name = "g", descriptor = "Lclient!iha;")
	public static final Class168 aClass168_62 = new Class168(64);

	@OriginalMember(owner = "client!oga", name = "n", descriptor = "Z")
	public static boolean aBoolean472 = false;

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "(I)I")
	public static int method6173() {
		@Pc(7) int local7 = 0;
		@Pc(20) Field[] local20 = (aClass18 == null ? (aClass18 = Class50_Sub1.a("es")) : aClass18).getDeclaredFields();
		for (@Pc(24) int local24 = 0; local24 < local20.length; local24++) {
			@Pc(30) Field local30 = local20[local24];
			if ((aClass19 == null ? (aClass19 = Class50_Sub1.a("ria")) : aClass19).isAssignableFrom(local30.getType())) {
				local7++;
			}
		}
		return local7 + 1;
	}
}

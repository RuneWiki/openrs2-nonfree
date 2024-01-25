import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
	public static int anInt3586;

	// $FF: synthetic field
	@OriginalMember(owner = "client!hb", name = "h", descriptor = "Ljava/lang/Class;")
	private static Class aClass22;

	// $FF: synthetic field
	@OriginalMember(owner = "client!hb", name = "c", descriptor = "Ljava/lang/Class;")
	private static Class aClass23;

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_65 = new Class225(29, 5);

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "Lclient!dka;")
	public static final Class85 aClass85_23 = new Class85(8);

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_66 = new Class225(36, -2);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)I")
	public static int method3227() {
		@Pc(7) int local7 = 0;
		@Pc(20) Field[] local20 = (aClass22 == null ? (aClass22 = Class146.a("gl")) : aClass22).getDeclaredFields();
		for (@Pc(32) int local32 = 0; local32 < local20.length; local32++) {
			@Pc(38) Field local38 = local20[local32];
			if ((aClass23 == null ? (aClass23 = Class146.a("vk")) : aClass23).isAssignableFrom(local38.getType())) {
				local7++;
			}
		}
		return local7 + 1;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)[Lclient!wda;")
	public static Class396[] method3229() {
		return new Class396[] { Static630.aClass396_1, Static630.aClass396_2, Static630.aClass396_3, Static630.aClass396_4, Static630.aClass396_5, Static630.aClass396_6, Static630.aClass396_7, Static630.aClass396_8, Static630.aClass396_9, Static630.aClass396_10, Static630.aClass396_11, Static630.aClass396_12, Static630.aClass396_13 };
	}
}

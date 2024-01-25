import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "F")
	public static float aFloat109 = 0.0F;

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_230 = new Class296(72, 8);

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "Lclient!im;")
	public static final Class140 aClass140_79 = new Class140(57, 14);

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString48 = null;

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_64 = new Class306("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)Lclient!nd;")
	public static Class1_Sub1_Sub11 method4615() {
		@Pc(8) Class1_Sub1_Sub11 local8 = (Class1_Sub1_Sub11) Static366.aClass104_9.method2414();
		if (local8 != null) {
			local8.method7525();
			local8.method7528();
			return local8;
		}
		do {
			local8 = (Class1_Sub1_Sub11) Static337.aClass104_8.method2414();
			if (local8 == null) {
				return null;
			}
			if (local8.method4942() > Static60.method1119()) {
				return null;
			}
			local8.method7525();
			local8.method7528();
		} while ((Long.MIN_VALUE & local8.aLong394) == 0L);
		return local8;
	}
}

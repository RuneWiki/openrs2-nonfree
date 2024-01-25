import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "Lclient!pc;")
	public static Class276 aClass276_1;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Lclient!wm;")
	public static Class150 aClass150_1;

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
	public static int anInt469;

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray5 = new String[200];

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
	public static int anInt464 = -1;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "[Lclient!el;")
	public static final Class100[] aClass100Array1 = new Class100[16];

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
	public static void method454(@OriginalArg(0) int arg0) {
		Static626.anInt9859 = 3;
		Static604.anInt9539 = -1;
		Static344.anInt5861 = 100;
		Static119.anInt2286 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public static void method456() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static72.aBooleanArray5[local3] = true;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
	public static int anInt1338;

	@OriginalMember(owner = "client!dl", name = "u", descriptor = "[I")
	public static int[] anIntArray70;

	@OriginalMember(owner = "client!dl", name = "q", descriptor = "Lclient!of;")
	public static final Class174 aClass174_47 = new Class174("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!dl", name = "r", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_44 = new Class163(6, 4);

	@OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
	public static int anInt1339 = 0;

	@OriginalMember(owner = "client!dl", name = "v", descriptor = "Z")
	public static boolean aBoolean88 = false;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)V")
	public static void method1315(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub3_Sub4 local13 = Static281.method3883(12, arg0);
		local13.method1006();
	}
}

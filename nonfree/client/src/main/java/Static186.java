import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!h", name = "j", descriptor = "Lclient!qk;")
	public static Class266 aClass266_1;

	@OriginalMember(owner = "client!h", name = "k", descriptor = "Lclient!pj;")
	public static Class248 aClass248_28;

	@OriginalMember(owner = "client!h", name = "m", descriptor = "Lclient!xa;")
	public static Class71 aClass71_19;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_43 = new Class316(83, 3);

	@OriginalMember(owner = "client!h", name = "l", descriptor = "I")
	public static int anInt3614 = 0;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method3095() {
		Static46.aClass234_2.method5463();
		Static418.aClass256_8.method5907();
		Static444.aClass256_9.method5907();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)V")
	public static void method3097(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class6 local10 = Static474.aClass234_40.method5469(); local10 != null; local10 = Static474.aClass234_40.method5465()) {
			if ((long) arg0 == (local10.aLong245 >> 48 & 0xFFFFL)) {
				local10.method7948();
			}
		}
	}
}

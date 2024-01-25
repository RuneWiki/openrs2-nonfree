import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!pha", name = "t", descriptor = "I")
	public static int anInt7391;

	@OriginalMember(owner = "client!pha", name = "z", descriptor = "I")
	public static int anInt7396;

	@OriginalMember(owner = "client!pha", name = "E", descriptor = "Lclient!la;")
	public static Class207 aClass207_85;

	@OriginalMember(owner = "client!pha", name = "H", descriptor = "[Lclient!ov;")
	public static Class4_Sub2[] aClass4_Sub2Array3;

	@OriginalMember(owner = "client!pha", name = "P", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_81 = new Class46(36, 7);

	@OriginalMember(owner = "client!pha", name = "Q", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject19 = null;

	@OriginalMember(owner = "client!pha", name = "R", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_82 = new Class46(0, 7);

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(IIZZ)I")
	public static int method6559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(15) Class5_Sub38 local15 = Static478.method7058(arg0, arg2);
		if (local15 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < local15.anIntArray363.length; local28++) {
				if (arg1 == local15.anIntArray364[local28]) {
					local26 += local15.anIntArray363[local28];
				}
			}
			return local26;
		}
	}

	@OriginalMember(owner = "client!pha", name = "c", descriptor = "(I)V")
	public static void method6562() {
		if (Static470.aClass100_14.aBoolean192) {
			Static110.anInt2065 = 96;
			return;
		}
		try {
			@Pc(24) Method local24 = Runtime.class.getMethod("maxMemory");
			if (local24 != null) {
				try {
					@Pc(28) Runtime local28 = Runtime.getRuntime();
					@Pc(34) Long local34 = (Long) local24.invoke(local28, (Object[]) null);
					Static110.anInt2065 = (int) (local34 / 1048576L) + 1;
					return;
				} catch (@Pc(44) Throwable local44) {
					return;
				}
			}
		} catch (@Pc(46) Exception local46) {
			return;
		}
	}
}

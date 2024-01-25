import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!lca", name = "E", descriptor = "F")
	public static float aFloat148;

	@OriginalMember(owner = "client!lca", name = "G", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_106 = new Class44(130, -2);

	@OriginalMember(owner = "client!lca", name = "L", descriptor = "Lclient!oo;")
	public static final Class264 aClass264_38 = new Class264(260);

	@OriginalMember(owner = "client!lca", name = "M", descriptor = "I")
	public static int anInt6153 = 0;

	@OriginalMember(owner = "client!lca", name = "N", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_107 = new Class44(104, -2);

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(Z)V")
	public static void method5105() {
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("availableProcessors");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Integer local31 = (Integer) local21.invoke(local25, (Object[]) null);
					Static503.anInt8873 = local31;
				} catch (@Pc(36) Throwable local36) {
				}
			}
		} catch (@Pc(38) Exception local38) {
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method5106(@OriginalArg(0) String arg0) {
		return Static360.method5459(arg0);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!eea;")
	public static RuntimeException_Sub1 method5107(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString29 = local12.aString29 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!lca", name = "e", descriptor = "(B)[Lclient!ti;")
	public static Class339[] method5108() {
		return new Class339[] { Static91.aClass339_3, Static345.aClass339_9, Static634.aClass339_12 };
	}
}

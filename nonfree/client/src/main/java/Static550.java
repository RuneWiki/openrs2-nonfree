import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!vaa", name = "q", descriptor = "F")
	public static float aFloat193;

	@OriginalMember(owner = "client!vaa", name = "v", descriptor = "I")
	public static int anInt9085;

	@OriginalMember(owner = "client!vaa", name = "w", descriptor = "F")
	public static float aFloat194;

	@OriginalMember(owner = "client!vaa", name = "y", descriptor = "F")
	public static float aFloat195;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Z)V")
	public static void method7451() {
		if (Static352.aClass272_2.aBoolean512) {
			Static11.anInt321 = 96;
			return;
		}
		try {
			@Pc(19) Method local19 = Runtime.class.getMethod("maxMemory");
			if (local19 != null) {
				try {
					@Pc(23) Runtime local23 = Runtime.getRuntime();
					@Pc(29) Long local29 = (Long) local19.invoke(local23, (Object[]) null);
					Static11.anInt321 = (int) (local29 / 1048576L) + 1;
				} catch (@Pc(39) Throwable local39) {
				}
			}
		} catch (@Pc(41) Exception local41) {
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIILclient!ou;Lclient!ou;)V")
	public static void method7453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub5 arg3, @OriginalArg(4) Class4_Sub5 arg4) {
		@Pc(4) Class276 local4 = Static417.method5977(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass4_Sub5_2 = arg3;
			local4.aClass4_Sub5_3 = arg4;
		}
	}
}

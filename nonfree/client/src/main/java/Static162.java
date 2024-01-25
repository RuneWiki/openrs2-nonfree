import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "Lclient!hs;")
	public static final Class162 aClass162_3 = new Class162("", 10);

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "Z")
	public static boolean aBoolean173 = false;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!id;ZILclient!id;ZIZ)I")
	public static int method2327(@OriginalArg(0) Class169_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class169_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(16) int local16 = Static8.method107(arg5, arg4, arg0, arg3);
		if (local16 != 0) {
			return arg5 ? -local16 : local16;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(42) int local42 = Static8.method107(arg1, arg2, arg0, arg3);
			return arg1 ? -local42 : local42;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIBLjava/awt/Canvas;)Lclient!nt;")
	public static Class14_Sub32 method2328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Canvas arg2) {
		try {
			@Pc(16) Class local16 = Class.forName("oia");
			@Pc(20) Class14_Sub32 local20 = (Class14_Sub32) local16.getDeclaredConstructor().newInstance();
			local20.method9117(arg2, arg1, arg0);
			return local20;
		} catch (@Pc(29) Throwable local29) {
			@Pc(33) Class14_Sub32_Sub2 local33 = new Class14_Sub32_Sub2();
			local33.method9117(arg2, arg1, arg0);
			return local33;
		}
	}
}

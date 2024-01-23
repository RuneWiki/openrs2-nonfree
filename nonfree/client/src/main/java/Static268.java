import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
	public static int anInt5796;

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
	public static int anInt5802;

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString190 = "Prepared sound engine";

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method4508(@OriginalArg(0) Component arg0) {
		@Pc(10) Method local10 = Static93.aMethod2;
		if (local10 != null) {
			try {
				local10.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(25) Throwable local25) {
			}
		}
		arg0.addKeyListener(Static1.aClass171_1);
		arg0.addFocusListener(Static1.aClass171_1);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Lclient!ch;")
	public static Class30 method4511(@OriginalArg(0) int arg0) {
		@Pc(10) Class30 local10 = (Class30) Static15.aClass155_4.method4358((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static115.aClass83_77.method2306(Static153.method2856(arg0), Static39.method883(arg0));
		local10 = new Class30();
		local10.anInt875 = arg0;
		if (local26 != null) {
			local10.method677(new Class1_Sub16(local26));
		}
		local10.method691();
		if (local10.aBoolean48) {
			local10.anInt852 = 0;
			local10.aBoolean56 = false;
		}
		if (!Static215.aBoolean264 && local10.aBoolean62) {
			local10.aStringArray4 = null;
		}
		Static15.aClass155_4.method4360((long) arg0, local10);
		return local10;
	}
}

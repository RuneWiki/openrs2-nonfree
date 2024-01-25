import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_100 = new Class70(3, 8);

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "[J")
	public static final long[] aLongArray26 = new long[10];

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/lang/String;IB)Lclient!haa;")
	public static Class36 method7671(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class36 local13;
		try {
			local13 = (Class36) Class.forName("Class36_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			local13 = new Class36_Sub2();
		}
		local13.aString55 = arg0;
		local13.anInt5659 = arg1;
		return local13;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)V")
	public static void method7673(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		Static404.anInt7074 = 1;
		Static184.anInt3253 = -1;
		Static199.method3213(false, arg0, arg1);
	}
}

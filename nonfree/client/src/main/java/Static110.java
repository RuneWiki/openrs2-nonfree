import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
	public static int anInt1858;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14;

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_50 = new Class160(65, -1);

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	public static void method1774() {
		@Pc(12) Class317 local12 = Static216.aClass317_32;
		synchronized (Static216.aClass317_32) {
			Static216.aClass317_32.method7873();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!vu;")
	public static Class135 method1776(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(15) Class135 local15;
		try {
			local15 = (Class135) Class.forName("mm").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			local15 = new Class135_Sub1();
		}
		local15.aString82 = arg1;
		local15.anInt6756 = arg0;
		return local15;
	}
}

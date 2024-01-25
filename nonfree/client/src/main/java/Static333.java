import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
	public static void method4499() {
		for (@Pc(10) Class2_Sub52 local10 = (Class2_Sub52) Static212.aClass109_28.method2325(); local10 != null; local10 = (Class2_Sub52) Static212.aClass109_28.method2318()) {
			if (local10.anInt9842 == -1) {
				local10.anInt9839 = 0;
				if (local10.anInt9843 >= 0 && local10.anInt9838 >= 0 && Static228.anInt3704 > local10.anInt9843 && local10.anInt9838 < Static162.anInt2911) {
					Static454.method6236(local10);
				}
			} else {
				local10.method8653();
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(BILjava/lang/String;)Lclient!ip;")
	public static Class156 method4503(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class156 local8;
		try {
			local8 = (Class156) Class.forName("Class156_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class156_Sub2();
		}
		local8.aString109 = arg1;
		local8.anInt9748 = arg0;
		return local8;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZI)V")
	public static void method4504(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub2_Sub4 local8 = Static566.method7763(arg0, 7);
		local8.method669();
	}
}

import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
	public static int anInt2699;

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "I")
	public static int anInt2698 = -1;

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "J")
	public static long aLong72 = 0L;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IZLjava/awt/Component;)Lclient!wn;")
	public static Class358 method2293(@OriginalArg(2) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class358_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class358) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class358_Sub2(arg0, true);
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(BIILclient!ac;I)V")
	public static void method2294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class2_Sub27 local10 = (Class2_Sub27) Static143.aClass114_16.method2772(); local10 != null; local10 = (Class2_Sub27) Static143.aClass114_16.method2762()) {
			if (local10.anInt5418 == arg1 && local10.anInt5404 == arg3 << 9 && local10.anInt5408 == arg0 << 9 && arg2.anInt106 == local10.aClass5_1.anInt106) {
				if (local10.aClass2_Sub11_Sub4_3 != null) {
					Static622.aClass2_Sub11_Sub2_2.method2950(local10.aClass2_Sub11_Sub4_3);
					local10.aClass2_Sub11_Sub4_3 = null;
				}
				if (local10.aClass2_Sub11_Sub4_2 != null) {
					Static622.aClass2_Sub11_Sub2_2.method2950(local10.aClass2_Sub11_Sub4_2);
					local10.aClass2_Sub11_Sub4_2 = null;
				}
				local10.method8920();
				return;
			}
		}
	}
}

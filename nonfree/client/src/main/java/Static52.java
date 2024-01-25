import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "Lclient!mha;")
	public static final Class222 aClass222_7 = new Class222(1, 2, 2, 0);

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
	public static int anInt1087 = 0;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILclient!jm;)V")
	public static void method839(@OriginalArg(1) Class2_Sub2_Sub11 arg0) {
		if (Static627.aBoolean736) {
			return;
		}
		arg0.method8653();
		Static474.anInt7600--;
		if (!arg0.aBoolean301) {
			@Pc(29) long local29 = arg0.aLong123;
			@Pc(35) Class2_Sub2_Sub12 local35;
			for (local35 = (Class2_Sub2_Sub12) Static257.aClass118_25.method2595(local29); local35 != null && !local35.aString52.equals(arg0.aString43); local35 = (Class2_Sub2_Sub12) Static257.aClass118_25.method2605()) {
			}
			if (local35 != null && local35.method4160(arg0)) {
				Static347.method4642(local35);
				return;
			}
			return;
		}
		for (@Pc(66) Class2_Sub2_Sub12 local66 = (Class2_Sub2_Sub12) Static453.aClass75_10.method1573(); local66 != null; local66 = (Class2_Sub2_Sub12) Static453.aClass75_10.method1568()) {
			if (local66.aString52.equals(arg0.aString43)) {
				@Pc(76) boolean local76 = false;
				for (@Pc(82) Class2_Sub2_Sub11 local82 = (Class2_Sub2_Sub11) local66.aClass75_9.method1573(); local82 != null; local82 = (Class2_Sub2_Sub11) local66.aClass75_9.method1568()) {
					if (local82 == arg0) {
						local76 = true;
						if (local66.method4160(arg0)) {
							Static347.method4642(local66);
						}
						break;
					}
				}
				if (local76) {
					return;
				}
			}
		}
	}
}

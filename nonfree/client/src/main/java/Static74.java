import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!co", name = "K", descriptor = "Lclient!kaa;")
	public static Class184 aClass184_1;

	@OriginalMember(owner = "client!co", name = "D", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_46 = new Class81(70, 3);

	@OriginalMember(owner = "client!co", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString17 = null;

	@OriginalMember(owner = "client!co", name = "J", descriptor = "I")
	public static final int anInt1833 = 1406;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(CI)Z")
	public static boolean method1610(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static215.method3560(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static452.aCharArray7;
			for (@Pc(25) int local25 = 0; local25 < local18.length; local25++) {
				@Pc(31) char local31 = local18[local25];
				if (local31 == arg0) {
					return true;
				}
			}
			@Pc(47) char[] local47 = Static39.aCharArray1;
			for (@Pc(49) int local49 = 0; local49 < local47.length; local49++) {
				@Pc(55) char local55 = local47[local49];
				if (local55 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
	public static void method1613() {
		for (@Pc(10) Class1_Sub10 local10 = (Class1_Sub10) Static16.aClass361_15.method7854(); local10 != null; local10 = (Class1_Sub10) Static16.aClass361_15.method7853()) {
			if (local10.anInt2091 == -1) {
				local10.anInt2080 = 0;
				if (local10.anInt2090 >= 0 && local10.anInt2089 >= 0 && Static500.anInt6888 > local10.anInt2090 && local10.anInt2089 < Static573.anInt9325) {
					Static416.method5830(local10);
				}
			} else {
				local10.method7878();
			}
		}
	}
}

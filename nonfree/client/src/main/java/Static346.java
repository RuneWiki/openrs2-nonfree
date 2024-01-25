import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "()V")
	public static void method4713() {
		Static235.method3562(Static175.anInt9133);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)V")
	public static void method4714(@OriginalArg(1) boolean arg0) {
		for (@Pc(10) Class1_Sub38 local10 = (Class1_Sub38) Static356.aClass353_43.method7677(); local10 != null; local10 = (Class1_Sub38) Static356.aClass353_43.method7687()) {
			if (local10.aClass1_Sub7_Sub4_4 != null) {
				Static309.aClass1_Sub7_Sub1_2.method477(local10.aClass1_Sub7_Sub4_4);
				local10.aClass1_Sub7_Sub4_4 = null;
			}
			if (local10.aClass1_Sub7_Sub4_3 != null) {
				Static309.aClass1_Sub7_Sub1_2.method477(local10.aClass1_Sub7_Sub4_3);
				local10.aClass1_Sub7_Sub4_3 = null;
			}
			local10.method7859();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(55) Class1_Sub38 local55 = (Class1_Sub38) Static413.aClass353_56.method7677(); local55 != null; local55 = (Class1_Sub38) Static413.aClass353_56.method7687()) {
			if (local55.aClass1_Sub7_Sub4_4 != null) {
				Static309.aClass1_Sub7_Sub1_2.method477(local55.aClass1_Sub7_Sub4_4);
				local55.aClass1_Sub7_Sub4_4 = null;
			}
			local55.method7859();
		}
		for (@Pc(84) Class1_Sub38 local84 = (Class1_Sub38) Static478.aClass187_41.method3799(); local84 != null; local84 = (Class1_Sub38) Static478.aClass187_41.method3805()) {
			if (local84.aClass1_Sub7_Sub4_4 != null) {
				Static309.aClass1_Sub7_Sub1_2.method477(local84.aClass1_Sub7_Sub4_4);
				local84.aClass1_Sub7_Sub4_4 = null;
			}
			local84.method7859();
		}
	}
}

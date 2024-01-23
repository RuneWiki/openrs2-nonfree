import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ga", name = "U", descriptor = "Lclient!mj;")
	public static Class64 aClass64_6;

	@OriginalMember(owner = "client!ga", name = "X", descriptor = "Lclient!mj;")
	public static Class64 aClass64_7;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BZ)V")
	public static void method1109(@OriginalArg(1) boolean arg0) {
		for (@Pc(8) Class2_Sub14 local8 = (Class2_Sub14) Static10.aClass44_5.method1359(); local8 != null; local8 = (Class2_Sub14) Static10.aClass44_5.method1356()) {
			if (local8.aClass2_Sub21_Sub4_2 != null) {
				Static23.aClass2_Sub21_Sub3_1.method3390(local8.aClass2_Sub21_Sub4_2);
				local8.aClass2_Sub21_Sub4_2 = null;
			}
			if (local8.aClass2_Sub21_Sub4_1 != null) {
				Static23.aClass2_Sub21_Sub3_1.method3390(local8.aClass2_Sub21_Sub4_1);
				local8.aClass2_Sub21_Sub4_1 = null;
			}
			local8.method3986();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(46) Class2_Sub14 local46 = (Class2_Sub14) Static49.aClass44_11.method1359(); local46 != null; local46 = (Class2_Sub14) Static49.aClass44_11.method1356()) {
			if (local46.aClass2_Sub21_Sub4_2 != null) {
				Static23.aClass2_Sub21_Sub3_1.method3390(local46.aClass2_Sub21_Sub4_2);
				local46.aClass2_Sub21_Sub4_2 = null;
			}
			local46.method3986();
		}
		for (@Pc(72) Class2_Sub14 local72 = (Class2_Sub14) Static113.aClass103_15.method3668(); local72 != null; local72 = (Class2_Sub14) Static113.aClass103_15.method3666()) {
			if (local72.aClass2_Sub21_Sub4_2 != null) {
				Static23.aClass2_Sub21_Sub3_1.method3390(local72.aClass2_Sub21_Sub4_2);
				local72.aClass2_Sub21_Sub4_2 = null;
			}
			local72.method3986();
		}
	}
}

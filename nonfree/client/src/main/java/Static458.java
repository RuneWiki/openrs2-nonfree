import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "I")
	public static int anInt7367 = 0;

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "Z")
	public static boolean aBoolean617 = false;

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "I")
	public static final int anInt7368 = 1339;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(BZ)V")
	public static void method5947(@OriginalArg(1) boolean arg0) {
		for (@Pc(16) Class2_Sub40 local16 = (Class2_Sub40) Static249.aClass70_26.method1264(); local16 != null; local16 = (Class2_Sub40) Static249.aClass70_26.method1261()) {
			if (local16.aClass2_Sub3_Sub3_2 != null) {
				Static246.aClass2_Sub3_Sub4_2.method6705(local16.aClass2_Sub3_Sub3_2);
				local16.aClass2_Sub3_Sub3_2 = null;
			}
			if (local16.aClass2_Sub3_Sub3_3 != null) {
				Static246.aClass2_Sub3_Sub4_2.method6705(local16.aClass2_Sub3_Sub3_3);
				local16.aClass2_Sub3_Sub3_3 = null;
			}
			local16.method7657();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(55) Class2_Sub40 local55 = (Class2_Sub40) Static524.aClass70_58.method1264(); local55 != null; local55 = (Class2_Sub40) Static524.aClass70_58.method1261()) {
			if (local55.aClass2_Sub3_Sub3_2 != null) {
				Static246.aClass2_Sub3_Sub4_2.method6705(local55.aClass2_Sub3_Sub3_2);
				local55.aClass2_Sub3_Sub3_2 = null;
			}
			local55.method7657();
		}
		for (@Pc(86) Class2_Sub40 local86 = (Class2_Sub40) Static399.aClass90_23.method1676(); local86 != null; local86 = (Class2_Sub40) Static399.aClass90_23.method1680()) {
			if (local86.aClass2_Sub3_Sub3_2 != null) {
				Static246.aClass2_Sub3_Sub4_2.method6705(local86.aClass2_Sub3_Sub3_2);
				local86.aClass2_Sub3_Sub3_2 = null;
			}
			local86.method7657();
		}
	}
}

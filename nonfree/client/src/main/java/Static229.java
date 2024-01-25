import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!hs", name = "B", descriptor = "[S")
	public static short[] aShortArray72 = new short[256];

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)V")
	public static void method3485() {
		for (@Pc(6) Class14_Sub3_Sub21 local6 = (Class14_Sub3_Sub21) Static563.aClass73_11.method1826(); local6 != null; local6 = (Class14_Sub3_Sub21) Static563.aClass73_11.method1827()) {
			if (local6.anInt11129 > 1) {
				local6.anInt11129 = 0;
				Static228.aClass264_25.method6364(((Class14_Sub3_Sub11) local6.aClass73_13.aClass14_Sub3_20.aClass14_Sub3_67).aLong145, local6);
				local6.aClass73_13.method1819();
			}
		}
		Static313.anInt9044 = 0;
		Static569.anInt9810 = 0;
		Static16.aClass262_68.method6316();
		Static38.aClass187_6.method4076();
		Static563.aClass73_11.method1819();
		Static667.method9240(Static283.aClass14_Sub3_Sub11_2);
	}
}

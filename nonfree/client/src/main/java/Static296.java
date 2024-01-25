import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
	public static int anInt10578;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Lclient!qq;")
	public static Class203 aClass203_15;

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "Lclient!el;")
	public static Class109 aClass109_221 = new Class109(76, 2);

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(ZB)Z")
	public static boolean method9071(@OriginalArg(1) byte arg0) {
		@Pc(13) int local13 = arg0 & 0xFF;
		if (local13 == 0) {
			return false;
		} else {
			return local13 < 128 || local13 >= 160 || Static135.aCharArray1[local13 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZB)V")
	public static void method9089(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		for (@Pc(10) Class5_Sub22 local10 = (Class5_Sub22) Static343.aClass102_41.method1916(); local10 != null; local10 = (Class5_Sub22) Static343.aClass102_41.method1915()) {
			if (local10.aClass5_Sub16_Sub3_2 != null) {
				Static91.aClass5_Sub16_Sub1_1.method2554(local10.aClass5_Sub16_Sub3_2);
				local10.aClass5_Sub16_Sub3_2 = null;
			}
			if (local10.aClass5_Sub16_Sub3_3 != null) {
				Static91.aClass5_Sub16_Sub1_1.method2554(local10.aClass5_Sub16_Sub3_3);
				local10.aClass5_Sub16_Sub3_3 = null;
			}
			local10.method9327(1);
		}
		if (arg1 >= -34) {
			aClass109_221 = null;
		}
		if (!arg0) {
			return;
		}
		for (@Pc(66) Class5_Sub22 local66 = (Class5_Sub22) Static509.aClass102_60.method1916(); local66 != null; local66 = (Class5_Sub22) Static509.aClass102_60.method1915()) {
			if (local66.aClass5_Sub16_Sub3_2 != null) {
				Static91.aClass5_Sub16_Sub1_1.method2554(local66.aClass5_Sub16_Sub3_2);
				local66.aClass5_Sub16_Sub3_2 = null;
			}
			local66.method9327(1);
		}
		for (@Pc(97) Class5_Sub22 local97 = (Class5_Sub22) Static679.aClass291_46.method6987(); local97 != null; local97 = (Class5_Sub22) Static679.aClass291_46.method6989()) {
			if (local97.aClass5_Sub16_Sub3_2 != null) {
				Static91.aClass5_Sub16_Sub1_1.method2554(local97.aClass5_Sub16_Sub3_2);
				local97.aClass5_Sub16_Sub3_2 = null;
			}
			local97.method9327(1);
		}
	}
}

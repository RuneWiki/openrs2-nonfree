import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
	public static int anInt6059;

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "F")
	public static float aFloat175;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZ)V")
	public static void method5076(@OriginalArg(1) boolean arg0) {
		for (@Pc(14) Class3_Sub16 local14 = (Class3_Sub16) Static529.aClass71_66.method2089(); local14 != null; local14 = (Class3_Sub16) Static529.aClass71_66.method2086()) {
			if (local14.aClass3_Sub9_Sub2_2 != null) {
				Static530.aClass3_Sub9_Sub3_2.method5653(local14.aClass3_Sub9_Sub2_2);
				local14.aClass3_Sub9_Sub2_2 = null;
			}
			if (local14.aClass3_Sub9_Sub2_3 != null) {
				Static530.aClass3_Sub9_Sub3_2.method5653(local14.aClass3_Sub9_Sub2_3);
				local14.aClass3_Sub9_Sub2_3 = null;
			}
			local14.method7820();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(57) Class3_Sub16 local57 = (Class3_Sub16) Static239.aClass71_41.method2089(); local57 != null; local57 = (Class3_Sub16) Static239.aClass71_41.method2086()) {
			if (local57.aClass3_Sub9_Sub2_2 != null) {
				Static530.aClass3_Sub9_Sub3_2.method5653(local57.aClass3_Sub9_Sub2_2);
				local57.aClass3_Sub9_Sub2_2 = null;
			}
			local57.method7820();
		}
		for (@Pc(84) Class3_Sub16 local84 = (Class3_Sub16) Static25.aClass267_1.method6643(); local84 != null; local84 = (Class3_Sub16) Static25.aClass267_1.method6650()) {
			if (local84.aClass3_Sub9_Sub2_2 != null) {
				Static530.aClass3_Sub9_Sub3_2.method5653(local84.aClass3_Sub9_Sub2_2);
				local84.aClass3_Sub9_Sub2_2 = null;
			}
			local84.method7820();
		}
	}
}

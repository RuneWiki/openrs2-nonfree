import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_236 = new Class184(20, 3);

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_237 = new Class184(81, 8);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZI)V")
	public static void method5115(@OriginalArg(0) boolean arg0) {
		for (@Pc(16) Class3_Sub36 local16 = (Class3_Sub36) Static455.aClass229_37.method5328(); local16 != null; local16 = (Class3_Sub36) Static455.aClass229_37.method5325()) {
			if (local16.aClass3_Sub5_Sub3_3 != null) {
				Static251.aClass3_Sub5_Sub4_1.method5196(local16.aClass3_Sub5_Sub3_3);
				local16.aClass3_Sub5_Sub3_3 = null;
			}
			if (local16.aClass3_Sub5_Sub3_4 != null) {
				Static251.aClass3_Sub5_Sub4_1.method5196(local16.aClass3_Sub5_Sub3_4);
				local16.aClass3_Sub5_Sub3_4 = null;
			}
			local16.method5987();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class3_Sub36 local54 = (Class3_Sub36) Static437.aClass229_47.method5328(); local54 != null; local54 = (Class3_Sub36) Static437.aClass229_47.method5325()) {
			if (local54.aClass3_Sub5_Sub3_3 != null) {
				Static251.aClass3_Sub5_Sub4_1.method5196(local54.aClass3_Sub5_Sub3_3);
				local54.aClass3_Sub5_Sub3_3 = null;
			}
			local54.method5987();
		}
		for (@Pc(84) Class3_Sub36 local84 = (Class3_Sub36) Static222.aClass127_23.method3248(); local84 != null; local84 = (Class3_Sub36) Static222.aClass127_23.method3252()) {
			if (local84.aClass3_Sub5_Sub3_3 != null) {
				Static251.aClass3_Sub5_Sub4_1.method5196(local84.aClass3_Sub5_Sub3_3);
				local84.aClass3_Sub5_Sub3_3 = null;
			}
			local84.method5987();
		}
	}
}

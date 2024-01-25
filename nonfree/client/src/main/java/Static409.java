import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
	public static int anInt7004 = 0;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method5762(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(16) Class1_Sub3_Sub1 local16 = Static374.method5445(2, arg0);
		local16.method491();
		local16.aString11 = arg1;
	}
}

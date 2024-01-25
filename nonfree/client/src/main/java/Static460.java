import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "([BZ)V")
	public static void method7775(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class2_Sub15 local12 = new Class2_Sub15(arg0);
		while (true) {
			@Pc(16) int local16 = local12.method4325();
			if (local16 == 0) {
				return;
			}
			if (local16 == 2) {
				Static18.anInt503 = local12.method4294();
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method7784(@OriginalArg(1) String arg0) {
		@Pc(14) String local14 = Static369.method5497(Static3.method14(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}
}

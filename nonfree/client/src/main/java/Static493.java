import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method7051(@OriginalArg(0) String arg0) {
		if (arg0.equals("")) {
			return;
		}
		@Pc(16) Class221 local16 = Static87.method1292();
		@Pc(22) Class2_Sub33 local22 = Static592.method8154(Static113.aClass349_33, local16.aClass48_1);
		local22.aClass2_Sub20_Sub2_1.method8584(Static125.method1890(arg0));
		local22.aClass2_Sub20_Sub2_1.method8541(arg0);
		local16.method5173(local22);
	}
}

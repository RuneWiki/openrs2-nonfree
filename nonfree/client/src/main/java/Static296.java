import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!ki", name = "H", descriptor = "I")
	public static int anInt5347;

	@OriginalMember(owner = "client!ki", name = "N", descriptor = "I")
	public static int anInt5352 = 1;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!dfa;Lclient!dfa;I)V")
	public static void method4688(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2 arg1) {
		if (arg1.aClass2_299 != null) {
			arg1.method8920();
		}
		arg1.aClass2_299 = arg0.aClass2_299;
		arg1.aClass2_300 = arg0;
		arg1.aClass2_299.aClass2_300 = arg1;
		arg1.aClass2_300.aClass2_299 = arg1;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4689(@OriginalArg(1) String arg0) {
		@Pc(16) String local16 = Static4.method68(Static354.method5315(arg0));
		if (local16 == null) {
			local16 = "";
		}
		return local16;
	}
}

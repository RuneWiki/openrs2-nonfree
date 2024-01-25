import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	public static int anInt5998;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method4917(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(19) Class8_Sub31 local19 = Static51.method1418(Static615.aClass257_122, Static608.aClass336_1);
		local19.aClass8_Sub8_Sub2_1.method8562(Static643.method8631(arg0) + 1);
		local19.aClass8_Sub8_Sub2_1.method8582(arg0);
		local19.aClass8_Sub8_Sub2_1.method8562(arg1);
		Static262.method4604(local19);
	}
}

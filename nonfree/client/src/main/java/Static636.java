import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static636 {

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
	public static int anInt5234;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method4420(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class3_Sub26 local12 = Static640.method8636(Static147.aClass344_35, Static403.aClass294_3);
		local12.aClass3_Sub15_Sub1_3.method8448(Static139.method3132(arg0) + 1);
		local12.aClass3_Sub15_Sub1_3.method8441(arg1);
		local12.aClass3_Sub15_Sub1_3.method8417(arg0);
		Static472.method5189(local12);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!bv", name = "Cb", descriptor = "Z")
	public static boolean aBoolean101;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BII)V")
	public static void method920(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub42 local12 = Static591.method7910(Static9.aClass199_3, Static405.aClass303_74);
		local12.aClass3_Sub11_Sub1_1.method5167(arg0);
		local12.aClass3_Sub11_Sub1_1.method5215(arg1);
		Static511.method6885(local12);
	}
}

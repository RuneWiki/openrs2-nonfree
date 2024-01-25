import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_273 = new Class202("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString214 = null;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBI)V")
	public static void method7800(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub13_Sub15 local12 = Static370.method5893(arg0, 1);
		local12.method6968();
		local12.anInt8318 = arg1;
	}
}

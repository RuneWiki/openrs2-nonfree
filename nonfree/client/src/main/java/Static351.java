import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!rm", name = "N", descriptor = "I")
	public static int anInt5972;

	@OriginalMember(owner = "client!rm", name = "J", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_193 = new Class189(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!rm", name = "M", descriptor = "I")
	public static int anInt5971 = -1;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!un;")
	public static RuntimeException_Sub1 method4666(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString61 = local9.aString61 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}

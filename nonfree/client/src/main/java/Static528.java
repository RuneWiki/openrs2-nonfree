import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
	public static int anInt8169;

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "Lclient!th;")
	public static final Class325 aClass325_11 = new Class325();

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!np;I)Lclient!eba;")
	public static Class80 method6785(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(12) int local12 = arg0.method5186();
		return new Class80(local12);
	}
}

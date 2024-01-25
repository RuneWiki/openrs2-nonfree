import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!fca", name = "e", descriptor = "Lclient!dja;")
	public static final Class78 aClass78_4 = new Class78("", 16);

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!afa;Z)V")
	public static void method2682(@OriginalArg(0) Class9_Sub1_Sub1_Sub2_Sub1 arg0) {
		@Pc(18) Class3_Sub56 local18 = (Class3_Sub56) Static251.aClass313_20.method7104((long) arg0.anInt8783);
		if (local18 == null) {
			Static296.method4149(arg0.anIntArray644[0], arg0, 0, (Class247) null, (Class9_Sub1_Sub1_Sub2_Sub2) null, arg0.aByte139, arg0.anIntArray643[0]);
		} else {
			local18.method9129();
		}
	}
}

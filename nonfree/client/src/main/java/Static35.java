import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "I")
	public static int anInt492;

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "Lclient!pa;")
	public static final Class265 aClass265_2 = new Class265(8);

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lclient!rv;B)Lclient!de;")
	public static Class76_Sub1 method464(@OriginalArg(0) Class5_Sub15 arg0) {
		@Pc(15) Class76 local15 = Static170.method2524(arg0);
		@Pc(19) int local19 = arg0.method3641();
		return new Class76_Sub1(local15.anInt1746, local15.aClass112_4, local15.aClass4_4, local15.anInt1747, local15.anInt1745, local19);
	}
}

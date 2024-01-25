import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
	public static int anInt5632;

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_113 = new Class56(63, 6);

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "Lclient!ib;")
	public static final Class140 aClass140_15 = new Class140(4, 1);

	@OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
	public static int anInt5633 = 0;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;Lclient!np;I)I")
	public static int method4789(@OriginalArg(0) String arg0, @OriginalArg(1) Class3_Sub11 arg1) {
		@Pc(6) int local6 = arg1.anInt6128;
		@Pc(15) byte[] local15 = Static588.method6109(arg0);
		arg1.method5194(local15.length);
		arg1.anInt6128 += Static69.aClass75_1.method1891(0, arg1.anInt6128, arg1.aByteArray62, local15, local15.length);
		return arg1.anInt6128 - local6;
	}
}

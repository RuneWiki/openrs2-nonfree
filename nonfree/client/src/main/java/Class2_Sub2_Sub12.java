import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public abstract class Class2_Sub2_Sub12 extends Class2_Sub2 {

	@OriginalMember(owner = "client!jd", name = "P", descriptor = "Lclient!o;")
	public static Class40 aClass40_654 = Static12.method257(":duelreq:");

	@OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
	public static final int anInt2253 = 2301979;

	@OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
	public static int anInt2254 = 0;

	@OriginalMember(owner = "client!jd", name = "Z", descriptor = "Lclient!o;")
	public static Class40 aClass40_655 = Static12.method257("(X100(U(Y");

	@OriginalMember(owner = "client!jd", name = "eb", descriptor = "I")
	public int anInt2265 = 1000;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)Lclient!ne;", line = 126)
	protected Class2_Sub2_Sub12_Sub4 method1533() {
		return null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIIII)V", line = 258)
	public void method1536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class2_Sub2_Sub12_Sub4 local7 = this.method1533();
		if (local7 != null) {
			this.anInt2265 = local7.anInt2265;
			local7.method1536(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}
}

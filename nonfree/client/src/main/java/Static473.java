import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
	public static int anInt7504;

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "Lclient!d;")
	public static Interface9 anInterface9_11;

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "Lclient!si;")
	public static final Class331 aClass331_5 = new Class331();

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "Lclient!ifa;")
	public static final Class163 aClass163_57 = new Class163();

	@OriginalMember(owner = "client!ps", name = "i", descriptor = "Lclient!kja;")
	public static final Class194 aClass194_10 = new Class194();

	@OriginalMember(owner = "client!ps", name = "j", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_120 = new Class216(48, 4);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!es;I)Lclient!oc;")
	public static Class71_Sub4 method6523(@OriginalArg(0) Class4_Sub11 arg0) {
		return new Class71_Sub4(arg0.method8834(), arg0.method8834(), arg0.method8834(), arg0.method8834(), arg0.method8834(), arg0.method8834(), arg0.method8834(), arg0.method8834(), arg0.method8827(), arg0.method8865());
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIZ)Lclient!wl;")
	public static Class4_Sub54 method6525(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) long local12 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class4_Sub54) Static31.aClass66_43.method1994(local12);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
	public static int anInt10660;

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
	public static int anInt10662;

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "Lclient!nd;")
	public static final Class218 aClass218_1 = new Class218(14, 0);

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "Lclient!nd;")
	public static final Class218 aClass218_2 = new Class218(15, 4);

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "Lclient!nd;")
	public static final Class218 aClass218_3 = new Class218(16, -2);

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "Lclient!nd;")
	public static final Class218 aClass218_4 = new Class218(17, 0);

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "Lclient!nd;")
	public static final Class218 aClass218_5 = new Class218(18, -2);

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "Lclient!nd;")
	public static final Class218 aClass218_6 = new Class218(19, -2);

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "Lclient!nd;")
	public static final Class218 aClass218_7 = new Class218(22, -2);

	@OriginalMember(owner = "client!wn", name = "o", descriptor = "Lclient!nd;")
	public static final Class218 aClass218_8 = new Class218(23, 4);

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "Lclient!nd;")
	public static final Class218 aClass218_9 = new Class218(24, -1);

	@OriginalMember(owner = "client!wn", name = "q", descriptor = "Lclient!nd;")
	public static final Class218 aClass218_10 = new Class218(26, 0);

	@OriginalMember(owner = "client!wn", name = "r", descriptor = "Lclient!nd;")
	public static final Class218 aClass218_11 = new Class218(27, 0);

	@OriginalMember(owner = "client!wn", name = "s", descriptor = "Lclient!nd;")
	public static final Class218 aClass218_12 = new Class218(28, -2);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ek;")
	public static RuntimeException_Sub1 method8962(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString27 = local12.aString27 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}
}

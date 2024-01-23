import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "Lclient!qf;")
	public static Class146 aClass146_2;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "Lclient!th;")
	public static Class169 aClass169_34 = new Class169(100);

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBLclient!ph;)Lclient!in;")
	public static Class1_Sub1_Sub3 method826(@OriginalArg(0) int arg0, @OriginalArg(2) Class138 arg1) {
		return Static109.method1792(arg0, arg1) ? Static175.method2926() : null;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)Lclient!ge;")
	public static Class61 method829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass61_1;
	}
}

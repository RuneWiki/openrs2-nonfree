import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ew", name = "k", descriptor = "Lclient!qw;")
	public static Class286 aClass286_1;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "Lclient!qca;")
	public static final Class271 aClass271_3 = new Class271(14, 0, 4, 1);

	@OriginalMember(owner = "client!ew", name = "h", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_33 = new Class269(72, 3);

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!qm;")
	public static RuntimeException_Sub1 method2621(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString73 = local12.aString73 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}
}

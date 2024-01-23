import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "[S")
	public static short[] aShortArray44;

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
	public static int anInt2877;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "S")
	public static short aShort17 = 205;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ie;")
	public static RuntimeException_Sub1 method2209(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub1 local8;
		if (arg0 instanceof RuntimeException_Sub1) {
			local8 = (RuntimeException_Sub1) arg0;
			local8.aString176 = local8.aString176 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local8;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
	public static int anInt4084;

	@OriginalMember(owner = "client!lj", name = "M", descriptor = "Ljava/lang/Object;")
	public static Object anObject7;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IJ)V")
	public static void method3441(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % (long) 10 == 0L) {
			Static390.method5230(arg0 - 1L);
			Static390.method5230(1L);
		} else {
			Static390.method5230(arg0);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!gn;")
	public static RuntimeException_Sub1 method3443(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString19 = local12.aString19 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}
}

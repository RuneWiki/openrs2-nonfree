import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static686 {

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString116;

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "[J")
	public static final long[] aLongArray22 = new long[100];

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!vm;")
	public static RuntimeException_Sub1 method9236(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString117 = local9.aString117 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)V")
	public static void method9237(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class2_Sub6_Sub12 local16 = Static636.method8647(5, (long) arg0);
		local16.method6239();
		local16.anInt6936 = arg1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "[Lclient!na;")
	public static Class64[] aClass64Array2;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_142 = new Class184(31, 6);

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
	public static int anInt4113 = 0;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
	public static int anInt4114 = 0;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "Lclient!rc;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILclient!mu;)V")
	public static void method3371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub2 arg3) {
		@Pc(4) Class217 local4 = Static344.method4926(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass1_Sub2_1 = arg3;
		}
	}
}

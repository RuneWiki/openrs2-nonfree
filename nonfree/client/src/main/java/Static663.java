import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static663 {

	@OriginalMember(owner = "client!wia", name = "h", descriptor = "[I")
	public static int[] anIntArray818;

	@OriginalMember(owner = "client!wia", name = "J", descriptor = "I")
	public static int anInt11064;

	@OriginalMember(owner = "client!wia", name = "i", descriptor = "Lclient!ok;")
	public static Class262 aClass262_75 = new Class262();

	@OriginalMember(owner = "client!wia", name = "T", descriptor = "[I")
	public static final int[] anIntArray819 = new int[1];

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILclient!ha;I)Lclient!jd;")
	public static Class20 method9202(@OriginalArg(0) int arg0, @OriginalArg(1) Class137 arg1) {
		@Pc(10) Class14_Sub15 local10 = (Class14_Sub15) Static205.aClass187_31.method4078((long) arg0);
		if (local10 != null) {
			@Pc(22) Class14_Sub27_Sub1 local22 = local10.aClass63_Sub1_1.method1525();
			local10.aBoolean179 = true;
			if (local22 != null) {
				return local22.method3731(arg1);
			}
		}
		return null;
	}
}

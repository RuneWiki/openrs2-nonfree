import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!no", name = "b", descriptor = "F")
	public static float aFloat42;

	@OriginalMember(owner = "client!no", name = "f", descriptor = "I")
	public static int anInt4224;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "Lclient!jl;")
	public static Class89 aClass89_28 = new Class89(64);

	@OriginalMember(owner = "client!no", name = "d", descriptor = "I")
	public static int anInt4222 = -1;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BLclient!wf;)Lclient!wf;")
	public static Class191 method3100(@OriginalArg(1) Class191 arg0) {
		if (arg0.anInt6093 != -1) {
			return Static171.method2789(arg0.anInt6093);
		}
		@Pc(26) int local26 = arg0.anInt6134 >>> 16;
		@Pc(31) Class166 local31 = new Class166(Static48.aClass186_5);
		for (@Pc(36) Class1_Sub12 local36 = (Class1_Sub12) local31.method4021(); local36 != null; local36 = (Class1_Sub12) local31.method4024()) {
			if (local26 == local36.anInt2208) {
				return Static171.method2789((int) local36.aLong247);
			}
		}
		return null;
	}
}

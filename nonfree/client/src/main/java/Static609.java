import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!um", name = "b", descriptor = "Lclient!la;")
	public static Class208 aClass208_137;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "I")
	public static int anInt10104;

	@OriginalMember(owner = "client!um", name = "e", descriptor = "I")
	public static int anInt10105;

	@OriginalMember(owner = "client!um", name = "d", descriptor = "I")
	public static int anInt10106;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "I")
	public static int anInt10107 = 0;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I[S)[S")
	public static short[] method8689(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(20) short[] local20 = new short[arg0.length];
			Static682.method795(arg0, 0, local20, 0, arg0.length);
			return local20;
		}
	}
}

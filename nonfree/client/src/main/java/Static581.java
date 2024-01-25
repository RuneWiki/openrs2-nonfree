import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static581 {

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "Lclient!pga;")
	public static Class32 aClass32_30;

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_142 = new Class268(73, -1);

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "[F")
	public static final float[] aFloatArray69 = new float[2];

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!vd;I)V")
	public static void method6716(@OriginalArg(0) Class353 arg0) {
		Static77.aClass353_14 = arg0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBI)Z")
	public static boolean method6717(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}

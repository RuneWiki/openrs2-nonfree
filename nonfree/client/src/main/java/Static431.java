import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
	public static int anInt8105;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "[F")
	public static final float[] aFloatArray57 = new float[16];

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!un;Z)Lclient!vo;")
	public static Class344 method6745(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(12) int local12 = arg0.method4931();
		return new Class344(local12);
	}
}

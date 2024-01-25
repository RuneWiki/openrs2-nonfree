import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "Lclient!hh;")
	public static Class108 aClass108_9;

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "[I")
	public static final int[] anIntArray626 = new int[1000];

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
	public static int anInt7104 = 0;

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "[F")
	public static final float[] aFloatArray25 = new float[4];

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!bp;)V")
	public static void method5483(@OriginalArg(1) Class6_Sub2_Sub1_Sub1 arg0) {
		@Pc(11) Class4_Sub44 local11 = (Class4_Sub44) Static279.aClass196_25.method4477((long) arg0.anInt6078);
		if (local11 == null) {
			return;
		}
		if (local11.aClass4_Sub18_Sub2_3 != null) {
			Static393.aClass4_Sub18_Sub1_1.method2789(local11.aClass4_Sub18_Sub2_3);
			local11.aClass4_Sub18_Sub2_3 = null;
		}
		local11.method5854();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!eba", name = "u", descriptor = "Lclient!lga;")
	public static Class223 aClass223_26;

	@OriginalMember(owner = "client!eba", name = "v", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_40 = new Class322(54, 8);

	@OriginalMember(owner = "client!eba", name = "x", descriptor = "[F")
	public static final float[] aFloatArray26 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!eba", name = "g", descriptor = "(I)V")
	public static void method2195() {
		Static289.aClass49_24 = null;
		Static494.anInt4033 = -1;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(II)V")
	public static void method2196(@OriginalArg(1) int arg0) {
		@Pc(9) Class6_Sub2_Sub4 local9 = Static602.method8315((long) arg0, 3);
		local9.method2038();
	}
}

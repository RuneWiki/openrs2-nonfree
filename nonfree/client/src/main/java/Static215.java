import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!kr", name = "C", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_42 = new Class215(52, -1);

	@OriginalMember(owner = "client!kr", name = "F", descriptor = "[[F")
	public static final float[][] aFloatArrayArray5 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!kr", name = "G", descriptor = "I")
	public static int anInt3980 = 0;

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V")
	public static void method3238() {
		@Pc(10) int local10 = Static323.aClass50_Sub1_1.method2858(Static177.anInt2973);
		if (local10 == 0) {
			Static12.aByteArrayArrayArray1 = null;
			Static185.method2924(0);
		} else if (local10 == 1) {
			Static180.method2860((byte) 0);
			Static185.method2924(512);
			if (Static79.aByteArrayArrayArray2 != null) {
				Static385.method5084();
			}
		} else {
			Static180.method2860((byte) (Static361.anInt6264 - 4 & 0xFF));
			Static185.method2924(2);
		}
		Static333.anInt5744 = Static263.anInt4963;
	}
}

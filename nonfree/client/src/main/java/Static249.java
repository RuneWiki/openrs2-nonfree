import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
	public static int anInt4280;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "Lclient!ci;")
	public static Class39 aClass39_2;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
	public static int anInt4281;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "[B")
	public static final byte[] aByteArray54 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
	public static int anInt4279 = -1;

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "[F")
	public static final float[] aFloatArray7 = new float[4];

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZII)V")
	public static void method3443(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (arg0 != Static398.anInt6955) {
			Static427.anIntArray587 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static427.anIntArray587[local13] = (local13 << 12) / arg0;
			}
			Static271.anInt4923 = arg0 * 32;
			Static398.anInt6955 = arg0;
			Static210.anInt3600 = arg0 - 1;
		}
		if (Static271.anInt4925 == arg1) {
			return;
		}
		if (Static398.anInt6955 == arg1) {
			Static168.anIntArray524 = Static427.anIntArray587;
		} else {
			Static168.anIntArray524 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static168.anIntArray524[local13] = (local13 << 12) / arg1;
			}
		}
		Static71.anInt1203 = arg1 - 1;
		Static271.anInt4925 = arg1;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)Lclient!ff;")
	public static Class28_Sub3 method3444() {
		@Pc(13) Class28_Sub3 local13 = (Class28_Sub3) Static317.aClass97_5.method2149();
		if (local13 == null) {
			return new Class28_Sub3();
		} else {
			Static382.anInt6616--;
			return local13;
		}
	}
}

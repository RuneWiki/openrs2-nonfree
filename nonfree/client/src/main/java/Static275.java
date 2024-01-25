import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_26 = new Class10(128, 4);

	@OriginalMember(owner = "client!kga", name = "d", descriptor = "[[F")
	public static final float[][] aFloatArrayArray6 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!kga", name = "e", descriptor = "Z")
	public static boolean aBoolean396 = false;

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIII)I")
	public static int method4410(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg2;
		}
	}
}

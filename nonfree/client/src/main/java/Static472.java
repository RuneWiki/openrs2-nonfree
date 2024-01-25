import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!rw", name = "t", descriptor = "Lclient!ff;")
	public static Class104 aClass104_4;

	@OriginalMember(owner = "client!rw", name = "y", descriptor = "I")
	public static int anInt7955;

	@OriginalMember(owner = "client!rw", name = "r", descriptor = "Lclient!cba;")
	public static final Class46 aClass46_9 = new Class46();

	@OriginalMember(owner = "client!rw", name = "A", descriptor = "[F")
	public static final float[] aFloatArray50 = new float[4];

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IZZI)I")
	public static int method6575(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class4_Sub20 local8 = Static17.method367(arg2, arg1);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && local8.anIntArray309.length > arg0) {
			return local8.anIntArray309[arg0];
		} else {
			return -1;
		}
	}
}

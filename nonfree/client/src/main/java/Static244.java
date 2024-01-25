import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "Lclient!f;")
	public static Class10 aClass10_16;

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "[I")
	public static final int[] anIntArray281 = new int[2048];

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "[F")
	public static final float[] aFloatArray38 = new float[4];

	@OriginalMember(owner = "client!jfa", name = "n", descriptor = "[I")
	public static final int[] anIntArray282 = new int[3];

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)I")
	public static int method3976(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static62.anInt1534 - 1; local3++) {
			if (arg0 < Static364.anIntArray427[local3] + Static208.anIntArray595[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static62.anInt1534 - 1;
		}
		return local1;
	}
}

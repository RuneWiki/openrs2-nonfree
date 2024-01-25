import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Ljava/lang/Object;")
	public static Object anObject6;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Lclient!ul;")
	public static Class246 aClass246_115;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_119 = new Class107(88, -1);

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "[[F")
	public static final float[][] aFloatArrayArray2 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Lclient!qu;")
	public static final Class204 aClass204_12 = new Class204(9, 0, 4, 1);

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_92 = new Class7("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)Lclient!ie;")
	public static Class112 method3076(@OriginalArg(1) int arg0) {
		@Pc(13) Class112[] local13 = Static247.method5817();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class112 local21 = local13[local15];
			if (arg0 == local21.anInt3044) {
				return local21;
			}
		}
		return null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!t", name = "w", descriptor = "Lclient!rr;")
	public static Class211 aClass211_1;

	@OriginalMember(owner = "client!t", name = "L", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_81 = new Class11(27, -1);

	@OriginalMember(owner = "client!t", name = "M", descriptor = "[I")
	public static final int[] anIntArray1120 = new int[100];

	@OriginalMember(owner = "client!t", name = "U", descriptor = "I")
	public static int anInt5498 = 0;

	@OriginalMember(owner = "client!t", name = "db", descriptor = "I")
	public static int anInt5506 = 0;

	@OriginalMember(owner = "client!t", name = "eb", descriptor = "I")
	public static int anInt5507 = 0;

	@OriginalMember(owner = "client!t", name = "fb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray141 = new String[100];

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IZII)I")
	public static int method4771(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub1 local8 = Static72.method4067(arg0, arg1);
		if (local8 == null) {
			return 0;
		} else if (arg2 >= 0 && local8.anIntArray15.length > arg2) {
			return local8.anIntArray15[arg2];
		} else {
			return 0;
		}
	}
}

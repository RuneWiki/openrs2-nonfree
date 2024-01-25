import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static435 {

	@OriginalMember(owner = "client!on", name = "a", descriptor = "Lclient!rw;")
	public static Class148 aClass148_1;

	@OriginalMember(owner = "client!on", name = "c", descriptor = "Lclient!on;")
	public static final Class274 aClass274_17 = new Class274(4);

	@OriginalMember(owner = "client!on", name = "k", descriptor = "Lclient!on;")
	public static final Class274 aClass274_13 = new Class274(1);

	@OriginalMember(owner = "client!on", name = "i", descriptor = "Lclient!on;")
	public static final Class274 aClass274_10 = new Class274(1);

	@OriginalMember(owner = "client!on", name = "j", descriptor = "Lclient!on;")
	public static final Class274 aClass274_11 = new Class274(2);

	@OriginalMember(owner = "client!on", name = "h", descriptor = "Lclient!on;")
	public static final Class274 aClass274_12 = new Class274(4);

	@OriginalMember(owner = "client!on", name = "l", descriptor = "Lclient!on;")
	public static final Class274 aClass274_14 = new Class274(2);

	@OriginalMember(owner = "client!on", name = "d", descriptor = "Lclient!on;")
	public static final Class274 aClass274_15 = new Class274(4);

	@OriginalMember(owner = "client!on", name = "b", descriptor = "Lclient!on;")
	public static final Class274 aClass274_16 = new Class274(2);

	@OriginalMember(owner = "client!on", name = "g", descriptor = "Lclient!ofa;")
	public static final Class267 aClass267_4 = new Class267(1);

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)I")
	public static int method6607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static473.aShortArrayArray11 == null ? 0 : Static473.aShortArrayArray11[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III)Z")
	public static boolean method6609(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}

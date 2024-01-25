import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
	public static int anInt1029;

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "Lclient!ls;")
	public static Class150 aClass150_1;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_36 = new Class102(46, -1);

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
	public static void method816(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static309.aClass270ArrayArrayArray3 = Static65.aClass270ArrayArrayArray1;
			Static345.aClass162Array3 = Static109.aClass162Array1;
		} else {
			Static309.aClass270ArrayArrayArray3 = Static192.aClass270ArrayArrayArray2;
			Static345.aClass162Array3 = Static314.aClass162Array2;
		}
		Static289.anInt4757 = Static309.aClass270ArrayArrayArray3.length;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZ)Lclient!ea;")
	public static Class60 method818(@OriginalArg(0) int arg0) {
		@Pc(8) Class60[] local8 = Static206.method2748();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class60 local16 = local8[local10];
			if (local16.anInt1721 == arg0) {
				return local16;
			}
		}
		return null;
	}
}

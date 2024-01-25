import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "B")
	public static byte aByte100;

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_78 = new Class187(58, 6);

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "J")
	public static long aLong263 = 0L;

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "[I")
	public static final int[] anIntArray467 = new int[8];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)I")
	public static int method7252(@OriginalArg(1) boolean arg0) {
		@Pc(9) int local9 = Static634.anInt10113;
		if (local9 == 0) {
			return arg0 ? 0 : Static437.anInt7720;
		} else if (local9 == 1) {
			return Static437.anInt7720;
		} else if (local9 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)Lclient!dda;")
	public static Class75 method7253(@OriginalArg(1) int arg0) {
		@Pc(10) Class75 local10 = (Class75) Static180.aClass265_10.method6577((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static639.aClass50_177.method916(arg0, 0);
		local10 = new Class75();
		if (local27 != null) {
			local10.method1626(arg0, new Class5_Sub15(local27));
		}
		Static180.aClass265_10.method6566(local10, (long) arg0);
		return local10;
	}
}

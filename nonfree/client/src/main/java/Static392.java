import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "Lclient!waa;")
	public static Class373 aClass373_6;

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
	public static int anInt6753 = 100;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIB)I")
	public static int method5799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static511.aClass91Array3 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg1 >> 9;
		@Pc(20) int local20 = arg2 >> 9;
		if (local11 < 0 || local20 < 0 || local11 > Static456.anInt7428 - 1 || local20 > Static5.anInt112 - 1) {
			return 0;
		}
		@Pc(48) int local48 = arg0;
		if (arg0 < 3 && (Static372.aByteArrayArrayArray3[1][local11][local20] & 0x2) != 0) {
			local48 = arg0 + 1;
		}
		return Static511.aClass91Array3[local48].method7446(arg1, arg2);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)Z")
	public static boolean method5800() {
		@Pc(10) Class2_Sub3 local10 = (Class2_Sub3) Static116.aClass114_12.method2772();
		if (local10 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < local10.anInt141; local16++) {
			if (local10.aClass319Array1[local16] != null && local10.aClass319Array1[local16].anInt8562 == 0) {
				return false;
			}
			if (local10.aClass319Array2[local16] != null && local10.aClass319Array2[local16].anInt8562 == 0) {
				return false;
			}
		}
		return true;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!oc", name = "y", descriptor = "Lclient!be;")
	public static final Class31 aClass31_7 = new Class31();

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZIZII)I")
	public static int method6094(@OriginalArg(2) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(8) Class5_Sub48 local8 = Static386.method5663(false, arg2);
		if (local8 == null) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < local8.anIntArray497.length; local16++) {
			if (local8.anIntArray497[local16] >= 0 && Static259.aClass135_1.anInt3162 > local8.anIntArray497[local16]) {
				@Pc(41) Class219 local41 = Static259.aClass135_1.method2776(local8.anIntArray497[local16]);
				@Pc(53) int local53 = local41.method5168(Static522.aClass282_2.method6901(arg1).anInt1028, arg1);
				if (arg0) {
					local14 += local8.anIntArray495[local16] * local53;
				} else {
					local14 += local53;
				}
			}
		}
		return local14;
	}
}

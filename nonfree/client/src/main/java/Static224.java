import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!jca", name = "g", descriptor = "[Lclient!kba;")
	public static Class169[] aClass169Array5;

	@OriginalMember(owner = "client!jca", name = "j", descriptor = "I")
	public static int anInt8484;

	@OriginalMember(owner = "client!jca", name = "o", descriptor = "Lclient!an;")
	public static Class16 aClass16_108;

	@OriginalMember(owner = "client!jca", name = "v", descriptor = "[I")
	public static int[] anIntArray633 = new int[2];

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZZIII)I")
	public static int method6972(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(15) Class12_Sub23 local15 = Static292.method4742(arg1, false);
		if (local15 == null) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local15.anIntArray333.length; local23++) {
			if (local15.anIntArray333[local23] >= 0 && local15.anIntArray333[local23] < Static150.aClass254_2.anInt7610) {
				@Pc(48) Class56 local48 = Static150.aClass254_2.method6340(local15.anIntArray333[local23]);
				@Pc(58) int local58 = local48.method1569(arg2, Static453.aClass258_2.method6426(arg2).anInt6063);
				if (arg0) {
					local21 += local58 * local15.anIntArray334[local23];
				} else {
					local21 += local58;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(II)Z")
	public static boolean method6975(@OriginalArg(0) int arg0) {
		return arg0 == 9 || arg0 == 10 || arg0 == 11;
	}
}

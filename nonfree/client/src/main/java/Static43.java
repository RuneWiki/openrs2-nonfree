import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "Lclient!lf;")
	public static Class204 aClass204_1;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
	public static int anInt868 = -2;

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "Lclient!en;")
	public static final Class84 aClass84_1 = new Class84("", 10);

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "[I")
	public static final int[] anIntArray44 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IBZZI)I")
	public static int method752(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(15) Class1_Sub45 local15 = Static365.method5366(arg0, false);
		if (local15 == null) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local15.anIntArray521.length; local23++) {
			if (local15.anIntArray521[local23] >= 0 && Static230.aClass225_1.anInt6004 > local15.anIntArray521[local23]) {
				@Pc(48) Class222 local48 = Static230.aClass225_1.method4857(local15.anIntArray521[local23]);
				@Pc(58) int local58 = local48.method4794(Static256.aClass263_1.method5592(arg2).anInt2658, arg2);
				if (arg1) {
					local21 += local58 * local15.anIntArray520[local23];
				} else {
					local21 += local58;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;IZZ)Z")
	public static boolean method753(@OriginalArg(0) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) char local41 = arg0.charAt(local35);
			if (local35 == 0) {
				if (local41 == '-') {
					local26 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(71) int local71;
			if (local41 >= '0' && local41 <= '9') {
				local71 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local71 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local71 = local41 - 'W';
			} else {
				return false;
			}
			if (local71 >= 10) {
				return false;
			}
			if (local26) {
				local71 = -local71;
			}
			@Pc(109) int local109 = local71 + local30 * 10;
			if (local109 / 10 != local30) {
				return false;
			}
			local30 = local109;
			local28 = true;
		}
		return local28;
	}
}

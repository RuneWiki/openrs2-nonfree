import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
	public static int anInt3299;

	@OriginalMember(owner = "client!jq", name = "v", descriptor = "Lclient!rk;")
	public static Class180 aClass180_44;

	@OriginalMember(owner = "client!jq", name = "y", descriptor = "I")
	public static int anInt3301;

	@OriginalMember(owner = "client!jq", name = "w", descriptor = "Lclient!re;")
	public static final Class177 aClass177_1 = new Class177();

	@OriginalMember(owner = "client!jq", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString217 = "flash1:";

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZZ)Z")
	public static boolean method3027(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!sb;I)V")
	public static void method3029(@OriginalArg(0) Class22_Sub2_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt5138 == Static212.anInt4234 || arg0.anInt5133 == -1 || arg0.anInt5093 != 0) {
			local5 = true;
		} else {
			@Pc(29) Class170 local29 = Static261.method4379(arg0.anInt5133);
			if (local29.aBoolean364 || local29.anIntArray650[arg0.anInt5117] < arg0.anInt5137 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(61) int local61 = arg0.anInt5138 - arg0.anInt5099;
			@Pc(67) int local67 = Static212.anInt4234 - arg0.anInt5099;
			@Pc(81) int local81 = arg0.anInt5119 * 128 + arg0.method4421() * 64;
			@Pc(93) int local93 = arg0.anInt5080 * 128 + arg0.method4421() * 64;
			@Pc(104) int local104 = arg0.anInt5082 * 128 + arg0.method4421() * 64;
			@Pc(115) int local115 = arg0.anInt5122 * 128 + arg0.method4421() * 64;
			arg0.anInt5973 = (local67 * local104 + (local61 - local67) * local81) / local61;
			arg0.anInt5967 = (local67 * local115 + local93 * (local61 - local67)) / local61;
		}
		arg0.anInt5146 = 0;
		if (arg0.anInt5113 == 0) {
			arg0.method4411(8192);
		}
		if (arg0.anInt5113 == 1) {
			arg0.method4411(12288);
		}
		if (arg0.anInt5113 == 2) {
			arg0.method4411(0);
		}
		if (arg0.anInt5113 == 3) {
			arg0.method4411(4096);
		}
	}
}

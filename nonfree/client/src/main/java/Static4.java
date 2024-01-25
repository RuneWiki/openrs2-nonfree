import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!aba", name = "o", descriptor = "Z")
	public static boolean aBoolean141;

	@OriginalMember(owner = "client!aba", name = "p", descriptor = "I")
	public static int anInt1828;

	@OriginalMember(owner = "client!aba", name = "F", descriptor = "F")
	public static float aFloat51;

	@OriginalMember(owner = "client!aba", name = "M", descriptor = "Z")
	private static boolean aBoolean144;

	@OriginalMember(owner = "client!aba", name = "N", descriptor = "I")
	private static int anInt1848;

	@OriginalMember(owner = "client!aba", name = "O", descriptor = "I")
	private static int anInt1849;

	@OriginalMember(owner = "client!aba", name = "P", descriptor = "Z")
	private static boolean aBoolean145;

	@OriginalMember(owner = "client!aba", name = "Q", descriptor = "I")
	private static int anInt1850;

	@OriginalMember(owner = "client!aba", name = "R", descriptor = "Z")
	private static boolean aBoolean146;

	@OriginalMember(owner = "client!aba", name = "S", descriptor = "Z")
	private static boolean aBoolean147;

	@OriginalMember(owner = "client!aba", name = "T", descriptor = "Z")
	private static boolean aBoolean148;

	@OriginalMember(owner = "client!aba", name = "U", descriptor = "I")
	private static int anInt1851;

	@OriginalMember(owner = "client!aba", name = "V", descriptor = "I")
	private static int anInt1852;

	@OriginalMember(owner = "client!aba", name = "W", descriptor = "I")
	private static int anInt1853;

	@OriginalMember(owner = "client!aba", name = "X", descriptor = "I")
	private static int anInt1854;

	@OriginalMember(owner = "client!aba", name = "Y", descriptor = "I")
	private static int anInt1855;

	@OriginalMember(owner = "client!aba", name = "Z", descriptor = "Z")
	private static boolean aBoolean149;

	@OriginalMember(owner = "client!aba", name = "u", descriptor = "I")
	public static final int anInt1832 = 1401;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lclient!ha;III[Z)Z")
	public static boolean method1519(@OriginalArg(0) Class4_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static255.aClass115Array2 != Static140.aClass115Array1) {
			@Pc(12) int local12 = Static432.aClass115Array3[arg1].method8064(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class115 local19 = Static432.aClass115Array3[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method8064(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method8062(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.E(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}

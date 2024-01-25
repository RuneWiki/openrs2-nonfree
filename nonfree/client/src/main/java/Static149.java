import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
	public static int anInt3924;

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
	public static int anInt3927;

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "Lclient!tj;")
	public static Class193 aClass193_69;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
	public static int anInt3929;

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "[I")
	public static final int[] anIntArray333 = new int[5];

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
	public static void method3564() {
		Static278.aClass198_246.method5213();
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
	public static void method3565() {
		@Pc(7) Class84 local7 = null;
		try {
			@Pc(16) Class185 local16 = Static1.aClass134_7.method3759();
			while (local16.anInt5682 == 0) {
				Static249.method4396(1L);
			}
			if (local16.anInt5682 == 1) {
				local7 = (Class84) local16.anObject4;
				@Pc(46) Class4_Sub11 local46 = new Class4_Sub11(Static140.anInt3222 * 6 + 3);
				local46.method3434(1);
				local46.method3402(Static140.anInt3222);
				for (@Pc(56) int local56 = 0; local56 < Static118.anIntArray244.length; local56++) {
					if (Static169.aBooleanArray18[local56]) {
						local46.method3402(local56);
						local46.method3452(Static118.anIntArray244[local56]);
					}
				}
				local7.method2417(local46.aByteArray55, 0, local46.anInt3768);
			}
		} catch (@Pc(91) Exception local91) {
		}
		try {
			if (local7 != null) {
				local7.method2413();
			}
		} catch (@Pc(98) Exception local98) {
		}
		Static150.aLong96 = Static208.method3879();
		Static133.aBoolean245 = false;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
	public static void method3567() {
		Static22.aClass198_18.method5209();
		Static242.aClass198_223.method5209();
		Static263.aClass198_252.method5209();
		Static10.aClass198_10.method5209();
		Static224.aClass198_164.method5209();
	}
}

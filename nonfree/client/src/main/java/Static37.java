import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!cb", name = "V", descriptor = "I")
	public static int anInt825;

	@OriginalMember(owner = "client!cb", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString26 = "Stellar Dawn is loading - please wait...";

	@OriginalMember(owner = "client!cb", name = "U", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_11 = new Class154(200);

	@OriginalMember(owner = "client!cb", name = "W", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)V")
	public static void method716() {
		Static294.anInt3994 = 0;
		Static13.anInt306 = 0;
		Static256.anInt5271 = 0;
		Static170.anInt3773 = 0;
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(B)V")
	public static void method718() {
		Static101.aClass154_48.method4212();
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
	public static void method719() {
		Static224.aClass154_72.method4219();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!hd;)V")
	public static void method720(@OriginalArg(0) Class2_Sub2 arg0) {
		for (@Pc(2) int local2 = arg0.aShort85; local2 <= arg0.aShort83; local2++) {
			for (@Pc(6) int local6 = arg0.aShort84; local6 <= arg0.aShort82; local6++) {
				@Pc(16) Class57 local16 = Static18.aClass57ArrayArrayArray1[arg0.aByte73][local2][local6];
				if (local16 != null) {
					@Pc(21) Class95 local21 = local16.aClass95_2;
					@Pc(23) Class95 local23 = null;
					while (local21 != null) {
						if (local21.aClass2_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass95_2 = local21.aClass95_3;
							} else {
								local23.aClass95_3 = local21.aClass95_3;
							}
							local21.method2463();
							break;
						}
						local23 = local21;
						local21 = local21.aClass95_3;
					}
					local16.aByte30 = 0;
					for (@Pc(56) Class95 local56 = local16.aClass95_2; local56 != null; local56 = local56.aClass95_3) {
						local16.aByte30 = (byte) (local16.aByte30 | local56.anInt2764);
					}
				}
			}
		}
	}
}

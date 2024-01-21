import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
	public static int anInt2903;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "Lclient!ee;")
	public static Class28_Sub1 aClass28_Sub1_21;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Lclient!s;")
	public static final Class86 aClass86_41 = new Class86(64);

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_861 = Static181.method2795("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
	public static int anInt2904 = 0;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
	public static void method2232() {
		@Pc(12) boolean local12 = false;
		while (!local12) {
			local12 = true;
			for (@Pc(18) int local18 = 0; local18 < Static98.anInt2124 - 1; local18++) {
				if (Static22.aShortArray9[local18] < 1000 && Static22.aShortArray9[local18 + 1] > 1000) {
					local12 = false;
					@Pc(40) Class83 local40 = Static22.aClass83Array12[local18];
					Static22.aClass83Array12[local18] = Static22.aClass83Array12[local18 + 1];
					Static22.aClass83Array12[local18 + 1] = local40;
					@Pc(58) Class83 local58 = Static189.aClass83Array55[local18];
					Static189.aClass83Array55[local18] = Static189.aClass83Array55[local18 + 1];
					Static189.aClass83Array55[local18 + 1] = local58;
					@Pc(76) int local76 = Static2.anIntArray1[local18];
					Static2.anIntArray1[local18] = Static2.anIntArray1[local18 + 1];
					Static2.anIntArray1[local18 + 1] = local76;
					@Pc(94) int local94 = Static94.anIntArray201[local18];
					Static94.anIntArray201[local18] = Static94.anIntArray201[local18 + 1];
					Static94.anIntArray201[local18 + 1] = local94;
					@Pc(112) short local112 = Static22.aShortArray9[local18];
					Static22.aShortArray9[local18] = Static22.aShortArray9[local18 + 1];
					Static22.aShortArray9[local18 + 1] = local112;
					@Pc(130) long local130 = Static212.aLongArray9[local18];
					Static212.aLongArray9[local18] = Static212.aLongArray9[local18 + 1];
					Static212.aLongArray9[local18 + 1] = local130;
				}
			}
		}
	}
}

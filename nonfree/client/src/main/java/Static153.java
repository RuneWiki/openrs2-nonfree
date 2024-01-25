import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!jh", name = "Eb", descriptor = "F")
	public static float aFloat42;

	@OriginalMember(owner = "client!jh", name = "Fb", descriptor = "I")
	public static int anInt3160;

	@OriginalMember(owner = "client!jh", name = "T", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_96 = new Class119(64);

	@OriginalMember(owner = "client!jh", name = "ob", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_97 = new Class119(64);

	@OriginalMember(owner = "client!jh", name = "Gb", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_65 = new Class93("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "(I)V")
	public static void method2951() {
		@Pc(7) Class130 local7 = null;
		try {
			@Pc(11) Class193 local11 = Static177.aClass168_2.method4844();
			while (local11.anInt6293 == 0) {
				Static102.method2276(1L);
			}
			if (local11.anInt6293 == 1) {
				local7 = (Class130) local11.anObject7;
				@Pc(41) Class2_Sub10 local41 = new Class2_Sub10(Static170.anInt3040 * 6 + 3);
				local41.method4430(1);
				local41.method4452(Static170.anInt3040);
				for (@Pc(51) int local51 = 0; local51 < Static31.anIntArray37.length; local51++) {
					if (Static5.aBooleanArray23[local51]) {
						local41.method4452(local51);
						local41.method4450(Static31.anIntArray37[local51]);
					}
				}
				local7.method3570(local41.aByteArray57, local41.anInt4807, 0);
			}
		} catch (@Pc(86) Exception local86) {
		}
		try {
			if (local7 != null) {
				local7.method3574();
			}
		} catch (@Pc(98) Exception local98) {
		}
		Static223.aLong133 = Static51.method1197();
		Static288.aBoolean540 = false;
	}
}

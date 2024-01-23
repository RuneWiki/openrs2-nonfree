import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString24 = "Loading config - ";

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
	public static int anInt673 = -1;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!rn;Lclient!rn;I)V")
	public static void method558(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class155 arg1) {
		Static264.aClass155_111 = arg1;
		Static233.aClass155_96 = arg0;
		Static264.aClass155_111.method4131(34);
		@Pc(19) int local19 = (int) (Math.random() * 21.0D) - 10;
		@Pc(26) int local26 = (int) (Math.random() * 21.0D) - 10;
		@Pc(33) int local33 = (int) (Math.random() * 41.0D) - 20;
		@Pc(40) int local40 = (int) (Math.random() * 21.0D) - 10;
		Static217.anInt4262 = local33 + local19;
		Static232.anInt4516 = local33 + local40;
		Static227.anInt2803 = local33 + local26;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
	public static void method559() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static312.aBooleanArray136[local7] = false;
		}
		Static25.anInt467 = 5;
		Static6.anInt138 = 0;
		Static31.anInt571 = 0;
		Static257.anInt5292 = -1;
		Static102.anInt1860 = -1;
	}
}

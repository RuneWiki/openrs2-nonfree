import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "I")
	public static int anInt5876;

	@OriginalMember(owner = "client!lja", name = "b", descriptor = "Lclient!kw;")
	public static final Class203 aClass203_6 = new Class203("runescape", 0);

	@OriginalMember(owner = "client!lja", name = "d", descriptor = "[Lclient!ma;")
	public static Class221[] aClass221Array1 = null;

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method4988(@OriginalArg(2) String arg0) {
		Static390.method5455(0, arg0, "", 4, "", "");
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(IIBLclient!cm;I)V")
	public static void method4989(@OriginalArg(1) int arg0, @OriginalArg(3) Class34_Sub1_Sub1_Sub2_Sub1 arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray529[0];
		@Pc(15) int local15 = arg1.anIntArray528[0];
		if (local10 < 0 || Static98.anInt361 <= local10 || local15 < 0 || Static438.anInt7120 <= local15 || (arg2 < 0 || Static98.anInt361 <= arg2 || arg0 < 0 || Static438.anInt7120 <= arg0)) {
			return;
		}
		@Pc(77) int local77 = Static597.method7883(-4, arg2, Static152.anIntArray554, arg0, true, 0, local15, local10, Static609.aClass110Array1[arg1.aByte132], 0, 0, Static211.anIntArray203, arg1.method7866(), 0);
		if (local77 >= 1 && local77 <= 3) {
			for (@Pc(91) int local91 = 0; local91 < local77 - 1; local91++) {
				arg1.method1480((byte) 2, Static152.anIntArray554[local91], Static211.anIntArray203[local91]);
			}
		}
	}
}

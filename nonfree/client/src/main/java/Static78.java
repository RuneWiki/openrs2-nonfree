import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "Lclient!qe;")
	public static Class82 aClass82_2;

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_569 = Static81.method1507("<col=00ff80>");

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_570 = Static81.method1507("3D)2Softwarebibliothek gestartet");

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "Z")
	public static boolean aBoolean92 = false;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)J")
	public static long method1463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub8 local7 = Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1550; local13++) {
			@Pc(19) Class51 local19 = local7.aClass51Array1[local13];
			if ((local19.aLong68 >> 29 & 0x3L) == 2L && local19.anInt2213 == arg1 && local19.anInt2218 == arg2) {
				return local19.aLong68;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!dj;B)V")
	public static void method1465(@OriginalArg(0) Class24 arg0) {
		try {
			Static191.anApplet_Sub1_1.getAppletContext().showDocument(arg0.method750(Static191.anApplet_Sub1_1.getCodeBase()), "_blank");
		} catch (@Pc(22) Exception local22) {
		}
	}
}

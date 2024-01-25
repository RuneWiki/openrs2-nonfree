import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!kk", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString34 = null;

	@OriginalMember(owner = "client!kk", name = "S", descriptor = "[I")
	public static int[] anIntArray262 = new int[2];

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)V")
	public static void method3224() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static125.aBooleanArray17[local7] = false;
		}
		Static148.anInt2821 = -1;
		Static97.anInt2176 = Static293.anInt5622;
		Static327.anInt5855 = Static293.anInt5621;
		Static133.anInt2589 = Static258.anInt4308;
		Static271.anInt4997 = Static164.anInt3206;
		Static399.anInt6965 = 0;
		Static271.anInt4999 = Static110.anInt2281;
		Static391.anInt6869 = 0;
		Static65.anInt7824 = 5;
		Static21.anInt433 = -1;
		Static176.anInt3414 = Static225.anInt4310;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3225(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(Z)V")
	public static void method3226() {
		if (!Static313.method4434()) {
			return;
		}
		if (Static359.aStringArray25 == null) {
			Static248.method3826();
		}
		Static308.anInt5417 = 0;
		Static171.aBoolean281 = true;
		try {
			Static85.aClipboard4 = Static405.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(25) Exception local25) {
		}
	}
}

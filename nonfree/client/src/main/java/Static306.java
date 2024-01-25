import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
	public static final int anInt5138 = 50;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "[I")
	public static final int[] anIntArray287 = new int[anInt5138];

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "[I")
	public static final int[] anIntArray288 = new int[anInt5138];

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[anInt5138];

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "[I")
	public static final int[] anIntArray289 = new int[anInt5138];

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "[I")
	public static final int[] anIntArray290 = new int[anInt5138];

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "[I")
	public static final int[] anIntArray291 = new int[anInt5138];

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "[I")
	public static final int[] anIntArray292 = new int[anInt5138];

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
	public static int anInt5140 = 0;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V")
	public static void method4424() {
		@Pc(6) Class295 local6 = Static582.aClass295_66;
		synchronized (Static582.aClass295_66) {
			Static582.aClass295_66.method6464();
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)Z")
	public static boolean method4425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
	public static void method4426() {
		Static312.anImage2 = null;
		Static228.aFont1 = null;
	}
}

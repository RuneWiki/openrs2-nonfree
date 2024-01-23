import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
	public static int anInt3710;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "Lclient!eh;")
	public static Class27 aClass27_100 = new Class27(5);

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1273 = Static200.method3116("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1274 = Static200.method3116("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1275 = Static200.method3116("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
	public static int anInt3717 = 0;

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1276 = aClass60_1275;

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
	public static int anInt3718 = 0;

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "Z")
	public static boolean aBoolean205 = false;

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "[I")
	public static int[] anIntArray487 = new int[32];

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)Lclient!fa;")
	public static Class29 method2789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub22 local7 = Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt3358; local13++) {
			@Pc(19) Class29 local19 = local7.aClass29Array3[local13];
			if ((local19.aLong43 >> 29 & 0x3L) == 2L && local19.anInt1437 == arg1 && local19.anInt1423 == arg2) {
				return local19;
			}
		}
		return null;
	}
}

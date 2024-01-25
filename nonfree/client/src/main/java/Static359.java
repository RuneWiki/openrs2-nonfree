import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Lclient!qn;")
	public static Class211 aClass211_80;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "[Lclient!l;")
	public static Class95[] aClass95Array12;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_109 = new Class15("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_216 = new Class56(32, 0);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)I")
	public static int method4736(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(36) int local36 = local25 | local25 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return arg0 & ~local42;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
	public static int anInt4241;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2092 = Static193.method3027("mapscene");

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2093 = Static193.method3027("settings=");

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2096 = Static193.method3027("Examine");

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "Lclient!oc;")
	public static Class70 aClass70_2094 = aClass70_2096;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2095 = Static193.method3027("hint_mapedge");

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
	public static int anInt4244 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)I")
	public static int method3305(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(19) int local19 = (local9 & 0x33333333) + ((local9 & 0xCCCCCCCC) >>> 2);
		@Pc(31) int local31 = local19 + (local19 >>> 4) & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(48) int local48 = local37 + (local37 >>> 16);
		return local48 & 0xFF;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)J")
	public static synchronized long method3307() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (Static200.aLong138 > local1) {
			Static2.aLong1 += Static200.aLong138 - local1;
		}
		Static200.aLong138 = local1;
		return Static2.aLong1 + local1;
	}
}

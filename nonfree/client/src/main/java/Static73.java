import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
	public static int anInt1884;

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
	public static int anInt1887;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
	public static int anInt1888;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "Lclient!ea;")
	public static Class18 aClass18_460 = Static8.method128("event_opbase");

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "Lclient!ea;")
	public static Class18 aClass18_461 = Static8.method128("runes");

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
	public static int anInt1882 = -1;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "Lclient!ea;")
	public static Class18 aClass18_462 = Static8.method128("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "Lclient!ea;")
	public static Class18 aClass18_463 = Static8.method128("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
	public static int anInt1886 = 0;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "Lclient!ea;")
	public static Class18 aClass18_464 = Static8.method128("<img=0>");

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "Z")
	public static final boolean aBoolean74 = false;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "Z")
	public static boolean aBoolean75 = false;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public static void method1248() {
		aClass18_463 = null;
		aClass18_462 = null;
		aClass18_464 = null;
		aClass18_460 = null;
		aClass18_461 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIZ)Lclient!ea;")
	public static Class18 method1249(@OriginalArg(2) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(19) int local19 = 1;
		for (@Pc(23) int local23 = arg0 / 10; local23 != 0; local23 /= 10) {
			local19++;
		}
		@Pc(37) int local37 = local19;
		if (arg0 < 0 || arg1) {
			local37 = local19 + 1;
		}
		@Pc(48) byte[] local48 = new byte[local37];
		if (arg0 < 0) {
			local48[0] = 45;
		} else if (arg1) {
			local48[0] = 43;
		}
		for (@Pc(72) int local72 = 0; local72 < local19; local72++) {
			@Pc(78) int local78 = arg0 % 10;
			arg0 /= 10;
			if (local78 < 0) {
				local78 = -local78;
			}
			if (local78 > 9) {
				local78 += 39;
			}
			local48[local37 - local72 - 1] = (byte) (local78 + 48);
		}
		@Pc(118) Class18 local118 = new Class18();
		local118.aByteArray6 = local48;
		local118.anInt1129 = local37;
		return local118;
	}
}

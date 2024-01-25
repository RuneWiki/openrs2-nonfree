import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!r", name = "w", descriptor = "I")
	public static int anInt10510;

	@OriginalMember(owner = "client!r", name = "u", descriptor = "I")
	public static int anInt10514;

	@OriginalMember(owner = "client!r", name = "v", descriptor = "I")
	public static int anInt10511 = 0;

	@OriginalMember(owner = "client!r", name = "x", descriptor = "Lclient!jh;")
	public static final Class188 aClass188_46 = new Class188();

	@OriginalMember(owner = "client!r", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString134 = "";

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(B)I")
	public static int method9020() {
		return Static351.anIntArray339 == null ? 0 : Static351.anIntArray339.length * 2;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ha;Lclient!cn;IBI)V")
	public static void method9021(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) int local16 = 63; local16 >= 0; local16--) {
			@Pc(34) int local34 = (local16 & 0x3F) << 10 | 0x3F | 0x380;
			Static303.method4654(false, true);
			@Pc(42) int local42 = Static560.anIntArray534[local34];
			Static147.method2073(true, false);
			arg0.aa(arg3, arg2 + (arg1.anInt1394 * (63 - local16) >> 6), arg1.anInt1384, (arg1.anInt1394 >> 6) + 1, local42, 0);
		}
	}
}

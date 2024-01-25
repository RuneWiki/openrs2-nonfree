import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!st", name = "k", descriptor = "I")
	public static int anInt6622;

	@OriginalMember(owner = "client!st", name = "h", descriptor = "Lclient!gn;")
	public static final Class97 aClass97_7 = new Class97();

	@OriginalMember(owner = "client!st", name = "j", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_162 = new Class25(42, 20);

	@OriginalMember(owner = "client!st", name = "l", descriptor = "I")
	public static int anInt6623 = 0;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!gi;)V")
	public static void method5263(@OriginalArg(1) Class93 arg0) {
		if (Static456.anInt7597 == arg0.anInt2476) {
			Static186.aBooleanArray12[arg0.anInt2449] = true;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method5265(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IBI)Z")
	public static boolean method5266(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static129.method2037(arg1, arg0) || Static81.method1197(arg1, arg0);
	}
}

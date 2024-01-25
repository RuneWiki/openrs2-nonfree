import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!hg", name = "I", descriptor = "Lclient!nq;")
	public static Class144 aClass144_36;

	@OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
	public static int anInt2160;

	@OriginalMember(owner = "client!hg", name = "L", descriptor = "[I")
	public static final int[] anIntArray156 = new int[13];

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method1751(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
	public static void method1753() {
		if (Static260.aBoolean346) {
			return;
		}
		Static81.aBoolean92 = true;
		Static260.aBoolean346 = true;
		if (Static210.aBoolean290) {
			Static21.aFloat10 = (int) Static21.aFloat10 + 47 & 0xFFFFFFF0;
		} else {
			Static283.aFloat53 += (12.0F - Static283.aFloat53) / 2.0F;
		}
	}
}

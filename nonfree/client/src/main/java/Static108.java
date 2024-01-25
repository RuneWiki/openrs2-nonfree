import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!gq", name = "B", descriptor = "I")
	public static int anInt2020;

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "[I")
	public static final int[] anIntArray272 = new int[200];

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_34 = new Class70(30);

	@OriginalMember(owner = "client!gq", name = "C", descriptor = "[I")
	public static final int[] anIntArray273 = new int[5];

	@OriginalMember(owner = "client!gq", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString77 = "Attack";

	@OriginalMember(owner = "client!gq", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString78 = "Loading interfaces - ";

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIB)I")
	public static int method2192(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(22) int local22 = (arg0 & 0x7F) * 96 >> 7;
		if (local22 < 2) {
			local22 = 2;
		} else if (local22 > 126) {
			local22 = 126;
		}
		return (arg0 & 0xFF80) + local22;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IB)V")
	public static void method2195(@OriginalArg(0) int arg0) {
		Static192.anInt3645 = -1;
		if (arg0 == 37) {
			Static307.aFloat18 = 3.0F;
		} else if (arg0 == 50) {
			Static307.aFloat18 = 4.0F;
		} else if (arg0 == 75) {
			Static307.aFloat18 = 6.0F;
		} else if (arg0 == 100) {
			Static307.aFloat18 = 8.0F;
		} else if (arg0 == 200) {
			Static307.aFloat18 = 16.0F;
		}
		Static192.anInt3645 = -1;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method2196(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = Static124.method2462(arg0.charAt(local12)) + (local10 << 5) - local10;
		}
		return local10;
	}
}

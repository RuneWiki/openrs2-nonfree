import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!oj", name = "K", descriptor = "[I")
	public static int[] anIntArray250;

	@OriginalMember(owner = "client!oj", name = "P", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!oj", name = "W", descriptor = "I")
	public static int anInt4735;

	@OriginalMember(owner = "client!oj", name = "O", descriptor = "[I")
	public static final int[] anIntArray251 = new int[1];

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)V")
	public static void method3754(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub3_Sub13 local8 = Static397.method4998(6, arg0);
		local8.method3458();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BII)Z")
	public static boolean method3755(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static263.aBoolean329) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static369.aClass250ArrayArray5[local13] == null || Static369.aClass250ArrayArray5[local13][local17] == null) {
			return false;
		}
		@Pc(40) Class250 local40 = Static369.aClass250ArrayArray5[local13][local17];
		@Pc(51) Class1_Sub45 local51;
		if (arg0 == -1 && local40.anInt7009 == 0) {
			for (local51 = (Class1_Sub45) Static50.aClass254_8.method5437(); local51 != null; local51 = (Class1_Sub45) Static50.aClass254_8.method5433()) {
				if (local51.anInt7398 == 30 || local51.anInt7398 == 1007 || local51.anInt7398 == 51 || local51.anInt7398 == 15 || local51.anInt7398 == 46) {
					for (@Pc(135) Class250 local135 = Static96.method1379(local51.anInt7400); local135 != null; local135 = Static266.method2728(local135)) {
						if (local135.anInt6994 == local40.anInt6994) {
							return true;
						}
					}
				}
			}
		} else {
			for (local51 = (Class1_Sub45) Static50.aClass254_8.method5437(); local51 != null; local51 = (Class1_Sub45) Static50.aClass254_8.method5433()) {
				if (local51.anInt7397 == arg0 && local40.anInt6994 == local51.anInt7400 && (local51.anInt7398 == 30 || local51.anInt7398 == 1007 || local51.anInt7398 == 51 || local51.anInt7398 == 15 || local51.anInt7398 == 46)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)V")
	public static void method3757(@OriginalArg(1) int arg0) {
		Static2.anInt3076 = arg0;
		Static113.anInt2002 = -1;
		Static113.anInt2002 = -1;
		Static144.method1907();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)I")
	public static int method3758(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(46) int local46 = (arg0 & 0x7F) * 96 >> 7;
			if (local46 < 2) {
				local46 = 2;
			} else if (local46 > 126) {
				local46 = 126;
			}
			return local46 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II[S)[S")
	public static short[] method3759(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static459.method2116(arg1, 0, local6, 0, arg0);
		return local6;
	}
}

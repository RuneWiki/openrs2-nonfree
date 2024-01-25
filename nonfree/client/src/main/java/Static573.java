import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!wba", name = "p", descriptor = "I")
	public static int anInt10095 = -2;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)V")
	public static void method8191(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		Static239.aString52 = arg2;
		Static347.aBoolean596 = arg0;
		Static492.aString107 = arg1;
		if (!Static347.aBoolean596 && Static377.anInt7322 != 3 && (Static492.aString107.equals("") || Static239.aString52.equals(""))) {
			Static395.method3918(3);
			return;
		}
		Static420.aBoolean673 = false;
		if (Static377.anInt7322 != 1) {
			Static131.anInt2942 = 0;
			Static65.anInt1700 = -1;
		}
		Static395.method3918(-3);
		Static486.anInt9078 = 0;
		Static13.anInt401 = 0;
		Static353.anInt7069 = 1;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V")
	public static void method8192() {
		@Pc(16) int local16 = Static455.aClass3_Sub27_Sub1_1.method4048(Static275.anInt5823);
		if (local16 == 0) {
			Static570.aByteArrayArrayArray20 = null;
			Static279.method4842(0);
		} else if (local16 == 1) {
			Static83.method1877((byte) 0);
			Static279.method4842(512);
			if (Static576.aByteArrayArrayArray21 != null) {
				Static461.method7085();
			}
		} else {
			Static83.method1877((byte) (Static453.anInt8598 - 4 & 0xFF));
			Static279.method4842(2);
		}
		Static484.anInt9032 = Static212.anInt4380;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!w", name = "o", descriptor = "I")
	public static int anInt6622 = 2;

	@OriginalMember(owner = "client!w", name = "q", descriptor = "[I")
	public static final int[] anIntArray618 = new int[25];

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public static void method5887() {
		if (Static143.aClass47_1 != null) {
			Static143.aClass47_1.method5331();
		}
		if (Static311.aClass47_3 != null) {
			Static311.aClass47_3.method5331();
		}
		Static130.method4916(Static230.aBoolean379);
		Static143.aClass47_1 = Static234.method4159(22050, Static102.aCanvas3, 0, Static182.aClass139_5);
		Static143.aClass47_1.method5333(Static122.aClass5_Sub16_Sub1_2);
		Static311.aClass47_3 = Static234.method4159(2048, Static102.aCanvas3, 1, Static182.aClass139_5);
		Static311.aClass47_3.method5333(Static114.aClass5_Sub16_Sub4_1);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	public static void method5890() {
		@Pc(5) Class109 local5 = Static155.aClass109_36;
		synchronized (Static155.aClass109_36) {
			Static155.aClass109_36.method2858();
		}
		local5 = Static236.aClass109_46;
		synchronized (Static236.aClass109_46) {
			Static236.aClass109_46.method2858();
		}
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
	public static void method5892() {
		@Pc(6) int local6 = Static219.method4012();
		if (local6 == 0) {
			Static167.aByteArrayArrayArray8 = null;
			Static62.method965(0);
		} else if (local6 == 1) {
			Static313.method5462((byte) 0);
			Static62.method965(512);
			if (Static255.aByteArrayArrayArray13 != null) {
				Static276.method5079();
			}
		} else {
			Static313.method5462((byte) (Static116.anInt2145 - 4 & 0xFF));
			Static62.method965(2);
		}
		Static31.anInt619 = Static239.anInt4811;
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
	public static void method5893(@OriginalArg(0) int arg0) {
		Static63.anInt5185 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static350.anInt6715; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static236.anInt4222; local6++) {
				if (Static178.aClass174ArrayArrayArray3[arg0][local3][local6] == null) {
					Static178.aClass174ArrayArrayArray3[arg0][local3][local6] = new Class174(arg0, local3, local6);
				}
			}
		}
	}
}

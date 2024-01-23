import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
	public static int anInt3563;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString117 = "Connecting to update server";

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString118 = "yellow:";

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "S")
	public static short aShort18 = 256;

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString119 = "wave2:";

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)I")
	public static int method2827(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class4_Sub32 local6 = (Class4_Sub32) Static105.aClass97_9.method2360((long) arg0);
		if (local6 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local6.anIntArray482.length) {
			return local6.anIntArray482[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
	public static void method2828() {
		if (Static259.aClass158_3 != null) {
			Static259.aClass158_3.method3779();
			Static259.aClass158_3 = null;
		}
		Static116.method1999();
		Static118.method2032();
		@Pc(19) int local19;
		for (local19 = 0; local19 < 4; local19++) {
			Static121.aClass63Array1[local19].method1668();
		}
		Static261.method3958(false);
		System.gc();
		Static115.method1990();
		Static190.aBoolean244 = false;
		Static67.anInt1256 = -1;
		Static271.method4063(true);
		Static257.anInt4842 = 0;
		Static25.anInt450 = 0;
		Static170.anInt3385 = 0;
		Static239.anInt4613 = 0;
		Static54.aBoolean77 = false;
		for (local19 = 0; local19 < Static250.aClass7Array1.length; local19++) {
			Static250.aClass7Array1[local19] = null;
		}
		Static41.anInt856 = 0;
		Static68.anInt1262 = 0;
		@Pc(83) int local83;
		for (local83 = 0; local83 < 2048; local83++) {
			Static257.aClass12_Sub3_Sub2Array1[local83] = null;
			Static102.aClass4_Sub17Array1[local83] = null;
		}
		for (local83 = 0; local83 < 32768; local83++) {
			Static100.aClass12_Sub3_Sub1Array1[local83] = null;
		}
		for (local83 = 0; local83 < 4; local83++) {
			for (@Pc(120) int local120 = 0; local120 < 104; local120++) {
				for (@Pc(127) int local127 = 0; local127 < 104; local127++) {
					Static10.aClass10ArrayArrayArray1[local83][local120][local127] = null;
				}
			}
		}
		Static248.method3764();
		Static44.anInt886 = 0;
		Static3.method41();
		Static49.method846(true);
		try {
			Static301.method121(Static87.aClass164_2.anApplet1, "loggedout");
		} catch (@Pc(164) Throwable local164) {
		}
	}

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "(I)V")
	public static void method2835() {
		Static233.anIntArray423 = Static193.method3020(0.4F);
	}

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "(B)V")
	public static void method2837() {
		Static36.aClass33_4.method843();
		Static151.aClass33_26.method843();
		Static160.aClass33_28.method843();
	}

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "(I)V")
	public static void method2838() {
		aString117 = null;
		aString118 = null;
		aString119 = null;
	}
}

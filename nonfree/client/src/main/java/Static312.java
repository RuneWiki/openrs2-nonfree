import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "[Lclient!of;")
	public static Class40[] aClass40Array40;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString269 = "Stellar Dawn is loading - please wait...";

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString270 = null;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method5289() {
		Static232.aClass70_77.method1405();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!ja;)V")
	public static void method5291(@OriginalArg(1) Class81 arg0) {
		arg0.method3033(0, 0, Static209.anInt3815, 350);
		arg0.method2962(0, 0, Static209.anInt3815, 350, Static214.anInt3932 << 24 | 0x332277, 1);
		@Pc(36) int local36;
		for (@Pc(25) int local25 = 0; local25 < 100; local25++) {
			local36 = Static98.anIntArray255[local25];
			@Pc(40) int local40 = Static241.anIntArray669[local25];
			arg0.method2962(local36, local40, 2, 2, Static299.anIntArray639[local25] << 24 | 0xFFFFFF, 1);
		}
		for (local36 = 0; local36 < Static223.aStringArray29.length; local36++) {
			Static298.aClass30_4.method5340(350 - Static117.anInt2213 - Static38.aClass26_3.anInt608 - local36 * Static143.anInt2818 - 2, -1, -16777216, Static223.aStringArray29[local36], 10);
		}
		arg0.method2999(Static209.anInt3815, 350 - Static117.anInt2213, 0, -1);
		Static309.aClass30_5.method5340(350 - Static220.aClass26_6.anInt608 - 1, -1, -16777216, "--> " + Static105.aString73 + "*", 10);
	}
}

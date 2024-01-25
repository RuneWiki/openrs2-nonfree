import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "F")
	public static float aFloat185;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	public static void method7738() {
		Static536.anInt9279 = Static31.aClass133_3.anInt4192 + Static31.aClass133_3.anInt4190 + 2;
		Static85.aStringArray17 = new String[500];
		Static319.anInt6113 = Static176.aClass133_45.anInt4192 + Static176.aClass133_45.anInt4190 + 2;
		for (@Pc(27) int local27 = 0; local27 < Static85.aStringArray17.length; local27++) {
			Static85.aStringArray17[local27] = "";
		}
		Static97.method1576(Static317.aClass192_1.method5299(Static307.anInt5931));
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)I")
	public static int method7739(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)Z")
	public static boolean method7740(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public static void method7741() {
		Static97.anIntArray126 = Static130.method2124(0.4F);
	}
}

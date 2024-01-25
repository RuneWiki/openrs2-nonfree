import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_144 = new Class362(69, 12);

	@OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
	public static int anInt6451 = -1;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)Z")
	public static boolean method5479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(B)V")
	public static void method5480() {
		Static584.aClass154_1.method3566();
		Static172.aClass135_1.method6373();
		Static430.aClient1.method1155();
		Static475.aCanvas12.setBackground(Color.black);
		anInt6451 = -1;
		Static584.aClass154_1 = Static263.method4440(Static475.aCanvas12);
		Static172.aClass135_1 = Static56.method931(Static475.aCanvas12);
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(III)Z")
	public static boolean method5481(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static438.method6801(arg0, arg1) | Static107.method6922(arg1, arg0) | Static448.method6946(arg0, arg1)) & Static286.method4962(arg0, arg1);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLclient!jn;I)Lclient!f;")
	public static Class78 method5482(@OriginalArg(1) Class176 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class78 local10 = (Class78) Static472.aClass223_60.method5388((long) arg1);
		if (local10 == null) {
			if (Static573.aBoolean707) {
				local10 = Static440.aClass44_12.method5018(Static598.method6323(arg0, arg1), true);
			} else {
				local10 = Static493.method7306(arg0.method4005(arg1));
			}
			Static472.aClass223_60.method5394(local10, (long) arg1);
		}
		return local10;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZI)I")
	public static int method5483(@OriginalArg(0) boolean arg0) {
		if (Static566.anIntArray532 == null) {
			return 0;
		} else if (arg0 || Static401.aClass32Array1 == null) {
			@Pc(28) int local28 = 0;
			for (@Pc(30) int local30 = 0; local30 < Static566.anIntArray532.length; local30++) {
				@Pc(36) int local36 = Static566.anIntArray532[local30];
				if (Static478.aClass176_116.method3996(local36)) {
					local28++;
				}
				if (Static114.aClass176_130.method3996(local36)) {
					local28++;
				}
			}
			return local28;
		} else {
			return Static566.anIntArray532.length * 2;
		}
	}
}

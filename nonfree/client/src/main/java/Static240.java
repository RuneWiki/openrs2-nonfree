import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!lv", name = "n", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method3505(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static58.anInt1051 = 7;
		Static297.anInt4985 = 0x1 << Static58.anInt1051;
		Static86.anInt1530 = Static297.anInt4985 >> 1;
		Static382.anInt5709 = (int) Math.sqrt((double) (Static86.anInt1530 * Static86.anInt1530 + Static86.anInt1530 * Static86.anInt1530));
		Static348.anInt6361 = Static297.anInt4985 >> 2;
		Static442.anInt7686 = Static297.anInt4985;
		Static251.anInt4344 = arg0;
		Static219.anInt3872 = arg1;
		Static370.anInt7659 = arg2;
		Static346.aClass137ArrayArrayArray3 = new Class137[4][Static251.anInt4344][Static219.anInt3872];
		Static60.aClass70Array1 = new Class70[4];
		if (arg3) {
			Static283.anIntArrayArray32 = new int[Static251.anInt4344][Static219.anInt3872];
			Static152.aByteArrayArray13 = new byte[Static251.anInt4344][Static219.anInt3872];
			Static376.aByteArrayArray26 = new byte[Static251.anInt4344][Static219.anInt3872];
			Static33.aClass137ArrayArrayArray1 = new Class137[1][Static251.anInt4344][Static219.anInt3872];
			Static315.aClass70Array3 = new Class70[1];
		} else {
			Static283.anIntArrayArray32 = null;
			Static152.aByteArrayArray13 = null;
			Static376.aByteArrayArray26 = null;
			Static33.aClass137ArrayArrayArray1 = null;
			Static315.aClass70Array3 = null;
		}
		if (arg4) {
			Static392.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static352.aClass253Array1 = new Class253[65535];
			Static60.aBooleanArray4 = new boolean[65535];
			Static121.anInt2306 = 0;
		} else {
			Static392.aLongArrayArrayArray1 = null;
			Static352.aClass253Array1 = null;
			Static60.aBooleanArray4 = null;
			Static121.anInt2306 = 0;
		}
		Static197.method3043(false);
		Static264.aClass41Array2 = new Class41[1000];
		Static208.anInt3763 = 0;
		Static201.aClass41Array1 = new Class41[1000];
		Static397.anInt7107 = 0;
		Static291.anIntArrayArrayArray141 = new int[4][Static251.anInt4344 + 1][Static219.anInt3872 + 1];
		Static83.aClass47_Sub1Array6 = new Class47_Sub1[5000];
		Static93.anInt1805 = 0;
		Static6.aBooleanArrayArray3 = new boolean[Static370.anInt7659 + Static370.anInt7659 + 1][Static370.anInt7659 + Static370.anInt7659 + 1];
		Static418.aBooleanArrayArray11 = new boolean[Static370.anInt7659 + Static370.anInt7659 + 2][Static370.anInt7659 + Static370.anInt7659 + 2];
		Static68.aClass143_1 = null;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method3507(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local8[local18] = local18 + ": ";
			if (arg0 != null && arg0[local18] != null) {
				local8[local18] = local8[local18] + arg0[local18];
			}
		}
		return local8;
	}
}

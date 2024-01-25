import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!es", name = "p", descriptor = "[I")
	public static final int[] anIntArray172 = new int[4096];

	@OriginalMember(owner = "client!es", name = "r", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@OriginalMember(owner = "client!es", name = "u", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_26 = new Class208(30, 8);

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IBLclient!nn;)Z")
	public static boolean method2247(@OriginalArg(0) int arg0, @OriginalArg(2) Class226 arg1) {
		Static171.aClass154_2.method6573(arg1.anIntArray425[arg0], arg1.anIntArray424[arg0], arg1.anIntArray423[arg0], Static540.anIntArray571);
		@Pc(22) int local22 = Static540.anIntArray571[2];
		if (local22 < 50) {
			return false;
		} else {
			arg1.aShortArray84[arg0] = (short) (Static552.anInt9420 + Static540.anIntArray571[0] * Static101.anInt1981 / local22);
			arg1.aShortArray83[arg0] = (short) (Static191.anInt3856 + Static540.anIntArray571[1] * Static116.anInt2277 / local22);
			arg1.aShortArray85[arg0] = (short) local22;
			return true;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ZIII)I")
	public static int method2248(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static195.aClass199Array1 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg0 >> 9;
		@Pc(20) int local20 = arg2 >> 9;
		if (local16 < 0 || local20 < 0 || local16 > Static442.anInt7975 - 1 || Static284.anInt7916 - 1 < local20) {
			return 0;
		}
		@Pc(38) int local38 = arg1;
		if (arg1 < 3 && (Static197.aByteArrayArrayArray24[1][local16][local20] & 0x2) != 0) {
			local38 = arg1 + 1;
		}
		return Static195.aClass199Array1[local38].method8531(arg2, arg0);
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V")
	public static void method2251() {
		Static171.aClass52Array1 = null;
	}
}

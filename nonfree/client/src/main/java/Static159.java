import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!i", name = "O", descriptor = "[I")
	public static int[] anIntArray218;

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas3;

	@OriginalMember(owner = "client!i", name = "S", descriptor = "I")
	public static int anInt2864;

	@OriginalMember(owner = "client!i", name = "L", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_153 = new Class12(61, 4);

	@OriginalMember(owner = "client!i", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString45 = "";

	@OriginalMember(owner = "client!i", name = "R", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_61 = new Class254(44, 7);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIIII)I")
	public static int method2521(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class262.anIntArray576[arg3 * 8192 / arg2] >> 1;
		return (local16 * arg0 >> 16) + ((65536 - local16) * arg1 >> 16);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)V")
	public static void method2523(@OriginalArg(1) boolean arg0) {
		Static381.method368(Static403.anInt7142, Static246.anInt4292, arg0, Static324.anInt5725);
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(I)Lclient!da;")
	public static Class1_Sub8 method2524() {
		if (Static350.aClass142_46 == null || Static33.aClass117_1 == null) {
			return null;
		}
		for (@Pc(22) Class1_Sub8 local22 = (Class1_Sub8) Static33.aClass117_1.method2532(); local22 != null; local22 = (Class1_Sub8) Static33.aClass117_1.method2532()) {
			@Pc(30) Class52 local30 = Static350.aClass103_4.method2055(local22.anInt1168);
			if (local30 != null && local30.aBoolean104 && local30.method981(Static350.anInterface1_2)) {
				return local22;
			}
		}
		return null;
	}
}

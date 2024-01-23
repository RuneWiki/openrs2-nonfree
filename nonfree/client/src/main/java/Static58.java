import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!dm", name = "C", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!dm", name = "J", descriptor = "[I")
	public static int[] anIntArray103 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!dm", name = "K", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!dm", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString45 = "glow2:";

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)I")
	public static int method943() {
		return 6;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZIIII)V")
	public static void method944(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static245.method4932(arg2)) {
			Static235.method3990(-1, Static96.aClass151ArrayArray1[arg2], arg1, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "(I)V")
	public static void method946() {
		Static71.method1081((long) Static124.anInt2371);
		if (Static66.anInt1232 != -1) {
			Static267.method4421(Static66.anInt1232);
		}
		for (@Pc(17) int local17 = 0; local17 < Static123.anInt2326; local17++) {
			if (Static292.aBooleanArray129[local17]) {
				Static223.aBooleanArray102[local17] = true;
			}
			Static308.aBooleanArray134[local17] = Static292.aBooleanArray129[local17];
			Static292.aBooleanArray129[local17] = false;
		}
		if (Static283.aBoolean393) {
			Static28.aBoolean42 = true;
		}
		Static201.anInt3957 = Static124.anInt2371;
		Static38.anInt673 = -1;
		Static93.anInt1704 = -1;
		Static215.aClass151_12 = null;
		if (Static66.anInt1232 != -1) {
			Static123.anInt2326 = 0;
			Static200.method3310();
		}
		if (Static283.aBoolean393) {
			Static234.method3976();
		} else {
			Static143.method2458();
		}
		Static140.anInt2709 = 0;
	}
}

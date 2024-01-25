import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
	public static int anInt4136;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "Z")
	public static volatile boolean aBoolean317 = false;

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "Lclient!kn;")
	public static Class116 aClass116_35 = new Class116();

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
	public static int anInt4137 = 0;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V")
	public static void method3737(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static54.aFloat70 = 3.0F;
		} else if (arg0 == 50) {
			Static54.aFloat70 = 4.0F;
		} else if (arg0 == 75) {
			Static54.aFloat70 = 6.0F;
		} else if (arg0 == 100) {
			Static54.aFloat70 = 8.0F;
		} else if (arg0 == 200) {
			Static54.aFloat70 = 16.0F;
		}
		Static285.anInt5603 = -1;
		Static285.anInt5603 = -1;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!br;IB)I")
	public static int method3739(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		if (!Static44.method877(arg0).method1028(arg1) && arg0.anObjectArray9 == null) {
			return -1;
		} else if (arg0.anIntArray31 == null || arg1 >= arg0.anIntArray31.length) {
			return -1;
		} else {
			return arg0.anIntArray31[arg1];
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIII)I")
	public static int method3740(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = ((arg0 & 0xFF00) * arg2 & 0xFF0000 | (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) >>> 8;
		@Pc(26) int local26 = 255 - arg2;
		return (((arg1 & 0xFF00) * local26 & 0xFF0000 | local26 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local21;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZZZ)V")
	public static void method3743(@OriginalArg(2) boolean arg0) {
		Static168.anInt6689++;
		Static176.method1867();
		if (arg0) {
			Static110.anInt2698++;
			Static305.method5683();
		}
	}
}

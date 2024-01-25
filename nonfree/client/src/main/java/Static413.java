import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
	public static int anInt7199;

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
	public static int anInt7200;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "Lclient!ha;")
	public static Class12 aClass12_17;

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "Lclient!h;")
	public static final Class114 aClass114_140 = new Class114("Loaded JACLIB", "JACLIB geladen", "JACLIB chargé", "JACLIB carregado");

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "[I")
	public static final int[] anIntArray536 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIBII)V")
	public static void method6160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static361.anInt6491; local3++) {
			@Pc(9) Rectangle local9 = Class1_Sub1_Sub2.aRectangleArray1[local3];
			if (arg0 < local9.width + local9.x && arg1 + arg0 > local9.x && arg3 < local9.y + local9.height && arg3 + arg2 > local9.y) {
				Static44.aBooleanArray8[local3] = true;
			}
		}
	}
}

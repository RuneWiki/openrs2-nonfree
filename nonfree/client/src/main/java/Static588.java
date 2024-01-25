import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!sja", name = "f", descriptor = "[I")
	public static int[] anIntArray528;

	@OriginalMember(owner = "client!sja", name = "i", descriptor = "Lclient!m;")
	public static final Class235 aClass235_47 = new Class235(22);

	@OriginalMember(owner = "client!sja", name = "b", descriptor = "(I)V")
	public static void method8087() {
		@Pc(9) int local9;
		if (Static537.aClass79Array4 != null) {
			for (local9 = 0; local9 < Static629.anInt10181; local9++) {
				Static537.aClass79Array4[local9] = null;
			}
			Static537.aClass79Array4 = null;
		}
		if (Static345.aClass79Array1 != null) {
			for (local9 = 0; local9 < Static458.anInt8069; local9++) {
				Static345.aClass79Array1[local9] = null;
			}
			Static345.aClass79Array1 = null;
		}
		if (Static483.aClass79Array3 != null) {
			for (local9 = 0; local9 < Static379.anInt6781; local9++) {
				Static483.aClass79Array3[local9] = null;
			}
			Static483.aClass79Array3 = null;
		}
		Static406.aClass79Array2 = null;
		Static581.anInt9510 = -1;
		Static95.anInt1572 = -1;
		Static90.anIntArrayArrayArray2 = null;
		Static261.anIntArray274 = null;
	}

	@OriginalMember(owner = "client!sja", name = "d", descriptor = "(I)V")
	public static void method8089() {
		Static420.aClass199_1.method8108();
		for (@Pc(17) int local17 = 0; local17 < 32; local17++) {
			Static29.aLongArray1[local17] = 0L;
		}
		for (@Pc(33) int local33 = 0; local33 < 32; local33++) {
			Static460.aLongArray21[local33] = 0L;
		}
		Static522.anInt8874 = 0;
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(ILjava/awt/Canvas;BLclient!d;)Lclient!ha;")
	public static Class67 method8090(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) Interface2 arg2) {
		return new Class67_Sub2(arg1, arg2, arg0);
	}
}

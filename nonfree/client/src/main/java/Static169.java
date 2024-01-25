import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!ko;")
	public static final Class208 aClass208_2 = new Class208("", 13);

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)Z")
	public static boolean method3031() {
		if (Static460.aBoolean507) {
			try {
				if ((Boolean) Static684.method782(Static265.anApplet2, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(26) Throwable local26) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public static void method3032(@OriginalArg(0) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static142.method6602(local6.width, local6.height);
		if (Static181.anInt3401 == 1) {
			Static548.aClass100_13.method8613(arg0, Static95.anInt1605, Static166.anInt3251);
		} else {
			Static548.aClass100_13.method8613(arg0, Static558.anInt8797, Static144.anInt2845);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method3034() {
		if (Static604.aClass45_2 != null) {
			Static604.aClass45_2.method7459();
		}
		if (Static599.aClass45_1 != null) {
			Static599.aClass45_1.method7459();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!gda;)V")
	public static void method3035(@OriginalArg(1) Class126 arg0) {
		Static582.anInt9371 = 0;
		Static250.anInt4568 = 0;
		Static618.aClass387_9 = new Class387();
		Static342.aClass4_Sub4_Sub1_Sub1Array1 = new Class4_Sub4_Sub1_Sub1[1024];
		Static68.aClass4_Sub9Array3 = new Class4_Sub9[Static445.anIntArray379[Static378.anInt6342] + 1];
		Static555.anInt8749 = 0;
		Static661.anInt10753 = 0;
		Static451.method6394(arg0);
		Static465.method6567(arg0);
	}
}

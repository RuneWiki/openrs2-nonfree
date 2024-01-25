import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static651 {

	@OriginalMember(owner = "client!waa", name = "d", descriptor = "F")
	public static float aFloat211;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_210 = new Class180(104, 5);

	@OriginalMember(owner = "client!waa", name = "g", descriptor = "I")
	public static int anInt10354 = 1;

	@OriginalMember(owner = "client!waa", name = "h", descriptor = "[I")
	public static final int[] anIntArray913 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!waa", name = "i", descriptor = "Z")
	public static boolean aBoolean779 = false;

	@OriginalMember(owner = "client!waa", name = "j", descriptor = "I")
	public static int anInt10355 = -1;

	@OriginalMember(owner = "client!waa", name = "k", descriptor = "I")
	public static int anInt10356 = 0;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public static void method9018(@OriginalArg(0) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static14.method198(local6.height, local6.width);
		if (Static76.anInt1404 == 1) {
			Static316.aClass13_10.method8445(arg0, Static561.anInt9112, Static454.anInt5692);
		} else {
			Static316.aClass13_10.method8445(arg0, Static617.anInt9892, Static519.anInt8360);
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(III)Z")
	public static boolean method9019(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static375.method5426(arg0, arg1) & Static41.method1053(arg0, arg1);
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(III)Z")
	public static boolean method9020(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static341.method5111(arg0, arg1) || Static156.method2847(arg0, arg1);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)V")
	public static void method9022() {
		for (@Pc(12) Class3_Sub40 local12 = (Class3_Sub40) Static244.aClass83_11.method2375(); local12 != null; local12 = (Class3_Sub40) Static244.aClass83_11.method2370()) {
			Static674.method9364(local12.anInt5753);
		}
	}
}

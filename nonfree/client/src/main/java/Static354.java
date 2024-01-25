import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Lclient!ha;")
	public static Class137 aClass137_31;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	public static int anInt6530;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	public static int anInt6540;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "Lclient!mea;")
	public static Class230 aClass230_5 = null;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "Z")
	public static boolean aBoolean460 = false;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public static void method5357(@OriginalArg(1) Canvas arg0) {
		@Pc(13) Dimension local13 = arg0.getSize();
		Static586.method8376(local13.width, local13.height);
		if (Static453.anInt7941 == 1) {
			Static117.aClass137_46.method7920(arg0, Static497.anInt10443, Static608.anInt10279);
		} else {
			Static117.aClass137_46.method7920(arg0, Static503.anInt8861, Static496.anInt8827);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!wia;I)I")
	public static int method5363(@OriginalArg(0) Class386 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method9206(Static550.anInt9398)) {
			local5++;
		}
		if (arg0.method9206(Static207.anInt3890)) {
			local5++;
		}
		if (arg0.method9206(Static499.anInt8831)) {
			local5++;
		}
		if (arg0.method9206(Static213.anInt4041)) {
			local5++;
		}
		if (arg0.method9206(Static420.anInt7569)) {
			local5++;
		}
		if (arg0.method9206(Static475.anInt8261)) {
			local5++;
		}
		if (arg0.method9206(Static506.anInt8938)) {
			local5++;
		}
		if (arg0.method9206(Static296.anInt6298)) {
			local5++;
		}
		if (arg0.method9206(Static465.anInt8177)) {
			local5++;
		}
		if (arg0.method9206(Static611.anInt10309)) {
			local5++;
		}
		if (arg0.method9206(Static200.anInt3716)) {
			local5++;
		}
		if (arg0.method9206(Static179.anInt3447)) {
			local5++;
		}
		if (arg0.method9206(Static604.anInt10202)) {
			local5++;
		}
		if (arg0.method9206(Static180.anInt3466)) {
			local5++;
		}
		if (arg0.method9206(Static401.anInt7388)) {
			local5++;
		}
		if (arg0.method9206(Static459.anInt8008)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method5373(@OriginalArg(0) String arg0) {
		@Pc(18) String local18 = Static479.method7116(Static523.method7520(arg0));
		if (local18 == null) {
			local18 = "";
		}
		return local18;
	}
}

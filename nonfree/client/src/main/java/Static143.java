import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static143 {

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "Lclient!am;")
	public static Class11 aClass11_66;

	@OriginalMember(owner = "client!jh", name = "w", descriptor = "Lclient!am;")
	public static Class11 aClass11_67;

	@OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
	public static int anInt3194;

	@OriginalMember(owner = "client!jh", name = "A", descriptor = "[Lclient!fd;")
	public static Class72[] aClass72Array2;

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString110 = "cyan:";

	@OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
	public static int anInt3193 = 0;

	@OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
	public static int anInt3195 = 0;

	@OriginalMember(owner = "client!jh", name = "E", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray11 = new Rectangle[100];

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!gl;ILclient!gl;)V")
	public static void method2799(@OriginalArg(0) Class4 arg0, @OriginalArg(2) Class4 arg1) {
		if (arg1.aClass4_248 != null) {
			arg1.method5667();
		}
		arg1.aClass4_248 = arg0.aClass4_248;
		arg1.aClass4_247 = arg0;
		arg1.aClass4_248.aClass4_247 = arg1;
		arg1.aClass4_247.aClass4_248 = arg1;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLclient!vm;Lclient!am;)V")
	public static void method2800(@OriginalArg(1) Class92 arg0, @OriginalArg(2) Class11 arg1) {
		if (Static297.aBoolean525) {
			return;
		}
		arg0.method4529(0);
		Static115.aClass60_10 = arg0.method4506(Static367.method5446(arg1, Static58.anInt1260));
		Static115.aClass60_10.method5675((Static202.anInt4258 - Static115.aClass60_10.method5683()) / 2, (Static38.anInt832 - Static115.aClass60_10.method5691()) / 2);
		Static333.aClass60_2 = arg0.method4506(Static367.method5446(arg1, Static186.anInt5633));
		Static333.aClass60_2.method5675((Static202.anInt4258 - Static333.aClass60_2.method5683()) / 2, 18);
		Static297.aBoolean525 = true;
	}

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "(I)I")
	public static int method2802() {
		return Static158.anInt3553;
	}
}

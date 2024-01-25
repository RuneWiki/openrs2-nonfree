import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas2;

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "Lclient!en;")
	public static Class65 aClass65_1;

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
	public static int anInt1565 = -1;

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "Z")
	public static volatile boolean aBoolean120 = false;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZII)Z")
	public static boolean method1353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static22.method343(arg1, arg0) | (arg0 & 0x60000) != 0 || Static226.method5385(arg1, arg0) || Static63.method1257(arg1, arg0);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1355(@OriginalArg(0) String arg0) {
		if (Static678.aClass111Array1 != null) {
			@Pc(20) Class14_Sub19 local20 = Static286.method4081(Static205.aClass394_1, Static28.aClass100_12);
			local20.aClass14_Sub29_Sub1_1.method5854(Static651.method9066(arg0));
			local20.aClass14_Sub29_Sub1_1.method5855(arg0);
			Static576.method8234(local20);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1356(@OriginalArg(1) String arg0) {
		Static149.method5512("", "", arg0, 0, 0, "");
	}
}

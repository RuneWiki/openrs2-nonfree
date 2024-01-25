import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!wo", name = "x", descriptor = "I")
	public static int anInt9594;

	@OriginalMember(owner = "client!wo", name = "z", descriptor = "Lclient!sv;")
	public static Class124 aClass124_4;

	@OriginalMember(owner = "client!wo", name = "B", descriptor = "I")
	public static int anInt9596;

	@OriginalMember(owner = "client!wo", name = "y", descriptor = "I")
	public static int anInt9595 = 0;

	@OriginalMember(owner = "client!wo", name = "A", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray61 = new String[100];

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!dj;ILjava/awt/Frame;)V")
	public static void method7945(@OriginalArg(0) Class71 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(15) Class55 local15 = arg0.method1986(arg1);
			while (local15.anInt1481 == 0) {
				Static17.method388(10L);
			}
			if (local15.anInt1481 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static17.method388(100L);
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IB)V")
	public static void method7947(@OriginalArg(0) int arg0) {
		Static460.anInt7980 = arg0;
		Static389.aClass125_52.method3440();
	}
}

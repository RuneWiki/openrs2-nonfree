import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "F")
	public static float aFloat145;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "[I")
	public static int[] anIntArray716;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_322 = new Class296(77, 7);

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
	public static int anInt7523 = -1;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Lclient!sm;")
	public static final Class271 aClass271_3 = new Class271();

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "Lclient!dh;")
	public static final Class64 aClass64_6 = new Class64("", 13);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZI)Z")
	public static boolean method6289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/awt/Frame;ILclient!gaa;)V")
	public static void method6290(@OriginalArg(0) Frame arg0, @OriginalArg(2) Class102 arg1) {
		while (true) {
			@Pc(10) Class157 local10 = arg1.method2405(arg0);
			while (local10.anInt4742 == 0) {
				Static209.method3565(10L);
			}
			if (local10.anInt4742 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static209.method3565(100L);
		}
	}
}

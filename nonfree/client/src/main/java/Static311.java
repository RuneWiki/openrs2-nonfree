import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!pq", name = "S", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!pq", name = "U", descriptor = "Lclient!oj;")
	public static Class174 aClass174_1;

	@OriginalMember(owner = "client!pq", name = "P", descriptor = "Lclient!tl;")
	public static Class4_Sub30 aClass4_Sub30_8 = new Class4_Sub30(1);

	@OriginalMember(owner = "client!pq", name = "R", descriptor = "F")
	public static float aFloat155 = 0.0F;

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(II)V")
	public static void method4306(@OriginalArg(1) int arg0) {
		Static435.anInt7257 = arg0;
		@Pc(11) Class69 local11 = Static51.aClass69_11;
		synchronized (Static51.aClass69_11) {
			Static51.aClass69_11.method1593();
		}
		local11 = Static67.aClass69_13;
		synchronized (Static67.aClass69_13) {
			Static67.aClass69_13.method1593();
		}
	}
}

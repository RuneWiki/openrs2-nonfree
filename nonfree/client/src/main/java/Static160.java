import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!jr", name = "P", descriptor = "[Lclient!kb;")
	public static Class52[] aClass52Array10;

	@OriginalMember(owner = "client!jr", name = "K", descriptor = "I")
	public static int anInt3333 = 0;

	@OriginalMember(owner = "client!jr", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString218 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!jr", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString219 = "Unable to find ";

	@OriginalMember(owner = "client!jr", name = "O", descriptor = "I")
	public static int anInt3335 = 1;

	@OriginalMember(owner = "client!jr", name = "Q", descriptor = "I")
	public static final int anInt3336 = 0;

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(II)V")
	public static void method3077(@OriginalArg(0) int arg0) {
		Static53.anInt1401 = arg0;
		@Pc(11) Class103 local11 = Static179.aClass103_30;
		synchronized (Static179.aClass103_30) {
			Static179.aClass103_30.method2678();
		}
	}
}

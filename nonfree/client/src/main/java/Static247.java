import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static247 {

	@OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
	public static int anInt4697;

	@OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
	public static int anInt4706;

	@OriginalMember(owner = "client!sj", name = "G", descriptor = "Lclient!bh;")
	public static Class15 aClass15_9;

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "Z")
	public static boolean aBoolean304 = false;

	@OriginalMember(owner = "client!sj", name = "m", descriptor = "Lclient!dh;")
	public static Class33 aClass33_35 = new Class33(16);

	@OriginalMember(owner = "client!sj", name = "w", descriptor = "Lclient!ra;")
	public static Class143 aClass143_2 = new Class143();

	@OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
	public static int anInt4704 = -1;

	@OriginalMember(owner = "client!sj", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString161 = "Close";

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!lc;I)V")
	public static void method3749(@OriginalArg(0) Class98 arg0) {
		Static193.aClass98_111 = arg0;
		Static142.anInt2925 = Static193.aClass98_111.method2394(16);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
	public static void method3750() {
		aClass143_2 = null;
		aClass15_9 = null;
		aString161 = null;
		aClass33_35 = null;
	}
}

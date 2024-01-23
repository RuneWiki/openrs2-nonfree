import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!el", name = "S", descriptor = "[Z")
	public static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!el", name = "gb", descriptor = "I")
	public static int anInt1739;

	@OriginalMember(owner = "client!el", name = "cb", descriptor = "Ljava/lang/String;")
	public static String aString64 = "Close";

	@OriginalMember(owner = "client!el", name = "eb", descriptor = "I")
	public static int anInt1737 = 0;

	@OriginalMember(owner = "client!el", name = "ib", descriptor = "Ljava/lang/String;")
	public static String aString65 = "Cancel";

	@OriginalMember(owner = "client!el", name = "jb", descriptor = "I")
	public static int anInt1741 = 0;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "(I)V")
	public static void method1332() {
		Static295.anIntArray562 = null;
		Static83.aByteArrayArrayArray6 = null;
		Static209.aByteArrayArrayArray18 = null;
		Static9.anIntArray300 = null;
		Static167.anIntArray364 = null;
		Static152.anIntArray341 = null;
		Static121.aByteArrayArrayArray7 = null;
		Static9.anIntArray299 = null;
		Static93.anIntArray202 = null;
		Static228.anIntArrayArrayArray14 = null;
		Static14.aByteArrayArrayArray3 = null;
		Static10.aByteArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(IIIII)V")
	public static void method1333(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub8_Sub10 local8 = Static92.method1633(10, arg2);
		local8.method2052();
		local8.anInt2700 = arg0;
		local8.anInt2698 = arg3;
		local8.anInt2702 = arg1;
	}
}

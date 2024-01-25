import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static341 {

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
	public static int anInt5632;

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
	public static int anInt5634;

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "Lclient!ng;")
	public static Class162 aClass162_5;

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "Lclient!rt;")
	public static final Class205 aClass205_2 = new Class205(0);

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIB)I")
	public static int method4850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static250.anIntArray534[arg1 & 0x3] : Static13.anIntArray19[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	public static void method4851() {
		Static177.method1119(Static241.aClass48_141);
		Static209.aClass1_Sub33_Sub2_2.method5138(Static68.anInt1378);
	}
}

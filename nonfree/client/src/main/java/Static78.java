import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static78 {

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
	public static int anInt1649;

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_18 = new Class46(79, 7);

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "Lclient!eda;")
	public static final Class87 aClass87_48 = new Class87(3000000, 200);

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V")
	public static void method1352(@OriginalArg(1) int arg0) {
		if (Static633.method8959(arg0)) {
			Static497.method7444(-1, Static519.aClass295ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[Ljava/awt/Rectangle;I)V")
	public static void method1354(@OriginalArg(0) int arg0, @OriginalArg(1) Rectangle[] arg1) throws Exception_Sub1 {
		if (Static483.anInt8236 == 1) {
			Static9.aClass133_1.method7239(arg1, arg0, Static601.anInt10083, Static212.anInt4040);
		} else {
			Static9.aClass133_1.method7239(arg1, arg0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)Lclient!sr;")
	public static Class5_Sub48 method1355() {
		return Static431.anInt6172 == 0 ? new Class5_Sub48() : Static586.aClass5_Sub48Array1[--Static431.anInt6172];
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method1356(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static10.anInt220 = 2;
		Static92.anInt1879 = arg0;
		Static567.method8234(arg2, arg1, false);
	}
}

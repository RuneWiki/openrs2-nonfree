import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
	public static int anInt1742;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "Lclient!fh;")
	public static Class58 aClass58_40;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "Lclient!wf;")
	public static Class189 aClass189_4;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)I")
	public static int method1323() {
		return Static281.anInt5331 == 0 ? 0 : Static254.anInterface2Array1[Static281.anInt5331].method3522();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!tf;B)V")
	public static void method1324(@OriginalArg(0) Class4_Sub6 arg0) {
		arg0.aBoolean289 = false;
		if (arg0.aClass4_Sub8_5 != null) {
			arg0.aClass4_Sub8_5.anInt4083 = 0;
		}
		for (@Pc(25) Class4_Sub6 local25 = arg0.method3363(); local25 != null; local25 = arg0.method3362()) {
			method1324(local25);
		}
	}
}

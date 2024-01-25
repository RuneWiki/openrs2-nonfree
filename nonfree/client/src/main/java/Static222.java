import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "(B)[Lclient!oo;")
	public static Class181[] method3120() {
		return new Class181[] { Static173.aClass181_3, Static380.aClass181_6, Static258.aClass181_4 };
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(IBI)V")
	public static void method3121(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class7_Sub4_Sub14 local12 = Static54.method750(arg1, 6);
		local12.method4716();
		local12.anInt5868 = arg0;
	}
}

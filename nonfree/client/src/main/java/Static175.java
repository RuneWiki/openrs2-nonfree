import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "Lclient!tr;")
	public static Class327 aClass327_1;

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
	public static int anInt3396 = 0;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIB)V")
	public static void method3055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static556.method8018(1, arg1);
		local8.method3608();
		local8.anInt4062 = arg0;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
	public static void method3056() {
		Static609.aBoolean712 = true;
	}
}

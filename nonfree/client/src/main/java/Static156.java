import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
	public static int anInt3237;

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "[I")
	public static int[] anIntArray148;

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
	public static int anInt3239;

	@OriginalMember(owner = "client!gb", name = "F", descriptor = "I")
	public static int anInt3242;

	@OriginalMember(owner = "client!gb", name = "H", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array7;

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "Lclient!hf;")
	public static final Class136 aClass136_5 = new Class136();

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
	public static void method2906(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub5_Sub16 local8 = Static219.method3587(arg0, 2);
		local8.method7134();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)V")
	public static void method2907(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub5_Sub16 local12 = Static219.method3587(arg0, 4);
		local12.method7134();
	}
}

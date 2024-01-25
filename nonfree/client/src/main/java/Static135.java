import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_77 = new Class151(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	public static void method1815() {
		Static5.method94(Static206.aClass137_143);
		Static75.aClass1_Sub11_Sub1_1.method4445(0);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)Lclient!kl;")
	public static Class139 method1817(@OriginalArg(0) int arg0) {
		@Pc(10) Class139 local10 = (Class139) Static188.aClass167_49.method3386((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static85.aClass113_87.method2274(0, arg0);
		local10 = new Class139();
		if (local28 != null) {
			local10.method2812(arg0, new Class1_Sub11(local28));
		}
		Static188.aClass167_49.method3392(local10, (long) arg0);
		return local10;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!ts", name = "C", descriptor = "I")
	public static int anInt6337;

	@OriginalMember(owner = "client!ts", name = "P", descriptor = "I")
	public static int anInt6348;

	@OriginalMember(owner = "client!ts", name = "E", descriptor = "Lclient!qd;")
	public static final Class200 aClass200_11 = new Class200("", 13);

	@OriginalMember(owner = "client!ts", name = "M", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_84 = new Class179(38, -1);

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIB)V")
	public static void method5281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class1_Sub2_Sub6 local16 = Static371.method5808(16, arg0);
		local16.method1778();
		local16.anInt2056 = arg1;
	}
}

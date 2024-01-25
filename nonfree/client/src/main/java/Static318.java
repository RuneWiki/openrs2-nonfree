import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!md", name = "c", descriptor = "I")
	public static int anInt5754;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_117 = new Class298(35, 11);

	@OriginalMember(owner = "client!md", name = "k", descriptor = "Lclient!ia;")
	public static final Class140 aClass140_9 = new Class140();

	@OriginalMember(owner = "client!md", name = "m", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_118 = new Class298(32, 12);

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIII)V")
	public static void method4966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class217 local14 = Static370.aClass217ArrayArray1[arg2][arg0];
		Static468.method6470(local14 == null ? Static100.aClass217_2 : local14, arg1);
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(II)I")
	public static int method4968(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}

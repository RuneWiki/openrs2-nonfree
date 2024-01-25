import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!of", name = "u", descriptor = "Lclient!mc;")
	public static Class3_Sub32 aClass3_Sub32_2;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "I")
	public static int anInt6351 = 0;

	@OriginalMember(owner = "client!of", name = "h", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_134 = new Class298(77, 1);

	@OriginalMember(owner = "client!of", name = "r", descriptor = "[I")
	public static final int[] anIntArray510 = new int[32];

	@OriginalMember(owner = "client!of", name = "t", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_203 = new Class272(38, 8);

	@OriginalMember(owner = "client!of", name = "v", descriptor = "[Lclient!qh;")
	public static final Class3_Sub11[] aClass3_Sub11Array1 = new Class3_Sub11[2048];

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V")
	public static void method5530(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static363.method5457(0, 15);
		local8.method839();
		local8.anInt1088 = arg1;
		local8.anInt1091 = arg0;
	}
}

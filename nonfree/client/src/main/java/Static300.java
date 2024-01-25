import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "[I")
	public static final int[] anIntArray474 = new int[1];

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "Lclient!qc;")
	public static final Class231 aClass231_47 = new Class231(4);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
	public static void method4725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static294.anInt5413 = arg1 - Static201.anInt198;
		Static467.anInt8412 = arg0 - Static201.anInt205;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(III)Z")
	public static boolean method4726(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(25) boolean local25 = (arg1 & 0x37) == 0 ? Static154.method2641(arg0, arg1) : Static215.method6802(arg1, arg0);
		return local25 | (arg0 & 0x10000) != 0 | Static262.method6141(arg1, arg0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4727(@OriginalArg(0) String arg0) {
		System.exit(1);
	}
}

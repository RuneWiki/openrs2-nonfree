import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
	public static int anInt3559 = 0;

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "Lclient!bn;")
	public static final Class24 aClass24_3 = new Class24();

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "[I")
	public static final int[] anIntArray266 = new int[250];

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)Lclient!fm;")
	public static Class25_Sub2 method3304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class51 local7 = Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass25_Sub2_1;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIB)V")
	public static void method3306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static56.aClass66_19 = new Class66(arg0);
		Static38.aClass66_11 = new Class66(arg1);
	}
}

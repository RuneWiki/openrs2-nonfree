import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!am", name = "o", descriptor = "I")
	public static int anInt226;

	@OriginalMember(owner = "client!am", name = "u", descriptor = "Lclient!hf;")
	public static Class103 aClass103_1;

	@OriginalMember(owner = "client!am", name = "g", descriptor = "Lclient!mf;")
	public static final Class163 aClass163_2 = new Class163();

	@OriginalMember(owner = "client!am", name = "n", descriptor = "[I")
	public static final int[] anIntArray13 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!am", name = "p", descriptor = "Lclient!s;")
	public static final Class217 aClass217_9 = new Class217(101, 9);

	@OriginalMember(owner = "client!am", name = "r", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_8 = new Class27(0, 11);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIII)V")
	public static void method169(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class10_Sub1_Sub17 local8 = Static154.method2630(4, arg3);
		local8.method5345();
		local8.anInt6806 = arg1;
		local8.anInt6813 = arg0;
		local8.anInt6807 = arg2;
	}
}

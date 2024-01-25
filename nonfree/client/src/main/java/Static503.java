import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Lclient!qo;")
	public static Class243 aClass243_8;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Lclient!kda;")
	public static Class160 aClass160_97;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	public static int anInt8544;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
	public static int anInt8542 = 0;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "[I")
	public static final int[] anIntArray698 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
	public static void method7222(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub1_Sub13 local16 = Static476.method6225(2, arg0);
		local16.method4925();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public static void method7223() {
		@Pc(8) Class1_Sub1_Sub13 local8 = Static476.method6225(15, 0);
		local8.method4925();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)Lclient!hu;")
	public static Class47_Sub4 method7224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class206 local7 = Static313.aClass206ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass47_Sub4_2;
	}
}

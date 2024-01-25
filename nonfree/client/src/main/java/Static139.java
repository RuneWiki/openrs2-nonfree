import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
	public static int anInt2672;

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "[I")
	public static final int[] anIntArray178 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_82 = new Class186(3, -2);

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
	public static int anInt2670 = 0;

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "F")
	public static float aFloat80 = 0.25F;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIILclient!lf;)V")
	public static void method2007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6_Sub4 arg3) {
		@Pc(4) Class53 local4 = Static444.method5715(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass6_Sub4_1 = arg3;
		}
	}
}

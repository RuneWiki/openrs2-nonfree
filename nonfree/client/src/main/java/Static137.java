import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!gn", name = "S", descriptor = "I")
	public static int anInt2870;

	@OriginalMember(owner = "client!gn", name = "T", descriptor = "I")
	public static int anInt2871;

	@OriginalMember(owner = "client!gn", name = "V", descriptor = "I")
	public static int anInt2872;

	@OriginalMember(owner = "client!gn", name = "P", descriptor = "Lclient!s;")
	public static final Class217 aClass217_62 = new Class217(3, 6);

	@OriginalMember(owner = "client!gn", name = "Q", descriptor = "F")
	public static float aFloat51 = 1.0F;

	@OriginalMember(owner = "client!gn", name = "R", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_53 = new Class27(60, -1);

	@OriginalMember(owner = "client!gn", name = "U", descriptor = "[I")
	public static final int[] anIntArray286 = new int[200];

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)Lclient!ne;")
	public static Class24_Sub1 method2391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class11 local7 = Static309.aClass11ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass24_Sub1_2;
	}
}

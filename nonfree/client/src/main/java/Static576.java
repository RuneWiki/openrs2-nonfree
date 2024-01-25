import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!tl", name = "N", descriptor = "Lclient!ha;")
	public static Class132 aClass132_15;

	@OriginalMember(owner = "client!tl", name = "E", descriptor = "I")
	public static final int anInt9503 = 50;

	@OriginalMember(owner = "client!tl", name = "D", descriptor = "[I")
	public static final int[] anIntArray633 = new int[anInt9503];

	@OriginalMember(owner = "client!tl", name = "J", descriptor = "[I")
	public static final int[] anIntArray634 = new int[anInt9503];

	@OriginalMember(owner = "client!tl", name = "K", descriptor = "[I")
	public static final int[] anIntArray635 = new int[anInt9503];

	@OriginalMember(owner = "client!tl", name = "L", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray59 = new String[anInt9503];

	@OriginalMember(owner = "client!tl", name = "M", descriptor = "[F")
	public static final float[] aFloatArray71 = new float[4];

	@OriginalMember(owner = "client!tl", name = "O", descriptor = "[I")
	public static final int[] anIntArray636 = new int[anInt9503];

	@OriginalMember(owner = "client!tl", name = "P", descriptor = "[I")
	public static final int[] anIntArray637 = new int[anInt9503];

	@OriginalMember(owner = "client!tl", name = "Q", descriptor = "[I")
	public static final int[] anIntArray638 = new int[anInt9503];

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IBI)V")
	public static void method8004(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class6_Sub4_Sub18 local9 = Static565.method7924((long) arg0, 1);
		local9.method7976();
		local9.anInt9466 = arg1;
	}
}

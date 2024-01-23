import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!v", name = "m", descriptor = "I")
	public static int anInt5322;

	@OriginalMember(owner = "client!v", name = "s", descriptor = "[[[Lclient!pi;")
	public static Class1_Sub26[][][] aClass1_Sub26ArrayArrayArray3;

	@OriginalMember(owner = "client!v", name = "n", descriptor = "Z")
	public static boolean aBoolean401 = false;

	@OriginalMember(owner = "client!v", name = "p", descriptor = "[I")
	public static int[] anIntArray506 = new int[64];

	@OriginalMember(owner = "client!v", name = "q", descriptor = "I")
	public static int anInt5323 = 0;

	@OriginalMember(owner = "client!v", name = "w", descriptor = "I")
	public static int anInt5327 = 1;

	@OriginalMember(owner = "client!v", name = "x", descriptor = "I")
	public static int anInt5328 = 0;

	@OriginalMember(owner = "client!v", name = "y", descriptor = "[Z")
	public static boolean[] aBooleanArray51 = new boolean[100];

	@OriginalMember(owner = "client!v", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString309 = "Loading...";

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIZIIIIF)[[I")
	public static int[][] method4166(@OriginalArg(8) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class1_Sub3_Sub23 local13 = new Class1_Sub3_Sub23();
		local13.anInt3538 = 8;
		local13.aBoolean257 = false;
		local13.anInt3536 = 3;
		local13.anInt3543 = 4;
		local13.anInt3541 = (int) (arg0 * 4096.0F);
		local13.method4447();
		Static92.method1623(64, 256);
		for (@Pc(42) int local42 = 0; local42 < 256; local42++) {
			local13.method2856(local9[local42], local42);
		}
		return local9;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Lclient!fa;")
	public static Class41_Sub1 method4167() {
		Static171.anInt3644 = 0;
		return Static261.method4005();
	}
}

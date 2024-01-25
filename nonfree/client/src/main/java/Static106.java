import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "Lclient!gp;")
	public static Class75 aClass75_1;

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
	public static int anInt2306;

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray5 = new int[2][][];

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
	public static int anInt2305 = 0;

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
	public static int anInt2308 = 0;

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!gn", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString146 = "Drop";

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZIIIIIIIF)[[I")
	public static int[][] method2151(@OriginalArg(8) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class5_Sub2_Sub29 local13 = new Class5_Sub2_Sub29();
		local13.anInt5242 = (int) (arg0 * 4096.0F);
		local13.anInt5239 = 8;
		local13.aBoolean400 = false;
		local13.anInt5235 = 3;
		local13.anInt5237 = 4;
		local13.method5811();
		Static319.method5393(64, 256);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local13.method4619(local9[local45], local45);
		}
		return local9;
	}
}

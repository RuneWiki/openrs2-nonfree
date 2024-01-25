import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "Z")
	public static boolean aBoolean314;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "Lclient!aa;")
	public static Class2 aClass2_24;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "I")
	public static int anInt4727;

	@OriginalMember(owner = "client!me", name = "j", descriptor = "[I")
	public static final int[] anIntArray373 = new int[14];

	@OriginalMember(owner = "client!me", name = "q", descriptor = "[Lclient!ch;")
	public static final Class37[] aClass37Array1 = new Class37[4];

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)I")
	public static int method4024(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
	public static void method4026() {
		Static182.aClass30_12.MA(Static354.aFloat85 * ((float) Static157.aClass185_Sub1_1.anInt5565 * 0.1F + 0.7F));
		Static182.aClass30_12.la(Static352.anInt6230, Static13.aFloat4, Static122.aFloat58, (float) (Static11.anInt208 << 0), (float) (Static129.anInt2664 << 0), (float) (Static221.anInt4446 << 0));
		Static182.aClass30_12.method2067(Static254.aClass41_4);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
	public static void method4029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static294.aClass162ArrayArrayArray2[0][arg1][arg2] != null && Static294.aClass162ArrayArrayArray2[0][arg1][arg2].aClass162_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static294.aClass162ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(46) Class162 local46 = Static294.aClass162ArrayArrayArray2[local22][arg1][arg2] = new Class162(local22, arg1, arg2);
				if (local20) {
					local46.aByte59++;
				}
			}
		}
	}
}

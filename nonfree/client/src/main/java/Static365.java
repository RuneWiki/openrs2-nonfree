import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
	public static int anInt6310;

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
	public static int anInt6311;

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "Lclient!id;")
	public static final Class104 aClass104_4 = new Class104(0);

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray57 = new int[6][];

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZBII)Ljava/lang/String;")
	public static String method4925(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		for (@Pc(38) int local38 = arg0 / 10; local38 != 0; local38 /= 10) {
			local34++;
		}
		@Pc(53) char[] local53 = new char[local34];
		local53[0] = '+';
		for (@Pc(61) int local61 = local34 - 1; local61 > 0; local61--) {
			@Pc(65) int local65 = arg0;
			arg0 /= 10;
			@Pc(75) int local75 = local65 - arg0 * 10;
			if (local75 < 10) {
				local53[local61] = (char) (local75 + 48);
			} else {
				local53[local61] = (char) (local75 + 87);
			}
		}
		return new String(local53);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIZBIFI)[[I")
	public static int[][] method4927(@OriginalArg(7) float arg0) {
		@Pc(14) int[][] local14 = new int[256][64];
		@Pc(18) Class4_Sub6_Sub10 local18 = new Class4_Sub6_Sub10();
		local18.anInt2702 = (int) (arg0 * 4096.0F);
		local18.aBoolean248 = false;
		local18.anInt2698 = 3;
		local18.anInt2706 = 4;
		local18.anInt2699 = 8;
		local18.method5509();
		Static286.method3974(256, 64);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local18.method2283(local14[local45], local45);
		}
		return local14;
	}
}

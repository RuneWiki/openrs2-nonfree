import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!di", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString73;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "Z")
	public static volatile boolean aBoolean510 = false;

	@OriginalMember(owner = "client!di", name = "d", descriptor = "I")
	public static final int anInt7225 = 0;

	@OriginalMember(owner = "client!di", name = "g", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_104 = new Class146(7, 6);

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!qc;II)V")
	public static void method5806(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1) {
		if (Static240.aBoolean300) {
			Static240.aBoolean300 = false;
			arg1 = 0;
		}
		if (Static417.aClass206_2 != null && Static417.aClass206_2.method4233(arg0)) {
			return;
		}
		Static417.aClass206_2 = arg0;
		Static179.aLong89 = Static266.method3498();
		Static311.anInt5076 = arg1;
		Static364.anInt6037 = arg1;
		if (Static364.anInt6037 != 0) {
			Static24.anInt373 = Static34.anInt2152;
			Static101.aFloat22 = Static214.aFloat44;
			Static54.aFloat16 = Static4.aFloat5;
			Static398.aClass3_6 = Static374.aClass3_5;
			Static397.anInt6471 = Static56.anInt965;
			Static117.anInt2122 = Static450.anInt7528;
			Static375.aFloat72 = Static363.aFloat68;
			Static284.aFloat52 = Static309.aFloat57;
			Static440.aFloat101 = Static427.aFloat28;
			Static252.aFloat47 = Static131.aFloat25;
			return;
		}
		Static353.method4678();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([BIIIIBI)Z")
	public static boolean method5808(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(14) int local14 = arg2 % 8;
		@Pc(24) int local24;
		if (local14 == 0) {
			local24 = 0;
		} else {
			local24 = 8 - local14;
		}
		@Pc(37) int local37 = -((arg4 + 8 - 1) / 8);
		@Pc(46) int local46 = -((arg2 + 8 - 1) / 8);
		for (@Pc(48) int local48 = local37; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local46; local52 < 0; local52++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local24;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg3;
		}
		return false;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "Lclient!rl;")
	public static Class203 aClass203_1;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "Lclient!ju;")
	public static final Class1_Sub21 aClass1_Sub21_1 = new Class1_Sub21(0, 0);

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_87 = new Class237(59, -2);

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)Z")
	public static boolean method4077(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII)I")
	public static int method4078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static92.aClass136Array1 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg0 >> 7;
		@Pc(20) int local20 = arg1 >> 7;
		if (local16 < 0 || local20 < 0 || local16 > Static135.anInt2314 - 1 || Static352.anInt6022 - 1 < local20) {
			return 0;
		}
		@Pc(52) int local52 = arg2;
		if (arg2 < 3 && (Static184.aByteArrayArrayArray3[1][local16][local20] & 0x2) != 0) {
			local52 = arg2 + 1;
		}
		return Static92.aClass136Array1[local52].va(arg0, arg1);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!oa;Ljava/lang/String;IZ)V")
	public static void method4079(@OriginalArg(0) Class129 arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(20) int local20 = Static98.aClass101_2.method1973(null, 250, arg1);
		@Pc(29) int local29 = Static98.aClass101_2.method1964(250, null, arg1) * 13;
		Static276.aClass109_10.NA(6, 6, local20 + 4 + 4, local29 - -8, -16777216, 0);
		Static276.aClass109_10.method4685(6, 6, local20 + 4 + 4, local29 + 4 + 4, -1, 0);
		arg0.method5830(-1, null, null, local29, 0, 10, null, 1, -1, 0, arg1, local20, 10);
		Static377.method5166(local20 + 8, 6, local29 + 4 + 4, 6);
		if (arg2) {
			Static276.aClass109_10.method4704();
		}
	}
}

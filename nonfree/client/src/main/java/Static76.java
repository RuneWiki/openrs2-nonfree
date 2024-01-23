import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
	public static int anInt5720;

	@OriginalMember(owner = "client!fd", name = "ib", descriptor = "I")
	public static int anInt5738;

	@OriginalMember(owner = "client!fd", name = "Cb", descriptor = "[I")
	public static int[] anIntArray649;

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray40 = new String[8];

	@OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
	public static int anInt5724 = 0;

	@OriginalMember(owner = "client!fd", name = "V", descriptor = "I")
	public static int anInt5725 = 0;

	@OriginalMember(owner = "client!fd", name = "nb", descriptor = "I")
	public static int anInt5743 = 0;

	@OriginalMember(owner = "client!fd", name = "wb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray41 = new String[] { "en", "de", "fr", "pt" };

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIILclient!vh;BIII)V")
	public static void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class184 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) int local9 = arg2 & 0x3;
		@Pc(20) int local20;
		@Pc(23) int local23;
		if (local9 == 1 || local9 == 3) {
			local20 = arg4.anInt5517;
			local23 = arg4.anInt5528;
		} else {
			local20 = arg4.anInt5528;
			local23 = arg4.anInt5517;
		}
		@Pc(44) int local44;
		@Pc(52) int local52;
		if (local20 + arg0 <= 104) {
			local44 = (local20 >> 1) + arg0;
			local52 = arg0 + (local20 + 1 >> 1);
		} else {
			local52 = arg0 + 1;
			local44 = arg0;
		}
		@Pc(74) int local74;
		@Pc(82) int local82;
		if (arg6 + local23 <= 104) {
			local74 = (local23 >> 1) + arg6;
			local82 = (local23 + 1 >> 1) + arg6;
		} else {
			local82 = arg6 + 1;
			local74 = arg6;
		}
		@Pc(98) int local98 = (local23 << 6) + (arg6 << 7);
		@Pc(102) int[][] local102 = Static243.anIntArrayArrayArray13[arg3];
		@Pc(111) int local111 = (arg0 << 7) + (local20 << 6);
		@Pc(138) int local138 = local102[local44][local82] + local102[local52][local74] + local102[local44][local74] + local102[local52][local82] >> 2;
		@Pc(140) int local140 = 0;
		@Pc(152) int[][] local152;
		if (arg3 != 0) {
			local152 = Static243.anIntArrayArrayArray13[0];
			local140 = local138 - (local152[local44][local82] + local152[local44][local74] + local152[local52][local74] + local152[local52][local82] >> 2);
		}
		local152 = null;
		if (arg3 < 3) {
			local152 = Static243.anIntArrayArrayArray13[arg3 + 1];
		}
		@Pc(212) Class97 local212 = arg4.method4487(local111, false, arg7, local138, local102, local152, true, arg2, local98, null);
		Static74.method1210(local212.aClass56_Sub1_3, local111 - arg1, local140, local98 - arg5);
	}

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "(I)V")
	public static void method4656() {
		if (Static133.anInt2574 == 5) {
			Static133.anInt2574 = 6;
		}
	}
}

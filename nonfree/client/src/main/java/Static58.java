import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!co", name = "a", descriptor = "I")
	public static int anInt4348 = 0;

	@OriginalMember(owner = "client!co", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[200];

	@OriginalMember(owner = "client!co", name = "j", descriptor = "I")
	public static int anInt4352 = 0;

	@OriginalMember(owner = "client!co", name = "l", descriptor = "Lclient!ss;")
	public static final Class223 aClass223_11 = new Class223(14, 1);

	@OriginalMember(owner = "client!co", name = "m", descriptor = "Lclient!ss;")
	public static final Class223 aClass223_12 = new Class223(15, 4);

	@OriginalMember(owner = "client!co", name = "n", descriptor = "Lclient!ss;")
	public static final Class223 aClass223_13 = new Class223(16, -2);

	@OriginalMember(owner = "client!co", name = "o", descriptor = "Lclient!ss;")
	public static final Class223 aClass223_14 = new Class223(17, 0);

	@OriginalMember(owner = "client!co", name = "p", descriptor = "Lclient!ss;")
	public static final Class223 aClass223_15 = new Class223(18, -2);

	@OriginalMember(owner = "client!co", name = "q", descriptor = "Lclient!ss;")
	public static final Class223 aClass223_16 = new Class223(20, 6);

	@OriginalMember(owner = "client!co", name = "r", descriptor = "Lclient!ss;")
	public static final Class223 aClass223_17 = new Class223(21, 8);

	@OriginalMember(owner = "client!co", name = "s", descriptor = "Lclient!ss;")
	public static final Class223 aClass223_18 = new Class223(22, -2);

	@OriginalMember(owner = "client!co", name = "t", descriptor = "Lclient!ss;")
	public static final Class223 aClass223_19 = new Class223(23, 4);

	@OriginalMember(owner = "client!co", name = "u", descriptor = "Lclient!ss;")
	public static final Class223 aClass223_20 = new Class223(24, -1);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!hu;ILclient!tl;B)V")
	public static void method3287(@OriginalArg(0) Class114 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub30 arg2) {
		@Pc(9) Class4_Sub33 local9 = new Class4_Sub33();
		local9.anInt5718 = arg2.method4864();
		local9.anInt5719 = arg2.method4872();
		local9.aClass108Array2 = new Class108[local9.anInt5718];
		local9.anIntArray494 = new int[local9.anInt5718];
		local9.aClass108Array1 = new Class108[local9.anInt5718];
		local9.anIntArray496 = new int[local9.anInt5718];
		local9.anIntArray495 = new int[local9.anInt5718];
		local9.aByteArrayArrayArray10 = new byte[local9.anInt5718][][];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt5718; local56++) {
			try {
				@Pc(62) int local62 = arg2.method4864();
				@Pc(89) String local89;
				@Pc(93) String local93;
				@Pc(97) int local97;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local89 = arg2.method4867();
					local93 = arg2.method4867();
					local97 = 0;
					if (local62 == 1) {
						local97 = arg2.method4872();
					}
					local9.anIntArray494[local56] = local62;
					local9.anIntArray496[local56] = local97;
					local9.aClass108Array2[local56] = arg0.method2357(Static31.method580(local89), local93);
				} else if (local62 == 3 || local62 == 4) {
					local89 = arg2.method4867();
					local93 = arg2.method4867();
					local97 = arg2.method4864();
					@Pc(100) String[] local100 = new String[local97];
					for (@Pc(102) int local102 = 0; local102 < local97; local102++) {
						local100[local102] = arg2.method4867();
					}
					@Pc(117) byte[][] local117 = new byte[local97][];
					@Pc(130) int local130;
					if (local62 == 3) {
						for (@Pc(124) int local124 = 0; local124 < local97; local124++) {
							local130 = arg2.method4872();
							local117[local124] = new byte[local130];
							arg2.method4863(local130, local117[local124]);
						}
					}
					local9.anIntArray494[local56] = local62;
					@Pc(155) Class[] local155 = new Class[local97];
					for (local130 = 0; local130 < local97; local130++) {
						local155[local130] = Static31.method580(local100[local130]);
					}
					local9.aClass108Array1[local56] = arg0.method2348(local155, local93, Static31.method580(local89));
					local9.aByteArrayArrayArray10[local56] = local117;
				}
			} catch (@Pc(242) ClassNotFoundException local242) {
				local9.anIntArray495[local56] = -1;
			} catch (@Pc(249) SecurityException local249) {
				local9.anIntArray495[local56] = -2;
			} catch (@Pc(256) NullPointerException local256) {
				local9.anIntArray495[local56] = -3;
			} catch (@Pc(263) Exception local263) {
				local9.anIntArray495[local56] = -4;
			} catch (@Pc(270) Throwable local270) {
				local9.anIntArray495[local56] = -5;
			}
		}
		Static178.aClass258_27.method5526(local9);
	}
}

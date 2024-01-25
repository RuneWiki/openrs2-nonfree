import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "Lclient!ia;")
	public static Class140 aClass140_4;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "F")
	public static float aFloat62;

	@OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
	public static int anInt3259;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	public static final int anInt3254 = 50;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "[I")
	public static final int[] anIntArray272 = new int[anInt3254];

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_96 = new Class272(18, -1);

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "[I")
	public static final int[] anIntArray273 = new int[anInt3254];

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "[I")
	public static final int[] anIntArray274 = new int[32];

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "[I")
	public static final int[] anIntArray275 = new int[anInt3254];

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "[I")
	public static final int[] anIntArray276 = new int[anInt3254];

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "[I")
	public static final int[] anIntArray277 = new int[anInt3254];

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "Z")
	public static final boolean aBoolean266 = false;

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray21 = new String[anInt3254];

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "[I")
	public static final int[] anIntArray278 = new int[anInt3254];

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = arg1 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(34) int local34 = local7 * (Static128.aShort41 - Static477.aShort107) / 100 + Static477.aShort107;
		@Pc(45) int local45 = local34 * arg2 >> 8;
		@Pc(51) int local51 = 16384 - arg0 & 0x3FFF;
		@Pc(58) int local58 = 16384 - arg4 & 0x3FFF;
		@Pc(60) int local60 = 0;
		@Pc(62) int local62 = 0;
		@Pc(64) int local64 = local45;
		if (local51 != 0) {
			local62 = Class3_Sub17.anIntArray175[local51] * -local45 >> 14;
			local64 = Class3_Sub17.anIntArray177[local51] * local45 >> 14;
		}
		if (local58 != 0) {
			local60 = local64 * Class3_Sub17.anIntArray175[local58] >> 14;
			local64 = local64 * Class3_Sub17.anIntArray177[local58] >> 14;
		}
		Static154.anInt3150 = arg4;
		Static68.anInt4065 = 0;
		Static37.anInt878 = arg0;
		Static545.anInt8633 = arg6 - local62;
		Static421.anInt7061 = arg5 - local60;
		Static233.anInt4431 = arg3 - local64;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII[BIZI[B)V")
	public static void method2891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(18) int local18 = -arg5; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg2++;
				arg7[local26] += arg4[arg0++];
				@Pc(38) int local38 = arg2++;
				arg7[local38] += arg4[arg0++];
				@Pc(50) int local50 = arg2++;
				arg7[local50] += arg4[arg0++];
				@Pc(62) int local62 = arg2++;
				arg7[local62] += arg4[arg0++];
			}
			for (@Pc(77) int local77 = local15; local77 < 0; local77++) {
				local26 = arg2++;
				arg7[local26] += arg4[arg0++];
			}
			arg0 += arg1;
			arg2 += arg6;
		}
	}
}

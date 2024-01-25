import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!tr", name = "o", descriptor = "Lclient!ig;")
	public static Class133 aClass133_147;

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "Z")
	public static boolean aBoolean578 = false;

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_107 = new Class158(68, 3);

	@OriginalMember(owner = "client!tr", name = "q", descriptor = "Z")
	public static boolean aBoolean580 = false;

	@OriginalMember(owner = "client!tr", name = "u", descriptor = "[F")
	public static final float[] aFloatArray67 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!tr", name = "v", descriptor = "[F")
	public static final float[] aFloatArray68 = new float[4];

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IB)C")
	public static char method6742(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(47) char local47 = Static81.aCharArray4[local7 - 128];
			if (local47 == '\u0000') {
				local47 = '?';
			}
			local7 = local47;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)V")
	public static void method6743(@OriginalArg(0) int arg0) {
		Static469.anInt8466 = arg0;
		Static106.anInt2360 = 100;
		Static213.anInt4694 = -1;
		Static307.anInt4841 = 3;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIII)V")
	public static void method6744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class290 local7 = Static279.aClass290ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class6_Sub4 local13 = local7.aClass6_Sub4_3;
		@Pc(16) Class6_Sub4 local16 = local7.aClass6_Sub4_2;
		if (local13 != null) {
			local13.anInt9340 = local13.anInt9340 * arg3 / (0x10 << Static33.anInt880 - 7);
			local13.anInt9335 = local13.anInt9335 * arg3 / (0x10 << Static33.anInt880 - 7);
		}
		if (local16 != null) {
			local16.anInt9340 = local16.anInt9340 * arg3 / (0x10 << Static33.anInt880 - 7);
			local16.anInt9335 = local16.anInt9335 * arg3 / (0x10 << Static33.anInt880 - 7);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IBIIII)V")
	public static void method6745(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg4 + 1;
		Static257.method4540(Static68.anIntArrayArray24[arg4], arg1, arg3, arg0);
		@Pc(18) int local18 = arg2 - 1;
		Static257.method4540(Static68.anIntArrayArray24[arg2], arg1, arg3, arg0);
		for (@Pc(25) int local25 = local5; local25 <= local18; local25++) {
			@Pc(31) int[] local31 = Static68.anIntArrayArray24[local25];
			local31[arg3] = local31[arg0] = arg1;
		}
	}
}

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!se", name = "W", descriptor = "[Lclient!uj;")
	public static Class4_Sub3_Sub14[] aClass4_Sub3_Sub14Array12;

	@OriginalMember(owner = "client!se", name = "Y", descriptor = "Ljava/lang/String;")
	public static String aString298;

	@OriginalMember(owner = "client!se", name = "Z", descriptor = "Lclient!fh;")
	public static Class58 aClass58_90;

	@OriginalMember(owner = "client!se", name = "db", descriptor = "Ljava/lang/String;")
	public static String aString299;

	@OriginalMember(owner = "client!se", name = "eb", descriptor = "I")
	public static int anInt4794;

	@OriginalMember(owner = "client!se", name = "fb", descriptor = "I")
	public static int anInt4795;

	@OriginalMember(owner = "client!se", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString297 = "Loading textures - ";

	@OriginalMember(owner = "client!se", name = "ab", descriptor = "[I")
	public static int[] anIntArray517 = new int[200];

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!fd;I)V")
	public static void method3986(@OriginalArg(0) Class4_Sub10 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static12.aClass193_1 != null) {
			try {
				Static12.aClass193_1.method4835(0L);
				Static12.aClass193_1.method4840(local8);
				@Pc(32) int local32;
				for (local32 = 0; local32 < 24 && local8[local32] == 0; local32++) {
				}
				if (local32 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(56) Exception local56) {
				for (@Pc(58) int local58 = 0; local58 < 24; local58++) {
					local8[local58] = -1;
				}
			}
		}
		arg0.method4631(local8, 24);
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(II)V")
	public static void method3988() {
		Static68.aClass26_12.method517(5);
		Static138.aClass26_27.method517(5);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLclient!fd;)Lclient!in;")
	public static Class11_Sub4 method3990(@OriginalArg(1) Class4_Sub10 arg0) {
		return new Class11_Sub4(arg0.method4613(), arg0.method4613(), arg0.method4613(), arg0.method4613(), arg0.method4613(), arg0.method4613(), arg0.method4613(), arg0.method4613(), arg0.method4655(), arg0.method4666());
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3991(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg5 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(32) int local32 = local7 * (Static98.aShort12 - Static110.aShort13) / 100 + Static110.aShort13;
		@Pc(38) int local38 = arg3 * local32 >> 8;
		@Pc(44) int local44 = 2048 - arg0 & 0x7FF;
		@Pc(46) int local46 = 0;
		@Pc(53) int local53 = 2048 - arg2 & 0x7FF;
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = local38;
		@Pc(67) int local67;
		@Pc(71) int local71;
		if (local53 != 0) {
			local67 = Class111.anIntArray299[local53];
			local71 = Class111.anIntArray298[local53];
			local46 = -local38 * local67 >> 16;
			local57 = local38 * local71 >> 16;
		}
		if (local44 != 0) {
			local71 = Class111.anIntArray298[local44];
			local67 = Class111.anIntArray299[local44];
			local55 = local57 * local67 >> 16;
			local57 = local57 * local71 >> 16;
		}
		Static302.anInt5682 = arg4 - local57;
		Static82.anInt1931 = arg1 - local46;
		Static129.anInt2519 = arg6 - local55;
		Static193.anInt3656 = arg0;
		Static207.anInt4066 = arg2;
	}
}

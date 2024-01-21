import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
	public static int anInt4027;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2405 = Static118.method2249("Cancel");

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2404 = aClass65_2405;

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean161 = true;

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
	public static int anInt4028 = 0;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "[I")
	public static final int[] anIntArray459 = new int[2000];

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public static void method3028() {
		@Pc(7) boolean local7 = false;
		while (!local7) {
			local7 = true;
			for (@Pc(13) int local13 = 0; local13 < Static101.anInt2533 - 1; local13++) {
				if (Static162.aShortArray52[local13] < 1000 && Static162.aShortArray52[local13 + 1] > 1000) {
					local7 = false;
					@Pc(35) Class65 local35 = Static198.aClass65Array62[local13];
					Static198.aClass65Array62[local13] = Static198.aClass65Array62[local13 + 1];
					Static198.aClass65Array62[local13 + 1] = local35;
					@Pc(53) Class65 local53 = Static161.aClass65Array51[local13];
					Static161.aClass65Array51[local13] = Static161.aClass65Array51[local13 + 1];
					Static161.aClass65Array51[local13 + 1] = local53;
					@Pc(71) int local71 = Static101.anIntArray288[local13];
					Static101.anIntArray288[local13] = Static101.anIntArray288[local13 + 1];
					Static101.anIntArray288[local13 + 1] = local71;
					@Pc(89) int local89 = Static99.anIntArray280[local13];
					Static99.anIntArray280[local13] = Static99.anIntArray280[local13 + 1];
					Static99.anIntArray280[local13 + 1] = local89;
					@Pc(107) short local107 = Static162.aShortArray52[local13];
					Static162.aShortArray52[local13] = Static162.aShortArray52[local13 + 1];
					Static162.aShortArray52[local13 + 1] = local107;
					@Pc(125) long local125 = Static158.aLongArray7[local13];
					Static158.aLongArray7[local13] = Static158.aLongArray7[local13 + 1];
					Static158.aLongArray7[local13 + 1] = local125;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)[B")
	public static byte[] method3029(@OriginalArg(1) int arg0) {
		@Pc(17) Class1_Sub2_Sub25 local17 = (Class1_Sub2_Sub25) Static97.aClass87_43.method3062((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(44) int local44 = 0; local44 < 255; local44++) {
				@Pc(50) int local50 = 255 - local44;
				@Pc(55) int local55 = Static3.method61(local28, local50);
				@Pc(59) byte local59 = local22[local55];
				local22[local55] = local22[local50];
				local22[local50] = local22[511 - local44] = local59;
			}
			local17 = new Class1_Sub2_Sub25(local22);
			Static97.aClass87_43.method3068(local17, (long) arg0);
		}
		return local17.aByteArray50;
	}
}

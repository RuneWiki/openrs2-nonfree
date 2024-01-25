import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!ca", name = "E", descriptor = "[[I")
	public static int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_9 = new Class215(48, 1);

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_10 = new Class215(79, -1);

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public static void method759() {
		Static5.method37();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)Z")
	public static boolean method760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBLclient!r;)V")
	public static void method761(@OriginalArg(0) int arg0, @OriginalArg(2) Class16_Sub1_Sub5 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt6018 > Static24.anInt5323) {
			Static30.method583(arg1);
		} else if (arg1.anInt6023 >= Static24.anInt5323) {
			Static179.method2849(arg1);
		} else {
			Static395.method5163(false, arg1);
			local9 = Static82.anInt1655;
			local7 = Static249.anInt4620;
		}
		if (arg1.anInt6893 < 128 || arg1.anInt6892 < 128 || arg1.anInt6893 >= Static326.anInt5666 * 128 - 128 || Static283.anInt5187 * 128 - 128 <= arg1.anInt6892) {
			local9 = 0;
			arg1.anInt6023 = 0;
			local7 = -1;
			arg1.anInt6018 = 0;
			arg1.anInt6045 = -1;
			arg1.anInt6029 = -1;
			arg1.anInt6021 = -1;
			arg1.anInt6893 = arg1.anIntArray426[0] * 128 + arg1.method4751() * 64;
			arg1.anInt6892 = arg1.anIntArray427[0] * 128 + arg1.method4751() * 64;
			arg1.method4742();
		}
		if (Static1.aClass16_Sub1_Sub5_Sub1_1 == arg1 && (arg1.anInt6893 < 1536 || arg1.anInt6892 < 1536 || Static326.anInt5666 * 128 - 1536 <= arg1.anInt6893 || (Static283.anInt5187 - 12) * 128 <= arg1.anInt6892)) {
			local7 = -1;
			arg1.anInt6045 = -1;
			arg1.anInt6021 = -1;
			local9 = 0;
			arg1.anInt6023 = 0;
			arg1.anInt6018 = 0;
			arg1.anInt6029 = -1;
			arg1.anInt6893 = arg1.anIntArray426[0] * 128 + arg1.method4751() * 64;
			arg1.anInt6892 = arg1.anIntArray427[0] * 128 + arg1.method4751() * 64;
			arg1.method4742();
		}
		@Pc(217) int local217 = Static141.method2424(arg1);
		Static447.method5628(arg1, local7, local9, local217);
		Static371.method4959(arg1);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method763(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local34++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local34);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local52.append(Static20.aCharArray1[(int) (local56 - arg0 * 37L)]);
			}
			return local52.reverse().toString();
		}
	}
}

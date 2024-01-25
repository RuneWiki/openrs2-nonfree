import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
	public static int anInt1298 = 0;

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!dt", name = "i", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_33 = new Class77(35, 8);

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString16 = "";

	@OriginalMember(owner = "client!dt", name = "k", descriptor = "Z")
	public static boolean aBoolean110 = false;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)Lclient!pi;")
	public static Class12_Sub2 method1245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class227 local7 = Static297.aClass227ArrayArrayArray7[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass12_Sub2_3;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!km;Lclient!cj;IIII)V")
	public static void method1246(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(14) Class145 local14 = Static201.aClass181_6.method4320(arg1.anInt799);
		if (local14.anInt3853 == -1) {
			return;
		}
		if (arg1.aBoolean54) {
			@Pc(28) int local28 = arg2 + arg1.anInt812;
			arg2 = local28 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(44) Class5 local44 = local14.method3541(arg2, arg1.aBoolean58, arg0);
		if (local44 == null) {
			return;
		}
		@Pc(50) int local50 = arg1.lb;
		@Pc(53) int local53 = arg1.anInt808;
		if ((arg2 & 0x1) == 1) {
			local53 = arg1.lb;
			local50 = arg1.anInt808;
		}
		@Pc(69) int local69 = local44.method4990();
		@Pc(72) int local72 = local44.method4992();
		if (local14.aBoolean284) {
			local69 = local50 * 4;
			local72 = local53 * 4;
		}
		if (local14.anInt3855 == 0) {
			local44.method4991(arg4, arg3 + 4 - local53 * 4, local69, local72);
		} else {
			local44.method5000(arg4, arg3 + 4 - local53 * 4, local69, local72, 1, local14.anInt3855 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method1249(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(34) long local34 = arg0;
			while (local34 != 0L) {
				local34 /= 37L;
				local27++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local52.append(Static93.aCharArray3[(int) (local56 - arg0 * 37L)]);
			}
			return local52.reverse().toString();
		}
	}
}

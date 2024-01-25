import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "Lclient!fa;")
	public static final Class68 aClass68_22 = new Class68(4);

	@OriginalMember(owner = "client!kc", name = "G", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[100];

	@OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
	public static int anInt3873 = 0;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!qm;)Ljava/lang/String;")
	public static String method3166(@OriginalArg(1) Class4_Sub39 arg0) {
		return arg0.aString56 == null || arg0.aString56.length() <= 0 ? arg0.aString55 : arg0.aString55 + Static146.aClass83_10.method2267(Static178.anInt3423) + arg0.aString56;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZIIII)V")
	public static void method3167(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - arg4;
		@Pc(15) int local15 = arg1 - arg2;
		if (local10 == 0) {
			if (local15 != 0) {
				Static225.method3440(arg4, arg2, arg1, arg0);
			}
		} else if (local15 == 0) {
			Static109.method5340(arg2, arg4, arg0, arg3);
		} else {
			@Pc(55) int local55 = (local15 << 12) / local10;
			@Pc(63) int local63 = arg2 - (local55 * arg4 >> 12);
			@Pc(80) int local80;
			@Pc(78) int local78;
			if (arg4 < Static354.anInt6186) {
				local78 = (Static354.anInt6186 * local55 >> 12) + local63;
				local80 = Static354.anInt6186;
			} else if (arg4 <= Static208.anInt2656) {
				local78 = arg2;
				local80 = arg4;
			} else {
				local80 = Static208.anInt2656;
				local78 = (Static208.anInt2656 * local55 >> 12) + local63;
			}
			@Pc(118) int local118;
			@Pc(116) int local116;
			if (arg3 < Static354.anInt6186) {
				local116 = (local55 * Static354.anInt6186 >> 12) + local63;
				local118 = Static354.anInt6186;
			} else if (Static208.anInt2656 >= arg3) {
				local118 = arg3;
				local116 = arg1;
			} else {
				local118 = Static208.anInt2656;
				local116 = local63 + (local55 * Static208.anInt2656 >> 12);
			}
			if (Static376.anInt6287 > local116) {
				local116 = Static376.anInt6287;
				local118 = (Static376.anInt6287 - local63 << 12) / local55;
			} else if (local116 > Static168.anInt3256) {
				local116 = Static168.anInt3256;
				local118 = (Static168.anInt3256 - local63 << 12) / local55;
			}
			if (local78 < Static376.anInt6287) {
				local80 = (Static376.anInt6287 - local63 << 12) / local55;
				local78 = Static376.anInt6287;
			} else if (Static168.anInt3256 < local78) {
				local78 = Static168.anInt3256;
				local80 = (Static168.anInt3256 - local63 << 12) / local55;
			}
			Static167.method2738(local78, local80, arg0, local116, local118);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)V")
	public static void method3168(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static400.method5186(local35, true);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!is;Lclient!ya;B)I")
	public static int method3169(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class19 arg1) {
		if (arg0.anInt3372 != -1) {
			return arg0.anInt3372;
		}
		if (arg0.anInt3378 != -1) {
			@Pc(35) Class251 local35 = arg1.anInterface7_6.method2396(arg1.method4243() ? arg0.anInt3378 : arg0.anInt3375);
			if (!local35.aBoolean639) {
				return local35.aShort99;
			}
		}
		return arg0.anInt3381;
	}
}

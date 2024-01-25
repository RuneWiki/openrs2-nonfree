import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public static int anInt5576;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	public static int anInt5573 = 104;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray58 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Z")
	public static final boolean aBoolean541 = false;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IJ)V")
	public static void method4777(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(13) int local13 = arg2; local13 <= arg1; local13++) {
			for (@Pc(17) int local17 = arg0; local17 <= arg3; local17++) {
				if (arg4 == Static193.anIntArrayArray44[local13][local17] && Static114.anIntArrayArray48[local13][local17] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Canvas;IBLclient!gd;)Lclient!uo;")
	public static Class32 method4782(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface2 arg2) {
		return new Class32_Sub1(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public static String method4784(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIZII)V")
	public static void method4785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static109.method2359(arg1);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg1 - arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg1;
		@Pc(24) int local24 = -arg1;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(37) int[] local37 = Static344.anIntArrayArray65[arg2];
		@Pc(42) int local42 = arg3 - local15;
		Static39.method919(arg4, local37, local42, arg3 - arg1);
		@Pc(56) int local56 = arg3 + local15;
		Static39.method919(arg5, local37, local56, local42);
		Static39.method919(arg4, local37, arg1 + arg3, local56);
		while (local21 > local10) {
			local33 += 2;
			local31 += 2;
			local29 += local33;
			local24 += local31;
			if (local29 >= 0 && local26 >= 1) {
				Static102.anIntArray228[local26] = local10;
				local26--;
				local29 -= local26 << 1;
			}
			local10++;
			@Pc(123) int[] local123;
			@Pc(130) int[] local130;
			@Pc(134) int local134;
			@Pc(138) int local138;
			@Pc(143) int local143;
			@Pc(148) int local148;
			@Pc(152) int local152;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				if (local21 < local15) {
					local123 = Static344.anIntArrayArray65[local21 + arg2];
					local130 = Static344.anIntArrayArray65[arg2 - local21];
					local134 = Static102.anIntArray228[local21];
					local138 = local10 + arg3;
					local143 = arg3 - local10;
					local148 = arg3 + local134;
					local152 = arg3 - local134;
					Static39.method919(arg4, local123, local152, local143);
					Static39.method919(arg5, local123, local148, local152);
					Static39.method919(arg4, local123, local138, local148);
					Static39.method919(arg4, local130, local152, local143);
					Static39.method919(arg5, local130, local148, local152);
					Static39.method919(arg4, local130, local138, local148);
				} else {
					local123 = Static344.anIntArrayArray65[arg2 + local21];
					local130 = Static344.anIntArrayArray65[arg2 - local21];
					local134 = arg3 + local10;
					local138 = arg3 - local10;
					Static39.method919(arg4, local123, local134, local138);
					Static39.method919(arg4, local130, local134, local138);
				}
			}
			local123 = Static344.anIntArrayArray65[local10 + arg2];
			local130 = Static344.anIntArrayArray65[arg2 - local10];
			local134 = arg3 + local21;
			local138 = arg3 - local21;
			if (local10 < local15) {
				local143 = local26 < local10 ? Static102.anIntArray228[local10] : local26;
				local148 = local143 + arg3;
				local152 = arg3 - local143;
				Static39.method919(arg4, local123, local152, local138);
				Static39.method919(arg5, local123, local148, local152);
				Static39.method919(arg4, local123, local134, local148);
				Static39.method919(arg4, local130, local152, local138);
				Static39.method919(arg5, local130, local148, local152);
				Static39.method919(arg4, local130, local134, local148);
			} else {
				Static39.method919(arg4, local123, local134, local138);
				Static39.method919(arg4, local130, local134, local138);
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[[I)V")
	public static void method4788(@OriginalArg(1) int[][] arg0) {
		Static344.anIntArrayArray65 = arg0;
	}
}

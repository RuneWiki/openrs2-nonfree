import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
	public static int anInt6703 = -1;

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_178 = new Class77(79, 7);

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_207 = new Class41(50, 15);

	@OriginalMember(owner = "client!wr", name = "w", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_179 = new Class77(34, -1);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZIIIZ)V")
	public static void method5724(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static154.method2584(0, arg1, arg0, arg3, Static197.aClass141_Sub1Array2.length - 1, arg2);
		Static28.anInt628 = 0;
		Static55.aClass2_Sub18_1 = null;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)V")
	public static void method5728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static297.aClass227ArrayArrayArray7[0][arg1][arg2] != null && Static297.aClass227ArrayArrayArray7[0][arg1][arg2].aClass227_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static297.aClass227ArrayArrayArray7[local22][arg1][arg2] == null) {
				@Pc(46) Class227 local46 = Static297.aClass227ArrayArrayArray7[local22][arg1][arg2] = new Class227(local22, arg1, arg2);
				if (local20) {
					local46.aByte68++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IBIIII)V")
	public static void method5729(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg4 - arg0;
		@Pc(14) int local14 = arg2 - arg1;
		if (local14 == 0) {
			if (local10 != 0) {
				Static281.method4317(arg1, arg0, arg3, arg4);
			}
		} else if (local10 == 0) {
			Static279.method4311(arg3, arg0, arg2, arg1);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(61) boolean local61 = local10 > local14;
			@Pc(73) int local73;
			@Pc(75) int local75;
			if (local61) {
				local73 = arg1;
				local75 = arg2;
				arg1 = arg0;
				arg0 = local73;
				arg2 = arg4;
				arg4 = local75;
			}
			if (arg2 < arg1) {
				local73 = arg1;
				arg1 = arg2;
				local75 = arg0;
				arg2 = local73;
				arg0 = arg4;
				arg4 = local75;
			}
			local73 = arg0;
			local75 = arg2 - arg1;
			@Pc(109) int local109 = arg4 - arg0;
			@Pc(114) int local114 = -(local75 >> 1);
			if (local109 < 0) {
				local109 = -local109;
			}
			@Pc(130) int local130 = arg4 > arg0 ? 1 : -1;
			@Pc(134) int local134;
			if (local61) {
				for (local134 = arg1; local134 <= arg2; local134++) {
					local114 += local109;
					Static267.anIntArrayArray38[local134][local73] = arg3;
					if (local114 > 0) {
						local114 -= local75;
						local73 += local130;
					}
				}
			} else {
				for (local134 = arg1; local134 <= arg2; local134++) {
					Static267.anIntArrayArray38[local73][local134] = arg3;
					local114 += local109;
					if (local114 > 0) {
						local73 += local130;
						local114 -= local75;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!fc;Lclient!fc;)I")
	public static int method5736(@OriginalArg(1) Class71 arg0, @OriginalArg(2) Class71 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method1560(Static259.anInt4617)) {
			local5++;
		}
		if (arg0.method1560(Static263.anInt4664)) {
			local5++;
		}
		if (arg0.method1560(Static274.anInt1079)) {
			local5++;
		}
		if (arg1.method1560(Static259.anInt4617)) {
			local5++;
		}
		if (arg1.method1560(Static263.anInt4664)) {
			local5++;
		}
		if (arg1.method1560(Static274.anInt1079)) {
			local5++;
		}
		return local5;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "Lclient!cr;")
	public static final Class63 aClass63_4 = new Class63("stellardawn", 1);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIII)V")
	public static void method4292(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(157) Class217 local157 = Static421.aClass217ArrayArrayArray5[arg3][arg1][arg5];
			if (local157 == null) {
				local157 = new Class217(arg3);
			}
			if (arg0 == 1) {
				local157.aShort75 = (short) arg2;
				local157.aShort74 = (short) arg4;
			} else if (arg0 == 2) {
				local157.aShort77 = (short) arg2;
				local157.aShort76 = (short) arg4;
			}
			if (Static633.aBoolean755) {
				Static84.method1390();
			}
			return;
		}
		@Pc(14) int local14;
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(47) int local47;
		if (arg0 != 8) {
			local14 = Static302.anInt5267 + (arg1 << Static115.anInt2156);
			local19 = local14 - Static302.anInt5267;
			local23 = arg5 << Static115.anInt2156;
			local27 = Static302.anInt5267 + local23;
			local35 = Static20.aClass61Array2[arg3].method8580(arg5, arg1 + 1);
			local47 = Static20.aClass61Array2[arg3].method8580(arg5 + 1, arg1);
			Static8.aClass34Array4[Static239.anInt4416++] = new Class34(arg0, arg3, local14, local19, local19, local14, local35, local47, local47 - arg2, local35 - arg2, local23, local27, local27, local23);
			return;
		}
		local14 = arg1 << Static115.anInt2156;
		local19 = local14 + Static302.anInt5267;
		local23 = arg5 << Static115.anInt2156;
		local27 = Static302.anInt5267 + local23;
		local35 = Static20.aClass61Array2[arg3].method8580(arg5, arg1);
		local47 = Static20.aClass61Array2[arg3].method8580(arg5 + 1, arg1 + 1);
		Static8.aClass34Array4[Static239.anInt4416++] = new Class34(arg0, arg3, local14, local19, local19, local14, local35, local47, local47 - arg2, local35 - arg2, local23, local27, local27, local23);
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
	public static void method4293() {
		Static273.method4417();
		Static636.method8980(Static97.aClass5_Sub25_8.aClass6_Sub5_1.method1110() == 1);
		Static422.aClass93_3 = Static552.method8052(Static470.aClass100_14, Static83.aCanvas14, 0, 22050);
		Static411.method6335(Static227.method3518(null));
		Static505.aClass93_4 = Static552.method8052(Static470.aClass100_14, Static83.aCanvas14, 1, 2048);
		Static505.aClass93_4.method6363(Static26.aClass5_Sub1_Sub2_1);
	}
}

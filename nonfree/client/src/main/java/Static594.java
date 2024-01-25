import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "Z")
	public static boolean aBoolean711 = false;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "[Lclient!fo;")
	public static final Interface7[] anInterface7Array2 = new Interface7[75];

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!ha;IIIII)V")
	public static void method8428(@OriginalArg(0) int arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if ((Static567.aClass20_35 == null || Static464.aClass20_31 == null || Static543.aClass20_32 == null) && Static666.aClass386_141.method9206(Static645.anInt10796) && Static666.aClass386_141.method9206(Static180.anInt3465) && Static666.aClass386_141.method9206(Static626.anInt10555)) {
			@Pc(27) Class356 local27 = Static688.method8619(Static666.aClass386_141, Static180.anInt3465, 0);
			Static464.aClass20_31 = arg1.method7951(local27, true);
			local27.method8620();
			Static426.aClass20_28 = arg1.method7951(local27, true);
			Static567.aClass20_35 = arg1.method7951(Static688.method8619(Static666.aClass386_141, Static645.anInt10796, 0), true);
			@Pc(52) Class356 local52 = Static688.method8619(Static666.aClass386_141, Static626.anInt10555, 0);
			Static543.aClass20_32 = arg1.method7951(local52, true);
			local52.method8620();
			Static414.aClass20_26 = arg1.method7951(local52, true);
		}
		if (Static567.aClass20_35 == null || Static464.aClass20_31 == null || Static543.aClass20_32 == null) {
			return;
		}
		@Pc(85) int local85 = (arg0 - Static543.aClass20_32.method7412() * 2) / Static567.aClass20_35.method7412();
		for (@Pc(87) int local87 = 0; local87 < local85; local87++) {
			Static567.aClass20_35.method7399(arg2 + Static543.aClass20_32.method7412() + Static567.aClass20_35.method7412() * local87, -Static567.aClass20_35.method7393() + arg4 + arg3);
		}
		@Pc(127) int local127 = (arg4 - Static543.aClass20_32.method7393() - 20) / Static464.aClass20_31.method7393();
		for (@Pc(129) int local129 = 0; local129 < local127; local129++) {
			Static464.aClass20_31.method7399(arg2, arg3 + Static464.aClass20_31.method7393() * local129 + 20);
			Static426.aClass20_28.method7399(arg2 + arg0 - Static426.aClass20_28.method7412(), Static464.aClass20_31.method7393() * local129 + arg3 + 20);
		}
		Static543.aClass20_32.method7399(arg2, arg3 + arg4 - Static543.aClass20_32.method7393());
		Static414.aClass20_26.method7399(arg2 + arg0 - Static543.aClass20_32.method7412(), arg3 + (arg4 - Static543.aClass20_32.method7393()));
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([Ljava/lang/Object;I[JII)V")
	public static void method8430(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg1) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) long local20 = arg2[local14];
		arg2[local14] = arg2[arg3];
		arg2[arg3] = local20;
		@Pc(34) Object local34 = arg0[local14];
		arg0[local14] = arg0[arg3];
		arg0[arg3] = local34;
		@Pc(52) int local52 = local20 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(54) int local54 = arg1; local54 < arg3; local54++) {
			if ((long) (local54 & local52) + local20 > arg2[local54]) {
				@Pc(75) long local75 = arg2[local54];
				arg2[local54] = arg2[local16];
				arg2[local16] = local75;
				@Pc(89) Object local89 = arg0[local54];
				arg0[local54] = arg0[local16];
				arg0[local16++] = local89;
			}
		}
		arg2[arg3] = arg2[local16];
		arg2[local16] = local20;
		arg0[arg3] = arg0[local16];
		arg0[local16] = local34;
		method8430(arg0, arg1, arg2, local16 - 1);
		method8430(arg0, local16 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IJI)Ljava/lang/String;")
	public static String method8431(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		Static625.method8782(arg0);
		@Pc(15) int local15 = Static170.aCalendar1.get(5);
		@Pc(19) int local19 = Static170.aCalendar1.get(2);
		@Pc(23) int local23 = Static170.aCalendar1.get(1);
		return arg1 == 3 ? Static214.method3370(arg0, arg1) : Integer.toString(local15 / 10) + local15 % 10 + "-" + Static225.aStringArrayArray2[arg1][local19] + "-" + local23;
	}
}

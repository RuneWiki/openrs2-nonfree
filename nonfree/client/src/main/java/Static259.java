import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!im", name = "E", descriptor = "Lclient!ed;")
	public static final Class93 aClass93_9 = new Class93(15, 0, 1, 0);

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IZIIII)V")
	public static void method3883(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static166.method2620(arg1, Static229.anInt4089, Static617.anInt6260);
		@Pc(17) int local17 = Static166.method2620(arg3, Static229.anInt4089, Static617.anInt6260);
		@Pc(23) int local23 = Static166.method2620(arg0, Static629.anInt10412, Static300.anInt5091);
		@Pc(33) int local33 = Static166.method2620(arg2, Static629.anInt10412, Static300.anInt5091);
		for (@Pc(35) int local35 = local11; local35 <= local17; local35++) {
			Static578.method7640(arg4, local23, local33, Static276.anIntArrayArray32[local35]);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BZIZILjava/lang/String;Ljava/lang/String;)V")
	public static void method3885(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5) {
		Static117.aClass362_22.anInt10235 = 1;
		@Pc(11) String local11 = arg5.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg1 != -1) {
			@Pc(27) Class281 local27 = Static389.aClass335_2.method7504(arg1);
			if (local27 == null || local27.method6170() != arg2) {
				return;
			}
			if (local27.method6170()) {
				local18 = local27.aString92;
			} else {
				local16 = local27.anInt7362;
			}
		}
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < Static117.aClass197_2.anInt5259; local54++) {
			@Pc(61) Class15 local61 = Static117.aClass197_2.method4518(local54);
			if ((!arg0 || local61.aBoolean21) && local61.anInt436 == -1 && local61.anInt446 == -1 && local61.anInt440 == -1 && local61.anInt451 == 0 && local61.aString6.toLowerCase().indexOf(local11) != -1) {
				if (arg1 != -1) {
					if (arg2) {
						if (!arg4.equals(local61.method466(local18, arg1))) {
							continue;
						}
					} else if (arg3 != local61.method461(local16, arg1)) {
						continue;
					}
				}
				if (local52 >= 250) {
					Static413.aShortArray74 = null;
					Static41.anInt867 = -1;
					return;
				}
				if (local14.length <= local52) {
					@Pc(138) short[] local138 = new short[local14.length * 2];
					for (@Pc(140) int local140 = 0; local140 < local52; local140++) {
						local138[local140] = local14[local140];
					}
					local14 = local138;
				}
				local14[local52++] = (short) local54;
			}
		}
		Static41.anInt867 = local52;
		Static413.aShortArray74 = local14;
		Static553.anInt8951 = 0;
		@Pc(193) String[] local193 = new String[Static41.anInt867];
		for (@Pc(195) int local195 = 0; local195 < Static41.anInt867; local195++) {
			local193[local195] = Static117.aClass197_2.method4518(local14[local195]).aString6;
		}
		Static143.method2343(Static413.aShortArray74, local193);
		Static117.aClass362_22.method8367();
		Static117.aClass362_22.anInt10235 = 2;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I[BIIIIZLclient!lf;)Lclient!fu;")
	public static Class10_Sub2_Sub1 method3886(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(7) Class95_Sub3 arg3) {
		if (arg3.aBoolean377 || Static365.method5254(arg0) && Static365.method5254(arg2)) {
			return new Class10_Sub2_Sub1(arg3, 3553, 6406, arg0, arg2, false, arg1, 6406);
		} else if (arg3.aBoolean384) {
			return new Class10_Sub2_Sub1(arg3, 34037, 6406, arg0, arg2, false, arg1, 6406);
		} else {
			return new Class10_Sub2_Sub1(arg3, 6406, arg0, arg2, Static585.method7772(arg0), Static585.method7772(arg2), arg1, 6406);
		}
	}
}

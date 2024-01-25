import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
	public static int anInt7727;

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_82 = new Class303(32, 18);

	@OriginalMember(owner = "client!rj", name = "m", descriptor = "[Lclient!kk;")
	public static final Interface7[] anInterface7Array2 = new Interface7[75];

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIBIII)V")
	public static void method6425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg2;
		@Pc(14) int local14 = arg4 - arg3;
		if (local14 == 0) {
			if (local10 != 0) {
				Static484.method6595(arg3, arg2, arg1, arg0);
			}
		} else if (local10 == 0) {
			Static297.method4421(arg4, arg2, arg0, arg3);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(65) boolean local65 = local10 > local14;
			@Pc(69) int local69;
			@Pc(71) int local71;
			if (local65) {
				local69 = arg3;
				local71 = arg4;
				arg3 = arg2;
				arg2 = local69;
				arg4 = arg1;
				arg1 = local71;
			}
			if (arg4 < arg3) {
				local69 = arg3;
				local71 = arg2;
				arg3 = arg4;
				arg4 = local69;
				arg2 = arg1;
				arg1 = local71;
			}
			local69 = arg2;
			local71 = arg4 - arg3;
			@Pc(114) int local114 = arg1 - arg2;
			@Pc(119) int local119 = -(local71 >> 1);
			@Pc(130) int local130 = arg2 < arg1 ? 1 : -1;
			if (local114 < 0) {
				local114 = -local114;
			}
			@Pc(139) int local139;
			if (local65) {
				for (local139 = arg3; local139 <= arg4; local139++) {
					Static158.anIntArrayArray66[local139][local69] = arg0;
					local119 += local114;
					if (local119 > 0) {
						local119 -= local71;
						local69 += local130;
					}
				}
			} else {
				for (local139 = arg3; local139 <= arg4; local139++) {
					Static158.anIntArrayArray66[local69][local139] = arg0;
					local119 += local114;
					if (local119 > 0) {
						local69 += local130;
						local119 -= local71;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!wp;III)V")
	public static void method6426(@OriginalArg(0) Class361 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray16 != null) {
			@Pc(13) Class3_Sub32 local13 = new Class3_Sub32();
			local13.aClass361_6 = arg0;
			local13.anObjectArray1 = arg0.anObjectArray16;
			Static312.method4566(local13);
		}
		Static28.anInt515 = arg0.anInt9645;
		Static176.anInt3442 = arg2;
		Static377.anInt6474 = arg0.anInt9594;
		Static369.aBoolean463 = true;
		Static215.anInt3875 = arg1;
		Static196.anInt9125 = arg0.anInt9608;
		Static288.anInt4931 = arg0.anInt9613;
		Static69.anInt1582 = arg0.anInt9631;
		Static186.method3170(arg0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIII)V")
	public static void method6428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class3_Sub7_Sub18 local13 = Static543.method7218(8, arg1);
		local13.method7326();
		local13.anInt8798 = arg0;
		local13.anInt8806 = arg3;
		local13.anInt8802 = arg2;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_82 = new Class136(119, 6);

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIII)V")
	public static void method3230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static87.anInt1434 = arg0;
		Static315.anInt5510 = arg2;
		Static2.anInt7 = arg4;
		Static193.anInt3440 = arg1;
		Static477.anInt7975 = arg3;
		if (Static315.anInt5510 >= 100) {
			@Pc(30) int local30 = Static2.anInt7 * 512 + 256;
			@Pc(36) int local36 = Static477.anInt7975 * 512 + 256;
			@Pc(44) int local44 = Static600.method8378(local36, local30, Static299.anInt4751) - Static193.anInt3440;
			@Pc(49) int local49 = local30 - Static70.anInt9231;
			@Pc(54) int local54 = local44 - Static216.anInt3726;
			@Pc(59) int local59 = local36 - Static646.anInt10445;
			@Pc(71) int local71 = (int) Math.sqrt((double) (local49 * local49 + local59 * local59));
			Static218.anInt3744 = (int) (Math.atan2((double) local54, (double) local71) * 2607.5945876176133D) & 0x3FFF;
			Static608.anInt9971 = (int) (Math.atan2((double) local49, (double) local59) * -2607.5945876176133D) & 0x3FFF;
			Static21.anInt457 = 0;
			if (Static218.anInt3744 < 1024) {
				Static218.anInt3744 = 1024;
			}
			if (Static218.anInt3744 > 3072) {
				Static218.anInt3744 = 3072;
			}
		}
		Static609.anInt9978 = -1;
		Static394.anInt6873 = -1;
		Static584.anInt9543 = 2;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!nba;Z)V")
	public static void method3231(@OriginalArg(0) Class5_Sub35 arg0) {
		if (Static535.aClass156ArrayArrayArray2 == null) {
			return;
		}
		@Pc(8) Interface20 local8 = null;
		if (arg0.anInt6493 == 0) {
			local8 = (Interface20) Static601.method8388(arg0.anInt6492, arg0.anInt6495, arg0.anInt6497);
		}
		if (arg0.anInt6493 == 1) {
			local8 = (Interface20) Static237.method3640(arg0.anInt6492, arg0.anInt6495, arg0.anInt6497);
		}
		if (arg0.anInt6493 == 2) {
			local8 = (Interface20) Static1.method5727(arg0.anInt6492, arg0.anInt6495, arg0.anInt6497, paa.class);
		}
		if (arg0.anInt6493 == 3) {
			local8 = (Interface20) Static70.method7879(arg0.anInt6492, arg0.anInt6495, arg0.anInt6497);
		}
		if (local8 == null) {
			arg0.anInt6488 = 0;
			arg0.anInt6496 = -1;
			arg0.anInt6490 = 0;
		} else {
			arg0.anInt6496 = local8.method8009();
			arg0.anInt6488 = local8.method8015();
			arg0.anInt6490 = local8.method8012();
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!paa;B)Z")
	public static boolean method3232(@OriginalArg(0) Interface20 arg0) {
		@Pc(10) Class283 local10 = Static525.aClass371_4.method8554(arg0.method8009());
		if (local10.anInt7804 == -1) {
			return true;
		} else {
			@Pc(28) Class77 local28 = Static39.aClass56_3.method1173(local10.anInt7804);
			return local28.anInt1582 == -1 ? true : local28.method1479();
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZLclient!jba;Lclient!ha;)I")
	public static int method3234(@OriginalArg(1) Class164 arg0, @OriginalArg(2) Class126 arg1) {
		if (arg0.anInt4236 != -1) {
			return arg0.anInt4236;
		}
		if (arg0.anInt4238 != -1) {
			@Pc(23) Class321 local23 = arg1.anInterface8_10.method7813(arg0.anInt4238);
			if (!local23.aBoolean724) {
				return local23.aShort103;
			}
		}
		return arg0.anInt4242;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method3235(@OriginalArg(1) Class126 arg0) {
		for (@Pc(6) Class14_Sub8 local6 = (Class14_Sub8) Static310.aClass363_7.method8484(); local6 != null; local6 = (Class14_Sub8) Static310.aClass363_7.method8478()) {
			if (local6.aBoolean400) {
				local6.method4451(arg0);
			}
		}
	}
}

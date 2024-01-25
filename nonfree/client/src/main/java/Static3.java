import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
	public static int anInt61;

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_1 = new Class96("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
	public static int anInt60 = 0;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIII)I")
	public static int method37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(10) int local10 = arg3;
			arg3 = arg0;
			arg0 = local10;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 + 1 - arg5 - arg3;
		} else if (local3 == 2) {
			return 1 + 7 - arg1 - arg0;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)V")
	public static void method38(@OriginalArg(1) int arg0) {
		if (Static111.method1740(arg0)) {
			Static124.method1942(Static276.aClass229ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V")
	public static void method40(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class1_Sub25 local10 = (Class1_Sub25) Static285.aClass142_2.method3199(); local10 != null; local10 = (Class1_Sub25) Static285.aClass142_2.method3198()) {
			Static95.method1512(arg1, arg0, local10, arg3, arg2);
		}
		for (@Pc(35) Class1_Sub25 local35 = (Class1_Sub25) Static427.aClass142_49.method3199(); local35 != null; local35 = (Class1_Sub25) Static427.aClass142_49.method3198()) {
			@Pc(39) byte local39 = 1;
			@Pc(44) Class231 local44 = local35.aClass47_Sub1_Sub5_Sub1_1.method4327();
			if (local35.aClass47_Sub1_Sub5_Sub1_1.aBoolean432) {
				local39 = 0;
			} else if (local35.aClass47_Sub1_Sub5_Sub1_1.anInt5393 == local44.anInt6975 || local44.anInt6972 == local35.aClass47_Sub1_Sub5_Sub1_1.anInt5393 || local35.aClass47_Sub1_Sub5_Sub1_1.anInt5393 == local44.anInt6998 || local44.anInt6984 == local35.aClass47_Sub1_Sub5_Sub1_1.anInt5393) {
				local39 = 2;
			} else if (local35.aClass47_Sub1_Sub5_Sub1_1.anInt5393 == local44.anInt7005 || local35.aClass47_Sub1_Sub5_Sub1_1.anInt5393 == local44.anInt6973 || local44.anInt6976 == local35.aClass47_Sub1_Sub5_Sub1_1.anInt5393 || local35.aClass47_Sub1_Sub5_Sub1_1.anInt5393 == local44.anInt7004) {
				local39 = 3;
			}
			if (local39 != local35.anInt3569) {
				@Pc(131) int local131 = Static277.method3835(local35.aClass47_Sub1_Sub5_Sub1_1);
				if (local131 != local35.anInt3567) {
					if (local35.aClass1_Sub5_Sub2_3 != null) {
						Static292.aClass1_Sub5_Sub1_2.method423(local35.aClass1_Sub5_Sub2_3);
						local35.aClass1_Sub5_Sub2_3 = null;
					}
					local35.anInt3567 = local131;
				}
				local35.anInt3569 = local39;
			}
			local35.anInt3562 = local35.aClass47_Sub1_Sub5_Sub1_1.anInt7060;
			local35.anInt3565 = local35.aClass47_Sub1_Sub5_Sub1_1.anInt7060 + (local35.aClass47_Sub1_Sub5_Sub1_1.method4317() << 6);
			local35.anInt3568 = local35.aClass47_Sub1_Sub5_Sub1_1.anInt7066;
			local35.anInt3571 = local35.aClass47_Sub1_Sub5_Sub1_1.anInt7066 + (local35.aClass47_Sub1_Sub5_Sub1_1.method4317() << 6);
			Static95.method1512(arg1, arg0, local35, arg3, arg2);
		}
		for (@Pc(211) Class1_Sub25 local211 = (Class1_Sub25) Static254.aClass51_14.method928(); local211 != null; local211 = (Class1_Sub25) Static254.aClass51_14.method926()) {
			@Pc(215) byte local215 = 1;
			@Pc(220) Class231 local220 = local211.aClass47_Sub1_Sub5_Sub2_1.method4327();
			if (local211.aClass47_Sub1_Sub5_Sub2_1.aBoolean432) {
				local215 = 0;
			} else if (local211.aClass47_Sub1_Sub5_Sub2_1.anInt5393 == local220.anInt6975 || local220.anInt6972 == local211.aClass47_Sub1_Sub5_Sub2_1.anInt5393 || local211.aClass47_Sub1_Sub5_Sub2_1.anInt5393 == local220.anInt6998 || local211.aClass47_Sub1_Sub5_Sub2_1.anInt5393 == local220.anInt6984) {
				local215 = 2;
			} else if (local211.aClass47_Sub1_Sub5_Sub2_1.anInt5393 == local220.anInt7005 || local211.aClass47_Sub1_Sub5_Sub2_1.anInt5393 == local220.anInt6973 || local220.anInt6976 == local211.aClass47_Sub1_Sub5_Sub2_1.anInt5393 || local211.aClass47_Sub1_Sub5_Sub2_1.anInt5393 == local220.anInt7004) {
				local215 = 3;
			}
			if (local215 != local211.anInt3569) {
				@Pc(303) int local303 = Static43.method575(local211.aClass47_Sub1_Sub5_Sub2_1);
				if (local211.anInt3567 != local303) {
					if (local211.aClass1_Sub5_Sub2_3 != null) {
						Static292.aClass1_Sub5_Sub1_2.method423(local211.aClass1_Sub5_Sub2_3);
						local211.aClass1_Sub5_Sub2_3 = null;
					}
					local211.anInt3567 = local303;
				}
				local211.anInt3569 = local215;
			}
			local211.anInt3562 = local211.aClass47_Sub1_Sub5_Sub2_1.anInt7060;
			local211.anInt3565 = local211.aClass47_Sub1_Sub5_Sub2_1.anInt7060 + (local211.aClass47_Sub1_Sub5_Sub2_1.method4317() << 6);
			local211.anInt3568 = local211.aClass47_Sub1_Sub5_Sub2_1.anInt7066;
			local211.anInt3571 = local211.aClass47_Sub1_Sub5_Sub2_1.anInt7066 + (local211.aClass47_Sub1_Sub5_Sub2_1.method4317() << 6);
			Static95.method1512(arg1, arg0, local211, arg3, arg2);
		}
	}
}

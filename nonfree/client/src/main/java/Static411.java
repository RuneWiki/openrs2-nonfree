import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!o", name = "M", descriptor = "Lclient!oo;")
	public static final Class264 aClass264_49 = new Class264(8);

	@OriginalMember(owner = "client!o", name = "N", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[100];

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IZLclient!ha;Z)Lclient!da;")
	public static Class38 method6078(@OriginalArg(0) int arg0, @OriginalArg(2) Class137 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(14) Class185 local14 = Static109.method1910(arg0, arg1, arg2);
		return local14 == null ? null : local14.aClass38_8;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BIILclient!vn;I)V")
	public static void method6079(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class12_Sub2_Sub2_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class132 local9 = arg2.method2416();
		@Pc(19) int local19 = arg2.anInt2937 - arg2.aClass139_7.anInt3812 & 0x3FFF;
		if (arg1 == -1) {
			if (local19 != 0 || arg2.anInt2911 > 25) {
				if (arg3 < 0 && local9.anInt3661 != -1) {
					arg2.anInt2960 = local9.anInt3661;
					arg2.aBoolean222 = false;
				} else if (arg3 <= 0 || local9.anInt3653 == -1) {
					arg2.anInt2960 = local9.anInt3629;
				} else {
					arg2.anInt2960 = local9.anInt3653;
				}
				arg2.aBoolean222 = false;
			} else if (!arg2.aBoolean222 || !local9.method3028(arg2.anInt2960)) {
				arg2.anInt2960 = local9.method3027();
				arg2.aBoolean222 = arg2.anInt2960 != -1;
			}
		} else if (arg2.anInt2903 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(298) int local298 = Static625.anIntArray776[arg0] - arg2.aClass139_7.anInt3812 & 0x3FFF;
			if (arg1 == 2 && local9.anInt3652 != -1) {
				if (local298 > 2048 && local298 <= 6144 && local9.anInt3648 != -1) {
					arg2.anInt2960 = local9.anInt3648;
				} else if (local298 >= 10240 && local298 < 14336 && local9.anInt3657 != -1) {
					arg2.anInt2960 = local9.anInt3657;
				} else if (local298 <= 6144 || local298 >= 10240 || local9.anInt3656 == -1) {
					arg2.anInt2960 = local9.anInt3652;
				} else {
					arg2.anInt2960 = local9.anInt3656;
				}
			} else if (arg1 == 0 && local9.anInt3663 != -1) {
				if (local298 > 2048 && local298 <= 6144 && local9.anInt3639 != -1) {
					arg2.anInt2960 = local9.anInt3639;
				} else if (local298 >= 10240 && local298 < 14336 && local9.anInt3651 != -1) {
					arg2.anInt2960 = local9.anInt3651;
				} else if (local298 <= 6144 || local298 >= 10240 || local9.anInt3628 == -1) {
					arg2.anInt2960 = local9.anInt3663;
				} else {
					arg2.anInt2960 = local9.anInt3628;
				}
			} else if (local298 > 2048 && local298 <= 6144 && local9.anInt3640 != -1) {
				arg2.anInt2960 = local9.anInt3640;
			} else if (local298 >= 10240 && local298 < 14336 && local9.anInt3631 != -1) {
				arg2.anInt2960 = local9.anInt3631;
			} else if (local298 <= 6144 || local298 >= 10240 || local9.anInt3665 == -1) {
				arg2.anInt2960 = local9.anInt3629;
			} else {
				arg2.anInt2960 = local9.anInt3665;
			}
			arg2.aBoolean222 = false;
		} else if (local19 == 0 && arg2.anInt2911 <= 25) {
			arg2.aBoolean222 = false;
			if (arg1 == 2 && local9.anInt3652 != -1) {
				arg2.anInt2960 = local9.anInt3652;
			} else if (arg1 == 0 && local9.anInt3663 != -1) {
				arg2.anInt2960 = local9.anInt3663;
			} else {
				arg2.anInt2960 = local9.anInt3629;
			}
		} else {
			arg2.aBoolean222 = false;
			if (arg1 == 2 && local9.anInt3652 != -1) {
				if (arg3 < 0 && local9.anInt3650 != -1) {
					arg2.anInt2960 = local9.anInt3650;
				} else if (arg3 <= 0 || local9.anInt3638 == -1) {
					arg2.anInt2960 = local9.anInt3652;
				} else {
					arg2.anInt2960 = local9.anInt3638;
				}
			} else if (arg1 == 0 && local9.anInt3663 != -1) {
				if (arg3 < 0 && local9.anInt3664 != -1) {
					arg2.anInt2960 = local9.anInt3664;
				} else if (arg3 <= 0 || local9.anInt3632 == -1) {
					arg2.anInt2960 = local9.anInt3663;
				} else {
					arg2.anInt2960 = local9.anInt3632;
				}
			} else if (arg3 < 0 && local9.anInt3633 != -1) {
				arg2.anInt2960 = local9.anInt3633;
			} else if (arg3 <= 0 || local9.anInt3668 == -1) {
				arg2.anInt2960 = local9.anInt3629;
			} else {
				arg2.anInt2960 = local9.anInt3668;
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)[B")
	public static byte[] method6080(@OriginalArg(0) int arg0) {
		@Pc(19) Class14_Sub3_Sub15 local19 = (Class14_Sub3_Sub15) Static401.aClass57_6.method1424((long) arg0);
		if (local19 == null) {
			@Pc(24) byte[] local24 = new byte[512];
			@Pc(30) Random local30 = new Random((long) arg0);
			for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
				local24[local32] = (byte) local32;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(52) int local52 = 255 - local45;
				@Pc(57) int local57 = Static251.method3688(local30, local52);
				@Pc(61) byte local61 = local24[local57];
				local24[local57] = local24[local52];
				local24[local52] = local24[511 - local45] = local61;
			}
			local19 = new Class14_Sub3_Sub15(local24);
			Static401.aClass57_6.method1422(local19, (long) arg0);
		}
		return local19.aByteArray115;
	}
}

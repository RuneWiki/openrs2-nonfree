import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!kaa", name = "N", descriptor = "F")
	public static float aFloat100;

	@OriginalMember(owner = "client!kaa", name = "J", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_93 = new Class56(86, 4);

	@OriginalMember(owner = "client!kaa", name = "L", descriptor = "Lclient!kf;")
	public static final Class178 aClass178_10 = new Class178();

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(III)I")
	public static int method4085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(40) int local40 = Static113.method1956(arg0 - 1, arg1 + -1) + Static113.method1956(arg0 - 1, arg1 + 1) + Static113.method1956(arg0 - -1, arg1 + -1) + Static113.method1956(arg0 - -1, arg1 - -1);
		@Pc(78) int local78 = Static113.method1956(arg0, arg1 - 1) + Static113.method1956(arg0, arg1 + 1) + Static113.method1956(arg0 - 1, arg1) + Static113.method1956(arg0 + 1, arg1);
		@Pc(83) int local83 = Static113.method1956(arg0, arg1);
		return local83 / 4 + local78 / 8 + local40 / 16;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!np;I)V")
	public static void method4086(@OriginalArg(0) Class3_Sub11 arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static320.anInt5439; local11++) {
			@Pc(17) int local17 = arg0.method5217();
			@Pc(21) int local21 = arg0.method5198();
			if (local21 == 65535) {
				local21 = -1;
			}
			if (Static317.aClass119_Sub1Array1[local17] != null) {
				Static317.aClass119_Sub1Array1[local17].anInt3540 = local21;
			}
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method4087(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		Static570.anInt9273 = 2;
		Static61.anInt1462 = arg1;
		Static259.method3987(false, arg0, arg2);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(III[BZI)V")
	public static void method4088(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(27) int local27 = arg3 - arg1 >> 2;
		arg0 += arg1;
		while (true) {
			local27--;
			if (local27 < 0) {
				local27 = arg3 - arg1 & 0x3;
				while (true) {
					local27--;
					if (local27 < 0) {
						return;
					}
					arg2[arg0++] = 1;
				}
			}
			@Pc(36) int local36 = arg0 + 1;
			arg2[arg0] = 1;
			@Pc(41) int local41 = local36 + 1;
			arg2[local36] = 1;
			@Pc(46) int local46 = local41 + 1;
			arg2[local41] = 1;
			arg0 = local46 + 1;
			arg2[local46] = 1;
		}
	}
}

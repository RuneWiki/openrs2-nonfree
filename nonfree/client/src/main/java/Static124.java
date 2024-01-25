import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray25 = new String[100];

	@OriginalMember(owner = "client!gb", name = "Y", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_68 = new Class131(48, 4);

	@OriginalMember(owner = "client!gb", name = "Z", descriptor = "Ljava/lang/Boolean;")
	public static Boolean aBoolean121 = Boolean.FALSE;

	@OriginalMember(owner = "client!gb", name = "ab", descriptor = "Lclient!cs;")
	public static final Class42 aClass42_2 = new Class42();

	@OriginalMember(owner = "client!gb", name = "bb", descriptor = "Z")
	public static boolean aBoolean122 = true;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([Lclient!ss;II)V")
	public static void method1857(@OriginalArg(0) Class219[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class219 local9 = arg0[local3];
			if (local9 != null) {
				if (local9.anInt6377 == 0) {
					if (local9.aClass219Array3 != null) {
						method1857(local9.aClass219Array3, arg1);
					}
					@Pc(30) Class1_Sub36 local30 = (Class1_Sub36) Static445.aClass27_42.method553((long) local9.anInt6422);
					if (local30 != null) {
						Static313.method4475(arg1, local30.anInt5680);
					}
				}
				@Pc(49) Class1_Sub6 local49;
				if (arg1 == 0 && local9.anObjectArray18 != null) {
					local49 = new Class1_Sub6();
					local49.aClass219_4 = local9;
					local49.anObjectArray3 = local9.anObjectArray18;
					Static104.method1608(local49);
				}
				if (arg1 == 1 && local9.anObjectArray31 != null) {
					if (local9.anInt6345 >= 0) {
						@Pc(74) Class219 local74 = Static103.method1572(local9.anInt6422);
						if (local74 == null || local74.aClass219Array3 == null || local74.aClass219Array3.length <= local9.anInt6345 || local74.aClass219Array3[local9.anInt6345] != local9) {
							continue;
						}
					}
					local49 = new Class1_Sub6();
					local49.anObjectArray3 = local9.anObjectArray31;
					local49.aClass219_4 = local9;
					Static104.method1608(local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII[B)V")
	public static void method1858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(20) int local20 = arg0 - arg1 >> 2;
		arg2 += arg1;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg0 - arg1 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg3[arg2++] = 1;
				}
			}
			@Pc(29) int local29 = arg2 + 1;
			arg3[arg2] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg3[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg3[local34] = 1;
			arg2 = local39 + 1;
			arg3[local39] = 1;
		}
	}
}

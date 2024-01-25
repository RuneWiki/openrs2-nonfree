import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!ls", name = "J", descriptor = "[[S")
	public static short[][] aShortArrayArray23;

	@OriginalMember(owner = "client!ls", name = "I", descriptor = "Lclient!lj;")
	public static final Class210 aClass210_7 = new Class210(4, 1, 1, 1);

	@OriginalMember(owner = "client!ls", name = "L", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_71 = new Class61(28, 4);

	@OriginalMember(owner = "client!ls", name = "M", descriptor = "Lclient!db;")
	public static final Class64 aClass64_277 = new Class64(50, 2);

	@OriginalMember(owner = "client!ls", name = "N", descriptor = "[I")
	public static final int[] anIntArray466 = new int[8];

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLclient!eh;)Lclient!cf;")
	public static Class52_Sub1 method4786(@OriginalArg(1) Class4_Sub9 arg0) {
		@Pc(7) Class52 local7 = Static72.method1294(arg0);
		@Pc(11) int local11 = arg0.method5982();
		@Pc(20) int local20 = arg0.method5982();
		@Pc(24) int local24 = arg0.method5982();
		@Pc(28) int local28 = arg0.method5982();
		@Pc(32) int local32 = arg0.method5982();
		@Pc(36) int local36 = arg0.method5982();
		return new Class52_Sub1(local7.aClass297_12, local7.aClass58_13, local7.anInt8820, local7.anInt8826, local7.anInt8822, local7.anInt8828, local7.anInt8824, local7.anInt8827, local7.anInt8821, local11, local20, local24, local28, local32, local36);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II[Lclient!gba;)V")
	public static void method4787(@OriginalArg(0) int arg0, @OriginalArg(2) Class115[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class115 local9 = arg1[local3];
			if (local9 != null && arg0 == local9.anInt3441 && !Static69.method1229(local9)) {
				if (local9.anInt3519 == 0) {
					method4787(local9.anInt3464, arg1);
					if (local9.aClass115Array1 != null) {
						method4787(local9.anInt3464, local9.aClass115Array1);
					}
					@Pc(47) Class4_Sub49 local47 = (Class4_Sub49) Static543.aClass183_39.method4289((long) local9.anInt3464);
					if (local47 != null) {
						Static421.method7824(local47.anInt9337);
					}
				}
				if (local9.anInt3519 == 6 && local9.anInt3494 != -1) {
					@Pc(67) Class77 local67 = Static168.aClass327_2.method7326(local9.anInt3494);
					if (local67 != null) {
						local9.anInt3524 += Static426.anInt7338;
						@Pc(78) int local78 = local9.anInt3460;
						while (local9.anInt3524 > local67.anIntArray240[local9.anInt3460]) {
							local9.anInt3524 -= local67.anIntArray240[local9.anInt3460];
							local9.anInt3460++;
							if (local67.anIntArray238.length <= local9.anInt3460) {
								local9.anInt3460 -= local67.anInt2575;
								if (local9.anInt3460 < 0 || local67.anIntArray238.length <= local9.anInt3460) {
									local9.anInt3460 = 0;
								}
							}
							local9.anInt3491 = local9.anInt3460 + 1;
							if (local9.anInt3491 >= local67.anIntArray238.length) {
								local9.anInt3491 -= local67.anInt2575;
								if (local9.anInt3491 < 0 || local67.anIntArray238.length <= local9.anInt3491) {
									local9.anInt3491 = -1;
								}
							}
							Static330.method4950(local9);
						}
						if (local9.anInt3460 != local78) {
							Static443.method6270(local9.anInt3460, local67);
						}
					}
				}
			}
		}
	}
}

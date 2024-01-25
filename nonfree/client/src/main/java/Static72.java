import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
	public static int anInt1877;

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_24 = new Class267("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "([IZLclient!cu;[I[I)V")
	public static void method1457(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class3_Sub2_Sub1_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(13) int local13 = arg2[local7];
			@Pc(17) int local17 = arg3[local7];
			@Pc(21) int local21 = arg0[local7];
			for (@Pc(23) int local23 = 0; local17 != 0 && local23 < arg1.aClass235Array3.length; local23++) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg1.aClass235Array3[local23] = null;
					} else {
						@Pc(45) Class131 local45 = Static5.aClass217_1.method5234(local13);
						@Pc(48) int local48 = local45.anInt3702;
						@Pc(53) Class235 local53 = arg1.aClass235Array3[local23];
						if (local53 != null) {
							if (local53.anInt6860 == local13) {
								if (local48 == 0) {
									local53 = arg1.aClass235Array3[local23] = null;
								} else if (local48 == 1) {
									local53.anInt6863 = 0;
									local53.anInt6864 = 0;
									local53.anInt6858 = 1;
									local53.anInt6861 = 0;
									local53.anInt6862 = local21;
									Static160.method2664(0, arg1.anInt7202, false, local45, arg1.anInt7207, arg1.aByte103);
								} else if (local48 == 2) {
									local53.anInt6863 = 0;
								}
							} else if (local45.anInt3701 >= Static5.aClass217_1.method5234(local53.anInt6860).anInt3701) {
								local53 = arg1.aClass235Array3[local23] = null;
							}
						}
						if (local53 == null) {
							local53 = arg1.aClass235Array3[local23] = new Class235();
							local53.anInt6858 = 1;
							local53.anInt6860 = local13;
							local53.anInt6862 = local21;
							local53.anInt6863 = 0;
							local53.anInt6864 = 0;
							local53.anInt6861 = 0;
							Static160.method2664(0, arg1.anInt7202, false, local45, arg1.anInt7207, arg1.aByte103);
						}
					}
				}
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)Z")
	public static boolean method1459() {
		return Static151.anInt3129 > 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!th", name = "I", descriptor = "I")
	public static int anInt6972;

	@OriginalMember(owner = "client!th", name = "P", descriptor = "I")
	public static int anInt6978;

	@OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
	public static int anInt6979;

	@OriginalMember(owner = "client!th", name = "L", descriptor = "[I")
	public static final int[] anIntArray561 = new int[64];

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)Z")
	public static boolean method5579(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "([II[I[ILclient!ki;)V")
	public static void method5580(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class11_Sub5_Sub2_Sub1 arg3) {
		for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
			@Pc(21) int local21 = arg0[local15];
			@Pc(25) int local25 = arg1[local15];
			@Pc(29) int local29 = arg2[local15];
			for (@Pc(31) int local31 = 0; local25 != 0 && local31 < arg3.aClass15Array3.length; local31++) {
				if ((local25 & 0x1) != 0) {
					if (local21 == -1) {
						arg3.aClass15Array3[local31] = null;
					} else {
						@Pc(45) Class130 local45 = Static143.aClass85_1.method2406(local21);
						@Pc(48) int local48 = local45.anInt3937;
						@Pc(53) Class15 local53 = arg3.aClass15Array3[local31];
						if (local53 != null) {
							if (local53.anInt301 == local21) {
								if (local48 == 0) {
									local53 = arg3.aClass15Array3[local31] = null;
								} else if (local48 == 1) {
									local53.anInt298 = 1;
									local53.anInt299 = 0;
									local53.anInt302 = 0;
									local53.anInt300 = local29;
									local53.anInt297 = 0;
									Static125.method2339(arg3.anInt7514, 0, arg3.anInt7515, Static52.aClass11_Sub5_Sub2_Sub1_2 == arg3, local45, arg3.aByte100);
								} else if (local48 == 2) {
									local53.anInt299 = 0;
								}
							} else if (local45.anInt3938 >= Static143.aClass85_1.method2406(local53.anInt301).anInt3938) {
								local53 = arg3.aClass15Array3[local31] = null;
							}
						}
						if (local53 == null) {
							local53 = arg3.aClass15Array3[local31] = new Class15();
							local53.anInt301 = local21;
							local53.anInt300 = local29;
							local53.anInt299 = 0;
							local53.anInt297 = 0;
							local53.anInt298 = 1;
							local53.anInt302 = 0;
							Static125.method2339(arg3.anInt7514, 0, arg3.anInt7515, Static52.aClass11_Sub5_Sub2_Sub1_2 == arg3, local45, arg3.aByte100);
						}
					}
				}
				local25 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZI)Z")
	public static boolean method5585(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}
}

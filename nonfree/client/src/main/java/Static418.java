import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!qca", name = "G", descriptor = "Lclient!vg;")
	public static final Class340 aClass340_6 = new Class340();

	@OriginalMember(owner = "client!qca", name = "K", descriptor = "I")
	public static int anInt7866 = 0;

	@OriginalMember(owner = "client!qca", name = "O", descriptor = "Z")
	public static boolean aBoolean541 = false;

	@OriginalMember(owner = "client!qca", name = "P", descriptor = "Lclient!gfa;")
	public static final Class116 aClass116_9 = new Class116(8, 0, 4, 1);

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ILclient!rda;[I[I[I)V")
	public static void method6555(@OriginalArg(1) Class1_Sub4_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg2.length; local12++) {
			@Pc(18) int local18 = arg2[local12];
			@Pc(22) int local22 = arg1[local12];
			@Pc(26) int local26 = arg3[local12];
			for (@Pc(28) int local28 = 0; local22 != 0 && arg0.aClass129Array3.length > local28; local28++) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg0.aClass129Array3[local28] = null;
					} else {
						@Pc(54) Class365 local54 = Static61.aClass48_1.method1016(local18);
						@Pc(57) int local57 = local54.anInt10221;
						@Pc(62) Class129 local62 = arg0.aClass129Array3[local28];
						if (local62 != null) {
							if (local18 == local62.anInt3570) {
								if (local57 == 0) {
									local62 = arg0.aClass129Array3[local28] = null;
								} else if (local57 == 1) {
									local62.anInt3571 = 1;
									local62.anInt3565 = 0;
									local62.anInt3566 = 0;
									local62.anInt3569 = local26;
									local62.anInt3572 = 0;
									if (!arg0.aBoolean590) {
										Static301.method5179(local54, arg0, 0);
									}
								} else if (local57 == 2) {
									local62.anInt3565 = 0;
								}
							} else if (local54.anInt10218 >= Static61.aClass48_1.method1016(local62.anInt3570).anInt10218) {
								local62 = arg0.aClass129Array3[local28] = null;
							}
						}
						if (local62 == null) {
							local62 = arg0.aClass129Array3[local28] = new Class129();
							local62.anInt3571 = 1;
							local62.anInt3566 = 0;
							local62.anInt3572 = 0;
							local62.anInt3569 = local26;
							local62.anInt3565 = 0;
							local62.anInt3570 = local18;
							if (!arg0.aBoolean590) {
								Static301.method5179(local54, arg0, 0);
							}
						}
					}
				}
				local22 >>>= 0x1;
			}
		}
	}
}

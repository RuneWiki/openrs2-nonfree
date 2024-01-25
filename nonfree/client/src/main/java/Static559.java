import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!tv", name = "eb", descriptor = "I")
	public static int anInt9548;

	@OriginalMember(owner = "client!tv", name = "pb", descriptor = "I")
	public static int anInt9554;

	@OriginalMember(owner = "client!tv", name = "K", descriptor = "Lclient!ofa;")
	public static final Class244 aClass244_5 = new Class244("LIVE", 0);

	@OriginalMember(owner = "client!tv", name = "kb", descriptor = "[I")
	public static final int[] anIntArray582 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!tv", name = "ob", descriptor = "Lclient!ga;")
	public static final Class107 aClass107_5 = new Class107("WTWIP", "office", "_wip", 3);

	@OriginalMember(owner = "client!tv", name = "qb", descriptor = "I")
	public static int anInt9555 = 0;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IZI)V")
	public static void method7893(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		Static402.method6832(arg0, Static287.aClass176_12.method4986(Static380.anInt7247), arg1);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IB)V")
	public static void method7894(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub1_Sub21 local8 = Static57.method8561(arg0, 6);
		local8.method8628();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "([II[ILclient!lea;[I)V")
	public static void method7899(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class2_Sub3_Sub1_Sub2_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(13) int local13 = arg3[local7];
			@Pc(17) int local17 = arg0[local7];
			@Pc(21) int local21 = arg1[local7];
			for (@Pc(23) int local23 = 0; local17 != 0 && arg2.aClass98Array3.length > local23; local23++) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg2.aClass98Array3[local23] = null;
					} else {
						@Pc(40) Class290 local40 = Static618.aClass222_2.method5867(local13);
						@Pc(43) int local43 = local40.anInt8682;
						@Pc(48) Class98 local48 = arg2.aClass98Array3[local23];
						if (local48 != null) {
							if (local48.anInt3718 == local13) {
								if (local43 == 0) {
									local48 = arg2.aClass98Array3[local23] = null;
								} else if (local43 == 1) {
									local48.anInt3713 = 1;
									local48.anInt3711 = 0;
									local48.anInt3714 = 0;
									local48.anInt3712 = local21;
									local48.anInt3717 = 0;
									if (!arg2.aBoolean533) {
										Static349.method5726(0, local40, arg2);
									}
								} else if (local43 == 2) {
									local48.anInt3717 = 0;
								}
							} else if (local40.anInt8688 >= Static618.aClass222_2.method5867(local48.anInt3718).anInt8688) {
								local48 = arg2.aClass98Array3[local23] = null;
							}
						}
						if (local48 == null) {
							local48 = arg2.aClass98Array3[local23] = new Class98();
							local48.anInt3718 = local13;
							local48.anInt3711 = 0;
							local48.anInt3714 = 0;
							local48.anInt3713 = 1;
							local48.anInt3717 = 0;
							local48.anInt3712 = local21;
							if (!arg2.aBoolean533) {
								Static349.method5726(0, local40, arg2);
							}
						}
					}
				}
				local17 >>>= 0x1;
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!ls", name = "J", descriptor = "I")
	public static int anInt3977;

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[128][128];

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "([I[I[ILclient!qh;B)V")
	public static void method3638(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class3_Sub3_Sub6_Sub1 arg3) {
		for (@Pc(16) int local16 = 0; local16 < arg0.length; local16++) {
			@Pc(22) int local22 = arg0[local16];
			@Pc(26) int local26 = arg2[local16];
			@Pc(30) int local30 = arg1[local16];
			@Pc(32) int local32 = 0;
			while (local26 != 0 && local32 < arg3.aClass38Array3.length) {
				if ((local26 & 0x1) != 0) {
					if (local22 == -1) {
						arg3.aClass38Array3[local32] = null;
					} else {
						@Pc(50) Class83 local50 = Static244.aClass174_2.method4011(local22);
						@Pc(53) int local53 = local50.anInt1981;
						@Pc(58) Class38 local58 = arg3.aClass38Array3[local32];
						if (local58 != null) {
							if (local58.anInt918 == local22) {
								if (local53 == 0) {
									local58 = arg3.aClass38Array3[local32] = null;
								} else if (local53 == 1) {
									local58.anInt916 = 1;
									local58.anInt922 = 0;
									local58.anInt921 = local30;
									local58.anInt919 = 0;
									local58.anInt920 = 0;
									Static34.method731(local50, arg3.aByte93, 0, Static134.aClass3_Sub3_Sub6_Sub1_1 == arg3, arg3.anInt6675, arg3.anInt6677);
								} else if (local53 == 2) {
									local58.anInt919 = 0;
								}
							} else if (local50.anInt1998 >= Static244.aClass174_2.method4011(local58.anInt918).anInt1998) {
								local58 = arg3.aClass38Array3[local32] = null;
							}
						}
						if (local58 == null) {
							local58 = arg3.aClass38Array3[local32] = new Class38();
							local58.anInt920 = 0;
							local58.anInt921 = local30;
							local58.anInt918 = local22;
							local58.anInt916 = 1;
							local58.anInt922 = 0;
							local58.anInt919 = 0;
							Static34.method731(local50, arg3.aByte93, 0, Static134.aClass3_Sub3_Sub6_Sub1_1 == arg3, arg3.anInt6675, arg3.anInt6677);
						}
					}
				}
				local32++;
				local26 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!lt;IIBZI)V")
	public static void method3661(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2) {
		Static411.aClass158_87 = arg0;
		Static271.anInt4635 = 0;
		Static254.anInt3860 = 10000;
		Static61.aBoolean110 = false;
		Static2.anInt9 = 1;
		Static422.anInt7022 = arg2;
		Static258.anInt4423 = arg1;
	}
}

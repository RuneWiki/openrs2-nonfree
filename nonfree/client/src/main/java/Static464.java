import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "[I")
	public static final int[] anIntArray429 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "[I")
	public static final int[] anIntArray430 = new int[3];

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "()V")
	public static void method6951() {
		for (@Pc(1) int local1 = Static67.anInt2304; local1 < Static618.anInt10427; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static623.anInt10485; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static142.anInt3372; local7++) {
					@Pc(16) Class186 local16 = Static26.aClass186ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class9_Sub4_Sub5 local21 = local16.aClass9_Sub4_Sub5_1;
						@Pc(24) Class9_Sub4_Sub5 local24 = local16.aClass9_Sub4_Sub5_2;
						if (local21 != null && local21.method8417()) {
							Static25.method717(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8417()) {
								Static25.method717(local24, local1, local4, local7, 1, 1);
								local24.method8416(local21, false, 0, Static472.aClass5_14, 0, 0);
								local24.method8427();
							}
							local21.method8427();
						}
						for (@Pc(68) Class168 local68 = local16.aClass168_3; local68 != null; local68 = local68.aClass168_2) {
							@Pc(72) Class9_Sub4_Sub2 local72 = local68.aClass9_Sub4_Sub2_1;
							if (local72 != null && local72.method8417()) {
								Static25.method717(local72, local1, local4, local7, local72.aShort117 + 1 - local72.aShort115, local72.aShort116 - local72.aShort114 + 1);
								local72.method8427();
							}
						}
						@Pc(108) Class9_Sub4_Sub3 local108 = local16.aClass9_Sub4_Sub3_1;
						if (local108 != null && local108.method8417()) {
							Static145.method2837(local108, local1, local4, local7);
							local108.method8427();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I[I[ILclient!cea;[I)V")
	public static void method6953(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class9_Sub4_Sub2_Sub1_Sub1 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg3.length; local11++) {
			@Pc(17) int local17 = arg3[local11];
			@Pc(21) int local21 = arg1[local11];
			@Pc(25) int local25 = arg0[local11];
			for (@Pc(27) int local27 = 0; local21 != 0 && local27 < arg2.aClass241Array3.length; local27++) {
				if ((local21 & 0x1) != 0) {
					if (local17 == -1) {
						arg2.aClass241Array3[local27] = null;
					} else {
						@Pc(45) Class113 local45 = Static528.aClass198_2.method5706(local17);
						@Pc(48) int local48 = local45.anInt3849;
						@Pc(53) Class241 local53 = arg2.aClass241Array3[local27];
						if (local53 != null) {
							if (local53.anInt7475 == local17) {
								if (local48 == 0) {
									local53 = arg2.aClass241Array3[local27] = null;
								} else if (local48 == 1) {
									local53.anInt7482 = 0;
									local53.anInt7477 = 0;
									local53.anInt7479 = 0;
									local53.anInt7478 = local25;
									local53.anInt7476 = 1;
									if (!arg2.aBoolean350) {
										Static598.method8288(arg2, 0, local45);
									}
								} else if (local48 == 2) {
									local53.anInt7479 = 0;
								}
							} else if (local45.anInt3857 >= Static528.aClass198_2.method5706(local53.anInt7475).anInt3857) {
								local53 = arg2.aClass241Array3[local27] = null;
							}
						}
						if (local53 == null) {
							local53 = arg2.aClass241Array3[local27] = new Class241();
							local53.anInt7478 = local25;
							local53.anInt7479 = 0;
							local53.anInt7475 = local17;
							local53.anInt7482 = 0;
							local53.anInt7477 = 0;
							local53.anInt7476 = 1;
							if (!arg2.aBoolean350) {
								Static598.method8288(arg2, 0, local45);
							}
						}
					}
				}
				local21 >>>= 0x1;
			}
		}
	}
}

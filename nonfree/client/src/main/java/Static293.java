import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!lda", name = "B", descriptor = "[I")
	public static int[] anIntArray459;

	@OriginalMember(owner = "client!lda", name = "C", descriptor = "I")
	public static int anInt5417;

	@OriginalMember(owner = "client!lda", name = "G", descriptor = "[I")
	public static final int[] anIntArray460 = new int[1000];

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIB)Z")
	public static boolean method4586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static570.method7801(arg1, arg0) || Static270.method4371(arg1, arg0);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)I")
	public static int method4587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static577.anIntArrayArray78 == null ? 0 : Static577.anIntArrayArray78[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)[Lclient!ge;")
	public static Class118[] method4589() {
		return new Class118[] { Static581.aClass118_1, Static581.aClass118_2, Static581.aClass118_3, Static581.aClass118_4, Static581.aClass118_5, Static581.aClass118_6, Static581.aClass118_7, Static581.aClass118_8, Static581.aClass118_9, Static581.aClass118_10, Static581.aClass118_11, Static581.aClass118_12, Static581.aClass118_13, Static581.aClass118_14 };
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIII)V")
	public static void method4590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static373.anInt6695 + arg0;
		@Pc(13) int local13 = Static6.anInt97 + arg1;
		if (Static309.aClass100ArrayArrayArray2 == null || arg0 < 0 || arg1 < 0 || arg0 >= Static38.anInt740 || arg1 >= Static38.anInt741) {
			return;
		}
		@Pc(44) long local44 = (long) (local13 << 14 | arg2 << 28 | local9);
		@Pc(50) Class4_Sub15 local50 = (Class4_Sub15) Static486.aClass183_34.method4289(local44);
		if (local50 == null) {
			Static74.method1334(arg2, arg0, arg1);
			return;
		}
		@Pc(64) Class4_Sub38 local64 = (Class4_Sub38) local50.aClass124_18.method3267();
		if (local64 == null) {
			Static74.method1334(arg2, arg0, arg1);
			return;
		}
		@Pc(78) Class10_Sub3_Sub1 local78 = (Class10_Sub3_Sub1) Static74.method1334(arg2, arg0, arg1);
		if (local78 == null) {
			local78 = new Class10_Sub3_Sub1();
		} else {
			local78.anInt2348 = local78.anInt2346 = -1;
		}
		local78.anInt2350 = local64.anInt7347;
		local78.anInt2352 = local64.anInt7346;
		label46: while (true) {
			@Pc(106) Class4_Sub38 local106 = (Class4_Sub38) local50.aClass124_18.method3273();
			if (local106 == null) {
				break;
			}
			if (local106.anInt7346 != local78.anInt2352) {
				local78.anInt2348 = local106.anInt7346;
				local78.anInt2357 = local106.anInt7347;
				while (true) {
					@Pc(131) Class4_Sub38 local131 = (Class4_Sub38) local50.aClass124_18.method3273();
					if (local131 == null) {
						break label46;
					}
					if (local78.anInt2352 != local131.anInt7346 && local131.anInt7346 != local78.anInt2348) {
						local78.anInt2351 = local131.anInt7347;
						local78.anInt2346 = local131.anInt7346;
					}
				}
			}
		}
		@Pc(175) int local175 = Static160.method3164((arg0 << 9) + 256, arg2, (arg1 << 9) + 256);
		Static208.method3672(arg2, arg0, arg1, local175, local78);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(III)V")
	public static void method4591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class4_Sub7_Sub5 local12 = Static218.method3780(13, arg0);
		local12.method3066();
		local12.anInt3348 = arg1;
	}
}

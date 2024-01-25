import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!qo", name = "w", descriptor = "Lclient!lg;")
	public static Class60 aClass60_17;

	@OriginalMember(owner = "client!qo", name = "C", descriptor = "I")
	public static int anInt3386;

	@OriginalMember(owner = "client!qo", name = "t", descriptor = "Lclient!uc;")
	public static Class198 aClass198_22 = new Class198(16);

	@OriginalMember(owner = "client!qo", name = "E", descriptor = "[I")
	public static final int[] anIntArray302 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!qo", name = "I", descriptor = "I")
	public static int anInt3389 = 0;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIZ)V")
	public static void method2930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1009) {
			Static97.method1755(10, arg0, arg2);
		} else if (arg1 == 1012) {
			Static97.method1755(11, arg0, arg2);
		} else if (arg1 == 1004) {
			Static97.method1755(12, arg0, arg2);
			return;
		} else if (arg1 == 1008) {
			Static97.method1755(13, arg0, arg2);
			return;
		} else if (arg1 == 1005) {
			Static97.method1755(14, arg0, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!lo;)V")
	public static void method2931(@OriginalArg(1) Class2_Sub2_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static342.anInt6706 == arg0.anInt6491 || arg0.anInt6517 == -1 || arg0.anInt6490 != 0) {
			local5 = true;
		} else {
			@Pc(24) Class116 local24 = Static340.method5560(arg0.anInt6517);
			if (local24.aBoolean310 || arg0.anInt6493 + 1 > local24.anIntArray329[arg0.anInt6487]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(52) int local52 = arg0.anInt6491 - arg0.anInt6484;
			@Pc(58) int local58 = Static342.anInt6706 - arg0.anInt6484;
			@Pc(70) int local70 = arg0.anInt6475 * 128 + arg0.method5425() * 64;
			@Pc(81) int local81 = arg0.anInt6529 * 128 + arg0.method5425() * 64;
			@Pc(93) int local93 = arg0.anInt6481 * 128 + arg0.method5425() * 64;
			@Pc(105) int local105 = arg0.anInt6486 * 128 + arg0.method5425() * 64;
			arg0.anInt6466 = (local58 * local105 + local81 * (local52 - local58)) / local52;
			arg0.anInt6465 = (local93 * local58 + local70 * (local52 - local58)) / local52;
		}
		arg0.anInt6548 = 0;
		if (arg0.anInt6519 == 0) {
			arg0.method5421(8192);
		}
		if (arg0.anInt6519 == 1) {
			arg0.method5421(12288);
		}
		if (arg0.anInt6519 == 2) {
			arg0.method5421(0);
		}
		if (arg0.anInt6519 == 3) {
			arg0.method5421(4096);
		}
	}
}

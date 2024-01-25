import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
	public static int anInt6442;

	@OriginalMember(owner = "client!vk", name = "D", descriptor = "Lclient!pc;")
	public static Class176 aClass176_9;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
	public static int anInt6437 = 0;

	@OriginalMember(owner = "client!vk", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!vk", name = "t", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_197 = new Class41(7, 3);

	@OriginalMember(owner = "client!vk", name = "z", descriptor = "Z")
	public static boolean aBoolean478 = false;

	@OriginalMember(owner = "client!vk", name = "A", descriptor = "I")
	public static final int anInt6456 = 1337;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZI)Z")
	public static boolean method5551(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIII)V")
	public static void method5557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg3 - arg4;
		@Pc(15) int local15 = arg0 + arg4;
		for (@Pc(17) int local17 = arg0; local17 < local15; local17++) {
			Static264.method4096(Static267.anIntArrayArray38[local17], arg2, arg1, arg5);
		}
		@Pc(42) int local42 = arg1 - arg4;
		@Pc(46) int local46 = arg4 + arg5;
		for (@Pc(52) int local52 = arg3; local52 > local10; local52--) {
			Static264.method4096(Static267.anIntArrayArray38[local52], arg2, arg1, arg5);
		}
		for (@Pc(68) int local68 = local15; local68 <= local10; local68++) {
			@Pc(74) int[] local74 = Static267.anIntArrayArray38[local68];
			Static264.method4096(local74, arg2, local46, arg5);
			Static264.method4096(local74, arg2, arg1, local42);
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!qg;ZBIII)V")
	public static void method5563(@OriginalArg(0) int arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static98.anInt1946 >= 50 || (arg1 == null || arg1.anIntArrayArray45 == null || arg5 >= arg1.anIntArrayArray45.length || arg1.anIntArrayArray45[arg5] == null)) {
			return;
		}
		@Pc(35) int local35 = arg1.anIntArrayArray45[arg5][0];
		@Pc(39) int local39 = local35 >> 8;
		@Pc(45) int local45 = local35 >> 5 & 0x7;
		@Pc(49) int local49 = local35 & 0x1F;
		@Pc(66) int local66;
		if (arg1.anIntArrayArray45[arg5].length > 1) {
			local66 = (int) (Math.random() * (double) arg1.anIntArrayArray45[arg5].length);
			if (local66 > 0) {
				local39 = arg1.anIntArrayArray45[arg5][local66];
			}
		}
		if (local49 == 0) {
			if (arg2) {
				Static134.method2336(0, 255, local39, local45);
			}
		} else if (Static16.anInt400 != 0) {
			Static133.anIntArray281[Static98.anInt1946] = local39;
			Static17.anIntArray80[Static98.anInt1946] = local45;
			Static299.anIntArray651[Static98.anInt1946] = 0;
			Static146.aClass236Array1[Static98.anInt1946] = null;
			Static198.anIntArray440[Static98.anInt1946] = 255;
			local66 = (arg3 - 64) / 128;
			@Pc(124) int local124 = (arg4 - 64) / 128;
			Static21.anIntArray96[Static98.anInt1946] = local49 + (local124 << 8) + (arg0 << 24) + (local66 << 16);
			Static98.anInt1946++;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!qf", name = "U", descriptor = "[Lclient!ug;")
	public static Class1_Sub2_Sub14[] aClass1_Sub2_Sub14Array15;

	@OriginalMember(owner = "client!qf", name = "X", descriptor = "Z")
	public static boolean aBoolean264;

	@OriginalMember(owner = "client!qf", name = "T", descriptor = "[I")
	public static int[] anIntArray479 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(B)V")
	public static void method3780() {
		Static97.aClass155_45.method4354();
		Static131.aClass155_27.method4354();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!ok;IIIIIB)V")
	public static void method3782(@OriginalArg(0) int arg0, @OriginalArg(1) Class116 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static74.aBoolean99) {
			Static62.anInt1582 = 32;
		} else {
			Static62.anInt1582 = 0;
		}
		Static74.aBoolean99 = false;
		@Pc(130) int local130;
		if (Static224.anInt4947 != 0) {
			if (arg4 >= arg2 && arg2 + 16 > arg4 && arg0 <= arg6 && arg0 + 16 > arg6) {
				arg1.anInt4307 -= 4;
				Static189.method3378(arg1);
			} else if (arg2 <= arg4 && arg4 < arg2 + 16 && arg5 + arg0 - 16 <= arg6 && arg5 + arg0 > arg6) {
				arg1.anInt4307 += 4;
				Static189.method3378(arg1);
			} else if (arg2 - Static62.anInt1582 <= arg4 && arg2 + Static62.anInt1582 + 16 > arg4 && arg6 >= arg0 + 16 && arg6 < arg0 + arg5 - 16) {
				local130 = (arg5 - 32) * arg5 / arg3;
				if (local130 < 8) {
					local130 = 8;
				}
				@Pc(144) int local144 = arg5 - local130 - 32;
				@Pc(155) int local155 = arg6 - local130 / 2 - arg0 - 16;
				arg1.anInt4307 = (arg3 - arg5) * local155 / local144;
				Static189.method3378(arg1);
				Static74.aBoolean99 = true;
			}
		}
		if (Static161.anInt3716 == 0) {
			return;
		}
		local130 = arg1.anInt4299;
		if (arg2 - local130 <= arg4 && arg6 >= arg0 && arg4 < arg2 + 16 && arg6 <= arg5 + arg0) {
			arg1.anInt4307 += Static161.anInt3716 * 45;
			Static189.method3378(arg1);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!lg;I)V")
	public static void method3783(@OriginalArg(0) Class25_Sub1 arg0) {
		if (Static32.anInt809 == arg0.anInt1630 || arg0.anInt1625 == -1 || arg0.anInt1653 != 0 || arg0.anInt1614 + 1 > Static115.method1895(arg0.anInt1625).anIntArray589[arg0.anInt1608]) {
			@Pc(39) int local39 = arg0.anInt1630 - arg0.anInt1633;
			@Pc(44) int local44 = Static32.anInt809 - arg0.anInt1633;
			@Pc(56) int local56 = arg0.anInt1609 * 128 + arg0.method1243() * 64;
			@Pc(67) int local67 = arg0.anInt1647 * 128 + arg0.method1243() * 64;
			@Pc(81) int local81 = arg0.anInt1641 * 128 + arg0.method1243() * 64;
			@Pc(93) int local93 = arg0.anInt1612 * 128 + arg0.method1243() * 64;
			arg0.anInt1635 = ((local39 - local44) * local56 + local81 * local44) / local39;
			arg0.anInt1604 = (local67 * (local39 - local44) + local93 * local44) / local39;
		}
		if (arg0.anInt1618 == 0) {
			arg0.anInt1628 = 1024;
		}
		if (arg0.anInt1618 == 1) {
			arg0.anInt1628 = 1536;
		}
		if (arg0.anInt1618 == 2) {
			arg0.anInt1628 = 0;
		}
		if (arg0.anInt1618 == 3) {
			arg0.anInt1628 = 512;
		}
		arg0.anInt1683 = 0;
		arg0.anInt1681 = arg0.anInt1628;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V")
	public static void method3784() {
		@Pc(6) Class158 local6 = Static191.aClass158_1;
		synchronized (Static191.aClass158_1) {
			Static99.anInt2208++;
			Static224.anInt4947 = Static235.anInt5162;
			Static84.anInt1989 = Static243.anInt5328;
			Static212.anInt4711 = Static130.anInt2889;
			Static242.anInt5298 = Static78.anInt1882;
			Static182.anInt4419 = Static196.anInt4436;
			Static279.anInt5967 = Static83.anInt1983;
			Static181.aLong142 = Static19.aLong31;
			Static78.anInt1882 = 0;
		}
	}
}

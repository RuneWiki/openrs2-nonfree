import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!q", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!q", name = "p", descriptor = "I")
	public static int anInt5105;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIB)V", line = 32)
	public static void method4681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class2_Sub2_Sub7 local12 = Static293.method5414(8, arg2);
		local12.method2313();
		local12.anInt2286 = arg1;
		local12.anInt2281 = arg3;
		local12.anInt2287 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIILjava/lang/String;I)V", line = 52)
	public static void method4682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class161 local8 = Static193.method3706(arg0, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray27 != null) {
			@Pc(18) Class2_Sub13 local18 = new Class2_Sub13();
			local18.anObjectArray4 = local8.anObjectArray27;
			local18.anInt2115 = arg1;
			local18.aClass161_3 = local8;
			local18.aString20 = arg2;
			Static185.method3592(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt4266 != 0) {
			local35 = Static7.method6473(local8);
		}
		if (!local35 || !Static42.method1406(local8).method1856(arg1 - 1)) {
			return;
		}
		if (arg1 == 1) {
			Static85.method1962(Class89.aClass145_89);
			Static173.method3399(arg3, local8.anInt4293, arg0);
		}
		if (arg1 == 2) {
			Static85.method1962(Class108.aClass145_109);
			Static173.method3399(arg3, local8.anInt4293, arg0);
		}
		if (arg1 == 3) {
			Static85.method1962(Class30.aClass145_34);
			Static173.method3399(arg3, local8.anInt4293, arg0);
		}
		if (arg1 == 4) {
			Static85.method1962(Class241.aClass145_254);
			Static173.method3399(arg3, local8.anInt4293, arg0);
		}
		if (arg1 == 5) {
			Static85.method1962(Class2_Sub2_Sub7.aClass145_86);
			Static173.method3399(arg3, local8.anInt4293, arg0);
		}
		if (arg1 == 6) {
			Static85.method1962(Class125.aClass145_134);
			Static173.method3399(arg3, local8.anInt4293, arg0);
		}
		if (arg1 == 7) {
			Static85.method1962(Class63.aClass145_65);
			Static173.method3399(arg3, local8.anInt4293, arg0);
		}
		if (arg1 == 8) {
			Static85.method1962(Class2_Sub3_Sub16.aClass145_107);
			Static173.method3399(arg3, local8.anInt4293, arg0);
		}
		if (arg1 == 9) {
			Static85.method1962(Class31.aClass145_147);
			Static173.method3399(arg3, local8.anInt4293, arg0);
		}
		if (arg1 == 10) {
			Static85.method1962(Class215.aClass145_218);
			Static173.method3399(arg3, local8.anInt4293, arg0);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!mr;B)V", line = 164)
	public static void method4683(@OriginalArg(0) Class11_Sub5_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt4576 == Class83.anInt2345 || arg0.anInt4589 == -1 || arg0.anInt4582 != 0) {
			local5 = true;
		} else {
			@Pc(25) Class157 local25 = Static37.aClass85_1.method2373(arg0.anInt4589);
			if (local25.aBoolean264 || arg0.anInt4615 + 1 > local25.anIntArray261[arg0.anInt4599]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(57) int local57 = arg0.anInt4576 - arg0.anInt4613;
			@Pc(63) int local63 = Class83.anInt2345 - arg0.anInt4613;
			@Pc(75) int local75 = arg0.anInt4606 * 128 + arg0.method4329() * 64;
			@Pc(86) int local86 = arg0.anInt4580 * 128 + arg0.method4329() * 64;
			@Pc(97) int local97 = arg0.anInt4569 * 128 + arg0.method4329() * 64;
			@Pc(109) int local109 = arg0.anInt4591 * 128 + arg0.method4329() * 64;
			arg0.anInt6768 = ((local57 - local63) * local75 + local63 * local97) / local57;
			arg0.anInt6770 = ((local57 - local63) * local86 + local63 * local109) / local57;
		}
		arg0.anInt4632 = 0;
		if (arg0.anInt4605 == 0) {
			arg0.method4331(8192);
		}
		if (arg0.anInt4605 == 1) {
			arg0.method4331(12288);
		}
		if (arg0.anInt4605 == 2) {
			arg0.method4331(0);
		}
		if (arg0.anInt4605 == 3) {
			arg0.method4331(4096);
		}
	}
}

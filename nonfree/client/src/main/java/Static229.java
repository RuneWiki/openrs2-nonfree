import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!pf", name = "T", descriptor = "Lclient!lm;")
	public static Class134 aClass134_108;

	@OriginalMember(owner = "client!pf", name = "Y", descriptor = "Lclient!cq;")
	public static Class8 aClass8_20;

	@OriginalMember(owner = "client!pf", name = "Q", descriptor = "Lclient!gq;")
	public static final Class88 aClass88_8 = new Class88(128);

	@OriginalMember(owner = "client!pf", name = "U", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_23 = new Class14();

	@OriginalMember(owner = "client!pf", name = "W", descriptor = "I")
	public static int anInt4787 = 0;

	@OriginalMember(owner = "client!pf", name = "X", descriptor = "I")
	public static int anInt4788 = 0;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIILclient!ps;BII)V")
	public static void method4151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class163 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static223.aBoolean101) {
			Static325.anInt2769 = 32;
		} else {
			Static325.anInt2769 = 0;
		}
		Static223.aBoolean101 = false;
		@Pc(132) int local132;
		if (Static9.anInt116 != 0) {
			if (arg1 >= arg0 && arg0 + 16 > arg1 && arg3 <= arg6 && arg6 < arg3 + 16) {
				arg4.anInt4985 -= 4;
				Static340.method5639(arg4);
			} else if (arg0 <= arg1 && arg0 + 16 > arg1 && arg6 >= arg3 + arg5 - 16 && arg6 < arg5 + arg3) {
				arg4.anInt4985 += 4;
				Static340.method5639(arg4);
			} else if (arg1 >= arg0 - Static325.anInt2769 && arg1 < arg0 + Static325.anInt2769 + 16 && arg3 + 16 <= arg6 && arg5 + arg3 - 16 > arg6) {
				local132 = (arg5 - 32) * arg5 / arg2;
				if (local132 < 8) {
					local132 = 8;
				}
				@Pc(149) int local149 = arg6 - local132 / 2 - arg3 - 16;
				@Pc(156) int local156 = arg5 - local132 - 32;
				arg4.anInt4985 = local149 * (arg2 - arg5) / local156;
				Static340.method5639(arg4);
				Static223.aBoolean101 = true;
			}
		}
		if (Static94.anInt1786 == 0) {
			return;
		}
		local132 = arg4.anInt4991;
		if (arg0 - local132 <= arg1 && arg6 >= arg3 && arg1 < arg0 + 16 && arg3 + arg5 >= arg6) {
			arg4.anInt4985 += Static94.anInt1786 * 45;
			Static340.method5639(arg4);
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(IB)I")
	public static int method4152(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(JB)V")
	public static void method4153(@OriginalArg(0) long arg0) {
		if (Static347.aClass83ArrayArrayArray3 != null) {
			if (Static246.anInt5156 == 1 || Static246.anInt5156 == 5) {
				Static147.method2607(arg0);
			} else if (Static246.anInt5156 == 4) {
				Static134.method2267(arg0);
			}
		}
		Static290.method5074((long) Static282.anInt3516, Static217.aClass105_5);
		if (Static129.anInt2569 != -1) {
			Static46.method938(Static129.anInt2569);
		}
		for (@Pc(48) int local48 = 0; local48 < Static344.anInt6649; local48++) {
			if (Static19.aBooleanArray1[local48]) {
				Static78.aBooleanArray7[local48] = true;
			}
			Static75.aBooleanArray6[local48] = Static19.aBooleanArray1[local48];
			Static19.aBooleanArray1[local48] = false;
		}
		Class1_Sub5_Sub19.lb = Static282.anInt3516;
		if (Static217.aClass105_5.method4259()) {
			Static282.aBoolean269 = true;
		}
		Static242.aClass163_16 = null;
		if (Static129.anInt2569 != -1) {
			Static344.anInt6649 = 0;
			Static87.method1404();
		}
		Static217.aClass105_5.method4233();
		Static149.method2621(Static217.aClass105_5);
		@Pc(99) int local99 = Static187.method3329();
		if (local99 == -1) {
			local99 = Static304.anInt6088;
		}
		Static187.method3327(local99);
		Static2.method27(Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726, Static41.anInt1126, Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728, Static127.anInt2487);
		Static41.anInt1126 = 0;
	}
}

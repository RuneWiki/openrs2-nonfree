import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static611 {

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "[J")
	public static final long[] aLongArray16 = new long[32];

	@OriginalMember(owner = "client!vr", name = "p", descriptor = "[I")
	public static int[] anIntArray695 = new int[2];

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!eq;)I")
	public static int method8351(@OriginalArg(1) Class97 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method2564(Static142.anInt3153)) {
			local5++;
		}
		if (arg0.method2564(Static628.anInt10133)) {
			local5++;
		}
		if (arg0.method2564(Static166.anInt3700)) {
			local5++;
		}
		if (arg0.method2564(Static109.anInt2153)) {
			local5++;
		}
		if (arg0.method2564(Static196.anInt4206)) {
			local5++;
		}
		if (arg0.method2564(Static505.anInt8506)) {
			local5++;
		}
		if (arg0.method2564(Static295.anInt5539)) {
			local5++;
		}
		if (arg0.method2564(Static244.anInt4843)) {
			local5++;
		}
		if (arg0.method2564(Static625.anInt10104)) {
			local5++;
		}
		if (arg0.method2564(Static542.anInt9035)) {
			local5++;
		}
		if (arg0.method2564(Static75.anInt1665)) {
			local5++;
		}
		if (arg0.method2564(Static633.anInt10164)) {
			local5++;
		}
		if (arg0.method2564(Static614.anInt9988)) {
			local5++;
		}
		if (arg0.method2564(Static75.anInt1673)) {
			local5++;
		}
		if (arg0.method2564(Static71.anInt1571)) {
			local5++;
		}
		if (arg0.method2564(Static208.anInt4360)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)Z")
	public static boolean method8353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method8354(@OriginalArg(0) String arg0) {
		@Pc(10) Class2_Sub50 local10 = Static79.method7505();
		local10.aClass2_Sub34_Sub2_2.method6894(Static10.aClass295_14.anInt8334);
		local10.aClass2_Sub34_Sub2_2.method6854(0);
		@Pc(25) int local25 = local10.aClass2_Sub34_Sub2_2.anInt8188;
		local10.aClass2_Sub34_Sub2_2.method6854(629);
		@Pc(36) int[] local36 = Static317.method4792(local10);
		@Pc(40) int local40 = local10.aClass2_Sub34_Sub2_2.anInt8188;
		local10.aClass2_Sub34_Sub2_2.method6918(arg0);
		local10.aClass2_Sub34_Sub2_2.method6894(Static377.anInt6756);
		local10.aClass2_Sub34_Sub2_2.anInt8188 += 7;
		local10.aClass2_Sub34_Sub2_2.method6892(local10.aClass2_Sub34_Sub2_2.anInt8188, local36, local40);
		local10.aClass2_Sub34_Sub2_2.method6862(local10.aClass2_Sub34_Sub2_2.anInt8188 - local25);
		Static311.method4754(local10);
		Static538.anInt8988 = 1;
		Static310.anInt5674 = 0;
		Static541.anInt9024 = 0;
		Static232.anInt7424 = -3;
	}
}

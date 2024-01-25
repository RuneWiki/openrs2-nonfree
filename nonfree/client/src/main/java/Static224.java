import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
	public static int anInt4607;

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "Lclient!eq;")
	public static Class97 aClass97_59;

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "I")
	public static int anInt4613;

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_59 = new Class274(107, 4);

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
	public static int anInt4611 = 0;

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
	public static int anInt4612 = 0;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BILclient!vg;)V")
	public static void method3808(@OriginalArg(1) int arg0, @OriginalArg(2) Class11_Sub1_Sub1_Sub2 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt3220 > Static325.anInt5888) {
			Static242.method3988(arg1);
		} else if (Static325.anInt5888 > arg1.anInt3274) {
			Static91.method1616(false, arg1);
			local9 = Static463.anInt8020;
			local7 = Static597.anInt9849;
		} else {
			Static130.method2540(arg1);
		}
		if (arg1.anInt9925 < 512 || arg1.anInt9929 < 512 || arg1.anInt9925 >= (Static3.anInt46 - 1) * 512 || Static270.anInt5194 * 512 - 512 <= arg1.anInt9929) {
			arg1.anInt3258 = -1;
			arg1.anInt3274 = 0;
			arg1.anInt3229 = -1;
			local7 = -1;
			arg1.anInt3270 = -1;
			arg1.anInt3220 = 0;
			arg1.anIntArray226 = null;
			local9 = 0;
			arg1.anInt9925 = arg1.anIntArray232[0] * 512 + arg1.method2778() * 256;
			arg1.anInt9929 = arg1.anIntArray233[0] * 512 + arg1.method2778() * 256;
			arg1.method2777();
		}
		if (arg1 == Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2 && (arg1.anInt9925 < 6144 || arg1.anInt9929 < 6144 || (Static3.anInt46 - 12) * 512 <= arg1.anInt9925 || arg1.anInt9929 >= (Static270.anInt5194 - 12) * 512)) {
			arg1.anInt3274 = 0;
			arg1.anIntArray226 = null;
			arg1.anInt3258 = -1;
			arg1.anInt3270 = -1;
			local9 = 0;
			local7 = -1;
			arg1.anInt3220 = 0;
			arg1.anInt3229 = -1;
			arg1.anInt9925 = arg1.anIntArray232[0] * 512 + arg1.method2778() * 256;
			arg1.anInt9929 = arg1.anIntArray233[0] * 512 + arg1.method2778() * 256;
			arg1.method2777();
		}
		@Pc(223) int local223 = Static444.method6592(arg1);
		Static421.method6398(arg1);
		Static80.method1496(local223, local7, local9, arg1);
		Static7.method129(arg1, local7);
		Static105.method1775(arg1);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)Z")
	public static boolean method3809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x40000) != 0 | Static270.method4343(arg1, arg0) || Static336.method5206(arg1, arg0);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IB)Z")
	public static boolean method3810(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3811(@OriginalArg(0) String arg0) {
		if (Class45_Sub1.aString108.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class45_Sub1.aString108.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class45_Sub1.aString108.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!mi", name = "K", descriptor = "[Lclient!ke;")
	public static Class1_Sub2_Sub4[] aClass1_Sub2_Sub4Array3;

	@OriginalMember(owner = "client!mi", name = "kb", descriptor = "Lclient!q;")
	public static Class1_Sub2_Sub4_Sub1 aClass1_Sub2_Sub4_Sub1_4;

	@OriginalMember(owner = "client!mi", name = "sb", descriptor = "J")
	public static long aLong16;

	@OriginalMember(owner = "client!mi", name = "ub", descriptor = "I")
	public static int anInt446;

	@OriginalMember(owner = "client!mi", name = "Jb", descriptor = "Lclient!ka;")
	public static Class70 aClass70_3;

	@OriginalMember(owner = "client!mi", name = "ic", descriptor = "I")
	public static int anInt478;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
	public static int anInt398 = 3;

	@OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
	public static volatile int anInt413 = 0;

	@OriginalMember(owner = "client!mi", name = "J", descriptor = "Z")
	public static boolean aBoolean24 = false;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;Lclient!ql;B)I")
	public static int method204(@OriginalArg(0) String arg0, @OriginalArg(1) Class1_Sub13 arg1) {
		@Pc(2) int local2 = arg1.anInt2395;
		@Pc(10) byte[] local10 = Static129.method2453(arg0);
		arg1.method1760(local10.length);
		arg1.anInt2395 += Static36.aClass118_2.method3446(local10, local10.length, arg1.aByteArray29, 0, arg1.anInt2395);
		return arg1.anInt2395 - local2;
	}

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V")
	public static void method209() {
		Static249.aClass140_17 = new Class140(32);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILclient!de;IIII)Z")
	public static boolean method217(@OriginalArg(0) int arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(6) Class56 local6 = Static154.method3007(arg1.anInt1310);
		if (local6.anInt2641 == -1) {
			return true;
		}
		if (arg1.aBoolean78) {
			@Pc(28) int local28 = arg2 + arg1.anInt1324;
			arg2 = local28 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(39) Class7_Sub1 local39 = local6.method2030(arg2, arg1.aBoolean69);
		if (local39 == null) {
			return false;
		}
		@Pc(46) int local46 = arg1.anInt1331;
		@Pc(49) int local49 = arg1.anInt1321;
		@Pc(52) int local52 = local39.anInt2102;
		if ((arg2 & 0x1) == 1) {
			local46 = arg1.anInt1321;
			local49 = arg1.anInt1331;
		}
		@Pc(68) int local68 = local39.anInt2105;
		if (local6.aBoolean143) {
			local52 = local49 * 4;
			local68 = local46 * 4;
		}
		if (local6.anInt2638 == 0) {
			local39.method1533(arg3 * 4 + 48, (-arg0 - local46 + 104) * 4 + 48, local52, local68);
		} else {
			local39.method1531(arg3 * 4 + 48, (-arg0 + 104 + -local46) * 4 + 48, local52, local68, local6.anInt2638);
		}
		return true;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/lang/String;B)I")
	public static int method218(@OriginalArg(1) String arg0) {
		return Static44.method937(16, arg0);
	}
}

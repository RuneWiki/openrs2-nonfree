import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
	public static int anInt1699;

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "Lclient!ie;")
	public static Class53 aClass53_15 = new Class53(5);

	@OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
	public static int anInt1703 = 0;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
	public static void method1307() {
		Static218.aClass53_18.method1498();
		Static188.aClass53_24.method1498();
		Static225.aClass53_32.method1498();
		Static207.aClass53_27.method1498();
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V")
	public static void method1308() {
		Static224.aClass53_31.method1498();
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)V")
	public static void method1309() {
		try {
			if (Static198.anInt4222 == 1) {
				@Pc(20) int local20 = Static225.aClass1_Sub4_Sub1_3.method373();
				if (local20 > 0 && Static225.aClass1_Sub4_Sub1_3.method385()) {
					local20 -= Static93.anInt2065;
					if (local20 < 0) {
						local20 = 0;
					}
					Static225.aClass1_Sub4_Sub1_3.method362(local20);
				} else {
					Static225.aClass1_Sub4_Sub1_3.method379();
					Static225.aClass1_Sub4_Sub1_3.method366();
					Static77.aClass88_1 = null;
					if (Static3.aClass70_1 == null) {
						Static198.anInt4222 = 0;
					} else {
						Static198.anInt4222 = 2;
					}
					Static200.aClass1_Sub28_1 = null;
				}
			}
		} catch (@Pc(59) Exception local59) {
			local59.printStackTrace();
			Static225.aClass1_Sub4_Sub1_3.method379();
			Static200.aClass1_Sub28_1 = null;
			Static198.anInt4222 = 0;
			Static77.aClass88_1 = null;
			Static3.aClass70_1 = null;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)I")
	public static int method1310(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static205.method3384(arg0);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B[B)V")
	public static void method1312(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class1_Sub16 local10 = new Class1_Sub16(arg0);
		@Pc(14) int local14 = local10.method3805();
		for (@Pc(20) int local20 = 0; local20 < local14; local20++) {
			@Pc(26) Class1_Sub22 local26 = new Class1_Sub22();
			@Pc(30) Class51 local30 = local10.method3781();
			local26.anInt3127 = local10.method3805();
			local26.anInt3118 = local10.method3805();
			local26.anInt3123 = local10.method3793();
			local26.aClass51_1107 = local30.method1418();
			local26.aClass51Array23 = local30.method1409(47);
			Static212.aClass105_23.method3119(local26);
		}
	}
}

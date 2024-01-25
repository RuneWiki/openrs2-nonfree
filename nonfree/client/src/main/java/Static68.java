import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Lclient!lf;")
	public static final Class153 aClass153_1 = new Class153(1);

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
	public static int anInt1468 = 2;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
	public static int anInt1469 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZII)Z")
	public static boolean method1345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)I")
	public static int method1346(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 1;
		@Pc(27) int local27 = local21 | local21 >>> 2;
		@Pc(33) int local33 = local27 | local27 >>> 4;
		@Pc(39) int local39 = local33 | local33 >>> 8;
		@Pc(45) int local45 = local39 | local39 >>> 16;
		return arg0 & ~local45;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)V")
	public static void method1349() {
		@Pc(1) Class267 local1 = Static412.aClass267_77;
		synchronized (Static412.aClass267_77) {
			Static412.aClass267_77.method6013();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)Z")
	public static boolean method1351(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public static void method1353() {
		Static337.aClass10_Sub8_Sub2_2.method2506(Static341.aClass187_103.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static166.aClass187_66.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static255.aClass187_81.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static347.aClass187_106.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static343.aClass187_105.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static77.aClass187_32.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static43.aClass187_11.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static3.aClass187_76.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static21.aClass187_8.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static16.aClass187_6.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static322.aClass187_95.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static265.aClass187_83.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static157.aClass187_63.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static326.aClass187_99.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static203.aClass187_72.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static131.aClass187_53.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static87.aClass187_36.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static85.aClass187_137.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static436.aClass187_126.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static297.aClass187_90.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static63.aClass187_21.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static339.aClass187_102.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static74.aClass187_30.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static251.aClass187_110.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static265.aClass187_82.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static393.aClass187_116.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static105.aClass187_43.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static39.aClass187_10.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static144.aClass187_59.method4309());
		Static337.aClass10_Sub8_Sub2_2.method2506(Static127.aClass187_50.method4309());
	}
}

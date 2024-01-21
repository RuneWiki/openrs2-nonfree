import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
	public static int anInt3449;

	@OriginalMember(owner = "client!pf", name = "bb", descriptor = "Lclient!rc;")
	public static Class66 aClass66_14 = new Class66(30);

	@OriginalMember(owner = "client!pf", name = "eb", descriptor = "Lclient!ef;")
	public static Class20 aClass20_10 = null;

	@OriginalMember(owner = "client!pf", name = "gb", descriptor = "Z")
	public static boolean aBoolean152 = false;

	@OriginalMember(owner = "client!pf", name = "nb", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!pf", name = "ob", descriptor = "I")
	public static int anInt3466 = 0;

	@OriginalMember(owner = "client!pf", name = "pb", descriptor = "I")
	public static int anInt3467 = 0;

	@OriginalMember(owner = "client!pf", name = "qb", descriptor = "I")
	public static int anInt3468 = 0;

	@OriginalMember(owner = "client!pf", name = "sb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_878 = Static8.method128("Password: ");

	@OriginalMember(owner = "client!pf", name = "rb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_877 = aClass18_878;

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "(I)V")
	public static void method2398() {
		Static165.aClass66_23.method2604();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)Lclient!af;")
	public static Class1_Sub1_Sub3 method2402(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = (Class1_Sub1_Sub3) Static166.aClass66_25.method2599((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static60.aClass16_7.method2254(arg0, 1);
		local10 = new Class1_Sub1_Sub3();
		if (local20 != null) {
			local10.method108(new Class1_Sub6(local20), arg0);
		}
		local10.method114();
		Static166.aClass66_25.method2597((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "(I)[Lclient!fa;")
	public static Class1_Sub1_Sub8_Sub1[] method2403() {
		@Pc(13) Class1_Sub1_Sub8_Sub1[] local13 = new Class1_Sub1_Sub8_Sub1[Static22.anInt615];
		for (@Pc(15) int local15 = 0; local15 < Static22.anInt615; local15++) {
			@Pc(21) Class1_Sub1_Sub8_Sub1 local21 = new Class1_Sub1_Sub8_Sub1();
			local21.anInt1434 = Static47.anInt4239;
			local21.anInt1430 = Static101.anInt3032;
			local21.anInt1433 = Static131.anIntArray333[local15];
			local21.anInt1431 = Static129.anIntArray331[local15];
			local21.anInt1435 = Static26.anIntArray54[local15];
			local21.anInt1432 = Static145.anIntArray375[local15];
			local21.anIntArray92 = Static9.anIntArray13;
			local21.aByteArray7 = Static22.aByteArrayArray4[local15];
			local13[local15] = local21;
		}
		Static76.method1682();
		return local13;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V")
	public static void method2408() {
		aClass18_877 = null;
		aClass20_10 = null;
		aCalendar1 = null;
		aClass18_878 = null;
		aClass66_14 = null;
	}
}

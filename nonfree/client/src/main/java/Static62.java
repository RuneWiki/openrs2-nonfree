import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
	public static int anInt1771;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_50 = new Class34("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "[I")
	public static final int[] anIntArray174 = new int[14];

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/Object;Lclient!nh;I)V")
	public static void method1535(@OriginalArg(0) Object arg0, @OriginalArg(1) Class143 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 50 && arg1.anEventQueue1.peekEvent() != null; local15++) {
			Static190.method3690(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)I")
	public static int method1537(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static332.method5394(arg0);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public static void method1538() {
		@Pc(5) Class87 local5 = Static332.aClass87_60;
		synchronized (Static332.aClass87_60) {
			Static332.aClass87_60.method2485();
		}
		local5 = Static124.aClass87_24;
		synchronized (Static124.aClass87_24) {
			Static124.aClass87_24.method2485();
		}
		local5 = Static77.aClass87_16;
		synchronized (Static77.aClass87_16) {
			Static77.aClass87_16.method2485();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public static void method1539(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class12 local8 = Static209.method3975(arg1, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray18 != null) {
			@Pc(18) Class1_Sub16 local18 = new Class1_Sub16();
			local18.aClass12_5 = local8;
			local18.aString26 = arg0;
			local18.anObjectArray34 = local8.anObjectArray18;
			local18.anInt2539 = arg2;
			Static196.method3777(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt435 > 0) {
			local35 = Static145.method2885(local8);
		}
		if (!local35 || !Static44.method1023(local8).method5588(arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Static342.aClass1_Sub8_Sub1_7.method3229(217);
			Static232.method4270(arg3, arg1, local8.anInt406);
		}
		if (arg2 == 2) {
			Static342.aClass1_Sub8_Sub1_7.method3229(172);
			Static232.method4270(arg3, arg1, local8.anInt406);
		}
		if (arg2 == 3) {
			Static342.aClass1_Sub8_Sub1_7.method3229(245);
			Static232.method4270(arg3, arg1, local8.anInt406);
		}
		if (arg2 == 4) {
			Static342.aClass1_Sub8_Sub1_7.method3229(197);
			Static232.method4270(arg3, arg1, local8.anInt406);
		}
		if (arg2 == 5) {
			Static342.aClass1_Sub8_Sub1_7.method3229(152);
			Static232.method4270(arg3, arg1, local8.anInt406);
		}
		if (arg2 == 6) {
			Static342.aClass1_Sub8_Sub1_7.method3229(178);
			Static232.method4270(arg3, arg1, local8.anInt406);
		}
		if (arg2 == 7) {
			Static342.aClass1_Sub8_Sub1_7.method3229(131);
			Static232.method4270(arg3, arg1, local8.anInt406);
		}
		if (arg2 == 8) {
			Static342.aClass1_Sub8_Sub1_7.method3229(0);
			Static232.method4270(arg3, arg1, local8.anInt406);
		}
		if (arg2 == 9) {
			Static342.aClass1_Sub8_Sub1_7.method3229(124);
			Static232.method4270(arg3, arg1, local8.anInt406);
		}
		if (arg2 == 10) {
			Static342.aClass1_Sub8_Sub1_7.method3229(2);
			Static232.method4270(arg3, arg1, local8.anInt406);
		}
	}
}

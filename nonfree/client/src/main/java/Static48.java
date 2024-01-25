import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cn", name = "C", descriptor = "Lclient!lg;")
	public static Class60 aClass60_3;

	@OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
	public static int anInt1082 = 0;

	@OriginalMember(owner = "client!cn", name = "y", descriptor = "[I")
	public static final int[] anIntArray121 = new int[1000];

	@OriginalMember(owner = "client!cn", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString32 = " is already on your ignore list.";

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!lh;ILjava/lang/Object;)V")
	public static void method914(@OriginalArg(0) Class120 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static270.method5481(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIII)V")
	public static void method915(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static155.method2994(arg3, 4);
		local8.method2031();
		local8.anInt2405 = arg1;
		local8.anInt2410 = arg2;
		local8.anInt2403 = arg0;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!tq;Z)Lclient!oq;")
	public static Class122_Sub2 method916(@OriginalArg(0) Class4_Sub7 arg0) {
		return new Class122_Sub2(arg0.method2396(), arg0.method2396(), arg0.method2396(), arg0.method2396(), arg0.method2402(), arg0.method2402(), arg0.method2380());
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)Lclient!mr;")
	public static Class4_Sub4 method918(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class4_Sub4_Sub10();
		} else if (arg0 == 1) {
			return new Class4_Sub4_Sub1();
		} else if (arg0 == 2) {
			return new Class4_Sub4_Sub4();
		} else if (arg0 == 3) {
			return new Class4_Sub4_Sub12();
		} else if (arg0 == 4) {
			return new Class4_Sub4_Sub11();
		} else if (arg0 == 5) {
			return new Class4_Sub4_Sub19();
		} else if (arg0 == 6) {
			return new Class4_Sub4_Sub2();
		} else if (arg0 == 7) {
			return new Class4_Sub4_Sub14();
		} else if (arg0 == 8) {
			return new Class4_Sub4_Sub37();
		} else if (arg0 == 9) {
			return new Class4_Sub4_Sub17();
		} else if (arg0 == 10) {
			return new Class4_Sub4_Sub13();
		} else if (arg0 == 11) {
			return new Class4_Sub4_Sub18();
		} else if (arg0 == 12) {
			return new Class4_Sub4_Sub8();
		} else if (arg0 == 13) {
			return new Class4_Sub4_Sub39();
		} else if (arg0 == 14) {
			return new Class4_Sub4_Sub6();
		} else if (arg0 == 15) {
			return new Class4_Sub4_Sub30();
		} else if (arg0 == 16) {
			return new Class4_Sub4_Sub15();
		} else if (arg0 == 17) {
			return new Class4_Sub4_Sub32();
		} else if (arg0 == 18) {
			return new Class4_Sub4_Sub27_Sub1();
		} else if (arg0 == 19) {
			return new Class4_Sub4_Sub31();
		} else if (arg0 == 20) {
			return new Class4_Sub4_Sub36();
		} else if (arg0 == 21) {
			return new Class4_Sub4_Sub28();
		} else if (arg0 == 22) {
			return new Class4_Sub4_Sub5();
		} else if (arg0 == 23) {
			return new Class4_Sub4_Sub21();
		} else if (arg0 == 24) {
			return new Class4_Sub4_Sub9();
		} else if (arg0 == 25) {
			return new Class4_Sub4_Sub33();
		} else if (arg0 == 26) {
			return new Class4_Sub4_Sub34();
		} else if (arg0 == 27) {
			return new Class4_Sub4_Sub20();
		} else if (arg0 == 28) {
			return new Class4_Sub4_Sub16();
		} else if (arg0 == 29) {
			return new Class4_Sub4_Sub29();
		} else if (arg0 == 30) {
			return new Class4_Sub4_Sub26();
		} else if (arg0 == 31) {
			return new Class4_Sub4_Sub35();
		} else if (arg0 == 32) {
			return new Class4_Sub4_Sub25();
		} else if (arg0 == 33) {
			return new Class4_Sub4_Sub38();
		} else if (arg0 == 34) {
			return new Class4_Sub4_Sub23();
		} else if (arg0 == 35) {
			return new Class4_Sub4_Sub24();
		} else if (arg0 == 36) {
			return new Class4_Sub4_Sub22();
		} else if (arg0 == 37) {
			return new Class4_Sub4_Sub3();
		} else if (arg0 == 38) {
			return new Class4_Sub4_Sub7();
		} else if (arg0 == 39) {
			return new Class4_Sub4_Sub27();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!fm;")
	public static RuntimeException_Sub1 method919(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString70 = local9.aString70 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}

import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!h", name = "G", descriptor = "Lclient!cd;")
	public static Class10 aClass10_659 = null;

	@OriginalMember(owner = "client!h", name = "K", descriptor = "I")
	public static int anInt1492 = 0;

	@OriginalMember(owner = "client!h", name = "S", descriptor = "Lclient!cd;")
	public static Class10 aClass10_660 = Static51.method932("(U4");

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "Lclient!cd;")
	public static Class10 aClass10_661 = Static51.method932("welle2:");

	@OriginalMember(owner = "client!h", name = "ab", descriptor = "I")
	public static int anInt1504 = 0;

	@OriginalMember(owner = "client!h", name = "ob", descriptor = "Lclient!fa;")
	public static Class23 aClass23_5 = null;

	@OriginalMember(owner = "client!h", name = "rb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_663 = Static51.method932("mapback");

	@OriginalMember(owner = "client!h", name = "zb", descriptor = "J")
	public static volatile long aLong52 = 0L;

	@OriginalMember(owner = "client!h", name = "Db", descriptor = "[I")
	public static int[] anIntArray173 = new int[5];

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
	public static void method1089() {
		for (@Pc(6) Class2_Sub20 local6 = (Class2_Sub20) Static136.aClass12_11.method384(); local6 != null; local6 = (Class2_Sub20) Static136.aClass12_11.method381()) {
			if (local6.aClass2_Sub5_Sub2_2 != null) {
				Static2.aClass2_Sub5_Sub3_1.method2615(local6.aClass2_Sub5_Sub2_2);
				local6.aClass2_Sub5_Sub2_2 = null;
			}
			if (local6.aClass2_Sub5_Sub2_3 != null) {
				Static2.aClass2_Sub5_Sub3_1.method2615(local6.aClass2_Sub5_Sub2_3);
				local6.aClass2_Sub5_Sub2_3 = null;
			}
		}
		Static136.aClass12_11.method386();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/lang/Object;ILclient!pc;)V")
	public static void method1093(@OriginalArg(0) Object arg0, @OriginalArg(2) Class63 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static50.method927(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(III)V")
	public static void method1094(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) long local15 = (long) (arg0 + (arg1 << 16));
		@Pc(21) Class2_Sub1_Sub11 local21 = (Class2_Sub1_Sub11) Static155.aClass18_10.method683(local15);
		if (local21 != null) {
			Static22.aClass28_1.method950(local21);
		}
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(B)V")
	public static void method1098() {
		Static113.aBoolean113 = false;
		Static170.aBoolean163 = false;
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
	public static void method1102() {
		anIntArray173 = null;
		aClass23_5 = null;
		aClass10_660 = null;
		aClass10_659 = null;
		aClass10_661 = null;
		aClass10_663 = null;
	}
}

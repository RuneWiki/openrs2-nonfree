import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static627 {

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_114 = new Class286(54, 6);

	@OriginalMember(owner = "client!tq", name = "w", descriptor = "Lclient!tj;")
	public static final Class357 aClass357_58 = new Class357();

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)Z")
	public static boolean method8490(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class3_Sub4_Sub5 local16 = (Class3_Sub4_Sub5) Static562.aClass357_54.method8391(); local16 != null; local16 = (Class3_Sub4_Sub5) Static562.aClass357_54.method8392()) {
			if (Static290.method4406(local16.anInt2775) && (long) arg0 == local16.aLong105) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)Z")
	public static boolean method8496(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/Object;BLclient!cea;)V")
	public static void method8497(@OriginalArg(0) Object arg0, @OriginalArg(2) Class47 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 50 && arg1.anEventQueue1.peekEvent() != null; local12++) {
			Static564.method7845(1L);
		}
		try {
			if (arg0 != null) {
				arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IILclient!ha;I)V")
	public static void method8500(@OriginalArg(1) int arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) int arg2) {
		Static678.aClass28ArrayArray5 = new Class28[arg0][arg2];
		Static510.aClass67_17 = arg1;
		if (Static159.anIntArray143 != null) {
			Static67.aClass77_3 = Static433.method6364(Static159.anIntArray143[0], Static159.anIntArray143[1], Static159.anIntArray143[4], Static159.anIntArray143[2], Static159.anIntArray143[3], Static159.anIntArray143[5]);
		}
		Static132.aClass275_2 = null;
		Static3.aClass28_1 = new Class28();
		Static482.method7041();
	}
}

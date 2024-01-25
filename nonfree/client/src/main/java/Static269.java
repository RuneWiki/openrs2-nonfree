import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!nn", name = "l", descriptor = "[Lclient!ta;")
	public static Class149[] aClass149Array2;

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "Lclient!gq;")
	public static Class93 aClass93_1;

	@OriginalMember(owner = "client!nn", name = "n", descriptor = "F")
	public static float aFloat68;

	@OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
	public static int anInt4765;

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "Lclient!hn;")
	public static Class107 aClass107_139 = null;

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
	public static int anInt4762 = 0;

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "F")
	public static float aFloat67 = 0.25F;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!ad;I)V")
	public static void method3956(@OriginalArg(0) Class1_Sub3 arg0) {
		if (!Static385.aBoolean436) {
			arg0.method6020();
			Static217.anInt4004--;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!cl;Z)I")
	public static int method3957(@OriginalArg(0) Class31_Sub2_Sub1_Sub1 arg0) {
		@Pc(6) int local6 = arg0.anInt1308;
		@Pc(14) Class21 local14 = arg0.method5982();
		if (arg0.aBoolean505) {
			local6 = arg0.anInt1312;
		} else if (local14.anInt620 == arg0.anInt7338 || local14.anInt628 == arg0.anInt7338 || arg0.anInt7338 == local14.anInt629 || local14.anInt609 == arg0.anInt7338) {
			local6 = arg0.anInt1313;
		} else if (arg0.anInt7338 == local14.anInt611 || arg0.anInt7338 == local14.anInt603 || arg0.anInt7338 == local14.anInt607 || arg0.anInt7338 == local14.anInt599) {
			local6 = arg0.anInt1320;
		}
		return local6;
	}
}

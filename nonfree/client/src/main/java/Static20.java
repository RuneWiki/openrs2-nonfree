import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!av", name = "a", descriptor = "[Lclient!o;")
	public static Class85[] aClass85Array1;

	@OriginalMember(owner = "client!av", name = "h", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_13 = new Class67(30, -2);

	@OriginalMember(owner = "client!av", name = "p", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_14 = new Class67(106, 3);

	@OriginalMember(owner = "client!av", name = "r", descriptor = "I")
	public static int anInt301 = 0;

	@OriginalMember(owner = "client!av", name = "t", descriptor = "I")
	public static int anInt302 = 1;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
	public static void method308() {
		if (Static224.aBoolean370) {
			return;
		}
		Static413.aBoolean582 = true;
		Static224.aBoolean370 = true;
		if (Static126.aClass19_Sub1_1.aBoolean382) {
			Static336.aFloat72 = (int) Static336.aFloat72 - 17 & 0xFFFFFFF0;
		} else {
			Static286.aFloat68 += (-Static286.aFloat68 - 12.0F) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(III)V")
	public static void method309(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub3_Sub1 local13 = Static427.method5426(arg0, 12);
		local13.method384();
		local13.anInt381 = arg1;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method310(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ILclient!ir;)I")
	public static int method313(@OriginalArg(1) Class11_Sub1_Sub3_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt3373;
		@Pc(17) Class164 local17 = arg0.method2640();
		if (arg0.aBoolean322) {
			local8 = arg0.anInt3364;
		} else if (arg0.anInt3317 == local17.anInt4636 || local17.anInt4598 == arg0.anInt3317 || local17.anInt4599 == arg0.anInt3317 || arg0.anInt3317 == local17.anInt4609) {
			local8 = arg0.anInt3368;
		} else if (arg0.anInt3317 == local17.anInt4611 || local17.anInt4595 == arg0.anInt3317 || local17.anInt4620 == arg0.anInt3317 || arg0.anInt3317 == local17.anInt4610) {
			local8 = arg0.anInt3367;
		}
		return local8;
	}
}

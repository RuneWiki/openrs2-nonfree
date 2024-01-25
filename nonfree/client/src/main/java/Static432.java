import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!rv", name = "I", descriptor = "Z")
	public static boolean aBoolean563 = false;

	@OriginalMember(owner = "client!rv", name = "J", descriptor = "Lclient!hb;")
	public static final Class117 aClass117_18 = new Class117(15, -1);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IBILclient!qf;)V")
	public static void method6571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class245 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray26 != null) {
			@Pc(13) Class3_Sub21 local13 = new Class3_Sub21();
			local13.aClass245_8 = arg2;
			local13.anObjectArray4 = arg2.anObjectArray26;
			Static60.method1227(local13);
		}
		Static7.anInt488 = arg2.anInt7224;
		Static113.anInt2478 = arg2.anInt7271;
		Static46.anInt1080 = arg2.anInt7248;
		Static262.anInt5489 = arg1;
		Static170.anInt3907 = arg0;
		Static508.anInt8865 = arg2.anInt7264;
		Static448.anInt8198 = arg2.anInt7256;
		Static506.aBoolean659 = true;
		Static31.method809(arg2);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZI)V")
	public static void method6573(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class3_Sub10_Sub16 local13 = Static362.method5701(arg1, 12);
		local13.method6211();
		local13.anInt7557 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIZ)V")
	public static void method6574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static176.anInt4102 == 1) {
			Static309.method174(arg1, arg0, Static399.aClass3_Sub11_5);
		} else if (Static176.anInt4102 == 2) {
			Static517.method7380(arg1, arg0);
		}
		Static176.anInt4102 = 0;
		Static399.aClass3_Sub11_5 = null;
	}
}

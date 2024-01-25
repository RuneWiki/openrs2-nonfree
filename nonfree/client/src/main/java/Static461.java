import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
	public static int anInt7817;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "Z")
	public static boolean aBoolean546 = false;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
	public static int anInt7821 = 0;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIILclient!dk;Lclient!dk;)V")
	public static void method6470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10_Sub2 arg3, @OriginalArg(4) Class10_Sub2 arg4) {
		@Pc(4) Class100 local4 = Static279.method4433(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass10_Sub2_3 = arg3;
			local4.aClass10_Sub2_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZIZIIII)V")
	public static void method6471(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 <= arg5) {
			return;
		}
		@Pc(10) int local10 = (arg5 + arg1) / 2;
		@Pc(12) int local12 = arg5;
		@Pc(16) Class7_Sub1 local16 = Static278.aClass7_Sub1Array4[local10];
		Static278.aClass7_Sub1Array4[local10] = Static278.aClass7_Sub1Array4[arg1];
		Static278.aClass7_Sub1Array4[arg1] = local16;
		for (@Pc(28) int local28 = arg5; local28 < arg1; local28++) {
			if (Static188.method3455(Static278.aClass7_Sub1Array4[local28], arg4, arg0, arg3, local16, arg2) <= 0) {
				@Pc(47) Class7_Sub1 local47 = Static278.aClass7_Sub1Array4[local28];
				Static278.aClass7_Sub1Array4[local28] = Static278.aClass7_Sub1Array4[local12];
				Static278.aClass7_Sub1Array4[local12++] = local47;
			}
		}
		Static278.aClass7_Sub1Array4[arg1] = Static278.aClass7_Sub1Array4[local12];
		Static278.aClass7_Sub1Array4[local12] = local16;
		method6471(arg0, local12 - 1, arg2, arg3, arg4, arg5);
		method6471(arg0, arg1, arg2, arg3, arg4, local12 + 1);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
	public static void method6472() {
		Static64.anInt1206 = -1;
		Static140.anInt3152 = 1;
		if (Static248.aString61 == null) {
			Static112.method2333(35);
		} else {
			@Pc(24) Class4_Sub9 local24 = new Class4_Sub9(Static385.method5687(Static52.method797(Static248.aString61)));
			@Pc(28) long local28 = local24.method5997();
			Static290.aLong151 = local24.method5997();
			Static108.method2316(Static446.method6284(local28), true, "");
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZB)V")
	public static void method6473() {
		@Pc(25) Class4_Sub41 local25 = Static128.method2707(Static303.aClass61_68, Class16_Sub3.lb);
		Static551.method7603(local25);
		for (@Pc(33) Class4_Sub49 local33 = (Class4_Sub49) Static543.aClass183_39.method4286(); local33 != null; local33 = (Class4_Sub49) Static543.aClass183_39.method4283()) {
			if (!local33.method8014()) {
				local33 = (Class4_Sub49) Static543.aClass183_39.method4286();
				if (local33 == null) {
					break;
				}
			}
			if (local33.anInt9334 == 0) {
				Static597.method8029(local33, true, true);
			}
		}
		if (Static74.aClass115_2 != null) {
			Static330.method4950(Static74.aClass115_2);
			Static74.aClass115_2 = null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZLclient!e;Ljava/awt/Canvas;)Lclient!oa;")
	public static Class66 method6474(@OriginalArg(1) Interface3 arg0, @OriginalArg(2) Canvas arg1) {
		return new da(arg1, arg0);
	}
}

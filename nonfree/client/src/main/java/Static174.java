import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!ih;B)V")
	public static void method2446(@OriginalArg(0) Class4_Sub18 arg0) {
		if (Static432.aClass75ArrayArrayArray6 == null) {
			return;
		}
		@Pc(12) Interface4 local12 = null;
		if (arg0.anInt3028 == 0) {
			local12 = (Interface4) Static14.method170(arg0.anInt3036, arg0.anInt3037, arg0.anInt3031);
		}
		if (arg0.anInt3028 == 1) {
			local12 = (Interface4) Static169.method2325(arg0.anInt3036, arg0.anInt3037, arg0.anInt3031);
		}
		if (arg0.anInt3028 == 2) {
			local12 = (Interface4) Static64.method926(arg0.anInt3036, arg0.anInt3037, arg0.anInt3031, fw.class);
		}
		if (arg0.anInt3028 == 3) {
			local12 = (Interface4) Static190.method2771(arg0.anInt3036, arg0.anInt3037, arg0.anInt3031);
		}
		if (local12 == null) {
			arg0.anInt3029 = 0;
			arg0.anInt3033 = -1;
			arg0.anInt3040 = 0;
		} else {
			arg0.anInt3033 = local12.method5603();
			arg0.anInt3040 = local12.method5606();
			arg0.anInt3029 = local12.method5600();
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IBI)Z")
	public static boolean method2447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "(I)V")
	public static void method2448() {
		Static180.aClass107_1.method1998();
		Static455.aClass48_1.method1148();
		if (Static87.aClass47_1 != null) {
			Static87.aClass47_1.method2873(Static391.aCanvas5);
		}
		Static425.aClient1.method732();
		Static391.aCanvas5.setBackground(Color.black);
		Static410.anInt6935 = -1;
		Static180.aClass107_1 = Static258.method3440(Static391.aCanvas5);
		Static455.aClass48_1 = Static250.method3301(Static391.aCanvas5);
		if (Static87.aClass47_1 != null) {
			Static87.aClass47_1.method2872(Static391.aCanvas5);
		}
	}
}

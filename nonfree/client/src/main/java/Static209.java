import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!ii", name = "O", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas6;

	@OriginalMember(owner = "client!ii", name = "R", descriptor = "I")
	public static int anInt3904;

	@OriginalMember(owner = "client!ii", name = "J", descriptor = "I")
	public static int anInt3899 = -1;

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)V")
	public static void method3376() {
		Static481.aClass288_65.method6742();
		Static291.aClass288_41.method6742();
		Static420.aClass288_72.method6742();
		Static144.aClass288_21.method6742();
		Static92.aClass288_7.method6742();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIII[B)Z")
	public static boolean method3377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(33) int local33 = -((arg3 + 8 - 1) / 8);
		@Pc(42) int local42 = -((arg2 + 8 - 1) / 8);
		for (@Pc(44) int local44 = local33; local44 < 0; local44++) {
			for (@Pc(48) int local48 = local42; local48 < 0; local48++) {
				if (arg4[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local16;
			if (arg4[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg0;
		}
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lclient!ml;")
	public static Class199 method3379(@OriginalArg(1) int arg0) {
		@Pc(8) Class199[] local8 = Static47.method1048();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class199 local16 = local8[local10];
			if (local16.anInt6074 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method3380(@OriginalArg(1) Class62 arg0) {
		if (Static357.aClass99_55.method2518() == 0) {
			return;
		}
		@Pc(58) Class5_Sub48 local58;
		if (Static17.anInt459 == 0) {
			for (local58 = (Class5_Sub48) Static357.aClass99_55.method2526(); local58 != null; local58 = (Class5_Sub48) Static357.aClass99_55.method2519()) {
				Static451.aClass67_2.method2007(local58.anInt8629, local58.aBoolean625 ? Static35.aClass15_Sub2_Sub1_Sub1_1.aClass248_1 : null, local58.anInt8622, local58.anInt8624, arg0, local58.anInt8628, false, Static121.aClass13_1, local58.anInt8621, false, arg0);
				local58.method7425();
			}
			Static544.method2108();
			return;
		}
		if (Static259.aClass62_27 == null) {
			@Pc(26) Canvas local26 = new Canvas();
			local26.setSize(36, 32);
			Static259.aClass62_27 = Static390.method7056(0, Static36.anInterface8_21, 0, local26, Static337.aClass117_149);
			Static534.aClass13_4 = Static259.aClass62_27.method7054(Static242.method4123(Static220.anInt4154, Static145.aClass117_76), Static551.method2429(Static533.aClass117_228, Static220.anInt4154));
		}
		for (local58 = (Class5_Sub48) Static357.aClass99_55.method2526(); local58 != null; local58 = (Class5_Sub48) Static357.aClass99_55.method2519()) {
			Static451.aClass67_2.method2007(local58.anInt8629, local58.aBoolean625 ? Static35.aClass15_Sub2_Sub1_Sub1_1.aClass248_1 : null, local58.anInt8622, local58.anInt8624, arg0, local58.anInt8628, false, Static534.aClass13_4, local58.anInt8621, false, Static259.aClass62_27);
			local58.method7425();
		}
	}
}

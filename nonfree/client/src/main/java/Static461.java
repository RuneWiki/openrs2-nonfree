import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!qia", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString90;

	@OriginalMember(owner = "client!qia", name = "B", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_167 = new Class215(109, 7);

	@OriginalMember(owner = "client!qia", name = "E", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_168 = new Class215(72, 0);

	@OriginalMember(owner = "client!qia", name = "F", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_82 = new Class94(36, 7);

	@OriginalMember(owner = "client!qia", name = "H", descriptor = "S")
	public static short aShort98 = 1;

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(IIB)Z")
	public static boolean method6811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!qia", name = "c", descriptor = "(II)Z")
	public static boolean method6813(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(IB)Z")
	public static boolean method6814(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(ZB)V")
	public static void method6815(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static475.anInt10143 != -1) {
				Static204.method8295(Static475.anInt10143);
			}
			for (@Pc(24) Class2_Sub48 local24 = (Class2_Sub48) Static372.aClass99_51.method3060(); local24 != null; local24 = (Class2_Sub48) Static372.aClass99_51.method3058()) {
				if (!local24.method9250()) {
					local24 = (Class2_Sub48) Static372.aClass99_51.method3060();
					if (local24 == null) {
						break;
					}
				}
				Static133.method3047(true, false, local24);
			}
			Static475.anInt10143 = -1;
			Static372.aClass99_51 = new Class99(8);
			Static342.method5878();
			Static475.anInt10143 = Static603.anInt7122;
			Static527.method9032(false);
			Static132.method3031();
			Static284.method5151(Static475.anInt10143);
		}
		Static5.aBoolean7 = false;
		Static456.aString69 = "";
		Static415.aString88 = "";
		Static471.method7419();
		Static151.anInt3895 = -1;
		Static231.method4405(Static338.anInt6830);
		Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 = new Class3_Sub1_Sub3_Sub3_Sub2();
		Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303 = Static47.anInt1794 * 512 / 2;
		Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray358[0] = Static47.anInt1794 / 2;
		Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310 = Static209.anInt4742 * 512 / 2;
		Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray357[0] = Static209.anInt4742 / 2;
		Static621.anInt10870 = 0;
		Static135.anInt3347 = 0;
		if (Static496.anInt9165 == 2) {
			Static135.anInt3347 = Static489.anInt9048 << 9;
			Static621.anInt10870 = Static590.anInt10439 << 9;
		} else {
			Static322.method5589();
		}
		Static305.method5400();
	}
}

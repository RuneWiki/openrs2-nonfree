import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "[Lclient!ib;")
	public static Class160_Sub1[] aClass160_Sub1Array1;

	@OriginalMember(owner = "client!fo", name = "o", descriptor = "[Lclient!qda;")
	public static Class59[] aClass59Array5;

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_106 = new Class196(30, 6);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)Z")
	public static boolean method2455(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!ts;I)I")
	public static int method2457(@OriginalArg(0) Class41_Sub1_Sub1_Sub3_Sub2 arg0) {
		@Pc(6) int local6 = arg0.anInt9532;
		@Pc(10) Class201 local10 = arg0.method7933();
		if (arg0.anInt9484 == -1 || arg0.aBoolean690) {
			local6 = arg0.anInt9547;
		} else if (arg0.anInt9484 == local10.anInt4759 || local10.anInt4786 == arg0.anInt9484 || arg0.anInt9484 == local10.anInt4776 || local10.anInt4761 == arg0.anInt9484) {
			local6 = arg0.anInt9548;
		} else if (local10.anInt4781 == arg0.anInt9484 || arg0.anInt9484 == local10.anInt4779 || local10.anInt4765 == arg0.anInt9484 || arg0.anInt9484 == local10.anInt4753) {
			local6 = arg0.anInt9557;
		}
		return local6;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZBLclient!st;)V")
	public static void method2458(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class5_Sub47 arg1) {
		if (arg1.aBoolean651) {
			if (arg1.anInt9034 < 0 || Static357.method5273(arg1.anInt9041, arg1.anInt9034)) {
				if (arg0) {
					Static402.method5884(arg1.anInt9036, arg1.anInt9031, arg1.anInt9033, arg1.anInt9032, (Class272) null);
				} else {
					Static362.method5333(arg1.anInt9041, arg1.anInt9040, -1, arg1.anInt9036, arg1.anInt9031, arg1.anInt9032, arg1.anInt9033, arg1.anInt9034);
				}
				arg1.method8829();
			}
		} else if (arg1.aBoolean650 && arg1.anInt9036 >= 1 && arg1.anInt9031 >= 1 && Static124.anInt2150 - 2 >= arg1.anInt9036 && Static64.anInt1015 - 2 >= arg1.anInt9031) {
			if (arg1.anInt9035 >= 0 && !Static357.method5273(arg1.anInt9037, arg1.anInt9035)) {
				return;
			}
			if (arg0) {
				Static402.method5884(arg1.anInt9036, arg1.anInt9031, arg1.anInt9033, arg1.anInt9032, arg1.aClass272_2);
			} else {
				Static362.method5333(arg1.anInt9037, arg1.anInt9038, -1, arg1.anInt9036, arg1.anInt9031, arg1.anInt9032, arg1.anInt9033, arg1.anInt9035);
			}
			arg1.aBoolean650 = false;
			if (!arg0 && arg1.anInt9034 == arg1.anInt9035 && arg1.anInt9034 == -1) {
				arg1.method8829();
				return;
			}
			if (!arg0 && arg1.anInt9034 == arg1.anInt9035 && arg1.anInt9038 == arg1.anInt9040 && arg1.anInt9037 == arg1.anInt9041) {
				arg1.method8829();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)I")
	public static int method2459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static288.aShortArrayArray13 == null ? 0 : Static288.aShortArrayArray13[arg0][arg1] & 0xFFFF;
	}
}

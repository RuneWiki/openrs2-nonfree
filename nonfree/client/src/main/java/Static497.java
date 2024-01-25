import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
	public static int anInt7749;

	@OriginalMember(owner = "client!qn", name = "t", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_167 = new Class151(15, 6);

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLclient!tba;III)V")
	public static void method6720(@OriginalArg(1) Class342 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class4_Sub23 local10 = (Class4_Sub23) Static328.aClass163_30.method3639(); local10 != null; local10 = (Class4_Sub23) Static328.aClass163_30.method3640()) {
			if (local10.anInt4134 == arg1 && arg2 << 9 == local10.anInt4135 && local10.anInt4140 == arg3 << 9 && arg0.anInt8738 == local10.aClass342_1.anInt8738) {
				if (local10.aClass4_Sub3_Sub3_2 != null) {
					Static162.aClass4_Sub3_Sub5_3.method7723(local10.aClass4_Sub3_Sub3_2);
					local10.aClass4_Sub3_Sub3_2 = null;
				}
				if (local10.aClass4_Sub3_Sub3_3 != null) {
					Static162.aClass4_Sub3_Sub5_3.method7723(local10.aClass4_Sub3_Sub3_3);
					local10.aClass4_Sub3_Sub3_3 = null;
				}
				local10.method9000();
				return;
			}
		}
	}
}

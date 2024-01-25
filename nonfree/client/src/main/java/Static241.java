import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!hj", name = "O", descriptor = "Lclient!bi;")
	public static Class4_Sub2_Sub1_Sub2_Sub1 aClass4_Sub2_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!hj", name = "G", descriptor = "Lclient!os;")
	public static final Class281 aClass281_11 = new Class281(10, 5);

	@OriginalMember(owner = "client!hj", name = "M", descriptor = "I")
	public static int anInt3808 = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!dga;III)V")
	public static void method3427(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class2_Sub38 local10 = (Class2_Sub38) Static594.aClass60_191.method1226(7); local10 != null; local10 = (Class2_Sub38) Static594.aClass60_191.method1228()) {
			if (arg3 == local10.anInt6455 && local10.anInt6462 == arg2 << 9 && local10.anInt6467 == arg0 << 9 && arg1.anInt1860 == local10.aClass81_1.anInt1860) {
				if (local10.aClass2_Sub23_Sub2_3 != null) {
					Static130.aClass2_Sub23_Sub3_1.method6797(local10.aClass2_Sub23_Sub2_3);
					local10.aClass2_Sub23_Sub2_3 = null;
				}
				if (local10.aClass2_Sub23_Sub2_4 != null) {
					Static130.aClass2_Sub23_Sub3_1.method6797(local10.aClass2_Sub23_Sub2_4);
					local10.aClass2_Sub23_Sub2_4 = null;
				}
				local10.method9872();
				return;
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!uha", name = "Q", descriptor = "Lclient!mp;")
	public static Class236 aClass236_2;

	@OriginalMember(owner = "client!uha", name = "F", descriptor = "Lclient!wu;")
	public static final Class394 aClass394_163 = new Class394("", 14);

	@OriginalMember(owner = "client!uha", name = "T", descriptor = "Z")
	public static boolean aBoolean837 = false;

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIIBILclient!mea;)V")
	public static void method8228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class225 arg4) {
		@Pc(7) Class5_Sub6 local7 = null;
		for (@Pc(12) Class5_Sub6 local12 = (Class5_Sub6) Static256.aClass114_27.method2805(); local12 != null; local12 = (Class5_Sub6) Static256.aClass114_27.method2814()) {
			if (arg3 == local12.anInt551 && arg0 == local12.anInt548 && arg1 == local12.anInt547 && local12.anInt554 == arg2) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class5_Sub6();
			local7.anInt547 = arg1;
			local7.anInt554 = arg2;
			local7.anInt551 = arg3;
			local7.anInt548 = arg0;
			Static256.aClass114_27.method2807(local7);
		}
		local7.aBoolean36 = false;
		local7.aClass225_1 = arg4;
		local7.aBoolean37 = true;
	}
}

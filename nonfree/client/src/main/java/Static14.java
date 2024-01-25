import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "[I")
	public static final int[] anIntArray3 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
	public static int anInt241 = -1;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)V")
	public static void method264() {
		for (@Pc(10) Class3_Sub29 local10 = (Class3_Sub29) Static163.aClass193_67.method4519(); local10 != null; local10 = (Class3_Sub29) Static163.aClass193_67.method4525()) {
			if (local10.aBoolean276) {
				local10.method3256();
			}
		}
		for (@Pc(34) Class3_Sub29 local34 = (Class3_Sub29) Static163.aClass193_68.method4519(); local34 != null; local34 = (Class3_Sub29) Static163.aClass193_68.method4525()) {
			if (local34.aBoolean276) {
				local34.method3256();
			}
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!wq;)V")
	public static void method265(@OriginalArg(1) Class3_Sub1 arg0) {
		arg0.aBoolean518 = false;
		if (arg0.aClass3_Sub28_5 != null) {
			arg0.aClass3_Sub28_5.anInt3567 = 0;
		}
		for (@Pc(18) Class3_Sub1 local18 = arg0.method6296(); local18 != null; local18 = arg0.method6292()) {
			method265(local18);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "([BI)[B")
	public static byte[] method266(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static466.method205(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}

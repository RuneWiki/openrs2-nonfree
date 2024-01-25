import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ff", name = "J", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_46 = new Class119(32, -1);

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ln;Z)I")
	public static int method1847(@OriginalArg(0) Class7_Sub2_Sub3_Sub2 arg0) {
		@Pc(11) int local11 = arg0.anInt4412;
		@Pc(15) Class1 local15 = arg0.method3514();
		if (arg0.aBoolean378) {
			local11 = arg0.anInt4427;
		} else if (arg0.anInt4389 == local15.anInt14 || arg0.anInt4389 == local15.anInt48 || arg0.anInt4389 == local15.anInt45 || arg0.anInt4389 == local15.anInt43) {
			local11 = arg0.anInt4421;
		} else if (local15.anInt11 == arg0.anInt4389 || arg0.anInt4389 == local15.anInt9 || local15.anInt32 == arg0.anInt4389 || arg0.anInt4389 == local15.anInt20) {
			local11 = arg0.anInt4438;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIZ)I")
	public static int method1849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < arg0) {
			return arg0;
		} else if (arg1 > arg2) {
			return arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method1850(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static462.method4611(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bl", name = "G", descriptor = "[I")
	public static final int[] anIntArray43 = new int[4];

	@OriginalMember(owner = "client!bl", name = "L", descriptor = "F")
	public static float aFloat12 = 1.0F;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
	public static byte[] method745(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static103.method1485(local18) : local18;
		} else if (arg1 instanceof Class184) {
			@Pc(32) Class184 local32 = (Class184) arg1;
			return local32.method3812();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!ba;B)V")
	public static void method746(@OriginalArg(0) Class1_Sub9 arg0) {
		Static263.aClass111_23.method2552(arg0);
		arg0.anInt633 = arg0.aClass1_Sub3_Sub1_1.anInt9802;
		arg0.aClass1_Sub3_Sub1_1.anInt9802 = 0;
		Static528.anInt8967 += arg0.anInt633;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(BII)I")
	public static int method748(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 - 1 & arg1 >> 31;
		return ((arg1 >>> 31) + arg1) % arg0 + local16;
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(B)[Lclient!oh;")
	public static Class252[] method750() {
		return new Class252[] { Static284.aClass252_17, Static361.aClass252_13, Static494.aClass252_16, Static191.aClass252_7, Static237.aClass252_8, Static40.aClass252_1, Static429.aClass252_15, Static241.aClass252_9, Static67.aClass252_5, Static271.aClass252_10 };
	}
}

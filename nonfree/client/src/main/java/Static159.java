import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "Lclient!ah;")
	public static Class5 aClass5_1;

	@OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
	public static int anInt3767;

	@OriginalMember(owner = "client!sh", name = "t", descriptor = "[Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3[] aClass1_Sub2_Sub1_Sub3Array11;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
	public static int anInt3758 = 0;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "Lclient!ld;")
	public static Class47 aClass47_27 = new Class47(30);

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
	public static int anInt3764 = 0;

	@OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
	public static int anInt3768 = -1;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V")
	public static void method2737() {
		Static62.anIntArray249 = new int[104];
		Static21.anInt782 = 99;
		Static170.aByteArrayArrayArray43 = new byte[4][104][104];
		Static90.anIntArray252 = new int[104];
		Static131.aByteArrayArrayArray36 = new byte[4][104][104];
		Static62.aByteArrayArrayArray30 = new byte[4][104][104];
		Static176.anIntArray444 = new int[104];
		Static87.anIntArray240 = new int[104];
		Static81.aByteArrayArrayArray27 = new byte[4][105][105];
		Static160.anIntArrayArrayArray7 = new int[4][105][105];
		Static19.aByteArrayArrayArray15 = new byte[4][104][104];
		Static67.anIntArray207 = new int[104];
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZI)Lclient!og;")
	public static Class1_Sub2_Sub13 method2738(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub13 local10 = (Class1_Sub2_Sub13) Static119.aClass47_24.method1999((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static132.aClass4_82.method2243(3, arg0);
		local10 = new Class1_Sub2_Sub13();
		if (local20 != null) {
			local10.method2330(new Class1_Sub8(local20));
		}
		Static119.aClass47_24.method1998(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
	public static void method2741() {
		aClass5_1 = null;
		aClass47_27 = null;
		aClass1_Sub2_Sub1_Sub3Array11 = null;
	}
}

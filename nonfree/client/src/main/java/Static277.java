import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "Lclient!it;")
	public static Class36 aClass36_1;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
	public static int anInt5098 = 1;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IZ[B)V")
	public static void method4285(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static367.aClass1_Sub20_4 == null) {
			Static367.aClass1_Sub20_4 = new Class1_Sub20(20000);
		}
		Static367.aClass1_Sub20_4.method4412(arg1, arg1.length);
		if (!arg0) {
			return;
		}
		Static402.method5685(Static367.aClass1_Sub20_4.aByteArray52);
		Static161.aClass208_Sub1Array1 = new Class208_Sub1[Static147.anInt2831];
		@Pc(35) int local35 = 0;
		for (@Pc(37) int local37 = Static504.anInt8438; local37 <= Static193.anInt3958; local37++) {
			@Pc(45) Class208_Sub1 local45 = Static520.method7105(local37);
			if (local45 != null) {
				Static161.aClass208_Sub1Array1[local35++] = local45;
			}
		}
		Static281.aBoolean391 = false;
		Static24.aLong27 = Static255.method4035();
		Static367.aClass1_Sub20_4 = null;
	}
}

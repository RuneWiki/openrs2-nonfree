import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!od", name = "b", descriptor = "Lclient!ka;")
	public static Class1_Sub14 aClass1_Sub14_4;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "Lclient!ba;")
	public static Class11 aClass11_10;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLclient!ge;)V")
	public static void method2073(@OriginalArg(1) Class8_Sub3 arg0) {
		arg0.anInt3567 = 0;
		if (arg0.anInt3604 == 0) {
			arg0.anInt3577 = 1024;
		}
		@Pc(22) int local22 = arg0.anInt3613 - Static155.anInt2981;
		@Pc(33) int local33 = arg0.anInt3584 * 128 + arg0.anInt3583 * 64;
		if (arg0.anInt3604 == 1) {
			arg0.anInt3577 = 1536;
		}
		if (arg0.anInt3604 == 2) {
			arg0.anInt3577 = 0;
		}
		if (arg0.anInt3604 == 3) {
			arg0.anInt3577 = 512;
		}
		@Pc(68) int local68 = arg0.anInt3583 * 64 + arg0.anInt3572 * 128;
		arg0.anInt3600 += (local33 - arg0.anInt3600) / local22;
		arg0.anInt3606 += (local68 - arg0.anInt3606) / local22;
	}
}

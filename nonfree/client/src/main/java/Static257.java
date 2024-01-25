import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "[I")
	public static int[] anIntArray300 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!oh;Lclient!oh;Z)V")
	public static void method3643(@OriginalArg(0) Class273 arg0, @OriginalArg(1) Class273 arg1) {
		@Pc(20) Class2_Sub33 local20 = Static592.method8154(Static103.aClass349_156, Static487.aClass221_2.aClass48_1);
		local20.aClass2_Sub20_Sub2_1.method8551(arg1.anInt7410);
		local20.aClass2_Sub20_Sub2_1.method8572(arg0.anInt7415);
		local20.aClass2_Sub20_Sub2_1.method8572(arg0.anInt7410);
		local20.aClass2_Sub20_Sub2_1.method8572(arg1.anInt7415);
		local20.aClass2_Sub20_Sub2_1.method8567(arg0.anInt7350);
		local20.aClass2_Sub20_Sub2_1.method8549(arg1.anInt7350);
		Static487.aClass221_2.method5173(local20);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)I")
	public static int method3644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = local7 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
			arg0--;
		}
		if (-27812 != -27812) {
			anIntArray300 = null;
		}
		return local7;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)I")
	public static int method3645(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)V")
	public static void method3647() {
		Static261.method9374(-84, 12);
		Static629.method8513();
		System.gc();
	}
}

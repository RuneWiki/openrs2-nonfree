import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!pp", name = "J", descriptor = "[I")
	public static int[] anIntArray474;

	@OriginalMember(owner = "client!pp", name = "O", descriptor = "[I")
	public static int[] anIntArray475;

	@OriginalMember(owner = "client!pp", name = "E", descriptor = "Lclient!jb;")
	public static Class126 aClass126_13 = null;

	@OriginalMember(owner = "client!pp", name = "M", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_187 = new Class186(47, 6);

	@OriginalMember(owner = "client!pp", name = "P", descriptor = "[I")
	public static final int[] anIntArray476 = new int[100];

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)V")
	public static void method4277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static40.aClass53ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass6_Sub1_1 != null) {
			local7.aClass6_Sub1_1 = null;
		}
		if (local7.aClass6_Sub1_2 != null) {
			local7.aClass6_Sub1_2 = null;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB)V")
	public static void method4278(@OriginalArg(0) int arg0) {
		if (Static118.anInt2476 == arg0) {
			return;
		}
		Static126.anInt2569 = Static190.anInt3697 = Static79.anIntArray114[arg0];
		Static21.method447();
		Static28.anIntArrayArray9 = new int[Static126.anInt2569][Static190.anInt3697];
		Static239.anIntArrayArray38 = new int[Static126.anInt2569][Static190.anInt3697];
		Static4.anIntArrayArrayArray1 = new int[4][Static126.anInt2569 >> 3][Static190.anInt3697 >> 3];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static395.aClass268Array1[local40] = Static373.method5103(Static126.anInt2569, Static190.anInt3697);
		}
		Static275.aByteArrayArrayArray8 = new byte[4][Static126.anInt2569][Static190.anInt3697];
		Static261.method3573(Static190.anInt3697, Static126.anInt2569);
		Static373.method5102(Static16.aClass30_11, Static190.anInt3697 >> 3, Static126.anInt2569 >> 3);
		Static118.anInt2476 = arg0;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4280(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static209.method2982(Static184.aClass36_73);
			Static116.aClass4_Sub30_Sub1_1.method4871(Static226.method592(arg0));
			Static116.aClass4_Sub30_Sub1_1.method4849(arg0);
		}
	}
}

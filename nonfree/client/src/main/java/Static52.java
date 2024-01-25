import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "[I")
	public static final int[] anIntArray93 = new int[500];

	@OriginalMember(owner = "client!cp", name = "o", descriptor = "Z")
	public static boolean aBoolean58 = false;

	@OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
	public static int anInt1098 = -1;

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)I")
	public static int method944() {
		@Pc(5) Class139 local5 = Static78.aClass139_13;
		synchronized (Static78.aClass139_13) {
			return Static78.aClass139_13.method3079();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V")
	public static void method947(@OriginalArg(1) int arg0) {
		if (Static22.anInt294 == arg0) {
			return;
		}
		Static12.anInt161 = Static44.anInt787 = Static390.anIntArray650[arg0];
		Static347.aClass155_9.method4940(50, (int) ((double) Static12.anInt161 * 34.46D));
		Static97.anIntArrayArray21 = new int[Static12.anInt161][Static44.anInt787];
		Static81.anIntArrayArrayArray9 = new int[4][Static12.anInt161 >> 3][Static44.anInt787 >> 3];
		Static387.anIntArrayArray59 = new int[Static12.anInt161][Static44.anInt787];
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			Static160.aClass67Array3[local42] = Static272.method4269(Static44.anInt787, Static12.anInt161);
		}
		Static330.aByteArrayArrayArray18 = new byte[4][Static12.anInt161][Static44.anInt787];
		Static160.method4987(Static44.anInt787, Static12.anInt161);
		Static139.method2216(Static347.aClass155_9, Static12.anInt161 >> 3, Static44.anInt787 >> 3);
		Static22.anInt294 = arg0;
	}
}

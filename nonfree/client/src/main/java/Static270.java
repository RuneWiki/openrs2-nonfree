import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
	public static int anInt5171 = 0;

	@OriginalMember(owner = "client!ra", name = "B", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!bm;Lclient!ra;)V")
	public static void method4553(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) Class170 arg1) {
		Static51.anInterface1_1 = arg0;
		Static175.aClass170_64 = arg1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
	public static void method4559() {
		for (@Pc(1) int local1 = 0; local1 < Static77.anInt1849; local1++) {
			@Pc(6) Class25_Sub1 local6 = Static108.aClass25_Sub1Array3[local1];
			Static24.method1833(local6);
			Static108.aClass25_Sub1Array3[local1] = null;
		}
		Static77.anInt1849 = 0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBI)V")
	public static void method4560(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static126.aClass66_44 = new Class66(arg0);
		Static261.aClass66_87 = new Class66(arg1);
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
	public static void method4576() {
		for (@Pc(3) int local3 = -1; local3 < Static161.anInt3258; local3++) {
			@Pc(11) int local11;
			if (local3 == -1) {
				local11 = 2047;
			} else {
				local11 = Static220.anIntArray311[local3];
			}
			@Pc(21) Class25_Sub1_Sub1_Sub1 local21 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local11];
			if (local21 != null) {
				Static344.method957(local21.method4646(), local21);
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "(I)V")
	public static void method4585() {
		Static3.aClass66_107.method1933();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static650 {

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "[I")
	public static int[] anIntArray724 = new int[2];

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "Lclient!dja;")
	public static final Class78 aClass78_13 = new Class78("", 13);

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
	public static void method8552() {
		Static116.aClass270Array1 = null;
		if (Static347.aBoolean360 && Static276.method3880(0x0 ^ 0x3) != 1) {
			Static187.method2944(Static695.method6731(), 0, Static98.anInt2140 == 3 || Static98.anInt2140 == 7, Static86.method1877(), 0);
		}
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		if (Static347.aBoolean360) {
			local43 = Static308.method4570();
			local45 = Static541.method7180();
		}
		Static437.method5769(local43, Static589.anInt8959, -1, local45, local45, Static76.anInt1720 + local45, local43 + Static681.anInt10652, local43);
		if (Static116.aClass270Array1 != null) {
			Static286.method4024(local43 + Static681.anInt10652, Static489.anInt10879, Static116.aClass270Array1, Static76.anInt1720 + local45, -1412584499, local43, true, Static129.anInt2541, local45, Static309.aClass270_9.anInt7029);
			Static116.aClass270Array1 = null;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)I")
	public static int method8554(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(25) int local25 = ((arg1 & 0xFF00) * local7 & 0xFF0000 | (arg1 & 0xFF00FF) * local7 & 0xFF00FF00) >>> 8;
		@Pc(30) int local30 = 255 - local7;
		return (((arg0 & 0xFF00) * local30 & 0xFF0000 | (arg0 & 0xFF00FF) * local30 & 0xFF00FF00) >>> 8) + local25;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZLclient!tfa;Lclient!tfa;)V")
	public static void method8555(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		if (arg0.aClass3_345 != null) {
			arg0.method9596();
		}
		arg0.aClass3_345 = arg1.aClass3_345;
		arg0.aClass3_346 = arg1;
		arg0.aClass3_345.aClass3_346 = arg0;
		arg0.aClass3_346.aClass3_345 = arg0;
	}
}

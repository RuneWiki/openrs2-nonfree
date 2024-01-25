import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "Lclient!jn;")
	public static Class133 aClass133_2;

	@OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
	public static int anInt6880;

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "Lclient!ak;")
	public static final Class10 aClass10_19 = new Class10(9, 0, 4, 1);

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
	public static final int anInt6879 = 1339;

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray47 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!gm", name = "j", descriptor = "[I")
	public static final int[] anIntArray473 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZIBII)Lclient!cq;")
	public static Class6_Sub9 method5721(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class6_Sub9 local7 = new Class6_Sub9();
		local7.anInt1505 = arg1;
		local7.anInt1506 = arg2;
		Static432.aClass74_33.method1890((long) arg3, local7);
		Static85.method1589(arg1);
		@Pc(26) Class239 local26 = Static121.method2092(arg3);
		if (local26 != null) {
			Static437.method6328(local26);
		}
		if (Static100.aClass239_4 != null) {
			Static437.method6328(Static100.aClass239_4);
			Static100.aClass239_4 = null;
		}
		Static178.method6350();
		if (local26 != null) {
			Static141.method1120(!arg0, local26);
		}
		if (!arg0) {
			Static166.method2750(arg1);
		}
		if (!arg0 && Static36.anInt1129 != -1) {
			Static101.method1824(1, Static36.anInt1129);
		}
		return local7;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!he;Lclient!ps;Z)V")
	public static void method5722(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Interface8 arg1) {
		Static125.anInterface8_3 = arg1;
		Static105.aClass100_15 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public static void method5723() {
		@Pc(7) int local7 = Static95.anInt2186;
		@Pc(9) int[] local9 = Static178.anIntArray542;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class3_Sub2_Sub1_Sub2 local24 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local9[local16]];
			if (local24 != null) {
				Static295.method4600(local24, local24.method5521());
			}
		}
	}
}

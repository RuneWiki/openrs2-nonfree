import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "Lclient!f;")
	public static Class22 aClass22_23;

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "Lclient!wba;")
	public static final Class353 aClass353_27 = new Class353();

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "[J")
	public static final long[] aLongArray14 = new long[32];

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "[I")
	public static final int[] anIntArray348 = new int[1000];

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)V")
	public static void method3627(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static134.anInt2584 = arg0 - Static226.anInt6318;
		Static493.anInt8491 = arg1 - Static226.anInt6317;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method3631(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = Static220.anInt4237;
		@Pc(9) int[] local9 = Static572.anIntArray717;
		@Pc(11) boolean local11 = false;
		for (@Pc(17) int local17 = 0; local17 < local7; local17++) {
			@Pc(25) Class8_Sub3_Sub3_Sub1_Sub1 local25 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local9[local17]];
			if (local25 != null && Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 != local25 && local25.aString16 != null && local25.aString16.equalsIgnoreCase(arg0)) {
				local11 = true;
				@Pc(57) Class1_Sub11 local57;
				if (arg1 == 1) {
					local57 = Static276.method3885(Static508.aClass70_92, Static481.aClass276_2);
					local57.aClass1_Sub35_Sub2_1.method5776(local9[local17]);
					local57.aClass1_Sub35_Sub2_1.method5756(0);
					Static48.method743(local57);
				} else if (arg1 == 4) {
					local57 = Static276.method3885(Static184.aClass70_28, Static481.aClass276_2);
					local57.aClass1_Sub35_Sub2_1.method5777(0);
					local57.aClass1_Sub35_Sub2_1.method5789(local9[local17]);
					Static48.method743(local57);
				} else if (arg1 == 5) {
					local57 = Static276.method3885(Static521.aClass70_93, Static481.aClass276_2);
					local57.aClass1_Sub35_Sub2_1.method5794(0);
					local57.aClass1_Sub35_Sub2_1.method5789(local9[local17]);
					Static48.method743(local57);
				} else if (arg1 == 6) {
					local57 = Static276.method3885(Static326.aClass70_57, Static481.aClass276_2);
					local57.aClass1_Sub35_Sub2_1.method5756(0);
					local57.aClass1_Sub35_Sub2_1.method5740(local9[local17]);
					Static48.method743(local57);
				} else if (arg1 == 7) {
					local57 = Static276.method3885(Static137.aClass70_24, Static481.aClass276_2);
					local57.aClass1_Sub35_Sub2_1.method5764(local9[local17]);
					local57.aClass1_Sub35_Sub2_1.method5795(0);
					Static48.method743(local57);
				}
				break;
			}
		}
		if (!local11) {
			Static571.method7692(Static568.aClass351_25.method7651(Static307.anInt5279) + arg0);
		}
	}
}

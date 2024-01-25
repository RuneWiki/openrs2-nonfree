import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!pca", name = "i", descriptor = "I")
	public static int anInt6978;

	@OriginalMember(owner = "client!pca", name = "g", descriptor = "Z")
	public static boolean aBoolean536 = true;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method5635(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static75.anInt1461;
		@Pc(9) int[] local9 = Static167.anIntArray145;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class11_Sub1_Sub1_Sub3_Sub1 local21 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local9[local13]];
			if (local21 != null && local21 != Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2 && local21.aString35 != null && local21.aString35.equalsIgnoreCase(arg1)) {
				local11 = true;
				@Pc(51) Class1_Sub9 local51;
				if (arg0 == 1) {
					local51 = Static123.method2194(Static469.aClass235_2, Static586.aClass208_110);
					local51.aClass1_Sub3_Sub1_1.method7922(0);
					local51.aClass1_Sub3_Sub1_1.method7937(local9[local13]);
					Static42.method746(local51);
				} else if (arg0 == 4) {
					local51 = Static123.method2194(Static469.aClass235_2, Static4.aClass208_108);
					local51.aClass1_Sub3_Sub1_1.method7933(0);
					local51.aClass1_Sub3_Sub1_1.method7937(local9[local13]);
					Static42.method746(local51);
				} else if (arg0 == 5) {
					local51 = Static123.method2194(Static469.aClass235_2, Static338.aClass208_79);
					local51.aClass1_Sub3_Sub1_1.method7912(local9[local13]);
					local51.aClass1_Sub3_Sub1_1.method7922(0);
					Static42.method746(local51);
				} else if (arg0 == 6) {
					local51 = Static123.method2194(Static469.aClass235_2, Static446.aClass208_96);
					local51.aClass1_Sub3_Sub1_1.method7923(local9[local13]);
					local51.aClass1_Sub3_Sub1_1.method7917(0);
					Static42.method746(local51);
				} else if (arg0 == 7) {
					local51 = Static123.method2194(Static469.aClass235_2, Static137.aClass208_32);
					local51.aClass1_Sub3_Sub1_1.method7918(local9[local13]);
					local51.aClass1_Sub3_Sub1_1.method7922(0);
					Static42.method746(local51);
				}
				break;
			}
		}
		if (!local11) {
			Static193.method3073(Static375.aClass253_25.method5453(Static161.anInt3095) + arg1);
		}
	}
}

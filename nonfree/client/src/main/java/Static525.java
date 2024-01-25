import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!rja", name = "d", descriptor = "I")
	public static int anInt8304;

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "Z")
	public static boolean aBoolean575 = false;

	@OriginalMember(owner = "client!rja", name = "b", descriptor = "I")
	public static int anInt8303 = 64;

	@OriginalMember(owner = "client!rja", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString100 = "";

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!dt;B)Lclient!pca;")
	public static Class21_Sub2 method6826(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(12) Class21 local12 = Static471.method6272(arg0);
		@Pc(18) int local18 = arg0.method7895();
		@Pc(22) int local22 = arg0.method7895();
		return new Class21_Sub2(local12.aClass266_12, local12.aClass131_23, local12.anInt9576, local12.anInt9573, local12.anInt9572, local12.anInt9574, local12.anInt9575, local12.anInt9570, local12.anInt9571, local18, local22);
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!nga;Z)V")
	public static void method6827(@OriginalArg(0) Class34_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort98; local2 <= arg0.aShort97; local2++) {
			for (@Pc(6) int local6 = arg0.aShort99; local6 <= arg0.aShort96; local6++) {
				@Pc(16) Class368 local16 = Static254.aClass368ArrayArrayArray2[arg0.aByte132][local2][local6];
				if (local16 != null) {
					@Pc(21) Class205 local21 = local16.aClass205_4;
					@Pc(23) Class205 local23 = null;
					while (local21 != null) {
						if (local21.aClass34_Sub1_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass205_4 = local21.aClass205_3;
							} else {
								local23.aClass205_3 = local21.aClass205_3;
							}
							local21.method4729();
							break;
						}
						local23 = local21;
						local21 = local21.aClass205_3;
					}
				}
			}
		}
		if (!arg1) {
			Static216.method3187(arg0);
		}
	}
}

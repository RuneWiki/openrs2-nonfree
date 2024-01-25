import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!gr", name = "s", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!gr", name = "w", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14;

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "Lclient!ki;")
	public static final Class183 aClass183_17 = new Class183();

	@OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
	public static int anInt3554 = 0;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)Z")
	public static boolean method3110() {
		try {
			return Static214.method3735();
		} catch (@Pc(12) IOException local12) {
			Static51.method1281();
			return true;
		} catch (@Pc(17) Exception local17) {
			@Pc(76) String local76 = "T2 - " + (Static576.aClass276_150 == null ? -1 : Static576.aClass276_150.method6903()) + "," + (Static91.aClass276_28 == null ? -1 : Static91.aClass276_28.method6903()) + "," + (Static403.aClass276_102 == null ? -1 : Static403.aClass276_102.method6903()) + " - " + Static79.anInt10464 + "," + (Static230.anInt4667 + Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray487[0]) + "," + (Static563.anInt10006 + Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray488[0]) + " - ";
			for (@Pc(78) int local78 = 0; local78 < Static79.anInt10464 && local78 < 50; local78++) {
				local76 = local76 + Static89.aClass3_Sub7_Sub1_2.aByteArray86[local78] + ",";
			}
			Static468.method7192(local76, local17);
			Static233.method4046(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)Z")
	public static boolean method3113(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method3115(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) Class3_Sub9 local12 = Static587.method8316(Static187.aClass40_2, Static388.aClass230_74);
		local12.aClass3_Sub7_Sub1_1.method6494(Static85.method1894(arg1) + 1);
		local12.aClass3_Sub7_Sub1_1.method6516(arg1);
		local12.aClass3_Sub7_Sub1_1.method6494(arg0);
		Static230.method3933(local12);
	}
}

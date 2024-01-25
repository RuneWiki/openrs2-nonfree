import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!sm", name = "z", descriptor = "Lclient!iaa;")
	public static Class3_Sub1_Sub2_Sub2_Sub1 aClass3_Sub1_Sub2_Sub2_Sub1_4;

	@OriginalMember(owner = "client!sm", name = "A", descriptor = "I")
	public static int anInt8293;

	@OriginalMember(owner = "client!sm", name = "B", descriptor = "Lclient!qq;")
	public static Class4_Sub3_Sub4 aClass4_Sub3_Sub4_5;

	@OriginalMember(owner = "client!sm", name = "v", descriptor = "[I")
	public static final int[] anIntArray565 = new int[2];

	@OriginalMember(owner = "client!sm", name = "w", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_179 = new Class151(70, 28);

	@OriginalMember(owner = "client!sm", name = "C", descriptor = "I")
	public static int anInt8294 = 0;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)Z")
	public static boolean method7187() {
		try {
			return Static109.method2083();
		} catch (@Pc(14) IOException local14) {
			Static665.method8811();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static58.aClass151_23 == null ? -1 : Static58.aClass151_23.method3270()) + "," + (Static650.aClass151_220 == null ? -1 : Static650.aClass151_220.method3270()) + "," + (Static86.aClass151_42 == null ? -1 : Static86.aClass151_42.method3270()) + " - " + Static583.anInt8992 + "," + (Static445.anInt6949 + aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray693[0]) + "," + (aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray694[0] + Static321.anInt5000) + " - ";
			for (@Pc(79) int local79 = 0; local79 < Static583.anInt8992 && local79 < 50; local79++) {
				local77 = local77 + Static159.aClass4_Sub11_Sub1_1.aByteArray107[local79] + ",";
			}
			Static357.method4765(local19, local77);
			Static306.method4298(false);
			return true;
		}
	}
}

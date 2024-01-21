import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ai", name = "Z", descriptor = "Lclient!pe;")
	public static Class13 aClass13_4;

	@OriginalMember(owner = "client!ai", name = "cb", descriptor = "I")
	public static int anInt332;

	@OriginalMember(owner = "client!ai", name = "yb", descriptor = "Lclient!pe;")
	public static Class13 aClass13_5;

	@OriginalMember(owner = "client!ai", name = "M", descriptor = "[Lclient!nb;")
	public static final Class2_Sub1_Sub1_Sub3_Sub2[] aClass2_Sub1_Sub1_Sub3_Sub2Array1 = new Class2_Sub1_Sub1_Sub3_Sub2[32768];

	@OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
	public static int anInt326 = 0;

	@OriginalMember(owner = "client!ai", name = "eb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_93 = Static158.method3034("Cabbage");

	@OriginalMember(owner = "client!ai", name = "ob", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_94 = Static158.method3034("mapscene");

	@OriginalMember(owner = "client!ai", name = "wb", descriptor = "I")
	public static int anInt346 = 0;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIB)I")
	public static int method281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(37) int local37 = Static4.method73(4, arg1 + 45365, arg0 + 91923) + (Static4.method73(2, arg1 + 10294, arg0 + 37821) - 128 >> 1) + (Static4.method73(1, arg1, arg0) - 128 >> 2) - 128;
		local37 = (int) ((double) local37 * 0.3D) + 35;
		if (local37 < 10) {
			local37 = 10;
		} else if (local37 > 60) {
			local37 = 60;
		}
		return local37;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)V")
	public static void method282(@OriginalArg(1) boolean arg0) {
		Static107.method2406();
		Static56.anInt1778++;
		if (Static56.anInt1778 < 50 && !arg0) {
			return;
		}
		Static56.anInt1778 = 0;
		if (Static62.aBoolean79 || Static29.aClass66_10 == null) {
			return;
		}
		Static7.aClass2_Sub3_Sub1_43.method244(33);
		try {
			Static29.aClass66_10.method2838(Static7.aClass2_Sub3_Sub1_43.aByteArray4, Static7.aClass2_Sub3_Sub1_43.anInt273);
			Static7.aClass2_Sub3_Sub1_43.anInt273 = 0;
		} catch (@Pc(45) IOException local45) {
			Static62.aBoolean79 = true;
		}
	}

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "(I)I")
	public static int method283() {
		return 6;
	}
}

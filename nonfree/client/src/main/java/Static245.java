import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!oa", name = "Xc", descriptor = "Lclient!b;")
	public static Class20 aClass20_54;

	@OriginalMember(owner = "client!oa", name = "jd", descriptor = "Lclient!b;")
	public static Class20 aClass20_55;

	@OriginalMember(owner = "client!oa", name = "kd", descriptor = "Z")
	public static boolean aBoolean344;

	@OriginalMember(owner = "client!oa", name = "zc", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_69 = new Class57("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!oa", name = "ld", descriptor = "[Z")
	public static final boolean[] aBooleanArray106 = new boolean[100];

	@OriginalMember(owner = "client!oa", name = "md", descriptor = "I")
	public static int anInt4418 = 0;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method4021(@OriginalArg(1) String arg0) {
		return Static285.method4498(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Lclient!wl;")
	public static Class250 method4024(@OriginalArg(0) int arg0) {
		@Pc(12) Class250 local12 = (Class250) Static16.aClass139_1.method3076((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(24) byte[] local24 = aClass20_54.method253(arg0, 1);
		local12 = new Class250();
		local12.anInt6451 = arg0;
		if (local24 != null) {
			local12.method5697(new Class3_Sub5(local24));
		}
		local12.method5699();
		if (local12.anInt6442 == 2 && Static80.aClass44_14.method942((long) arg0) == null) {
			Static80.aClass44_14.method948((long) arg0, new Class3_Sub28(Static27.anInt355));
			Static366.aClass250Array2[Static27.anInt355++] = local12;
		}
		Static16.aClass139_1.method3070(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "(I)V")
	public static void method4026() {
		Static322.aClass89_25.method1844();
		Static200.aClass10_1.method5239();
		if (Static289.aClass52_1 != null) {
			Static289.aClass52_1.method1044(Static173.aCanvas2);
		}
		Static144.aClient1.method896();
		Static173.aCanvas2.setBackground(Color.black);
		Static146.anInt2721 = -1;
		Static322.aClass89_25 = Static261.method4205(Static173.aCanvas2);
		Static200.aClass10_1 = Static8.method5701(Static173.aCanvas2);
		if (Static289.aClass52_1 != null) {
			Static289.aClass52_1.method1043(Static173.aCanvas2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZBII)I")
	public static int method4029(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class3_Sub18 local13 = Static214.method3324(arg2, arg0);
		if (local13 == null) {
			return 0;
		} else if (arg1 >= 0 && local13.anIntArray227.length > arg1) {
			return local13.anIntArray227[arg1];
		} else {
			return 0;
		}
	}
}

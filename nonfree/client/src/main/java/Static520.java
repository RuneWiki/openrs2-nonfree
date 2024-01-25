import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static520 {

	@OriginalMember(owner = "client!si", name = "d", descriptor = "I")
	public static int anInt8619;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_289 = new Class288(38, 10);

	@OriginalMember(owner = "client!si", name = "f", descriptor = "[I")
	public static final int[] anIntArray581 = new int[14];

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!qs;)I")
	public static int method7259(@OriginalArg(1) Class291 arg0) {
		if (Static634.aClass291_4 == arg0) {
			return 5890;
		} else if (Static113.aClass291_2 == arg0) {
			return 34167;
		} else if (arg0 == Static10.aClass291_1) {
			return 34168;
		} else if (arg0 == Static185.aClass291_3) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IBI)Z")
	public static boolean method7260(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static403.method5468(arg0, arg1) & Static144.method2181(arg1, arg0);
	}
}

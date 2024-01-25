import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!og", name = "K", descriptor = "I")
	public static int anInt5234;

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "[I")
	public static int[] anIntArray401;

	@OriginalMember(owner = "client!og", name = "N", descriptor = "Lclient!tu;")
	public static final Class229 aClass229_33 = new Class229();

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(II)I")
	public static int method4195(@OriginalArg(1) int arg0) {
		if (Static122.aClass27_1 != null) {
			Static122.aClass27_1.method893();
			Static122.aClass27_1 = null;
		}
		Static357.anInt6422++;
		if (Static357.anInt6422 > 4) {
			Static100.anInt2238 = 0;
			Static357.anInt6422 = 0;
			return arg0;
		}
		Static100.anInt2238 = 0;
		if (Static446.anInt7542 == Static262.anInt4960) {
			Static446.anInt7542 = Static301.anInt5507;
		} else {
			Static446.anInt7542 = Static262.anInt4960;
		}
		return -1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZII)I")
	public static int method4196(@OriginalArg(2) int arg0) {
		@Pc(12) Class3_Sub30 local12 = Static9.method237(false, arg0);
		if (local12 == null) {
			return Static343.aClass150_6.method3776(arg0).anInt1255;
		}
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local12.anIntArray360.length; local24++) {
			if (local12.anIntArray360[local24] == -1) {
				local22++;
			}
		}
		return local22 + Static343.aClass150_6.method3776(arg0).anInt1255 - local12.anIntArray360.length;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)V")
	public static void method4197(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub3_Sub7 local10 = Static139.method2522(1, arg0);
		local10.method1563();
	}
}

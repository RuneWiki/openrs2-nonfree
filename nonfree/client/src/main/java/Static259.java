import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!mu", name = "B", descriptor = "I")
	public static int anInt4264 = 0;

	@OriginalMember(owner = "client!mu", name = "J", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_102 = new Class211(65, -2);

	@OriginalMember(owner = "client!mu", name = "K", descriptor = "[I")
	public static final int[] anIntArray361 = new int[200];

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZI)V")
	public static void method3494(@OriginalArg(0) boolean arg0) {
		if (Static93.aString56.length() == 0) {
			return;
		}
		Static433.method5450("--> " + Static93.aString56);
		Static27.method2039(arg0, Static93.aString56, false);
		Static73.anInt1390 = 0;
		Static63.anInt1185 = 0;
		Static93.aString56 = "";
	}

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "(II)I")
	public static int method3496(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(24) int local24 = (local14 >>> 2 & 0xF3333333) + (local14 & 0x33333333);
		@Pc(32) int local32 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(43) int local43 = local32 + (local32 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}
}

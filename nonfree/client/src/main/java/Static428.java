import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static428 {

	@OriginalMember(owner = "client!pfa", name = "i", descriptor = "I")
	public static int anInt7858;

	@OriginalMember(owner = "client!pfa", name = "h", descriptor = "Lclient!vv;")
	public static final Class363 aClass363_4 = new Class363();

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZIIIILclient!kha;I)V")
	public static void method6581(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class181 arg3) {
		if (arg1 <= 0) {
			Static195.method6190(arg3, arg0, arg2);
			return;
		}
		Static110.aClass181_22 = arg3;
		Static565.anInt9608 = 1;
		Static369.anInt7034 = 0;
		Static218.aClass3_Sub7_Sub5_1 = null;
		Static458.anInt8332 = arg0;
		Static627.anInt10354 = arg2;
		Static618.aBoolean861 = false;
		Static370.anInt7046 = Static522.aClass3_Sub7_Sub5_4.method6033() / arg1;
		if (Static370.anInt7046 < 1) {
			Static370.anInt7046 = 1;
		}
	}
}

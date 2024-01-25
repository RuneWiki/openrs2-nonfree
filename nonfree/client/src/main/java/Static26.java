import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static26 {

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
	public static int anInt530;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
	public static int anInt529 = 0;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_21 = new Class150(84, 3);

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "S")
	public static short aShort2 = 1;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!oh;III)V")
	public static void method669(@OriginalArg(0) Class220 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static499.aClass220_17 != null || Static218.aBoolean250 || (arg0 == null || Static443.method6279(arg0) == null)) {
			return;
		}
		Static499.aClass220_17 = arg0;
		Static178.aClass220_8 = Static443.method6279(arg0);
		Static136.anInt2832 = 0;
		Static364.anInt6815 = arg1;
		Static377.aBoolean483 = false;
		Static543.anInt6390 = arg2;
	}
}

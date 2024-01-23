import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static151 {

	@OriginalMember(owner = "client!pa", name = "Y", descriptor = "Z")
	public static boolean aBoolean157;

	@OriginalMember(owner = "client!pa", name = "nb", descriptor = "I")
	public static int anInt3335;

	@OriginalMember(owner = "client!pa", name = "bb", descriptor = "Z")
	public static boolean aBoolean158 = true;

	@OriginalMember(owner = "client!pa", name = "cb", descriptor = "I")
	public static int anInt3327 = 0;

	@OriginalMember(owner = "client!pa", name = "eb", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1173 = Static64.method1101("Free world");

	@OriginalMember(owner = "client!pa", name = "gb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1174 = aClass51_1173;

	@OriginalMember(owner = "client!pa", name = "ib", descriptor = "I")
	public static int anInt3331 = 0;

	@OriginalMember(owner = "client!pa", name = "mb", descriptor = "Z")
	public static boolean aBoolean159 = false;

	@OriginalMember(owner = "client!pa", name = "ob", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1175 = Static64.method1101("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!ia;Lclient!ia;IIISJ)V")
	public static void method2611(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) short arg4, @OriginalArg(6) long arg5) {
		if (Static156.aBoolean164 || Static202.anInt4289 >= 500) {
			return;
		}
		Static21.aClass51Array3[Static202.anInt4289] = arg1;
		Static168.aClass51Array27[Static202.anInt4289] = arg0;
		Static227.aShortArray59[Static202.anInt4289] = arg4;
		Static19.aLongArray12[Static202.anInt4289] = arg5;
		Static185.anIntArray302[Static202.anInt4289] = arg2;
		Static179.anIntArray299[Static202.anInt4289] = arg3;
		Static202.anInt4289++;
	}

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "(I)I")
	public static int method2613() {
		return 6;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static100 {

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_60 = new Class363(43, 4);

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "[I")
	public static final int[] anIntArray107 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "J")
	public static long aLong59 = 0L;

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "Z")
	public static boolean aBoolean183 = false;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)V")
	public static void method1501(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		Static240.aBoolean152 = arg0;
		Static286.aString44 = arg1;
		Static392.aString61 = arg2;
		if (!Static240.aBoolean152 && Static253.anInt4705 != 3 && (Static392.aString61.equals("") || Static286.aString44.equals(""))) {
			Static139.method2346(3);
			return;
		}
		if (Static253.anInt4705 != 1) {
			Static229.anInt4299 = -1;
			Static354.anInt4540 = 0;
		}
		Static68.aBoolean123 = false;
		Static139.method2346(-3);
		Static283.anInt5058 = 0;
		Static199.anInt3950 = 1;
		Static472.anInt8066 = 0;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!es;Z)Lclient!pd;")
	public static Class221_Sub2 method1502(@OriginalArg(0) Class2_Sub15 arg0) {
		return new Class221_Sub2(arg0.method4334(), arg0.method4334(), arg0.method4334(), arg0.method4334(), arg0.method4341(), arg0.method4341(), arg0.method4325());
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static253 {

	@OriginalMember(owner = "client!mq", name = "C", descriptor = "I")
	public static int anInt4570;

	@OriginalMember(owner = "client!mq", name = "K", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_149 = new Class186(79, 8);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IILclient!jb;I)V")
	public static void method3465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2) {
		Static144.anInt2718 = arg1;
		Static16.aClass126_14 = arg2;
		Static214.anInt4022 = arg0;
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "(B)V")
	public static void method3468() {
		if (Static127.aString23.length() == 0) {
			return;
		}
		Static267.method3631("--> " + Static127.aString23);
		Static304.method4192(Static127.aString23, false);
		Static121.anInt2513 = 0;
		Static10.anInt350 = 0;
		Static127.aString23 = "";
	}
}

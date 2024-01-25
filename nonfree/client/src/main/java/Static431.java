import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!qda", name = "v", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread5;

	@OriginalMember(owner = "client!qda", name = "s", descriptor = "Lclient!eu;")
	public static final Class95 aClass95_7 = new Class95(1, 2);

	@OriginalMember(owner = "client!qda", name = "u", descriptor = "Lclient!or;")
	public static Class244 aClass244_56 = new Class244();

	@OriginalMember(owner = "client!qda", name = "w", descriptor = "Lclient!ac;")
	public static final Class5 aClass5_8 = new Class5("WTI", 5);

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
	public static void method5967(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static314.anInt5779 = arg1;
		Static403.anInt7291 = 2;
		Static81.method1893(arg2, false, arg0);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ILclient!ie;I)V")
	public static void method5968(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (Static25.aClass361_1 == null) {
			return;
		}
		try {
			Static25.aClass361_1.method8112(0L);
			Static25.aClass361_1.method8116(24, arg1, arg0.aByteArray213);
		} catch (@Pc(14) Exception local14) {
		}
	}
}

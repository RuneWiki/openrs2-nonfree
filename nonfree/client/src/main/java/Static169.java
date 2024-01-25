import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "Lclient!dn;")
	public static Class56 aClass56_41;

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
	public static int anInt3554;

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array12;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
	public static int anInt3551 = 0;

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "Lclient!gp;")
	public static final Class87 aClass87_14 = new Class87(14, 3);

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray76 = new String[100];

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILclient!eo;B)V")
	public static void method2916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class68 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray29 != null) {
			@Pc(13) Class3_Sub20 local13 = new Class3_Sub20();
			local13.aClass68_4 = arg2;
			local13.anObjectArray35 = arg2.anObjectArray29;
			Static272.method4044(local13);
		}
		Static295.anInt5382 = arg2.anInt2177;
		Static418.anInt7212 = arg1;
		Static108.anInt3456 = arg2.anInt2196;
		Static332.anInt6029 = arg2.anInt2222;
		Static455.anInt5935 = arg2.anInt2192;
		Static421.anInt4507 = arg0;
		Static59.aBoolean111 = true;
		Static207.anInt4138 = arg2.anInt2187;
		Static442.method5899(arg2);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)Z")
	public static boolean method2917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static276.method4120(arg1, arg0) || Static247.method3788(arg1, arg0);
	}
}

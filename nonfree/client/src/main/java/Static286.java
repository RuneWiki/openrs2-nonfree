import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "Lclient!kr;")
	public static final Class138 aClass138_45 = new Class138();

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "[Lclient!vo;")
	public static final Class3_Sub7_Sub15[] aClass3_Sub7_Sub15Array6 = new Class3_Sub7_Sub15[14];

	@OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
	public static int anInt5989 = 0;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
	public static void method5334() {
		@Pc(1) Class139 local1 = Static78.aClass139_13;
		synchronized (Static78.aClass139_13) {
			Static78.aClass139_13.method3083(5);
		}
		local1 = Static136.aClass139_31;
		synchronized (Static136.aClass139_31) {
			Static136.aClass139_31.method3083(5);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!dt;IIB)V")
	public static void method5337(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static313.aClass62_18 != null || Static287.aBoolean397 || (arg0 == null || Static151.method2384(arg0) == null)) {
			return;
		}
		Static313.aClass62_18 = arg0;
		Static363.aClass62_19 = Static151.method2384(arg0);
		Static48.anInt1064 = arg1;
		Static314.aBoolean421 = false;
		Static320.anInt5451 = arg2;
		Static352.anInt5915 = 0;
	}
}

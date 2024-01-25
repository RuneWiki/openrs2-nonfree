import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!mo", name = "fb", descriptor = "Ljava/lang/String;")
	public static String aString156;

	@OriginalMember(owner = "client!mo", name = "P", descriptor = "I")
	public static int anInt6118 = -1;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V")
	public static void method4964() {
		@Pc(20) Class3_Sub10 local20 = Static129.method2403(Static452.aClass353_2, Static353.aClass287_102);
		local20.aClass3_Sub26_Sub1_1.method6809(Static534.method7318());
		local20.aClass3_Sub26_Sub1_1.method6769(Static34.anInt3201);
		local20.aClass3_Sub26_Sub1_1.method6769(Static492.anInt8445);
		local20.aClass3_Sub26_Sub1_1.method6809(Static348.aClass3_Sub51_Sub1_5.anInt9941);
		Static193.method3398(local20);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)Z")
	public static boolean method4966(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}

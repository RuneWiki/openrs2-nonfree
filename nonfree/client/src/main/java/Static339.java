import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!w", name = "K", descriptor = "Z")
	public static boolean aBoolean541 = false;

	@OriginalMember(owner = "client!w", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString258 = "Allocated memory";

	@OriginalMember(owner = "client!w", name = "O", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_37 = new Class14();

	@OriginalMember(owner = "client!w", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString259 = "red:";

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(III)V")
	public static void method5638(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub15 local8 = Static17.method307(13, arg0);
		local8.method4783();
		local8.anInt5461 = arg1;
	}
}

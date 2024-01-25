import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
	public static int anInt6514;

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
	public static int anInt6515;

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_62 = new Class257(6, 2);

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method5352(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class8_Sub5_Sub8 local13 = Static509.method7344(3, arg0);
		local13.method3509();
		local13.aString55 = arg1;
	}
}

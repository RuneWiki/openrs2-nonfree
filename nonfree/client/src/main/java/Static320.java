import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString49;

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_104 = new Class286(24, 0);

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(BII)B")
	public static byte method4951(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIII)V")
	public static void method4952(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub3_Sub13 local8 = Static382.method5650(9, arg2);
		local8.method6098();
		local8.anInt7256 = arg0;
		local8.anInt7258 = arg1;
	}
}

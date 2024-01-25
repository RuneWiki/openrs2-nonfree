import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bd", name = "H", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray3;

	@OriginalMember(owner = "client!bd", name = "C", descriptor = "Z")
	public static boolean aBoolean80 = false;

	@OriginalMember(owner = "client!bd", name = "E", descriptor = "Lclient!hl;")
	public static final Class1_Sub18 aClass1_Sub18_1 = new Class1_Sub18(0, 0);

	@OriginalMember(owner = "client!bd", name = "I", descriptor = "[I")
	public static final int[] anIntArray34 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)V")
	public static void method844(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static374.method5445(13, arg0);
		local8.method491();
		local8.anInt548 = arg1;
	}
}

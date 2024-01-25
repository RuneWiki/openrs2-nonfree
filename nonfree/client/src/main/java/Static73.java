import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
	public static int anInt1645;

	@OriginalMember(owner = "client!ej", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!ej", name = "z", descriptor = "[I")
	public static final int[] anIntArray161 = new int[2500];

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method1384(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static155.method2994(arg1, 2);
		local8.method2031();
		local8.aString80 = arg0;
	}
}

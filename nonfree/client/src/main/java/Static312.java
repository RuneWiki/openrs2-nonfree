import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!lw", name = "R", descriptor = "Lclient!js;")
	public static Class55 aClass55_1;

	@OriginalMember(owner = "client!lw", name = "J", descriptor = "Lclient!hga;")
	public static final Class130 aClass130_37 = new Class130();

	@OriginalMember(owner = "client!lw", name = "O", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_170 = new Class272(32, -1);

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(III)V")
	public static void method4879(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static363.method5457(arg1, 7);
		local8.method839();
		local8.anInt1088 = arg0;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "([II[Ljava/lang/Object;)V")
	public static void method4880(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static88.method1973(arg0, arg1, arg0.length - 1, 0);
	}
}

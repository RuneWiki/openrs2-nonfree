import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!vs", name = "o", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "Lclient!eo;")
	public static Class68 aClass68_14 = null;

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "Lclient!vi;")
	public static final Class248 aClass248_10 = new Class248();

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IILclient!as;I)V")
	public static void method5758(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2) {
		Static125.aClass14ArrayArray2[arg2][arg0] = arg1;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)V")
	public static void method5759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static139.method2522(7, arg0);
		local8.method1570();
		local8.anInt1933 = arg1;
	}
}

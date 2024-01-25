import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "[I")
	public static int[] anIntArray503;

	@OriginalMember(owner = "client!pp", name = "n", descriptor = "Lclient!bfa;")
	public static final Class30 aClass30_4 = new Class30();

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BC)Z")
	public static boolean method6022(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!wu;III)Lclient!kda;")
	public static Class186 method6023(@OriginalArg(0) Class380 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) byte[] local14 = arg0.method8620(arg1, 0);
		return local14 == null ? null : new Class186(local14);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)V")
	public static void method6024(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class2_Sub2_Sub4 local17 = Static566.method7763(arg1, 17);
		local17.method662();
		local17.anInt823 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!nia", name = "h", descriptor = "Lclient!nu;")
	public static Class245 aClass245_1;

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(IBI)Lclient!oga;")
	public static Class252 method5713(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class252 local7 = new Class252();
		local7.anInt6850 = arg0 + 5 + 1;
		local7.anInt6837 = -1;
		local7.anInt6831 = -1;
		local7.anInt6844 = arg1 + 1 + 5;
		local7.anIntArrayArray45 = new int[local7.anInt6850][local7.anInt6844];
		local7.method6169();
		return local7;
	}
}

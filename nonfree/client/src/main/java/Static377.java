import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static377 {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
	public static int anInt6398;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
	public static int anInt6401;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
	public static int anInt6400 = 0;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!ie;Lclient!ie;)V")
	public static void method5066(@OriginalArg(1) Class2_Sub5 arg0, @OriginalArg(2) Class2_Sub5 arg1) {
		if (arg0.aClass2_Sub5_57 != null) {
			arg0.method5534();
		}
		arg0.aClass2_Sub5_58 = arg1.aClass2_Sub5_58;
		arg0.aClass2_Sub5_57 = arg1;
		arg0.aClass2_Sub5_57.aClass2_Sub5_58 = arg0;
		arg0.aClass2_Sub5_58.aClass2_Sub5_57 = arg0;
	}
}

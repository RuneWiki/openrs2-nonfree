import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
	public static int anInt6543 = 0;

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_237 = new Class214(25, 1);

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
	public static int anInt6545 = -1;

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
	public static int anInt6552 = 0;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(III)V")
	public static void method5035(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class1_Sub3_Sub13 local16 = Static397.method4998(1, arg0);
		local16.method3459();
		local16.anInt4301 = arg1;
	}
}

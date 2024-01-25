import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
	public static int anInt6618;

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_239 = new Class214(27, 6);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(BII)V")
	public static void method5094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class1_Sub3_Sub13 local16 = Static397.method4998(16, arg0);
		local16.method3459();
		local16.anInt4301 = arg1;
	}
}

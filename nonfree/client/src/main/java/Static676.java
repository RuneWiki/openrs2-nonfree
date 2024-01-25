import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static676 {

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	public static int anInt10698 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method8941(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(3, (long) arg1);
		local9.method630();
		local9.aString16 = arg0;
	}
}

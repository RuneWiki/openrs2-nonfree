import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
	public static int anInt3446 = 0;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!bo;)I")
	public static int method3256(@OriginalArg(1) Class6_Sub2_Sub2 arg0) {
		@Pc(17) String local17 = Static624.method8546(arg0);
		return Static228.aClass53_7.method822(Static532.aClass49Array14, local17);
	}
}

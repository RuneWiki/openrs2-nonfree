import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!ofa", name = "r", descriptor = "Lclient!kba;")
	public static final Class163 aClass163_46 = new Class163();

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(III)V")
	public static void method6274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub5_Sub19 local8 = Static348.method5721(arg0, 17);
		local8.method5179();
		local8.anInt6198 = arg1;
	}
}

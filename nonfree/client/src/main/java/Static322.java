import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!qc", name = "J", descriptor = "I")
	public static int anInt5260;

	@OriginalMember(owner = "client!qc", name = "A", descriptor = "Lclient!nd;")
	public static final Class175 aClass175_16 = new Class175(8, 7);

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(IBI)V")
	public static void method4586(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class6_Sub1_Sub12 local13 = Static449.method5975(arg1, 5);
		local13.method3043();
		local13.anInt3397 = arg0;
	}
}

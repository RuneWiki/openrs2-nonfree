import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "[Lclient!so;")
	public static final Class14_Sub29[] aClass14_Sub29Array1 = new Class14_Sub29[2048];

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
	public static int anInt5374 = 0;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
	public static int anInt5376 = 0;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)Lclient!eba;")
	public static Class12_Sub2_Sub1 method4510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class58 local7 = Static486.aClass58ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass12_Sub2_Sub1_2;
	}
}

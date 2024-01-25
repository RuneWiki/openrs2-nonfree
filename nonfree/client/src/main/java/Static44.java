import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cj", name = "E", descriptor = "Lclient!iq;")
	public static Class104 aClass104_190;

	@OriginalMember(owner = "client!cj", name = "F", descriptor = "Lclient!iq;")
	public static Class104 aClass104_191;

	@OriginalMember(owner = "client!cj", name = "v", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_222 = new Class221(12, 3);

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZILclient!ng;II)V")
	public static void method5703(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub27 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg0 | arg3 << 14 | arg2 << 28);
		@Pc(22) Class2_Sub20 local22 = (Class2_Sub20) Static198.aClass41_24.method902(local16);
		if (local22 == null) {
			local22 = new Class2_Sub20();
			Static198.aClass41_24.method901(local22, local16);
			local22.aClass180_16.method4909(arg1);
			return;
		}
		@Pc(45) Class122 local45 = Static310.aClass184_2.method5040(arg1.anInt4717);
		@Pc(48) int local48 = local45.anInt3904;
		if (local45.anInt3923 == 1) {
			local48 *= arg1.anInt4715 + 1;
		}
		for (@Pc(67) Class2_Sub27 local67 = (Class2_Sub27) local22.aClass180_16.method4919(); local67 != null; local67 = (Class2_Sub27) local22.aClass180_16.method4916()) {
			local45 = Static310.aClass184_2.method5040(local67.anInt4717);
			@Pc(78) int local78 = local45.anInt3904;
			if (local45.anInt3923 == 1) {
				local78 *= local67.anInt4715 + 1;
			}
			if (local48 > local78) {
				Static71.method1442(local67, arg1);
				return;
			}
		}
		local22.aClass180_16.method4909(arg1);
	}
}

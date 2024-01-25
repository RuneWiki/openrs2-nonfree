import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!jha", name = "p", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_81 = new Class337(43, 7);

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(ZLclient!re;)Z")
	public static boolean method4238(@OriginalArg(1) Class299 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean589) {
			return false;
		} else if (!arg0.method7064(Static620.anInterface12_2)) {
			return false;
		} else if (Static409.aClass273_9.method6581((long) arg0.anInt8144) == null) {
			return Static642.aClass273_47.method6581((long) arg0.anInt8121) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(II)Lclient!vfa;")
	public static Class360 method4239(@OriginalArg(1) int arg0) {
		@Pc(10) Class360 local10 = (Class360) Static372.aClass87_150.method1805((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static366.aClass207_71.method4681(0, arg0);
		local10 = new Class360();
		if (local27 != null) {
			local10.method8553(new Class5_Sub22(local27));
		}
		local10.method8550();
		Static372.aClass87_150.method1792((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method4241(@OriginalArg(0) Class5_Sub5_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static11.aClass61Array1 == Static456.aClass61Array3) {
			return;
		}
		@Pc(10) int local10 = Static20.aClass61Array2[arg1].method8584(arg3, arg2);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class61 local23 = Static20.aClass61Array2[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method8584(arg3, arg2), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(ILclient!ofa;)Lclient!hj;")
	public static Class146 method4242(@OriginalArg(1) Class5_Sub22 arg0) {
		@Pc(7) int local7 = arg0.method5966();
		@Pc(14) Class245 local14 = Static116.method4813()[arg0.method5966()];
		@Pc(21) Class183 local21 = Static1.method7584()[arg0.method5966()];
		@Pc(25) int local25 = arg0.method5956();
		@Pc(29) int local29 = arg0.method5956();
		@Pc(33) int local33 = arg0.method5968();
		@Pc(37) int local37 = arg0.method5968();
		@Pc(41) int local41 = arg0.method5913();
		@Pc(45) int local45 = arg0.method5913();
		@Pc(49) int local49 = arg0.method5913();
		@Pc(60) boolean local60 = arg0.method5966() == 1;
		return new Class146(local7, local14, local21, local25, local29, local33, local37, local41, local45, local49, local60);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
	public static int anInt3048;

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "[Lclient!dga;")
	public static final Class6_Sub14[] aClass6_Sub14Array1 = new Class6_Sub14[2048];

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_72 = new Class40(87, 12);

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "Lclient!lp;")
	public static final Class188 aClass188_4 = new Class188(2, 4, 4, 0);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V")
	public static void method2612() {
		if (Static25.anInt475 != -1) {
			Static43.method592(Static25.anInt475, -1, false, -1);
			Static25.anInt475 = -1;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!pq;BII)Lclient!he;")
	public static Class6_Sub1_Sub9 method2615(@OriginalArg(0) Class251 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class6_Sub14 local14 = new Class6_Sub14(arg0.method5860(arg2, arg1));
		@Pc(47) Class6_Sub1_Sub9 local47 = new Class6_Sub1_Sub9(arg1, local14.method5991(), local14.method5991(), local14.method6027(), local14.method6027(), local14.method6041() == 1, local14.method6041(), local14.method6041());
		@Pc(51) int local51 = local14.method6041();
		for (@Pc(58) int local58 = 0; local58 < local51; local58++) {
			local47.aClass275_61.method6370(new Class6_Sub41(local14.method6041(), local14.method6006(), local14.method6006(), local14.method6006(), local14.method6006(), local14.method6006(), local14.method6006(), local14.method6006(), local14.method6006()));
		}
		local47.method2749();
		return local47;
	}
}

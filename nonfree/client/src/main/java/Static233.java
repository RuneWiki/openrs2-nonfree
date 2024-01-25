import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_72 = new Class45(2, 6);

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!daa;)V")
	public static void method4139(@OriginalArg(1) Class12_Sub8 arg0) {
		if (arg0.aByteArray82.length - arg0.anInt6217 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method5216();
		if (local20 < 0 || local20 > 1 || arg0.aByteArray82.length - arg0.anInt6217 < 2) {
			return;
		}
		@Pc(40) int local40 = arg0.method5199();
		if (arg0.aByteArray82.length - arg0.anInt6217 < local40 * 6) {
			return;
		}
		for (@Pc(62) int local62 = 0; local62 < local40; local62++) {
			@Pc(68) int local68 = arg0.method5199();
			@Pc(72) int local72 = arg0.method5225();
			if (Static479.anIntArray646.length > local68 && Static425.aBooleanArray44[local68] && (Static480.aClass177_1.method4424(local68).aChar5 != '1' || local72 >= -1 && local72 <= 1)) {
				Static479.anIntArray646[local68] = local72;
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!dm;Lclient!qa;II)V")
	public static void method4141(@OriginalArg(1) Class73 arg0, @OriginalArg(2) Class42 arg1) {
		Static284.aClass73_46.method2014();
		if (Static245.aBoolean654) {
			return;
		}
		for (@Pc(24) Class12_Sub12 local24 = (Class12_Sub12) arg0.method2005(); local24 != null; local24 = (Class12_Sub12) arg0.method2009()) {
			@Pc(32) Class152 local32 = Static2.aClass93_5.method2480(local24.anInt2333);
			if (Static250.method4316(local32)) {
				@Pc(44) boolean local44 = Static486.method7267(local32, local24, arg1);
				if (local44) {
					Static389.method6149(arg1, local32, local24);
				}
			}
		}
	}
}

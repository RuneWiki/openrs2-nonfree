import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "Lclient!bf;")
	public static final Class31 aClass31_3 = new Class31();

	@OriginalMember(owner = "client!oha", name = "k", descriptor = "I")
	public static int anInt7589 = 0;

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
	public static void method6497() {
		@Pc(9) int[] local9 = new int[Static635.aClass336_2.anInt10100];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static635.aClass336_2.anInt10100; local13++) {
			@Pc(20) Class301 local20 = Static635.aClass336_2.method8424(local13);
			if (local20.anInt9214 >= 0 || local20.anInt9192 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static221.anIntArray251 = new int[local11];
		for (@Pc(44) int local44 = 0; local44 < local11; local44++) {
			Static221.anIntArray251[local44] = local9[local44];
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(IZLclient!in;I)Lclient!dfa;")
	public static Class2_Sub6_Sub4 method6500(@OriginalArg(0) int arg0, @OriginalArg(2) Class157 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class2_Sub11 local14 = new Class2_Sub11(arg1.method4564(arg2, arg0));
		@Pc(52) Class2_Sub6_Sub4 local52 = new Class2_Sub6_Sub4(arg0, local14.method8373(), local14.method8373(), local14.method8381(), local14.method8381(), local14.method8383() == 1, local14.method8383(), local14.method8383());
		@Pc(56) int local56 = local14.method8383();
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			local52.aClass341_27.method8528(new Class2_Sub28(local14.method8383(), local14.method8326(), local14.method8326(), local14.method8326(), local14.method8326(), local14.method8326(), local14.method8326(), local14.method8326(), local14.method8326()));
		}
		local52.method2560();
		return local52;
	}
}

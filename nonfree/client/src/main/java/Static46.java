import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
	public static int anInt865;

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "Lclient!tu;")
	public static Class233 aClass233_1;

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_13 = new Class84("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!ce", name = "u", descriptor = "[I")
	public static final int[] anIntArray58 = new int[8];

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[B)Lclient!cl;")
	public static Class1_Sub2_Sub5 method779(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class1_Sub2_Sub5 local9 = new Class1_Sub2_Sub5();
		@Pc(14) Class1_Sub1 local14 = new Class1_Sub1(arg0);
		local14.anInt5056 = local14.aByteArray66.length - 2;
		@Pc(25) int local25 = local14.method4093();
		@Pc(35) int local35 = local14.aByteArray66.length - local25 - 2 - 12;
		local14.anInt5056 = local35;
		@Pc(42) int local42 = local14.method4087();
		local9.anInt978 = local14.method4093();
		local9.anInt974 = local14.method4093();
		local9.anInt979 = local14.method4093();
		local9.anInt975 = local14.method4093();
		@Pc(66) int local66 = local14.method4130();
		@Pc(80) int local80;
		if (local66 > 0) {
			local9.aClass27Array1 = new Class27[local66];
			for (@Pc(74) int local74 = 0; local74 < local66; local74++) {
				local80 = local14.method4093();
				@Pc(87) Class27 local87 = new Class27(Static100.method1552(local80));
				local9.aClass27Array1[local74] = local87;
				while (local80-- > 0) {
					@Pc(98) int local98 = local14.method4087();
					@Pc(102) int local102 = local14.method4087();
					local87.method564((long) local98, new Class1_Sub13(local102));
				}
			}
		}
		local14.anInt5056 = 0;
		local9.aString6 = local14.method4097();
		local9.anIntArray66 = new int[local42];
		local9.anIntArray67 = new int[local42];
		local9.aStringArray8 = new String[local42];
		local80 = 0;
		while (local14.anInt5056 < local35) {
			@Pc(158) int local158 = local14.method4093();
			if (local158 == 3) {
				local9.aStringArray8[local80] = local14.method4137().intern();
			} else if (local158 >= 100 || local158 == 21 || local158 == 38 || local158 == 39) {
				local9.anIntArray66[local80] = local14.method4130();
			} else {
				local9.anIntArray66[local80] = local14.method4087();
			}
			local9.anIntArray67[local80++] = local158;
		}
		return local9;
	}
}

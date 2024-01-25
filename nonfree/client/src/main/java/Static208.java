import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!im", name = "j", descriptor = "Lclient!dn;")
	public static Class12_Sub10_Sub1 aClass12_Sub10_Sub1_1;

	@OriginalMember(owner = "client!im", name = "l", descriptor = "I")
	public static int anInt4588;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	public static void method3861() {
		Static493.aClass12_Sub13_Sub2_3.method4242();
		Static111.anInt2588 = 1;
		Static444.aClass16_104 = null;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I[B)Lclient!fh;")
	public static Class12_Sub4_Sub6 method3863(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class12_Sub4_Sub6 local9 = new Class12_Sub4_Sub6();
		@Pc(14) Class12_Sub8 local14 = new Class12_Sub8(arg0);
		local14.anInt6217 = local14.aByteArray82.length - 2;
		@Pc(25) int local25 = local14.method5199();
		@Pc(35) int local35 = local14.aByteArray82.length - local25 - 2 - 12;
		local14.anInt6217 = local35;
		@Pc(42) int local42 = local14.method5225();
		local9.anInt3072 = local14.method5199();
		local9.anInt3069 = local14.method5199();
		local9.anInt3068 = local14.method5199();
		local9.anInt3067 = local14.method5199();
		@Pc(66) int local66 = local14.method5216();
		@Pc(81) int local81;
		@Pc(87) int local87;
		if (local66 > 0) {
			local9.aClass68Array1 = new Class68[local66];
			for (local81 = 0; local81 < local66; local81++) {
				local87 = local14.method5199();
				@Pc(94) Class68 local94 = new Class68(Static37.method6277(local87));
				local9.aClass68Array1[local81] = local94;
				while (local87-- > 0) {
					@Pc(105) int local105 = local14.method5225();
					@Pc(109) int local109 = local14.method5225();
					local94.method1916(new Class12_Sub18(local109), (long) local105);
				}
			}
		}
		local14.anInt6217 = 0;
		local9.aString27 = local14.method5187();
		local9.aStringArray17 = new String[local42];
		local9.anIntArray229 = new int[local42];
		local9.anIntArray230 = new int[local42];
		local81 = 0;
		while (local14.anInt6217 < local35) {
			local87 = local14.method5199();
			if (local87 == 3) {
				local9.aStringArray17[local81] = local14.method5206().intern();
			} else if (local87 >= 100 || local87 == 21 || local87 == 38 || local87 == 39) {
				local9.anIntArray229[local81] = local14.method5216();
			} else {
				local9.anIntArray229[local81] = local14.method5225();
			}
			local9.anIntArray230[local81++] = local87;
		}
		return local9;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!m", name = "c", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_64 = new Class15("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!m", name = "f", descriptor = "[I")
	public static final int[] anIntArray323 = new int[4096];

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Lclient!ni;")
	public static final Class178 aClass178_15 = new Class178("LOCAL", 4);

	@OriginalMember(owner = "client!m", name = "h", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_139 = new Class56(29, 8);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	public static void method3188(@OriginalArg(0) int arg0) {
		Static184.anIntArray259 = new int[arg0];
		Static221.anIntArray278 = new int[arg0];
		Static54.anIntArray93 = new int[arg0];
		Static249.anIntArray573 = new int[arg0];
		Static356.anIntArray466 = new int[arg0];
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B[B)Lclient!pi;")
	public static Class4_Sub2_Sub15 method3190(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class4_Sub2_Sub15 local9 = new Class4_Sub2_Sub15();
		@Pc(14) Class4_Sub9 local14 = new Class4_Sub9(arg0);
		local14.anInt6207 = local14.aByteArray81.length - 2;
		@Pc(25) int local25 = local14.method5028();
		@Pc(36) int local36 = local14.aByteArray81.length - local25 - 2 - 12;
		local14.anInt6207 = local36;
		@Pc(43) int local43 = local14.method4997();
		local9.anInt5004 = local14.method5028();
		local9.anInt5005 = local14.method5028();
		local9.anInt5002 = local14.method5028();
		local9.anInt5003 = local14.method5028();
		@Pc(67) int local67 = local14.method5007();
		@Pc(75) int local75;
		@Pc(81) int local81;
		if (local67 > 0) {
			local9.aClass67Array1 = new Class67[local67];
			for (local75 = 0; local75 < local67; local75++) {
				local81 = local14.method5028();
				@Pc(88) Class67 local88 = new Class67(Static171.method2382(local81));
				local9.aClass67Array1[local75] = local88;
				while (local81-- > 0) {
					@Pc(99) int local99 = local14.method4997();
					@Pc(103) int local103 = local14.method4997();
					local88.method1426(new Class4_Sub24(local103), (long) local99);
				}
			}
		}
		local14.anInt6207 = 0;
		local9.aString56 = local14.method5032();
		local9.aStringArray34 = new String[local43];
		local9.anIntArray398 = new int[local43];
		local9.anIntArray397 = new int[local43];
		local75 = 0;
		while (local14.anInt6207 < local36) {
			local81 = local14.method5028();
			if (local81 == 3) {
				local9.aStringArray34[local75] = local14.method5038().intern();
			} else if (local81 >= 100 || local81 == 21 || local81 == 38 || local81 == 39) {
				local9.anIntArray398[local75] = local14.method5007();
			} else {
				local9.anIntArray398[local75] = local14.method4997();
			}
			local9.anIntArray397[local75++] = local81;
		}
		return local9;
	}
}

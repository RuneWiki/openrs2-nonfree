import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!jl", name = "A", descriptor = "Lclient!aq;")
	public static final Class22 aClass22_36 = new Class22(32);

	@OriginalMember(owner = "client!jl", name = "C", descriptor = "[Z")
	public static final boolean[] aBooleanArray46 = new boolean[200];

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)Z")
	public static boolean method6760(@OriginalArg(1) int arg0) {
		return arg0 == 15 || arg0 == 12 || arg0 == 1001 || arg0 == 57 || arg0 == 53;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "([[BLclient!qv;Z)V")
	public static void method6762(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class29_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(30) Class2_Sub8 local30 = new Class2_Sub8(local23);
				local36 = Static437.anIntArray399[local17] >> 8;
				@Pc(42) int local42 = Static437.anIntArray399[local17] & 0xFF;
				@Pc(48) int local48 = local36 * 64 - Static640.anInt11085;
				@Pc(55) int local55 = local42 * 64 - Static490.anInt8763;
				Static25.method456();
				arg1.method7852(Static490.anInt8763, Static640.anInt11085, local55, local30, local48, Static196.aClass200Array1);
				arg1.method7862(local30, Static607.aClass101_15, local55, local48, local12);
				if (!arg1.aBoolean642 && local36 == Static194.anInt4134 / 8 && local42 == Static587.anInt10249 / 8 && local12[0] != -1) {
					Static32.aClass251_1 = Static462.aClass299_1.method7742(local12[0], local12[3], local12[1], Static6.aClass176_1, local12[2]);
					Static279.anInt5178 = local12[4];
				}
			}
		}
		for (@Pc(138) int local138 = 0; local138 < local15; local138++) {
			@Pc(151) int local151 = (Static437.anIntArray399[local138] >> 8) * 64 - Static640.anInt11085;
			local36 = (Static437.anIntArray399[local138] & 0xFF) * 64 - Static490.anInt8763;
			@Pc(165) byte[] local165 = arg0[local138];
			if (local165 == null && Static587.anInt10249 < 800) {
				Static25.method456();
				arg1.method7851(local36, local151);
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLclient!uf;)V")
	public static void method6763(@OriginalArg(1) Class357 arg0) {
		if (!Static537.aBoolean683) {
			return;
		}
		if (arg0.anObjectArray30 != null) {
			@Pc(18) Class357 local18 = Static226.method4160(Static590.anInt10293, Static135.anInt2564);
			if (local18 != null) {
				@Pc(24) Class2_Sub45 local24 = new Class2_Sub45();
				local24.aClass357_132 = local18;
				local24.anObjectArray2 = arg0.anObjectArray30;
				local24.aClass357_131 = arg0;
				Static518.method8031(local24);
			}
		}
		@Pc(41) Class2_Sub52 local41 = Static311.method5098(Static183.aClass341_44, Static125.aClass179_1);
		local41.aClass2_Sub8_Sub2_2.method5194(arg0.anInt10460);
		local41.aClass2_Sub8_Sub2_2.method5205(Static188.anInt8300);
		local41.aClass2_Sub8_Sub2_2.method5205(Static590.anInt10293);
		local41.aClass2_Sub8_Sub2_2.method5192(arg0.anInt10396);
		local41.aClass2_Sub8_Sub2_2.method5188(Static135.anInt2564);
		local41.aClass2_Sub8_Sub2_2.method5205(arg0.anInt10432);
		Static38.method791(local41);
	}
}

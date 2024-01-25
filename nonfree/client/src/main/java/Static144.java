import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fn", name = "K", descriptor = "Lclient!ro;")
	public static Class6_Sub19_Sub3 aClass6_Sub19_Sub3_2;

	@OriginalMember(owner = "client!fn", name = "L", descriptor = "[[[Lclient!af;")
	public static Class9[][][] aClass9ArrayArrayArray1;

	@OriginalMember(owner = "client!fn", name = "B", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIII)V")
	public static void method2158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		@Pc(14) int local14 = -1;
		Static455.method6536(arg1 + arg2, -arg2 + arg1, arg0, Static503.anIntArrayArray12[arg3]);
		while (local9 > local7) {
			local14 += 2;
			local7++;
			local12 += local14;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(63) int[] local63 = Static503.anIntArrayArray12[local9 + arg3];
				@Pc(70) int[] local70 = Static503.anIntArrayArray12[arg3 - local9];
				@Pc(74) int local74 = local7 + arg1;
				@Pc(78) int local78 = arg1 - local7;
				Static455.method6536(local74, local78, arg0, local63);
				Static455.method6536(local74, local78, arg0, local70);
			}
			@Pc(94) int local94 = arg1 + local9;
			@Pc(98) int local98 = arg1 - local9;
			@Pc(104) int[] local104 = Static503.anIntArrayArray12[local7 + arg3];
			@Pc(110) int[] local110 = Static503.anIntArrayArray12[arg3 - local7];
			Static455.method6536(local94, local98, arg0, local104);
			Static455.method6536(local94, local98, arg0, local110);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "([BZ)Lclient!uw;")
	public static Class6_Sub1_Sub17 method2159(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class6_Sub1_Sub17 local9 = new Class6_Sub1_Sub17();
		@Pc(14) Class6_Sub14 local14 = new Class6_Sub14(arg0);
		local14.anInt7244 = local14.aByteArray88.length - 2;
		@Pc(25) int local25 = local14.method6006();
		@Pc(36) int local36 = local14.aByteArray88.length - local25 - 2 - 12;
		local14.anInt7244 = local36;
		@Pc(43) int local43 = local14.method6027();
		local9.anInt9023 = local14.method6006();
		local9.anInt9025 = local14.method6006();
		local9.anInt9024 = local14.method6006();
		local9.anInt9021 = local14.method6006();
		@Pc(67) int local67 = local14.method6041();
		@Pc(83) int local83;
		@Pc(89) int local89;
		if (local67 > 0) {
			local9.aClass212Array1 = new Class212[local67];
			for (local83 = 0; local83 < local67; local83++) {
				local89 = local14.method6006();
				@Pc(96) Class212 local96 = new Class212(Static516.method7313(local89));
				local9.aClass212Array1[local83] = local96;
				while (local89-- > 0) {
					@Pc(107) int local107 = local14.method6027();
					@Pc(111) int local111 = local14.method6027();
					local96.method5104((long) local107, new Class6_Sub9(local111));
				}
			}
		}
		local14.anInt7244 = 0;
		local9.aString115 = local14.method5981();
		local9.anIntArray678 = new int[local43];
		local9.anIntArray679 = new int[local43];
		local9.aStringArray33 = new String[local43];
		local83 = 0;
		while (local14.anInt7244 < local36) {
			local89 = local14.method6006();
			if (local89 == 3) {
				local9.aStringArray33[local83] = local14.method5991().intern();
			} else if (local89 >= 100 || local89 == 21 || local89 == 38 || local89 == 39) {
				local9.anIntArray679[local83] = local14.method6041();
			} else {
				local9.anIntArray679[local83] = local14.method6027();
			}
			local9.anIntArray678[local83++] = local89;
		}
		return local9;
	}
}

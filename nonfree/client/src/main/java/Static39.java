import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!cj", name = "A", descriptor = "Lclient!nq;")
	public static Class144 aClass144_16;

	@OriginalMember(owner = "client!cj", name = "E", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "[Lclient!kh;")
	public static final Class11_Sub25[] aClass11_Sub25Array1 = new Class11_Sub25[2048];

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "Z")
	public static boolean aBoolean43 = true;

	@OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
	public static int anInt725 = 0;

	@OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
	public static int anInt727 = 0;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)I")
	public static int method577(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(24) int local24 = local13 | local13 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "([BB)Lclient!ks;")
	public static Class11_Sub4_Sub9 method581(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class11_Sub4_Sub9 local9 = new Class11_Sub4_Sub9();
		@Pc(22) Class11_Sub25 local22 = new Class11_Sub25(arg0);
		local22.anInt6076 = local22.aByteArray93.length - 2;
		@Pc(33) int local33 = local22.method5187();
		@Pc(41) int local41 = local22.aByteArray93.length - local33 - 14;
		local22.anInt6076 = local41;
		@Pc(48) int local48 = local22.method5198();
		local9.anInt3360 = local22.method5187();
		local9.anInt3358 = local22.method5187();
		local9.anInt3361 = local22.method5187();
		local9.anInt3353 = local22.method5187();
		@Pc(72) int local72 = local22.method5185();
		@Pc(80) int local80;
		@Pc(86) int local86;
		if (local72 > 0) {
			local9.aClass58Array1 = new Class58[local72];
			for (local80 = 0; local80 < local72; local80++) {
				local86 = local22.method5187();
				@Pc(93) Class58 local93 = new Class58(Static90.method4097(local86));
				local9.aClass58Array1[local80] = local93;
				while (local86-- > 0) {
					@Pc(104) int local104 = local22.method5198();
					@Pc(108) int local108 = local22.method5198();
					local93.method1006((long) local104, new Class11_Sub33(local108));
				}
			}
		}
		local22.anInt6076 = 0;
		local9.aString33 = local22.method5202();
		local9.anIntArray221 = new int[local48];
		local9.aStringArray25 = new String[local48];
		local9.anIntArray220 = new int[local48];
		local80 = 0;
		while (local41 > local22.anInt6076) {
			local86 = local22.method5187();
			if (local86 == 3) {
				local9.aStringArray25[local80] = local22.method5184().intern();
			} else if (local86 >= 100 || local86 == 21 || local86 == 38 || local86 == 39) {
				local9.anIntArray221[local80] = local22.method5185();
			} else {
				local9.anIntArray221[local80] = local22.method5198();
			}
			local9.anIntArray220[local80++] = local86;
		}
		return local9;
	}
}

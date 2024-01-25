import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
	public static int anInt5821;

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "Lclient!th;")
	public static Class188 aClass188_8;

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_105 = new Class93(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!tq;Z)Lclient!ds;")
	public static Class2_Sub14 method5129(@OriginalArg(0) int arg0, @OriginalArg(1) Class191 arg1) {
		@Pc(13) byte[] local13 = arg1.method5448(arg0);
		return local13 == null ? null : new Class2_Sub14(local13);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)V")
	public static void method5130(@OriginalArg(1) int arg0) {
		Static110.anIntArray224 = new int[arg0];
		Static183.anIntArray295 = new int[arg0];
		Static47.anIntArray90 = new int[arg0];
		Static209.anIntArray371 = new int[arg0];
		Static183.anIntArray296 = new int[arg0];
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!wl;Z)Z")
	public static boolean method5131(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static301.aClass73Array31 == Static313.aClass73Array39;
		@Pc(8) int local8 = 0;
		arg0.method4763();
		if (arg0.aShort84 < 0 || arg0.aShort83 < 0 || arg0.aShort86 >= Static223.anInt4280 || arg0.aShort85 >= Static160.anInt3244) {
			return false;
		}
		@Pc(34) int local34;
		@Pc(37) int local37;
		for (@Pc(30) int local30 = arg0.aShort84; local30 <= arg0.aShort86; local30++) {
			for (local34 = arg0.aShort83; local34 <= arg0.aShort85; local34++) {
				local37 = 0;
				if (local30 > arg0.aShort84) {
					local37++;
				}
				if (local30 < arg0.aShort86) {
					local37 += 4;
				}
				if (local34 > arg0.aShort83) {
					local37 += 8;
				}
				if (local34 < arg0.aShort85) {
					local37 += 2;
				}
				Static65.method1493(arg0.aByte56, local30, local34);
				@Pc(71) Class8 local71 = Static275.aClass8ArrayArrayArray4[arg0.aByte56][local30][local34];
				@Pc(76) Class172 local76 = Static227.method3973(local37, arg0);
				@Pc(79) Class172 local79 = local71.aClass172_1;
				if (local79 == null) {
					local71.aClass172_1 = local76;
				} else {
					while (local79.aClass172_4 != null) {
						local79 = local79.aClass172_4;
					}
					local79.aClass172_4 = local76;
				}
				local71.aByte3 = (byte) (local71.aByte3 | local37);
				if (local6 && Static126.anIntArrayArray82[local30][local34] != 0) {
					local8 = Static126.anIntArrayArray82[local30][local34];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local34 = arg0.aShort84; local34 <= arg0.aShort86; local34++) {
				for (local37 = arg0.aShort83; local37 <= arg0.aShort85; local37++) {
					if (Static126.anIntArrayArray82[local34][local37] == 0) {
						Static126.anIntArrayArray82[local34][local37] = local8;
					}
				}
			}
		}
		if (arg1) {
			Static355.aClass62_Sub1Array3[Static346.anInt6897++] = arg0;
		}
		return true;
	}
}

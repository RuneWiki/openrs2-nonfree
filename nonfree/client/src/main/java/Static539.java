import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!uj", name = "x", descriptor = "Lclient!mc;")
	public static Class216 aClass216_2;

	@OriginalMember(owner = "client!uj", name = "A", descriptor = "I")
	public static int anInt8817;

	@OriginalMember(owner = "client!uj", name = "L", descriptor = "I")
	public static int anInt8821;

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
	public static int anInt8810 = 0;

	@OriginalMember(owner = "client!uj", name = "F", descriptor = "I")
	public static int anInt8819 = -1;

	@OriginalMember(owner = "client!uj", name = "J", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray8 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!r;)V")
	public static void method7367(@OriginalArg(1) Class100 arg0) {
		if (Static347.anInt6255 < 2 && !Static25.aBoolean32 || Static288.aClass196_3 != null) {
			return;
		}
		@Pc(38) String local38;
		if (Static25.aBoolean32 && Static347.anInt6255 < 2) {
			local38 = Static271.aString38 + Static290.aClass198_34.method4365(Static52.anInt1264) + Static12.aString4 + " ->";
		} else if (Static561.aBoolean709 && Static529.aClass177_10.method4001(81) && Static347.anInt6255 > 2) {
			local38 = Static374.method5546((Class2_Sub5) Static375.aClass8_38.aClass2_9.aClass2_285.aClass2_285);
		} else {
			@Pc(57) Class2_Sub5 local57 = (Class2_Sub5) Static375.aClass8_38.aClass2_9.aClass2_285;
			local38 = Static374.method5546(local57);
			@Pc(63) int[] local63 = null;
			if (Static370.method5499(local57.anInt902)) {
				local63 = Static296.aClass218_1.method5067((int) local57.aLong30).anIntArray648;
			} else if (local57.anInt896 != -1) {
				local63 = Static296.aClass218_1.method5067(local57.anInt896).anIntArray648;
			} else if (Static489.method6854(local57.anInt902)) {
				@Pc(86) Class2_Sub32 local86 = (Class2_Sub32) Static544.aClass162_40.method3519((long) local57.aLong30);
				if (local86 != null) {
					@Pc(91) Class6_Sub1_Sub1_Sub1_Sub1 local91 = local86.aClass6_Sub1_Sub1_Sub1_Sub1_1;
					@Pc(94) Class86 local94 = local91.aClass86_1;
					if (local94.anIntArray136 != null) {
						local94 = local94.method1567(Static70.aClass78_1);
					}
					if (local94 != null) {
						local63 = local94.anIntArray135;
					}
				}
			} else if (Static205.method3315(local57.anInt902)) {
				@Pc(132) Class32 local132;
				if (local57.anInt902 == 1008) {
					local132 = Static541.aClass97_4.method1794((int) local57.aLong30);
				} else {
					local132 = Static541.aClass97_4.method1794((int) (local57.aLong30 >>> 32 & 0x7FFFFFFFL));
				}
				if (local132.anIntArray50 != null) {
					local132 = local132.method552(Static70.aClass78_1);
				}
				if (local132 != null) {
					local63 = local132.anIntArray45;
				}
			}
			if (local63 != null) {
				local38 = local38 + Static362.method5082(local63);
			}
		}
		if (Static347.anInt6255 > 2) {
			local38 = local38 + "<col=ffffff> / " + (Static347.anInt6255 - 2) + Static290.aClass198_27.method4365(Static52.anInt1264);
		}
		if (Static433.aClass196_7 != null) {
			@Pc(233) Class29 local233 = Static433.aClass196_7.method4251(arg0);
			if (local233 == null) {
				local233 = Static419.aClass29_13;
			}
			local233.method7109(Static126.aClass39Array14, Static433.aClass196_7.anInt5078, Static151.anInt3036, Static433.aClass196_7.anInt5157, Static433.aClass196_7.anInt5130, Static576.aRandom4, local38, Static417.anIntArray493, Static406.anInt7068, Static433.aClass196_7.anInt5107, Static402.anIntArray482, Static433.aClass196_7.anInt5083, Static532.anInt8742, Static433.aClass196_7.anInt5123);
			Static50.method898(Static417.anIntArray493[2], Static417.anIntArray493[1], Static417.anIntArray493[3], Static417.anIntArray493[0]);
		} else if (Static462.aClass196_10 != null && Static328.aClass284_2 == Static574.aClass284_4) {
			@Pc(298) int local298 = Static419.aClass29_13.method7113(Static402.anIntArray482, Static576.aRandom4, Static126.aClass39Array14, Static533.anInt9218 + 4, Static99.anInt2049 + 16, local38, Static532.anInt8742);
			Static50.method898(Static83.aClass294_6.method6718(local38) + local298, Static99.anInt2049, 16, Static533.anInt9218 + 4);
		}
	}
}

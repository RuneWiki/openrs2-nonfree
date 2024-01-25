import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!ur", name = "cb", descriptor = "[Lclient!f;")
	public static Class76[] aClass76Array18;

	@OriginalMember(owner = "client!ur", name = "U", descriptor = "Lclient!wl;")
	public static final Class265 aClass265_50 = new Class265();

	@OriginalMember(owner = "client!ur", name = "bb", descriptor = "Lclient!ra;")
	public static final Class208 aClass208_13 = new Class208(8, 0, 4, 1);

	@OriginalMember(owner = "client!ur", name = "db", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
	public static void method5568() {
		@Pc(8) int local8 = Static253.aByteArrayArray12.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static253.aByteArrayArray12[local10] != null) {
				@Pc(20) int local20 = -1;
				for (@Pc(22) int local22 = 0; local22 < Static207.anInt3964; local22++) {
					if (Static331.anIntArray383[local22] == Static96.anIntArray119[local10]) {
						local20 = local22;
						break;
					}
				}
				if (local20 == -1) {
					Static331.anIntArray383[Static207.anInt3964] = Static96.anIntArray119[local10];
					local20 = Static207.anInt3964++;
				}
				@Pc(65) Class2_Sub20 local65 = new Class2_Sub20(Static253.aByteArrayArray12[local10]);
				@Pc(67) int local67 = 0;
				while (Static253.aByteArrayArray12[local10].length > local65.anInt4608 && local67 < 511 && Static391.anInt6867 < 1023) {
					@Pc(86) int local86 = local20 | local67++ << 6;
					@Pc(90) int local90 = local65.method3711();
					@Pc(94) int local94 = local90 >> 14;
					@Pc(100) int local100 = local90 >> 7 & 0x3F;
					@Pc(104) int local104 = local90 & 0x3F;
					@Pc(116) int local116 = local100 + (Static96.anIntArray119[local10] >> 8) * 64 - Static173.anInt3340;
					@Pc(130) int local130 = (Static96.anIntArray119[local10] & 0xFF) * 64 + local104 - Static379.anInt6721;
					@Pc(137) Class215 local137 = Static417.aClass234_2.method5362(local65.method3711());
					if (Static4.aClass4_Sub2_Sub2_Sub2Array1[local86] == null && (local137.aByte79 & 0x1) > 0 && Static179.anInt6503 == local94 && local116 >= 0 && Static81.anInt1950 > local116 + local137.anInt5998 && local130 >= 0 && local130 + local137.anInt5998 < Static171.anInt3288) {
						Static4.aClass4_Sub2_Sub2_Sub2Array1[local86] = new Class4_Sub2_Sub2_Sub2();
						Static4.aClass4_Sub2_Sub2_Sub2Array1[local86].anInt6456 = local86;
						@Pc(198) Class4_Sub2_Sub2_Sub2 local198 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local86];
						Static312.anIntArray202[Static391.anInt6867++] = local86;
						local198.anInt6508 = Static164.anInt3206;
						local198.method5135(local137);
						local198.method5117(local198.aClass215_1.anInt5998);
						local198.anInt6462 = local198.aClass215_1.anInt6004 << 3;
						if (local198.anInt6462 == 0) {
							local198.method5122(0);
						} else {
							local198.method5122((local198.aClass215_1.aByte78 + 4 & 0x59800007) << 11);
						}
						local198.method5132(true, local130, local198.method5118(), local116, local94);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)I")
	public static int method5574(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}

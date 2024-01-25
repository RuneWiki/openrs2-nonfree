import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
	public static int anInt4935;

	@OriginalMember(owner = "client!mo", name = "y", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray34;

	@OriginalMember(owner = "client!mo", name = "p", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_114 = new Class263(61, 6);

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
	public static void method3781() {
		@Pc(6) int local6 = Static339.aByteArrayArray20.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			if (Static339.aByteArrayArray20[local8] != null) {
				@Pc(20) int local20 = -1;
				for (@Pc(22) int local22 = 0; local22 < Static301.anInt5645; local22++) {
					if (Static168.anIntArray147[local8] == Static380.anIntArray636[local22]) {
						local20 = local22;
						break;
					}
				}
				if (local20 == -1) {
					Static380.anIntArray636[Static301.anInt5645] = Static168.anIntArray147[local8];
					local20 = Static301.anInt5645++;
				}
				@Pc(60) Class1_Sub3 local60 = new Class1_Sub3(Static339.aByteArrayArray20[local8]);
				@Pc(62) int local62 = 0;
				while (Static339.aByteArrayArray20[local8].length > local60.anInt1710 && local62 < 511 && Static197.anInt4078 < 1023) {
					@Pc(79) int local79 = local62++ << 6 | local20;
					@Pc(83) int local83 = local60.method1177();
					@Pc(87) int local87 = local83 >> 14;
					@Pc(93) int local93 = local83 >> 7 & 0x3F;
					@Pc(97) int local97 = local83 & 0x3F;
					@Pc(110) int local110 = (Static168.anIntArray147[local8] >> 8) * 64 + local93 - Static278.anInt5374;
					@Pc(123) int local123 = (Static168.anIntArray147[local8] & 0xFF) * 64 + local97 - Static380.anInt6896;
					@Pc(130) Class11 local130 = Static300.aClass44_2.method999(local60.method1177());
					@Pc(137) Class1_Sub27 local137 = (Class1_Sub27) Static24.aClass38_3.method765((long) local79);
					if (local137 == null && (local130.aByte8 & 0x1) > 0 && local87 == Static313.anInt5847 && local110 >= 0 && local130.anInt162 + local110 < Static209.anInt4283 && local123 >= 0 && Static211.anInt4295 > local130.anInt162 + local123) {
						@Pc(174) Class30_Sub1_Sub1_Sub1 local174 = new Class30_Sub1_Sub1_Sub1();
						local174.anInt1299 = local79;
						@Pc(182) Class1_Sub27 local182 = new Class1_Sub27(local174);
						Static24.aClass38_3.method766(local182, (long) local79);
						Static324.aClass1_Sub27Array2[Static127.anInt2832++] = local182;
						Static415.anIntArray701[Static197.anInt4078++] = local79;
						local174.anInt1239 = Static187.anInt3975;
						local174.method666(local130);
						local174.method949(local174.aClass11_1.anInt162);
						local174.anInt1302 = local174.aClass11_1.anInt159 << 3;
						local174.method943(true, (local174.aClass11_1.aByte1 + 4 & 0x45800007) << 11);
						local174.method669(local110, true, local123, local174.method944(), local87);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)V")
	public static void method3783() {
		if (Static129.anInt2880 != -1) {
			Static229.method3507(Static129.anInt2880, -1, -1, false);
			Static129.anInt2880 = -1;
		}
	}
}

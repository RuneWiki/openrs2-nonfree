import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "[Lclient!is;")
	public static Interface14[] anInterface14Array1;

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "I")
	public static int anInt6591 = 765;

	@OriginalMember(owner = "client!lia", name = "e", descriptor = "[F")
	public static final float[] aFloatArray56 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(ZLclient!ke;)V")
	public static void method5607(@OriginalArg(1) Class3_Sub1_Sub3_Sub3_Sub2 arg0) {
		@Pc(11) Class2_Sub21 local11 = (Class2_Sub21) Static458.aClass99_62.method3056((long) arg0.anInt6083);
		if (local11 == null) {
			Static5.method117(null, arg0.aByte132, arg0.anIntArray357[0], arg0.anIntArray358[0], arg0, null, 0);
		} else {
			local11.method4085();
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(I)V")
	public static void method5608() {
		@Pc(8) int local8 = Static85.aByteArrayArray5.length;
		for (@Pc(14) int local14 = 0; local14 < local8; local14++) {
			if (Static85.aByteArrayArray5[local14] != null) {
				@Pc(22) int local22 = -1;
				for (@Pc(24) int local24 = 0; local24 < Static224.anInt4981; local24++) {
					if (Static431.anIntArray533[local14] == Static118.anIntArray153[local24]) {
						local22 = local24;
						break;
					}
				}
				if (local22 == -1) {
					Static118.anIntArray153[Static224.anInt4981] = Static431.anIntArray533[local14];
					local22 = Static224.anInt4981++;
				}
				@Pc(68) Class2_Sub11 local68 = new Class2_Sub11(Static85.aByteArrayArray5[local14]);
				@Pc(70) int local70 = 0;
				while (Static85.aByteArrayArray5[local14].length > local68.anInt10066 && local70 < 511 && Static398.anInt7589 < 1023) {
					@Pc(91) int local91 = local22 | local70++ << 6;
					@Pc(95) int local95 = local68.method8326();
					@Pc(99) int local99 = local95 >> 14;
					@Pc(105) int local105 = local95 >> 7 & 0x3F;
					@Pc(109) int local109 = local95 & 0x3F;
					@Pc(122) int local122 = local105 + (Static431.anIntArray533[local14] >> 8) * 64 - Static84.anInt2565;
					@Pc(136) int local136 = (Static431.anIntArray533[local14] & 0xFF) * 64 + local109 - Static32.anInt723;
					@Pc(143) Class27 local143 = Static462.aClass355_2.method8744(local68.method8326());
					@Pc(150) Class2_Sub33 local150 = (Class2_Sub33) Static600.aClass99_79.method3056((long) local91);
					if (local150 == null && (local143.aByte10 & 0x1) > 0 && local99 == Static425.anInt8001 && local122 >= 0 && local122 + local143.anInt666 < Static47.anInt1794 && local136 >= 0 && local136 + local143.anInt666 < Static209.anInt4742) {
						@Pc(192) Class3_Sub1_Sub3_Sub3_Sub1 local192 = new Class3_Sub1_Sub3_Sub3_Sub1();
						local192.anInt6083 = local91;
						@Pc(200) Class2_Sub33 local200 = new Class2_Sub33(local192);
						Static600.aClass99_79.method3059((long) local91, local200);
						Static62.aClass2_Sub33Array1[Static474.anInt8881++] = local200;
						Static301.anIntArray367[Static398.anInt7589++] = local91;
						local192.anInt6095 = Static407.anInt7704;
						local192.method3406(local143);
						local192.method5212(local192.aClass27_1.anInt666);
						local192.anInt6097 = local192.aClass27_1.anInt627 << 3;
						local192.method5213((local192.aClass27_1.aByte14 + 4 & 0x9CE00007) << 11, true);
						local192.method3402(local136, true, local122, local192.method5214(), local99);
					}
				}
			}
		}
	}
}

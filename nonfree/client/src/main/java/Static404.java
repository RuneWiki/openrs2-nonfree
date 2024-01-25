import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!pea", name = "J", descriptor = "F")
	public static float aFloat142;

	@OriginalMember(owner = "client!pea", name = "L", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray31;

	@OriginalMember(owner = "client!pea", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString82 = null;

	@OriginalMember(owner = "client!pea", name = "M", descriptor = "[B")
	public static final byte[] aByteArray84 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "(B)V")
	public static void method5838() {
		if (Static330.aFloat102 < 1024.0F) {
			Static330.aFloat102 = 1024.0F;
		}
		while (Static477.aFloat164 >= 16384.0F) {
			Static477.aFloat164 -= 16384.0F;
		}
		if (Static330.aFloat102 > 3072.0F) {
			Static330.aFloat102 = 3072.0F;
		}
		while (Static477.aFloat164 < 0.0F) {
			Static477.aFloat164 += 16384.0F;
		}
		@Pc(41) int local41 = Static195.anInt4188 >> 9;
		@Pc(45) int local45 = Static303.anInt5529 >> 9;
		@Pc(56) int local56 = Static160.method3164(Static195.anInt4188, Static320.anInt5748, Static303.anInt5529);
		@Pc(58) int local58 = 0;
		@Pc(84) int local84;
		if (local41 > 3 && local45 > 3 && Static38.anInt740 - 4 > local41 && local45 < Static38.anInt741 - 4) {
			for (local84 = local41 - 4; local84 <= local41 + 4; local84++) {
				for (@Pc(90) int local90 = local45 - 4; local90 <= local45 + 4; local90++) {
					@Pc(94) int local94 = Static320.anInt5748;
					if (local94 < 3 && Static163.method3178(local90, local84)) {
						local94++;
					}
					@Pc(109) int local109 = 0;
					if (Static560.aClass85_Sub1_2.aByteArrayArrayArray10 != null && Static560.aClass85_Sub1_2.aByteArrayArrayArray10[local94] != null) {
						local109 = (Static560.aClass85_Sub1_2.aByteArrayArrayArray10[local94][local84][local90] & 0xFF) * 8;
					}
					if (Static112.aClass16Array3 != null && Static112.aClass16Array3[local94] != null) {
						@Pc(149) int local149 = local109 + local56 - Static112.aClass16Array3[local94].JA(local84, local90);
						if (local149 > local58) {
							local58 = local149;
						}
					}
				}
			}
		}
		local84 = (local58 >> 2) * 1536;
		if (local84 > 786432) {
			local84 = 786432;
		}
		if (local84 < 262144) {
			local84 = 262144;
		}
		if (local84 > Static31.anInt591) {
			Static31.anInt591 += (local84 - Static31.anInt591) / 24;
		} else if (local84 < Static31.anInt591) {
			Static31.anInt591 += (local84 - Static31.anInt591) / 80;
		}
	}

	@OriginalMember(owner = "client!pea", name = "e", descriptor = "(I)V")
	public static void method5839() {
		Static500.method7134();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ILclient!ag;I)Lclient!bo;")
	public static Class35 method5842(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub1 arg1) {
		@Pc(14) Class35 local14;
		if (Static419.aClass35_6 == null) {
			local14 = new Class35();
		} else {
			local14 = Static419.aClass35_6;
			Static419.aClass35_6 = Static419.aClass35_6.aClass35_1;
			local14.aClass35_1 = null;
			Static237.anInt7560--;
		}
		local14.aClass10_Sub1_1 = arg1;
		local14.anInt845 = arg0;
		return local14;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(III)Z")
	public static boolean method5843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}

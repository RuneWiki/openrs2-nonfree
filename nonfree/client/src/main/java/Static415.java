import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!uo", name = "Fb", descriptor = "F")
	public static float aFloat81;

	@OriginalMember(owner = "client!uo", name = "Cb", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_171 = new Class12(83, 8);

	@OriginalMember(owner = "client!uo", name = "Gb", descriptor = "I")
	public static int anInt6868 = 0;

	@OriginalMember(owner = "client!uo", name = "Ib", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_172 = new Class12(30, 12);

	@OriginalMember(owner = "client!uo", name = "Jb", descriptor = "Lclient!wq;")
	public static final Class269 aClass269_47 = new Class269(14, 15);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIJI)V")
	public static void method5399(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg1 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg1 >> 20 & 0x3;
		@Pc(29) int local29 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static360.method4834(true, local10, 0, arg2, local22, 0, 0, arg0);
			return;
		}
		@Pc(45) Class68 local45 = Static341.aClass75_4.method1616(local29);
		@Pc(56) int local56;
		@Pc(59) int local59;
		if (local22 == 0 || local22 == 2) {
			local56 = local45.anInt1810;
			local59 = local45.anInt1803;
		} else {
			local56 = local45.anInt1803;
			local59 = local45.anInt1810;
		}
		@Pc(70) int local70 = local45.anInt1811;
		if (local22 != 0) {
			local70 = (local70 << local22 & 0xF) + (local70 >> 4 - local22);
		}
		Static360.method4834(true, 0, local56, arg2, 0, local59, local70, arg0);
	}

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "(B)V")
	public static void method5402() {
		if (Static262.aFloat62 < 1024.0F) {
			Static262.aFloat62 = 1024.0F;
		}
		if (Static262.aFloat62 > 3072.0F) {
			Static262.aFloat62 = 3072.0F;
		}
		while (Static98.aFloat20 >= 16384.0F) {
			Static98.aFloat20 -= 16384.0F;
		}
		while (Static98.aFloat20 < 0.0F) {
			Static98.aFloat20 += 16384.0F;
		}
		@Pc(41) int local41 = Static140.anInt2485 >> 7;
		@Pc(45) int local45 = Static52.anInt896 >> 7;
		@Pc(58) int local58 = Static335.method4499(Static265.anInt4807, Static140.anInt2485, Static52.anInt896);
		@Pc(60) int local60 = 0;
		@Pc(92) int local92;
		if (local41 > 3 && local45 > 3 && local41 < Static296.anInt5187 - 4 && local45 < Static206.anInt3607 - 4) {
			for (local92 = local41 - 4; local92 <= local41 + 4; local92++) {
				for (@Pc(98) int local98 = local45 - 4; local98 <= local45 + 4; local98++) {
					@Pc(102) int local102 = Static265.anInt4807;
					if (local102 < 3 && Static183.method2654(local98, local92)) {
						local102++;
					}
					@Pc(115) int local115 = 0;
					if (Static369.aClass195_Sub1_2.aByteArrayArrayArray19 != null && Static369.aClass195_Sub1_2.aByteArrayArrayArray19[local102] != null) {
						local115 = (Static369.aClass195_Sub1_2.aByteArrayArrayArray19[local102][local92][local98] & 0xFF) * 8;
					}
					@Pc(148) int local148 = local58 + local115 - Static94.aClass157Array1[local102].ua(local92, local98);
					if (local60 < local148) {
						local60 = local148;
					}
				}
			}
		}
		local92 = (local60 >> 0) * 1536;
		if (local92 > 786432) {
			local92 = 786432;
		}
		if (local92 < 262144) {
			local92 = 262144;
		}
		if (Static330.anInt5626 < local92) {
			Static330.anInt5626 += (local92 - Static330.anInt5626) / 24;
		} else if (local92 < Static330.anInt5626) {
			Static330.anInt5626 += (local92 - Static330.anInt5626) / 80;
		}
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(Ljava/lang/String;I)J")
	public static long method5404(@OriginalArg(0) String arg0) {
		@Pc(12) long local12 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local12 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local12 += local27 - 64;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local12 += local27 + 1 - 97;
			} else if (local27 >= '0' && local27 <= '9') {
				local12 += local27 + 27 - 48;
			}
			if (local12 >= 177917621779460413L) {
				break;
			}
		}
		while (local12 % 37L == 0L && local12 != 0L) {
			local12 /= 37L;
		}
		return local12;
	}
}

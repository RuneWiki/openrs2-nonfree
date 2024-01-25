import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static653 {

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Lclient!ga;")
	public static Class124 aClass124_104;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method8578(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static384.method5636(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(45) int local45;
			do {
				local45 = arg1.nextInt();
			} while (local42 <= local45);
			return Static460.method6810(arg0, local45);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!kv;IIIII)Lclient!bo;")
	public static Class44_Sub1_Sub1 method8580(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean406 || Static384.method5636(arg4) && Static384.method5636(arg1)) {
			return new Class44_Sub1_Sub1(arg0, 3553, arg3, arg2, arg4, arg1, true);
		} else if (arg0.aBoolean424) {
			return new Class44_Sub1_Sub1(arg0, 34037, arg3, arg2, arg4, arg1, true);
		} else {
			return new Class44_Sub1_Sub1(arg0, arg3, arg2, arg4, arg1, Static209.method2991(arg4), Static209.method2991(arg1), true);
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)I")
	public static int method8581() {
		return Static596.anIntArray547 == null ? 0 : Static596.anIntArray547.length * 2;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method8582(@OriginalArg(0) Class143 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static305.aBoolean315) {
			local7 = Static304.method4150();
			local9 = Static563.method7702();
		}
		@Pc(23) int local23 = local7 + Static73.anInt1175;
		@Pc(27) int local27 = local9 + Static676.anInt9309;
		@Pc(29) int local29 = Static342.anInt6177;
		@Pc(33) int local33 = Static575.anInt9376 - 3;
		Static159.method2399(local9 + Static676.anInt9309, Static575.anInt9376, Static49.aClass42_24.method730(Static259.anInt4113), arg0, Static342.anInt6177, local7 + Static73.anInt1175);
		@Pc(58) int local58 = Static178.aClass111_1.method8703() + local7;
		@Pc(70) int local70 = Static178.aClass111_1.method8696() + local9;
		@Pc(74) int local74;
		@Pc(79) Class5_Sub2_Sub5 local79;
		@Pc(91) int local91;
		@Pc(195) int local195;
		@Pc(274) Class5_Sub2_Sub13 local274;
		@Pc(183) Class5_Sub2_Sub13 local183;
		if (Static530.aBoolean634) {
			local74 = 0;
			for (local79 = (Class5_Sub2_Sub5) Static600.aClass150_16.method3100(); local79 != null; local79 = (Class5_Sub2_Sub5) Static600.aClass150_16.method3096()) {
				local91 = local27 + local74 * 16 + 13 + 20;
				local74++;
				if (Static73.anInt1175 + local7 < local58 && local58 < Static73.anInt1175 + local7 + Static342.anInt6177 && local91 - 13 < local70 && local91 + 4 > local70 && (local79.anInt2821 > 1 || ((Class5_Sub2_Sub13) local79.aClass150_3.aClass5_Sub2_24.aClass5_Sub2_67).aBoolean479)) {
					arg0.aa(local7 + Static73.anInt1175, local91 + -12, Static342.anInt6177, 16, Static480.anInt4486 | 255 - Static161.anInt1358 << 24, 1);
				}
			}
			if (Static303.aClass5_Sub2_Sub5_1 != null) {
				Static159.method2399(Static212.anInt3404, Static360.anInt6296, Static303.aClass5_Sub2_Sub5_1.aString27, arg0, Static469.anInt8171, Static501.anInt8524);
				local74 = 0;
				for (local183 = (Class5_Sub2_Sub13) Static303.aClass5_Sub2_Sub5_1.aClass150_3.method3100(); local183 != null; local183 = (Class5_Sub2_Sub13) Static303.aClass5_Sub2_Sub5_1.aClass150_3.method3096()) {
					local195 = local74 * 16 + Static212.anInt3404 + 20 + 13;
					if (Static501.anInt8524 < local58 && local58 < Static469.anInt8171 + Static501.anInt8524 && local195 - 13 < local70 && local195 + 4 > local70 && local183.aBoolean479) {
						arg0.aa(Static501.anInt8524, local195 - 12, Static469.anInt8171, 16, Static480.anInt4486 | 255 - Static161.anInt1358 << 24, 1);
					}
					local74++;
				}
				Static236.method3375(arg0, Static212.anInt3404, Static360.anInt6296, Static501.anInt8524, Static469.anInt8171);
			}
		} else {
			local74 = 0;
			for (local274 = (Class5_Sub2_Sub13) Static153.aClass124_24.method2572(); local274 != null; local274 = (Class5_Sub2_Sub13) Static153.aClass124_24.method2569()) {
				local91 = (Static223.anInt3566 - local74 - 1) * 16 + local27 + 13 + 20;
				if (local58 > Static73.anInt1175 + local7 && local58 < Static73.anInt1175 + local7 + Static342.anInt6177 && local70 > local91 - 13 && local91 + 4 > local70 && local274.aBoolean479) {
					arg0.aa(Static73.anInt1175 + local7, local91 + -12, Static342.anInt6177, 16, 255 - Static161.anInt1358 << 24 | Static480.anInt4486, 1);
				}
				local74++;
			}
		}
		Static236.method3375(arg0, Static676.anInt9309 + local9, Static575.anInt9376, local7 + Static73.anInt1175, Static342.anInt6177);
		if (Static530.aBoolean634) {
			local74 = 0;
			for (local79 = (Class5_Sub2_Sub5) Static600.aClass150_16.method3100(); local79 != null; local79 = (Class5_Sub2_Sub5) Static600.aClass150_16.method3096()) {
				local91 = local74 * 16 + local9 + Static676.anInt9309 + 33;
				local74++;
				if (local79.anInt2821 == 1) {
					Static605.method8127(arg0, (Class5_Sub2_Sub13) local79.aClass150_3.aClass5_Sub2_24.aClass5_Sub2_67, Static73.anInt1175 + local7, local70, Static575.anInt9376, local91, Static229.anInt3713 | 0xFF000000, Static342.anInt6177, Static676.anInt9309 + local9, Static112.anInt1987 | 0xFF000000, local58);
				} else {
					Static105.method1744(local9 + Static676.anInt9309, local58, Static575.anInt9376, Static342.anInt6177, local91, local70, arg0, local7 + Static73.anInt1175, Static112.anInt1987 | 0xFF000000, local79, Static229.anInt3713 | 0xFF000000);
				}
			}
			if (Static303.aClass5_Sub2_Sub5_1 != null) {
				local74 = 0;
				for (local183 = (Class5_Sub2_Sub13) Static303.aClass5_Sub2_Sub5_1.aClass150_3.method3100(); local183 != null; local183 = (Class5_Sub2_Sub13) Static303.aClass5_Sub2_Sub5_1.aClass150_3.method3096()) {
					local195 = Static212.anInt3404 + local74 * 16 + 20 + 13;
					local74++;
					Static605.method8127(arg0, local183, Static501.anInt8524, local70, Static360.anInt6296, local195, Static229.anInt3713 | 0xFF000000, Static469.anInt8171, Static212.anInt3404, Static112.anInt1987 | 0xFF000000, local58);
				}
				Static391.method5695(Static360.anInt6296, Static501.anInt8524, Static212.anInt3404, Static469.anInt8171);
			}
		} else {
			local74 = 0;
			for (local274 = (Class5_Sub2_Sub13) Static153.aClass124_24.method2572(); local274 != null; local274 = (Class5_Sub2_Sub13) Static153.aClass124_24.method2569()) {
				local91 = (Static223.anInt3566 - local74 - 1) * 16 + local27 + 13 + 20;
				local74++;
				Static605.method8127(arg0, local274, local23, local70, local33, local91, Static229.anInt3713 | 0xFF000000, local29, local27, Static112.anInt1987 | 0xFF000000, local58);
			}
		}
		Static391.method5695(Static575.anInt9376, Static73.anInt1175 + local7, Static676.anInt9309 + local9, Static342.anInt6177);
	}
}

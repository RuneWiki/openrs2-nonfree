import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!g", name = "q", descriptor = "Lclient!daa;")
	public static Class58 aClass58_7;

	@OriginalMember(owner = "client!g", name = "L", descriptor = "[F")
	public static final float[] aFloatArray15 = new float[16];

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)I")
	public static int method2854() {
		if (Static265.aClass203_82 == null) {
			if (!Static255.aBoolean352 && Static151.anInt3123 > 0) {
				if (Static522.aBoolean641 && Static478.aClass127_1.method3276(81) && Static151.anInt3123 > 2) {
					return ((Class3_Sub44) Static187.aClass130_15.aClass3_121.aClass3_286.aClass3_286).anInt7682;
				}
				return ((Class3_Sub44) Static187.aClass130_15.aClass3_121.aClass3_286).anInt7682;
			}
			@Pc(21) int local21 = Static563.aClass156_1.method5689();
			@Pc(25) int local25 = Static563.aClass156_1.method5690();
			@Pc(27) int local27 = Static50.anInt1065;
			@Pc(29) int local29 = Static343.anInt6039;
			@Pc(31) int local31 = Static324.anInt5822;
			if (local21 > local27 && local21 < local31 + local27) {
				@Pc(41) int local41 = -1;
				@Pc(59) int local59;
				for (@Pc(43) int local43 = 0; local43 < Static151.anInt3123; local43++) {
					if (Static490.aBoolean625) {
						local59 = (Static151.anInt3123 - local43 - 1) * 16 + local29 + 33;
						if (local25 > local59 - 13 && local25 <= local59 + 3) {
							local41 = local43;
						}
					} else {
						local59 = (Static151.anInt3123 - local43 - 1) * 16 + local29 + 31;
						if (local59 - 13 < local25 && local59 + 3 >= local25) {
							local41 = local43;
						}
					}
				}
				if (local41 != -1) {
					local59 = 0;
					@Pc(121) Class179 local121 = new Class179(Static187.aClass130_15);
					for (@Pc(126) Class3_Sub44 local126 = (Class3_Sub44) local121.method4380(); local126 != null; local126 = (Class3_Sub44) local121.method4382()) {
						if (local41 == local59++) {
							return local126.anInt7682;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Z")
	public static boolean method2855(@OriginalArg(1) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIILclient!lk;Z)V")
	public static void method2856(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class203 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(16) int local16 = arg2.anInt5513;
		if (arg2.aByte65 == 0) {
			arg2.anInt5513 = arg2.anInt5480;
		} else if (arg2.aByte65 == 1) {
			arg2.anInt5513 = arg0 - arg2.anInt5480;
		} else if (arg2.aByte65 == 2) {
			arg2.anInt5513 = arg2.anInt5480 * arg0 >> 14;
		}
		@Pc(55) int local55 = arg2.anInt5476;
		if (arg2.aByte64 == 0) {
			arg2.anInt5476 = arg2.anInt5442;
		} else if (arg2.aByte64 == 1) {
			arg2.anInt5476 = arg1 - arg2.anInt5442;
		} else if (arg2.aByte64 == 2) {
			arg2.anInt5476 = arg2.anInt5442 * arg1 >> 14;
		}
		if (arg2.aByte65 == 4) {
			arg2.anInt5513 = arg2.anInt5528 * arg2.anInt5476 / arg2.anInt5462;
		}
		if (arg2.aByte64 == 4) {
			arg2.anInt5476 = arg2.anInt5462 * arg2.anInt5513 / arg2.anInt5528;
		}
		if (Static393.aBoolean543 && (Static69.method1651(arg2).anInt730 != 0 || arg2.anInt5473 == 0)) {
			if (arg2.anInt5476 < 5 && arg2.anInt5513 < 5) {
				arg2.anInt5476 = 5;
				arg2.anInt5513 = 5;
			} else {
				if (arg2.anInt5476 <= 0) {
					arg2.anInt5476 = 5;
				}
				if (arg2.anInt5513 <= 0) {
					arg2.anInt5513 = 5;
				}
			}
		}
		if (arg2.anInt5510 == Static519.anInt8233) {
			Static222.aClass203_153 = arg2;
		}
		if (arg3 && arg2.anObjectArray26 != null && (arg2.anInt5513 != local16 || local55 != arg2.anInt5476)) {
			@Pc(199) Class3_Sub45 local199 = new Class3_Sub45();
			local199.anObjectArray33 = arg2.anObjectArray26;
			local199.aClass203_136 = arg2;
			Static146.aClass130_12.method3548(local199);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IC)C")
	public static char method2858(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}

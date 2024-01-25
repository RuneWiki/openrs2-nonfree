import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "Lclient!rc;")
	public static Class205 aClass205_20;

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
	public static int anInt782 = 0;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)Z")
	public static boolean method674(@OriginalArg(1) int arg0) {
		if (arg0 == 58 || arg0 == 23 || arg0 == 57 || arg0 == 45 || arg0 == 4) {
			return true;
		} else {
			return arg0 == 25 || arg0 == 1007;
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
	public static void method675() {
		@Pc(7) Class25 local7 = null;
		try {
			@Pc(11) Class182 local11 = Static359.aClass111_5.method2799();
			while (local11.anInt4498 == 0) {
				Static358.method2028(1L);
			}
			if (local11.anInt4498 == 1) {
				local7 = (Class25) local11.anObject6;
				@Pc(40) Class2_Sub16 local40 = new Class2_Sub16(Static308.anInt5180 * 6 + 3);
				local40.method5358(1);
				local40.method5351(Static308.anInt5180);
				for (@Pc(50) int local50 = 0; local50 < Static330.anIntArray1157.length; local50++) {
					if (Static88.aBooleanArray13[local50]) {
						local40.method5351(local50);
						local40.method5355(Static330.anIntArray1157[local50]);
					}
				}
				local7.method589(local40.aByteArray112, local40.anInt6145, 0);
			}
		} catch (@Pc(81) Exception local81) {
		}
		try {
			if (local7 != null) {
				local7.method594();
			}
		} catch (@Pc(88) Exception local88) {
		}
		Static69.aLong51 = Static39.method699();
		Static10.aBoolean423 = false;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method676(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!up;IIII)V")
	public static void method677(@OriginalArg(0) Class152 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static117.method2424(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static12.anInt312) {
			Static117.method2424(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static117.method2424(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static341.anInt5833) {
			Static117.method2424(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static341.anInt5833) {
			Static117.method2424(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static12.anInt312 && arg4 <= Static341.anInt5833) {
			Static117.method2424(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static117.method2424(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static12.anInt312 && arg4 > 0) {
			Static117.method2424(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)I")
	public static int method679() {
		return 6;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIII)V")
	public static void method680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(1) int local1 = arg3; local1 <= arg1; local1++) {
			Static315.method4662(arg0, Static15.anIntArrayArray1[local1], arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ICI)I")
	public static int method681(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!cu", name = "s", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_19 = new Class316(0, 0);

	@OriginalMember(owner = "client!cu", name = "y", descriptor = "I")
	public static int anInt1400 = 0;

	@OriginalMember(owner = "client!cu", name = "z", descriptor = "[S")
	public static final short[] aShortArray12 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIII)V")
	public static void method1160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 > Static52.anInt1226 || arg0 < Static133.anInt2531) {
			return;
		}
		@Pc(20) boolean local20;
		if (Static529.anInt9806 > arg2) {
			local20 = false;
			arg2 = Static529.anInt9806;
		} else if (arg2 > Static205.anInt3906) {
			local20 = false;
			arg2 = Static205.anInt3906;
		} else {
			local20 = true;
		}
		@Pc(50) boolean local50;
		if (arg1 < Static529.anInt9806) {
			arg1 = Static529.anInt9806;
			local50 = false;
		} else if (arg1 <= Static205.anInt3906) {
			local50 = true;
		} else {
			arg1 = Static205.anInt3906;
			local50 = false;
		}
		if (arg4 < Static133.anInt2531) {
			arg4 = Static133.anInt2531;
		} else {
			Static264.method4006(arg1, arg3, arg2, Static155.anIntArrayArray32[arg4++]);
		}
		if (Static52.anInt1226 >= arg0) {
			Static264.method4006(arg1, arg3, arg2, Static155.anIntArrayArray32[arg0--]);
		} else {
			arg0 = Static52.anInt1226;
		}
		@Pc(109) int local109;
		if (local20 && local50) {
			for (local109 = arg4; local109 <= arg0; local109++) {
				@Pc(115) int[] local115 = Static155.anIntArrayArray32[local109];
				local115[arg2] = local115[arg1] = arg3;
			}
		} else if (local20) {
			for (local109 = arg4; local109 <= arg0; local109++) {
				Static155.anIntArrayArray32[local109][arg2] = arg3;
			}
		} else if (local50) {
			for (local109 = arg4; local109 <= arg0; local109++) {
				Static155.anIntArrayArray32[local109][arg1] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method1161(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static264.method4007(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static264.method4007(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(56) int local56 = local14 - local11;
		if (local56 < 1 || local56 > 12) {
			return null;
		}
		@Pc(73) StringBuffer local73 = new StringBuffer(local56);
		for (@Pc(75) int local75 = local11; local75 < local14; local75++) {
			@Pc(81) char local81 = arg0.charAt(local75);
			if (Static361.method5374(local81)) {
				@Pc(89) char local89 = Static577.method7888(local81);
				if (local89 != '\u0000') {
					local73.append(local89);
				}
			}
		}
		if (local73.length() == 0) {
			return null;
		} else {
			return local73.toString();
		}
	}
}

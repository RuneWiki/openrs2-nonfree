import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!mj;)Ljava/lang/String;")
	public static String method1151(@OriginalArg(1) Class238 arg0) {
		if (Static73.method1209(arg0).method1972() == 0) {
			return null;
		} else if (arg0.aString68 == null || arg0.aString68.trim().length() == 0) {
			return Static628.aBoolean710 ? "Hidden-use" : null;
		} else {
			return arg0.aString68;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!wq;I)Lclient!gia;")
	public static Class132_Sub1 method1152(@OriginalArg(0) Class5_Sub36 arg0) {
		@Pc(12) Class132 local12 = Static145.method2733(arg0);
		@Pc(16) int local16 = arg0.method7333();
		@Pc(20) int local20 = arg0.method7333();
		@Pc(24) int local24 = arg0.method7333();
		@Pc(28) int local28 = arg0.method7333();
		@Pc(32) int local32 = arg0.method7333();
		@Pc(36) int local36 = arg0.method7333();
		return new Class132_Sub1(local12.aClass189_13, local12.aClass346_14, local12.anInt10380, local12.anInt10382, local12.anInt10377, local12.anInt10374, local12.anInt10373, local12.anInt10383, local12.anInt10378, local16, local20, local24, local28, local32, local36);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!ns;[II)V")
	public static void method1153(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub1_Sub2_Sub2 arg1, @OriginalArg(2) int[] arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg1.anIntArray403 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg1.anIntArray403.length; local12++) {
				if (arg1.anIntArray403[local12] != arg2[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg1.anInt6872 != -1) {
				@Pc(59) Class264 local59 = Static315.aClass14_1.method227(arg1.anInt6872);
				@Pc(62) int local62 = local59.anInt7047;
				if (local62 == 1) {
					arg1.anInt6844 = 0;
					arg1.anInt6839 = 0;
					arg1.anInt6869 = 0;
					arg1.anInt6836 = 1;
					arg1.anInt6886 = arg0;
					if (!arg1.aBoolean455) {
						Static628.method8566(local59, arg1.anInt6839, arg1);
					}
				}
				if (local62 == 2) {
					arg1.anInt6844 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg2.length; local12++) {
			if (arg2[local12] != -1) {
				local10 = false;
			}
			if (arg1.anIntArray403 == null || arg1.anIntArray403[local12] == -1 || Static315.aClass14_1.method227(arg2[local12]).anInt7043 >= Static315.aClass14_1.method227(arg1.anIntArray403[local12]).anInt7043) {
				arg1.anInt6886 = arg0;
				arg1.anInt6897 = arg1.anInt6895;
				arg1.anIntArray403 = arg2;
			}
		}
		if (local10) {
			arg1.anIntArray403 = arg2;
			arg1.anInt6886 = arg0;
			arg1.anInt6897 = arg1.anInt6895;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIII)I")
	public static int method1154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13 = arg3 & 0xF;
		@Pc(21) int local21 = local13 >= 8 ? arg1 : arg0;
		@Pc(45) int local45 = local13 >= 4 ? (local13 == 12 || local13 == 14 ? arg0 : arg2) : arg1;
		return ((local13 & 0x2) == 0 ? local45 : -local45) + ((local13 & 0x1) == 0 ? local21 : -local21);
	}
}

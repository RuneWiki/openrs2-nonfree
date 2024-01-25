import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!gm", name = "M", descriptor = "I")
	public static int anInt1943;

	@OriginalMember(owner = "client!gm", name = "Q", descriptor = "I")
	public static int anInt1947;

	@OriginalMember(owner = "client!gm", name = "G", descriptor = "[I")
	public static final int[] anIntArray264 = new int[1000];

	@OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
	public static int anInt1941 = 0;

	@OriginalMember(owner = "client!gm", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString73 = "";

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "(B)V")
	public static void method2132() {
		if (Static122.aBoolean191) {
			return;
		}
		if (Static317.aBoolean395) {
			Static163.aFloat69 = (int) Static163.aFloat69 + 47 & 0xFFFFFFF0;
		} else {
			Static128.aFloat62 += (12.0F - Static128.aFloat62) / 2.0F;
		}
		Static211.aBoolean291 = true;
		Static122.aBoolean191 = true;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IZ)V")
	public static void method2133(@OriginalArg(1) boolean arg0) {
		Static24.method359();
		if (Static129.anInt2374 != 30 && Static129.anInt2374 != 25) {
			return;
		}
		Static217.anInt4022++;
		if (Static217.anInt4022 < 50 && !arg0) {
			return;
		}
		Static217.anInt4022 = 0;
		if (!Static227.aBoolean299 && Static216.aClass11_5 != null) {
			Static131.aClass6_Sub10_Sub1_2.method2886(104);
			try {
				Static216.aClass11_5.method158(Static131.aClass6_Sub10_Sub1_2.aByteArray67, Static131.aClass6_Sub10_Sub1_2.anInt4188);
				Static131.aClass6_Sub10_Sub1_2.anInt4188 = 0;
			} catch (@Pc(51) IOException local51) {
				Static227.aBoolean299 = true;
			}
		}
		Static24.method359();
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BZLjava/lang/String;)V")
	public static void method2134(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		Static110.aClass53_57.anInt1133 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < Static269.anInt5047; local26++) {
			@Pc(32) Class147 local32 = Static211.method3762(local26);
			if ((!arg0 || local32.aBoolean295) && local32.anInt3940 == -1 && local32.anInt3999 == -1 && local32.anInt3972 == 0 && local32.aString170.toLowerCase().indexOf(local11) != -1) {
				if (local24 >= 250) {
					Static322.anInt5280 = -1;
					Static283.aShortArray108 = null;
					return;
				}
				if (local14.length <= local24) {
					@Pc(82) short[] local82 = new short[local14.length * 2];
					for (@Pc(84) int local84 = 0; local84 < local24; local84++) {
						local82[local84] = local14[local84];
					}
					local14 = local82;
				}
				local14[local24++] = (short) local26;
			}
		}
		Static283.aShortArray108 = local14;
		Static322.anInt5280 = local24;
		Static72.anInt1350 = 0;
		@Pc(121) String[] local121 = new String[Static322.anInt5280];
		for (@Pc(123) int local123 = 0; local123 < Static322.anInt5280; local123++) {
			local121[local123] = Static211.method3762(local14[local123]).aString170;
		}
		Static103.method2108(local121, Static283.aShortArray108);
		Static110.aClass53_57.method1021();
		Static110.aClass53_57.anInt1133 = 2;
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(III)Lclient!im;")
	public static Class44_Sub1 method2135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class187 local7 = Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass44_Sub1_1;
	}
}

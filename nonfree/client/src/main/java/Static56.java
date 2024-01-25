import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "Lclient!lda;")
	public static final Class225 aClass225_2 = new Class225(1, 2, 2, 0);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method717(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(13) String local13 = Static282.method4264(arg0);
		if (local13 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < Static22.anInt373; local31++) {
			@Pc(37) String local37 = Static432.aStringArray29[local31];
			@Pc(41) String local41 = Static282.method4264(local37);
			if (Static593.method8157(local13, arg0, local41, local37)) {
				Static22.anInt373--;
				for (@Pc(54) int local54 = local31; local54 < Static22.anInt373; local54++) {
					Static432.aStringArray29[local54] = Static432.aStringArray29[local54 + 1];
					Static604.aStringArray38[local54] = Static604.aStringArray38[local54 + 1];
					Static161.anIntArray145[local54] = Static161.anIntArray145[local54 + 1];
					Static359.aStringArray24[local54] = Static359.aStringArray24[local54 + 1];
					Static381.anIntArray371[local54] = Static381.anIntArray371[local54 + 1];
					Static679.aBooleanArray30[local54] = Static679.aBooleanArray30[local54 + 1];
					Static600.aBooleanArray28[local54] = Static600.aBooleanArray28[local54 + 1];
				}
				Static455.anInt8019 = Static210.anInt3647;
				@Pc(127) Class400 local127 = Static81.method1057();
				@Pc(133) Class3_Sub48 local133 = Static89.method1200(Static499.aClass286_84, local127.aClass399_2);
				local133.aClass3_Sub28_Sub2_1.method5329(Static605.method8305(arg0));
				local133.aClass3_Sub28_Sub2_1.method5283(arg0);
				local127.method9223(local133);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)Z")
	public static boolean method718(@OriginalArg(1) int arg0) {
		return arg0 == 11 || arg0 == 12 || arg0 == 13;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I[Lclient!av;IZIB)V")
	public static void method719(@OriginalArg(0) int arg0, @OriginalArg(1) Class20[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		for (@Pc(15) int local15 = 0; local15 < arg1.length; local15++) {
			@Pc(21) Class20 local21 = arg1[local15];
			if (local21 != null && local21.anInt556 == arg2) {
				Static127.method2133(arg3, local21, arg0, arg4);
				Static231.method3630(arg4, local21, arg0);
				if (local21.anInt537 > local21.anInt580 - local21.anInt509) {
					local21.anInt537 = local21.anInt580 - local21.anInt509;
				}
				if (local21.anInt571 - local21.anInt569 < local21.anInt554) {
					local21.anInt554 = local21.anInt571 - local21.anInt569;
				}
				if (local21.anInt537 < 0) {
					local21.anInt537 = 0;
				}
				if (local21.anInt554 < 0) {
					local21.anInt554 = 0;
				}
				if (local21.anInt532 == 0) {
					Static97.method1292(arg3, local21);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method721(@OriginalArg(0) String arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static318.aStringArray19.length; local15++) {
			if (Static318.aStringArray19[local15].equalsIgnoreCase(arg0)) {
				return local15;
			}
		}
		return -1;
	}
}

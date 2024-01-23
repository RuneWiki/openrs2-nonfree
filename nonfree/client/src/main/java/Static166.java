import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!m", name = "F", descriptor = "Lclient!nk;")
	public static Class121 aClass121_80;

	@OriginalMember(owner = "client!m", name = "I", descriptor = "I")
	public static int anInt3285;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
	public static void method2833() {
		Static36.aClass187_22.method4525();
		Static306.aClass187_153.method4525();
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(II)I")
	public static int method2834(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!m", name = "f", descriptor = "(I)V")
	public static void method2835() {
		Static11.aClass187_7.method4530();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2836(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) byte local13 = 2;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(34) char local34 = arg0.charAt(local15);
			if (local13 == 0) {
				local34 = Character.toLowerCase(local34);
			} else if (local13 == 2 || Character.isUpperCase(local34)) {
				local34 = Static220.method3444(local34);
			}
			if (Character.isLetter(local34)) {
				local13 = 0;
			} else if (local34 == '.' || local34 == '?' || local34 == '!') {
				local13 = 2;
			} else if (!Character.isSpaceChar(local34)) {
				local13 = 1;
			} else if (local13 != 2) {
				local13 = 1;
			}
			local11[local15] = local34;
		}
		return new String(local11);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)V")
	public static void method2839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub33 local7 = Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class52 local13 = local7.aClass52_1;
		if (local13 != null) {
			local13.anInt1638 = local13.anInt1638 * arg3 / 16;
			local13.anInt1646 = local13.anInt1646 * arg3 / 16;
		}
	}
}

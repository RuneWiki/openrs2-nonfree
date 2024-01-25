import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
	public static int anInt8659;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "[Lclient!ht;")
	public static Class9_Sub2_Sub1[] aClass9_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "Lclient!st;")
	public static final Class314 aClass314_126 = new Class314(74, -1);

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "[[B")
	public static final byte[][] aByteArrayArray24 = new byte[50][];

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Z")
	public static boolean method7469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BILclient!rea;I)V")
	public static void method7470(@OriginalArg(1) int arg0, @OriginalArg(2) Class291 arg1, @OriginalArg(3) int arg2) {
		Static133.aClass291ArrayArray30[arg2][arg0] = arg1;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
	public static int method7471(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local11 > local15 - local19) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(68) char local68;
			if (local17 == '\u0000') {
				local68 = arg1.charAt(local13++);
			} else {
				local68 = local17;
			}
			@Pc(84) char local84;
			if (local19 == '\u0000') {
				local84 = arg2.charAt(local15++);
			} else {
				local84 = local19;
			}
			local17 = Static642.method8636(local68);
			local19 = Static642.method8636(local84);
			local68 = Static629.method8519(arg0, local68);
			local84 = Static629.method8519(arg0, local84);
			if (local84 != local68 && Character.toUpperCase(local68) != Character.toUpperCase(local84)) {
				local68 = Character.toLowerCase(local68);
				local84 = Character.toLowerCase(local84);
				if (local84 != local68) {
					return Static100.method2421(arg0, local68) - Static100.method2421(arg0, local84);
				}
			}
		}
		@Pc(141) int local141 = Math.min(local8, local11);
		for (@Pc(143) int local143 = 0; local143 < local141; local143++) {
			if (arg0 == 2) {
				local15 = local11 - local143 - 1;
				local13 = local8 - local143 - 1;
			} else {
				local15 = local143;
				local13 = local143;
			}
			@Pc(171) char local171 = arg1.charAt(local13);
			@Pc(175) char local175 = arg2.charAt(local15);
			if (local175 != local171 && Character.toUpperCase(local171) != Character.toUpperCase(local175)) {
				local171 = Character.toLowerCase(local171);
				local175 = Character.toLowerCase(local175);
				if (local175 != local171) {
					return Static100.method2421(arg0, local171) - Static100.method2421(arg0, local175);
				}
			}
		}
		@Pc(219) int local219 = local8 - local11;
		if (local219 != 0) {
			return local219;
		}
		for (@Pc(228) int local228 = 0; local228 < local141; local228++) {
			@Pc(234) char local234 = arg1.charAt(local228);
			@Pc(238) char local238 = arg2.charAt(local228);
			if (local238 != local234) {
				return Static100.method2421(arg0, local234) - Static100.method2421(arg0, local238);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BILclient!uv;)I")
	public static int method7472(@OriginalArg(1) int arg0, @OriginalArg(2) Class344 arg1) {
		if (!Static76.method1311(arg1).method8091(arg0) && arg1.anObjectArray23 == null) {
			return -1;
		} else if (arg1.anIntArray605 == null || arg1.anIntArray605.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray605[arg0];
		}
	}
}

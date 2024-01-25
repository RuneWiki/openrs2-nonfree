import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!nv", name = "pc", descriptor = "I")
	public static int anInt7229;

	@OriginalMember(owner = "client!nv", name = "ve", descriptor = "[Z")
	public static boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!nv", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString72 = "";

	@OriginalMember(owner = "client!nv", name = "Bc", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_70 = new Class257(0, 18);

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5954(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(36) StringBuffer local36 = new StringBuffer(local8 + local10);
		for (@Pc(43) int local43 = 0; local43 < local8; local43++) {
			@Pc(49) char local49 = arg0.charAt(local43);
			if (local49 == '<') {
				local36.append("<lt>");
			} else if (local49 == '>') {
				local36.append("<gt>");
			} else {
				local36.append(local49);
			}
		}
		return local36.toString();
	}

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "(B)I")
	public static int method5981() {
		@Pc(13) Class236 local13 = Static438.aClass236_75;
		synchronized (Static438.aClass236_75) {
			return Static438.aClass236_75.method6247();
		}
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(BI)Lclient!vga;")
	public static Class8_Sub5_Sub20 method5983(@OriginalArg(1) int arg0) {
		@Pc(15) Class8_Sub5_Sub20 local15 = (Class8_Sub5_Sub20) Static8.aClass159_1.method4551((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static112.aClass237_30.method6314(arg0, 0);
		if (local25 == null || local25.length <= 1) {
			return null;
		}
		try {
			local15 = Static43.method1350(local25);
		} catch (@Pc(41) Exception local41) {
			throw new RuntimeException(local41.getMessage() + " S: " + arg0);
		}
		Static8.aClass159_1.method4549((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BFFF)I")
	public static int method5985(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(35) float local35 = arg2 < 0.0F ? -arg2 : arg2;
		if (local26 > local17 && local35 < local26) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local17 < local35 && local35 > local26) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BIZI)Ljava/lang/String;")
	public static String method6003(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		@Pc(38) int local38 = arg0 / 10;
		while (local38 != 0) {
			local38 /= 10;
			local34++;
		}
		@Pc(53) char[] local53 = new char[local34];
		local53[0] = '+';
		for (@Pc(61) int local61 = local34 - 1; local61 > 0; local61--) {
			@Pc(74) int local74 = arg0;
			arg0 /= 10;
			@Pc(85) int local85 = local74 - arg0 * 10;
			if (local85 >= 10) {
				local53[local61] = (char) (local85 + 87);
			} else {
				local53[local61] = (char) (local85 + 48);
			}
		}
		return new String(local53);
	}
}

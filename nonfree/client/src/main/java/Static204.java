import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
	public static int anInt3384;

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "[Lclient!tt;")
	public static Class219_Sub1[] aClass219_Sub1Array2;

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_68 = new Class265(92, -1);

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
	public static int method2768(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(18) char local18 = 0;
		@Pc(20) char local20 = 0;
		while (local13 - local18 < local8 || local11 > local15 - local20) {
			if (local13 - local18 >= local8) {
				return -1;
			}
			if (local11 <= local15 - local20) {
				return 1;
			}
			@Pc(65) char local65;
			if (local18 == '\u0000') {
				local65 = arg0.charAt(local13++);
			} else {
				local65 = local18;
			}
			@Pc(78) char local78;
			if (local20 == '\u0000') {
				local78 = arg2.charAt(local15++);
			} else {
				local78 = local20;
			}
			local18 = Static121.method2119(local65);
			local20 = Static121.method2119(local78);
			local65 = Static292.method4202(arg1, local65);
			local78 = Static292.method4202(arg1, local78);
			if (local78 != local65 && Character.toUpperCase(local65) != Character.toUpperCase(local78)) {
				local65 = Character.toLowerCase(local65);
				local78 = Character.toLowerCase(local78);
				if (local65 != local78) {
					return Static260.method3924(arg1, local65) - Static260.method3924(arg1, local78);
				}
			}
		}
		@Pc(141) int local141 = Math.min(local8, local11);
		for (@Pc(143) int local143 = 0; local143 < local141; local143++) {
			if (arg1 == 2) {
				local15 = local11 - local143 - 1;
				local13 = local8 - local143 - 1;
			} else {
				local15 = local143;
				local13 = local143;
			}
			@Pc(173) char local173 = arg0.charAt(local13);
			@Pc(177) char local177 = arg2.charAt(local15);
			if (local177 != local173 && Character.toUpperCase(local173) != Character.toUpperCase(local177)) {
				local173 = Character.toLowerCase(local173);
				local177 = Character.toLowerCase(local177);
				if (local173 != local177) {
					return Static260.method3924(arg1, local173) - Static260.method3924(arg1, local177);
				}
			}
		}
		@Pc(222) int local222 = local8 - local11;
		if (local222 != 0) {
			return local222;
		}
		for (@Pc(231) int local231 = 0; local231 < local141; local231++) {
			@Pc(237) char local237 = arg0.charAt(local231);
			@Pc(241) char local241 = arg2.charAt(local231);
			if (local241 != local237) {
				return Static260.method3924(arg1, local237) - Static260.method3924(arg1, local241);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "()V")
	public static void method2770() {
		Static2.method70(Static254.anInt4782);
	}
}

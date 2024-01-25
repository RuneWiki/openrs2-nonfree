import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "Lclient!da;")
	public static Class62 aClass62_4;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZI[B)V")
	public static void method3215(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static361.aClass3_Sub3_4 == null) {
			Static361.aClass3_Sub3_4 = new Class3_Sub3(20000);
		}
		Static361.aClass3_Sub3_4.method4237(0, arg1, arg1.length);
		if (!arg0) {
			return;
		}
		Static65.method1668(Static361.aClass3_Sub3_4.aByteArray54);
		Static528.aClass96_Sub1Array2 = new Class96_Sub1[Static262.anInt4804];
		@Pc(36) int local36 = 0;
		for (@Pc(38) int local38 = Static42.anInt1273; local38 <= Static77.anInt1908; local38++) {
			@Pc(44) Class96_Sub1 local44 = Static626.method8630(local38);
			if (local44 != null) {
				Static528.aClass96_Sub1Array2[local36++] = local44;
			}
		}
		Static239.aBoolean300 = false;
		Static206.aLong110 = Static374.method6036();
		Static361.aClass3_Sub3_4 = null;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILjava/lang/String;ZB)I")
	public static int method3216(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg1.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg1.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(73) int local73;
			if (local46 >= '0' && local46 <= '9') {
				local73 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local73 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local73 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local73) {
				throw new NumberFormatException();
			}
			if (local26) {
				local73 = -local73;
			}
			@Pc(124) int local124 = arg0 * local35 + local73;
			if (local124 / arg0 != local35) {
				throw new NumberFormatException();
			}
			local33 = true;
			local35 = local124;
		}
		if (!local33) {
			throw new NumberFormatException();
		}
		return local35;
	}
}

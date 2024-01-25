import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "[Lclient!pea;")
	public static final Class3_Sub7_Sub15[] aClass3_Sub7_Sub15Array7 = new Class3_Sub7_Sub15[14];

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILclient!ri;IIIZ)V")
	public static void method5601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2) {
		Static38.aBoolean94 = false;
		Static508.anInt8798 = arg0;
		Static426.anInt7533 = 2;
		Static530.anInt9247 = 0;
		Static533.aClass3_Sub16_Sub3_3 = null;
		Static530.anInt9251 = 1;
		Static213.anInt4459 = arg1;
		Static130.aClass284_126 = arg2;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method5602(@OriginalArg(0) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local12; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '%' && local12 > local19 + 2) {
				local25 = arg0.charAt(local19 + 1);
				@Pc(70) int local70;
				if (local25 >= '0' && local25 <= '9') {
					local70 = local25 - '0';
				} else if (local25 >= 'a' && local25 <= 'f') {
					local70 = local25 + '\n' - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local70 = local25 + 10 - 65;
				}
				local25 = arg0.charAt(local19 + 2);
				local70 *= 16;
				if (local25 >= '0' && local25 <= '9') {
					local70 += local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local70 += local25 + 10 - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local70 += local25 + 10 - 65;
				}
				if (local70 != 0 && Static313.method4673((byte) local70)) {
					local9.append(Static135.method2636((byte) local70));
				}
				local19 += 2;
			} else if (local25 == '+') {
				local9.append(' ');
			} else {
				local9.append(local25);
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIZLclient!r;)Lclient!la;")
	public static Class63 method5604(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class31 arg2) {
		@Pc(14) Class346 local14 = Static510.method6871(arg2, arg1, arg0);
		return local14 == null ? null : local14.aClass63_12;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!ac;B)Z")
	public static boolean method5605(@OriginalArg(0) Class5 arg0) {
		return Static205.aClass5_6 == arg0 || arg0 == Static28.aClass5_1 || Static587.aClass5_5 == arg0 || Static431.aClass5_8 == arg0;
	}
}

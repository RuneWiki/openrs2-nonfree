import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
	public static int anInt8592;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method7409(@OriginalArg(1) String arg0) {
		@Pc(20) StringBuffer local20 = new StringBuffer();
		@Pc(23) int local23 = arg0.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) char local31 = arg0.charAt(local25);
			if (local31 == '%' && local25 + 2 < local23) {
				local31 = arg0.charAt(local25 + 1);
				@Pc(61) int local61;
				if (local31 >= '0' && local31 <= '9') {
					local61 = local31 - 48;
				} else if (local31 >= 'a' && local31 <= 'f') {
					local61 = local31 + 10 - 97;
				} else {
					if (local31 < 'A' || local31 > 'F') {
						local20.append('%');
						continue;
					}
					local61 = local31 + 10 - 'A';
				}
				local31 = arg0.charAt(local25 + 2);
				local61 *= 16;
				if (local31 >= '0' && local31 <= '9') {
					local61 += local31 - 48;
				} else if (local31 >= 'a' && local31 <= 'f') {
					local61 += local31 + '\n' - 97;
				} else {
					if (local31 < 'A' || local31 > 'F') {
						local20.append('%');
						continue;
					}
					local61 += local31 + 10 - 65;
				}
				if (local61 != 0 && Static475.method7470((byte) local61)) {
					local20.append(Static382.method8494((byte) local61));
				}
				local25 += 2;
			} else if (local31 == '+') {
				local20.append(' ');
			} else {
				local20.append(local31);
			}
		}
		return local20.toString();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILclient!wu;IZJ)V")
	public static void method7410(@OriginalArg(1) int arg0, @OriginalArg(3) Class384 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) long arg3) {
		Static77.method1241(arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(B)V")
	public static void method7411() {
		if (Static627.aClass5_Sub46_31.aClass11_Sub10_1.method2643() == 0 && Static315.anInt5514 != Static299.anInt4751) {
			Static349.method5303(Static261.anInt4343, false, 11, Static237.anInt4007);
		} else {
			Static123.method1867(Static485.aClass126_17);
			if (Static299.anInt4751 != Static22.anInt464) {
				Static283.method4242();
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZ)I")
	public static int method7412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 >>> 24;
		@Pc(32) int local32 = (local14 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local14 & 0xFF0000) >>> 8;
		@Pc(37) int local37 = 255 - local14;
		return local32 + (((arg0 & 0xFF00) * local37 & 0xFF0000 | local37 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8);
	}
}

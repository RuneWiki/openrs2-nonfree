import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas11;

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "Lclient!hd;")
	public static final Class136 aClass136_8 = new Class136();

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
	public static int anInt8146 = 2;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method6915(@OriginalArg(1) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local12; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '%' && local19 + 2 < local12) {
				local25 = arg0.charAt(local19 + 1);
				@Pc(97) int local97;
				if (local25 >= '0' && local25 <= '9') {
					local97 = local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local97 = local25 - 87;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local97 = local25 + 10 - 65;
				}
				local97 *= 16;
				local25 = arg0.charAt(local19 + 2);
				if (local25 >= '0' && local25 <= '9') {
					local97 += local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local97 += local25 - 87;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local97 += local25 + 10 - 65;
				}
				if (local97 != 0 && Static232.method3187((byte) local97)) {
					local9.append(Static212.method2950((byte) local97));
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

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIB)I")
	public static int method6917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static314.aClass76Array2 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg0 >> 9;
		@Pc(15) int local15 = arg2 >> 9;
		if (local11 < 0 || local15 < 0 || local11 > Static228.anInt3704 - 1 || local15 > Static162.anInt2911 - 1) {
			return 0;
		}
		@Pc(37) int local37 = arg1;
		if (arg1 < 3 && (Static27.aByteArrayArrayArray1[1][local11][local15] & 0x2) != 0) {
			local37 = arg1 + 1;
		}
		return Static314.aClass76Array2[local37].method7398(arg0, arg2);
	}
}

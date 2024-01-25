import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(B)V")
	public static void method7850() {
		if (Static433.anInt8266 == 0) {
			return;
		}
		try {
			if (++Static40.anInt933 > 2000) {
				if (Static559.aClass269_1 != null) {
					Static559.aClass269_1.method6697();
					Static559.aClass269_1 = null;
				}
				if (Static219.anInt4163 >= 2) {
					Static433.anInt8266 = 0;
					Static421.anInt6742 = -5;
					return;
				}
				Static35.aClass342_1.method8309();
				Static40.anInt933 = 0;
				Static219.anInt4163++;
				Static433.anInt8266 = 1;
			}
			if (Static433.anInt8266 == 1) {
				Static175.aClass81_2 = Static35.aClass342_1.method8306(Static247.aClass291_1);
				Static433.anInt8266 = 2;
			}
			if (Static433.anInt8266 == 2) {
				if (Static175.aClass81_2.anInt2532 == 2) {
					throw new IOException();
				}
				if (Static175.aClass81_2.anInt2532 != 1) {
					return;
				}
				Static559.aClass269_1 = Static669.method9265((Socket) Static175.aClass81_2.anObject4);
				Static175.aClass81_2 = null;
				Static93.method9381();
				Static433.anInt8266 = 4;
			}
			if (Static433.anInt8266 == 4 && Static559.aClass269_1.method6699(1)) {
				Static559.aClass269_1.method6702(1, Static210.aClass3_Sub25_Sub1_3.aByteArray106, 0);
				@Pc(116) int local116 = Static210.aClass3_Sub25_Sub1_3.aByteArray106[0] & 0xFF;
				Static433.anInt8266 = 0;
				Static421.anInt6742 = local116;
				Static559.aClass269_1.method6697();
				Static559.aClass269_1 = null;
			}
		} catch (@Pc(127) IOException local127) {
			if (Static559.aClass269_1 != null) {
				Static559.aClass269_1.method6697();
				Static559.aClass269_1 = null;
			}
			if (Static219.anInt4163 < 2) {
				Static35.aClass342_1.method8309();
				Static433.anInt8266 = 1;
				Static40.anInt933 = 0;
				Static219.anInt4163++;
			} else {
				Static433.anInt8266 = 0;
				Static421.anInt6742 = -4;
			}
		}
	}
}

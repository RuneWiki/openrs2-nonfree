import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V")
	public static void method4551() {
		if (Static306.anInt4661 == 0) {
			return;
		}
		try {
			if (++Static122.anInt2071 > 2000) {
				Static487.aClass221_1.method5170();
				if (Static128.anInt2134 >= 2) {
					Static306.anInt4661 = 0;
					Static563.anInt8850 = -5;
					return;
				}
				Static470.aClass176_2.method3776();
				Static128.anInt2134++;
				Static306.anInt4661 = 1;
				Static122.anInt2071 = 0;
			}
			if (Static306.anInt4661 == 1) {
				Static487.aClass221_1.aClass163_4 = Static470.aClass176_2.method3777(Static135.aClass389_2);
				Static306.anInt4661 = 2;
			}
			if (Static306.anInt4661 == 2) {
				if (Static487.aClass221_1.aClass163_4.anInt3843 == 2) {
					throw new IOException();
				}
				if (Static487.aClass221_1.aClass163_4.anInt3843 != 1) {
					return;
				}
				Static487.aClass221_1.aClass5_2 = Static166.method2508((Socket) Static487.aClass221_1.aClass163_4.anObject5);
				Static487.aClass221_1.aClass163_4 = null;
				Static487.aClass221_1.method5171((byte) 119);
				Static306.anInt4661 = 4;
			}
			if (Static306.anInt4661 == 4) {
				if (!Static487.aClass221_1.aClass5_2.method106(1)) {
					return;
				}
				Static487.aClass221_1.aClass5_2.method109(0, Static487.aClass221_1.aClass2_Sub20_Sub2_2.aByteArray111, 1);
				@Pc(131) int local131 = Static487.aClass221_1.aClass2_Sub20_Sub2_2.aByteArray111[0] & 0xFF;
				Static306.anInt4661 = 0;
				Static563.anInt8850 = local131;
				Static487.aClass221_1.method5170();
				return;
			}
		} catch (@Pc(140) IOException local140) {
			Static487.aClass221_1.method5170();
			if (Static128.anInt2134 >= 2) {
				Static563.anInt8850 = -4;
				Static306.anInt4661 = 0;
			} else {
				Static470.aClass176_2.method3776();
				Static128.anInt2134++;
				Static122.anInt2071 = 0;
				Static306.anInt4661 = 1;
			}
		}
	}
}

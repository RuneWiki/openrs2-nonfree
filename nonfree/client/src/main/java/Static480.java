import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "D")
	public static double aDouble55;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
	public static void method8784() {
		if (Static557.anInt9014 == 0) {
			return;
		}
		try {
			if (++Static588.anInt9365 > 2000) {
				Static525.aClass260_3.method6400();
				if (Static434.anInt7427 >= 2) {
					Static557.anInt9014 = 0;
					Static607.anInt9572 = -5;
					return;
				}
				Static227.aClass165_4.method4207();
				Static588.anInt9365 = 0;
				Static557.anInt9014 = 1;
				Static434.anInt7427++;
			}
			if (Static557.anInt9014 == 1) {
				Static525.aClass260_3.aClass380_4 = Static227.aClass165_4.method4203(Static651.aClass122_38);
				Static557.anInt9014 = 2;
			}
			if (Static557.anInt9014 == 2) {
				if (Static525.aClass260_3.aClass380_4.anInt10067 == 2) {
					throw new IOException();
				}
				if (Static525.aClass260_3.aClass380_4.anInt10067 != 1) {
					return;
				}
				Static525.aClass260_3.aClass141_1 = Static486.method7218((Socket) Static525.aClass260_3.aClass380_4.anObject25);
				Static525.aClass260_3.aClass380_4 = null;
				Static525.aClass260_3.method6399();
				Static557.anInt9014 = 4;
			}
			if (Static557.anInt9014 == 4 && Static525.aClass260_3.aClass141_1.method7613(1)) {
				Static525.aClass260_3.aClass141_1.method7610(0, 1, Static525.aClass260_3.aClass6_Sub15_Sub1_2.aByteArray20);
				@Pc(139) int local139 = Static525.aClass260_3.aClass6_Sub15_Sub1_2.aByteArray20[0] & 0xFF;
				Static607.anInt9572 = local139;
				Static557.anInt9014 = 0;
				Static525.aClass260_3.method6400();
			}
		} catch (@Pc(148) IOException local148) {
			Static525.aClass260_3.method6400();
			if (Static434.anInt7427 < 2) {
				Static227.aClass165_4.method4207();
				Static557.anInt9014 = 1;
				Static434.anInt7427++;
				Static588.anInt9365 = 0;
			} else {
				Static607.anInt9572 = -4;
				Static557.anInt9014 = 0;
			}
		}
	}
}

import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!ofa", name = "i", descriptor = "I")
	public static int anInt7593 = 0;

	@OriginalMember(owner = "client!ofa", name = "m", descriptor = "[I")
	public static final int[] anIntArray561 = new int[2048];

	@OriginalMember(owner = "client!ofa", name = "n", descriptor = "[I")
	public static final int[] anIntArray562 = new int[50];

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(B)V")
	public static void method6248() {
		if (Static101.anInt2152 == 0) {
			return;
		}
		try {
			if (++Static132.anInt2538 > 2000) {
				if (Static258.aClass97_2 != null) {
					Static258.aClass97_2.method2286();
					Static258.aClass97_2 = null;
				}
				if (Static622.anInt10474 >= 2) {
					Static101.anInt2152 = 0;
					Static408.anInt7106 = -5;
					return;
				}
				Static368.aClass337_5.method8199();
				Static622.anInt10474++;
				Static132.anInt2538 = 0;
				Static101.anInt2152 = 1;
			}
			if (Static101.anInt2152 == 1) {
				Static120.aClass150_7 = Static368.aClass337_5.method8198(Static234.aClass333_5);
				Static101.anInt2152 = 2;
			}
			if (Static101.anInt2152 == 2) {
				if (Static120.aClass150_7.anInt4247 == 2) {
					throw new IOException();
				}
				if (Static120.aClass150_7.anInt4247 != 1) {
					return;
				}
				Static258.aClass97_2 = Static243.method3621((Socket) Static120.aClass150_7.anObject8);
				Static120.aClass150_7 = null;
				Static363.method47();
				Static101.anInt2152 = 4;
			}
			if (Static101.anInt2152 == 4 && Static258.aClass97_2.method2290(1)) {
				Static258.aClass97_2.method2294(0, Static481.aClass14_Sub29_Sub1_2.aByteArray84, 1);
				@Pc(111) int local111 = Static481.aClass14_Sub29_Sub1_2.aByteArray84[0] & 0xFF;
				Static408.anInt7106 = local111;
				Static101.anInt2152 = 0;
				Static258.aClass97_2.method2286();
				Static258.aClass97_2 = null;
			}
		} catch (@Pc(131) IOException local131) {
			if (Static258.aClass97_2 != null) {
				Static258.aClass97_2.method2286();
				Static258.aClass97_2 = null;
			}
			if (Static622.anInt10474 < 2) {
				Static368.aClass337_5.method8199();
				Static622.anInt10474++;
				Static132.anInt2538 = 0;
				Static101.anInt2152 = 1;
			} else {
				Static101.anInt2152 = 0;
				Static408.anInt7106 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!ofa", name = "d", descriptor = "(I)V")
	public static void method6249(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static434.anInt7761 == 2) {
				Static113.aClass109Array1[0].method2654(Static400.aClass134Array1[0]);
				Static113.aClass109Array1[1].method2654(Static400.aClass134Array1[1]);
			} else if (Static434.anInt7761 == 3) {
				Static113.aClass109Array1[0].method2654(Static400.aClass134Array1[0]);
				Static113.aClass109Array1[1].method2654(Static400.aClass134Array1[1]);
				Static113.aClass109Array1[2].method2654(Static400.aClass134Array1[2]);
			} else {
				Static113.aClass109Array1[0].method2654(Static400.aClass134Array1[0]);
				Static113.aClass109Array1[1].method2654(Static400.aClass134Array1[1]);
				Static113.aClass109Array1[2].method2654(Static400.aClass134Array1[2]);
				Static113.aClass109Array1[3].method2654(Static400.aClass134Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static434.anInt7761 == 2) {
				Static113.aClass109Array1[0].method2654(Static400.aClass134Array1[2]);
			} else if (Static434.anInt7761 == 3) {
				Static113.aClass109Array1[0].method2654(Static400.aClass134Array1[3]);
				Static113.aClass109Array1[1].method2654(Static400.aClass134Array1[4]);
			} else {
				Static113.aClass109Array1[0].method2654(Static400.aClass134Array1[4]);
				Static113.aClass109Array1[1].method2654(Static400.aClass134Array1[5]);
				Static113.aClass109Array1[2].method2654(Static400.aClass134Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static434.anInt7761 == 2) {
				Static113.aClass109Array1[0].method2654(Static400.aClass134Array1[3]);
				return;
			}
			if (Static434.anInt7761 == 3) {
				Static113.aClass109Array1[0].method2654(Static400.aClass134Array1[5]);
				return;
			}
			Static113.aClass109Array1[0].method2654(Static400.aClass134Array1[7]);
		}
	}
}

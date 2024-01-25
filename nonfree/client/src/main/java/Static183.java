import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "I")
	public static int anInt4068;

	@OriginalMember(owner = "client!gw", name = "s", descriptor = "[[I")
	public static int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "Lclient!gs;")
	public static final Class123 aClass123_5 = new Class123("WTWIP", 3);

	@OriginalMember(owner = "client!gw", name = "t", descriptor = "[I")
	public static final int[] anIntArray265 = new int[8];

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!ss;I)V")
	public static void method3587(@OriginalArg(0) Class5_Sub8 arg0) {
		arg0.aClass11_Sub1_Sub1_1 = null;
		if (Static294.anInt5606 < 20) {
			Static262.aClass267_5.method6538(arg0);
			Static294.anInt5606++;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	public static void method3588(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static518.anInt9045 = -1;
		Static49.anInt1353 = 1;
		Static482.method7331(arg0, false, arg1);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
	public static void method3589() {
		if (Static159.anInt3401 == 0) {
			return;
		}
		try {
			if (++Static443.anInt8142 > 2000) {
				if (Static52.aClass64_1 != null) {
					Static52.aClass64_1.method1812();
					Static52.aClass64_1 = null;
				}
				if (Static70.anInt1692 >= 2) {
					Static350.anInt5890 = -5;
					Static159.anInt3401 = 0;
					return;
				}
				Static267.aClass275_1.method6665();
				Static443.anInt8142 = 0;
				Static159.anInt3401 = 1;
				Static70.anInt1692++;
			}
			if (Static159.anInt3401 == 1) {
				Static230.aClass280_3 = Static267.aClass275_1.method6662(Static414.aClass246_5);
				Static159.anInt3401 = 2;
			}
			if (Static159.anInt3401 == 2) {
				if (Static230.aClass280_3.anInt8467 == 2) {
					throw new IOException();
				}
				if (Static230.aClass280_3.anInt8467 != 1) {
					return;
				}
				Static52.aClass64_1 = Static29.method993((Socket) Static230.aClass280_3.anObject16);
				Static230.aClass280_3 = null;
				Static52.aClass64_1.method1819(Static547.aClass6_Sub26_Sub2_2.anInt5769, Static547.aClass6_Sub26_Sub2_2.aByteArray65);
				Static159.anInt3401 = 4;
			}
			@Pc(129) int local129;
			if (Static159.anInt3401 == 4) {
				if (!Static52.aClass64_1.method1820(1)) {
					return;
				}
				Static52.aClass64_1.method1813(Static345.aClass6_Sub26_Sub2_1.aByteArray65, 0, 1);
				local129 = Static345.aClass6_Sub26_Sub2_1.aByteArray65[0] & 0xFF;
				if (local129 != 21) {
					Static159.anInt3401 = 0;
					Static350.anInt5890 = local129;
					Static52.aClass64_1.method1812();
					Static52.aClass64_1 = null;
					return;
				}
				Static159.anInt3401 = 5;
			}
			if (Static159.anInt3401 == 5) {
				if (!Static52.aClass64_1.method1820(1)) {
					return;
				}
				Static52.aClass64_1.method1813(Static345.aClass6_Sub26_Sub2_1.aByteArray65, 0, 1);
				Static380.aStringArray41 = new String[Static345.aClass6_Sub26_Sub2_1.aByteArray65[0] & 0xFF];
				Static159.anInt3401 = 6;
			}
			if (Static159.anInt3401 == 6 && Static52.aClass64_1.method1820(Static380.aStringArray41.length * 8)) {
				Static345.aClass6_Sub26_Sub2_1.anInt5769 = 0;
				Static52.aClass64_1.method1813(Static345.aClass6_Sub26_Sub2_1.aByteArray65, 0, Static380.aStringArray41.length * 8);
				for (local129 = 0; local129 < Static380.aStringArray41.length; local129++) {
					Static380.aStringArray41[local129] = Static141.method2654(Static345.aClass6_Sub26_Sub2_1.method4935());
				}
				Static159.anInt3401 = 0;
				Static350.anInt5890 = 21;
				Static52.aClass64_1.method1812();
				Static52.aClass64_1 = null;
			}
		} catch (@Pc(229) IOException local229) {
			if (Static52.aClass64_1 != null) {
				Static52.aClass64_1.method1812();
				Static52.aClass64_1 = null;
			}
			if (Static70.anInt1692 >= 2) {
				Static159.anInt3401 = 0;
				Static350.anInt5890 = -4;
			} else {
				Static267.aClass275_1.method6665();
				Static70.anInt1692++;
				Static443.anInt8142 = 0;
				Static159.anInt3401 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "([[BILclient!nq;)V")
	public static void method3591(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class202_Sub1 arg1) {
		@Pc(8) int local8 = Static61.aByteArrayArray4.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(16) byte[] local16 = arg0[local10];
			if (local16 != null) {
				@Pc(29) int local29 = (Static341.anIntArray470[local10] >> 8) * 64 - Static191.anInt4147;
				@Pc(40) int local40 = (Static341.anIntArray470[local10] & 0xFF) * 64 - Static247.anInt5049;
				Static186.method3607();
				arg1.method5742(local29, Static323.aClass9_8, local16, Static55.aClass194Array1, local40);
			}
		}
	}
}

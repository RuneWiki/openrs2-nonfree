import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "Lclient!gfa;")
	public static final Class135 aClass135_6 = new Class135();

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IC)B")
	public static byte method6349(@OriginalArg(1) char arg0) {
		@Pc(45) byte local45;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local45 = (byte) arg0;
		} else if (arg0 == '€') {
			local45 = -128;
		} else if (arg0 == '‚') {
			local45 = -126;
		} else if (arg0 == 'ƒ') {
			local45 = -125;
		} else if (arg0 == '„') {
			local45 = -124;
		} else if (arg0 == '…') {
			local45 = -123;
		} else if (arg0 == '†') {
			local45 = -122;
		} else if (arg0 == '‡') {
			local45 = -121;
		} else if (arg0 == 'ˆ') {
			local45 = -120;
		} else if (arg0 == '‰') {
			local45 = -119;
		} else if (arg0 == 'Š') {
			local45 = -118;
		} else if (arg0 == '‹') {
			local45 = -117;
		} else if (arg0 == 'Œ') {
			local45 = -116;
		} else if (arg0 == 'Ž') {
			local45 = -114;
		} else if (arg0 == '‘') {
			local45 = -111;
		} else if (arg0 == '’') {
			local45 = -110;
		} else if (arg0 == '“') {
			local45 = -109;
		} else if (arg0 == '”') {
			local45 = -108;
		} else if (arg0 == '•') {
			local45 = -107;
		} else if (arg0 == '–') {
			local45 = -106;
		} else if (arg0 == '—') {
			local45 = -105;
		} else if (arg0 == '˜') {
			local45 = -104;
		} else if (arg0 == '™') {
			local45 = -103;
		} else if (arg0 == 'š') {
			local45 = -102;
		} else if (arg0 == '›') {
			local45 = -101;
		} else if (arg0 == 'œ') {
			local45 = -100;
		} else if (arg0 == 'ž') {
			local45 = -98;
		} else if (arg0 == 'Ÿ') {
			local45 = -97;
		} else {
			local45 = 63;
		}
		return local45;
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V")
	public static void method6350() {
		if (Static446.anInt6827 == 0) {
			return;
		}
		try {
			if (++Static77.anInt1738 > 2000) {
				Static95.aClass292_1.method6852();
				if (Static266.anInt4140 >= 2) {
					Static468.anInt7366 = -5;
					Static446.anInt6827 = 0;
					return;
				}
				Static120.aClass43_1.method1304();
				Static77.anInt1738 = 0;
				Static266.anInt4140++;
				Static446.anInt6827 = 1;
			}
			if (Static446.anInt6827 == 1) {
				Static95.aClass292_1.aClass338_6 = Static120.aClass43_1.method1307(Static122.aClass47_1);
				Static446.anInt6827 = 2;
			}
			if (Static446.anInt6827 == 2) {
				if (Static95.aClass292_1.aClass338_6.anInt8934 == 2) {
					throw new IOException();
				}
				if (Static95.aClass292_1.aClass338_6.anInt8934 != 1) {
					return;
				}
				Static95.aClass292_1.aClass118_2 = Static665.method8673((Socket) Static95.aClass292_1.aClass338_6.anObject16);
				Static95.aClass292_1.aClass338_6 = null;
				Static95.aClass292_1.method6851();
				Static446.anInt6827 = 4;
			}
			if (Static446.anInt6827 == 4) {
				if (!Static95.aClass292_1.aClass118_2.method7795(1)) {
					return;
				}
				Static95.aClass292_1.aClass118_2.method7796(1, Static95.aClass292_1.aClass3_Sub2_Sub1_2.aByteArray20, 0);
				@Pc(126) int local126 = Static95.aClass292_1.aClass3_Sub2_Sub1_2.aByteArray20[0] & 0xFF;
				Static468.anInt7366 = local126;
				Static446.anInt6827 = 0;
				Static95.aClass292_1.method6852();
				return;
			}
		} catch (@Pc(137) IOException local137) {
			Static95.aClass292_1.method6852();
			if (Static266.anInt4140 >= 2) {
				Static446.anInt6827 = 0;
				Static468.anInt7366 = -4;
			} else {
				Static120.aClass43_1.method1304();
				Static446.anInt6827 = 1;
				Static77.anInt1738 = 0;
				Static266.anInt4140++;
			}
		}
	}
}

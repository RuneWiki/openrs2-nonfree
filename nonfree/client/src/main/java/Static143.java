import java.awt.Canvas;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!fba", name = "x", descriptor = "Lclient!mi;")
	public static Class46 aClass46_26;

	@OriginalMember(owner = "client!fba", name = "u", descriptor = "[B")
	public static final byte[] aByteArray113 = new byte[2048];

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "(II)Lclient!oaa;")
	public static Class234 method7501(@OriginalArg(0) int arg0) {
		@Pc(8) Class234[] local8 = Static351.method5970();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (arg0 == local8[local10].anInt7474) {
				return local8[local10];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZIILjava/awt/Canvas;Lclient!d;)Lclient!ha;")
	public static Class20 method7502(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Interface4 arg3) {
		return new Class20_Sub1(arg2, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(III)V")
	public static void method7504(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static614.anInt10750 != 0) {
			if (arg1 >= 0) {
				Static537.anIntArray638[arg1] = arg0;
			} else {
				for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
					Static537.anIntArray638[local23] = arg0;
				}
			}
		}
		Static341.aClass2_Sub8_Sub3_4.method5785(arg0, arg1);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
	public static void method7506() {
		if (Static411.anInt7764 == 0) {
			return;
		}
		try {
			if (++Static427.anInt8027 > 2000) {
				if (Static272.aClass116_1 != null) {
					Static272.aClass116_1.method3740();
					Static272.aClass116_1 = null;
				}
				if (Static256.anInt5473 >= 2) {
					Static411.anInt7764 = 0;
					Static129.anInt3275 = -5;
					return;
				}
				Static561.aClass255_5.method6754();
				Static411.anInt7764 = 1;
				Static427.anInt8027 = 0;
				Static256.anInt5473++;
			}
			if (Static411.anInt7764 == 1) {
				Static21.aClass240_3 = Static561.aClass255_5.method6757(Static268.aClass370_3);
				Static411.anInt7764 = 2;
			}
			if (Static411.anInt7764 == 2) {
				if (Static21.aClass240_3.anInt7566 == 2) {
					throw new IOException();
				}
				if (Static21.aClass240_3.anInt7566 != 1) {
					return;
				}
				Static272.aClass116_1 = Static431.method6883((Socket) Static21.aClass240_3.anObject13);
				Static21.aClass240_3 = null;
				Static547.method8179();
				Static411.anInt7764 = 4;
			}
			if (Static411.anInt7764 == 4 && Static272.aClass116_1.method3745(1)) {
				Static272.aClass116_1.method3741(1, 0, Static627.aClass2_Sub11_Sub2_6.aByteArray128);
				@Pc(117) int local117 = Static627.aClass2_Sub11_Sub2_6.aByteArray128[0] & 0xFF;
				Static129.anInt3275 = local117;
				Static411.anInt7764 = 0;
				Static272.aClass116_1.method3740();
				Static272.aClass116_1 = null;
			}
		} catch (@Pc(128) IOException local128) {
			if (Static272.aClass116_1 != null) {
				Static272.aClass116_1.method3740();
				Static272.aClass116_1 = null;
			}
			if (Static256.anInt5473 < 2) {
				Static561.aClass255_5.method6754();
				Static427.anInt8027 = 0;
				Static256.anInt5473++;
				Static411.anInt7764 = 1;
			} else {
				Static129.anInt3275 = -4;
				Static411.anInt7764 = 0;
			}
		}
	}
}

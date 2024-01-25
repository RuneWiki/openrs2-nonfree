import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas9;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IB)V")
	public static void method5735() {
		@Pc(5) Class6 local5 = Static220.aClass6_22;
		synchronized (Static220.aClass6_22) {
			Static220.aClass6_22.method97(5);
		}
		local5 = Static272.aClass6_29;
		synchronized (Static272.aClass6_29) {
			Static272.aClass6_29.method97(5);
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IILclient!np;)V")
	public static void method5736(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (Static527.aClass226_5 == null) {
			return;
		}
		try {
			Static527.aClass226_5.method5275(0L);
			Static527.aClass226_5.method5272(arg0, arg1.aByteArray62, 24);
		} catch (@Pc(19) Exception local19) {
		}
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V")
	public static void method5737() {
		@Pc(8) int local8 = Static346.aByteArrayArray18.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static346.aByteArrayArray18[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static52.anInt995; local20++) {
					if (Static403.anIntArray428[local10] == Static111.anIntArray568[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static111.anIntArray568[Static52.anInt995] = Static403.anIntArray428[local10];
					local18 = Static52.anInt995++;
				}
				@Pc(64) Class3_Sub11 local64 = new Class3_Sub11(Static346.aByteArrayArray18[local10]);
				@Pc(66) int local66 = 0;
				while (Static346.aByteArrayArray18[local10].length > local64.anInt6128 && local66 < 511 && Static88.anInt1884 < 1023) {
					@Pc(87) int local87 = local18 | local66++ << 6;
					@Pc(91) int local91 = local64.method5198();
					@Pc(95) int local95 = local91 >> 14;
					@Pc(101) int local101 = local91 >> 7 & 0x3F;
					@Pc(105) int local105 = local91 & 0x3F;
					@Pc(119) int local119 = (Static403.anIntArray428[local10] >> 8) * 64 + local101 - Static335.anInt5608;
					@Pc(132) int local132 = local105 + (Static403.anIntArray428[local10] & 0xFF) * 64 - Static246.anInt4344;
					@Pc(139) Class264 local139 = Static361.aClass229_13.method5396(local64.method5198());
					@Pc(148) Class3_Sub34 local148 = (Class3_Sub34) Static213.aClass354_37.method7689((long) local87);
					if (local148 == null && (local139.aByte84 & 0x1) > 0 && Static364.anInt645 == local95 && local119 >= 0 && Static54.anInt1038 > local119 + local139.anInt7163 && local132 >= 0 && Static140.anInt3026 > local139.anInt7163 + local132) {
						@Pc(199) Class41_Sub2_Sub1_Sub4_Sub1 local199 = new Class41_Sub2_Sub1_Sub4_Sub1();
						local199.anInt9472 = local87;
						@Pc(207) Class3_Sub34 local207 = new Class3_Sub34(local199);
						Static213.aClass354_37.method7691(local207, (long) local87);
						Static441.aClass3_Sub34Array1[Static137.anInt2977++] = local207;
						Static445.anIntArray470[Static88.anInt1884++] = local87;
						local199.anInt9487 = Static506.anInt8251;
						local199.method5661(local139);
						local199.method7859(local199.aClass264_1.anInt7163);
						local199.anInt9499 = local199.aClass264_1.anInt7149 << 3;
						local199.method7855(local199.aClass264_1.aByte87 + 4 << 11 & 0x39BA, true);
						local199.method5652(true, local95, local119, local132, local199.method7858());
					}
				}
			}
		}
	}
}

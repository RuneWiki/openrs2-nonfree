import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!jda", name = "U", descriptor = "Lclient!ri;")
	public static Class284 aClass284_75;

	@OriginalMember(owner = "client!jda", name = "bb", descriptor = "[I")
	public static final int[] anIntArray228 = new int[5];

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILclient!ri;Lclient!ri;B)V")
	public static void method3933(@OriginalArg(1) Class284 arg0, @OriginalArg(2) Class284 arg1) {
		Static34.aClass284_46 = arg1;
		Static573.aClass284_165 = arg0;
	}

	@OriginalMember(owner = "client!jda", name = "h", descriptor = "(B)V")
	public static void method3934() {
		if (Static318.anInt5854 == 0) {
			return;
		}
		try {
			if (++Static79.anInt2120 > 2000) {
				if (Static451.aClass223_6 != null) {
					Static451.aClass223_6.method5105();
					Static451.aClass223_6 = null;
				}
				if (Static560.anInt9754 >= 2) {
					Static36.anInt1076 = -5;
					Static318.anInt5854 = 0;
					return;
				}
				Static234.aClass212_10.method4973();
				Static318.anInt5854 = 1;
				Static560.anInt9754++;
				Static79.anInt2120 = 0;
			}
			if (Static318.anInt5854 == 1) {
				Static86.aClass309_1 = Static234.aClass212_10.method4971(Static467.aClass168_12);
				Static318.anInt5854 = 2;
			}
			if (Static318.anInt5854 == 2) {
				if (Static86.aClass309_1.anInt8650 == 2) {
					throw new IOException();
				}
				if (Static86.aClass309_1.anInt8650 != 1) {
					return;
				}
				Static451.aClass223_6 = Static177.method3159((Socket) Static86.aClass309_1.anObject15);
				Static86.aClass309_1 = null;
				Static411.method5773();
				Static318.anInt5854 = 4;
			}
			@Pc(125) int local125;
			if (Static318.anInt5854 == 4) {
				if (!Static451.aClass223_6.method5110(1)) {
					return;
				}
				Static451.aClass223_6.method5106(Static455.aClass3_Sub26_Sub1_2.aByteArray213, 1, 0);
				local125 = Static455.aClass3_Sub26_Sub1_2.aByteArray213[0] & 0xFF;
				if (local125 != 21) {
					Static36.anInt1076 = local125;
					Static318.anInt5854 = 0;
					Static451.aClass223_6.method5105();
					Static451.aClass223_6 = null;
					return;
				}
				Static318.anInt5854 = 5;
			}
			if (Static318.anInt5854 == 5) {
				if (!Static451.aClass223_6.method5110(1)) {
					return;
				}
				Static451.aClass223_6.method5106(Static455.aClass3_Sub26_Sub1_2.aByteArray213, 1, 0);
				Static318.anInt5854 = 6;
				Static328.aStringArray27 = new String[Static455.aClass3_Sub26_Sub1_2.aByteArray213[0] & 0xFF];
			}
			if (Static318.anInt5854 == 6 && Static451.aClass223_6.method5110(Static328.aStringArray27.length * 8)) {
				Static455.aClass3_Sub26_Sub1_2.anInt8703 = 0;
				Static451.aClass223_6.method5106(Static455.aClass3_Sub26_Sub1_2.aByteArray213, Static328.aStringArray27.length * 8, 0);
				for (local125 = 0; local125 < Static328.aStringArray27.length; local125++) {
					Static328.aStringArray27[local125] = Static517.method6954(Static455.aClass3_Sub26_Sub1_2.method6813());
				}
				Static36.anInt1076 = 21;
				Static318.anInt5854 = 0;
				Static451.aClass223_6.method5105();
				Static451.aClass223_6 = null;
			}
		} catch (@Pc(225) IOException local225) {
			if (Static451.aClass223_6 != null) {
				Static451.aClass223_6.method5105();
				Static451.aClass223_6 = null;
			}
			if (Static560.anInt9754 >= 2) {
				Static36.anInt1076 = -4;
				Static318.anInt5854 = 0;
			} else {
				Static234.aClass212_10.method4973();
				Static560.anInt9754++;
				Static79.anInt2120 = 0;
				Static318.anInt5854 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(III)V")
	public static void method3935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class3_Sub7_Sub19 local15 = Static73.method5992(6, arg0);
		local15.method7363();
		local15.anInt9381 = arg1;
	}
}

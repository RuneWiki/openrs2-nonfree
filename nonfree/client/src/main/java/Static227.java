import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!kt", name = "k", descriptor = "Lclient!wf;")
	public static Class265 aClass265_1;

	@OriginalMember(owner = "client!kt", name = "m", descriptor = "[[S")
	public static short[][] aShortArrayArray9;

	@OriginalMember(owner = "client!kt", name = "E", descriptor = "I")
	public static int anInt3788 = 0;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V")
	public static void method2988() {
		if (Static188.anInt3155 == 0) {
			return;
		}
		try {
			if (++Static274.anInt4304 > 2000) {
				if (Static14.aClass99_2 != null) {
					Static14.aClass99_2.method4963();
					Static14.aClass99_2 = null;
				}
				if (Static371.anInt6077 >= 1) {
					Static456.anInt7451 = -5;
					Static188.anInt3155 = 0;
					return;
				}
				Static263.aClass165_5.aBoolean279 = !Static263.aClass165_5.aBoolean279;
				Static188.anInt3155 = 1;
				Static274.anInt4304 = 0;
				Static371.anInt6077++;
			}
			if (Static188.anInt3155 == 1) {
				Static54.aClass268_2 = Static7.aClass93_1.method2088(Static263.aClass165_5.method3381(), Static263.aClass165_5.aString50);
				Static188.anInt3155 = 2;
			}
			if (Static188.anInt3155 == 2) {
				if (Static54.aClass268_2.anInt7420 == 2) {
					throw new IOException();
				}
				if (Static54.aClass268_2.anInt7420 != 1) {
					return;
				}
				Static14.aClass99_2 = Static379.method3489((Socket) Static54.aClass268_2.anObject10);
				Static54.aClass268_2 = null;
				Static14.aClass99_2.method4964(Static281.aClass5_Sub15_Sub2_13.anInt7013, Static281.aClass5_Sub15_Sub2_13.aByteArray93);
				Static188.anInt3155 = 4;
			}
			@Pc(127) int local127;
			if (Static188.anInt3155 == 4) {
				if (!Static14.aClass99_2.method4961(1)) {
					return;
				}
				Static14.aClass99_2.method4959(0, Static76.aClass5_Sub15_Sub2_1.aByteArray93, 1);
				local127 = Static76.aClass5_Sub15_Sub2_1.aByteArray93[0] & 0xFF;
				if (local127 != 21) {
					Static456.anInt7451 = local127;
					Static188.anInt3155 = 0;
					Static14.aClass99_2.method4963();
					Static14.aClass99_2 = null;
					return;
				}
				Static188.anInt3155 = 5;
			}
			if (Static188.anInt3155 == 5) {
				if (!Static14.aClass99_2.method4961(1)) {
					return;
				}
				Static14.aClass99_2.method4959(0, Static76.aClass5_Sub15_Sub2_1.aByteArray93, 1);
				Static188.anInt3155 = 6;
				Static160.aStringArray17 = new String[Static76.aClass5_Sub15_Sub2_1.aByteArray93[0] & 0xFF];
			}
			if (Static188.anInt3155 == 6) {
				if (!Static14.aClass99_2.method4961(Static160.aStringArray17.length * 8)) {
					return;
				}
				Static76.aClass5_Sub15_Sub2_1.anInt7013 = 0;
				Static14.aClass99_2.method4959(0, Static76.aClass5_Sub15_Sub2_1.aByteArray93, Static160.aStringArray17.length * 8);
				for (local127 = 0; local127 < Static160.aStringArray17.length; local127++) {
					Static160.aStringArray17[local127] = Static448.method5905(Static76.aClass5_Sub15_Sub2_1.method5553());
				}
				Static188.anInt3155 = 0;
				Static456.anInt7451 = 21;
				Static14.aClass99_2.method4963();
				Static14.aClass99_2 = null;
				return;
			}
		} catch (@Pc(237) IOException local237) {
			if (Static14.aClass99_2 != null) {
				Static14.aClass99_2.method4963();
				Static14.aClass99_2 = null;
			}
			if (Static371.anInt6077 < 1) {
				Static263.aClass165_5.aBoolean279 = !Static263.aClass165_5.aBoolean279;
				Static371.anInt6077++;
				Static188.anInt3155 = 1;
				Static274.anInt4304 = 0;
			} else {
				Static188.anInt3155 = 0;
				Static456.anInt7451 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method2991(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z[BB)V")
	public static void method2993(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		if (Static310.aClass5_Sub15_6 == null) {
			Static310.aClass5_Sub15_6 = new Class5_Sub15(20000);
		}
		Static310.aClass5_Sub15_6.method5557(arg1.length, arg1);
		if (!arg0) {
			return;
		}
		Static300.method3720(Static310.aClass5_Sub15_6.aByteArray93);
		Static79.aClass50_Sub1Array1 = new Class50_Sub1[Static283.anInt4397];
		@Pc(38) int local38 = 0;
		for (@Pc(40) int local40 = Static436.anInt5879; local40 <= Static136.anInt7479; local40++) {
			@Pc(46) Class50_Sub1 local46 = Static343.method4462(local40);
			if (local46 != null) {
				Static79.aClass50_Sub1Array1[local38++] = local46;
			}
		}
		Static374.aBoolean415 = false;
		Static123.aLong65 = Static446.method5903();
		Static310.aClass5_Sub15_6 = null;
	}
}

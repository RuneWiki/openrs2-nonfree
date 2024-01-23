import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ek", name = "H", descriptor = "J")
	public static long aLong47;

	@OriginalMember(owner = "client!ek", name = "db", descriptor = "I")
	public static int anInt1134;

	@OriginalMember(owner = "client!ek", name = "L", descriptor = "Lclient!qc;")
	public static Class90 aClass90_8 = new Class90(32);

	@OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
	public static int anInt1120 = 0;

	@OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
	public static int anInt1121 = 99;

	@OriginalMember(owner = "client!ek", name = "bb", descriptor = "I")
	public static int anInt1132 = 0;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BZLclient!pc;)V")
	public static void method836(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class87 arg1) {
		if (arg0) {
			Static231.anInt4421 = 3;
			Static14.method197(false);
			Static214.anInt4250 = 0;
			Static74.aBoolean69 = false;
			Static34.aBoolean18 = false;
			Static152.anInt3168 = 255;
			Static35.aBoolean27 = false;
			Static70.aBoolean65 = false;
			Static205.aBoolean196 = false;
			Static148.aBoolean130 = false;
			Static151.aBoolean134 = false;
			Static207.anInt4148 = 0;
			Static146.anInt3076 = 127;
			Static129.aBoolean113 = false;
			Static24.aBoolean14 = false;
			Static172.anInt3511 = 127;
			Static118.anInt2320 = 0;
			Static27.anInt541 = 0;
			Static137.aBoolean119 = false;
			Static125.aBoolean111 = false;
			Static79.method2553(arg1);
			return;
		}
		Static231.anInt4421 = 3;
		@Pc(11) Class34 local11 = null;
		Static14.method197(true);
		Static137.aBoolean119 = true;
		Static146.anInt3076 = 127;
		Static35.aBoolean27 = true;
		Static118.anInt2320 = 0;
		Static129.aBoolean113 = true;
		Static205.aBoolean196 = true;
		Static74.aBoolean69 = true;
		Static151.aBoolean134 = true;
		Static207.anInt4148 = 0;
		Static34.aBoolean18 = true;
		Static214.anInt4250 = 2;
		Static70.aBoolean65 = true;
		Static152.anInt3168 = 255;
		Static125.aBoolean111 = true;
		Static172.anInt3511 = 127;
		Static148.aBoolean130 = true;
		Static27.anInt541 = 0;
		Static24.aBoolean14 = true;
		try {
			@Pc(55) Class116 local55 = arg1.method2690("runescape");
			while (local55.anInt4156 == 0) {
				Static204.method3250(1L);
			}
			if (local55.anInt4156 == 1) {
				@Pc(71) int local71 = 0;
				local11 = (Class34) local55.anObject5;
				@Pc(81) byte[] local81 = new byte[(int) local11.method948()];
				while (local81.length > local71) {
					@Pc(94) int local94 = local11.method944(local81, local71, local81.length - local71);
					if (local94 == -1) {
						throw new IOException("EOF");
					}
					local71 += local94;
				}
				Static37.method593(new Class1_Sub17(local81));
			}
		} catch (@Pc(119) Exception local119) {
		}
		try {
			if (local11 != null) {
				local11.method949();
			}
		} catch (@Pc(126) Exception local126) {
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)V")
	public static void method837(@OriginalArg(1) int arg0) {
		for (@Pc(13) Class1_Sub5 local13 = (Class1_Sub5) Static144.aClass90_14.method2823(); local13 != null; local13 = (Class1_Sub5) Static144.aClass90_14.method2821()) {
			if ((long) arg0 == (local13.aLong173 >> 48 & 0xFFFFL)) {
				local13.method3525();
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!hh;Lclient!hh;II)V")
	public static void method839(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) int arg2) {
		Static193.anInt3061 = 0;
		Static7.aClass50_68 = arg0;
		Static7.aClass50_67 = arg1;
		Static22.anInt427 = arg2;
		Static36.aBoolean29 = false;
		if (Static7.aClass50_67.method1236(Static7.aClass50_69) || Static7.aClass50_68.method1236(Static7.aClass50_69)) {
			Static226.anInt4351 = 0;
			Static133.anInt2753 = 3;
		} else {
			Static226.anInt4351 = 1;
			anInt1132 = 0;
			Static8.anInt183 = 0;
			Static133.anInt2753 = -3;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BIII)I")
	public static int method841(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static159.aByteArrayArrayArray13[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static159.aByteArrayArrayArray13[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "(B)V")
	public static void method842() {
		if (Static188.aBooleanArray21[98]) {
			Static223.anInt4340 += (12 - Static223.anInt4340) / 2;
		} else if (Static188.aBooleanArray21[99]) {
			Static223.anInt4340 += (-Static223.anInt4340 - 12) / 2;
		} else {
			Static223.anInt4340 /= 2;
		}
		Static176.anInt3690 += Static223.anInt4340 / 2;
		if (Static188.aBooleanArray21[96]) {
			Static17.anInt343 += (-Static17.anInt343 - 24) / 2;
		} else if (Static188.aBooleanArray21[97]) {
			Static17.anInt343 += (24 - Static17.anInt343) / 2;
		} else {
			Static17.anInt343 /= 2;
		}
		Static104.anInt2068 += Static17.anInt343 / 2;
		@Pc(92) int local92 = Static230.aClass20_Sub3_Sub1_3.anInt3022 + Static210.anInt4162;
		@Pc(97) int local97 = Static43.anInt929 + Static230.aClass20_Sub3_Sub1_3.anInt3008;
		if (Static31.anInt598 - local92 < -500 || Static31.anInt598 - local92 > 500 || Static201.anInt4057 - local97 < -500 || Static201.anInt4057 - local97 > 500) {
			Static31.anInt598 = local92;
			Static201.anInt4057 = local97;
		}
		if (Static201.anInt4057 != local97) {
			Static201.anInt4057 += (local97 - Static201.anInt4057) / 16;
		}
		if (local92 != Static31.anInt598) {
			Static31.anInt598 += (local92 - Static31.anInt598) / 16;
		}
		Static56.method823();
	}
}

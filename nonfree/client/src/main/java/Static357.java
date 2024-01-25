import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas8;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString67 = "";

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!rv;I)V")
	public static void method5229(@OriginalArg(0) Class5_Sub36_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method7336();
		@Pc(20) int local20;
		@Pc(55) int local55;
		for (@Pc(12) int local12 = 0; local12 < Static274.anInt4921; local12++) {
			local20 = Static605.anIntArray544[local12];
			if ((Static264.aByteArray44[local20] & 0x1) == 0) {
				if (local7 > 0) {
					Static264.aByteArray44[local20] = (byte) (Static264.aByteArray44[local20] | 0x2);
					local7--;
				} else {
					local55 = arg0.method7343(1);
					if (local55 == 0) {
						local7 = Static226.method3579(arg0);
						Static264.aByteArray44[local20] = (byte) (Static264.aByteArray44[local20] | 0x2);
					} else {
						Static1.method7010(local20, arg0);
					}
				}
			}
		}
		arg0.method7340();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method7336();
		@Pc(148) int local148;
		for (local20 = 0; local20 < Static274.anInt4921; local20++) {
			local55 = Static605.anIntArray544[local20];
			if ((Static264.aByteArray44[local55] & 0x1) != 0) {
				if (local7 > 0) {
					Static264.aByteArray44[local55] = (byte) (Static264.aByteArray44[local55] | 0x2);
					local7--;
				} else {
					local148 = arg0.method7343(1);
					if (local148 == 0) {
						local7 = Static226.method3579(arg0);
						Static264.aByteArray44[local55] = (byte) (Static264.aByteArray44[local55] | 0x2);
					} else {
						Static1.method7010(local55, arg0);
					}
				}
			}
		}
		arg0.method7340();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method7336();
		@Pc(246) int local246;
		for (local55 = 0; local55 < Static434.anInt7178; local55++) {
			local148 = Static192.anIntArray440[local55];
			if ((Static264.aByteArray44[local148] & 0x1) != 0) {
				if (local7 > 0) {
					Static264.aByteArray44[local148] = (byte) (Static264.aByteArray44[local148] | 0x2);
					local7--;
				} else {
					local246 = arg0.method7343(1);
					if (local246 == 0) {
						local7 = Static226.method3579(arg0);
						Static264.aByteArray44[local148] = (byte) (Static264.aByteArray44[local148] | 0x2);
					} else if (Static6.method96(local148, arg0)) {
						Static264.aByteArray44[local148] = (byte) (Static264.aByteArray44[local148] | 0x2);
					}
				}
			}
		}
		arg0.method7340();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method7336();
		for (local148 = 0; local148 < Static434.anInt7178; local148++) {
			local246 = Static192.anIntArray440[local148];
			if ((Static264.aByteArray44[local246] & 0x1) == 0) {
				if (local7 > 0) {
					Static264.aByteArray44[local246] = (byte) (Static264.aByteArray44[local246] | 0x2);
					local7--;
				} else {
					@Pc(357) int local357 = arg0.method7343(1);
					if (local357 == 0) {
						local7 = Static226.method3579(arg0);
						Static264.aByteArray44[local246] = (byte) (Static264.aByteArray44[local246] | 0x2);
					} else if (Static6.method96(local246, arg0)) {
						Static264.aByteArray44[local246] = (byte) (Static264.aByteArray44[local246] | 0x2);
					}
				}
			}
		}
		arg0.method7340();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static274.anInt4921 = 0;
		Static434.anInt7178 = 0;
		for (local246 = 1; local246 < 2048; local246++) {
			Static264.aByteArray44[local246] = (byte) (Static264.aByteArray44[local246] >> 1);
			@Pc(442) Class4_Sub1_Sub1_Sub2_Sub1 local442 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local246];
			if (local442 == null) {
				Static192.anIntArray440[Static434.anInt7178++] = local246;
			} else {
				Static605.anIntArray544[Static274.anInt4921++] = local246;
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLjava/lang/String;IZLjava/lang/String;)V")
	public static void method5231(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		aString67 = arg1;
		if (!arg0) {
			Static564.anInt8912 = -1;
		}
		Static306.aBoolean341 = arg2;
		Static279.aBoolean324 = arg0;
		Static514.aString92 = arg3;
		if (!Static279.aBoolean324 && (Static514.aString92.equals("") || aString67.equals(""))) {
			Static126.method1895(3);
			return;
		}
		if (Static120.anInt1966 != 1) {
			Static533.anInt8884 = 0;
			Static280.anInt4976 = -1;
		}
		Static365.aClass389_9.aBoolean759 = false;
		Static126.method1895(-3);
		Static493.anInt7981 = 0;
		Static321.anInt5481 = 0;
		Static205.anInt3674 = 1;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)Lclient!sm;")
	public static Class335 method5233(@OriginalArg(1) int arg0) {
		@Pc(10) Class335 local10 = (Class335) Static521.aClass168_98.method3860((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static597.aClass126_271.method3086(arg0, 0);
		local10 = new Class335();
		if (local29 != null) {
			local10.method7510(new Class5_Sub36(local29), arg0);
		}
		Static521.aClass168_98.method3853((long) arg0, local10);
		return local10;
	}
}

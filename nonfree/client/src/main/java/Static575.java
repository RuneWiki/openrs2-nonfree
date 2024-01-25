import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
	public static int anInt9354;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "Lclient!bh;")
	public static final Class32 aClass32_82 = new Class32(4);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)Z")
	public static boolean method7861(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;I)V")
	public static void method7863(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static637.aBoolean745 = arg0;
		Static34.aString8 = arg1;
		Static91.aString17 = arg2;
		if (!Static637.aBoolean745 && (Static34.aString8.equals("") || Static91.aString17.equals(""))) {
			Static63.method8324(3);
			return;
		}
		Static171.aBoolean226 = false;
		if (Static507.anInt8408 != 1) {
			Static7.anInt95 = -1;
			Static125.anInt2197 = 0;
		}
		Static63.method8324(-3);
		Static324.anInt5144 = 1;
		Static497.anInt8119 = 0;
		Static512.anInt8553 = 0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method7864(@OriginalArg(0) Class2_Sub2_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static314.aClass76Array2 == Static313.aClass76Array1) {
			return;
		}
		@Pc(10) int local10 = Static462.aClass76Array3[arg1].method7398(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class76 local23 = Static462.aClass76Array3[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method7398(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLclient!ha;IILjava/lang/String;III)V")
	public static void method7865(@OriginalArg(1) Class95 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static121.aClass61_4 == null || Static491.aClass61_27 == null) {
			if (Static79.aClass380_22.method8638(Static529.anInt8677) && Static79.aClass380_22.method8638(Static273.anInt4380)) {
				Static121.aClass61_4 = arg0.method6980(Static655.method7423(Static79.aClass380_22, Static529.anInt8677, 0), true);
				@Pc(28) Class329 local28 = Static655.method7423(Static79.aClass380_22, Static273.anInt4380, 0);
				Static491.aClass61_27 = arg0.method6980(local28, true);
				local28.method7417();
				Static553.aClass61_33 = arg0.method6980(local28, true);
			} else {
				arg0.aa(arg2, arg5, arg4, 20, Static25.anInt580 | 255 - Static90.anInt1698 << 24, 1);
			}
		}
		if (Static121.aClass61_4 != null && Static491.aClass61_27 != null) {
			@Pc(86) int local86 = (arg4 - Static491.aClass61_27.method6445() * 2) / Static121.aClass61_4.method6445();
			for (@Pc(88) int local88 = 0; local88 < local86; local88++) {
				Static121.aClass61_4.method6431(Static491.aClass61_27.method6445() + arg2 + local88 * Static121.aClass61_4.method6445(), arg5);
			}
			Static491.aClass61_27.method6431(arg2, arg5);
			Static553.aClass61_33.method6431(arg4 + arg2 - Static553.aClass61_33.method6445(), arg5);
		}
		Static194.aClass62_22.method5684(arg2 + 3, arg3, arg5 + 14, Static565.anInt9214 | 0xFF000000, -1);
		arg0.aa(arg2, arg5 + 20, arg4, arg1 - 20, -Static90.anInt1698 + 255 << 24 | Static25.anInt580, 1);
	}
}

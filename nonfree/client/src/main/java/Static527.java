import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!ro", name = "D", descriptor = "I")
	public static int anInt8399;

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "Lclient!ak;")
	public static final Class16 aClass16_39 = new Class16();

	@OriginalMember(owner = "client!ro", name = "F", descriptor = "I")
	public static int anInt8398 = 0;

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(II)I")
	public static int method7215(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IILjava/lang/String;IIILclient!ha;I)V")
	public static void method7217(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class100 arg4, @OriginalArg(7) int arg5) {
		if (Static601.aClass155_33 == null || Static302.aClass155_14 == null) {
			if (Static27.aClass126_18.method3077(Static629.anInt10037) && Static27.aClass126_18.method3077(Static448.anInt7325)) {
				Static601.aClass155_33 = arg4.method8640(Static692.method8275(Static27.aClass126_18, Static629.anInt10037, 0), true);
				@Pc(57) Class362 local57 = Static692.method8275(Static27.aClass126_18, Static448.anInt7325, 0);
				Static302.aClass155_14 = arg4.method8640(local57, true);
				local57.method8273();
				Static669.aClass155_38 = arg4.method8640(local57, true);
			} else {
				arg4.aa(arg5, arg3, arg2, 20, Static165.anInt3242 | 255 - Static492.anInt7973 << 24, 1);
			}
		}
		if (Static601.aClass155_33 != null && Static302.aClass155_14 != null) {
			@Pc(91) int local91 = (arg2 - Static302.aClass155_14.method7213() * 2) / Static601.aClass155_33.method7213();
			for (@Pc(93) int local93 = 0; local93 < local91; local93++) {
				Static601.aClass155_33.method7202(Static302.aClass155_14.method7213() + arg5 + local93 * Static601.aClass155_33.method7213(), arg3);
			}
			Static302.aClass155_14.method7202(arg5, arg3);
			Static669.aClass155_38.method7202(arg5 + arg2 - Static669.aClass155_38.method7213(), arg3);
		}
		Static196.aClass70_3.method8433(arg5 + 3, -1, Static180.anInt3395 | -16777216, arg1, arg3 + 14);
		arg4.aa(arg5, arg3 + 20, arg2, arg0 - 20, -Static492.anInt7973 + 255 << 24 | Static165.anInt3242, 1);
	}

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "(II)Z")
	public static boolean method7220(@OriginalArg(0) int arg0) {
		return arg0 == 15 || arg0 == 45 || arg0 == 59 || arg0 == 52 || arg0 == 13 || arg0 == 5 || arg0 == 9;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!rda", name = "E", descriptor = "I")
	public static int anInt8895 = 0;

	@OriginalMember(owner = "client!rda", name = "J", descriptor = "Z")
	public static boolean aBoolean628 = false;

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/String;IIIILclient!ha;II)V")
	public static void method7375(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class137 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static425.aClass20_27 == null || Static427.aClass20_29 == null) {
			if (Static666.aClass386_141.method9206(Static348.anInt6439) && Static666.aClass386_141.method9206(Static314.anInt5980)) {
				Static425.aClass20_27 = arg3.method7951(Static688.method8619(Static666.aClass386_141, Static348.anInt6439, 0), true);
				@Pc(28) Class356 local28 = Static688.method8619(Static666.aClass386_141, Static314.anInt5980, 0);
				Static427.aClass20_29 = arg3.method7951(local28, true);
				local28.method8620();
				Static65.aClass20_3 = arg3.method7951(local28, true);
			} else {
				arg3.aa(arg2, arg5, arg1, 20, 255 - Static477.anInt8313 << 24 | Static628.anInt10569, 1);
			}
		}
		if (Static425.aClass20_27 != null && Static427.aClass20_29 != null) {
			@Pc(86) int local86 = (arg1 - Static427.aClass20_29.method7412() * 2) / Static425.aClass20_27.method7412();
			for (@Pc(88) int local88 = 0; local88 < local86; local88++) {
				Static425.aClass20_27.method7399(arg2 + Static427.aClass20_29.method7412() + Static425.aClass20_27.method7412() * local88, arg5);
			}
			Static427.aClass20_29.method7399(arg2, arg5);
			Static65.aClass20_3.method7399(arg1 + arg2 - Static65.aClass20_3.method7412(), arg5);
		}
		Static448.aClass38_10.method8985(arg0, Static27.anInt697 | 0xFF000000, -1, arg5 + 14, arg2 - -3);
		arg3.aa(arg2, arg5 + 20, arg1, arg4 - 20, Static628.anInt10569 | -Static477.anInt8313 + 255 << 24, 1);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BII)Z")
	public static boolean method7376(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}

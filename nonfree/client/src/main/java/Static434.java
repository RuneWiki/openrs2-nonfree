import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
	public static int anInt7014;

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "Lclient!vu;")
	public static Class260 aClass260_8;

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
	public static int anInt7019 = -1;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIB)V")
	public static void method5455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static456.aClass2_Sub13_Sub2_2.method3569(arg0);
		Static456.aClass2_Sub13_Sub2_2.method3577(arg2);
		Static456.aClass2_Sub13_Sub2_2.method3577(arg1);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method5456(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (long) arg0.charAt(local17) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIZIII)V")
	public static void method5457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static317.anInt6670 <= arg3 && arg1 <= Static215.anInt3546 && Static219.anInt6125 <= arg0 && Static155.anInt2670 >= arg2) {
			Static252.method3198(arg1, arg3, arg0, arg2, arg4);
		} else {
			Static187.method2539(arg0, arg4, arg2, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method5459(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Static29.method451(Static303.aClass102_150);
		Static456.aClass2_Sub13_Sub2_2.method3602(Static385.method4939(arg1) + 1);
		Static456.aClass2_Sub13_Sub2_2.method3590(arg1);
		Static456.aClass2_Sub13_Sub2_2.method3602(arg0);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void method5460(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static442.method5598(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static428.method5373(local7);
			local7 = Static311.method5191(":", "%3a", local7);
			local7 = Static311.method5191("@", "%40", local7);
			local7 = Static311.method5191("&", "%26", local7);
			local7 = Static311.method5191("#", "%23", local7);
			if (Static425.aClass183_5.anApplet1 != null) {
				@Pc(104) Class91 local104 = Static425.aClass183_5.method3901(new URL(Static425.aClass183_5.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static261.anInt2240 + "&u=" + Static141.aLong81 + "&v1=" + Static293.aString139 + "&v2=" + Static293.aString140 + "&e=" + local7));
				while (local104.anInt2446 == 0) {
					Static429.method5376(1L);
				}
				if (local104.anInt2446 == 1) {
					@Pc(123) DataInputStream local123 = (DataInputStream) local104.anObject3;
					local123.read();
					local123.close();
				}
			}
		} catch (@Pc(130) Exception local130) {
		}
	}
}

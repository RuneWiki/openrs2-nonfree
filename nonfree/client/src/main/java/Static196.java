import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
	public static int anInt4429;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "[I")
	public static int[] anIntArray461;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "[I")
	public static int[] anIntArray462;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "[I")
	public static int[] anIntArray463;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "Lclient!i;")
	private static Class41 aClass41_1168 = Static184.method2923("Drop");

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "Lclient!i;")
	public static Class41 aClass41_1169 = aClass41_1168;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "S")
	public static short aShort57 = 256;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method3064(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static157.method2553(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static5.aClass83_1.anApplet1 != null) {
				@Pc(104) Class75 local104 = Static5.aClass83_1.method2624(new URL(Static5.aClass83_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static199.anInt4467 + "&u=" + Static34.aLong23 + "&v1=" + Static162.aString6 + "&v2=" + Static162.aString5 + "&e=" + local7));
				while (local104.anInt3346 == 0) {
					Static19.method344(1L);
				}
				if (local104.anInt3346 == 1) {
					@Pc(125) DataInputStream local125 = (DataInputStream) local104.anObject3;
					local125.read();
					local125.close();
				}
			}
		} catch (@Pc(132) Exception local132) {
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Z")
	public static boolean method3065(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!i;Lclient!i;BLclient!nb;)Lclient!rc;")
	public static Class2_Sub2_Sub16 method3066(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(3) Class15 arg2) {
		@Pc(4) int local4 = arg2.method414(arg0);
		@Pc(14) int local14 = arg2.method416(arg1, local4);
		return Static208.method3219(arg2, local4, local14);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!i;Z)Lclient!i;")
	public static Class41 method3068(@OriginalArg(0) Class41 arg0) {
		@Pc(7) Class2_Sub27 local7 = Static30.method563(arg0);
		return local7 == null ? Static54.aClass41_448 : local7.aClass41_1275;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
	public static void method3069() {
		Static77.aClass2_Sub2_Sub16_Sub1_2.method2396(0, 0);
		Static92.aClass2_Sub2_Sub16_Sub1_4.method2396(382, 0);
		Static184.aClass60_3.method2740(382 - Static184.aClass60_3.anInt3991 / 2, 18);
	}
}

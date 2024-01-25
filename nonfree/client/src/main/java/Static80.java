import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!dm;")
	public static Class4_Sub2 method1405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class113 local7 = Static176.aClass113ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class134 local14 = local7.aClass134_1; local14 != null; local14 = local14.aClass134_2) {
			@Pc(18) Class4_Sub2 local18 = local14.aClass4_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort88 == arg1 && local18.aShort89 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!it;IIIIZ)V")
	public static void method1408(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub2_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		Static1.method1(arg1.anInt7111, arg2, arg3, arg1.aByte92, arg1.anInt7117, 0, arg0);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void method1410(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static418.method5665(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static321.method4602(local7);
			local7 = Static366.method5100(":", "%3a", local7);
			local7 = Static366.method5100("@", "%40", local7);
			local7 = Static366.method5100("&", "%26", local7);
			local7 = Static366.method5100("#", "%23", local7);
			if (Static32.aClass131_1.anApplet1 != null) {
				@Pc(103) Class128 local103 = Static32.aClass131_1.method3059(new URL(Static32.aClass131_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static9.anInt280 + "&u=" + Static289.aLong189 + "&v1=" + Static197.aString28 + "&v2=" + Static197.aString30 + "&e=" + local7));
				while (local103.anInt3727 == 0) {
					Static443.method5991(1L);
				}
				if (local103.anInt3727 == 1) {
					@Pc(124) DataInputStream local124 = (DataInputStream) local103.anObject4;
					local124.read();
					local124.close();
				}
			}
		} catch (@Pc(131) Exception local131) {
		}
	}
}

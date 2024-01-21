import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "Lclient!bg;")
	public static Class11 aClass11_88;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1044 = Static32.method683("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
	public static int anInt2210 = 0;

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "[I")
	public static int[] anIntArray209 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
	public static int anInt2220 = -1;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
	public static void method1789(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(11) String local11 = "";
			if (arg1 != null) {
				local11 = Static184.method3039(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local11 = local11 + " | ";
				}
				local11 = local11 + arg0;
			}
			System.out.println("Error: " + local11);
			local11 = local11.replace(':', '.');
			local11 = local11.replace('@', '_');
			local11 = local11.replace('&', '_');
			local11 = local11.replace('#', '_');
			if (Static90.aClass45_3.anApplet1 != null) {
				@Pc(105) Class16 local105 = Static90.aClass45_3.method1484(new URL(Static90.aClass45_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static4.anInt66 + "&u=" + Static179.aLong155 + "&v1=" + Static89.aString2 + "&v2=" + Static89.aString3 + "&e=" + local11));
				while (local105.anInt749 == 0) {
					Static50.method901(1L);
				}
				if (local105.anInt749 == 1) {
					@Pc(124) DataInputStream local124 = (DataInputStream) local105.anObject1;
					local124.read();
					local124.close();
				}
			}
		} catch (@Pc(131) Exception local131) {
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B[[I)V")
	public static void method1794(@OriginalArg(1) int[][] arg0) {
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
	public static void method1795() {
		anIntArray209 = null;
		aClass11_88 = null;
		aByteArrayArrayArray6 = null;
		aClass49_1044 = null;
	}

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "(I)V")
	public static void method1803() {
		for (@Pc(18) Class2_Sub8 local18 = (Class2_Sub8) Static100.aClass25_7.method837(); local18 != null; local18 = (Class2_Sub8) Static100.aClass25_7.method834()) {
			@Pc(23) int local23 = local18.anInt1201;
			if (Static163.method531(local23)) {
				@Pc(29) boolean local29 = true;
				@Pc(33) Class85[] local33 = Static149.aClass85ArrayArray1[local23];
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
					if (local33[local35] != null) {
						local29 = local33[local35].aBoolean171;
						break;
					}
				}
				if (!local29) {
					@Pc(59) int local59 = (int) local18.aLong157;
					@Pc(63) Class85 local63 = Static140.method2337(local59);
					if (local63 != null) {
						Static102.method1756(local63);
					}
				}
			}
		}
	}
}

import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!da", name = "r", descriptor = "Lclient!ke;")
	public static Class5_Sub11 aClass5_Sub11_2;

	@OriginalMember(owner = "client!da", name = "h", descriptor = "Lclient!ge;")
	public static Class29 aClass29_6 = new Class29(260);

	@OriginalMember(owner = "client!da", name = "m", descriptor = "Lclient!r;")
	public static Class61 aClass61_190 = Static129.method2060(" )2>");

	@OriginalMember(owner = "client!da", name = "n", descriptor = "Lclient!r;")
	private static Class61 aClass61_191 = Static129.method2060("Ok");

	@OriginalMember(owner = "client!da", name = "o", descriptor = "I")
	public static int anInt645 = 0;

	@OriginalMember(owner = "client!da", name = "p", descriptor = "Lclient!r;")
	public static Class61 aClass61_192 = aClass61_191;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "Lclient!r;")
	public static Class61 aClass61_193 = Static129.method2060("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!da", name = "s", descriptor = "[Lclient!r;")
	public static Class61[] aClass61Array4 = new Class61[100];

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public static void method459() {
		Static59.aClass29_14.method765();
		Static13.aClass29_5.method765();
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V")
	public static void method460() {
		aClass61_191 = null;
		aClass61_192 = null;
		aClass61Array4 = null;
		aClass61_190 = null;
		aClass61_193 = null;
		aClass5_Sub11_2 = null;
		aClass29_6 = null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Z")
	public static boolean method461(@OriginalArg(0) int arg0) {
		if (Static100.aBooleanArray13[arg0]) {
			return true;
		} else if (Static103.aClass26_24.method1033(arg0)) {
			@Pc(21) int local21 = Static103.aClass26_24.method1031(arg0);
			if (local21 == 0) {
				Static100.aBooleanArray13[arg0] = true;
				return true;
			}
			if (Static56.aClass5_Sub11ArrayArray1[arg0] == null) {
				Static56.aClass5_Sub11ArrayArray1[arg0] = new Class5_Sub11[local21];
			}
			for (@Pc(41) int local41 = 0; local41 < local21; local41++) {
				if (Static56.aClass5_Sub11ArrayArray1[arg0][local41] == null) {
					@Pc(54) byte[] local54 = Static103.aClass26_24.method1038(arg0, local41);
					if (local54 != null) {
						Static56.aClass5_Sub11ArrayArray1[arg0][local41] = new Class5_Sub11();
						Static56.aClass5_Sub11ArrayArray1[arg0][local41].anInt1614 = local41 + (arg0 << 16);
						if (local54[0] == -1) {
							Static56.aClass5_Sub11ArrayArray1[arg0][local41].method1120(new Class5_Sub14(local54));
						} else {
							Static56.aClass5_Sub11ArrayArray1[arg0][local41].method1128(new Class5_Sub14(local54));
						}
					}
				}
			}
			Static100.aBooleanArray13[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Throwable;)V")
	public static void method462(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static12.method235(arg1);
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
			if (Static123.aClass80_4.anApplet1 != null) {
				@Pc(108) Class10 local108 = Static123.aClass80_4.method2037(new URL(Static123.aClass80_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static100.anInt2608 + "&u=" + Static31.aLong37 + "&v1=" + Static128.aString3 + "&v2=" + Static128.aString5 + "&e=" + local7));
				while (local108.anInt242 == 0) {
					Static118.method1893(1L);
				}
				if (local108.anInt242 == 1) {
					@Pc(124) DataInputStream local124 = (DataInputStream) local108.anObject1;
					local124.read();
					local124.close();
				}
			}
		} catch (@Pc(131) Exception local131) {
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)Z")
	public static boolean method463(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}
}

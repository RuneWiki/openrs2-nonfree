import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "J")
	public static long aLong210 = 0L;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Z")
	public static boolean aBoolean607 = false;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
	public static int anInt6744 = 0;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)I")
	public static int method5277(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		@Pc(24) int local24 = (local14 & 0x33333333) + (local14 >>> 2 & 0x73333333);
		@Pc(32) int local32 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(44) int local44 = local38 + (local38 >>> 16);
		return local44 & 0xFF;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)Z")
	public static boolean method5279(@OriginalArg(1) int arg0) {
		@Pc(7) Class78_Sub1 local7 = Static206.method3192(arg0);
		if (local7 == null) {
			return false;
		} else if (Static98.anInt1987 == 3) {
			@Pc(39) String local39 = "";
			if (Static373.aClass219_6 != Static104.aClass219_2) {
				local39 = ":" + (local7.anInt3881 + 7000);
			}
			@Pc(55) String local55 = "";
			if (Static34.aString13 != null) {
				local55 = "/p=" + Static34.aString13;
			}
			@Pc(104) String local104 = "http://" + local7.aString38 + local39 + "/l=" + Static178.anInt3423 + "/a=" + Static168.anInt3259 + local55 + "/j" + (Static385.aBoolean591 ? "1" : "0") + ",o" + (aBoolean607 ? "1" : "0") + ",a2";
			try {
				Static6.aClient1.getAppletContext().showDocument(new URL(local104), "_self");
				return true;
			} catch (@Pc(119) Exception local119) {
				return false;
			}
		} else {
			Static56.anInt1028 = local7.anInt3881;
			Static321.aString54 = local7.aString38;
			if (Static104.aClass219_2 != Static373.aClass219_6) {
				Static97.anInt1949 = Static56.anInt1028 + 50000;
				Static313.anInt5436 = Static56.anInt1028 + 40000;
				Static407.anInt6723 = Static313.anInt5436;
			}
			return true;
		}
	}
}

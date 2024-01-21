import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "[[Lclient!qf;")
	public static Class66[][] aClass66ArrayArray1;

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "Lclient!qd;")
	public static Class43_Sub1 aClass43_Sub1_15;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "Z")
	public static boolean aBoolean121 = false;

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1119 = Static146.method2172("title)3jpg");

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "[J")
	public static long[] aLongArray6 = new long[200];

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
	public static final int anInt3051 = 3353893;

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1120 = Static146.method2172("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "Lclient!ca;")
	public static Class9 aClass9_1 = new Class9();

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1121 = Static146.method2172("mapback");

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	public static void method2161() {
		Static3.aClass74_1 = new Class74(32);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLclient!qf;)Z")
	public static boolean method2165(@OriginalArg(1) Class66 arg0) {
		@Pc(2) int local2 = arg0.anInt3224;
		if (local2 == 205) {
			Static63.anInt1682 = 250;
			return true;
		}
		@Pc(32) int local32;
		@Pc(36) int local36;
		if (local2 >= 300 && local2 <= 313) {
			local32 = (local2 - 300) / 2;
			local36 = local2 & 0x1;
			Static56.aClass1_1.method5(local32, local36 == 1);
		}
		if (local2 >= 314 && local2 <= 323) {
			local32 = (local2 - 314) / 2;
			local36 = local2 & 0x1;
			Static56.aClass1_1.method10(local36 == 1, local32);
		}
		if (local2 == 324) {
			Static56.aClass1_1.method11(false);
		}
		if (local2 == 325) {
			Static56.aClass1_1.method11(true);
		}
		if (local2 == 326) {
			Static124.aClass2_Sub18_Sub1_3.method2398(56);
			Static56.aClass1_1.method7(Static124.aClass2_Sub18_Sub1_3);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
	public static int method2166(@OriginalArg(1) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 == 8364) {
			return 128;
		} else {
			if (local6 <= 0 || local6 >= 256) {
				local6 = -1;
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
	public static void method2167() {
		aClass77_1121 = null;
		aClass66ArrayArray1 = null;
		aClass9_1 = null;
		aClass77_1119 = null;
		aClass77_1120 = null;
		aLongArray6 = null;
		aClass43_Sub1_15 = null;
	}
}

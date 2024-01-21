import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "J")
	public static long aLong16;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!cb;")
	public static Class12 aClass12_1;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Lclient!he;")
	public static Class26 aClass26_254 = Static6.method100("blinken2:");

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "Lclient!he;")
	public static Class26 aClass26_255 = Static6.method100("<br>");

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Lclient!he;")
	public static Class26 aClass26_256 = Static6.method100("(U2");

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Lclient!he;")
	private static Class26 aClass26_257 = Static6.method100("Enter your username (V password)3");

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
	public static int anInt422 = 0;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "Lclient!he;")
	public static Class26 aClass26_258 = Static6.method100(")1j");

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Lclient!he;")
	public static Class26 aClass26_259 = aClass26_257;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "Lclient!he;")
	public static Class26 aClass26_260 = Static6.method100("sl_stars");

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
	public static int anInt424 = 0;

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "Lclient!he;")
	public static Class26 aClass26_261 = Static6.method100("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
	public static int anInt426 = 0;

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
	public static int anInt428 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILclient!eb;BIZB)V")
	public static void method272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16_Sub1 arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(10) long local10 = (long) (arg1 + (arg4 << 16));
		@Pc(16) Class3_Sub1_Sub11 local16 = (Class3_Sub1_Sub11) Static63.aClass17_13.method599(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class3_Sub1_Sub11) Static85.aClass17_15.method599(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class3_Sub1_Sub11) Static96.aClass17_16.method599(local10);
		if (local16 == null) {
			if (!arg5) {
				local16 = (Class3_Sub1_Sub11) Static60.aClass17_11.method599(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class3_Sub1_Sub11();
			local16.anInt2029 = arg0;
			local16.aByte6 = arg3;
			local16.aClass16_Sub1_9 = arg2;
			if (arg5) {
				Static63.aClass17_13.method594(local16, local10);
				Static52.anInt1615++;
			} else {
				Static4.aClass1_1.method1(local16);
				Static96.aClass17_16.method594(local16, local10);
				Static124.anInt3201++;
			}
		} else if (arg5) {
			local16.method2210();
			Static63.aClass17_13.method594(local16, local10);
			Static52.anInt1615++;
			Static124.anInt3201--;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method273() {
		aClass26_257 = null;
		aClass26_258 = null;
		aClass26_259 = null;
		aClass26_255 = null;
		aClass26_254 = null;
		aClass26_256 = null;
		aClass12_1 = null;
		aClass26_260 = null;
		aClass26_261 = null;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public static void method274() {
		if (Static126.anInt3213 > 0) {
			Static64.method1264();
		} else {
			Static4.method62(40);
			Static9.aClass76_2 = Static118.aClass76_4;
			Static118.aClass76_4 = null;
		}
	}
}

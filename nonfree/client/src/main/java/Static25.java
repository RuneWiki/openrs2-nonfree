import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
	public static int anInt771;

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "Lclient!rc;")
	public static Class3_Sub1_Sub1_Sub3 aClass3_Sub1_Sub1_Sub3_3;

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "Lclient!v;")
	public static Class62 aClass62_326 = Static45.method753("backbase1");

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "Lclient!v;")
	private static Class62 aClass62_327 = Static45.method753("Add friend");

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "Lclient!v;")
	public static Class62 aClass62_328 = Static45.method753("Wen m\u001c1chten Sie hinzuf\u001c1gen?");

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "Lclient!v;")
	public static Class62 aClass62_329 = aClass62_327;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "[I")
	public static int[] anIntArray61 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
	public static int anInt775 = 0;

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "Lclient!v;")
	public static Class62 aClass62_330 = Static45.method753("Die Verbindung konnte");

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "Lclient!v;")
	public static Class62 aClass62_331 = Static45.method753("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "Lclient!v;")
	public static Class62 aClass62_332 = Static45.method753("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "Lclient!v;")
	public static Class62 aClass62_333 = Static45.method753("Fertigkeit)2");

	@OriginalMember(owner = "client!fa", name = "y", descriptor = "Lclient!v;")
	public static Class62 aClass62_334 = Static45.method753("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method511() {
		aClass62_331 = null;
		aClass62_327 = null;
		aClass62_329 = null;
		aClass62_332 = null;
		anImage3 = null;
		aClass62_326 = null;
		aClass62_328 = null;
		aClass62_333 = null;
		anIntArray61 = null;
		aClass3_Sub1_Sub1_Sub3_3 = null;
		aClass62_334 = null;
		aClass62_330 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
	public static void method512(@OriginalArg(0) int arg0) {
		if (!Static36.method666(arg0)) {
			return;
		}
		@Pc(14) Class3_Sub1_Sub6[] local14 = Static65.aClass3_Sub1_Sub6ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class3_Sub1_Sub6 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt880 = 0;
				local22.anInt935 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
	public static void method514() {
		Static98.aClass24_77 = new Class24();
	}
}

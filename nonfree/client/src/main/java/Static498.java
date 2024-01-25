import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static498 {

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "Lclient!dda;")
	public static Class53 aClass53_140;

	@OriginalMember(owner = "client!uv", name = "u", descriptor = "[Lclient!ha;")
	public static Class35[] aClass35Array39;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
	public static int anInt8746 = 0;

	@OriginalMember(owner = "client!uv", name = "h", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_249 = new Class202("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!uv", name = "s", descriptor = "I")
	public static int anInt8755 = 0;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZII)Z")
	public static boolean method7327(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljava/awt/Canvas;IZLclient!n;)Lclient!qa;")
	public static Class39 method7332(@OriginalArg(0) Canvas arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Interface12 arg2) {
		return arg1 ? new Class39_Sub1_Sub1(arg0, arg2) : new Class39_Sub1_Sub2(arg0, arg2);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!wca;II)V")
	public static void method7333(@OriginalArg(0) int arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) int arg2) {
		if (Static72.aClass310_4 != null || Static452.aBoolean600 || (arg1 == null || Static47.method854(arg1) == null)) {
			return;
		}
		Static72.aClass310_4 = arg1;
		Static325.aClass310_15 = Static47.method854(arg1);
		Static13.anInt304 = 0;
		Static277.aBoolean382 = false;
		Static376.anInt6978 = arg2;
		Static203.anInt3701 = arg0;
	}
}

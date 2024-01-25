import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "F")
	public static float aFloat96;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_193 = new Class41(48, 3);

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "Lclient!ms;")
	public static Class155 aClass155_36 = null;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "Z")
	public static volatile boolean aBoolean473 = true;

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
	public static int anInt6316 = 500;

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "Lclient!ll;")
	public static final Class143 aClass143_28 = new Class143("LOCAL", 4);

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "[I")
	public static final int[] anIntArray762 = new int[64];

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "[I")
	public static int[] anIntArray763 = new int[2];

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method5452(@OriginalArg(0) int arg0) {
		@Pc(13) String local13 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local13.length() - 3; local18 > 0; local18 -= 3) {
			local13 = local13.substring(0, local18) + "," + local13.substring(local18);
		}
		if (local13.length() > 9) {
			return " <col=00ff80>" + local13.substring(0, local13.length() - 8) + Static84.aClass221_69.method5229(Static189.anInt5185) + " (" + local13 + ")</col>";
		} else if (local13.length() > 6) {
			return " <col=ffffff>" + local13.substring(0, local13.length() - 4) + Static251.aClass221_159.method5229(Static189.anInt5185) + " (" + local13 + ")</col>";
		} else {
			return " <col=ffff00>" + local13 + "</col>";
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method5453(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static19.method552(Static76.aClass41_36);
			Static39.aClass2_Sub13_Sub2_4.method4207(Static346.method5273(arg0));
			Static39.aClass2_Sub13_Sub2_4.method4230(arg0);
		}
	}
}

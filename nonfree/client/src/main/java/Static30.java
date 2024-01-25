import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!av", name = "j", descriptor = "I")
	public static int anInt407;

	@OriginalMember(owner = "client!av", name = "e", descriptor = "I")
	public static int anInt402 = 0;

	@OriginalMember(owner = "client!av", name = "k", descriptor = "I")
	public static int anInt408 = 0;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ILclient!uaa;II)V")
	public static void method365(@OriginalArg(1) Class345 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray33 != null) {
			@Pc(13) Class5_Sub22 local13 = new Class5_Sub22();
			local13.anObjectArray1 = arg0.anObjectArray33;
			local13.aClass345_1 = arg0;
			Static652.method8743(local13);
		}
		Static549.anInt9003 = arg0.anInt9664;
		Static412.anInt7320 = arg1;
		Static529.anInt9069 = arg0.anInt9654;
		Static233.anInt4241 = arg0.anInt9668;
		Static24.anInt7340 = arg2;
		Static105.anInt2256 = arg0.anInt9659;
		Static353.anInt6392 = arg0.anInt9611;
		Static55.aBoolean60 = true;
		Static211.method3351(arg0);
	}
}

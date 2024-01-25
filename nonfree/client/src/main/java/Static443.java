import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "Lclient!rb;")
	public static Class297 aClass297_5;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	public static int anInt7790 = -1;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "[F")
	public static final float[] aFloatArray62 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I")
	public static int method6608() {
		return 16;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)Lclient!oga;")
	public static Class5_Sub40 method6609() {
		if (Static407.aClass124_66 == null || Static432.aClass328_1 == null) {
			return null;
		}
		Static432.aClass328_1.method7632(Static407.aClass124_66);
		@Pc(23) Class5_Sub40 local23 = (Class5_Sub40) Static432.aClass328_1.method7633();
		if (local23 == null) {
			return null;
		} else {
			@Pc(33) Class262 local33 = Static407.aClass218_3.method5163(local23.anInt7515);
			return local33 != null && local33.aBoolean557 && local33.method6490(Static407.anInterface23_2) ? local23 : Static579.method7884();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)Z")
	public static boolean method6610(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)Z")
	public static boolean method6611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)I")
	public static int method6613(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}
}

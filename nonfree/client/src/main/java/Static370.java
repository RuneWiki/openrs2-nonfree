import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
	public static int anInt7659;

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_146 = new Class254(51, 3);

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "I")
	public static int anInt7662 = 0;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V")
	public static void method5894(@OriginalArg(0) int arg0) {
		if (Static304.anIntArray394 == null || Static304.anIntArray394.length < arg0) {
			Static304.anIntArray394 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)Lclient!ks;")
	public static Class36_Sub4 method5896() {
		@Pc(13) Class36_Sub4 local13 = (Class36_Sub4) Static129.aClass242_1.method5508();
		if (local13 == null) {
			return new Class36_Sub4();
		} else {
			Static188.anInt3477--;
			return local13;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!cea", name = "u", descriptor = "I")
	public static int anInt1419;

	@OriginalMember(owner = "client!cea", name = "v", descriptor = "I")
	public static int anInt1420;

	@OriginalMember(owner = "client!cea", name = "m", descriptor = "F")
	public static float aFloat23 = 1.0F;

	@OriginalMember(owner = "client!cea", name = "o", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_27 = new Class268(95, 1);

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(ZI)Lclient!bh;")
	public static Class35 method1191(@OriginalArg(1) int arg0) {
		@Pc(13) Class35[] local13 = Static298.method5524();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class35 local21 = local13[local15];
			if (arg0 == local21.anInt869) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)I")
	public static int method1192(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static7 {

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
	public static int anInt104 = 0;

	@OriginalMember(owner = "client!aea", name = "l", descriptor = "[Lclient!n;")
	public static final Class235_Sub1[] aClass235_Sub1Array1 = new Class235_Sub1[35];

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)I")
	public static int method104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static560.anIntArray706[arg0 & 0x3] : Static271.anIntArray446[arg0 & 0x3];
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static442 {

	@OriginalMember(owner = "client!o", name = "i", descriptor = "I")
	public static int anInt7174;

	@OriginalMember(owner = "client!o", name = "m", descriptor = "Lclient!rha;")
	public static Class2_Sub23_Sub5 aClass2_Sub23_Sub5_3;

	@OriginalMember(owner = "client!o", name = "k", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_130 = new Class225(144, 6);

	@OriginalMember(owner = "client!o", name = "h", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_101 = new Class349(16, 8);

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)I")
	public static int method6396(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static606.anIntArray686[arg0 & 0x3] : Static692.anIntArray739[arg0 & 0x3];
	}
}

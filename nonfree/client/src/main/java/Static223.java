import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static223 {

	@OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
	public static int anInt4124;

	@OriginalMember(owner = "client!ld", name = "R", descriptor = "Lclient!ad;")
	public static Class5 aClass5_2;

	@OriginalMember(owner = "client!ld", name = "T", descriptor = "Lclient!ad;")
	public static Class5 aClass5_3;

	@OriginalMember(owner = "client!ld", name = "N", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_57 = new Class242("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!ld", name = "P", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_134 = new Class186(15, 10);

	@OriginalMember(owner = "client!ld", name = "S", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_58 = new Class242("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(III)Z")
	public static boolean method3134(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}
}

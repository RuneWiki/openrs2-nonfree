import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static63 {

	@OriginalMember(owner = "client!bv", name = "U", descriptor = "I")
	public static int anInt1213;

	@OriginalMember(owner = "client!bv", name = "y", descriptor = "Lclient!hk;")
	public static final Class146 aClass146_2 = new Class146(1, 2, 2, 0);

	@OriginalMember(owner = "client!bv", name = "O", descriptor = "Z")
	public static boolean aBoolean68 = true;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(III)V")
	public static void method1168(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static22.anInt389 = arg1 - Static331.anInt10589;
		Static69.anInt1350 = arg0 - Static331.anInt10590;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IZI)Z")
	public static boolean method1171(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}

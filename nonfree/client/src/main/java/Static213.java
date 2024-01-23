import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1559 = Static200.method3116("<col=00ff80>");

	@OriginalMember(owner = "client!w", name = "i", descriptor = "Lclient!ge;")
	public static Class39 aClass39_28 = new Class39(64);

	@OriginalMember(owner = "client!w", name = "j", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1560 = Static200.method3116("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!w", name = "m", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1561 = Static200.method3116("Sprites geladen)3");

	@OriginalMember(owner = "client!w", name = "o", descriptor = "[I")
	public static int[] anIntArray609 = new int[128];

	@OriginalMember(owner = "client!w", name = "p", descriptor = "[I")
	public static int[] anIntArray610 = new int[200];

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!kh;Lclient!ai;Lclient!kh;)[Lclient!o;")
	public static Class73_Sub1[] method3331(@OriginalArg(1) Class60 arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) Class60 arg2) {
		@Pc(13) int local13 = arg1.method3222(arg2);
		@Pc(19) int local19 = arg1.method3240(arg0, local13);
		return Static148.method3511(arg1, local19, local13);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	public static int anInt59;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Lclient!pu;")
	public static final Class203 aClass203_1 = new Class203();

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "Lclient!fr;")
	public static final Class91 aClass91_1 = new Class91(8);

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_4 = new Class158("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!ec;I)V")
	public static void method54(@OriginalArg(0) int arg0, @OriginalArg(2) Class68 arg1, @OriginalArg(3) int arg2) {
		Static432.anInt7625 = arg0;
		Static401.aClass68_15 = arg1;
		Static203.anInt4206 = arg2;
	}
}

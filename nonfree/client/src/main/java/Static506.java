import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
	public static int anInt8791;

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_210 = new Class251(2, -1);

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method7584(@OriginalArg(1) int arg0) {
		@Pc(14) String local14 = Integer.toString(arg0);
		for (@Pc(19) int local19 = local14.length() - 3; local19 > 0; local19 -= 3) {
			local14 = local14.substring(0, local19) + "," + local14.substring(local19);
		}
		if (local14.length() > 9) {
			return " <col=00ff80>" + local14.substring(0, local14.length() - 8) + Static21.aClass21_32.method324(Static26.anInt352) + " (" + local14 + ")</col>";
		} else if (local14.length() > 6) {
			return " <col=ffffff>" + local14.substring(0, local14.length() - 4) + Static21.aClass21_34.method324(Static26.anInt352) + " (" + local14 + ")</col>";
		} else {
			return " <col=ffff00>" + local14 + "</col>";
		}
	}
}
